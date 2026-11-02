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
public final class ActivityWatchPasswordBinding implements ViewBinding {

    @NonNull
    public final AbhSettingsHeader itemHeader;

    @NonNull
    public final AbhSettingsItem itemResetPassword;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityWatchPasswordBinding(@NonNull LinearLayout rootView_, @NonNull AbhSettingsHeader itemHeader, @NonNull AbhSettingsItem itemResetPassword, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.itemHeader = itemHeader;
        this.itemResetPassword = itemResetPassword;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityWatchPasswordBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_header;
        AbhSettingsHeader r1 = (AbhSettingsHeader) ViewBindings.findChildViewById(rootView, R.id.item_header);
        if (r1 == null) goto L9;
        r0 = R.id.item_reset_password;
        AbhSettingsItem r2 = (AbhSettingsItem) ViewBindings.findChildViewById(rootView, R.id.item_reset_password);
        if (r2 == null) goto L9;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityWatchPasswordBinding(r3, r1, r2, r3);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityWatchPasswordBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWatchPasswordBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_watch_password, parent, false);
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
