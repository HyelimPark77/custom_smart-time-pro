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

    public AIGridSpacingItemDecoration(int i, int i2) {
        this.spanCount = i;
        this.spacing = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@aa1 Rect outRect, int i, @aa1 RecyclerView recyclerView) {
        Intrinsics.X0O(outRect, "outRect");
        Intrinsics.X0O(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.X1ii(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int i2 = this.spanCount;
        int i3 = i % i2;
        if (i >= i2 && gridLayoutManager.canScrollVertically()) {
            outRect.top = this.spacing;
        }
        if (i3 > 0) {
            outRect.left = this.spacing;
        }
    }
}
