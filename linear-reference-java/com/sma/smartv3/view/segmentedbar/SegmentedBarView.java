package com.sma.smartv3.view.segmentedbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Html;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.qz3;
import com.ironsource.C2985d4;
import com.sma.smartv3.R;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SegmentedBarView extends View {
    public static final int I0IIOI = 1;
    public static final int IOIi00 = 2;
    public static final int IX0iIX = 1;
    public static final int O1iXiI = 0;
    public static final int OXi001 = 0;
    public static final int XIO11I = 3;
    public Rect I0;
    public int I0XXi0X;
    public int[] I1;
    public int[] IO;
    public String IO0II0i;
    public int IO0iXO0O;
    public int IOi1O0;
    public int IX0IXOi;
    public int IX1XiI;
    public boolean IXI;
    public DecimalFormat IXOIIIO;
    public int IXiOXO;
    public String Ii0X0X;
    public int Ii0i;
    public String Ii1iii0;
    public int IiiXiI0I;
    public Float O001I;
    public int O0O;
    public TextPaint O0O0X0iOi;
    public boolean O1;
    public boolean O101;
    public int OO;
    public int OX110i;
    public int Oi;
    public boolean X00O0;
    public int X00XIX1;
    public Paint X00Xi1X;
    public int X0i1O;
    public Paint X0iO;
    public Paint X1;
    public int X100O;
    public boolean X111IO;
    public Rect X11I;
    public Paint X11iII1O1;
    public Paint X1IX;
    public Point X1OI;
    public int XIIO11I;
    public List<iz3> XO0X10iO;
    public int XOIX;
    public int XOO0XOOii;
    public int XOX0O0;
    public int XOXiX0;
    public StaticLayout XX00i10X;
    public float XX1Oi;
    public int XXI0XOIX;
    public String XXO;
    public Bitmap XXOXi;
    public Paint XXX11i;
    public Paint XXiIiX10;
    public int XXiO0i;
    public int Xi1i0XOX0;
    public Point Xii;
    public int Xii11I;
    public int i0X000X0O;
    public int i100IXOX;
    public int i11I;
    public Path iI0I;
    public Path iIX0i;
    public int iIXi1iiXI;
    public boolean iIi0;
    public int iIi1;
    public int iOI;
    public boolean iOX;
    public int iOiXi11II;
    public RectF iX1O1;
    public int iXi;
    public int iXiX011;
    public Integer iXiiiO;
    public Point iiII;
    public Paint iiIOiX;
    public int iii0;
    public Rect iiiO;

    public class OXO1 {
        public final /* synthetic */ SegmentedBarView OXO1;

        public /* synthetic */ OXO1(SegmentedBarView r1, qz3 r2) {
            this(r1);
        }

        public OXO1 I0IIOi(int gapWidth) {
            SegmentedBarView.XOO0ii0(this.OXO1, gapWidth);
            return this;
        }

        public OXO1 I0iXXO(boolean showDescriptionText) {
            SegmentedBarView.OIX0iXi(this.OXO1, showDescriptionText);
            return this;
        }

        public OXO1 I1XOi1(String unit) {
            SegmentedBarView.X0O(this.OXO1, unit);
            SegmentedBarView.OX(this.OXO1);
            return this;
        }

        public OXO1 IIX1OXO(Float value) {
            SegmentedBarView.I1XOi1(this.OXO1, value);
            SegmentedBarView.OX(this.OXO1);
            return this;
        }

        public OXO1 IO(int segmentTextSize) {
            SegmentedBarView.OIi0(this.OXO1, segmentTextSize);
            return this;
        }

        public OXO1 IiI10X(int descriptionTopTextColor) {
            SegmentedBarView.O00(this.OXO1, descriptionTopTextColor);
            return this;
        }

        public OXO1 O00(int descriptionTextSize) {
            SegmentedBarView.XO0O10(this.OXO1, descriptionTextSize);
            return this;
        }

        public OXO1 O10IXXX0X(int sideStyle) {
            SegmentedBarView.X1ii(this.OXO1, sideStyle);
            return this;
        }

        public OXO1 OII(int valueTextSize) {
            SegmentedBarView.OII(this.OXO1, valueTextSize);
            return this;
        }

        public OXO1 OIX0iXi(List<iz3> segments) {
            SegmentedBarView.IO(this.OXO1, segments);
            return this;
        }

        public OXO1 OIi0(int segmentTextColor) {
            SegmentedBarView.I0IIOi(this.OXO1, segmentTextColor);
            return this;
        }

        public OXO1 OXO1(int barHeight) {
            SegmentedBarView.OXO1(this.OXO1, barHeight);
            return this;
        }

        public OXO1 OiIIX101O(int width, int height) {
            SegmentedBarView.OiIIX101O(this.OXO1, width);
            SegmentedBarView.XX0(this.OXO1, height);
            return this;
        }

        public OXO1 X0O(int sideTextStyle) {
            SegmentedBarView.O10IXXX0X(this.OXO1, sideTextStyle);
            return this;
        }

        public OXO1 X1ii(int sideRule) {
            SegmentedBarView.XXI(this.OXO1, sideRule);
            return this;
        }

        public SegmentedBarView XIi00iiXO() {
            return this.OXO1;
        }

        public OXO1 XO0O10(int descriptionTextColor) {
            SegmentedBarView.iO(this.OXO1, descriptionTextColor);
            return this;
        }

        public OXO1 XOO0ii0(int emptySegmentColor) {
            SegmentedBarView.IiI10X(this.OXO1, emptySegmentColor);
            return this;
        }

        public OXO1 XX0(int valueSignColor) {
            SegmentedBarView.iIiiO(this.OXO1, valueSignColor);
            return this;
        }

        public OXO1 XXI(boolean showText) {
            SegmentedBarView.I0iXXO(this.OXO1, showText);
            return this;
        }

        public OXO1 XiOIO(Integer valueSegment) {
            SegmentedBarView.IIX1OXO(this.OXO1, valueSegment);
            SegmentedBarView.OX(this.OXO1);
            return this;
        }

        public OXO1 XiOIii1(int valueTextColor) {
            SegmentedBarView.XiOIii1(this.OXO1, valueTextColor);
            return this;
        }

        public OXO1 iIiiO(String valueSegmentText) {
            SegmentedBarView.XiOIO(this.OXO1, valueSegmentText);
            SegmentedBarView.OX(this.OXO1);
            return this;
        }

        public OXO1 iO(int descriptionBoxHeight) {
            SegmentedBarView.XIi00iiXO(this.OXO1, descriptionBoxHeight);
            return this;
        }

        public OXO1(final SegmentedBarView this$0) {
            this.OXO1 = this$0;
        }
    }

    public SegmentedBarView(Context context) {
        super(context);
        this.IO = new int[]{-65536, -16776961};
        this.I1 = new int[]{-16776961, -256};
        this.XX1Oi = -1.0f;
        this.Ii0i = 0;
        this.IiiXiI0I = 1;
        this.XOIX = 0;
        this.XOO0XOOii = -1;
        this.IO0iXO0O = -1;
        this.iOI = -12303292;
        this.IX1XiI = -1;
        this.XXiO0i = 65536;
        this.Xi1i0XOX0 = -1;
        this.iIi0 = false;
        this.O101 = false;
        iIXi1iiXI(context, null);
    }

    public static /* bridge */ /* synthetic */ void I0IIOi(SegmentedBarView r0, int r1) {
        r0.XOO0XOOii = r1;
    }

    public static /* bridge */ /* synthetic */ void I0iXXO(SegmentedBarView r0, boolean r1) {
        r0.IXI = r1;
    }

    public static OXO1 I1(Context context) {
        return new OXO1(new SegmentedBarView(context), null);
    }

    public static /* bridge */ /* synthetic */ void I1XOi1(SegmentedBarView r0, Float r1) {
        r0.O001I = r1;
    }

    public static /* bridge */ /* synthetic */ void IIX1OXO(SegmentedBarView r0, Integer r1) {
        r0.iXiiiO = r1;
    }

    public static /* bridge */ /* synthetic */ void IO(SegmentedBarView r0, List r1) {
        r0.XO0X10iO = r1;
    }

    public static /* bridge */ /* synthetic */ void IiI10X(SegmentedBarView r0, int r1) {
        r0.OO = r1;
    }

    public static /* bridge */ /* synthetic */ void O00(SegmentedBarView r0, int r1) {
        r0.IX1XiI = r1;
    }

    public static /* bridge */ /* synthetic */ void O10IXXX0X(SegmentedBarView r0, int r1) {
        r0.XOIX = r1;
    }

    public static /* bridge */ /* synthetic */ void OII(SegmentedBarView r0, int r1) {
        r0.Oi = r1;
    }

    public static /* bridge */ /* synthetic */ void OIX0iXi(SegmentedBarView r0, boolean r1) {
        r0.X00O0 = r1;
    }

    public static /* bridge */ /* synthetic */ void OIi0(SegmentedBarView r0, int r1) {
        r0.XOXiX0 = r1;
    }

    public static /* bridge */ /* synthetic */ void OX(SegmentedBarView r0) {
        r0.iOOX010X();
    }

    public static /* bridge */ /* synthetic */ void OXO1(SegmentedBarView r0, int r1) {
        r0.i11I = r1;
    }

    public static /* bridge */ /* synthetic */ void OiIIX101O(SegmentedBarView r0, int r1) {
        r0.iIXi1iiXI = r1;
    }

    public static /* bridge */ /* synthetic */ void X0O(SegmentedBarView r0, String r1) {
        r0.Ii0X0X = r1;
    }

    public static /* bridge */ /* synthetic */ void X1ii(SegmentedBarView r0, int r1) {
        r0.IiiXiI0I = r1;
    }

    public static /* bridge */ /* synthetic */ void XIi00iiXO(SegmentedBarView r0, int r1) {
        r0.iii0 = r1;
    }

    public static /* bridge */ /* synthetic */ void XO0O10(SegmentedBarView r0, int r1) {
        r0.O0O = r1;
    }

    public static /* bridge */ /* synthetic */ void XOO0ii0(SegmentedBarView r0, int r1) {
        r0.X00XIX1 = r1;
    }

    public static /* bridge */ /* synthetic */ void XX0(SegmentedBarView r0, int r1) {
        r0.X0i1O = r1;
    }

    public static /* bridge */ /* synthetic */ void XXI(SegmentedBarView r0, int r1) {
        r0.XXI0XOIX = r1;
    }

    public static /* bridge */ /* synthetic */ void XiOIO(SegmentedBarView r0, String r1) {
        r0.Ii1iii0 = r1;
    }

    public static /* bridge */ /* synthetic */ void XiOIii1(SegmentedBarView r0, int r1) {
        r0.IO0iXO0O = r1;
    }

    private int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getContentWidth() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - (getXLeft() * 2);
    }

    private int getXLeft() {
        int r0 = this.iIi1;
        if (r0 == 1) goto L6;
        if (r0 == 2) goto L6;
        return 0;
    L6:
        if (this.O1 == true) goto L8;
        return 0;
    L8:
        if (this.iXiiiO == null) goto L10;
        return 0;
    L10:
        return this.IOi1O0 / 2;
    }

    private int getXtop() {
        int r0 = this.I0XXi0X;
        int r1 = this.i11I;
        if ((r0 - r1) <= 0) goto L5;
        int r2 = (r0 - r1) / 2;
    L6:
        int r3 = this.iIi1;
        if (r3 == 1) goto L10;
        if (r3 == 2) goto L10;
    L12:
        return 0;
    L10:
        if (this.O1 == false) goto L12;
        return r2;
    L5:
        r2 = 0;
        goto L6
    }

    public static /* bridge */ /* synthetic */ void iIiiO(SegmentedBarView r0, int r1) {
        r0.iXiX011 = r1;
    }

    public static /* bridge */ /* synthetic */ void iO(SegmentedBarView r0, int r1) {
        r0.iOI = r1;
    }

    public final void II1Xi0(Canvas canvas) {
        Canvas r1 = canvas;
        float r2 = getContentWidth();
        this.iiiO.set(getPaddingLeft() + getXLeft(), ((X11I() + getPaddingTop()) + X01IiOiIi()) + getXtop(), (getPaddingLeft() + getXLeft()) + getContentWidth(), (((this.i11I + X11I()) + getPaddingTop()) + X01IiOiIi()) + getXtop());
        Rect r3 = this.iiiO;
        float r9 = r3.left;
        float r10 = r3.top;
        float r11 = r3.right;
        float r12 = r3.bottom;
        int[] r4 = this.IO;
        this.XXiIiX10.setShader(new LinearGradient(r9, r10, r11, r12, r4[0], r4[1], Shader.TileMode.MIRROR));
        int r5 = this.iiiO.height() / 2;
        this.Ii0i = r5;
        if (r5 <= (r2 / 2.0f)) goto L5;
        this.IiiXiI0I = 0;
    L5:
        this.I0.set(this.iiiO);
        int r6 = this.IiiXiI0I;
        if (r6 == 0) goto L12;
        if (r6 == 1) goto L11;
        if (r6 != 2) goto L14;
        this.iiiO.set(this.Ii0i + getPaddingLeft(), (X11I() + X01IiOiIi()) + getPaddingTop(), (getWidth() - getPaddingRight()) - this.Ii0i, ((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop());
        r1.drawRect(this.iiiO, this.XXiIiX10);
        Point r7 = this.X1OI;
        Rect r8 = this.iiiO;
        int r13 = r8.left;
        int r14 = this.Ii0i;
        r7.set(r13 - r14, r8.top + r14);
        Point r15 = this.Xii;
        Rect r16 = this.iiiO;
        r15.set(r16.left, r16.top);
        Point r17 = this.iiII;
        Rect r18 = this.iiiO;
        r17.set(r18.left, r18.bottom);
        X11iII1O1(r1, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
        Point r19 = this.X1OI;
        Rect r20 = this.iiiO;
        int r21 = r20.right;
        int r22 = this.Ii0i;
        r19.set(r21 + r22, r20.top + r22);
        Point r23 = this.Xii;
        Rect r24 = this.iiiO;
        r23.set(r24.right, r24.top);
        Point r25 = this.iiII;
        Rect r26 = this.iiiO;
        r25.set(r26.right, r26.bottom);
        r1 = canvas;
        X11iII1O1(r1, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
    L14:
        if (this.IXI == false) goto L17;
        String r27 = this.IO0II0i;
        this.iiIOiX.setTextSize(this.XOXiX0);
        Paint r28 = this.iiIOiX;
        Rect r29 = this.I0;
        iI(r1, r28, r27, r29.left, r29.top, r29.right, r29.bottom);
        return;
    L17:
        return;
    L11:
        RectF r30 = this.iX1O1;
        Rect r31 = this.iiiO;
        r30.set(r31.left, r31.top, r31.right, r31.bottom);
        RectF r32 = this.iX1O1;
        int r33 = this.Ii0i;
        r1.drawRoundRect(r32, r33, r33, this.XXiIiX10);
        goto L14
    L12:
        r1.drawRect(this.iiiO, this.XXiIiX10);
        goto L14
    }

    public final void IXXOO(Canvas canvas) {
        if (this.XXI0XOIX != 0) goto L48;
        List<iz3> r2 = this.XO0X10iO;
        if (r2 != null) goto L8;
        return;
    L8:
        if (r2.isEmpty() == true) goto L49;
        float r3 = this.XO0X10iO.get(0).O00();
        List<iz3> r4 = this.XO0X10iO;
        float r5 = r4.get(r4.size() - 1).XO0O10();
        Float r6 = this.O001I;
        if (r6 != null) goto L13;
        return;
    L13:
        if (r6.floatValue() >= r3) goto L15;
        return;
    L15:
        if (this.O001I.floatValue() > r5) goto L50;
        int r7 = 0;
    L19:
        if (r7 >= this.XO0X10iO.size()) goto L26;
        if (this.O001I.floatValue() < this.XO0X10iO.get(r7).O00()) goto L25;
        if (this.O001I.floatValue() > this.XO0X10iO.get(r7).XO0O10()) goto L25;
    L27:
        float r8 = this.O001I.floatValue() - r3;
        float r9 = r5 - r3;
        float r10 = r8 / r9;
        float r11 = (getContentWidth() * r9) / r5;
        float r12 = (int) ((getPaddingLeft() + getXLeft()) + (r10 * r11));
        int[] r13 = this.I1;
        int r16 = X0i1O(r10, r13[0], r13[1]);
        this.iiiO.set(getPaddingLeft() + getXLeft(), ((X11I() + getPaddingTop()) + X01IiOiIi()) + getXtop(), (((int) r12) + (this.IOi1O0 / 3)) + (this.X00XIX1 * r7), (((this.i11I + X11I()) + getPaddingTop()) + X01IiOiIi()) + getXtop());
        Rect r14 = this.iiiO;
        this.X1.setShader(new LinearGradient(r14.left, r14.top, r14.right, r14.bottom, this.I1[0], r16, Shader.TileMode.MIRROR));
        int r15 = this.iiiO.height() / 2;
        this.Ii0i = r15;
        if (r15 <= (r11 / 2.0f)) goto L30;
        this.IiiXiI0I = 0;
    L30:
        this.I0.set(this.iiiO);
        int r17 = this.IiiXiI0I;
        if (r17 == 0) goto L39;
        if (r17 == 1) goto L37;
        if (r17 != 2) goto L51;
        this.iiiO.set(this.Ii0i + getPaddingLeft(), (X11I() + X01IiOiIi()) + getPaddingTop(), (getWidth() - getPaddingRight()) - this.Ii0i, ((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop());
        canvas.drawRect(this.iiiO, this.X1);
        Point r18 = this.X1OI;
        Rect r19 = this.iiiO;
        int r20 = r19.left;
        int r21 = this.Ii0i;
        r18.set(r20 - r21, r19.top + r21);
        Point r22 = this.Xii;
        Rect r23 = this.iiiO;
        r22.set(r23.left, r23.top);
        Point r24 = this.iiII;
        Rect r25 = this.iiiO;
        r24.set(r25.left, r25.bottom);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.X1);
        Point r1 = this.X1OI;
        Rect r26 = this.iiiO;
        int r27 = r26.right;
        int r28 = this.Ii0i;
        r1.set(r27 + r28, r26.top + r28);
        Point r29 = this.Xii;
        Rect r30 = this.iiiO;
        r29.set(r30.right, r30.top);
        Point r31 = this.iiII;
        Rect r32 = this.iiiO;
        r31.set(r32.right, r32.bottom);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.X1);
        return;
    L51:
        return;
    L37:
        RectF r33 = this.iX1O1;
        Rect r34 = this.iiiO;
        r33.set(r34.left, r34.top, r34.right, r34.bottom);
        RectF r35 = this.iX1O1;
        int r36 = this.Ii0i;
        canvas.drawRoundRect(r35, r36, r36, this.X1);
        return;
    L39:
        canvas.drawRect(this.iiiO, this.X1);
        return;
    L25:
        r7 = r7 + 1;
        goto L19
    L26:
        r7 = 0;
        goto L27
    L50:
        return;
    L49:
        return;
    }

    public void Ii1iii0(Float value, String unitHtml) {
        this.O001I = value;
        this.Ii0X0X = unitHtml;
        if (iiiO() == true) goto L5;
        iOOX010X();
    L5:
        invalidate();
        requestLayout();
    }

    public void O001I(int startColor, int endColor) {
        int[] r0 = this.I1;
        r0[0] = startColor;
        r0[1] = endColor;
        invalidate();
        requestLayout();
    }

    public final void O1O(Canvas canvas, Bitmap bitmap, int thumbW, int thumbH, float centerX, float centerY, Paint paint) {
        canvas.drawBitmap(bitmap, centerX - (thumbW / 2), centerY - (thumbH / 2), paint);
    }

    public final int X01IiOiIi() {
        if (iiiO() == false) goto L7;
        return 0;
    L7:
        return this.Xii11I;
    }

    public final int X0i1O(float fraction, int startColor, int endColor) {
        int r0 = Color.red(startColor);
        int r1 = Color.blue(startColor);
        int r2 = Color.green(startColor);
        int r8 = Color.alpha(startColor);
        int r3 = Color.red(endColor);
        int r4 = Color.blue(endColor);
        int r5 = Color.green(endColor) - r2;
        return Color.argb((int) (r8 + (fraction * (Color.alpha(endColor) - r8))), (int) (r0 + ((r3 - r0) * fraction)), (int) (r2 + (r5 * fraction)), (int) (r1 + ((r4 - r1) * fraction)));
    }

    public final int X11I() {
        if (iiiO() == false) goto L7;
        return 0;
    L7:
        return this.X0i1O;
    }

    public final void X11iII1O1(Canvas canvas, Point point1, Point point2, Point point3, Paint paint) {
        this.iI0I.reset();
        this.iI0I.moveTo(point1.x, point1.y);
        this.iI0I.lineTo(point2.x, point2.y);
        this.iI0I.lineTo(point3.x, point3.y);
        this.iI0I.lineTo(point1.x, point1.y);
        this.iI0I.close();
        canvas.drawPath(this.iI0I, paint);
    }

    public final void X1IX(Canvas canvas, int valueSignSpaceHeight, int valueSignCenter) {
        int r3 = 0;
        if (valueSignCenter != (-1)) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        int r4 = (getContentWidth() / 2) + getPaddingLeft();
    L9:
        this.X11I.set(r4 - (this.iIXi1iiXI / 2), getPaddingTop(), (this.iIXi1iiXI / 2) + r4, (this.X0i1O - this.XOX0O0) + getPaddingTop());
        this.XXX11i.setColor(this.iXiX011);
        if (this.X11I.left >= getPaddingLeft()) goto L13;
        int r5 = (-this.X11I.left) + getPaddingLeft();
        RectF r6 = this.iX1O1;
        Rect r7 = this.X11I;
        r6.set(r7.left + r5, r7.top, r7.right + r5, r7.bottom);
    L16:
        RectF r8 = this.iX1O1;
        int r9 = this.X100O;
        canvas.drawRoundRect(r8, r9, r9, this.XXX11i);
        if (this.iOX == false) goto L19;
        RectF r10 = this.iX1O1;
        int r11 = this.X100O;
        canvas.drawRoundRect(r10, r11, r11, this.X1IX);
    L19:
        if (r2 == true) goto L30;
        if ((r4 - (this.iOiXi11II / 2)) >= (this.Ii0i + getPaddingLeft())) goto L24;
        r3 = getPaddingLeft() + (this.Ii0i - r4);
    L26:
        this.X1OI.set((r4 - (this.iOiXi11II / 2)) + r3, (valueSignSpaceHeight - this.XOX0O0) + getPaddingTop());
        this.Xii.set(((this.iOiXi11II / 2) + r4) + r3, (valueSignSpaceHeight - this.XOX0O0) + getPaddingTop());
        this.iiII.set(r4 + r3, getPaddingTop() + valueSignSpaceHeight);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.XXX11i);
        if (this.iOX == false) goto L30;
        XXX11i(canvas, this.X1OI, this.Xii, this.iiII, this.X1IX);
        goto L30
    L24:
        if (((this.iOiXi11II / 2) + r4) <= ((getMeasuredWidth() - this.Ii0i) - getPaddingRight())) goto L26;
        r3 = ((getMeasuredWidth() - this.Ii0i) - r4) - getPaddingRight();
    L30:
        if (this.XX00i10X == null) goto L33;
        RectF r12 = this.iX1O1;
        canvas.translate(r12.left, (r12.top + (r12.height() / 2.0f)) - (this.XX00i10X.getHeight() / 2));
        this.XX00i10X.draw(canvas);
        return;
    L33:
        return;
    L13:
        if (this.X11I.right <= (getMeasuredWidth() - getPaddingRight())) goto L15;
        int r13 = (this.X11I.right - getMeasuredWidth()) + getPaddingRight();
        RectF r14 = this.iX1O1;
        Rect r15 = this.X11I;
        r14.set(r15.left - r13, r15.top, r15.right - r13, r15.bottom);
        goto L16
    L15:
        RectF r16 = this.iX1O1;
        Rect r17 = this.X11I;
        r16.set(r17.left, r17.top, r17.right, r17.bottom);
        goto L16
    L8:
        r4 = valueSignCenter;
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    public final void XXIIO1i11(Canvas canvas, Paint paint, String text, Rect outsideRect) {
        iI(canvas, paint, text, outsideRect.left, outsideRect.top, outsideRect.right, outsideRect.bottom);
    }

    public void XXO(float value, String valueText) {
        this.XXO = valueText;
        this.O001I = Float.valueOf(value);
        iOOX010X();
        invalidate();
        requestLayout();
    }

    public final void XXX11i(Canvas canvas, Point point1, Point point2, Point point3, Paint paint) {
        this.iIX0i.reset();
        this.iIX0i.moveTo(point1.x, point1.y);
        this.iIX0i.lineTo(point2.x, point2.y);
        paint.setColor(this.X11iII1O1.getColor());
        paint.setStrokeWidth(this.IXiOXO + 1.0f);
        canvas.drawPath(this.iIX0i, paint);
        this.iIX0i.reset();
        paint.setStrokeWidth(this.IXiOXO);
        float r0 = this.IXiOXO / 6;
        this.iIX0i.moveTo(point1.x - r0, point1.y - r0);
        this.iIX0i.lineTo(point3.x, point3.y);
        this.iIX0i.lineTo(point2.x + r0, point2.y - r0);
        paint.setColor(this.XIIO11I);
        canvas.drawPath(this.iIX0i, paint);
    }

    public int getCurrentBarColor() {
        return this.OX110i;
    }

    public Integer getValueSegment() {
        return this.iXiiiO;
    }

    public String getValueSegmentText() {
        return this.Ii1iii0;
    }

    public void i010I(Canvas canvas, int thumbW, int thumbH, float centerX, float centerY, int color, Paint paint) {
        paint.setColor(color);
        int r3 = Math.max(thumbH, thumbW) / 2;
        paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.SOLID));
        canvas.drawCircle(centerX, centerY, r3, paint);
        paint.setMaskFilter(null);
    }

    public final void iI(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom) {
        paint.setTextAlign(Paint.Align.CENTER);
        float r0 = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        if (TextUtils.isEmpty(text) == false) goto L5;
        return;
    L5:
        canvas.drawText(text, (left + right) / 2.0f, ((top + bottom) / 2.0f) + r0, paint);
    }

    public final void iIXi1iiXI(Context context, AttributeSet attrs) {
        TypedArray r11 = context.getTheme().obtainStyledAttributes(attrs, R.styleable.SegmentedBarView, 0, 0);
        Resources r0 = getResources();     // Catch: Throwable -> L6
        this.i100IXOX = r11.getResourceId(31, -1);     // Catch: Throwable -> L6
        this.iIi1 = r11.getInt(32, 0);     // Catch: Throwable -> L6
        this.IX0IXOi = r11.getInt(3, 0);     // Catch: Throwable -> L6
        this.iXi = r11.getInt(4, 0);     // Catch: Throwable -> L6
        this.XOXiX0 = r11.getDimensionPixelSize(24, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_segment_text_size));     // Catch: Throwable -> L6
        this.Oi = r11.getDimensionPixelSize(42, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_text_size));     // Catch: Throwable -> L6
        this.O0O = r11.getDimensionPixelSize(10, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_description_text_size));     // Catch: Throwable -> L6
        this.Xi1i0XOX0 = r11.getDimensionPixelSize(8, -1);     // Catch: Throwable -> L6
        this.i11I = r11.getDimensionPixelSize(2, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_bar_height));     // Catch: Throwable -> L6
        this.X0i1O = r11.getDimensionPixelSize(39, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_height));     // Catch: Throwable -> L6
        this.iIXi1iiXI = r11.getDimensionPixelSize(41, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_width));     // Catch: Throwable -> L6
        this.XOX0O0 = r11.getDimensionPixelSize(0, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_arrow_height));     // Catch: Throwable -> L6
        this.iOiXi11II = r11.getDimensionPixelSize(1, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_arrow_width));     // Catch: Throwable -> L6
        this.X00XIX1 = r11.getDimensionPixelSize(18, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_segment_gap_width));     // Catch: Throwable -> L6
        this.Ii0i = r11.getDimensionPixelSize(22, 0);     // Catch: Throwable -> L6
        this.i0X000X0O = r11.getColor(17, -1);     // Catch: Throwable -> L6
        this.X100O = r11.getDimensionPixelSize(40, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_round));     // Catch: Throwable -> L6
        this.iii0 = r11.getDimensionPixelSize(5, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_description_box_height));     // Catch: Throwable -> L6
        this.Xii11I = r11.getDimensionPixelSize(6, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_description_box_height));     // Catch: Throwable -> L6
        this.IXiOXO = r11.getDimensionPixelSize(38, r0.getDimensionPixelSize(com.sma.smartv3.pro.R.dimen.sbv_value_sign_border_size));     // Catch: Throwable -> L6
        this.I0XXi0X = r11.getDimensionPixelSize(33, (int) (this.i11I * 1.3f));     // Catch: Throwable -> L6
        this.IOi1O0 = r11.getDimensionPixelSize(34, (int) (this.i11I * 1.3f));     // Catch: Throwable -> L6
        this.IXI = r11.getBoolean(27, true);     // Catch: Throwable -> L6
        this.X00O0 = r11.getBoolean(25, false);     // Catch: Throwable -> L6
        this.X111IO = r11.getBoolean(26, false);     // Catch: Throwable -> L6
        String r4 = r11.getString(35);     // Catch: Throwable -> L6
        this.Ii1iii0 = r4;     // Catch: Throwable -> L6
        if (r4 != null) goto L8;
        this.Ii1iii0 = r0.getString(com.sma.smartv3.pro.R.string.sbv_value_segment);     // Catch: Throwable -> L6
    L8:
        String r5 = r11.getString(13);     // Catch: Throwable -> L6
        this.IO0II0i = r5;     // Catch: Throwable -> L6
        if (r5 != null) goto L11;
        this.IO0II0i = r0.getString(com.sma.smartv3.pro.R.string.sbv_empty);     // Catch: Throwable -> L6
    L11:
        this.iIi0 = r11.getBoolean(14, false);     // Catch: Throwable -> L6
        this.O101 = r11.getBoolean(19, false);     // Catch: Throwable -> L6
        this.iOX = r11.getBoolean(28, false);     // Catch: Throwable -> L6
        this.XIIO11I = r11.getColor(37, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_value_sign_boder_color));     // Catch: Throwable -> L6
        int r1 = r11.getColor(9, this.iOI);     // Catch: Throwable -> L6
        this.iOI = r1;     // Catch: Throwable -> L6
        this.IX1XiI = r11.getColor(11, r1);     // Catch: Throwable -> L6
        this.XXiO0i = r11.getColor(7, 65536);     // Catch: Throwable -> L6
        int r2 = r11.getColor(16, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_segment_bg_startcolor));     // Catch: Throwable -> L6
        int r6 = r11.getColor(15, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_segment_bg_endcolor));     // Catch: Throwable -> L6
        int[] r7 = this.IO;     // Catch: Throwable -> L6
        r7[0] = r2;     // Catch: Throwable -> L6
        r7[1] = r6;     // Catch: Throwable -> L6
        int r3 = r11.getColor(21, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_segment_progress_startcolor));     // Catch: Throwable -> L6
        int r8 = r11.getColor(20, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_segment_progress_endcolor));     // Catch: Throwable -> L6
        int[] r9 = this.I1;     // Catch: Throwable -> L6
        r9[0] = r3;     // Catch: Throwable -> L6
        r9[1] = r8;     // Catch: Throwable -> L6
        this.iXiX011 = r11.getColor(36, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_value_sign_background));     // Catch: Throwable -> L6
        this.OO = r11.getColor(12, context.getResources().getColor(com.sma.smartv3.pro.R.color.sbv_empty_segment_background));     // Catch: Throwable -> L6
        this.IiiXiI0I = r11.getInt(29, 1);     // Catch: Throwable -> L6
        this.XOIX = r11.getInt(30, 0);     // Catch: Throwable -> L6
        this.XXI0XOIX = r11.getInt(23, 1);     // Catch: Throwable -> L6
        r11.recycle();
        if (this.i100IXOX == (-1)) goto L15;
    L16:
        this.O1 = true;
    L18:
        if (this.O1 == false) goto L24;
        Bitmap r10 = BitmapFactory.decodeResource(getResources(), this.i100IXOX);
        this.XXOXi = r10;
        int r12 = this.iIi1;
        if (r12 != 1) goto L22;
        this.I0XXi0X = r10.getWidth();
        this.IOi1O0 = this.XXOXi.getHeight();
        goto L24
    L22:
        if (r12 != 3) goto L24;
        this.XXOXi = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), this.i100IXOX), this.IOi1O0, this.I0XXi0X, true);
    L24:
        this.IXOIIIO = new DecimalFormat("##.####");
        TextPaint r13 = new TextPaint(1);
        this.iiIOiX = r13;
        r13.setColor(-1);
        Paint r14 = this.iiIOiX;
        Paint.Style r15 = Paint.Style.FILL;
        r14.setStyle(r15);
        TextPaint r16 = new TextPaint(1);
        this.O0O0X0iOi = r16;
        r16.setColor(-1);
        this.O0O0X0iOi.setStyle(r15);
        this.O0O0X0iOi.setTextSize(this.Oi);
        this.O0O0X0iOi.setColor(this.IO0iXO0O);
        TextPaint r17 = new TextPaint(1);
        this.X0iO = r17;
        r17.setColor(-12303292);
        this.X0iO.setStyle(r15);
        Paint r18 = new Paint(1);
        this.X11iII1O1 = r18;
        r18.setStyle(r15);
        this.X11iII1O1.setAntiAlias(true);
        Paint r19 = new Paint(1);
        this.XXX11i = r19;
        r19.setStyle(r15);
        this.XXX11i.setAntiAlias(true);
        Paint r110 = new Paint(1);
        this.X1IX = r110;
        r110.setStyle(Paint.Style.STROKE);
        this.X1IX.setStrokeWidth(this.IXiOXO);
        this.X1IX.setColor(this.XIIO11I);
        this.X1IX.setAntiAlias(true);
        Paint r111 = new Paint(1);
        this.XXiIiX10 = r111;
        r111.setStyle(r15);
        this.XXiIiX10.setAntiAlias(true);
        Paint r112 = new Paint(1);
        this.X1 = r112;
        r112.setStyle(r15);
        this.X1.setAntiAlias(true);
        Paint r113 = new Paint(1);
        this.X00Xi1X = r113;
        r113.setStyle(r15);
        this.iiiO = new Rect();
        this.iX1O1 = new RectF();
        this.X11I = new Rect();
        this.I0 = new Rect();
        Path r114 = new Path();
        this.iI0I = r114;
        r114.setFillType(Path.FillType.EVEN_ODD);
        this.iIX0i = new Path();
        this.X1OI = new Point();
        this.Xii = new Point();
        this.iiII = new Point();
        int r115 = this.iIi1;
        if (r115 == 1) goto L27;
        if (r115 == 2) goto L27;
    L29:
        if (this.X111IO == true) goto L36;
        this.Xii11I = 0;
        return;
    L36:
        return;
    L27:
        this.XOX0O0 = 0;
        this.X0i1O = 0;
        goto L29
    L15:
        if (this.iIi1 != 2) goto L18;
    L6:
        th = move-exception;
        r11.recycle();
        throw th;
    }

    public final void iOO1ii1(Canvas canvas, iz3 segment, int segmentIndex, int segmentsSize, float valueMax) {
        Canvas r1 = canvas;
        if (segmentIndex != 0) goto L5;
        boolean r8 = true;
    L7:
        if (segmentIndex != (segmentsSize - 1)) goto L9;
        boolean r9 = true;
    L10:
        if (r8 == false) goto L13;
        if (r9 == false) goto L13;
        boolean r6 = true;
    L15:
        if (this.XXI0XOIX != 0) goto L24;
        float r4 = (getContentWidth() * (segment.XO0O10() - segment.O00())) / valueMax;
        float r3 = (getContentWidth() / valueMax) * segment.O00();
        if (r8 == true) goto L19;
        r3 = r3 + this.X00XIX1;
    L19:
        float r5 = (getContentWidth() / valueMax) * segment.XO0O10();
        if (r8 == false) goto L22;
    L30:
        int r12 = (int) r3;
        int r7 = (int) r5;
        this.iiiO.set((getPaddingLeft() + r12) + getXLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), (getPaddingRight() + r7) + getXLeft(), (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        Integer r2 = this.iXiiiO;
        if (r2 != null) goto L33;
    L36:
        Float r10 = this.O001I;
        if (r10 != null) goto L39;
    L46:
        boolean r16 = false;
    L47:
        this.X11iII1O1.setColor(segment.OXO1());
        this.I0.set(this.iiiO);
        if (this.Ii0i != 0) goto L50;
        this.Ii0i = this.iiiO.height() / 2;
    L50:
        if (r8 == true) goto L57;
        if (r9 == true) goto L57;
        if (this.IiiXiI0I != 0) goto L56;
        RectF r11 = this.iX1O1;
        Rect r13 = this.iiiO;
        r11.set(r13.left, r13.top, r13.right, r13.bottom);
        RectF r14 = this.iX1O1;
        int r15 = this.Ii0i;
        r1.drawRoundRect(r14, r15, r15, this.X11iII1O1);
    L74:
        if (this.IXI == false) goto L93;
        if (segment.XIi00iiXO() == null) goto L79;
        String r17 = segment.XIi00iiXO();
    L91:
        this.iiIOiX.setTextSize(this.XOXiX0);
        this.iiIOiX.setColor(this.XOO0XOOii);
        XXIIO1i11(r1, this.iiIOiX, r17, this.I0);
        goto L93
    L79:
        if (r8 == true) goto L83;
        if (r9 == true) goto L83;
        r17 = String.format("%s - %s", new Object[]{this.IXOIIIO.format(segment.O00()), this.IXOIIIO.format(segment.XO0O10())});
    L83:
        if (r6 == false) goto L85;
    L90:
        r17 = String.format("%s - %s", new Object[]{this.IXOIIIO.format(segment.O00()), this.IXOIIIO.format(segment.XO0O10())});
        goto L91
    L85:
        if (this.XOIX == 1) goto L90;
        if (r8 == false) goto L89;
        r17 = String.format("<%s", new Object[]{this.IXOIIIO.format(segment.XO0O10())});
        goto L91
    L89:
        r17 = String.format(">%s", new Object[]{this.IXOIIIO.format(segment.O00())});
    L93:
        if (this.X00O0 == false) goto L115;
        Paint r18 = this.X0iO;
        if (r16 == true) goto L97;
    L100:
        int r19 = this.O0O;
    L101:
        r18.setTextSize(r19);
        Paint r20 = this.X0iO;
        if (r16 == true) goto L104;
    L107:
        int r21 = this.iOI;
    L108:
        r20.setColor(r21);
        int r22 = this.IX0IXOi;
        if (r22 == 0) goto L113;
        if (r22 != 1) goto L115;
        Paint r23 = this.X0iO;
        String r24 = segment.iO();
        Rect r25 = this.I0;
        float r26 = r25.left;
        int r27 = r25.bottom;
        iX1O1(r1, r23, r24, r26, r27, r25.right, r27 + this.iii0, r8, r9, segmentIndex);
        goto L115
    L113:
        Paint r28 = this.X0iO;
        String r29 = segment.iO();
        Rect r30 = this.I0;
        float r31 = r30.left;
        int r32 = r30.bottom;
        iI(canvas, r28, r29, r31, r32, r30.right, r32 + this.iii0);
        goto L115
    L104:
        if (this.IX0IXOi != 0) goto L107;
        r21 = this.XXiO0i;
        if (r21 != 65536) goto L108;
    L97:
        if (this.IX0IXOi != 0) goto L100;
        r19 = this.Xi1i0XOX0;
        if (r19 != (-1)) goto L101;
    L115:
        if (this.X111IO == false) goto L138;
        Paint r33 = this.X0iO;
        if (r16 == true) goto L119;
    L122:
        int r34 = this.O0O;
    L123:
        r33.setTextSize(r34);
        Paint r35 = this.X0iO;
        if (r16 == true) goto L126;
    L129:
        int r36 = this.IX1XiI;
    L130:
        r35.setColor(r36);
        int r37 = this.iXi;
        if (r37 == 0) goto L136;
        if (r37 != 1) goto L139;
        Paint r38 = this.X0iO;
        String r39 = segment.XOO0ii0();
        Rect r40 = this.I0;
        float r41 = r40.left;
        float r42 = r40.top - X01IiOiIi();
        Rect r43 = this.I0;
        iX1O1(canvas, r38, r39, r41, r42, r43.right, r43.top, r8, r9, segmentIndex);
        return;
    L139:
        return;
    L136:
        Paint r44 = this.X0iO;
        String r45 = segment.XOO0ii0();
        Rect r46 = this.I0;
        float r47 = r46.left;
        float r48 = r46.top - X01IiOiIi();
        Rect r49 = this.I0;
        iI(canvas, r44, r45, r47, r48, r49.right, r49.top);
        return;
    L126:
        if (this.iXi != 0) goto L129;
        r36 = this.XXiO0i;
        if (r36 != 65536) goto L130;
    L119:
        if (this.iXi != 0) goto L122;
        r34 = this.Xi1i0XOX0;
        if (r34 != (-1)) goto L123;
    L138:
        return;
    L56:
        r1.drawRect(this.iiiO, this.X11iII1O1);
    L57:
        int r50 = this.IiiXiI0I;
        if (r50 == 0) goto L72;
        if (r50 == 1) goto L67;
        if (r50 != 2) goto L74;
        if (r6 == false) goto L64;
        this.iiiO.set(((r12 + this.Ii0i) + getPaddingLeft()) + getXLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), ((r7 - this.Ii0i) + getPaddingLeft()) + getXLeft(), (((this.i11I + X11I()) + getPaddingTop()) + X01IiOiIi()) + getXtop());
        r1.drawRect(this.iiiO, this.X11iII1O1);
        Point r51 = this.X1OI;
        Rect r52 = this.iiiO;
        int r53 = r52.left;
        int r54 = this.Ii0i;
        r51.set(r53 - r54, r52.top + r54);
        Point r55 = this.Xii;
        Rect r56 = this.iiiO;
        r55.set(r56.left, r56.top);
        Point r57 = this.iiII;
        Rect r58 = this.iiiO;
        r57.set(r58.left, r58.bottom);
        X11iII1O1(r1, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
        Point r59 = this.X1OI;
        Rect r60 = this.iiiO;
        int r61 = r60.right;
        int r62 = this.Ii0i;
        r59.set(r61 + r62, r60.top + r62);
        Point r63 = this.Xii;
        Rect r64 = this.iiiO;
        r63.set(r64.right, r64.top);
        Point r65 = this.iiII;
        Rect r66 = this.iiiO;
        r65.set(r66.right, r66.bottom);
        r1 = canvas;
        X11iII1O1(r1, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
        goto L74
    L64:
        if (r8 == false) goto L66;
        this.iiiO.set(((r12 + this.Ii0i) + getPaddingLeft()) + getXLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), (r7 + getPaddingLeft()) + getXLeft(), (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.iiiO, this.X11iII1O1);
        Point r67 = this.X1OI;
        Rect r68 = this.iiiO;
        int r69 = r68.left;
        int r70 = this.Ii0i;
        r67.set(r69 - r70, r68.top + r70);
        Point r71 = this.Xii;
        Rect r72 = this.iiiO;
        r71.set(r72.left, r72.top);
        Point r73 = this.iiII;
        Rect r74 = this.iiiO;
        r73.set(r74.left, r74.bottom);
        X11iII1O1(r1, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
        goto L74
    L66:
        this.iiiO.set((r12 + getPaddingLeft()) + getXLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), ((r7 - this.Ii0i) + getPaddingLeft()) + getXLeft(), (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.iiiO, this.X11iII1O1);
        Point r75 = this.X1OI;
        Rect r76 = this.iiiO;
        int r77 = r76.right;
        int r78 = this.Ii0i;
        r75.set(r77 + r78, r76.top + r78);
        Point r79 = this.Xii;
        Rect r80 = this.iiiO;
        r79.set(r80.right, r80.top);
        Point r81 = this.iiII;
        Rect r82 = this.iiiO;
        r81.set(r82.right, r82.bottom);
        X11iII1O1(r1, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
        goto L74
    L67:
        RectF r83 = this.iX1O1;
        Rect r84 = this.iiiO;
        r83.set(r84.left, r84.top, r84.right, r84.bottom);
        RectF r85 = this.iX1O1;
        int r86 = this.Ii0i;
        r1.drawRoundRect(r85, r86, r86, this.X11iII1O1);
        if (r6 == true) goto L74;
        if (r8 == false) goto L71;
        this.iiiO.set(((r12 + this.Ii0i) + getPaddingLeft()) + getXLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), (r7 + getPaddingRight()) + getXLeft(), (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.iiiO, this.X11iII1O1);
        goto L74
    L71:
        this.iiiO.set((r12 + getPaddingLeft()) + getXLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), ((r7 - this.Ii0i) + getPaddingRight()) + getXLeft(), (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        r1.drawRect(this.iiiO, this.X11iII1O1);
        goto L74
    L72:
        RectF r87 = this.iX1O1;
        Rect r88 = this.iiiO;
        r87.set(r88.left, r88.top, r88.right, r88.bottom);
        RectF r89 = this.iX1O1;
        int r90 = this.Ii0i;
        r1.drawRoundRect(r89, r90, r90, this.X11iII1O1);
        goto L74
    L39:
        if (r10.floatValue() >= segment.O00()) goto L41;
    L42:
        if (r9 == false) goto L46;
        if (segment.XO0O10() != this.O001I.floatValue()) goto L46;
    L45:
        this.XX1Oi = (int) (((r3 + getPaddingLeft()) + getXLeft()) + (((this.O001I.floatValue() - segment.O00()) / (segment.XO0O10() - segment.O00())) * r4));
        this.OX110i = segment.OXO1();
    L35:
        r16 = true;
        goto L47
    L41:
        if (this.O001I.floatValue() < segment.XO0O10()) goto L45;
    L33:
        if (r2.intValue() != segmentIndex) goto L36;
        this.XX1Oi = ((r3 + getPaddingLeft()) + (r4 / 2.0f)) + getXLeft();
        this.OX110i = segment.OXO1();
        goto L35
    L22:
        if (this.iIi0 == false) goto L30;
        RectF r91 = new RectF();
        this.X00Xi1X.setColor(this.i0X000X0O);
        int r110 = (int) r3;
        r91.set((getPaddingLeft() + r110) + getXLeft(), ((X11I() + getPaddingTop()) + X01IiOiIi()) + getXtop(), ((r110 + getPaddingLeft()) + getXLeft()) + this.X00XIX1, (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        r1.drawRect(r91, this.X00Xi1X);
        goto L30
    L24:
        int r92 = getContentWidth();
        int r93 = this.X00XIX1;
        float r94 = ((r92 + r93) / segmentsSize) - r93;
        float r95 = (r93 + r94) * segmentIndex;
        r5 = r95 + r94;
        if (r8 == false) goto L27;
    L29:
        r4 = r94;
        r3 = r95;
        goto L30
    L27:
        if (this.iIi0 == false) goto L29;
        RectF r96 = new RectF();
        this.X00Xi1X.setColor(this.i0X000X0O);
        int r111 = (int) r95;
        r96.set((getPaddingLeft() + r111) + getXLeft(), ((X11I() + getPaddingTop()) + X01IiOiIi()) + getXtop(), ((r111 + getPaddingLeft()) + getXLeft()) + this.X00XIX1, (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        r1.drawRect(r96, this.X00Xi1X);
    L13:
        r6 = false;
        goto L15
    L9:
        r9 = false;
        goto L10
    L5:
        r8 = false;
        goto L7
    }

    public final void iOOX010X() {
        if (iiiO() == false) goto L6;
        this.XX00i10X = null;
        return;
    L6:
        Float r0 = this.O001I;
        if (r0 == null) goto L9;
        String r1 = this.IXOIIIO.format(r0);
    L11:
        if (this.O001I == null) goto L18;
        String r2 = this.Ii0X0X;
        if (r2 == null) goto L18;
        if (r2.isEmpty() == true) goto L18;
        r1 = r1 + String.format(" <small>%s</small>", new Object[]{this.Ii0X0X});
    L18:
        if (TextUtils.isEmpty(this.XXO) == true) goto L20;
        r1 = this.XXO;
    L20:
        this.XX00i10X = new StaticLayout(Html.fromHtml(r1), this.O0O0X0iOi, this.iIXi1iiXI, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        return;
    L9:
        r1 = this.Ii1iii0;
        goto L11
    }

    public final void iX(Canvas canvas) {
        float r2 = getContentWidth();
        this.iiiO.set(getPaddingLeft(), ((X11I() + getPaddingTop()) + X01IiOiIi()) + getXtop(), ((int) r2) + getPaddingLeft(), (((this.i11I + X11I()) + getPaddingTop()) + X01IiOiIi()) + getXtop());
        this.XXiIiX10.setColor(this.OO);
        int r3 = this.iiiO.height() / 2;
        this.Ii0i = r3;
        if (r3 <= (r2 / 2.0f)) goto L5;
        this.IiiXiI0I = 0;
    L5:
        this.I0.set(this.iiiO);
        int r4 = this.IiiXiI0I;
        if (r4 != 0) goto L8;
        canvas.drawRect(this.iiiO, this.XXiIiX10);
    L15:
        if (this.IXI == false) goto L18;
        String r5 = this.IO0II0i;
        this.iiIOiX.setTextSize(this.XOXiX0);
        Paint r6 = this.iiIOiX;
        Rect r7 = this.I0;
        iI(canvas, r6, r5, r7.left, r7.top, r7.right, r7.bottom);
        return;
    L18:
        return;
    L8:
        if (r4 == 1) goto L12;
        if (r4 != 2) goto L15;
        this.iiiO.set(this.Ii0i + getPaddingLeft(), ((X11I() + X01IiOiIi()) + getPaddingTop()) + getXtop(), (getWidth() - getPaddingRight()) - this.Ii0i, (((this.i11I + X11I()) + X01IiOiIi()) + getPaddingTop()) + getXtop());
        canvas.drawRect(this.iiiO, this.XXiIiX10);
        Point r8 = this.X1OI;
        Rect r9 = this.iiiO;
        int r10 = r9.left;
        int r11 = this.Ii0i;
        r8.set(r10 - r11, r9.top + r11);
        Point r12 = this.Xii;
        Rect r13 = this.iiiO;
        r12.set(r13.left, r13.top);
        Point r14 = this.iiII;
        Rect r15 = this.iiiO;
        r14.set(r15.left, r15.bottom);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
        Point r1 = this.X1OI;
        Rect r16 = this.iiiO;
        int r17 = r16.right;
        int r18 = this.Ii0i;
        r1.set(r17 + r18, r16.top + r18);
        Point r19 = this.Xii;
        Rect r20 = this.iiiO;
        r19.set(r20.right, r20.top);
        Point r21 = this.iiII;
        Rect r22 = this.iiiO;
        r21.set(r22.right, r22.bottom);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
        goto L15
    L12:
        RectF r23 = this.iX1O1;
        Rect r24 = this.iiiO;
        r23.set(r24.left, r24.top, r24.right, r24.bottom);
        RectF r25 = this.iX1O1;
        int r26 = this.Ii0i;
        canvas.drawRoundRect(r25, r26, r26, this.XXiIiX10);
        goto L15
    }

    public final void iX1O1(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom, boolean isLeftSegment, boolean isRightSegment, int index) {
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
        if (this.XO0X10iO.size() <= 2) goto L11;
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

    public void iXiX011(int startColor, int endColor) {
        int[] r0 = this.IO;
        r0[0] = startColor;
        r0[1] = endColor;
        invalidate();
        requestLayout();
    }

    public void iXiiiO(int width, int height) {
        this.iIXi1iiXI = width;
        this.X0i1O = height;
        if (iiiO() == true) goto L5;
        iOOX010X();
    L5:
        invalidate();
        requestLayout();
    }

    public final boolean iiiO() {
        if (this.O001I == null) goto L5;
        return false;
    L5:
        if (this.iXiiiO != null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.XX1Oi = -1.0f;
        if (this.iIi0 == false) goto L6;
        II1Xi0(canvas);
    L6:
        if (this.O101 == false) goto L8;
        IXXOO(canvas);
    L8:
        List<iz3> r1 = this.XO0X10iO;
        if (r1 != null) goto L11;
        int r4 = 0;
    L13:
        if (r4 <= 0) goto L17;
        List<iz3> r2 = this.XO0X10iO;
        iz3 r7 = r2.get(r2.size() - 1);
        int r3 = 0;
    L15:
        if (r3 >= r4) goto L19;
        iOO1ii1(canvas, this.XO0X10iO.get(r3), r3, r4, r7.XO0O10());
        r3 = r3 + 1;
    L19:
        if (iiiO() == true) goto L45;
        int r5 = this.iIi1;
        if (r5 != 0) goto L23;
        X1IX(canvas, X11I(), (int) this.XX1Oi);
        return;
    L23:
        if (r5 == 1) goto L37;
        if (r5 != 2) goto L26;
        i010I(canvas, this.IOi1O0, this.I0XXi0X, this.XX1Oi, (this.iiiO.top - getXtop()) + (this.I0XXi0X / 2), this.OX110i, this.XXX11i);
        return;
    L26:
        if (r5 == 3) goto L29;
        return;
    L29:
        if (this.O1 == false) goto L33;
        int r6 = this.iiiO.top;
        int r8 = this.I0XXi0X;
        O1O(canvas, this.XXOXi, this.IOi1O0, r8, this.XX1Oi, (r6 - (r8 / 2)) - this.XOX0O0, this.XXX11i);
        return;
    L33:
        throw new RuntimeException("plase add sbv_sliderImg!!!!!");
    L37:
        if (this.O1 == false) goto L41;
        O1O(canvas, this.XXOXi, this.IOi1O0, this.I0XXi0X, this.XX1Oi, (this.iiiO.top - getXtop()) + (this.I0XXi0X / 2), this.XXX11i);
        return;
    L41:
        throw new RuntimeException("plase add sbv_sliderImg!!!!!");
    L45:
        return;
    L17:
        iX(canvas);
        goto L19
    L11:
        r4 = r1.size();
        goto L13
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r0 = getPaddingLeft() + getPaddingRight();
        int r1 = this.i11I;
        int r2 = this.iIi1;
        if (r2 != 2) goto L5;
    L6:
        r1 = Math.max(r1, this.I0XXi0X);
    L7:
        int r3 = (r1 + getPaddingBottom()) + getPaddingTop();
        if (iiiO() == true) goto L11;
        r3 = r3 + (this.X0i1O + this.XOX0O0);
    L11:
        if (this.X00O0 == false) goto L14;
        r3 = r3 + this.iii0;
    L14:
        if (this.X111IO == false) goto L16;
        r3 = r3 + this.Xii11I;
    L16:
        setMeasuredDimension(View.resolveSizeAndState(r0, widthMeasureSpec, 0), View.resolveSizeAndState(r3, heightMeasureSpec, 0));
        return;
    L5:
        if (r2 != 1) goto L7;
        goto L6
    }

    public void setBarHeight(int barHeight) {
        this.i11I = barHeight;
        invalidate();
        requestLayout();
    }

    public void setDescriptionBoxHeight(int descriptionBoxHeight) {
        this.iii0 = descriptionBoxHeight;
        invalidate();
        requestLayout();
    }

    public void setDescriptionTextColor(int descriptionTextColor) {
        this.iOI = descriptionTextColor;
        invalidate();
        requestLayout();
    }

    public void setDescriptionTextSize(int descriptionTextSize) {
        this.O0O = descriptionTextSize;
        invalidate();
        requestLayout();
    }

    public void setDescriptionTopTextColor(int descriptionTopTextColor) {
        this.IX1XiI = descriptionTopTextColor;
        invalidate();
        requestLayout();
    }

    public void setDrawSegmentBg(boolean drawSegmentBg) {
        this.iIi0 = drawSegmentBg;
        invalidate();
        requestLayout();
    }

    public void setEmptySegmentColor(int emptySegmentColor) {
        this.OO = emptySegmentColor;
        invalidate();
        requestLayout();
    }

    public void setGapColor(int gapColor) {
        this.i0X000X0O = gapColor;
        invalidate();
        requestLayout();
    }

    public void setGapWidth(int gapWidth) {
        this.X00XIX1 = gapWidth;
        invalidate();
        requestLayout();
    }

    public void setSegmentSideRule(int sideRule) {
        this.XXI0XOIX = sideRule;
        invalidate();
        requestLayout();
    }

    public void setSegmentTextColor(int segmentTextColor) {
        this.XOO0XOOii = segmentTextColor;
        invalidate();
        requestLayout();
    }

    public void setSegmentTextSize(int segmentTextSize) {
        this.XOXiX0 = segmentTextSize;
        invalidate();
        requestLayout();
    }

    public void setSegments(List<iz3> segments) {
        this.XO0X10iO = segments;
        invalidate();
        requestLayout();
    }

    public void setShowDescriptionText(boolean showDescriptionText) {
        this.X00O0 = showDescriptionText;
        invalidate();
        requestLayout();
    }

    public void setShowSegmentText(boolean showSegmentText) {
        this.IXI = showSegmentText;
        invalidate();
        requestLayout();
    }

    public void setSideStyle(int sideStyle) {
        this.IiiXiI0I = sideStyle;
        invalidate();
        requestLayout();
    }

    public void setSideTextStyle(int sideTextStyle) {
        this.XOIX = sideTextStyle;
        invalidate();
        requestLayout();
    }

    public void setUnit(String unit) {
        this.Ii0X0X = unit;
        iOOX010X();
        invalidate();
        requestLayout();
    }

    public void setValue(Float value) {
        this.O001I = value;
        iOOX010X();
        invalidate();
        requestLayout();
    }

    public void setValueSegment(Integer valueSegment) {
        this.XXI0XOIX = 1;
        this.iXiiiO = valueSegment;
        invalidate();
        requestLayout();
    }

    public void setValueSegmentText(String valueSegmentText) {
        this.Ii1iii0 = valueSegmentText;
        iOOX010X();
        invalidate();
        requestLayout();
    }

    public void setValueSignColor(int valueSignColor) {
        this.iXiX011 = valueSignColor;
        invalidate();
        requestLayout();
    }

    public void setValueTextColor(int valueTextColor) {
        this.IO0iXO0O = valueTextColor;
        this.O0O0X0iOi.setColor(valueTextColor);
        invalidate();
        requestLayout();
    }

    public void setValueTextSize(int valueTextSize) {
        this.Oi = valueTextSize;
        this.O0O0X0iOi.setTextSize(valueTextSize);
        invalidate();
        requestLayout();
    }

    public SegmentedBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.IO = new int[]{-65536, -16776961};
        this.I1 = new int[]{-16776961, -256};
        this.XX1Oi = -1.0f;
        this.Ii0i = 0;
        this.IiiXiI0I = 1;
        this.XOIX = 0;
        this.XOO0XOOii = -1;
        this.IO0iXO0O = -1;
        this.iOI = -12303292;
        this.IX1XiI = -1;
        this.XXiO0i = 65536;
        this.Xi1i0XOX0 = -1;
        this.iIi0 = false;
        this.O101 = false;
        iIXi1iiXI(context, attrs);
    }
}
