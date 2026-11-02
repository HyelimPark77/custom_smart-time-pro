package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.ironsource.C12616d4;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.NotifyPrepareEnvCmd;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.file_op.CancelLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.DeviceExtendParamCmd;
import com.jieli.jl_rcsp.model.command.file_op.LargeFileTransferGetNameCmd;
import com.jieli.jl_rcsp.model.command.file_op.LargeFileTransferOpCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopLargeFileTransferCmd;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.model.parameter.LargeFileTransferOpParam;
import com.jieli.jl_rcsp.model.parameter.StartLargeFileTransferParam;
import com.jieli.jl_rcsp.model.response.StartLargeFileTransferResponse;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class TransferTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public String f38063b;

    /* JADX INFO: renamed from: c */
    public final CacheVar f38064c;

    /* JADX INFO: renamed from: d */
    public final Param f38065d;

    /* JADX INFO: renamed from: e */
    public final Handler f38066e;
    protected ExecutorService executor;

    /* JADX INFO: renamed from: f */
    public final OnRcspCallback f38067f;
    public int maxRenameCount;

    public static class CacheVar {

        /* JADX INFO: renamed from: l */
        public static final int f38076l = 50;

        /* JADX INFO: renamed from: a */
        public RandomAccessFile f38077a;

        /* JADX INFO: renamed from: b */
        public short f38078b;

        /* JADX INFO: renamed from: c */
        public int f38079c;

        /* JADX INFO: renamed from: d */
        public long f38080d;

        /* JADX INFO: renamed from: e */
        public int f38081e;

        /* JADX INFO: renamed from: f */
        public int f38082f;

        /* JADX INFO: renamed from: g */
        public final LinkedBlockingQueue<SendData> f38083g;

        /* JADX INFO: renamed from: h */
        public boolean f38084h;

        /* JADX INFO: renamed from: i */
        public long f38085i;

        /* JADX INFO: renamed from: j */
        public long f38086j;

        /* JADX INFO: renamed from: k */
        public long f38087k;

        public CacheVar() {
            this.f38082f = 0;
            this.f38083g = new LinkedBlockingQueue<>();
            this.f38086j = -1L;
            this.f38087k = 50L;
        }

        /* JADX INFO: renamed from: a */
        public void m27502a() {
            RandomAccessFile randomAccessFile = this.f38077a;
            if (randomAccessFile != null) {
                try {
                    try {
                        randomAccessFile.close();
                        this.f38077a = null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    this.f38077a = null;
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m27503b() {
            this.f38079c = 0;
            this.f38080d = 0L;
            this.f38081e = 0;
            this.f38082f = 0;
            this.f38084h = false;
            this.f38085i = 0L;
            this.f38086j = -1L;
            this.f38087k = 50L;
            this.f38083g.clear();
            m27502a();
        }
    }

    public static class Param {
        public int devHandler;
        public String outputDirPath;
        public boolean appHasCrc16 = true;
        public boolean useFlash = false;
        public boolean isOtherEncode = false;
        public String encodeType = StandardCharsets.UTF_16LE.name();

        /* JADX INFO: renamed from: a */
        public boolean f38088a = false;

        public String toString() {
            return "Param{devHandler=" + this.devHandler + ", appHasCrc16=" + this.appHasCrc16 + ", useFlash=" + this.useFlash + ", firmwareHasCrc16=" + this.f38088a + ", isOtherEncode=" + this.isOtherEncode + ", encodeType=" + this.encodeType + ", outputDirPath=" + this.outputDirPath + i0XO1.f7442IO;
        }
    }

    public static class SendData {

        /* JADX INFO: renamed from: a */
        public int f38089a;

        /* JADX INFO: renamed from: b */
        public byte[] f38090b;

        public SendData(int i, byte[] bArr) {
            this.f38089a = i;
            this.f38090b = bArr;
        }
    }

    public TransferTask(RcspOpImpl rcspOpImpl, String str, Param param) throws RuntimeException {
        super(rcspOpImpl);
        this.maxRenameCount = 9;
        this.executor = Executors.newSingleThreadExecutor();
        this.f38066e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.fz5
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6777IO.m27472a(message);
            }
        });
        this.f38067f = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.task.TransferTask.8
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onConnectStateChange(BluetoothDevice bluetoothDevice, int i) {
                if (TransferTask.this.isRun() && i != 1) {
                    TransferTask.this.onError(8192, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (!TransferTask.this.isRun() || commandBase == null) {
                    return;
                }
                switch (commandBase.getId()) {
                    case 28:
                        StopLargeFileTransferCmd stopLargeFileTransferCmd = (StopLargeFileTransferCmd) commandBase;
                        StopLargeFileTransferCmd.Param param2 = (StopLargeFileTransferCmd.Param) stopLargeFileTransferCmd.getParam();
                        if (param2 != null) {
                            int reason = param2.getReason();
                            stopLargeFileTransferCmd.setParam(null);
                            stopLargeFileTransferCmd.setStatus(0);
                            TransferTask.this.mRcspOp.sendCommandResponse(bluetoothDevice, stopLargeFileTransferCmd, null);
                            TransferTask.this.m27483a(reason);
                            break;
                        }
                        break;
                    case 29:
                        LargeFileTransferOpCmd largeFileTransferOpCmd = (LargeFileTransferOpCmd) commandBase;
                        if (TransferTask.this.f38064c.f38079c != 0) {
                            TransferTask.this.m27488a(largeFileTransferOpCmd);
                        } else {
                            JL_Log.m27880e(TransferTask.this.tag, "onRcspCommand", "mtu is 0");
                        }
                        break;
                    case 30:
                        CancelLargeFileTransferCmd cancelLargeFileTransferCmd = (CancelLargeFileTransferCmd) commandBase;
                        cancelLargeFileTransferCmd.setParam(null);
                        cancelLargeFileTransferCmd.setStatus(0);
                        TransferTask.this.mRcspOp.sendCommandResponse(bluetoothDevice, cancelLargeFileTransferCmd, null);
                        TransferTask.this.m27497f();
                        break;
                    case 32:
                        TransferTask.this.m27487a((LargeFileTransferGetNameCmd) commandBase);
                        break;
                }
            }
        };
        if (param == null) {
            throw new RuntimeException("TransferTask.Param can not be null.");
        }
        this.f38065d = param;
        JL_Log.m27877d(this.tag, C12616d4.a.f34169f, param + ", class = " + this);
        this.f38064c = new CacheVar();
        setPath(str);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        if (isRun()) {
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), new CancelLargeFileTransferCmd(), new BooleanRcspActionCallback("cancel", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.TransferTask.1
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    TransferTask.this.onError(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    TransferTask.this.m27497f();
                }
            }));
        }
    }

    public String getPath() {
        return this.f38063b;
    }

    /* JADX INFO: renamed from: i */
    public final void m27499i() {
        if (isRun()) {
            Param param = this.f38065d;
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), new DeviceExtendParamCmd(new DeviceExtendParamCmd.FileTransferParam(param.devHandler, param.appHasCrc16)), new CustomRcspActionCallback("readExternParam", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.TransferTask.4
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    TransferTask.this.onError(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    TransferTask.this.f38065d.f38088a = bool.booleanValue();
                    TransferTask.this.m27501k();
                }
            }, new IHandleResult<Boolean, DeviceExtendParamCmd>() { // from class: com.jieli.jl_rcsp.task.TransferTask.5
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public int hasResult(BluetoothDevice bluetoothDevice, DeviceExtendParamCmd deviceExtendParamCmd) {
                    return 0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public Boolean handleResult(BluetoothDevice bluetoothDevice, DeviceExtendParamCmd deviceExtendParamCmd) {
                    return (deviceExtendParamCmd == null || !(deviceExtendParamCmd.getResponse() instanceof DeviceExtendParamCmd.FileTransferResponse)) ? Boolean.FALSE : Boolean.valueOf(((DeviceExtendParamCmd.FileTransferResponse) deviceExtendParamCmd.getResponse()).hasCrc16);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m27500j() {
        if (isRun()) {
            JL_Log.m27877d(this.tag, "startFileTransferFlow", "" + this.f38065d);
            if (!this.f38065d.useFlash) {
                m27498h();
                return;
            }
            File file = new File(this.f38063b);
            m27491a("/" + file.getName(), (int) file.length());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0093  */
    /* JADX INFO: renamed from: k */
    public final void m27501k() {
        int iIndexOf;
        if (isRun()) {
            JL_Log.m27877d(this.tag, "startTransferActual", "path = " + this.f38063b);
            File file = new File(this.f38063b);
            if (!file.exists() || file.isDirectory() || file.length() == 0) {
                onError(4097, RcspUtil.formatString("Path is invalid. path = " + this.f38063b, new Object[0]));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(RcspUtil.formatString("%08x", Integer.valueOf((file.getName() + file.lastModified()).hashCode())));
            sb.append(".tmp\u0000");
            String string = sb.toString();
            String str = this.f38065d.outputDirPath;
            if (str == null) {
                iIndexOf = -1;
            } else {
                String str2 = File.separator;
                if (str.startsWith(str2)) {
                    iIndexOf = this.f38065d.outputDirPath.indexOf(str2);
                } else {
                    iIndexOf = -1;
                }
            }
            String strSubstring = iIndexOf == -1 ? this.f38065d.outputDirPath : this.f38065d.outputDirPath.substring(iIndexOf);
            if (strSubstring != null && !strSubstring.isEmpty()) {
                String str3 = File.separator;
                if (strSubstring.endsWith(str3)) {
                    string = strSubstring + string;
                } else {
                    string = strSubstring + str3 + string;
                }
            }
            JL_Log.m27877d(this.tag, "startTransferActual", "tempPath --->" + string);
            byte[] bytes = string.getBytes();
            CacheVar cacheVar = this.f38064c;
            m27492a(bytes, cacheVar.f38082f, cacheVar.f38078b);
        }
    }

    public void onError(int i) {
        onError(i, null);
    }

    public void release() {
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), false);
        this.f38064c.m27503b();
        this.mRcspOp.unregisterOnRcspCallback(this.f38067f);
        this.f38066e.removeCallbacksAndMessages(null);
        if (this.executor.isShutdown()) {
            return;
        }
        this.executor.shutdownNow();
    }

    public void setPath(String str) {
        this.f38063b = str;
        int iLastIndexOf = str.lastIndexOf(File.separator);
        if (iLastIndexOf != -1) {
            if (str.length() - (iLastIndexOf + 1) > 9) {
                this.maxRenameCount = 32;
            } else {
                this.maxRenameCount = 9;
            }
        }
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
            return;
        }
        if (isFileTransfer()) {
            JL_Log.m27887w(this.tag, "start", "SDK in file transfer.");
            onError(4352);
        } else if (isDeviceInCalling()) {
            JL_Log.m27887w(this.tag, "start", "Device in calling.");
            onError(12545);
        } else {
            if (this.executor.isShutdown()) {
                this.executor = Executors.newSingleThreadExecutor();
            }
            m27479g();
            m27482a();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m27479g() {
        this.f38064c.m27503b();
        this.mRcspOp.registerOnRcspCallback(this.f38067f);
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), true);
        callbackBegin();
    }

    /* JADX INFO: renamed from: b */
    public final long m27493b() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: c */
    public final SDCardBean m27494c() {
        List<SDCardBean> onlineDev = FileBrowseManager.getInstance().getOnlineDev();
        if (onlineDev != null && !onlineDev.isEmpty()) {
            for (SDCardBean sDCardBean : onlineDev) {
                if (sDCardBean.getDevHandler() == this.f38065d.devHandler) {
                    return sDCardBean;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m27495d() throws Throwable {
        FileInputStream fileInputStream;
        File file = new File(this.f38063b);
        if (file.exists() && !file.isDirectory()) {
            long j = 0;
            if (file.length() != 0) {
                long jM27493b = m27493b();
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        try {
                            this.f38064c.f38077a = new RandomAccessFile(file, "r");
                            this.f38064c.f38082f = (int) file.length();
                            fileInputStream = new FileInputStream(file);
                            try {
                                long jAvailable = fileInputStream.available();
                                byte[] bArr = new byte[2048];
                                short sCRC16 = 0;
                                while (true) {
                                    int i = fileInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    byte[] bArr2 = new byte[i];
                                    System.arraycopy(bArr, 0, bArr2, 0, i);
                                    sCRC16 = CryptoUtil.CRC16(bArr2, sCRC16);
                                    j += (long) i;
                                }
                                long jM27481a = m27481a(jM27493b);
                                this.f38064c.f38078b = sCRC16;
                                JL_Log.m27877d(this.tag, "countFileCrc", RcspUtil.formatString("Take data time = %d, file len = %d, file size = %d, data size = %d, crc = %d(0x%X)", Long.valueOf(jM27481a), Integer.valueOf(this.f38064c.f38082f), Long.valueOf(jAvailable), Long.valueOf(j), Short.valueOf(sCRC16), Short.valueOf(sCRC16)));
                                CacheVar cacheVar = this.f38064c;
                                if (cacheVar.f38082f != j) {
                                    cacheVar.f38082f = (int) j;
                                }
                                m27500j();
                                fileInputStream.close();
                                return;
                            } catch (Exception e) {
                                e = e;
                                fileInputStream2 = fileInputStream;
                                e.printStackTrace();
                                this.f38066e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.cz5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f6091IO.m27490a(e);
                                    }
                                });
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                if (fileInputStream == null) {
                                    throw th2;
                                }
                                try {
                                    fileInputStream.close();
                                    throw th2;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                    throw th2;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = fileInputStream2;
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return;
                }
            }
        }
        onError(4097, RcspUtil.formatString("Path is invalid. path = " + this.f38063b, new Object[0]));
    }

    /* JADX INFO: renamed from: e */
    public final void m27496e() {
        if (!this.f38064c.f38083g.isEmpty()) {
            SendData sendDataPoll = this.f38064c.f38083g.poll();
            if (sendDataPoll == null) {
                return;
            }
            m27486a(sendDataPoll.f38089a, sendDataPoll.f38090b, new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.TransferTask.7
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    TransferTask.this.onError(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    TransferTask.this.m27496e();
                }
            });
            return;
        }
        this.f38064c.f38084h = false;
        if (isRun()) {
            this.f38066e.removeMessages(4386);
            this.f38066e.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m27497f() {
        release();
        callbackCancel(0);
    }

    /* JADX INFO: renamed from: h */
    public final void m27498h() {
        if (isRun()) {
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.NotifyPrepareTransferLargeFileParam()), new BooleanRcspActionCallback("prepareBigFileTransferEnv", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.TransferTask.3
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    TransferTask.this.onError(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    DeviceInfo deviceInfo = TransferTask.this.mRcspOp.getDeviceInfo();
                    if (deviceInfo == null || deviceInfo.isSupportPackageCrc16()) {
                        TransferTask.this.m27499i();
                    } else {
                        TransferTask.this.m27501k();
                    }
                }
            }));
        }
    }

    public void onError(int i, String str) {
        release();
        if (str == null) {
            callbackError(i);
        } else {
            callbackError(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m27472a(Message message) {
        if (message.what != 4386) {
            return true;
        }
        onError(12290);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final long m27481a(long j) {
        return m27493b() - j;
    }

    /* JADX INFO: renamed from: a */
    public final void m27487a(LargeFileTransferGetNameCmd largeFileTransferGetNameCmd) {
        if (isRun()) {
            this.f38066e.removeMessages(4386);
            this.f38066e.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
            String name = new File(this.f38063b).getName();
            JL_Log.m27877d(this.tag, "onGetName", "File name = " + name + ", retryName = " + this.f38064c.f38081e);
            largeFileTransferGetNameCmd.setParam(new LargeFileTransferGetNameCmd.Param(name, this.f38064c.f38081e).setOtherEncode(this.f38065d.isOtherEncode).setEncodeType(this.f38065d.encodeType));
            largeFileTransferGetNameCmd.setStatus(this.f38064c.f38081e >= this.maxRenameCount ? 1 : 0);
            largeFileTransferGetNameCmd.setOpCodeSn(largeFileTransferGetNameCmd.getOpCodeSn());
            this.mRcspOp.sendCommandResponse(getConnectedDevice(), largeFileTransferGetNameCmd, null);
            if (this.f38065d.useFlash) {
                return;
            }
            CacheVar cacheVar = this.f38064c;
            int i = cacheVar.f38081e;
            if (i >= this.maxRenameCount) {
                onError(16898);
            } else {
                cacheVar.f38081e = i + 1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27483a(int i) {
        Folder currentReadFile;
        int i2;
        long jM27481a = m27481a(this.f38064c.f38080d);
        JL_Log.m27883i(this.tag, "onStop", "Transfer file take time -->" + jM27481a + ", reason = " + i);
        if (i != 0) {
            if (i == 1) {
                i2 = WatchError.ERR_FAT_WRITE;
            } else if (i == 2) {
                i2 = WatchError.ERR_DATA_OVER_LIMIT;
            } else if (i != 3) {
                i2 = i != 4 ? 12293 : 16897;
            } else {
                i2 = 12544;
            }
            onError(i2, WatchError.getErrorDesc(i2));
            return;
        }
        JL_Log.m27883i(this.tag, "onStop", "Transfer of large file is complete.");
        SDCardBean sDCardBeanM27494c = m27494c();
        if (sDCardBeanM27494c != null && (currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBeanM27494c)) != null) {
            currentReadFile.setLoadFinished(false);
        }
        release();
        callbackProgress(100);
        callbackFinish();
    }

    /* JADX INFO: renamed from: a */
    public final void m27482a() {
        try {
            this.executor.execute(new Runnable() { // from class: com.android.mltcode.paycertificationapi.gz5
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f7002IO.m27495d();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            onError(16389, "Exception : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27490a(Exception exc) {
        onError(16389, "IO Exception : " + exc.getMessage());
    }

    /* JADX INFO: renamed from: a */
    public final void m27491a(String str, int i) {
        if (isRun()) {
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashInsertNewFileStartCmd(str, i), new BooleanRcspActionCallback("startCreateFlashFile", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.TransferTask.2
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    TransferTask.this.onError(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    TransferTask.this.m27498h();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27492a(byte[] bArr, int i, short s) {
        JL_Log.m27877d(this.tag, "startBigFileTransfer", RcspUtil.formatString("size = %d, crc16 = %d(0x%X)", Integer.valueOf(i), Short.valueOf(s), Short.valueOf(s)));
        long jM27493b = m27493b();
        CacheVar cacheVar = this.f38064c;
        cacheVar.f38080d = jM27493b;
        cacheVar.f38085i = jM27493b;
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new StartLargeFileTransferCmd(new StartLargeFileTransferParam(bArr, i, s)), new RcspCommandCallback<StartLargeFileTransferCmd>() { // from class: com.jieli.jl_rcsp.task.TransferTask.6
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
                JL_Log.m27880e(TransferTask.this.tag, "startBigFileTransfer", "onErrCode ---> " + baseError);
                TransferTask.this.onError(baseError.getSubCode(), baseError.getMessage());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice, StartLargeFileTransferCmd startLargeFileTransferCmd) {
                if (startLargeFileTransferCmd.getStatus() != 0) {
                    short transferMtu = ((StartLargeFileTransferResponse) startLargeFileTransferCmd.getResponse()).getTransferMtu();
                    onErrCode(bluetoothDevice, transferMtu != 0 ? TransferTask.this.buildResponseBadResult(startLargeFileTransferCmd.getId(), transferMtu) : TransferTask.this.buildResponseBadState(startLargeFileTransferCmd.getId(), startLargeFileTransferCmd.getStatus()));
                    return;
                }
                TransferTask.this.f38064c.f38079c = ((StartLargeFileTransferResponse) startLargeFileTransferCmd.getResponse()).getTransferMtu();
                JL_Log.m27877d(TransferTask.this.tag, "startBigFileTransfer", "transferMtu = " + TransferTask.this.f38064c.f38079c);
                if (TransferTask.this.f38064c.f38079c <= 0) {
                    onErrCode(bluetoothDevice, new BaseError(4097, RcspUtil.formatString("Device[%s] return an invalid mtu : %d.", bluetoothDevice, Integer.valueOf(TransferTask.this.f38064c.f38079c))));
                } else {
                    TransferTask.this.f38066e.removeMessages(4386);
                    TransferTask.this.f38066e.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m27486a(int i, byte[] bArr, OnOperationCallback<Boolean> onOperationCallback) {
        DataParam dataParam = new DataParam(bArr);
        dataParam.setXmOpCode(i);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new DataCmd(dataParam), new BooleanRcspActionCallback("sendData", onOperationCallback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m27488a(final LargeFileTransferOpCmd largeFileTransferOpCmd) {
        final int i = this.f38064c.f38079c;
        if (!isRun() || i <= 0 || this.f38064c.f38077a == null) {
            return;
        }
        LargeFileTransferOpParam largeFileTransferOpParam = (LargeFileTransferOpParam) largeFileTransferOpCmd.getParam();
        final int offset = largeFileTransferOpParam.getOffset();
        final short buffer = largeFileTransferOpParam.getBuffer();
        long jM27481a = m27481a(this.f38064c.f38085i);
        CacheVar cacheVar = this.f38064c;
        if (cacheVar.f38086j == offset && jM27481a < cacheVar.f38087k) {
            JL_Log.m27887w(this.tag, "pullData", RcspUtil.formatString("Received same packet.Skip! offset = %d, take time = %d, limit = %d", Integer.valueOf(offset), Long.valueOf(jM27481a), Long.valueOf(this.f38064c.f38087k)));
            return;
        }
        this.f38066e.removeMessages(4386);
        if (offset > 512) {
            int i2 = this.f38064c.f38082f;
            float f = i2 == 0 ? 0.0f : (offset * 100.0f) / i2;
            callbackProgress((int) (f <= 100.0f ? f : 100.0f));
        }
        try {
            try {
                this.executor.execute(new Runnable() { // from class: com.android.mltcode.paycertificationapi.hz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7247IO.m27485a(offset, buffer, i, largeFileTransferOpCmd);
                    }
                });
            } catch (Exception e) {
                e = e;
                Exception exc = e;
                exc.printStackTrace();
                onError(16389, "Exception = " + exc.getMessage());
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27485a(final int i, final int i2, int i3, LargeFileTransferOpCmd largeFileTransferOpCmd) {
        int i4;
        byte[] bArr;
        try {
            CacheVar cacheVar = this.f38064c;
            long j = i;
            cacheVar.f38086j = j;
            cacheVar.f38085i = m27493b();
            this.f38064c.f38077a.seek(j);
            byte[] bArr2 = new byte[0];
            final int iMin = Math.min(i2, this.f38064c.f38082f - i);
            if (iMin >= 0) {
                bArr2 = new byte[iMin];
                i4 = this.f38064c.f38077a.read(bArr2);
            } else {
                i4 = -1;
            }
            if (i4 == -1) {
                this.f38066e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.dz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6307IO.m27484a(i, iMin, i2);
                    }
                });
                return;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, i4);
            this.f38064c.f38087k = (long) Math.max((((double) i4) * 10.0d) / ((double) i3), 10.0d);
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                int iMin2 = Math.min(i3, i4 - i5);
                int i7 = i5 + iMin2;
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, i5, i7);
                Param param = this.f38065d;
                if (param.appHasCrc16 && param.f38088a) {
                    bArr = new byte[iMin2 + 3];
                    short sCRC16 = CryptoUtil.CRC16(bArrCopyOfRange2, (short) 0);
                    bArr[1] = (byte) ((sCRC16 >> 8) & 255);
                    bArr[2] = (byte) (sCRC16 & 255);
                    System.arraycopy(bArrCopyOfRange2, 0, bArr, 3, iMin2);
                } else {
                    bArr = new byte[iMin2 + 1];
                    System.arraycopy(bArrCopyOfRange2, 0, bArr, 1, iMin2);
                }
                bArr[0] = CHexConver.intToByte(i6);
                this.f38064c.f38083g.add(new SendData(largeFileTransferOpCmd.getId(), bArr));
                i6++;
                i5 = i7;
            }
            if (this.f38064c.f38084h) {
                return;
            }
            m27496e();
        } catch (IOException e) {
            e.printStackTrace();
            this.f38066e.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ez5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6533IO.m27489a(e);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27484a(int i, int i2, int i3) {
        onError(16389, "Failed to read data. offset = " + i + ", packetSize = " + i2 + ", buffer : " + i3);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27489a(IOException iOException) {
        onError(16389, "IO Exception = " + iOException.getMessage());
    }
}
