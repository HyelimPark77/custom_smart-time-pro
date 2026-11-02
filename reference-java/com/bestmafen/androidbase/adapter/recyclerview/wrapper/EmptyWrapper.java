package com.bestmafen.androidbase.adapter.recyclerview.wrapper;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.o67;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;

/* JADX INFO: loaded from: classes13.dex */
public class EmptyWrapper<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ITEM_TYPE_EMPTY = 2147483646;
    private int mEmptyLayoutId;
    private View mEmptyView;
    private RecyclerView.Adapter mInnerAdapter;

    public class OXO1 implements o67.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.o67.XIi00iiXO
        public int OXO1(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i) {
            if (EmptyWrapper.this.isEmpty()) {
                return gridLayoutManager.getSpanCount();
            }
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i);
            }
            return 1;
        }
    }

    public EmptyWrapper(RecyclerView.Adapter adapter) {
        this.mInnerAdapter = adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEmpty() {
        return !(this.mEmptyView == null && this.mEmptyLayoutId == 0) && this.mInnerAdapter.getItemCount() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (isEmpty()) {
            return 1;
        }
        return this.mInnerAdapter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return isEmpty() ? ITEM_TYPE_EMPTY : this.mInnerAdapter.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o67.OXO1(this.mInnerAdapter, recyclerView, new OXO1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (isEmpty()) {
            return;
        }
        this.mInnerAdapter.onBindViewHolder(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (isEmpty()) {
            return this.mEmptyView != null ? ViewHolder.createViewHolder(viewGroup.getContext(), this.mEmptyView) : ViewHolder.createViewHolder(viewGroup.getContext(), viewGroup, this.mEmptyLayoutId);
        }
        return this.mInnerAdapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.mInnerAdapter.onViewAttachedToWindow(viewHolder);
        if (isEmpty()) {
            o67.XIi00iiXO(viewHolder);
        }
    }

    public void setEmptyView(View view) {
        this.mEmptyView = view;
    }

    public void setEmptyView(int i) {
        this.mEmptyLayoutId = i;
    }
}
