package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperSmsTestBinding implements ViewBinding {

    @NonNull
    public final EditText etContent;

    @NonNull
    public final EditText etPhone;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatSpinner spSims;

    private ActivityDeveloperSmsTestBinding(@NonNull LinearLayout rootView, @NonNull EditText etContent, @NonNull EditText etPhone, @NonNull AppCompatSpinner spSims) {
        this.rootView = rootView;
        this.etContent = etContent;
        this.etPhone = etPhone;
        this.spSims = spSims;
    }

    @NonNull
    public static ActivityDeveloperSmsTestBinding bind(@NonNull View rootView) {
        int r0 = R.id.et_content;
        EditText r1 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_content);
        if (r1 == null) goto L11;
        r0 = R.id.et_phone;
        EditText r2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_phone);
        if (r2 == null) goto L11;
        r0 = R.id.sp_sims;
        AppCompatSpinner r3 = (AppCompatSpinner) ViewBindings.findChildViewById(rootView, R.id.sp_sims);
        if (r3 == null) goto L11;
        return new ActivityDeveloperSmsTestBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperSmsTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperSmsTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_sms_test, parent, false);
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
