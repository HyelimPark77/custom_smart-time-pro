package com.sma.smartv3.view.WheelView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.mltcode.paycertificationapi.C3058w4;
import com.android.mltcode.paycertificationapi.C3194zw;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.eg1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.mn4;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class WheelView extends View {

    /* JADX INFO: renamed from: I1 */
    public Context f55063I1;

    /* JADX INFO: renamed from: IO */
    public float f55064IO;
    public int IO0II0i;
    public int IXI;
    public int IXOIIIO;
    public int Ii0X0X;
    public int Ii0i;
    public int Ii1iii0;
    public int IiiXiI0I;
    public Paint O001I;

    /* JADX INFO: renamed from: OO */
    public boolean f55065OO;
    public float OX110i;
    public int X00XIX1;
    public int X00Xi1X;
    public ScheduledFuture<?> X0i1O;

    /* JADX INFO: renamed from: X1 */
    public int f55066X1;
    public int X100O;
    public int X11I;
    public GestureDetector X11iII1O1;
    public ScheduledExecutorService X1IX;
    public int XO0X10iO;
    public float XOIX;
    public Rect XOO0XOOii;
    public int XOX0O0;
    public long XOXiX0;
    public int XX1Oi;
    public List<String> XXO;
    public dg1 XXX11i;
    public int XXiIiX10;
    public int i0X000X0O;
    public int i11I;
    public Paint iIXi1iiXI;
    public int iOiXi11II;
    public Handler iX1O1;
    public Paint iXiX011;
    public int iXiiiO;
    public int iiiO;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public WheelView(Context context) {
        super(context);
        this.f55064IO = 1.15f;
        this.X1IX = Executors.newSingleThreadScheduledExecutor();
        this.IXOIIIO = 0;
        this.IO0II0i = 0;
        this.IiiXiI0I = 0;
        this.XOXiX0 = 0L;
        this.XOO0XOOii = new Rect();
        m38919iO(context);
    }

    public final void I0IIOi(float velocityY) {
        OXO1();
        this.X0i1O = this.X1IX.scheduleWithFixedDelay(new C3058w4(this, velocityY), 0L, 10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: IO */
    public void m38918IO(int left, int top, int right, int bottom) {
        this.IXOIIIO = left;
        this.IO0II0i = right;
    }

    public final void IiI10X() {
        if (this.XXX11i != null) {
            postDelayed(new eg1(this), 50L);
        }
    }

    public final void O00() {
        for (int i = 0; i < this.XXO.size(); i++) {
            String str = this.XXO.get(i);
            this.iXiX011.getTextBounds(str, 0, str.length(), this.XOO0XOOii);
            this.iXiX011.getTextBounds("星期", 0, 2, this.XOO0XOOii);
            int iHeight = this.XOO0XOOii.height();
            if (iHeight > this.iiiO) {
                this.iiiO = iHeight;
            }
        }
    }

    public void OIX0iXi(ACTION action) {
        OXO1();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f = this.OX110i * this.iiiO;
            int i = (int) (((this.X00XIX1 % f) + f) % f);
            this.IiiXiI0I = i;
            if (i > f / 2.0f) {
                this.IiiXiI0I = (int) (f - i);
            } else {
                this.IiiXiI0I = -i;
            }
        }
        this.X0i1O = this.X1IX.scheduleWithFixedDelay(new mn4(this, this.IiiXiI0I), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public final void OIi0() {
        this.f55065OO = false;
    }

    public void OXO1() {
        ScheduledFuture<?> scheduledFuture = this.X0i1O;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.X0i1O.cancel(true);
        this.X0i1O = null;
    }

    public final int XIi00iiXO(String a, Paint paint, Rect rect) {
        paint.getTextBounds(a, 0, a.length(), rect);
        return Math.max((this.f55066X1 - rect.width()) / 2, 0);
    }

    public final void XO0O10() {
        Paint paint = new Paint();
        this.iIXi1iiXI = paint;
        paint.setColor(this.X11I);
        this.iIXi1iiXI.setAntiAlias(true);
        Paint paint2 = this.iIXi1iiXI;
        iiOI111I iioi111i = iiOI111I.OXO1;
        MyTypeface myTypeface = MyTypeface.DIN_COND_BOLD;
        paint2.setTypeface(iioi111i.OXO1(myTypeface, this.f55063I1));
        this.iIXi1iiXI.setTextSize(this.iXiiiO);
        Paint paint3 = new Paint();
        this.iXiX011 = paint3;
        paint3.setColor(this.X100O);
        this.iXiX011.setAntiAlias(true);
        this.iXiX011.setTextScaleX(this.f55064IO);
        this.iXiX011.setTypeface(iioi111i.OXO1(myTypeface, this.f55063I1));
        this.iXiX011.setTextSize(this.iXiiiO);
        Paint paint4 = new Paint();
        this.O001I = paint4;
        paint4.setColor(this.XX1Oi);
        this.O001I.setAntiAlias(true);
        setLayerType(1, null);
    }

    public final void XOO0ii0() {
        if (this.XXO == null) {
            return;
        }
        O00();
        int i = this.iiiO;
        float f = this.OX110i;
        int i2 = (int) (i * f * (this.XXiIiX10 - 1));
        this.Ii0i = i2;
        int i3 = (int) (((double) (i2 * 2)) / 3.141592653589793d);
        this.X00Xi1X = i3;
        this.IXI = (int) (((double) i2) / 3.141592653589793d);
        this.XOX0O0 = (int) ((i3 - (i * f)) / 2.0f);
        this.iOiXi11II = (int) ((i3 + (f * i)) / 2.0f);
        if (this.i0X000X0O == -1) {
            if (this.f55065OO) {
                this.i0X000X0O = (this.XXO.size() + 1) / 2;
            } else {
                this.i0X000X0O = 0;
            }
        }
        this.XO0X10iO = this.i0X000X0O;
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return this.IXOIIIO;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return this.IO0II0i;
    }

    public final int getSelectedItem() {
        return this.i11I;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38919iO(Context context) {
        gk4.I0IIOi = isInEditMode();
        this.f55063I1 = context;
        this.iX1O1 = new OXO1(this);
        GestureDetector gestureDetector = new GestureDetector(context, new C3194zw(this));
        this.X11iII1O1 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.OX110i = 2.0f;
        this.f55065OO = true;
        this.XXiIiX10 = 7;
        this.X11I = -5263441;
        this.X100O = gk4.m1859iO(context, R.color.colorAccent);
        this.XX1Oi = -3815995;
        this.X00XIX1 = 0;
        this.i0X000X0O = -1;
        XO0O10();
        setTextSize(24.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        List<String> list = this.XXO;
        if (list == null) {
            return;
        }
        String[] strArr = new String[this.XXiIiX10];
        int i = (int) (this.X00XIX1 / (this.OX110i * this.iiiO));
        this.Ii0X0X = i;
        int size = this.i0X000X0O + (i % list.size());
        this.XO0X10iO = size;
        if (this.f55065OO) {
            if (size < 0) {
                this.XO0X10iO = this.XXO.size() + this.XO0X10iO;
            }
            if (this.XO0X10iO > this.XXO.size() - 1) {
                this.XO0X10iO -= this.XXO.size();
            }
        } else {
            if (size < 0) {
                this.XO0X10iO = 0;
            }
            if (this.XO0X10iO > this.XXO.size() - 1) {
                this.XO0X10iO = this.XXO.size() - 1;
            }
        }
        int i2 = (int) (this.X00XIX1 % (this.OX110i * this.iiiO));
        int i3 = 0;
        while (true) {
            int i4 = this.XXiIiX10;
            if (i3 >= i4) {
                break;
            }
            int size2 = this.XO0X10iO - ((i4 / 2) - i3);
            if (this.f55065OO) {
                while (size2 < 0) {
                    size2 += this.XXO.size();
                }
                while (size2 > this.XXO.size() - 1) {
                    size2 -= this.XXO.size();
                }
                strArr[i3] = this.XXO.get(size2);
            } else if (size2 < 0) {
                strArr[i3] = "";
            } else if (size2 > this.XXO.size() - 1) {
                strArr[i3] = "";
            } else {
                strArr[i3] = this.XXO.get(size2);
            }
            i3++;
        }
        for (int i5 = 0; i5 < this.XXiIiX10; i5++) {
            canvas.save();
            float f = this.iiiO * this.OX110i;
            double d = (((double) ((i5 * f) - i2)) * 3.141592653589793d) / ((double) this.Ii0i);
            float f2 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
            if (f2 >= 90.0f || f2 <= -90.0f) {
                canvas.restore();
            } else {
                int iCos = (int) ((((double) this.IXI) - (Math.cos(d) * ((double) this.IXI))) - ((Math.sin(d) * ((double) this.iiiO)) / 2.0d));
                canvas.translate(0.0f, iCos);
                canvas.scale(1.0f, (float) Math.sin(d));
                int i6 = this.XOX0O0;
                if (iCos > i6 || this.iiiO + iCos < i6) {
                    int i7 = this.iOiXi11II;
                    if (iCos <= i7 && this.iiiO + iCos >= i7) {
                        canvas.save();
                        canvas.clipRect(0, 0, this.f55066X1, this.iOiXi11II - iCos);
                        String str = strArr[i5];
                        canvas.drawText(str, XIi00iiXO(str, this.iXiX011, this.XOO0XOOii), this.iiiO, this.iXiX011);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0, this.iOiXi11II - iCos, this.f55066X1, (int) f);
                        String str2 = strArr[i5];
                        canvas.drawText(str2, XIi00iiXO(str2, this.iIXi1iiXI, this.XOO0XOOii), this.iiiO, this.iIXi1iiXI);
                        canvas.restore();
                    } else if (iCos < i6 || this.iiiO + iCos > i7) {
                        canvas.clipRect(0, 0, this.f55066X1, (int) f);
                        String str3 = strArr[i5];
                        canvas.drawText(str3, XIi00iiXO(str3, this.iIXi1iiXI, this.XOO0XOOii), this.iiiO, this.iIXi1iiXI);
                    } else {
                        canvas.clipRect(0, 0, this.f55066X1, (int) f);
                        String str4 = strArr[i5];
                        canvas.drawText(str4, XIi00iiXO(str4, this.iXiX011, this.XOO0XOOii), this.iiiO, this.iXiX011);
                        this.i11I = this.XXO.indexOf(strArr[i5]);
                    }
                } else {
                    canvas.save();
                    canvas.clipRect(0, 0, this.f55066X1, this.XOX0O0 - iCos);
                    String str5 = strArr[i5];
                    canvas.drawText(str5, XIi00iiXO(str5, this.iIXi1iiXI, this.XOO0XOOii), this.iiiO, this.iIXi1iiXI);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0, this.XOX0O0 - iCos, this.f55066X1, (int) f);
                    String str6 = strArr[i5];
                    canvas.drawText(str6, XIi00iiXO(str6, this.iXiX011, this.XOO0XOOii), this.iiiO, this.iXiX011);
                    canvas.restore();
                }
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        XOO0ii0();
        int measuredWidth = getMeasuredWidth();
        this.f55066X1 = measuredWidth;
        setMeasuredDimension(measuredWidth, this.X00Xi1X);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = this.X11iII1O1.onTouchEvent(event);
        float f = this.OX110i * this.iiiO;
        int action = event.getAction();
        if (action == 0) {
            this.XOXiX0 = System.currentTimeMillis();
            OXO1();
            this.XOIX = event.getRawY();
        } else if (action == 2) {
            float rawY = this.XOIX - event.getRawY();
            this.XOIX = event.getRawY();
            this.X00XIX1 = (int) (this.X00XIX1 + rawY);
            if (!this.f55065OO) {
                float f2 = (-this.i0X000X0O) * f;
                float size = ((this.XXO.size() - 1) - this.i0X000X0O) * f;
                int i = this.X00XIX1;
                if (i < f2) {
                    this.X00XIX1 = (int) f2;
                } else if (i > size) {
                    this.X00XIX1 = (int) size;
                }
            }
        } else if (!zOnTouchEvent) {
            float y = event.getY();
            int i2 = this.IXI;
            this.IiiXiI0I = (int) (((((int) (((Math.acos((i2 - y) / i2) * ((double) this.IXI)) + ((double) (f / 2.0f))) / ((double) f))) - (this.XXiIiX10 / 2)) * f) - (((this.X00XIX1 % f) + f) % f));
            if (System.currentTimeMillis() - this.XOXiX0 > 120) {
                OIX0iXi(ACTION.DAGGLE);
            } else {
                OIX0iXi(ACTION.CLICK);
            }
        }
        invalidate();
        return true;
    }

    public final void setInitPosition(int initPosition) {
        this.X00XIX1 = 0;
        if (initPosition < 0) {
            this.i0X000X0O = 0;
        } else {
            this.i0X000X0O = initPosition;
        }
    }

    public final void setItems(List<String> items) {
        this.XXO = items;
        if (this.i0X000X0O > items.size() - 1) {
            this.i0X000X0O = items.size() - 1;
        }
        XOO0ii0();
        invalidate();
    }

    public final void setListener(dg1 OnItemSelectedListener) {
        this.XXX11i = OnItemSelectedListener;
    }

    @Override // android.view.View
    public final void setScaleX(float scaleX) {
        if (scaleX > 0.0f) {
            this.f55064IO = scaleX;
            this.iXiX011.setTextScaleX(scaleX);
        }
    }

    public final void setTextSize(float size) {
        if (size > 0.0f) {
            int i = (int) (this.f55063I1.getResources().getDisplayMetrics().density * size);
            this.iXiiiO = i;
            this.iIXi1iiXI.setTextSize(i);
            this.iXiX011.setTextSize(this.iXiiiO);
        }
    }

    public void setVisibleCount(int count) {
        this.XXiIiX10 = count + 2;
    }

    public WheelView(Context context, AttributeSet attributeset) {
        super(context, attributeset);
        this.f55064IO = 1.15f;
        this.X1IX = Executors.newSingleThreadScheduledExecutor();
        this.IXOIIIO = 0;
        this.IO0II0i = 0;
        this.IiiXiI0I = 0;
        this.XOXiX0 = 0L;
        this.XOO0XOOii = new Rect();
        m38919iO(context);
    }

    public WheelView(Context context, AttributeSet attributeset, int defStyleAttr) {
        super(context, attributeset, defStyleAttr);
        this.f55064IO = 1.15f;
        this.X1IX = Executors.newSingleThreadScheduledExecutor();
        this.IXOIIIO = 0;
        this.IO0II0i = 0;
        this.IiiXiI0I = 0;
        this.XOXiX0 = 0L;
        this.XOO0XOOii = new Rect();
        m38919iO(context);
    }
}
