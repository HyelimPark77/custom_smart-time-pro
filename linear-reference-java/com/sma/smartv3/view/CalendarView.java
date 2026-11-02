package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.ck4;
import com.android.mltcode.paycertificationapi.hl4;
import com.sma.smartv3.pro.R;
import java.util.Calendar;
import java.util.Date;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarView extends SkinCompatView {
    public String[] I1;
    public Date Ii1iii0;
    public int O001I;
    public int OO;
    public int OX110i;
    public LinearLayout.LayoutParams X00XIX1;
    public int X0i1O;
    public Calendar X100O;
    public Calendar X11I;
    public Paint X11iII1O1;
    public Rect X1IX;
    public int XOX0O0;
    public Calendar XX1Oi;
    public int XXO;
    public int XXX11i;
    public OXO1 i0X000X0O;
    public int iIXi1iiXI;
    public int iOiXi11II;
    public Context iX1O1;
    public int iXiX011;
    public int iXiiiO;
    public Calendar iiiO;

    public interface OXO1 {
        void onDateSelected(Calendar calendar, int year, int month, int day);

        void onInteractivePrompts(String msg);

        void onMonthChange(Calendar calendar, int year, int month, int day);
    }

    public CalendarView(Context context) {
        this(context, null);
    }

    public void IiI10X() {
        OXO1(-1);
    }

    public void O00(int year, int month, int day) {
        this.OO = year;
        this.XOX0O0 = month;
        this.iOiXi11II = day;
        this.XX1Oi.set(year, month, day);
    }

    public final void OXO1(int count) {
        Calendar.getInstance();
        Calendar r0 = Calendar.getInstance();
        r0.setTime(this.Ii1iii0);
        r0.add(2, count);
        setDate(r0);
    }

    public final int XIi00iiXO(float x, float y) {
        return ((((int) (y / this.O001I)) - 1) * 7) + ((int) (x / this.iXiX011));
    }

    public void XO0O10(int year, int month, int day) {
        Calendar r0 = Calendar.getInstance();
        r0.set(year, month, day);
        setDate(r0.getTime());
    }

    public void XOO0ii0() {
        OXO1(1);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        int r1 = event.getAction();
        float r2 = event.getX();
        float r3 = event.getY();
        if (r1 != 1) goto L15;
        int r4 = XIi00iiXO(r2, r3);
        if (r4 < 0) goto L15;
        if (r4 >= (this.XXO * 7)) goto L15;
        if (this.i0X000X0O == null) goto L15;
        int r5 = this.iiiO.get(1);
        int r6 = this.iiiO.get(2);
        int r7 = (1 - this.OX110i) + r4;
        Calendar r8 = Calendar.getInstance();
        r8.set(r5, r6, r7);
        if (((((r8.getTimeInMillis() / 1000) / 60) / 60) / 24) <= ((((this.XX1Oi.getTimeInMillis() / 1000) / 60) / 60) / 24)) goto L14;
        return true;
    L14:
        this.i0X000X0O.onDateSelected(r8, r5, r6, r7);
        this.iiiO.set(5, (1 - this.OX110i) + r4);
        setDate(this.iiiO);
    L15:
        return true;
    }

    public Date getDate() {
        return this.Ii1iii0;
    }

    public final int iO(int resId) {
        return ck4.XIi00iiXO(resId);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.Ii1iii0 != null) goto L6;
        setDate(Calendar.getInstance());
        return;
    }

    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v7 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v8 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r27) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0181: CAST (r11v6 ?? I:double) = (double) (r9v0 int) in method: com.sma.smartv3.view.CalendarView.onDraw(android.graphics.Canvas):void, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.view.CalendarView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r1 = getMeasuredWidth();
        this.X0i1O = r1;
        this.iXiX011 = r1 / 7;
    }

    public void setDate(Calendar cal) {
        setDate(cal.getTime());
    }

    public void setMax(Calendar cal) {
        O00(cal.get(1), cal.get(2), cal.get(5));
    }

    public void setOnDateSelectedListener(OXO1 listener) {
        this.i0X000X0O = listener;
    }

    public CalendarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setDate(Date data) {
        Calendar r0 = Calendar.getInstance();
        r0.setTime(data);
        if (this.OO != (-1)) goto L5;
    L19:
        this.Ii1iii0 = data;
        this.iiiO.setTime(data);
        this.X11I.setTime(data);
        Calendar r8 = this.X11I;
        r8.add(5, (-r8.get(5)) + 1);
        int r9 = this.X11I.get(7);
        if (r9 >= 2) goto L22;
        int r10 = 6;
    L23:
        this.OX110i = r10;
        this.X11I.add(2, 1);
        this.X11I.add(5, -1);
        int r11 = ((int) Math.ceil(((r10 + this.X11I.get(5)) * 1.0f) / 7.0f)) + 1;
        this.XXO = r11;
        this.iIXi1iiXI = this.O001I * r11;
        int r12 = this.X11I.get(7);
        if (r12 >= 2) goto L26;
        int r13 = 0;
    L27:
        this.X11I.add(5, r13);
        if (this.i0X000X0O == null) goto L30;
        Calendar r14 = Calendar.getInstance();
        r14.setTime(this.iiiO.getTime());
        this.i0X000X0O.onMonthChange(r14, r14.get(1), r14.get(2), r14.get(5));
    L30:
        invalidate();
        return;
    L26:
        r13 = 8 - r12;
        goto L27
    L22:
        r10 = r9 - 2;
        goto L23
    L5:
        if (this.XOX0O0 == (-1)) goto L19;
        int r1 = r0.get(1);
        int r2 = r0.get(2);
        int r5 = this.OO;
        if (r1 <= r5) goto L12;
        OXO1 r15 = this.i0X000X0O;
        if (r15 == null) goto L32;
        r15.onInteractivePrompts(this.iX1O1.getString(R.string.no_more));
        return;
    L32:
        return;
    L12:
        if (r1 != r5) goto L19;
        if (r2 <= this.XOX0O0) goto L19;
        OXO1 r16 = this.i0X000X0O;
        if (r16 == null) goto L33;
        r16.onInteractivePrompts(this.iX1O1.getString(R.string.no_more));
        return;
    }

    public CalendarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.X11iII1O1 = new Paint();
        this.X1IX = new Rect();
        this.iiiO = Calendar.getInstance();
        this.X11I = Calendar.getInstance();
        this.X100O = Calendar.getInstance();
        this.XX1Oi = Calendar.getInstance();
        this.OO = -1;
        this.XOX0O0 = -1;
        this.X00XIX1 = new LinearLayout.LayoutParams(0, 0);
        this.iX1O1 = context;
        this.I1 = context.getResources().getStringArray(R.array.weekdays_s);
        this.X11iII1O1.setAntiAlias(true);
        this.X11iII1O1.setDither(true);
        this.X11iII1O1.setTextSize(OXI1i1.I0IIOi(context, 14.0f));
        this.X11iII1O1.setTextAlign(Paint.Align.CENTER);
        this.X11iII1O1.getTextBounds("日日日", 0, 1, this.X1IX);
        this.X11iII1O1.setStrokeWidth(OXI1i1.XIi00iiXO(this.iX1O1, 1.0f));
        int r5 = (int) (((double) this.X1IX.height()) * 3.0d);
        this.O001I = r5;
        this.iXiiiO = (r5 / 2) + (this.X1IX.height() / 2);
        this.XXX11i = ContextCompat.getColor(context, iO(R.color.colorAccent));
        setBackgroundColor(hl4.XIi00iiXO(this.iX1O1, R.color.view_page_secondary_bg));
        setMax(Calendar.getInstance());
        applySkin();
    }
}
