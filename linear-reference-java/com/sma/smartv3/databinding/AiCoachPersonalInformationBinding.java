package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachPersonalInformationBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout personalLlDateBirthLayout;

    @NonNull
    public final PFMedium personalLlDateBirthTv;

    @NonNull
    public final RelativeLayout personalLlGenderLayout;

    @NonNull
    public final PFMedium personalLlGenderTv;

    @NonNull
    public final RelativeLayout personalLlHeightLayout;

    @NonNull
    public final PFMedium personalLlHeightTv;

    @NonNull
    public final RelativeLayout personalLlWeightLayout;

    @NonNull
    public final PFMedium personalLlWeightTv;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private AiCoachPersonalInformationBinding(@NonNull LinearLayout rootView_, @NonNull RelativeLayout personalLlDateBirthLayout, @NonNull PFMedium personalLlDateBirthTv, @NonNull RelativeLayout personalLlGenderLayout, @NonNull PFMedium personalLlGenderTv, @NonNull RelativeLayout personalLlHeightLayout, @NonNull PFMedium personalLlHeightTv, @NonNull RelativeLayout personalLlWeightLayout, @NonNull PFMedium personalLlWeightTv, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.personalLlDateBirthLayout = personalLlDateBirthLayout;
        this.personalLlDateBirthTv = personalLlDateBirthTv;
        this.personalLlGenderLayout = personalLlGenderLayout;
        this.personalLlGenderTv = personalLlGenderTv;
        this.personalLlHeightLayout = personalLlHeightLayout;
        this.personalLlHeightTv = personalLlHeightTv;
        this.personalLlWeightLayout = personalLlWeightLayout;
        this.personalLlWeightTv = personalLlWeightTv;
        this.rootView = rootView;
    }

    @NonNull
    public static AiCoachPersonalInformationBinding bind(@NonNull View rootView) {
        int r0 = R.id.personal_ll_date_birth_layout;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_date_birth_layout);
        if (r4 == null) goto L21;
        r0 = R.id.personal_ll_date_birth_tv;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_date_birth_tv);
        if (r5 == null) goto L21;
        r0 = R.id.personal_ll_gender_layout;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_gender_layout);
        if (r6 == null) goto L21;
        r0 = R.id.personal_ll_gender_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_gender_tv);
        if (r7 == null) goto L21;
        r0 = R.id.personal_ll_height_layout;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_height_layout);
        if (r8 == null) goto L21;
        r0 = R.id.personal_ll_height_tv;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_height_tv);
        if (r9 == null) goto L21;
        r0 = R.id.personal_ll_weight_layout;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_weight_layout);
        if (r10 == null) goto L21;
        r0 = R.id.personal_ll_weight_tv;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_weight_tv);
        if (r11 == null) goto L21;
        LinearLayout r3 = (LinearLayout) rootView;
        return new AiCoachPersonalInformationBinding(r3, r4, r5, r6, r7, r8, r9, r10, r11, r3);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiCoachPersonalInformationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiCoachPersonalInformationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_coach_personal_information, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
