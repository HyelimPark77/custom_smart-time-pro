package com.jieli.jl_rcsp.task.contacts;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.task.smallfile.ReadFileTask;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
class ReadContactsBySmallFileTask extends TaskBase {
    public ReadFileTask b;
    public List<DeviceContacts> c;

    public ReadContactsBySmallFileTask(RcspOpImpl r1) throws RuntimeException {
        super(r1);
        this.c = new ArrayList();
    }

    public static /* synthetic */ void a(ReadContactsBySmallFileTask r0, short r1, byte[] r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ ReadFileTask b(ReadContactsBySmallFileTask r0) {
        return r0.b;
    }

    public static /* synthetic */ RcspOpImpl c(ReadContactsBySmallFileTask r0) {
        return r0.mRcspOp;
    }

    public static /* synthetic */ void d(ReadContactsBySmallFileTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        if (isRun() == true) goto L5;
        return;
    L5:
        ReadFileTask r0 = this.b;
        if (r0 == null) goto L9;
        r0.cancel(r2);
        return;
    L9:
        callbackCancel(r2);
    }

    public List<DeviceContacts> getContacts() {
        return this.c;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        callbackBegin();
        SmallFileTransferCmd r1 = new SmallFileTransferCmd(new SmallFileTransferCmd.QueryParam((byte) 1));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r1, new CustomRcspActionCallback(this.tag + "#SmallFileTransfer", new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    public static /* synthetic */ void a(ReadContactsBySmallFileTask r0) {
        r0.callbackFinish();
    }

    public static /* synthetic */ void b(ReadContactsBySmallFileTask r0, int r1) {
        r0.callbackCancel(r1);
    }

    public static /* synthetic */ ReadFileTask a(ReadContactsBySmallFileTask r0, ReadFileTask r1) {
        r0.b = r1;
        return r1;
    }

    public static /* synthetic */ void b(ReadContactsBySmallFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public static /* synthetic */ void a(ReadContactsBySmallFileTask r0, int r1) {
        r0.callbackProgress(r1);
    }

    public static /* synthetic */ void a(ReadContactsBySmallFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public final void a(short r1, byte[] r2) {
        this.c = DeviceContacts.fromData(r1, r2);
    }
}
