package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u65;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SquareVerificationCodeView extends AppCompatEditText {
    private final int BG_COLOR;
    private final int CODE_COUNT;
    private final float ROUND_RADIUS;
    private final float SPACE;
    private final int TEXT_COLOR;
    private final float TEXT_SIZE;

    @aa1
    private final Paint bgPaint;

    @aa1
    private final List<RectF> codeRectList;

    @tb1
    private Function1<? super String, Unit> onCodeCompleteListener;

    @aa1
    private final Paint textPaint;

    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ SquareVerificationCodeView IO;

        public OXO1(SquareVerificationCodeView r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r3) {
            this.IO.invalidate();
            if (r3 == null) goto L6;
            String r4 = r3.toString();
            if (r4 == null) goto L6;
        L8:
            if (r4.length() != SquareVerificationCodeView.access$getCODE_COUNT$p(this.IO)) goto L13;
            SquareVerificationCodeView.access$closeKeyboard(this.IO);
            Function1<String, Unit> r0 = this.IO.getOnCodeCompleteListener();
            if (r0 == null) goto L14;
            r0.invoke(r4);
            return;
        L14:
            return;
        L13:
            return;
        L6:
            r4 = "";
            goto L8
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    @JvmOverloads
    public SquareVerificationCodeView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void OXO1(InputMethodManager r0, SquareVerificationCodeView r1) {
        openKeyboard$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$closeKeyboard(SquareVerificationCodeView r0) {
        r0.closeKeyboard();
    }

    public static final /* synthetic */ int access$getCODE_COUNT$p(SquareVerificationCodeView r0) {
        return r0.CODE_COUNT;
    }

    private final void closeKeyboard() {
        Object r0 = getContext().getSystemService("input_method");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) r0).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private final void initEditText() {
        setCursorVisible(false);
        setBackground(null);
        setTextColor(0);
        setInputType(2);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.CODE_COUNT)});
        setMaxLines(1);
        setClickable(true);
        addTextChangedListener(new OXO1(this));
    }

    private final void initPaint() {
        this.bgPaint.setColor(this.BG_COLOR);
        this.bgPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setColor(this.TEXT_COLOR);
        this.textPaint.setTextSize(this.TEXT_SIZE);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
    }

    private final void openKeyboard() {
        Object r0 = getContext().getSystemService("input_method");
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final InputMethodManager r1 = (InputMethodManager) r0;
        postDelayed(new u65(r1, this), 100);
    }

    private static final void openKeyboard$lambda$0(InputMethodManager r1, SquareVerificationCodeView r2) {
        r1.showSoftInput(r2, 1);
    }

    public final void clearCode() {
        setText("");
        requestFocus();
        openKeyboard();
    }

    @tb1
    public final Function1<String, Unit> getOnCodeCompleteListener() {
        return this.onCodeCompleteListener;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@aa1 Canvas r8) {
        Intrinsics.X0O(r8, "canvas");
        super.onDraw(r8);
        Editable r0 = getText();
        if (r0 == null) goto L6;
        String r1 = r0.toString();
        if (r1 == null) goto L6;
    L7:
        Iterator<RectF> r2 = this.codeRectList.iterator();
    L9:
        if (r2.hasNext() == false) goto L11;
        RectF r3 = r2.next();
        float r4 = this.ROUND_RADIUS;
        r8.drawRoundRect(r3, r4, r4, this.bgPaint);
        goto L9
    L11:
        int r5 = this.codeRectList.size();
        int r6 = 0;
    L12:
        if (r6 >= r5) goto L17;
        RectF r7 = this.codeRectList.get(r6);
        float r9 = r7.centerY() - ((this.textPaint.descent() + this.textPaint.ascent()) / 2);
        if (r6 >= r1.length()) goto L16;
        r8.drawText(String.valueOf(r1.charAt(r6)), r7.centerX(), r9, this.textPaint);
    L16:
        r6 = r6 + 1;
        goto L12
    L17:
        return;
    L6:
        r1 = "";
        goto L7
    }

    @Override // android.view.View
    public void onSizeChanged(int r7, int r8, int r9, int r10) {
        super.onSizeChanged(r7, r8, r9, r10);
        this.codeRectList.clear();
        float r11 = getHeight();
        int r12 = this.CODE_COUNT;
        float r13 = (getWidth() - ((r12 * r11) + ((r12 - 1) * this.SPACE))) / 2.0f;
        int r14 = this.CODE_COUNT;
        int r15 = 0;
    L3:
        if (r15 >= r14) goto L5;
        float r0 = (r15 * (this.SPACE + r11)) + r13;
        this.codeRectList.add(new RectF(r0, 0.0f, r0 + r11, getHeight()));
        r15 = r15 + 1;
        goto L3
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent r3) {
        Intrinsics.X0O(r3, NotificationCompat.CATEGORY_EVENT);
        if (r3.getAction() != 1) goto L6;
        requestFocus();
        openKeyboard();
    L6:
        return super.onTouchEvent(r3);
    }

    public final void setOnCodeCompleteListener(@tb1 Function1<? super String, Unit> r1) {
        this.onCodeCompleteListener = r1;
    }

    @JvmOverloads
    public SquareVerificationCodeView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public SquareVerificationCodeView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.CODE_COUNT = 6;
        this.BG_COLOR = Color.parseColor("#A7A7A7");
        this.TEXT_COLOR = ViewCompat.MEASURED_STATE_MASK;
        this.ROUND_RADIUS = 8.0f;
        this.SPACE = 20.0f;
        this.TEXT_SIZE = 50.0f;
        this.bgPaint = new Paint(1);
        this.textPaint = new Paint(1);
        this.codeRectList = new ArrayList();
        initPaint();
        initEditText();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public /* synthetic */ SquareVerificationCodeView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
