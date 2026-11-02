package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySettingsBinding implements ViewBinding {

    @NonNull
    public final Button btSettingButton;

    @NonNull
    public final AppCompatCheckBox checkDataAutoSync;

    @NonNull
    public final AppCompatCheckBox checkFitbit;

    @NonNull
    public final AppCompatCheckBox checkGoogleFit;

    @NonNull
    public final AppCompatCheckBox checkNotificationBar;

    @NonNull
    public final AppCompatCheckBox checkStrava;

    @NonNull
    public final AppCompatCheckBox checkZewaFit;

    @NonNull
    public final LinearLayout fitbitLl;

    @NonNull
    public final ImageView ivRemind;

    @NonNull
    public final LinearLayout llAdmobPrivacyOptions;

    @NonNull
    public final LinearLayout llAikeySet;

    @NonNull
    public final LinearLayout llDataSavePlace;

    @NonNull
    public final LinearLayout llDeleteAccount;

    @NonNull
    public final LinearLayout llFirmwareRepair;

    @NonNull
    public final LinearLayout llFontRepair;

    @NonNull
    public final LinearLayout llGoogleFit;

    @NonNull
    public final LinearLayout llGoogleFitAuth;

    @NonNull
    public final LinearLayout llGpsFirmwareRepair;

    @NonNull
    public final LinearLayout llHealthConnect;

    @NonNull
    public final LinearLayout llModifyPassword;

    @NonNull
    public final LinearLayout llUiRepair;

    @NonNull
    public final LinearLayout llZewaFit;

    @NonNull
    public final LinearLayout notificationBarLl;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final LinearLayout stravaLl;

    @NonNull
    public final PFMedium tvCacheSize;

    @NonNull
    public final PFMedium tvDataStorage;

    @NonNull
    public final PFMedium tvMap;

    @NonNull
    public final ImageView tvMapRightImg;

    @NonNull
    public final PFMedium tvUnit;

    private ActivitySettingsBinding(@NonNull LinearLayout rootView_, @NonNull Button btSettingButton, @NonNull AppCompatCheckBox checkDataAutoSync, @NonNull AppCompatCheckBox checkFitbit, @NonNull AppCompatCheckBox checkGoogleFit, @NonNull AppCompatCheckBox checkNotificationBar, @NonNull AppCompatCheckBox checkStrava, @NonNull AppCompatCheckBox checkZewaFit, @NonNull LinearLayout fitbitLl, @NonNull ImageView ivRemind, @NonNull LinearLayout llAdmobPrivacyOptions, @NonNull LinearLayout llAikeySet, @NonNull LinearLayout llDataSavePlace, @NonNull LinearLayout llDeleteAccount, @NonNull LinearLayout llFirmwareRepair, @NonNull LinearLayout llFontRepair, @NonNull LinearLayout llGoogleFit, @NonNull LinearLayout llGoogleFitAuth, @NonNull LinearLayout llGpsFirmwareRepair, @NonNull LinearLayout llHealthConnect, @NonNull LinearLayout llModifyPassword, @NonNull LinearLayout llUiRepair, @NonNull LinearLayout llZewaFit, @NonNull LinearLayout notificationBarLl, @NonNull LinearLayout rootView, @NonNull LinearLayout stravaLl, @NonNull PFMedium tvCacheSize, @NonNull PFMedium tvDataStorage, @NonNull PFMedium tvMap, @NonNull ImageView tvMapRightImg, @NonNull PFMedium tvUnit) {
        this.rootView_ = rootView_;
        this.btSettingButton = btSettingButton;
        this.checkDataAutoSync = checkDataAutoSync;
        this.checkFitbit = checkFitbit;
        this.checkGoogleFit = checkGoogleFit;
        this.checkNotificationBar = checkNotificationBar;
        this.checkStrava = checkStrava;
        this.checkZewaFit = checkZewaFit;
        this.fitbitLl = fitbitLl;
        this.ivRemind = ivRemind;
        this.llAdmobPrivacyOptions = llAdmobPrivacyOptions;
        this.llAikeySet = llAikeySet;
        this.llDataSavePlace = llDataSavePlace;
        this.llDeleteAccount = llDeleteAccount;
        this.llFirmwareRepair = llFirmwareRepair;
        this.llFontRepair = llFontRepair;
        this.llGoogleFit = llGoogleFit;
        this.llGoogleFitAuth = llGoogleFitAuth;
        this.llGpsFirmwareRepair = llGpsFirmwareRepair;
        this.llHealthConnect = llHealthConnect;
        this.llModifyPassword = llModifyPassword;
        this.llUiRepair = llUiRepair;
        this.llZewaFit = llZewaFit;
        this.notificationBarLl = notificationBarLl;
        this.rootView = rootView;
        this.stravaLl = stravaLl;
        this.tvCacheSize = tvCacheSize;
        this.tvDataStorage = tvDataStorage;
        this.tvMap = tvMap;
        this.tvMapRightImg = tvMapRightImg;
        this.tvUnit = tvUnit;
    }

    @NonNull
    public static ActivitySettingsBinding bind(@NonNull View rootView) {
        int r1 = R.id.bt_setting_button;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_setting_button);
        if (r5 == null) goto L63;
        r1 = R.id.check_data_auto_sync;
        AppCompatCheckBox r6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_data_auto_sync);
        if (r6 == null) goto L63;
        r1 = R.id.check_fitbit;
        AppCompatCheckBox r7 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_fitbit);
        if (r7 == null) goto L63;
        r1 = R.id.check_google_fit;
        AppCompatCheckBox r8 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_google_fit);
        if (r8 == null) goto L63;
        r1 = R.id.check_notification_bar;
        AppCompatCheckBox r9 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_notification_bar);
        if (r9 == null) goto L63;
        r1 = R.id.check_strava;
        AppCompatCheckBox r10 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_strava);
        if (r10 == null) goto L63;
        r1 = R.id.check_zewa_fit;
        AppCompatCheckBox r11 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_zewa_fit);
        if (r11 == null) goto L63;
        r1 = R.id.fitbitLl;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fitbitLl);
        if (r12 == null) goto L63;
        r1 = R.id.ivRemind;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
        if (r13 == null) goto L63;
        r1 = R.id.ll_admob_privacy_options;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_admob_privacy_options);
        if (r14 == null) goto L63;
        r1 = R.id.ll_aikey_set;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_aikey_set);
        if (r15 == null) goto L63;
        r1 = R.id.ll_data_save_place;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data_save_place);
        if (r16 == null) goto L63;
        r1 = R.id.ll_delete_account;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_delete_account);
        if (r17 == null) goto L63;
        r1 = R.id.ll_firmware_repair;
        LinearLayout r18 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_firmware_repair);
        if (r18 == null) goto L63;
        r1 = R.id.ll_font_repair;
        LinearLayout r19 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_font_repair);
        if (r19 == null) goto L63;
        r1 = R.id.ll_google_fit;
        LinearLayout r20 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_google_fit);
        if (r20 == null) goto L63;
        r1 = R.id.ll_google_fit_auth;
        LinearLayout r21 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_google_fit_auth);
        if (r21 == null) goto L63;
        r1 = R.id.ll_gps_firmware_repair;
        LinearLayout r22 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_gps_firmware_repair);
        if (r22 == null) goto L63;
        r1 = R.id.ll_health_connect;
        LinearLayout r23 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_health_connect);
        if (r23 == null) goto L63;
        r1 = R.id.ll_modify_password;
        LinearLayout r24 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_modify_password);
        if (r24 == null) goto L63;
        r1 = R.id.ll_ui_repair;
        LinearLayout r25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_ui_repair);
        if (r25 == null) goto L63;
        r1 = R.id.ll_zewa_fit;
        LinearLayout r26 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_zewa_fit);
        if (r26 == null) goto L63;
        r1 = R.id.notificationBarLl;
        LinearLayout r27 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.notificationBarLl);
        if (r27 == null) goto L63;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.stravaLl;
        LinearLayout r29 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stravaLl);
        if (r29 == null) goto L63;
        r1 = R.id.tv_cache_size;
        PFMedium r30 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cache_size);
        if (r30 == null) goto L63;
        r1 = R.id.tv_data_storage;
        PFMedium r31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_data_storage);
        if (r31 == null) goto L63;
        r1 = R.id.tv_map;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_map);
        if (r32 == null) goto L63;
        r1 = R.id.tv_map_right_img;
        ImageView r33 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_map_right_img);
        if (r33 == null) goto L63;
        r1 = R.id.tv_unit;
        PFMedium r34 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_unit);
        if (r34 == null) goto L63;
        return new ActivitySettingsBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r4, r29, r30, r31, r32, r33, r34);
    L63:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_settings, parent, false);
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
