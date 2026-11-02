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
    public final Context b;
    public final SDCardBean c;
    public final Queue<ITask> d;

    public class AddTaskListener extends NextListener {
        public final ITask c;
        public final /* synthetic */ FormatTask d;

        public AddTaskListener(FormatTask r1, ITask r2, String r3) {
            this.d = r1;
            super(r1, r3);
            this.c = r2;
        }

        @Override // com.jieli.jl_rcsp.task.format.FormatTask.NextListener, com.jieli.jl_rcsp.task.TaskListener
        public void onFinish() {
            FormatTask.b(this.d).add(this.c);
            super.onFinish();
        }
    }

    public class ErrorStopListener extends NextListener {
        public final /* synthetic */ FormatTask c;

        public ErrorStopListener(FormatTask r1, String r2) {
            this.c = r1;
            super(r1, r2);
        }

        @Override // com.jieli.jl_rcsp.task.format.FormatTask.NextListener, com.jieli.jl_rcsp.task.TaskListener
        public void onError(int r4, String r5) {
            JL_Log.w(FormatTask.a(this.c), "onError", "Formatting process stopped：task is --》" + this.a);
            FormatTask.a(this.c, r4, r5);
        }
    }

    public class NextListener implements TaskListener {
        public String a;
        public final /* synthetic */ FormatTask b;

        public NextListener(FormatTask r1, String r2) {
            this.b = r1;
            this.a = r2;
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onBegin() {
            JL_Log.i(FormatTask.e(this.b), "onBegin", " Task begin :" + this.a);
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onCancel(int r2) {
            onError(r2, "cancel");
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onError(int r2, String r3) {
            JL_Log.w(FormatTask.d(this.b), "onError", "The formatting task is error, do next task: error task --》" + this.a);
            FormatTask.c(this.b);
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onFinish() {
            FormatTask.c(this.b);
        }

        @Override // com.jieli.jl_rcsp.task.TaskListener
        public void onProgress(int r1) {
        }
    }

    public FormatTask(RcspOpImpl r2, Context r3, SDCardBean r4) throws RuntimeException {
        super(r2);
        this.d = new ArrayBlockingQueue(6);
        if (r3 == null) goto L10;
        if (r4 == null) goto L8;
        this.b = r3;
        this.c = r4;
        return;
    L8:
        throw new RuntimeException("Device storage can not be null.");
    L10:
        throw new RuntimeException("Context can not be null.");
    }

    public static /* synthetic */ String a(FormatTask r0) {
        return r0.tag;
    }

    public static /* synthetic */ Queue b(FormatTask r0) {
        return r0.d;
    }

    public static /* synthetic */ void c(FormatTask r0) {
        r0.a();
    }

    public static /* synthetic */ String d(FormatTask r0) {
        return r0.tag;
    }

    public static /* synthetic */ String e(FormatTask r0) {
        return r0.tag;
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void cancel(byte r2) {
        throw new RuntimeException("can not cancel");
    }

    @Override // com.jieli.jl_rcsp.task.ITask
    public void start() {
        callbackBegin();
        int r0 = this.c.getDevHandler();
        boolean r3 = false;
        FormatBatchCmdTask r1 = new FormatBatchCmdTask(this.mRcspOp, (byte) 0);
        FormatBatchCmdTask r2 = new FormatBatchCmdTask(this.mRcspOp, (byte) -128);
        FormatCmdTask r4 = new FormatCmdTask(this.mRcspOp, (byte) -128, r0);
        StringBuilder r5 = new StringBuilder();
        r5.append(this.b.getCacheDir());
        String r6 = File.separator;
        r5.append(r6);
        r5.append("WMEM.BIN");
        String r7 = r5.toString();
        GetFileByNameTask r8 = new GetFileByNameTask(this.mRcspOp, new GetFileByNameTask.Param(r0, "WMEM.BIN", r7, false));
        String r9 = this.b.getCacheDir() + r6 + "call.txt";
        GetFileByNameTask r10 = new GetFileByNameTask(this.mRcspOp, new GetFileByNameTask.Param(r0, "call.txt", r9, false));
        TransferTask.Param r11 = new TransferTask.Param();
        r11.devHandler = r0;
        if (this.c.getType() != 2) goto L5;
        r3 = true;
    L5:
        r11.useFlash = r3;
        TransferTask r12 = new TransferTask(this.mRcspOp, r7, r11);
        r12.setListener(new NextListener(this, "wmenSave task"));
        CallTransferTask r13 = new CallTransferTask(this.mRcspOp, r9, r11);
        r13.setListener(new NextListener(this, "callSave task"));
        this.d.add(r1);
        this.d.add(r8);
        this.d.add(r10);
        this.d.add(r4);
        r1.setListener(new ErrorStopListener(this, "start format batch cmd task"));
        r8.setListener(new AddTaskListener(this, r12, "wmen read task"));
        r10.setListener(new AddTaskListener(this, r13, "call read  task"));
        r4.setListener(new AddTaskListener(this, r2, "  format cmd task"));
        r2.setListener(new ErrorStopListener(this, "stop format batch cmd task"));
        a();
    }

    public static /* synthetic */ void a(FormatTask r0, int r1, String r2) {
        r0.callbackError(r1, r2);
    }

    public final void a() {
        ITask r0 = this.d.peek();
        if (r0 == null) goto L6;
        r0.start();
        this.d.poll();
        return;
    L6:
        callbackFinish();
    }
}
