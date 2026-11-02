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
public final class ActivityDeveloperTestOtaStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearOtaHistory;

    @NonNull
    public final AppCompatButton btStartOta;

    @NonNull
    public final AppCompatButton btStopOta;

    @NonNull
    public final CheckBox cbOtaFile;

    @NonNull
    public final CheckBox cbShutdown;

    @NonNull
    public final CheckBox cbSmaDowngrade;

    @NonNull
    public final CheckBox cbSmaUpdate;

    @NonNull
    public final EditText etBufferSize;

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
    public final TextView tvAlreadyOta;

    @NonNull
    public final TextView tvSearchNumber;

    @NonNull
    public final TextView tvVersionInfo;

    private ActivityDeveloperTestOtaStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearOtaHistory, @NonNull AppCompatButton btStartOta, @NonNull AppCompatButton btStopOta, @NonNull CheckBox cbOtaFile, @NonNull CheckBox cbShutdown, @NonNull CheckBox cbSmaDowngrade, @NonNull CheckBox cbSmaUpdate, @NonNull EditText etBufferSize, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvAlreadyOta, @NonNull TextView tvSearchNumber, @NonNull TextView tvVersionInfo) {
        this.rootView_ = rootView_;
        this.btClearOtaHistory = btClearOtaHistory;
        this.btStartOta = btStartOta;
        this.btStopOta = btStopOta;
        this.cbOtaFile = cbOtaFile;
        this.cbShutdown = cbShutdown;
        this.cbSmaDowngrade = cbSmaDowngrade;
        this.cbSmaUpdate = cbSmaUpdate;
        this.etBufferSize = etBufferSize;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvAlreadyOta = tvAlreadyOta;
        this.tvSearchNumber = tvSearchNumber;
        this.tvVersionInfo = tvVersionInfo;
    }

    @NonNull
    public static ActivityDeveloperTestOtaStartBinding bind(@NonNull View rootView) {
        int i = R.id.bt_clear_ota_history;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_ota_history);
        if (appCompatButton != null) {
            i = R.id.bt_start_ota;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_ota);
            if (appCompatButton2 != null) {
                i = R.id.bt_stop_ota;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_ota);
                if (appCompatButton3 != null) {
                    i = R.id.cb_ota_file;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_ota_file);
                    if (checkBox != null) {
                        i = R.id.cb_shutdown;
                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_shutdown);
                        if (checkBox2 != null) {
                            i = R.id.cb_sma_downgrade;
                            CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_sma_downgrade);
                            if (checkBox3 != null) {
                                i = R.id.cb_sma_update;
                                CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_sma_update);
                                if (checkBox4 != null) {
                                    i = R.id.et_buffer_size;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_buffer_size);
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
                                                    i = R.id.tv_already_ota;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_ota);
                                                    if (textView != null) {
                                                        i = R.id.tv_search_number;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                                        if (textView2 != null) {
                                                            i = R.id.tv_version_info;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_version_info);
                                                            if (textView3 != null) {
                                                                return new ActivityDeveloperTestOtaStartBinding(relativeLayout, appCompatButton, appCompatButton2, appCompatButton3, checkBox, checkBox2, checkBox3, checkBox4, editText, editText2, editText3, listView, relativeLayout, textView, textView2, textView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperTestOtaStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestOtaStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_ota_start, parent, false);
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
