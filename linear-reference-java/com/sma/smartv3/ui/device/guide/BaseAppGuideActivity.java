package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.SkinAppCompatDelegateImpl;
import androidx.core.graphics.ColorUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ek4;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import com.github.appintro.AppIntro;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nBaseAppGuideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/BaseAppGuideActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,242:1\n257#2,2:243\n257#2,2:245\n257#2,2:247\n*S KotlinDebug\n*F\n+ 1 BaseAppGuideActivity.kt\ncom/sma/smartv3/ui/device/guide/BaseAppGuideActivity\n*L\n161#1:243,2\n169#1:245,2\n175#1:247,2\n*E\n"})
public abstract class BaseAppGuideActivity extends AppIntro {

    @tb1
    private View fakeNavBar;

    @tb1
    private View fakeStatusBar;
    private final int layoutId;
    protected Activity mContext;

    public BaseAppGuideActivity() {
        this.layoutId = R.layout.activity_app_guide;
    }

    private final void addFakeSystemBars() {
        View r0 = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        ViewParent r2 = r0.getParent();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup r3 = (ViewGroup) r2;
        int r4 = r3.indexOfChild(r0);
        r3.removeView(r0);
        LinearLayout r5 = new LinearLayout(this);
        r5.setOrientation(1);
        r5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View r6 = new View(this);
        r6.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getStatusBarHeight()));
        this.fakeStatusBar = r6;
        View r7 = new View(this);
        r7.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getNavBarHeight()));
        this.fakeNavBar = r7;
        r5.addView(this.fakeStatusBar);
        r5.addView(r0, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        r5.addView(this.fakeNavBar);
        r3.addView(r5, r4);
    }

    private final void setStatusBarColor(Activity r3, int r4) {
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

    public final void addBackPressedDispatcher() {
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    @aa1
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate r0 = SkinAppCompatDelegateImpl.get(this, this);
        Intrinsics.O10IXXX0X(r0, "get(...)");
        return r0;
    }

    @Override // com.github.appintro.AppIntro, com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
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

    @Override // com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r3) {
        super.onCreate(r3);
        if (SPUtils.getInstance().getBoolean(BaseActivity.SCREEN_ORIENTATION_PORTRAIT, true) == false) goto L5;
        setRequestedOrientation(1);
    L5:
        setMContext(this);
        if (isEnableEdgeToEdge() == false) goto L8;
        addFakeSystemBars();
    L8:
        setTheme();
        addBackPressedDispatcher();
    }

    public void onHandleBackPressed() {
        finish();
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

    public final void setSwipe(boolean r1) {
        setSwipeLock(!r1);
    }

    public final void setTheme() {
        if (ek4.IIX1OXO() != null) goto L5;
        return;
    L5:
        int r0 = SPUtils.getInstance().getInt(b01.X0O, 0);
        if (r0 == 0) goto L17;
        if (r0 != 1) goto L9;
        ek4.IIX1OXO().O1O();
    L28:
        setStatusBarColor(this, gk4.iO(getMContext(), R.color.statusBarColor));
        setNavBarColor(this, gk4.iO(getMContext(), R.color.navBarColor));
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
