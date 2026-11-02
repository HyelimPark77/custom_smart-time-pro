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
public final class ActivityDeveloperTestReadlogStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearReadLogHistory;

    @NonNull
    public final AppCompatButton btStartReadLog;

    @NonNull
    public final AppCompatButton btStopReadLog;

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
    public final TextView tvAlreadyReadLog;

    @NonNull
    public final TextView tvSearchNumber;

    private ActivityDeveloperTestReadlogStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearReadLogHistory, @NonNull AppCompatButton btStartReadLog, @NonNull AppCompatButton btStopReadLog, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvAlreadyReadLog, @NonNull TextView tvSearchNumber) {
        this.rootView_ = rootView_;
        this.btClearReadLogHistory = btClearReadLogHistory;
        this.btStartReadLog = btStartReadLog;
        this.btStopReadLog = btStopReadLog;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvAlreadyReadLog = tvAlreadyReadLog;
        this.tvSearchNumber = tvSearchNumber;
    }

    @NonNull
    public static ActivityDeveloperTestReadlogStartBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_clear_readLog_history;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_readLog_history);
        if (r4 == null) goto L21;
        r0 = R.id.bt_start_readLog;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_readLog);
        if (r5 == null) goto L21;
        r0 = R.id.bt_stop_readLog;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_readLog);
        if (r6 == null) goto L21;
        r0 = R.id.et_old_ble_name;
        EditText r7 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
        if (r7 == null) goto L21;
        r0 = R.id.et_signal;
        EditText r8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
        if (r8 == null) goto L21;
        r0 = R.id.list_view;
        ListView r9 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r9 == null) goto L21;
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.tv_already_readLog;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_readLog);
        if (r11 == null) goto L21;
        r0 = R.id.tv_search_number;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
        if (r12 == null) goto L21;
        return new ActivityDeveloperTestReadlogStartBinding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestReadlogStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestReadlogStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_readlog_start, parent, false);
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
