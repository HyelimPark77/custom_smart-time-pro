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
import com.sma.smartv3.view.text.FontEditText;
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCoachingSegmentEditBinding implements ViewBinding {

    @NonNull
    public final FontEditText edtName;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView tv12;

    @NonNull
    public final FontTextView tv21;

    @NonNull
    public final FontTextView tv22;

    @NonNull
    public final FontTextView tv31;

    @NonNull
    public final FontTextView tv32;

    @NonNull
    public final FontTextView tvActivity;

    @NonNull
    public final FontTextView tvStage;

    private ActivityCoachingSegmentEditBinding(@NonNull LinearLayout rootView, @NonNull FontEditText edtName, @NonNull FontTextView tv12, @NonNull FontTextView tv21, @NonNull FontTextView tv22, @NonNull FontTextView tv31, @NonNull FontTextView tv32, @NonNull FontTextView tvActivity, @NonNull FontTextView tvStage) {
        this.rootView = rootView;
        this.edtName = edtName;
        this.tv12 = tv12;
        this.tv21 = tv21;
        this.tv22 = tv22;
        this.tv31 = tv31;
        this.tv32 = tv32;
        this.tvActivity = tvActivity;
        this.tvStage = tvStage;
    }

    @NonNull
    public static ActivityCoachingSegmentEditBinding bind(@NonNull View rootView) {
        int i = R.id.edt_name;
        FontEditText fontEditText = (FontEditText) ViewBindings.findChildViewById(rootView, R.id.edt_name);
        if (fontEditText != null) {
            i = R.id.tv_1_2;
            FontTextView fontTextView = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_1_2);
            if (fontTextView != null) {
                i = R.id.tv_2_1;
                FontTextView fontTextView2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_2_1);
                if (fontTextView2 != null) {
                    i = R.id.tv_2_2;
                    FontTextView fontTextView3 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_2_2);
                    if (fontTextView3 != null) {
                        i = R.id.tv_3_1;
                        FontTextView fontTextView4 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_3_1);
                        if (fontTextView4 != null) {
                            i = R.id.tv_3_2;
                            FontTextView fontTextView5 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_3_2);
                            if (fontTextView5 != null) {
                                i = R.id.tv_activity;
                                FontTextView fontTextView6 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_activity);
                                if (fontTextView6 != null) {
                                    i = R.id.tv_stage;
                                    FontTextView fontTextView7 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stage);
                                    if (fontTextView7 != null) {
                                        return new ActivityCoachingSegmentEditBinding((LinearLayout) rootView, fontEditText, fontTextView, fontTextView2, fontTextView3, fontTextView4, fontTextView5, fontTextView6, fontTextView7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCoachingSegmentEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCoachingSegmentEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_coaching_segment_edit, parent, false);
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
