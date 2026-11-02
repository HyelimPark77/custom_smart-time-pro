package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
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
    private final int layoutId = R.layout.activity_app_guide;
    protected Activity mContext;

    private final void addFakeSystemBars() {
        View childAt = ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        ViewParent parent = childAt.getParent();
        Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int iIndexOfChild = viewGroup.indexOfChild(childAt);
        viewGroup.removeView(childAt);
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
        linearLayout.addView(childAt, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(this.fakeNavBar);
        viewGroup.addView(linearLayout, iIndexOfChild);
    }

    private final void setStatusBarColor(Activity activity, int i) {
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

    public final void addBackPressedDispatcher() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.sma.smartv3.ui.device.guide.BaseAppGuideActivity.addBackPressedDispatcher.1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                BaseAppGuideActivity.this.onHandleBackPressed();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    @aa1
    public AppCompatDelegate getDelegate() {
        AppCompatDelegate appCompatDelegate = SkinAppCompatDelegateImpl.get(this, this);
        Intrinsics.O10IXXX0X(appCompatDelegate, "get(...)");
        return appCompatDelegate;
    }

    @Override // com.github.appintro.AppIntro, com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
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

    public final boolean isEnableEdgeToEdge() {
        ApplicationInfo applicationInfo = getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo;
        return (applicationInfo != null ? applicationInfo.targetSdkVersion : 0) >= 35 && Build.VERSION.SDK_INT >= 35;
    }

    public final boolean isLightColor(@ColorInt int i) {
        return ColorUtils.calculateLuminance(i) > 0.5d;
    }

    @Override // com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        if (SPUtils.getInstance().getBoolean(BaseActivity.SCREEN_ORIENTATION_PORTRAIT, true)) {
            setRequestedOrientation(1);
        }
        setMContext(this);
        if (isEnableEdgeToEdge()) {
            addFakeSystemBars();
        }
        setTheme();
        addBackPressedDispatcher();
    }

    public void onHandleBackPressed() {
        finish();
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

    public final void setSwipe(boolean z) {
        setSwipeLock(!z);
    }

    public final void setTheme() {
        if (ek4.IIX1OXO() == null) {
            return;
        }
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
        setStatusBarColor(this, gk4.m1859iO(getMContext(), R.color.statusBarColor));
        setNavBarColor(this, gk4.m1859iO(getMContext(), R.color.navBarColor));
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
