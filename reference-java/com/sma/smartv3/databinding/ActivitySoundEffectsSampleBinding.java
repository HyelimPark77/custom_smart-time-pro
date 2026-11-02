package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySoundEffectsSampleBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox cbEqClassical;

    @NonNull
    public final AppCompatCheckBox cbEqCountry;

    @NonNull
    public final AppCompatCheckBox cbEqJazz;

    @NonNull
    public final AppCompatCheckBox cbEqNormal;

    @NonNull
    public final AppCompatCheckBox cbEqPop;

    @NonNull
    public final AppCompatCheckBox cbEqRock;

    @NonNull
    public final LinearLayout llEqClassical;

    @NonNull
    public final LinearLayout llEqCountry;

    @NonNull
    public final LinearLayout llEqJazz;

    @NonNull
    public final LinearLayout llEqNormal;

    @NonNull
    public final LinearLayout llEqPop;

    @NonNull
    public final LinearLayout llEqRock;

    @NonNull
    private final LinearLayout rootView;

    private ActivitySoundEffectsSampleBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox cbEqClassical, @NonNull AppCompatCheckBox cbEqCountry, @NonNull AppCompatCheckBox cbEqJazz, @NonNull AppCompatCheckBox cbEqNormal, @NonNull AppCompatCheckBox cbEqPop, @NonNull AppCompatCheckBox cbEqRock, @NonNull LinearLayout llEqClassical, @NonNull LinearLayout llEqCountry, @NonNull LinearLayout llEqJazz, @NonNull LinearLayout llEqNormal, @NonNull LinearLayout llEqPop, @NonNull LinearLayout llEqRock) {
        this.rootView = rootView;
        this.cbEqClassical = cbEqClassical;
        this.cbEqCountry = cbEqCountry;
        this.cbEqJazz = cbEqJazz;
        this.cbEqNormal = cbEqNormal;
        this.cbEqPop = cbEqPop;
        this.cbEqRock = cbEqRock;
        this.llEqClassical = llEqClassical;
        this.llEqCountry = llEqCountry;
        this.llEqJazz = llEqJazz;
        this.llEqNormal = llEqNormal;
        this.llEqPop = llEqPop;
        this.llEqRock = llEqRock;
    }

    @NonNull
    public static ActivitySoundEffectsSampleBinding bind(@NonNull View rootView) {
        int i = R.id.cb_eq_classical;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_classical);
        if (appCompatCheckBox != null) {
            i = R.id.cb_eq_country;
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_country);
            if (appCompatCheckBox2 != null) {
                i = R.id.cb_eq_jazz;
                AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_jazz);
                if (appCompatCheckBox3 != null) {
                    i = R.id.cb_eq_normal;
                    AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_normal);
                    if (appCompatCheckBox4 != null) {
                        i = R.id.cb_eq_pop;
                        AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_pop);
                        if (appCompatCheckBox5 != null) {
                            i = R.id.cb_eq_rock;
                            AppCompatCheckBox appCompatCheckBox6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_rock);
                            if (appCompatCheckBox6 != null) {
                                i = R.id.ll_eq_classical;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_classical);
                                if (linearLayout != null) {
                                    i = R.id.ll_eq_country;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_country);
                                    if (linearLayout2 != null) {
                                        i = R.id.ll_eq_jazz;
                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_jazz);
                                        if (linearLayout3 != null) {
                                            i = R.id.ll_eq_normal;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_normal);
                                            if (linearLayout4 != null) {
                                                i = R.id.ll_eq_pop;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_pop);
                                                if (linearLayout5 != null) {
                                                    i = R.id.ll_eq_rock;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_rock);
                                                    if (linearLayout6 != null) {
                                                        return new ActivitySoundEffectsSampleBinding((LinearLayout) rootView, appCompatCheckBox, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox4, appCompatCheckBox5, appCompatCheckBox6, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
                                                    }
                                                }
                                            }
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
    public static ActivitySoundEffectsSampleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySoundEffectsSampleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_sound_effects_sample, parent, false);
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
