package com.jieli.jl_rcsp.task.contacts;

import android.content.Context;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.util.DeviceChoseUtil;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.task.GetFileByNameTask;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.task.TaskListener;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ReadContactsTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final String f38103b;

    /* JADX INFO: renamed from: c */
    public ITask f38104c;

    /* JADX INFO: renamed from: d */
    public List<DeviceContacts> f38105d;

    public ReadContactsTask(RcspOpImpl rcspOpImpl, String str) throws RuntimeException {
        super(rcspOpImpl);
        this.f38103b = str;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        if (isRun()) {
            ITask iTask = this.f38104c;
            if (iTask == null) {
                callbackCancel(b);
            } else {
                iTask.cancel(b);
            }
        }
    }

    public List<DeviceContacts> getContacts() {
        return this.f38105d;
    }

    @Override // com.jieli.jl_rcsp.task.TaskBase, com.jieli.jl_rcsp.task.ITask
    public boolean isRun() {
        ITask iTask = this.f38104c;
        return iTask == null ? super.isRun() : iTask.isRun();
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        DeviceInfo deviceInfo = this.mRcspOp.getDeviceInfo();
        if (deviceInfo == null) {
            JL_Log.m27880e(this.tag, "start", "Device is disconnected.");
            callbackError(8192);
            return;
        }
        if (deviceInfo.isContactsTransferBySmallFile()) {
            this.f38104c = new ReadContactsBySmallFileTask(this.mRcspOp);
        } else {
            SDCardBean targetDevFlash2First = DeviceChoseUtil.getTargetDevFlash2First();
            if (targetDevFlash2First == null) {
                JL_Log.m27880e(this.tag, "start", "no target dev");
                callbackError(16384);
                return;
            } else {
                this.f38104c = new GetFileByNameTask(this.mRcspOp, new GetFileByNameTask.Param(targetDevFlash2First.getDevHandler(), "CALL.TXT", this.f38103b, false));
            }
        }
        this.f38104c.setListener(new TaskListener() { // from class: com.jieli.jl_rcsp.task.contacts.ReadContactsTask.1
            @Override // com.jieli.jl_rcsp.task.TaskListener
            public void onBegin() {
                ReadContactsTask.this.callbackBegin();
            }

            @Override // com.jieli.jl_rcsp.task.TaskListener
            public void onCancel(int i) {
                ReadContactsTask.this.callbackCancel(i);
            }

            @Override // com.jieli.jl_rcsp.task.TaskListener
            public void onError(int i, String str) {
                ReadContactsTask.this.callbackError(i, str);
            }

            @Override // com.jieli.jl_rcsp.task.TaskListener
            public void onFinish() throws Throwable {
                FileInputStream fileInputStream;
                IOException e;
                if (ReadContactsTask.this.f38104c instanceof ReadContactsBySmallFileTask) {
                    ReadContactsTask.this.f38105d = ((ReadContactsBySmallFileTask) ReadContactsTask.this.f38104c).getContacts();
                } else {
                    try {
                        try {
                            try {
                                fileInputStream = new FileInputStream(ReadContactsTask.this.f38103b);
                                try {
                                    byte[] bArr = new byte[fileInputStream.available()];
                                    int iMax = Math.max(fileInputStream.read(bArr), 0);
                                    byte[] bArr2 = new byte[iMax];
                                    System.arraycopy(bArr, 0, bArr2, 0, iMax);
                                    ReadContactsTask.this.f38105d = DeviceContacts.fromData((short) 0, bArr2);
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    ReadContactsTask.this.callbackFinish();
                                }
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        } catch (IOException e4) {
                            fileInputStream = null;
                            e = e4;
                        } catch (Throwable th) {
                            fileInputStream = null;
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                ReadContactsTask.this.callbackFinish();
            }

            @Override // com.jieli.jl_rcsp.task.TaskListener
            public void onProgress(int i) {
                ReadContactsTask.this.callbackProgress(i);
            }
        });
        this.f38104c.start();
    }

    @Deprecated
    public ReadContactsTask(RcspOpImpl rcspOpImpl, Context context) {
        super(rcspOpImpl);
        if (context == null) {
            this.f38103b = "";
            return;
        }
        this.f38103b = context.getExternalCacheDir() + File.separator + "read_call.txt";
    }
}
