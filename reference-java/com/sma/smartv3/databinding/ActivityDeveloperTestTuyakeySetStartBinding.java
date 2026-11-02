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
public final class ActivityDeveloperTestTuyakeySetStartBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearHistory;

    @NonNull
    public final AppCompatButton btStartSet;

    @NonNull
    public final AppCompatButton btStopSet;

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

    @NonNull
    public final TextView tvValue;

    private ActivityDeveloperTestTuyakeySetStartBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearHistory, @NonNull AppCompatButton btStartSet, @NonNull AppCompatButton btStopSet, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvSearchNumber, @NonNull TextView tvValue) {
        this.rootView_ = rootView_;
        this.btClearHistory = btClearHistory;
        this.btStartSet = btStartSet;
        this.btStopSet = btStopSet;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvSearchNumber = tvSearchNumber;
        this.tvValue = tvValue;
    }

    @NonNull
    public static ActivityDeveloperTestTuyakeySetStartBinding bind(@NonNull View rootView) {
        int i = R.id.bt_clear_history;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_history);
        if (appCompatButton != null) {
            i = R.id.bt_start_set;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_set);
            if (appCompatButton2 != null) {
                i = R.id.bt_stop_set;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_set);
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
                                i = R.id.tv_search_number;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                if (textView != null) {
                                    i = R.id.tv_value;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                                    if (textView2 != null) {
                                        return new ActivityDeveloperTestTuyakeySetStartBinding(relativeLayout, appCompatButton, appCompatButton2, appCompatButton3, editText, editText2, listView, relativeLayout, textView, textView2);
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
    public static ActivityDeveloperTestTuyakeySetStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestTuyakeySetStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_tuyakey_set_start, parent, false);
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
