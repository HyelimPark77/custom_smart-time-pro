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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperOtaFromConfigBinding implements ViewBinding {

    @NonNull
    public final EditText etContent;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDeveloperOtaFromConfigBinding(@NonNull LinearLayout rootView, @NonNull EditText etContent) {
        this.rootView = rootView;
        this.etContent = etContent;
    }

    @NonNull
    public static ActivityDeveloperOtaFromConfigBinding bind(@NonNull View rootView) {
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_content);
        if (editText != null) {
            return new ActivityDeveloperOtaFromConfigBinding((LinearLayout) rootView, editText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.et_content)));
    }

    @NonNull
    public static ActivityDeveloperOtaFromConfigBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperOtaFromConfigBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_ota_from_config, parent, false);
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
