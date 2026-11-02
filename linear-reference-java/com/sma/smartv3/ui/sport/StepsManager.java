package com.sma.smartv3.ui.sport;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StepsManager {
    public int I0IIOi;

    @aa1
    public XIi00iiXO I0iXXO;
    public int IO;

    @aa1
    public DetectStatus IiI10X;
    public int O00;

    @tb1
    public OXO1 OIX0iXi;
    public int OIi0;

    @aa1
    public final String OXO1;

    @tb1
    public SensorManager XIi00iiXO;

    @tb1
    public Sensor XO0O10;
    public int XOO0ii0;

    @tb1
    public Sensor iO;

    public static final enum DetectStatus extends Enum<DetectStatus> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ DetectStatus[] $VALUES = null;
        public static final DetectStatus END = null;
        public static final DetectStatus PAUSE = null;
        public static final DetectStatus RESUME = null;
        public static final DetectStatus START = null;

        private static final /* synthetic */ DetectStatus[] $values() {
            return new DetectStatus[]{START, RESUME, PAUSE, END};
        }

        static {
            START = new DetectStatus("START", 0);
            RESUME = new DetectStatus("RESUME", 1);
            PAUSE = new DetectStatus("PAUSE", 2);
            END = new DetectStatus("END", 3);
            DetectStatus[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private DetectStatus(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<DetectStatus> getEntries() {
            return $ENTRIES;
        }

        public static DetectStatus valueOf(String r1) {
            return (DetectStatus) Enum.valueOf(DetectStatus.class, r1);
        }

        public static DetectStatus[] values() {
            return (DetectStatus[]) $VALUES.clone();
        }
    }

    public interface OXO1 {
        void OXO1(int r1);
    }

    public static final class XIi00iiXO implements SensorEventListener {
        public final /* synthetic */ StepsManager IO;

        public XIi00iiXO(StepsManager r1) {
            this.IO = r1;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor r1, int r2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent r18) {
            XIi00iiXO r0 = this;
            if (StepsManager.iO(r0.IO) != DetectStatus.END) goto L5;
        L45:
            String r1 = StepsManager.I0IIOi(r0.IO);
            int r2 = StepsManager.OXO1(r0.IO);
            if (r18 == null) goto L48;
            float[] r10 = r18.values;
        L49:
            LogUtils.d(new Object[]{r1 + " onSensorChanged -> cst:" + r2 + " ev:" + Arrays.toString(r10) + " s=" + StepsManager.iO(r0.IO) + " l=" + StepsManager.O00(r0.IO) + " f=" + StepsManager.XO0O10(r0.IO) + " p=" + StepsManager.XOO0ii0(r0.IO) + " c=" + StepsManager.XIi00iiXO(r0.IO)});
            return;
        L48:
            r10 = null;
            goto L49
        L5:
            if (StepsManager.OXO1(r0.IO) != 19) goto L35;
            if (r18 == null) goto L10;
            float[] r3 = r18.values;
            if (r3 == null) goto L10;
            int r4 = (int) r3[0];
        L12:
            if (StepsManager.XO0O10(r0.IO) != 0) goto L15;
            StepsManager.IO(r0.IO, r4);
        L15:
            if (((r4 - StepsManager.XO0O10(r0.IO)) - StepsManager.XOO0ii0(r0.IO)) >= 0) goto L25;
            StepsManager.I0iXXO(r0.IO, 0);
            StepsManager r5 = r0.IO;
            if (r4 <= 0) goto L19;
            int r11 = r4 - StepsManager.XIi00iiXO(r5);
        L20:
            StepsManager.IO(r5, r11);
            i1O0OXO1O r6 = i1O0OXO1O.OXO1;
            String r12 = StepsManager.I0IIOi(r0.IO);
            int r13 = StepsManager.OXO1(r0.IO);
            if (r18 == null) goto L23;
            float[] r14 = r18.values;
        L24:
            r6.OXO1(r12 + " error onSensorChanged -> cst:" + r13 + " ev:" + Arrays.toString(r14) + " s=" + StepsManager.iO(r0.IO) + " l=" + StepsManager.O00(r0.IO) + " f=" + StepsManager.XO0O10(r0.IO) + " p=" + StepsManager.XOO0ii0(r0.IO) + " c=" + StepsManager.XIi00iiXO(r0.IO));
            goto L25
        L23:
            r14 = null;
            goto L24
        L19:
            r11 = StepsManager.XIi00iiXO(r5) + r4;
        L25:
            r0 = this;
            if (r0.IO.X1ii() == false) goto L32;
            StepsManager r7 = r0.IO;
            StepsManager.OIi0(r7, (r4 - StepsManager.XO0O10(r7)) - StepsManager.XOO0ii0(r0.IO));
            OXO1 r8 = StepsManager.IiI10X(r0.IO);
            if (r8 == null) goto L33;
            r8.OXO1(StepsManager.XIi00iiXO(r0.IO));
        L33:
            StepsManager.OIX0iXi(r0.IO, r4);
            goto L45
        L32:
            StepsManager r9 = r0.IO;
            StepsManager.I0iXXO(r9, StepsManager.XOO0ii0(r9) + (r4 - StepsManager.O00(r0.IO)));
        L10:
            r4 = 0;
            goto L12
        L35:
            if (StepsManager.OXO1(r0.IO) == 18) goto L37;
            OXO1 r15 = StepsManager.IiI10X(r0.IO);
            if (r15 == null) goto L45;
            r15.OXO1(0);
            goto L45
        L37:
            if (r0.IO.X1ii() == false) goto L41;
            OXO1 r16 = StepsManager.IiI10X(r0.IO);
            if (r16 == null) goto L45;
            int r17 = StepsManager.XIi00iiXO(r0.IO);
            StepsManager.OIi0(r0.IO, r17 + 1);
            r16.OXO1(r17);
            goto L45
        L41:
            StepsManager.I0iXXO(r0.IO, StepsManager.XOO0ii0(r0.IO) + 1);
            goto L45
        }
    }

    public StepsManager(@aa1 Context r5, @aa1 OXO1 r6) {
        Intrinsics.X0O(r5, "context");
        Intrinsics.X0O(r6, "onStepListener");
        this.OXO1 = "StepsManager";
        this.IiI10X = DetectStatus.END;
        this.I0iXXO = new XIi00iiXO(this);
        Object r7 = r5.getSystemService("sensor");
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager r8 = (SensorManager) r7;
        this.XIi00iiXO = r8;
        Sensor r1 = null;
        if (r8 == null) goto L5;
        Sensor r9 = r8.getDefaultSensor(18);
    L6:
        this.iO = r9;
        SensorManager r10 = this.XIi00iiXO;
        if (r10 == null) goto L9;
        r1 = r10.getDefaultSensor(19);
    L9:
        this.XO0O10 = r1;
        this.OIX0iXi = r6;
        if (r1 == null) goto L15;
        LogUtils.d(new Object[]{"StepsManager Current sensor StepCountSensor " + r1});
        this.O00 = 19;
        SensorManager r11 = this.XIi00iiXO;
        if (r11 == null) goto L23;
        r11.registerListener(this.I0iXXO, this.XO0O10, 0);
        return;
    L23:
        return;
    L15:
        Sensor r12 = this.iO;
        if (r12 == null) goto L21;
        LogUtils.d(new Object[]{"StepsManager Current sensor StepDetectorSensor " + r12});
        this.O00 = 18;
        SensorManager r13 = this.XIi00iiXO;
        if (r13 == null) goto L24;
        r13.registerListener(this.I0iXXO, this.iO, 0);
        return;
    L24:
        return;
    L21:
        LogUtils.d(new Object[]{"StepsManager Count sensor not available!"});
        this.O00 = 0;
        return;
    L5:
        r9 = null;
        goto L6
    }

    public static final /* synthetic */ String I0IIOi(StepsManager r0) {
        return r0.OXO1;
    }

    public static final /* synthetic */ void I0iXXO(StepsManager r0, int r1) {
        r0.IO = r1;
    }

    public static final /* synthetic */ void IO(StepsManager r0, int r1) {
        r0.OIi0 = r1;
    }

    public static final /* synthetic */ OXO1 IiI10X(StepsManager r0) {
        return r0.OIX0iXi;
    }

    public static final /* synthetic */ int O00(StepsManager r0) {
        return r0.I0IIOi;
    }

    public static final /* synthetic */ void OIX0iXi(StepsManager r0, int r1) {
        r0.I0IIOi = r1;
    }

    public static final /* synthetic */ void OIi0(StepsManager r0, int r1) {
        r0.XOO0ii0 = r1;
    }

    public static final /* synthetic */ int OXO1(StepsManager r0) {
        return r0.O00;
    }

    public static final /* synthetic */ int XIi00iiXO(StepsManager r0) {
        return r0.XOO0ii0;
    }

    public static final /* synthetic */ int XO0O10(StepsManager r0) {
        return r0.OIi0;
    }

    public static final /* synthetic */ int XOO0ii0(StepsManager r0) {
        return r0.IO;
    }

    public static final /* synthetic */ DetectStatus iO(StepsManager r0) {
        return r0.IiI10X;
    }

    public final void I1XOi1() {
        LogUtils.d(new Object[]{this.OXO1 + " onPause"});
        this.IiI10X = DetectStatus.PAUSE;
    }

    public final void IIX1OXO() {
        LogUtils.d(new Object[]{this.OXO1 + " onResume"});
        this.IiI10X = DetectStatus.RESUME;
    }

    public final void O10IXXX0X() {
        LogUtils.d(new Object[]{this.OXO1 + " onDestroy"});
        int r0 = this.O00;
        if (r0 != 19) goto L9;
        SensorManager r1 = this.XIi00iiXO;
        if (r1 == null) goto L14;
        r1.unregisterListener(this.I0iXXO, this.XO0O10);
        return;
    L14:
        return;
    L9:
        if (r0 != 18) goto L15;
        SensorManager r2 = this.XIi00iiXO;
        if (r2 == null) goto L16;
        r2.unregisterListener(this.I0iXXO, this.iO);
        return;
    L16:
        return;
    }

    public final void X0O() {
        LogUtils.d(new Object[]{this.OXO1 + " onEnd"});
        this.IiI10X = DetectStatus.END;
    }

    public final boolean X1ii() {
        DetectStatus r0 = this.IiI10X;
        if (r0 != DetectStatus.START) goto L5;
        return true;
    L5:
        if (r0 == DetectStatus.RESUME) goto L11;
        return false;
    L11:
        return true;
    }

    public final int XXI() {
        return this.O00;
    }

    public final void XiOIO() {
        LogUtils.d(new Object[]{this.OXO1 + " onStart"});
        this.IiI10X = DetectStatus.START;
        this.XOO0ii0 = 0;
        this.OIi0 = 0;
        this.I0IIOi = 0;
        this.IO = 0;
    }
}
