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
public final class ActivityDeveloperTuyaKeyTestBinding implements ViewBinding {

    @NonNull
    public final EditText etContent;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDeveloperTuyaKeyTestBinding(@NonNull LinearLayout rootView, @NonNull EditText etContent) {
        this.rootView = rootView;
        this.etContent = etContent;
    }

    @NonNull
    public static ActivityDeveloperTuyaKeyTestBinding bind(@NonNull View rootView) {
        EditText r1 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_content);
        if (r1 == null) goto L7;
        return new ActivityDeveloperTuyaKeyTestBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.et_content)));
    }

    @NonNull
    public static ActivityDeveloperTuyaKeyTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTuyaKeyTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_tuya_key_test, parent, false);
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
