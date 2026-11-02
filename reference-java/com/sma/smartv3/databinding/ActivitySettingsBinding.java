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
        int i = R.id.bt_setting_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.bt_setting_button);
        if (button != null) {
            i = R.id.check_data_auto_sync;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_data_auto_sync);
            if (appCompatCheckBox != null) {
                i = R.id.check_fitbit;
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_fitbit);
                if (appCompatCheckBox2 != null) {
                    i = R.id.check_google_fit;
                    AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_google_fit);
                    if (appCompatCheckBox3 != null) {
                        i = R.id.check_notification_bar;
                        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_notification_bar);
                        if (appCompatCheckBox4 != null) {
                            i = R.id.check_strava;
                            AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_strava);
                            if (appCompatCheckBox5 != null) {
                                i = R.id.check_zewa_fit;
                                AppCompatCheckBox appCompatCheckBox6 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_zewa_fit);
                                if (appCompatCheckBox6 != null) {
                                    i = R.id.fitbitLl;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.fitbitLl);
                                    if (linearLayout != null) {
                                        i = R.id.ivRemind;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivRemind);
                                        if (imageView != null) {
                                            i = R.id.ll_admob_privacy_options;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_admob_privacy_options);
                                            if (linearLayout2 != null) {
                                                i = R.id.ll_aikey_set;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_aikey_set);
                                                if (linearLayout3 != null) {
                                                    i = R.id.ll_data_save_place;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data_save_place);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.ll_delete_account;
                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_delete_account);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.ll_firmware_repair;
                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_firmware_repair);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.ll_font_repair;
                                                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_font_repair);
                                                                if (linearLayout7 != null) {
                                                                    i = R.id.ll_google_fit;
                                                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_google_fit);
                                                                    if (linearLayout8 != null) {
                                                                        i = R.id.ll_google_fit_auth;
                                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_google_fit_auth);
                                                                        if (linearLayout9 != null) {
                                                                            i = R.id.ll_gps_firmware_repair;
                                                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_gps_firmware_repair);
                                                                            if (linearLayout10 != null) {
                                                                                i = R.id.ll_health_connect;
                                                                                LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_health_connect);
                                                                                if (linearLayout11 != null) {
                                                                                    i = R.id.ll_modify_password;
                                                                                    LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_modify_password);
                                                                                    if (linearLayout12 != null) {
                                                                                        i = R.id.ll_ui_repair;
                                                                                        LinearLayout linearLayout13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_ui_repair);
                                                                                        if (linearLayout13 != null) {
                                                                                            i = R.id.ll_zewa_fit;
                                                                                            LinearLayout linearLayout14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_zewa_fit);
                                                                                            if (linearLayout14 != null) {
                                                                                                i = R.id.notificationBarLl;
                                                                                                LinearLayout linearLayout15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.notificationBarLl);
                                                                                                if (linearLayout15 != null) {
                                                                                                    LinearLayout linearLayout16 = (LinearLayout) rootView;
                                                                                                    i = R.id.stravaLl;
                                                                                                    LinearLayout linearLayout17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.stravaLl);
                                                                                                    if (linearLayout17 != null) {
                                                                                                        i = R.id.tv_cache_size;
                                                                                                        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_cache_size);
                                                                                                        if (pFMedium != null) {
                                                                                                            i = R.id.tv_data_storage;
                                                                                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_data_storage);
                                                                                                            if (pFMedium2 != null) {
                                                                                                                i = R.id.tv_map;
                                                                                                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_map);
                                                                                                                if (pFMedium3 != null) {
                                                                                                                    i = R.id.tv_map_right_img;
                                                                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_map_right_img);
                                                                                                                    if (imageView2 != null) {
                                                                                                                        i = R.id.tv_unit;
                                                                                                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_unit);
                                                                                                                        if (pFMedium4 != null) {
                                                                                                                            return new ActivitySettingsBinding(linearLayout16, button, appCompatCheckBox, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox4, appCompatCheckBox5, appCompatCheckBox6, linearLayout, imageView, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15, linearLayout16, linearLayout17, pFMedium, pFMedium2, pFMedium3, imageView2, pFMedium4);
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
    public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_settings, parent, false);
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
