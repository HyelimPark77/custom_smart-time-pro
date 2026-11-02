package com.sma.smartv3.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeStaggeredItemDecoration extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@aa1 Rect outRect, @aa1 View view, @aa1 RecyclerView parent, @aa1 RecyclerView.State state) {
        Intrinsics.X0O(outRect, "outRect");
        Intrinsics.X0O(view, "view");
        Intrinsics.X0O(parent, "parent");
        Intrinsics.X0O(state, "state");
        parent.getChildAdapterPosition(view);
        int iDp2px = SizeUtils.dp2px(6.0f);
        if (view.getWidth() < parent.getWidth()) {
            outRect.left = iDp2px;
            outRect.right = iDp2px;
        }
    }
}
