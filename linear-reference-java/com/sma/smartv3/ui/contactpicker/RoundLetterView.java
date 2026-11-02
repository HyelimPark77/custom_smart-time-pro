package com.sma.smartv3.ui.contactpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.sma.smartv3.R;

/* JADX INFO: loaded from: classes19.dex */
public class RoundLetterView extends View {
    private static int DEFAULT_BACKGROUND_COLOR = -16711681;
    private static String DEFAULT_TITLE = "A";
    private static int DEFAULT_TITLE_COLOR = -1;
    private static float DEFAULT_TITLE_SIZE = 25.0f;
    private static final int DEFAULT_VIEW_SIZE = 96;
    private int mBackgroundColor;
    private Paint mBackgroundPaint;
    private Typeface mFont;
    private RectF mInnerRectF;
    private int mTitleColor;
    private float mTitleSize;
    private String mTitleText;
    private TextPaint mTitleTextPaint;
    private int mViewSize;

    static {
    }

    public RoundLetterView(Context context) {
        super(context);
        this.mTitleColor = DEFAULT_TITLE_COLOR;
        this.mBackgroundColor = DEFAULT_BACKGROUND_COLOR;
        this.mTitleText = DEFAULT_TITLE;
        this.mTitleSize = DEFAULT_TITLE_SIZE;
        this.mFont = Typeface.defaultFromStyle(1);
        init(null, 0);
    }

    private void init(AttributeSet attrs, int defStyle) {
        TypedArray r4 = getContext().obtainStyledAttributes(attrs, R.styleable.RoundedLetterView, defStyle, 0);
        if (r4.hasValue(3) == false) goto L5;
        this.mTitleText = r4.getString(3);
    L5:
        this.mTitleColor = r4.getColor(1, DEFAULT_TITLE_COLOR);
        this.mBackgroundColor = r4.getColor(0, DEFAULT_BACKGROUND_COLOR);
        this.mTitleSize = r4.getDimension(2, DEFAULT_TITLE_SIZE);
        r4.recycle();
        TextPaint r5 = new TextPaint();
        this.mTitleTextPaint = r5;
        r5.setFlags(1);
        this.mTitleTextPaint.setTypeface(this.mFont);
        this.mTitleTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTitleTextPaint.setLinearText(true);
        this.mTitleTextPaint.setColor(this.mTitleColor);
        this.mTitleTextPaint.setTextSize(this.mTitleSize);
        Paint r6 = new Paint();
        this.mBackgroundPaint = r6;
        r6.setFlags(1);
        this.mBackgroundPaint.setStyle(Paint.Style.FILL);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
        this.mInnerRectF = new RectF();
    }

    private void invalidatePaints() {
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
    }

    private void invalidateTextPaints() {
        this.mTitleTextPaint.setTypeface(this.mFont);
        this.mTitleTextPaint.setTextSize(this.mTitleSize);
        this.mTitleTextPaint.setColor(this.mTitleColor);
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public float getTitleSize() {
        return this.mTitleSize;
    }

    public String getTitleText() {
        return this.mTitleText;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF r0 = this.mInnerRectF;
        int r1 = this.mViewSize;
        r0.set(0.0f, 0.0f, r1, r1);
        this.mInnerRectF.offset((getWidth() - this.mViewSize) / 2, (getHeight() - this.mViewSize) / 2);
        float r2 = this.mInnerRectF.centerX();
        int r3 = (int) (this.mInnerRectF.centerY() - ((this.mTitleTextPaint.descent() + this.mTitleTextPaint.ascent()) / 2.0f));
        canvas.drawOval(this.mInnerRectF, this.mBackgroundPaint);
        canvas.drawText(this.mTitleText, (int) r2, r3, this.mTitleTextPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r2 = View.resolveSize(96, widthMeasureSpec);
        int r3 = View.resolveSize(96, heightMeasureSpec);
        this.mViewSize = Math.min(r2, r3);
        setMeasuredDimension(r2, r3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int backgroundColor) {
        this.mBackgroundColor = backgroundColor;
        invalidatePaints();
    }

    public void setTextTypeface(Typeface font) {
        this.mFont = font;
        invalidateTextPaints();
    }

    public void setTitleColor(int titleColor) {
        this.mTitleColor = titleColor;
        invalidateTextPaints();
    }

    public void setTitleSize(float titleSize) {
        this.mTitleSize = titleSize;
        invalidateTextPaints();
    }

    public void setTitleText(String title) {
        this.mTitleText = title;
        invalidate();
    }

    public RoundLetterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mTitleColor = DEFAULT_TITLE_COLOR;
        this.mBackgroundColor = DEFAULT_BACKGROUND_COLOR;
        this.mTitleText = DEFAULT_TITLE;
        this.mTitleSize = DEFAULT_TITLE_SIZE;
        this.mFont = Typeface.defaultFromStyle(1);
        init(attrs, 0);
    }

    public RoundLetterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mTitleColor = DEFAULT_TITLE_COLOR;
        this.mBackgroundColor = DEFAULT_BACKGROUND_COLOR;
        this.mTitleText = DEFAULT_TITLE;
        this.mTitleSize = DEFAULT_TITLE_SIZE;
        this.mFont = Typeface.defaultFromStyle(1);
        init(attrs, defStyle);
    }
}
