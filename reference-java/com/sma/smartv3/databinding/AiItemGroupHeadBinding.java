package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AiItemGroupHeadBinding implements ViewBinding {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TabLayout table;

    private AiItemGroupHeadBinding(@NonNull FrameLayout rootView, @NonNull TabLayout table) {
        this.rootView = rootView;
        this.table = table;
    }

    @NonNull
    public static AiItemGroupHeadBinding bind(@NonNull View rootView) {
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (tabLayout != null) {
            return new AiItemGroupHeadBinding((FrameLayout) rootView, tabLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.table)));
    }

    @NonNull
    public static AiItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiItemGroupHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_item_group_head, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
