package com.jieli.jl_rcsp.task.smallfile;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;

/* JADX INFO: loaded from: classes17.dex */
public class AddFileTask extends TaskBase {
    public final Param b;
    public QueryFileTask.File c;

    public static class Param {
        public int a;
        public int b;
        public byte[] c;
        protected int size;
        protected byte type;

        public Param(byte r1, byte[] r2) {
            this.type = r1;
            this.size = r2.length;
            this.c = r2;
            this.a = 0;
        }

        public static /* synthetic */ int a(Param r0) {
            return r0.b;
        }

        public static /* synthetic */ int b(Param r0) {
            return r0.a;
        }

        public static /* synthetic */ byte[] c(Param r0) {
            return r0.c;
        }

        public byte[] getData() {
            return this.c;
        }

        public int getOffset() {
            return this.a;
        }

        public int getPacketSize() {
            return this.b;
        }

        public int getSize() {
            return this.size;
        }

        public byte getType() {
            return this.type;
        }

        public void setData(byte[] r1) {
            this.c = r1;
        }

        public void setOffset(int r1) {
            this.a = r1;
        }

        public void setPacketSize(int r1) {
            this.b = r1;
        }

        public void setSize(int r1) {
            this.size = r1;
        }

        public void setType(byte r1) {
            this.type = r1;
        }

        public static /* synthetic */ int a(Param r0, int r1) {
            r0.b = r1;
            return r1;
        }
    }

    public AddFileTask(RcspOpImpl r2, Param r3) throws RuntimeException {
        super(r2);
        if (r3 == null) goto L9;
        this.b = r3;
        if (Param.a(r3) != 0) goto L10;
        Param.a(r3, DeviceStatusManager.getInstance().getMaxCommunicationMtu(getConnectedDevice()) - 20);
        return;
    L10:
        return;
    L9:
        throw new RuntimeException("AddFileTask.Param can not be null.");
    }

    public static /* synthetic */ void a(AddFileTask r0, int r1, int r2, short r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ BaseError b(AddFileTask r0, int r1, int r2) {
        return r0.buildResponseBadResult(r1, r2);
    }

    public static /* synthetic */ String c(AddFileTask r0) {
        return r0.tag;
    }

    public static /* synthetic */ void d(AddFileTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        throw new RuntimeException("can not invoke cancel method");
    }

    public QueryFileTask.File getFile() {
        return this.c;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        callbackBegin();
        a(Param.b(this.b), Math.min(Param.a(this.b), this.b.size), 0);
    }

    public static /* synthetic */ void a(AddFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public static /* synthetic */ String b(AddFileTask r0) {
        return r0.tag;
    }

    public static /* synthetic */ BaseError a(AddFileTask r0, int r1, int r2) {
        return r0.buildResponseBadState(r1, r2);
    }

    public static /* synthetic */ Param a(AddFileTask r0) {
        return r0.b;
    }

    public static /* synthetic */ void a(AddFileTask r0, int r1) {
        r0.callbackProgress(r1);
    }

    public final void a(int r5, int r6, short r7) {
        int r8 = Math.min(this.b.size - r5, r6);
        byte[] r0 = new byte[r8];
        System.arraycopy(Param.c(this.b), r5, r0, 0, r8);
        final int r9 = r8 + r5;
        final short r10 = CryptoUtil.CRC16(r0, r7);
        final SmallFileTransferCmd.Param r11 = a((short) r5, (short) this.b.size, r0, r10);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(r11), new AnonymousClass1(this, r9, r11, r10));
    }

    public SmallFileTransferCmd.Param a(short r7, short r8, byte[] r9, short r10) {
        return new SmallFileTransferCmd.AddFileParam(this.b.type, r7, r8, r9, r10);
    }
}
