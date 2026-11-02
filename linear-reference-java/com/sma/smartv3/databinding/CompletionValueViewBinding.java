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
public final class CompletionValueViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FontTextView tv1;

    @NonNull
    public final FontTextView tv2;

    @NonNull
    public final FontTextView tv3;

    @NonNull
    public final FontTextView tv4;

    private CompletionValueViewBinding(@NonNull LinearLayout rootView, @NonNull FontTextView tv1, @NonNull FontTextView tv2, @NonNull FontTextView tv3, @NonNull FontTextView tv4) {
        this.rootView = rootView;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.tv3 = tv3;
        this.tv4 = tv4;
    }

    @NonNull
    public static CompletionValueViewBinding bind(@NonNull View rootView) {
        int r0 = R.id.tv1;
        FontTextView r4 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv1);
        if (r4 == null) goto L13;
        r0 = R.id.tv2;
        FontTextView r5 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv2);
        if (r5 == null) goto L13;
        r0 = R.id.tv3;
        FontTextView r6 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv3);
        if (r6 == null) goto L13;
        r0 = R.id.tv4;
        FontTextView r7 = (FontTextView) ViewBindings.findChildViewById(rootView, R.id.tv4);
        if (r7 == null) goto L13;
        return new CompletionValueViewBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static CompletionValueViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static CompletionValueViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.completion_value_view, parent, false);
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
