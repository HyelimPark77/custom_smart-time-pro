package com.jieli.jl_rcsp.tool.datahandles;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.DataInfo;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.datahandles.DataHandlerModify;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class DataHandlerModify implements DataHandler {

    /* JADX INFO: renamed from: c */
    public final IBluetoothProxy f38296c;

    /* JADX INFO: renamed from: d */
    public final BasePacketParse f38297d;

    /* JADX INFO: renamed from: f */
    public final HandlerThread f38299f;

    /* JADX INFO: renamed from: g */
    public final Handler f38300g;

    /* JADX INFO: renamed from: h */
    public final Handler f38301h;

    /* JADX INFO: renamed from: a */
    public final String f38294a = DataHandlerModify.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public final DeviceStatusManager f38295b = DeviceStatusManager.getInstance();

    /* JADX INFO: renamed from: e */
    public final DataInfoCache f38298e = new DataInfoCache();

    public class TimeOutCheck implements Runnable {

        /* JADX INFO: renamed from: a */
        public final DataInfo f38302a;

        public TimeOutCheck(DataInfo dataInfo) {
            this.f38302a = dataInfo;
            dataInfo.setSendTime(System.currentTimeMillis());
        }

        @Override // java.lang.Runnable
        public void run() {
            BasePacket basePacket;
            DataInfo dataInfo = this.f38302a;
            if (dataInfo == null || (basePacket = dataInfo.getBasePacket()) == null) {
                return;
            }
            BluetoothDevice device = this.f38302a.getDevice();
            int opCode = basePacket.getOpCode();
            int opCodeSn = basePacket.getOpCodeSn();
            int reSendCount = this.f38302a.getReSendCount();
            JL_Log.m27887w(DataHandlerModify.this.f38294a, "TimeOutCheck", RcspUtil.formatString("Waiting for reply command timeout.\ndevice : %s, op : %d(0x%X), sn : %d, reSendCount : %d.", device, Integer.valueOf(opCode), Integer.valueOf(opCode), Integer.valueOf(opCodeSn), Integer.valueOf(reSendCount)));
            if (reSendCount < 3) {
                this.f38302a.setReSendCount(reSendCount + 1);
                DataHandlerModify.this.f38298e.remove(this.f38302a);
                DataHandlerModify.this.addSendData(this.f38302a);
            } else {
                DataHandlerModify.this.f38298e.remove(this.f38302a);
                CommandHelper.getInstance().removeCommandBase(device, basePacket);
                DataHandlerModify.this.m27797a(this.f38302a, new BaseError(12290));
            }
        }
    }

    public DataHandlerModify(IBluetoothProxy iBluetoothProxy) {
        HandlerThread handlerThread = new HandlerThread("DataHandlerModify");
        this.f38299f = handlerThread;
        this.f38301h = new Handler(Looper.getMainLooper());
        if (iBluetoothProxy == null) {
            throw new NullPointerException("IBluetoothProxy can not be null.");
        }
        this.f38296c = iBluetoothProxy;
        this.f38297d = new BasePacketParse();
        handlerThread.start();
        this.f38300g = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.XXXIOiI
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return DataHandlerModify.m27792a(message);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addRecvData(final DataInfo dataInfo) {
        this.f38300g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X00IX1X1i
            @Override // java.lang.Runnable
            public final void run() {
                this.f3872IO.m27796a(dataInfo);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addSendData(final DataInfo dataInfo) {
        dataInfo.setSendTime(m27795a());
        this.f38300g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O0O0iI
            @Override // java.lang.Runnable
            public final void run() {
                this.f2484IO.m27800b(dataInfo);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27802c(DataInfo dataInfo) {
        byte[] bArrPackSendBasePacket = ParseHelper.packSendBasePacket(dataInfo.getBasePacket());
        if (bArrPackSendBasePacket == null) {
            JL_Log.m27883i(this.f38294a, "sendData", "Packing data failed.");
            return false;
        }
        int iM27794a = m27794a(dataInfo.getDevice());
        if (bArrPackSendBasePacket.length > iM27794a) {
            JL_Log.m27880e(this.f38294a, "sendData", "The length of the sent data exceeds the limit[" + iM27794a + "].");
            return false;
        }
        boolean zSendDataToDevice = false;
        for (int i = 0; i < 3 && !(zSendDataToDevice = this.f38296c.sendDataToDevice(dataInfo.getDevice(), bArrPackSendBasePacket)); i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        JL_Log.m27877d(this.f38294a, "sendData", RcspUtil.formatString("result : %s, data : [%s]", Boolean.valueOf(zSendDataToDevice), CHexConver.byte2HexStr(bArrPackSendBasePacket)));
        return zSendDataToDevice;
    }

    /* JADX INFO: renamed from: d */
    public final int m27803d(DataInfo dataInfo) {
        if (dataInfo == null) {
            return Integer.MAX_VALUE;
        }
        return dataInfo.getBasePacket().getOpCode() | (dataInfo.getBasePacket().getOpCodeSn() << 16);
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void release() {
        JL_Log.m27883i(this.f38294a, "release", "=====>>>");
        this.f38300g.removeCallbacksAndMessages(null);
        this.f38297d.release();
        CommandHelper.getInstance().release();
        if (!this.f38298e.isEmpty()) {
            ArrayList<DataInfo> arrayList = new ArrayList(this.f38298e);
            this.f38298e.clear();
            for (DataInfo dataInfo : arrayList) {
                RcspCommandCallback rcspCmdCallback = dataInfo.getRcspCmdCallback();
                if (rcspCmdCallback != null) {
                    rcspCmdCallback.onErrCode(dataInfo.getDevice(), new BaseError(8192));
                }
            }
        }
        this.f38299f.quitSafely();
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m27800b(DataInfo dataInfo) {
        if (!m27802c(dataInfo)) {
            m27797a(dataInfo, new BaseError(12288));
            return;
        }
        if (dataInfo.getBasePacket().getHasResponse() == 1) {
            this.f38298e.add(dataInfo);
            Handler handler = this.f38300g;
            handler.sendMessageDelayed(handler.obtainMessage(m27803d(dataInfo), new TimeOutCheck(dataInfo)), dataInfo.getTimeoutMs());
            return;
        }
        BasePacket basePacket = dataInfo.getBasePacket();
        int opCodeSn = basePacket.getOpCodeSn();
        basePacket.setOpCodeSn(256);
        CommandBase commandBaseConvert2Command = ParseHelper.convert2Command(dataInfo.getDevice(), basePacket);
        if (commandBaseConvert2Command != null) {
            commandBaseConvert2Command.setOpCodeSn(opCodeSn);
        }
        m27798a(dataInfo, commandBaseConvert2Command);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m27792a(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof Runnable)) {
            return true;
        }
        ((Runnable) obj).run();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27796a(DataInfo dataInfo) {
        ArrayList<BasePacket> arrayListFindPacketData = this.f38297d.findPacketData(m27799b(dataInfo.getDevice()), dataInfo.getRecvData());
        if (arrayListFindPacketData != null && !arrayListFindPacketData.isEmpty()) {
            for (BasePacket basePacket : arrayListFindPacketData) {
                if (basePacket.getType() == 1) {
                    this.f38296c.receiveDataFromDevice(dataInfo.getDevice(), basePacket);
                } else {
                    DataInfo dataInfo2 = this.f38298e.getDataInfo(basePacket);
                    if (dataInfo2 == null) {
                        JL_Log.m27887w(this.f38294a, "addRecvData", "No cached command found. " + basePacket);
                    } else {
                        CommandBase commandBaseConvert2Command = ParseHelper.convert2Command(dataInfo2.getDevice(), basePacket);
                        if (commandBaseConvert2Command == null) {
                            m27797a(dataInfo2, new BaseError(12289));
                        } else {
                            this.f38296c.receiveDataFromDevice(dataInfo.getDevice(), basePacket);
                        }
                        this.f38298e.remove(dataInfo2);
                        this.f38300g.removeMessages(m27803d(dataInfo2));
                        m27798a(dataInfo2, commandBaseConvert2Command);
                        CommandHelper.getInstance().removeCommandBase(dataInfo2.getDevice(), basePacket);
                    }
                }
            }
            return;
        }
        JL_Log.m27887w(this.f38294a, "addRecvData", "Not found command.");
    }

    /* JADX INFO: renamed from: b */
    public final int m27799b(BluetoothDevice bluetoothDevice) {
        return this.f38295b.getMaxReceiveMtu(bluetoothDevice);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m27801b(DataInfo dataInfo, BaseError baseError) {
        JL_Log.m27887w(this.f38294a, "callError", "device : " + dataInfo.getDevice() + ", " + baseError);
        dataInfo.getRcspCmdCallback().onErrCode(dataInfo.getDevice(), baseError);
        this.f38296c.callbackErrorEvent(baseError);
    }

    /* JADX INFO: renamed from: a */
    public final long m27795a() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public final int m27794a(BluetoothDevice bluetoothDevice) {
        return this.f38295b.getMaxCommunicationMtu(bluetoothDevice);
    }

    /* JADX INFO: renamed from: a */
    public final void m27797a(final DataInfo dataInfo, final BaseError baseError) {
        if (dataInfo == null || dataInfo.getRcspCmdCallback() == null || baseError == null) {
            return;
        }
        if (dataInfo.getBasePacket() != null) {
            baseError.setOpCode(dataInfo.getBasePacket().getOpCode());
        }
        this.f38301h.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I1XIO0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f1450IO.m27801b(dataInfo, baseError);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27798a(final DataInfo dataInfo, final CommandBase commandBase) {
        if (dataInfo == null || dataInfo.getRcspCmdCallback() == null || commandBase == null) {
            return;
        }
        final RcspCommandCallback rcspCmdCallback = dataInfo.getRcspCmdCallback();
        this.f38301h.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iO0XO1X1
            @Override // java.lang.Runnable
            public final void run() {
                DataHandlerModify.m27790a(rcspCmdCallback, dataInfo, commandBase);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27790a(RcspCommandCallback rcspCommandCallback, DataInfo dataInfo, CommandBase commandBase) {
        if (rcspCommandCallback != null) {
            rcspCommandCallback.onCommandResponse(dataInfo.getDevice(), commandBase);
        }
    }
}
