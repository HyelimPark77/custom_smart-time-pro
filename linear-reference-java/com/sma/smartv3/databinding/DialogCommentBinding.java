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
        int r0 = R.id.center_layout;
        LinearLayoutCompat r1 = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.center_layout);
        if (r1 == null) goto L11;
        r0 = R.id.rat_bar;
        RatingBar r2 = (RatingBar) ViewBindings.findChildViewById(rootView, R.id.rat_bar);
        if (r2 == null) goto L11;
        r0 = R.id.tv_next;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_next);
        if (r3 == null) goto L11;
        return new DialogCommentBinding((ConstraintLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DialogCommentBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DialogCommentBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.dialog_comment, parent, false);
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
