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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1i1XOiI;
import com.android.mltcode.paycertificationapi.oq5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.BarUtils;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import skin.support.app.SkinCompatActivity;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseBindingActivity<VB extends ViewBinding> extends SkinCompatActivity {
    protected VB binding;

    @tb1
    private String mArg0;
    private int mArg1;

    @tb1
    private Parcelable mArg2;

    @tb1
    private Serializable mArg3;

    public BaseBindingActivity() {
        this.mArg1 = -1;
    }

    public static /* synthetic */ WindowInsetsCompat OIX0iXi(BaseBindingActivity r0, int r1, boolean r2, View r3, WindowInsetsCompat r4) {
        return setStatusBar$lambda$0(r0, r1, r2, r3, r4);
    }

    private final void addFakeSystemBars() {
        LinearLayout r0 = new LinearLayout(this);
        r0.setOrientation(1);
        r0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        new View(this).setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getStatusBarHeight()));
        View r1 = new View(this);
        r1.setLayoutParams(new LinearLayout.LayoutParams(-1, BarUtils.getNavBarHeight()));
        r0.removeView(getBinding().getRoot());
        r0.addView(getBinding().getRoot(), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        r0.addView(r1);
        setContentView(r0);
    }

    private final void initIntentBundle() {
        this.mArg0 = getIntent().getStringExtra("mArg0");
        this.mArg1 = getIntent().getIntExtra("mArg1", -1);
        this.mArg2 = getIntent().getParcelableExtra("mArg2");
        this.mArg3 = getIntent().getSerializableExtra("mArg3");
    }

    public static /* synthetic */ void setStatusBar$default(BaseBindingActivity r0, int r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        r0.setStatusBar(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBar");
    }

    private static final WindowInsetsCompat setStatusBar$lambda$0(BaseBindingActivity r4, int r5, boolean r6, View r7, WindowInsetsCompat r8) {
        Intrinsics.X0O(r7, "view");
        Intrinsics.X0O(r8, "insets");
        Insets r0 = r8.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.O10IXXX0X(r0, "getInsets(...)");
        r7.setPadding(r7.getPaddingLeft(), r0.top, r7.getPaddingRight(), r7.getPaddingBottom());
        r4.getWindow().setStatusBarColor(ContextCompat.getColor(r4, r5));
        new WindowInsetsControllerCompat(r4.getWindow(), r4.getWindow().getDecorView()).setAppearanceLightStatusBars(r6);
        return r8;
    }

    public static /* synthetic */ ViewModel simpleVM$default(BaseBindingActivity r1, AppCompatActivity r2, ViewModelProvider.Factory r3, int r4, Object r5) {
        if (r5 != null) goto L13;
        if ((r4 & 1) == 0) goto L6;
        r3 = null;
    L6:
        Intrinsics.X0O(r2, "<this>");
        if (r3 != null) goto L10;
        ViewModelProvider r6 = new ViewModelProvider(r2);
        Intrinsics.OX(4, "T");
        return r6.get(ViewModel.class);
    L10:
        ViewModelProvider r0 = new ViewModelProvider(r2, r3);
        Intrinsics.OX(4, "T");
        return r0.get(ViewModel.class);
    L13:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: simpleVM");
    }

    @aa1
    public final VB getBinding() {
        VB r0 = this.binding;
        if (r0 == null) goto L5;
        return r0;
    L5:
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
    public abstract VB inflateBinding(@aa1 LayoutInflater r1);

    @Override // skin.support.app.SkinCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r4) {
        super.onCreate(r4);
        LayoutInflater r5 = getLayoutInflater();
        Intrinsics.O10IXXX0X(r5, "getLayoutInflater(...)");
        setBinding(inflateBinding(r5));
        initIntentBundle();
        addFakeSystemBars();
        setStatusBar$default(this, R.color.statusBarColor, false, 2, null);
        oq5.OXO1.XOO0ii0(this);
        onViewCreated();
    }

    public abstract void onViewCreated();

    public final void setBinding(@aa1 VB r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.binding = r2;
    }

    public final void setMArg0(@tb1 String r1) {
        this.mArg0 = r1;
    }

    public final void setMArg1(int r1) {
        this.mArg1 = r1;
    }

    public final void setMArg2(@tb1 Parcelable r1) {
        this.mArg2 = r1;
    }

    public final void setMArg3(@tb1 Serializable r1) {
        this.mArg3 = r1;
    }

    public final void setStatusBar(final int r3, final boolean r4) {
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ViewCompat.setOnApplyWindowInsetsListener(getBinding().getRoot(), new i1i1XOiI(this, r3, r4));
    }

    public final /* synthetic */ <T extends ViewModel> T simpleVM(AppCompatActivity r5, ViewModelProvider.Factory r6) {
        Intrinsics.X0O(r5, "<this>");
        if (r6 != null) goto L6;
        ViewModelProvider r7 = new ViewModelProvider(r5);
        Intrinsics.OX(4, "T");
        return (T) r7.get(ViewModel.class);
    L6:
        ViewModelProvider r3 = new ViewModelProvider(r5, r6);
        Intrinsics.OX(4, "T");
        return (T) r3.get(ViewModel.class);
    }
}
