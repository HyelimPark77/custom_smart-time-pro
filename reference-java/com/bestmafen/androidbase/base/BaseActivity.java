package com.bestmafen.androidbase.base;

import android.R;
import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.SkinAppCompatDelegateImpl;
import androidx.core.graphics.ColorUtils;
import com.android.mltcode.paycertificationapi.InterfaceC2603k5;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ek4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.C4238R;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,376:1\n256#2,2:377\n256#2,2:379\n256#2,2:381\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n*L\n303#1:377,2\n311#1:379,2\n317#1:381,2\n*E\n"})
public abstract class BaseActivity extends AppCompatActivity implements InterfaceC2603k5 {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static int DEFAULT_NAV_BAR_COLOR = 0;
    private static int DEFAULT_TOP_BAR_COLOR = 0;

    @aa1
    public static final String SCREEN_ORIENTATION_PORTRAIT = "screen_orientation_portrait";
    public static final int STYLE_FULL_WITHOUT_STATUS = 2;
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_TRANSLUCENT_STATUS = 1;

    @tb1
    private View fakeNavBar;

    @tb1
    private View fakeStatusBar;

    @tb1
    private String mArg0;

    @tb1
    private Parcelable mArg2;

    @tb1
    private Serializable mArg3;
    protected Activity mContext;
    private final int mStatusStyle;
    private final int mTitleId = -1;
    private int mArg1 = -1;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int OXO1() {
            return BaseActivity.DEFAULT_NAV_BAR_COLOR;
        }

        public final int XIi00iiXO() {
            return BaseActivity.DEFAULT_TOP_BAR_COLOR;
        }

        public final void XO0O10(int i) {
            BaseActivity.DEFAULT_TOP_BAR_COLOR = i;
        }

        /* JADX INFO: renamed from: iO */
        public final void m11114iO(int i) {
            BaseActivity.DEFAULT_NAV_BAR_COLOR = i;
        }

        public OXO1() {
        }
    }

    private final void addFakeSystemBars() {
        View viewBindView;
        if (layoutId() == -1) {
            viewBindView = bindView();
        } else {
            View viewInflate = getLayoutInflater().inflate(layoutId(), (ViewGroup) null);
            Intrinsics.X1ii(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewBindView = (ViewGroup) viewInflate;
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View view = new View(this);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getStatusBarHeight()));
        this.fakeStatusBar = view;
        View view2 = new View(this);
        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getNavBarHeight()));
        this.fakeNavBar = view2;
        linearLayout.addView(this.fakeStatusBar);
        linearLayout.addView(viewBindView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(this.fakeNavBar);
        setContentView(linearLayout);
    }

    public final void addBackPressedDispatcher() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.bestmafen.androidbase.base.BaseActivity.addBackPressedDispatcher.1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                BaseActivity.this.onHandleBackPressed();
            }
        });
    }

    @aa1
    public View bindView() {
        return new View(this);
    }

    public final void disableOrientation() {
        setRequestedOrientation(getResources().getConfiguration().orientation == 2 ? 0 : 1);
    }

    public final void enableOrientation() {
        setRequestedOrientation(SPUtils.getInstance().getBoolean(SCREEN_ORIENTATION_PORTRAIT, true) ? 1 : -1);
    }

    public final int getColor() {
        int i = DEFAULT_TOP_BAR_COLOR;
        if (i != 0 && i == 1) {
            return C4238R.color.elie_statusBarColor;
        }
        return C4238R.color.navBarColor;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    @aa1
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate appCompatDelegate = SkinAppCompatDelegateImpl.get(this, this);
        Intrinsics.O10IXXX0X(appCompatDelegate, "get(...)");
        return appCompatDelegate;
    }

    @tb1
    public final View getFakeStatusBar() {
        return this.fakeStatusBar;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @tb1
    public String getMArg0() {
        return this.mArg0;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int getMArg1() {
        return this.mArg1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @tb1
    public Parcelable getMArg2() {
        return this.mArg2;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @tb1
    public Serializable getMArg3() {
        return this.mArg3;
    }

    @aa1
    public final Activity getMContext() {
        Activity activity = this.mContext;
        if (activity != null) {
            return activity;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    public int getMStatusStyle() {
        return this.mStatusStyle;
    }

    public int getMTitleId() {
        return this.mTitleId;
    }

    public final int getNavColor() {
        int i = DEFAULT_NAV_BAR_COLOR;
        if (i != 0 && i == 1) {
            return C4238R.color.elie_statusBarColor;
        }
        return C4238R.color.statusBarColor;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return false;
    }

    public final boolean isEnableEdgeToEdge() {
        ApplicationInfo applicationInfo = getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo;
        return (applicationInfo != null ? applicationInfo.targetSdkVersion : 0) >= 35 && Build.VERSION.SDK_INT >= 35;
    }

    public final boolean isLightColor(@ColorInt int i) {
        return ColorUtils.calculateLuminance(i) > 0.5d;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getMStatusStyle() == 1) {
            Window window = getWindow();
            window.addFlags(67108864);
            ((ViewGroup) window.getDecorView().findViewById(R.id.content)).getChildAt(0).setFitsSystemWindows(false);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        View viewFindViewById;
        super.onCreate(bundle);
        enableOrientation();
        setMContext(this);
        setMArg0(getIntent().getStringExtra("mArg0"));
        setMArg1(getIntent().getIntExtra("mArg1", -1));
        setMArg2(getIntent().getParcelableExtra("mArg2"));
        setMArg3(getIntent().getSerializableExtra("mArg3"));
        if (initEvent()) {
            O11XO1X.XO0O10().X1ii(this);
        }
        init(bundle);
        if (isEnableEdgeToEdge()) {
            addFakeSystemBars();
            setTheme();
        } else {
            setTheme();
            if (layoutId() == -1) {
                setContentView(bindView());
            } else {
                setContentView(layoutId());
            }
        }
        if (getMTitleId() != -1 && (viewFindViewById = findViewById(getMTitleId())) != null) {
            ah6.OXO1(viewFindViewById);
        }
        initView();
        addBackPressedDispatcher();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (initEvent()) {
            O11XO1X.XO0O10().OiIIX101O(this);
        }
        super.onDestroy();
    }

    public void onHandleBackPressed() {
        finish();
    }

    public final void setFakeStatusBar(@tb1 View view) {
        this.fakeStatusBar = view;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg0(@tb1 String str) {
        this.mArg0 = str;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg1(int i) {
        this.mArg1 = i;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg2(@tb1 Parcelable parcelable) {
        this.mArg2 = parcelable;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void setMArg3(@tb1 Serializable serializable) {
        this.mArg3 = serializable;
    }

    public final void setMContext(@aa1 Activity activity) {
        Intrinsics.X0O(activity, "<set-?>");
        this.mContext = activity;
    }

    public final void setNavBarColor(@aa1 Activity activity, int i) {
        View view;
        Intrinsics.X0O(activity, "activity");
        if (isEnableEdgeToEdge() && (view = this.fakeNavBar) != null) {
            view.setBackgroundColor(i);
        }
        BarUtils.setNavBarColor(activity, i);
        if (isLightColor(i)) {
            BarUtils.setNavBarLightMode(activity, true);
        } else {
            BarUtils.setNavBarLightMode(activity, false);
        }
    }

    public final void setNavBarVisibility(boolean z) {
        View view;
        if (isEnableEdgeToEdge() && (view = this.fakeNavBar) != null) {
            view.setVisibility(8);
        }
        BarUtils.setNavBarVisibility(this, z);
    }

    public final void setStatusBarColor(@aa1 Activity activity, int i) {
        Intrinsics.X0O(activity, "activity");
        if (isEnableEdgeToEdge()) {
            View view = this.fakeStatusBar;
            if (view != null) {
                view.setBackgroundColor(i);
            }
        } else {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
        if (isLightColor(i)) {
            BarUtils.setStatusBarLightMode(activity, true);
        } else {
            BarUtils.setStatusBarLightMode(activity, false);
        }
    }

    public final void setTheme() {
        if (ek4.IIX1OXO() == null) {
            return;
        }
        Log.i(b01.X0O, "" + SPUtils.getInstance().getInt(b01.X0O, 0));
        int i = SPUtils.getInstance().getInt(b01.X0O, 0);
        if (i != 0) {
            if (i == 1) {
                ek4.IIX1OXO().O1O();
            } else if (i == 2) {
                ek4.IIX1OXO().iOO1ii1("light", null, 1);
            } else if (i == 3) {
                ek4.IIX1OXO().iOO1ii1("brown_black", null, 1);
            }
        } else if (Build.VERSION.SDK_INT < 28) {
            ek4.IIX1OXO().O1O();
        } else if (SPUtils.getInstance().getInt(b01.X0O, 0) == 0) {
            int i2 = getResources().getConfiguration().uiMode & 48;
            if (i2 == 16) {
                ek4.IIX1OXO().iOO1ii1("light", null, 1);
            } else if (i2 == 32) {
                ek4.IIX1OXO().O1O();
            }
        }
        setStatusBarColor(this, gk4.m1859iO(getMContext(), getColor()));
        setNavBarColor(this, gk4.m1859iO(getMContext(), getNavColor()));
    }

    public final void transparentNavBar() {
        View view;
        if (!isEnableEdgeToEdge() || (view = this.fakeNavBar) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void transparentStatusBar() {
        if (!isEnableEdgeToEdge()) {
            BarUtils.transparentStatusBar(this);
            return;
        }
        View view = this.fakeStatusBar;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
