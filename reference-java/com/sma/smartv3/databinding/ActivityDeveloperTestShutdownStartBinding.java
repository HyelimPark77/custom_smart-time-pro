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
        int i = R.id.bt_clear_shutdown_history;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_shutdown_history);
        if (appCompatButton != null) {
            i = R.id.bt_start_shutdown;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_shutdown);
            if (appCompatButton2 != null) {
                i = R.id.bt_stop_shutdown;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_shutdown);
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
                                i = R.id.tv_already_shutdown;
                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_shutdown);
                                if (textView != null) {
                                    i = R.id.tv_search_number;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                    if (textView2 != null) {
                                        return new ActivityDeveloperTestShutdownStartBinding(relativeLayout, appCompatButton, appCompatButton2, appCompatButton3, editText, editText2, listView, relativeLayout, textView, textView2);
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
    public static ActivityDeveloperTestShutdownStartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperTestShutdownStartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_test_shutdown_start, parent, false);
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
