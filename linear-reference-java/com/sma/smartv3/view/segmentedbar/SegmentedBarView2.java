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
import com.ironsource.C2985d4;
import com.sma.smartv3.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SegmentedBarView2 extends View {
    public static final int Xii = 0;
    public static final int iiII = 1;
    public Paint I1;
    public RectF IO;
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
    public float OO;
    public int OX110i;
    public int Oi;
    public boolean X00O0;
    public int X00XIX1;
    public String X00Xi1X;
    public int X0i1O;
    public Rect X0iO;
    public Paint X1;
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
        this.OO = -1.0f;
        this.XOX0O0 = -1.0f;
        this.iOiXi11II = new ArrayList();
        this.IO0II0i = 0;
        this.Ii0i = 1;
        this.XOIX = -1;
        this.Oi = -12303292;
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
        float r0 = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        if (TextUtils.isEmpty(text) == false) goto L5;
        return;
    L5:
        canvas.drawText(text, (left + right) / 2.0f, ((top + bottom) / 2.0f) + r0, paint);
    }

    public final void I0iXXO(Canvas canvas, int valueSignSpaceHeight, int valueSignCenter) {
        int r1 = 0;
        if (valueSignCenter != (-1)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        valueSignCenter = (getContentWidth() / 2) + getPaddingLeft();
    L8:
        this.X100O.set(valueSignCenter - (this.XXX11i / 2), getPaddingTop(), (this.XXX11i / 2) + valueSignCenter, (this.X11iII1O1 - this.X00XIX1) + getPaddingTop());
        this.iX1O1.setColor(this.X1IX);
        if (this.X100O.left >= getPaddingLeft()) goto L12;
        int r2 = (-this.X100O.left) + getPaddingLeft();
        RectF r3 = this.IO;
        Rect r4 = this.X100O;
        r3.set(r4.left + r2, r4.top, r4.right + r2, r4.bottom);
    L15:
        RectF r5 = this.IO;
        int r6 = this.OX110i;
        canvas.drawRoundRect(r5, r6, r6, this.iX1O1);
        if (r0 == false) goto L18;
        SegmentedBarView2 r7 = this;
        Canvas r8 = canvas;
    L25:
        int r9 = (((XX0() + getPaddingTop()) + iO()) + getXtop()) - 15;
        int r10 = (((r7.Ii0X0X + XX0()) + iO()) + getXtop()) + 15;
        int r11 = r7.Xii11I.x;
        r8.drawRoundRect(new RectF(r11 - 10.0f, r9, r11 + 10.0f, r10), 10.0f, 10.0f, r7.iX1O1);
        if (r7.XOXiX0 == null) goto L29;
        r8.save();
        RectF r12 = r7.IO;
        r8.translate(r12.left, (r12.top + (r12.height() / 2.0f)) - (r7.XOXiX0.getHeight() / 2));
        r7.XOXiX0.draw(r8);
        r8.restore();
        return;
    L29:
        return;
    L18:
        if ((valueSignCenter - (this.i0X000X0O / 2)) >= (this.IO0II0i + getPaddingLeft())) goto L21;
        r1 = getPaddingLeft() + (this.IO0II0i - valueSignCenter);
    L23:
        this.Xi1i0XOX0.set((valueSignCenter - (this.i0X000X0O / 2)) + r1, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
        this.iii0.set(((this.i0X000X0O / 2) + valueSignCenter) + r1, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
        this.Xii11I.set(valueSignCenter + r1, valueSignSpaceHeight + getPaddingTop());
        r7 = this;
        r8 = canvas;
        r7.IO(r8, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.iX1O1);
        goto L25
    L21:
        if (((this.i0X000X0O / 2) + valueSignCenter) <= ((getMeasuredWidth() - this.IO0II0i) - getPaddingRight())) goto L23;
        r1 = ((getMeasuredWidth() - this.IO0II0i) - valueSignCenter) - getPaddingRight();
        goto L23
    L12:
        if (this.X100O.right <= (getMeasuredWidth() - getPaddingRight())) goto L14;
        int r13 = (this.X100O.right - getMeasuredWidth()) + getPaddingRight();
        RectF r14 = this.IO;
        Rect r15 = this.X100O;
        r14.set(r15.left - r13, r15.top, r15.right - r13, r15.bottom);
        goto L15
    L14:
        RectF r16 = this.IO;
        Rect r17 = this.X100O;
        r16.set(r17.left, r17.top, r17.right, r17.bottom);
        goto L15
    L5:
        r0 = false;
        goto L6
    }

    public void I1XOi1(int width, int height) {
        this.XXX11i = width;
        this.X11iII1O1 = height;
        if (iIiiO() == true) goto L5;
        XIi00iiXO();
    L5:
        invalidate();
        requestLayout();
    }

    public void IIX1OXO(Float value, String unitHtml) {
        this.iIXi1iiXI = value;
        this.X00Xi1X = unitHtml;
        if (iIiiO() == true) goto L5;
        XIi00iiXO();
    L5:
        invalidate();
        requestLayout();
    }

    public final void IO(Canvas canvas, Point point1, Point point2, Point point3, Paint paint) {
        this.O0O.reset();
        this.O0O.moveTo(point1.x, point1.y);
        this.O0O.lineTo(point2.x, point2.y);
        this.O0O.lineTo(point3.x, point3.y);
        this.O0O.lineTo(point1.x, point1.y);
        this.O0O.close();
        canvas.drawPath(this.O0O, paint);
    }

    public final void IiI10X(Canvas canvas, iz3 segment, int segmentIndex, int segmentsSize, float valueMax) {
        Canvas r1 = canvas;
        if (segmentIndex != 0) goto L5;
        boolean r8 = true;
    L7:
        if (segmentIndex != (segmentsSize - 1)) goto L9;
        boolean r9 = true;
    L10:
        if (r8 == false) goto L13;
        if (r9 == false) goto L13;
        boolean r3 = true;
    L15:
        if (this.X111IO != 0) goto L24;
        float r5 = (getContentWidth() * (segment.XO0O10() - segment.O00())) / valueMax;
        float r4 = (getContentWidth() / valueMax) * segment.O00();
        if (r8 == true) goto L19;
        r4 = r4 + this.i11I;
    L19:
        float r7 = (getContentWidth() / valueMax) * segment.XO0O10();
        if (r8 == false) goto L22;
    L30:
        int r12 = (int) r4;
        int r10 = (int) r7;
        this.X11I.set((getPaddingLeft() + r12) + getXLeft(), ((XX0() + iO()) + getPaddingTop()) + getXtop(), (getPaddingRight() + r10) + getXLeft(), (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        Integer r2 = this.iXiiiO;
        if (r2 != null) goto L33;
    L36:
        Float r6 = this.iIXi1iiXI;
        if (r6 != null) goto L39;
    L46:
        boolean r11 = false;
    L47:
        Integer r13 = this.Ii1iii0;
        if (r13 != null) goto L50;
    L53:
        Float r14 = this.iXiX011;
        if (r14 != null) goto L56;
    L63:
        boolean r15 = r11;
    L64:
        this.I1.setColor(segment.OXO1());
        this.X0iO.set(this.X11I);
        if (this.IO0II0i != 0) goto L67;
        this.IO0II0i = this.X11I.height() / 2;
    L67:
        if (r8 == true) goto L74;
        if (r9 == true) goto L74;
        if (this.Ii0i != 0) goto L73;
        RectF r16 = this.IO;
        Rect r17 = this.X11I;
        r16.set(r17.left, r17.top, r17.right, r17.bottom);
        RectF r18 = this.IO;
        int r19 = this.IO0II0i;
        r1.drawRoundRect(r18, r19, r19, this.I1);
    L91:
        if (this.iXi == false) goto L114;
        Paint r20 = this.IX0IXOi;
        if (r15 == true) goto L95;
    L98:
        int r21 = this.O0O0X0iOi;
    L99:
        r20.setTextSize(r21);
        Paint r22 = this.IX0IXOi;
        if (r15 == true) goto L102;
    L105:
        int r23 = this.Oi;
    L106:
        r22.setColor(r23);
        int r24 = this.XX00i10X;
        if (r24 == 0) goto L112;
        if (r24 != 1) goto L115;
        Paint r25 = this.IX0IXOi;
        String r26 = segment.iO();
        Rect r27 = this.X0iO;
        float r28 = r27.left;
        int r29 = r27.bottom;
        OIi0(r1, r25, r26, r28, r29, r27.right, r29 + this.IX1XiI, r8, r9, segmentIndex);
        return;
    L115:
        return;
    L112:
        Paint r30 = this.IX0IXOi;
        String r31 = segment.iO();
        Rect r32 = this.X0iO;
        float r33 = r32.left;
        int r34 = r32.bottom;
        I0IIOi(canvas, r30, r31, r33, r34, r32.right, r34 + this.IX1XiI);
        return;
    L102:
        if (this.XX00i10X != 0) goto L105;
        r23 = this.IO0iXO0O;
        if (r23 != 65536) goto L106;
    L95:
        if (this.XX00i10X != 0) goto L98;
        r21 = this.iOI;
        if (r21 != (-1)) goto L99;
    L114:
        return;
    L73:
        r1.drawRect(this.X11I, this.I1);
        this.iOiXi11II.add(new Rect(this.X11I));
    L74:
        int r35 = this.Ii0i;
        if (r35 == 0) goto L89;
        if (r35 == 1) goto L84;
        if (r35 != 2) goto L91;
        if (r3 == false) goto L81;
        this.X11I.set(((r12 + this.IO0II0i) + getPaddingLeft()) + getXLeft(), ((XX0() + iO()) + getPaddingTop()) + getXtop(), ((r10 - this.IO0II0i) + getPaddingLeft()) + getXLeft(), (((this.Ii0X0X + XX0()) + getPaddingTop()) + iO()) + getXtop());
        r1.drawRect(this.X11I, this.I1);
        Point r36 = this.Xi1i0XOX0;
        Rect r37 = this.X11I;
        int r38 = r37.left;
        int r39 = this.IO0II0i;
        r36.set(r38 - r39, r37.top + r39);
        Point r40 = this.iii0;
        Rect r41 = this.X11I;
        r40.set(r41.left, r41.top);
        Point r42 = this.Xii11I;
        Rect r43 = this.X11I;
        r42.set(r43.left, r43.bottom);
        IO(r1, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.I1);
        Point r44 = this.Xi1i0XOX0;
        Rect r45 = this.X11I;
        int r46 = r45.right;
        int r47 = this.IO0II0i;
        r44.set(r46 + r47, r45.top + r47);
        Point r48 = this.iii0;
        Rect r49 = this.X11I;
        r48.set(r49.right, r49.top);
        Point r50 = this.Xii11I;
        Rect r51 = this.X11I;
        r50.set(r51.right, r51.bottom);
        r1 = canvas;
        IO(r1, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.I1);
        goto L91
    L81:
        if (r8 == false) goto L83;
        this.X11I.set(((r12 + this.IO0II0i) + getPaddingLeft()) + getXLeft(), ((XX0() + iO()) + getPaddingTop()) + getXtop(), (r10 + getPaddingLeft()) + getXLeft(), (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.X11I, this.I1);
        Point r52 = this.Xi1i0XOX0;
        Rect r53 = this.X11I;
        int r54 = r53.left;
        int r55 = this.IO0II0i;
        r52.set(r54 - r55, r53.top + r55);
        Point r56 = this.iii0;
        Rect r57 = this.X11I;
        r56.set(r57.left, r57.top);
        Point r58 = this.Xii11I;
        Rect r59 = this.X11I;
        r58.set(r59.left, r59.bottom);
        IO(r1, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.I1);
        goto L91
    L83:
        this.X11I.set((r12 + getPaddingLeft()) + getXLeft(), ((XX0() + iO()) + getPaddingTop()) + getXtop(), ((r10 - this.IO0II0i) + getPaddingLeft()) + getXLeft(), (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.X11I, this.I1);
        Point r60 = this.Xi1i0XOX0;
        Rect r61 = this.X11I;
        int r62 = r61.right;
        int r63 = this.IO0II0i;
        r60.set(r62 + r63, r61.top + r63);
        Point r64 = this.iii0;
        Rect r65 = this.X11I;
        r64.set(r65.right, r65.top);
        Point r66 = this.Xii11I;
        Rect r67 = this.X11I;
        r66.set(r67.right, r67.bottom);
        IO(r1, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.I1);
        goto L91
    L84:
        RectF r68 = this.IO;
        Rect r69 = this.X11I;
        r68.set(r69.left, r69.top, r69.right, r69.bottom);
        RectF r70 = this.IO;
        int r71 = this.IO0II0i;
        r1.drawRoundRect(r70, r71, r71, this.I1);
        this.iOiXi11II.add(new Rect(this.X11I));
        if (r3 == true) goto L91;
        if (r8 == false) goto L88;
        this.X11I.set(((r12 + this.IO0II0i) + getPaddingLeft()) + getXLeft(), ((XX0() + iO()) + getPaddingTop()) + getXtop(), (r10 + getPaddingRight()) + getXLeft(), (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.X11I, this.I1);
        goto L91
    L88:
        this.X11I.set((r12 + getPaddingLeft()) + getXLeft(), ((XX0() + iO()) + getPaddingTop()) + getXtop(), ((r10 - this.IO0II0i) + getPaddingRight()) + getXLeft(), (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.X11I, this.I1);
        goto L91
    L89:
        RectF r72 = this.IO;
        Rect r73 = this.X11I;
        r72.set(r73.left, r73.top, r73.right, r73.bottom);
        RectF r74 = this.IO;
        int r75 = this.IO0II0i;
        r1.drawRoundRect(r74, r75, r75, this.I1);
        goto L91
    L56:
        if (r14.floatValue() >= segment.O00()) goto L58;
    L59:
        if (r9 == false) goto L63;
        if (segment.XO0O10() != this.iXiX011.floatValue()) goto L63;
    L62:
        this.XOX0O0 = (int) (((r4 + getPaddingLeft()) + getXLeft()) + (((this.iXiX011.floatValue() - segment.O00()) / (segment.XO0O10() - segment.O00())) * r5));
    L52:
        r15 = true;
        goto L64
    L58:
        if (this.iXiX011.floatValue() < segment.XO0O10()) goto L62;
    L50:
        if (r13.intValue() != segmentIndex) goto L53;
        this.XOX0O0 = ((r4 + getPaddingLeft()) + (r5 / 2.0f)) + getXLeft();
        goto L52
    L39:
        if (r6.floatValue() >= segment.O00()) goto L41;
    L42:
        if (r9 == false) goto L46;
        if (segment.XO0O10() != this.iIXi1iiXI.floatValue()) goto L46;
    L45:
        this.OO = (int) (((getPaddingLeft() + r4) + getXLeft()) + (((this.iIXi1iiXI.floatValue() - segment.O00()) / (segment.XO0O10() - segment.O00())) * r5));
    L35:
        r11 = true;
        goto L47
    L41:
        if (this.iIXi1iiXI.floatValue() < segment.XO0O10()) goto L45;
    L33:
        if (r2.intValue() != segmentIndex) goto L36;
        this.OO = ((getPaddingLeft() + r4) + (r5 / 2.0f)) + getXLeft();
        goto L35
    L22:
        if (this.X00O0 == false) goto L30;
        RectF r110 = new RectF();
        this.X1.setColor(this.XO0X10iO);
        int r111 = (int) r4;
        r110.set((getPaddingLeft() + r111) + getXLeft(), ((XX0() + getPaddingTop()) + iO()) + getXtop(), ((r111 + getPaddingLeft()) + getXLeft()) + this.i11I, (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        r1.drawRect(r110, this.X1);
        goto L30
    L24:
        int r76 = getContentWidth();
        int r77 = this.i11I;
        float r78 = ((r76 + r77) / segmentsSize) - r77;
        float r79 = (r77 + r78) * segmentIndex;
        r7 = r79 + r78;
        if (r8 == false) goto L27;
    L29:
        r5 = r78;
        r4 = r79;
        goto L30
    L27:
        if (this.X00O0 == false) goto L29;
        RectF r112 = new RectF();
        this.X1.setColor(this.XO0X10iO);
        int r113 = (int) r79;
        r112.set((getPaddingLeft() + r113) + getXLeft(), ((XX0() + getPaddingTop()) + iO()) + getXtop(), ((r113 + getPaddingLeft()) + getXLeft()) + this.i11I, (((this.Ii0X0X + XX0()) + iO()) + getPaddingTop()) + getXtop());
        r1.drawRect(r112, this.X1);
    L13:
        r3 = false;
        goto L15
    L9:
        r9 = false;
        goto L10
    L5:
        r8 = false;
        goto L7
    }

    public final void O00(Canvas canvas) {
        Rect r0 = new Rect();
        int r2 = 0;
        boolean r3 = false;
    L4:
        if (r2 >= this.iOiXi11II.size()) goto L23;
        r0.set(this.iOiXi11II.get(r2));
        iz3 r4 = this.XXiIiX10.get(r2);
        int r5 = r0.left;
        float r6 = r5;
        float r7 = this.OO;
        boolean r8 = true;
        if (r6 >= r7) goto L15;
        if (r7 >= r0.right) goto L15;
        r0.left = (int) r7;
        int r9 = r4.IiI10X();
        this.X1IX = r9;
        float r10 = this.XOX0O0;
        if (r10 >= r0.right) goto L12;
        r0.right = (int) r10;
        this.X0i1O = r9;
        r8 = false;
    L12:
        this.I1.setColor(r9);
        canvas.drawRect(r0, this.I1);
    L13:
        r3 = r8;
    L17:
        if (r3 == false) goto L22;
        float r11 = this.XOX0O0;
        if (r11 > r0.right) goto L21;
        r0.right = (int) r11;
        int r12 = r4.IiI10X();
        this.X0i1O = r12;
        this.I1.setColor(r12);
        canvas.drawRect(r0, this.I1);
        r3 = false;
        goto L22
    L21:
        this.I1.setColor(r4.IiI10X());
        canvas.drawRect(r0, this.I1);
    L22:
        r2 = r2 + 1;
    L15:
        if (r5 != r7) goto L17;
        r0.left = (int) r7;
        this.X1IX = r4.IiI10X();
        goto L13
    }

    public void O10IXXX0X(float value2, String valueText) {
        this.XXO = valueText;
        this.iXiX011 = Float.valueOf(value2);
        OXO1();
        invalidate();
        requestLayout();
    }

    public final void OIX0iXi(Canvas canvas, int valueSignSpaceHeight, int valueSignCenter) {
        int r1 = 0;
        if (valueSignCenter != (-1)) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        valueSignCenter = (getContentWidth() / 2) + getPaddingLeft();
    L8:
        this.XX1Oi.set(valueSignCenter - (this.XXX11i / 2), getPaddingTop(), (this.XXX11i / 2) + valueSignCenter, (this.X11iII1O1 - this.X00XIX1) + getPaddingTop());
        this.iX1O1.setColor(this.X0i1O);
        if (this.XX1Oi.left >= getPaddingLeft()) goto L12;
        int r2 = (-this.XX1Oi.left) + getPaddingLeft();
        RectF r3 = this.IO;
        Rect r4 = this.XX1Oi;
        r3.set(r4.left + r2, r4.top, r4.right + r2, r4.bottom);
    L15:
        RectF r5 = this.IO;
        int r6 = this.OX110i;
        canvas.drawRoundRect(r5, r6, r6, this.iX1O1);
        if (r0 == false) goto L18;
        SegmentedBarView2 r7 = this;
        Canvas r8 = canvas;
    L25:
        int r9 = (((XX0() + getPaddingTop()) + iO()) + getXtop()) - 15;
        int r10 = (((r7.Ii0X0X + XX0()) + iO()) + getXtop()) + 15;
        int r11 = r7.Xii11I.x;
        r8.drawRoundRect(new RectF(r11 - 10.0f, r9, r11 + 10.0f, r10), 10.0f, 10.0f, r7.iX1O1);
        if (r7.XOO0XOOii == null) goto L29;
        r8.save();
        RectF r12 = r7.IO;
        r8.translate(r12.left, (r12.top + (r12.height() / 2.0f)) - (r7.XOO0XOOii.getHeight() / 2));
        r7.XOO0XOOii.draw(r8);
        r8.restore();
        return;
    L29:
        return;
    L18:
        if ((valueSignCenter - (this.i0X000X0O / 2)) >= (this.IO0II0i + getPaddingLeft())) goto L21;
        r1 = getPaddingLeft() + (this.IO0II0i - valueSignCenter);
    L23:
        this.Xi1i0XOX0.set((valueSignCenter - (this.i0X000X0O / 2)) + r1, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
        this.iii0.set(((this.i0X000X0O / 2) + valueSignCenter) + r1, (valueSignSpaceHeight - this.X00XIX1) + getPaddingTop());
        this.Xii11I.set(valueSignCenter + r1, valueSignSpaceHeight + getPaddingTop());
        r7 = this;
        r8 = canvas;
        r7.IO(r8, this.Xi1i0XOX0, this.iii0, this.Xii11I, this.iX1O1);
        goto L25
    L21:
        if (((this.i0X000X0O / 2) + valueSignCenter) <= ((getMeasuredWidth() - this.IO0II0i) - getPaddingRight())) goto L23;
        r1 = ((getMeasuredWidth() - this.IO0II0i) - valueSignCenter) - getPaddingRight();
        goto L23
    L12:
        if (this.XX1Oi.right <= (getMeasuredWidth() - getPaddingRight())) goto L14;
        int r13 = (this.XX1Oi.right - getMeasuredWidth()) + getPaddingRight();
        RectF r14 = this.IO;
        Rect r15 = this.XX1Oi;
        r14.set(r15.left - r13, r15.top, r15.right - r13, r15.bottom);
        goto L15
    L14:
        RectF r16 = this.IO;
        Rect r17 = this.XX1Oi;
        r16.set(r17.left, r17.top, r17.right, r17.bottom);
        goto L15
    L5:
        r0 = false;
        goto L6
    }

    public final void OIi0(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom, boolean isLeftSegment, boolean isRightSegment, int index) {
        paint.setTextAlign(Paint.Align.CENTER);
        float r2 = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        float r4 = paint.measureText(text);
        if (isLeftSegment == false) goto L7;
        canvas.drawText(text, left + (r4 / 2.0f), ((top + bottom) / 2.0f) + r2, paint);
        return;
    L7:
        if (isRightSegment == true) goto L9;
        if (isLeftSegment == true) goto L26;
        if (isRightSegment == true) goto L26;
        if (text.contains(C2985d4.j.c) == false) goto L28;
        String[] r13 = TextUtils.split(text, C2985d4.j.c);
        if ((index % 2) != 1) goto L24;
        float r5 = ((top + bottom) / 2.0f) + r2;
        canvas.drawText(r13[0], left, r5, paint);
        canvas.drawText(r13[1], right, r5, paint);
        return;
    L24:
        canvas.drawText(r13[1], right, ((top + bottom) / 2.0f) + r2, paint);
        return;
    L28:
        return;
    L26:
        canvas.drawText(text, right - (r4 / 2.0f), ((top + bottom) / 2.0f) + r2, paint);
        return;
    L9:
        if (this.XXiIiX10.size() <= 2) goto L11;
    L14:
        canvas.drawText(text, right - (r4 / 2.0f), ((top + bottom) / 2.0f) + r2, paint);
        return;
    L11:
        if (text.contains(C2985d4.j.c) == false) goto L14;
        String[] r14 = TextUtils.split(text, C2985d4.j.c);
        float r6 = ((top + bottom) / 2.0f) + r2;
        canvas.drawText(r14[0], left, r6, paint);
        float r0 = paint.measureText(r14[1]);
        canvas.drawText(r14[1], right - (r0 / 2.0f), r6, paint);
    }

    public final void OXO1() {
        if (XiOIO() == false) goto L6;
        this.XOO0XOOii = null;
        return;
    L6:
        Float r0 = this.iXiX011;
        if (r0 == null) goto L9;
        String r1 = this.IXOIIIO.format(r0);
    L11:
        if (this.iXiX011 == null) goto L18;
        String r2 = this.X00Xi1X;
        if (r2 == null) goto L18;
        if (r2.isEmpty() == true) goto L18;
        r1 = r1 + String.format("<br><small>%s</small>", new Object[]{this.X00Xi1X});
    L18:
        if (TextUtils.isEmpty(this.XXO) == true) goto L20;
        r1 = this.XXO;
    L20:
        this.XOO0XOOii = new StaticLayout(Html.fromHtml(r1), this.iiIOiX, this.XXX11i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        return;
    L9:
        r1 = this.iiiO;
        goto L11
    }

    public void X0O(Float value2, String unitHtml) {
        this.iXiX011 = value2;
        this.X00Xi1X = unitHtml;
        if (XiOIO() == true) goto L5;
        OXO1();
    L5:
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
        if (iIiiO() == false) goto L6;
        this.XOXiX0 = null;
        return;
    L6:
        Float r0 = this.iIXi1iiXI;
        if (r0 == null) goto L9;
        String r1 = this.IXOIIIO.format(r0);
    L11:
        if (this.iIXi1iiXI == null) goto L18;
        String r2 = this.X00Xi1X;
        if (r2 == null) goto L18;
        if (r2.isEmpty() == true) goto L18;
        r1 = r1 + String.format("<br><small>%s</small>", new Object[]{this.X00Xi1X});
    L18:
        if (TextUtils.isEmpty(this.O001I) == true) goto L20;
        r1 = this.O001I;
    L20:
        this.XOXiX0 = new StaticLayout(Html.fromHtml(r1), this.iiIOiX, this.XXX11i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        return;
    L9:
        r1 = this.iiiO;
        goto L11
    }

    public final void XO0O10(Canvas canvas) {
        this.iIi1.setStrokeWidth(this.iI0I);
        this.iIi1.setColor(-1);
        this.iIi1.setAntiAlias(true);
        int r2 = 0;
        iz3 r0 = this.XXiIiX10.get(0);
        List<iz3> r3 = this.XXiIiX10;
        iz3 r4 = r3.get(r3.size() - 1);
        Rect r5 = this.iOiXi11II.get(0);
        ArrayList<Rect> r6 = this.iOiXi11II;
        Rect r1 = r6.get(r6.size() - 1);
        int r7 = (int) ((r4.XO0O10() - r0.O00()) / this.X1OI);
        this.i100IXOX = r7;
        float r8 = (r1.right - r5.left) / r7;
    L4:
        if (r2 > this.i100IXOX) goto L6;
        float r9 = r5.left + (r2 * r8);
        float r10 = (r5.height() - this.iIX0i) / 2.0f;
        canvas.drawLine(r9, r5.top + r10, r9, r5.bottom - r10, this.iIi1);
        r2 = r2 + 1;
        goto L4
    }

    public final void XOO0ii0(Canvas canvas, Paint paint, String text, Rect outsideRect) {
        I0IIOi(canvas, paint, text, outsideRect.left, outsideRect.top, outsideRect.right, outsideRect.bottom);
    }

    public final int XX0() {
        if (iIiiO() == false) goto L7;
        return 0;
    L7:
        return this.X11iII1O1;
    }

    public final void XXI(Context context, AttributeSet attrs) {
        TypedArray r6 = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SegmentedBarView, 0, 0);
        Resources r7 = getResources();     // Catch: Throwable -> L6
        this.XX00i10X = r6.getInt(3, 0);     // Catch: Throwable -> L6
        this.IiiXiI0I = r6.getDimensionPixelSize(42, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_text_size));     // Catch: Throwable -> L6
        this.O0O0X0iOi = r6.getDimensionPixelSize(10, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_description_text_size));     // Catch: Throwable -> L6
        this.iOI = r6.getDimensionPixelSize(8, -1);     // Catch: Throwable -> L6
        this.Ii0X0X = r6.getDimensionPixelSize(2, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_bar_height));     // Catch: Throwable -> L6
        this.X11iII1O1 = r6.getDimensionPixelSize(39, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_height));     // Catch: Throwable -> L6
        this.XXX11i = r6.getDimensionPixelSize(41, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_width));     // Catch: Throwable -> L6
        this.X00XIX1 = r6.getDimensionPixelSize(0, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_arrow_height));     // Catch: Throwable -> L6
        this.i0X000X0O = r6.getDimensionPixelSize(1, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_arrow_width));     // Catch: Throwable -> L6
        this.i11I = r6.getDimensionPixelSize(18, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_segment_gap_width));     // Catch: Throwable -> L6
        this.IO0II0i = r6.getDimensionPixelSize(22, 0);     // Catch: Throwable -> L6
        this.XO0X10iO = r6.getColor(17, -1);     // Catch: Throwable -> L6
        this.OX110i = r6.getDimensionPixelSize(40, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_round));     // Catch: Throwable -> L6
        this.IX1XiI = r6.getDimensionPixelSize(5, r7.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_description_box_height));     // Catch: Throwable -> L6
        this.iXi = r6.getBoolean(25, false);     // Catch: Throwable -> L6
        String r0 = r6.getString(35);     // Catch: Throwable -> L6
        this.iiiO = r0;     // Catch: Throwable -> L6
        if (r0 != null) goto L8;
        this.iiiO = r7.getString(com.sma.smartv3.pro.R.string.sbv_value_segment);     // Catch: Throwable -> L6
    L8:
        this.Oi = r6.getColor(9, this.Oi);     // Catch: Throwable -> L6
        this.IO0iXO0O = r6.getColor(7, 65536);     // Catch: Throwable -> L6
        this.Ii0i = r6.getInt(29, 1);     // Catch: Throwable -> L6
        this.X111IO = r6.getInt(23, 1);     // Catch: Throwable -> L6
        r6.recycle();
        this.IXOIIIO = new DecimalFormat("##.####");
        TextPaint r8 = new TextPaint(1);
        this.IXI = r8;
        r8.setColor(-1);
        Paint r9 = this.IXI;
        Paint.Style r10 = Paint.Style.FILL;
        r9.setStyle(r10);
        TextPaint r11 = new TextPaint(1);
        this.iiIOiX = r11;
        r11.setColor(-1);
        this.iiIOiX.setStyle(r10);
        this.iiIOiX.setTextSize(this.IiiXiI0I);
        this.iiIOiX.setColor(this.XOIX);
        TextPaint r12 = new TextPaint(1);
        this.IX0IXOi = r12;
        r12.setColor(-12303292);
        this.IX0IXOi.setStyle(r10);
        Paint r13 = new Paint(1);
        this.I1 = r13;
        r13.setStyle(r10);
        this.I1.setAntiAlias(true);
        Paint r14 = new Paint(1);
        this.iX1O1 = r14;
        r14.setStyle(r10);
        this.iX1O1.setAntiAlias(true);
        Paint r15 = new Paint(1);
        this.X1 = r15;
        r15.setStyle(r10);
        this.X11I = new Rect();
        this.IO = new RectF();
        this.X100O = new Rect();
        this.XX1Oi = new Rect();
        this.X0iO = new Rect();
        Path r16 = new Path();
        this.O0O = r16;
        r16.setFillType(Path.FillType.EVEN_ODD);
        this.Xi1i0XOX0 = new Point();
        this.iii0 = new Point();
        this.Xii11I = new Point();
        this.XXiO0i = 0;
        return;
    L6:
        th = move-exception;
        r6.recycle();
        throw th;
    }

    public final boolean XiOIO() {
        if (this.iXiX011 == null) goto L5;
        return false;
    L5:
        if (this.Ii1iii0 != null) goto L10;
        return true;
    L10:
        return false;
    }

    public Integer getValueSegment() {
        return this.iXiiiO;
    }

    public String getValueSegmentText() {
        return this.iiiO;
    }

    public final boolean iIiiO() {
        if (this.iIXi1iiXI == null) goto L5;
        return false;
    L5:
        if (this.iXiiiO != null) goto L10;
        return true;
    L10:
        return false;
    }

    public final int iO() {
        if (iIiiO() == false) goto L7;
        return 0;
    L7:
        return this.XXiO0i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.iOiXi11II.clear();
        this.OO = -1.0f;
        this.XOX0O0 = -1.0f;
        int r5 = this.XXiIiX10.size();
        List<iz3> r0 = this.XXiIiX10;
        iz3 r1 = r0.get(r0.size() - 1);
        int r4 = 0;
    L3:
        if (r4 >= r5) goto L5;
        IiI10X(canvas, this.XXiIiX10.get(r4), r4, r5, r1.XO0O10());
        r4 = r4 + 1;
        goto L3
    L5:
        O00(canvas);
        I0iXXO(canvas, XX0(), (int) this.OO);
        OIX0iXi(canvas, XX0(), (int) this.XOX0O0);
        XO0O10(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r0 = getPaddingLeft() + getPaddingRight();
        int r1 = (this.Ii0X0X + getPaddingBottom()) + getPaddingTop();
        if (iIiiO() == true) goto L6;
        r1 = r1 + (this.X11iII1O1 + this.X00XIX1);
    L6:
        if (this.iXi == false) goto L8;
        r1 = r1 + this.IX1XiI;
    L8:
        setMeasuredDimension(View.resolveSizeAndState(r0, widthMeasureSpec, 0), View.resolveSizeAndState(r1, heightMeasureSpec, 0));
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
        this.OO = -1.0f;
        this.XOX0O0 = -1.0f;
        this.iOiXi11II = new ArrayList();
        this.IO0II0i = 0;
        this.Ii0i = 1;
        this.XOIX = -1;
        this.Oi = -12303292;
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
