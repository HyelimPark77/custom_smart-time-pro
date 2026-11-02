package com.bestmafen.androidbase.base;

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
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.SkinAppCompatDelegateImpl;
import androidx.core.graphics.ColorUtils;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ah6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ek4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.k5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.R;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,376:1\n256#2,2:377\n256#2,2:379\n256#2,2:381\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/bestmafen/androidbase/base/BaseActivity\n*L\n303#1:377,2\n311#1:379,2\n317#1:381,2\n*E\n"})
public abstract class BaseActivity extends AppCompatActivity implements k5 {

    @aa1
    public static final OXO1 Companion = null;
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
    private int mArg1;

    @tb1
    private Parcelable mArg2;

    @tb1
    private Serializable mArg3;
    protected Activity mContext;
    private final int mStatusStyle;
    private final int mTitleId;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final int OXO1() {
            return BaseActivity.access$getDEFAULT_NAV_BAR_COLOR$cp();
        }

        public final int XIi00iiXO() {
            return BaseActivity.access$getDEFAULT_TOP_BAR_COLOR$cp();
        }

        public final void XO0O10(int r1) {
            BaseActivity.access$setDEFAULT_TOP_BAR_COLOR$cp(r1);
        }

        public final void iO(int r1) {
            BaseActivity.access$setDEFAULT_NAV_BAR_COLOR$cp(r1);
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public BaseActivity() {
        this.mTitleId = -1;
        this.mArg1 = -1;
    }

    public static final /* synthetic */ int access$getDEFAULT_NAV_BAR_COLOR$cp() {
        return DEFAULT_NAV_BAR_COLOR;
    }

    public static final /* synthetic */ int access$getDEFAULT_TOP_BAR_COLOR$cp() {
        return DEFAULT_TOP_BAR_COLOR;
    }

    public static final /* synthetic */ void access$setDEFAULT_NAV_BAR_COLOR$cp(int r0) {
        DEFAULT_NAV_BAR_COLOR = r0;
    }

    public static final /* synthetic */ void access$setDEFAULT_TOP_BAR_COLOR$cp(int r0) {
        DEFAULT_TOP_BAR_COLOR = r0;
    }

    private final void addFakeSystemBars() {
        if (layoutId() != (-1)) goto L5;
        View r0 = bindView();
    L6:
        LinearLayout r2 = new LinearLayout(this);
        r2.setOrientation(1);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View r3 = new View(this);
        r3.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getStatusBarHeight()));
        this.fakeStatusBar = r3;
        View r4 = new View(this);
        r4.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getNavBarHeight()));
        this.fakeNavBar = r4;
        r2.addView(this.fakeStatusBar);
        r2.addView(r0, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        r2.addView(this.fakeNavBar);
        setContentView(r2);
        return;
    L5:
        View r1 = getLayoutInflater().inflate(layoutId(), null);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.view.ViewGroup");
        r0 = (ViewGroup) r1;
        goto L6
    }

    public final void addBackPressedDispatcher() {
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(this));
    }

    @aa1
    public View bindView() {
        return new View(this);
    }

    public final void disableOrientation() {
        if (getResources().getConfiguration().orientation != 2) goto L5;
        int r0 = 0;
    L6:
        setRequestedOrientation(r0);
        return;
    L5:
        r0 = 1;
        goto L6
    }

    public final void enableOrientation() {
        int r2 = 1;
        if (SPUtils.getInstance().getBoolean(SCREEN_ORIENTATION_PORTRAIT, true) == true) goto L6;
        r2 = -1;
    L6:
        setRequestedOrientation(r2);
    }

    public final int getColor() {
        int r0 = DEFAULT_TOP_BAR_COLOR;
        if (r0 == 0) goto L11;
        if (r0 == 1) goto L9;
        return R.color.navBarColor;
    L9:
        return R.color.elie_statusBarColor;
    L11:
        return R.color.navBarColor;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    @aa1
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate r0 = SkinAppCompatDelegateImpl.get(this, this);
        Intrinsics.O10IXXX0X(r0, "get(...)");
        return r0;
    }

    @tb1
    public final View getFakeStatusBar() {
        return this.fakeStatusBar;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @tb1
    public String getMArg0() {
        return this.mArg0;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int getMArg1() {
        return this.mArg1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @tb1
    public Parcelable getMArg2() {
        return this.mArg2;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @tb1
    public Serializable getMArg3() {
        return this.mArg3;
    }

    @aa1
    public final Activity getMContext() {
        Activity r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
        int r0 = DEFAULT_NAV_BAR_COLOR;
        if (r0 == 0) goto L11;
        if (r0 == 1) goto L9;
        return R.color.statusBarColor;
    L9:
        return R.color.elie_statusBarColor;
    L11:
        return R.color.statusBarColor;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return false;
    }

    public final boolean isEnableEdgeToEdge() {
        ApplicationInfo r0 = getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo;
        if (r0 == null) goto L5;
        int r1 = r0.targetSdkVersion;
    L7:
        if (r1 >= 35) goto L10;
        return false;
    L10:
        if (Build.VERSION.SDK_INT < 35) goto L13;
        return true;
    L13:
        return false;
    L5:
        r1 = 0;
        goto L7
    }

    public final boolean isLightColor(@ColorInt int r5) {
        if (ColorUtils.calculateLuminance(r5) <= 0.5d) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getMStatusStyle() != 1) goto L6;
        Window r0 = getWindow();
        r0.addFlags(67108864);
        ((ViewGroup) r0.getDecorView().findViewById(android.R.id.content)).getChildAt(0).setFitsSystemWindows(false);
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r4) {
        super.onCreate(r4);
        enableOrientation();
        setMContext(this);
        setMArg0(getIntent().getStringExtra("mArg0"));
        setMArg1(getIntent().getIntExtra("mArg1", -1));
        setMArg2(getIntent().getParcelableExtra("mArg2"));
        setMArg3(getIntent().getSerializableExtra("mArg3"));
        if (initEvent() == false) goto L5;
        O11XO1X.XO0O10().X1ii(this);
    L5:
        init(r4);
        if (isEnableEdgeToEdge() == false) goto L8;
        addFakeSystemBars();
        setTheme();
    L13:
        if (getMTitleId() == (-1)) goto L17;
        View r5 = findViewById(getMTitleId());
        if (r5 == null) goto L17;
        ah6.OXO1(r5);
    L17:
        initView();
        addBackPressedDispatcher();
        return;
    L8:
        setTheme();
        if (layoutId() != (-1)) goto L11;
        setContentView(bindView());
        goto L13
    L11:
        setContentView(layoutId());
        goto L13
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (initEvent() == false) goto L5;
        O11XO1X.XO0O10().OiIIX101O(this);
    L5:
        super.onDestroy();
    }

    public void onHandleBackPressed() {
        finish();
    }

    public final void setFakeStatusBar(@tb1 View r1) {
        this.fakeStatusBar = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg0(@tb1 String r1) {
        this.mArg0 = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg1(int r1) {
        this.mArg1 = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg2(@tb1 Parcelable r1) {
        this.mArg2 = r1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void setMArg3(@tb1 Serializable r1) {
        this.mArg3 = r1;
    }

    public final void setMContext(@aa1 Activity r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setNavBarColor(@aa1 Activity r2, int r3) {
        Intrinsics.X0O(r2, "activity");
        if (isEnableEdgeToEdge() == false) goto L7;
        View r0 = this.fakeNavBar;
        if (r0 == null) goto L7;
        r0.setBackgroundColor(r3);
    L7:
        BarUtils.setNavBarColor(r2, r3);
        if (isLightColor(r3) == false) goto L11;
        BarUtils.setNavBarLightMode(r2, true);
        return;
    L11:
        BarUtils.setNavBarLightMode(r2, false);
    }

    public final void setNavBarVisibility(boolean r3) {
        if (isEnableEdgeToEdge() == false) goto L7;
        View r0 = this.fakeNavBar;
        if (r0 == null) goto L7;
        r0.setVisibility(8);
    L7:
        BarUtils.setNavBarVisibility(this, r3);
    }

    public final void setStatusBarColor(@aa1 Activity r3, int r4) {
        Intrinsics.X0O(r3, "activity");
        if (isEnableEdgeToEdge() == false) goto L7;
        View r0 = this.fakeStatusBar;
        if (r0 == null) goto L9;
        r0.setBackgroundColor(r4);
    L9:
        if (isLightColor(r4) == false) goto L12;
        BarUtils.setStatusBarLightMode(r3, true);
        return;
    L12:
        BarUtils.setStatusBarLightMode(r3, false);
        return;
    L7:
        Window r1 = r3.getWindow();
        r1.clearFlags(67108864);
        r1.addFlags(Integer.MIN_VALUE);
        r1.setStatusBarColor(r4);
        goto L9
    }

    public final void setTheme() {
        if (ek4.IIX1OXO() != null) goto L5;
        return;
    L5:
        Log.i(b01.X0O, "" + SPUtils.getInstance().getInt(b01.X0O, 0));
        int r0 = SPUtils.getInstance().getInt(b01.X0O, 0);
        if (r0 == 0) goto L17;
        if (r0 != 1) goto L9;
        ek4.IIX1OXO().O1O();
    L28:
        setStatusBarColor(this, gk4.iO(getMContext(), getColor()));
        setNavBarColor(this, gk4.iO(getMContext(), getNavColor()));
        return;
    L9:
        if (r0 != 2) goto L11;
        ek4.IIX1OXO().iOO1ii1("light", null, 1);
        goto L28
    L11:
        if (r0 != 3) goto L28;
        ek4.IIX1OXO().iOO1ii1("brown_black", null, 1);
        goto L28
    L17:
        if (Build.VERSION.SDK_INT >= 28) goto L19;
        ek4.IIX1OXO().O1O();
        goto L28
    L19:
        if (SPUtils.getInstance().getInt(b01.X0O, 0) != 0) goto L28;
        int r1 = getResources().getConfiguration().uiMode & 48;
        if (r1 != 16) goto L23;
        ek4.IIX1OXO().iOO1ii1("light", null, 1);
        goto L28
    L23:
        if (r1 != 32) goto L28;
        ek4.IIX1OXO().O1O();
        goto L28
    }

    public final void transparentNavBar() {
        if (isEnableEdgeToEdge() == false) goto L8;
        View r0 = this.fakeNavBar;
        if (r0 == null) goto L9;
        r0.setVisibility(8);
        return;
    L9:
        return;
    }

    public final void transparentStatusBar() {
        if (isEnableEdgeToEdge() == false) goto L8;
        View r0 = this.fakeStatusBar;
        if (r0 == null) goto L10;
        r0.setVisibility(8);
        return;
    L10:
        return;
    L8:
        BarUtils.transparentStatusBar(this);
    }
}
