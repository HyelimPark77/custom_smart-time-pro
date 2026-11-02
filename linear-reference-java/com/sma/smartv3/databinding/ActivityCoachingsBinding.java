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
public final class ActivityCoachingsBinding implements ViewBinding {

    @NonNull
    public final TextView empty;

    @NonNull
    public final SwipeMenuListView listView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTip;

    private ActivityCoachingsBinding(@NonNull LinearLayout rootView, @NonNull TextView empty, @NonNull SwipeMenuListView listView, @NonNull PFMedium tvTip) {
        this.rootView = rootView;
        this.empty = empty;
        this.listView = listView;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityCoachingsBinding bind(@NonNull View rootView) {
        int r0 = R.id.empty;
        TextView r1 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r1 == null) goto L11;
        r0 = R.id.list_view;
        SwipeMenuListView r2 = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r2 == null) goto L11;
        r0 = R.id.tv_tip;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r3 == null) goto L11;
        return new ActivityCoachingsBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCoachingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCoachingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_coachings, parent, false);
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
