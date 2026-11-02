package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestBoxBinding implements ViewBinding {

    @NonNull
    public final EditText etPassword;

    @NonNull
    public final EditText etSsid;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatSpinner spTestMode;

    @NonNull
    public final TextView tvConnectInfo;

    @NonNull
    public final TextView tvInfo;

    private ActivityDeveloperTestBoxBinding(@NonNull LinearLayout rootView, @NonNull EditText etPassword, @NonNull EditText etSsid, @NonNull AppCompatSpinner spTestMode, @NonNull TextView tvConnectInfo, @NonNull TextView tvInfo) {
        this.rootView = rootView;
        this.etPassword = etPassword;
        this.etSsid = etSsid;
        this.spTestMode = spTestMode;
        this.tvConnectInfo = tvConnectInfo;
        this.tvInfo = tvInfo;
    }

    @NonNull
    public static ActivityDeveloperTestBoxBinding bind(@NonNull View rootView) {
        int r0 = R.id.et_password;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_password);
        if (r4 == null) goto L15;
        r0 = R.id.et_ssid;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_ssid);
        if (r5 == null) goto L15;
        r0 = R.id.sp_test_mode;
        AppCompatSpinner r6 = (AppCompatSpinner) ViewBindings.findChildViewById(rootView, R.id.sp_test_mode);
        if (r6 == null) goto L15;
        r0 = R.id.tv_connect_info;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_connect_info);
        if (r7 == null) goto L15;
        r0 = R.id.tv_info;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
        if (r8 == null) goto L15;
        return new ActivityDeveloperTestBoxBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestBoxBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestBoxBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_box, parent, false);
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
