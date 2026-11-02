package com.jieli.jl_rcsp.task;

import android.content.Context;
import android.net.Uri;
import com.android.mltcode.paycertificationapi.pa6;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.util.JLFileIOUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public class UriTransferTask extends TransferTask {
    public final Context g;
    public final String h;
    public final String i;

    public UriTransferTask(Context r2, RcspOpImpl r3, String r4, String r5, TransferTask.Param r6) {
        super(r3, "", r6);
        setPath(r2.getExternalCacheDir() + File.separator + r5);
        this.h = r4;
        this.i = r5;
        this.g = r2;
    }

    public final /* synthetic */ void l() {
        InputStream r0 = this.g.getContentResolver().openInputStream(Uri.parse(this.h));     // Catch: IOException -> L6
        JLFileIOUtil.isToFile(getPath(), r0);     // Catch: IOException -> L6
        r0.close();     // Catch: IOException -> L6
        if (isRun() == true) goto L11;
        super.start();     // Catch: IOException -> L6
        return;
    L11:
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        onError(4097, "Failed to read file . uri = " + this.h);
    }

    @Override // com.jieli.jl_rcsp.task.TransferTask
    public void release() {
        super.release();
        File r0 = new File(getPath());
        if (r0.exists() == false) goto L6;
        r0.delete();
        return;
    }

    @Override // com.jieli.jl_rcsp.task.TransferTask, com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (new File(getPath()).exists() == true) goto L6;
        this.executor.execute(new pa6(this));
        return;
    L6:
        super.start();
    }
}
