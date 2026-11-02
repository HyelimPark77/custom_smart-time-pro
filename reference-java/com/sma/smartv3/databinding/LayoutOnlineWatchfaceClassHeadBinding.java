package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutOnlineWatchfaceClassHeadBinding implements ViewBinding {

    @NonNull
    public final RecyclerView myClassRecyclerView;

    @NonNull
    private final RecyclerView rootView;

    private LayoutOnlineWatchfaceClassHeadBinding(@NonNull RecyclerView rootView, @NonNull RecyclerView myClassRecyclerView) {
        this.rootView = rootView;
        this.myClassRecyclerView = myClassRecyclerView;
    }

    @NonNull
    public static LayoutOnlineWatchfaceClassHeadBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) rootView;
        return new LayoutOnlineWatchfaceClassHeadBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static LayoutOnlineWatchfaceClassHeadBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutOnlineWatchfaceClassHeadBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_online_watchface_class_head, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
