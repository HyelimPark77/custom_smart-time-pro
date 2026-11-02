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
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.ArrayList;
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
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            SquareVerificationCodeView.this.invalidate();
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            if (string.length() == SquareVerificationCodeView.this.CODE_COUNT) {
                SquareVerificationCodeView.this.closeKeyboard();
                Function1<String, Unit> onCodeCompleteListener = SquareVerificationCodeView.this.getOnCodeCompleteListener();
                if (onCodeCompleteListener != null) {
                    onCodeCompleteListener.invoke2(string);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareVerificationCodeView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeKeyboard() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    private final void initEditText() {
        setCursorVisible(false);
        setBackground(null);
        setTextColor(0);
        setInputType(2);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.CODE_COUNT)});
        setMaxLines(1);
        setClickable(true);
        addTextChangedListener(new OXO1());
    }

    private final void initPaint() {
        this.bgPaint.setColor(this.BG_COLOR);
        this.bgPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setColor(this.TEXT_COLOR);
        this.textPaint.setTextSize(this.TEXT_SIZE);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
    }

    private final void openKeyboard() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.u65
            @Override // java.lang.Runnable
            public final void run() {
                inputMethodManager.showSoftInput(this, 1);
            }
        }, 100L);
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
    public void onDraw(@aa1 Canvas canvas) {
        String string;
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        Editable text = getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        for (RectF rectF : this.codeRectList) {
            float f = this.ROUND_RADIUS;
            canvas.drawRoundRect(rectF, f, f, this.bgPaint);
        }
        int size = this.codeRectList.size();
        for (int i = 0; i < size; i++) {
            RectF rectF2 = this.codeRectList.get(i);
            float fCenterY = rectF2.centerY() - ((this.textPaint.descent() + this.textPaint.ascent()) / 2);
            if (i < string.length()) {
                canvas.drawText(String.valueOf(string.charAt(i)), rectF2.centerX(), fCenterY, this.textPaint);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.codeRectList.clear();
        float height = getHeight();
        int i5 = this.CODE_COUNT;
        float width = (getWidth() - ((i5 * height) + ((i5 - 1) * this.SPACE))) / 2.0f;
        int i6 = this.CODE_COUNT;
        for (int i7 = 0; i7 < i6; i7++) {
            float f = (i7 * (this.SPACE + height)) + width;
            this.codeRectList.add(new RectF(f, 0.0f, f + height, getHeight()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        if (event.getAction() == 1) {
            requestFocus();
            openKeyboard();
        }
        return super.onTouchEvent(event);
    }

    public final void setOnCodeCompleteListener(@tb1 Function1<? super String, Unit> function1) {
        this.onCodeCompleteListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareVerificationCodeView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SquareVerificationCodeView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
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

    public /* synthetic */ SquareVerificationCodeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
