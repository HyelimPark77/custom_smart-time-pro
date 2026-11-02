package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogCommentBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat centerLayout;

    @NonNull
    public final RatingBar ratBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvNext;

    private DialogCommentBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayoutCompat centerLayout, @NonNull RatingBar ratBar, @NonNull TextView tvNext) {
        this.rootView = rootView;
        this.centerLayout = centerLayout;
        this.ratBar = ratBar;
        this.tvNext = tvNext;
    }

    @NonNull
    public static DialogCommentBinding bind(@NonNull View rootView) {
        int i = R.id.center_layout;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.center_layout);
        if (linearLayoutCompat != null) {
            i = R.id.rat_bar;
            RatingBar ratingBar = (RatingBar) ViewBindings.findChildViewById(rootView, R.id.rat_bar);
            if (ratingBar != null) {
                i = R.id.tv_next;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_next);
                if (textView != null) {
                    return new DialogCommentBinding((ConstraintLayout) rootView, linearLayoutCompat, ratingBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogCommentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogCommentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_comment, parent, false);
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
