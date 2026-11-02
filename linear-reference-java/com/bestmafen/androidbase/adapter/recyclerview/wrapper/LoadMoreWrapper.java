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
        public final /* synthetic */ LoadMoreWrapper OXO1;

        public OXO1(LoadMoreWrapper r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.o67.XIi00iiXO
        public int OXO1(GridLayoutManager r2, GridLayoutManager.SpanSizeLookup r3, int r4) {
            if (LoadMoreWrapper.access$000(this.OXO1, r4) == true) goto L5;
            if (r3 != null) goto L8;
            return 1;
        L8:
            return r3.getSpanSize(r4);
        L5:
            return r2.getSpanCount();
        }
    }

    public interface XIi00iiXO {
        void OXO1();
    }

    public LoadMoreWrapper(RecyclerView.Adapter r1) {
        this.mInnerAdapter = r1;
    }

    public static /* synthetic */ boolean access$000(LoadMoreWrapper r0, int r1) {
        return r0.isShowLoadMore(r1);
    }

    private boolean hasLoadMore() {
        if (this.mLoadMoreView == null) goto L5;
        return true;
    L5:
        if (this.mLoadMoreLayoutId != 0) goto L11;
        return false;
    L11:
        return true;
    }

    private boolean isShowLoadMore(int r2) {
        if (hasLoadMore() == true) goto L5;
        return false;
    L5:
        if (r2 < this.mInnerAdapter.getItemCount()) goto L10;
        return true;
    L10:
        return false;
    }

    private void setFullSpan(RecyclerView.ViewHolder r2) {
        ViewGroup.LayoutParams r3 = r2.itemView.getLayoutParams();
        if (r3 != null) goto L5;
        return;
    L5:
        if ((r3 instanceof StaggeredGridLayoutManager.LayoutParams) == false) goto L9;
        ((StaggeredGridLayoutManager.LayoutParams) r3).setFullSpan(true);
        return;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mInnerAdapter.getItemCount() + (hasLoadMore() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r2) {
        if (isShowLoadMore(r2) == false) goto L7;
        return 2147483645;
    L7:
        return this.mInnerAdapter.getItemViewType(r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView r3) {
        o67.OXO1(this.mInnerAdapter, r3, new OXO1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder r2, int r3) {
        if (isShowLoadMore(r3) == false) goto L8;
        XIi00iiXO r4 = this.mOnLoadMoreListener;
        if (r4 == null) goto L10;
        r4.OXO1();
        return;
    L10:
        return;
    L8:
        this.mInnerAdapter.onBindViewHolder(r2, r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r2, int r3) {
        if (r3 != 2147483645) goto L11;
        if (this.mLoadMoreView == null) goto L9;
        return ViewHolder.createViewHolder(r2.getContext(), this.mLoadMoreView);
    L9:
        return ViewHolder.createViewHolder(r2.getContext(), r2, this.mLoadMoreLayoutId);
    L11:
        return this.mInnerAdapter.onCreateViewHolder(r2, r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder r2) {
        this.mInnerAdapter.onViewAttachedToWindow(r2);
        if (isShowLoadMore(r2.getLayoutPosition()) == false) goto L6;
        setFullSpan(r2);
        return;
    }

    public LoadMoreWrapper setLoadMoreView(View r1) {
        this.mLoadMoreView = r1;
        return this;
    }

    public LoadMoreWrapper setOnLoadMoreListener(XIi00iiXO r1) {
        if (r1 == null) goto L4;
        this.mOnLoadMoreListener = r1;
    L4:
        return this;
    }

    public LoadMoreWrapper setLoadMoreView(int r1) {
        this.mLoadMoreLayoutId = r1;
        return this;
    }
}
