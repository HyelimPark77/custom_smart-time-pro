package com.sma.smartv3.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.gms.ads.RequestConfiguration;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactSideBar extends View {

    /* JADX INFO: renamed from: I1 */
    public int f54967I1;

    /* JADX INFO: renamed from: IO */
    @tb1
    public XIi00iiXO f54968IO;

    @tb1
    public TextView X11iII1O1;

    @aa1
    public final Paint iX1O1;

    @aa1
    public static final OXO1 XXX11i = new OXO1(null);

    @aa1
    public static String[] X1IX = {"A", "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, O0X11OiO.iOO1ii1, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", Api.f51338Y, "Z", qu0.XO0O10};

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final String[] OXO1() {
            return ContactSideBar.X1IX;
        }

        public final void XIi00iiXO(@aa1 String[] strArr) {
            Intrinsics.X0O(strArr, "<set-?>");
            ContactSideBar.X1IX = strArr;
        }

        public OXO1() {
        }
    }

    public interface XIi00iiXO {
        void OXO1(@tb1 String str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ContactSideBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean dispatchTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        int action = event.getAction();
        float y = event.getY();
        int i = this.f54967I1;
        XIi00iiXO xIi00iiXO = this.f54968IO;
        int height = (int) ((y / getHeight()) * X1IX.length);
        if (action == 1) {
            invalidate();
            TextView textView = this.X11iII1O1;
            if (textView != null) {
                Intrinsics.XXI(textView);
                textView.setVisibility(4);
            }
        } else {
            setAlpha(0.7f);
            if (i != height && height >= 0) {
                String[] strArr = X1IX;
                if (height < strArr.length) {
                    if (xIi00iiXO != null) {
                        xIi00iiXO.OXO1(strArr[height]);
                    }
                    TextView textView2 = this.X11iII1O1;
                    if (textView2 != null) {
                        Intrinsics.XXI(textView2);
                        textView2.setText(X1IX[height]);
                        TextView textView3 = this.X11iII1O1;
                        Intrinsics.XXI(textView3);
                        textView3.setVisibility(0);
                    }
                    this.f54967I1 = height;
                    invalidate();
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        String[] strArr = X1IX;
        int length = height / strArr.length;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            this.iX1O1.setColor(getResources().getColor(R.color.colorAccent));
            this.iX1O1.setTypeface(Typeface.DEFAULT);
            this.iX1O1.setAntiAlias(true);
            this.iX1O1.setTextSize(28.0f);
            this.iX1O1.setFakeBoldText(true);
            float f = 2;
            float fMeasureText = (width / 2) - (this.iX1O1.measureText(X1IX[i]) / f);
            float f2 = (length * i) + length;
            float fMax = Math.max(this.iX1O1.measureText(X1IX[i]), 20.0f);
            if (i == this.f54967I1) {
                this.iX1O1.setAlpha(70);
                canvas.drawCircle((this.iX1O1.measureText(X1IX[i]) / f) + fMeasureText, f2 - (this.iX1O1.measureText(X1IX[i]) / f), fMax, this.iX1O1);
            } else {
                this.iX1O1.setAlpha(255);
            }
            canvas.drawText(X1IX[i], fMeasureText, f2, this.iX1O1);
            this.iX1O1.reset();
        }
    }

    public final void setBar(@aa1 String[] list) {
        Intrinsics.X0O(list, "list");
    }

    public final void setOnTouchingLetterChangedListener(@tb1 XIi00iiXO xIi00iiXO) {
        this.f54968IO = xIi00iiXO;
    }

    public final void setTextView(@tb1 TextView textView) {
        this.X11iII1O1 = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ContactSideBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ContactSideBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54967I1 = -1;
        this.iX1O1 = new Paint();
    }

    public /* synthetic */ ContactSideBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
