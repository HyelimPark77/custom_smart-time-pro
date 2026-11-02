package com.sma.smartv3.view.swipelist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes3.dex */
public class DragListView extends SwipeListView {
    public int I1;
    public Bitmap Ii1iii0;
    public int O001I;
    public float OO;
    public Runnable OX110i;
    public int X0i1O;
    public long X100O;
    public int X11I;
    public int X11iII1O1;
    public int X1IX;
    public boolean XX1Oi;
    public XIi00iiXO XXO;
    public int XXX11i;
    public int iIXi1iiXI;
    public int iX1O1;
    public int iXiX011;
    public boolean iXiiiO;
    public View iiiO;

    public class OXO1 implements Runnable {
        public final /* synthetic */ DragListView IO;

        public OXO1(final DragListView this$0) {
            this.IO = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            DragListView.O00(this.IO, false);
            if (DragListView.XIi00iiXO(this.IO) == null) goto L6;
            DragListView.XO0O10(this.IO, System.currentTimeMillis());
            DragListView r0 = this.IO;
            r0.OIi0((int) DragListView.iO(r0));
            this.IO.invalidate();
            return;
        }
    }

    public interface XIi00iiXO {
        boolean IiI10X(int srcPosition, int position);

        void O00(View itemView);

        void OXO1(int position, View itemView, int itemViewY, int releaseX, int releaseY);

        void XIi00iiXO(int srcPosition, int position, View srcItemView, View itemView);

        Bitmap XO0O10(View itemView, Bitmap bitmap);

        void XOO0ii0(int position, View itemView);

        boolean iO(View itemView, int x, int y);
    }

    public static abstract class iO implements XIi00iiXO {
        public iO() {
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void OXO1(int position, View itemView, int itemViewY, int releaseX, int releaseY) {
            itemView.setVisibility(0);
            if (Math.abs(itemViewY - itemView.getTop()) <= (itemView.getHeight() / 5)) goto L6;
            AlphaAnimation r1 = new AlphaAnimation(0.5f, 1.0f);
            r1.setDuration(150);
            itemView.clearAnimation();
            itemView.startAnimation(r1);
            return;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void XIi00iiXO(int srcPosition, int position, View srcItemView, View itemView) {
            if (srcItemView == null) goto L7;
            if (srcPosition <= position) goto L5;
            int r3 = -srcItemView.getHeight();
        L6:
            TranslateAnimation r4 = new TranslateAnimation(0.0f, 0.0f, r3, 0.0f);
            r4.setDuration(200);
            srcItemView.clearAnimation();
            srcItemView.startAnimation(r4);
            srcItemView.setVisibility(0);
            goto L7
        L5:
            r3 = srcItemView.getHeight();
        L7:
            if (itemView == null) goto L10;
            itemView.setVisibility(4);
            return;
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void XOO0ii0(int position, View itemView) {
            itemView.setVisibility(4);
        }
    }

    public DragListView(Context context) {
        this(context, null);
    }

    public static /* bridge */ /* synthetic */ void O00(DragListView r0, boolean r1) {
        r0.XX1Oi = r1;
    }

    public static /* bridge */ /* synthetic */ Bitmap XIi00iiXO(DragListView r0) {
        return r0.Ii1iii0;
    }

    public static /* bridge */ /* synthetic */ void XO0O10(DragListView r0, long r1) {
        r0.X100O = r1;
    }

    public static /* bridge */ /* synthetic */ float iO(DragListView r0) {
        return r0.OO;
    }

    public int I0IIOi(Context context, float dp) {
        return (int) ((context.getResources().getDisplayMetrics().density * dp) + 0.5f);
    }

    public void IO() {
        Bitmap r0 = this.Ii1iii0;
        if (r0 == null) goto L8;
        r0.recycle();
        this.Ii1iii0 = null;
        XIi00iiXO r2 = this.XXO;
        if (r2 == null) goto L8;
        int r3 = this.iX1O1;
        View r4 = this.iiiO;
        int r7 = this.X0i1O;
        r2.OXO1(r3, r4, r7 - this.O001I, this.X1IX, r7);
    L8:
        if (this.iiiO == null) goto L10;
        this.iiiO = null;
    L10:
        this.XX1Oi = false;
        removeCallbacks(this.OX110i);
    }

    public final void IiI10X(int y) {
        int r5 = this.iX1O1;
        int r0 = this.I1;
        if (r5 == r0) goto L10;
        XIi00iiXO r1 = this.XXO;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.IiI10X(r0, r5) == false) goto L12;
        View r6 = this.iiiO;
        View r2 = getChildAt(this.iX1O1 - getFirstVisiblePosition());
        this.iiiO = r2;
        this.XXO.XIi00iiXO(this.I1, this.iX1O1, r6, r2);
        this.I1 = this.iX1O1;
        return;
    L12:
        return;
    }

    public void OIi0(int moveY) {
        int r0 = pointToPosition(getWidth() / 2, moveY);
        if (r0 != (-1)) goto L6;
        XOO0ii0(moveY);
        return;
    L6:
        int r2 = this.I1;
        if (r2 <= r0) goto L9;
        int r4 = -1;
    L10:
        if (r4 <= 0) goto L13;
        if (r2 > r0) goto L29;
    L14:
        int r5 = r2 - getFirstVisiblePosition();
        if (r5 >= getChildCount()) goto L28;
        if (r5 < 0) goto L28;
        int r6 = getChildAt(r5).getTop();
        int r7 = pointToPosition(0, r6);
        if (r7 == (-1)) goto L22;
        this.iX1O1 = r7;
    L22:
        if (r6 >= getChildAt(0).getTop()) goto L25;
        this.iX1O1 = 0;
    L27:
        IiI10X(r6);
        goto L28
    L25:
        if (r6 <= getChildAt(getChildCount() - 1).getBottom()) goto L27;
        this.iX1O1 = getAdapter().getCount() - 1;
    L28:
        r2 = r2 + r4;
    L29:
        XOO0ii0(moveY);
        return;
    L13:
        if (r2 < r0) goto L29;
    L9:
        r4 = 1;
        goto L10
    }

    public void XOO0ii0(final int y) {
        if (y >= this.X11iII1O1) goto L8;
        if (y > (this.iXiX011 - this.X11I)) goto L12;
        int r6 = I0IIOi(getContext(), 6.0f);
    L13:
        if (r6 == 0) goto L24;
        View r0 = getChildAt(this.iX1O1 - getFirstVisiblePosition());
        if (r0 == null) goto L25;
        setSelectionFromTop(this.iX1O1, r0.getTop() + r6);
        if (this.XX1Oi == true) goto L26;
        this.XX1Oi = true;
        long r1 = System.currentTimeMillis() - this.X100O;
        Runnable r7 = this.OX110i;
        long r2 = 15;
        if (r1 > 15) goto L22;
        r2 = 15 - r1;
    L22:
        postDelayed(r7, r2);
        return;
    L26:
        return;
    L25:
        return;
    L24:
        return;
    L12:
        r6 = 0;
        goto L13
    L8:
        if (y <= this.XXX11i) goto L12;
        if (y < (this.iXiX011 + this.X11I)) goto L12;
        r6 = -I0IIOi(getContext(), 6.0f);
        goto L13
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap r0 = this.Ii1iii0;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isRecycled() == true) goto L9;
        canvas.drawBitmap(this.Ii1iii0, 0.0f, this.X0i1O - this.O001I, null);
        return;
    }

    @Override // com.sma.smartv3.view.swipelist.SwipeListView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int r0 = ev.getAction();
        int r1 = 0;
        if (r0 == 0) goto L30;
        if (r0 == 1) goto L27;
        if (r0 == 2) goto L13;
        if (r0 == 3) goto L27;
        if (r0 == 4) goto L27;
    L47:
        return super.dispatchTouchEvent(ev);
    L13:
        if (this.Ii1iii0 == null) goto L47;
        if (this.iXiiiO == true) goto L17;
        this.XXO.XOO0ii0(this.iX1O1, this.iiiO);
        this.iXiiiO = true;
    L17:
        int r2 = (int) ev.getY();
        if (r2 >= 0) goto L21;
    L24:
        this.OO = r1;
        OIi0(r1);
        this.X0i1O = r1;
        this.X1IX = (int) ev.getX();
        invalidate();
        return true;
    L21:
        if (r2 <= getHeight()) goto L23;
        r1 = getHeight();
        goto L24
    L23:
        r1 = r2;
    L27:
        if (this.Ii1iii0 == null) goto L47;
        this.X1IX = (int) ev.getX();
        this.X0i1O = (int) ev.getY();
        IO();
        invalidate();
        return true;
    L30:
        IO();
        this.iIXi1iiXI = (int) ev.getX();
        int r3 = (int) ev.getY();
        this.iXiX011 = r3;
        int r4 = pointToPosition(this.iIXi1iiXI, r3);
        if (r4 == (-1)) goto L33;
        this.iX1O1 = r4;
        this.I1 = r4;
        ViewGroup r5 = (ViewGroup) getChildAt(r4 - getFirstVisiblePosition());
        if (r5 == null) goto L47;
        XIi00iiXO r6 = this.XXO;
        if (r6 == null) goto L47;
        if (r6.iO(r5, this.iIXi1iiXI, this.iXiX011) == false) goto L47;
        this.O001I = this.iXiX011 - r5.getTop();
        this.XXO.O00(r5);
        r5.setDrawingCacheEnabled(true);
        this.Ii1iii0 = Bitmap.createBitmap(r5.getDrawingCache());
        r5.setDrawingCacheEnabled(false);
        Bitmap r7 = this.XXO.XO0O10(r5, this.Ii1iii0);
        if (r7 != null) goto L44;
        r7 = this.Ii1iii0;
    L44:
        this.Ii1iii0 = r7;
        this.iXiiiO = false;
        this.X0i1O = this.iXiX011;
        this.X1IX = this.iIXi1iiXI;
        this.iiiO = r5;
        invalidate();
        return true;
    L33:
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int r1 = I0IIOi(getContext(), 80.0f);
        this.X11iII1O1 = r1;
        this.XXX11i = h - r1;
    }

    public void setDragItemListener(XIi00iiXO listener) {
        this.XXO = listener;
    }

    public DragListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DragListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.iXiiiO = false;
        this.XX1Oi = false;
        this.OX110i = new OXO1(this);
        setLayerType(1, null);
        this.X11I = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
