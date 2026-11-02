package com.sma.smartv3.view;

import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AIGridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacing;
    private final int spanCount;

    public AIGridSpacingItemDecoration(int r1, int r2) {
        this.spanCount = r1;
        this.spacing = r2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@aa1 Rect r3, int r4, @aa1 RecyclerView r5) {
        Intrinsics.X0O(r3, "outRect");
        Intrinsics.X0O(r5, "recyclerView");
        RecyclerView.LayoutManager r6 = r5.getLayoutManager();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager r7 = (GridLayoutManager) r6;
        int r0 = this.spanCount;
        int r1 = r4 % r0;
        if (r4 >= r0) goto L5;
    L7:
        if (r1 <= 0) goto L10;
        r3.left = this.spacing;
        return;
    L10:
        return;
    L5:
        if (r7.canScrollVertically() == false) goto L7;
        r3.top = this.spacing;
        goto L7
    }
}
