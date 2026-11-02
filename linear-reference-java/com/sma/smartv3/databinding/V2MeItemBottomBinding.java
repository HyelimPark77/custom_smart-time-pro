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
import com.sma.smartv3.view.ad.ADPAdContainerView;
import com.sma.smartv3.view.ad.ADPCAdContainerView;

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
        int r1 = R.id.adpAdContainerView;
        ADPAdContainerView r5 = (ADPAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpAdContainerView);
        if (r5 == null) goto L39;
        r1 = R.id.adpcAdContainerView;
        ADPCAdContainerView r6 = (ADPCAdContainerView) ViewBindings.findChildViewById(rootView, R.id.adpcAdContainerView);
        if (r6 == null) goto L39;
        r1 = R.id.btAbout;
        RelativeLayout r7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btAbout);
        if (r7 == null) goto L39;
        r1 = R.id.btContactUs;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btContactUs);
        if (r8 == null) goto L39;
        r1 = R.id.btExercise;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btExercise);
        if (r9 == null) goto L39;
        r1 = R.id.btFAQ;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFAQ);
        if (r10 == null) goto L39;
        r1 = R.id.btFeedBack;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFeedBack);
        if (r11 == null) goto L39;
        r1 = R.id.btFirmwareRepair;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFirmwareRepair);
        if (r12 == null) goto L39;
        r1 = R.id.btFont;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btFont);
        if (r13 == null) goto L39;
        r1 = R.id.btHelp;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btHelp);
        if (r14 == null) goto L39;
        r1 = R.id.btPermissionSetting;
        RelativeLayout r15 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btPermissionSetting);
        if (r15 == null) goto L39;
        r1 = R.id.btSetting;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btSetting);
        if (r16 == null) goto L39;
        r1 = R.id.btSwitch;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btSwitch);
        if (r17 == null) goto L39;
        r1 = R.id.btTalk;
        LinearLayout r18 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.btTalk);
        if (r18 == null) goto L39;
        r1 = R.id.btUiRepair;
        RelativeLayout r19 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.btUiRepair);
        if (r19 == null) goto L39;
        r1 = R.id.iv_contact_us;
        TintImageView r20 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_contact_us);
        if (r20 == null) goto L39;
        r1 = R.id.ivRemind;
        ImageView r21 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
        if (r21 == null) goto L39;
        return new V2MeItemBottomBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    L39:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static V2MeItemBottomBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2MeItemBottomBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_me_item_bottom, parent, false);
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
