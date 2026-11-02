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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OXO1(long j, long j2, CountDownView countDownView) {
            super(j, j2);
            this.OXO1 = countDownView;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.OXO1.setText("00:00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long hours = timeUnit.toHours(j);
            long j2 = 60;
            long minutes = timeUnit.toMinutes(j) % j2;
            long seconds = timeUnit.toSeconds(j) % j2;
            CountDownView countDownView = this.OXO1;
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds)}, 3));
            Intrinsics.O10IXXX0X(str, "format(...)");
            countDownView.setText(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountDownView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static /* synthetic */ void startCountDown$default(CountDownView countDownView, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        countDownView.startCountDown(j, j2);
    }

    public final void cancelCountDown() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.countDownTimer = null;
    }

    public final void startCountDown(long j, long j2) {
        cancelCountDown();
        this.totalTime = j;
        this.interval = j2;
        this.countDownTimer = new OXO1(j, j2, this).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountDownView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountDownView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.interval = 1000L;
    }

    public /* synthetic */ CountDownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
