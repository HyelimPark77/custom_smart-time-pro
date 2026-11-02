package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperWatchfaceStressTestBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btStart;

    @NonNull
    public final AppCompatButton btStop;

    @NonNull
    public final CheckBox cbSkipFailed;

    @NonNull
    public final ListView listView;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final TextView tvStatus;

    private ActivityDeveloperWatchfaceStressTestBinding(@NonNull LinearLayout rootView_, @NonNull AppCompatButton btStart, @NonNull AppCompatButton btStop, @NonNull CheckBox cbSkipFailed, @NonNull ListView listView, @NonNull LinearLayout rootView, @NonNull TextView tvStatus) {
        this.rootView_ = rootView_;
        this.btStart = btStart;
        this.btStop = btStop;
        this.cbSkipFailed = cbSkipFailed;
        this.listView = listView;
        this.rootView = rootView;
        this.tvStatus = tvStatus;
    }

    @NonNull
    public static ActivityDeveloperWatchfaceStressTestBinding bind(@NonNull View rootView) {
        int i = R.id.bt_start;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start);
        if (appCompatButton != null) {
            i = R.id.bt_stop;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop);
            if (appCompatButton2 != null) {
                i = R.id.cb_skip_failed;
                CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_skip_failed);
                if (checkBox != null) {
                    i = R.id.list_view;
                    ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                    if (listView != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        i = R.id.tv_status;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_status);
                        if (textView != null) {
                            return new ActivityDeveloperWatchfaceStressTestBinding(linearLayout, appCompatButton, appCompatButton2, checkBox, listView, linearLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperWatchfaceStressTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperWatchfaceStressTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_watchface_stress_test, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
