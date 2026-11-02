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
public final class ActivityDeveloperTestBleAddressSetStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btStartSet;

    @NonNull
    public final AppCompatButton btStopSet;

    @NonNull
    public final CheckBox cbAlipay;

    @NonNull
    public final EditText etAddress;

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
    public final TextView tvSearchNumber;

    private ActivityDeveloperTestBleAddressSetStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btStartSet, @NonNull AppCompatButton btStopSet, @NonNull CheckBox cbAlipay, @NonNull EditText etAddress, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvSearchNumber) {
        this.rootView_ = rootView_;
        this.btStartSet = btStartSet;
        this.btStopSet = btStopSet;
        this.cbAlipay = cbAlipay;
        this.etAddress = etAddress;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvSearchNumber = tvSearchNumber;
    }

    @NonNull
    public static ActivityDeveloperTestBleAddressSetStartBinding bind(@NonNull View rootView) {
        int i = R.id.bt_start_set;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_set);
        if (appCompatButton != null) {
            i = R.id.bt_stop_set;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_set);
            if (appCompatButton2 != null) {
                i = R.id.cb_alipay;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_alipay);
                if (checkBox != null) {
                    i = R.id.et_address;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_address);
                    if (editText != null) {
                        i = R.id.et_old_ble_name;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
                        if (editText2 != null) {
                            i = R.id.et_signal;
                            EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
                            if (editText3 != null) {
                                i = R.id.list_view;
                                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                                if (listView != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                    i = R.id.tv_search_number;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                    if (textView != null) {
                                        return new ActivityDeveloperTestBleAddressSetStartBinding(relativeLayout, appCompatButton, appCompatButton2, checkBox, editText, editText2, editText3, listView, relativeLayout, textView);
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
    public static ActivityDeveloperTestBleAddressSetStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestBleAddressSetStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_ble_address_set_start, parent, false);
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
