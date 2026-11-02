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
        int r0 = R.id.bt_start;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_start);
        if (r4 == null) goto L15;
        r0 = R.id.bt_stop;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bt_stop);
        if (r5 == null) goto L15;
        r0 = R.id.cb_skip_failed;
        CheckBox r6 = (CheckBox) ViewBindings.findChildViewById(rootView, R.id.cb_skip_failed);
        if (r6 == null) goto L15;
        r0 = R.id.list_view;
        ListView r7 = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r7 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_status;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_status);
        if (r9 == null) goto L15;
        return new ActivityDeveloperWatchfaceStressTestBinding(r3, r4, r5, r6, r7, r3, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperWatchfaceStressTestBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperWatchfaceStressTestBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_watchface_stress_test, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
