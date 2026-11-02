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
        int r0 = R.id.bt_next;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_next);
        if (r4 == null) goto L13;
        r0 = R.id.list_view;
        ListView r5 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r5 == null) goto L13;
        r0 = R.id.tv_select;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_select);
        if (r6 == null) goto L13;
        r0 = R.id.tv_select_remind;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_select_remind);
        if (r7 == null) goto L13;
        return new ActivityDeveloperTestOtaSelectVersionListBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectVersionListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestOtaSelectVersionListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_ota_select_version_list, parent, false);
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
