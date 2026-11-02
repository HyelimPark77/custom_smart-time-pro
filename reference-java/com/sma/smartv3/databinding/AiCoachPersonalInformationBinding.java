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
        int i = R.id.personal_ll_date_birth_layout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_date_birth_layout);
        if (relativeLayout != null) {
            i = R.id.personal_ll_date_birth_tv;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_date_birth_tv);
            if (pFMedium != null) {
                i = R.id.personal_ll_gender_layout;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_gender_layout);
                if (relativeLayout2 != null) {
                    i = R.id.personal_ll_gender_tv;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_gender_tv);
                    if (pFMedium2 != null) {
                        i = R.id.personal_ll_height_layout;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_height_layout);
                        if (relativeLayout3 != null) {
                            i = R.id.personal_ll_height_tv;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_height_tv);
                            if (pFMedium3 != null) {
                                i = R.id.personal_ll_weight_layout;
                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.personal_ll_weight_layout);
                                if (relativeLayout4 != null) {
                                    i = R.id.personal_ll_weight_tv;
                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.personal_ll_weight_tv);
                                    if (pFMedium4 != null) {
                                        LinearLayout linearLayout = (LinearLayout) rootView;
                                        return new AiCoachPersonalInformationBinding(linearLayout, relativeLayout, pFMedium, relativeLayout2, pFMedium2, relativeLayout3, pFMedium3, relativeLayout4, pFMedium4, linearLayout);
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
    public static AiCoachPersonalInformationBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachPersonalInformationBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_personal_information, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
