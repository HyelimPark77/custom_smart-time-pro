package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivitySportDetailV2Binding implements ViewBinding {

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final FrameLayout sportDetailV2ChartFragment;

    @NonNull
    public final FrameLayout sportDetailV2MapFragment;

    @NonNull
    public final LinearLayout topPanel;

    private ActivitySportDetailV2Binding(@NonNull LinearLayout rootView_, @NonNull NestedScrollView rootView, @NonNull FrameLayout sportDetailV2ChartFragment, @NonNull FrameLayout sportDetailV2MapFragment, @NonNull LinearLayout topPanel) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.sportDetailV2ChartFragment = sportDetailV2ChartFragment;
        this.sportDetailV2MapFragment = sportDetailV2MapFragment;
        this.topPanel = topPanel;
    }

    @NonNull
    public static ActivitySportDetailV2Binding bind(@NonNull View rootView) {
        int r0 = R.id.root_View;
        NestedScrollView r4 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.root_View);
        if (r4 == null) goto L13;
        r0 = R.id.sport_detail_v2_chart_fragment;
        FrameLayout r5 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_v2_chart_fragment);
        if (r5 == null) goto L13;
        r0 = R.id.sport_detail_v2_map_fragment;
        FrameLayout r6 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.sport_detail_v2_map_fragment);
        if (r6 == null) goto L13;
        r0 = R.id.top_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.top_panel);
        if (r7 == null) goto L13;
        return new ActivitySportDetailV2Binding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivitySportDetailV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivitySportDetailV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_sport_detail_v2, parent, false);
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
