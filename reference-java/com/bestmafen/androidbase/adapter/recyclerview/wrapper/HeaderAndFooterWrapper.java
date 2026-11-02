package com.bestmafen.androidbase.adapter.recyclerview.wrapper;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.o67;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;

/* JADX INFO: loaded from: classes13.dex */
public class HeaderAndFooterWrapper<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int BASE_ITEM_TYPE_FOOTER = 200000;
    private static final int BASE_ITEM_TYPE_HEADER = 100000;
    private RecyclerView.Adapter mInnerAdapter;
    private SparseArrayCompat<View> mHeaderViews = new SparseArrayCompat<>();
    private SparseArrayCompat<View> mFootViews = new SparseArrayCompat<>();

    public class OXO1 implements o67.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.o67.XIi00iiXO
        public int OXO1(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i) {
            int itemViewType = HeaderAndFooterWrapper.this.getItemViewType(i);
            if (HeaderAndFooterWrapper.this.mHeaderViews.get(itemViewType) == null && HeaderAndFooterWrapper.this.mFootViews.get(itemViewType) == null) {
                if (spanSizeLookup != null) {
                    return spanSizeLookup.getSpanSize(i);
                }
                return 1;
            }
            return gridLayoutManager.getSpanCount();
        }
    }

    public HeaderAndFooterWrapper(RecyclerView.Adapter adapter) {
        this.mInnerAdapter = adapter;
    }

    private int getRealItemCount() {
        return this.mInnerAdapter.getItemCount();
    }

    private boolean isFooterViewPos(int i) {
        return i >= getHeadersCount() + getRealItemCount();
    }

    private boolean isHeaderViewPos(int i) {
        return i < getHeadersCount();
    }

    public void addFootView(View view) {
        SparseArrayCompat<View> sparseArrayCompat = this.mFootViews;
        sparseArrayCompat.put(sparseArrayCompat.size() + 200000, view);
    }

    public void addHeaderView(View view) {
        SparseArrayCompat<View> sparseArrayCompat = this.mHeaderViews;
        sparseArrayCompat.put(sparseArrayCompat.size() + 100000, view);
    }

    public int getFootersCount() {
        return this.mFootViews.size();
    }

    public int getHeadersCount() {
        return this.mHeaderViews.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getHeadersCount() + getFootersCount() + getRealItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (isHeaderViewPos(i)) {
            return this.mHeaderViews.keyAt(i);
        }
        return isFooterViewPos(i) ? this.mFootViews.keyAt((i - getHeadersCount()) - getRealItemCount()) : this.mInnerAdapter.getItemViewType(i - getHeadersCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o67.OXO1(this.mInnerAdapter, recyclerView, new OXO1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (isHeaderViewPos(i) || isFooterViewPos(i)) {
            return;
        }
        this.mInnerAdapter.onBindViewHolder(viewHolder, i - getHeadersCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.mHeaderViews.get(i) != null) {
            return ViewHolder.createViewHolder(viewGroup.getContext(), this.mHeaderViews.get(i));
        }
        return this.mFootViews.get(i) != null ? ViewHolder.createViewHolder(viewGroup.getContext(), this.mFootViews.get(i)) : this.mInnerAdapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.mInnerAdapter.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if (isHeaderViewPos(layoutPosition) || isFooterViewPos(layoutPosition)) {
            o67.XIi00iiXO(viewHolder);
        }
    }
}
