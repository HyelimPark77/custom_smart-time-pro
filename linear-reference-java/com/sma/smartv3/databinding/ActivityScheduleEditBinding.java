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
        int r0 = R.id.edt_content;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.edt_content);
        if (r4 == null) goto L15;
        r0 = R.id.edt_tip;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.edt_tip);
        if (r5 == null) goto L15;
        r0 = R.id.item_advance;
        AbhSettingsItem r6 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_advance);
        if (r6 == null) goto L15;
        r0 = R.id.item_time;
        AbhSettingsItem r7 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_time);
        if (r7 == null) goto L15;
        r0 = R.id.item_title;
        AbhSettingsItem r8 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_title);
        if (r8 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityScheduleEditBinding(r3, r4, r5, r6, r7, r8, r3);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityScheduleEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityScheduleEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_schedule_edit, parent, false);
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
