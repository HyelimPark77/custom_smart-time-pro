package com.jieli.jl_rcsp.model;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.DeviceConfiguration;
import com.jieli.jl_rcsp.model.device.settings.v0.DialExpandInfo;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class WatchConfigure extends DeviceConfiguration {
    private DialExpandInfo dialExpandInfo;
    private FunctionOption functionOption;
    private NecessaryFunc necessaryFunc;
    private SportHealthConfigure sportHealthConfigure;
    private SystemSetup systemSetup;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.model.WatchConfigure$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class DataBlock {
        public byte[] data;
        public int offset;

        private DataBlock() {
        }

        public /* synthetic */ DataBlock(AnonymousClass1 r1) {
            this();
        }
    }

    public static class FunctionOption {
        private final byte[] data;
        private boolean isSupportAICloud;
        private boolean isSupportAIDial;
        private boolean isSupportAlarmSetting;
        private boolean isSupportContacts;
        private boolean isSupportDialExpandInfo;
        private boolean isSupportFileBrowse;
        private boolean isSupportMessageSync;
        private boolean isSupportMusicTransfer;
        private boolean isSupportNetworkModule;
        private boolean isSupportPlatformInfo;
        private boolean isSupportSearchDevice;
        private boolean isSupportWeatherSync;
        private final int version;

        public FunctionOption(int r1, byte[] r2) throws RuntimeException {
            this.version = r1;
            this.data = r2;
            parseData(r1, r2);
        }

        private void parseData(int r6, byte[] r7) throws RuntimeException {
            if (r6 != 0) goto L14;
            if (r7 == null) goto L12;
            if (r7.length < 1) goto L12;
            byte r1 = r7[0];
            this.isSupportContacts = CHexConver.checkBitValue(r1, 0);
            this.isSupportFileBrowse = CHexConver.checkBitValue(r1, 1);
            this.isSupportMusicTransfer = CHexConver.checkBitValue(r1, 2);
            this.isSupportAlarmSetting = CHexConver.checkBitValue(r1, 3);
            this.isSupportMessageSync = CHexConver.checkBitValue(r1, 4);
            this.isSupportWeatherSync = CHexConver.checkBitValue(r1, 5);
            this.isSupportSearchDevice = CHexConver.checkBitValue(r1, 6);
            this.isSupportAICloud = CHexConver.checkBitValue(r1, 7);
            if (r7.length > 1) goto L9;
            return;
        L9:
            byte r8 = r7[1];
            this.isSupportAIDial = CHexConver.checkBitValue(r8, 0);
            this.isSupportPlatformInfo = CHexConver.checkBitValue(r8, 1);
            this.isSupportNetworkModule = CHexConver.checkBitValue(r8, 2);
            this.isSupportDialExpandInfo = CHexConver.checkBitValue(r8, 3);
            return;
        L12:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r7));
        L14:
            throw new RuntimeException("Unsupported version :  " + r6);
        }

        public byte[] getData() {
            return this.data;
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isSupportAICloud() {
            return this.isSupportAICloud;
        }

        public boolean isSupportAIDial() {
            return this.isSupportAIDial;
        }

        public boolean isSupportAlarmSetting() {
            return this.isSupportAlarmSetting;
        }

        public boolean isSupportContacts() {
            return this.isSupportContacts;
        }

        public boolean isSupportDialExpandInfo() {
            return this.isSupportDialExpandInfo;
        }

        public boolean isSupportFileBrowse() {
            return this.isSupportFileBrowse;
        }

        public boolean isSupportMessageSync() {
            return this.isSupportMessageSync;
        }

        public boolean isSupportMusicTransfer() {
            return this.isSupportMusicTransfer;
        }

        public boolean isSupportNetworkModule() {
            return this.isSupportNetworkModule;
        }

        public boolean isSupportPlatformInfo() {
            return this.isSupportPlatformInfo;
        }

        public boolean isSupportSearchDevice() {
            return this.isSupportSearchDevice;
        }

        public boolean isSupportWeatherSync() {
            return this.isSupportWeatherSync;
        }

        public String toString() {
            return "FunctionOption{isSupportContacts=" + this.isSupportContacts + ", isSupportFileBrowse=" + this.isSupportFileBrowse + ", isSupportMusicTransfer=" + this.isSupportMusicTransfer + ", isSupportAlarmSetting=" + this.isSupportAlarmSetting + ", isSupportMessageSync=" + this.isSupportMessageSync + ", isSupportWeatherSync=" + this.isSupportWeatherSync + ", isSupportSearchDevice=" + this.isSupportSearchDevice + ", isSupportAICloud=" + this.isSupportAICloud + ", isSupportAIDial=" + this.isSupportAIDial + ", isSupportPlatformInfo=" + this.isSupportPlatformInfo + ", isSupportNetworkModule=" + this.isSupportNetworkModule + ", isSupportDialExpandInfo=" + this.isSupportDialExpandInfo + i0XO1.IO;
        }
    }

    public static class NecessaryFunc {
        private final byte[] data;
        private boolean isSupportDialBrowse;
        private boolean isSupportDialOp;
        private boolean isSupportDialSwitch;
        private boolean isSupportOTA;
        private boolean isSupportResourceUpdate;
        private final int version;

        public NecessaryFunc(int r1, byte[] r2) throws RuntimeException {
            this.version = r1;
            this.data = r2;
            parseData(r1, r2);
        }

        private void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L31;
            if (r4 == null) goto L29;
            boolean r0 = true;
            if (r4.length < 1) goto L29;
            byte r5 = r4[0];
            if ((r5 & 1) != 1) goto L9;
            boolean r1 = true;
        L10:
            this.isSupportOTA = r1;
            if (((r5 >> 1) & 1) != 1) goto L13;
            boolean r2 = true;
        L14:
            this.isSupportResourceUpdate = r2;
            if (((r5 >> 2) & 1) != 1) goto L17;
            boolean r6 = true;
        L18:
            this.isSupportDialOp = r6;
            if (((r5 >> 3) & 1) != 1) goto L21;
            boolean r7 = true;
        L22:
            this.isSupportDialSwitch = r7;
            if (((r5 >> 4) & 1) == 1) goto L26;
            r0 = false;
        L26:
            this.isSupportDialBrowse = r0;
            return;
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
        L29:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L31:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public byte[] getData() {
            return this.data;
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isSupportDialBrowse() {
            return this.isSupportDialBrowse;
        }

        public boolean isSupportDialOp() {
            return this.isSupportDialOp;
        }

        public boolean isSupportDialSwitch() {
            return this.isSupportDialSwitch;
        }

        public boolean isSupportOTA() {
            return this.isSupportOTA;
        }

        public boolean isSupportResourceUpdate() {
            return this.isSupportResourceUpdate;
        }

        public String toString() {
            return "NecessaryFunc{isSupportOTA=" + this.isSupportOTA + ", isSupportResourceUpdate=" + this.isSupportResourceUpdate + ", isSupportDialOp=" + this.isSupportDialOp + ", isSupportDialSwitch=" + this.isSupportDialSwitch + ", isSupportDialBrowse=" + this.isSupportDialBrowse + i0XO1.IO;
        }
    }

    public static class SystemSetup {
        private final byte[] data;
        private boolean isSupportBtDisconnectSetting;
        private boolean isSupportDNDMode;
        private boolean isSupportExerciseSetting;
        private boolean isSupportScreenSetting;
        private boolean isSupportVibrationSetting;
        private final int version;

        public SystemSetup(int r1, byte[] r2) throws RuntimeException {
            this.version = r1;
            this.data = r2;
            parseData(r1, r2);
        }

        private void parseData(int r3, byte[] r4) throws RuntimeException {
            if (r3 != 0) goto L31;
            if (r4 == null) goto L29;
            boolean r0 = true;
            if (r4.length < 1) goto L29;
            byte r5 = r4[0];
            if ((r5 & 1) != 1) goto L9;
            boolean r1 = true;
        L10:
            this.isSupportScreenSetting = r1;
            if (((r5 >> 1) & 1) != 1) goto L13;
            boolean r2 = true;
        L14:
            this.isSupportVibrationSetting = r2;
            if (((r5 >> 2) & 1) != 1) goto L17;
            boolean r6 = true;
        L18:
            this.isSupportDNDMode = r6;
            if (((r5 >> 3) & 1) != 1) goto L21;
            boolean r7 = true;
        L22:
            this.isSupportExerciseSetting = r7;
            if (((r5 >> 4) & 1) == 1) goto L26;
            r0 = false;
        L26:
            this.isSupportBtDisconnectSetting = r0;
            return;
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
        L29:
            throw new RuntimeException(getClass().getSimpleName() + " : Data exception : " + CHexConver.byte2HexStr(r4));
        L31:
            throw new RuntimeException("Unsupported version :  " + r3);
        }

        public byte[] getData() {
            return this.data;
        }

        public int getVersion() {
            return this.version;
        }

        public boolean isSupportBtDisconnectSetting() {
            return this.isSupportBtDisconnectSetting;
        }

        public boolean isSupportDNDMode() {
            return this.isSupportDNDMode;
        }

        public boolean isSupportExerciseSetting() {
            return this.isSupportExerciseSetting;
        }

        public boolean isSupportScreenSetting() {
            return this.isSupportScreenSetting;
        }

        public boolean isSupportVibrationSetting() {
            return this.isSupportVibrationSetting;
        }

        public String toString() {
            return "SystemSetup{isSupportScreenSetting=" + this.isSupportScreenSetting + ", isSupportVibrationSetting=" + this.isSupportVibrationSetting + ", isSupportDNDMode=" + this.isSupportDNDMode + ", isSupportExerciseSetting=" + this.isSupportExerciseSetting + ", isSupportBtDisconnectSetting=" + this.isSupportBtDisconnectSetting + i0XO1.IO;
        }
    }

    public WatchConfigure(int r2, byte[] r3) throws RuntimeException {
        super(0, r2, r3);
        parsePayload(r3);
    }

    private void getDataBlock(byte[] r9, DataBlock r10) {
        if (r9 == null) goto L20;
        if (r10 == null) goto L21;
        int r0 = r10.offset;
        byte[] r2 = new byte[2];
        int r4 = 0;
    L6:
        int r5 = r0 + 2;
        if (r5 > r9.length) goto L12;
        System.arraycopy(r9, r0, r2, 0, 2);
        byte[] r6 = CHexConver.getBooleanArrayBig(r2[1]);
        r4 = r4 + 2;
        if (CHexConver.byteToInt(r6[r6.length - 1]) == 0) goto L13;
        r0 = r5;
    L13:
        if (r4 <= 0) goto L16;
        byte[] r1 = new byte[r4];
        System.arraycopy(r9, r10.offset, r1, 0, r4);
        r10.data = r1;
        return;
    L16:
        r10.data = new byte[0];
        return;
    L12:
        r4 = 0;
        goto L13
    L21:
        return;
    }

    private int parseData(int r6, byte[] r7) throws RuntimeException {
        if (r6 != 0) goto L30;
        if (r7 == null) goto L28;
        if (r7.length < 8) goto L28;
        DataBlock r0 = new DataBlock(null);
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r2 >= 3) goto L24;
        r0.offset = r3;
        getDataBlock(r7, r0);
        byte[] r4 = r0.data;
        if (r4.length == 0) goto L22;
        if (r2 != 0) goto L13;
        this.necessaryFunc = new NecessaryFunc(r6, r4);
    L20:
        r3 = r0.offset + r0.data.length;
        r0.offset = r3;
        r2 = r2 + 1;
        goto L8
    L13:
        if (r2 != 1) goto L15;
        this.systemSetup = new SystemSetup(r6, r4);
        goto L20
    L15:
        if (r2 != 2) goto L20;
        this.functionOption = new FunctionOption(r6, r4);
        goto L20
    L22:
        throw new RuntimeException("Data exception : not found block");
    L24:
        if ((r3 + 2) >= r7.length) goto L37;
        int r1 = r7.length - r3;
        byte[] r5 = new byte[r1];
        System.arraycopy(r7, r3, r5, 0, r1);
        int r8 = r3 + r1;
        this.sportHealthConfigure = new SportHealthConfigure(r6, r5);
        return r8;
    L37:
        return r3;
    L28:
        throw new RuntimeException("Data exception : " + CHexConver.byte2HexStr(r7));
    L30:
        throw new RuntimeException("Unsupported version :  " + r6);
    }

    public DialExpandInfo getDialExpandInfo() {
        return this.dialExpandInfo;
    }

    public FunctionOption getFunctionOption() {
        return this.functionOption;
    }

    public NecessaryFunc getNecessaryFunc() {
        return this.necessaryFunc;
    }

    public SportHealthConfigure getSportHealthConfigure() {
        return this.sportHealthConfigure;
    }

    public SystemSetup getSystemSetup() {
        return this.systemSetup;
    }

    @Override // com.jieli.jl_rcsp.model.device.DeviceConfiguration
    public int parsePayload(byte[] r2) throws RuntimeException {
        return parseData(getVersion(), r2);
    }

    public WatchConfigure setDialExpandInfo(DialExpandInfo r1) {
        this.dialExpandInfo = r1;
        return this;
    }

    public String toString() {
        return "WatchConfigure{version=" + getVersion() + ", data=" + CHexConver.byte2HexStr(getData()) + ", necessaryFunc=" + this.necessaryFunc + ", systemSetup=" + this.systemSetup + ", functionOption=" + this.functionOption + ", sportHealthConfigure=" + this.sportHealthConfigure + ", dialExpandInfo=" + this.dialExpandInfo + i0XO1.IO;
    }
}
