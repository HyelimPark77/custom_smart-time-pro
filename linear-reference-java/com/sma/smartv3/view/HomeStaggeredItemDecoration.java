package com.sma.smartv3.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeStaggeredItemDecoration extends RecyclerView.ItemDecoration {
    public HomeStaggeredItemDecoration() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@aa1 Rect r2, @aa1 View r3, @aa1 RecyclerView r4, @aa1 RecyclerView.State r5) {
        Intrinsics.X0O(r2, "outRect");
        Intrinsics.X0O(r3, "view");
        Intrinsics.X0O(r4, "parent");
        Intrinsics.X0O(r5, "state");
        r4.getChildAdapterPosition(r3);
        int r6 = SizeUtils.dp2px(6.0f);
        if (r3.getWidth() >= r4.getWidth()) goto L6;
        r2.left = r6;
        r2.right = r6;
        return;
    }
}
