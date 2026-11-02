package com.jieli.jl_rcsp.task;

import android.content.Context;
import android.net.Uri;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.util.JLFileIOUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public class UriTransferTask extends TransferTask {

    /* JADX INFO: renamed from: g */
    public final Context f38091g;

    /* JADX INFO: renamed from: h */
    public final String f38092h;

    /* JADX INFO: renamed from: i */
    public final String f38093i;

    public UriTransferTask(Context context, RcspOpImpl rcspOpImpl, String str, String str2, TransferTask.Param param) {
        super(rcspOpImpl, "", param);
        setPath(context.getExternalCacheDir() + File.separator + str2);
        this.f38092h = str;
        this.f38093i = str2;
        this.f38091g = context;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m27506l() {
        try {
            InputStream inputStreamOpenInputStream = this.f38091g.getContentResolver().openInputStream(Uri.parse(this.f38092h));
            JLFileIOUtil.isToFile(getPath(), inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            if (isRun()) {
                return;
            }
            super.start();
        } catch (IOException e) {
            e.printStackTrace();
            onError(4097, "Failed to read file . uri = " + this.f38092h);
        }
    }

    @Override // com.jieli.jl_rcsp.task.TransferTask
    public void release() {
        super.release();
        File file = new File(getPath());
        if (file.exists()) {
            file.delete();
        }
    }

    @Override // com.jieli.jl_rcsp.task.TransferTask, com.jieli.jl_rcsp.task.ITask
    public void start() {
        if (new File(getPath()).exists()) {
            super.start();
        } else {
            this.executor.execute(new Runnable() { // from class: com.android.mltcode.paycertificationapi.pa6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10324IO.m27506l();
                }
            });
        }
    }
}
