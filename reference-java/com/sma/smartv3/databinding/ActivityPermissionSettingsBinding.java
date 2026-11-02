package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityPermissionSettingsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llActivityPermissions;

    @NonNull
    public final LinearLayout llAdjustMediaVolumePermissions;

    @NonNull
    public final LinearLayout llBackgroundPermissions;

    @NonNull
    public final LinearLayout llBatteryPermissions;

    @NonNull
    public final LinearLayout llContactsPermissions;

    @NonNull
    public final LinearLayout llLocationPermissions;

    @NonNull
    public final LinearLayout llNotificationPermissions;

    @NonNull
    public final LinearLayout llPermissionsTip;

    @NonNull
    public final LinearLayout llPermissionsTipAll;

    @NonNull
    public final LinearLayout llPhonePermissions;

    @NonNull
    public final LinearLayout llSmsPermissions;

    @NonNull
    public final LinearLayout llStorePermissions;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvActivityState;

    @NonNull
    public final PFMedium tvBatteryState;

    @NonNull
    public final PFMedium tvContactState;

    @NonNull
    public final PFMedium tvLocationPermissionsText;

    @NonNull
    public final PFMedium tvLocationState;

    @NonNull
    public final PFMedium tvNotificationState;

    @NonNull
    public final PFMedium tvPhoneState;

    @NonNull
    public final PFMedium tvSmsState;

    @NonNull
    public final PFMedium tvStoreState;

    private ActivityPermissionSettingsBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout llActivityPermissions, @NonNull LinearLayout llAdjustMediaVolumePermissions, @NonNull LinearLayout llBackgroundPermissions, @NonNull LinearLayout llBatteryPermissions, @NonNull LinearLayout llContactsPermissions, @NonNull LinearLayout llLocationPermissions, @NonNull LinearLayout llNotificationPermissions, @NonNull LinearLayout llPermissionsTip, @NonNull LinearLayout llPermissionsTipAll, @NonNull LinearLayout llPhonePermissions, @NonNull LinearLayout llSmsPermissions, @NonNull LinearLayout llStorePermissions, @NonNull LinearLayout rootView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvActivityState, @NonNull PFMedium tvBatteryState, @NonNull PFMedium tvContactState, @NonNull PFMedium tvLocationPermissionsText, @NonNull PFMedium tvLocationState, @NonNull PFMedium tvNotificationState, @NonNull PFMedium tvPhoneState, @NonNull PFMedium tvSmsState, @NonNull PFMedium tvStoreState) {
        this.rootView_ = rootView_;
        this.llActivityPermissions = llActivityPermissions;
        this.llAdjustMediaVolumePermissions = llAdjustMediaVolumePermissions;
        this.llBackgroundPermissions = llBackgroundPermissions;
        this.llBatteryPermissions = llBatteryPermissions;
        this.llContactsPermissions = llContactsPermissions;
        this.llLocationPermissions = llLocationPermissions;
        this.llNotificationPermissions = llNotificationPermissions;
        this.llPermissionsTip = llPermissionsTip;
        this.llPermissionsTipAll = llPermissionsTipAll;
        this.llPhonePermissions = llPhonePermissions;
        this.llSmsPermissions = llSmsPermissions;
        this.llStorePermissions = llStorePermissions;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvActivityState = tvActivityState;
        this.tvBatteryState = tvBatteryState;
        this.tvContactState = tvContactState;
        this.tvLocationPermissionsText = tvLocationPermissionsText;
        this.tvLocationState = tvLocationState;
        this.tvNotificationState = tvNotificationState;
        this.tvPhoneState = tvPhoneState;
        this.tvSmsState = tvSmsState;
        this.tvStoreState = tvStoreState;
    }

    @NonNull
    public static ActivityPermissionSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.ll_activity_permissions;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_activity_permissions);
        if (linearLayout != null) {
            i = R.id.ll_adjust_media_volume_permissions;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_adjust_media_volume_permissions);
            if (linearLayout2 != null) {
                i = R.id.ll_background_permissions;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_background_permissions);
                if (linearLayout3 != null) {
                    i = R.id.ll_battery_permissions;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_battery_permissions);
                    if (linearLayout4 != null) {
                        i = R.id.ll_contacts_permissions;
                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_contacts_permissions);
                        if (linearLayout5 != null) {
                            i = R.id.ll_location_permissions;
                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_location_permissions);
                            if (linearLayout6 != null) {
                                i = R.id.ll_notification_permissions;
                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_notification_permissions);
                                if (linearLayout7 != null) {
                                    i = R.id.ll_permissions_tip;
                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_permissions_tip);
                                    if (linearLayout8 != null) {
                                        i = R.id.ll_permissions_tip_all;
                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_permissions_tip_all);
                                        if (linearLayout9 != null) {
                                            i = R.id.ll_phone_permissions;
                                            LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_phone_permissions);
                                            if (linearLayout10 != null) {
                                                i = R.id.ll_sms_permissions;
                                                LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_sms_permissions);
                                                if (linearLayout11 != null) {
                                                    i = R.id.ll_store_permissions;
                                                    LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_store_permissions);
                                                    if (linearLayout12 != null) {
                                                        LinearLayout linearLayout13 = (LinearLayout) rootView;
                                                        i = R.id.scrollView;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                                        if (nestedScrollView != null) {
                                                            i = R.id.tv_activityState;
                                                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_activityState);
                                                            if (pFMedium != null) {
                                                                i = R.id.tv_batteryState;
                                                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_batteryState);
                                                                if (pFMedium2 != null) {
                                                                    i = R.id.tv_contactState;
                                                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_contactState);
                                                                    if (pFMedium3 != null) {
                                                                        i = R.id.tv_location_permissions_text;
                                                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_location_permissions_text);
                                                                        if (pFMedium4 != null) {
                                                                            i = R.id.tv_locationState;
                                                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_locationState);
                                                                            if (pFMedium5 != null) {
                                                                                i = R.id.tv_notificationState;
                                                                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_notificationState);
                                                                                if (pFMedium6 != null) {
                                                                                    i = R.id.tv_phoneState;
                                                                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_phoneState);
                                                                                    if (pFMedium7 != null) {
                                                                                        i = R.id.tv_smsState;
                                                                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_smsState);
                                                                                        if (pFMedium8 != null) {
                                                                                            i = R.id.tv_storeState;
                                                                                            PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_storeState);
                                                                                            if (pFMedium9 != null) {
                                                                                                return new ActivityPermissionSettingsBinding(linearLayout13, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, nestedScrollView, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9);
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
    public static ActivityPermissionSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPermissionSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_permission_settings, parent, false);
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
