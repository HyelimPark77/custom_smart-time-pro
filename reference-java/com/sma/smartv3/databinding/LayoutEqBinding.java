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
import com.sma.smartv3.otherdevice.p609jl.view.EqWaveView;
import com.sma.smartv3.otherdevice.p609jl.view.ViewPager2RecycleView;
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
        int i = R.id.btn_eq_advanced_setting;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_eq_advanced_setting);
        if (button != null) {
            i = R.id.btn_eq_mode;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_eq_mode);
            if (button2 != null) {
                i = R.id.btn_eq_reset;
                Button button3 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_eq_reset);
                if (button3 != null) {
                    i = R.id.rv_vsbs;
                    ViewPager2RecycleView viewPager2RecycleView = (ViewPager2RecycleView) ViewBindings.findChildViewById(rootView, R.id.rv_vsbs);
                    if (viewPager2RecycleView != null) {
                        i = R.id.tv_eq_mode_select_name;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_select_name);
                        if (textView != null) {
                            i = R.id.tv_gain_0;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_gain_0);
                            if (textView2 != null) {
                                i = R.id.tv_gain_12;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_gain_12);
                                if (textView3 != null) {
                                    i = R.id.tv_gain_negative_12;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_gain_negative_12);
                                    if (textView4 != null) {
                                        i = R.id.wv_freq;
                                        EqWaveView eqWaveView = (EqWaveView) ViewBindings.findChildViewById(rootView, R.id.wv_freq);
                                        if (eqWaveView != null) {
                                            return new LayoutEqBinding((LinearLayout) rootView, button, button2, button3, viewPager2RecycleView, textView, textView2, textView3, textView4, eqWaveView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutEqBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutEqBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_eq, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
