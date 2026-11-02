package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogEqModeDialogBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvEqMode;

    @NonNull
    public final TextView tvEqModeCancel;

    @NonNull
    public final TextView tvEqModeTitle;

    private DialogEqModeDialogBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView rvEqMode, @NonNull TextView tvEqModeCancel, @NonNull TextView tvEqModeTitle) {
        this.rootView = rootView;
        this.rvEqMode = rvEqMode;
        this.tvEqModeCancel = tvEqModeCancel;
        this.tvEqModeTitle = tvEqModeTitle;
    }

    @NonNull
    public static DialogEqModeDialogBinding bind(@NonNull View rootView) {
        int r0 = R.id.rv_eq_mode;
        RecyclerView r1 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_eq_mode);
        if (r1 == null) goto L11;
        r0 = R.id.tv_eq_mode_cancel;
        TextView r2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_cancel);
        if (r2 == null) goto L11;
        r0 = R.id.tv_eq_mode_title;
        TextView r3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_title);
        if (r3 == null) goto L11;
        return new DialogEqModeDialogBinding((ConstraintLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static DialogEqModeDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static DialogEqModeDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.dialog_eq_mode_dialog, parent, false);
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
