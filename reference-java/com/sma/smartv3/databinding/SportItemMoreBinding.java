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
public final class SportItemMoreBinding implements ViewBinding {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView startRecyclerview;

    private SportItemMoreBinding(@NonNull RecyclerView rootView, @NonNull RecyclerView startRecyclerview) {
        this.rootView = rootView;
        this.startRecyclerview = startRecyclerview;
    }

    @NonNull
    public static SportItemMoreBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) rootView;
        return new SportItemMoreBinding(recyclerView, recyclerView);
    }

    @NonNull
    public static SportItemMoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SportItemMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.sport_item_more, parent, false);
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
