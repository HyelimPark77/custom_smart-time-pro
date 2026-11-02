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
        int i = R.id.item_header;
        AbhSettingsHeader abhSettingsHeader = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (abhSettingsHeader != null) {
            i = R.id.item_hijri_date_correct;
            AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_hijri_date_correct);
            if (abhSettingsItem != null) {
                i = R.id.item_juristic_set;
                AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_juristic_set);
                if (abhSettingsItem2 != null) {
                    i = R.id.item_method_set;
                    AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_method_set);
                    if (abhSettingsItem3 != null) {
                        i = R.id.item_reminder;
                        AbhSettingsItem abhSettingsItem4 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_reminder);
                        if (abhSettingsItem4 != null) {
                            i = R.id.item_renewal;
                            AbhSettingsItem abhSettingsItem5 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_renewal);
                            if (abhSettingsItem5 != null) {
                                i = R.id.item_time_correct;
                                AbhSettingsItem abhSettingsItem6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time_correct);
                                if (abhSettingsItem6 != null) {
                                    LinearLayout linearLayout = (LinearLayout) rootView;
                                    return new ActivityQiblaSettingsBinding(linearLayout, abhSettingsHeader, abhSettingsItem, abhSettingsItem2, abhSettingsItem3, abhSettingsItem4, abhSettingsItem5, abhSettingsItem6, linearLayout);
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
    public static ActivityQiblaSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQiblaSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qibla_settings, parent, false);
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
