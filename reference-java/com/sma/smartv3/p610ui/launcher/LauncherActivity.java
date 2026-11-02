package com.sma.smartv3.p610ui.launcher;

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
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.biz.ad.ADPCAppOpenAdManager;
import com.sma.smartv3.biz.ad.OnShowADPCAdCompleteListener;
import com.sma.smartv3.biz.p242ad.ADPAdListener;
import com.sma.smartv3.biz.p242ad.ADPAppOpenAdManager;
import com.sma.smartv3.biz.p242ad.OnShowADPAdCompleteListener;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p610ui.launcher.LauncherActivity;
import com.sma.smartv3.p610ui.main.MainActivity;
import com.sma.smartv3.pro.R;
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
        public IiI10X() {
        }

        @Override // com.sma.smartv3.util.GifUtils.OXO1
        public void OXO1() {
            LauncherActivity.this.delayGo(i72.OXO1.m2055iI());
        }
    }

    public static final class O00 implements GifImageView.OXO1 {
        public O00() {
        }

        @Override // com.sma.smartv3.view.GifImageView.OXO1
        public void OXO1() {
            LauncherActivity.this.delayGo(i72.OXO1.m2055iI());
        }
    }

    public static final class OXO1 implements OnShowADPAdCompleteListener {
        public OXO1() {
        }

        @Override // com.sma.smartv3.biz.p242ad.OnShowADPAdCompleteListener
        public void onShowAdComplete() {
            LauncherActivity.this.m38490go();
        }
    }

    public static final class XIi00iiXO extends ADPAdListener {
        public XIi00iiXO() {
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdClicked(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            if (q62.OXO1.XXXiXXOI()) {
                StatManager.OXO1.XIi00iiXO(19, adUnitId);
            }
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdOpen(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            LauncherActivity.this.saveDisplayAd();
            if (q62.OXO1.XXXiXXOI()) {
                StatManager.OXO1.XIi00iiXO(18, adUnitId);
            }
        }
    }

    public static final class XO0O10 extends ADPCAdListener {
        public XO0O10() {
        }

        public void onADClicked(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            if (q62.OXO1.XXXiXXOI()) {
                StatManager.OXO1.XIi00iiXO(19, adUnitId);
            }
        }

        public void onADPresent(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            LauncherActivity.this.saveDisplayAd();
            if (q62.OXO1.XXXiXXOI()) {
                StatManager.OXO1.XIi00iiXO(18, adUnitId);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.launcher.LauncherActivity$iO */
    public static final class C18836iO implements OnShowADPCAdCompleteListener {
        public C18836iO() {
        }

        public void onShowAdComplete() {
            LauncherActivity.this.m38490go();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delayGo(long j) {
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.wk
            @Override // java.lang.Runnable
            public final void run() {
                LauncherActivity.delayGo$lambda$0(this.f11963IO);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayGo$lambda$0(LauncherActivity launcherActivity) {
        i72 i72Var = i72.OXO1;
        if (i72Var.O1iXiI()) {
            ADPCAppOpenAdManager aDPCAppOpenAdManager = ADPCAppOpenAdManager.INSTANCE;
            if (aDPCAppOpenAdManager.isShowingAd() || aDPCAppOpenAdManager.isLeftActivity()) {
                return;
            }
            launcherActivity.m38490go();
            return;
        }
        if (!i72Var.I0XXi0X()) {
            launcherActivity.m38490go();
            return;
        }
        ADPAppOpenAdManager aDPAppOpenAdManager = ADPAppOpenAdManager.INSTANCE;
        if (aDPAppOpenAdManager.isShowingAd() || aDPAppOpenAdManager.isLeftActivity()) {
            return;
        }
        launcherActivity.m38490go();
    }

    private final int getDisplayAdNumber() {
        return a01.OXO1.OXO1().getInt(b01.OXXO0O1X, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: go */
    public final void m38490go() {
        a01 a01Var = a01.OXO1;
        if (a01Var.IiI10X().getBoolean(b01.O001I, true)) {
            SPUtils sPUtilsIiI10X = a01Var.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            if (((AppUser) appUser).getIdentity().length() == 0) {
                startActivity(new Intent(this, (Class<?>) GuideActivity.class));
            } else {
                startActivity(new Intent(this, (Class<?>) MainActivity.class));
            }
        } else {
            startActivity(new Intent(this, (Class<?>) MainActivity.class));
        }
        finish();
    }

    private final void initADPAd() {
        i1O0OXO1O.OXO1.OXO1("initADPAd");
        ADPAppOpenAdManager aDPAppOpenAdManager = ADPAppOpenAdManager.INSTANCE;
        aDPAppOpenAdManager.setShowAdCompleteListener(new OXO1());
        View viewFindViewById = findViewById(R.id.splash_container);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        String string = getString(R.string.adp_unit_open);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        aDPAppOpenAdManager.loadAd(this, (ViewGroup) viewFindViewById, string, new XIi00iiXO());
    }

    private final void initADPCAd() {
        i1O0OXO1O.OXO1.OXO1("initADPCAd");
        ADPCAppOpenAdManager aDPCAppOpenAdManager = ADPCAppOpenAdManager.INSTANCE;
        aDPCAppOpenAdManager.setShowAdCompleteListener(new C18836iO());
        View viewFindViewById = findViewById(R.id.splash_container);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        String string = getString(R.string.adpc_unit_open);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        aDPCAppOpenAdManager.loadAd(this, (ViewGroup) viewFindViewById, string, new XO0O10());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean saveDisplayAd() {
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
        a01 a01Var = a01.OXO1;
        if (Intrinsics.XOO0ii0(a01Var.OXO1().getString(b01.I1Ii, ""), str)) {
            this.openCountToday = getDisplayAdNumber() + 1;
            a01Var.OXO1().put(b01.OXXO0O1X, this.openCountToday);
        } else {
            a01Var.OXO1().put(b01.I1Ii, str);
            this.openCountToday = 1;
            a01Var.OXO1().put(b01.OXXO0O1X, this.openCountToday);
        }
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        transparentStatusBar();
        setNavBarVisibility(false);
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.f5624I1, true);
        a01Var.IiI10X().put(b01.iOOX010X, true);
        i72 i72Var = i72.OXO1;
        i72Var.m2056iO();
        i72Var.XO0O10();
        i72Var.OIi0();
        View viewFindViewById = findViewById(R.id.launcher_gif);
        if (viewFindViewById == null) {
            delayGo(i72Var.m2055iI());
        } else if (viewFindViewById instanceof GifImageView) {
            ((GifImageView) viewFindViewById).setOnPlayListener(new O00());
        } else if (viewFindViewById instanceof ImageView) {
            GifUtils.OXO1.OXO1(this, Integer.valueOf(X1OOO.OXO1(this, "launcher", "raw", R.drawable.launcher_image)), 1, (ImageView) viewFindViewById, new IiI10X());
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_launcher;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        i72 i72Var = i72.OXO1;
        i72Var.I0iXXO();
        i72Var.IiI10X();
        i72Var.OIX0iXi();
        i72Var.O00();
        i72Var.m2042IO();
        super.onCreate(bundle);
        int displayAdNumber = getDisplayAdNumber();
        this.openCountToday = displayAdNumber;
        if (displayAdNumber <= 3) {
            if (i72Var.O1iXiI()) {
                initADPCAd();
            } else if (i72Var.I0XXi0X()) {
                initADPAd();
            }
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i72 i72Var = i72.OXO1;
        if (i72Var.O1iXiI()) {
            ADPCAppOpenAdManager.INSTANCE.destroy();
        } else if (i72Var.I0XXi0X()) {
            ADPAppOpenAdManager.INSTANCE.destroy();
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @tb1 KeyEvent keyEvent) {
        if (i == 3 || i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i72 i72Var = i72.OXO1;
        if (i72Var.O1iXiI()) {
            ADPCAppOpenAdManager.INSTANCE.setLeftActivity(true);
        } else if (i72Var.I0XXi0X()) {
            ADPAppOpenAdManager.INSTANCE.setLeftActivity(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i72 i72Var = i72.OXO1;
        if (i72Var.O1iXiI()) {
            ADPCAppOpenAdManager aDPCAppOpenAdManager = ADPCAppOpenAdManager.INSTANCE;
            if (aDPCAppOpenAdManager.isClicked() || aDPCAppOpenAdManager.isAdDismiss()) {
                m38490go();
            }
            aDPCAppOpenAdManager.setLeftActivity(false);
            return;
        }
        if (i72Var.I0XXi0X()) {
            ADPAppOpenAdManager aDPAppOpenAdManager = ADPAppOpenAdManager.INSTANCE;
            if (aDPAppOpenAdManager.isClicked() || aDPAppOpenAdManager.isAdDismiss()) {
                m38490go();
            }
            aDPAppOpenAdManager.setLeftActivity(false);
        }
    }
}
