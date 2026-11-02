package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.watch.ReceiveHealthDataCmd;
import com.jieli.jl_rcsp.model.command.watch.RequestHealthDataCmd;
import com.jieli.jl_rcsp.model.command.watch.SensorLogCmd;
import com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.health.AirPressure;
import com.jieli.jl_rcsp.model.device.health.Altitude;
import com.jieli.jl_rcsp.model.device.health.ExerciseRecoveryTime;
import com.jieli.jl_rcsp.model.device.health.HealthData;
import com.jieli.jl_rcsp.model.device.health.HeartRate;
import com.jieli.jl_rcsp.model.device.health.MaxOxygenUptake;
import com.jieli.jl_rcsp.model.device.health.OxygenSaturation;
import com.jieli.jl_rcsp.model.device.health.PressureDetection;
import com.jieli.jl_rcsp.model.device.health.SportsInfo;
import com.jieli.jl_rcsp.model.device.health.SportsSteps;
import com.jieli.jl_rcsp.model.device.health.TrainingLoad;
import com.jieli.jl_rcsp.tool.callback.RcspEventListenerManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class HealthDataParseHelper {
    public static final String d = "HealthDataParseHelper";
    public final RcspEventListenerManager a;
    public final RcspOpImpl b;
    public RecombineHealthDataBuffer c;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.tool.HealthDataParseHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class RecombineHealthDataBuffer {
        public final Map<String, List<ReceiveHealthDataCmd.Param>> a;

        public RecombineHealthDataBuffer() {
            this.a = new HashMap();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public byte[] pushAndReturnResult(String r6, ReceiveHealthDataCmd r7) {
            ReceiveHealthDataCmd.Param r8 = (ReceiveHealthDataCmd.Param) r7.getParam();
            List<ReceiveHealthDataCmd.Param> r0 = this.a.get(r6);
            if (r0 != null) goto L6;
            r0 = new ArrayList();
            this.a.put(r6, r0);
        L8:
            r0.add(r8);
            int r9 = r8.packageId + 1;
            byte r10 = r8.packageCount;
            if (r9 != r10) goto L20;
            ByteBuffer r11 = ByteBuffer.allocate(r10 * 512);
            Iterator<ReceiveHealthDataCmd.Param> r12 = r0.iterator();
            byte r2 = -1;
        L12:
            if (r12.hasNext() == false) goto L18;
            ReceiveHealthDataCmd.Param r3 = r12.next();
            r11.put(r3.data);
            byte r4 = r3.packageId;
            if (r4 != (r2 + 1)) goto L15;
            r2 = r4;
            goto L12
        L15:
            r0.clear();
            JL_Log.w(RecombineHealthDataBuffer.class.getSimpleName(), "pushAndReturnResult", "数据异常:packageId不连续");
            return null;
        L18:
            byte[] r13 = new byte[r11.position()];
            r11.flip();
            r11.get(r13);
            r0.clear();
            return r13;
        L20:
            return null;
        L6:
            if (r8.packageId != 0) goto L8;
            r0.clear();
            goto L8
        }

        public /* synthetic */ RecombineHealthDataBuffer(AnonymousClass1 r1) {
            this();
        }
    }

    static {
    }

    public HealthDataParseHelper(RcspOpImpl r1, RcspEventListenerManager r2) {
        this.a = r2;
        this.b = r1;
    }

    public final void a(BluetoothDevice r9, int r10, byte[] r11) {
        if (r10 == 0) goto L6;
        JL_Log.w(d, "handleHealthData", "no implement parse version = " + r10 + " health data");
        return;
    L6:
        int r2 = 0;
    L7:
        int r3 = r2 + 4;
        if (r3 > r11.length) goto L20;
        int r4 = CHexConver.bytesToInt(r11[r2], r11[r2 + 1]);
        byte r5 = r11[r2 + 2];
        byte r6 = r11[r2 + 3];
        int r7 = r4 - 2;
        if (r7 <= 0) goto L11;
        int r8 = r3 + r7;
        if (r8 > r11.length) goto L14;
        byte[] r12 = new byte[r7];
        System.arraycopy(r11, r3, r12, 0, r7);
        RcspEventListenerManager r13 = this.a;
        if (r13 == null) goto L19;
        r13.onHealthDataChange(r9, a(r10, r5, r6, r12));
    L19:
        r2 = r8;
        goto L7
    L14:
        JL_Log.w(d, "handleHealthData", "health sensor data length error.");
        return;
    L11:
        JL_Log.w(d, "handleHealthData", "missing health sensor data.");
        r2 = r3;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void receiveCmdFromDevice(BluetoothDevice r4, CommandBase r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.getStatus() != 0) goto L49;
        int r0 = r5.getId();
        byte r2 = 0;
        if (r0 != 160) goto L9;
        RequestHealthDataCmd r6 = (RequestHealthDataCmd) r5;
        RequestHealthDataCmd.Response r1 = r6.getResponse();
        RequestHealthDataCmd.Param r7 = r6.getParam();
        if (r7 == null) goto L37;
        r2 = r7.version;
    L37:
        if (r1 != null) goto L39;
        return;
    L39:
        if (r1.ret == 0) goto L41;
        return;
    L41:
        if (r1.flag == 0) goto L52;
        a(r4, r2, r1.data);
        return;
    L52:
        return;
    L9:
        if (r0 != 166) goto L11;
        a(r4, (SportsInfoStatusSyncCmd) r5);
        return;
    L11:
        if (r0 != 162) goto L13;
        ReceiveHealthDataCmd r8 = (ReceiveHealthDataCmd) r5;
        ReceiveHealthDataCmd.Param r3 = (ReceiveHealthDataCmd.Param) r8.getParam();
        if (r3 == null) goto L22;
        r2 = r3.version;
    L22:
        if (this.c != null) goto L24;
        this.c = new RecombineHealthDataBuffer(null);
    L24:
        byte[] r9 = this.c.pushAndReturnResult(r4.getAddress(), r8);
        if (r9 != null) goto L27;
        return;
    L27:
        if (r9.length == 0) goto L51;
        a(r4, r2, r9);
        return;
    L51:
        return;
    L13:
        if (r0 != 163) goto L50;
        SensorLogCmd r10 = (SensorLogCmd) r5;
        int r11 = ((SensorLogCmd.Param) r10.getParam()).type;
        byte[] r12 = ((SensorLogCmd.Param) r10.getParam()).data;
        this.a.onSensorLogDataChange(r4, r11, r12);
        return;
    L50:
        return;
    }

    public final HealthData a(int r2, int r3, byte r4, byte[] r5) {
        switch(r3) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        return new HealthData(r3, r4, r5, r2);
    L6:
        return new ExerciseRecoveryTime(r2, r4, r5);
    L8:
        return new MaxOxygenUptake(r2, r4, r5);
    L10:
        return new TrainingLoad(r2, r4, r5);
    L12:
        return new OxygenSaturation(r2, r4, r5);
    L14:
        return new PressureDetection(r2, r4, r5);
    L16:
        return new SportsSteps(r2, r4, r5);
    L18:
        return new Altitude(r2, r4, r5);
    L20:
        return new AirPressure(r2, r4, r5);
    L22:
        return new HeartRate(r2, r4, r5);
    }

    public final void a(BluetoothDevice r7, SportsInfoStatusSyncCmd r8) {
        DeviceInfo r0 = this.b.getDeviceInfo(r7);
        if (r0 == null) goto L87;
        SportsInfoStatusSyncCmd.Param r1 = r8.getParam();
        SportsInfo r2 = r0.getSportsInfo();
        if (r2 != null) goto L8;
        r2 = new SportsInfo();
        r0.setSportsInfo(r2);
    L8:
        byte r3 = r1.getOp();
        if (r3 == 0) goto L72;
        boolean r4 = true;
        if (r3 != 1) goto L13;
        SportsInfoStatusSyncCmd.StartSportsParam r9 = (SportsInfoStatusSyncCmd.StartSportsParam) r8.getParam();
        if (r9 == null) goto L91;
        r2.setMode(r9.type).setState(1);
        RcspEventListenerManager r10 = this.a;
        if (r10 == null) goto L85;
        r10.onSportsState(r7, r2.getState());
        return;
    L85:
        return;
    L91:
        return;
    L13:
        if (r3 != 2) goto L15;
        SportsInfoStatusSyncCmd.AppStopSportsResponse r11 = (SportsInfoStatusSyncCmd.AppStopSportsResponse) r8.getResponse();
        if (r11 != null) goto L56;
        return;
    L56:
        if (r2.getState() != 0) goto L59;
        r4 = false;
    L59:
        r2.setState(0).setEndTime(r11.stopTime).setRecoveryTime(r11.restoreTime).setRecordFileId(r11.fileId).setRecordFileSize(r11.fileSize).setExerciseIntensityState(a(r11.strengthIntervalTimer));
        RcspEventListenerManager r12 = this.a;
        if (r12 == null) goto L84;
        if (r4 == false) goto L63;
        r12.onSportsState(r7, r2.getState());
    L63:
        this.a.onSportInfoChange(r7, r2);
        return;
    L84:
        return;
    L15:
        if (r3 != 3) goto L17;
        SportsInfoStatusSyncCmd.FirmwareStopSportsParam r13 = (SportsInfoStatusSyncCmd.FirmwareStopSportsParam) r8.getParam();
        if (r13 != null) goto L43;
        return;
    L43:
        if (r2.getState() != 0) goto L46;
        r4 = false;
    L46:
        r2.setState(0).setEndTime(r13.stopTime).setRecoveryTime(r13.restoreTime).setRecordFileId(r13.fileId).setRecordFileSize(r13.fileSize).setExerciseIntensityState(a(r13.strengthIntervalTimer));
        RcspEventListenerManager r14 = this.a;
        if (r14 == null) goto L83;
        if (r4 == false) goto L50;
        r14.onSportsState(r7, r2.getState());
    L50:
        this.a.onSportInfoChange(r7, r2);
        return;
    L83:
        return;
    L17:
        if (r3 == 4) goto L31;
        if (r3 == 5) goto L22;
        return;
    L22:
        if (r2.getState() != 3) goto L25;
        r4 = false;
    L25:
        r2.setState(3);
        RcspEventListenerManager r15 = this.a;
        if (r15 == null) goto L79;
        if (r4 == false) goto L80;
        r15.onSportsState(r7, r2.getState());
        return;
    L80:
        return;
    L79:
        return;
    L31:
        if (r2.getState() != 2) goto L34;
        r4 = false;
    L34:
        r2.setState(2);
        RcspEventListenerManager r16 = this.a;
        if (r16 == null) goto L81;
        if (r4 == false) goto L82;
        r16.onSportsState(r7, r2.getState());
        return;
    L82:
        return;
    L81:
        return;
    L72:
        SportsInfoStatusSyncCmd.ReadSportsInfoResponse r17 = (SportsInfoStatusSyncCmd.ReadSportsInfoResponse) r8.getResponse();
        if (r17 == null) goto L92;
        r2.setId(r17.id).setMode(r17.type).setState(r17.status).setNeedAppGPS(r17.hasGps).setHeartRateMode(r17.heartRateMode).setReadRealTimeDataInterval(r17.readReadDataInterval);
        RcspEventListenerManager r18 = this.a;
        if (r18 == null) goto L86;
        r18.onSportInfoChange(r7, r2);
        return;
    L86:
        return;
    L92:
        return;
    }

    public final int[] a(byte[] r6) {
        if (r6 != null) goto L4;
        return null;
    L4:
        if (r6.length < 20) goto L18;
        ArrayList r0 = new ArrayList();
        int r1 = 0;
        int r2 = 0;
    L7:
        int r3 = r2 + 4;
        if (r3 > r6.length) goto L10;
        r0.add(Integer.valueOf(CHexConver.bytesToInt(r6, r2, 4)));
        r2 = r3;
        goto L7
    L10:
        int r7 = r0.size();
        int[] r4 = new int[r7];
    L11:
        if (r1 >= r7) goto L13;
        r4[r1] = ((Integer) r0.get(r1)).intValue();
        r1 = r1 + 1;
        goto L11
    L13:
        return r4;
    L18:
        return null;
    }
}
