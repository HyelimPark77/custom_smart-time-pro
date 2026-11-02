package com.sma.smartv3.p610ui.contactpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.sma.smartv3.C15429R;

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
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C15429R.styleable.RoundedLetterView, defStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.mTitleText = typedArrayObtainStyledAttributes.getString(3);
        }
        this.mTitleColor = typedArrayObtainStyledAttributes.getColor(1, DEFAULT_TITLE_COLOR);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(0, DEFAULT_BACKGROUND_COLOR);
        this.mTitleSize = typedArrayObtainStyledAttributes.getDimension(2, DEFAULT_TITLE_SIZE);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.mTitleTextPaint = textPaint;
        textPaint.setFlags(1);
        this.mTitleTextPaint.setTypeface(this.mFont);
        this.mTitleTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mTitleTextPaint.setLinearText(true);
        this.mTitleTextPaint.setColor(this.mTitleColor);
        this.mTitleTextPaint.setTextSize(this.mTitleSize);
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setFlags(1);
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
        RectF rectF = this.mInnerRectF;
        int i = this.mViewSize;
        rectF.set(0.0f, 0.0f, i, i);
        this.mInnerRectF.offset((getWidth() - this.mViewSize) / 2, (getHeight() - this.mViewSize) / 2);
        float fCenterX = this.mInnerRectF.centerX();
        int iCenterY = (int) (this.mInnerRectF.centerY() - ((this.mTitleTextPaint.descent() + this.mTitleTextPaint.ascent()) / 2.0f));
        canvas.drawOval(this.mInnerRectF, this.mBackgroundPaint);
        canvas.drawText(this.mTitleText, (int) fCenterX, iCenterY, this.mTitleTextPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int iResolveSize = View.resolveSize(96, widthMeasureSpec);
        int iResolveSize2 = View.resolveSize(96, heightMeasureSpec);
        this.mViewSize = Math.min(iResolveSize, iResolveSize2);
        setMeasuredDimension(iResolveSize, iResolveSize2);
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
