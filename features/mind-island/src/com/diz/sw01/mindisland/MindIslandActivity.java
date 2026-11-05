package com.diz.sw01.mindisland;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build;
import android.graphics.Color;
import android.graphics.Insets;
import android.util.AtomicFile;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.json.JSONObject;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/** Local game with a read-only bridge to synchronized watch records. */
public final class MindIslandActivity extends Activity {
    private WebView web;
    private static final int WATCH_VOICE=701;
    private boolean voiceOpen;
    private final java.util.concurrent.ExecutorService reader = java.util.concurrent.Executors.newSingleThreadExecutor();
    private final java.util.concurrent.atomic.AtomicBoolean reading = new java.util.concurrent.atomic.AtomicBoolean();
    private static final String ROOT = "file:///android_asset/mind-island/";
    private final class Store {
        @JavascriptInterface public void openWatchVoice() {
            runOnUiThread(()->{
                if(voiceOpen||isFinishing())return;
                voiceOpen=true;
                try{startActivityForResult(new Intent(MindIslandActivity.this,WatchVoiceActivity.class),WATCH_VOICE);}
                catch(Exception e){voiceOpen=false;}
            });
        }
        @JavascriptInterface public void refreshWatch() {
            if (!reading.compareAndSet(false, true)) return;
            reader.execute(() -> {
                String snapshot = WatchSnapshot.read().toString();
                runOnUiThread(() -> {
                    reading.set(false);
                    if (web != null) web.evaluateJavascript("if(window.MindIslandApp) window.MindIslandApp.watch(" + snapshot + ");", null);
                });
            });
        }
        private final AtomicFile file = new AtomicFile(new File(getNoBackupFilesDir(), "mind-island-v1.json"));
        @JavascriptInterface public synchronized String read() {
            try {
                if (!file.getBaseFile().exists() && !new File(file.getBaseFile().getPath() + ".bak").exists()) return "{\"ok\":true,\"state\":null}";
                String text = new String(file.readFully(), StandardCharsets.UTF_8);
                return new JSONObject().put("ok", true).put("state", new JSONObject(text)).toString();
            } catch (Exception e) { return "{\"ok\":false}"; }
        }
        @JavascriptInterface public synchronized boolean write(String text) {
            if (text == null || text.length() > 262144) return false;
            FileOutputStream out = null;
            try {
                JSONObject state = new JSONObject(text);
                if (state.optInt("version") != 1) return false;
                out = file.startWrite();
                out.write(text.getBytes(StandardCharsets.UTF_8));
                file.finishWrite(out);
                return true;
            } catch (Exception e) {
                if (out != null) file.failWrite(out);
                return false;
            }
        }
        @JavascriptInterface public void close() { runOnUiThread(() -> finish()); }
    }
    @Override public void onCreate(Bundle state) {
        setTheme(android.R.style.Theme_Material_Light_NoActionBar);
        super.onCreate(state);
        getWindow().setStatusBarColor(Color.rgb(249, 246, 255));
        getWindow().setNavigationBarColor(Color.rgb(249, 246, 255));
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR);
        web = new WebView(this);
        web.setBackgroundColor(Color.rgb(249, 246, 255));
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(false);
        web.getSettings().setAllowFileAccess(false);
        web.getSettings().setAllowContentAccess(false);
        web.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        web.getSettings().setMediaPlaybackRequiresUserGesture(true);
        web.addJavascriptInterface(new Store(), "IslandStore");
        web.setWebViewClient(new WebViewClient() {
            @Override public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return !request.getUrl().toString().startsWith(ROOT);
            }
            @Override public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                if (url.startsWith(ROOT) && !url.contains("..")) return null;
                return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
            }
        });
        FrameLayout frame = new FrameLayout(this);
        frame.setBackgroundColor(Color.rgb(249, 246, 255));
        frame.addView(web, new FrameLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            frame.setOnApplyWindowInsetsListener((view, insets) -> {
                Insets safe = insets.getInsets(WindowInsets.Type.systemBars()
                    | WindowInsets.Type.displayCutout() | WindowInsets.Type.ime());
                view.setPadding(safe.left, safe.top, safe.right, safe.bottom);
                return WindowInsets.CONSUMED;
            });
        } else { frame.setFitsSystemWindows(true); }
        setContentView(frame);
        frame.requestApplyInsets();
        web.loadUrl(ROOT + "index.html");
    }
    @Override protected void onPause() {
        if (web != null) { web.evaluateJavascript("if(window.MindIslandApp) window.MindIslandApp.pause();", null); web.onPause(); }
        super.onPause();
    }
    @Override protected void onResume() { super.onResume(); if (web != null) web.onResume(); }
    @Override protected void onActivityResult(int request,int result,Intent data){
        super.onActivityResult(request,result,data);
        if(request!=WATCH_VOICE)return;
        voiceOpen=false;
        if(result!=RESULT_OK||data==null||web==null)return;
        String weather=data.getStringExtra("weather"),transcript=data.getStringExtra("transcript");
        if(!java.util.Arrays.asList("sun","clear","cloud","rain","wind").contains(weather))return;
        try{
            JSONObject payload=new JSONObject().put("weather",weather).put("transcript",transcript==null?"":transcript);
            web.evaluateJavascript("if(window.MindIslandApp)window.MindIslandApp.voice("+payload+");",null);
        }catch(Exception ignored){}
    }
    @Override public void onBackPressed() {
        if (web == null) { finish(); return; }
        web.evaluateJavascript("window.MindIslandApp ? window.MindIslandApp.back() : false", value -> { if (!"true".equals(value)) finish(); });
    }
    @Override protected void onDestroy() {
        reader.shutdownNow();
        if (web != null) { web.removeJavascriptInterface("IslandStore"); web.destroy(); web = null; }
        super.onDestroy();
    }
}
