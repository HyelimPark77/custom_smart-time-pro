package com.jieli.jl_rcsp.task.contacts;

import android.content.Context;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.util.DeviceChoseUtil;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.task.GetFileByNameTask;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ReadContactsTask extends TaskBase {
    public final String b;
    public ITask c;
    public List<DeviceContacts> d;

    public ReadContactsTask(RcspOpImpl r1, String r2) throws RuntimeException {
        super(r1);
        this.b = r2;
    }

    public static /* synthetic */ void a(ReadContactsTask r0) {
        r0.callbackBegin();
    }

    public static /* synthetic */ ITask b(ReadContactsTask r0) {
        return r0.c;
    }

    public static /* synthetic */ String c(ReadContactsTask r0) {
        return r0.b;
    }

    public static /* synthetic */ void d(ReadContactsTask r0) {
        r0.callbackFinish();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        if (isRun() == true) goto L5;
        return;
    L5:
        ITask r0 = this.c;
        if (r0 != null) goto L9;
        callbackCancel(r2);
        return;
    L9:
        r0.cancel(r2);
    }

    public List<DeviceContacts> getContacts() {
        return this.d;
    }

    @Override // com.jieli.jl_rcsp.task.TaskBase, com.jieli.jl_rcsp.task.ITask
    public boolean isRun() {
        ITask r0 = this.c;
        if (r0 != null) goto L7;
        return super.isRun();
    L7:
        return r0.isRun();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        DeviceInfo r0 = this.mRcspOp.getDeviceInfo();
        if (r0 != null) goto L7;
        JL_Log.e(this.tag, "start", "Device is disconnected.");
        callbackError(8192);
        return;
    L7:
        if (r0.isContactsTransferBySmallFile() == false) goto L9;
        this.c = new ReadContactsBySmallFileTask(this.mRcspOp);
    L14:
        this.c.setListener(new AnonymousClass1(this));
        this.c.start();
        return;
    L9:
        SDCardBean r1 = DeviceChoseUtil.getTargetDevFlash2First();
        if (r1 != null) goto L13;
        JL_Log.e(this.tag, "start", "no target dev");
        callbackError(16384);
        return;
    L13:
        GetFileByNameTask.Param r2 = new GetFileByNameTask.Param(r1.getDevHandler(), "CALL.TXT", this.b, false);
        this.c = new GetFileByNameTask(this.mRcspOp, r2);
        goto L14
    }

    public static /* synthetic */ void a(ReadContactsTask r0, int r1) {
        r0.callbackProgress(r1);
    }

    public static /* synthetic */ void b(ReadContactsTask r0, int r1) {
        r0.callbackCancel(r1);
    }

    @Deprecated
    public ReadContactsTask(RcspOpImpl r1, Context r2) {
        super(r1);
        if (r2 != null) goto L6;
        this.b = "";
        return;
    L6:
        this.b = r2.getExternalCacheDir() + File.separator + "read_call.txt";
    }

    public static /* synthetic */ List a(ReadContactsTask r0, List r1) {
        r0.d = r1;
        return r1;
    }

    public static /* synthetic */ void a(ReadContactsTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }
}
