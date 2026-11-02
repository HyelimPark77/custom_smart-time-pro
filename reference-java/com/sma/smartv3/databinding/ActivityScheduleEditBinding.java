package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsItem;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityScheduleEditBinding implements ViewBinding {

    @NonNull
    public final EditText edtContent;

    @NonNull
    public final PFMedium edtTip;

    @NonNull
    public final AbhSettingsItem itemAdvance;

    @NonNull
    public final AbhSettingsItem itemTime;

    @NonNull
    public final AbhSettingsItem itemTitle;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityScheduleEditBinding(@NonNull LinearLayout rootView, @NonNull EditText edtContent, @NonNull PFMedium edtTip, @NonNull AbhSettingsItem itemAdvance, @NonNull AbhSettingsItem itemTime, @NonNull AbhSettingsItem itemTitle, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.edtContent = edtContent;
        this.edtTip = edtTip;
        this.itemAdvance = itemAdvance;
        this.itemTime = itemTime;
        this.itemTitle = itemTitle;
        this.root = root;
    }

    @NonNull
    public static ActivityScheduleEditBinding bind(@NonNull View rootView) {
        int i = R.id.edt_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_content);
        if (editText != null) {
            i = R.id.edt_tip;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_tip);
            if (pFMedium != null) {
                i = R.id.item_advance;
                AbhSettingsItem abhSettingsItem = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_advance);
                if (abhSettingsItem != null) {
                    i = R.id.item_time;
                    AbhSettingsItem abhSettingsItem2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time);
                    if (abhSettingsItem2 != null) {
                        i = R.id.item_title;
                        AbhSettingsItem abhSettingsItem3 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_title);
                        if (abhSettingsItem3 != null) {
                            LinearLayout linearLayout = (LinearLayout) rootView;
                            return new ActivityScheduleEditBinding(linearLayout, editText, pFMedium, abhSettingsItem, abhSettingsItem2, abhSettingsItem3, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityScheduleEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityScheduleEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_schedule_edit, parent, false);
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
