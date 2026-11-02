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
        int i = R.id.et_password;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_password);
        if (editText != null) {
            i = R.id.et_ssid;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_ssid);
            if (editText2 != null) {
                i = R.id.sp_test_mode;
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) ViewBindings.findChildViewById(rootView, R.id.sp_test_mode);
                if (appCompatSpinner != null) {
                    i = R.id.tv_connect_info;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_connect_info);
                    if (textView != null) {
                        i = R.id.tv_info;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
                        if (textView2 != null) {
                            return new ActivityDeveloperTestBoxBinding((LinearLayout) rootView, editText, editText2, appCompatSpinner, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestBoxBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestBoxBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_box, parent, false);
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
