package com.jieli.jl_rcsp.task.contacts;

import android.content.Context;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.util.DeviceChoseUtil;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.task.CallTransferTask;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.task.TransferTask;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateContactsTask extends TaskBase {
    public final String b;
    public final List<DeviceContacts> c;
    public ITask d;

    public UpdateContactsTask(RcspOpImpl r1, String r2, List<DeviceContacts> r3) throws RuntimeException {
        super(r1);
        if (r3 == null) goto L7;
        this.b = r2;
        this.c = r3;
        return;
    L7:
        throw new RuntimeException("contacts can not be null.");
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        if (isRun() == true) goto L5;
        return;
    L5:
        ITask r0 = this.d;
        if (r0 != null) goto L9;
        callbackCancel(r2);
        return;
    L9:
        r0.cancel(r2);
    }

    @Override // com.jieli.jl_rcsp.task.TaskBase, com.jieli.jl_rcsp.task.ITask
    public boolean isRun() {
        ITask r0 = this.d;
        if (r0 != null) goto L7;
        return super.isRun();
    L7:
        return r0.isRun();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (isRun() == false) goto L6;
        JL_Log.w(this.tag, "start", "Task is in progress.");
        return;
    L6:
        DeviceInfo r0 = this.mRcspOp.getDeviceInfo();
        if (r0 != null) goto L11;
        callbackError(8192);
        return;
    L11:
        if (r0.isContactsTransferBySmallFile() == false) goto L13;
        this.d = new UpdateContactsBySmallFileTask(this.mRcspOp, this.c);
    L45:
        ITask r1 = this.d;
        if (r1 == null) goto L65;
        r1.setListener(this.listener);
        this.d.start();
        return;
    L65:
        return;
    L13:
        SDCardBean r2 = DeviceChoseUtil.getTargetDevFlash2First();
        if (r2 != null) goto L17;
        callbackError(16384);
        return;
    L17:
        TransferTask.Param r3 = new TransferTask.Param();
        r3.devHandler = r2.getDevHandler();
        if (r2.getType() != 2) goto L20;
        boolean r4 = true;
    L21:
        r3.useFlash = r4;
        FileOutputStream r5 = null;
        FileOutputStream r6 = new FileOutputStream(this.b);     // Catch: Throwable -> L37 IOException -> L39
        byte[] r7 = DeviceContacts.toData(this.c);     // Catch: Throwable -> L26 IOException -> L28
        if (r7.length != 0) goto L30;
        r7 = new byte[20];     // Catch: Throwable -> L26 IOException -> L28
    L30:
        r6.write(r7);     // Catch: Throwable -> L26 IOException -> L28
        this.d = new CallTransferTask(this.mRcspOp, this.b, r3);     // Catch: Throwable -> L26 IOException -> L28
        r6.close();     // Catch: IOException -> L33
    L60:
        goto L45
    L28:
        e = move-exception;
        e = e;
        r5 = r6;
    L40:
        e.printStackTrace();     // Catch: Throwable -> L37
        callbackError(16389, "IO Exception = " + e.getMessage());     // Catch: Throwable -> L37
        if (r5 == null) goto L45;
        r5.close();     // Catch: IOException -> L33
    L26:
        th = move-exception;
        th = th;
        r5 = r6;
    L49:
        if (r5 != null) goto L57;
    L54:
        throw th;
    L57:
        r5.close();     // Catch: IOException -> L52
    L52:
        e = move-exception;
        e.printStackTrace();
    L39:
        e = e;
    L37:
        th = th;
    L33:
        e = move-exception;
        e.printStackTrace();
        goto L45
    L20:
        r4 = false;
        goto L21
    }

    @Deprecated
    public UpdateContactsTask(RcspOpImpl r1, Context r2, List<DeviceContacts> r3) throws RuntimeException {
        super(r1);
        if (r3 == null) goto L10;
        if (r2 != null) goto L6;
        this.b = null;
    L7:
        this.c = r3;
        return;
    L6:
        this.b = r2.getExternalCacheDir() + File.separator + "CALL.TXT";
        goto L7
    L10:
        throw new RuntimeException("contacts can not be null.");
    }
}
