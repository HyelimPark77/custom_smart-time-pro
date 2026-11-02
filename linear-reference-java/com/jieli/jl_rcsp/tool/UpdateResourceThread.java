package com.jieli.jl_rcsp.tool;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.l96;
import com.android.mltcode.paycertificationapi.m96;
import com.android.mltcode.paycertificationapi.n96;
import com.android.mltcode.paycertificationapi.o96;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_fatfs.utils.ZipUtil;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.fatfs.FatFsWatch;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateResourceThread extends Thread {
    public static final String n = "UpdateResourceThread";
    public final Object a;
    public boolean b;
    public int c;
    public final FatFsWatch d;
    public final FatFileSystem e;
    public final String f;
    public String g;
    public String h;
    public final OnUpdateResourceCallback i;
    public final ThreadStateListener j;
    public final Handler k;
    public boolean l;
    public BaseError m;

    public static class UpdateTask {
        public static final int OP_CREATE_FILE = 1;
        public static final int OP_REPLACE_FILE = 2;
        public String filePath;
        public long fileSize;
        public int op;

        public UpdateTask() {
        }

        public /* synthetic */ UpdateTask(AnonymousClass1 r1) {
            this();
        }
    }

    static {
    }

    public UpdateResourceThread(FatFsWatch r3, String r4, OnUpdateResourceCallback r5, ThreadStateListener r6) {
        this.a = new Object();
        this.k = new Handler(Looper.getMainLooper());
        if (r3 == null) goto L7;
        this.d = r3;
        this.e = r3.getWatchSystem();
        this.f = r4;
        this.i = r5;
        this.j = r6;
        return;
    L7:
        throw new NullPointerException("FatFsWatch can not be null.");
    }

    public static /* synthetic */ void a(UpdateResourceThread r0) {
        r0.g();
    }

    public static /* synthetic */ int b(UpdateResourceThread r0) {
        return r0.c;
    }

    public static /* synthetic */ void c(UpdateResourceThread r0) {
        r0.f();
    }

    public final long d() {
        FatFileSystem r0 = this.e;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return ((long) r0.getFreeSize()) * 4096;
    }

    public final void e() {
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
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            boolean r1 = r2.b     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            if (r1 != 0) goto L16
            r1 = 1
            r2.b = r1     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
            java.lang.Object r1 = r2.a     // Catch: java.lang.Throwable -> L10 java.lang.InterruptedException -> L12
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
            r2.b = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jieli.jl_rcsp.tool.UpdateResourceThread.e():void");
    }

    public final void f() {
        String r0 = WatchFileUtil.obtainUpdateFilePath(this.g, OTAManager.OTA_FILE_SUFFIX);
        if (r0 == null) goto L5;
    L13:
        WatchFileUtil.deleteFile(this.g + "/" + WatchConstant.RES_DIR_NAME);
        b(r0);
        return;
    L5:
        if (this.d.isOTAResource() == false) goto L9;
        this.d.writeResourceOTAFlag(true, new AnonymousClass5(this));
        return;
    L9:
        if (this.l == false) goto L12;
        this.d.jumpToUpdateResource(true, new AnonymousClass6(this));
        return;
    L12:
        WatchFileUtil.deleteFile(this.f);
        goto L13
    }

    public final void g() {
        Object r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.b == false) goto L9;
        this.a.notifyAll();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final void h() {
        File r0 = new File(this.h);
        ArrayList<UpdateTask> r1 = new ArrayList();
        File[] r2 = r0.listFiles();
        final int r3 = 0;
        if (r2 == null) goto L16;
        int r4 = r2.length;
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L16;
        UpdateTask r6 = a(r2[r5]);     // Catch: RuntimeException -> L11
        if (r6 == null) goto L13;
        r1.add(r6);     // Catch: RuntimeException -> L11
    L13:
        r5 = r5 + 1;
    L11:
        e = move-exception;
        a(a(e), true);
        return;
    L16:
        ArrayList<UpdateTask> r7 = a(r1);
        if (a(r7) == true) goto L20;
        a(16897, true);
        return;
    L20:
        Object r8 = this.a;
        monitor-enter(r8);
        String r9 = n;     // Catch: Throwable -> L29
        JL_Log.i(r9, "updateResource", "isOTAResource = " + this.d.isOTAResource());     // Catch: Throwable -> L29
        if (this.d.isOTAResource() == true) goto L31;
        this.d.writeResourceOTAFlag(false, new AnonymousClass1(this));     // Catch: Throwable -> L29
        e();     // Catch: Throwable -> L29
        if (this.d.isOTAResource() == true) goto L31;
        a(b(), c(), false);     // Catch: Throwable -> L29
        monitor-exit(r8);     // Catch: Throwable -> L29
        return;
    L31:
        this.d.jumpToUpdateResource(false, new AnonymousClass2(this));     // Catch: Throwable -> L29
        e();     // Catch: Throwable -> L29
        if (this.l == true) goto L36;
        a(b(), c(), false);     // Catch: Throwable -> L29
        monitor-exit(r8);     // Catch: Throwable -> L29
        return;
    L36:
        JL_Log.i(r9, "updateResource", "task size : " + r7.size());     // Catch: Throwable -> L29
        if (r7.isEmpty() == false) goto L41;
        f();     // Catch: Throwable -> L29
        monitor-exit(r8);     // Catch: Throwable -> L29
        return;
    L41:
        b(this.h, r7.size());     // Catch: Throwable -> L29
    L43:
        if (r3 >= r7.size()) goto L66;
        final UpdateTask r10 = r7.get(r3);     // Catch: Throwable -> L29
        if (this.c != 0) goto L66;
        int r11 = r10.op;     // Catch: Throwable -> L29
        if (r11 != 1) goto L57;
        if (this.e == null) goto L51;
        String r12 = n;     // Catch: Throwable -> L29
        JL_Log.i(r12, "updateResource", "createFatFile ---> filePath : " + r10.filePath);     // Catch: Throwable -> L29
        this.e.createFatFile(r10.filePath, true, new AnonymousClass3(this, r3, r10));     // Catch: Throwable -> L29
        if (this.c != 0) goto L66;
        JL_Log.w(r12, "updateResource", "createFatFile ---> lock... >> ");     // Catch: Throwable -> L29
        e();     // Catch: Throwable -> L29
        JL_Log.w(r12, "updateResource", "createFatFile ---> unlock... >> ");     // Catch: Throwable -> L29
    L65:
        r3 = r3 + 1;     // Catch: Throwable -> L29
        goto L43
    L51:
        this.c = 22;     // Catch: Throwable -> L29
        JL_Log.i(n, "updateResource", "createFatFile ---> updateResult : 2");     // Catch: Throwable -> L29
        goto L66
    L57:
        if (r11 != 2) goto L65;
        FatFileSystem r13 = this.e;     // Catch: Throwable -> L29
        if (r13 == null) goto L60;
        r13.replaceFatFile(r10.filePath, new AnonymousClass4(this, r3, r10));     // Catch: Throwable -> L29
        if (this.c != 0) goto L66;
        String r14 = n;     // Catch: Throwable -> L29
        JL_Log.e(r14, "updateResource", "replaceFatFile ---> lock >> ");     // Catch: Throwable -> L29
        e();     // Catch: Throwable -> L29
        JL_Log.e(r14, "updateResource", "replaceFatFile ---> unlock >> ");     // Catch: Throwable -> L29
        goto L65
    L60:
        this.c = 22;     // Catch: Throwable -> L29
        JL_Log.i(n, "updateResource", "replaceFatFile ---> updateResult : 2");     // Catch: Throwable -> L29
    L66:
        monitor-exit(r8);     // Catch: Throwable -> L29
        JL_Log.e(n, "updateResource", "end >> " + this.c);
        int r15 = this.c;
        if (r15 != 0) goto L71;
        f();
        return;
    L71:
        a(r15, true);
        return;
    L29:
        th = move-exception;
        throw th;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ThreadStateListener r0 = this.j;
        if (r0 == null) goto L6;
        r0.onStart(getId());
    L6:
        if (this.f != null) goto L9;
        a(5);
        return;
    L9:
        File r1 = new File(this.f);
        if (r1.exists() == true) goto L13;
        a(5);
        return;
    L13:
        this.g = WatchFileUtil.getDirPath(this.f);
        String r2 = WatchFileUtil.getFileName(this.f);
        String r3 = n;
        JL_Log.i(r3, r3, "dirPath = " + this.g + ", fileName = " + r2);
        if (r2.endsWith(OTAManager.OTA_ZIP_SUFFIX) == false) goto L21;
        ZipUtil.unZipFolder(this.f, this.g);     // Catch: Exception -> L17
    L19:
        this.h = UpdateResourceTask.findFolder(this.g, WatchConstant.RES_DIR_NAME);
    L25:
        String r4 = n;
        JL_Log.i(r4, r4, "targetPath = " + this.h);
        if (this.h == null) goto L28;
        h();
        return;
    L28:
        String r5 = WatchFileUtil.obtainUpdateFilePath(this.g, OTAManager.OTA_FILE_SUFFIX);
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
        this.h = this.f;
        goto L25
    }

    public void stopThread() {
        this.c = 28;
        g();
    }

    public static /* synthetic */ BaseError a(UpdateResourceThread r0, BaseError r1) {
        r0.m = r1;
        return r1;
    }

    public final void b(final String r3, final int r4) {
        if (this.i == null) goto L6;
        this.k.post(new l96(this, r3, r4));
        return;
    }

    public final String c() {
        BaseError r0 = this.m;
        if (r0 != null) goto L7;
        return "";
    L7:
        return r0.getMessage();
    }

    public static /* synthetic */ boolean a(UpdateResourceThread r0, boolean r1) {
        r0.l = r1;
        return r1;
    }

    public static /* synthetic */ String a() {
        return n;
    }

    public final void b(final String r3) {
        if (this.i == null) goto L5;
        this.k.post(new n96(this, r3));
    L5:
        ThreadStateListener r4 = this.j;
        if (r4 == null) goto L9;
        r4.onFinish(getId());
        return;
    }

    public static /* synthetic */ void a(UpdateResourceThread r0, int r1, String r2, float r3) {
        r0.b(r1, r2, r3);
    }

    public static /* synthetic */ int a(UpdateResourceThread r0, int r1) {
        r0.c = r1;
        return r1;
    }

    public static /* synthetic */ void a(UpdateResourceThread r0, int r1, String r2, boolean r3) {
        r0.a(r1, r2, r3);
    }

    public final void b(final int r4, final String r5) {
        JL_Log.w(n, "notifyError", RcspUtil.formatString("code : %d(0x%X), %s.", new Object[]{Integer.valueOf(r4), Integer.valueOf(r4), r5}));
        WatchFileUtil.deleteFile(WatchFileUtil.obtainUpdateFilePath(this.g, OTAManager.OTA_FILE_SUFFIX));
        WatchFileUtil.deleteFile(this.g + File.separator + WatchConstant.RES_DIR_NAME);
        if (this.i == null) goto L5;
        this.k.post(new m96(this, r4, r5));
    L5:
        ThreadStateListener r6 = this.j;
        if (r6 == null) goto L9;
        r6.onFinish(getId());
        return;
    }

    public static /* synthetic */ void a(UpdateResourceThread r0, int r1, String r2) {
        r0.b(r1, r2);
    }

    public final /* synthetic */ void a(String r2, int r3) {
        this.i.onStart(r2, r3);
    }

    public final /* synthetic */ void a(String r2) {
        this.i.onStop(r2);
    }

    public final /* synthetic */ void a(int r2, String r3) {
        this.i.onError(r2, r3);
    }

    public final /* synthetic */ void a(int r2, String r3, float r4) {
        this.i.onProgress(r2, r3, r4);
    }

    public final void a(int r2) {
        a(r2, false);
    }

    public final void a(int r2, boolean r3) {
        a(r2, FatUtil.getFatFsErrorCodeMsg(r2), r3);
    }

    public final void a(final int r2, final String r3, boolean r4) {
        if (r4 == true) goto L4;
    L7:
        b(r2, r3);
        return;
    L4:
        if (this.l == false) goto L7;
        this.d.jumpToUpdateResource(true, new AnonymousClass7(this, r2, r3));
    }

    public final void b(final int r3, final String r4, final float r5) {
        if (this.i == null) goto L6;
        this.k.post(new o96(this, r3, r4, r5));
        return;
    }

    public final int b() {
        BaseError r0 = this.m;
        if (r0 != null) goto L7;
        return 12288;
    L7:
        return r0.getSubCode();
    }

    public final UpdateTask a(File r8) throws RuntimeException {
        byte[] r0 = WatchFileUtil.readFileData(r8.getPath());
        AnonymousClass1 r1 = null;
        if (r0 != null) goto L5;
    L24:
        return null;
    L5:
        if (r0.length < 512) goto L24;
        String r2 = FatUtil.getFatFilePath(this.e.getCurBrowsePath(), r8.getPath());
        FatFile r4 = this.e.getFatFileMsg(r2);
        if (r4 == null) goto L22;
        byte[] r3 = this.e.getFileHead(r2);
        if (r3 == null) goto L21;
        byte[] r5 = new byte[512];
        System.arraycopy(r0, 0, r5, 0, 512);
        if (Arrays.equals(r5, r3) == true) goto L14;
    L18:
        UpdateTask r6 = new UpdateTask(r1);
        r6.filePath = r8.getPath();
        r6.fileSize = r0.length;
        r6.op = 2;
        return r6;
    L14:
        if (r8.length() != r4.getSize()) goto L18;
        JL_Log.w(n, "convertUpdateTask", "head same, file size : " + r8.length() + ", fat File size = " + r4.getSize());
        return null;
    L21:
        throw new RuntimeException(String.valueOf(24));
    L22:
        UpdateTask r7 = new UpdateTask(r1);
        r7.filePath = r8.getPath();
        r7.fileSize = r0.length;
        r7.op = 1;
        return r7;
    }

    public final ArrayList<UpdateTask> a(ArrayList<UpdateTask> r6) {
        if (r6 != null) goto L4;
    L17:
        return r6;
    L4:
        if (r6.size() <= 1) goto L17;
        ArrayList<UpdateTask> r0 = new ArrayList();
        ArrayList r1 = new ArrayList();
        Iterator<UpdateTask> r7 = r6.iterator();
    L8:
        if (r7.hasNext() == false) goto L14;
        UpdateTask r2 = r7.next();
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

    public final boolean a(List<UpdateTask> r13) {
        boolean r1 = false;
        if (this.e != null) goto L6;
        return false;
    L6:
        if (r13 != null) goto L8;
    L27:
        return true;
    L8:
        if (r13.isEmpty() == true) goto L27;
        long r2 = d();
        JL_Log.d(n, "hasEnoughSpace", "leftSize = " + r2);
        Iterator<UpdateTask> r14 = r13.iterator();
    L12:
        if (r14.hasNext() == false) goto L23;
        UpdateTask r4 = r14.next();
        JL_Log.d(n, "hasEnoughSpace", "task = " + r4.filePath + ", size = " + r4.fileSize + ", op = " + r4.op);
        int r5 = r4.op;
        if (r5 != 1) goto L16;
        r2 = r2 - r4.fileSize;
    L21:
        if (r2 >= 0) goto L12;
    L16:
        if (r5 != 2) goto L21;
        FatFileSystem r6 = this.e;
        r2 = r2 - (r4.fileSize - r6.getFatFileMsg(FatUtil.getFatFilePath(r6.getCurBrowsePath(), r4.filePath)).getSize());
    L23:
        if (r2 < 0) goto L25;
        r1 = true;
    L25:
        JL_Log.e(n, "hasEnoughSpace", r1 + ", leftSize = " + r2);
        return r1;
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
}
