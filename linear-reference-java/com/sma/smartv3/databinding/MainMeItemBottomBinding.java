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
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;

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
        int r0 = R.id.adpAdContainerView;
        ADPAdContainerView r2 = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (r2 == null) goto L31;
        r0 = R.id.adpcAdContainerView;
        ADPCAdContainerView r3 = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
        if (r3 == null) goto L31;
        r0 = R.id.btAbout;
        RelativeLayout r4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btAbout);
        if (r4 == null) goto L31;
        r0 = R.id.btExercise;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btExercise);
        if (r5 == null) goto L31;
        r0 = R.id.btFeedBack;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFeedBack);
        if (r6 == null) goto L31;
        r0 = R.id.btFirmwareRepair;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFirmwareRepair);
        if (r7 == null) goto L31;
        r0 = R.id.btFont;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFont);
        if (r8 == null) goto L31;
        r0 = R.id.btPermissionSetting;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btPermissionSetting);
        if (r9 == null) goto L31;
        r0 = R.id.btSetting;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btSetting);
        if (r10 == null) goto L31;
        r0 = R.id.btSwitch;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btSwitch);
        if (r11 == null) goto L31;
        r0 = R.id.btUiRepair;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btUiRepair);
        if (r12 == null) goto L31;
        r0 = R.id.btUserInfo;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btUserInfo);
        if (r13 == null) goto L31;
        r0 = R.id.ivRemind;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
        if (r14 == null) goto L31;
        return new MainMeItemBottomBinding(rootView, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L31:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static MainMeItemBottomBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) goto L6;
        inflater.inflate(R.layout.main_me_item_bottom, parent);
        return bind(parent);
    L6:
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
