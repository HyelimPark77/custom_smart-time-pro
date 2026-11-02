package com.jieli.jl_rcsp.tool.datahandles;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ironsource.C12616d4;
import com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.model.DataInfo;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.tool.CommandHelper;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.datahandles.DataHandlerOld;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
@Deprecated
public class DataHandlerOld implements DataHandler {

    /* JADX INFO: renamed from: g */
    public static final String f38304g = "jl_rcsp";

    /* JADX INFO: renamed from: a */
    public final IBluetoothProxy f38305a;

    /* JADX INFO: renamed from: b */
    public final Handler f38306b;

    /* JADX INFO: renamed from: c */
    public WorkThread f38307c;

    /* JADX INFO: renamed from: d */
    public DataHandlerThread f38308d;

    /* JADX INFO: renamed from: e */
    public volatile byte[] f38309e;

    /* JADX INFO: renamed from: f */
    public volatile int f38310f = 0;

    public class DataHandlerThread extends Thread {

        /* JADX INFO: renamed from: a */
        public volatile boolean f38311a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f38312b;

        /* JADX INFO: renamed from: c */
        public final List<DataInfo> f38313c;

        /* JADX INFO: renamed from: d */
        public final LinkedBlockingQueue<DataInfo> f38314d;

        /* JADX INFO: renamed from: e */
        public final List<DataInfo> f38315e;

        /* JADX INFO: renamed from: f */
        public final List<DataInfo> f38316f;

        /* JADX INFO: renamed from: g */
        public TimerThread f38317g;

        public DataHandlerThread() {
            super("DataHandlerThread");
            this.f38313c = Collections.synchronizedList(new ArrayList());
            this.f38314d = new LinkedBlockingQueue<>();
            this.f38315e = Collections.synchronizedList(new ArrayList());
            this.f38316f = Collections.synchronizedList(new ArrayList());
        }

        /* JADX INFO: renamed from: c */
        public final DataInfo m27835c(DataInfo dataInfo) {
            BasePacket basePacket = dataInfo.getBasePacket();
            if (basePacket == null) {
                return null;
            }
            for (DataInfo dataInfo2 : new ArrayList(this.f38316f)) {
                BasePacket basePacket2 = dataInfo2.getBasePacket();
                if (basePacket2 != null && basePacket.getOpCode() == basePacket2.getOpCode() && basePacket.getOpCodeSn() == basePacket2.getOpCodeSn() && RcspUtil.deviceEquals(dataInfo.getDevice(), dataInfo2.getDevice())) {
                    return dataInfo2;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final void m27837d() {
            m27833b();
            DataInfo dataInfoM27839e = m27839e();
            if (dataInfoM27839e != null) {
                m27842f(dataInfoM27839e);
            } else if (this.f38316f.isEmpty() && this.f38315e.isEmpty()) {
                m27841f();
            } else {
                m27829a(500);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m27840e(DataInfo dataInfo) {
            BasePacket basePacket = dataInfo.getBasePacket();
            if (basePacket == null) {
                return;
            }
            if (basePacket.getHasResponse() == 1) {
                this.f38316f.remove(dataInfo);
            } else {
                this.f38315e.remove(dataInfo);
            }
            DataHandlerOld.this.m27818a(dataInfo, new BaseError(12288).setOpCode(basePacket.getOpCode()));
        }

        /* JADX INFO: renamed from: f */
        public final void m27841f() {
            TimerThread timerThread = this.f38317g;
            if (timerThread == null || !timerThread.f38321b) {
                return;
            }
            JL_Log.m27883i("jl_rcsp", "stopTimer", "");
            this.f38317g.m27846a();
        }

        /* JADX INFO: renamed from: g */
        public final void m27843g() {
            if (this.f38312b) {
                synchronized (this.f38314d) {
                    this.f38314d.notify();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f38314d) {
                while (this.f38311a) {
                    if (this.f38314d.isEmpty()) {
                        this.f38312b = true;
                        m27837d();
                        try {
                            this.f38314d.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        this.f38312b = false;
                        m27838d(this.f38314d.poll());
                        m27837d();
                    }
                }
            }
            this.f38315e.clear();
            this.f38316f.clear();
            this.f38314d.clear();
            this.f38311a = false;
            m27841f();
            DataHandlerOld.this.f38308d = null;
            JL_Log.m27880e("jl_rcsp", "DataHandlerThread", "exit");
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f38311a = true;
            super.start();
            JL_Log.m27883i("jl_rcsp", "DataHandlerThread", "start");
        }

        public void stopThread() {
            JL_Log.m27887w("jl_rcsp", "DataHandlerThread", "stopThread");
            this.f38311a = false;
            m27843g();
        }

        public void tryToAddRecvData(DataInfo dataInfo) {
            JL_Log.m27877d("jl_rcsp", "tryToAddRecvData", m27832a(dataInfo) + ", isWaiting : " + this.f38312b);
        }

        public void tryToAddSendData(DataInfo dataInfo) {
            JL_Log.m27877d("jl_rcsp", "tryToAddSendData", m27832a(dataInfo) + ", isWaiting : " + this.f38312b);
        }

        /* JADX INFO: renamed from: b */
        public final void m27833b() {
            if (!this.f38313c.isEmpty()) {
                JL_Log.m27877d("jl_rcsp", "checkResponseListModify", "start --> size = " + this.f38313c.size());
                ArrayList<DataInfo> arrayList = new ArrayList(this.f38313c);
                this.f38313c.clear();
                for (DataInfo dataInfo : arrayList) {
                    BasePacket basePacket = dataInfo.getBasePacket();
                    JL_Log.m27877d("jl_rcsp", "checkResponseListModify", "Receive command --> " + dataInfo);
                    if (basePacket != null) {
                        if (basePacket.getType() == 1) {
                            DataHandlerOld.this.f38305a.receiveDataFromDevice(dataInfo.getDevice(), basePacket);
                        } else {
                            DataInfo dataInfoM27835c = m27835c(dataInfo);
                            JL_Log.m27883i("jl_rcsp", "checkResponseListModify", "Cache Command --> size = " + this.f38316f.size() + "\t" + dataInfoM27835c);
                            if (dataInfoM27835c == null) {
                                JL_Log.m27887w("jl_rcsp", "checkResponseListModify", "No cached command found.");
                            } else {
                                this.f38316f.remove(dataInfoM27835c);
                                CommandBase commandBaseConvert2Command = ParseHelper.convert2Command(dataInfoM27835c.getDevice(), basePacket);
                                if (commandBaseConvert2Command == null) {
                                    BaseError baseError = new BaseError(12289);
                                    baseError.setOpCode(basePacket.getOpCode());
                                    DataHandlerOld.this.m27818a(dataInfoM27835c, baseError);
                                } else {
                                    DataHandlerOld.this.f38305a.receiveDataFromDevice(dataInfo.getDevice(), basePacket);
                                    DataHandlerOld.this.m27808a(dataInfoM27835c, commandBaseConvert2Command);
                                }
                                CommandHelper.getInstance().removeCommandBase(dataInfoM27835c.getDevice(), basePacket);
                            }
                        }
                    }
                }
            }
            if (!this.f38316f.isEmpty()) {
                for (DataInfo dataInfo2 : new ArrayList(this.f38316f)) {
                    if (dataInfo2.isSend()) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - dataInfo2.getSendTime();
                        if (dataInfo2.getTimeoutMs() < 500) {
                            dataInfo2.setTimeoutMs(500);
                        }
                        if (jCurrentTimeMillis >= dataInfo2.getTimeoutMs()) {
                            if (dataInfo2.getReSendCount() > 3) {
                                JL_Log.m27880e("jl_rcsp", "checkResponseListModify", "Command timeout --> " + dataInfo2);
                                m27834b(dataInfo2);
                                this.f38316f.remove(dataInfo2);
                            } else {
                                dataInfo2.setReSendCount(dataInfo2.getReSendCount() + 1);
                                dataInfo2.setSend(false);
                            }
                        }
                    }
                }
            }
            JL_Log.m27877d("jl_rcsp", "checkResponseListModify", "end --> size = " + this.f38313c.size());
        }

        /* JADX INFO: renamed from: a */
        public final void m27829a(int i) {
            TimerThread timerThread = this.f38317g;
            if (timerThread != null) {
                if (timerThread.f38321b) {
                    return;
                }
                this.f38317g.f38321b = true;
            } else {
                TimerThread timerThread2 = DataHandlerOld.this.new TimerThread(i, new ThreadStateListener() { // from class: com.jieli.jl_rcsp.tool.datahandles.DataHandlerOld.DataHandlerThread.1
                    @Override // com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener
                    public void onFinish(long j) {
                        if (DataHandlerThread.this.f38317g == null || DataHandlerThread.this.f38317g.getId() != j) {
                            return;
                        }
                        DataHandlerThread.this.f38317g = null;
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener
                    public void onStart(long j) {
                    }
                });
                this.f38317g = timerThread2;
                timerThread2.start();
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m27842f(DataInfo dataInfo) {
            if (dataInfo == null) {
                return;
            }
            byte[] bArrPackSendBasePacket = ParseHelper.packSendBasePacket(dataInfo.getBasePacket());
            if (bArrPackSendBasePacket == null) {
                JL_Log.m27883i("jl_rcsp", "sendData", "pack data error.");
                m27840e(dataInfo);
                return;
            }
            JL_Log.m27885v("jl_rcsp", "sendData", C12616d4.j.f34440d + CHexConver.byte2HexStr(bArrPackSendBasePacket) + C12616d4.j.f34442e);
            if (bArrPackSendBasePacket.length > DataHandlerOld.m27811b(dataInfo.getDevice()) + 8) {
                JL_Log.m27880e("jl_rcsp", "sendData", "Data over communication mtu [" + DataHandlerOld.m27811b(dataInfo.getDevice()) + "] limit.");
                m27840e(dataInfo);
                return;
            }
            boolean zSendDataToDevice = false;
            for (int i = 0; i < 3 && !(zSendDataToDevice = DataHandlerOld.this.f38305a.sendDataToDevice(dataInfo.getDevice(), bArrPackSendBasePacket)); i++) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            JL_Log.m27883i("jl_rcsp", "sendData", "" + zSendDataToDevice);
            if (!zSendDataToDevice) {
                m27840e(dataInfo);
            } else if (dataInfo.getBasePacket().getHasResponse() != 1) {
                DataHandlerOld.this.m27808a(dataInfo, ParseHelper.convert2Command(dataInfo.getDevice(), dataInfo.getBasePacket()));
                this.f38315e.remove(dataInfo);
            } else {
                dataInfo.setSend(true);
                dataInfo.setSendTime(Calendar.getInstance().getTimeInMillis());
            }
        }

        /* JADX INFO: renamed from: e */
        public final DataInfo m27839e() {
            int i = 0;
            if (!this.f38315e.isEmpty()) {
                while (i < this.f38315e.size()) {
                    DataInfo dataInfo = this.f38315e.get(i);
                    if (!dataInfo.isSend()) {
                        return dataInfo;
                    }
                    i++;
                }
                return null;
            }
            if (this.f38316f.isEmpty()) {
                return null;
            }
            while (i < this.f38316f.size()) {
                DataInfo dataInfo2 = this.f38316f.get(i);
                if (!dataInfo2.isSend()) {
                    return dataInfo2;
                }
                i++;
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final ArrayList<DataInfo> m27836c() {
            if (this.f38316f.isEmpty()) {
                return null;
            }
            ArrayList<DataInfo> arrayList = new ArrayList<>();
            for (DataInfo dataInfo : this.f38316f) {
                if (dataInfo.isSend()) {
                    arrayList.add(dataInfo);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: d */
        public final void m27838d(DataInfo dataInfo) {
            if (dataInfo != null) {
                if (dataInfo.getType() == 1) {
                    ArrayList<BasePacket> arrayListFindPacketData = DataHandlerOld.this.findPacketData(dataInfo.getDevice(), dataInfo.getRecvData());
                    if (arrayListFindPacketData != null) {
                        ArrayList arrayList = new ArrayList();
                        for (BasePacket basePacket : arrayListFindPacketData) {
                            JL_Log.m27877d("jl_rcsp", "handlerQueue", "opCode : " + basePacket.getOpCode());
                            arrayList.add(new DataInfo().setType(1).setDevice(dataInfo.getDevice()).setBasePacket(basePacket));
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        this.f38313c.addAll(arrayList);
                        m27843g();
                        return;
                    }
                    JL_Log.m27880e("jl_rcsp", "handlerQueue", "findPacketData not found. ");
                    return;
                }
                if (dataInfo.getBasePacket() != null) {
                    if (dataInfo.getBasePacket().getHasResponse() == 1) {
                        if (this.f38316f.size() < 30) {
                            this.f38316f.add(dataInfo);
                            return;
                        } else {
                            JL_Log.m27883i("jl_rcsp", "handlerQueue", "haveResponseDataList is busy. ");
                            DataHandlerOld.this.f38305a.callbackErrorEvent(new BaseError(12291));
                            return;
                        }
                    }
                    if (this.f38315e.size() < 60) {
                        this.f38315e.add(dataInfo);
                    } else {
                        JL_Log.m27883i("jl_rcsp", "handlerQueue", "noResponseDataList is busy. ");
                        DataHandlerOld.this.f38305a.callbackErrorEvent(new BaseError(12291));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m27832a(DataInfo dataInfo) {
            boolean zOffer;
            if (dataInfo != null) {
                try {
                    zOffer = this.f38314d.offer(dataInfo, 3L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    zOffer = false;
                }
            } else {
                zOffer = false;
            }
            if (zOffer) {
                m27843g();
            }
            return zOffer;
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public final void m27828a() {
            ArrayList<DataInfo> arrayList = new ArrayList<>();
            if (!this.f38313c.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (DataInfo dataInfo : new ArrayList(this.f38313c)) {
                    BasePacket basePacket = dataInfo.getBasePacket();
                    if (basePacket != null) {
                        DataHandlerOld.this.f38305a.receiveDataFromDevice(dataInfo.getDevice(), basePacket);
                        if (basePacket.getType() == 1) {
                            arrayList2.add(dataInfo);
                        } else {
                            arrayList.add(dataInfo);
                        }
                    } else {
                        arrayList3.add(dataInfo);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    this.f38313c.removeAll(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    this.f38313c.removeAll(arrayList3);
                }
                m27831a(arrayList);
                return;
            }
            m27831a((ArrayList<DataInfo>) null);
        }

        @Deprecated
        /* JADX INFO: renamed from: a */
        public final void m27831a(ArrayList<DataInfo> arrayList) {
            ArrayList<DataInfo> arrayList2;
            long j;
            ArrayList<DataInfo> arrayListM27836c;
            if (!this.f38316f.isEmpty()) {
                ArrayList<DataInfo> arrayListM27836c2 = m27836c();
                StringBuilder sb = new StringBuilder();
                sb.append("waitList size : ");
                sb.append(arrayListM27836c2 == null ? 0 : arrayListM27836c2.size());
                JL_Log.m27883i("jl_rcsp", "checkHaveResponseList", sb.toString());
                if (arrayListM27836c2 == null || arrayListM27836c2.isEmpty()) {
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long jM27817a = DataHandlerOld.this.m27817a();
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (DataInfo dataInfo : arrayList) {
                        final BasePacket basePacket = dataInfo.getBasePacket();
                        if (basePacket != null) {
                            JL_Log.m27877d("jl_rcsp", "checkHaveResponseList", "opCode : " + basePacket.getOpCode() + ", sn : " + basePacket.getOpCodeSn() + ", device : " + dataInfo.getDevice());
                            Iterator<DataInfo> it = arrayListM27836c2.iterator();
                            while (it.hasNext()) {
                                final DataInfo next = it.next();
                                final BasePacket basePacket2 = next.getBasePacket();
                                ArrayList<DataInfo> arrayList5 = arrayListM27836c2;
                                if (basePacket2 != null) {
                                    JL_Log.m27883i("jl_rcsp", "checkHaveResponseList", "packet opCode : " + basePacket2.getOpCode() + ", packet sn : " + basePacket2.getOpCodeSn());
                                }
                                if (basePacket2 != null && basePacket2.getOpCode() == basePacket.getOpCode() && basePacket2.getOpCodeSn() == basePacket.getOpCodeSn() && RcspUtil.deviceEquals(next.getDevice(), dataInfo.getDevice())) {
                                    JL_Log.m27887w("jl_rcsp", "checkHaveResponseList", "callback");
                                    DataHandlerOld.this.f38306b.post(new Runnable() { // from class: com.jieli.jl_rcsp.tool.datahandles.OXO1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f38329IO.m27830a(next, basePacket, basePacket2);
                                        }
                                    });
                                    arrayList3.add(dataInfo);
                                    arrayList4.add(next);
                                    arrayListM27836c2 = arrayList5;
                                    break;
                                }
                                if (next.getTimeoutMs() < 500) {
                                    next.setTimeoutMs(500);
                                }
                                long j2 = jM27817a;
                                if (jM27817a - next.getSendTime() > next.getTimeoutMs()) {
                                    int reSendCount = next.getReSendCount();
                                    JL_Log.m27880e("jl_rcsp", "checkHaveResponseList", "wait for response timeout !!! reSend count : " + reSendCount + ", data : " + next);
                                    if (reSendCount >= 3) {
                                        JL_Log.m27880e("jl_rcsp", "checkHaveResponseList", "retry count over time, callbackTimeOutError.");
                                        m27834b(next);
                                        arrayList3.add(dataInfo);
                                        arrayList4.add(next);
                                    } else {
                                        next.setReSendCount(reSendCount + 1);
                                        next.setSend(false);
                                    }
                                }
                                arrayListM27836c2 = arrayList5;
                                it = it;
                                jM27817a = j2;
                            }
                        }
                    }
                    arrayList2 = arrayListM27836c2;
                    j = jM27817a;
                    if (!arrayList3.isEmpty()) {
                        arrayList.removeAll(arrayList3);
                        this.f38313c.removeAll(arrayList3);
                    }
                    if (!arrayList.isEmpty()) {
                        JL_Log.m27880e("jl_rcsp", "checkHaveResponseList", "remove unused response.");
                        this.f38313c.removeAll(arrayList);
                    }
                    if (!arrayList4.isEmpty()) {
                        this.f38316f.removeAll(arrayList4);
                        arrayList4.clear();
                        arrayListM27836c = m27836c();
                    }
                    if (arrayListM27836c != null || arrayListM27836c.isEmpty()) {
                        return;
                    }
                    for (DataInfo dataInfo2 : arrayListM27836c) {
                        if (dataInfo2.getTimeoutMs() < 500) {
                            dataInfo2.setTimeoutMs(500);
                        }
                        if (j - dataInfo2.getSendTime() > dataInfo2.getTimeoutMs()) {
                            int reSendCount2 = dataInfo2.getReSendCount();
                            JL_Log.m27880e("jl_rcsp", "checkHaveResponseList", "wait for response timeout 222222 !!! reSend count : " + reSendCount2 + ", data : " + dataInfo2);
                            if (reSendCount2 >= 3) {
                                JL_Log.m27880e("jl_rcsp", "checkHaveResponseList", "retry count over time 222222, callbackTimeOutError.");
                                m27834b(dataInfo2);
                                arrayList4.add(dataInfo2);
                            } else {
                                dataInfo2.setReSendCount(reSendCount2 + 1);
                                dataInfo2.setSend(false);
                            }
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        return;
                    }
                    this.f38316f.removeAll(arrayList4);
                    return;
                }
                arrayList2 = arrayListM27836c2;
                j = jM27817a;
                arrayListM27836c = arrayList2;
                if (arrayListM27836c != null) {
                    return;
                } else {
                    return;
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            JL_Log.m27880e("jl_rcsp", "checkHaveResponseList", "22222 remove unused response.");
            this.f38313c.removeAll(arrayList);
        }

        /* JADX INFO: renamed from: b */
        public final void m27834b(DataInfo dataInfo) {
            CommandHelper.getInstance().removeCommandBase(dataInfo.getDevice(), dataInfo.getBasePacket());
            BaseError baseError = new BaseError(12290);
            if (dataInfo.getBasePacket() != null) {
                baseError.setOpCode(dataInfo.getBasePacket().getOpCode());
            }
            DataHandlerOld.this.m27818a(dataInfo, baseError);
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void m27830a(DataInfo dataInfo, BasePacket basePacket, BasePacket basePacket2) {
            CommandBase commandBaseConvert2Command = ParseHelper.convert2Command(dataInfo.getDevice(), basePacket);
            if (commandBaseConvert2Command != null) {
                DataHandlerOld.this.m27808a(dataInfo, commandBaseConvert2Command);
            } else {
                BaseError baseError = new BaseError(12289);
                baseError.setOpCode(basePacket.getOpCode());
                DataHandlerOld.this.m27818a(dataInfo, baseError);
            }
            CommandHelper.getInstance().removeCommandBase(dataInfo.getDevice(), basePacket2);
        }
    }

    public class TimerThread extends Thread {

        /* JADX INFO: renamed from: a */
        public final long f38320a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f38321b;

        /* JADX INFO: renamed from: c */
        public final ThreadStateListener f38322c;

        public TimerThread(long j, ThreadStateListener threadStateListener) {
            super("TimerThread");
            this.f38320a = j;
            this.f38322c = threadStateListener;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.f38321b) {
                try {
                    Thread.sleep(this.f38320a);
                    if (DataHandlerOld.this.f38308d == null) {
                        break;
                    } else {
                        DataHandlerOld.this.f38308d.m27843g();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.f38321b = false;
            JL_Log.m27887w("jl_rcsp", "TimerThread", "end. thread id : " + getId());
            ThreadStateListener threadStateListener = this.f38322c;
            if (threadStateListener != null) {
                threadStateListener.onFinish(getId());
            }
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            this.f38321b = true;
            super.start();
            JL_Log.m27887w("jl_rcsp", "TimerThread", "start. thread id : " + getId());
            ThreadStateListener threadStateListener = this.f38322c;
            if (threadStateListener != null) {
                threadStateListener.onStart(getId());
            }
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m27846a() {
            this.f38321b = false;
        }
    }

    public class WorkThread extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: c */
        public static final int f38324c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f38325d = 2;

        /* JADX INFO: renamed from: a */
        public Handler f38326a;

        public WorkThread(String str) {
            super(str, 10);
        }

        public Handler getWorkHandler() {
            if (this.f38326a == null) {
                this.f38326a = new Handler(getLooper(), this);
            }
            return this.f38326a;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (i == 1) {
                DataInfo dataInfo = (DataInfo) message.obj;
                if (DataHandlerOld.this.f38308d != null) {
                    DataHandlerOld.this.f38308d.tryToAddSendData(dataInfo);
                }
            } else if (i == 2) {
                DataInfo dataInfo2 = (DataInfo) message.obj;
                if (DataHandlerOld.this.f38308d != null && dataInfo2 != null) {
                    DataHandlerOld.this.f38308d.tryToAddRecvData(dataInfo2);
                }
            }
            return false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f38326a = new Handler(getLooper(), this);
        }

        public void tryToAddRecvData(DataInfo dataInfo) {
            if (this.f38326a == null) {
                this.f38326a = new Handler(getLooper(), this);
            }
            Message messageObtainMessage = this.f38326a.obtainMessage();
            messageObtainMessage.what = 2;
            messageObtainMessage.obj = dataInfo;
            this.f38326a.sendMessage(messageObtainMessage);
        }

        public void tryToAddSendData(DataInfo dataInfo) {
            if (this.f38326a == null) {
                this.f38326a = new Handler(getLooper(), this);
            }
            Message messageObtainMessage = this.f38326a.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = dataInfo;
            this.f38326a.sendMessage(messageObtainMessage);
        }
    }

    public DataHandlerOld(IBluetoothProxy iBluetoothProxy) {
        if (iBluetoothProxy == null) {
            throw new NullPointerException("IBluetoothProxy can not be null.");
        }
        this.f38305a = iBluetoothProxy;
        this.f38306b = new Handler(Looper.getMainLooper());
        m27820b();
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addRecvData(DataInfo dataInfo) {
        if (this.f38307c == null) {
            m27820b();
        }
        WorkThread workThread = this.f38307c;
        if (workThread != null) {
            workThread.tryToAddRecvData(dataInfo);
        }
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void addSendData(DataInfo dataInfo) {
        if (this.f38307c == null) {
            m27820b();
        }
        WorkThread workThread = this.f38307c;
        if (workThread != null) {
            workThread.tryToAddSendData(dataInfo);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m27824e() {
        WorkThread workThread = this.f38307c;
        if (workThread != null) {
            workThread.quitSafely();
            this.f38307c = null;
        }
    }

    public ArrayList<BasePacket> findPacketData(BluetoothDevice bluetoothDevice, byte[] bArr) {
        ArrayList<BasePacket> arrayList;
        byte[] bArr2;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            if (this.f38310f > 0) {
                bArr2 = new byte[this.f38310f + length];
                System.arraycopy(this.f38309e, 0, bArr2, 0, this.f38310f);
                System.arraycopy(bArr, 0, bArr2, this.f38310f, length);
                length += this.f38310f;
                this.f38310f = 0;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
            arrayList = new ArrayList<>();
            int i = 0;
            int i2 = -1;
            while (i < length) {
                for (int i3 = i; i3 < length; i3++) {
                    if (bArr2[i3] == -2) {
                        int i4 = i3 + 1;
                        if (i4 >= length) {
                            m27819a(bArr2, i3, length - i3);
                            break;
                        }
                        if (bArr2[i4] == -36) {
                            int i5 = i3 + 2;
                            if (i5 >= length) {
                                m27819a(bArr2, i3, length - i3);
                                break;
                            }
                            if (bArr2[i5] == -70) {
                                int i6 = i3 + 3;
                                if (i6 >= length) {
                                    m27819a(bArr2, i3, length - i3);
                                    break;
                                }
                                i2 = i6;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (i2 <= 0) {
                    JL_Log.m27887w("jl_rcsp", "findPacketData", "No header data found.");
                    break;
                }
                int i7 = i2 + 4;
                if (i7 <= length) {
                    byte[] bArr3 = new byte[2];
                    System.arraycopy(bArr2, i2 + 2, bArr3, 0, 2);
                    int iBytesToInt = CHexConver.bytesToInt(bArr3[0], bArr3[1]);
                    if (iBytesToInt > m27814c(bluetoothDevice)) {
                        JL_Log.m27880e("jl_rcsp", "findPacketData", RcspUtil.formatString("data length[%d] over MAX_RECEIVE_MTU[%d], cast away", Integer.valueOf(iBytesToInt), Integer.valueOf(m27814c(bluetoothDevice))));
                        i += i2;
                    } else {
                        int i8 = i7 + iBytesToInt;
                        int i9 = i8 + 1;
                        if (i9 > length) {
                            int i10 = i2 - 3;
                            m27819a(bArr2, i10, length - i10);
                        } else if (bArr2[i8] == -17) {
                            int i11 = iBytesToInt + 4;
                            byte[] bArr4 = new byte[i11];
                            System.arraycopy(bArr2, i2, bArr4, 0, i11);
                            BasePacket basePacketM27805a = m27805a(bluetoothDevice, bArr4);
                            if (basePacketM27805a != null) {
                                arrayList.add(basePacketM27805a);
                            }
                            if (i9 == length) {
                                break;
                            }
                            i2 = -1;
                            i = i9;
                        } else {
                            i++;
                        }
                    }
                } else {
                    int i12 = i2 - 3;
                    m27819a(bArr2, i12, length - i12);
                }
                i = length;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.jieli.jl_rcsp.tool.datahandles.DataHandler
    public void release() {
        JL_Log.m27883i("jl_rcsp", "release", "=====>>>");
        CommandHelper.getInstance().release();
        m27823d();
    }

    /* JADX INFO: renamed from: b */
    public final void m27820b() {
        if (this.f38308d == null) {
            DataHandlerThread dataHandlerThread = new DataHandlerThread();
            this.f38308d = dataHandlerThread;
            dataHandlerThread.start();
            m27822c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27822c() {
        if (this.f38307c == null) {
            this.f38307c = new WorkThread("Work_Thread");
        }
        this.f38307c.start();
    }

    /* JADX INFO: renamed from: d */
    public final void m27823d() {
        DataHandlerThread dataHandlerThread = this.f38308d;
        if (dataHandlerThread != null) {
            dataHandlerThread.stopThread();
        }
        m27824e();
    }

    /* JADX INFO: renamed from: c */
    public static int m27814c(BluetoothDevice bluetoothDevice) {
        return DeviceStatusManager.getInstance().getMaxReceiveMtu(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m27811b(BluetoothDevice bluetoothDevice) {
        return DeviceStatusManager.getInstance().getMaxCommunicationMtu(bluetoothDevice);
    }

    /* JADX INFO: renamed from: a */
    public final void m27819a(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length <= 0 || i < 0 || i2 <= 0 || i + i2 > bArr.length) {
            return;
        }
        this.f38309e = new byte[i2];
        System.arraycopy(bArr, i, this.f38309e, 0, i2);
        this.f38310f = i2;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m27821b(DataInfo dataInfo, BaseError baseError) {
        if (dataInfo.getRcspCmdCallback() != null) {
            dataInfo.getRcspCmdCallback().onErrCode(dataInfo.getDevice(), baseError);
        }
        this.f38305a.callbackErrorEvent(baseError);
    }

    /* JADX INFO: renamed from: a */
    public static BasePacket m27805a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return null;
        }
        byte[] booleanArrayBig = CHexConver.getBooleanArrayBig(bArr[0]);
        int iByteToInt = CHexConver.byteToInt(bArr[1]);
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, 2, bArr2, 0, 2);
        int iBytesToInt = CHexConver.bytesToInt(bArr2[0], bArr2[1]);
        BasePacket basePacket = new BasePacket();
        int i = 7;
        int iByteToInt2 = CHexConver.byteToInt(booleanArrayBig[7]);
        int iByteToInt3 = CHexConver.byteToInt(booleanArrayBig[6]);
        basePacket.setType(iByteToInt2);
        basePacket.setHasResponse(iByteToInt3);
        basePacket.setOpCode(iByteToInt);
        basePacket.setParamLen(iBytesToInt);
        if (iBytesToInt > 0) {
            if (iByteToInt2 == 0) {
                byte[] bArr3 = new byte[1];
                System.arraycopy(bArr, 4, bArr3, 0, 1);
                basePacket.setStatus(CHexConver.byteToInt(bArr3[0]));
                byte[] bArr4 = new byte[1];
                System.arraycopy(bArr, 5, bArr4, 0, 1);
                basePacket.setOpCodeSn(CHexConver.byteToInt(bArr4[0]));
                if (iByteToInt == 1) {
                    byte[] bArr5 = new byte[1];
                    System.arraycopy(bArr, 6, bArr5, 0, 1);
                    basePacket.setXmOpCode(CHexConver.byteToInt(bArr5[0]));
                } else {
                    i = 6;
                }
            } else {
                byte[] bArr6 = new byte[1];
                System.arraycopy(bArr, 4, bArr6, 0, 1);
                basePacket.setOpCodeSn(CHexConver.byteToInt(bArr6[0]));
                if (iByteToInt == 1) {
                    byte[] bArr7 = new byte[1];
                    System.arraycopy(bArr, 5, bArr7, 0, 1);
                    basePacket.setXmOpCode(CHexConver.byteToInt(bArr7[0]));
                    i = 6;
                } else {
                    i = 5;
                }
            }
            int i2 = iBytesToInt - (i - 4);
            byte[] bArr8 = new byte[i2];
            System.arraycopy(bArr, i, bArr8, 0, i2);
            basePacket.setParamData(bArr8);
            JL_Log.m27877d("jl_rcsp", "parsePacketData", RcspUtil.formatString("packet type : %d, opCode : %d, sn :%d, device : %s", Integer.valueOf(basePacket.getType()), Integer.valueOf(basePacket.getOpCode()), Integer.valueOf(basePacket.getOpCodeSn()), bluetoothDevice));
        }
        return basePacket;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m27813b(DataInfo dataInfo, CommandBase commandBase) {
        if (dataInfo.getRcspCmdCallback() != null) {
            dataInfo.getRcspCmdCallback().onCommandResponse(dataInfo.getDevice(), commandBase);
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m27817a() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public final void m27818a(final DataInfo dataInfo, final BaseError baseError) {
        if (dataInfo == null || baseError == null) {
            return;
        }
        this.f38306b.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i1i00X0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7704IO.m27821b(dataInfo, baseError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m27808a(final DataInfo dataInfo, final CommandBase commandBase) {
        if (dataInfo == null) {
            return;
        }
        this.f38306b.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O00OI1iX
            @Override // java.lang.Runnable
            public final void run() {
                DataHandlerOld.m27813b(dataInfo, commandBase);
            }
        });
    }
}
