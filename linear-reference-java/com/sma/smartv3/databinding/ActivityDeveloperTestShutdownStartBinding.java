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
public final class ActivityDeveloperTestShutdownStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearShutdownHistory;

    @NonNull
    public final AppCompatButton btStartShutdown;

    @NonNull
    public final AppCompatButton btStopShutdown;

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
    public final TextView tvAlreadyShutdown;

    @NonNull
    public final TextView tvSearchNumber;

    private ActivityDeveloperTestShutdownStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearShutdownHistory, @NonNull AppCompatButton btStartShutdown, @NonNull AppCompatButton btStopShutdown, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvAlreadyShutdown, @NonNull TextView tvSearchNumber) {
        this.rootView_ = rootView_;
        this.btClearShutdownHistory = btClearShutdownHistory;
        this.btStartShutdown = btStartShutdown;
        this.btStopShutdown = btStopShutdown;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvAlreadyShutdown = tvAlreadyShutdown;
        this.tvSearchNumber = tvSearchNumber;
    }

    @NonNull
    public static ActivityDeveloperTestShutdownStartBinding bind(@NonNull View rootView) {
        int r0 = R.id.bt_clear_shutdown_history;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_shutdown_history);
        if (r4 == null) goto L21;
        r0 = R.id.bt_start_shutdown;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_shutdown);
        if (r5 == null) goto L21;
        r0 = R.id.bt_stop_shutdown;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_shutdown);
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
        r0 = R.id.tv_already_shutdown;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_shutdown);
        if (r11 == null) goto L21;
        r0 = R.id.tv_search_number;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
        if (r12 == null) goto L21;
        return new ActivityDeveloperTestShutdownStartBinding(r3, r4, r5, r6, r7, r8, r9, r3, r11, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperTestShutdownStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestShutdownStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_shutdown_start, parent, false);
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
