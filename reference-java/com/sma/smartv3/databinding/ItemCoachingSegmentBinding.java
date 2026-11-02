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
        int i = R.id.completion_value;
        CompletionValueView completionValueView = (CompletionValueView) ViewBindings.findChildViewById(rootView, R.id.completion_value);
        if (completionValueView != null) {
            i = R.id.iv_activity;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_activity);
            if (imageView != null) {
                i = R.id.iv_reorder;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_reorder);
                if (imageView2 != null) {
                    SwipeLayout swipeLayout = (SwipeLayout) rootView;
                    i = R.id.tv_completion_condition;
                    FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_completion_condition);
                    if (fontTextView != null) {
                        i = R.id.tv_name;
                        FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                        if (fontTextView2 != null) {
                            i = R.id.tv_stage;
                            FontTextView fontTextView3 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stage);
                            if (fontTextView3 != null) {
                                return new ItemCoachingSegmentBinding(swipeLayout, completionValueView, imageView, imageView2, swipeLayout, fontTextView, fontTextView2, fontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemCoachingSegmentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemCoachingSegmentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_coaching_segment, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeLayout getRoot() {
        return this.rootView;
    }
}
