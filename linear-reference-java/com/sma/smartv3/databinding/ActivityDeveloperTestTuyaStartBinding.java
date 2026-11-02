package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestTuyaStartBinding implements ViewBinding {

    @NonNull
    public final EditText etOldBleName;

    @NonNull
    public final EditText etSignal;

    @NonNull
    public final ListView listView;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    private ActivityDeveloperTestTuyaStartBinding(@NonNull RelativeLayout rootView_, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView) {
        this.rootView_ = rootView_;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityDeveloperTestTuyaStartBinding bind(@NonNull View rootView) {
        int r0 = R.id.et_old_ble_name;
        EditText r4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
        if (r4 == null) goto L11;
        r0 = R.id.et_signal;
        EditText r5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
        if (r5 == null) goto L11;
        r0 = R.id.list_view;
        ListView r6 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r6 == null) goto L11;
        RelativeLayout r3 = (RelativeLayout) rootView;
        return new ActivityDeveloperTestTuyaStartBinding(r3, r4, r5, r6, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestTuyaStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestTuyaStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_tuya_start, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
