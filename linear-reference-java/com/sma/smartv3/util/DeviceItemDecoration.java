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

    public DeviceItemDecoration(int r1, boolean r2, boolean r3, int r4, boolean r5) {
        this.spacing = r1;
        this.firstItemNoTop = r2;
        this.itemShowLeftRight = r3;
        this.marLeftRight = r4;
        this.firstItemNoLeftRight = r5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@aa1 Rect r2, @aa1 View r3, @aa1 RecyclerView r4, @aa1 RecyclerView.State r5) {
        Intrinsics.X0O(r2, "outRect");
        Intrinsics.X0O(r3, "view");
        Intrinsics.X0O(r4, "parent");
        Intrinsics.X0O(r5, "state");
        int r6 = r4.getChildAdapterPosition(r3);
        if (r6 == 0) goto L5;
        r2.bottom = this.spacing;
    L10:
        if (this.itemShowLeftRight == false) goto L18;
        if (r6 == 0) goto L13;
    L16:
        int r7 = this.marLeftRight;
        r2.left = r7;
        r2.right = r7;
        return;
    L13:
        if (this.firstItemNoLeftRight == false) goto L16;
        r2.left = 0;
        r2.right = 0;
        return;
    L18:
        return;
    L5:
        if (this.firstItemNoTop == true) goto L7;
        r2.top = this.spacing;
    L7:
        r2.bottom = this.spacing;
        goto L10
    }

    public /* synthetic */ DeviceItemDecoration(int r2, boolean r3, boolean r4, int r5, boolean r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r7 & 4) == 0) goto L9;
        r4 = false;
    L9:
        if ((r7 & 8) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r7 & 16) == 0) goto L15;
        boolean r9 = false;
    L14:
        int r10 = r5;
        this(r2, r3, r4, r10, r9);
        return;
    L15:
        r9 = r6;
        goto L14
    }
}
