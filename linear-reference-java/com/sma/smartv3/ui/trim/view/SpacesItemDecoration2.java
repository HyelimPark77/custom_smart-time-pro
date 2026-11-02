package com.sma.smartv3.ui.trim.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class SpacesItemDecoration2 extends RecyclerView.ItemDecoration {
    private int space;
    private int thumbnailsCount;

    public SpacesItemDecoration2(int space, int thumbnailsCount) {
        this.space = space;
        this.thumbnailsCount = thumbnailsCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int r3 = parent.getChildAdapterPosition(view);
        if (r3 != 0) goto L6;
        outRect.left = this.space;
        outRect.right = 0;
        return;
    L6:
        int r5 = this.thumbnailsCount;
        if (r5 > 10) goto L9;
    L12:
        outRect.left = 0;
        outRect.right = 0;
        return;
    L9:
        if (r3 != (r5 - 1)) goto L12;
        outRect.left = 0;
        outRect.right = this.space;
    }
}
