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
        int i = R.id.btn_operate;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_operate);
        if (appCompatButton != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.tvCount;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvCount);
            if (textView != null) {
                i = R.id.tvInfo;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvInfo);
                if (textView2 != null) {
                    i = R.id.tvState;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvState);
                    if (textView3 != null) {
                        return new ActivityDeveloperTestTuyaQueryBinding(linearLayout, appCompatButton, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestTuyaQueryBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestTuyaQueryBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_tuya_query, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
