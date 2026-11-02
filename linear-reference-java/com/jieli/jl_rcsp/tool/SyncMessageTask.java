package com.jieli.jl_rcsp.tool;

import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.NotificationMsg;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.device.MessageInfo;
import com.jieli.jl_rcsp.task.smallfile.AddFileTask;
import com.jieli.jl_rcsp.task.smallfile.DeleteFileTask;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class SyncMessageTask extends Thread {
    public static final String i = "SyncMessageTask";
    public final RcspOpImpl a;
    public final LinkedBlockingQueue<SyncTask> b;
    public final ThreadStateListener c;
    public volatile boolean d;
    public volatile boolean e;
    public boolean f;
    public boolean g;
    public final Map<String, Short> h;

    public static class SyncTask {
        public final int a;
        public final NotificationMsg b;
        public final OnWatchOpCallback<Boolean> c;

        public SyncTask(int r1, NotificationMsg r2, OnWatchOpCallback<Boolean> r3) {
            this.a = r1;
            this.b = r2;
            this.c = r3;
        }

        public OnWatchOpCallback<Boolean> getCallback() {
            return this.c;
        }

        public NotificationMsg getMessage() {
            return this.b;
        }

        public int getTaskOp() {
            return this.a;
        }

        public String toString() {
            return "SyncTask{taskOp=" + this.a + ", message=" + this.b + ", callback=" + this.c + i0XO1.IO;
        }
    }

    static {
    }

    public SyncMessageTask(RcspOpImpl r2, ThreadStateListener r3) {
        super(i);
        this.b = new LinkedBlockingQueue();
        this.h = new HashMap();
        if (r2 == null) goto L7;
        this.a = r2;
        this.c = r3;
        return;
    L7:
        throw new NullPointerException("RcspOpImpl can not be null.");
    }

    public static /* synthetic */ String a() {
        return i;
    }

    public final void b(final NotificationMsg r9, final OnWatchOpCallback<Boolean> r10) {
        if (r9 != null) goto L5;
        return;
    L5:
        if (this.a.getDeviceInfo() != null) goto L8;
        this.b.clear();
        return;
    L8:
        this.g = true;
        AddFileTask.Param r1 = new AddFileTask.Param((byte) 6, new MessageInfo(r9.getAppName(), r9.getFlag(), r9.getTitle(), r9.getContent(), r9.getTime()).beanToData());
        final AddFileTask r0 = new AddFileTask(this.a, r1);
        r0.setListener(new AnonymousClass4(this, r9, r0, r10));
        r0.start();
        if (this.g == true) goto L11;
        return;
    L11:
        b();
    }

    public final void c(NotificationMsg r7, final OnWatchOpCallback<Boolean> r8) {
        if (this.a.getDeviceInfo() != null) goto L6;
        this.b.clear();
        return;
    L6:
        this.g = true;
        RcspOpImpl r0 = this.a;
        r0.sendRcspCommand(r0.getTargetDevice(), CommandBuilder.buildRemoveMessageCmd(new PushInfoDataToDeviceCmd.RemoveMsg(r7.getAppName(), r7.getTime())), new BooleanRcspActionCallback("removeMessage", new AnonymousClass3(this, r8)));
        if (this.g == true) goto L9;
        return;
    L9:
        b();
    }

    public final void d(NotificationMsg r5, final OnWatchOpCallback<Boolean> r6) {
        if (r5 != null) goto L5;
        return;
    L5:
        if (this.a.getDeviceInfo() != null) goto L8;
        this.b.clear();
        return;
    L8:
        final String r7 = a(r5.getAppName(), r5.getTime());
        Short r0 = a(r7);
        JL_Log.d(i, "removeMessageBySFT", "key = " + r7 + ", id = " + r0);
        if (r0 == null) goto L17;
        this.g = true;
        DeleteFileTask r1 = new DeleteFileTask(this.a, new DeleteFileTask.Param((byte) 6, r0.shortValue()));
        r1.setListener(new AnonymousClass5(this, r7, r6));
        r1.start();
        if (this.g == true) goto L14;
        return;
    L14:
        b();
        return;
    }

    public void exit() {
        this.d = false;
        c();
    }

    public boolean isRunning() {
        return this.d;
    }

    public void putNotification(SyncTask r2) {
        if (this.a.isRcspInit() == false) goto L16;
        this.b.put(r2);     // Catch: InterruptedException -> L10
        if (this.e == false) goto L15;
        this.e = false;
        c();
        return;
    L15:
        return;
    L10:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.d = true;
        ThreadStateListener r0 = this.c;
        if (r0 == null) goto L5;
        r0.onStart(getId());
    L5:
        LinkedBlockingQueue<SyncTask> r1 = this.b;
        monitor-enter(r1);
    L38:
    L12:
        th = move-exception;
        throw th;
    L8:
        if (this.d == false) goto L30;
        this.e = this.b.isEmpty();     // Catch: Throwable -> L12
        if (this.e == true) goto L11;
        SyncTask r2 = this.b.poll();     // Catch: Throwable -> L12
        if (this.a.isRcspInit() == false) goto L16;
        if (r2 == null) goto L38;
        if (r2.getTaskOp() == 0) goto L23;
        if (this.a.getDeviceInfo().isContactsTransferBySmallFile() == false) goto L28;
        d(r2.getMessage(), r2.getCallback());     // Catch: Throwable -> L12
        goto L38
    L28:
        c(r2.getMessage(), r2.getCallback());     // Catch: Throwable -> L12
        goto L38
    L23:
        if (this.a.getDeviceInfo().isContactsTransferBySmallFile() == false) goto L24;
        b(r2.getMessage(), r2.getCallback());     // Catch: Throwable -> L12
        goto L38
    L24:
        a(r2.getMessage(), r2.getCallback());     // Catch: Throwable -> L12
        goto L38
    L16:
        this.b.clear();     // Catch: Throwable -> L12
        this.d = false;     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
        return;
    L11:
        b();     // Catch: Throwable -> L12
        goto L38
    L30:
        monitor-exit(r1);     // Catch: Throwable -> L12
        this.b.clear();
        this.h.clear();
        this.d = false;
        this.e = false;
        this.g = false;
        ThreadStateListener r3 = this.c;
        if (r3 == null) goto L34;
        r3.onFinish(getId());
    L34:
        String r4 = i;
        JL_Log.w(r4, r4, "thread end");
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        monitor-enter(this);
        super.start();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public static /* synthetic */ boolean a(SyncMessageTask r0, boolean r1) {
        r0.g = r1;
        return r1;
    }

    public static /* synthetic */ void a(SyncMessageTask r0) {
        r0.c();
    }

    public static /* synthetic */ String a(SyncMessageTask r0, String r1, long r2) {
        return r0.a(r1, r2);
    }

    public static /* synthetic */ void a(SyncMessageTask r0, String r1, short r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void a(SyncMessageTask r0, String r1) {
        r0.b(r1);
    }

    public final void a(NotificationMsg r11, final OnWatchOpCallback<Boolean> r12) {
        if (r11 != null) goto L5;
        return;
    L5:
        if (this.a.getDeviceInfo() != null) goto L8;
        this.b.clear();
        return;
    L8:
        JL_Log.i(i, "pushMessageInfo", "" + r11);
        byte[] r13 = new MessageInfo(r11.getAppName(), r11.getFlag(), r11.getTitle(), r11.getContent(), r11.getTime()).beanToData();
        if (r13.length <= 240) goto L24;
        int r0 = r13.length / 240;
        if ((r13.length % 240) == 0) goto L14;
        r0 = r0 + 1;
    L14:
        final int r1 = r0 - 1;
        int r3 = 0;
    L15:
        if (r1 < 0) goto L31;
        int r4 = r13.length - r3;
        if (r4 <= 0) goto L30;
        if (r4 <= 240) goto L21;
        byte[] r5 = new byte[240];
    L22:
        System.arraycopy(r13, r3, r5, 0, r5.length);
        r3 = r3 + r5.length;
        a(r1, r5, new AnonymousClass1(this, r1, r12));
        r1 = r1 - 1;
        goto L15
    L21:
        r5 = new byte[r4];
        goto L22
    L30:
        return;
    L31:
        return;
    L24:
        a(0, r13, r12);
    }

    public final void c() {
        LinkedBlockingQueue<SyncTask> r0 = this.b;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f == false) goto L9;
        this.b.notifyAll();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final void b() {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:374)
            	at java.base/java.util.ArrayList.get(ArrayList.java:459)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            this = this;
            java.util.concurrent.LinkedBlockingQueue<com.jieli.jl_rcsp.tool.SyncMessageTask$SyncTask> r0 = r2.b
            monitor-enter(r0)
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            if (r1 != 0) goto L16
            r1 = 1
            r2.f = r1     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            java.util.concurrent.LinkedBlockingQueue<com.jieli.jl_rcsp.tool.SyncMessageTask$SyncTask> r1 = r2.b     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            r1.wait()     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            goto L16
        L10:
            r1 = move-exception
            goto L1b
        L12:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L10
        L16:
            r1 = 0
            r2.f = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jieli.jl_rcsp.tool.SyncMessageTask.b():void");
    }

    public final void b(String r2) {
        if (r2 == null) goto L5;
        this.h.remove(r2);
        return;
    }

    public final void a(int r4, byte[] r5, final OnWatchOpCallback<Boolean> r6) {
        PushInfoDataToDeviceCmd.MessageData r0 = new PushInfoDataToDeviceCmd.MessageData(r4, r5);
        this.g = true;
        RcspOpImpl r7 = this.a;
        r7.sendRcspCommand(r7.getTargetDevice(), CommandBuilder.buildPushMessageInfoCmd(r0), new BooleanRcspActionCallback("pushMessageInfo", new AnonymousClass2(this, r6)));
        if (this.g == true) goto L5;
        return;
    L5:
        b();
    }

    public final String a(String r2, long r3) {
        return r2 + IiXI1X1OO.O00 + r3;
    }

    public final void a(String r2, short r3) {
        if (r2 == null) goto L5;
        this.h.put(r2, Short.valueOf(r3));
        return;
    }

    public final Short a(String r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return this.h.get(r2);
    }
}
