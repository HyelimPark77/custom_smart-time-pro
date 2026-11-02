package com.jieli.jl_bt_ota.tool.data_handler;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
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
import com.jieli.jl_bt_ota.model.data.DataInfo;
import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;
import com.jieli.jl_bt_ota.tool.ParseHelper;
import com.jieli.jl_bt_ota.util.CHexConver;
import com.jieli.jl_bt_ota.util.CommonUtil;
import com.jieli.jl_bt_ota.util.JL_Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class DataHandler implements IDataHandler {

    /* JADX INFO: renamed from: g */
    private static final String f37682g = "DataHandler";

    /* JADX INFO: renamed from: a */
    private final IBtProxy f37683a;

    /* JADX INFO: renamed from: b */
    private final OnDataHandlerListener f37684b;

    /* JADX INFO: renamed from: c */
    private final CommandCache f37685c = new CommandCache();

    /* JADX INFO: renamed from: d */
    private final Handler f37686d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    private WorkThread f37687e;

    /* JADX INFO: renamed from: f */
    private DataHandlerThread f37688f;

    public class DataHandlerThread extends Thread {

        /* JADX INFO: renamed from: a */
        private final String f37689a;

        /* JADX INFO: renamed from: b */
        private volatile boolean f37690b;

        /* JADX INFO: renamed from: c */
        private volatile boolean f37691c;

        /* JADX INFO: renamed from: d */
        private final LinkedBlockingQueue<DataInfo> f37692d;

        /* JADX INFO: renamed from: e */
        private final CopyOnWriteArrayList<ReceivedDataInfo> f37693e;

        /* JADX INFO: renamed from: f */
        private final CopyOnWriteArrayList<SendDataInfo<?>> f37694f;

        /* JADX INFO: renamed from: g */
        private TimerThread f37695g;

        public DataHandlerThread() {
            super("DataHandlerThread");
            this.f37689a = DataHandlerThread.class.getSimpleName();
            this.f37692d = new LinkedBlockingQueue<>();
            this.f37693e = new CopyOnWriteArrayList<>();
            this.f37694f = new CopyOnWriteArrayList<>();
        }

        /* JADX INFO: renamed from: c */
        private void m27176c() {
            m27161a();
            SendDataInfo<?> sendDataInfoM27178d = m27178d();
            if (sendDataInfoM27178d != null) {
                m27179d(sendDataInfoM27178d);
            } else if (m27170b().isEmpty()) {
                m27180e();
            } else {
                m27162a(500);
            }
        }

        /* JADX INFO: renamed from: d */
        private void m27179d(SendDataInfo<?> sendDataInfo) {
            byte[] sendData = sendDataInfo.getSendData();
            if (sendData == null || sendData.length == 0) {
                JL_Log.m27236i(DataHandler.f37682g, "sendData", "pack data error.");
                m27177c(sendDataInfo);
                return;
            }
            int deviceReceiveMtu = sendDataInfo.getDeviceReceiveMtu();
            JL_Log.m27236i(DataHandler.f37682g, "sendData", "data : [" + CHexConver.byte2HexStr(sendData) + "], sendMtu = " + deviceReceiveMtu);
            if (sendData.length > deviceReceiveMtu + 8) {
                JL_Log.m27234e(DataHandler.f37682g, "sendData", "data over communication mtu [" + deviceReceiveMtu + "] limit.");
                m27177c(sendDataInfo);
                return;
            }
            boolean zWriteData = false;
            for (int i = 0; i < 3 && !(zWriteData = DataHandler.this.f37683a.writeData(sendDataInfo.getDevice(), sendData)); i++) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            JL_Log.m27236i(DataHandler.f37682g, "sendData", "" + zWriteData);
            if (!zWriteData) {
                m27177c(sendDataInfo);
                return;
            }
            if (sendDataInfo.getBasePacket().getHasResponse() == 1) {
                sendDataInfo.setSend(true);
                sendDataInfo.setSendTime(Calendar.getInstance().getTimeInMillis());
            } else {
                final CommandCallback<C> callback = sendDataInfo.getCallback();
                if (callback != 0) {
                    DataHandler.this.f37686d.post(new Runnable() { // from class: com.jieli.jl_bt_ota.tool.data_handler.XO0O10
                        @Override // java.lang.Runnable
                        public final void run() {
                            callback.onCommandResponse(null);
                        }
                    });
                }
                this.f37694f.remove(sendDataInfo);
            }
        }

        /* JADX INFO: renamed from: e */
        private void m27180e() {
            TimerThread timerThread = this.f37695g;
            if (timerThread == null || !timerThread.f37700c) {
                return;
            }
            JL_Log.m27236i(DataHandler.f37682g, "stopTimer", "");
            timerThread.m27185a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m27181f() {
            if (this.f37691c) {
                synchronized (this.f37692d) {
                    try {
                        if (this.f37691c) {
                            JL_Log.m27236i(DataHandler.f37682g, "wakeUpThread", "notifyAll");
                            this.f37692d.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f37692d) {
                while (this.f37690b) {
                    if (this.f37692d.isEmpty()) {
                        this.f37691c = true;
                        m27176c();
                        JL_Log.m27232d(DataHandler.f37682g, this.f37689a, "Thread is waiting...");
                        try {
                            this.f37692d.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.f37691c = false;
                        m27172b(this.f37692d.poll());
                        m27176c();
                    }
                }
            }
            JL_Log.m27234e(DataHandler.f37682g, this.f37689a, "exit...");
            this.f37693e.clear();
            this.f37694f.clear();
            this.f37692d.clear();
            this.f37690b = false;
            m27180e();
            DataHandler.this.f37688f = null;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f37690b = true;
            super.start();
            JL_Log.m27236i(DataHandler.f37682g, this.f37689a, "start....");
        }

        public void stopThread() {
            JL_Log.m27240w(DataHandler.f37682g, this.f37689a, "stopThread");
            this.f37690b = false;
            m27181f();
        }

        public void tryToAddRecvData(DataInfo dataInfo) {
            JL_Log.m27232d(DataHandler.f37682g, "tryToAddRecvData", m27169a(dataInfo) + ",isWaiting = " + this.f37691c);
        }

        public void tryToAddSendData(DataInfo dataInfo) {
            JL_Log.m27232d(DataHandler.f37682g, "tryToAddSendData", m27169a(dataInfo) + ",isWaiting = " + this.f37691c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m27174b(SendDataInfo sendDataInfo, CommandCallback commandCallback) {
            BaseError cmdSn = OTAError.buildError(12290).setOpCode(sendDataInfo.getOpCode()).setCmdSn(sendDataInfo.getSn());
            if (commandCallback != null) {
                commandCallback.onErrCode(cmdSn);
            }
            if (DataHandler.this.f37684b != null) {
                DataHandler.this.f37684b.onRCSPError(sendDataInfo.getDevice(), cmdSn);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m27162a(int i) {
            TimerThread timerThread = this.f37695g;
            if (timerThread != null) {
                if (timerThread.f37700c) {
                    return;
                }
                timerThread.f37700c = true;
            } else {
                TimerThread timerThread2 = DataHandler.this.new TimerThread(i, new ThreadStateListener() { // from class: com.jieli.jl_bt_ota.tool.data_handler.DataHandler.DataHandlerThread.1
                    @Override // com.jieli.jl_bt_ota.tool.data_handler.DataHandler.ThreadStateListener
                    public void onFinish(long j) {
                        if (DataHandlerThread.this.f37695g == null || DataHandlerThread.this.f37695g.getId() != j) {
                            return;
                        }
                        DataHandlerThread.this.f37695g = null;
                    }

                    @Override // com.jieli.jl_bt_ota.tool.data_handler.DataHandler.ThreadStateListener
                    public void onStart(long j) {
                    }
                });
                this.f37695g = timerThread2;
                timerThread2.start();
            }
        }

        /* JADX INFO: renamed from: b */
        private void m27172b(DataInfo dataInfo) {
            if (dataInfo == null) {
                return;
            }
            if (dataInfo.getType() == 1) {
                this.f37693e.add((ReceivedDataInfo) dataInfo);
                m27181f();
            } else {
                this.f37694f.add((SendDataInfo) dataInfo);
            }
        }

        /* JADX INFO: renamed from: a */
        private CommandBase<?, ?> m27158a(BluetoothDevice bluetoothDevice, BasePacket basePacket) {
            if (basePacket == null) {
                return null;
            }
            return DataHandler.this.f37685c.getCommand(bluetoothDevice, basePacket.getOpCode(), basePacket.getOpCodeSn());
        }

        /* JADX INFO: renamed from: c */
        private void m27177c(final SendDataInfo<?> sendDataInfo) {
            if (sendDataInfo == null) {
                return;
            }
            this.f37694f.remove(sendDataInfo);
            final CommandCallback<C> callback = sendDataInfo.getCallback();
            DataHandler.this.f37686d.post(new Runnable() { // from class: com.jieli.jl_bt_ota.tool.data_handler.iO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37730IO.m27174b(sendDataInfo, callback);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        private void m27163a(BluetoothDevice bluetoothDevice, int i, int i2) {
            DataHandler.this.f37685c.removeCommandBase(bluetoothDevice, i, i2);
        }

        /* JADX INFO: renamed from: a */
        private boolean m27169a(DataInfo dataInfo) {
            boolean zOffer;
            if (dataInfo != null) {
                try {
                    zOffer = this.f37692d.offer(dataInfo, 3L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    zOffer = false;
                }
            } else {
                zOffer = false;
            }
            if (zOffer) {
                m27181f();
            }
            return zOffer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m27171b(CommandCallback commandCallback, SendDataInfo sendDataInfo) {
            if (commandCallback != null) {
                commandCallback.onErrCode(OTAError.buildError(12293).setOpCode(sendDataInfo.getOpCode()).setCmdSn(sendDataInfo.getSn()));
            }
        }

        /* JADX INFO: renamed from: a */
        private void m27161a() {
            ArrayList<BasePacket> arrayList = new ArrayList<>();
            if (!this.f37693e.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (ReceivedDataInfo receivedDataInfo : this.f37693e) {
                    BluetoothDevice device = receivedDataInfo.getDevice();
                    ArrayList<BasePacket> arrayListFindPacketData = ParseHelper.findPacketData(device, receivedDataInfo.getDeviceSendMtu(), receivedDataInfo.getData());
                    if (arrayListFindPacketData != null && !arrayListFindPacketData.isEmpty()) {
                        arrayList2.add(receivedDataInfo);
                        int size = arrayListFindPacketData.size();
                        int i = 0;
                        while (i < size) {
                            BasePacket basePacket = arrayListFindPacketData.get(i);
                            i++;
                            BasePacket basePacket2 = basePacket;
                            if (basePacket2.getType() == 1) {
                                CommandBase commandBaseConvert2Command = ParseHelper.convert2Command(basePacket2, m27158a(device, basePacket2));
                                if (commandBaseConvert2Command != null && DataHandler.this.f37684b != null) {
                                    DataHandler.this.f37684b.onReceivedCmd(device, commandBaseConvert2Command);
                                }
                            } else {
                                arrayList.add(basePacket2);
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    this.f37693e.removeAll(arrayList2);
                }
                m27168a(arrayList);
                return;
            }
            m27168a((ArrayList<BasePacket>) null);
        }

        /* JADX INFO: renamed from: b */
        private ArrayList<SendDataInfo<?>> m27170b() {
            if (this.f37694f.isEmpty()) {
                return new ArrayList<>();
            }
            ArrayList<SendDataInfo<?>> arrayList = new ArrayList<>();
            for (SendDataInfo<?> sendDataInfo : this.f37694f) {
                if (sendDataInfo.isSend()) {
                    arrayList.add(sendDataInfo);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        private void m27173b(final SendDataInfo<?> sendDataInfo) {
            if (sendDataInfo == null) {
                return;
            }
            final CommandCallback<C> callback = sendDataInfo.getCallback();
            m27163a(sendDataInfo.getDevice(), sendDataInfo.getOpCode(), sendDataInfo.getSn());
            DataHandler.this.f37686d.post(new Runnable() { // from class: com.jieli.jl_bt_ota.tool.data_handler.XIi00iiXO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37727IO.m27167a(sendDataInfo, callback);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        private SendDataInfo<?> m27178d() {
            if (this.f37694f.isEmpty()) {
                return null;
            }
            for (SendDataInfo<?> sendDataInfo : this.f37694f) {
                if (!sendDataInfo.isSend()) {
                    return sendDataInfo;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private void m27168a(ArrayList<BasePacket> arrayList) {
            ArrayList<BasePacket> arrayList2 = arrayList;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                return;
            }
            ArrayList<SendDataInfo<?>> arrayListM27170b = m27170b();
            if (arrayListM27170b.isEmpty()) {
                return;
            }
            JL_Log.m27232d(DataHandler.f37682g, "checkHaveResponseList", "waitList size : " + arrayListM27170b.size());
            ArrayList arrayList3 = new ArrayList();
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                BasePacket basePacket = arrayList2.get(i);
                i++;
                BasePacket basePacket2 = basePacket;
                if (basePacket2 != null) {
                    int size2 = arrayListM27170b.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        SendDataInfo<?> sendDataInfo = arrayListM27170b.get(i2);
                        i2++;
                        final SendDataInfo<?> sendDataInfo2 = sendDataInfo;
                        if (sendDataInfo2.getOpCode() == basePacket2.getOpCode() && sendDataInfo2.getSn() == basePacket2.getOpCodeSn()) {
                            CommandBase<?, ?> commandBaseConvert2Command = ParseHelper.convert2Command(basePacket2, m27158a(sendDataInfo2.getDevice(), basePacket2));
                            final CommandCallback<C> callback = sendDataInfo2.getCallback();
                            JL_Log.m27232d(DataHandler.f37682g, "checkHaveResponseList", "callback command -> " + commandBaseConvert2Command);
                            m27163a(sendDataInfo2.getDevice(), sendDataInfo2.getOpCode(), sendDataInfo2.getSn());
                            if (commandBaseConvert2Command == null) {
                                DataHandler.this.f37686d.post(new Runnable() { // from class: com.jieli.jl_bt_ota.tool.data_handler.O00
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DataHandler.DataHandlerThread.m27171b(callback, sendDataInfo2);
                                    }
                                });
                            } else {
                                sendDataInfo2.setCommand(commandBaseConvert2Command);
                                m27166a((SendDataInfo) sendDataInfo2);
                            }
                            arrayList3.add(sendDataInfo2);
                            break;
                        }
                        if (sendDataInfo2.getTimeoutMs() < 500) {
                            sendDataInfo2.setTimeoutMs(500);
                        }
                        ArrayList<SendDataInfo<?>> arrayList4 = arrayListM27170b;
                        if (timeInMillis - sendDataInfo2.getSendTime() > sendDataInfo2.getTimeoutMs()) {
                            int reSendCount = sendDataInfo2.getReSendCount();
                            JL_Log.m27234e(DataHandler.f37682g, "checkHaveResponseList", "wait for response timeout !!! reSend count : " + reSendCount + ", data : " + sendDataInfo2);
                            if (reSendCount >= 3) {
                                JL_Log.m27234e(DataHandler.f37682g, "checkHaveResponseList", "retry count over time, callbackTimeOutError.");
                                m27173b(sendDataInfo2);
                                arrayList3.add(sendDataInfo2);
                            } else {
                                sendDataInfo2.setReSendCount(reSendCount + 1);
                                sendDataInfo2.setSend(false);
                            }
                        }
                        arrayListM27170b = arrayList4;
                    }
                }
                arrayList2 = arrayList;
                arrayListM27170b = arrayListM27170b;
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            this.f37694f.removeAll(arrayList3);
        }

        /* JADX INFO: renamed from: a */
        private <C extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void m27166a(final SendDataInfo<C> sendDataInfo) {
            final CommandCallback<C> callback;
            if (sendDataInfo == null || (callback = sendDataInfo.getCallback()) == null) {
                return;
            }
            DataHandler.this.f37686d.post(new Runnable() { // from class: com.jieli.jl_bt_ota.tool.data_handler.OXO1
                @Override // java.lang.Runnable
                public final void run() {
                    DataHandler.DataHandlerThread.m27165a(callback, sendDataInfo);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m27165a(CommandCallback commandCallback, SendDataInfo sendDataInfo) {
            commandCallback.onCommandResponse(sendDataInfo.getCommand());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m27167a(SendDataInfo sendDataInfo, CommandCallback commandCallback) {
            BaseError cmdSn = OTAError.buildError(ErrorCode.SUB_ERR_SEND_TIMEOUT).setOpCode(sendDataInfo.getOpCode()).setCmdSn(sendDataInfo.getSn());
            if (commandCallback != null) {
                commandCallback.onErrCode(cmdSn);
            }
            if (DataHandler.this.f37684b != null) {
                DataHandler.this.f37684b.onRCSPError(sendDataInfo.getDevice(), cmdSn);
            }
        }
    }

    public interface ThreadStateListener {
        void onFinish(long j);

        void onStart(long j);
    }

    public class TimerThread extends Thread {

        /* JADX INFO: renamed from: a */
        private final String f37698a;

        /* JADX INFO: renamed from: b */
        private final long f37699b;

        /* JADX INFO: renamed from: c */
        private volatile boolean f37700c;

        /* JADX INFO: renamed from: d */
        private final ThreadStateListener f37701d;

        public TimerThread(long j, ThreadStateListener threadStateListener) {
            super("TimerThread");
            this.f37698a = "TimerThread";
            this.f37699b = j;
            this.f37701d = threadStateListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f37700c) {
                try {
                    Thread.sleep(this.f37699b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (DataHandler.this.f37688f == null) {
                    break;
                } else {
                    DataHandler.this.f37688f.m27181f();
                }
            }
            this.f37700c = false;
            JL_Log.m27240w(DataHandler.f37682g, "TimerThread", "end....id : " + getId());
            ThreadStateListener threadStateListener = this.f37701d;
            if (threadStateListener != null) {
                threadStateListener.onFinish(getId());
            }
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f37700c = true;
            super.start();
            JL_Log.m27240w(DataHandler.f37682g, "TimerThread", " start.... id : " + getId());
            ThreadStateListener threadStateListener = this.f37701d;
            if (threadStateListener != null) {
                threadStateListener.onStart(getId());
            }
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m27185a() {
            this.f37700c = false;
        }
    }

    public class WorkThread extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: c */
        private static final int f37703c = 1;

        /* JADX INFO: renamed from: d */
        private static final int f37704d = 2;

        /* JADX INFO: renamed from: a */
        private Handler f37705a;

        public WorkThread(String str) {
            super(str, 10);
        }

        public Handler getWorkHandler() {
            if (this.f37705a == null) {
                this.f37705a = new Handler(getLooper(), this);
            }
            return this.f37705a;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                DataInfo dataInfo = (DataInfo) message.obj;
                if (DataHandler.this.f37688f == null) {
                    return false;
                }
                DataHandler.this.f37688f.tryToAddSendData(dataInfo);
                return false;
            }
            if (i != 2) {
                return false;
            }
            DataInfo dataInfo2 = (DataInfo) message.obj;
            if (DataHandler.this.f37688f == null || dataInfo2 == null) {
                return false;
            }
            DataHandler.this.f37688f.tryToAddRecvData(dataInfo2);
            return false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f37705a = new Handler(getLooper(), this);
        }

        public void tryToAddRecvData(DataInfo dataInfo) {
            if (this.f37705a == null) {
                this.f37705a = new Handler(getLooper(), this);
            }
            Message messageObtainMessage = this.f37705a.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.obj = dataInfo;
            this.f37705a.sendMessage(messageObtainMessage);
        }

        public void tryToAddSendData(DataInfo dataInfo) {
            if (this.f37705a == null) {
                this.f37705a = new Handler(getLooper(), this);
            }
            Message messageObtainMessage = this.f37705a.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = dataInfo;
            this.f37705a.sendMessage(messageObtainMessage);
        }
    }

    public DataHandler(IBtProxy iBtProxy, OnDataHandlerListener onDataHandlerListener) {
        this.f37683a = (IBtProxy) CommonUtil.checkNotNull(iBtProxy, "IBtProxy can not be null.");
        this.f37684b = onDataHandlerListener;
        m27150a();
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addRecvData(ReceivedDataInfo receivedDataInfo) {
        if (this.f37687e == null) {
            m27150a();
        }
        this.f37687e.tryToAddRecvData(receivedDataInfo);
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void addSendData(SendDataInfo<?> sendDataInfo) {
        if (this.f37687e == null) {
            m27150a();
        }
        this.f37687e.tryToAddSendData(sendDataInfo);
    }

    @Override // com.jieli.jl_bt_ota.tool.data_handler.IDataHandler
    public void release() {
        JL_Log.m27234e(f37682g, "release", "");
        m27154c();
    }

    /* JADX INFO: renamed from: b */
    private void m27152b() {
        if (this.f37687e == null) {
            this.f37687e = new WorkThread("Work_Thread");
        }
        this.f37687e.start();
    }

    /* JADX INFO: renamed from: c */
    private void m27154c() {
        DataHandlerThread dataHandlerThread = this.f37688f;
        if (dataHandlerThread != null) {
            dataHandlerThread.stopThread();
        }
        m27156d();
    }

    /* JADX INFO: renamed from: d */
    private void m27156d() {
        WorkThread workThread = this.f37687e;
        if (workThread != null) {
            workThread.quitSafely();
            this.f37687e = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27150a() {
        if (this.f37688f == null) {
            DataHandlerThread dataHandlerThread = new DataHandlerThread();
            this.f37688f = dataHandlerThread;
            dataHandlerThread.start();
            m27152b();
        }
    }
}
