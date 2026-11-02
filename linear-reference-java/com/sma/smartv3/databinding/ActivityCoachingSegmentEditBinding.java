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
        int r0 = R.id.edt_name;
        FontEditText r4 = (FontEditText) ViewBindings.findChildViewById(rootView, R.id.edt_name);
        if (r4 == null) goto L21;
        r0 = R.id.tv_1_2;
        FontTextView r5 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_1_2);
        if (r5 == null) goto L21;
        r0 = R.id.tv_2_1;
        FontTextView r6 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_2_1);
        if (r6 == null) goto L21;
        r0 = R.id.tv_2_2;
        FontTextView r7 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_2_2);
        if (r7 == null) goto L21;
        r0 = R.id.tv_3_1;
        FontTextView r8 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_3_1);
        if (r8 == null) goto L21;
        r0 = R.id.tv_3_2;
        FontTextView r9 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_3_2);
        if (r9 == null) goto L21;
        r0 = R.id.tv_activity;
        FontTextView r10 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_activity);
        if (r10 == null) goto L21;
        r0 = R.id.tv_stage;
        FontTextView r11 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_stage);
        if (r11 == null) goto L21;
        return new ActivityCoachingSegmentEditBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCoachingSegmentEditBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCoachingSegmentEditBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_coaching_segment_edit, parent, false);
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
