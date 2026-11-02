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
        if (rootView == null) goto L6;
        RecyclerView r1 = (RecyclerView) rootView;
        return new SportItemMoreBinding(r1, r1);
    L6:
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static SportItemMoreBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static SportItemMoreBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.sport_item_more, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
