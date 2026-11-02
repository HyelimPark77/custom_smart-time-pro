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
        int i = R.id.confirmButton;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.confirmButton);
        if (button != null) {
            i = R.id.rvPointer;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvPointer);
            if (recyclerView != null) {
                i = R.id.rvScale;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvScale);
                if (recyclerView2 != null) {
                    return new PopDialPointBinding((LinearLayout) rootView, button, recyclerView, recyclerView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopDialPointBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopDialPointBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_dial_point, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
