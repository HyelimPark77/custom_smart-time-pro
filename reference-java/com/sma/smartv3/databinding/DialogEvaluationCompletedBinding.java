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
        int i = R.id.center_layout;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.center_layout);
        if (linearLayoutCompat != null) {
            i = R.id.tv_copy;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_copy);
            if (textView != null) {
                i = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_title);
                if (textView2 != null) {
                    i = R.id.tv_yes;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_yes);
                    if (textView3 != null) {
                        return new DialogEvaluationCompletedBinding((ConstraintLayout) rootView, linearLayoutCompat, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogEvaluationCompletedBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogEvaluationCompletedBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_evaluation_completed, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
