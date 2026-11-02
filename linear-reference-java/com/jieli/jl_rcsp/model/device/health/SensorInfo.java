package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SensorInfo implements IHealthSettingToAttr {
    private final Sensor altitudePressure;
    private final Sensor bloodOxygen;
    private int flag;
    private final Sensor heartRate;
    private final Sensor step;

    public class Sensor {
        private final int enablePos;
        private final int recordEnablePos;
        final /* synthetic */ SensorInfo this$0;

        public Sensor(SensorInfo r2, int r3) {
            this(r2, r3, r3 + 1);
        }

        public boolean isEnable() {
            if (((SensorInfo.access$000(this.this$0) >> this.enablePos) & 1) != 1) goto L5;
            return true;
        L5:
            return false;
        }

        public boolean isRecordEnable() {
            int r0 = SensorInfo.access$000(this.this$0) >> this.recordEnablePos;
            if (isEnable() == true) goto L5;
            return false;
        L5:
            if ((r0 & 1) != 1) goto L9;
            return true;
        L9:
            return false;
        }

        public void setEnable(boolean r3) {
            if (r3 == false) goto L6;
            SensorInfo.access$076(this.this$0, 1 << this.enablePos);
            return;
        L6:
            int r4 = ~(1 << this.enablePos);
            SensorInfo.access$072(this.this$0, r4);
        }

        public void setRecordEnable(boolean r3) {
            if (r3 == false) goto L6;
            SensorInfo.access$076(this.this$0, 1 << this.recordEnablePos);
            return;
        L6:
            int r4 = ~(1 << this.recordEnablePos);
            SensorInfo.access$072(this.this$0, r4);
        }

        public String toString() {
            return "Sensor{enablePos=" + this.enablePos + ", recordEnablePos=" + this.recordEnablePos + i0XO1.IO;
        }

        public Sensor(SensorInfo r1, int r2, int r3) {
            this.this$0 = r1;
            this.enablePos = r2;
            this.recordEnablePos = r3;
        }
    }

    public SensorInfo(int r3) {
        this.flag = r3;
        this.step = new Sensor(this, 0, 1);
        this.heartRate = new Sensor(this, 2, 3);
        this.bloodOxygen = new Sensor(this, 4, 5);
        this.altitudePressure = new Sensor(this, 6, 7);
    }

    public static /* synthetic */ int access$000(SensorInfo r0) {
        return r0.flag;
    }

    public static /* synthetic */ int access$072(SensorInfo r1, int r2) {
        int r3 = r2 & r1.flag;
        r1.flag = r3;
        return r3;
    }

    public static /* synthetic */ int access$076(SensorInfo r1, int r2) {
        int r3 = r2 | r1.flag;
        r1.flag = r3;
        return r3;
    }

    public SensorInfo copy() {
        return new SensorInfo(this.flag);
    }

    public Sensor getAltitudePressureSensor() {
        return this.altitudePressure;
    }

    public Sensor getBloodOxygenSensor() {
        return this.bloodOxygen;
    }

    public Sensor getHeartRateSensor() {
        return this.heartRate;
    }

    public Sensor getStepSensor() {
        return this.step;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 1;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) getType());
        r0.setAttrData(CHexConver.shortToBigBytes((short) this.flag));
        return r0;
    }

    public String toString() {
        return "SensorInfo{flag=" + this.flag + ", step=" + this.step + ", heartRate=" + this.heartRate + ", bloodOxygen=" + this.bloodOxygen + ", altitudePressure=" + this.altitudePressure + i0XO1.IO;
    }
}
