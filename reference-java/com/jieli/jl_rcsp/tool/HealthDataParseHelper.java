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
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class HealthDataParseHelper {

    /* JADX INFO: renamed from: d */
    public static final String f38189d = "HealthDataParseHelper";

    /* JADX INFO: renamed from: a */
    public final RcspEventListenerManager f38190a;

    /* JADX INFO: renamed from: b */
    public final RcspOpImpl f38191b;

    /* JADX INFO: renamed from: c */
    public RecombineHealthDataBuffer f38192c;

    public static class RecombineHealthDataBuffer {

        /* JADX INFO: renamed from: a */
        public final Map<String, List<ReceiveHealthDataCmd.Param>> f38193a;

        public RecombineHealthDataBuffer() {
            this.f38193a = new HashMap();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public byte[] pushAndReturnResult(String str, ReceiveHealthDataCmd receiveHealthDataCmd) {
            ReceiveHealthDataCmd.Param param = (ReceiveHealthDataCmd.Param) receiveHealthDataCmd.getParam();
            List<ReceiveHealthDataCmd.Param> arrayList = this.f38193a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f38193a.put(str, arrayList);
            } else if (param.packageId == 0) {
                arrayList.clear();
            }
            arrayList.add(param);
            int i = param.packageId + 1;
            byte b = param.packageCount;
            if (i != b) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b * 512);
            byte b2 = -1;
            for (ReceiveHealthDataCmd.Param param2 : arrayList) {
                byteBufferAllocate.put(param2.data);
                byte b3 = param2.packageId;
                if (b3 != b2 + 1) {
                    arrayList.clear();
                    JL_Log.m27887w(RecombineHealthDataBuffer.class.getSimpleName(), "pushAndReturnResult", "数据异常:packageId不连续");
                    return null;
                }
                b2 = b3;
            }
            byte[] bArr = new byte[byteBufferAllocate.position()];
            byteBufferAllocate.flip();
            byteBufferAllocate.get(bArr);
            arrayList.clear();
            return bArr;
        }
    }

    public HealthDataParseHelper(RcspOpImpl rcspOpImpl, RcspEventListenerManager rcspEventListenerManager) {
        this.f38190a = rcspEventListenerManager;
        this.f38191b = rcspOpImpl;
    }

    /* JADX INFO: renamed from: a */
    public final void m27622a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (i != 0) {
            JL_Log.m27887w(f38189d, "handleHealthData", "no implement parse version = " + i + " health data");
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 4;
            if (i3 > bArr.length) {
                return;
            }
            int iBytesToInt = CHexConver.bytesToInt(bArr[i2], bArr[i2 + 1]);
            byte b = bArr[i2 + 2];
            byte b2 = bArr[i2 + 3];
            int i4 = iBytesToInt - 2;
            if (i4 <= 0) {
                JL_Log.m27887w(f38189d, "handleHealthData", "missing health sensor data.");
                i2 = i3;
            } else {
                int i5 = i3 + i4;
                if (i5 > bArr.length) {
                    JL_Log.m27887w(f38189d, "handleHealthData", "health sensor data length error.");
                    return;
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, i3, bArr2, 0, i4);
                RcspEventListenerManager rcspEventListenerManager = this.f38190a;
                if (rcspEventListenerManager != null) {
                    rcspEventListenerManager.onHealthDataChange(bluetoothDevice, m27621a(i, b, b2, bArr2));
                }
                i2 = i5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void receiveCmdFromDevice(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
        byte b;
        if (commandBase == null || commandBase.getStatus() != 0) {
            return;
        }
        int id = commandBase.getId();
        if (id == 160) {
            RequestHealthDataCmd requestHealthDataCmd = (RequestHealthDataCmd) commandBase;
            RequestHealthDataCmd.Response response = requestHealthDataCmd.getResponse();
            RequestHealthDataCmd.Param param = requestHealthDataCmd.getParam();
            b = param != null ? param.version : (byte) 0;
            if (response == null || response.ret != 0 || response.flag == 0) {
                return;
            }
            m27622a(bluetoothDevice, b, response.data);
            return;
        }
        if (id == 166) {
            m27623a(bluetoothDevice, (SportsInfoStatusSyncCmd) commandBase);
            return;
        }
        if (id != 162) {
            if (id != 163) {
                return;
            }
            SensorLogCmd sensorLogCmd = (SensorLogCmd) commandBase;
            this.f38190a.onSensorLogDataChange(bluetoothDevice, ((SensorLogCmd.Param) sensorLogCmd.getParam()).type, ((SensorLogCmd.Param) sensorLogCmd.getParam()).data);
            return;
        }
        ReceiveHealthDataCmd receiveHealthDataCmd = (ReceiveHealthDataCmd) commandBase;
        ReceiveHealthDataCmd.Param param2 = (ReceiveHealthDataCmd.Param) receiveHealthDataCmd.getParam();
        b = param2 != null ? param2.version : (byte) 0;
        if (this.f38192c == null) {
            this.f38192c = new RecombineHealthDataBuffer();
        }
        byte[] bArrPushAndReturnResult = this.f38192c.pushAndReturnResult(bluetoothDevice.getAddress(), receiveHealthDataCmd);
        if (bArrPushAndReturnResult == null || bArrPushAndReturnResult.length == 0) {
            return;
        }
        m27622a(bluetoothDevice, b, bArrPushAndReturnResult);
    }

    /* JADX INFO: renamed from: a */
    public final HealthData m27621a(int i, int i2, byte b, byte[] bArr) {
        switch (i2) {
            case 0:
                return new HeartRate(i, b, bArr);
            case 1:
                return new AirPressure(i, b, bArr);
            case 2:
                return new Altitude(i, b, bArr);
            case 3:
                return new SportsSteps(i, b, bArr);
            case 4:
                return new PressureDetection(i, b, bArr);
            case 5:
                return new OxygenSaturation(i, b, bArr);
            case 6:
                return new TrainingLoad(i, b, bArr);
            case 7:
                return new MaxOxygenUptake(i, b, bArr);
            case 8:
                return new ExerciseRecoveryTime(i, b, bArr);
            default:
                return new HealthData(i2, b, bArr, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27623a(BluetoothDevice bluetoothDevice, SportsInfoStatusSyncCmd sportsInfoStatusSyncCmd) {
        boolean z;
        DeviceInfo deviceInfo = this.f38191b.getDeviceInfo(bluetoothDevice);
        if (deviceInfo == null) {
            return;
        }
        SportsInfoStatusSyncCmd.Param param = sportsInfoStatusSyncCmd.getParam();
        SportsInfo sportsInfo = deviceInfo.getSportsInfo();
        if (sportsInfo == null) {
            sportsInfo = new SportsInfo();
            deviceInfo.setSportsInfo(sportsInfo);
        }
        byte op = param.getOp();
        if (op == 0) {
            SportsInfoStatusSyncCmd.ReadSportsInfoResponse readSportsInfoResponse = (SportsInfoStatusSyncCmd.ReadSportsInfoResponse) sportsInfoStatusSyncCmd.getResponse();
            if (readSportsInfoResponse == null) {
                return;
            }
            sportsInfo.setId(readSportsInfoResponse.f38025id).setMode(readSportsInfoResponse.type).setState(readSportsInfoResponse.status).setNeedAppGPS(readSportsInfoResponse.hasGps).setHeartRateMode(readSportsInfoResponse.heartRateMode).setReadRealTimeDataInterval(readSportsInfoResponse.readReadDataInterval);
            RcspEventListenerManager rcspEventListenerManager = this.f38190a;
            if (rcspEventListenerManager != null) {
                rcspEventListenerManager.onSportInfoChange(bluetoothDevice, sportsInfo);
                return;
            }
            return;
        }
        if (op == 1) {
            SportsInfoStatusSyncCmd.StartSportsParam startSportsParam = (SportsInfoStatusSyncCmd.StartSportsParam) sportsInfoStatusSyncCmd.getParam();
            if (startSportsParam == null) {
                return;
            }
            sportsInfo.setMode(startSportsParam.type).setState(1);
            RcspEventListenerManager rcspEventListenerManager2 = this.f38190a;
            if (rcspEventListenerManager2 != null) {
                rcspEventListenerManager2.onSportsState(bluetoothDevice, sportsInfo.getState());
                return;
            }
            return;
        }
        if (op == 2) {
            SportsInfoStatusSyncCmd.AppStopSportsResponse appStopSportsResponse = (SportsInfoStatusSyncCmd.AppStopSportsResponse) sportsInfoStatusSyncCmd.getResponse();
            if (appStopSportsResponse == null) {
                return;
            }
            z = sportsInfo.getState() != 0;
            sportsInfo.setState(0).setEndTime(appStopSportsResponse.stopTime).setRecoveryTime(appStopSportsResponse.restoreTime).setRecordFileId(appStopSportsResponse.fileId).setRecordFileSize(appStopSportsResponse.fileSize).setExerciseIntensityState(m27624a(appStopSportsResponse.strengthIntervalTimer));
            RcspEventListenerManager rcspEventListenerManager3 = this.f38190a;
            if (rcspEventListenerManager3 != null) {
                if (z) {
                    rcspEventListenerManager3.onSportsState(bluetoothDevice, sportsInfo.getState());
                }
                this.f38190a.onSportInfoChange(bluetoothDevice, sportsInfo);
                return;
            }
            return;
        }
        if (op == 3) {
            SportsInfoStatusSyncCmd.FirmwareStopSportsParam firmwareStopSportsParam = (SportsInfoStatusSyncCmd.FirmwareStopSportsParam) sportsInfoStatusSyncCmd.getParam();
            if (firmwareStopSportsParam == null) {
                return;
            }
            z = sportsInfo.getState() != 0;
            sportsInfo.setState(0).setEndTime(firmwareStopSportsParam.stopTime).setRecoveryTime(firmwareStopSportsParam.restoreTime).setRecordFileId(firmwareStopSportsParam.fileId).setRecordFileSize(firmwareStopSportsParam.fileSize).setExerciseIntensityState(m27624a(firmwareStopSportsParam.strengthIntervalTimer));
            RcspEventListenerManager rcspEventListenerManager4 = this.f38190a;
            if (rcspEventListenerManager4 != null) {
                if (z) {
                    rcspEventListenerManager4.onSportsState(bluetoothDevice, sportsInfo.getState());
                }
                this.f38190a.onSportInfoChange(bluetoothDevice, sportsInfo);
                return;
            }
            return;
        }
        if (op == 4) {
            z = sportsInfo.getState() != 2;
            sportsInfo.setState(2);
            RcspEventListenerManager rcspEventListenerManager5 = this.f38190a;
            if (rcspEventListenerManager5 == null || !z) {
                return;
            }
            rcspEventListenerManager5.onSportsState(bluetoothDevice, sportsInfo.getState());
            return;
        }
        if (op != 5) {
            return;
        }
        z = sportsInfo.getState() != 3;
        sportsInfo.setState(3);
        RcspEventListenerManager rcspEventListenerManager6 = this.f38190a;
        if (rcspEventListenerManager6 == null || !z) {
            return;
        }
        rcspEventListenerManager6.onSportsState(bluetoothDevice, sportsInfo.getState());
    }

    /* JADX INFO: renamed from: a */
    public final int[] m27624a(byte[] bArr) {
        if (bArr == null || bArr.length < 20) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > bArr.length) {
                break;
            }
            arrayList.add(Integer.valueOf(CHexConver.bytesToInt(bArr, i, 4)));
            i = i2;
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }
}
