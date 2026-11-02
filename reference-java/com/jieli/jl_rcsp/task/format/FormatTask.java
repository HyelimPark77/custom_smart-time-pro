package com.jieli.jl_rcsp.task.format;

import android.content.Context;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.task.CallTransferTask;
import com.jieli.jl_rcsp.task.GetFileByNameTask;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskBase;
import com.jieli.jl_rcsp.task.TaskListener;
import com.jieli.jl_rcsp.task.TransferTask;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.File;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class FormatTask extends TaskBase {

    /* JADX INFO: renamed from: b */
    public final Context f38122b;

    /* JADX INFO: renamed from: c */
    public final SDCardBean f38123c;

    /* JADX INFO: renamed from: d */
    public final Queue<ITask> f38124d;

    public class AddTaskListener extends NextListener {

        /* JADX INFO: renamed from: c */
        public final ITask f38125c;

        public AddTaskListener(ITask iTask, String str) {
            super(str);
            this.f38125c = iTask;
        }

        @Override // com.jieli.jl_rcsp.task.format.FormatTask.NextListener, com.jieli.jl_rcsp.task.TaskListener
        public void onFinish() {
            FormatTask.this.f38124d.add(this.f38125c);
            super.onFinish();
        }
    }

    public class ErrorStopListener extends NextListener {
        public ErrorStopListener(String str) {
            super(str);
        }

        @Override // com.jieli.jl_rcsp.task.format.FormatTask.NextListener, com.jieli.jl_rcsp.task.TaskListener
        public void onError(int i, String str) {
            JL_Log.m27887w(((TaskBase) FormatTask.this).tag, "onError", "Formatting process stopped：task is --》" + this.f38128a);
            FormatTask.this.callbackError(i, str);
        }
    }

    public class NextListener implements TaskListener {

        /* JADX INFO: renamed from: a */
        public String f38128a;

        public NextListener(String str) {
            this.f38128a = str;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onBegin() {
            JL_Log.m27883i(((TaskBase) FormatTask.this).tag, "onBegin", " Task begin :" + this.f38128a);
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onCancel(int i) {
            onError(i, "cancel");
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onError(int i, String str) {
            JL_Log.m27887w(((TaskBase) FormatTask.this).tag, "onError", "The formatting task is error, do next task: error task --》" + this.f38128a);
            FormatTask.this.m27549a();
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onFinish() {
            FormatTask.this.m27549a();
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onProgress(int i) {
        }
    }

    public FormatTask(RcspOpImpl rcspOpImpl, Context context, SDCardBean sDCardBean) throws RuntimeException {
        super(rcspOpImpl);
        this.f38124d = new ArrayBlockingQueue(6);
        if (context == null) {
            throw new RuntimeException("Context can not be null.");
        }
        if (sDCardBean == null) {
            throw new RuntimeException("Device storage can not be null.");
        }
        this.f38122b = context;
        this.f38123c = sDCardBean;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte b) {
        throw new RuntimeException("can not cancel");
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        callbackBegin();
        int devHandler = this.f38123c.getDevHandler();
        FormatBatchCmdTask formatBatchCmdTask = new FormatBatchCmdTask(this.mRcspOp, (byte) 0);
        FormatBatchCmdTask formatBatchCmdTask2 = new FormatBatchCmdTask(this.mRcspOp, (byte) -128);
        FormatCmdTask formatCmdTask = new FormatCmdTask(this.mRcspOp, (byte) -128, devHandler);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f38122b.getCacheDir());
        String str = File.separator;
        sb.append(str);
        sb.append("WMEM.BIN");
        String string = sb.toString();
        GetFileByNameTask getFileByNameTask = new GetFileByNameTask(this.mRcspOp, new GetFileByNameTask.Param(devHandler, "WMEM.BIN", string, false));
        String str2 = this.f38122b.getCacheDir() + str + "call.txt";
        GetFileByNameTask getFileByNameTask2 = new GetFileByNameTask(this.mRcspOp, new GetFileByNameTask.Param(devHandler, "call.txt", str2, false));
        TransferTask.Param param = new TransferTask.Param();
        param.devHandler = devHandler;
        param.useFlash = this.f38123c.getType() == 2;
        TransferTask transferTask = new TransferTask(this.mRcspOp, string, param);
        transferTask.setListener(new NextListener("wmenSave task"));
        CallTransferTask callTransferTask = new CallTransferTask(this.mRcspOp, str2, param);
        callTransferTask.setListener(new NextListener("callSave task"));
        this.f38124d.add(formatBatchCmdTask);
        this.f38124d.add(getFileByNameTask);
        this.f38124d.add(getFileByNameTask2);
        this.f38124d.add(formatCmdTask);
        formatBatchCmdTask.setListener(new ErrorStopListener("start format batch cmd task"));
        getFileByNameTask.setListener(new AddTaskListener(transferTask, "wmen read task"));
        getFileByNameTask2.setListener(new AddTaskListener(callTransferTask, "call read  task"));
        formatCmdTask.setListener(new AddTaskListener(formatBatchCmdTask2, "  format cmd task"));
        formatBatchCmdTask2.setListener(new ErrorStopListener("stop format batch cmd task"));
        m27549a();
    }

    /* JADX INFO: renamed from: a */
    public final void m27549a() {
        ITask iTaskPeek = this.f38124d.peek();
        if (iTaskPeek != null) {
            iTaskPeek.start();
            this.f38124d.poll();
        } else {
            callbackFinish();
        }
    }
}
