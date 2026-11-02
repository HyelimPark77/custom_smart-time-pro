package com.sma.smartv3.ui.launcher;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.wk;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.biz.ad.ADPAdListener;
import com.sma.smartv3.biz.ad.ADPAppOpenAdManager;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.biz.ad.ADPCAppOpenAdManager;
import com.sma.smartv3.biz.ad.OnShowADPAdCompleteListener;
import com.sma.smartv3.biz.ad.OnShowADPCAdCompleteListener;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.main.MainActivity;
import com.sma.smartv3.util.GifUtils;
import com.sma.smartv3.view.GifImageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nLauncherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherActivity.kt\ncom/sma/smartv3/ui/launcher/LauncherActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n19#2:271\n15#2:272\n69#3,3:273\n72#3,5:277\n69#3,3:282\n72#3,5:286\n69#3,3:291\n72#3,5:295\n1#4:276\n1#4:285\n1#4:294\n*S KotlinDebug\n*F\n+ 1 LauncherActivity.kt\ncom/sma/smartv3/ui/launcher/LauncherActivity\n*L\n135#1:271\n135#1:272\n138#1:273,3\n138#1:277,5\n140#1:282,3\n140#1:286,5\n143#1:291,3\n143#1:295,5\n138#1:276\n140#1:285\n143#1:294\n*E\n"})
public final class LauncherActivity extends BaseActivity {
    private int openCountToday;

    public static final class IiI10X implements GifUtils.OXO1 {
        public final /* synthetic */ LauncherActivity OXO1;

        public IiI10X(LauncherActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.util.GifUtils.OXO1
        public void OXO1() {
            LauncherActivity.access$delayGo(this.OXO1, i72.OXO1.iI());
        }
    }

    public static final class O00 implements GifImageView.OXO1 {
        public final /* synthetic */ LauncherActivity OXO1;

        public O00(LauncherActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.GifImageView.OXO1
        public void OXO1() {
            LauncherActivity.access$delayGo(this.OXO1, i72.OXO1.iI());
        }
    }

    public static final class OXO1 implements OnShowADPAdCompleteListener {
        public final /* synthetic */ LauncherActivity OXO1;

        public OXO1(LauncherActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.biz.ad.OnShowADPAdCompleteListener
        public void onShowAdComplete() {
            LauncherActivity.access$go(this.OXO1);
        }
    }

    public static final class XIi00iiXO extends ADPAdListener {
        public final /* synthetic */ LauncherActivity OXO1;

        public XIi00iiXO(LauncherActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdClicked(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            if (q62.OXO1.XXXiXXOI() == false) goto L6;
            StatManager.OXO1.XIi00iiXO(19, r3);
            return;
        }

        @Override // com.sma.smartv3.biz.ad.ADPAdListener
        public void onAdOpen(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            LauncherActivity.access$saveDisplayAd(this.OXO1);
            if (q62.OXO1.XXXiXXOI() == false) goto L6;
            StatManager.OXO1.XIi00iiXO(18, r3);
            return;
        }
    }

    public static final class XO0O10 extends ADPCAdListener {
        public final /* synthetic */ LauncherActivity OXO1;

        public XO0O10(LauncherActivity r1) {
            this.OXO1 = r1;
        }

        public void onADClicked(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            if (q62.OXO1.XXXiXXOI() == false) goto L6;
            StatManager.OXO1.XIi00iiXO(19, r3);
            return;
        }

        public void onADPresent(String r3) {
            Intrinsics.X0O(r3, "adUnitId");
            LauncherActivity.access$saveDisplayAd(this.OXO1);
            if (q62.OXO1.XXXiXXOI() == false) goto L6;
            StatManager.OXO1.XIi00iiXO(18, r3);
            return;
        }
    }

    public static final class iO implements OnShowADPCAdCompleteListener {
        public final /* synthetic */ LauncherActivity OXO1;

        public iO(LauncherActivity r1) {
            this.OXO1 = r1;
        }

        public void onShowAdComplete() {
            LauncherActivity.access$go(this.OXO1);
        }
    }

    public LauncherActivity() {
    }

    public static /* synthetic */ void OIX0iXi(LauncherActivity r0) {
        delayGo$lambda$0(r0);
    }

    public static final /* synthetic */ void access$delayGo(LauncherActivity r0, long r1) {
        r0.delayGo(r1);
    }

    public static final /* synthetic */ void access$go(LauncherActivity r0) {
        r0.go();
    }

    public static final /* synthetic */ boolean access$saveDisplayAd(LauncherActivity r0) {
        return r0.saveDisplayAd();
    }

    private final void delayGo(long r3) {
        new Handler().postDelayed(new wk(this), r3);
    }

    private static final void delayGo$lambda$0(LauncherActivity r2) {
        i72 r0 = i72.OXO1;
        if (r0.O1iXiI() == false) goto L11;
        ADPCAppOpenAdManager r1 = ADPCAppOpenAdManager.INSTANCE;
        if (r1.isShowingAd() == false) goto L7;
        return;
    L7:
        if (r1.isLeftActivity() == true) goto L21;
        r2.go();
        return;
    L21:
        return;
    L11:
        if (r0.I0XXi0X() == false) goto L18;
        ADPAppOpenAdManager r3 = ADPAppOpenAdManager.INSTANCE;
        if (r3.isShowingAd() == false) goto L15;
        return;
    L15:
        if (r3.isLeftActivity() == true) goto L23;
        r2.go();
        return;
    L23:
        return;
    L18:
        r2.go();
    }

    private final int getDisplayAdNumber() {
        return a01.OXO1.OXO1().getInt(b01.OXXO0O1X, 0);
    }

    private final void go() {
        a01 r1 = a01.OXO1;
        if (r1.IiI10X().getBoolean(b01.O001I, true) == false) goto L12;
        SPUtils r2 = r1.IiI10X();
        Object r4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L9;
        r4 = r3;
    L9:
        if (((AppUser) r4).getIdentity().length() != 0) goto L11;
        startActivity(new Intent(this, GuideActivity.class));
    L13:
        finish();
        return;
    L11:
        startActivity(new Intent(this, MainActivity.class));
        goto L13
    L12:
        startActivity(new Intent(this, MainActivity.class));
        goto L13
    }

    private final void initADPAd() {
        i1O0OXO1O.OXO1.OXO1("initADPAd");
        ADPAppOpenAdManager r0 = ADPAppOpenAdManager.INSTANCE;
        r0.setShowAdCompleteListener(new OXO1(this));
        View r1 = findViewById(R.id.splash_container);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        String r2 = getString(R.string.adp_unit_open);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.loadAd(this, (ViewGroup) r1, r2, new XIi00iiXO(this));
    }

    private final void initADPCAd() {
        i1O0OXO1O.OXO1.OXO1("initADPCAd");
        ADPCAppOpenAdManager r0 = ADPCAppOpenAdManager.INSTANCE;
        r0.setShowAdCompleteListener(new iO(this));
        View r1 = findViewById(R.id.splash_container);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        String r2 = getString(R.string.adpc_unit_open);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.loadAd(this, (ViewGroup) r1, r2, new XO0O10(this));
    }

    private final boolean saveDisplayAd() {
        String r0 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        a01 r1 = a01.OXO1;
        if (Intrinsics.XOO0ii0(r1.OXO1().getString(b01.I1Ii, ""), r0) == false) goto L5;
        this.openCountToday = getDisplayAdNumber() + 1;
        r1.OXO1().put(b01.OXXO0O1X, this.openCountToday);
    L6:
        return true;
    L5:
        r1.OXO1().put(b01.I1Ii, r0);
        this.openCountToday = 1;
        r1.OXO1().put(b01.OXXO0O1X, this.openCountToday);
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        transparentStatusBar();
        setNavBarVisibility(false);
        a01 r0 = a01.OXO1;
        r0.IiI10X().put(b01.I1, true);
        r0.IiI10X().put(b01.iOOX010X, true);
        i72 r1 = i72.OXO1;
        r1.iO();
        r1.XO0O10();
        r1.OIi0();
        View r2 = findViewById(R.id.launcher_gif);
        if (r2 != null) goto L7;
        delayGo(r1.iI());
        return;
    L7:
        if ((r2 instanceof GifImageView) == false) goto L11;
        ((GifImageView) r2).setOnPlayListener(new O00(this));
        return;
    L11:
        if ((r2 instanceof ImageView) == false) goto L14;
        GifUtils.OXO1.OXO1(this, Integer.valueOf(X1OOO.OXO1(this, "launcher", "raw", R.drawable.launcher_image)), 1, (ImageView) r2, new IiI10X(this));
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_launcher;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r3) {
        i72 r0 = i72.OXO1;
        r0.I0iXXO();
        r0.IiI10X();
        r0.OIX0iXi();
        r0.O00();
        r0.IO();
        super.onCreate(r3);
        int r4 = getDisplayAdNumber();
        this.openCountToday = r4;
        if (r4 <= 3) goto L5;
        return;
    L5:
        if (r0.O1iXiI() == false) goto L9;
        initADPCAd();
        return;
    L9:
        if (r0.I0XXi0X() == false) goto L13;
        initADPAd();
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i72 r0 = i72.OXO1;
        if (r0.O1iXiI() == false) goto L7;
        ADPCAppOpenAdManager.INSTANCE.destroy();
        return;
    L7:
        if (r0.I0XXi0X() == false) goto L10;
        ADPAppOpenAdManager.INSTANCE.destroy();
        return;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, @tb1 KeyEvent r3) {
        if (r2 != 3) goto L5;
        return true;
    L5:
        if (r2 != 4) goto L7;
        return true;
    L7:
        return super.onKeyDown(r2, r3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i72 r0 = i72.OXO1;
        if (r0.O1iXiI() == false) goto L7;
        ADPCAppOpenAdManager.INSTANCE.setLeftActivity(true);
        return;
    L7:
        if (r0.I0XXi0X() == false) goto L10;
        ADPAppOpenAdManager.INSTANCE.setLeftActivity(true);
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i72 r0 = i72.OXO1;
        if (r0.O1iXiI() == false) goto L12;
        ADPCAppOpenAdManager r1 = ADPCAppOpenAdManager.INSTANCE;
        if (r1.isClicked() == false) goto L7;
    L8:
        go();
    L9:
        r1.setLeftActivity(false);
        return;
    L7:
        if (r1.isAdDismiss() == false) goto L9;
    L12:
        if (r0.I0XXi0X() == false) goto L20;
        ADPAppOpenAdManager r2 = ADPAppOpenAdManager.INSTANCE;
        if (r2.isClicked() == false) goto L16;
    L17:
        go();
    L18:
        r2.setLeftActivity(false);
        return;
    L16:
        if (r2.isAdDismiss() == false) goto L18;
    }
}
