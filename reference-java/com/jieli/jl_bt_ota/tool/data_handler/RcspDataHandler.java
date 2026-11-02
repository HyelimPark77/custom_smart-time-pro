package com.jieli.jl_bt_ota.tool.data_handler;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ironsource.C12616d4;
import com.jieli.jl_bt_ota.constant.ErrorCode;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.command.OnDataHandlerListener;
import com.jieli.jl_bt_ota.interfaces.p199bt.IBtProxy;
import com.jieli.jl_bt_ota.model.OTAError;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.BasePacket;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.tool.data_handler.RcspDataHandler;
import com.jieli.jl_bt_ota.util.BluetoothUtil;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class RcspDataHandler implements IDataHandler {

    /* JADX INFO: renamed from: a */
    private final String f37711a;

    /* JADX INFO: renamed from: b */
    private final IBtProxy f37712b;

    /* JADX INFO: renamed from: c */
    private final OnDataHandlerListener f37713c;

    /* JADX INFO: renamed from: d */
    private final CommandCache f37714d;

    /* JADX INFO: renamed from: e */
    private final RcspParser f37715e;

    /* JADX INFO: renamed from: f */
    private final CopyOnWriteArrayList<SendDataInfo<?>> f37716f;

    /* JADX INFO: renamed from: g */
    private final HandlerThread f37717g;

    /* JADX INFO: renamed from: h */
    private final Handler f37718h;

    /* JADX INFO: renamed from: i */
    private final Handler f37719i;

    /* JADX INFO: renamed from: j */
    private CommandBase f37720j;

    public class TimeOutCheck implements Runnable {

        /* JADX INFO: renamed from: a */
        private final SendDataInfo<?> f37721a;

        public TimeOutCheck(SendDataInfo<?> sendDataInfo) {
            this.f37721a = sendDataInfo;
            sendDataInfo.setSendTime(System.currentTimeMillis());
        }

        @Override // java.lang.Runnable
        public void run() {
            int opCode = this.f37721a.getOpCode();
            int sn = this.f37721a.getSn();
            int reSendMax = this.f37721a.getReSendMax();
            int reSendCount = this.f37721a.getReSendCount();
            JL_Log.m27240w(RcspDataHandler.this.f37711a, "COMMAND TIMEOUT", CommonUtil.formatString("Waiting for reply command timeout. opCode : %s, sn : %s, reSendMax : %d,  reSendCount : %d.", CommonUtil.formatInt(opCode), CommonUtil.formatInt(sn), Integer.valueOf(reSendMax), Integer.valueOf(reSendCount)));
            if (reSendCount < reSendMax) {
                this.f37721a.setReSendCount(reSendCount + 1);
                RcspDataHandler.this.addSendData(this.f37721a);
            } else {
                RcspDataHandler.this.f37716f.remove(this.f37721a);
                RcspDataHandler.this.m27189a(this.f37721a.getDevice(), opCode, sn);
                RcspDataHandler.this.m27195a(this.f37721a, OTAError.buildError(ErrorCode.SUB_ERR_SEND_TIMEOUT).setOpCode(opCode));
            }
        }
    }

    public RcspDataHandler(IBtProxy iBtProxy, OnDataHandlerListener onDataHandlerListener) {
        String simpleName = RcspDataHandler.class.getSimpleName();
        this.f37711a = simpleName;
        this.f37716f = new CopyOnWriteArrayList<>();
        HandlerThread handlerThread = new HandlerThread("RcspDataHandler");
        this.f37717g = handlerThread;
        this.f37719i = new Handler(Looper.getMainLooper());
        this.f37712b = (IBtProxy) CommonUtil.checkNotNull(iBtProxy, "IBtProxy can not be null.");
        this.f37713c = onDataHandlerListener;
        this.f37714d = new CommandCache();
        this.f37715e = new RcspParser();
        handlerThread.start();
        this.f37718h = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.kd2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return RcspDataHandler.m27199a(message);
            }
        });
        JL_Log.m27236i(simpleName, C12616d4.a.f34169f, "" + this);
    }

    /* JADX INFO: renamed from: c */
    private boolean m27203c(SendDataInfo<?> sendDataInfo) {
        byte[] sendData = sendDataInfo.getSendData();
        if (sendData == null || sendData.length == 0) {
            JL_Log.m27236i(this.f37711a, "sendData", "Failed to pack data.");
            return false;
        }
        int deviceReceiveMtu = sendDataInfo.getDeviceReceiveMtu();
        if (sendData.length > deviceReceiveMtu) {
            JL_Log.m27234e(this.f37711a, "sendData", CommonUtil.formatString("Data size(%d) exceeds communication mtu(%d).", Integer.valueOf(sendData.length), Integer.valueOf(deviceReceiveMtu)));
            return false;
        }
        boolean zWriteData = false;
        for (int i = 0; i < 3 && !(zWriteData = this.f37712b.writeData(sendDataInfo.getDevice(), sendData)); i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        JL_Log.m27236i(this.f37711a, "sendData", "" + zWriteData);
        return zWriteData;
    }

    /* JADX INFO: renamed from: d */
    private int m27204d(SendDataInfo<?> sendDataInfo) {
        if (sendDataInfo == null) {
            return Integer.MAX_VALUE;
        }
        return sendDataInfo.getOpCode() | (sendDataInfo.getSn() << 16);
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addRecvData(final ReceivedDataInfo receivedDataInfo) {
        this.f37718h.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.md2
            @Override // java.lang.Runnable
            public final void run() {
                this.f9672IO.m27193a(receivedDataInfo);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addSendData(final SendDataInfo<?> sendDataInfo) {
        this.f37718h.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.od2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10115IO.m27202b(sendDataInfo);
            }
        });
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void release() {
        this.f37720j = null;
        this.f37718h.removeCallbacksAndMessages(null);
        this.f37719i.removeCallbacksAndMessages(null);
        this.f37714d.release();
        this.f37715e.release();
        this.f37716f.clear();
        if (!this.f37717g.isInterrupted()) {
            this.f37717g.quitSafely();
        }
        JL_Log.m27236i(this.f37711a, "release", "" + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m27202b(SendDataInfo sendDataInfo) {
        if (!m27203c(sendDataInfo)) {
            m27195a((SendDataInfo<?>) sendDataInfo, OTAError.buildError(12290));
            return;
        }
        BluetoothDevice device = sendDataInfo.getDevice();
        JL_Log.m27232d(this.f37711a, "TX", "device : " + device + ", " + sendDataInfo.getCommand());
        sendDataInfo.setSendTime(m27186a());
        if (sendDataInfo.getBasePacket().getHasResponse() != 1) {
            sendDataInfo.getCommand().setStatus(0);
            m27194a(sendDataInfo);
            return;
        }
        this.f37714d.putCommandBase(device, sendDataInfo.getCommand());
        if (!this.f37716f.contains(sendDataInfo)) {
            this.f37716f.add(sendDataInfo);
        }
        int iM27204d = m27204d(sendDataInfo);
        this.f37718h.removeMessages(iM27204d);
        Handler handler = this.f37718h;
        handler.sendMessageDelayed(handler.obtainMessage(iM27204d, new TimeOutCheck(sendDataInfo)), sendDataInfo.getTimeoutMs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m27199a(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof Runnable)) {
            return true;
        }
        ((Runnable) obj).run();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27193a(ReceivedDataInfo receivedDataInfo) {
        BluetoothDevice device = receivedDataInfo.getDevice();
        byte[] data = receivedDataInfo.getData();
        ArrayList<BasePacket> arrayListFindPacketData = this.f37715e.findPacketData(receivedDataInfo.getDeviceSendMtu(), data);
        if (arrayListFindPacketData != null && !arrayListFindPacketData.isEmpty()) {
            int size = arrayListFindPacketData.size();
            int i = 0;
            while (i < size) {
                BasePacket basePacket = arrayListFindPacketData.get(i);
                i++;
                BasePacket basePacket2 = basePacket;
                if (basePacket2.getType() == 1) {
                    m27190a(device, ParseHelper.convert2Command(basePacket2, null));
                } else {
                    SendDataInfo<?> sendDataInfoM27187a = m27187a(device, basePacket2);
                    if (sendDataInfoM27187a == null) {
                        JL_Log.m27240w(this.f37711a, "addRecvData", "Not found cache send data. " + basePacket2);
                    } else {
                        CommandBase<?, ?> commandBaseConvert2Command = ParseHelper.convert2Command(basePacket2, m27200b(device, basePacket2));
                        if (commandBaseConvert2Command == null) {
                            m27195a(sendDataInfoM27187a, OTAError.buildError(12293).setOpCode(basePacket2.getOpCode()));
                        } else {
                            m27190a(device, commandBaseConvert2Command);
                            sendDataInfoM27187a.setCommand(commandBaseConvert2Command);
                            m27194a(sendDataInfoM27187a);
                        }
                        this.f37716f.remove(sendDataInfoM27187a);
                        this.f37718h.removeMessages(m27204d(sendDataInfoM27187a));
                        m27189a(device, basePacket2.getOpCode(), basePacket2.getOpCodeSn());
                    }
                }
            }
            return;
        }
        JL_Log.m27240w(this.f37711a, "addRecvData", "Not found Command. data : " + CHexConver.byte2HexStr(data));
    }

    /* JADX INFO: renamed from: b */
    private CommandBase<?, ?> m27200b(BluetoothDevice bluetoothDevice, BasePacket basePacket) {
        if (basePacket == null) {
            return null;
        }
        return this.f37714d.getCommand(bluetoothDevice, basePacket.getOpCode(), basePacket.getOpCodeSn());
    }

    /* JADX INFO: renamed from: a */
    private long m27186a() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27189a(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f37714d.removeCommandBase(bluetoothDevice, i, i2);
    }

    /* JADX INFO: renamed from: a */
    private SendDataInfo<?> m27187a(BluetoothDevice bluetoothDevice, BasePacket basePacket) {
        if (!this.f37716f.isEmpty() && basePacket != null) {
            for (SendDataInfo<?> sendDataInfo : this.f37716f) {
                CommandBase command = sendDataInfo.getCommand();
                if (command != null && command.getId() == basePacket.getOpCode() && command.getOpCodeSn() == basePacket.getOpCodeSn() && BluetoothUtil.deviceEquals(bluetoothDevice, sendDataInfo.getDevice())) {
                    return sendDataInfo;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m27198a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f37719i.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27195a(final SendDataInfo<?> sendDataInfo, final BaseError baseError) {
        if (sendDataInfo == null) {
            return;
        }
        if (baseError == null) {
            JL_Log.m27232d(this.f37711a, "callError", "error is null");
            return;
        }
        baseError.setOpCode(sendDataInfo.getOpCode()).setCmdSn(sendDataInfo.getSn());
        final CommandCallback<C> callback = sendDataInfo.getCallback();
        JL_Log.m27240w(this.f37711a, "callError", "device : " + sendDataInfo.getDevice() + ", " + baseError);
        m27198a(new Runnable() { // from class: com.android.mltcode.paycertificationapi.nd2
            @Override // java.lang.Runnable
            public final void run() {
                this.f9915IO.m27191a(callback, baseError, sendDataInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m27191a(CommandCallback commandCallback, BaseError baseError, SendDataInfo sendDataInfo) {
        if (commandCallback != null) {
            commandCallback.onErrCode(baseError);
        }
        OnDataHandlerListener onDataHandlerListener = this.f37713c;
        if (onDataHandlerListener != null) {
            onDataHandlerListener.onRCSPError(sendDataInfo.getDevice(), baseError);
        }
    }

    /* JADX INFO: renamed from: a */
    private <C extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void m27194a(final SendDataInfo<C> sendDataInfo) {
        final CommandCallback<C> callback;
        if (sendDataInfo == null || (callback = sendDataInfo.getCallback()) == null) {
            return;
        }
        m27198a(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ld2
            @Override // java.lang.Runnable
            public final void run() {
                RcspDataHandler.m27192a(callback, sendDataInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27192a(CommandCallback commandCallback, SendDataInfo sendDataInfo) {
        commandCallback.onCommandResponse(sendDataInfo.getCommand());
    }

    /* JADX INFO: renamed from: a */
    private void m27190a(BluetoothDevice bluetoothDevice, CommandBase<?, ?> commandBase) {
        if (commandBase == null) {
            return;
        }
        JL_Log.m27232d(this.f37711a, "RX", "device : " + bluetoothDevice + ", " + commandBase);
        if (!commandBase.isResponseCmd()) {
            if (commandBase.equals(this.f37720j)) {
                JL_Log.m27240w(this.f37711a, "RX", "Same as the previous command, skip this commands. opCode : " + CommonUtil.formatInt(commandBase.getId()) + ", sn : " + CommonUtil.formatInt(commandBase.getOpCodeSn()));
                return;
            }
            this.f37720j = commandBase;
        }
        OnDataHandlerListener onDataHandlerListener = this.f37713c;
        if (onDataHandlerListener != null) {
            onDataHandlerListener.onReceivedCmd(bluetoothDevice, commandBase);
        }
    }
}
