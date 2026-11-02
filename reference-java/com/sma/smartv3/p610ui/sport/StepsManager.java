package com.sma.smartv3.p610ui.sport;

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

    /* JADX INFO: renamed from: IO */
    public int f54774IO;

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

    /* JADX INFO: renamed from: iO */
    @tb1
    public Sensor f54775iO;

    public enum DetectStatus {
        START,
        RESUME,
        PAUSE,
        END;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<DetectStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public interface OXO1 {
        void OXO1(int i);
    }

    public static final class XIi00iiXO implements SensorEventListener {
        public XIi00iiXO() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            XIi00iiXO xIi00iiXO = this;
            if (StepsManager.this.IiI10X != DetectStatus.END) {
                if (StepsManager.this.O00 == 19) {
                    int i = (sensorEvent == null || (fArr = sensorEvent.values) == null) ? 0 : (int) fArr[0];
                    if (StepsManager.this.OIi0 == 0) {
                        StepsManager.this.OIi0 = i;
                    }
                    if ((i - StepsManager.this.OIi0) - StepsManager.this.f54774IO < 0) {
                        StepsManager.this.f54774IO = 0;
                        StepsManager stepsManager = StepsManager.this;
                        stepsManager.OIi0 = i > 0 ? i - stepsManager.XOO0ii0 : stepsManager.XOO0ii0 + i;
                        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                        String str = StepsManager.this.OXO1;
                        int i2 = StepsManager.this.O00;
                        i1o0oxo1o.OXO1(str + " error onSensorChanged -> cst:" + i2 + " ev:" + Arrays.toString(sensorEvent != null ? sensorEvent.values : null) + " s=" + StepsManager.this.IiI10X + " l=" + StepsManager.this.I0IIOi + " f=" + StepsManager.this.OIi0 + " p=" + StepsManager.this.f54774IO + " c=" + StepsManager.this.XOO0ii0);
                    }
                    xIi00iiXO = this;
                    if (StepsManager.this.X1ii()) {
                        StepsManager stepsManager2 = StepsManager.this;
                        stepsManager2.XOO0ii0 = (i - stepsManager2.OIi0) - StepsManager.this.f54774IO;
                        OXO1 oxo1 = StepsManager.this.OIX0iXi;
                        if (oxo1 != null) {
                            oxo1.OXO1(StepsManager.this.XOO0ii0);
                        }
                    } else {
                        StepsManager.this.f54774IO += i - StepsManager.this.I0IIOi;
                    }
                    StepsManager.this.I0IIOi = i;
                } else if (StepsManager.this.O00 != 18) {
                    OXO1 oxo2 = StepsManager.this.OIX0iXi;
                    if (oxo2 != null) {
                        oxo2.OXO1(0);
                    }
                } else if (StepsManager.this.X1ii()) {
                    OXO1 oxo3 = StepsManager.this.OIX0iXi;
                    if (oxo3 != null) {
                        int i3 = StepsManager.this.XOO0ii0;
                        StepsManager.this.XOO0ii0 = i3 + 1;
                        oxo3.OXO1(i3);
                    }
                } else {
                    StepsManager.this.f54774IO++;
                }
            }
            String str2 = StepsManager.this.OXO1;
            int i4 = StepsManager.this.O00;
            LogUtils.m11128d(str2 + " onSensorChanged -> cst:" + i4 + " ev:" + Arrays.toString(sensorEvent != null ? sensorEvent.values : null) + " s=" + StepsManager.this.IiI10X + " l=" + StepsManager.this.I0IIOi + " f=" + StepsManager.this.OIi0 + " p=" + StepsManager.this.f54774IO + " c=" + StepsManager.this.XOO0ii0);
        }
    }

    public StepsManager(@aa1 Context context, @aa1 OXO1 onStepListener) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(onStepListener, "onStepListener");
        this.OXO1 = "StepsManager";
        this.IiI10X = DetectStatus.END;
        this.I0iXXO = new XIi00iiXO();
        Object systemService = context.getSystemService("sensor");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.XIi00iiXO = sensorManager;
        this.f54775iO = sensorManager != null ? sensorManager.getDefaultSensor(18) : null;
        SensorManager sensorManager2 = this.XIi00iiXO;
        Sensor defaultSensor = sensorManager2 != null ? sensorManager2.getDefaultSensor(19) : null;
        this.XO0O10 = defaultSensor;
        this.OIX0iXi = onStepListener;
        if (defaultSensor != null) {
            LogUtils.m11128d("StepsManager Current sensor StepCountSensor " + defaultSensor);
            this.O00 = 19;
            SensorManager sensorManager3 = this.XIi00iiXO;
            if (sensorManager3 != null) {
                sensorManager3.registerListener(this.I0iXXO, this.XO0O10, 0);
                return;
            }
            return;
        }
        Sensor sensor = this.f54775iO;
        if (sensor == null) {
            LogUtils.m11128d("StepsManager Count sensor not available!");
            this.O00 = 0;
            return;
        }
        LogUtils.m11128d("StepsManager Current sensor StepDetectorSensor " + sensor);
        this.O00 = 18;
        SensorManager sensorManager4 = this.XIi00iiXO;
        if (sensorManager4 != null) {
            sensorManager4.registerListener(this.I0iXXO, this.f54775iO, 0);
        }
    }

    public final void I1XOi1() {
        LogUtils.m11128d(this.OXO1 + " onPause");
        this.IiI10X = DetectStatus.PAUSE;
    }

    public final void IIX1OXO() {
        LogUtils.m11128d(this.OXO1 + " onResume");
        this.IiI10X = DetectStatus.RESUME;
    }

    public final void O10IXXX0X() {
        SensorManager sensorManager;
        LogUtils.m11128d(this.OXO1 + " onDestroy");
        int i = this.O00;
        if (i == 19) {
            SensorManager sensorManager2 = this.XIi00iiXO;
            if (sensorManager2 != null) {
                sensorManager2.unregisterListener(this.I0iXXO, this.XO0O10);
                return;
            }
            return;
        }
        if (i != 18 || (sensorManager = this.XIi00iiXO) == null) {
            return;
        }
        sensorManager.unregisterListener(this.I0iXXO, this.f54775iO);
    }

    public final void X0O() {
        LogUtils.m11128d(this.OXO1 + " onEnd");
        this.IiI10X = DetectStatus.END;
    }

    public final boolean X1ii() {
        DetectStatus detectStatus = this.IiI10X;
        return detectStatus == DetectStatus.START || detectStatus == DetectStatus.RESUME;
    }

    public final int XXI() {
        return this.O00;
    }

    public final void XiOIO() {
        LogUtils.m11128d(this.OXO1 + " onStart");
        this.IiI10X = DetectStatus.START;
        this.XOO0ii0 = 0;
        this.OIi0 = 0;
        this.I0IIOi = 0;
        this.f54774IO = 0;
    }
}
