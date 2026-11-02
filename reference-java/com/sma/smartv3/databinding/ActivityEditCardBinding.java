package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityEditCardBinding implements ViewBinding {

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f50977rv;

    private ActivityEditCardBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout rootView, @NonNull RecyclerView rv) {
        this.rootView_ = rootView_;
        this.rootView = rootView;
        this.f50977rv = rv;
    }

    @NonNull
    public static ActivityEditCardBinding bind(@NonNull View rootView) {
        LinearLayout linearLayout = (LinearLayout) rootView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
        if (recyclerView != null) {
            return new ActivityEditCardBinding(linearLayout, linearLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.f51422rv)));
    }

    @NonNull
    public static ActivityEditCardBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityEditCardBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_edit_card, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
