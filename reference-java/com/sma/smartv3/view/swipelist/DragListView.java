package com.sma.smartv3.view.swipelist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes3.dex */
public class DragListView extends SwipeListView {

    /* JADX INFO: renamed from: I1 */
    public int f55107I1;
    public Bitmap Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public float f55108OO;
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
        public OXO1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DragListView.this.XX1Oi = false;
            if (DragListView.this.Ii1iii0 != null) {
                DragListView.this.X100O = System.currentTimeMillis();
                DragListView dragListView = DragListView.this;
                dragListView.OIi0((int) dragListView.f55108OO);
                DragListView.this.invalidate();
            }
        }
    }

    public interface XIi00iiXO {
        boolean IiI10X(int srcPosition, int position);

        void O00(View itemView);

        void OXO1(int position, View itemView, int itemViewY, int releaseX, int releaseY);

        void XIi00iiXO(int srcPosition, int position, View srcItemView, View itemView);

        Bitmap XO0O10(View itemView, Bitmap bitmap);

        void XOO0ii0(int position, View itemView);

        /* JADX INFO: renamed from: iO */
        boolean mo38509iO(View itemView, int x, int y);
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.swipelist.DragListView$iO */
    public static abstract class AbstractC19079iO implements XIi00iiXO {
        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void OXO1(int position, View itemView, int itemViewY, int releaseX, int releaseY) {
            itemView.setVisibility(0);
            if (Math.abs(itemViewY - itemView.getTop()) > itemView.getHeight() / 5) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
                alphaAnimation.setDuration(150L);
                itemView.clearAnimation();
                itemView.startAnimation(alphaAnimation);
            }
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void XIi00iiXO(int srcPosition, int position, View srcItemView, View itemView) {
            if (srcItemView != null) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, srcPosition > position ? -srcItemView.getHeight() : srcItemView.getHeight(), 0.0f);
                translateAnimation.setDuration(200L);
                srcItemView.clearAnimation();
                srcItemView.startAnimation(translateAnimation);
                srcItemView.setVisibility(0);
            }
            if (itemView != null) {
                itemView.setVisibility(4);
            }
        }

        @Override // com.sma.smartv3.view.swipelist.DragListView.XIi00iiXO
        public void XOO0ii0(int position, View itemView) {
            itemView.setVisibility(4);
        }
    }

    public DragListView(Context context) {
        this(context, null);
    }

    public int I0IIOi(Context context, float dp) {
        return (int) ((context.getResources().getDisplayMetrics().density * dp) + 0.5f);
    }

    /* JADX INFO: renamed from: IO */
    public void m38954IO() {
        Bitmap bitmap = this.Ii1iii0;
        if (bitmap != null) {
            bitmap.recycle();
            this.Ii1iii0 = null;
            XIi00iiXO xIi00iiXO = this.XXO;
            if (xIi00iiXO != null) {
                int i = this.iX1O1;
                View view = this.iiiO;
                int i2 = this.X0i1O;
                xIi00iiXO.OXO1(i, view, i2 - this.O001I, this.X1IX, i2);
            }
        }
        if (this.iiiO != null) {
            this.iiiO = null;
        }
        this.XX1Oi = false;
        removeCallbacks(this.OX110i);
    }

    public final void IiI10X(int y) {
        XIi00iiXO xIi00iiXO;
        int i = this.iX1O1;
        int i2 = this.f55107I1;
        if (i == i2 || (xIi00iiXO = this.XXO) == null || !xIi00iiXO.IiI10X(i2, i)) {
            return;
        }
        View view = this.iiiO;
        View childAt = getChildAt(this.iX1O1 - getFirstVisiblePosition());
        this.iiiO = childAt;
        this.XXO.XIi00iiXO(this.f55107I1, this.iX1O1, view, childAt);
        this.f55107I1 = this.iX1O1;
    }

    public void OIi0(int moveY) {
        int firstVisiblePosition;
        int iPointToPosition = pointToPosition(getWidth() / 2, moveY);
        if (iPointToPosition == -1) {
            XOO0ii0(moveY);
            return;
        }
        int i = this.f55107I1;
        int i2 = i > iPointToPosition ? -1 : 1;
        while (true) {
            if (i2 > 0) {
                if (i > iPointToPosition) {
                    break;
                }
                firstVisiblePosition = i - getFirstVisiblePosition();
                if (firstVisiblePosition >= getChildCount() && firstVisiblePosition >= 0) {
                    int top = getChildAt(firstVisiblePosition).getTop();
                    int iPointToPosition2 = pointToPosition(0, top);
                    if (iPointToPosition2 != -1) {
                        this.iX1O1 = iPointToPosition2;
                    }
                    if (top < getChildAt(0).getTop()) {
                        this.iX1O1 = 0;
                    } else if (top > getChildAt(getChildCount() - 1).getBottom()) {
                        this.iX1O1 = getAdapter().getCount() - 1;
                    }
                    IiI10X(top);
                }
                i += i2;
            } else {
                if (i < iPointToPosition) {
                    break;
                }
                firstVisiblePosition = i - getFirstVisiblePosition();
                if (firstVisiblePosition >= getChildCount()) {
                }
                i += i2;
            }
        }
        XOO0ii0(moveY);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public void XOO0ii0(final int y) {
        int iI0IIOi;
        View childAt;
        if (y < this.X11iII1O1) {
            if (y <= this.iXiX011 - this.X11I) {
                iI0IIOi = I0IIOi(getContext(), 6.0f);
            } else {
                iI0IIOi = 0;
            }
        } else if (y <= this.XXX11i || y < this.iXiX011 + this.X11I) {
            iI0IIOi = 0;
        } else {
            iI0IIOi = -I0IIOi(getContext(), 6.0f);
        }
        if (iI0IIOi == 0 || (childAt = getChildAt(this.iX1O1 - getFirstVisiblePosition())) == null) {
            return;
        }
        setSelectionFromTop(this.iX1O1, childAt.getTop() + iI0IIOi);
        if (this.XX1Oi) {
            return;
        }
        this.XX1Oi = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.X100O;
        postDelayed(this.OX110i, jCurrentTimeMillis <= 15 ? 15 - jCurrentTimeMillis : 15L);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Bitmap bitmap = this.Ii1iii0;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.Ii1iii0, 0.0f, this.X0i1O - this.O001I, (Paint) null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    @Override // com.sma.smartv3.view.swipelist.SwipeListView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        XIi00iiXO xIi00iiXO;
        int action = ev.getAction();
        int height = 0;
        if (action == 0) {
            m38954IO();
            this.iIXi1iiXI = (int) ev.getX();
            int y = (int) ev.getY();
            this.iXiX011 = y;
            int iPointToPosition = pointToPosition(this.iIXi1iiXI, y);
            if (iPointToPosition == -1) {
                return super.dispatchTouchEvent(ev);
            }
            this.iX1O1 = iPointToPosition;
            this.f55107I1 = iPointToPosition;
            ViewGroup viewGroup = (ViewGroup) getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (viewGroup != null && (xIi00iiXO = this.XXO) != null && xIi00iiXO.mo38509iO(viewGroup, this.iIXi1iiXI, this.iXiX011)) {
                this.O001I = this.iXiX011 - viewGroup.getTop();
                this.XXO.O00(viewGroup);
                viewGroup.setDrawingCacheEnabled(true);
                this.Ii1iii0 = Bitmap.createBitmap(viewGroup.getDrawingCache());
                viewGroup.setDrawingCacheEnabled(false);
                Bitmap bitmapXO0O10 = this.XXO.XO0O10(viewGroup, this.Ii1iii0);
                if (bitmapXO0O10 == null) {
                    bitmapXO0O10 = this.Ii1iii0;
                }
                this.Ii1iii0 = bitmapXO0O10;
                this.iXiiiO = false;
                this.X0i1O = this.iXiX011;
                this.X1IX = this.iIXi1iiXI;
                this.iiiO = viewGroup;
                invalidate();
                return true;
            }
        } else if (action == 1) {
            if (this.Ii1iii0 != null) {
                this.X1IX = (int) ev.getX();
                this.X0i1O = (int) ev.getY();
                m38954IO();
                invalidate();
                return true;
            }
        } else if (action != 2) {
            if (action == 3 || action == 4) {
                if (this.Ii1iii0 != null) {
                    this.X1IX = (int) ev.getX();
                    this.X0i1O = (int) ev.getY();
                    m38954IO();
                    invalidate();
                    return true;
                }
            }
        } else if (this.Ii1iii0 != null) {
            if (!this.iXiiiO) {
                this.XXO.XOO0ii0(this.iX1O1, this.iiiO);
                this.iXiiiO = true;
            }
            int y2 = (int) ev.getY();
            if (y2 >= 0) {
                height = y2 > getHeight() ? getHeight() : y2;
            }
            this.f55108OO = height;
            OIi0(height);
            this.X0i1O = height;
            this.X1IX = (int) ev.getX();
            invalidate();
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int iI0IIOi = I0IIOi(getContext(), 80.0f);
        this.X11iII1O1 = iI0IIOi;
        this.XXX11i = h - iI0IIOi;
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
        this.OX110i = new OXO1();
        setLayerType(1, null);
        this.X11I = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
