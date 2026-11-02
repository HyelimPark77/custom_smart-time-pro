package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.swipelist.DragListView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCoachingSegmentsBinding implements ViewBinding {

    @NonNull
    public final DragListView listView;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCoachingSegmentsBinding(@NonNull LinearLayout rootView, @NonNull DragListView listView) {
        this.rootView = rootView;
        this.listView = listView;
    }

    @NonNull
    public static ActivityCoachingSegmentsBinding bind(@NonNull View rootView) {
        DragListView dragListView = (DragListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (dragListView != null) {
            return new ActivityCoachingSegmentsBinding((LinearLayout) rootView, dragListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.list_view)));
    }

    @NonNull
    public static ActivityCoachingSegmentsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCoachingSegmentsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_coaching_segments, parent, false);
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
