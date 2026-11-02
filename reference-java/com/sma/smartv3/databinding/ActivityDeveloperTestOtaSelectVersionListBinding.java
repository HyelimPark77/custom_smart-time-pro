package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestOtaSelectVersionListBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btNext;

    @NonNull
    public final ListView listView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvSelect;

    @NonNull
    public final TextView tvSelectRemind;

    private ActivityDeveloperTestOtaSelectVersionListBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btNext, @NonNull ListView listView, @NonNull TextView tvSelect, @NonNull TextView tvSelectRemind) {
        this.rootView = rootView;
        this.btNext = btNext;
        this.listView = listView;
        this.tvSelect = tvSelect;
        this.tvSelectRemind = tvSelectRemind;
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectVersionListBinding bind(@NonNull View rootView) {
        int i = R.id.bt_next;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_next);
        if (appCompatButton != null) {
            i = R.id.list_view;
            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (listView != null) {
                i = R.id.tv_select;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_select);
                if (textView != null) {
                    i = R.id.tv_select_remind;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_select_remind);
                    if (textView2 != null) {
                        return new ActivityDeveloperTestOtaSelectVersionListBinding((LinearLayout) rootView, appCompatButton, listView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectVersionListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectVersionListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_ota_select_version_list, parent, false);
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
