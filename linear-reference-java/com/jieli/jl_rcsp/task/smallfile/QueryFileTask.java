package com.jieli.jl_rcsp.task.smallfile;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class QueryFileTask extends TaskBase {
    public static final byte TYPE_BLOOD_OXYGEN = 4;
    public static final byte TYPE_CALL_LOG = 8;
    public static final byte TYPE_CONTACTS = 1;
    public static final byte TYPE_HEART_RATE = 3;
    public static final byte TYPE_MESSAGE_SYNC = 6;
    public static final byte TYPE_SLEEP = 5;
    public static final byte TYPE_SPORTS_RECORD = 2;
    public static final byte TYPE_STEP = 9;
    public static final byte TYPE_WEATHER = 7;
    public final Param b;
    public List<File> c;

    public static class File {
        public short id;
        public int size;
        public byte type;

        public File(byte r1, short r2, int r3) {
            this.id = r2;
            this.size = r3;
            this.type = r1;
        }

        public String toString() {
            return "File{id=" + this.id + ", size=" + this.size + ", type=" + this.type + i0XO1.IO;
        }
    }

    public static class Param {
        public byte type;

        public Param(byte r1) {
            this.type = r1;
        }
    }

    public QueryFileTask(RcspOpImpl r1, Param r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.b = r2;
        return;
    L7:
        throw new RuntimeException("QueryFileTask.Param can not be null.");
    }

    public static /* synthetic */ BaseError a(QueryFileTask r0, int r1, int r2) {
        return r0.buildResponseBadState(r1, r2);
    }

    public static /* synthetic */ void b(QueryFileTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r1) {
    }

    public List<File> getFiles() {
        return this.c;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        callbackBegin();
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), new SmallFileTransferCmd(new SmallFileTransferCmd.QueryParam(this.b.type)), new AnonymousClass1(this));
    }

    public static /* synthetic */ List a(QueryFileTask r0) {
        return r0.c;
    }

    public static /* synthetic */ List a(QueryFileTask r0, List r1) {
        r0.c = r1;
        return r1;
    }

    public static /* synthetic */ void a(QueryFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }
}
