package com.sma.smartv3.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import skin.support.widget.SkinCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class CountDownView extends SkinCompatTextView {

    @tb1
    private CountDownTimer countDownTimer;
    private long interval;
    private long totalTime;

    public static final class OXO1 extends CountDownTimer {
        public final /* synthetic */ CountDownView OXO1;

        public OXO1(long r1, long r3, CountDownView r5) {
            this.OXO1 = r5;
            super(r1, r3);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.OXO1.setText("00:00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r8) {
            TimeUnit r0 = TimeUnit.MILLISECONDS;
            long r1 = r0.toHours(r8);
            long r5 = 60;
            long r3 = r0.toMinutes(r8) % r5;
            long r9 = r0.toSeconds(r8) % r5;
            CountDownView r2 = this.OXO1;
            StringCompanionObject r6 = StringCompanionObject.OXO1;
            String r10 = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(r1), Long.valueOf(r3), Long.valueOf(r9)}, 3));
            Intrinsics.O10IXXX0X(r10, "format(...)");
            r2.setText(r10);
        }
    }

    @JvmOverloads
    public CountDownView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void startCountDown$default(CountDownView r0, long r1, long r3, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L5;
        r3 = 1000;
    L5:
        r0.startCountDown(r1, r3);
    }

    public final void cancelCountDown() {
        CountDownTimer r0 = this.countDownTimer;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        this.countDownTimer = null;
    }

    public final void startCountDown(long r7, long r9) {
        cancelCountDown();
        this.totalTime = r7;
        this.interval = r9;
        this.countDownTimer = new OXO1(r7, r9, this).start();
    }

    @JvmOverloads
    public CountDownView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public CountDownView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.interval = 1000;
    }

    public /* synthetic */ CountDownView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
