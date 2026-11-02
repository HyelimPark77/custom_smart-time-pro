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
        int i = R.id.bt_clear_readLog_history;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_readLog_history);
        if (appCompatButton != null) {
            i = R.id.bt_start_readLog;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_readLog);
            if (appCompatButton2 != null) {
                i = R.id.bt_stop_readLog;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_readLog);
                if (appCompatButton3 != null) {
                    i = R.id.et_old_ble_name;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_old_ble_name);
                    if (editText != null) {
                        i = R.id.et_signal;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_signal);
                        if (editText2 != null) {
                            i = R.id.list_view;
                            ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                            if (listView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) rootView;
                                i = R.id.tv_already_readLog;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_readLog);
                                if (textView != null) {
                                    i = R.id.tv_search_number;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                    if (textView2 != null) {
                                        return new ActivityDeveloperTestReadlogStartBinding(relativeLayout, appCompatButton, appCompatButton2, appCompatButton3, editText, editText2, listView, relativeLayout, textView, textView2);
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
    public static ActivityDeveloperTestReadlogStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestReadlogStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_readlog_start, parent, false);
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
