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
import com.jieli.jl_rcsp.util.RcspUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final Param f38169b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f38170c;

    public static class Param {

        /* JADX INFO: renamed from: a */
        public final byte f38175a;

        /* JADX INFO: renamed from: b */
        public final short f38176b;

        /* JADX INFO: renamed from: c */
        public final int f38177c;

        /* JADX INFO: renamed from: d */
        public final int f38178d;

        /* JADX INFO: renamed from: e */
        public int f38179e;

        public Param(byte b, short s, int i, int i2) {
            this.f38175a = b;
            this.f38176b = s;
            this.f38177c = i;
            this.f38178d = i2;
        }

        public short getId() {
            return this.f38176b;
        }

        public int getOffset() {
            return this.f38178d;
        }

        public int getPacketSize() {
            return this.f38179e;
        }

        public int getSize() {
            return this.f38177c;
        }

        public byte getType() {
            return this.f38175a;
        }

        public void setPacketSize(int i) {
            this.f38179e = i;
        }
    }

    public ReadFileTask(RcspOpImpl rcspOpImpl, Param param) throws RuntimeException {
        super(rcspOpImpl);
        if (param == null) {
            throw new RuntimeException("ReadFileTask.Param can not be null.");
        }
        if (param.f38177c <= 0) {
            throw new RuntimeException("The size must be greater than 0");
        }
        this.f38169b = param;
        if (param.f38179e == 0) {
            param.f38179e = DeviceStatusManager.getInstance().getMaxReceiveMtu(getConnectedDevice()) - 20;
        }
        this.f38170c = ByteBuffer.allocate(param.f38177c - param.f38178d);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        throw new RuntimeException("can not invoke cancel method");
    }

    public byte[] getReadData() {
        return this.f38170c.array();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun()) {
            JL_Log.m27887w(this.tag, "start", "Task is in progress.");
        } else {
            callbackBegin();
            m27611a(this.f38169b.f38178d, Math.min(this.f38169b.f38177c, this.f38169b.f38179e), (short) 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27611a(final int i, final int i2, final short s) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(new SmallFileTransferCmd.ReadFileParam(this.f38169b.f38175a, this.f38169b.f38176b, (short) i, (short) i2, i == this.f38169b.f38178d ? (byte) 1 : (byte) 0)), new RcspCommandCallback<SmallFileTransferCmd>() { // from class: com.jieli.jl_rcsp.task.smallfile.ReadFileTask.1
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onErrCode(BluetoothDevice bluetoothDevice, BaseError baseError) {
                ReadFileTask.this.callbackError(baseError.getSubCode(), baseError.getMessage());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
            public void onCommandResponse(BluetoothDevice bluetoothDevice, SmallFileTransferCmd smallFileTransferCmd) {
                if (smallFileTransferCmd.getStatus() != 0) {
                    onErrCode(bluetoothDevice, ReadFileTask.this.buildResponseBadState(smallFileTransferCmd.getId(), smallFileTransferCmd.getStatus()));
                    return;
                }
                SmallFileTransferCmd.ReadFileResponse readFileResponse = (SmallFileTransferCmd.ReadFileResponse) smallFileTransferCmd.getResponse();
                byte b = readFileResponse.ret;
                if (b != 0) {
                    onErrCode(bluetoothDevice, ReadFileTask.this.buildResponseBadResult(smallFileTransferCmd.getId(), b));
                    return;
                }
                short sCRC16 = CryptoUtil.CRC16(readFileResponse.fileData, s);
                if (sCRC16 != readFileResponse.crc) {
                    onErrCode(bluetoothDevice, new BaseError(12544, RcspUtil.formatString("app last crc = %x, app crc = %x, device crc = %x.", Short.valueOf(s), Short.valueOf(sCRC16), Short.valueOf(readFileResponse.crc))));
                    return;
                }
                ReadFileTask.this.f38170c.put(readFileResponse.fileData);
                int i3 = i + i2;
                ReadFileTask.this.callbackProgress((int) ((((double) i3) * 100.0d) / ((double) ReadFileTask.this.f38169b.f38177c)));
                if (i3 >= ReadFileTask.this.f38170c.capacity()) {
                    ReadFileTask.this.callbackFinish();
                } else {
                    ReadFileTask readFileTask = ReadFileTask.this;
                    readFileTask.m27611a(i3, Math.min(i2, readFileTask.f38169b.f38177c - i3), sCRC16);
                }
            }
        });
    }
}
