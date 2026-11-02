package com.bestmafen.androidbase.adapter.recyclerview.wrapper;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.o67;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;

/* JADX INFO: loaded from: classes13.dex */
public class LoadMoreWrapper<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ITEM_TYPE_LOAD_MORE = 2147483645;
    private RecyclerView.Adapter mInnerAdapter;
    private int mLoadMoreLayoutId;
    private View mLoadMoreView;
    private XIi00iiXO mOnLoadMoreListener;

    public class OXO1 implements o67.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.o67.XIi00iiXO
        public int OXO1(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i) {
            if (LoadMoreWrapper.this.isShowLoadMore(i)) {
                return gridLayoutManager.getSpanCount();
            }
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i);
            }
            return 1;
        }
    }

    public interface XIi00iiXO {
        void OXO1();
    }

    public LoadMoreWrapper(RecyclerView.Adapter adapter) {
        this.mInnerAdapter = adapter;
    }

    private boolean hasLoadMore() {
        return (this.mLoadMoreView == null && this.mLoadMoreLayoutId == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isShowLoadMore(int i) {
        return hasLoadMore() && i >= this.mInnerAdapter.getItemCount();
    }

    private void setFullSpan(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mInnerAdapter.getItemCount() + (hasLoadMore() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (isShowLoadMore(i)) {
            return 2147483645;
        }
        return this.mInnerAdapter.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o67.OXO1(this.mInnerAdapter, recyclerView, new OXO1());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!isShowLoadMore(i)) {
            this.mInnerAdapter.onBindViewHolder(viewHolder, i);
            return;
        }
        XIi00iiXO xIi00iiXO = this.mOnLoadMoreListener;
        if (xIi00iiXO != null) {
            xIi00iiXO.OXO1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2147483645) {
            return this.mLoadMoreView != null ? ViewHolder.createViewHolder(viewGroup.getContext(), this.mLoadMoreView) : ViewHolder.createViewHolder(viewGroup.getContext(), viewGroup, this.mLoadMoreLayoutId);
        }
        return this.mInnerAdapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.mInnerAdapter.onViewAttachedToWindow(viewHolder);
        if (isShowLoadMore(viewHolder.getLayoutPosition())) {
            setFullSpan(viewHolder);
        }
    }

    public LoadMoreWrapper setLoadMoreView(View view) {
        this.mLoadMoreView = view;
        return this;
    }

    public LoadMoreWrapper setOnLoadMoreListener(XIi00iiXO xIi00iiXO) {
        if (xIi00iiXO != null) {
            this.mOnLoadMoreListener = xIi00iiXO;
        }
        return this;
    }

    public LoadMoreWrapper setLoadMoreView(int i) {
        this.mLoadMoreLayoutId = i;
        return this;
    }
}
