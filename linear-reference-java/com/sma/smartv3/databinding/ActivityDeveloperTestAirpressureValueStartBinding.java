package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
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
public final class ActivityDeveloperTestAirpressureValueStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearAirpressureValueHistory;

    @NonNull
    public final AppCompatButton btStartAirpressureValue;

    @NonNull
    public final AppCompatButton btStopAirpressureValue;

    @NonNull
    public final CheckBox cbShutdown;

    @NonNull
    public final CheckBox cbSkipServer;

    @NonNull
    public final EditText etAirpressureValue;

    @NonNull
    public final EditText etAltitudeValue;

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
    public final TextView tvAlreadyAirpressureValue;

    @NonNull
    public final TextView tvSearchNumber;

    private ActivityDeveloperTestAirpressureValueStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearAirpressureValueHistory, @NonNull AppCompatButton btStartAirpressureValue, @NonNull AppCompatButton btStopAirpressureValue, @NonNull CheckBox cbShutdown, @NonNull CheckBox cbSkipServer, @NonNull EditText etAirpressureValue, @NonNull EditText etAltitudeValue, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvAlreadyAirpressureValue, @NonNull TextView tvSearchNumber) {
        this.rootView_ = rootView_;
        this.btClearAirpressureValueHistory = btClearAirpressureValueHistory;
        this.btStartAirpressureValue = btStartAirpressureValue;
        this.btStopAirpressureValue = btStopAirpressureValue;
        this.cbShutdown = cbShutdown;
        this.cbSkipServer = cbSkipServer;
        this.etAirpressureValue = etAirpressureValue;
        this.etAltitudeValue = etAltitudeValue;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvAlreadyAirpressureValue = tvAlreadyAirpressureValue;
        this.tvSearchNumber = tvSearchNumber;
    }

    @NonNull
    public static ActivityDeveloperTestAirpressureValueStartBinding bind(@NonNull View rootView) {
        int r1 = R.id.bt_clear_airpressure_value_history;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_airpressure_value_history);
        if (r5 == null) goto L29;
        r1 = R.id.bt_start_airpressure_value;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_airpressure_value);
        if (r6 == null) goto L29;
        r1 = R.id.bt_stop_airpressure_value;
        AppCompatButton r7 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_airpressure_value);
        if (r7 == null) goto L29;
        r1 = R.id.cb_shutdown;
        CheckBox r8 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_shutdown);
        if (r8 == null) goto L29;
        r1 = R.id.cb_skip_server;
        CheckBox r9 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_skip_server);
        if (r9 == null) goto L29;
        r1 = R.id.et_airpressure_value;
        EditText r10 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_airpressure_value);
        if (r10 == null) goto L29;
        r1 = R.id.et_altitude_value;
        EditText r11 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_altitude_value);
        if (r11 == null) goto L29;
        r1 = R.id.et_old_ble_name;
        EditText r12 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
        if (r12 == null) goto L29;
        r1 = R.id.et_signal;
        EditText r13 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
        if (r13 == null) goto L29;
        r1 = R.id.list_view;
        ListView r14 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r14 == null) goto L29;
        RelativeLayout r4 = (RelativeLayout) rootView;
        r1 = R.id.tv_already_airpressure_value;
        TextView r16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_airpressure_value);
        if (r16 == null) goto L29;
        r1 = R.id.tv_search_number;
        TextView r17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
        if (r17 == null) goto L29;
        return new ActivityDeveloperTestAirpressureValueStartBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r4, r16, r17);
    L29:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityDeveloperTestAirpressureValueStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestAirpressureValueStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_airpressure_value_start, parent, false);
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
