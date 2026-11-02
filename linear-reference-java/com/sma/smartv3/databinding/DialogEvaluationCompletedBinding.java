package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogEvaluationCompletedBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat centerLayout;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvCopy;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvYes;

    private DialogEvaluationCompletedBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayoutCompat centerLayout, @NonNull TextView tvCopy, @NonNull TextView tvTitle, @NonNull TextView tvYes) {
        this.rootView = rootView;
        this.centerLayout = centerLayout;
        this.tvCopy = tvCopy;
        this.tvTitle = tvTitle;
        this.tvYes = tvYes;
    }

    @NonNull
    public static DialogEvaluationCompletedBinding bind(@NonNull View rootView) {
        int r0 = R.id.center_layout;
        LinearLayoutCompat r4 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.center_layout);
        if (r4 == null) goto L13;
        r0 = R.id.tv_copy;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_copy);
        if (r5 == null) goto L13;
        r0 = R.id.tv_title;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r6 == null) goto L13;
        r0 = R.id.tv_yes;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_yes);
        if (r7 == null) goto L13;
        return new DialogEvaluationCompletedBinding((ConstraintLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DialogEvaluationCompletedBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DialogEvaluationCompletedBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.dialog_evaluation_completed, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
