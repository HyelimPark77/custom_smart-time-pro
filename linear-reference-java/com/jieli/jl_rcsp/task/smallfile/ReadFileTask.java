package com.jieli.jl_rcsp.task.smallfile;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.util.JL_Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class ReadFileTask extends TaskBase {
    public final Param b;
    public final ByteBuffer c;

    public static class Param {
        public final byte a;
        public final short b;
        public final int c;
        public final int d;
        public int e;

        public Param(byte r1, short r2, int r3, int r4) {
            this.a = r1;
            this.b = r2;
            this.c = r3;
            this.d = r4;
        }

        public static /* synthetic */ int a(Param r0) {
            return r0.c;
        }

        public static /* synthetic */ int b(Param r0) {
            return r0.e;
        }

        public static /* synthetic */ int c(Param r0) {
            return r0.d;
        }

        public static /* synthetic */ byte d(Param r0) {
            return r0.a;
        }

        public static /* synthetic */ short e(Param r0) {
            return r0.b;
        }

        public short getId() {
            return this.b;
        }

        public int getOffset() {
            return this.d;
        }

        public int getPacketSize() {
            return this.e;
        }

        public int getSize() {
            return this.c;
        }

        public byte getType() {
            return this.a;
        }

        public void setPacketSize(int r1) {
            this.e = r1;
        }

        public static /* synthetic */ int a(Param r0, int r1) {
            r0.e = r1;
            return r1;
        }
    }

    public ReadFileTask(RcspOpImpl r2, Param r3) throws RuntimeException {
        super(r2);
        if (r3 == null) goto L14;
        if (Param.a(r3) <= 0) goto L12;
        this.b = r3;
        if (Param.b(r3) != 0) goto L9;
        Param.a(r3, DeviceStatusManager.getInstance().getMaxReceiveMtu(getConnectedDevice()) - 20);
    L9:
        this.c = ByteBuffer.allocate(Param.a(r3) - Param.c(r3));
        return;
    L12:
        throw new RuntimeException("The size must be greater than 0");
    L14:
        throw new RuntimeException("ReadFileTask.Param can not be null.");
    }

    public static /* synthetic */ void a(ReadFileTask r0) {
        r0.callbackFinish();
    }

    public static /* synthetic */ BaseError b(ReadFileTask r0, int r1, int r2) {
        return r0.buildResponseBadResult(r1, r2);
    }

    public static /* synthetic */ Param c(ReadFileTask r0) {
        return r0.b;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        throw new RuntimeException("can not invoke cancel method");
    }

    public byte[] getReadData() {
        return this.c.array();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        callbackBegin();
        a(Param.c(this.b), Math.min(Param.a(this.b), Param.b(this.b)), 0);
    }

    public static /* synthetic */ void a(ReadFileTask r0, int r1, int r2, short r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ ByteBuffer b(ReadFileTask r0) {
        return r0.c;
    }

    public static /* synthetic */ void a(ReadFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public static /* synthetic */ BaseError a(ReadFileTask r0, int r1, int r2) {
        return r0.buildResponseBadState(r1, r2);
    }

    public static /* synthetic */ void a(ReadFileTask r0, int r1) {
        r0.callbackProgress(r1);
    }

    public final void a(final int r8, final int r9, final short r10) {
        if (r8 != Param.c(this.b)) goto L6;
        byte r0 = 1;
    L5:
        byte r6 = r0;
        SmallFileTransferCmd r1 = new SmallFileTransferCmd(new SmallFileTransferCmd.ReadFileParam(Param.d(this.b), Param.e(this.b), (short) r8, (short) r9, r6));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r1, new AnonymousClass1(this, r10, r8, r9));
        return;
    L6:
        r0 = 0;
        goto L5
    }
}
