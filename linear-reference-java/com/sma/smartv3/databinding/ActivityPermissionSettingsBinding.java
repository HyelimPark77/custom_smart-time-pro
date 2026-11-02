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
        int r1 = R.id.ll_activity_permissions;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_activity_permissions);
        if (r5 == null) goto L49;
        r1 = R.id.ll_adjust_media_volume_permissions;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_adjust_media_volume_permissions);
        if (r6 == null) goto L49;
        r1 = R.id.ll_background_permissions;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_background_permissions);
        if (r7 == null) goto L49;
        r1 = R.id.ll_battery_permissions;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_battery_permissions);
        if (r8 == null) goto L49;
        r1 = R.id.ll_contacts_permissions;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_contacts_permissions);
        if (r9 == null) goto L49;
        r1 = R.id.ll_location_permissions;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_location_permissions);
        if (r10 == null) goto L49;
        r1 = R.id.ll_notification_permissions;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_notification_permissions);
        if (r11 == null) goto L49;
        r1 = R.id.ll_permissions_tip;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_permissions_tip);
        if (r12 == null) goto L49;
        r1 = R.id.ll_permissions_tip_all;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_permissions_tip_all);
        if (r13 == null) goto L49;
        r1 = R.id.ll_phone_permissions;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_phone_permissions);
        if (r14 == null) goto L49;
        r1 = R.id.ll_sms_permissions;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_sms_permissions);
        if (r15 == null) goto L49;
        r1 = R.id.ll_store_permissions;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_store_permissions);
        if (r16 == null) goto L49;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.scrollView;
        NestedScrollView r18 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r18 == null) goto L49;
        r1 = R.id.tv_activityState;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_activityState);
        if (r19 == null) goto L49;
        r1 = R.id.tv_batteryState;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_batteryState);
        if (r20 == null) goto L49;
        r1 = R.id.tv_contactState;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_contactState);
        if (r21 == null) goto L49;
        r1 = R.id.tv_location_permissions_text;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_location_permissions_text);
        if (r22 == null) goto L49;
        r1 = R.id.tv_locationState;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_locationState);
        if (r23 == null) goto L49;
        r1 = R.id.tv_notificationState;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_notificationState);
        if (r24 == null) goto L49;
        r1 = R.id.tv_phoneState;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_phoneState);
        if (r25 == null) goto L49;
        r1 = R.id.tv_smsState;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_smsState);
        if (r26 == null) goto L49;
        r1 = R.id.tv_storeState;
        PFMedium r27 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_storeState);
        if (r27 == null) goto L49;
        return new ActivityPermissionSettingsBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r4, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
    L49:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityPermissionSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityPermissionSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_permission_settings, parent, false);
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
