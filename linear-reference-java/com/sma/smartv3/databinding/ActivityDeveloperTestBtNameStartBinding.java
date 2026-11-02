package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperTestBtNameStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearBtNameHistory;

    @NonNull
    public final AppCompatButton btStartBtName;

    @NonNull
    public final AppCompatButton btStopBtName;

    @NonNull
    public final EditText etBtName;

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

    @NonNull
    public final TextView tvAlreadyBtName;

    @NonNull
    public final TextView tvSearchNumber;

    private ActivityDeveloperTestBtNameStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearBtNameHistory, @NonNull AppCompatButton btStartBtName, @NonNull AppCompatButton btStopBtName, @NonNull EditText etBtName, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvAlreadyBtName, @NonNull TextView tvSearchNumber) {
        this.rootView_ = rootView_;
        this.btClearBtNameHistory = btClearBtNameHistory;
        this.btStartBtName = btStartBtName;
        this.btStopBtName = btStopBtName;
        this.etBtName = etBtName;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvAlreadyBtName = tvAlreadyBtName;
        this.tvSearchNumber = tvSearchNumber;
    }

    @NonNull
    public static ActivityDeveloperTestBtNameStartBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_clear_bt_name_history;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_bt_name_history);
        if (r4 == null) goto L23;
        r0 = R.id.bt_start_bt_name;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_bt_name);
        if (r5 == null) goto L23;
        r0 = R.id.bt_stop_bt_name;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_bt_name);
        if (r6 == null) goto L23;
        r0 = R.id.et_bt_name;
        EditText r7 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_bt_name);
        if (r7 == null) goto L23;
        r0 = R.id.et_old_ble_name;
        EditText r8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
        if (r8 == null) goto L23;
        r0 = R.id.et_signal;
        EditText r9 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
        if (r9 == null) goto L23;
        r0 = R.id.list_view;
        ListView r10 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r10 == null) goto L23;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.tv_already_bt_name;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_bt_name);
        if (r12 == null) goto L23;
        r0 = R.id.tv_search_number;
        TextView r13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
        if (r13 == null) goto L23;
        return new ActivityDeveloperTestBtNameStartBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3, r12, r13);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestBtNameStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestBtNameStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_bt_name_start, parent, false);
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
