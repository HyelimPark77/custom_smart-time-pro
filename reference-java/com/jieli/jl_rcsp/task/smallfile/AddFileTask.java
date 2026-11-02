package com.jieli.jl_rcsp.task.smallfile;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class AddFileTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final Param f38151b;

    /* JADX INFO: renamed from: c */
    public QueryFileTask.File f38152c;

    public static class Param {

        /* JADX INFO: renamed from: a */
        public int f38157a = 0;

        /* JADX INFO: renamed from: b */
        public int f38158b;

        /* JADX INFO: renamed from: c */
        public byte[] f38159c;
        protected int size;
        protected byte type;

        public Param(byte b, byte[] bArr) {
            this.type = b;
            this.size = bArr.length;
            this.f38159c = bArr;
        }

        public byte[] getData() {
            return this.f38159c;
        }

        public int getOffset() {
            return this.f38157a;
        }

        public int getPacketSize() {
            return this.f38158b;
        }

        public int getSize() {
            return this.size;
        }

        public byte getType() {
            return this.type;
        }

        public void setData(byte[] bArr) {
            this.f38159c = bArr;
        }

        public void setOffset(int i) {
            this.f38157a = i;
        }

        public void setPacketSize(int i) {
            this.f38158b = i;
        }

        public void setSize(int i) {
            this.size = i;
        }

        public void setType(byte b) {
            this.type = b;
        }
    }

    public AddFileTask(RcspOpImpl rcspOpImpl, Param param) throws RuntimeException {
        super(rcspOpImpl);
        if (param == null) {
            throw new RuntimeException("AddFileTask.Param can not be null.");
        }
        this.f38151b = param;
        if (param.f38158b == 0) {
            param.f38158b = DeviceStatusManager.getInstance().getMaxCommunicationMtu(getConnectedDevice()) - 20;
        }
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        throw new RuntimeException("can not invoke cancel method");
    }

    public QueryFileTask.File getFile() {
        return this.f38152c;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
        } else {
            callbackBegin();
            m27589a(this.f38151b.f38157a, Math.min(this.f38151b.f38158b, this.f38151b.size), (short) 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27589a(int i, int i2, short s) {
        int iMin = Math.min(this.f38151b.size - i, i2);
        byte[] bArr = new byte[iMin];
        System.arraycopy(this.f38151b.f38159c, i, bArr, 0, iMin);
        final int i3 = iMin + i;
        final short sCRC16 = CryptoUtil.CRC16(bArr, s);
        final SmallFileTransferCmd.Param paramMo27588a = mo27588a((short) i, (short) this.f38151b.size, bArr, sCRC16);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(paramMo27588a), new RcspCommandCallback<SmallFileTransferCmd>() { // from class: com.jieli.jl_rcsp.task.smallfile.AddFileTask.1
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
                AddFileTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                if (smallFileTransferCmd.getStatus() != 0) {
                    onErrCode(bluetoothDevice, AddFileTask.this.buildResponseBadState(smallFileTransferCmd.getId(), smallFileTransferCmd.getStatus()));
                    return;
                }
                SmallFileTransferCmd.ResultResponse resultResponse = (SmallFileTransferCmd.ResultResponse) smallFileTransferCmd.getResponse();
                byte b = resultResponse.ret;
                if (b != 0) {
                    onErrCode(bluetoothDevice, AddFileTask.this.buildResponseBadResult(smallFileTransferCmd.getId(), b));
                    return;
                }
                AddFileTask.this.callbackProgress((int) ((((double) i3) * 100.0d) / ((double) AddFileTask.this.f38151b.size)));
                if (i3 < AddFileTask.this.f38151b.size) {
                    AddFileTask addFileTask = AddFileTask.this;
                    addFileTask.m27589a(i3, addFileTask.f38151b.f38158b, sCRC16);
                    return;
                }
                if (paramMo27588a instanceof SmallFileTransferCmd.AddFileParam) {
                    AddFileTask addFileTask2 = AddFileTask.this;
                    addFileTask2.f38152c = new QueryFileTask.File(addFileTask2.f38151b.type, ((SmallFileTransferCmd.AddFileResponse) resultResponse).f38013id, AddFileTask.this.f38151b.size);
                    JL_Log.m27877d(((TaskBase) AddFileTask.this).tag, "write", "add small file finished id = " + ((int) AddFileTask.this.f38152c.f38168id));
                } else {
                    JL_Log.m27877d(((TaskBase) AddFileTask.this).tag, "write", "update small file finished id = " + ((int) AddFileTask.this.f38152c.f38168id));
                }
                AddFileTask.this.callbackFinish();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public SmallFileTransferCmd.Param mo27588a(short s, short s2, byte[] bArr, short s3) {
        return new SmallFileTransferCmd.AddFileParam(this.f38151b.type, s, s2, bArr, s3);
    }
}
