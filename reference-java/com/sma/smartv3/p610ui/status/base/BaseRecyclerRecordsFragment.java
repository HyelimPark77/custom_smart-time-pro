package com.sma.smartv3.p610ui.status.base;

import android.content.Context;
import androidx.annotation.IdRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslItemDecoration;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.HoverItemDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRecyclerRecordsFragment<T> extends BaseDetailsFragment<T> {

    @aa1
    private DslAdapterStatusItem adapterStatus;

    @aa1
    private DslAdapter dslAdapter;
    public DslViewHolder dslViewHolder;
    public RecyclerView recyclerView;
    public SwipeRefreshLayout refreshLayout;

    @aa1
    private HoverItemDecoration hoverItemDecoration = new HoverItemDecoration();

    @aa1
    private DslItemDecoration baseDslItemDecoration = new DslItemDecoration(null, null, null, null, 15, null);

    public BaseRecyclerRecordsFragment() {
        DslAdapter dslAdapter = new DslAdapter(null, 1, null);
        dslAdapter.setDslAdapterStatusItem(adapterStatusItem());
        this.dslAdapter = dslAdapter;
        this.adapterStatus = new DslAdapterStatusItem();
    }

    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        return new DslAdapterStatusItem();
    }

    @aa1
    public final DslAdapterStatusItem getAdapterStatus() {
        return this.adapterStatus;
    }

    @aa1
    public final DslItemDecoration getBaseDslItemDecoration() {
        return this.baseDslItemDecoration;
    }

    @aa1
    public final DslAdapter getDslAdapter() {
        return this.dslAdapter;
    }

    @aa1
    public final DslViewHolder getDslViewHolder() {
        DslViewHolder dslViewHolder = this.dslViewHolder;
        if (dslViewHolder != null) {
            return dslViewHolder;
        }
        Intrinsics.XXO("dslViewHolder");
        return null;
    }

    @aa1
    public final HoverItemDecoration getHoverItemDecoration() {
        return this.hoverItemDecoration;
    }

    @aa1
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.XXO("recyclerView");
        return null;
    }

    @aa1
    public final SwipeRefreshLayout getRefreshLayout() {
        SwipeRefreshLayout swipeRefreshLayout = this.refreshLayout;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        Intrinsics.XXO("refreshLayout");
        return null;
    }

    public void initBaseLayout(int i, int i2) {
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerView recyclerView = (RecyclerView) getDslViewHolder().m3483v(i);
        if (recyclerView != null) {
            setRecyclerView(recyclerView);
            recyclerView.addItemDecoration(this.baseDslItemDecoration);
            HoverItemDecoration.attachToRecyclerView$default(this.hoverItemDecoration, recyclerView, null, 2, null);
            recyclerView.setHasFixedSize(true);
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment$initBaseLayout$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                    try {
                        super.onLayoutChildren(recycler, state);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            recyclerView.setAdapter(this.dslAdapter);
        }
        if (i2 == 0 || (swipeRefreshLayout = (SwipeRefreshLayout) getDslViewHolder().m3483v(i2)) == null) {
            return;
        }
        setRefreshLayout(swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.android.mltcode.paycertificationapi.i0I11
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                this.OXO1.onRefresh();
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        setDslViewHolder(new DslViewHolder(getMView(), 0, 2, null));
        initBaseLayout(recyclerViewId(), refreshLayoutId());
        onInitBaseLayoutAfter();
    }

    public void onInitBaseLayoutAfter() {
    }

    public void onRefresh() {
    }

    @IdRes
    public abstract int recyclerViewId();

    @IdRes
    public abstract int refreshLayoutId();

    public void renderAdapter(@aa1 Function1<? super DslAdapter, Unit> render) {
        Intrinsics.X0O(render, "render");
        DslAdapter.render$default(this.dslAdapter, false, null, render, 3, null);
    }

    public final void setAdapterStatus(@aa1 DslAdapterStatusItem dslAdapterStatusItem) {
        Intrinsics.X0O(dslAdapterStatusItem, "<set-?>");
        this.adapterStatus = dslAdapterStatusItem;
    }

    public final void setBaseDslItemDecoration(@aa1 DslItemDecoration dslItemDecoration) {
        Intrinsics.X0O(dslItemDecoration, "<set-?>");
        this.baseDslItemDecoration = dslItemDecoration;
    }

    public final void setDslAdapter(@aa1 DslAdapter dslAdapter) {
        Intrinsics.X0O(dslAdapter, "<set-?>");
        this.dslAdapter = dslAdapter;
    }

    public final void setDslViewHolder(@aa1 DslViewHolder dslViewHolder) {
        Intrinsics.X0O(dslViewHolder, "<set-?>");
        this.dslViewHolder = dslViewHolder;
    }

    public final void setHoverItemDecoration(@aa1 HoverItemDecoration hoverItemDecoration) {
        Intrinsics.X0O(hoverItemDecoration, "<set-?>");
        this.hoverItemDecoration = hoverItemDecoration;
    }

    public final void setRecyclerView(@aa1 RecyclerView recyclerView) {
        Intrinsics.X0O(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
    }

    public final void setRefreshLayout(@aa1 SwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.X0O(swipeRefreshLayout, "<set-?>");
        this.refreshLayout = swipeRefreshLayout;
    }
}
