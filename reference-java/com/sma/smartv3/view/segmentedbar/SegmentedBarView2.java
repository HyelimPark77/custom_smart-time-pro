package com.sma.smartv3.view.segmentedbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Html;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.iz3;
import com.ironsource.C12616d4;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SegmentedBarView2 extends View {
    public static final int Xii = 0;
    public static final int iiII = 1;

    /* JADX INFO: renamed from: I1 */
    public Paint f55100I1;

    /* JADX INFO: renamed from: IO */
    public RectF f55101IO;
    public int IO0II0i;
    public int IO0iXO0O;
    public Paint IX0IXOi;
    public int IX1XiI;
    public Paint IXI;
    public DecimalFormat IXOIIIO;
    public int Ii0X0X;
    public int Ii0i;
    public Integer Ii1iii0;
    public int IiiXiI0I;
    public String O001I;
    public Path O0O;
    public int O0O0X0iOi;

    /* JADX INFO: renamed from: OO */
    public float f55102OO;
    public int OX110i;

    /* JADX INFO: renamed from: Oi */
    public int f55103Oi;
    public boolean X00O0;
    public int X00XIX1;
    public String X00Xi1X;
    public int X0i1O;
    public Rect X0iO;

    /* JADX INFO: renamed from: X1 */
    public Paint f55104X1;
    public Rect X100O;
    public int X111IO;
    public Rect X11I;
    public int X11iII1O1;
    public int X1IX;
    public float X1OI;
    public int XO0X10iO;
    public int XOIX;
    public StaticLayout XOO0XOOii;
    public float XOX0O0;
    public StaticLayout XOXiX0;
    public int XX00i10X;
    public Rect XX1Oi;
    public String XXO;
    public int XXX11i;
    public List<iz3> XXiIiX10;
    public int XXiO0i;
    public Point Xi1i0XOX0;
    public Point Xii11I;
    public int i0X000X0O;
    public int i100IXOX;
    public int i11I;
    public float iI0I;
    public float iIX0i;
    public Float iIXi1iiXI;
    public Paint iIi1;
    public int iOI;
    public ArrayList<Rect> iOiXi11II;
    public Paint iX1O1;
    public boolean iXi;
    public Float iXiX011;
    public Integer iXiiiO;
    public TextPaint iiIOiX;
    public Point iii0;
    public String iiiO;

    public SegmentedBarView2(Context context) {
        super(context);
        this.f55102OO = -1.0f;
        this.XOX0O0 = -1.0f;
        this.iOiXi11II = new ArrayList<>();
        this.IO0II0i = 0;
        this.Ii0i = 1;
        this.XOIX = -1;
        this.f55103Oi = -12303292;
        this.IO0iXO0O = 65536;
        this.iOI = -1;
        this.X00O0 = false;
        this.iIi1 = new Paint();
        this.i100IXOX = 0;
        this.iI0I = 4.0f;
        this.iIX0i = 15.0f;
        this.X1OI = 0.1f;
        XXI(context, null);
    }

    private int getContentWidth() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - (getXLeft() * 2);
    }

    private int getXLeft() {
        return 0;
    }

    private int getXtop() {
        return 0;
    }

    public final void I0IIOi(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom) {
        paint.setTextAlign(Paint.Align.CENTER);
        float fDescent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        canvas.drawText(text, (left + right) / 2.0f, ((top + bottom) / 2.0f) + fDescent, paint);
    }

    public final void I0iXXO(Canvas canvas, int valueSignSpaceHeight, int valueSignCenter) {
        SegmentedBarView2 segmentedBarView2;
        Canvas canvas2;
        int measuredWidth = 0;
        boolean z = valueSignCenter == -1;
        if (z) {
            valueSignCenter = (getContentWidth() / 2) + getPaddingLeft();
        }
        this.X100O.set(valueSignCenter - (this.XXX11i / 2), getPaddingTop(), (this.XXX11i / 2) + valueSignCenter, (this.X11iII1O1 - this.X00XIX1) + getPaddingTop());
        this.iX1O1.setColor(this.X1IX);
        if (this.X100O.left < getPaddingLeft()) {
            int paddingLeft = (-this.X100O.left) + getPaddingLeft();
            RectF rectF = this.f55101IO;
            Rect rect = this.X100O;
            rectF.set(rect.left + paddingLeft, rect.top, rect.right + paddingLeft, rect.bottom);
        } else if (this.X100O.right > getMeasuredWidth() - getPaddingRight()) {
            int measuredWidth2 = (this.X100O.right - getMeasuredWidth()) + getPaddingRight();
            RectF rectF2 = this.f55101IO;
            Rect rect2 = this.X100O;
            rectF2.set(rect2.left - measuredWidth2, rect2.top, rect2.right - measuredWidth2, rect2.bottom);
        } else {
            RectF rectF3 = this.f55101IO;
            Rect rect3 = this.X100O;
            rectF3.set(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        RectF rectF4 = this.f55101IO;
        int i = this.OX110i;
        canvas.drawRoundRect(rectF4, i, i, this.iX1O1);
        if (z) {
            segmentedBarView2 = this;
            canvas2 = canvas;
        } else {
            if (valueSignCenter - (this.i0X000X0O / 2) < this.IO0II0i + getPaddingLeft()) {
                measuredWidth = getPaddingLeft() + (this.IO0II0i - valueSignCenter);
            } else if ((this.i0X000X0O / 2) + valueSignCenter > (getMeasuredWidth() - this.IO0II0i) - getPaddingRight()) {
                measuredWidth = ((getMeasuredWidth() - this.IO0II0i) - valueSignCenter) - getPaddingRight();
            }
            this.Xi1i0XOX0.set((valueSignCenter - (this.i0X000X0O / 2)) + measuredWidth, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
            this.iii0.set((this.i0X000X0O / 2) + valueSignCenter + measuredWidth, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
            this.Xii11I.set(valueSignCenter + measuredWidth, valueSignSpaceHeight + getPaddingTop());
            segmentedBarView2 = this;
            canvas2 = canvas;
            segmentedBarView2.m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.iX1O1);
        }
        int iXX0 = (((XX0() + getPaddingTop()) + m38952iO()) + getXtop()) - 15;
        int iXX1 = segmentedBarView2.Ii0X0X + XX0() + m38952iO() + getXtop() + 15;
        int i2 = segmentedBarView2.Xii11I.x;
        canvas2.drawRoundRect(new RectF(i2 - 10.0f, iXX0, i2 + 10.0f, iXX1), 10.0f, 10.0f, segmentedBarView2.iX1O1);
        if (segmentedBarView2.XOXiX0 != null) {
            canvas2.save();
            RectF rectF5 = segmentedBarView2.f55101IO;
            canvas2.translate(rectF5.left, (rectF5.top + (rectF5.height() / 2.0f)) - (segmentedBarView2.XOXiX0.getHeight() / 2));
            segmentedBarView2.XOXiX0.draw(canvas2);
            canvas2.restore();
        }
    }

    public void I1XOi1(int width, int height) {
        this.XXX11i = width;
        this.X11iII1O1 = height;
        if (!iIiiO()) {
            XIi00iiXO();
        }
        invalidate();
        requestLayout();
    }

    public void IIX1OXO(Float value, String unitHtml) {
        this.iIXi1iiXI = value;
        this.X00Xi1X = unitHtml;
        if (!iIiiO()) {
            XIi00iiXO();
        }
        invalidate();
        requestLayout();
    }

    /* JADX INFO: renamed from: IO */
    public final void m38951IO(Canvas canvas, Point point1, Point point2, Point point3, Paint paint) {
        this.O0O.reset();
        this.O0O.moveTo(point1.x, point1.y);
        this.O0O.lineTo(point2.x, point2.y);
        this.O0O.lineTo(point3.x, point3.y);
        this.O0O.lineTo(point1.x, point1.y);
        this.O0O.close();
        canvas.drawPath(this.O0O, paint);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0577  */
    /* JADX WARN: Code duplicated, block: B:105:0x0581  */
    /* JADX WARN: Code duplicated, block: B:108:0x058a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x058d  */
    /* JADX WARN: Code duplicated, block: B:112:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0206  */
    /* JADX WARN: Code duplicated, block: B:55:0x020a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0272  */
    /* JADX WARN: Code duplicated, block: B:68:0x027d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:79:0x02c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0378 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x037a  */
    /* JADX WARN: Code duplicated, block: B:83:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:84:0x0476  */
    /* JADX WARN: Code duplicated, block: B:86:0x04a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:88:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x053e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0560  */
    /* JADX WARN: Code duplicated, block: B:94:0x0564  */
    /* JADX WARN: Code duplicated, block: B:98:0x056d  */
    public final void IiI10X(Canvas canvas, iz3 segment, int segmentIndex, int segmentsSize, float valueMax) {
        float contentWidth;
        float contentWidth2;
        float contentWidth3;
        boolean z;
        Integer num;
        Float f;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        Canvas canvas2 = canvas;
        boolean z3 = segmentIndex == 0;
        boolean z4 = segmentIndex == segmentsSize + (-1);
        boolean z5 = z3 && z4;
        if (this.X111IO == 0) {
            contentWidth2 = (getContentWidth() * (segment.XO0O10() - segment.O00())) / valueMax;
            contentWidth3 = (getContentWidth() / valueMax) * segment.O00();
            if (!z3) {
                contentWidth3 += this.i11I;
            }
            contentWidth = (getContentWidth() / valueMax) * segment.XO0O10();
            if (!z3 && this.X00O0) {
                RectF rectF = new RectF();
                this.f55104X1.setColor(this.XO0X10iO);
                int i5 = (int) contentWidth3;
                rectF.set(getPaddingLeft() + i5 + getXLeft(), XX0() + getPaddingTop() + m38952iO() + getXtop(), i5 + getPaddingLeft() + getXLeft() + this.i11I, this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                canvas2.drawRect(rectF, this.f55104X1);
            }
        } else {
            int contentWidth4 = getContentWidth();
            int i6 = this.i11I;
            float f2 = ((contentWidth4 + i6) / segmentsSize) - i6;
            float f3 = (i6 + f2) * segmentIndex;
            contentWidth = f3 + f2;
            if (!z3 && this.X00O0) {
                RectF rectF2 = new RectF();
                this.f55104X1.setColor(this.XO0X10iO);
                int i7 = (int) f3;
                rectF2.set(getPaddingLeft() + i7 + getXLeft(), XX0() + getPaddingTop() + m38952iO() + getXtop(), i7 + getPaddingLeft() + getXLeft() + this.i11I, this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                canvas2.drawRect(rectF2, this.f55104X1);
            }
            contentWidth2 = f2;
            contentWidth3 = f3;
        }
        int i8 = (int) contentWidth3;
        int i9 = (int) contentWidth;
        this.X11I.set(getPaddingLeft() + i8 + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), getPaddingRight() + i9 + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
        Integer num2 = this.iXiiiO;
        if (num2 == null || num2.intValue() != segmentIndex) {
            Float f4 = this.iIXi1iiXI;
            if (f4 == null || ((f4.floatValue() < segment.O00() || this.iIXi1iiXI.floatValue() >= segment.XO0O10()) && !(z4 && segment.XO0O10() == this.iIXi1iiXI.floatValue()))) {
                z = false;
            } else {
                this.f55102OO = (int) (getPaddingLeft() + contentWidth3 + getXLeft() + (((this.iIXi1iiXI.floatValue() - segment.O00()) / (segment.XO0O10() - segment.O00())) * contentWidth2));
            }
            num = this.Ii1iii0;
            if (num != null || num.intValue() != segmentIndex) {
                f = this.iXiX011;
                if (f != null || ((f.floatValue() < segment.O00() || this.iXiX011.floatValue() >= segment.XO0O10()) && !(z4 && segment.XO0O10() == this.iXiX011.floatValue()))) {
                    z2 = z;
                } else {
                    this.XOX0O0 = (int) (contentWidth3 + getPaddingLeft() + getXLeft() + (((this.iXiX011.floatValue() - segment.O00()) / (segment.XO0O10() - segment.O00())) * contentWidth2));
                }
                this.f55100I1.setColor(segment.OXO1());
                this.X0iO.set(this.X11I);
                if (this.IO0II0i == 0) {
                    this.IO0II0i = this.X11I.height() / 2;
                }
                if (!z3 || z4) {
                    i = this.Ii0i;
                    if (i == 0) {
                        RectF rectF3 = this.f55101IO;
                        Rect rect = this.X11I;
                        rectF3.set(rect.left, rect.top, rect.right, rect.bottom);
                        RectF rectF4 = this.f55101IO;
                        int i10 = this.IO0II0i;
                        canvas2.drawRoundRect(rectF4, i10, i10, this.f55100I1);
                    } else if (i == 1) {
                        RectF rectF5 = this.f55101IO;
                        Rect rect2 = this.X11I;
                        rectF5.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
                        RectF rectF6 = this.f55101IO;
                        int i11 = this.IO0II0i;
                        canvas2.drawRoundRect(rectF6, i11, i11, this.f55100I1);
                        this.iOiXi11II.add(new Rect(this.X11I));
                        if (!z5) {
                            if (z3) {
                                this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                                canvas2.drawRect(this.X11I, this.f55100I1);
                            } else {
                                this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                                canvas2.drawRect(this.X11I, this.f55100I1);
                            }
                        }
                    } else if (i == 2) {
                        if (z5) {
                            this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + getPaddingTop() + m38952iO() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                            Point point = this.Xi1i0XOX0;
                            Rect rect3 = this.X11I;
                            int i12 = rect3.left;
                            int i13 = this.IO0II0i;
                            point.set(i12 - i13, rect3.top + i13);
                            Point point2 = this.iii0;
                            Rect rect4 = this.X11I;
                            point2.set(rect4.left, rect4.top);
                            Point point3 = this.Xii11I;
                            Rect rect5 = this.X11I;
                            point3.set(rect5.left, rect5.bottom);
                            m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                            Point point4 = this.Xi1i0XOX0;
                            Rect rect6 = this.X11I;
                            int i14 = rect6.right;
                            int i15 = this.IO0II0i;
                            point4.set(i14 + i15, rect6.top + i15);
                            Point point5 = this.iii0;
                            Rect rect7 = this.X11I;
                            point5.set(rect7.right, rect7.top);
                            Point point6 = this.Xii11I;
                            Rect rect8 = this.X11I;
                            point6.set(rect8.right, rect8.bottom);
                            canvas2 = canvas;
                            m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                        } else if (z3) {
                            this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                            Point point7 = this.Xi1i0XOX0;
                            Rect rect9 = this.X11I;
                            int i16 = rect9.left;
                            int i17 = this.IO0II0i;
                            point7.set(i16 - i17, rect9.top + i17);
                            Point point8 = this.iii0;
                            Rect rect10 = this.X11I;
                            point8.set(rect10.left, rect10.top);
                            Point point9 = this.Xii11I;
                            Rect rect11 = this.X11I;
                            point9.set(rect11.left, rect11.bottom);
                            m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                        } else {
                            this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                            Point point10 = this.Xi1i0XOX0;
                            Rect rect12 = this.X11I;
                            int i18 = rect12.right;
                            int i19 = this.IO0II0i;
                            point10.set(i18 + i19, rect12.top + i19);
                            Point point11 = this.iii0;
                            Rect rect13 = this.X11I;
                            point11.set(rect13.right, rect13.top);
                            Point point12 = this.Xii11I;
                            Rect rect14 = this.X11I;
                            point12.set(rect14.right, rect14.bottom);
                            m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                        }
                    }
                } else if (this.Ii0i == 0) {
                    RectF rectF7 = this.f55101IO;
                    Rect rect15 = this.X11I;
                    rectF7.set(rect15.left, rect15.top, rect15.right, rect15.bottom);
                    RectF rectF8 = this.f55101IO;
                    int i20 = this.IO0II0i;
                    canvas2.drawRoundRect(rectF8, i20, i20, this.f55100I1);
                } else {
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    this.iOiXi11II.add(new Rect(this.X11I));
                }
                if (this.iXi) {
                    Paint paint = this.IX0IXOi;
                    if (z2 || this.XX00i10X != 0 || (i2 = this.iOI) == -1) {
                        i2 = this.O0O0X0iOi;
                    }
                    paint.setTextSize(i2);
                    Paint paint2 = this.IX0IXOi;
                    if (z2 || this.XX00i10X != 0 || (i3 = this.IO0iXO0O) == 65536) {
                        i3 = this.f55103Oi;
                    }
                    paint2.setColor(i3);
                    i4 = this.XX00i10X;
                    if (i4 == 0) {
                        Paint paint3 = this.IX0IXOi;
                        String strM2317iO = segment.m2317iO();
                        Rect rect16 = this.X0iO;
                        float f5 = rect16.left;
                        int i21 = rect16.bottom;
                        I0IIOi(canvas, paint3, strM2317iO, f5, i21, rect16.right, i21 + this.IX1XiI);
                        return;
                    }
                    if (i4 != 1) {
                        return;
                    }
                    Paint paint4 = this.IX0IXOi;
                    String strM2317iO2 = segment.m2317iO();
                    Rect rect17 = this.X0iO;
                    float f6 = rect17.left;
                    int i22 = rect17.bottom;
                    OIi0(canvas2, paint4, strM2317iO2, f6, i22, rect17.right, i22 + this.IX1XiI, z3, z4, segmentIndex);
                }
            }
            this.XOX0O0 = contentWidth3 + getPaddingLeft() + (contentWidth2 / 2.0f) + getXLeft();
            z2 = true;
            this.f55100I1.setColor(segment.OXO1());
            this.X0iO.set(this.X11I);
            if (this.IO0II0i == 0) {
                this.IO0II0i = this.X11I.height() / 2;
            }
            if (z3) {
                i = this.Ii0i;
                if (i == 0) {
                    RectF rectF9 = this.f55101IO;
                    Rect rect18 = this.X11I;
                    rectF9.set(rect18.left, rect18.top, rect18.right, rect18.bottom);
                    RectF rectF10 = this.f55101IO;
                    int i110 = this.IO0II0i;
                    canvas2.drawRoundRect(rectF10, i110, i110, this.f55100I1);
                } else if (i == 1) {
                    RectF rectF11 = this.f55101IO;
                    Rect rect19 = this.X11I;
                    rectF11.set(rect19.left, rect19.top, rect19.right, rect19.bottom);
                    RectF rectF12 = this.f55101IO;
                    int i111 = this.IO0II0i;
                    canvas2.drawRoundRect(rectF12, i111, i111, this.f55100I1);
                    this.iOiXi11II.add(new Rect(this.X11I));
                    if (!z5) {
                        if (z3) {
                            this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                        } else {
                            this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                        }
                    }
                } else if (i == 2) {
                    if (z5) {
                        this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + getPaddingTop() + m38952iO() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                        Point point13 = this.Xi1i0XOX0;
                        Rect rect20 = this.X11I;
                        int i112 = rect20.left;
                        int i113 = this.IO0II0i;
                        point13.set(i112 - i113, rect20.top + i113);
                        Point point14 = this.iii0;
                        Rect rect21 = this.X11I;
                        point14.set(rect21.left, rect21.top);
                        Point point15 = this.Xii11I;
                        Rect rect22 = this.X11I;
                        point15.set(rect22.left, rect22.bottom);
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                        Point point16 = this.Xi1i0XOX0;
                        Rect rect23 = this.X11I;
                        int i114 = rect23.right;
                        int i115 = this.IO0II0i;
                        point16.set(i114 + i115, rect23.top + i115);
                        Point point17 = this.iii0;
                        Rect rect24 = this.X11I;
                        point17.set(rect24.right, rect24.top);
                        Point point18 = this.Xii11I;
                        Rect rect25 = this.X11I;
                        point18.set(rect25.right, rect25.bottom);
                        canvas2 = canvas;
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    } else if (z3) {
                        this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                        Point point19 = this.Xi1i0XOX0;
                        Rect rect26 = this.X11I;
                        int i116 = rect26.left;
                        int i117 = this.IO0II0i;
                        point19.set(i116 - i117, rect26.top + i117);
                        Point point20 = this.iii0;
                        Rect rect110 = this.X11I;
                        point20.set(rect110.left, rect110.top);
                        Point point21 = this.Xii11I;
                        Rect rect111 = this.X11I;
                        point21.set(rect111.left, rect111.bottom);
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    } else {
                        this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                        Point point110 = this.Xi1i0XOX0;
                        Rect rect112 = this.X11I;
                        int i118 = rect112.right;
                        int i119 = this.IO0II0i;
                        point110.set(i118 + i119, rect112.top + i119);
                        Point point111 = this.iii0;
                        Rect rect113 = this.X11I;
                        point111.set(rect113.right, rect113.top);
                        Point point112 = this.Xii11I;
                        Rect rect114 = this.X11I;
                        point112.set(rect114.right, rect114.bottom);
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    }
                }
            } else {
                i = this.Ii0i;
                if (i == 0) {
                    RectF rectF13 = this.f55101IO;
                    Rect rect115 = this.X11I;
                    rectF13.set(rect115.left, rect115.top, rect115.right, rect115.bottom);
                    RectF rectF14 = this.f55101IO;
                    int i1110 = this.IO0II0i;
                    canvas2.drawRoundRect(rectF14, i1110, i1110, this.f55100I1);
                } else if (i == 1) {
                    RectF rectF15 = this.f55101IO;
                    Rect rect116 = this.X11I;
                    rectF15.set(rect116.left, rect116.top, rect116.right, rect116.bottom);
                    RectF rectF16 = this.f55101IO;
                    int i1111 = this.IO0II0i;
                    canvas2.drawRoundRect(rectF16, i1111, i1111, this.f55100I1);
                    this.iOiXi11II.add(new Rect(this.X11I));
                    if (!z5) {
                        if (z3) {
                            this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                        } else {
                            this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.X11I, this.f55100I1);
                        }
                    }
                } else if (i == 2) {
                    if (z5) {
                        this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + getPaddingTop() + m38952iO() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                        Point point113 = this.Xi1i0XOX0;
                        Rect rect27 = this.X11I;
                        int i1112 = rect27.left;
                        int i1113 = this.IO0II0i;
                        point113.set(i1112 - i1113, rect27.top + i1113);
                        Point point114 = this.iii0;
                        Rect rect28 = this.X11I;
                        point114.set(rect28.left, rect28.top);
                        Point point115 = this.Xii11I;
                        Rect rect29 = this.X11I;
                        point115.set(rect29.left, rect29.bottom);
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                        Point point116 = this.Xi1i0XOX0;
                        Rect rect210 = this.X11I;
                        int i1114 = rect210.right;
                        int i1115 = this.IO0II0i;
                        point116.set(i1114 + i1115, rect210.top + i1115);
                        Point point117 = this.iii0;
                        Rect rect211 = this.X11I;
                        point117.set(rect211.right, rect211.top);
                        Point point118 = this.Xii11I;
                        Rect rect212 = this.X11I;
                        point118.set(rect212.right, rect212.bottom);
                        canvas2 = canvas;
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    } else if (z3) {
                        this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                        Point point119 = this.Xi1i0XOX0;
                        Rect rect213 = this.X11I;
                        int i1116 = rect213.left;
                        int i1117 = this.IO0II0i;
                        point119.set(i1116 - i1117, rect213.top + i1117);
                        Point point22 = this.iii0;
                        Rect rect117 = this.X11I;
                        point22.set(rect117.left, rect117.top);
                        Point point23 = this.Xii11I;
                        Rect rect118 = this.X11I;
                        point23.set(rect118.left, rect118.bottom);
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    } else {
                        this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                        Point point1110 = this.Xi1i0XOX0;
                        Rect rect119 = this.X11I;
                        int i1118 = rect119.right;
                        int i1119 = this.IO0II0i;
                        point1110.set(i1118 + i1119, rect119.top + i1119);
                        Point point1111 = this.iii0;
                        Rect rect1110 = this.X11I;
                        point1111.set(rect1110.right, rect1110.top);
                        Point point1112 = this.Xii11I;
                        Rect rect1111 = this.X11I;
                        point1112.set(rect1111.right, rect1111.bottom);
                        m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    }
                }
            }
            if (this.iXi) {
                Paint paint5 = this.IX0IXOi;
                if (z2) {
                    i2 = this.O0O0X0iOi;
                } else {
                    i2 = this.O0O0X0iOi;
                }
                paint5.setTextSize(i2);
                Paint paint6 = this.IX0IXOi;
                if (z2) {
                    i3 = this.f55103Oi;
                } else {
                    i3 = this.f55103Oi;
                }
                paint6.setColor(i3);
                i4 = this.XX00i10X;
                if (i4 == 0) {
                    Paint paint7 = this.IX0IXOi;
                    String strM2317iO3 = segment.m2317iO();
                    Rect rect120 = this.X0iO;
                    float f7 = rect120.left;
                    int i23 = rect120.bottom;
                    I0IIOi(canvas, paint7, strM2317iO3, f7, i23, rect120.right, i23 + this.IX1XiI);
                    return;
                }
                if (i4 != 1) {
                    return;
                }
                Paint paint8 = this.IX0IXOi;
                String strM2317iO4 = segment.m2317iO();
                Rect rect121 = this.X0iO;
                float f8 = rect121.left;
                int i24 = rect121.bottom;
                OIi0(canvas2, paint8, strM2317iO4, f8, i24, rect121.right, i24 + this.IX1XiI, z3, z4, segmentIndex);
            }
        }
        this.f55102OO = getPaddingLeft() + contentWidth3 + (contentWidth2 / 2.0f) + getXLeft();
        z = true;
        num = this.Ii1iii0;
        if (num != null) {
            f = this.iXiX011;
            if (f != null) {
            }
            z2 = z;
        } else {
            f = this.iXiX011;
            if (f != null) {
            }
            z2 = z;
        }
        this.f55100I1.setColor(segment.OXO1());
        this.X0iO.set(this.X11I);
        if (this.IO0II0i == 0) {
            this.IO0II0i = this.X11I.height() / 2;
        }
        if (z3) {
            i = this.Ii0i;
            if (i == 0) {
                RectF rectF17 = this.f55101IO;
                Rect rect1112 = this.X11I;
                rectF17.set(rect1112.left, rect1112.top, rect1112.right, rect1112.bottom);
                RectF rectF18 = this.f55101IO;
                int i11110 = this.IO0II0i;
                canvas2.drawRoundRect(rectF18, i11110, i11110, this.f55100I1);
            } else if (i == 1) {
                RectF rectF19 = this.f55101IO;
                Rect rect1113 = this.X11I;
                rectF19.set(rect1113.left, rect1113.top, rect1113.right, rect1113.bottom);
                RectF rectF110 = this.f55101IO;
                int i11111 = this.IO0II0i;
                canvas2.drawRoundRect(rectF110, i11111, i11111, this.f55100I1);
                this.iOiXi11II.add(new Rect(this.X11I));
                if (!z5) {
                    if (z3) {
                        this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                    } else {
                        this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                    }
                }
            } else if (i == 2) {
                if (z5) {
                    this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + getPaddingTop() + m38952iO() + getXtop());
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    Point point1113 = this.Xi1i0XOX0;
                    Rect rect214 = this.X11I;
                    int i11112 = rect214.left;
                    int i11113 = this.IO0II0i;
                    point1113.set(i11112 - i11113, rect214.top + i11113);
                    Point point1114 = this.iii0;
                    Rect rect215 = this.X11I;
                    point1114.set(rect215.left, rect215.top);
                    Point point1115 = this.Xii11I;
                    Rect rect216 = this.X11I;
                    point1115.set(rect216.left, rect216.bottom);
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    Point point1116 = this.Xi1i0XOX0;
                    Rect rect217 = this.X11I;
                    int i11114 = rect217.right;
                    int i11115 = this.IO0II0i;
                    point1116.set(i11114 + i11115, rect217.top + i11115);
                    Point point1117 = this.iii0;
                    Rect rect218 = this.X11I;
                    point1117.set(rect218.right, rect218.top);
                    Point point1118 = this.Xii11I;
                    Rect rect219 = this.X11I;
                    point1118.set(rect219.right, rect219.bottom);
                    canvas2 = canvas;
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                } else if (z3) {
                    this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    Point point1119 = this.Xi1i0XOX0;
                    Rect rect2110 = this.X11I;
                    int i11116 = rect2110.left;
                    int i11117 = this.IO0II0i;
                    point1119.set(i11116 - i11117, rect2110.top + i11117);
                    Point point24 = this.iii0;
                    Rect rect1114 = this.X11I;
                    point24.set(rect1114.left, rect1114.top);
                    Point point25 = this.Xii11I;
                    Rect rect1115 = this.X11I;
                    point25.set(rect1115.left, rect1115.bottom);
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                } else {
                    this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    Point point11110 = this.Xi1i0XOX0;
                    Rect rect1116 = this.X11I;
                    int i11118 = rect1116.right;
                    int i11119 = this.IO0II0i;
                    point11110.set(i11118 + i11119, rect1116.top + i11119);
                    Point point11111 = this.iii0;
                    Rect rect1117 = this.X11I;
                    point11111.set(rect1117.right, rect1117.top);
                    Point point11112 = this.Xii11I;
                    Rect rect1118 = this.X11I;
                    point11112.set(rect1118.right, rect1118.bottom);
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                }
            }
        } else {
            i = this.Ii0i;
            if (i == 0) {
                RectF rectF111 = this.f55101IO;
                Rect rect1119 = this.X11I;
                rectF111.set(rect1119.left, rect1119.top, rect1119.right, rect1119.bottom);
                RectF rectF112 = this.f55101IO;
                int i111110 = this.IO0II0i;
                canvas2.drawRoundRect(rectF112, i111110, i111110, this.f55100I1);
            } else if (i == 1) {
                RectF rectF113 = this.f55101IO;
                Rect rect11110 = this.X11I;
                rectF113.set(rect11110.left, rect11110.top, rect11110.right, rect11110.bottom);
                RectF rectF114 = this.f55101IO;
                int i111111 = this.IO0II0i;
                canvas2.drawRoundRect(rectF114, i111111, i111111, this.f55100I1);
                this.iOiXi11II.add(new Rect(this.X11I));
                if (!z5) {
                    if (z3) {
                        this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                    } else {
                        this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingRight() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.X11I, this.f55100I1);
                    }
                }
            } else if (i == 2) {
                if (z5) {
                    this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + getPaddingTop() + m38952iO() + getXtop());
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    Point point11113 = this.Xi1i0XOX0;
                    Rect rect2111 = this.X11I;
                    int i111112 = rect2111.left;
                    int i111113 = this.IO0II0i;
                    point11113.set(i111112 - i111113, rect2111.top + i111113);
                    Point point11114 = this.iii0;
                    Rect rect2112 = this.X11I;
                    point11114.set(rect2112.left, rect2112.top);
                    Point point11115 = this.Xii11I;
                    Rect rect2113 = this.X11I;
                    point11115.set(rect2113.left, rect2113.bottom);
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                    Point point11116 = this.Xi1i0XOX0;
                    Rect rect2114 = this.X11I;
                    int i111114 = rect2114.right;
                    int i111115 = this.IO0II0i;
                    point11116.set(i111114 + i111115, rect2114.top + i111115);
                    Point point11117 = this.iii0;
                    Rect rect2115 = this.X11I;
                    point11117.set(rect2115.right, rect2115.top);
                    Point point11118 = this.Xii11I;
                    Rect rect2116 = this.X11I;
                    point11118.set(rect2116.right, rect2116.bottom);
                    canvas2 = canvas;
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                } else if (z3) {
                    this.X11I.set(i8 + this.IO0II0i + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), i9 + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    Point point11119 = this.Xi1i0XOX0;
                    Rect rect2117 = this.X11I;
                    int i111116 = rect2117.left;
                    int i111117 = this.IO0II0i;
                    point11119.set(i111116 - i111117, rect2117.top + i111117);
                    Point point26 = this.iii0;
                    Rect rect11111 = this.X11I;
                    point26.set(rect11111.left, rect11111.top);
                    Point point27 = this.Xii11I;
                    Rect rect11112 = this.X11I;
                    point27.set(rect11112.left, rect11112.bottom);
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                } else {
                    this.X11I.set(i8 + getPaddingLeft() + getXLeft(), XX0() + m38952iO() + getPaddingTop() + getXtop(), (i9 - this.IO0II0i) + getPaddingLeft() + getXLeft(), this.Ii0X0X + XX0() + m38952iO() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.X11I, this.f55100I1);
                    Point point111110 = this.Xi1i0XOX0;
                    Rect rect11113 = this.X11I;
                    int i111118 = rect11113.right;
                    int i111119 = this.IO0II0i;
                    point111110.set(i111118 + i111119, rect11113.top + i111119);
                    Point point111111 = this.iii0;
                    Rect rect11114 = this.X11I;
                    point111111.set(rect11114.right, rect11114.top);
                    Point point111112 = this.Xii11I;
                    Rect rect11115 = this.X11I;
                    point111112.set(rect11115.right, rect11115.bottom);
                    m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.f55100I1);
                }
            }
        }
        if (this.iXi) {
            Paint paint9 = this.IX0IXOi;
            if (z2) {
                i2 = this.O0O0X0iOi;
            } else {
                i2 = this.O0O0X0iOi;
            }
            paint9.setTextSize(i2);
            Paint paint10 = this.IX0IXOi;
            if (z2) {
                i3 = this.f55103Oi;
            } else {
                i3 = this.f55103Oi;
            }
            paint10.setColor(i3);
            i4 = this.XX00i10X;
            if (i4 == 0) {
                Paint paint11 = this.IX0IXOi;
                String strM2317iO5 = segment.m2317iO();
                Rect rect122 = this.X0iO;
                float f9 = rect122.left;
                int i25 = rect122.bottom;
                I0IIOi(canvas, paint11, strM2317iO5, f9, i25, rect122.right, i25 + this.IX1XiI);
                return;
            }
            if (i4 != 1) {
                return;
            }
            Paint paint12 = this.IX0IXOi;
            String strM2317iO6 = segment.m2317iO();
            Rect rect123 = this.X0iO;
            float f10 = rect123.left;
            int i26 = rect123.bottom;
            OIi0(canvas2, paint12, strM2317iO6, f10, i26, rect123.right, i26 + this.IX1XiI, z3, z4, segmentIndex);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095 A[SYNTHETIC] */
    public final void O00(Canvas canvas) {
        float f;
        Rect rect = new Rect();
        boolean z = false;
        for (int i = 0; i < this.iOiXi11II.size(); i++) {
            rect.set(this.iOiXi11II.get(i));
            iz3 iz3Var = this.XXiIiX10.get(i);
            int i2 = rect.left;
            float f2 = i2;
            float f3 = this.f55102OO;
            boolean z2 = true;
            if (f2 >= f3 || f3 >= rect.right) {
                if (i2 == f3) {
                    rect.left = (int) f3;
                    this.X1IX = iz3Var.IiI10X();
                }
                if (z) {
                    f = this.XOX0O0;
                    if (f <= rect.right) {
                        rect.right = (int) f;
                        int iIiI10X = iz3Var.IiI10X();
                        this.X0i1O = iIiI10X;
                        this.f55100I1.setColor(iIiI10X);
                        canvas.drawRect(rect, this.f55100I1);
                        z = false;
                    } else {
                        this.f55100I1.setColor(iz3Var.IiI10X());
                        canvas.drawRect(rect, this.f55100I1);
                    }
                }
            } else {
                rect.left = (int) f3;
                int iIiI10X2 = iz3Var.IiI10X();
                this.X1IX = iIiI10X2;
                float f4 = this.XOX0O0;
                if (f4 < rect.right) {
                    rect.right = (int) f4;
                    this.X0i1O = iIiI10X2;
                    z2 = false;
                }
                this.f55100I1.setColor(iIiI10X2);
                canvas.drawRect(rect, this.f55100I1);
            }
            z = z2;
            if (z) {
                f = this.XOX0O0;
                if (f <= rect.right) {
                    rect.right = (int) f;
                    int iIiI10X3 = iz3Var.IiI10X();
                    this.X0i1O = iIiI10X3;
                    this.f55100I1.setColor(iIiI10X3);
                    canvas.drawRect(rect, this.f55100I1);
                    z = false;
                } else {
                    this.f55100I1.setColor(iz3Var.IiI10X());
                    canvas.drawRect(rect, this.f55100I1);
                }
            }
        }
    }

    public void O10IXXX0X(float value2, String valueText) {
        this.XXO = valueText;
        this.iXiX011 = Float.valueOf(value2);
        OXO1();
        invalidate();
        requestLayout();
    }

    public final void OIX0iXi(Canvas canvas, int valueSignSpaceHeight, int valueSignCenter) {
        SegmentedBarView2 segmentedBarView2;
        Canvas canvas2;
        int measuredWidth = 0;
        boolean z = valueSignCenter == -1;
        if (z) {
            valueSignCenter = (getContentWidth() / 2) + getPaddingLeft();
        }
        this.XX1Oi.set(valueSignCenter - (this.XXX11i / 2), getPaddingTop(), (this.XXX11i / 2) + valueSignCenter, (this.X11iII1O1 - this.X00XIX1) + getPaddingTop());
        this.iX1O1.setColor(this.X0i1O);
        if (this.XX1Oi.left < getPaddingLeft()) {
            int paddingLeft = (-this.XX1Oi.left) + getPaddingLeft();
            RectF rectF = this.f55101IO;
            Rect rect = this.XX1Oi;
            rectF.set(rect.left + paddingLeft, rect.top, rect.right + paddingLeft, rect.bottom);
        } else if (this.XX1Oi.right > getMeasuredWidth() - getPaddingRight()) {
            int measuredWidth2 = (this.XX1Oi.right - getMeasuredWidth()) + getPaddingRight();
            RectF rectF2 = this.f55101IO;
            Rect rect2 = this.XX1Oi;
            rectF2.set(rect2.left - measuredWidth2, rect2.top, rect2.right - measuredWidth2, rect2.bottom);
        } else {
            RectF rectF3 = this.f55101IO;
            Rect rect3 = this.XX1Oi;
            rectF3.set(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        RectF rectF4 = this.f55101IO;
        int i = this.OX110i;
        canvas.drawRoundRect(rectF4, i, i, this.iX1O1);
        if (z) {
            segmentedBarView2 = this;
            canvas2 = canvas;
        } else {
            if (valueSignCenter - (this.i0X000X0O / 2) < this.IO0II0i + getPaddingLeft()) {
                measuredWidth = getPaddingLeft() + (this.IO0II0i - valueSignCenter);
            } else if ((this.i0X000X0O / 2) + valueSignCenter > (getMeasuredWidth() - this.IO0II0i) - getPaddingRight()) {
                measuredWidth = ((getMeasuredWidth() - this.IO0II0i) - valueSignCenter) - getPaddingRight();
            }
            this.Xi1i0XOX0.set((valueSignCenter - (this.i0X000X0O / 2)) + measuredWidth, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
            this.iii0.set((this.i0X000X0O / 2) + valueSignCenter + measuredWidth, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
            this.Xii11I.set(valueSignCenter + measuredWidth, valueSignSpaceHeight + getPaddingTop());
            segmentedBarView2 = this;
            canvas2 = canvas;
            segmentedBarView2.m38951IO(canvas2, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.iX1O1);
        }
        int iXX0 = (((XX0() + getPaddingTop()) + m38952iO()) + getXtop()) - 15;
        int iXX1 = segmentedBarView2.Ii0X0X + XX0() + m38952iO() + getXtop() + 15;
        int i2 = segmentedBarView2.Xii11I.x;
        canvas2.drawRoundRect(new RectF(i2 - 10.0f, iXX0, i2 + 10.0f, iXX1), 10.0f, 10.0f, segmentedBarView2.iX1O1);
        if (segmentedBarView2.XOO0XOOii != null) {
            canvas2.save();
            RectF rectF5 = segmentedBarView2.f55101IO;
            canvas2.translate(rectF5.left, (rectF5.top + (rectF5.height() / 2.0f)) - (segmentedBarView2.XOO0XOOii.getHeight() / 2));
            segmentedBarView2.XOO0XOOii.draw(canvas2);
            canvas2.restore();
        }
    }

    public final void OIi0(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom, boolean isLeftSegment, boolean isRightSegment, int index) {
        paint.setTextAlign(Paint.Align.CENTER);
        float fDescent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        float fMeasureText = paint.measureText(text);
        if (isLeftSegment) {
            canvas.drawText(text, left + (fMeasureText / 2.0f), ((top + bottom) / 2.0f) + fDescent, paint);
            return;
        }
        if (isRightSegment) {
            if (this.XXiIiX10.size() > 2 || !text.contains(C12616d4.j.f34438c)) {
                canvas.drawText(text, right - (fMeasureText / 2.0f), ((top + bottom) / 2.0f) + fDescent, paint);
                return;
            }
            String[] strArrSplit = TextUtils.split(text, C12616d4.j.f34438c);
            float f = ((top + bottom) / 2.0f) + fDescent;
            canvas.drawText(strArrSplit[0], left, f, paint);
            canvas.drawText(strArrSplit[1], right - (paint.measureText(strArrSplit[1]) / 2.0f), f, paint);
            return;
        }
        if (isLeftSegment || isRightSegment) {
            canvas.drawText(text, right - (fMeasureText / 2.0f), ((top + bottom) / 2.0f) + fDescent, paint);
            return;
        }
        if (text.contains(C12616d4.j.f34438c)) {
            String[] strArrSplit2 = TextUtils.split(text, C12616d4.j.f34438c);
            if (index % 2 != 1) {
                canvas.drawText(strArrSplit2[1], right, ((top + bottom) / 2.0f) + fDescent, paint);
                return;
            }
            float f2 = ((top + bottom) / 2.0f) + fDescent;
            canvas.drawText(strArrSplit2[0], left, f2, paint);
            canvas.drawText(strArrSplit2[1], right, f2, paint);
        }
    }

    public final void OXO1() {
        String str;
        if (XiOIO()) {
            this.XOO0XOOii = null;
            return;
        }
        Float f = this.iXiX011;
        String str2 = f != null ? this.IXOIIIO.format(f) : this.iiiO;
        if (this.iXiX011 != null && (str = this.X00Xi1X) != null && !str.isEmpty()) {
            str2 = str2 + String.format("<br><small>%s</small>", this.X00Xi1X);
        }
        if (!TextUtils.isEmpty(this.XXO)) {
            str2 = this.XXO;
        }
        this.XOO0XOOii = new StaticLayout(Html.fromHtml(str2), this.iiIOiX, this.XXX11i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public void X0O(Float value2, String unitHtml) {
        this.iXiX011 = value2;
        this.X00Xi1X = unitHtml;
        if (!XiOIO()) {
            OXO1();
        }
        invalidate();
        requestLayout();
    }

    public void X1ii(float value, String valueText) {
        this.O001I = valueText;
        this.iIXi1iiXI = Float.valueOf(value);
        XIi00iiXO();
        invalidate();
        requestLayout();
    }

    public final void XIi00iiXO() {
        String str;
        if (iIiiO()) {
            this.XOXiX0 = null;
            return;
        }
        Float f = this.iIXi1iiXI;
        String str2 = f != null ? this.IXOIIIO.format(f) : this.iiiO;
        if (this.iIXi1iiXI != null && (str = this.X00Xi1X) != null && !str.isEmpty()) {
            str2 = str2 + String.format("<br><small>%s</small>", this.X00Xi1X);
        }
        if (!TextUtils.isEmpty(this.O001I)) {
            str2 = this.O001I;
        }
        this.XOXiX0 = new StaticLayout(Html.fromHtml(str2), this.iiIOiX, this.XXX11i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public final void XO0O10(Canvas canvas) {
        this.iIi1.setStrokeWidth(this.iI0I);
        this.iIi1.setColor(-1);
        this.iIi1.setAntiAlias(true);
        iz3 iz3Var = this.XXiIiX10.get(0);
        List<iz3> list = this.XXiIiX10;
        iz3 iz3Var2 = list.get(list.size() - 1);
        Rect rect = this.iOiXi11II.get(0);
        ArrayList<Rect> arrayList = this.iOiXi11II;
        Rect rect2 = arrayList.get(arrayList.size() - 1);
        int iXO0O10 = (int) ((iz3Var2.XO0O10() - iz3Var.O00()) / this.X1OI);
        this.i100IXOX = iXO0O10;
        float f = (rect2.right - rect.left) / iXO0O10;
        for (int i = 0; i <= this.i100IXOX; i++) {
            float f2 = rect.left + (i * f);
            float fHeight = (rect.height() - this.iIX0i) / 2.0f;
            canvas.drawLine(f2, rect.top + fHeight, f2, rect.bottom - fHeight, this.iIi1);
        }
    }

    public final void XOO0ii0(Canvas canvas, Paint paint, String text, Rect outsideRect) {
        I0IIOi(canvas, paint, text, outsideRect.left, outsideRect.top, outsideRect.right, outsideRect.bottom);
    }

    public final int XX0() {
        if (iIiiO()) {
            return 0;
        }
        return this.X11iII1O1;
    }

    public final void XXI(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, C15429R.styleable.SegmentedBarView, 0, 0);
        try {
            Resources resources = getResources();
            this.XX00i10X = typedArrayObtainStyledAttributes.getInt(3, 0);
            this.IiiXiI0I = typedArrayObtainStyledAttributes.getDimensionPixelSize(42, resources.getDimensionPixelSize(R.dimen.sbv_value_text_size));
            this.O0O0X0iOi = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.sbv_description_text_size));
            this.iOI = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.Ii0X0X = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.sbv_bar_height));
            this.X11iII1O1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(39, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_height));
            this.XXX11i = typedArrayObtainStyledAttributes.getDimensionPixelSize(41, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_width));
            this.X00XIX1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.sbv_arrow_height));
            this.i0X000X0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.sbv_arrow_width));
            this.i11I = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(R.dimen.sbv_segment_gap_width));
            this.IO0II0i = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
            this.XO0X10iO = typedArrayObtainStyledAttributes.getColor(17, -1);
            this.OX110i = typedArrayObtainStyledAttributes.getDimensionPixelSize(40, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_round));
            this.IX1XiI = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.sbv_description_box_height));
            this.iXi = typedArrayObtainStyledAttributes.getBoolean(25, false);
            String string = typedArrayObtainStyledAttributes.getString(35);
            this.iiiO = string;
            if (string == null) {
                this.iiiO = resources.getString(R.string.sbv_value_segment);
            }
            this.f55103Oi = typedArrayObtainStyledAttributes.getColor(9, this.f55103Oi);
            this.IO0iXO0O = typedArrayObtainStyledAttributes.getColor(7, 65536);
            this.Ii0i = typedArrayObtainStyledAttributes.getInt(29, 1);
            this.X111IO = typedArrayObtainStyledAttributes.getInt(23, 1);
            typedArrayObtainStyledAttributes.recycle();
            this.IXOIIIO = new DecimalFormat("##.####");
            TextPaint textPaint = new TextPaint(1);
            this.IXI = textPaint;
            textPaint.setColor(-1);
            Paint paint = this.IXI;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            TextPaint textPaint2 = new TextPaint(1);
            this.iiIOiX = textPaint2;
            textPaint2.setColor(-1);
            this.iiIOiX.setStyle(style);
            this.iiIOiX.setTextSize(this.IiiXiI0I);
            this.iiIOiX.setColor(this.XOIX);
            TextPaint textPaint3 = new TextPaint(1);
            this.IX0IXOi = textPaint3;
            textPaint3.setColor(-12303292);
            this.IX0IXOi.setStyle(style);
            Paint paint2 = new Paint(1);
            this.f55100I1 = paint2;
            paint2.setStyle(style);
            this.f55100I1.setAntiAlias(true);
            Paint paint3 = new Paint(1);
            this.iX1O1 = paint3;
            paint3.setStyle(style);
            this.iX1O1.setAntiAlias(true);
            Paint paint4 = new Paint(1);
            this.f55104X1 = paint4;
            paint4.setStyle(style);
            this.X11I = new Rect();
            this.f55101IO = new RectF();
            this.X100O = new Rect();
            this.XX1Oi = new Rect();
            this.X0iO = new Rect();
            Path path = new Path();
            this.O0O = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            this.Xi1i0XOX0 = new Point();
            this.iii0 = new Point();
            this.Xii11I = new Point();
            this.XXiO0i = 0;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean XiOIO() {
        return this.iXiX011 == null && this.Ii1iii0 == null;
    }

    public Integer getValueSegment() {
        return this.iXiiiO;
    }

    public String getValueSegmentText() {
        return this.iiiO;
    }

    public final boolean iIiiO() {
        return this.iIXi1iiXI == null && this.iXiiiO == null;
    }

    /* JADX INFO: renamed from: iO */
    public final int m38952iO() {
        if (iIiiO()) {
            return 0;
        }
        return this.XXiO0i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.iOiXi11II.clear();
        this.f55102OO = -1.0f;
        this.XOX0O0 = -1.0f;
        int size = this.XXiIiX10.size();
        List<iz3> list = this.XXiIiX10;
        iz3 iz3Var = list.get(list.size() - 1);
        for (int i = 0; i < size; i++) {
            IiI10X(canvas, this.XXiIiX10.get(i), i, size, iz3Var.XO0O10());
        }
        O00(canvas);
        I0iXXO(canvas, XX0(), (int) this.f55102OO);
        OIX0iXi(canvas, XX0(), (int) this.XOX0O0);
        XO0O10(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = this.Ii0X0X + getPaddingBottom() + getPaddingTop();
        if (!iIiiO()) {
            paddingBottom += this.X11iII1O1 + this.X00XIX1;
        }
        if (this.iXi) {
            paddingBottom += this.IX1XiI;
        }
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft, widthMeasureSpec, 0), View.resolveSizeAndState(paddingBottom, heightMeasureSpec, 0));
    }

    public void setBarHeight(int barHeight) {
        this.Ii0X0X = barHeight;
        invalidate();
        requestLayout();
    }

    public void setGapColor(int gapColor) {
        this.XO0X10iO = gapColor;
        invalidate();
        requestLayout();
    }

    public void setGapWidth(int gapWidth) {
        this.i11I = gapWidth;
        invalidate();
        requestLayout();
    }

    public void setSegmentSideRule(int sideRule) {
        this.X111IO = sideRule;
        invalidate();
        requestLayout();
    }

    public void setSegments(List<iz3> segments) {
        this.XXiIiX10 = segments;
        invalidate();
        requestLayout();
    }

    public void setShowDescriptionText(boolean showDescriptionText) {
        this.iXi = showDescriptionText;
        invalidate();
        requestLayout();
    }

    public void setUnit(String unit) {
        this.X00Xi1X = unit;
        XIi00iiXO();
        invalidate();
        requestLayout();
    }

    public void setValue(Float value) {
        this.iIXi1iiXI = value;
        XIi00iiXO();
        invalidate();
        requestLayout();
    }

    public void setValue2(Float value) {
        this.iXiX011 = value;
        OXO1();
        invalidate();
        requestLayout();
    }

    public void setValue2Segment(Integer value2Segment) {
        this.X111IO = 1;
        this.Ii1iii0 = value2Segment;
        invalidate();
        requestLayout();
    }

    public void setValueSegment(Integer valueSegment) {
        this.X111IO = 1;
        this.iXiiiO = valueSegment;
        invalidate();
        requestLayout();
    }

    public void setValueSegmentText(String valueSegmentText) {
        this.iiiO = valueSegmentText;
        XIi00iiXO();
        invalidate();
        requestLayout();
    }

    public void setValueSignColor(int valueSignColor) {
        this.X1IX = valueSignColor;
        invalidate();
        requestLayout();
    }

    public SegmentedBarView2(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f55102OO = -1.0f;
        this.XOX0O0 = -1.0f;
        this.iOiXi11II = new ArrayList<>();
        this.IO0II0i = 0;
        this.Ii0i = 1;
        this.XOIX = -1;
        this.f55103Oi = -12303292;
        this.IO0iXO0O = 65536;
        this.iOI = -1;
        this.X00O0 = false;
        this.iIi1 = new Paint();
        this.i100IXOX = 0;
        this.iI0I = 4.0f;
        this.iIX0i = 15.0f;
        this.X1OI = 0.1f;
        XXI(context, attrs);
    }
}
