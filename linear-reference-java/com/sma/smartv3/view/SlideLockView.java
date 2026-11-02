package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SlideLockView extends ViewGroup {
    public final int I1;
    public final int IO;

    @aa1
    public CustomizeTextView IO0II0i;

    @tb1
    public iO IXOIIIO;
    public int Ii0X0X;

    @tb1
    public String Ii1iii0;
    public int O001I;
    public float OO;
    public int OX110i;
    public boolean X00XIX1;

    @aa1
    public final RectF X00Xi1X;

    @aa1
    public Paint X0i1O;
    public int X1;
    public int X100O;
    public float X11I;
    public int X11iII1O1;

    @tb1
    public XIi00iiXO X1IX;
    public int XO0X10iO;
    public float XOX0O0;

    @tb1
    public String XX1Oi;
    public int XXO;
    public int XXX11i;

    @aa1
    public final RectF XXiIiX10;
    public int i0X000X0O;
    public int i11I;

    @aa1
    public Paint iIXi1iiXI;
    public boolean iOiXi11II;

    @aa1
    public SlideIcon iX1O1;

    @aa1
    public Paint iXiX011;

    @tb1
    public String iXiiiO;
    public int iiiO;

    public final class CustomizeTextView extends AppCompatTextView {

        @tb1
        private LinearGradient mLinearGradient;

        @tb1
        private Matrix mMatrix;

        @tb1
        private Paint mPaint;
        private int mTranslate;
        private int mViewWith;
        final /* synthetic */ SlideLockView this$0;

        @JvmOverloads
        public CustomizeTextView(@aa1 SlideLockView r9, Context r10) {
            Intrinsics.X0O(r10, "context");
            AttributeSet r4 = null;
            int r5 = 0;
            this(r9, r10, r4, r5, 6, null);
        }

        @Override // android.widget.TextView, android.view.View
        public void onDraw(@aa1 Canvas r4) {
            Intrinsics.X0O(r4, "canvas");
            super.onDraw(r4);
            Matrix r5 = this.mMatrix;
            if (r5 == null) goto L9;
            int r0 = this.mTranslate;
            int r1 = this.mViewWith;
            int r2 = r0 + (r1 / 14);
            this.mTranslate = r2;
            if (r2 <= (r1 * 2)) goto L7;
            this.mTranslate = -r1;
        L7:
            Intrinsics.XXI(r5);
            r5.setTranslate(this.mTranslate, 0.0f);
            LinearGradient r6 = this.mLinearGradient;
            Intrinsics.XXI(r6);
            r6.setLocalMatrix(this.mMatrix);
            postInvalidateDelayed(250);
            return;
        }

        @Override // android.view.View
        public void onSizeChanged(int r9, int r10, int r11, int r12) {
            super.onSizeChanged(r9, r10, r11, r12);
            if (this.mViewWith != 0) goto L8;
            int r13 = getMeasuredWidth();
            this.mViewWith = r13;
            if (r13 <= 0) goto L9;
            this.mPaint = getPaint();
            this.mLinearGradient = new LinearGradient(0.0f, 0.0f, this.mViewWith, 0.0f, new int[]{SlideLockView.XIi00iiXO(this.this$0), SlideLockView.iO(this.this$0), SlideLockView.XO0O10(this.this$0)}, null, Shader.TileMode.MIRROR);
            Paint r14 = this.mPaint;
            Intrinsics.XXI(r14);
            r14.setShader(this.mLinearGradient);
            this.mMatrix = new Matrix();
            return;
        L9:
            return;
        }

        @JvmOverloads
        public CustomizeTextView(@aa1 SlideLockView r9, @tb1 Context r10, AttributeSet r11) {
            Intrinsics.X0O(r10, "context");
            int r5 = 0;
            this(r9, r10, r11, r5, 4, null);
        }

        @JvmOverloads
        public CustomizeTextView(@aa1 SlideLockView r2, @tb1 Context r3, AttributeSet r4, int r5) {
            Intrinsics.X0O(r3, "context");
            this.this$0 = r2;
            super(r3, r4, r5);
        }

        public /* synthetic */ CustomizeTextView(SlideLockView r1, Context r2, AttributeSet r3, int r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 2) == 0) goto L6;
            r3 = null;
        L6:
            if ((r5 & 4) == 0) goto L8;
            r4 = 0;
        L8:
            this(r1, r2, r3, r4);
        }
    }

    public static final class OXO1 implements XIi00iiXO {
        public final /* synthetic */ SlideLockView OXO1;

        public OXO1(SlideLockView r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.SlideLockView.XIi00iiXO
        public void OXO1(int r3) {
            SlideLockView.X0O(this.OXO1, r3);
            SlideLockView.X1ii(this.OXO1, 0);
            if ((SlideLockView.OIi0(this.OXO1) + SlideLockView.XXI(this.OXO1).getMeasuredWidth()) >= this.OXO1.getMeasuredWidth()) goto L9;
            if (SlideLockView.I0iXXO(this.OXO1) == false) goto L15;
            SlideLockView.X0O(this.OXO1, 0);
            SlideLockView.XXI(this.OXO1).OXO1();
            this.OXO1.requestLayout();
            this.OXO1.invalidate();
            return;
        L15:
            return;
        L9:
            if (SlideLockView.OXO1(this.OXO1) == true) goto L12;
            SlideLockView.XXI(this.OXO1).setEnable(false);
        L12:
            if (SlideLockView.IO(this.OXO1) == null) goto L16;
            iO r4 = SlideLockView.IO(this.OXO1);
            Intrinsics.XXI(r4);
            r4.OXO1();
            return;
        }

        @Override // com.sma.smartv3.view.SlideLockView.XIi00iiXO
        public void XIi00iiXO(int r2) {
            SlideLockView.X1ii(this.OXO1, r2);
            this.OXO1.requestLayout();
            this.OXO1.invalidate();
        }
    }

    public final class SlideIcon extends View {

        @aa1
        public Paint I1;
        public boolean IO;
        public float X0i1O;

        @tb1
        public XIi00iiXO X11iII1O1;
        public float X1IX;
        public float XXX11i;
        public final /* synthetic */ SlideLockView iIXi1iiXI;

        @aa1
        public Paint.FontMetrics iX1O1;

        @JvmOverloads
        public SlideIcon(@aa1 SlideLockView r9, Context r10) {
            Intrinsics.X0O(r10, "context");
            AttributeSet r4 = null;
            int r5 = 0;
            this(r9, r10, r4, r5, 6, null);
        }

        public final void OXO1() {
            this.XXX11i = 0.0f;
            this.X0i1O = 0.0f;
            this.X1IX = 0.0f;
            this.IO = true;
        }

        public final boolean getEnable() {
            return this.IO;
        }

        @Override // android.view.View
        public void onDraw(@aa1 Canvas r5) {
            Intrinsics.X0O(r5, "canvas");
            super.onDraw(r5);
            float r0 = getMeasuredHeight();
            Paint.FontMetrics r1 = this.iX1O1;
            r5.drawText(String.valueOf(SlideLockView.IiI10X(this.iIXi1iiXI)), getMeasuredWidth() / 2.0f, ((r0 - r1.top) - r1.bottom) / 2, this.I1);
        }

        @Override // android.view.View
        public void onMeasure(int r6, int r7) {
            int r0 = View.MeasureSpec.getSize(r6);
            int r8 = View.MeasureSpec.getMode(r6);
            int r1 = View.MeasureSpec.getSize(r7);
            int r9 = View.MeasureSpec.getMode(r7);
            if (r9 != Integer.MIN_VALUE) goto L10;
            if (SlideLockView.O00(this.iIXi1iiXI) != 0.0f) goto L7;
            SlideLockView r2 = this.iIXi1iiXI;
            SlideLockView.O10IXXX0X(r2, SlideLockView.OIX0iXi(r2) / r0);
        L7:
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (r0 * SlideLockView.O00(this.iIXi1iiXI)), r8), View.MeasureSpec.makeMeasureSpec(SlideLockView.OIX0iXi(this.iIXi1iiXI), r9));
            return;
        L10:
            if (SlideLockView.O00(this.iIXi1iiXI) != 0.0f) goto L12;
            SlideLockView.O10IXXX0X(this.iIXi1iiXI, r1 / r0);
        L12:
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (r0 * SlideLockView.O00(this.iIXi1iiXI)), r8), View.MeasureSpec.makeMeasureSpec(r1, r9));
        }

        @Override // android.view.View
        public boolean onTouchEvent(@aa1 MotionEvent r4) {
            Intrinsics.X0O(r4, NotificationCompat.CATEGORY_EVENT);
            if (this.IO == false) goto L20;
            int r0 = r4.getAction();
            if (r0 == 0) goto L19;
            if (r0 != 1) goto L8;
            this.XXX11i = 0.0f;
            this.X1IX += this.X0i1O;
            this.X0i1O = 0.0f;
            XIi00iiXO r5 = this.X11iII1O1;
            if (r5 == null) goto L18;
            Intrinsics.XXI(r5);
            r5.OXO1((int) this.X1IX);
        L18:
            return true;
        L8:
            if (r0 == 2) goto L11;
            return false;
        L11:
            this.X0i1O = r4.getRawX() - this.XXX11i;
            XIi00iiXO r6 = this.X11iII1O1;
            if (r6 == null) goto L14;
            Intrinsics.XXI(r6);
            r6.XIi00iiXO((int) this.X0i1O);
        L14:
            return true;
        L19:
            this.XXX11i = r4.getRawX();
        L20:
            return true;
        }

        public final void setEnable(boolean r1) {
            this.IO = r1;
        }

        public final void setListener(@tb1 XIi00iiXO r1) {
            this.X11iII1O1 = r1;
        }

        @JvmOverloads
        public SlideIcon(@aa1 SlideLockView r9, @tb1 Context r10, AttributeSet r11) {
            Intrinsics.X0O(r10, "context");
            int r5 = 0;
            this(r9, r10, r11, r5, 4, null);
        }

        @JvmOverloads
        public SlideIcon(@aa1 SlideLockView r2, @tb1 Context r3, AttributeSet r4, int r5) {
            Intrinsics.X0O(r3, "context");
            this.iIXi1iiXI = r2;
            super(r3, r4, r5);
            Paint r6 = new Paint();
            this.I1 = r6;
            Paint.FontMetrics r7 = r6.getFontMetrics();
            Intrinsics.O10IXXX0X(r7, "getFontMetrics(...)");
            this.iX1O1 = r7;
            this.I1.setTextAlign(Paint.Align.CENTER);
            this.I1.setColor(SlideLockView.XOO0ii0(r2));
            this.I1.setTextSize(SlideLockView.I0IIOi(r2));
            this.IO = true;
        }

        public /* synthetic */ SlideIcon(SlideLockView r1, Context r2, AttributeSet r3, int r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 2) == 0) goto L6;
            r3 = null;
        L6:
            if ((r5 & 4) == 0) goto L8;
            r4 = 0;
        L8:
            this(r1, r2, r3, r4);
        }
    }

    public interface XIi00iiXO {
        void OXO1(int r1);

        void XIi00iiXO(int r1);
    }

    public interface iO {
        void OXO1();
    }

    @JvmOverloads
    public SlideLockView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final /* synthetic */ float I0IIOi(SlideLockView r0) {
        return r0.OO;
    }

    public static final /* synthetic */ boolean I0iXXO(SlideLockView r0) {
        return r0.iOiXi11II;
    }

    public static final /* synthetic */ iO IO(SlideLockView r0) {
        return r0.IXOIIIO;
    }

    public static final /* synthetic */ String IiI10X(SlideLockView r0) {
        return r0.XX1Oi;
    }

    public static final /* synthetic */ float O00(SlideLockView r0) {
        return r0.XOX0O0;
    }

    public static final /* synthetic */ void O10IXXX0X(SlideLockView r0, float r1) {
        r0.XOX0O0 = r1;
    }

    public static final /* synthetic */ int OIX0iXi(SlideLockView r0) {
        return r0.O001I;
    }

    public static final /* synthetic */ int OIi0(SlideLockView r0) {
        return r0.X11iII1O1;
    }

    public static final /* synthetic */ boolean OXO1(SlideLockView r0) {
        return r0.X00XIX1;
    }

    public static final /* synthetic */ void X0O(SlideLockView r0, int r1) {
        r0.X11iII1O1 = r1;
    }

    public static final /* synthetic */ void X1ii(SlideLockView r0, int r1) {
        r0.XXX11i = r1;
    }

    public static final /* synthetic */ int XIi00iiXO(SlideLockView r0) {
        return r0.i11I;
    }

    public static final /* synthetic */ int XO0O10(SlideLockView r0) {
        return r0.Ii0X0X;
    }

    public static final /* synthetic */ int XOO0ii0(SlideLockView r0) {
        return r0.OX110i;
    }

    public static final /* synthetic */ SlideIcon XXI(SlideLockView r0) {
        return r0.iX1O1;
    }

    public static final /* synthetic */ int iO(SlideLockView r0) {
        return r0.XO0X10iO;
    }

    public final void I1XOi1(@tb1 iO r1) {
        this.IXOIIIO = r1;
    }

    public final float IIX1OXO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public final void OII(boolean r1) {
        this.iOiXi11II = r1;
    }

    public final boolean OiIIX101O() {
        return this.iOiXi11II;
    }

    public final boolean XX0() {
        return this.X00XIX1;
    }

    public final void XiOIO(boolean r1) {
        this.X00XIX1 = r1;
    }

    public final void XiOIii1() {
        this.X11iII1O1 = 0;
        this.XXX11i = 0;
        this.iX1O1.OXO1();
        requestLayout();
        invalidate();
    }

    public final void iIiiO(Context r5, AttributeSet r6) {
        TypedArray r7 = r5.getTheme().obtainStyledAttributes(r6, R.styleable.SlideLockView, 0, 0);
        Intrinsics.O10IXXX0X(r7, "obtainStyledAttributes(...)");
        this.iOiXi11II = r7.getBoolean(16, true);
        this.X00XIX1 = r7.getBoolean(6, false);
        this.XXO = r7.getResourceId(1, com.sma.smartv3.pro.R.drawable.shape_slide_lock_bg);
        this.X100O = r7.getResourceId(10, com.sma.smartv3.pro.R.drawable.icon_screen_lock);
        this.O001I = r7.getDimensionPixelSize(15, 240);
        this.XX1Oi = r7.getString(12);
        this.OX110i = r7.getColor(13, -1);
        this.OO = r7.getDimensionPixelSize(14, 44);
        this.XOX0O0 = r7.getFloat(11, 0.0f);
        this.iXiiiO = r7.getString(2);
        this.Ii1iii0 = r7.getString(4);
        this.iiiO = r7.getColor(3, ViewCompat.MEASURED_STATE_MASK);
        this.X11I = r7.getDimensionPixelSize(5, 44);
        this.i0X000X0O = r7.getColor(17, 0);
        this.i11I = r7.getColor(7, -1);
        this.XO0X10iO = r7.getColor(8, -1);
        this.Ii0X0X = r7.getColor(9, -1);
        r7.recycle();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r7) {
        Intrinsics.X0O(r7, "canvas");
        super.onDraw(r7);
        r7.save();
        int r0 = this.X11iII1O1 + this.XXX11i;
        this.X1 = r0;
        if (r0 <= 0) goto L13;
        if (r0 >= (this.iX1O1.getMeasuredWidth() / 2)) goto L8;
        this.X00Xi1X.set(this.IO, this.I1, this.iX1O1.getMeasuredWidth(), getMeasuredHeight() - this.I1);
    L11:
        r7.drawRoundRect(this.X00Xi1X, getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.iXiX011);
        goto L13
    L8:
        if (this.X1 >= (getMeasuredWidth() - this.iX1O1.getMeasuredWidth())) goto L10;
        RectF r1 = this.X00Xi1X;
        int r2 = this.IO;
        r1.set(r2, this.I1, (this.X1 + r2) + this.iX1O1.getMeasuredWidth(), getMeasuredHeight() - this.I1);
        goto L11
    L10:
        this.X00Xi1X.set(this.IO, this.I1, getMeasuredWidth(), getMeasuredHeight() - this.I1);
    L13:
        if (((this.X11iII1O1 + this.XXX11i) + this.iX1O1.getMeasuredWidth()) < getMeasuredWidth()) goto L16;
        this.IO0II0i.setText(this.Ii1iii0);
        return;
    L16:
        this.IO0II0i.setText(this.iXiiiO);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        int r7 = this.X11iII1O1;
        int r8 = this.XXX11i;
        if ((r7 + r8) > 0) goto L6;
        SlideIcon r9 = this.iX1O1;
        int r10 = this.IO;
        r9.layout(r10, this.I1, r9.getMeasuredWidth() + r10, this.iX1O1.getMeasuredHeight() - this.I1);
    L9:
        this.IO0II0i.layout((getMeasuredWidth() / 2) - (this.IO0II0i.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) - (this.IO0II0i.getMeasuredHeight() / 2), (getMeasuredWidth() / 2) + (this.IO0II0i.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) + (this.IO0II0i.getMeasuredHeight() / 2));
        return;
    L6:
        if (((r7 + r8) + this.iX1O1.getMeasuredWidth()) < getMeasuredWidth()) goto L8;
        this.iX1O1.layout((getMeasuredWidth() - this.iX1O1.getMeasuredWidth()) - this.IO, this.I1, getMeasuredWidth() - this.IO, this.iX1O1.getMeasuredHeight() - this.I1);
        goto L9
    L8:
        SlideIcon r11 = this.iX1O1;
        int r12 = this.X11iII1O1;
        int r13 = this.XXX11i;
        r11.layout((r12 + r13) + this.IO, this.I1, ((r12 + r13) + r11.getMeasuredWidth()) + this.IO, this.iX1O1.getMeasuredHeight() - this.I1);
        goto L9
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
        measureChildren(r2, r3);
        View r4 = getChildAt(0);
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.sma.smartv3.view.SlideLockView.CustomizeTextView");
        this.IO0II0i = (CustomizeTextView) r4;
        View r5 = getChildAt(1);
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.sma.smartv3.view.SlideLockView.SlideIcon");
        SlideIcon r6 = (SlideIcon) r5;
        this.iX1O1 = r6;
        setMeasuredDimension(r2, r6.getMeasuredHeight());
    }

    @Override // android.view.View
    public void onSizeChanged(int r2, int r3, int r4, int r5) {
        super.onSizeChanged(r2, r3, r4, r5);
        this.XXiIiX10.set(this.IO, this.I1, getMeasuredWidth(), getMeasuredHeight());
    }

    @JvmOverloads
    public SlideLockView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public SlideLockView(@aa1 Context r8, @tb1 AttributeSet r9, int r10) {
        Intrinsics.X0O(r8, "context");
        super(r8, r9, r10);
        int r5 = 6;
        DefaultConstructorMarker r6 = null;
        AttributeSet r3 = null;
        int r4 = 0;
        this.iX1O1 = new SlideIcon(this, r8, r3, r4, r5, r6);
        this.X0i1O = new Paint();
        this.iIXi1iiXI = new Paint();
        this.iXiX011 = new Paint();
        this.iXiiiO = "";
        this.Ii1iii0 = "";
        this.XX1Oi = "";
        this.XXiIiX10 = new RectF();
        this.X00Xi1X = new RectF();
        this.IO0II0i = new CustomizeTextView(this, r8, r3, r4, r5, r6);
        iIiiO(r8, r9);
        this.iXiX011.setColor(this.i0X000X0O);
        setBackgroundResource(this.XXO);
        setWillNotDraw(false);
        this.IO0II0i.setText(this.iXiiiO);
        this.IO0II0i.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.IO0II0i.setGravity(17);
        this.IO0II0i.setTextColor(-1);
        this.IO0II0i.setTextSize(this.X11I);
        addView(this.IO0II0i);
        this.iX1O1.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.iX1O1.setBackgroundResource(this.X100O);
        this.iX1O1.setListener(new OXO1(this));
        addView(this.iX1O1);
    }

    public /* synthetic */ SlideLockView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
