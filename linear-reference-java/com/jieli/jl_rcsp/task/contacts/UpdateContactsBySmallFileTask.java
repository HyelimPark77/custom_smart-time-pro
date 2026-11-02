package com.jieli.jl_rcsp.task.contacts;

import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.command.file_op.SmallFileTransferCmd;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.task.smallfile.AddFileTask;
import com.jieli.jl_rcsp.task.smallfile.DeleteFileTask;
import com.jieli.jl_rcsp.task.smallfile.UpdateFileTask;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateContactsBySmallFileTask extends TaskBase {
    public ITask b;
    public final List<DeviceContacts> c;

    public UpdateContactsBySmallFileTask(RcspOpImpl r1, List<DeviceContacts> r2) throws RuntimeException {
        super(r1);
        if (r2 == null) goto L7;
        this.c = r2;
        return;
    L7:
        throw new RuntimeException("contacts can not be null.");
    }

    public static /* synthetic */ void a(UpdateContactsBySmallFileTask r0, List r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void b(UpdateContactsBySmallFileTask r0, int r1) {
        r0.callbackCancel(r1);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        if (isRun() == true) goto L5;
        return;
    L5:
        ITask r0 = this.b;
        if (r0 == null) goto L9;
        r0.cancel(r2);
        return;
    L9:
        callbackCancel(r2);
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        callbackBegin();
        if (this.c.isEmpty() == false) goto L9;
    L12:
        JL_Log.d(this.tag, "start", "Query first, then update");
        a();
        return;
    L9:
        if (this.c.get(0).getFileId() <= 0) goto L12;
        JL_Log.d(this.tag, "start", "Update");
        UpdateFileTask.Param r0 = new UpdateFileTask.Param((byte) 1, this.c.get(0).getFileId(), DeviceContacts.toData(this.c));
        this.b = new UpdateFileTask(this.mRcspOp, r0);
        b();
    }

    public static /* synthetic */ void a(UpdateContactsBySmallFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public static /* synthetic */ void b(UpdateContactsBySmallFileTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public static /* synthetic */ void a(UpdateContactsBySmallFileTask r0, int r1) {
        r0.callbackProgress(r1);
    }

    public final void b() {
        this.b.setListener(new AnonymousClass3(this));
        this.b.start();
    }

    public static /* synthetic */ void a(UpdateContactsBySmallFileTask r0) {
        r0.callbackFinish();
    }

    public final void a() {
        SmallFileTransferCmd r1 = new SmallFileTransferCmd(new SmallFileTransferCmd.QueryParam((byte) 1));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r1, new CustomRcspActionCallback("queryContactList", new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    public final void a(List<SmallFileTransferCmd.QueryResponse.File> r7) {
        byte[] r0 = DeviceContacts.toData(this.c);
        if (r0.length != 0) goto L9;
        if (r7.isEmpty() == false) goto L9;
        JL_Log.d(this.tag, "updateByQuery", "No contact data, no contact file, end.");
        callbackFinish();
        return;
    L9:
        if (r0.length != 0) goto L12;
        JL_Log.d(this.tag, "updateByQuery", "No contact data and contact files, delete the contact files.");
        DeleteFileTask.Param r1 = new DeleteFileTask.Param((byte) 1, r7.get(0).id);
        this.b = new DeleteFileTask(this.mRcspOp, r1);
    L15:
        b();
        return;
    L12:
        if (r7.isEmpty() == false) goto L14;
        JL_Log.d(this.tag, "updateByQuery", "There is contact data but no contact file, add the contact file.");
        AddFileTask.Param r8 = new AddFileTask.Param((byte) 1, r0);
        this.b = new AddFileTask(this.mRcspOp, r8);
        goto L15
    L14:
        JL_Log.d(this.tag, "updateByQuery", "There is contact data and contact file, update the contact file.");
        UpdateFileTask.Param r2 = new UpdateFileTask.Param((byte) 1, r7.get(0).id, r0);
        this.b = new UpdateFileTask(this.mRcspOp, r2);
        goto L15
    }
}
