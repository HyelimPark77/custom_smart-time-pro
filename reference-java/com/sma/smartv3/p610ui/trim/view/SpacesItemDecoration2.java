package com.sma.smartv3.p610ui.trim.view;

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
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            outRect.left = this.space;
            outRect.right = 0;
            return;
        }
        int i = this.thumbnailsCount;
        if (i <= 10 || childAdapterPosition != i - 1) {
            outRect.left = 0;
            outRect.right = 0;
        } else {
            outRect.left = 0;
            outRect.right = this.space;
        }
    }
}
