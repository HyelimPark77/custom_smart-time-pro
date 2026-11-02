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
    private SparseArrayCompat<View> mFootViews;
    private SparseArrayCompat<View> mHeaderViews;
    private RecyclerView.Adapter mInnerAdapter;

    public class OXO1 implements o67.XIi00iiXO {
        public final /* synthetic */ HeaderAndFooterWrapper OXO1;

        public OXO1(HeaderAndFooterWrapper r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.o67.XIi00iiXO
        public int OXO1(GridLayoutManager r3, GridLayoutManager.SpanSizeLookup r4, int r5) {
            int r0 = this.OXO1.getItemViewType(r5);
            if (HeaderAndFooterWrapper.access$000(this.OXO1).get(r0) == null) goto L7;
            return r3.getSpanCount();
        L7:
            if (HeaderAndFooterWrapper.access$100(this.OXO1).get(r0) != null) goto L9;
            if (r4 != null) goto L12;
            return 1;
        L12:
            return r4.getSpanSize(r5);
        L9:
            return r3.getSpanCount();
        }
    }

    public HeaderAndFooterWrapper(RecyclerView.Adapter r2) {
        this.mHeaderViews = new SparseArrayCompat();
        this.mFootViews = new SparseArrayCompat();
        this.mInnerAdapter = r2;
    }

    public static /* synthetic */ SparseArrayCompat access$000(HeaderAndFooterWrapper r0) {
        return r0.mHeaderViews;
    }

    public static /* synthetic */ SparseArrayCompat access$100(HeaderAndFooterWrapper r0) {
        return r0.mFootViews;
    }

    private int getRealItemCount() {
        return this.mInnerAdapter.getItemCount();
    }

    private boolean isFooterViewPos(int r3) {
        if (r3 < (getHeadersCount() + getRealItemCount())) goto L6;
        return true;
    L6:
        return false;
    }

    private boolean isHeaderViewPos(int r2) {
        if (r2 >= getHeadersCount()) goto L6;
        return true;
    L6:
        return false;
    }

    public void addFootView(View r4) {
        SparseArrayCompat<View> r0 = this.mFootViews;
        r0.put(r0.size() + 200000, r4);
    }

    public void addHeaderView(View r4) {
        SparseArrayCompat<View> r0 = this.mHeaderViews;
        r0.put(r0.size() + 100000, r4);
    }

    public int getFootersCount() {
        return size();
    }

    public int getHeadersCount() {
        return size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return (getHeadersCount() + getFootersCount()) + getRealItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r3) {
        if (isHeaderViewPos(r3) == false) goto L7;
        return keyAt(r3);
    L7:
        if (isFooterViewPos(r3) == false) goto L11;
        return keyAt((r3 - getHeadersCount()) - getRealItemCount());
    L11:
        return this.mInnerAdapter.getItemViewType(r3 - getHeadersCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView r3) {
        o67.OXO1(this.mInnerAdapter, r3, new OXO1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder r3, int r4) {
        if (isHeaderViewPos(r4) == false) goto L6;
        return;
    L6:
        if (isFooterViewPos(r4) == false) goto L8;
        return;
    L8:
        this.mInnerAdapter.onBindViewHolder(r3, r4 - getHeadersCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r2, int r3) {
        if (get(r3) == null) goto L7;
        return ViewHolder.createViewHolder(r2.getContext(), get(r3));
    L7:
        if (get(r3) == null) goto L11;
        return ViewHolder.createViewHolder(r2.getContext(), get(r3));
    L11:
        return this.mInnerAdapter.onCreateViewHolder(r2, r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder r3) {
        this.mInnerAdapter.onViewAttachedToWindow(r3);
        int r0 = r3.getLayoutPosition();
        if (isHeaderViewPos(r0) == false) goto L5;
    L8:
        o67.XIi00iiXO(r3);
        return;
    L5:
        if (isFooterViewPos(r0) == true) goto L8;
    }
}
