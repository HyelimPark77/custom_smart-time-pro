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
import androidx.core.app.NotificationCompat;
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

    @aa1
    public static String[] X1IX;

    @aa1
    public static final OXO1 XXX11i = null;
    public int I1;

    @tb1
    public XIi00iiXO IO;

    @tb1
    public TextView X11iII1O1;

    @aa1
    public final Paint iX1O1;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final String[] OXO1() {
            return ContactSideBar.OXO1();
        }

        public final void XIi00iiXO(@aa1 String[] r2) {
            Intrinsics.X0O(r2, "<set-?>");
            ContactSideBar.XIi00iiXO(r2);
        }

        public OXO1() {
        }
    }

    public interface XIi00iiXO {
        void OXO1(@tb1 String r1);
    }

    static {
        XXX11i = new OXO1(null);
        X1IX = new String[]{"A", "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, O0X11OiO.iOO1ii1, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", Api.Y, "Z", qu0.XO0O10};
    }

    @JvmOverloads
    public ContactSideBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final /* synthetic */ String[] OXO1() {
        return X1IX;
    }

    public static final /* synthetic */ void XIi00iiXO(String[] r0) {
        X1IX = r0;
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean dispatchTouchEvent(@aa1 MotionEvent r5) {
        Intrinsics.X0O(r5, NotificationCompat.CATEGORY_EVENT);
        int r0 = r5.getAction();
        float r6 = r5.getY();
        int r1 = this.I1;
        XIi00iiXO r2 = this.IO;
        int r7 = (int) ((r6 / getHeight()) * X1IX.length);
        if (r0 != 1) goto L7;
        invalidate();
        TextView r8 = this.X11iII1O1;
        if (r8 == null) goto L18;
        Intrinsics.XXI(r8);
        r8.setVisibility(4);
    L18:
        return true;
    L7:
        setAlpha(0.7f);
        if (r1 == r7) goto L18;
        if (r7 < 0) goto L18;
        String[] r3 = X1IX;
        if (r7 >= r3.length) goto L18;
        if (r2 == null) goto L14;
        r2.OXO1(r3[r7]);
    L14:
        TextView r4 = this.X11iII1O1;
        if (r4 == null) goto L17;
        Intrinsics.XXI(r4);
        r4.setText(X1IX[r7]);
        TextView r9 = this.X11iII1O1;
        Intrinsics.XXI(r9);
        r9.setVisibility(0);
    L17:
        this.I1 = r7;
        invalidate();
        goto L18
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r12) {
        Intrinsics.X0O(r12, "canvas");
        super.onDraw(r12);
        int r0 = getHeight();
        int r1 = getWidth();
        String[] r2 = X1IX;
        int r3 = r0 / r2.length;
        int r4 = r2.length;
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L9;
        this.iX1O1.setColor(getResources().getColor(R.color.colorAccent));
        this.iX1O1.setTypeface(Typeface.DEFAULT);
        this.iX1O1.setAntiAlias(true);
        this.iX1O1.setTextSize(28.0f);
        this.iX1O1.setFakeBoldText(true);
        float r6 = 2;
        float r7 = (r1 / 2) - (this.iX1O1.measureText(X1IX[r5]) / r6);
        float r8 = (r3 * r5) + r3;
        float r9 = Math.max(this.iX1O1.measureText(X1IX[r5]), 20.0f);
        if (r5 != this.I1) goto L7;
        this.iX1O1.setAlpha(70);
        r12.drawCircle((this.iX1O1.measureText(X1IX[r5]) / r6) + r7, r8 - (this.iX1O1.measureText(X1IX[r5]) / r6), r9, this.iX1O1);
    L8:
        r12.drawText(X1IX[r5], r7, r8, this.iX1O1);
        this.iX1O1.reset();
        r5 = r5 + 1;
        goto L3
    L7:
        this.iX1O1.setAlpha(255);
        goto L8
    }

    public final void setBar(@aa1 String[] r2) {
        Intrinsics.X0O(r2, "list");
    }

    public final void setOnTouchingLetterChangedListener(@tb1 XIi00iiXO r1) {
        this.IO = r1;
    }

    public final void setTextView(@tb1 TextView r1) {
        this.X11iII1O1 = r1;
    }

    @JvmOverloads
    public ContactSideBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ContactSideBar(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.I1 = -1;
        this.iX1O1 = new Paint();
    }

    public /* synthetic */ ContactSideBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
