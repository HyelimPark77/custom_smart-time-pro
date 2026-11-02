package com.jieli.jl_rcsp.tool;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.h96;
import com.android.mltcode.paycertificationapi.i96;
import com.android.mltcode.paycertificationapi.j96;
import com.android.mltcode.paycertificationapi.k96;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_fatfs.utils.ZipUtil;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.rcsp.RcspWatch;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateResourceTask extends Thread {
    public static final String n = "UpdateResourceTask";
    public final RcspWatch a;
    public final String b;
    public final OnUpdateResourceCallback c;
    public final ThreadStateListener d;
    public final Object e;
    public boolean f;
    public final Handler g;
    public String h;
    public String i;
    public int j;
    public WatchFileContent k;
    public long l;
    public BaseError m;

    public class MyProgressListener implements OnFatFileProgressListener {
        public final String a;
        public final /* synthetic */ UpdateResourceTask b;
        public String funcName;
        public int index;
        public String taskPath;

        public MyProgressListener(UpdateResourceTask r1) {
            this.b = r1;
            this.a = MyProgressListener.class.getSimpleName();
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onProgress(float r5) {
            JL_Log.d(UpdateResourceTask.a(), this.a, RcspUtil.formatString("(%s) onProgress ---> %.1f.", new Object[]{this.funcName, Float.valueOf(r5)}));
            UpdateResourceTask.a(this.b, this.index, this.taskPath, r5);
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStart(String r4) {
            JL_Log.d(UpdateResourceTask.a(), this.a, RcspUtil.formatString("(%s) onStart ---> %s.", new Object[]{this.funcName, r4}));
            UpdateResourceTask.a(this.b, this.index, this.taskPath, 0.0f);
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStop(int r5) {
            JL_Log.e(UpdateResourceTask.a(), this.a, RcspUtil.formatString("(%s) onStop ---> %d.", new Object[]{this.funcName, Integer.valueOf(r5)}));
            UpdateResourceTask.a(this.b, r5);
            if (UpdateResourceTask.b(this.b) != 0) goto L5;
            UpdateResourceTask.a(this.b, this.index, this.taskPath, 100.0f);
        L5:
            UpdateResourceTask.a(this.b);
        }

        public /* synthetic */ MyProgressListener(UpdateResourceTask r1, AnonymousClass1 r2) {
            this(r1);
        }
    }

    public static class Task {
        public static final int OP_CREATE_FILE = 1;
        public static final int OP_REPLACE_FILE = 2;
        public String filePath;
        public long needSize;
        public int op;

        public Task() {
        }

        public /* synthetic */ Task(AnonymousClass1 r1) {
            this();
        }
    }

    static {
    }

    public UpdateResourceTask(RcspWatch r3, String r4, OnUpdateResourceCallback r5, ThreadStateListener r6) {
        this.e = new Object();
        this.g = new Handler(Looper.getMainLooper());
        this.l = 0;
        if (r3 == null) goto L7;
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r6;
        return;
    L7:
        throw new NullPointerException("RcspWatch can not be null.");
    }

    public static /* synthetic */ void a(UpdateResourceTask r0) {
        r0.f();
    }

    public static /* synthetic */ int b(UpdateResourceTask r0) {
        return r0.j;
    }

    public static /* synthetic */ long c(UpdateResourceTask r2) {
        return r2.l;
    }

    public static /* synthetic */ void d(UpdateResourceTask r0) {
        r0.e();
    }

    public static String findFolder(String r5, String r6) {
        if (r5 == null) goto L21;
        if (r6 == null) goto L21;
        File r1 = new File(r5);
        if (r1.exists() == true) goto L9;
        return null;
    L9:
        File[] r7 = r1.listFiles();
        if (r7 != null) goto L12;
        return null;
    L12:
        int r2 = r7.length;
        int r3 = 0;
    L13:
        if (r3 >= r2) goto L21;
        File r4 = r7[r3];
        if (r4.isDirectory() == false) goto L20;
        if (r6.equalsIgnoreCase(r4.getName()) == false) goto L20;
        return r4.getPath();
    L20:
        r3 = r3 + 1;
    L21:
        return null;
    }

    public final void e() {
        final String r0 = WatchFileUtil.obtainUpdateFilePath(this.h, OTAManager.OTA_FILE_SUFFIX);
        if (r0 == null) goto L5;
    L9:
        WatchFileUtil.deleteFile(this.h + File.separator + WatchConstant.RES_DIR_NAME);
        this.a.reLoadFolder(new AnonymousClass5(this, r0));
        return;
    L5:
        if (this.a.isOTAResource() == false) goto L8;
        this.a.writeResourceOTAFlag(true, new AnonymousClass4(this));
        return;
    L8:
        WatchFileUtil.deleteFile(this.b);
        goto L9
    }

    public final void f() {
        Object r0 = this.e;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.f == false) goto L9;
        this.e.notifyAll();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final void g() {
        File r0 = new File(this.i);
        ArrayList<Task> r1 = new ArrayList();
        File[] r2 = r0.listFiles();
        int r3 = 0;
        if (r2 == null) goto L16;
        int r4 = r2.length;
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L16;
        Task r6 = a(r2[r5]);     // Catch: RuntimeException -> L11
        if (r6 == null) goto L13;
        r1.add(r6);     // Catch: RuntimeException -> L11
    L13:
        r5 = r5 + 1;
    L11:
        e = move-exception;
        a(a(e));
        return;
    L16:
        String r7 = n;
        JL_Log.i(r7, "updateResource", "taskList = " + r1.size());
        ArrayList<Task> r8 = b(r1);
    L21:
        e = move-exception;
        a(a(e));
        return;
    L18:
        if (a(r8) == true) goto L24;
        a(16897);     // Catch: RuntimeException -> L21
        return;
    L24:
        if (this.a.isOTAResource() == true) goto L29;
        this.a.writeResourceOTAFlag(false, new AnonymousClass1(this));
        d();
        if (this.a.isOTAResource() == true) goto L29;
        c(b(), c());
        return;
    L29:
        JL_Log.i(r7, "updateResource", "size : " + r8.size());
        if (r8.isEmpty() == false) goto L33;
        e();
        return;
    L33:
        b(this.i, r8.size());
    L35:
        if (r3 >= r8.size()) goto L50;
        Task r9 = r8.get(r3);
        if (this.j != 0) goto L50;
        JL_Log.i(n, "updateResource", "task >> op = " + r9.op + ", filePath = " + r9.filePath);
        AnonymousClass1 r10 = null;
        if (r9.op != 2) goto L45;
        MyProgressListener r11 = new MyProgressListener(this, r10);
        r11.index = r3;
        String r12 = r9.filePath;
        r11.taskPath = r12;
        r11.funcName = "replaceWatchFile";
        this.a.replaceWatchFile(r12, r11);
        if (this.j != 0) goto L50;
        d();
    L49:
        r3 = r3 + 1;
        goto L35
    L45:
        MyProgressListener r13 = new MyProgressListener(this, r10);
        r13.index = r3;
        String r14 = r9.filePath;
        r13.taskPath = r14;
        r13.funcName = "createWatchFile";
        this.a.createWatchFile(r14, true, r13);
        if (this.j != 0) goto L50;
        d();
    L50:
        JL_Log.e(n, "updateResource", "end ---> " + this.j);
        int r15 = this.j;
        if (r15 != 0) goto L54;
        e();
        return;
    L54:
        a(r15);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ThreadStateListener r0 = this.d;
        if (r0 == null) goto L6;
        r0.onStart(getId());
    L6:
        if (this.b != null) goto L9;
        a(5);
        return;
    L9:
        File r1 = new File(this.b);
        if (r1.exists() == true) goto L13;
        a(5);
        return;
    L13:
        this.h = WatchFileUtil.getDirPath(this.b);
        String r2 = WatchFileUtil.getFileName(this.b);
        String r3 = n;
        JL_Log.i(r3, r3, "dirPath = " + this.h + ", fileName = " + r2);
        if (r2.endsWith(OTAManager.OTA_ZIP_SUFFIX) == false) goto L21;
        ZipUtil.unZipFolder(this.b, this.h);     // Catch: Exception -> L17
    L19:
        this.i = findFolder(this.h, WatchConstant.RES_DIR_NAME);
    L25:
        String r4 = n;
        JL_Log.i(r4, r4, "targetPath = " + this.i);
        if (this.i == null) goto L28;
        g();
        return;
    L28:
        String r5 = WatchFileUtil.obtainUpdateFilePath(this.h, OTAManager.OTA_FILE_SUFFIX);
        JL_Log.i(r4, r4, "otaFilePath = " + r5);
        if (r5 != null) goto L31;
        a(4);
        return;
    L31:
        b(r5);
        return;
    L17:
        e = move-exception;
        e.printStackTrace();
        goto L19
    L21:
        if (r1.isDirectory() == false) goto L25;
        if (WatchConstant.RES_DIR_NAME.equalsIgnoreCase(r2) == false) goto L25;
        this.i = this.b;
        goto L25
    }

    public void stopThread() {
        this.j = 4098;
        f();
    }

    public static /* synthetic */ void a(UpdateResourceTask r0, int r1, String r2, float r3) {
        r0.b(r1, r2, r3);
    }

    public static /* synthetic */ void b(UpdateResourceTask r0, int r1) {
        r0.a(r1);
    }

    public final String c() {
        BaseError r0 = this.m;
        if (r0 != null) goto L7;
        return "";
    L7:
        return r0.getMessage();
    }

    public final void d() {
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
            java.lang.Object r0 = r2.e
            monitor-enter(r0)
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            if (r1 != 0) goto L16
            r1 = 1
            r2.f = r1     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            java.lang.Object r1 = r2.e     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
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
        throw new UnsupportedOperationException("Method not decompiled: com.jieli.jl_rcsp.tool.UpdateResourceTask.d():void");
    }

    public static /* synthetic */ BaseError a(UpdateResourceTask r0, BaseError r1) {
        r0.m = r1;
        return r1;
    }

    public final ArrayList<Task> b(ArrayList<Task> r6) {
        if (r6 != null) goto L4;
    L17:
        return r6;
    L4:
        if (r6.size() <= 1) goto L17;
        ArrayList<Task> r0 = new ArrayList();
        ArrayList r1 = new ArrayList();
        Iterator<Task> r7 = r6.iterator();
    L8:
        if (r7.hasNext() == false) goto L14;
        Task r2 = r7.next();
        if (r2.op == 2) goto L11;
        r1.add(r2);
        goto L8
    L11:
        r0.add(r2);
        goto L8
    L14:
        if (r1.isEmpty() == true) goto L16;
        r0.addAll(r1);
    L16:
        return r0;
    }

    public final void c(int r2, String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        r3 = FatUtil.getFatFsErrorCodeMsg(r2);
    L5:
        b(r2, r3);
    }

    public static /* synthetic */ int a(UpdateResourceTask r0, int r1) {
        r0.j = r1;
        return r1;
    }

    public static /* synthetic */ WatchFileContent a(UpdateResourceTask r0, WatchFileContent r1) {
        r0.k = r1;
        return r1;
    }

    public static /* synthetic */ String a() {
        return n;
    }

    public static /* synthetic */ long a(UpdateResourceTask r0, long r1) {
        r0.l = r1;
        return r1;
    }

    public static /* synthetic */ void a(UpdateResourceTask r0, String r1) {
        r0.b(r1);
    }

    public final Task a(File r12) throws RuntimeException {
        byte[] r0 = WatchFileUtil.readFileData(r12.getPath());
        AnonymousClass1 r2 = null;
        if (r0 != null) goto L5;
    L20:
        JL_Log.e(n, "convertTask", "Invalid File.");
        return null;
    L5:
        if (r0.length < 512) goto L20;
        FatFile r3 = this.a.getWatchFileByPath(r12.getPath());
        if (r3 != null) goto L11;
        Task r1 = new Task(r2);
        r1.filePath = r12.getPath();
        r1.needSize = r12.length();
        r1.op = 1;
        return r1;
    L11:
        this.k = null;
        String r4 = n;
        JL_Log.d(r4, "convertTask", "file path : " + r3.getPath());
        this.a.getWatchFileSize(r3.getPath(), new AnonymousClass2(this));
        d();
        WatchFileContent r5 = this.k;
        if (r5 == null) goto L19;
        short r6 = r5.getCrc();
        long r7 = this.k.getFileSize();
        short r8 = CryptoUtil.CRC16(r0, 0);
        JL_Log.i(r4, "convertTask", RcspUtil.formatString("SDK calc file crc : %d(0x%X), Device returned file crc : %d(0x%X).", new Object[]{Short.valueOf(r8), Short.valueOf(r8), Short.valueOf(r6), Short.valueOf(r6)}));
        if (r8 == r6) goto L17;
        Task r9 = new Task(r2);
        r9.filePath = r12.getPath();
        r9.needSize = r12.length() - r7;
        r9.op = 2;
        return r9;
    L17:
        return null;
    L19:
        throw new RuntimeException(String.valueOf(b()));
    }

    public final int b() {
        BaseError r0 = this.m;
        if (r0 != null) goto L7;
        return 12288;
    L7:
        return r0.getSubCode();
    }

    public final void b(final String r3, final int r4) {
        if (this.c == null) goto L6;
        this.g.post(new j96(this, r3, r4));
        return;
    }

    public final void b(final String r3) {
        if (this.c == null) goto L5;
        this.g.post(new i96(this, r3));
    L5:
        ThreadStateListener r4 = this.d;
        if (r4 == null) goto L9;
        r4.onFinish(getId());
        return;
    }

    public final void b(final int r4, final String r5) {
        JL_Log.w(n, "notifyError", RcspUtil.formatString("code : %d(0x%X), %s.", new Object[]{Integer.valueOf(r4), Integer.valueOf(r4), r5}));
        WatchFileUtil.deleteFile(WatchFileUtil.obtainUpdateFilePath(this.h, OTAManager.OTA_FILE_SUFFIX));
        WatchFileUtil.deleteFile(this.h + File.separator + WatchConstant.RES_DIR_NAME);
        if (this.c == null) goto L5;
        this.g.post(new h96(this, r4, r5));
    L5:
        ThreadStateListener r6 = this.d;
        if (r6 == null) goto L9;
        r6.onFinish(getId());
        return;
    }

    public final void b(final int r3, final String r4, final float r5) {
        if (this.c == null) goto L6;
        this.g.post(new k96(this, r3, r4, r5));
        return;
    }

    public final boolean a(ArrayList<Task> r7) throws RuntimeException {
        boolean r0 = true;
        if (r7 != null) goto L5;
    L21:
        return true;
    L5:
        if (r7.isEmpty() == true) goto L21;
        this.l = -1;
        JL_Log.d(n, "hasEnoughSpace", "task size : " + r7.size());
        this.a.getWatchSysLeftSize(new AnonymousClass3(this));
        d();
        long r3 = this.l;
        if (r3 == (-1)) goto L20;
        Iterator<Task> r8 = r7.iterator();
    L11:
        if (r8.hasNext() == false) goto L14;
        r3 = r3 - r8.next().needSize;
        goto L11
    L14:
        if (r3 >= 0) goto L17;
        r0 = false;
    L17:
        JL_Log.e(n, "hasEnoughSpace", "enough space : " + r0 + ", leftSize = " + r3);
        return r0;
    L20:
        throw new RuntimeException(String.valueOf(b()));
    }

    public final int a(RuntimeException r3) {
        if (r3 != null) goto L14;
        return 12288;
    L14:
    L11:
        e = move-exception;
        e.printStackTrace();
    L13:
        return 12288;
    L6:
        if (TextUtils.isEmpty(r3.getMessage()) == true) goto L13;
        if (TextUtils.isDigitsOnly(r3.getMessage()) == false) goto L13;
        return Integer.parseInt(r3.getMessage());
    }

    public final /* synthetic */ void a(String r2, int r3) {
        this.c.onStart(r2, r3);
    }

    public final /* synthetic */ void a(String r2) {
        this.c.onStop(r2);
    }

    public final /* synthetic */ void a(int r2, String r3) {
        this.c.onError(r2, r3);
    }

    public final /* synthetic */ void a(int r2, String r3, float r4) {
        this.c.onProgress(r2, r3, r4);
    }

    public final void a(int r2) {
        c(r2, FatUtil.getFatFsErrorCodeMsg(r2));
    }
}
