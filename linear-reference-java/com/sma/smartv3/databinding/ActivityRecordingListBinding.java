package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityRecordingListBinding implements ViewBinding {

    @NonNull
    public final TextView empty;

    @NonNull
    public final SwipeMenuListView listView;

    @NonNull
    public final FrameLayout llData;

    @NonNull
    public final LinearLayout llLoading;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView syncStatus;

    private ActivityRecordingListBinding(@NonNull LinearLayout rootView, @NonNull TextView empty, @NonNull SwipeMenuListView listView, @NonNull FrameLayout llData, @NonNull LinearLayout llLoading, @NonNull TextView syncStatus) {
        this.rootView = rootView;
        this.empty = empty;
        this.listView = listView;
        this.llData = llData;
        this.llLoading = llLoading;
        this.syncStatus = syncStatus;
    }

    @NonNull
    public static ActivityRecordingListBinding bind(@NonNull View rootView) {
        int r0 = R.id.empty;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r4 == null) goto L15;
        r0 = R.id.list_view;
        SwipeMenuListView r5 = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r5 == null) goto L15;
        r0 = R.id.ll_data;
        FrameLayout r6 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data);
        if (r6 == null) goto L15;
        r0 = R.id.ll_loading;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_loading);
        if (r7 == null) goto L15;
        r0 = R.id.sync_status;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sync_status);
        if (r8 == null) goto L15;
        return new ActivityRecordingListBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityRecordingListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityRecordingListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_recording_list, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
