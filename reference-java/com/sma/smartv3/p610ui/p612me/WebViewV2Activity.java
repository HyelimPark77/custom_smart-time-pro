package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.II10X1I;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X0i00iX1;
import com.android.mltcode.paycertificationapi.X1OI0;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.iiIIOXXXO;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.p057io.Location;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.facebook.internal.security.CertificateUtil;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.google.gson.Gson;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import com.sma.smartv3.biz.UploadFileManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.DeviceLaseRecord;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.p610ui.p612me.WebViewV2Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.io.File;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWebViewV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewV2Activity.kt\ncom/sma/smartv3/ui/me/WebViewV2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,368:1\n19#2:369\n15#2:370\n90#2:371\n90#2:372\n90#2:373\n19#2:374\n15#2:375\n87#3,7:376\n94#3,3:384\n70#3,7:387\n97#3:394\n1#4:383\n*S KotlinDebug\n*F\n+ 1 WebViewV2Activity.kt\ncom/sma/smartv3/ui/me/WebViewV2Activity\n*L\n195#1:369\n195#1:370\n199#1:371\n236#1:372\n237#1:373\n273#1:374\n273#1:375\n96#1:376,7\n96#1:384,3\n96#1:387,7\n96#1:394\n96#1:383\n*E\n"})
public final class WebViewV2Activity extends BaseActivity {
    private final int RESULT_CODE;
    private boolean isUseWebViewTitle;

    @tb1
    private ValueCallback<Uri> mUploadMessage;

    @tb1
    private ValueCallback<Uri[]> mUploadMessageArray;

    @aa1
    private final Lazy webView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewV2Activity.webView_delegate$lambda$0(this.f10926IO);
        }
    });

    @aa1
    private final Lazy titleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewV2Activity.titleCenter_delegate$lambda$0(this.f11155IO);
        }
    });

    @aa1
    private final Lazy rightTitleTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tx6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WebViewV2Activity.rightTitleTv_delegate$lambda$0(this.f11384IO);
        }
    });

    public static final class OXO1 extends WebChromeClient {
        public OXO1() {
        }

        public final void OXO1(ValueCallback<Uri> uploadMsg) {
            Intrinsics.X0O(uploadMsg, "uploadMsg");
            WebViewV2Activity.this.setMUploadMessage(uploadMsg);
            WebViewV2Activity.this.pickFile();
        }

        public final void XIi00iiXO(ValueCallback<Uri> uploadMsg, String str) {
            Intrinsics.X0O(uploadMsg, "uploadMsg");
            OXO1(uploadMsg);
        }

        /* JADX INFO: renamed from: iO */
        public final void m38574iO(ValueCallback<Uri> uploadMsg, String str, String str2) {
            Intrinsics.X0O(uploadMsg, "uploadMsg");
            OXO1(uploadMsg);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.X0O(webView, "webView");
            Intrinsics.X0O(filePathCallback, "filePathCallback");
            Intrinsics.X0O(fileChooserParams, "fileChooserParams");
            WebViewV2Activity.this.setMUploadMessageArray(filePathCallback);
            WebViewV2Activity.this.pickFile();
            return true;
        }
    }

    @Keep
    public static final class WebBleInfo {

        @tb1
        private WebInfo bleInfo;

        @aa1
        private String logPath;

        /* JADX WARN: Multi-variable type inference failed */
        public WebBleInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ WebBleInfo copy$default(WebBleInfo webBleInfo, String str, WebInfo webInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webBleInfo.logPath;
            }
            if ((i & 2) != 0) {
                webInfo = webBleInfo.bleInfo;
            }
            return webBleInfo.copy(str, webInfo);
        }

        @aa1
        public final String component1() {
            return this.logPath;
        }

        @tb1
        public final WebInfo component2() {
            return this.bleInfo;
        }

        @aa1
        public final WebBleInfo copy(@aa1 String logPath, @tb1 WebInfo webInfo) {
            Intrinsics.X0O(logPath, "logPath");
            return new WebBleInfo(logPath, webInfo);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebBleInfo)) {
                return false;
            }
            WebBleInfo webBleInfo = (WebBleInfo) obj;
            return Intrinsics.XOO0ii0(this.logPath, webBleInfo.logPath) && Intrinsics.XOO0ii0(this.bleInfo, webBleInfo.bleInfo);
        }

        @tb1
        public final WebInfo getBleInfo() {
            return this.bleInfo;
        }

        @aa1
        public final String getLogPath() {
            return this.logPath;
        }

        public int hashCode() {
            int iHashCode = this.logPath.hashCode() * 31;
            WebInfo webInfo = this.bleInfo;
            return iHashCode + (webInfo == null ? 0 : webInfo.hashCode());
        }

        public final void setBleInfo(@tb1 WebInfo webInfo) {
            this.bleInfo = webInfo;
        }

        public final void setLogPath(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.logPath = str;
        }

        @aa1
        public String toString() {
            return "WebBleInfo(logPath=" + this.logPath + ", bleInfo=" + this.bleInfo + I000IiI1O.C2156iO.f1007iO;
        }

        public WebBleInfo(@aa1 String logPath, @tb1 WebInfo webInfo) {
            Intrinsics.X0O(logPath, "logPath");
            this.logPath = logPath;
            this.bleInfo = webInfo;
        }

        public /* synthetic */ WebBleInfo(String str, WebInfo webInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : webInfo);
        }
    }

    @Keep
    public static final class WebInfo {

        @aa1
        private String bleName;

        @aa1
        private String bleVersion;

        @aa1
        private String flag;

        @aa1
        private String mac;

        @aa1
        private String pVersion;

        @aa1
        private String phoneModel;
        private int phoneOs;

        @aa1
        private String pid;

        @aa1
        private String systemVersion;

        @aa1
        private String uid;

        public WebInfo() {
            this(null, null, null, null, null, null, null, 0, null, null, 1023, null);
        }

        public static /* synthetic */ WebInfo copy$default(WebInfo webInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = webInfo.uid;
            }
            if ((i2 & 2) != 0) {
                str2 = webInfo.bleName;
            }
            if ((i2 & 4) != 0) {
                str3 = webInfo.flag;
            }
            if ((i2 & 8) != 0) {
                str4 = webInfo.pid;
            }
            if ((i2 & 16) != 0) {
                str5 = webInfo.bleVersion;
            }
            if ((i2 & 32) != 0) {
                str6 = webInfo.pVersion;
            }
            if ((i2 & 64) != 0) {
                str7 = webInfo.mac;
            }
            if ((i2 & 128) != 0) {
                i = webInfo.phoneOs;
            }
            if ((i2 & 256) != 0) {
                str8 = webInfo.phoneModel;
            }
            if ((i2 & 512) != 0) {
                str9 = webInfo.systemVersion;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str7;
            int i3 = i;
            String str13 = str5;
            String str14 = str6;
            return webInfo.copy(str, str2, str3, str4, str13, str14, str12, i3, str10, str11);
        }

        @aa1
        public final String component1() {
            return this.uid;
        }

        @aa1
        public final String component10() {
            return this.systemVersion;
        }

        @aa1
        public final String component2() {
            return this.bleName;
        }

        @aa1
        public final String component3() {
            return this.flag;
        }

        @aa1
        public final String component4() {
            return this.pid;
        }

        @aa1
        public final String component5() {
            return this.bleVersion;
        }

        @aa1
        public final String component6() {
            return this.pVersion;
        }

        @aa1
        public final String component7() {
            return this.mac;
        }

        public final int component8() {
            return this.phoneOs;
        }

        @aa1
        public final String component9() {
            return this.phoneModel;
        }

        @aa1
        public final WebInfo copy(@aa1 String uid, @aa1 String bleName, @aa1 String flag, @aa1 String pid, @aa1 String bleVersion, @aa1 String pVersion, @aa1 String mac, int i, @aa1 String phoneModel, @aa1 String systemVersion) {
            Intrinsics.X0O(uid, "uid");
            Intrinsics.X0O(bleName, "bleName");
            Intrinsics.X0O(flag, "flag");
            Intrinsics.X0O(pid, "pid");
            Intrinsics.X0O(bleVersion, "bleVersion");
            Intrinsics.X0O(pVersion, "pVersion");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(phoneModel, "phoneModel");
            Intrinsics.X0O(systemVersion, "systemVersion");
            return new WebInfo(uid, bleName, flag, pid, bleVersion, pVersion, mac, i, phoneModel, systemVersion);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebInfo)) {
                return false;
            }
            WebInfo webInfo = (WebInfo) obj;
            return Intrinsics.XOO0ii0(this.uid, webInfo.uid) && Intrinsics.XOO0ii0(this.bleName, webInfo.bleName) && Intrinsics.XOO0ii0(this.flag, webInfo.flag) && Intrinsics.XOO0ii0(this.pid, webInfo.pid) && Intrinsics.XOO0ii0(this.bleVersion, webInfo.bleVersion) && Intrinsics.XOO0ii0(this.pVersion, webInfo.pVersion) && Intrinsics.XOO0ii0(this.mac, webInfo.mac) && this.phoneOs == webInfo.phoneOs && Intrinsics.XOO0ii0(this.phoneModel, webInfo.phoneModel) && Intrinsics.XOO0ii0(this.systemVersion, webInfo.systemVersion);
        }

        @aa1
        public final String getBleName() {
            return this.bleName;
        }

        @aa1
        public final String getBleVersion() {
            return this.bleVersion;
        }

        @aa1
        public final String getFlag() {
            return this.flag;
        }

        @aa1
        public final String getMac() {
            return this.mac;
        }

        @aa1
        public final String getPVersion() {
            return this.pVersion;
        }

        @aa1
        public final String getPhoneModel() {
            return this.phoneModel;
        }

        public final int getPhoneOs() {
            return this.phoneOs;
        }

        @aa1
        public final String getPid() {
            return this.pid;
        }

        @aa1
        public final String getSystemVersion() {
            return this.systemVersion;
        }

        @aa1
        public final String getUid() {
            return this.uid;
        }

        public int hashCode() {
            return (((((((((((((((((this.uid.hashCode() * 31) + this.bleName.hashCode()) * 31) + this.flag.hashCode()) * 31) + this.pid.hashCode()) * 31) + this.bleVersion.hashCode()) * 31) + this.pVersion.hashCode()) * 31) + this.mac.hashCode()) * 31) + Integer.hashCode(this.phoneOs)) * 31) + this.phoneModel.hashCode()) * 31) + this.systemVersion.hashCode();
        }

        public final void setBleName(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.bleName = str;
        }

        public final void setBleVersion(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.bleVersion = str;
        }

        public final void setFlag(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.flag = str;
        }

        public final void setMac(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.mac = str;
        }

        public final void setPVersion(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.pVersion = str;
        }

        public final void setPhoneModel(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.phoneModel = str;
        }

        public final void setPhoneOs(int i) {
            this.phoneOs = i;
        }

        public final void setPid(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.pid = str;
        }

        public final void setSystemVersion(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.systemVersion = str;
        }

        public final void setUid(@aa1 String str) {
            Intrinsics.X0O(str, "<set-?>");
            this.uid = str;
        }

        @aa1
        public String toString() {
            return "WebInfo(uid=" + this.uid + ", bleName=" + this.bleName + ", flag=" + this.flag + ", pid=" + this.pid + ", bleVersion=" + this.bleVersion + ", pVersion=" + this.pVersion + ", mac=" + this.mac + ", phoneOs=" + this.phoneOs + ", phoneModel=" + this.phoneModel + ", systemVersion=" + this.systemVersion + I000IiI1O.C2156iO.f1007iO;
        }

        public WebInfo(@aa1 String uid, @aa1 String bleName, @aa1 String flag, @aa1 String pid, @aa1 String bleVersion, @aa1 String pVersion, @aa1 String mac, int i, @aa1 String phoneModel, @aa1 String systemVersion) {
            Intrinsics.X0O(uid, "uid");
            Intrinsics.X0O(bleName, "bleName");
            Intrinsics.X0O(flag, "flag");
            Intrinsics.X0O(pid, "pid");
            Intrinsics.X0O(bleVersion, "bleVersion");
            Intrinsics.X0O(pVersion, "pVersion");
            Intrinsics.X0O(mac, "mac");
            Intrinsics.X0O(phoneModel, "phoneModel");
            Intrinsics.X0O(systemVersion, "systemVersion");
            this.uid = uid;
            this.bleName = bleName;
            this.flag = flag;
            this.pid = pid;
            this.bleVersion = bleVersion;
            this.pVersion = pVersion;
            this.mac = mac;
            this.phoneOs = i;
            this.phoneModel = phoneModel;
            this.systemVersion = systemVersion;
        }

        public /* synthetic */ WebInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.WebViewV2Activity$initView$3 */
    public static final class C189503 extends II10X1I {
        public C189503(BridgeWebView bridgeWebView) {
            super(bridgeWebView);
        }

        public static final void XIi00iiXO(WebViewV2Activity webViewV2Activity, String str, X1OI0 x1oi0) {
            LogUtils.m11128d("webView shareLog " + str);
            Intrinsics.XXI(str);
            boolean zIIi011O = StringsKt__StringsKt.iIi011O(str, "true", false, 2, null);
            Intrinsics.XXI(x1oi0);
            webViewV2Activity.shareLog(zIIi011O, x1oi0);
        }

        @Override // com.android.mltcode.paycertificationapi.II10X1I, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) throws Throwable {
            super.onPageFinished(webView, str);
            BridgeWebView webView2 = WebViewV2Activity.this.getWebView();
            final WebViewV2Activity webViewV2Activity = WebViewV2Activity.this;
            webView2.I0iXXO("shareLog", new X0i00iX1() { // from class: com.android.mltcode.paycertificationapi.ux6
                @Override // com.android.mltcode.paycertificationapi.X0i00iX1
                public final void OXO1(String str2, X1OI0 x1oi0) {
                    WebViewV2Activity.C189503.XIi00iiXO(webViewV2Activity, str2, x1oi0);
                }
            });
            if (!WebViewV2Activity.this.isUseWebViewTitle() || webView == null) {
                return;
            }
            LogUtils.m11131v(" view.title -> =" + webView.getTitle());
            LogUtils.m11131v(" view.url -> =" + str);
            XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(WebViewV2Activity.this), null, null, new WebViewV2Activity$initView$3$onPageFinished$2(WebViewV2Activity.this, webView, null), 3, null);
        }

        @Override // com.android.mltcode.paycertificationapi.II10X1I, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.X0O(view, "view");
            Intrinsics.X0O(url, "url");
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    private final File genLogZipFile(String str) {
        try {
            sz0 sz0Var = sz0.OXO1;
            Location location = Location.EXTERNAL;
            hn1.OXO1 oxo1 = hn1.XIi00iiXO;
            File fileOXO1 = sz0Var.OXO1(location, oxo1.O00().XIi00iiXO("share"), str);
            FileUtils.createOrExistsFile(fileOXO1);
            ZipUtils.zipFiles(CollectionsKt__CollectionsKt.iXiX011(sz0.XIi00iiXO(sz0Var, Location.INTERNAL, oxo1.XIi00iiXO(), null, 4, null), uz0.X0i1O(sz0Var), uz0.X1IX(sz0Var)), fileOXO1);
            return fileOXO1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    private final void getLog(final X1OI0 x1oi0) {
        BleConnector bleConnector = BleConnector.INSTANCE;
        BleKey bleKey = BleKey.RAW_SLEEP;
        BleKeyFlag bleKeyFlag = BleKeyFlag.READ;
        BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, null, false, false, 24, null);
        BleCache bleCache = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) || Intrinsics.XOO0ii0(bleCache.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE)) {
            BaseBleConnector.sendData$default(bleConnector, BleKey.DEVICE_FILE, bleKeyFlag, null, false, false, 28, null);
        }
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        final AppUser appUser2 = (AppUser) appUser;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? identity = appUser2.getIdentity();
        objectRef.element = identity;
        if (((CharSequence) identity).length() == 0) {
            SPUtils sPUtilsOXO1 = a01Var.OXO1();
            AppUser appUser3 = (AppUser) new Gson().fromJson(sPUtilsOXO1.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
            if (appUser3 != null) {
                objectRef.element = appUser3.getIdentity();
            }
        }
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.qx6
            @Override // java.lang.Runnable
            public final void run() {
                WebViewV2Activity.getLog$lambda$1(appUser2, objectRef, this, x1oi0);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLog$lambda$1(AppUser appUser, final Ref.ObjectRef objectRef, final WebViewV2Activity webViewV2Activity, final X1OI0 x1oi0) {
        final String str = appUser.getNickname() + IiXI1X1OO.O00 + O0X11OiO.IO0iXO0O().format(new Date()) + IiXI1X1OO.O00 + objectRef.element + OTAManager.OTA_ZIP_SUFFIX;
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.px6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WebViewV2Activity.getLog$lambda$1$0(this.f10458IO, str, objectRef, x1oi0);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getLog$lambda$1$0(final WebViewV2Activity webViewV2Activity, String str, Ref.ObjectRef objectRef, final X1OI0 x1oi0) {
        final File fileGenLogZipFile = webViewV2Activity.genLogZipFile(str);
        if (fileGenLogZipFile != null) {
            UploadFileManager.OXO1.IiI10X((String) objectRef.element, fileGenLogZipFile, new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.me.WebViewV2Activity$getLog$2$1$1$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str2) {
                    FileUtils.delete(fileGenLogZipFile);
                    a01.OXO1.IiI10X().put(b01.f5623I0, System.currentTimeMillis());
                    WebViewV2Activity webViewV2Activity2 = webViewV2Activity;
                    Intrinsics.XXI(str2);
                    webViewV2Activity2.sendBleInfo(str2, x1oi0);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    FileUtils.delete(fileGenLogZipFile);
                    webViewV2Activity.sendBleInfo(error, x1oi0);
                }
            });
        }
        return Unit.OXO1;
    }

    private final TextView getRightTitleTv() {
        return (TextView) this.rightTitleTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BridgeWebView getWebView() {
        return (BridgeWebView) this.webView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(WebViewV2Activity webViewV2Activity, AppUser appUser, View view) {
        String str = oe5.IXO0OOi(Api.INSTANCE.getBASE_URL(), "kotlinweb", "", false, 4, null) + "/feedback/#/feedbackHistory?identity=" + appUser.getIdentity();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", str);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(webViewV2Activity, (Class<?>) WebViewV2Activity.class);
        intent.putExtras(bundle);
        webViewV2Activity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView rightTitleTv_delegate$lambda$0(WebViewV2Activity webViewV2Activity) {
        return (TextView) webViewV2Activity.findViewById(R.id.rightTitleTv);
    }

    public static /* synthetic */ void sendBleInfo$default(WebViewV2Activity webViewV2Activity, String str, X1OI0 x1oi0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "error";
        }
        webViewV2Activity.sendBleInfo(str, x1oi0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendBleInfo$lambda$0(String str, X1OI0 x1oi0) {
        LogUtils.m11128d("webView shareLog  send " + str);
        x1oi0.OXO1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView titleCenter_delegate$lambda$0(WebViewV2Activity webViewV2Activity) {
        return (TextView) webViewV2Activity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BridgeWebView webView_delegate$lambda$0(WebViewV2Activity webViewV2Activity) {
        return (BridgeWebView) webViewV2Activity.findViewById(R.id.webView);
    }

    @tb1
    public final ValueCallback<Uri> getMUploadMessage() {
        return this.mUploadMessage;
    }

    @tb1
    public final ValueCallback<Uri[]> getMUploadMessageArray() {
        return this.mUploadMessageArray;
    }

    public final int getRESULT_CODE() {
        return this.RESULT_CODE;
    }

    public final TextView getTitleCenter() {
        return (TextView) this.titleCenter$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @aa1
    public final String getWebBleInfo(@aa1 String info, @aa1 String bleName, @aa1 String flag, @aa1 String bleVersion, @aa1 String mac) {
        Intrinsics.X0O(info, "info");
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(flag, "flag");
        Intrinsics.X0O(bleVersion, "bleVersion");
        Intrinsics.X0O(mac, "mac");
        Gson gson = new Gson();
        WebBleInfo webBleInfo = new WebBleInfo(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        webBleInfo.setLogPath(info);
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        webBleInfo.setBleInfo(new WebInfo(((AppUser) appUser).getIdentity(), bleName, flag, RequestBodyKt.PROJECT_ID, bleVersion, appVersionName, mac, 0, UtilsKt.XXX11i(), UtilsKt.X11iII1O1(), 128, null));
        String json = gson.toJson(webBleInfo);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        return json;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        final AppUser appUser = AppUser.Companion.getAppUser();
        int mArg1 = getMArg1();
        if (mArg1 == -1) {
            getTitleCenter().setText(R.string.feedback);
            getRightTitleTv().setVisibility(0);
            getRightTitleTv().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.nx6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebViewV2Activity.initView$lambda$0(this.f10036IO, appUser, view);
                }
            });
        } else if (mArg1 != 1) {
            this.isUseWebViewTitle = true;
        } else {
            getTitleCenter().setText(R.string.feedback_history);
        }
        WebSettings settings = getWebView().getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(2);
        settings.setLoadWithOverviewMode(true);
        settings.setGeolocationEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setDomStorageEnabled(true);
        getWebView().setDefaultHandler(new iiIIOXXXO());
        getWebView().setWebViewClient(new C189503(getWebView()));
        String mArg0 = getMArg0();
        if (mArg0 != null) {
            LogUtils.m11128d("webView url " + mArg0);
            getWebView().loadUrl(mArg0);
        }
        getWebView().setWebChromeClient(new OXO1());
    }

    public final boolean isUseWebViewTitle() {
        return this.isUseWebViewTitle;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_main_webview_jsbridge;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.RESULT_CODE) {
            ValueCallback<Uri> valueCallback = this.mUploadMessage;
            if (valueCallback == null && this.mUploadMessageArray == null) {
                return;
            }
            if (valueCallback != null && this.mUploadMessageArray == null) {
                Uri data = (intent == null || i2 != -1) ? null : intent.getData();
                ValueCallback<Uri> valueCallback2 = this.mUploadMessage;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(data);
                }
                this.mUploadMessage = null;
            }
            if (this.mUploadMessage != null || this.mUploadMessageArray == null) {
                return;
            }
            Uri data2 = (intent == null || i2 != -1) ? null : intent.getData();
            if (data2 != null) {
                ValueCallback<Uri[]> valueCallback3 = this.mUploadMessageArray;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(new Uri[]{data2});
                }
            } else {
                ValueCallback<Uri[]> valueCallback4 = this.mUploadMessageArray;
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(null);
                }
            }
            this.mUploadMessageArray = null;
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWebView().destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @tb1 KeyEvent keyEvent) {
        if (!getWebView().canGoBack() || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        getWebView().goBack();
        return true;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getWebView().canGoBack()) {
            getWebView().goBack();
        } else {
            finish();
        }
    }

    public final void pickFile() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent, this.RESULT_CODE);
    }

    public final void sendBleInfo(@aa1 String info, @aa1 final X1OI0 mBridgeHandler) {
        final String webBleInfo;
        Intrinsics.X0O(info, "info");
        Intrinsics.X0O(mBridgeHandler, "mBridgeHandler");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsOXO1 = a01Var.OXO1();
        DeviceLaseRecord deviceLaseRecord = (DeviceLaseRecord) new Gson().fromJson(sPUtilsOXO1.getString(b01.XXOXi + '_' + DeviceLaseRecord.class.getName()), DeviceLaseRecord.class);
        SPUtils sPUtilsOXO2 = a01Var.OXO1();
        DeviceLaseRecord deviceLaseRecord2 = (DeviceLaseRecord) new Gson().fromJson(sPUtilsOXO2.getString(b01.I0XXi0X + '_' + DeviceLaseRecord.class.getName()), DeviceLaseRecord.class);
        BleCache bleCache = BleCache.INSTANCE;
        if (bleCache.getMBleName().length() != 0 || deviceLaseRecord == null || deviceLaseRecord.getBleName().length() <= 0) {
            webBleInfo = (bleCache.getMBleName().length() != 0 || deviceLaseRecord2 == null || deviceLaseRecord2.getBleName().length() <= 0) ? getWebBleInfo(info, bleCache.getMBleName(), bleCache.getMFirmwareFlag(), BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null), oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null)) : getWebBleInfo(info, deviceLaseRecord2.getBleName(), "", "", oe5.IXO0OOi(deviceLaseRecord2.getMac(), CertificateUtil.DELIMITER, "", false, 4, null));
        } else {
            webBleInfo = getWebBleInfo(info, deviceLaseRecord.getBleName(), deviceLaseRecord.getFlag(), deviceLaseRecord.getBleVersion(), oe5.IXO0OOi(deviceLaseRecord.getMac(), CertificateUtil.DELIMITER, "", false, 4, null));
        }
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ox6
            @Override // java.lang.Runnable
            public final void run() {
                WebViewV2Activity.sendBleInfo$lambda$0(webBleInfo, mBridgeHandler);
            }
        });
    }

    public final void setMUploadMessage(@tb1 ValueCallback<Uri> valueCallback) {
        this.mUploadMessage = valueCallback;
    }

    public final void setMUploadMessageArray(@tb1 ValueCallback<Uri[]> valueCallback) {
        this.mUploadMessageArray = valueCallback;
    }

    public final void setUseWebViewTitle(boolean z) {
        this.isUseWebViewTitle = z;
    }

    public final void shareLog(boolean z, @aa1 X1OI0 mBridgeHandler) {
        Intrinsics.X0O(mBridgeHandler, "mBridgeHandler");
        LogUtils.m11128d("webView shareLog bool = " + z);
        if (z) {
            getLog(mBridgeHandler);
        } else {
            sendBleInfo("", mBridgeHandler);
        }
    }
}
