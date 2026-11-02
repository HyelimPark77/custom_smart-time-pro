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
        int i = R.id.search_func_hot_rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.search_func_hot_rv);
        if (recyclerView != null) {
            i = R.id.search_func_records_rv;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.search_func_records_rv);
            if (recyclerView2 != null) {
                i = R.id.search_func_records_tv;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_func_records_tv);
                if (textView != null) {
                    i = R.id.search_records_clear_tv;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_records_clear_tv);
                    if (textView2 != null) {
                        return new AiItemSearchTopBinding((LinearLayout) rootView, recyclerView, recyclerView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiItemSearchTopBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiItemSearchTopBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_item_search_top, parent, false);
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
