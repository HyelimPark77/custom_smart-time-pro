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
        int r1 = R.id.cb_eq_classical;
        AppCompatCheckBox r5 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_classical);
        if (r5 == null) goto L29;
        r1 = R.id.cb_eq_country;
        AppCompatCheckBox r6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_country);
        if (r6 == null) goto L29;
        r1 = R.id.cb_eq_jazz;
        AppCompatCheckBox r7 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_jazz);
        if (r7 == null) goto L29;
        r1 = R.id.cb_eq_normal;
        AppCompatCheckBox r8 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_normal);
        if (r8 == null) goto L29;
        r1 = R.id.cb_eq_pop;
        AppCompatCheckBox r9 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_pop);
        if (r9 == null) goto L29;
        r1 = R.id.cb_eq_rock;
        AppCompatCheckBox r10 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_eq_rock);
        if (r10 == null) goto L29;
        r1 = R.id.ll_eq_classical;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_classical);
        if (r11 == null) goto L29;
        r1 = R.id.ll_eq_country;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_country);
        if (r12 == null) goto L29;
        r1 = R.id.ll_eq_jazz;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_jazz);
        if (r13 == null) goto L29;
        r1 = R.id.ll_eq_normal;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_normal);
        if (r14 == null) goto L29;
        r1 = R.id.ll_eq_pop;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_pop);
        if (r15 == null) goto L29;
        r1 = R.id.ll_eq_rock;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_eq_rock);
        if (r16 == null) goto L29;
        return new ActivitySoundEffectsSampleBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivitySoundEffectsSampleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySoundEffectsSampleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sound_effects_sample, parent, false);
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
