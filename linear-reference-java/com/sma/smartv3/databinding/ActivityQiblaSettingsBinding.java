package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQiblaSettingsBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsItem itemHijriDateCorrect;

    @NonNull
    public final AbhSettingsItem itemJuristicSet;

    @NonNull
    public final AbhSettingsItem itemMethodSet;

    @NonNull
    public final AbhSettingsItem itemReminder;

    @NonNull
    public final AbhSettingsItem itemRenewal;

    @NonNull
    public final AbhSettingsItem itemTimeCorrect;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityQiblaSettingsBinding(@NonNull LinearLayout rootView, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemHijriDateCorrect, @NonNull AbhSettingsItem itemJuristicSet, @NonNull AbhSettingsItem itemMethodSet, @NonNull AbhSettingsItem itemReminder, @NonNull AbhSettingsItem itemRenewal, @NonNull AbhSettingsItem itemTimeCorrect, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.itemHeader = itemHeader;
        this.itemHijriDateCorrect = itemHijriDateCorrect;
        this.itemJuristicSet = itemJuristicSet;
        this.itemMethodSet = itemMethodSet;
        this.itemReminder = itemReminder;
        this.itemRenewal = itemRenewal;
        this.itemTimeCorrect = itemTimeCorrect;
        this.root = root;
    }

    @NonNull
    public static ActivityQiblaSettingsBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_header;
        AbhSettingsHeader r4 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r4 == null) goto L19;
        r0 = R.id.item_hijri_date_correct;
        AbhSettingsItem r5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_hijri_date_correct);
        if (r5 == null) goto L19;
        r0 = R.id.item_juristic_set;
        AbhSettingsItem r6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_juristic_set);
        if (r6 == null) goto L19;
        r0 = R.id.item_method_set;
        AbhSettingsItem r7 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_method_set);
        if (r7 == null) goto L19;
        r0 = R.id.item_reminder;
        AbhSettingsItem r8 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_reminder);
        if (r8 == null) goto L19;
        r0 = R.id.item_renewal;
        AbhSettingsItem r9 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_renewal);
        if (r9 == null) goto L19;
        r0 = R.id.item_time_correct;
        AbhSettingsItem r10 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_correct);
        if (r10 == null) goto L19;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityQiblaSettingsBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityQiblaSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityQiblaSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_qibla_settings, parent, false);
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
