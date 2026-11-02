package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.facebook.login.widget.ToolTipPopup;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.alarm.IRTCOp;
import com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.LtvBean;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.AlarmExpandCmd;
import com.jieli.jl_rcsp.model.device.AlarmBean;
import com.jieli.jl_rcsp.model.device.AlarmListInfo;
import com.jieli.jl_rcsp.model.device.AuditionParam;
import com.jieli.jl_rcsp.model.device.DefaultAlarmBell;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.callback.RcspEventListenerManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.DataUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RTCOpImpl implements IRTCOp {
    public static final int WAY_NOTIFY = 1;
    public static final int WAY_REPLY = 0;

    /* JADX INFO: renamed from: f */
    public static final String f37933f = "RTCOpImpl";

    /* JADX INFO: renamed from: g */
    public static final int f37934g = 6000;

    /* JADX INFO: renamed from: h */
    public static final int f37935h = 41216;

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f37936a;

    /* JADX INFO: renamed from: b */
    public final DataTransferOpImpl f37937b;

    /* JADX INFO: renamed from: c */
    public OnOperationCallback<Boolean> f37938c;

    /* JADX INFO: renamed from: d */
    public final Handler f37939d = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.bc2
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f5707IO.m27405a(message);
        }
    });

    /* JADX INFO: renamed from: e */
    public final OnDataTransferListener f37940e;

    public static class BigRTCData {

        /* JADX INFO: renamed from: a */
        public int f37943a;

        /* JADX INFO: renamed from: b */
        public int f37944b;

        /* JADX INFO: renamed from: c */
        public byte[] f37945c;

        public BigRTCData(byte[] bArr) {
            m27407a(bArr);
        }

        /* JADX INFO: renamed from: a */
        public void m27407a(byte[] bArr) {
            int iByteToInt = CHexConver.byteToInt(bArr[0]);
            this.f37943a = iByteToInt;
            if (iByteToInt == 0) {
                this.f37944b = CHexConver.byteToInt(bArr[1]);
                int iMin = Math.min(CHexConver.bytesToInt(bArr, 2, 2), bArr.length - 4);
                byte[] bArr2 = new byte[iMin];
                this.f37945c = bArr2;
                System.arraycopy(bArr, 4, bArr2, 0, iMin);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BigRTCData{version=");
            sb.append(this.f37943a);
            sb.append(", way=");
            sb.append(this.f37944b);
            sb.append(", len=");
            byte[] bArr = this.f37945c;
            sb.append(bArr == null ? 0 : bArr.length);
            sb.append(", payload=");
            sb.append(CHexConver.byte2HexStr(this.f37945c));
            sb.append(i0XO1.f7442IO);
            return sb.toString();
        }
    }

    public class ReadAlarmRcspCallback implements RcspCommandCallback<CommandBase> {

        /* JADX INFO: renamed from: a */
        public final OnOperationCallback<Boolean> f37946a;

        public ReadAlarmRcspCallback(OnOperationCallback<Boolean> onOperationCallback) {
            this.f37946a = onOperationCallback;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
            if (commandBase.getStatus() == 0) {
                OnOperationCallback<Boolean> onOperationCallback = this.f37946a;
                if (onOperationCallback != null) {
                    onOperationCallback.onSuccess(Boolean.TRUE);
                    return;
                }
                return;
            }
            if (commandBase.getStatus() != 8) {
                onErrCode(bluetoothDevice, RcspErrorCode.buildJsonError(commandBase.getId(), 12292, commandBase.getStatus(), null));
                return;
            }
            JL_Log.m27887w(RTCOpImpl.f37933f, "STATUS_RESPONSE_DATA_OVER_LIMIT", "start .... MSG_WAIT_ALARM_DATA >> ");
            RTCOpImpl.this.f37938c = this.f37946a;
            RTCOpImpl.this.f37939d.removeMessages(RTCOpImpl.f37935h);
            RTCOpImpl.this.f37939d.sendEmptyMessageDelayed(RTCOpImpl.f37935h, ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME);
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
            OnOperationCallback<Boolean> onOperationCallback = this.f37946a;
            if (onOperationCallback != null) {
                onOperationCallback.onFailed(baseError);
            }
        }
    }

    public RTCOpImpl(RcspOpImpl rcspOpImpl) {
        OnDataTransferListener onDataTransferListener = new OnDataTransferListener() { // from class: com.jieli.jl_rcsp.impl.RTCOpImpl.2
            @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
            public void onError(BluetoothDevice bluetoothDevice, BaseError baseError) {
            }

            @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
            public void onReceiveData(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                if (i == 2) {
                    BigRTCData bigRTCData = new BigRTCData(bArr);
                    if (RTCOpImpl.this.m27406b() && bigRTCData.f37944b == 0) {
                        if (RTCOpImpl.this.f37938c != null) {
                            RTCOpImpl.this.f37938c.onSuccess(Boolean.TRUE);
                            RTCOpImpl.this.f37938c = null;
                        }
                        RTCOpImpl.this.f37939d.removeMessages(RTCOpImpl.f37935h);
                    }
                }
            }
        };
        this.f37940e = onDataTransferListener;
        if (rcspOpImpl == null) {
            throw new NullPointerException("WatchOpImpl can not be null.");
        }
        this.f37936a = rcspOpImpl;
        DataTransferOpImpl dataTransferOpImplInstance = DataTransferOpImpl.instance(rcspOpImpl);
        this.f37937b = dataTransferOpImplInstance;
        dataTransferOpImplInstance.addListener(onDataTransferListener);
    }

    public static void parseRTCBigData(RcspOpImpl rcspOpImpl, RcspEventListenerManager rcspEventListenerManager, byte[] bArr) {
        if (rcspOpImpl == null) {
            return;
        }
        BigRTCData bigRTCData = new BigRTCData(bArr);
        if (bigRTCData.f37943a == 0) {
            m27401a(rcspOpImpl, rcspEventListenerManager, bigRTCData.f37945c);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void addOrModifyAlarm(BluetoothDevice bluetoothDevice, AlarmBean alarmBean, OnOperationCallback<Boolean> onOperationCallback) {
        if (alarmBean != null) {
            this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildSetAlarmCmd(AlarmBean.toAttrbean(alarmBean, false)), new BooleanRcspActionCallback("addOrModifyAlarm", onOperationCallback));
            return;
        }
        BaseError baseError = new BaseError(4097, "AlarmBean is null.");
        if (onOperationCallback != null) {
            onOperationCallback.onFailed(baseError);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void auditionAlarmBell(BluetoothDevice bluetoothDevice, AuditionParam auditionParam, OnOperationCallback<Boolean> onOperationCallback) {
        if (auditionParam != null) {
            this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildAuditionAlarmBellCmd(auditionParam.getType(), auditionParam.getDev(), auditionParam.getCluster()), new BooleanRcspActionCallback("auditionAlarmBell", onOperationCallback));
            return;
        }
        BaseError baseError = new BaseError(4097, "AlarmExpandCmd.BellArg is null.");
        if (onOperationCallback != null) {
            onOperationCallback.onFailed(baseError);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void deleteAlarm(BluetoothDevice bluetoothDevice, AlarmBean alarmBean, OnOperationCallback<Boolean> onOperationCallback) {
        if (alarmBean != null) {
            this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildDelAlarmCmd(AlarmBean.toAttrbean(alarmBean, true)), new BooleanRcspActionCallback("deleteAlarm", onOperationCallback));
            return;
        }
        BaseError baseError = new BaseError(4097, "AlarmBean is null.");
        if (onOperationCallback != null) {
            onOperationCallback.onFailed(baseError);
        }
    }

    public void destroy() {
        this.f37939d.removeCallbacksAndMessages(null);
        this.f37937b.removeListener(this.f37940e);
    }

    public BluetoothDevice getConnectedDevice() {
        return this.f37936a.getConnectedDevice();
    }

    public RcspOpImpl getRcspOp() {
        return this.f37936a;
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void readAlarmBellArgs(BluetoothDevice bluetoothDevice, byte b, OnOperationCallback<List<AlarmExpandCmd.BellArg>> onOperationCallback) {
        this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildReadBellArgsCmd(b), new CustomRcspActionCallback("readAlarmBellArgs", onOperationCallback, new IHandleResult<List<AlarmExpandCmd.BellArg>, AlarmExpandCmd>() { // from class: com.jieli.jl_rcsp.impl.RTCOpImpl.1
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice2, AlarmExpandCmd alarmExpandCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public List<AlarmExpandCmd.BellArg> handleResult(BluetoothDevice bluetoothDevice2, AlarmExpandCmd alarmExpandCmd) {
                AlarmExpandCmd.Response response = (AlarmExpandCmd.Response) alarmExpandCmd.getResponse();
                if (response != null && (response instanceof AlarmExpandCmd.ReadRtcBellArgsResponse)) {
                    return ((AlarmExpandCmd.ReadRtcBellArgsResponse) response).getBellArg();
                }
                return null;
            }
        }));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void readAlarmDefaultBellList(BluetoothDevice bluetoothDevice, OnOperationCallback<Boolean> onOperationCallback) {
        if (!m27406b()) {
            this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildGetDefaultAlarmBellsCmd(), new ReadAlarmRcspCallback(onOperationCallback));
        } else if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(4352, "Reading alarm data is in progress."));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void readAlarmList(BluetoothDevice bluetoothDevice, OnOperationCallback<Boolean> onOperationCallback) {
        if (!m27406b()) {
            this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildGetAlarmCmd(), new ReadAlarmRcspCallback(onOperationCallback));
        } else if (onOperationCallback != null) {
            onOperationCallback.onFailed(new BaseError(4352, "Reading alarm data is in progress."));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void setAlarmBellArg(BluetoothDevice bluetoothDevice, AlarmExpandCmd.BellArg bellArg, OnOperationCallback<Boolean> onOperationCallback) {
        if (bellArg != null) {
            this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildSetBellArgsCmd(bellArg), new BooleanRcspActionCallback("setAlarmBellArg", onOperationCallback));
            return;
        }
        BaseError baseError = new BaseError(4097, "AlarmExpandCmd.BellArg is null.");
        if (onOperationCallback != null) {
            onOperationCallback.onFailed(baseError);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void stopAlarmBell(BluetoothDevice bluetoothDevice, OnOperationCallback<Boolean> onOperationCallback) {
        this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildStopAlarmCmd(), new BooleanRcspActionCallback("stopAlarmBell", onOperationCallback));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void stopPlayAlarmBell(BluetoothDevice bluetoothDevice, OnOperationCallback<Boolean> onOperationCallback) {
        this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildStopAuditionAlarmBellCmd(), new BooleanRcspActionCallback("stopPlayAlarmBell", onOperationCallback));
    }

    @Override // com.jieli.jl_rcsp.interfaces.alarm.IRTCOp
    public void syncTime(BluetoothDevice bluetoothDevice, OnOperationCallback<Boolean> onOperationCallback) {
        this.f37936a.sendRcspCommand(bluetoothDevice, CommandBuilder.buildSyncTimeCmd(Calendar.getInstance()), new BooleanRcspActionCallback("syncTime", onOperationCallback));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m27406b() {
        return this.f37939d.hasMessages(f37935h);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean m27405a(Message message) {
        if (message.what != 41216) {
            return true;
        }
        JL_Log.m27887w(f37933f, "MSG_WAIT_ALARM_DATA", "");
        OnOperationCallback<Boolean> onOperationCallback = this.f37938c;
        if (onOperationCallback == null) {
            return true;
        }
        onOperationCallback.onFailed(new BaseError(12290, "The device replies to the alarm clock data timeout."));
        this.f37938c = null;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m27401a(RcspOpImpl rcspOpImpl, RcspEventListenerManager rcspEventListenerManager, byte[] bArr) {
        BluetoothDevice connectedDevice;
        DeviceInfo deviceInfo;
        AlarmBean alarmBean;
        List<AlarmBean> alarmBeans;
        Iterator<LtvBean> it;
        int i;
        String str;
        String str2;
        int i2;
        byte b;
        byte b2;
        int iBytesToInt;
        List<LtvBean> lTVData2 = DataUtil.parseLTVData2(bArr);
        if (lTVData2.isEmpty() || (deviceInfo = rcspOpImpl.getDeviceInfo((connectedDevice = rcspOpImpl.getConnectedDevice()))) == null) {
            return;
        }
        int iM27398a = m27398a(lTVData2);
        Iterator<LtvBean> it2 = lTVData2.iterator();
        while (it2.hasNext()) {
            LtvBean next = it2.next();
            byte[] data = next.getData();
            int type = next.getType();
            int i3 = 5;
            int i4 = 1;
            boolean z = false;
            if (type == 1) {
                int iByteToInt = CHexConver.byteToInt(data[0]);
                ArrayList arrayList = new ArrayList();
                if (iByteToInt > 0) {
                    int i5 = 1;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= iByteToInt || data.length - i5 <= i3) {
                            i = iM27398a;
                            break;
                        }
                        byte b3 = data[i5];
                        int i7 = i5 + 2;
                        boolean z2 = CHexConver.byteToInt(data[i5 + 1]) == i4 ? i4 : z;
                        byte b4 = data[i7];
                        byte b5 = data[i5 + 3];
                        byte b6 = data[i5 + 4];
                        int i8 = i5 + 6;
                        int iByteToInt2 = CHexConver.byteToInt(data[i5 + 5]);
                        i = iM27398a;
                        if (iByteToInt2 > data.length - i8) {
                            break;
                        }
                        if (iByteToInt2 > 0) {
                            try {
                                str = new String(data, i8, iByteToInt2);
                                i8 += iByteToInt2;
                            } catch (Exception e) {
                                e.printStackTrace();
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        int alarmVersion = i == 0 ? deviceInfo.getAlarmVersion() : i;
                        int length = data.length - i8;
                        int i9 = iByteToInt;
                        if (alarmVersion != 1 || length <= 6) {
                            str2 = "";
                            i2 = i8;
                            b = 0;
                            b2 = 0;
                            iBytesToInt = 0;
                            data = data;
                        } else {
                            byte b7 = data[i8];
                            int i10 = i8 + 2;
                            b = data[i8 + 1];
                            int i11 = i8;
                            byte[] bArr2 = new byte[4];
                            System.arraycopy(data, i10, bArr2, 0, 4);
                            iBytesToInt = CHexConver.bytesToInt(bArr2);
                            int i12 = i11 + 7;
                            int i13 = data[i11 + 6] & 255;
                            if (i13 <= data.length - i12) {
                                try {
                                    str2 = new String(data, i12, i13);
                                    i2 = i12 + i13;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    str2 = "";
                                    i2 = i12;
                                }
                            } else {
                                str2 = "";
                                i2 = i12;
                            }
                            b2 = b7;
                        }
                        AlarmBean open = new AlarmBean().setVersion(alarmVersion).setIndex(b3).setRepeatMode(b4).setName(str).setDevIndex(b).setHour(b5).setMin(b6).setBellCluster(iBytesToInt).setBellName(str2).setBellType(b2).setOpen(z2);
                        JL_Log.m27877d(f37933f, "parseRTCDataVersion0", open.toString());
                        arrayList.add(open);
                        i6++;
                        iM27398a = alarmVersion;
                        i5 = i2;
                        data = data;
                        it2 = it2;
                        iByteToInt = i9;
                        i3 = 5;
                        i4 = 1;
                        z = false;
                    }
                    it = it2;
                    iM27398a = i;
                } else {
                    it = it2;
                }
                AlarmListInfo alarmListInfo = new AlarmListInfo(arrayList);
                alarmListInfo.setVersion(iM27398a);
                deviceInfo.setAlarmListInfo(alarmListInfo);
                if (rcspEventListenerManager != null) {
                    rcspEventListenerManager.onAlarmListChange(connectedDevice, alarmListInfo);
                }
                it2 = it;
            } else if (type == 2 || type == 3) {
                int iByteToInt3 = CHexConver.byteToInt(data[0]);
                if (deviceInfo.getAlarmListInfo() != null && (alarmBeans = deviceInfo.getAlarmListInfo().getAlarmBeans()) != null && !alarmBeans.isEmpty()) {
                    Iterator<AlarmBean> it3 = alarmBeans.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            alarmBean = null;
                            break;
                        }
                        AlarmBean next2 = it3.next();
                        if (iByteToInt3 == next2.getIndex()) {
                            alarmBean = next2.copy();
                            break;
                        }
                    }
                } else {
                    alarmBean = null;
                    break;
                }
                if (alarmBean == null) {
                    alarmBean = new AlarmBean();
                    alarmBean.setIndex((byte) iByteToInt3);
                    alarmBean.setName("Alarm");
                    Calendar calendar = Calendar.getInstance();
                    alarmBean.setHour((byte) calendar.get(11));
                    alarmBean.setMin((byte) calendar.get(12));
                }
                if (next.getType() == 3) {
                    if (rcspEventListenerManager != null) {
                        rcspEventListenerManager.onAlarmStop(connectedDevice, alarmBean);
                    }
                } else if (rcspEventListenerManager != null) {
                    rcspEventListenerManager.onAlarmNotify(connectedDevice, alarmBean);
                }
            } else if (type == 4) {
                deviceInfo.setAlarmVersion(iM27398a);
                if (deviceInfo.getAlarmListInfo() == null) {
                    deviceInfo.setAlarmListInfo(new AlarmListInfo(iM27398a, new ArrayList()));
                } else {
                    deviceInfo.getAlarmListInfo().setVersion(iM27398a);
                }
            } else if (type == 5) {
                int i14 = data[0] & 15;
                ArrayList arrayList2 = new ArrayList();
                while (i4 < data.length && arrayList2.size() < i14) {
                    int i15 = i4 + 1;
                    byte b8 = data[i4];
                    int i16 = i4 + 2;
                    int i17 = data[i15];
                    byte[] bArr3 = new byte[i17];
                    System.arraycopy(data, i16, bArr3, 0, i17);
                    i4 = i16 + i17;
                    arrayList2.add(new DefaultAlarmBell(b8, new String(bArr3), false));
                }
                deviceInfo.setAlarmDefaultBells(arrayList2);
                if (rcspEventListenerManager != null) {
                    rcspEventListenerManager.onAlarmDefaultBellListChange(connectedDevice, arrayList2);
                }
            } else if (type == 7) {
                deviceInfo.setAlarmExpandFlag(data[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m27398a(List<LtvBean> list) {
        for (LtvBean ltvBean : list) {
            if (ltvBean.getType() == 4) {
                return ltvBean.getData()[0] & 7;
            }
        }
        return 0;
    }
}
