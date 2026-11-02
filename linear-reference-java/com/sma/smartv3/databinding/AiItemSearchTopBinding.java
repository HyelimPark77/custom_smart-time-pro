package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AiItemSearchTopBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView searchFuncHotRv;

    @NonNull
    public final RecyclerView searchFuncRecordsRv;

    @NonNull
    public final TextView searchFuncRecordsTv;

    @NonNull
    public final TextView searchRecordsClearTv;

    private AiItemSearchTopBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView searchFuncHotRv, @NonNull RecyclerView searchFuncRecordsRv, @NonNull TextView searchFuncRecordsTv, @NonNull TextView searchRecordsClearTv) {
        this.rootView = rootView;
        this.searchFuncHotRv = searchFuncHotRv;
        this.searchFuncRecordsRv = searchFuncRecordsRv;
        this.searchFuncRecordsTv = searchFuncRecordsTv;
        this.searchRecordsClearTv = searchRecordsClearTv;
    }

    @NonNull
    public static AiItemSearchTopBinding bind(@NonNull View rootView) {
        int r0 = R.id.search_func_hot_rv;
        RecyclerView r4 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.search_func_hot_rv);
        if (r4 == null) goto L13;
        r0 = R.id.search_func_records_rv;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.search_func_records_rv);
        if (r5 == null) goto L13;
        r0 = R.id.search_func_records_tv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_func_records_tv);
        if (r6 == null) goto L13;
        r0 = R.id.search_records_clear_tv;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_records_clear_tv);
        if (r7 == null) goto L13;
        return new AiItemSearchTopBinding((LinearLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiItemSearchTopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiItemSearchTopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_item_search_top, parent, false);
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
