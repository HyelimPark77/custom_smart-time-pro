package com.sma.smartv3.ui.status.base;

import android.content.Context;
import androidx.annotation.IdRes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0I11;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslItemDecoration;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.HoverItemDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseRecyclerRecordsFragment<T> extends BaseDetailsFragment<T> {

    @aa1
    private DslAdapterStatusItem adapterStatus;

    @aa1
    private DslItemDecoration baseDslItemDecoration;

    @aa1
    private DslAdapter dslAdapter;
    public DslViewHolder dslViewHolder;

    @aa1
    private HoverItemDecoration hoverItemDecoration;
    public RecyclerView recyclerView;
    public SwipeRefreshLayout refreshLayout;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseRecyclerRecordsFragment() {
        this.hoverItemDecoration = new HoverItemDecoration();
        Function1 r2 = null;
        Function5 r3 = null;
        Function5 r4 = null;
        Function5 r5 = null;
        this.baseDslItemDecoration = new DslItemDecoration(r2, r3, r4, r5, 15, null);
        DslAdapter r0 = new DslAdapter(null, 1, 0 == true ? 1 : 0);
        r0.setDslAdapterStatusItem(adapterStatusItem());
        this.dslAdapter = r0;
        this.adapterStatus = new DslAdapterStatusItem();
    }

    public static /* synthetic */ void XXI(BaseRecyclerRecordsFragment r0) {
        initBaseLayout$lambda$1$0(r0);
    }

    private static final void initBaseLayout$lambda$1$0(BaseRecyclerRecordsFragment r0) {
        r0.onRefresh();
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
        DslViewHolder r0 = this.dslViewHolder;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("dslViewHolder");
        return null;
    }

    @aa1
    public final HoverItemDecoration getHoverItemDecoration() {
        return this.hoverItemDecoration;
    }

    @aa1
    public final RecyclerView getRecyclerView() {
        RecyclerView r0 = this.recyclerView;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("recyclerView");
        return null;
    }

    @aa1
    public final SwipeRefreshLayout getRefreshLayout() {
        SwipeRefreshLayout r0 = this.refreshLayout;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("refreshLayout");
        return null;
    }

    public void initBaseLayout(int r4, int r5) {
        RecyclerView r6 = (RecyclerView) getDslViewHolder().v(r4);
        if (r6 == null) goto L5;
        setRecyclerView(r6);
        r6.addItemDecoration(this.baseDslItemDecoration);
        HoverItemDecoration.attachToRecyclerView$default(this.hoverItemDecoration, r6, null, 2, null);
        r6.setHasFixedSize(true);
        final Context r0 = r6.getContext();
        r6.setLayoutManager(new BaseRecyclerRecordsFragment$initBaseLayout$1$1(r0));
        r6.setAdapter(this.dslAdapter);
    L5:
        if (r5 == 0) goto L10;
        SwipeRefreshLayout r7 = (SwipeRefreshLayout) getDslViewHolder().v(r5);
        if (r7 == null) goto L11;
        setRefreshLayout(r7);
        r7.setOnRefreshListener(new i0I11(this));
        return;
    L11:
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        int r4 = 0;
        setDslViewHolder(new DslViewHolder(getMView(), r4, 2, null));
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

    public void renderAdapter(@aa1 Function1<? super DslAdapter, Unit> r8) {
        Intrinsics.X0O(r8, "render");
        DslAdapter.render$default(this.dslAdapter, false, null, r8, 3, null);
    }

    public final void setAdapterStatus(@aa1 DslAdapterStatusItem r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.adapterStatus = r2;
    }

    public final void setBaseDslItemDecoration(@aa1 DslItemDecoration r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.baseDslItemDecoration = r2;
    }

    public final void setDslAdapter(@aa1 DslAdapter r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dslAdapter = r2;
    }

    public final void setDslViewHolder(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dslViewHolder = r2;
    }

    public final void setHoverItemDecoration(@aa1 HoverItemDecoration r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.hoverItemDecoration = r2;
    }

    public final void setRecyclerView(@aa1 RecyclerView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.recyclerView = r2;
    }

    public final void setRefreshLayout(@aa1 SwipeRefreshLayout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.refreshLayout = r2;
    }
}
