package com.jieli.jl_rcsp.task;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.file_op.ReadFileFromDeviceCmd;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.tool.BooleanRcspActionCallback;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class GetFileTask extends TaskBase {
    public static final String BYTE_ARRAY_STREAM = "byte_array_stream";
    public static final int REASON_CANCEL_TASK = 0;
    public static final int REASON_CRC_ERROR = 2;
    public static final int REASON_LOST_DATA = 1;

    /* JADX INFO: renamed from: l */
    public static final int f38044l = 8705;

    /* JADX INFO: renamed from: m */
    public static final int f38045m = 8706;

    /* JADX INFO: renamed from: b */
    public final String f38046b;

    /* JADX INFO: renamed from: c */
    public OutputStream f38047c;

    /* JADX INFO: renamed from: d */
    public byte[] f38048d;

    /* JADX INFO: renamed from: e */
    public final Param f38049e;

    /* JADX INFO: renamed from: f */
    public boolean f38050f;

    /* JADX INFO: renamed from: g */
    public HandlerThread f38051g;

    /* JADX INFO: renamed from: h */
    public Handler f38052h;

    /* JADX INFO: renamed from: i */
    public final Handler f38053i;

    /* JADX INFO: renamed from: j */
    public final Handler.Callback f38054j;

    /* JADX INFO: renamed from: k */
    public final OnRcspCallback f38055k;
    protected boolean useCrc;

    public static class Param {
        public short lastCrc;
        public int lastOffset;
        public int lastProgress;
        public int totalSize;

        public Param() {
            this.lastOffset = 0;
            this.lastCrc = (short) 0;
            this.lastProgress = -1;
        }

        public void reset() {
            this.totalSize = 0;
            this.lastOffset = 0;
            this.lastCrc = (short) 0;
            this.lastProgress = -1;
        }
    }

    public GetFileTask(RcspOpImpl rcspOpImpl, String str) {
        super(rcspOpImpl);
        this.f38047c = null;
        this.f38048d = new byte[0];
        this.useCrc = true;
        this.f38050f = false;
        this.f38053i = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.X00010
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f3846IO.m27463a(message);
            }
        });
        this.f38054j = new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.OiX1iIIi
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f3775IO.m27466b(message);
            }
        };
        this.f38055k = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.task.GetFileTask.4
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onConnectStateChange(BluetoothDevice bluetoothDevice, int i) {
                if (GetFileTask.this.isRun() && i != 1) {
                    GetFileTask.this.onError(8192);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (GetFileTask.this.isRun() && commandBase.getId() == 36) {
                    ReadFileFromDeviceCmd readFileFromDeviceCmd = (ReadFileFromDeviceCmd) commandBase;
                    ReadFileFromDeviceCmd.Param param = (ReadFileFromDeviceCmd.Param) readFileFromDeviceCmd.getParam();
                    if (param == null) {
                        return;
                    }
                    byte b = param.f38012op;
                    if (b == -128) {
                        byte b2 = ((ReadFileFromDeviceCmd.StopParam) param).ret;
                        if (b2 != 0) {
                            BaseError baseErrorBuildResponseBadResult = GetFileTask.this.buildResponseBadResult(readFileFromDeviceCmd.getId(), b2);
                            GetFileTask.this.onError(baseErrorBuildResponseBadResult.getSubCode(), baseErrorBuildResponseBadResult.getMessage());
                        } else if (GetFileTask.this.f38052h != null && !GetFileTask.this.f38052h.sendEmptyMessage(GetFileTask.f38045m)) {
                            JL_Log.m27887w(GetFileTask.this.tag, "MSG_READ_FINISH", "lost message.");
                        }
                    } else if (b == -127) {
                        GetFileTask.this.m27465b(((ReadFileFromDeviceCmd.CancelParam) param).reason);
                    }
                    readFileFromDeviceCmd.setOpCodeSn(commandBase.getOpCodeSn());
                    readFileFromDeviceCmd.setStatus(0);
                    readFileFromDeviceCmd.setParam(new ReadFileFromDeviceCmd.Param(((ReadFileFromDeviceCmd.Param) readFileFromDeviceCmd.getParam()).f38012op));
                    GetFileTask.this.mRcspOp.sendCommandResponse(bluetoothDevice, readFileFromDeviceCmd, null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspDataCmd(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                if (GetFileTask.this.isRun() && commandBase.getId() == 1) {
                    DataCmd dataCmd = (DataCmd) commandBase;
                    if (((DataParam) dataCmd.getParam()).getXmOpCode() != 36) {
                        return;
                    }
                    byte[] data = ((DataParam) dataCmd.getParam()).getData();
                    if (GetFileTask.this.f38052h == null || GetFileTask.this.f38052h.sendMessage(GetFileTask.this.f38052h.obtainMessage(GetFileTask.f38044l, data))) {
                        return;
                    }
                    JL_Log.m27887w(GetFileTask.this.tag, "MSG_RECEIVE_DATA", "lost message.");
                }
            }
        };
        this.f38046b = str;
        this.f38049e = new Param();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i) {
        onError(i, null);
    }

    private void release() {
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), false);
        this.f38049e.reset();
        this.f38050f = false;
        this.mRcspOp.unregisterOnRcspCallback(this.f38055k);
        this.f38053i.removeCallbacksAndMessages(null);
        Handler handler = this.f38052h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f38052h = null;
        }
        HandlerThread handlerThread = this.f38051g;
        if (handlerThread != null && !handlerThread.isInterrupted()) {
            this.f38051g.quit();
        }
        this.f38051g = null;
        OutputStream outputStream = this.f38047c;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f38047c.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.f38047c = null;
            }
        }
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        m27461a(b, (String) null);
    }

    public abstract ReadFileFromDeviceCmd.Param createParam(BluetoothDevice bluetoothDevice);

    public byte[] getCacheData() {
        return this.f38048d;
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
            return;
        }
        if (isDeviceInCalling()) {
            onError(12545);
            return;
        }
        m27464b();
        HandlerThread handlerThread = new HandlerThread("ReadFileThread");
        this.f38051g = handlerThread;
        handlerThread.start();
        this.f38052h = new Handler(this.f38051g.getLooper(), this.f38054j);
        if (BYTE_ARRAY_STREAM.equals(this.f38046b)) {
            this.f38047c = new ByteArrayOutputStream();
        } else {
            try {
                this.f38047c = new FileOutputStream(this.f38046b);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                onError(4097, RcspUtil.formatString("%s File not found.", WatchError.getErrorDesc(4097)));
                return;
            }
        }
        m27467c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i, String str) {
        JL_Log.m27880e(this.tag, "onError ", "code = " + i + ", " + str);
        release();
        if (str == null) {
            callbackError(i);
        } else {
            callbackError(i, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27467c() {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new ReadFileFromDeviceCmd(createParam(getConnectedDevice())), new CustomRcspActionCallback("ReadFileFromDevice", new OnOperationCallback<ReadFileFromDeviceCmd.StartResponse>() { // from class: com.jieli.jl_rcsp.task.GetFileTask.1
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                GetFileTask.this.onError(baseError.getSubCode(), baseError.getMessage());
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(ReadFileFromDeviceCmd.StartResponse startResponse) {
                GetFileTask.this.f38049e.totalSize = startResponse.size;
                GetFileTask.this.f38049e.lastCrc = (short) 0;
                GetFileTask.this.f38053i.removeMessages(4386);
                GetFileTask.this.f38053i.sendEmptyMessageDelayed(4386, TaskBase.TIMEOUT);
            }
        }, new IHandleResult<ReadFileFromDeviceCmd.StartResponse, ReadFileFromDeviceCmd>() { // from class: com.jieli.jl_rcsp.task.GetFileTask.2
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice, ReadFileFromDeviceCmd readFileFromDeviceCmd) {
                return 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public ReadFileFromDeviceCmd.StartResponse handleResult(BluetoothDevice bluetoothDevice, ReadFileFromDeviceCmd readFileFromDeviceCmd) {
                if (readFileFromDeviceCmd != null && readFileFromDeviceCmd.getStatus() == 0 && (readFileFromDeviceCmd.getResponse() instanceof ReadFileFromDeviceCmd.StartResponse)) {
                    return (ReadFileFromDeviceCmd.StartResponse) readFileFromDeviceCmd.getResponse();
                }
                return null;
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean m27466b(Message message) {
        if (message == null) {
            return false;
        }
        int i = message.what;
        if (i != 8705) {
            if (i != 8706) {
                return true;
            }
            m27459a();
            return true;
        }
        Object obj = message.obj;
        if (!(obj instanceof byte[])) {
            return true;
        }
        m27462a((byte[]) obj);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean m27463a(Message message) {
        if (message.what != 4386) {
            return true;
        }
        JL_Log.m27887w(this.tag, "MSG_WAITING_FOR_DATA_TIMEOUT", "");
        onError(12290, "Waiting for data timeout.");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m27461a(final int i, final String str) {
        if (isRun() && this.f38050f) {
            JL_Log.m27887w(this.tag, "cancelBigFileTransfer", "reason : " + i + ", " + str);
            this.f38050f = true;
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), new ReadFileFromDeviceCmd(new ReadFileFromDeviceCmd.CancelParam(CHexConver.intToByte(i))), new BooleanRcspActionCallback("cancelBigFileTransfer", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.task.GetFileTask.3
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    GetFileTask.this.onError(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    int i2 = i;
                    if (i2 != 0) {
                        GetFileTask.this.onError(i2, str);
                    } else {
                        GetFileTask.this.m27465b(0);
                    }
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27464b() {
        this.f38049e.reset();
        this.f38048d = new byte[0];
        this.f38050f = false;
        this.mRcspOp.registerOnRcspCallback(this.f38055k);
        this.mDeviceStatusManager.updateFileTransfer(getConnectedDevice(), true);
        callbackBegin();
    }

    /* JADX INFO: renamed from: a */
    public final void m27462a(byte[] bArr) {
        byte[] bArr2;
        ByteBuffer byteBuffer;
        if (!isRun() || bArr == null || bArr.length < 4) {
            return;
        }
        this.f38053i.removeMessages(4386);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int i = byteBufferWrap.getInt();
        JL_Log.m27877d(this.tag, "onData", "offset = " + i + ", lastOffset = " + this.f38049e.lastOffset + ", data size = " + bArr.length);
        Param param = this.f38049e;
        if (param.lastOffset == 0) {
            param.lastOffset = i;
        }
        int i2 = param.lastOffset;
        if (i2 != i) {
            m27461a(1, RcspUtil.formatString("Offset does not match. sdk count offset = %d, firmware return offset = %d.", Integer.valueOf(i2), Integer.valueOf(i)));
            return;
        }
        final int i3 = (int) (((i2 * 1.0f) / param.totalSize) * 100.0f);
        if (param.lastProgress != i3) {
            param.lastProgress = i3;
            this.f38053i.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Oi10I0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3649IO.m27460a(i3);
                }
            });
        }
        if (this.useCrc) {
            short s = byteBufferWrap.getShort();
            bArr2 = new byte[byteBufferWrap.remaining()];
            byteBuffer = byteBufferWrap.get(bArr2);
            Param param2 = this.f38049e;
            param2.lastCrc = CryptoUtil.CRC16(bArr2, param2.lastCrc);
            JL_Log.m27877d(this.tag, "onData", RcspUtil.formatString("crc = %d(0x%X), lastCrc = %d(0x%X)", Short.valueOf(s), Short.valueOf(s), Short.valueOf(this.f38049e.lastCrc), Short.valueOf(this.f38049e.lastCrc)));
            short s2 = this.f38049e.lastCrc;
            if (s != s2) {
                m27461a(2, RcspUtil.formatString("CRC error. data crc = 0x%X, firmware return crc = 0x%X", Short.valueOf(s2), Short.valueOf(s)));
                return;
            }
        } else {
            bArr2 = new byte[byteBufferWrap.remaining()];
            byteBuffer = byteBufferWrap.get(bArr2);
        }
        try {
            this.f38047c.write(bArr2);
            this.f38049e.lastOffset = i + bArr2.length;
            JL_Log.m27877d(this.tag, "onData", "buf size = " + bArr2.length + ", lastOffset = " + this.f38049e.lastOffset);
            this.f38053i.sendEmptyMessageDelayed(4386, (long) TaskBase.TIMEOUT);
            byteBuffer.rewind();
        } catch (IOException e) {
            e.printStackTrace();
            m27461a(1, "IO exception : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27465b(int i) {
        release();
        callbackCancel(i);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27460a(int i) {
        callbackProgress(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m27459a() {
        long length;
        if (isRun()) {
            OutputStream outputStream = this.f38047c;
            if (outputStream instanceof ByteArrayOutputStream) {
                byte[] byteArray = ((ByteArrayOutputStream) outputStream).toByteArray();
                this.f38048d = byteArray;
                length = byteArray.length;
            } else {
                length = outputStream instanceof FileOutputStream ? new File(this.f38046b).length() : 0L;
            }
            if (length != this.f38049e.totalSize) {
                onError(16387, "Data loss. Firmware return data size = " + this.f38049e.totalSize + ", Actual received data size = " + length);
                return;
            }
            JL_Log.m27883i(this.tag, "onFinish", "Reading file completed. " + this.f38046b);
            release();
            callbackProgress(100);
            callbackFinish();
        }
    }
}
