package com.sma.smartv3.otherdevice.jl.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes19.dex */
public class CommonDecoration extends RecyclerView.ItemDecoration {
    private static final int[] attrs = null;
    private int dividerHeight;
    private Drawable mDivider;
    private int orientation;

    static {
        attrs = new int[]{R.attr.listDivider};
    }

    public CommonDecoration(Context context, int orientation) {
        this.dividerHeight = 1;
        TypedArray r3 = context.obtainStyledAttributes(attrs);
        Drawable r0 = r3.getDrawable(0);
        if (r0 == null) goto L5;
        init(orientation, r0, r0.getIntrinsicHeight());
    L5:
        r3.recycle();
    }

    private void drawHDeraction(Canvas c, RecyclerView parent) {
        int r0 = parent.getPaddingLeft();
        int r1 = parent.getWidth() - parent.getPaddingRight();
        int r2 = parent.getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        View r4 = parent.getChildAt(r3);
        RecyclerView.LayoutParams r5 = (RecyclerView.LayoutParams) r4.getLayoutParams();
        int r6 = r4.getBottom() + ((ViewGroup.MarginLayoutParams) r5).bottomMargin;
        int r7 = this.dividerHeight + r6;
        this.mDivider.setBounds(r0, r6, r1, r7);
        this.mDivider.draw(c);
        r3 = r3 + 1;
        goto L3
    }

    private void drawVDeraction(Canvas c, RecyclerView parent) {
        int r0 = parent.getPaddingTop();
        int r1 = parent.getHeight() - parent.getPaddingBottom();
        int r2 = parent.getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        View r4 = parent.getChildAt(r3);
        RecyclerView.LayoutParams r5 = (RecyclerView.LayoutParams) r4.getLayoutParams();
        int r6 = r4.getRight() + ((ViewGroup.MarginLayoutParams) r5).rightMargin;
        int r7 = this.dividerHeight + r6;
        this.mDivider.setBounds(r6, r0, r7, r1);
        this.mDivider.draw(c);
        r3 = r3 + 1;
        goto L3
    }

    private void init(int orientation, Drawable drawable, int height) {
        this.mDivider = drawable;
        this.orientation = orientation;
        this.dividerHeight = height;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        if (this.orientation != 0) goto L6;
        outRect.set(0, 0, this.dividerHeight, 0);
        return;
    L6:
        outRect.set(0, 0, 0, this.dividerHeight);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        drawHDeraction(c, parent);
        drawVDeraction(c, parent);
    }

    public CommonDecoration(Context context, int orientation, int color, int height) {
        this.dividerHeight = 1;
        init(orientation, new ColorDrawable(color), height);
    }

    public CommonDecoration(Context context, int orientation, Drawable drawable) {
        this.dividerHeight = 1;
        init(orientation, drawable, drawable.getIntrinsicHeight());
    }
}
