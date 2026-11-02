package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CompletionValueView;
import com.sma.smartv3.view.swipelist.SwipeLayout;
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemCoachingSegmentBinding implements ViewBinding {

    @NonNull
    public final CompletionValueView completionValue;

    @NonNull
    public final ImageView ivActivity;

    @NonNull
    public final ImageView ivReorder;

    @NonNull
    private final SwipeLayout rootView;

    @NonNull
    public final SwipeLayout swipeLayout;

    @NonNull
    public final FontTextView tvCompletionCondition;

    @NonNull
    public final FontTextView tvName;

    @NonNull
    public final FontTextView tvStage;

    private ItemCoachingSegmentBinding(@NonNull SwipeLayout rootView, @NonNull CompletionValueView completionValue, @NonNull ImageView ivActivity, @NonNull ImageView ivReorder, @NonNull SwipeLayout swipeLayout, @NonNull FontTextView tvCompletionCondition, @NonNull FontTextView tvName, @NonNull FontTextView tvStage) {
        this.rootView = rootView;
        this.completionValue = completionValue;
        this.ivActivity = ivActivity;
        this.ivReorder = ivReorder;
        this.swipeLayout = swipeLayout;
        this.tvCompletionCondition = tvCompletionCondition;
        this.tvName = tvName;
        this.tvStage = tvStage;
    }

    @NonNull
    public static ItemCoachingSegmentBinding bind(@NonNull View rootView) {
        int r0 = R.id.completion_value;
        CompletionValueView r4 = (CompletionValueView) ViewBindings.findChildViewById(rootView, R.id.completion_value);
        if (r4 == null) goto L17;
        r0 = R.id.iv_activity;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_activity);
        if (r5 == null) goto L17;
        r0 = R.id.iv_reorder;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_reorder);
        if (r6 == null) goto L17;
        SwipeLayout r3 = (SwipeLayout) rootView;
        r0 = R.id.tv_completion_condition;
        FontTextView r8 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_completion_condition);
        if (r8 == null) goto L17;
        r0 = R.id.tv_name;
        FontTextView r9 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r9 == null) goto L17;
        r0 = R.id.tv_stage;
        FontTextView r10 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stage);
        if (r10 == null) goto L17;
        return new ItemCoachingSegmentBinding(r3, r4, r5, r6, r3, r8, r9, r10);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemCoachingSegmentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemCoachingSegmentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_coaching_segment, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeLayout getRoot() {
        return this.rootView;
    }
}
