package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.otherdevice.jl.view.EqWaveView;
import com.sma.smartv3.otherdevice.jl.view.ViewPager2RecycleView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutEqBinding implements ViewBinding {

    @NonNull
    public final Button btnEqAdvancedSetting;

    @NonNull
    public final Button btnEqMode;

    @NonNull
    public final Button btnEqReset;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ViewPager2RecycleView rvVsbs;

    @NonNull
    public final TextView tvEqModeSelectName;

    @NonNull
    public final TextView tvGain0;

    @NonNull
    public final TextView tvGain12;

    @NonNull
    public final TextView tvGainNegative12;

    @NonNull
    public final EqWaveView wvFreq;

    private LayoutEqBinding(@NonNull LinearLayout rootView, @NonNull Button btnEqAdvancedSetting, @NonNull Button btnEqMode, @NonNull Button btnEqReset, @NonNull ViewPager2RecycleView rvVsbs, @NonNull TextView tvEqModeSelectName, @NonNull TextView tvGain0, @NonNull TextView tvGain12, @NonNull TextView tvGainNegative12, @NonNull EqWaveView wvFreq) {
        this.rootView = rootView;
        this.btnEqAdvancedSetting = btnEqAdvancedSetting;
        this.btnEqMode = btnEqMode;
        this.btnEqReset = btnEqReset;
        this.rvVsbs = rvVsbs;
        this.tvEqModeSelectName = tvEqModeSelectName;
        this.tvGain0 = tvGain0;
        this.tvGain12 = tvGain12;
        this.tvGainNegative12 = tvGainNegative12;
        this.wvFreq = wvFreq;
    }

    @NonNull
    public static LayoutEqBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_eq_advanced_setting;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_eq_advanced_setting);
        if (r4 == null) goto L23;
        r0 = R.id.btn_eq_mode;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_eq_mode);
        if (r5 == null) goto L23;
        r0 = R.id.btn_eq_reset;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_eq_reset);
        if (r6 == null) goto L23;
        r0 = R.id.rv_vsbs;
        ViewPager2RecycleView r7 = (ViewPager2RecycleView) ViewBindings.findChildViewById(rootView, R.id.rv_vsbs);
        if (r7 == null) goto L23;
        r0 = R.id.tv_eq_mode_select_name;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_select_name);
        if (r8 == null) goto L23;
        r0 = R.id.tv_gain_0;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_gain_0);
        if (r9 == null) goto L23;
        r0 = R.id.tv_gain_12;
        TextView r10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_gain_12);
        if (r10 == null) goto L23;
        r0 = R.id.tv_gain_negative_12;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_gain_negative_12);
        if (r11 == null) goto L23;
        r0 = R.id.wv_freq;
        EqWaveView r12 = (EqWaveView) ViewBindings.findChildViewById(rootView, R.id.wv_freq);
        if (r12 == null) goto L23;
        return new LayoutEqBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutEqBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutEqBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_eq, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
