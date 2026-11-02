package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusEcgDayV2Binding implements ViewBinding {

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final View viewDayItem;

    private FragmentStatusEcgDayV2Binding(@NonNull LinearLayout rootView, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull NestedScrollView scrollView, @NonNull View viewDayItem) {
        this.rootView = rootView;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.scrollView = scrollView;
        this.viewDayItem = viewDayItem;
    }

    @NonNull
    public static FragmentStatusEcgDayV2Binding bind(@NonNull View rootView) {
        int r0 = R.id.beforeTime;
        ImageButton r4 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r4 == null) goto L19;
        r0 = R.id.dataContent;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r5 == null) goto L19;
        r0 = R.id.loading;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r6 == null) goto L19;
        r0 = R.id.nextTime;
        ImageButton r7 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r7 == null) goto L19;
        r0 = R.id.nowTime;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r8 == null) goto L19;
        r0 = R.id.scrollView;
        NestedScrollView r9 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r9 == null) goto L19;
        r0 = R.id.view_day_item;
        View r10 = ViewBindings.findChildViewById(rootView, R.id.view_day_item);
        if (r10 == null) goto L19;
        return new FragmentStatusEcgDayV2Binding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static FragmentStatusEcgDayV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusEcgDayV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_ecg_day_v2, parent, false);
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
