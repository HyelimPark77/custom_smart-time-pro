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
        int i = R.id.bt_clear_airpressure_value_history;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_airpressure_value_history);
        if (appCompatButton != null) {
            i = R.id.bt_start_airpressure_value;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_airpressure_value);
            if (appCompatButton2 != null) {
                i = R.id.bt_stop_airpressure_value;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_airpressure_value);
                if (appCompatButton3 != null) {
                    i = R.id.cb_shutdown;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_shutdown);
                    if (checkBox != null) {
                        i = R.id.cb_skip_server;
                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_skip_server);
                        if (checkBox2 != null) {
                            i = R.id.et_airpressure_value;
                            EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_airpressure_value);
                            if (editText != null) {
                                i = R.id.et_altitude_value;
                                EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_altitude_value);
                                if (editText2 != null) {
                                    i = R.id.et_old_ble_name;
                                    EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
                                    if (editText3 != null) {
                                        i = R.id.et_signal;
                                        EditText editText4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
                                        if (editText4 != null) {
                                            i = R.id.list_view;
                                            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                                            if (listView != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                                i = R.id.tv_already_airpressure_value;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_airpressure_value);
                                                if (textView != null) {
                                                    i = R.id.tv_search_number;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                                    if (textView2 != null) {
                                                        return new ActivityDeveloperTestAirpressureValueStartBinding(relativeLayout, appCompatButton, appCompatButton2, appCompatButton3, checkBox, checkBox2, editText, editText2, editText3, editText4, listView, relativeLayout, textView, textView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestAirpressureValueStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestAirpressureValueStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_airpressure_value_start, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
