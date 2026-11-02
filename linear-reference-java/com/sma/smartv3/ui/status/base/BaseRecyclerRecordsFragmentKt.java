package com.sma.smartv3.ui.status.base;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseRecyclerRecordsFragmentKt {
    @aa1
    public static final GridLayoutManager.SpanSizeLookup OXO1(@aa1 GridLayoutManager r2, @aa1 final RecyclerView r3) {
        Intrinsics.X0O(r2, "<this>");
        Intrinsics.X0O(r3, "recyclerView");
        final int r0 = r2.getSpanCount();
        GridLayoutManager.SpanSizeLookup r1 = new BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$2(r3, r0);
        r2.setSpanSizeLookup(r1);
        return r1;
    }

    @aa1
    public static final GridLayoutManager.SpanSizeLookup XIi00iiXO(@aa1 GridLayoutManager r2, @aa1 final DslAdapter r3) {
        Intrinsics.X0O(r2, "<this>");
        Intrinsics.X0O(r3, "dslAdapter");
        final int r0 = r2.getSpanCount();
        GridLayoutManager.SpanSizeLookup r1 = new BaseRecyclerRecordsFragmentKt$dslSpanSizeLookup$spanSizeLookup$1(r3, r0);
        r2.setSpanSizeLookup(r1);
        return r1;
    }
}
