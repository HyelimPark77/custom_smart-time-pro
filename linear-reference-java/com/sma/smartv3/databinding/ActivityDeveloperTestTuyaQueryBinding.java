package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestTuyaQueryBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnOperate;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final TextView tvCount;

    @NonNull
    public final TextView tvInfo;

    @NonNull
    public final TextView tvState;

    private ActivityDeveloperTestTuyaQueryBinding(@NonNull LinearLayout rootView_, @NonNull AppCompatButton btnOperate, @NonNull LinearLayout rootView, @NonNull TextView tvCount, @NonNull TextView tvInfo, @NonNull TextView tvState) {
        this.rootView_ = rootView_;
        this.btnOperate = btnOperate;
        this.rootView = rootView;
        this.tvCount = tvCount;
        this.tvInfo = tvInfo;
        this.tvState = tvState;
    }

    @NonNull
    public static ActivityDeveloperTestTuyaQueryBinding bind(@NonNull View rootView) {
        int r0 = R.id.btn_operate;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_operate);
        if (r4 == null) goto L13;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tvCount;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvCount);
        if (r6 == null) goto L13;
        r0 = R.id.tvInfo;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvInfo);
        if (r7 == null) goto L13;
        r0 = R.id.tvState;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvState);
        if (r8 == null) goto L13;
        return new ActivityDeveloperTestTuyaQueryBinding(r3, r4, r3, r6, r7, r8);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestTuyaQueryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestTuyaQueryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_tuya_query, parent, false);
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
