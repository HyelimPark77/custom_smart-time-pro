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
import com.sma.smartv3.view.text.FontTextView;

/* JADX INFO: loaded from: classes19.dex */
public final class PopMeasurementCompleteBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView tvContent;

    @NonNull
    public final FontTextView tvTitle;

    private PopMeasurementCompleteBinding(@NonNull LinearLayout rootView, @NonNull FontTextView tvContent, @NonNull FontTextView tvTitle) {
        this.rootView = rootView;
        this.tvContent = tvContent;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static PopMeasurementCompleteBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv_content;
        FontTextView r1 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_content);
        if (r1 == null) goto L9;
        r0 = R.id.tv_title;
        FontTextView r2 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r2 == null) goto L9;
        return new PopMeasurementCompleteBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopMeasurementCompleteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopMeasurementCompleteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_measurement_complete, parent, false);
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
