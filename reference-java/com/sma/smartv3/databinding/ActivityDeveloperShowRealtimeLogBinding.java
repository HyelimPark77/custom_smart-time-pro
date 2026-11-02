package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperShowRealtimeLogBinding implements ViewBinding {

    @NonNull
    public final ListView listView;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDeveloperShowRealtimeLogBinding(@NonNull LinearLayout rootView, @NonNull ListView listView) {
        this.rootView = rootView;
        this.listView = listView;
    }

    @NonNull
    public static ActivityDeveloperShowRealtimeLogBinding bind(@NonNull View rootView) {
        ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (listView != null) {
            return new ActivityDeveloperShowRealtimeLogBinding((LinearLayout) rootView, listView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.list_view)));
    }

    @NonNull
    public static ActivityDeveloperShowRealtimeLogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperShowRealtimeLogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_show_realtime_log, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
