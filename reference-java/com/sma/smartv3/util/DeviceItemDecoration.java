package com.sma.smartv3.util;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceItemDecoration extends RecyclerView.ItemDecoration {
    private final boolean firstItemNoLeftRight;
    private final boolean firstItemNoTop;
    private final boolean itemShowLeftRight;
    private final int marLeftRight;
    private final int spacing;

    public DeviceItemDecoration(int i, boolean z, boolean z2, int i2, boolean z3) {
        this.spacing = i;
        this.firstItemNoTop = z;
        this.itemShowLeftRight = z2;
        this.marLeftRight = i2;
        this.firstItemNoLeftRight = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@aa1 Rect outRect, @aa1 View view, @aa1 RecyclerView parent, @aa1 RecyclerView.State state) {
        Intrinsics.X0O(outRect, "outRect");
        Intrinsics.X0O(view, "view");
        Intrinsics.X0O(parent, "parent");
        Intrinsics.X0O(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == 0 && !this.firstItemNoTop) {
            outRect.top = this.spacing;
        }
        outRect.bottom = this.spacing;
        if (this.itemShowLeftRight) {
            if (childAdapterPosition == 0 && this.firstItemNoLeftRight) {
                outRect.left = 0;
                outRect.right = 0;
            } else {
                int i = this.marLeftRight;
                outRect.left = i;
                outRect.right = i;
            }
        }
    }

    public /* synthetic */ DeviceItemDecoration(int i, boolean z, boolean z2, int i2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? false : z3);
    }
}
