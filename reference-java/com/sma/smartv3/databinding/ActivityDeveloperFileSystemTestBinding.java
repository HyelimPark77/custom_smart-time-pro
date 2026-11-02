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
public final class ActivityDeveloperFileSystemTestBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btClearHistory;

    @NonNull
    public final AppCompatButton btStartSet;

    @NonNull
    public final AppCompatButton btStopSet;

    @NonNull
    public final CheckBox cbShutdown;

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
    public final TextView tvAlreadySet;

    @NonNull
    public final TextView tvInfo;

    @NonNull
    public final TextView tvSearchNumber;

    private ActivityDeveloperFileSystemTestBinding(@NonNull RelativeLayout rootView_, @NonNull AppCompatButton btClearHistory, @NonNull AppCompatButton btStartSet, @NonNull AppCompatButton btStopSet, @NonNull CheckBox cbShutdown, @NonNull EditText etOldBleName, @NonNull EditText etSignal, @NonNull ListView listView, @NonNull RelativeLayout rootView, @NonNull TextView tvAlreadySet, @NonNull TextView tvInfo, @NonNull TextView tvSearchNumber) {
        this.rootView_ = rootView_;
        this.btClearHistory = btClearHistory;
        this.btStartSet = btStartSet;
        this.btStopSet = btStopSet;
        this.cbShutdown = cbShutdown;
        this.etOldBleName = etOldBleName;
        this.etSignal = etSignal;
        this.listView = listView;
        this.rootView = rootView;
        this.tvAlreadySet = tvAlreadySet;
        this.tvInfo = tvInfo;
        this.tvSearchNumber = tvSearchNumber;
    }

    @NonNull
    public static ActivityDeveloperFileSystemTestBinding bind(@NonNull View rootView) {
        int i = R.id.bt_clear_history;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_clear_history);
        if (appCompatButton != null) {
            i = R.id.bt_start_set;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start_set);
            if (appCompatButton2 != null) {
                i = R.id.bt_stop_set;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop_set);
                if (appCompatButton3 != null) {
                    i = R.id.cb_shutdown;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_shutdown);
                    if (checkBox != null) {
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
                                    i = R.id.tv_already_set;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_already_set);
                                    if (textView != null) {
                                        i = R.id.tv_info;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
                                        if (textView2 != null) {
                                            i = R.id.tv_search_number;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_search_number);
                                            if (textView3 != null) {
                                                return new ActivityDeveloperFileSystemTestBinding(relativeLayout, appCompatButton, appCompatButton2, appCompatButton3, checkBox, editText, editText2, listView, relativeLayout, textView, textView2, textView3);
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
    public static ActivityDeveloperFileSystemTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperFileSystemTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_file_system_test, parent, false);
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
