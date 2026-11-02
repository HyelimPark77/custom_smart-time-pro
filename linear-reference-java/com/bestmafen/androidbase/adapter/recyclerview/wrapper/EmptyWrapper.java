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
        public final /* synthetic */ EmptyWrapper OXO1;

        public OXO1(EmptyWrapper r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.o67.XIi00iiXO
        public int OXO1(GridLayoutManager r2, GridLayoutManager.SpanSizeLookup r3, int r4) {
            if (EmptyWrapper.access$000(this.OXO1) == true) goto L5;
            if (r3 != null) goto L8;
            return 1;
        L8:
            return r3.getSpanSize(r4);
        L5:
            return r2.getSpanCount();
        }
    }

    public EmptyWrapper(RecyclerView.Adapter r1) {
        this.mInnerAdapter = r1;
    }

    public static /* synthetic */ boolean access$000(EmptyWrapper r0) {
        return r0.isEmpty();
    }

    private boolean isEmpty() {
        if (this.mEmptyView != null) goto L7;
        if (this.mEmptyLayoutId != 0) goto L7;
        return false;
    L7:
        if (this.mInnerAdapter.getItemCount() != 0) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (isEmpty() == false) goto L7;
        return 1;
    L7:
        return this.mInnerAdapter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r2) {
        if (isEmpty() == false) goto L7;
        return ITEM_TYPE_EMPTY;
    L7:
        return this.mInnerAdapter.getItemViewType(r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView r3) {
        o67.OXO1(this.mInnerAdapter, r3, new OXO1(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder r2, int r3) {
        if (isEmpty() == false) goto L5;
        return;
    L5:
        this.mInnerAdapter.onBindViewHolder(r2, r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r2, int r3) {
        if (isEmpty() == false) goto L11;
        if (this.mEmptyView == null) goto L9;
        return ViewHolder.createViewHolder(r2.getContext(), this.mEmptyView);
    L9:
        return ViewHolder.createViewHolder(r2.getContext(), r2, this.mEmptyLayoutId);
    L11:
        return this.mInnerAdapter.onCreateViewHolder(r2, r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder r2) {
        this.mInnerAdapter.onViewAttachedToWindow(r2);
        if (isEmpty() == false) goto L6;
        o67.XIi00iiXO(r2);
        return;
    }

    public void setEmptyView(View r1) {
        this.mEmptyView = r1;
    }

    public void setEmptyView(int r1) {
        this.mEmptyLayoutId = r1;
    }
}
