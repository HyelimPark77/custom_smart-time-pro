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
        int i = R.id.rv_eq_mode;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_eq_mode);
        if (recyclerView != null) {
            i = R.id.tv_eq_mode_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_cancel);
            if (textView != null) {
                i = R.id.tv_eq_mode_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_eq_mode_title);
                if (textView2 != null) {
                    return new DialogEqModeDialogBinding((ConstraintLayout) rootView, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogEqModeDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static DialogEqModeDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.dialog_eq_mode_dialog, parent, false);
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
