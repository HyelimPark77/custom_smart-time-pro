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
        int i = R.id.et_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_content);
        if (editText != null) {
            i = R.id.et_phone;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_phone);
            if (editText2 != null) {
                i = R.id.sp_sims;
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) ViewBindings.findChildViewById(rootView, R.id.sp_sims);
                if (appCompatSpinner != null) {
                    return new ActivityDeveloperSmsTestBinding((LinearLayout) rootView, editText, editText2, appCompatSpinner);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperSmsTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperSmsTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_sms_test, parent, false);
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
