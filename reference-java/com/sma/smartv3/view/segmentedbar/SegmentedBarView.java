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
import com.ironsource.C12616d4;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
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

    /* JADX INFO: renamed from: I0 */
    public Rect f55093I0;
    public int I0XXi0X;

    /* JADX INFO: renamed from: I1 */
    public int[] f55094I1;

    /* JADX INFO: renamed from: IO */
    public int[] f55095IO;
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

    /* JADX INFO: renamed from: O1 */
    public boolean f55096O1;
    public boolean O101;

    /* JADX INFO: renamed from: OO */
    public int f55097OO;
    public int OX110i;

    /* JADX INFO: renamed from: Oi */
    public int f55098Oi;
    public boolean X00O0;
    public int X00XIX1;
    public Paint X00Xi1X;
    public int X0i1O;
    public Paint X0iO;

    /* JADX INFO: renamed from: X1 */
    public Paint f55099X1;
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
        public OXO1 I0IIOi(int gapWidth) {
            SegmentedBarView.this.X00XIX1 = gapWidth;
            return this;
        }

        public OXO1 I0iXXO(boolean showDescriptionText) {
            SegmentedBarView.this.X00O0 = showDescriptionText;
            return this;
        }

        public OXO1 I1XOi1(String unit) {
            SegmentedBarView.this.Ii0X0X = unit;
            SegmentedBarView.this.iOOX010X();
            return this;
        }

        public OXO1 IIX1OXO(Float value) {
            SegmentedBarView.this.O001I = value;
            SegmentedBarView.this.iOOX010X();
            return this;
        }

        /* JADX INFO: renamed from: IO */
        public OXO1 m38949IO(int segmentTextSize) {
            SegmentedBarView.this.XOXiX0 = segmentTextSize;
            return this;
        }

        public OXO1 IiI10X(int descriptionTopTextColor) {
            SegmentedBarView.this.IX1XiI = descriptionTopTextColor;
            return this;
        }

        public OXO1 O00(int descriptionTextSize) {
            SegmentedBarView.this.O0O = descriptionTextSize;
            return this;
        }

        public OXO1 O10IXXX0X(int sideStyle) {
            SegmentedBarView.this.IiiXiI0I = sideStyle;
            return this;
        }

        public OXO1 OII(int valueTextSize) {
            SegmentedBarView.this.f55098Oi = valueTextSize;
            return this;
        }

        public OXO1 OIX0iXi(List<iz3> segments) {
            SegmentedBarView.this.XO0X10iO = segments;
            return this;
        }

        public OXO1 OIi0(int segmentTextColor) {
            SegmentedBarView.this.XOO0XOOii = segmentTextColor;
            return this;
        }

        public OXO1 OXO1(int barHeight) {
            SegmentedBarView.this.i11I = barHeight;
            return this;
        }

        public OXO1 OiIIX101O(int width, int height) {
            SegmentedBarView.this.iIXi1iiXI = width;
            SegmentedBarView.this.X0i1O = height;
            return this;
        }

        public OXO1 X0O(int sideTextStyle) {
            SegmentedBarView.this.XOIX = sideTextStyle;
            return this;
        }

        public OXO1 X1ii(int sideRule) {
            SegmentedBarView.this.XXI0XOIX = sideRule;
            return this;
        }

        public SegmentedBarView XIi00iiXO() {
            return SegmentedBarView.this;
        }

        public OXO1 XO0O10(int descriptionTextColor) {
            SegmentedBarView.this.iOI = descriptionTextColor;
            return this;
        }

        public OXO1 XOO0ii0(int emptySegmentColor) {
            SegmentedBarView.this.f55097OO = emptySegmentColor;
            return this;
        }

        public OXO1 XX0(int valueSignColor) {
            SegmentedBarView.this.iXiX011 = valueSignColor;
            return this;
        }

        public OXO1 XXI(boolean showText) {
            SegmentedBarView.this.IXI = showText;
            return this;
        }

        public OXO1 XiOIO(Integer valueSegment) {
            SegmentedBarView.this.iXiiiO = valueSegment;
            SegmentedBarView.this.iOOX010X();
            return this;
        }

        public OXO1 XiOIii1(int valueTextColor) {
            SegmentedBarView.this.IO0iXO0O = valueTextColor;
            return this;
        }

        public OXO1 iIiiO(String valueSegmentText) {
            SegmentedBarView.this.Ii1iii0 = valueSegmentText;
            SegmentedBarView.this.iOOX010X();
            return this;
        }

        /* JADX INFO: renamed from: iO */
        public OXO1 m38950iO(int descriptionBoxHeight) {
            SegmentedBarView.this.iii0 = descriptionBoxHeight;
            return this;
        }

        public OXO1() {
        }
    }

    public SegmentedBarView(Context context) {
        super(context);
        this.f55095IO = new int[]{-65536, -16776961};
        this.f55094I1 = new int[]{-16776961, -256};
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

    /* JADX INFO: renamed from: I1 */
    public static OXO1 m38943I1(Context context) {
        return new OXO1();
    }

    private int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getContentWidth() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - (getXLeft() * 2);
    }

    private int getXLeft() {
        int i = this.iIi1;
        if ((i == 1 || i == 2) && this.f55096O1 && this.iXiiiO == null) {
            return this.IOi1O0 / 2;
        }
        return 0;
    }

    private int getXtop() {
        int i = this.I0XXi0X;
        int i2 = this.i11I;
        int i3 = i - i2 > 0 ? (i - i2) / 2 : 0;
        int i4 = this.iIi1;
        if ((i4 == 1 || i4 == 2) && this.f55096O1) {
            return i3;
        }
        return 0;
    }

    public final void II1Xi0(Canvas canvas) {
        Canvas canvas2 = canvas;
        float contentWidth = getContentWidth();
        this.iiiO.set(getPaddingLeft() + getXLeft(), X11I() + getPaddingTop() + X01IiOiIi() + getXtop(), getPaddingLeft() + getXLeft() + getContentWidth(), this.i11I + X11I() + getPaddingTop() + X01IiOiIi() + getXtop());
        Rect rect = this.iiiO;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        int[] iArr = this.f55095IO;
        this.XXiIiX10.setShader(new LinearGradient(f, f2, f3, f4, iArr[0], iArr[1], Shader.TileMode.MIRROR));
        int iHeight = this.iiiO.height() / 2;
        this.Ii0i = iHeight;
        if (iHeight > contentWidth / 2.0f) {
            this.IiiXiI0I = 0;
        }
        this.f55093I0.set(this.iiiO);
        int i = this.IiiXiI0I;
        if (i == 0) {
            canvas2.drawRect(this.iiiO, this.XXiIiX10);
        } else if (i == 1) {
            RectF rectF = this.iX1O1;
            Rect rect2 = this.iiiO;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            RectF rectF2 = this.iX1O1;
            int i2 = this.Ii0i;
            canvas2.drawRoundRect(rectF2, i2, i2, this.XXiIiX10);
        } else if (i == 2) {
            this.iiiO.set(this.Ii0i + getPaddingLeft(), X11I() + X01IiOiIi() + getPaddingTop(), (getWidth() - getPaddingRight()) - this.Ii0i, this.i11I + X11I() + X01IiOiIi() + getPaddingTop());
            canvas2.drawRect(this.iiiO, this.XXiIiX10);
            Point point = this.X1OI;
            Rect rect3 = this.iiiO;
            int i3 = rect3.left;
            int i4 = this.Ii0i;
            point.set(i3 - i4, rect3.top + i4);
            Point point2 = this.Xii;
            Rect rect4 = this.iiiO;
            point2.set(rect4.left, rect4.top);
            Point point3 = this.iiII;
            Rect rect5 = this.iiiO;
            point3.set(rect5.left, rect5.bottom);
            X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
            Point point4 = this.X1OI;
            Rect rect6 = this.iiiO;
            int i5 = rect6.right;
            int i6 = this.Ii0i;
            point4.set(i5 + i6, rect6.top + i6);
            Point point5 = this.Xii;
            Rect rect7 = this.iiiO;
            point5.set(rect7.right, rect7.top);
            Point point6 = this.iiII;
            Rect rect8 = this.iiiO;
            point6.set(rect8.right, rect8.bottom);
            canvas2 = canvas;
            X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
        }
        if (this.IXI) {
            String str = this.IO0II0i;
            this.iiIOiX.setTextSize(this.XOXiX0);
            Paint paint = this.iiIOiX;
            Rect rect9 = this.f55093I0;
            m38947iI(canvas2, paint, str, rect9.left, rect9.top, rect9.right, rect9.bottom);
        }
    }

    public final void IXXOO(Canvas canvas) {
        List<iz3> list;
        if (this.XXI0XOIX != 0 || (list = this.XO0X10iO) == null || list.isEmpty()) {
            return;
        }
        float fO00 = this.XO0X10iO.get(0).O00();
        List<iz3> list2 = this.XO0X10iO;
        float fXO0O10 = list2.get(list2.size() - 1).XO0O10();
        Float f = this.O001I;
        if (f == null || f.floatValue() < fO00 || this.O001I.floatValue() > fXO0O10) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.XO0X10iO.size()) {
                i = 0;
                break;
            } else if (this.O001I.floatValue() >= this.XO0X10iO.get(i).O00() && this.O001I.floatValue() <= this.XO0X10iO.get(i).XO0O10()) {
                break;
            } else {
                i++;
            }
        }
        float fFloatValue = this.O001I.floatValue() - fO00;
        float f2 = fXO0O10 - fO00;
        float f3 = fFloatValue / f2;
        float contentWidth = (getContentWidth() * f2) / fXO0O10;
        float paddingLeft = (int) (getPaddingLeft() + getXLeft() + (f3 * contentWidth));
        int[] iArr = this.f55094I1;
        int iX0i1O = X0i1O(f3, iArr[0], iArr[1]);
        this.iiiO.set(getPaddingLeft() + getXLeft(), X11I() + getPaddingTop() + X01IiOiIi() + getXtop(), ((int) paddingLeft) + (this.IOi1O0 / 3) + (this.X00XIX1 * i), this.i11I + X11I() + getPaddingTop() + X01IiOiIi() + getXtop());
        Rect rect = this.iiiO;
        this.f55099X1.setShader(new LinearGradient(rect.left, rect.top, rect.right, rect.bottom, this.f55094I1[0], iX0i1O, Shader.TileMode.MIRROR));
        int iHeight = this.iiiO.height() / 2;
        this.Ii0i = iHeight;
        if (iHeight > contentWidth / 2.0f) {
            this.IiiXiI0I = 0;
        }
        this.f55093I0.set(this.iiiO);
        int i2 = this.IiiXiI0I;
        if (i2 == 0) {
            canvas.drawRect(this.iiiO, this.f55099X1);
            return;
        }
        if (i2 == 1) {
            RectF rectF = this.iX1O1;
            Rect rect2 = this.iiiO;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            RectF rectF2 = this.iX1O1;
            int i3 = this.Ii0i;
            canvas.drawRoundRect(rectF2, i3, i3, this.f55099X1);
            return;
        }
        if (i2 != 2) {
            return;
        }
        this.iiiO.set(this.Ii0i + getPaddingLeft(), X11I() + X01IiOiIi() + getPaddingTop(), (getWidth() - getPaddingRight()) - this.Ii0i, this.i11I + X11I() + X01IiOiIi() + getPaddingTop());
        canvas.drawRect(this.iiiO, this.f55099X1);
        Point point = this.X1OI;
        Rect rect3 = this.iiiO;
        int i4 = rect3.left;
        int i5 = this.Ii0i;
        point.set(i4 - i5, rect3.top + i5);
        Point point2 = this.Xii;
        Rect rect4 = this.iiiO;
        point2.set(rect4.left, rect4.top);
        Point point3 = this.iiII;
        Rect rect5 = this.iiiO;
        point3.set(rect5.left, rect5.bottom);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.f55099X1);
        Point point4 = this.X1OI;
        Rect rect6 = this.iiiO;
        int i6 = rect6.right;
        int i7 = this.Ii0i;
        point4.set(i6 + i7, rect6.top + i7);
        Point point5 = this.Xii;
        Rect rect7 = this.iiiO;
        point5.set(rect7.right, rect7.top);
        Point point6 = this.iiII;
        Rect rect8 = this.iiiO;
        point6.set(rect8.right, rect8.bottom);
        X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.f55099X1);
    }

    public void Ii1iii0(Float value, String unitHtml) {
        this.O001I = value;
        this.Ii0X0X = unitHtml;
        if (!iiiO()) {
            iOOX010X();
        }
        invalidate();
        requestLayout();
    }

    public void O001I(int startColor, int endColor) {
        int[] iArr = this.f55094I1;
        iArr[0] = startColor;
        iArr[1] = endColor;
        invalidate();
        requestLayout();
    }

    public final void O1O(Canvas canvas, Bitmap bitmap, int thumbW, int thumbH, float centerX, float centerY, Paint paint) {
        canvas.drawBitmap(bitmap, centerX - (thumbW / 2), centerY - (thumbH / 2), paint);
    }

    public final int X01IiOiIi() {
        if (iiiO()) {
            return 0;
        }
        return this.Xii11I;
    }

    public final int X0i1O(float fraction, int startColor, int endColor) {
        int iRed = Color.red(startColor);
        int iBlue = Color.blue(startColor);
        int iGreen = Color.green(startColor);
        int iAlpha = Color.alpha(startColor);
        int iRed2 = Color.red(endColor);
        int iBlue2 = Color.blue(endColor);
        return Color.argb((int) (iAlpha + (fraction * (Color.alpha(endColor) - iAlpha))), (int) (iRed + ((iRed2 - iRed) * fraction)), (int) (iGreen + ((Color.green(endColor) - iGreen) * fraction)), (int) (iBlue + ((iBlue2 - iBlue) * fraction)));
    }

    public final int X11I() {
        if (iiiO()) {
            return 0;
        }
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
        int measuredWidth = 0;
        boolean z = valueSignCenter == -1;
        int contentWidth = z ? (getContentWidth() / 2) + getPaddingLeft() : valueSignCenter;
        this.X11I.set(contentWidth - (this.iIXi1iiXI / 2), getPaddingTop(), (this.iIXi1iiXI / 2) + contentWidth, (this.X0i1O - this.XOX0O0) + getPaddingTop());
        this.XXX11i.setColor(this.iXiX011);
        if (this.X11I.left < getPaddingLeft()) {
            int paddingLeft = (-this.X11I.left) + getPaddingLeft();
            RectF rectF = this.iX1O1;
            Rect rect = this.X11I;
            rectF.set(rect.left + paddingLeft, rect.top, rect.right + paddingLeft, rect.bottom);
        } else if (this.X11I.right > getMeasuredWidth() - getPaddingRight()) {
            int measuredWidth2 = (this.X11I.right - getMeasuredWidth()) + getPaddingRight();
            RectF rectF2 = this.iX1O1;
            Rect rect2 = this.X11I;
            rectF2.set(rect2.left - measuredWidth2, rect2.top, rect2.right - measuredWidth2, rect2.bottom);
        } else {
            RectF rectF3 = this.iX1O1;
            Rect rect3 = this.X11I;
            rectF3.set(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        RectF rectF4 = this.iX1O1;
        int i = this.X100O;
        canvas.drawRoundRect(rectF4, i, i, this.XXX11i);
        if (this.iOX) {
            RectF rectF5 = this.iX1O1;
            int i2 = this.X100O;
            canvas.drawRoundRect(rectF5, i2, i2, this.X1IX);
        }
        if (!z) {
            if (contentWidth - (this.iOiXi11II / 2) < this.Ii0i + getPaddingLeft()) {
                measuredWidth = getPaddingLeft() + (this.Ii0i - contentWidth);
            } else if ((this.iOiXi11II / 2) + contentWidth > (getMeasuredWidth() - this.Ii0i) - getPaddingRight()) {
                measuredWidth = ((getMeasuredWidth() - this.Ii0i) - contentWidth) - getPaddingRight();
            }
            this.X1OI.set((contentWidth - (this.iOiXi11II / 2)) + measuredWidth, (valueSignSpaceHeight - this.XOX0O0) + getPaddingTop());
            this.Xii.set((this.iOiXi11II / 2) + contentWidth + measuredWidth, (valueSignSpaceHeight - this.XOX0O0) + getPaddingTop());
            this.iiII.set(contentWidth + measuredWidth, getPaddingTop() + valueSignSpaceHeight);
            X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.XXX11i);
            if (this.iOX) {
                XXX11i(canvas, this.X1OI, this.Xii, this.iiII, this.X1IX);
            }
        }
        if (this.XX00i10X != null) {
            RectF rectF6 = this.iX1O1;
            canvas.translate(rectF6.left, (rectF6.top + (rectF6.height() / 2.0f)) - (this.XX00i10X.getHeight() / 2));
            this.XX00i10X.draw(canvas);
        }
    }

    public final void XXIIO1i11(Canvas canvas, Paint paint, String text, Rect outsideRect) {
        m38947iI(canvas, paint, text, outsideRect.left, outsideRect.top, outsideRect.right, outsideRect.bottom);
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
        float f = this.IXiOXO / 6;
        this.iIX0i.moveTo(point1.x - f, point1.y - f);
        this.iIX0i.lineTo(point3.x, point3.y);
        this.iIX0i.lineTo(point2.x + f, point2.y - f);
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
        int iMax = Math.max(thumbH, thumbW) / 2;
        paint.setMaskFilter(new BlurMaskFilter(5.0f, BlurMaskFilter.Blur.SOLID));
        canvas.drawCircle(centerX, centerY, iMax, paint);
        paint.setMaskFilter(null);
    }

    /* JADX INFO: renamed from: iI */
    public final void m38947iI(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom) {
        paint.setTextAlign(Paint.Align.CENTER);
        float fDescent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        canvas.drawText(text, (left + right) / 2.0f, ((top + bottom) / 2.0f) + fDescent, paint);
    }

    public final void iIXi1iiXI(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, C15429R.styleable.SegmentedBarView, 0, 0);
        try {
            Resources resources = getResources();
            this.i100IXOX = typedArrayObtainStyledAttributes.getResourceId(31, -1);
            this.iIi1 = typedArrayObtainStyledAttributes.getInt(32, 0);
            this.IX0IXOi = typedArrayObtainStyledAttributes.getInt(3, 0);
            this.iXi = typedArrayObtainStyledAttributes.getInt(4, 0);
            this.XOXiX0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(24, resources.getDimensionPixelSize(R.dimen.sbv_segment_text_size));
            this.f55098Oi = typedArrayObtainStyledAttributes.getDimensionPixelSize(42, resources.getDimensionPixelSize(R.dimen.sbv_value_text_size));
            this.O0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.sbv_description_text_size));
            this.Xi1i0XOX0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
            this.i11I = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.sbv_bar_height));
            this.X0i1O = typedArrayObtainStyledAttributes.getDimensionPixelSize(39, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_height));
            this.iIXi1iiXI = typedArrayObtainStyledAttributes.getDimensionPixelSize(41, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_width));
            this.XOX0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.sbv_arrow_height));
            this.iOiXi11II = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, resources.getDimensionPixelSize(R.dimen.sbv_arrow_width));
            this.X00XIX1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(R.dimen.sbv_segment_gap_width));
            this.Ii0i = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
            this.i0X000X0O = typedArrayObtainStyledAttributes.getColor(17, -1);
            this.X100O = typedArrayObtainStyledAttributes.getDimensionPixelSize(40, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_round));
            this.iii0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.sbv_description_box_height));
            this.Xii11I = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, resources.getDimensionPixelSize(R.dimen.sbv_description_box_height));
            this.IXiOXO = typedArrayObtainStyledAttributes.getDimensionPixelSize(38, resources.getDimensionPixelSize(R.dimen.sbv_value_sign_border_size));
            this.I0XXi0X = typedArrayObtainStyledAttributes.getDimensionPixelSize(33, (int) (this.i11I * 1.3f));
            this.IOi1O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(34, (int) (this.i11I * 1.3f));
            this.IXI = typedArrayObtainStyledAttributes.getBoolean(27, true);
            this.X00O0 = typedArrayObtainStyledAttributes.getBoolean(25, false);
            this.X111IO = typedArrayObtainStyledAttributes.getBoolean(26, false);
            String string = typedArrayObtainStyledAttributes.getString(35);
            this.Ii1iii0 = string;
            if (string == null) {
                this.Ii1iii0 = resources.getString(R.string.sbv_value_segment);
            }
            String string2 = typedArrayObtainStyledAttributes.getString(13);
            this.IO0II0i = string2;
            if (string2 == null) {
                this.IO0II0i = resources.getString(R.string.sbv_empty);
            }
            this.iIi0 = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.O101 = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.iOX = typedArrayObtainStyledAttributes.getBoolean(28, false);
            this.XIIO11I = typedArrayObtainStyledAttributes.getColor(37, context.getResources().getColor(R.color.sbv_value_sign_boder_color));
            int color = typedArrayObtainStyledAttributes.getColor(9, this.iOI);
            this.iOI = color;
            this.IX1XiI = typedArrayObtainStyledAttributes.getColor(11, color);
            this.XXiO0i = typedArrayObtainStyledAttributes.getColor(7, 65536);
            int color2 = typedArrayObtainStyledAttributes.getColor(16, context.getResources().getColor(R.color.sbv_segment_bg_startcolor));
            int color3 = typedArrayObtainStyledAttributes.getColor(15, context.getResources().getColor(R.color.sbv_segment_bg_endcolor));
            int[] iArr = this.f55095IO;
            iArr[0] = color2;
            iArr[1] = color3;
            int color4 = typedArrayObtainStyledAttributes.getColor(21, context.getResources().getColor(R.color.sbv_segment_progress_startcolor));
            int color5 = typedArrayObtainStyledAttributes.getColor(20, context.getResources().getColor(R.color.sbv_segment_progress_endcolor));
            int[] iArr2 = this.f55094I1;
            iArr2[0] = color4;
            iArr2[1] = color5;
            this.iXiX011 = typedArrayObtainStyledAttributes.getColor(36, context.getResources().getColor(R.color.sbv_value_sign_background));
            this.f55097OO = typedArrayObtainStyledAttributes.getColor(12, context.getResources().getColor(R.color.sbv_empty_segment_background));
            this.IiiXiI0I = typedArrayObtainStyledAttributes.getInt(29, 1);
            this.XOIX = typedArrayObtainStyledAttributes.getInt(30, 0);
            this.XXI0XOIX = typedArrayObtainStyledAttributes.getInt(23, 1);
            typedArrayObtainStyledAttributes.recycle();
            if (this.i100IXOX != -1 || this.iIi1 == 2) {
                this.f55096O1 = true;
            }
            if (this.f55096O1) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.i100IXOX);
                this.XXOXi = bitmapDecodeResource;
                int i = this.iIi1;
                if (i == 1) {
                    this.I0XXi0X = bitmapDecodeResource.getWidth();
                    this.IOi1O0 = this.XXOXi.getHeight();
                } else if (i == 3) {
                    this.XXOXi = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), this.i100IXOX), this.IOi1O0, this.I0XXi0X, true);
                }
            }
            this.IXOIIIO = new DecimalFormat("##.####");
            TextPaint textPaint = new TextPaint(1);
            this.iiIOiX = textPaint;
            textPaint.setColor(-1);
            Paint paint = this.iiIOiX;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            TextPaint textPaint2 = new TextPaint(1);
            this.O0O0X0iOi = textPaint2;
            textPaint2.setColor(-1);
            this.O0O0X0iOi.setStyle(style);
            this.O0O0X0iOi.setTextSize(this.f55098Oi);
            this.O0O0X0iOi.setColor(this.IO0iXO0O);
            TextPaint textPaint3 = new TextPaint(1);
            this.X0iO = textPaint3;
            textPaint3.setColor(-12303292);
            this.X0iO.setStyle(style);
            Paint paint2 = new Paint(1);
            this.X11iII1O1 = paint2;
            paint2.setStyle(style);
            this.X11iII1O1.setAntiAlias(true);
            Paint paint3 = new Paint(1);
            this.XXX11i = paint3;
            paint3.setStyle(style);
            this.XXX11i.setAntiAlias(true);
            Paint paint4 = new Paint(1);
            this.X1IX = paint4;
            paint4.setStyle(Paint.Style.STROKE);
            this.X1IX.setStrokeWidth(this.IXiOXO);
            this.X1IX.setColor(this.XIIO11I);
            this.X1IX.setAntiAlias(true);
            Paint paint5 = new Paint(1);
            this.XXiIiX10 = paint5;
            paint5.setStyle(style);
            this.XXiIiX10.setAntiAlias(true);
            Paint paint6 = new Paint(1);
            this.f55099X1 = paint6;
            paint6.setStyle(style);
            this.f55099X1.setAntiAlias(true);
            Paint paint7 = new Paint(1);
            this.X00Xi1X = paint7;
            paint7.setStyle(style);
            this.iiiO = new Rect();
            this.iX1O1 = new RectF();
            this.X11I = new Rect();
            this.f55093I0 = new Rect();
            Path path = new Path();
            this.iI0I = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            this.iIX0i = new Path();
            this.X1OI = new Point();
            this.Xii = new Point();
            this.iiII = new Point();
            int i2 = this.iIi1;
            if (i2 == 1 || i2 == 2) {
                this.XOX0O0 = 0;
                this.X0i1O = 0;
            }
            if (this.X111IO) {
                return;
            }
            this.Xii11I = 0;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0590  */
    /* JADX WARN: Code duplicated, block: B:107:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x05ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:113:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:122:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x060c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0615 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0618  */
    /* JADX WARN: Code duplicated, block: B:136:0x063b  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x020c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0247  */
    /* JADX WARN: Code duplicated, block: B:59:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x024d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0253  */
    /* JADX WARN: Code duplicated, block: B:64:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0308  */
    /* JADX WARN: Code duplicated, block: B:66:0x0386  */
    /* JADX WARN: Code duplicated, block: B:67:0x0404  */
    /* JADX WARN: Code duplicated, block: B:69:0x0424 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0426  */
    /* JADX WARN: Code duplicated, block: B:71:0x0473  */
    /* JADX WARN: Code duplicated, block: B:72:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x051d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0533  */
    /* JADX WARN: Code duplicated, block: B:94:0x0584  */
    public final void iOO1ii1(Canvas canvas, iz3 segment, int segmentIndex, int segmentsSize, float valueMax) {
        float contentWidth;
        float contentWidth2;
        float contentWidth3;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String strXIi00iiXO;
        Canvas canvas2 = canvas;
        boolean z2 = segmentIndex == 0;
        boolean z3 = segmentIndex == segmentsSize + (-1);
        boolean z4 = z2 && z3;
        if (this.XXI0XOIX == 0) {
            contentWidth2 = (getContentWidth() * (segment.XO0O10() - segment.O00())) / valueMax;
            contentWidth3 = (getContentWidth() / valueMax) * segment.O00();
            if (!z2) {
                contentWidth3 += this.X00XIX1;
            }
            contentWidth = (getContentWidth() / valueMax) * segment.XO0O10();
            if (!z2 && this.iIi0) {
                RectF rectF = new RectF();
                this.X00Xi1X.setColor(this.i0X000X0O);
                int i8 = (int) contentWidth3;
                rectF.set(getPaddingLeft() + i8 + getXLeft(), X11I() + getPaddingTop() + X01IiOiIi() + getXtop(), i8 + getPaddingLeft() + getXLeft() + this.X00XIX1, this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                canvas2.drawRect(rectF, this.X00Xi1X);
            }
        } else {
            int contentWidth4 = getContentWidth();
            int i9 = this.X00XIX1;
            float f = ((contentWidth4 + i9) / segmentsSize) - i9;
            float f2 = (i9 + f) * segmentIndex;
            contentWidth = f2 + f;
            if (!z2 && this.iIi0) {
                RectF rectF2 = new RectF();
                this.X00Xi1X.setColor(this.i0X000X0O);
                int i10 = (int) f2;
                rectF2.set(getPaddingLeft() + i10 + getXLeft(), X11I() + getPaddingTop() + X01IiOiIi() + getXtop(), i10 + getPaddingLeft() + getXLeft() + this.X00XIX1, this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                canvas2.drawRect(rectF2, this.X00Xi1X);
            }
            contentWidth2 = f;
            contentWidth3 = f2;
        }
        int i11 = (int) contentWidth3;
        int i12 = (int) contentWidth;
        this.iiiO.set(getPaddingLeft() + i11 + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), getPaddingRight() + i12 + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
        Integer num = this.iXiiiO;
        if (num == null || num.intValue() != segmentIndex) {
            Float f3 = this.O001I;
            if (f3 == null || ((f3.floatValue() < segment.O00() || this.O001I.floatValue() >= segment.XO0O10()) && !(z3 && segment.XO0O10() == this.O001I.floatValue()))) {
                z = false;
            } else {
                this.XX1Oi = (int) (contentWidth3 + getPaddingLeft() + getXLeft() + (((this.O001I.floatValue() - segment.O00()) / (segment.XO0O10() - segment.O00())) * contentWidth2));
                this.OX110i = segment.OXO1();
            }
            this.X11iII1O1.setColor(segment.OXO1());
            this.f55093I0.set(this.iiiO);
            if (this.Ii0i == 0) {
                this.Ii0i = this.iiiO.height() / 2;
            }
            if (!z2 || z3) {
                i = this.IiiXiI0I;
                if (i == 0) {
                    RectF rectF3 = this.iX1O1;
                    Rect rect = this.iiiO;
                    rectF3.set(rect.left, rect.top, rect.right, rect.bottom);
                    RectF rectF4 = this.iX1O1;
                    int i13 = this.Ii0i;
                    canvas2.drawRoundRect(rectF4, i13, i13, this.X11iII1O1);
                } else if (i == 1) {
                    RectF rectF5 = this.iX1O1;
                    Rect rect2 = this.iiiO;
                    rectF5.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    RectF rectF6 = this.iX1O1;
                    int i14 = this.Ii0i;
                    canvas2.drawRoundRect(rectF6, i14, i14, this.X11iII1O1);
                    if (!z4) {
                        if (z2) {
                            this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), i12 + getPaddingRight() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.iiiO, this.X11iII1O1);
                        } else {
                            this.iiiO.set(i11 + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingRight() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                            canvas2.drawRect(this.iiiO, this.X11iII1O1);
                        }
                    }
                } else if (i == 2) {
                    if (z4) {
                        this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingLeft() + getXLeft(), this.i11I + X11I() + getPaddingTop() + X01IiOiIi() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                        Point point = this.X1OI;
                        Rect rect3 = this.iiiO;
                        int i15 = rect3.left;
                        int i16 = this.Ii0i;
                        point.set(i15 - i16, rect3.top + i16);
                        Point point2 = this.Xii;
                        Rect rect4 = this.iiiO;
                        point2.set(rect4.left, rect4.top);
                        Point point3 = this.iiII;
                        Rect rect5 = this.iiiO;
                        point3.set(rect5.left, rect5.bottom);
                        X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                        Point point4 = this.X1OI;
                        Rect rect6 = this.iiiO;
                        int i17 = rect6.right;
                        int i18 = this.Ii0i;
                        point4.set(i17 + i18, rect6.top + i18);
                        Point point5 = this.Xii;
                        Rect rect7 = this.iiiO;
                        point5.set(rect7.right, rect7.top);
                        Point point6 = this.iiII;
                        Rect rect8 = this.iiiO;
                        point6.set(rect8.right, rect8.bottom);
                        canvas2 = canvas;
                        X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                    } else if (z2) {
                        this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), i12 + getPaddingLeft() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                        Point point7 = this.X1OI;
                        Rect rect9 = this.iiiO;
                        int i19 = rect9.left;
                        int i20 = this.Ii0i;
                        point7.set(i19 - i20, rect9.top + i20);
                        Point point8 = this.Xii;
                        Rect rect10 = this.iiiO;
                        point8.set(rect10.left, rect10.top);
                        Point point9 = this.iiII;
                        Rect rect11 = this.iiiO;
                        point9.set(rect11.left, rect11.bottom);
                        X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                    } else {
                        this.iiiO.set(i11 + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingLeft() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                        Point point10 = this.X1OI;
                        Rect rect12 = this.iiiO;
                        int i21 = rect12.right;
                        int i22 = this.Ii0i;
                        point10.set(i21 + i22, rect12.top + i22);
                        Point point11 = this.Xii;
                        Rect rect13 = this.iiiO;
                        point11.set(rect13.right, rect13.top);
                        Point point12 = this.iiII;
                        Rect rect14 = this.iiiO;
                        point12.set(rect14.right, rect14.bottom);
                        X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                    }
                }
            } else if (this.IiiXiI0I == 0) {
                RectF rectF7 = this.iX1O1;
                Rect rect15 = this.iiiO;
                rectF7.set(rect15.left, rect15.top, rect15.right, rect15.bottom);
                RectF rectF8 = this.iX1O1;
                int i23 = this.Ii0i;
                canvas2.drawRoundRect(rectF8, i23, i23, this.X11iII1O1);
            } else {
                canvas2.drawRect(this.iiiO, this.X11iII1O1);
            }
            if (this.IXI) {
                if (segment.XIi00iiXO() != null) {
                    strXIi00iiXO = segment.XIi00iiXO();
                } else if ((z2 && !z3) || z4 || this.XOIX == 1) {
                    strXIi00iiXO = String.format("%s - %s", this.IXOIIIO.format(segment.O00()), this.IXOIIIO.format(segment.XO0O10()));
                } else if (z2) {
                    strXIi00iiXO = String.format("<%s", this.IXOIIIO.format(segment.XO0O10()));
                } else {
                    strXIi00iiXO = String.format(">%s", this.IXOIIIO.format(segment.O00()));
                }
                this.iiIOiX.setTextSize(this.XOXiX0);
                this.iiIOiX.setColor(this.XOO0XOOii);
                XXIIO1i11(canvas2, this.iiIOiX, strXIi00iiXO, this.f55093I0);
            }
            if (this.X00O0) {
                Paint paint = this.X0iO;
                if (z || this.IX0IXOi != 0 || (i5 = this.Xi1i0XOX0) == -1) {
                    i5 = this.O0O;
                }
                paint.setTextSize(i5);
                Paint paint2 = this.X0iO;
                if (z || this.IX0IXOi != 0 || (i6 = this.XXiO0i) == 65536) {
                    i6 = this.iOI;
                }
                paint2.setColor(i6);
                i7 = this.IX0IXOi;
                if (i7 != 0) {
                    Paint paint3 = this.X0iO;
                    String strM2317iO = segment.m2317iO();
                    Rect rect16 = this.f55093I0;
                    float f4 = rect16.left;
                    int i24 = rect16.bottom;
                    m38947iI(canvas, paint3, strM2317iO, f4, i24, rect16.right, i24 + this.iii0);
                } else if (i7 == 1) {
                    Paint paint4 = this.X0iO;
                    String strM2317iO2 = segment.m2317iO();
                    Rect rect17 = this.f55093I0;
                    float f5 = rect17.left;
                    int i25 = rect17.bottom;
                    iX1O1(canvas2, paint4, strM2317iO2, f5, i25, rect17.right, i25 + this.iii0, z2, z3, segmentIndex);
                }
            }
            if (this.X111IO) {
                Paint paint5 = this.X0iO;
                if (z || this.iXi != 0 || (i2 = this.Xi1i0XOX0) == -1) {
                    i2 = this.O0O;
                }
                paint5.setTextSize(i2);
                Paint paint6 = this.X0iO;
                if (z || this.iXi != 0 || (i3 = this.XXiO0i) == 65536) {
                    i3 = this.IX1XiI;
                }
                paint6.setColor(i3);
                i4 = this.iXi;
                if (i4 != 0) {
                    Paint paint7 = this.X0iO;
                    String strXOO0ii0 = segment.XOO0ii0();
                    Rect rect18 = this.f55093I0;
                    float f6 = rect18.left;
                    float fX01IiOiIi = rect18.top - X01IiOiIi();
                    Rect rect19 = this.f55093I0;
                    m38947iI(canvas, paint7, strXOO0ii0, f6, fX01IiOiIi, rect19.right, rect19.top);
                    return;
                }
                if (i4 != 1) {
                    return;
                }
                Paint paint8 = this.X0iO;
                String strXOO0ii1 = segment.XOO0ii0();
                Rect rect20 = this.f55093I0;
                float f7 = rect20.left;
                float fX01IiOiIi2 = rect20.top - X01IiOiIi();
                Rect rect21 = this.f55093I0;
                iX1O1(canvas, paint8, strXOO0ii1, f7, fX01IiOiIi2, rect21.right, rect21.top, z2, z3, segmentIndex);
            }
        }
        this.XX1Oi = contentWidth3 + getPaddingLeft() + (contentWidth2 / 2.0f) + getXLeft();
        this.OX110i = segment.OXO1();
        z = true;
        this.X11iII1O1.setColor(segment.OXO1());
        this.f55093I0.set(this.iiiO);
        if (this.Ii0i == 0) {
            this.Ii0i = this.iiiO.height() / 2;
        }
        if (z2) {
            i = this.IiiXiI0I;
            if (i == 0) {
                RectF rectF9 = this.iX1O1;
                Rect rect22 = this.iiiO;
                rectF9.set(rect22.left, rect22.top, rect22.right, rect22.bottom);
                RectF rectF10 = this.iX1O1;
                int i110 = this.Ii0i;
                canvas2.drawRoundRect(rectF10, i110, i110, this.X11iII1O1);
            } else if (i == 1) {
                RectF rectF11 = this.iX1O1;
                Rect rect23 = this.iiiO;
                rectF11.set(rect23.left, rect23.top, rect23.right, rect23.bottom);
                RectF rectF12 = this.iX1O1;
                int i111 = this.Ii0i;
                canvas2.drawRoundRect(rectF12, i111, i111, this.X11iII1O1);
                if (!z4) {
                    if (z2) {
                        this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), i12 + getPaddingRight() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    } else {
                        this.iiiO.set(i11 + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingRight() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    }
                }
            } else if (i == 2) {
                if (z4) {
                    this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingLeft() + getXLeft(), this.i11I + X11I() + getPaddingTop() + X01IiOiIi() + getXtop());
                    canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    Point point13 = this.X1OI;
                    Rect rect24 = this.iiiO;
                    int i112 = rect24.left;
                    int i113 = this.Ii0i;
                    point13.set(i112 - i113, rect24.top + i113);
                    Point point14 = this.Xii;
                    Rect rect25 = this.iiiO;
                    point14.set(rect25.left, rect25.top);
                    Point point15 = this.iiII;
                    Rect rect26 = this.iiiO;
                    point15.set(rect26.left, rect26.bottom);
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                    Point point16 = this.X1OI;
                    Rect rect27 = this.iiiO;
                    int i114 = rect27.right;
                    int i115 = this.Ii0i;
                    point16.set(i114 + i115, rect27.top + i115);
                    Point point17 = this.Xii;
                    Rect rect28 = this.iiiO;
                    point17.set(rect28.right, rect28.top);
                    Point point18 = this.iiII;
                    Rect rect29 = this.iiiO;
                    point18.set(rect29.right, rect29.bottom);
                    canvas2 = canvas;
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                } else if (z2) {
                    this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), i12 + getPaddingLeft() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    Point point19 = this.X1OI;
                    Rect rect30 = this.iiiO;
                    int i116 = rect30.left;
                    int i26 = this.Ii0i;
                    point19.set(i116 - i26, rect30.top + i26);
                    Point point20 = this.Xii;
                    Rect rect110 = this.iiiO;
                    point20.set(rect110.left, rect110.top);
                    Point point21 = this.iiII;
                    Rect rect111 = this.iiiO;
                    point21.set(rect111.left, rect111.bottom);
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                } else {
                    this.iiiO.set(i11 + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingLeft() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    Point point110 = this.X1OI;
                    Rect rect112 = this.iiiO;
                    int i27 = rect112.right;
                    int i28 = this.Ii0i;
                    point110.set(i27 + i28, rect112.top + i28);
                    Point point111 = this.Xii;
                    Rect rect113 = this.iiiO;
                    point111.set(rect113.right, rect113.top);
                    Point point112 = this.iiII;
                    Rect rect114 = this.iiiO;
                    point112.set(rect114.right, rect114.bottom);
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                }
            }
        } else {
            i = this.IiiXiI0I;
            if (i == 0) {
                RectF rectF13 = this.iX1O1;
                Rect rect210 = this.iiiO;
                rectF13.set(rect210.left, rect210.top, rect210.right, rect210.bottom);
                RectF rectF14 = this.iX1O1;
                int i117 = this.Ii0i;
                canvas2.drawRoundRect(rectF14, i117, i117, this.X11iII1O1);
            } else if (i == 1) {
                RectF rectF15 = this.iX1O1;
                Rect rect211 = this.iiiO;
                rectF15.set(rect211.left, rect211.top, rect211.right, rect211.bottom);
                RectF rectF16 = this.iX1O1;
                int i118 = this.Ii0i;
                canvas2.drawRoundRect(rectF16, i118, i118, this.X11iII1O1);
                if (!z4) {
                    if (z2) {
                        this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), i12 + getPaddingRight() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    } else {
                        this.iiiO.set(i11 + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingRight() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                        canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    }
                }
            } else if (i == 2) {
                if (z4) {
                    this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingLeft() + getXLeft(), this.i11I + X11I() + getPaddingTop() + X01IiOiIi() + getXtop());
                    canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    Point point113 = this.X1OI;
                    Rect rect212 = this.iiiO;
                    int i119 = rect212.left;
                    int i1110 = this.Ii0i;
                    point113.set(i119 - i1110, rect212.top + i1110);
                    Point point114 = this.Xii;
                    Rect rect213 = this.iiiO;
                    point114.set(rect213.left, rect213.top);
                    Point point115 = this.iiII;
                    Rect rect214 = this.iiiO;
                    point115.set(rect214.left, rect214.bottom);
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                    Point point116 = this.X1OI;
                    Rect rect215 = this.iiiO;
                    int i1111 = rect215.right;
                    int i1112 = this.Ii0i;
                    point116.set(i1111 + i1112, rect215.top + i1112);
                    Point point117 = this.Xii;
                    Rect rect216 = this.iiiO;
                    point117.set(rect216.right, rect216.top);
                    Point point118 = this.iiII;
                    Rect rect217 = this.iiiO;
                    point118.set(rect217.right, rect217.bottom);
                    canvas2 = canvas;
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                } else if (z2) {
                    this.iiiO.set(i11 + this.Ii0i + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), i12 + getPaddingLeft() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    Point point119 = this.X1OI;
                    Rect rect31 = this.iiiO;
                    int i1113 = rect31.left;
                    int i29 = this.Ii0i;
                    point119.set(i1113 - i29, rect31.top + i29);
                    Point point22 = this.Xii;
                    Rect rect115 = this.iiiO;
                    point22.set(rect115.left, rect115.top);
                    Point point23 = this.iiII;
                    Rect rect116 = this.iiiO;
                    point23.set(rect116.left, rect116.bottom);
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                } else {
                    this.iiiO.set(i11 + getPaddingLeft() + getXLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (i12 - this.Ii0i) + getPaddingLeft() + getXLeft(), this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
                    canvas2.drawRect(this.iiiO, this.X11iII1O1);
                    Point point1110 = this.X1OI;
                    Rect rect117 = this.iiiO;
                    int i210 = rect117.right;
                    int i211 = this.Ii0i;
                    point1110.set(i210 + i211, rect117.top + i211);
                    Point point1111 = this.Xii;
                    Rect rect118 = this.iiiO;
                    point1111.set(rect118.right, rect118.top);
                    Point point1112 = this.iiII;
                    Rect rect119 = this.iiiO;
                    point1112.set(rect119.right, rect119.bottom);
                    X11iII1O1(canvas2, this.X1OI, this.Xii, this.iiII, this.X11iII1O1);
                }
            }
        }
        if (this.IXI) {
            if (segment.XIi00iiXO() != null) {
                strXIi00iiXO = segment.XIi00iiXO();
            } else if (z2) {
                if (z2) {
                    strXIi00iiXO = String.format("<%s", this.IXOIIIO.format(segment.XO0O10()));
                } else {
                    strXIi00iiXO = String.format(">%s", this.IXOIIIO.format(segment.O00()));
                }
            } else if (z2) {
                strXIi00iiXO = String.format("<%s", this.IXOIIIO.format(segment.XO0O10()));
            } else {
                strXIi00iiXO = String.format(">%s", this.IXOIIIO.format(segment.O00()));
            }
            this.iiIOiX.setTextSize(this.XOXiX0);
            this.iiIOiX.setColor(this.XOO0XOOii);
            XXIIO1i11(canvas2, this.iiIOiX, strXIi00iiXO, this.f55093I0);
        }
        if (this.X00O0) {
            Paint paint9 = this.X0iO;
            if (z) {
                i5 = this.O0O;
            } else {
                i5 = this.O0O;
            }
            paint9.setTextSize(i5);
            Paint paint10 = this.X0iO;
            if (z) {
                i6 = this.iOI;
            } else {
                i6 = this.iOI;
            }
            paint10.setColor(i6);
            i7 = this.IX0IXOi;
            if (i7 != 0) {
                Paint paint11 = this.X0iO;
                String strM2317iO3 = segment.m2317iO();
                Rect rect120 = this.f55093I0;
                float f8 = rect120.left;
                int i212 = rect120.bottom;
                m38947iI(canvas, paint11, strM2317iO3, f8, i212, rect120.right, i212 + this.iii0);
            } else if (i7 == 1) {
                Paint paint12 = this.X0iO;
                String strM2317iO4 = segment.m2317iO();
                Rect rect121 = this.f55093I0;
                float f9 = rect121.left;
                int i213 = rect121.bottom;
                iX1O1(canvas2, paint12, strM2317iO4, f9, i213, rect121.right, i213 + this.iii0, z2, z3, segmentIndex);
            }
        }
        if (this.X111IO) {
            Paint paint13 = this.X0iO;
            if (z) {
                i2 = this.O0O;
            } else {
                i2 = this.O0O;
            }
            paint13.setTextSize(i2);
            Paint paint14 = this.X0iO;
            if (z) {
                i3 = this.IX1XiI;
            } else {
                i3 = this.IX1XiI;
            }
            paint14.setColor(i3);
            i4 = this.iXi;
            if (i4 != 0) {
                Paint paint15 = this.X0iO;
                String strXOO0ii2 = segment.XOO0ii0();
                Rect rect122 = this.f55093I0;
                float f10 = rect122.left;
                float fX01IiOiIi3 = rect122.top - X01IiOiIi();
                Rect rect123 = this.f55093I0;
                m38947iI(canvas, paint15, strXOO0ii2, f10, fX01IiOiIi3, rect123.right, rect123.top);
                return;
            }
            if (i4 != 1) {
                return;
            }
            Paint paint16 = this.X0iO;
            String strXOO0ii3 = segment.XOO0ii0();
            Rect rect218 = this.f55093I0;
            float f11 = rect218.left;
            float fX01IiOiIi4 = rect218.top - X01IiOiIi();
            Rect rect219 = this.f55093I0;
            iX1O1(canvas, paint16, strXOO0ii3, f11, fX01IiOiIi4, rect219.right, rect219.top, z2, z3, segmentIndex);
        }
    }

    public final void iOOX010X() {
        String str;
        if (iiiO()) {
            this.XX00i10X = null;
            return;
        }
        Float f = this.O001I;
        String str2 = f != null ? this.IXOIIIO.format(f) : this.Ii1iii0;
        if (this.O001I != null && (str = this.Ii0X0X) != null && !str.isEmpty()) {
            str2 = str2 + String.format(" <small>%s</small>", this.Ii0X0X);
        }
        if (!TextUtils.isEmpty(this.XXO)) {
            str2 = this.XXO;
        }
        this.XX00i10X = new StaticLayout(Html.fromHtml(str2), this.O0O0X0iOi, this.iIXi1iiXI, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: iX */
    public final void m38948iX(Canvas canvas) {
        float contentWidth = getContentWidth();
        this.iiiO.set(getPaddingLeft(), X11I() + getPaddingTop() + X01IiOiIi() + getXtop(), ((int) contentWidth) + getPaddingLeft(), this.i11I + X11I() + getPaddingTop() + X01IiOiIi() + getXtop());
        this.XXiIiX10.setColor(this.f55097OO);
        int iHeight = this.iiiO.height() / 2;
        this.Ii0i = iHeight;
        if (iHeight > contentWidth / 2.0f) {
            this.IiiXiI0I = 0;
        }
        this.f55093I0.set(this.iiiO);
        int i = this.IiiXiI0I;
        if (i == 0) {
            canvas.drawRect(this.iiiO, this.XXiIiX10);
        } else if (i == 1) {
            RectF rectF = this.iX1O1;
            Rect rect = this.iiiO;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            RectF rectF2 = this.iX1O1;
            int i2 = this.Ii0i;
            canvas.drawRoundRect(rectF2, i2, i2, this.XXiIiX10);
        } else if (i == 2) {
            this.iiiO.set(this.Ii0i + getPaddingLeft(), X11I() + X01IiOiIi() + getPaddingTop() + getXtop(), (getWidth() - getPaddingRight()) - this.Ii0i, this.i11I + X11I() + X01IiOiIi() + getPaddingTop() + getXtop());
            canvas.drawRect(this.iiiO, this.XXiIiX10);
            Point point = this.X1OI;
            Rect rect2 = this.iiiO;
            int i3 = rect2.left;
            int i4 = this.Ii0i;
            point.set(i3 - i4, rect2.top + i4);
            Point point2 = this.Xii;
            Rect rect3 = this.iiiO;
            point2.set(rect3.left, rect3.top);
            Point point3 = this.iiII;
            Rect rect4 = this.iiiO;
            point3.set(rect4.left, rect4.bottom);
            X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
            Point point4 = this.X1OI;
            Rect rect5 = this.iiiO;
            int i5 = rect5.right;
            int i6 = this.Ii0i;
            point4.set(i5 + i6, rect5.top + i6);
            Point point5 = this.Xii;
            Rect rect6 = this.iiiO;
            point5.set(rect6.right, rect6.top);
            Point point6 = this.iiII;
            Rect rect7 = this.iiiO;
            point6.set(rect7.right, rect7.bottom);
            X11iII1O1(canvas, this.X1OI, this.Xii, this.iiII, this.XXiIiX10);
        }
        if (this.IXI) {
            String str = this.IO0II0i;
            this.iiIOiX.setTextSize(this.XOXiX0);
            Paint paint = this.iiIOiX;
            Rect rect8 = this.f55093I0;
            m38947iI(canvas, paint, str, rect8.left, rect8.top, rect8.right, rect8.bottom);
        }
    }

    public final void iX1O1(Canvas canvas, Paint paint, String text, float left, float top, float right, float bottom, boolean isLeftSegment, boolean isRightSegment, int index) {
        paint.setTextAlign(Paint.Align.CENTER);
        float fDescent = ((paint.descent() - paint.ascent()) / 2.0f) - paint.descent();
        float fMeasureText = paint.measureText(text);
        if (isLeftSegment) {
            canvas.drawText(text, left + (fMeasureText / 2.0f), ((top + bottom) / 2.0f) + fDescent, paint);
            return;
        }
        if (isRightSegment) {
            if (this.XO0X10iO.size() > 2 || !text.contains(C12616d4.j.f34438c)) {
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

    public void iXiX011(int startColor, int endColor) {
        int[] iArr = this.f55095IO;
        iArr[0] = startColor;
        iArr[1] = endColor;
        invalidate();
        requestLayout();
    }

    public void iXiiiO(int width, int height) {
        this.iIXi1iiXI = width;
        this.X0i1O = height;
        if (!iiiO()) {
            iOOX010X();
        }
        invalidate();
        requestLayout();
    }

    public final boolean iiiO() {
        return this.O001I == null && this.iXiiiO == null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.XX1Oi = -1.0f;
        if (this.iIi0) {
            II1Xi0(canvas);
        }
        if (this.O101) {
            IXXOO(canvas);
        }
        List<iz3> list = this.XO0X10iO;
        int size = list == null ? 0 : list.size();
        if (size > 0) {
            List<iz3> list2 = this.XO0X10iO;
            iz3 iz3Var = list2.get(list2.size() - 1);
            for (int i = 0; i < size; i++) {
                iOO1ii1(canvas, this.XO0X10iO.get(i), i, size, iz3Var.XO0O10());
            }
        } else {
            m38948iX(canvas);
        }
        if (iiiO()) {
            return;
        }
        int i2 = this.iIi1;
        if (i2 == 0) {
            X1IX(canvas, X11I(), (int) this.XX1Oi);
            return;
        }
        if (i2 == 1) {
            if (!this.f55096O1) {
                throw new RuntimeException("plase add sbv_sliderImg!!!!!");
            }
            O1O(canvas, this.XXOXi, this.IOi1O0, this.I0XXi0X, this.XX1Oi, (this.iiiO.top - getXtop()) + (this.I0XXi0X / 2), this.XXX11i);
        } else {
            if (i2 == 2) {
                i010I(canvas, this.IOi1O0, this.I0XXi0X, this.XX1Oi, (this.iiiO.top - getXtop()) + (this.I0XXi0X / 2), this.OX110i, this.XXX11i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            if (!this.f55096O1) {
                throw new RuntimeException("plase add sbv_sliderImg!!!!!");
            }
            int i3 = this.iiiO.top;
            int i4 = this.I0XXi0X;
            O1O(canvas, this.XXOXi, this.IOi1O0, i4, this.XX1Oi, (i3 - (i4 / 2)) - this.XOX0O0, this.XXX11i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int iMax = this.i11I;
        int i = this.iIi1;
        if (i == 2 || i == 1) {
            iMax = Math.max(iMax, this.I0XXi0X);
        }
        int paddingBottom = iMax + getPaddingBottom() + getPaddingTop();
        if (!iiiO()) {
            paddingBottom += this.X0i1O + this.XOX0O0;
        }
        if (this.X00O0) {
            paddingBottom += this.iii0;
        }
        if (this.X111IO) {
            paddingBottom += this.Xii11I;
        }
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft, widthMeasureSpec, 0), View.resolveSizeAndState(paddingBottom, heightMeasureSpec, 0));
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
        this.f55097OO = emptySegmentColor;
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
        this.f55098Oi = valueTextSize;
        this.O0O0X0iOi.setTextSize(valueTextSize);
        invalidate();
        requestLayout();
    }

    public SegmentedBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f55095IO = new int[]{-65536, -16776961};
        this.f55094I1 = new int[]{-16776961, -256};
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
