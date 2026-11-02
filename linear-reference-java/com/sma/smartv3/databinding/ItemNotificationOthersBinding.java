package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class ItemNotificationOthersBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkEnabled;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvName;

    private ItemNotificationOthersBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkEnabled, @NonNull ImageView ivIcon, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.checkEnabled = checkEnabled;
        this.ivIcon = ivIcon;
        this.tvName = tvName;
    }

    @NonNull
    public static ItemNotificationOthersBinding bind(@NonNull View rootView) {
        int r0 = R.id.check_enabled;
        AppCompatCheckBox r1 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_enabled);
        if (r1 == null) goto L11;
        r0 = R.id.iv_icon;
        ImageView r2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_icon);
        if (r2 == null) goto L11;
        r0 = R.id.tv_name;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r3 == null) goto L11;
        return new ItemNotificationOthersBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemNotificationOthersBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemNotificationOthersBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_notification_others, parent, false);
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
