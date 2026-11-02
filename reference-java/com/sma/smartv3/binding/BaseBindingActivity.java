package com.sma.smartv3.binding;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oq5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.binding.BaseBindingActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import skin.support.app.SkinCompatActivity;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseBindingActivity<VB extends ViewBinding> extends SkinCompatActivity {
    protected VB binding;

    @tb1
    private String mArg0;
    private int mArg1 = -1;

    @tb1
    private Parcelable mArg2;

    @tb1
    private Serializable mArg3;

    private final void addFakeSystemBars() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        new View(this).setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getStatusBarHeight()));
        View view = new View(this);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getNavBarHeight()));
        linearLayout.removeView(getBinding().getRoot());
        linearLayout.addView(getBinding().getRoot(), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout.addView(view);
        setContentView(linearLayout);
    }

    private final void initIntentBundle() {
        this.mArg0 = getIntent().getStringExtra("mArg0");
        this.mArg1 = getIntent().getIntExtra("mArg1", -1);
        this.mArg2 = getIntent().getParcelableExtra("mArg2");
        this.mArg3 = getIntent().getSerializableExtra("mArg3");
    }

    public static /* synthetic */ void setStatusBar$default(BaseBindingActivity baseBindingActivity, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBar");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        baseBindingActivity.setStatusBar(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat setStatusBar$lambda$0(BaseBindingActivity baseBindingActivity, int i, boolean z, View view, WindowInsetsCompat insets) {
        Intrinsics.X0O(view, "view");
        Intrinsics.X0O(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.O10IXXX0X(insets2, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), insets2.top, view.getPaddingRight(), view.getPaddingBottom());
        baseBindingActivity.getWindow().setStatusBarColor(ContextCompat.getColor(baseBindingActivity, i));
        new WindowInsetsControllerCompat(baseBindingActivity.getWindow(), baseBindingActivity.getWindow().getDecorView()).setAppearanceLightStatusBars(z);
        return insets;
    }

    public static /* synthetic */ ViewModel simpleVM$default(BaseBindingActivity baseBindingActivity, AppCompatActivity appCompatActivity, ViewModelProvider.Factory factory, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: simpleVM");
        }
        if ((i & 1) != 0) {
            factory = null;
        }
        Intrinsics.X0O(appCompatActivity, "<this>");
        if (factory == null) {
            ViewModelProvider viewModelProvider = new ViewModelProvider(appCompatActivity);
            Intrinsics.m39537OX(4, "T");
            return viewModelProvider.get(ViewModel.class);
        }
        ViewModelProvider viewModelProvider2 = new ViewModelProvider(appCompatActivity, factory);
        Intrinsics.m39537OX(4, "T");
        return viewModelProvider2.get(ViewModel.class);
    }

    @aa1
    public final VB getBinding() {
        VB vb = this.binding;
        if (vb != null) {
            return vb;
        }
        Intrinsics.XXO("binding");
        return null;
    }

    @tb1
    public final String getMArg0() {
        return this.mArg0;
    }

    public final int getMArg1() {
        return this.mArg1;
    }

    @tb1
    public final Parcelable getMArg2() {
        return this.mArg2;
    }

    @tb1
    public final Serializable getMArg3() {
        return this.mArg3;
    }

    @aa1
    public abstract VB inflateBinding(@aa1 LayoutInflater layoutInflater);

    @Override // skin.support.app.SkinCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.O10IXXX0X(layoutInflater, "getLayoutInflater(...)");
        setBinding(inflateBinding(layoutInflater));
        initIntentBundle();
        addFakeSystemBars();
        setStatusBar$default(this, R.color.statusBarColor, false, 2, null);
        oq5.OXO1.XOO0ii0(this);
        onViewCreated();
    }

    public abstract void onViewCreated();

    public final void setBinding(@aa1 VB vb) {
        Intrinsics.X0O(vb, "<set-?>");
        this.binding = vb;
    }

    public final void setMArg0(@tb1 String str) {
        this.mArg0 = str;
    }

    public final void setMArg1(int i) {
        this.mArg1 = i;
    }

    public final void setMArg2(@tb1 Parcelable parcelable) {
        this.mArg2 = parcelable;
    }

    public final void setMArg3(@tb1 Serializable serializable) {
        this.mArg3 = serializable;
    }

    public final void setStatusBar(final int i, final boolean z) {
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ViewCompat.setOnApplyWindowInsetsListener(getBinding().getRoot(), new OnApplyWindowInsetsListener() { // from class: com.android.mltcode.paycertificationapi.i1i1XOiI
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return BaseBindingActivity.setStatusBar$lambda$0(this.OXO1, i, z, view, windowInsetsCompat);
            }
        });
    }

    public final /* synthetic */ <T extends ViewModel> T simpleVM(AppCompatActivity appCompatActivity, ViewModelProvider.Factory factory) {
        Intrinsics.X0O(appCompatActivity, "<this>");
        if (factory == null) {
            ViewModelProvider viewModelProvider = new ViewModelProvider(appCompatActivity);
            Intrinsics.m39537OX(4, "T");
            return (T) viewModelProvider.get(ViewModel.class);
        }
        ViewModelProvider viewModelProvider2 = new ViewModelProvider(appCompatActivity, factory);
        Intrinsics.m39537OX(4, "T");
        return (T) viewModelProvider2.get(ViewModel.class);
    }
}
