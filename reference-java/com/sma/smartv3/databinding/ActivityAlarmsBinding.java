package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAlarmsBinding implements ViewBinding {

    @NonNull
    public final TextView empty;

    @NonNull
    public final SwipeMenuListView listView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTip;

    private ActivityAlarmsBinding(@NonNull LinearLayout rootView, @NonNull TextView empty, @NonNull SwipeMenuListView listView, @NonNull PFMedium tvTip) {
        this.rootView = rootView;
        this.empty = empty;
        this.listView = listView;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityAlarmsBinding bind(@NonNull View rootView) {
        int i = R.id.empty;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (textView != null) {
            i = R.id.list_view;
            SwipeMenuListView swipeMenuListView = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (swipeMenuListView != null) {
                i = R.id.tv_tip;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                if (pFMedium != null) {
                    return new ActivityAlarmsBinding((LinearLayout) rootView, textView, swipeMenuListView, pFMedium);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityAlarmsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityAlarmsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_alarms, parent, false);
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
