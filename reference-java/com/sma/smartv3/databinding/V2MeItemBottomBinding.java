package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class V2MeItemBottomBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adpAdContainerView;

    @NonNull
    public final ADPCAdContainerView adpcAdContainerView;

    @NonNull
    public final RelativeLayout btAbout;

    @NonNull
    public final LinearLayout btContactUs;

    @NonNull
    public final LinearLayout btExercise;

    @NonNull
    public final LinearLayout btFAQ;

    @NonNull
    public final LinearLayout btFeedBack;

    @NonNull
    public final LinearLayout btFirmwareRepair;

    @NonNull
    public final LinearLayout btFont;

    @NonNull
    public final LinearLayout btHelp;

    @NonNull
    public final RelativeLayout btPermissionSetting;

    @NonNull
    public final RelativeLayout btSetting;

    @NonNull
    public final LinearLayout btSwitch;

    @NonNull
    public final LinearLayout btTalk;

    @NonNull
    public final RelativeLayout btUiRepair;

    @NonNull
    public final TintImageView ivContactUs;

    @NonNull
    public final ImageView ivRemind;

    @NonNull
    private final LinearLayout rootView;

    private V2MeItemBottomBinding(@NonNull LinearLayout rootView, @NonNull ADPAdContainerView adpAdContainerView, @NonNull ADPCAdContainerView adpcAdContainerView, @NonNull RelativeLayout btAbout, @NonNull LinearLayout btContactUs, @NonNull LinearLayout btExercise, @NonNull LinearLayout btFAQ, @NonNull LinearLayout btFeedBack, @NonNull LinearLayout btFirmwareRepair, @NonNull LinearLayout btFont, @NonNull LinearLayout btHelp, @NonNull RelativeLayout btPermissionSetting, @NonNull RelativeLayout btSetting, @NonNull LinearLayout btSwitch, @NonNull LinearLayout btTalk, @NonNull RelativeLayout btUiRepair, @NonNull TintImageView ivContactUs, @NonNull ImageView ivRemind) {
        this.rootView = rootView;
        this.adpAdContainerView = adpAdContainerView;
        this.adpcAdContainerView = adpcAdContainerView;
        this.btAbout = btAbout;
        this.btContactUs = btContactUs;
        this.btExercise = btExercise;
        this.btFAQ = btFAQ;
        this.btFeedBack = btFeedBack;
        this.btFirmwareRepair = btFirmwareRepair;
        this.btFont = btFont;
        this.btHelp = btHelp;
        this.btPermissionSetting = btPermissionSetting;
        this.btSetting = btSetting;
        this.btSwitch = btSwitch;
        this.btTalk = btTalk;
        this.btUiRepair = btUiRepair;
        this.ivContactUs = ivContactUs;
        this.ivRemind = ivRemind;
    }

    @NonNull
    public static V2MeItemBottomBinding bind(@NonNull View rootView) {
        int i = R.id.adpAdContainerView;
        ADPAdContainerView aDPAdContainerView = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (aDPAdContainerView != null) {
            i = R.id.adpcAdContainerView;
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i = R.id.btAbout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btAbout);
                if (relativeLayout != null) {
                    i = R.id.btContactUs;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btContactUs);
                    if (linearLayout != null) {
                        i = R.id.btExercise;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btExercise);
                        if (linearLayout2 != null) {
                            i = R.id.btFAQ;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFAQ);
                            if (linearLayout3 != null) {
                                i = R.id.btFeedBack;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFeedBack);
                                if (linearLayout4 != null) {
                                    i = R.id.btFirmwareRepair;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFirmwareRepair);
                                    if (linearLayout5 != null) {
                                        i = R.id.btFont;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFont);
                                        if (linearLayout6 != null) {
                                            i = R.id.btHelp;
                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btHelp);
                                            if (linearLayout7 != null) {
                                                i = R.id.btPermissionSetting;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btPermissionSetting);
                                                if (relativeLayout2 != null) {
                                                    i = R.id.btSetting;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btSetting);
                                                    if (relativeLayout3 != null) {
                                                        i = R.id.btSwitch;
                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btSwitch);
                                                        if (linearLayout8 != null) {
                                                            i = R.id.btTalk;
                                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btTalk);
                                                            if (linearLayout9 != null) {
                                                                i = R.id.btUiRepair;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btUiRepair);
                                                                if (relativeLayout4 != null) {
                                                                    i = R.id.iv_contact_us;
                                                                    TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_contact_us);
                                                                    if (tintImageView != null) {
                                                                        i = R.id.ivRemind;
                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
                                                                        if (imageView != null) {
                                                                            return new V2MeItemBottomBinding((LinearLayout) rootView, aDPAdContainerView, aDPCAdContainerView, relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, relativeLayout2, relativeLayout3, linearLayout8, linearLayout9, relativeLayout4, tintImageView, imageView);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static V2MeItemBottomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2MeItemBottomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_me_item_bottom, parent, false);
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
