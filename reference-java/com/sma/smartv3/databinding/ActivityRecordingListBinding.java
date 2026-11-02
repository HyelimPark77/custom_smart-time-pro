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
        int i = R.id.empty;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (textView != null) {
            i = R.id.list_view;
            SwipeMenuListView swipeMenuListView = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (swipeMenuListView != null) {
                i = R.id.ll_data;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data);
                if (frameLayout != null) {
                    i = R.id.ll_loading;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_loading);
                    if (linearLayout != null) {
                        i = R.id.sync_status;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sync_status);
                        if (textView2 != null) {
                            return new ActivityRecordingListBinding((LinearLayout) rootView, textView, swipeMenuListView, frameLayout, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRecordingListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityRecordingListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_recording_list, parent, false);
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
