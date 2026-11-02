package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;

/* JADX INFO: loaded from: classes19.dex */
public final class MainMeItemBottomBinding implements ViewBinding {

    @NonNull
    public final ADPAdContainerView adpAdContainerView;

    @NonNull
    public final ADPCAdContainerView adpcAdContainerView;

    @NonNull
    public final RelativeLayout btAbout;

    @NonNull
    public final LinearLayout btExercise;

    @NonNull
    public final LinearLayout btFeedBack;

    @NonNull
    public final LinearLayout btFirmwareRepair;

    @NonNull
    public final LinearLayout btFont;

    @NonNull
    public final RelativeLayout btPermissionSetting;

    @NonNull
    public final RelativeLayout btSetting;

    @NonNull
    public final LinearLayout btSwitch;

    @NonNull
    public final RelativeLayout btUiRepair;

    @NonNull
    public final LinearLayout btUserInfo;

    @NonNull
    public final ImageView ivRemind;

    @NonNull
    private final View rootView;

    private MainMeItemBottomBinding(@NonNull View rootView, @NonNull ADPAdContainerView adpAdContainerView, @NonNull ADPCAdContainerView adpcAdContainerView, @NonNull RelativeLayout btAbout, @NonNull LinearLayout btExercise, @NonNull LinearLayout btFeedBack, @NonNull LinearLayout btFirmwareRepair, @NonNull LinearLayout btFont, @NonNull RelativeLayout btPermissionSetting, @NonNull RelativeLayout btSetting, @NonNull LinearLayout btSwitch, @NonNull RelativeLayout btUiRepair, @NonNull LinearLayout btUserInfo, @NonNull ImageView ivRemind) {
        this.rootView = rootView;
        this.adpAdContainerView = adpAdContainerView;
        this.adpcAdContainerView = adpcAdContainerView;
        this.btAbout = btAbout;
        this.btExercise = btExercise;
        this.btFeedBack = btFeedBack;
        this.btFirmwareRepair = btFirmwareRepair;
        this.btFont = btFont;
        this.btPermissionSetting = btPermissionSetting;
        this.btSetting = btSetting;
        this.btSwitch = btSwitch;
        this.btUiRepair = btUiRepair;
        this.btUserInfo = btUserInfo;
        this.ivRemind = ivRemind;
    }

    @NonNull
    public static MainMeItemBottomBinding bind(@NonNull View rootView) {
        int i = R.id.adpAdContainerView;
        ADPAdContainerView aDPAdContainerView = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (aDPAdContainerView != null) {
            i = R.id.adpcAdContainerView;
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i = R.id.btAbout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btAbout);
                if (relativeLayout != null) {
                    i = R.id.btExercise;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btExercise);
                    if (linearLayout != null) {
                        i = R.id.btFeedBack;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFeedBack);
                        if (linearLayout2 != null) {
                            i = R.id.btFirmwareRepair;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFirmwareRepair);
                            if (linearLayout3 != null) {
                                i = R.id.btFont;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFont);
                                if (linearLayout4 != null) {
                                    i = R.id.btPermissionSetting;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btPermissionSetting);
                                    if (relativeLayout2 != null) {
                                        i = R.id.btSetting;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btSetting);
                                        if (relativeLayout3 != null) {
                                            i = R.id.btSwitch;
                                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btSwitch);
                                            if (linearLayout5 != null) {
                                                i = R.id.btUiRepair;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btUiRepair);
                                                if (relativeLayout4 != null) {
                                                    i = R.id.btUserInfo;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btUserInfo);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.ivRemind;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
                                                        if (imageView != null) {
                                                            return new MainMeItemBottomBinding(rootView, aDPAdContainerView, aDPCAdContainerView, relativeLayout, linearLayout, linearLayout2, linearLayout3, linearLayout4, relativeLayout2, relativeLayout3, linearLayout5, relativeLayout4, linearLayout6, imageView);
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
    public static MainMeItemBottomBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException("parent");
        }
        inflater.inflate(R.layout.main_me_item_bottom, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
