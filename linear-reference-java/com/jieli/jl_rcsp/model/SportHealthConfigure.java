package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class SportHealthConfigure {
    public static final int CONFIGURE_TYPE_ALTITUDE = 3;
    public static final int CONFIGURE_TYPE_BLOOD_OXYGEN = 2;
    public static final int CONFIGURE_TYPE_COMBINE_FUNC = 255;
    public static final int CONFIGURE_TYPE_GPS = 4;
    public static final int CONFIGURE_TYPE_GSENSOR = 0;
    public static final int CONFIGURE_TYPE_RATE = 1;
    public static final int CONFIGURE_TYPE_SPORT_MODE = 254;
    private AltitudeFunc altitudeFunc;
    private BloodOxygenFunc bloodOxygenFunc;
    private CombineFunc combineFunc;
    private GSensorFunc gSensorFunc;
    private GPSFunc gpsFunc;
    private RateFunc rateFunc;
    private SportModeFunc sportModeFunc;

    public static class AltitudeFunc extends BaseFunc {
        private boolean isOpen;

        public AltitudeFunc(int r2, byte[] r3) throws RuntimeException {
            super(3, r2, r3);
        }

        public boolean isOpen() {
            return this.isOpen;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L15;
            if (r4 == null) goto L13;
            boolean r0 = true;
            if (r4.length < 1) goto L13;
            if ((r4[0] & 1) == 1) goto L10;
            r0 = false;
        L10:
            this.isOpen = r0;
            return;
        L13:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L15:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "AltitudeFunc{isOpen=" + this.isOpen + "} ";
        }
    }

    public static abstract class BaseFunc {
        private final int type;

        public BaseFunc(int r1, int r2, byte[] r3) throws RuntimeException {
            this.type = r1;
            parseData(r2, r3);
        }

        public int getType() {
            return this.type;
        }

        public abstract void parseData(int r1, byte[] r2) throws RuntimeException;
    }

    public static class BloodOxygenFunc extends BaseFunc {
        private boolean isOpen;

        public BloodOxygenFunc(int r2, byte[] r3) throws RuntimeException {
            super(2, r2, r3);
        }

        public boolean isOpen() {
            return this.isOpen;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L15;
            if (r4 == null) goto L13;
            boolean r0 = true;
            if (r4.length < 1) goto L13;
            if ((r4[0] & 1) == 1) goto L10;
            r0 = false;
        L10:
            this.isOpen = r0;
            return;
        L13:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L15:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "BloodOxygenFunc{isOpen=" + this.isOpen + "} ";
        }
    }

    public static class CombineFunc extends BaseFunc {
        private boolean isSupportAutoPressureDetection;
        private boolean isSupportFallDetection;
        private boolean isSupportHealthMonitoring;
        private boolean isSupportPersonalInfo;
        private boolean isSupportSedentaryReminder;
        private boolean isSupportSensorSettings;
        private boolean isSupportSleepDetection;
        private boolean isSupportSportRateReminder;

        public CombineFunc(int r2, byte[] r3) throws RuntimeException {
            super(255, r2, r3);
        }

        public boolean isSupportAutoPressureDetection() {
            return this.isSupportAutoPressureDetection;
        }

        public boolean isSupportFallDetection() {
            return this.isSupportFallDetection;
        }

        public boolean isSupportHealthMonitoring() {
            return this.isSupportHealthMonitoring;
        }

        public boolean isSupportPersonalInfo() {
            return this.isSupportPersonalInfo;
        }

        public boolean isSupportSedentaryReminder() {
            return this.isSupportSedentaryReminder;
        }

        public boolean isSupportSensorSettings() {
            return this.isSupportSensorSettings;
        }

        public boolean isSupportSleepDetection() {
            return this.isSupportSleepDetection;
        }

        public boolean isSupportSportRateReminder() {
            return this.isSupportSportRateReminder;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L43;
            if (r4 == null) goto L41;
            boolean r0 = true;
            if (r4.length < 1) goto L41;
            byte r5 = r4[0];
            if ((r5 & 1) != 1) goto L9;
            boolean r1 = true;
        L10:
            this.isSupportHealthMonitoring = r1;
            if (((r5 >> 1) & 1) != 1) goto L13;
            boolean r2 = true;
        L14:
            this.isSupportPersonalInfo = r2;
            if (((r5 >> 2) & 1) != 1) goto L17;
            boolean r6 = true;
        L18:
            this.isSupportSleepDetection = r6;
            if (((r5 >> 3) & 1) != 1) goto L21;
            boolean r7 = true;
        L22:
            this.isSupportSedentaryReminder = r7;
            if (((r5 >> 4) & 1) != 1) goto L25;
            boolean r8 = true;
        L26:
            this.isSupportSportRateReminder = r8;
            if (((r5 >> 5) & 1) != 1) goto L29;
            boolean r9 = true;
        L30:
            this.isSupportAutoPressureDetection = r9;
            if (((r5 >> 6) & 1) != 1) goto L33;
            boolean r10 = true;
        L34:
            this.isSupportFallDetection = r10;
            if (((r5 >> 7) & 1) == 1) goto L38;
            r0 = false;
        L38:
            this.isSupportSensorSettings = r0;
            return;
        L33:
            r10 = false;
            goto L34
        L29:
            r9 = false;
            goto L30
        L25:
            r8 = false;
            goto L26
        L21:
            r7 = false;
            goto L22
        L17:
            r6 = false;
            goto L18
        L13:
            r2 = false;
            goto L14
        L9:
            r1 = false;
        L41:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L43:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "CombineFunc{isSupportHealthMonitoring=" + this.isSupportHealthMonitoring + ", isSupportPersonalInfo=" + this.isSupportPersonalInfo + ", isSupportSleepDetection=" + this.isSupportSleepDetection + ", isSupportSedentaryReminder=" + this.isSupportSedentaryReminder + ", isSupportSportRateReminder=" + this.isSupportSportRateReminder + ", isSupportAutoPressureDetection=" + this.isSupportAutoPressureDetection + ", isSupportFallDetection=" + this.isSupportFallDetection + ", isSupportSensorSettings=" + this.isSupportSensorSettings + "} ";
        }
    }

    public static class GPSFunc extends BaseFunc {
        private boolean isOpen;

        public GPSFunc(int r2, byte[] r3) throws RuntimeException {
            super(4, r2, r3);
        }

        public boolean isOpen() {
            return this.isOpen;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L15;
            if (r4 == null) goto L13;
            boolean r0 = true;
            if (r4.length < 1) goto L13;
            if ((r4[0] & 1) == 1) goto L10;
            r0 = false;
        L10:
            this.isOpen = r0;
            return;
        L13:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L15:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "GPSFunc{isOpen=" + this.isOpen + "} ";
        }
    }

    public static class GSensorFunc extends BaseFunc {
        private boolean isEnableSportStep;
        private boolean isOpen;

        public GSensorFunc(int r2, byte[] r3) throws RuntimeException {
            super(0, r2, r3);
        }

        public boolean isEnableSportStep() {
            return this.isEnableSportStep;
        }

        public boolean isOpen() {
            return this.isOpen;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L19;
            if (r4 == null) goto L17;
            boolean r0 = true;
            if (r4.length < 1) goto L17;
            byte r5 = r4[0];
            if ((r5 & 1) != 1) goto L9;
            boolean r1 = true;
        L10:
            this.isOpen = r1;
            if (((r5 >> 1) & 1) == 1) goto L14;
            r0 = false;
        L14:
            this.isEnableSportStep = r0;
            return;
        L9:
            r1 = false;
        L17:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L19:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "GSensorFunc{, isOpen=" + this.isOpen + ", isEnableSportStep=" + this.isEnableSportStep + "} ";
        }
    }

    public static class RateFunc extends BaseFunc {
        private boolean isEnableContinuousTest;
        private boolean isOpen;

        public RateFunc(int r2, byte[] r3) throws RuntimeException {
            super(1, r2, r3);
        }

        public boolean isEnableContinuousTest() {
            return this.isEnableContinuousTest;
        }

        public boolean isOpen() {
            return this.isOpen;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L19;
            if (r4 == null) goto L17;
            boolean r0 = true;
            if (r4.length < 1) goto L17;
            byte r5 = r4[0];
            if ((r5 & 1) != 1) goto L9;
            boolean r1 = true;
        L10:
            this.isOpen = r1;
            if (((r5 >> 1) & 1) == 1) goto L14;
            r0 = false;
        L14:
            this.isEnableContinuousTest = r0;
            return;
        L9:
            r1 = false;
        L17:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L19:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "RateFunc{isOpen=" + this.isOpen + ", isEnableContinuousTest=" + this.isEnableContinuousTest + "} ";
        }
    }

    public static class SportModeFunc extends BaseFunc {
        private boolean isSupportCount;
        private boolean isSupportInDoor;
        private boolean isSupportOutDoor;
        private boolean isSupportRecord;

        public SportModeFunc(int r2, byte[] r3) throws RuntimeException {
            super(254, r2, r3);
        }

        public boolean isSupportCount() {
            return this.isSupportCount;
        }

        public boolean isSupportInDoor() {
            return this.isSupportInDoor;
        }

        public boolean isSupportOutDoor() {
            return this.isSupportOutDoor;
        }

        public boolean isSupportRecord() {
            return this.isSupportRecord;
        }

        @Override // com.jieli.jl_rcsp.model.SportHealthConfigure.BaseFunc
        public void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L27;
            if (r4 == null) goto L25;
            boolean r0 = true;
            if (r4.length < 1) goto L25;
            byte r5 = r4[0];
            if ((r5 & 1) != 1) goto L9;
            boolean r1 = true;
        L10:
            this.isSupportRecord = r1;
            if (((r5 >> 1) & 1) != 1) goto L13;
            boolean r2 = true;
        L14:
            this.isSupportCount = r2;
            if (((r5 >> 2) & 1) != 1) goto L17;
            boolean r6 = true;
        L18:
            this.isSupportOutDoor = r6;
            if (((r5 >> 3) & 1) == 1) goto L22;
            r0 = false;
        L22:
            this.isSupportInDoor = r0;
            return;
        L17:
            r6 = false;
            goto L18
        L13:
            r2 = false;
            goto L14
        L9:
            r1 = false;
        L25:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L27:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public String toString() {
            return "SportModeFunc{isSupportRecord=" + this.isSupportRecord + ", isSupportCount=" + this.isSupportCount + ", isSupportOutDoor=" + this.isSupportOutDoor + ", isSupportInDoor=" + this.isSupportInDoor + "} ";
        }
    }

    public SportHealthConfigure(int r1, byte[] r2) throws RuntimeException {
        parseData(r1, r2);
    }

    private void parseData(int r5, byte[] r6) throws RuntimeException {
        if (r5 != 0) goto L33;
        if (r6 == null) goto L31;
        if (r6.length < 2) goto L31;
        Iterator<LtvBean> r7 = RcspUtil.parseLTVData(r6).iterator();
    L8:
        if (r7.hasNext() == false) goto L29;
        LtvBean r0 = r7.next();
        byte[] r2 = r0.getData();
        int r1 = r0.getType();
        if (r1 != 254) goto L12;
        this.sportModeFunc = new SportModeFunc(r5, r2);
        goto L8
    L12:
        if (r1 != 255) goto L13;
        this.combineFunc = new CombineFunc(r5, r2);
        goto L8
    L13:
        if (r1 != 0) goto L15;
        this.gSensorFunc = new GSensorFunc(r5, r2);
        goto L8
    L15:
        if (r1 != 1) goto L16;
        this.rateFunc = new RateFunc(r5, r2);
        goto L8
    L16:
        if (r1 != 2) goto L18;
        this.bloodOxygenFunc = new BloodOxygenFunc(r5, r2);
        goto L8
    L18:
        if (r1 != 3) goto L20;
        this.altitudeFunc = new AltitudeFunc(r5, r2);
        goto L8
    L20:
        if (r1 != 4) goto L8;
        this.gpsFunc = new GPSFunc(r5, r2);
        goto L8
    L29:
        return;
    L31:
        throw new RuntimeException("Data exception : " + CHexConver.byte2HexStr(r6));
    L33:
        throw new RuntimeException("Unsupported version :  " + r5);
    }

    public AltitudeFunc getAltitudeFunc() {
        return this.altitudeFunc;
    }

    public BloodOxygenFunc getBloodOxygenFunc() {
        return this.bloodOxygenFunc;
    }

    public CombineFunc getCombineFunc() {
        return this.combineFunc;
    }

    public GSensorFunc getGSensorFunc() {
        return this.gSensorFunc;
    }

    public GPSFunc getGpsFunc() {
        return this.gpsFunc;
    }

    public RateFunc getRateFunc() {
        return this.rateFunc;
    }

    public SportModeFunc getSportModeFunc() {
        return this.sportModeFunc;
    }

    public boolean isExistAltitude() {
        if (this.altitudeFunc == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isExistBloodOxygen() {
        if (this.bloodOxygenFunc == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isExistGSensor() {
        if (this.gSensorFunc == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isExistGps() {
        if (this.gpsFunc == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isExistRate() {
        if (this.rateFunc == null) goto L6;
        return true;
    L6:
        return false;
    }

    public String toString() {
        return "SportHealthConfigure{gSensorFunc=" + this.gSensorFunc + ", rateFunc=" + this.rateFunc + ",bloodOxygenFunc=" + this.bloodOxygenFunc + ",altitudeFunc=" + this.altitudeFunc + ",gpsFunc=" + this.gpsFunc + ",sportModeFunc=" + this.sportModeFunc + ",combineFunc=" + this.combineFunc + i0XO1.IO;
    }
}
