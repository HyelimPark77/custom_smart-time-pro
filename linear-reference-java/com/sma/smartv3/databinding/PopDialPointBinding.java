package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopDialPointBinding implements ViewBinding {

    @NonNull
    public final Button confirmButton;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvPointer;

    @NonNull
    public final RecyclerView rvScale;

    private PopDialPointBinding(@NonNull LinearLayout rootView, @NonNull Button confirmButton, @NonNull RecyclerView rvPointer, @NonNull RecyclerView rvScale) {
        this.rootView = rootView;
        this.confirmButton = confirmButton;
        this.rvPointer = rvPointer;
        this.rvScale = rvScale;
    }

    @NonNull
    public static PopDialPointBinding bind(@NonNull View rootView) {
        int r0 = R.id.confirmButton;
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
        if (r1 == null) goto L11;
        r0 = R.id.rvPointer;
        RecyclerView r2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvPointer);
        if (r2 == null) goto L11;
        r0 = R.id.rvScale;
        RecyclerView r3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvScale);
        if (r3 == null) goto L11;
        return new PopDialPointBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopDialPointBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopDialPointBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.pop_dial_point, parent, false);
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
