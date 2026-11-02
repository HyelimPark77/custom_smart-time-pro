package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ArcProgressBar;
import com.sma.smartv3.view.ScaleSeekBar;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityChargeMainBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout addScreensaver;

    @NonNull
    public final Button btnUnbind;

    @NonNull
    public final LinearLayout chargePanel;

    @NonNull
    public final LinearLayout chargePanelInfo;

    @NonNull
    public final AppCompatCheckBox checkCall;

    @NonNull
    public final AppCompatCheckBox checkFindEarphoneLeft;

    @NonNull
    public final AppCompatCheckBox checkFindEarphoneRight;

    @NonNull
    public final ViewPager deviceViewpager;

    @NonNull
    public final LinearLayout earDialogueTranslationLayout;

    @NonNull
    public final LinearLayout earSimultaneousTranslationLayout;

    @NonNull
    public final LinearLayout earTranslationLayout;

    @NonNull
    public final LinearLayout earphonePanel;

    @NonNull
    public final LinearLayout earphonePanelInfo;

    @NonNull
    public final FrameLayout indicatorContainer;

    @NonNull
    public final LinearLayout itemCustomAnc;

    @NonNull
    public final LinearLayout itemEbookManager;

    @NonNull
    public final PFMedium itemLightnessTvHigh;

    @NonNull
    public final PFMedium itemLightnessTvLow;

    @NonNull
    public final PFMedium itemLightnessTvMiddle;

    @NonNull
    public final LinearLayout itemMusicManager;

    @NonNull
    public final LinearLayout itemVoiceAssistant;

    @NonNull
    public final ImageView ivDenoise;

    @NonNull
    public final ImageView ivNoiseClose;

    @NonNull
    public final ImageView ivTransparent;

    @NonNull
    public final LinearLayout llNoiseSettings;

    @NonNull
    public final LinearLayout llScreensaver;

    @NonNull
    public final ArcProgressBar pbEarphoneL;

    @NonNull
    public final ArcProgressBar pbEarphoneR;

    @NonNull
    public final ArcProgressBar pbPower;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final RecyclerView rvScreensaver;

    @NonNull
    public final ScaleSeekBar seekbarLightness;

    @NonNull
    public final SeekBar seekbarScreensaver;

    @NonNull
    public final SwipeRefreshLayout srf;

    @NonNull
    public final LinearLayout titleBar;

    @NonNull
    public final PFMedium tvEarphoneL;

    @NonNull
    public final PFMedium tvEarphoneR;

    @NonNull
    public final PFMedium tvNoiseModeClose;

    @NonNull
    public final PFMedium tvNoiseModeDenoise;

    @NonNull
    public final PFMedium tvNoiseModeTransparent;

    @NonNull
    public final PFMedium tvPower;

    @NonNull
    public final PFMedium tvScreensaverValue;

    @NonNull
    public final DINCondBold tvState;

    private ActivityChargeMainBinding(@NonNull LinearLayout rootView_, @NonNull RelativeLayout addScreensaver, @NonNull Button btnUnbind, @NonNull LinearLayout chargePanel, @NonNull LinearLayout chargePanelInfo, @NonNull AppCompatCheckBox checkCall, @NonNull AppCompatCheckBox checkFindEarphoneLeft, @NonNull AppCompatCheckBox checkFindEarphoneRight, @NonNull ViewPager deviceViewpager, @NonNull LinearLayout earDialogueTranslationLayout, @NonNull LinearLayout earSimultaneousTranslationLayout, @NonNull LinearLayout earTranslationLayout, @NonNull LinearLayout earphonePanel, @NonNull LinearLayout earphonePanelInfo, @NonNull FrameLayout indicatorContainer, @NonNull LinearLayout itemCustomAnc, @NonNull LinearLayout itemEbookManager, @NonNull PFMedium itemLightnessTvHigh, @NonNull PFMedium itemLightnessTvLow, @NonNull PFMedium itemLightnessTvMiddle, @NonNull LinearLayout itemMusicManager, @NonNull LinearLayout itemVoiceAssistant, @NonNull ImageView ivDenoise, @NonNull ImageView ivNoiseClose, @NonNull ImageView ivTransparent, @NonNull LinearLayout llNoiseSettings, @NonNull LinearLayout llScreensaver, @NonNull ArcProgressBar pbEarphoneL, @NonNull ArcProgressBar pbEarphoneR, @NonNull ArcProgressBar pbPower, @NonNull LinearLayout rootView, @NonNull RecyclerView rvScreensaver, @NonNull ScaleSeekBar seekbarLightness, @NonNull SeekBar seekbarScreensaver, @NonNull SwipeRefreshLayout srf, @NonNull LinearLayout titleBar, @NonNull PFMedium tvEarphoneL, @NonNull PFMedium tvEarphoneR, @NonNull PFMedium tvNoiseModeClose, @NonNull PFMedium tvNoiseModeDenoise, @NonNull PFMedium tvNoiseModeTransparent, @NonNull PFMedium tvPower, @NonNull PFMedium tvScreensaverValue, @NonNull DINCondBold tvState) {
        this.rootView_ = rootView_;
        this.addScreensaver = addScreensaver;
        this.btnUnbind = btnUnbind;
        this.chargePanel = chargePanel;
        this.chargePanelInfo = chargePanelInfo;
        this.checkCall = checkCall;
        this.checkFindEarphoneLeft = checkFindEarphoneLeft;
        this.checkFindEarphoneRight = checkFindEarphoneRight;
        this.deviceViewpager = deviceViewpager;
        this.earDialogueTranslationLayout = earDialogueTranslationLayout;
        this.earSimultaneousTranslationLayout = earSimultaneousTranslationLayout;
        this.earTranslationLayout = earTranslationLayout;
        this.earphonePanel = earphonePanel;
        this.earphonePanelInfo = earphonePanelInfo;
        this.indicatorContainer = indicatorContainer;
        this.itemCustomAnc = itemCustomAnc;
        this.itemEbookManager = itemEbookManager;
        this.itemLightnessTvHigh = itemLightnessTvHigh;
        this.itemLightnessTvLow = itemLightnessTvLow;
        this.itemLightnessTvMiddle = itemLightnessTvMiddle;
        this.itemMusicManager = itemMusicManager;
        this.itemVoiceAssistant = itemVoiceAssistant;
        this.ivDenoise = ivDenoise;
        this.ivNoiseClose = ivNoiseClose;
        this.ivTransparent = ivTransparent;
        this.llNoiseSettings = llNoiseSettings;
        this.llScreensaver = llScreensaver;
        this.pbEarphoneL = pbEarphoneL;
        this.pbEarphoneR = pbEarphoneR;
        this.pbPower = pbPower;
        this.rootView = rootView;
        this.rvScreensaver = rvScreensaver;
        this.seekbarLightness = seekbarLightness;
        this.seekbarScreensaver = seekbarScreensaver;
        this.srf = srf;
        this.titleBar = titleBar;
        this.tvEarphoneL = tvEarphoneL;
        this.tvEarphoneR = tvEarphoneR;
        this.tvNoiseModeClose = tvNoiseModeClose;
        this.tvNoiseModeDenoise = tvNoiseModeDenoise;
        this.tvNoiseModeTransparent = tvNoiseModeTransparent;
        this.tvPower = tvPower;
        this.tvScreensaverValue = tvScreensaverValue;
        this.tvState = tvState;
    }

    @NonNull
    public static ActivityChargeMainBinding bind(@NonNull View rootView) {
        int r1 = R.id.add_screensaver;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.add_screensaver);
        if (r5 == null) goto L89;
        r1 = R.id.btn_unbind;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_unbind);
        if (r6 == null) goto L89;
        r1 = R.id.charge_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.charge_panel);
        if (r7 == null) goto L89;
        r1 = R.id.charge_panel_info;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.charge_panel_info);
        if (r8 == null) goto L89;
        r1 = R.id.check_call;
        AppCompatCheckBox r9 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_call);
        if (r9 == null) goto L89;
        r1 = R.id.check_find_earphone_left;
        AppCompatCheckBox r10 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_find_earphone_left);
        if (r10 == null) goto L89;
        r1 = R.id.check_find_earphone_right;
        AppCompatCheckBox r11 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_find_earphone_right);
        if (r11 == null) goto L89;
        r1 = R.id.device_viewpager;
        ViewPager r12 = (ViewPager) ViewBindings.findChildViewById(rootView, R.id.device_viewpager);
        if (r12 == null) goto L89;
        r1 = R.id.ear_dialogue_translation_layout;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ear_dialogue_translation_layout);
        if (r13 == null) goto L89;
        r1 = R.id.ear_simultaneous_translation_layout;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ear_simultaneous_translation_layout);
        if (r14 == null) goto L89;
        r1 = R.id.ear_translation_layout;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ear_translation_layout);
        if (r15 == null) goto L89;
        r1 = R.id.earphone_panel;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.earphone_panel);
        if (r16 == null) goto L89;
        r1 = R.id.earphone_panel_info;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.earphone_panel_info);
        if (r17 == null) goto L89;
        r1 = R.id.indicator_container;
        FrameLayout r18 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator_container);
        if (r18 == null) goto L89;
        r1 = R.id.item_custom_anc;
        LinearLayout r19 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_custom_anc);
        if (r19 == null) goto L89;
        r1 = R.id.item_ebook_manager;
        LinearLayout r20 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_ebook_manager);
        if (r20 == null) goto L89;
        r1 = R.id.item_lightness_tv_high;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lightness_tv_high);
        if (r21 == null) goto L89;
        r1 = R.id.item_lightness_tv_low;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lightness_tv_low);
        if (r22 == null) goto L89;
        r1 = R.id.item_lightness_tv_middle;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.item_lightness_tv_middle);
        if (r23 == null) goto L89;
        r1 = R.id.item_music_manager;
        LinearLayout r24 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_music_manager);
        if (r24 == null) goto L89;
        r1 = R.id.item_voice_assistant;
        LinearLayout r25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_voice_assistant);
        if (r25 == null) goto L89;
        r1 = R.id.iv_denoise;
        ImageView r26 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_denoise);
        if (r26 == null) goto L89;
        r1 = R.id.iv_noise_close;
        ImageView r27 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_noise_close);
        if (r27 == null) goto L89;
        r1 = R.id.iv_transparent;
        ImageView r28 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_transparent);
        if (r28 == null) goto L89;
        r1 = R.id.ll_noise_settings;
        LinearLayout r29 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_noise_settings);
        if (r29 == null) goto L89;
        r1 = R.id.ll_screensaver;
        LinearLayout r30 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_screensaver);
        if (r30 == null) goto L89;
        r1 = R.id.pb_earphone_l;
        ArcProgressBar r31 = (ArcProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_earphone_l);
        if (r31 == null) goto L89;
        r1 = R.id.pb_earphone_r;
        ArcProgressBar r32 = (ArcProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_earphone_r);
        if (r32 == null) goto L89;
        r1 = R.id.pb_power;
        ArcProgressBar r33 = (ArcProgressBar) ViewBindings.findChildViewById(rootView, R.id.pb_power);
        if (r33 == null) goto L89;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.rv_screensaver;
        RecyclerView r35 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_screensaver);
        if (r35 == null) goto L89;
        r1 = R.id.seekbar_lightness;
        ScaleSeekBar r36 = (ScaleSeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar_lightness);
        if (r36 == null) goto L89;
        r1 = R.id.seekbar_screensaver;
        SeekBar r37 = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.seekbar_screensaver);
        if (r37 == null) goto L89;
        r1 = R.id.srf;
        SwipeRefreshLayout r38 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.srf);
        if (r38 == null) goto L89;
        r1 = R.id.title_bar;
        LinearLayout r39 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar);
        if (r39 == null) goto L89;
        r1 = R.id.tv_earphone_l;
        PFMedium r40 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_earphone_l);
        if (r40 == null) goto L89;
        r1 = R.id.tv_earphone_r;
        PFMedium r41 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_earphone_r);
        if (r41 == null) goto L89;
        r1 = R.id.tv_noise_mode_close;
        PFMedium r42 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_noise_mode_close);
        if (r42 == null) goto L89;
        r1 = R.id.tv_noise_mode_denoise;
        PFMedium r43 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_noise_mode_denoise);
        if (r43 == null) goto L89;
        r1 = R.id.tv_noise_mode_transparent;
        PFMedium r44 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_noise_mode_transparent);
        if (r44 == null) goto L89;
        r1 = R.id.tv_power;
        PFMedium r45 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_power);
        if (r45 == null) goto L89;
        r1 = R.id.tv_screensaver_value;
        PFMedium r46 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_screensaver_value);
        if (r46 == null) goto L89;
        r1 = R.id.tv_state;
        DINCondBold r47 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_state);
        if (r47 == null) goto L89;
        return new ActivityChargeMainBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r4, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47);
    L89:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityChargeMainBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityChargeMainBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_charge_main, parent, false);
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
