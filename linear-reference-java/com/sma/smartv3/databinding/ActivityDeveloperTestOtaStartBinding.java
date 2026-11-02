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
        int r1 = R.id.bt_clear_ota_history;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_ota_history);
        if (r5 == null) goto L33;
        r1 = R.id.bt_start_ota;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_ota);
        if (r6 == null) goto L33;
        r1 = R.id.bt_stop_ota;
        AppCompatButton r7 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_ota);
        if (r7 == null) goto L33;
        r1 = R.id.cb_ota_file;
        CheckBox r8 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_ota_file);
        if (r8 == null) goto L33;
        r1 = R.id.cb_shutdown;
        CheckBox r9 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_shutdown);
        if (r9 == null) goto L33;
        r1 = R.id.cb_sma_downgrade;
        CheckBox r10 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_sma_downgrade);
        if (r10 == null) goto L33;
        r1 = R.id.cb_sma_update;
        CheckBox r11 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_sma_update);
        if (r11 == null) goto L33;
        r1 = R.id.et_buffer_size;
        EditText r12 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_buffer_size);
        if (r12 == null) goto L33;
        r1 = R.id.et_old_ble_name;
        EditText r13 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
        if (r13 == null) goto L33;
        r1 = R.id.et_signal;
        EditText r14 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
        if (r14 == null) goto L33;
        r1 = R.id.list_view;
        ListView r15 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r15 == null) goto L33;
        RelativeLayout r4 = (RelativeLayout) rootView;
        r1 = R.id.tv_already_ota;
        TextView r17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_ota);
        if (r17 == null) goto L33;
        r1 = R.id.tv_search_number;
        TextView r18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
        if (r18 == null) goto L33;
        r1 = R.id.tv_version_info;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_version_info);
        if (r19 == null) goto L33;
        return new ActivityDeveloperTestOtaStartBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r17, r18, r19);
    L33:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityDeveloperTestOtaStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperTestOtaStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_test_ota_start, parent, false);
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
