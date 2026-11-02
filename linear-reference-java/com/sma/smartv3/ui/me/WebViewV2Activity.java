package com.sma.smartv3.ui.me;

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
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.II10X1I;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X1OI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.iiIIOXXXO;
import com.android.mltcode.paycertificationapi.nx6;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.ox6;
import com.android.mltcode.paycertificationapi.px6;
import com.android.mltcode.paycertificationapi.qx6;
import com.android.mltcode.paycertificationapi.rx6;
import com.android.mltcode.paycertificationapi.sx6;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tx6;
import com.android.mltcode.paycertificationapi.ux6;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.io.Location;
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
import com.sma.smartv3.network.GetDcsToken;
import com.sma.smartv3.network.RequestBodyKt;
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
    private final Lazy rightTitleTv$delegate;

    @aa1
    private final Lazy titleCenter$delegate;

    @aa1
    private final Lazy webView$delegate;

    public static final class OXO1 extends WebChromeClient {
        public final /* synthetic */ WebViewV2Activity OXO1;

        public OXO1(WebViewV2Activity r1) {
            this.OXO1 = r1;
        }

        public final void OXO1(ValueCallback<Uri> r2) {
            Intrinsics.X0O(r2, "uploadMsg");
            this.OXO1.setMUploadMessage(r2);
            this.OXO1.pickFile();
        }

        public final void XIi00iiXO(ValueCallback<Uri> r1, String r2) {
            Intrinsics.X0O(r1, "uploadMsg");
            OXO1(r1);
        }

        public final void iO(ValueCallback<Uri> r1, String r2, String r3) {
            Intrinsics.X0O(r1, "uploadMsg");
            OXO1(r1);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView r2, ValueCallback<Uri[]> r3, WebChromeClient.FileChooserParams r4) {
            Intrinsics.X0O(r2, "webView");
            Intrinsics.X0O(r3, "filePathCallback");
            Intrinsics.X0O(r4, "fileChooserParams");
            this.OXO1.setMUploadMessageArray(r3);
            this.OXO1.pickFile();
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
            Object[] r0 = 0 == true ? 1 : 0;
            this(null, r0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ WebBleInfo copy$default(WebBleInfo r0, String r1, WebInfo r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.logPath;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.bleInfo;
        L9:
            return r0.copy(r1, r2);
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
        public final WebBleInfo copy(@aa1 String r2, @tb1 WebInfo r3) {
            Intrinsics.X0O(r2, "logPath");
            return new WebBleInfo(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof WebBleInfo) == true) goto L8;
            return false;
        L8:
            WebBleInfo r6 = (WebBleInfo) r5;
            if (Intrinsics.XOO0ii0(this.logPath, r6.logPath) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.bleInfo, r6.bleInfo) == true) goto L14;
            return false;
        L14:
            return true;
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
            int r0 = this.logPath.hashCode() * 31;
            WebInfo r1 = this.bleInfo;
            if (r1 != null) goto L5;
            int r2 = 0;
        L7:
            return r0 + r2;
        L5:
            r2 = r1.hashCode();
            goto L7
        }

        public final void setBleInfo(@tb1 WebInfo r1) {
            this.bleInfo = r1;
        }

        public final void setLogPath(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.logPath = r2;
        }

        @aa1
        public String toString() {
            return "WebBleInfo(logPath=" + this.logPath + ", bleInfo=" + this.bleInfo + I000IiI1O.iO.iO;
        }

        public WebBleInfo(@aa1 String r2, @tb1 WebInfo r3) {
            Intrinsics.X0O(r2, "logPath");
            this.logPath = r2;
            this.bleInfo = r3;
        }

        public /* synthetic */ WebBleInfo(String r1, WebInfo r2, int r3, DefaultConstructorMarker r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = "";
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = null;
        L8:
            this(r1, r2);
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
            String r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            String r5 = null;
            String r6 = null;
            String r7 = null;
            int r8 = 0;
            String r9 = null;
            String r10 = null;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
        }

        public static /* synthetic */ WebInfo copy$default(WebInfo r0, String r1, String r2, String r3, String r4, String r5, String r6, String r7, int r8, String r9, String r10, int r11, Object r12) {
            if ((r11 & 1) == 0) goto L6;
            r1 = r0.uid;
        L6:
            if ((r11 & 2) == 0) goto L9;
            r2 = r0.bleName;
        L9:
            if ((r11 & 4) == 0) goto L12;
            r3 = r0.flag;
        L12:
            if ((r11 & 8) == 0) goto L15;
            r4 = r0.pid;
        L15:
            if ((r11 & 16) == 0) goto L18;
            r5 = r0.bleVersion;
        L18:
            if ((r11 & 32) == 0) goto L21;
            r6 = r0.pVersion;
        L21:
            if ((r11 & 64) == 0) goto L24;
            r7 = r0.mac;
        L24:
            if ((r11 & 128) == 0) goto L27;
            r8 = r0.phoneOs;
        L27:
            if ((r11 & 256) == 0) goto L30;
            r9 = r0.phoneModel;
        L30:
            if ((r11 & 512) == 0) goto L32;
            r10 = r0.systemVersion;
        L32:
            String r13 = r9;
            String r14 = r10;
            String r15 = r7;
            int r16 = r8;
            String r17 = r5;
            String r18 = r6;
            String r19 = r3;
            String r20 = r4;
            return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
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
        public final WebInfo copy(@aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, int r20, @aa1 String r21, @aa1 String r22) {
            Intrinsics.X0O(r13, "uid");
            Intrinsics.X0O(r14, "bleName");
            Intrinsics.X0O(r15, "flag");
            Intrinsics.X0O(r16, "pid");
            Intrinsics.X0O(r17, GetDcsToken.FIRMWARE_VERSION);
            Intrinsics.X0O(r18, "pVersion");
            Intrinsics.X0O(r19, "mac");
            Intrinsics.X0O(r21, "phoneModel");
            Intrinsics.X0O(r22, "systemVersion");
            return new WebInfo(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof WebInfo) == true) goto L8;
            return false;
        L8:
            WebInfo r6 = (WebInfo) r5;
            if (Intrinsics.XOO0ii0(this.uid, r6.uid) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.bleName, r6.bleName) == true) goto L15;
            return false;
        L15:
            if (Intrinsics.XOO0ii0(this.flag, r6.flag) == true) goto L18;
            return false;
        L18:
            if (Intrinsics.XOO0ii0(this.pid, r6.pid) == true) goto L21;
            return false;
        L21:
            if (Intrinsics.XOO0ii0(this.bleVersion, r6.bleVersion) == true) goto L24;
            return false;
        L24:
            if (Intrinsics.XOO0ii0(this.pVersion, r6.pVersion) == true) goto L27;
            return false;
        L27:
            if (Intrinsics.XOO0ii0(this.mac, r6.mac) == true) goto L30;
            return false;
        L30:
            if (this.phoneOs == r6.phoneOs) goto L33;
            return false;
        L33:
            if (Intrinsics.XOO0ii0(this.phoneModel, r6.phoneModel) == true) goto L36;
            return false;
        L36:
            if (Intrinsics.XOO0ii0(this.systemVersion, r6.systemVersion) == true) goto L38;
            return false;
        L38:
            return true;
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

        public final void setBleName(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.bleName = r2;
        }

        public final void setBleVersion(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.bleVersion = r2;
        }

        public final void setFlag(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.flag = r2;
        }

        public final void setMac(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.mac = r2;
        }

        public final void setPVersion(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.pVersion = r2;
        }

        public final void setPhoneModel(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.phoneModel = r2;
        }

        public final void setPhoneOs(int r1) {
            this.phoneOs = r1;
        }

        public final void setPid(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.pid = r2;
        }

        public final void setSystemVersion(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.systemVersion = r2;
        }

        public final void setUid(@aa1 String r2) {
            Intrinsics.X0O(r2, "<set-?>");
            this.uid = r2;
        }

        @aa1
        public String toString() {
            return "WebInfo(uid=" + this.uid + ", bleName=" + this.bleName + ", flag=" + this.flag + ", pid=" + this.pid + ", bleVersion=" + this.bleVersion + ", pVersion=" + this.pVersion + ", mac=" + this.mac + ", phoneOs=" + this.phoneOs + ", phoneModel=" + this.phoneModel + ", systemVersion=" + this.systemVersion + I000IiI1O.iO.iO;
        }

        public WebInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, int r9, @aa1 String r10, @aa1 String r11) {
            Intrinsics.X0O(r2, "uid");
            Intrinsics.X0O(r3, "bleName");
            Intrinsics.X0O(r4, "flag");
            Intrinsics.X0O(r5, "pid");
            Intrinsics.X0O(r6, GetDcsToken.FIRMWARE_VERSION);
            Intrinsics.X0O(r7, "pVersion");
            Intrinsics.X0O(r8, "mac");
            Intrinsics.X0O(r10, "phoneModel");
            Intrinsics.X0O(r11, "systemVersion");
            this.uid = r2;
            this.bleName = r3;
            this.flag = r4;
            this.pid = r5;
            this.bleVersion = r6;
            this.pVersion = r7;
            this.mac = r8;
            this.phoneOs = r9;
            this.phoneModel = r10;
            this.systemVersion = r11;
        }

        public /* synthetic */ WebInfo(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
            if ((r12 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r12 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r12 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r12 & 8) == 0) goto L15;
            r5 = "";
        L15:
            if ((r12 & 16) == 0) goto L18;
            r6 = "";
        L18:
            if ((r12 & 32) == 0) goto L21;
            r7 = "";
        L21:
            if ((r12 & 64) == 0) goto L24;
            r8 = "";
        L24:
            if ((r12 & 128) == 0) goto L27;
            r9 = 0;
        L27:
            if ((r12 & 256) == 0) goto L30;
            r10 = "";
        L30:
            if ((r12 & 512) == 0) goto L33;
            String r14 = "";
        L32:
            String r15 = r10;
            int r16 = r9;
            String r17 = r8;
            String r18 = r7;
            String r19 = r6;
            String r20 = r5;
            String r21 = r4;
            String r22 = r3;
            this(r2, r22, r21, r20, r19, r18, r17, r16, r15, r14);
            return;
        L33:
            r14 = r11;
            goto L32
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.WebViewV2Activity$initView$3, reason: invalid class name */
    public static final class AnonymousClass3 extends II10X1I {
        public final /* synthetic */ WebViewV2Activity XIi00iiXO;

        public AnonymousClass3(WebViewV2Activity r1, BridgeWebView r2) {
            this.XIi00iiXO = r1;
            super(r2);
        }

        public static /* synthetic */ void OXO1(WebViewV2Activity r0, String r1, X1OI0 r2) {
            XIi00iiXO(r0, r1, r2);
        }

        public static final void XIi00iiXO(WebViewV2Activity r4, String r5, X1OI0 r6) {
            LogUtils.d(new Object[]{"webView shareLog " + r5});
            Intrinsics.XXI(r5);
            boolean r7 = StringsKt__StringsKt.iIi011O(r5, "true", false, 2, null);
            Intrinsics.XXI(r6);
            r4.shareLog(r7, r6);
        }

        @Override // com.android.mltcode.paycertificationapi.II10X1I, android.webkit.WebViewClient
        public void onPageFinished(WebView r7, String r8) {
            super.onPageFinished(r7, r8);
            BridgeWebView r0 = WebViewV2Activity.access$getWebView(this.XIi00iiXO);
            final WebViewV2Activity r1 = this.XIi00iiXO;
            r0.I0iXXO("shareLog", new ux6(r1));
            if (this.XIi00iiXO.isUseWebViewTitle() == false) goto L7;
            if (r7 == null) goto L8;
            LogUtils.v(new Object[]{" view.title -> =" + r7.getTitle()});
            LogUtils.v(new Object[]{" view.url -> =" + r8});
            I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this.XIi00iiXO), null, null, new WebViewV2Activity$initView$3$onPageFinished$2(this.XIi00iiXO, r7, null), 3, null);
            return;
        L8:
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.II10X1I, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView r2, String r3) {
            Intrinsics.X0O(r2, "view");
            Intrinsics.X0O(r3, "url");
            return super.shouldOverrideUrlLoading(r2, r3);
        }
    }

    public WebViewV2Activity() {
        this.webView$delegate = LazyKt__LazyJVMKt.iO(new rx6(this));
        this.titleCenter$delegate = LazyKt__LazyJVMKt.iO(new sx6(this));
        this.rightTitleTv$delegate = LazyKt__LazyJVMKt.iO(new tx6(this));
    }

    public static /* synthetic */ void I0iXXO(String r0, X1OI0 r1) {
        sendBleInfo$lambda$0(r0, r1);
    }

    public static /* synthetic */ BridgeWebView I1XOi1(WebViewV2Activity r0) {
        return webView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(WebViewV2Activity r0) {
        return rightTitleTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(WebViewV2Activity r0) {
        return titleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(WebViewV2Activity r0, AppUser r1, View r2) {
        initView$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void X1ii(AppUser r0, Ref.ObjectRef r1, WebViewV2Activity r2, X1OI0 r3) {
        getLog$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XXI(WebViewV2Activity r0, String r1, Ref.ObjectRef r2, X1OI0 r3) {
        return getLog$lambda$1$0(r0, r1, r2, r3);
    }

    public static final /* synthetic */ BridgeWebView access$getWebView(WebViewV2Activity r0) {
        return r0.getWebView();
    }

    private final File genLogZipFile(String r7) {
        sz0 r0 = sz0.OXO1;     // Catch: Exception -> L4
        Location r1 = Location.EXTERNAL;     // Catch: Exception -> L4
        hn1.OXO1 r2 = hn1.XIi00iiXO;     // Catch: Exception -> L4
        File r8 = r0.OXO1(r1, r2.O00().XIi00iiXO("share"), r7);     // Catch: Exception -> L4
        FileUtils.createOrExistsFile(r8);     // Catch: Exception -> L4
        ZipUtils.zipFiles(CollectionsKt__CollectionsKt.iXiX011(new File[]{sz0.XIi00iiXO(r0, Location.INTERNAL, r2.XIi00iiXO(), null, 4, null), uz0.X0i1O(r0), uz0.X1IX(r0)}), r8);     // Catch: Exception -> L4
        return r8;
    L4:
        e = move-exception;
        e.printStackTrace();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    private final void getLog(final X1OI0 r33) {
        BleConnector r0 = BleConnector.INSTANCE;
        BleKey r1 = BleKey.RAW_SLEEP;
        BleKeyFlag r2 = BleKeyFlag.READ;
        BaseBleConnector.sendObject$default(r0, r1, r2, null, false, false, 24, null);
        BleCache r3 = BleCache.INSTANCE;
        if (Intrinsics.XOO0ii0(r3.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L5;
    L8:
        BaseBleConnector.sendData$default(r0, BleKey.DEVICE_FILE, r2, null, false, false, 28, null);
    L9:
        a01 r4 = a01.OXO1;
        SPUtils r5 = r4.IiI10X();
        Object r6 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r7 = new Gson().fromJson(r5.getString(AppUser.class.getName()), AppUser.class);
        if (r7 == null) goto L13;
        r6 = r7;
    L13:
        final AppUser r8 = (AppUser) r6;
        final Ref.ObjectRef r9 = new Ref.ObjectRef();
        ?? r10 = r8.getIdentity();
        r9.element = r10;
        if (((CharSequence) r10).length() != 0) goto L18;
        SPUtils r11 = r4.OXO1();
        AppUser r12 = (AppUser) new Gson().fromJson(r11.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
        if (r12 == null) goto L18;
        r9.element = r12.getIdentity();
    L18:
        new Handler().postDelayed(new qx6(r8, r9, this, r33), 3000);
        return;
    L5:
        if (Intrinsics.XOO0ii0(r3.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L8;
        if (Intrinsics.XOO0ii0(r3.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == false) goto L9;
        goto L8
    }

    private static final void getLog$lambda$1(AppUser r8, final Ref.ObjectRef r9, final WebViewV2Activity r10, final X1OI0 r11) {
        final String r12 = r8.getNickname() + IiXI1X1OO.O00 + O0X11OiO.IO0iXO0O().format(new Date()) + IiXI1X1OO.O00 + r9.element + OTAManager.OTA_ZIP_SUFFIX;
        ThreadsKt.iO(false, false, null, null, 0, new px6(r10, r12, r9, r11), 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit getLog$lambda$1$0(final WebViewV2Activity r2, String r3, Ref.ObjectRef r4, final X1OI0 r5) {
        final File r6 = r2.genLogZipFile(r3);
        if (r6 == null) goto L6;
        UploadFileManager.OXO1.IiI10X((String) r4.element, r6, new WebViewV2Activity$getLog$2$1$1$1(r6, r2, r5));
    L6:
        return Unit.OXO1;
    }

    private final TextView getRightTitleTv() {
        return (TextView) getValue();
    }

    public static /* synthetic */ String getWebBleInfo$default(WebViewV2Activity r9, String r10, String r11, String r12, String r13, String r14, int r15, Object r16) {
        if ((r15 & 2) == 0) goto L5;
        String r0 = BleCache.INSTANCE.getMBleName();
    L7:
        if ((r15 & 4) == 0) goto L9;
        String r1 = BleCache.INSTANCE.getMFirmwareFlag();
    L11:
        if ((r15 & 8) == 0) goto L13;
        String r2 = BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.FIRMWARE_VERSION, null, null, 6, null);
    L15:
        if ((r15 & 16) == 0) goto L18;
        String r17 = oe5.IXO0OOi(BleCache.INSTANCE.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null);
    L20:
        return r9.getWebBleInfo(r10, r0, r1, r2, r17);
    L18:
        r17 = r14;
        goto L20
    L13:
        r2 = r13;
        goto L15
    L9:
        r1 = r12;
        goto L11
    L5:
        r0 = r11;
        goto L7
    }

    private final BridgeWebView getWebView() {
        return (BridgeWebView) getValue();
    }

    private static final void initView$lambda$0(WebViewV2Activity r6, AppUser r7, View r8) {
        String r9 = oe5.IXO0OOi(Api.INSTANCE.getBASE_URL(), "kotlinweb", "", false, 4, null) + "/feedback/#/feedbackHistory?identity=" + r7.getIdentity();
        Bundle r10 = new Bundle();
        r10.putString("mArg0", r9);
        r10.putInt("mArg1", 1);
        r10.putParcelable("mArg2", null);
        r10.putSerializable("mArg3", null);
        Intent r11 = new Intent(r6, WebViewV2Activity.class);
        r11.putExtras(r10);
        r6.startActivity(r11);
    }

    private static final TextView rightTitleTv_delegate$lambda$0(WebViewV2Activity r1) {
        return (TextView) r1.findViewById(R.id.rightTitleTv);
    }

    public static /* synthetic */ void sendBleInfo$default(WebViewV2Activity r0, String r1, X1OI0 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = "error";
    L5:
        r0.sendBleInfo(r1, r2);
    }

    private static final void sendBleInfo$lambda$0(String r2, X1OI0 r3) {
        LogUtils.d(new Object[]{"webView shareLog  send " + r2});
        r3.OXO1(r2);
    }

    private static final TextView titleCenter_delegate$lambda$0(WebViewV2Activity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final BridgeWebView webView_delegate$lambda$0(WebViewV2Activity r1) {
        return (BridgeWebView) r1.findViewById(R.id.webView);
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
        return (TextView) getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @aa1
    public final String getWebBleInfo(@aa1 String r47, @aa1 String r48, @aa1 String r49, @aa1 String r50, @aa1 String r51) {
        Intrinsics.X0O(r47, "info");
        Intrinsics.X0O(r48, "bleName");
        Intrinsics.X0O(r49, "flag");
        Intrinsics.X0O(r50, GetDcsToken.FIRMWARE_VERSION);
        Intrinsics.X0O(r51, "mac");
        Gson r1 = new Gson();
        Object[] r2 = 0 == true ? 1 : 0;
        WebBleInfo r15 = new WebBleInfo(null, r2, 3, 0 == true ? 1 : 0);
        r15.setLogPath(r47);
        String r8 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r8, "getAppVersionName(...)");
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r16 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r16 = r3;
    L6:
        String r6 = RequestBodyKt.PROJECT_ID;
        int r10 = 0;
        r15.setBleInfo(new WebInfo(((AppUser) r16).getIdentity(), r48, r49, r6, r50, r8, r51, r10, UtilsKt.XXX11i(), UtilsKt.X11iII1O1(), 128, null));
        String r4 = r1.toJson(r15);
        Intrinsics.O10IXXX0X(r4, "toJson(...)");
        return r4;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        final AppUser r0 = AppUser.Companion.getAppUser();
        int r1 = getMArg1();
        if (r1 == (-1)) goto L7;
        if (r1 == 1) goto L6;
        this.isUseWebViewTitle = true;
    L8:
        WebSettings r2 = getWebView().getSettings();
        r2.setJavaScriptEnabled(true);
        r2.setUseWideViewPort(true);
        r2.setCacheMode(2);
        r2.setLoadWithOverviewMode(true);
        r2.setGeolocationEnabled(true);
        r2.setAllowFileAccess(true);
        r2.setJavaScriptCanOpenWindowsAutomatically(true);
        r2.setLoadsImagesAutomatically(true);
        r2.setDomStorageEnabled(true);
        getWebView().setDefaultHandler(new iiIIOXXXO());
        getWebView().setWebViewClient(new AnonymousClass3(this, getWebView()));
        String r3 = getMArg0();
        if (r3 == null) goto L11;
        LogUtils.d(new Object[]{"webView url " + r3});
        getWebView().loadUrl(r3);
    L11:
        getWebView().setWebChromeClient(new OXO1(this));
        return;
    L6:
        getTitleCenter().setText(R.string.feedback_history);
        goto L8
    L7:
        getTitleCenter().setText(R.string.feedback);
        getRightTitleTv().setVisibility(0);
        getRightTitleTv().setOnClickListener(new nx6(this, r0));
        goto L8
    }

    public final boolean isUseWebViewTitle() {
        return this.isUseWebViewTitle;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_main_webview_jsbridge;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r4, int r5, @tb1 Intent r6) {
        super.onActivityResult(r4, r5, r6);
        if (r4 != this.RESULT_CODE) goto L40;
        ValueCallback<Uri> r7 = this.mUploadMessage;
        if (r7 != null) goto L10;
        if (this.mUploadMessageArray != null) goto L10;
        return;
    L10:
        if (r7 == null) goto L23;
        if (this.mUploadMessageArray != null) goto L23;
        if (r6 == null) goto L17;
        if (r5 != (-1)) goto L17;
        Uri r8 = r6.getData();
    L18:
        ValueCallback<Uri> r2 = this.mUploadMessage;
        if (r2 == null) goto L21;
        r2.onReceiveValue(r8);
    L21:
        this.mUploadMessage = null;
    L17:
        r8 = null;
    L23:
        if (this.mUploadMessage == null) goto L25;
        return;
    L25:
        if (this.mUploadMessageArray == null) goto L42;
        if (r6 == null) goto L30;
        if (r5 != (-1)) goto L30;
        Uri r9 = r6.getData();
    L31:
        if (r9 == null) goto L35;
        ValueCallback<Uri[]> r10 = this.mUploadMessageArray;
        if (r10 == null) goto L38;
        r10.onReceiveValue(new Uri[]{r9});
    L38:
        this.mUploadMessageArray = null;
        return;
    L35:
        ValueCallback<Uri[]> r11 = this.mUploadMessageArray;
        if (r11 == null) goto L38;
        r11.onReceiveValue(null);
    L30:
        r9 = null;
        goto L31
    L42:
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getWebView().destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, @tb1 KeyEvent r3) {
        if (getWebView().canGoBack() == false) goto L9;
        if (r2 != 4) goto L9;
        getWebView().goBack();
        return true;
    L9:
        return super.onKeyDown(r2, r3);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getWebView().canGoBack() == false) goto L6;
        getWebView().goBack();
        return;
    L6:
        finish();
    }

    public final void pickFile() {
        Intent r0 = new Intent("android.intent.action.GET_CONTENT");
        r0.setType("image/*");
        startActivityForResult(r0, this.RESULT_CODE);
    }

    public final void sendBleInfo(@aa1 String r13, @aa1 final X1OI0 r14) {
        Intrinsics.X0O(r13, "info");
        Intrinsics.X0O(r14, "mBridgeHandler");
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.OXO1();
        DeviceLaseRecord r2 = (DeviceLaseRecord) new Gson().fromJson(r1.getString(b01.XXOXi + '_' + DeviceLaseRecord.class.getName()), DeviceLaseRecord.class);
        SPUtils r3 = r0.OXO1();
        DeviceLaseRecord r4 = (DeviceLaseRecord) new Gson().fromJson(r3.getString(b01.I0XXi0X + '_' + DeviceLaseRecord.class.getName()), DeviceLaseRecord.class);
        BleCache r5 = BleCache.INSTANCE;
        if (r5.getMBleName().length() != 0) goto L9;
        if (r2 == null) goto L9;
        if (r2.getBleName().length() <= 0) goto L9;
        final String r6 = getWebBleInfo(r13, r2.getBleName(), r2.getFlag(), r2.getBleVersion(), oe5.IXO0OOi(r2.getMac(), CertificateUtil.DELIMITER, "", false, 4, null));
    L15:
        runOnUiThread(new ox6(r6, r14));
        return;
    L9:
        if (r5.getMBleName().length() != 0) goto L14;
        if (r4 == null) goto L14;
        if (r4.getBleName().length() <= 0) goto L14;
        r6 = getWebBleInfo(r13, r4.getBleName(), "", "", oe5.IXO0OOi(r4.getMac(), CertificateUtil.DELIMITER, "", false, 4, null));
    L14:
        r6 = getWebBleInfo(r13, r5.getMBleName(), r5.getMFirmwareFlag(), BaseBleCache.getString$default(r5, BleKey.FIRMWARE_VERSION, null, null, 6, null), oe5.IXO0OOi(r5.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        goto L15
    }

    public final void setMUploadMessage(@tb1 ValueCallback<Uri> r1) {
        this.mUploadMessage = r1;
    }

    public final void setMUploadMessageArray(@tb1 ValueCallback<Uri[]> r1) {
        this.mUploadMessageArray = r1;
    }

    public final void setUseWebViewTitle(boolean r1) {
        this.isUseWebViewTitle = r1;
    }

    public final void shareLog(boolean r3, @aa1 X1OI0 r4) {
        Intrinsics.X0O(r4, "mBridgeHandler");
        LogUtils.d(new Object[]{"webView shareLog bool = " + r3});
        if (r3 == false) goto L6;
        getLog(r4);
        return;
    L6:
        sendBleInfo("", r4);
    }
}
