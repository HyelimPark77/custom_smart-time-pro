package com.sma.smartv3.p610ui.status.base;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseRecyclerRecordsFragmentKt {
    @aa1
    public static final GridLayoutManager.SpanSizeLookup OXO1(@aa1 GridLayoutManager gridLayoutManager, @aa1 final RecyclerView recyclerView) {
        Intrinsics.X0O(gridLayoutManager, "<this>");
        Intrinsics.X0O(recyclerView, "recyclerView");
        final int spanCount = gridLayoutManager.getSpanCount();
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                DslAdapterItem itemData$default;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                DslAdapter dslAdapter = adapter instanceof DslAdapter ? (DslAdapter) adapter : null;
                if (dslAdapter != null && dslAdapter.isAdapterStatus()) {
                    return spanCount;
                }
                if (dslAdapter == null || (itemData$default = DslAdapter.getItemData$default(dslAdapter, i, false, 2, null)) == null) {
                    return 1;
                }
                return itemData$default.getItemSpanCount() == -1 ? spanCount : itemData$default.getItemSpanCount();
            }
        };
        gridLayoutManager.setSpanSizeLookup(spanSizeLookup);
        return spanSizeLookup;
    }

    @aa1
    public static final GridLayoutManager.SpanSizeLookup XIi00iiXO(@aa1 GridLayoutManager gridLayoutManager, @aa1 final DslAdapter dslAdapter) {
        Intrinsics.X0O(gridLayoutManager, "<this>");
        Intrinsics.X0O(dslAdapter, "dslAdapter");
        final int spanCount = gridLayoutManager.getSpanCount();
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                if (dslAdapter.isAdapterStatus()) {
                    return spanCount;
                }
                DslAdapterItem itemData$default = DslAdapter.getItemData$default(dslAdapter, i, false, 2, null);
                if (itemData$default != null) {
                    return itemData$default.getItemSpanCount() == -1 ? spanCount : itemData$default.getItemSpanCount();
                }
                return 1;
            }
        };
        gridLayoutManager.setSpanSizeLookup(spanSizeLookup);
        return spanSizeLookup;
    }
}
