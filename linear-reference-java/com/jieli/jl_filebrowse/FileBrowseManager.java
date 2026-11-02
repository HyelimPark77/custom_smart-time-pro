package com.jieli.jl_filebrowse;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.O1X0O1iI;
import com.android.mltcode.paycertificationapi.X1I0iXXX;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.jieli.jl_filebrowse.bean.File;
import com.jieli.jl_filebrowse.bean.FileChangeInfo;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_filebrowse.bean.RegFile;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileBrowseOperator;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_filebrowse.interfaces.LrcDecoder;
import com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback;
import com.jieli.jl_filebrowse.interfaces.OperatCallback;
import com.jieli.jl_filebrowse.interfaces.lrc.LrcReadObserver;
import com.jieli.jl_filebrowse.interfaces.lrc.LrcReadOperator;
import com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback;
import com.jieli.jl_filebrowse.tool.FileObserverHelper;
import com.jieli.jl_filebrowse.tool.LrcReadObserverHelper;
import com.jieli.jl_rcsp.impl.OnFileBrowseCallbackImpl;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.tool.filebrowse.FileBrowseOperatorImpl;
import com.jieli.jl_rcsp.tool.filebrowse.LrcReadOperatorImpl;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class FileBrowseManager implements OnFileBrowseCallback, OnLrcCallback {
    public static int MAX_FOLDER_LEVEL = 8;
    public static long WAITING_CMD_TIMEOUT = 20000;
    public static final String v = "FileBrowseManager";
    public static final int w = 4112;

    @SuppressLint({"StaticFieldLeak"})
    public static volatile FileBrowseManager x = null;
    public static final int y = 3072;
    public static String z;
    public FileBrowseOperator a;
    public LrcReadOperator b;
    public final FileObserverHelper c;
    public final LrcReadObserverHelper d;
    public final Map<String, Folder> e;
    public final ByteArrayOutputStream f;
    public final List<SDCardBean> g;
    public int h;
    public volatile RcspOpImpl i;
    public volatile boolean j;
    public volatile SDCardBean k;
    public volatile PathData l;
    public Context m;
    public volatile boolean n;
    public OnRcspCallback o;
    public final Handler p;
    public byte[] q;
    public int r;
    public FileStruct s;
    public LrcDecoder t;
    public boolean u;

    static {
    }

    public FileBrowseManager() {
        this.e = new HashMap();
        this.f = new ByteArrayOutputStream();
        this.g = new ArrayList();
        this.h = 10;
        this.j = false;
        this.n = false;
        Handler r1 = new Handler(Looper.getMainLooper(), new AnonymousClass1(this));
        this.p = r1;
        this.r = 0;
        this.u = true;
        this.c = new FileObserverHelper(r1);
        this.d = new LrcReadObserverHelper(r1);
    }

    public static /* synthetic */ String a() {
        return v;
    }

    public static /* synthetic */ void b(FileBrowseManager r0) {
        r0.c();
    }

    public static /* synthetic */ FileObserverHelper c(FileBrowseManager r0) {
        return r0.c;
    }

    public static FileBrowseManager getInstance() {
        if (x != null) goto L13;
        monitor-enter(FileBrowseManager.class);
        x = new FileBrowseManager();     // Catch: Throwable -> L9
        monitor-exit(FileBrowseManager.class);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    L13:
        return x;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void OnFlayCallback(boolean r4) {
        JL_Log.d(v, "OnFlayCallback", "isSuccess : " + r4);
        c();
        this.c.OnFlayCallback(r4);
    }

    public void addFileObserver(FileObserver r2) {
        this.c.registerCallback(r2);
    }

    public void addLrcReadObserver(LrcReadObserver r2) {
        this.d.registerCallback(r2);
    }

    public int appenBrowse(FileStruct r6, SDCardBean r7) {
        int r0 = 4097;
        if (r6 == null) goto L32;
        if (r7 == null) goto L32;
        if (b(r7) == false) goto L10;
        return 16384;
    L10:
        Folder r1 = getCurrentReadFile(r7);
        if (r1 != null) goto L14;
        JL_Log.w(v, "appenBrowse", "No file found. " + r6);
        return 16387;
    L14:
        File r3 = r1.getChildFile(r6.getCluster());
        if (r3 != null) goto L18;
        r3 = new Folder(r1, r6);
    L18:
        if (r3.isFile() == false) goto L21;
        JL_Log.w(v, "appenBrowse", "Target is not folder. " + r6);
        return 4097;
    L21:
        Folder r4 = (Folder) r3;
        if (r4.getLevel() <= MAX_FOLDER_LEVEL) goto L26;
        JL_Log.w(v, "appenBrowse", "Folders are too deep. limit level = " + MAX_FOLDER_LEVEL);
        return 16388;
    L26:
        if (isReading() == false) goto L29;
        JL_Log.w(v, "appenBrowse", "Reading file data.");
        return 16385;
    L29:
        String r8 = v;
        JL_Log.d(r8, "appenBrowse", "" + r4);
        this.e.put(a(r7), r4);
        r0 = listFiles(r4, 1);
        if (r0 == 0) goto L32;
        this.e.put(a(r7), r1);
        JL_Log.i(r8, "appenBrowse", "result = " + r0 + ", target = " + r4 + ",\n cacheFolder = " + r1);
    L32:
        return r0;
    }

    public int backBrowse(SDCardBean r2) {
        return backBrowse(r2, true);
    }

    public void cleanCache() {
        JL_Log.i(v, "cleanCache", "clear all");
        Iterator<SDCardBean> r0 = this.g.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        cleanCache(r0.next());
        goto L4
    L6:
        this.g.clear();
    }

    public int deleteFile(SDCardBean r2, List<FileStruct> r3, DeleteCallback r4) {
        return deleteFile(r2, r3, true, r4);
    }

    public int formatDevice(final SDCardBean r4, final OperatCallback r5) {
        if (r4 != null) goto L6;
        return 4097;
    L6:
        if (b(r4) == false) goto L10;
        return 16384;
    L10:
        if (isReading() == false) goto L13;
        return 16385;
    L13:
        a(true);
        this.a.formatDevice(r4.getDevHandler(), new AnonymousClass2(this, r4, r5));
        return 0;
    }

    public List<FileStruct> getCurrentFileStructs(SDCardBean r1) {
        Folder r2 = getCurrentReadFile(r1);
        if (r2 != null) goto L7;
        return new ArrayList();
    L7:
        return r2.getChildFileStructs();
    }

    public Folder getCurrentReadFile(SDCardBean r2) {
        if (b(r2) == false) goto L7;
        return null;
    L7:
        return this.e.get(a(r2));
    }

    public List<SDCardBean> getOnlineDev() {
        ArrayList r0 = new ArrayList();
        Iterator<SDCardBean> r1 = getSdCardBeans().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        SDCardBean r2 = r1.next();
        if (r2.isOnline() == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        return r0;
    }

    public SDCardBean getOnlineStorage(FileStruct r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return a(r1.getDevIndex());
    }

    public int getPageSize() {
        return this.h;
    }

    public List<SDCardBean> getSdCardBeans() {
        return new ArrayList(this.g);
    }

    public void init(RcspOpImpl r2) {
        if (this.n == true) goto L7;
        this.i = r2;
        setLrcReadOperator(new LrcReadOperatorImpl(r2));
        setFileBrowseOperator(new FileBrowseOperatorImpl(r2));
        OnFileBrowseCallbackImpl r0 = new OnFileBrowseCallbackImpl(r2, this, this);
        this.o = r0;
        r2.registerOnRcspCallback(r0);
        this.n = true;
        return;
    L7:
        throw new RuntimeException("It cannot be initialize morn than once!");
    }

    public boolean isInit() {
        return this.n;
    }

    public boolean isOnline(int r4) {
        Iterator<SDCardBean> r0 = getSdCardBeans().iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        SDCardBean r1 = r0.next();
        if (r1.getIndex() != r4) goto L4;
        return r1.isOnline();
    L9:
        return false;
    }

    public boolean isOpenLrcCache() {
        return this.u;
    }

    public boolean isReading() {
        return this.j;
    }

    public int listFiles(Folder r2, int r3) {
        return listFiles(r2, r3, true);
    }

    public int loadMore(SDCardBean r5) {
        if (b(r5) == false) goto L6;
        return 16384;
    L6:
        Folder r6 = getCurrentReadFile(r5);
        if (r6 != null) goto L11;
        return 16387;
    L11:
        if (r6.isLoadFinished(false) == false) goto L14;
        return 16386;
    L14:
        int r0 = r6.getChildCount() + 1;
        JL_Log.d(v, "loadMore", r6 + ", offset = " + r0);
        return listFiles(r6, r0);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onBluetoothConnectionChange(BluetoothDevice r4, int r5) {
        if (r4 == null) goto L9;
        JL_Log.i(v, "onBluetoothConnectionChange", "device : " + RcspUtil.printBtDeviceInfo(r4) + ", status : " + r5);
        if (r5 != 0) goto L8;
        cleanCache(r4);
        return;
    L8:
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileDataReceive(byte[] r6) {
        if (isReading() == false) goto L16;
        String r0 = v;     // Catch: IOException -> L11
        StringBuilder r2 = new StringBuilder();     // Catch: IOException -> L11
        r2.append("data size = ");     // Catch: IOException -> L11
        if (r6 != null) goto L8;
        int r4 = 0;
    L9:
        r2.append(r4);     // Catch: IOException -> L11
        JL_Log.d(r0, "onFileDataReceive", r2.toString());     // Catch: IOException -> L11
        b(0);     // Catch: IOException -> L11
        this.f.write(r6);     // Catch: IOException -> L11
        return;
    L8:
        r4 = r6.length;     // Catch: IOException -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadFailed(int r6) {
        if (isReading() == true) goto L5;
        return;
    L5:
        final PathData r0 = this.l;
        final SDCardBean r1 = this.k;
        JL_Log.i(v, "onFileReadFailed", "reason : " + r6 + "+ " + r0);
        if (r6 != 3) goto L12;
        if (r0 == null) goto L12;
        if (r0.getRepeatTimes() <= 0) goto L12;
        this.p.postDelayed(new X1I0iXXX(this, r0, r1), 500);
        return;
    L12:
        c();
        this.c.onFileReadFailed(r6);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadStart() {
        this.c.onFileReadStart();
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileReadStop(boolean r12) {
        if (isReading() == true) goto L5;
        return;
    L5:
        SDCardBean r0 = this.k;
        PathData r1 = this.l;
        byte[] r2 = this.f.toByteArray();
        String r3 = v;
        JL_Log.d(r3, "onFileReadStop", "isEnd = " + r12 + ", storage = " + r0 + ", data size = " + r2.length);
        if (this.a.dataHasPacket() == false) goto L8;
        List<FileStruct> r4 = FileBrowseUtil.parseDataHasPacket(r2);
    L9:
        this.f.reset();
        Folder r5 = getCurrentReadFile(r0);
        if (r5 != null) goto L13;
        JL_Log.e(r3, "onFileReadStop", "not found read folder. " + r0);
        c();
        this.c.onFileReadFailed(16387);
        return;
    L13:
        ArrayList r6 = new ArrayList();
        Iterator<FileStruct> r7 = r4.iterator();
    L15:
        if (r7.hasNext() == false) goto L25;
        FileStruct r8 = r7.next();
        if (r8 == null) goto L15;
        JL_Log.d(v, "onFileReadStop", "" + r8);
        if (r8.isFile() == false) goto L22;
        File r9 = new RegFile(r5, r8);
    L23:
        r6.add(r9);
        goto L15
    L22:
        r9 = new Folder(r5, r8);
        goto L23
    L25:
        if (r6.isEmpty() == false) goto L27;
    L30:
        if (r12 == false) goto L32;
    L34:
        r5.addChild(r6);
        r5.setLoadFinished(r12);
        c();
        this.c.onFileReceiver(r4);
        this.c.onFileReadStop(r12);
        return;
    L32:
        if (r4.isEmpty() == false) goto L34;
        r12 = true;
        goto L34
    L27:
        if (r6.get(0).getDevIndex() == r5.getDevIndex()) goto L30;
        JL_Log.w(v, "onFileReadStop", "File data does not match.");
        b(r1, r0);
        return;
    L8:
        r4 = FileBrowseUtil.parseData(r2);
        goto L9
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onFileStructureChange(FileChangeInfo r6) {
        if (r6 == null) goto L48;
        List<SDCardBean> r0 = getOnlineDev();
        if (r0 != null) goto L7;
        return;
    L7:
        if (r0.isEmpty() == true) goto L49;
        Iterator<SDCardBean> r1 = r0.iterator();
    L11:
        if (r1.hasNext() == false) goto L15;
        SDCardBean r2 = r1.next();
        if (r2.getDevHandler() != r6.getDevHandle()) goto L11;
    L16:
        if (r2 != null) goto L18;
        return;
    L18:
        if (r2.getDevHandler() != r6.getDevHandle()) goto L50;
        Folder r3 = getCurrentReadFile(r2);
        if (r3 == null) goto L51;
    L23:
        Folder r4 = r3.getParent();
        if (r4 == null) goto L26;
        r3 = r4;
    L26:
        if (r4 != null) goto L23;
        String r5 = v;
        JL_Log.d(r5, "onFileStructureChange", r3 + ",\n " + r6);
        Folder r7 = a(r3, r6.getFilePath());
        JL_Log.d(r5, "onFileStructureChange", "op = " + r6.getOp() + ", targetFolder = " + r7);
        if (r7 == null) goto L52;
        int r8 = r6.getOp();
        if (r8 != 1) goto L33;
        r7.removeChild(r6.getCluster());
        return;
    L33:
        if (r8 != 2) goto L53;
        r7.setLoadFinished(false);
        return;
    L53:
        return;
    L52:
        return;
    L51:
        return;
    L50:
        return;
    L15:
        r2 = null;
        goto L16
    L49:
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcDataReceive(byte[] r6) {
        byte[] r0 = this.q;
        if (r0 == null) goto L11;
        int r1 = this.r;
        if ((r6.length + r1) <= r0.length) goto L7;
        byte[] r2 = new byte[r0.length * 2];
        System.arraycopy(r0, 0, r2, 0, r1);
        this.q = r2;
    L7:
        String r3 = v;
        StringBuilder r4 = new StringBuilder();
        r4.append("lrcBuffer ---> ");
        byte[] r5 = this.q;
        r4.append(CHexConver.byte2HexStr(r5, r5.length));
        JL_Log.d(r3, "onLrcDataReceive", r4.toString());
        System.arraycopy(r6, 3, this.q, this.r, r6.length - 3);
        this.r += r6.length - 3;
        if ((r6[0] & 255) != 255) goto L12;
        onLrcReadStop();
        return;
    L12:
        return;
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadFailed(int r4) {
        JL_Log.d(v, "onLrcReadFailed", "reason : " + r4);
        this.r = 0;
        this.q = null;
        this.d.onLrcReadFailed(r4);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadStart() {
        this.r = 0;
        this.q = new byte[y];
        this.d.onLrcReadStart();
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.OnLrcCallback
    public void onLrcReadStop() {
        byte[] r0 = this.q;
        if (r0 == null) goto L63;
        int r2 = this.r;
        if (r2 < 5) goto L63;
        byte[] r3 = new byte[r2];
        System.arraycopy(r0, 0, r3, 0, r2);
        LrcDecoder r1 = this.t;
        if (r1 == null) goto L10;
        r3 = r1.decode(r3);
    L10:
        byte r4 = r3[0];
        if (r4 != (-1)) goto L14;
        String r5 = "utf_16le";
    L74:
        r3 = new String(r3, r5).getBytes(StandardCharsets.UTF_8);     // Catch: UnsupportedEncodingException -> L28
    L76:
        FileOutputStream r6 = new FileOutputStream(a(this.m, this.s));     // Catch: Throwable -> L44 Exception -> L46
        r6.write(r3);     // Catch: Throwable -> L40 Exception -> L42
        this.r = 0;
        this.q = null;
        r6.close();     // Catch: IOException -> L36
    L38:
        a(a(this.m, this.s));
        return;
    L36:
        e = move-exception;
        e.printStackTrace();
    L42:
        e = e;
    L48:
        e.printStackTrace();     // Catch: Throwable -> L40
        onLrcReadFailed(16389);     // Catch: Throwable -> L40
        this.r = 0;
        this.q = null;
        if (r6 == null) goto L78;
        r6.close();     // Catch: IOException -> L53
        return;
    L53:
        e = move-exception;
        e.printStackTrace();
        return;
    L78:
        return;
    L40:
        Throwable th = th;
    L56:
        this.r = 0;
        this.q = null;
        if (r6 != null) goto L69;
    L62:
        throw th;
    L69:
        r6.close();     // Catch: IOException -> L60
    L60:
        e = move-exception;
        e.printStackTrace();
        goto L62
    L46:
        e = e;
        r6 = null;
    L44:
        th = move-exception;
        th = th;
        r6 = null;
    L28:
        e = move-exception;
        e.printStackTrace();
        goto L76
    L14:
        if (r4 != (-2)) goto L19;
        if (r3[1] != (-1)) goto L19;
        r5 = "utf_16be";
    L19:
        if (r4 == (-17)) goto L21;
    L25:
        r5 = "gbk";
        goto L74
    L21:
        if (r3[1] != (-69)) goto L25;
        if (r3[2] != (-65)) goto L25;
        r5 = "utf-8";
    L63:
        onLrcReadFailed(-1);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.OnFileBrowseCallback
    public void onSdCardChange(List<SDCardBean> r5) {
        SDCardBean r0 = this.k;
        this.g.clear();
        this.g.addAll(r5);
        Iterator<SDCardBean> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L15;
        SDCardBean r1 = r6.next();
        if (r1.isOnline() == false) goto L7;
        if (getCurrentReadFile(r1) != null) goto L4;
        this.e.put(a(r1), File.createRootFolder(r1.getIndex()));
        goto L4
    L7:
        cleanCache(r1);
        if (r1.equals(r0) == false) goto L4;
        this.p.removeCallbacksAndMessages(null);
        if (isReading() == false) goto L4;
        onFileReadFailed(16384);
        goto L4
    L15:
        this.c.onSdCardStatusChange(getOnlineDev());
    }

    public int playFile(FileStruct r3, SDCardBean r4) {
        if (r3 == null) goto L21;
        if (r4 == null) goto L21;
        if (b(r4) == false) goto L10;
        return 16384;
    L10:
        Folder r5 = getCurrentReadFile(r4);
        if (r5 != null) goto L14;
        return 16387;
    L14:
        File r6 = r5.getChildFile(r3.getCluster());
        if (r6 == null) goto L21;
        if (r6.isFolder() == true) goto L21;
        return playFile((RegFile) r6);
    L21:
        return 4097;
    }

    public void release() {
        JL_Log.i(v, "release", "");
        this.n = false;
        if (this.i == null) goto L5;
        this.i.unregisterOnRcspCallback(this.o);
    L5:
        c();
        cleanCache();
        this.c.release();
        this.d.release();
        this.e.clear();
        x = null;
    }

    public void removeFileObserver(FileObserver r2) {
        this.c.unregisterCallback(r2);
    }

    public void removeLrcReadObserver(LrcReadObserver r2) {
        this.d.unregisterCallback(r2);
    }

    public void setFileBrowseOperator(FileBrowseOperator r1) {
        this.a = r1;
    }

    public void setLrcDecoder(LrcDecoder r1) {
        this.t = r1;
    }

    public void setLrcReadOperator(LrcReadOperator r1) {
        this.b = r1;
    }

    public void setOpenLrcCache(boolean r1) {
        this.u = r1;
    }

    public void setPageSize(int r1) {
        this.h = r1;
    }

    public void startLrcRead(Context r5, FileStruct r6) {
        if (this.b == null) goto L13;
        java.io.File r0 = new java.io.File(a(r5, r6));
        JL_Log.d(v, "startLrcRead", "path : " + r0.getPath());
        if (r0.exists() == true) goto L7;
    L11:
        this.m = r5;
        this.s = r6;
        this.b.startLrcRead(new AnonymousClass5(this));
        return;
    L7:
        if (isOpenLrcCache() == false) goto L10;
        a(r0.getPath());
        return;
    L10:
        r0.delete();
        goto L11
    }

    public static /* synthetic */ SDCardBean a(FileBrowseManager r0) {
        return r0.k;
    }

    public final boolean b(SDCardBean r2) {
        if (r2 != null) goto L6;
        return true;
    L6:
        return !isOnline(r2.getIndex());
    }

    public int backBrowse(SDCardBean r7, boolean r8) {
        if (r7 != null) goto L6;
        return 4097;
    L6:
        if (b(r7) == false) goto L9;
        return 16384;
    L9:
        Folder r0 = getCurrentReadFile(r7);
        if (r0 != null) goto L14;
        return 16387;
    L14:
        if (isReading() == false) goto L17;
        JL_Log.w(v, "backBrowse", "Reading file data.");
        return 16385;
    L17:
        Folder r1 = r0.getParent();
        if (r1 != null) goto L20;
        r1 = r0;
    L20:
        String r3 = v;
        JL_Log.d(r3, "backBrowse", "" + r1);
        this.e.put(a(r7), r1);
        int r9 = listFiles(r1, 1, r8);
        if (r9 == 0) goto L23;
        this.e.put(a(r7), r0);
        JL_Log.d(r3, "backBrowse", "result = " + r9 + ", target = " + r1 + ",\n currentFolder = " + r0);
    L23:
        return r9;
    }

    public final void c() {
        a(false);
        this.f.reset();
        b();
        this.p.removeCallbacksAndMessages(null);
        this.k = null;
        this.l = null;
    }

    public int deleteFile(SDCardBean r2, List<FileStruct> r3, boolean r4, DeleteCallback r5) {
        if (r2 == null) goto L17;
        if (r3 != null) goto L5;
        return 4097;
    L5:
        if (r3.isEmpty() == false) goto L8;
        return 4097;
    L8:
        if (b(r2) == false) goto L12;
        return 16384;
    L12:
        if (isReading() == false) goto L16;
        return 16385;
    L16:
        return a(r2, new ArrayList(r3), r4, r5);
    L17:
        return 4097;
    }

    public int listFiles(Folder r8, int r9, boolean r10) {
        if (r8 != null) goto L5;
        return 4097;
    L5:
        SDCardBean r1 = getOnlineStorage(r8);
        if (r1 != null) goto L8;
    L29:
        JL_Log.w(v, "listFiles", RcspUtil.formatString("Storage[%s] is offline.", new Object[]{r1}));
        return 16384;
    L8:
        if (b(r1) == true) goto L29;
        if (r1.getDevice() != null) goto L15;
        JL_Log.w(v, "listFiles", "Wrong parameters.");
        return 4097;
    L15:
        if (isReading() == false) goto L18;
        JL_Log.w(v, "listFiles", "Reading file data.");
        return 16385;
    L18:
        final List<FileStruct> r0 = a(r8, r9);
        int r3 = r0.size();
        String r4 = v;
        JL_Log.d(r4, "listFiles", r8 + ", offset = " + r9 + ", cacheFiles size = " + r3);
        if (r3 <= 0) goto L23;
        if (r10 == false) goto L22;
        JL_Log.d(r4, "listFiles", "callback cache file list.");
        final boolean r11 = a(r8, r0.get(r3 - 1));
        this.p.postDelayed(new O1X0O1iI(this, r0, r11), 300);
    L22:
        return 0;
    L23:
        PathData r12 = r8.convertPathData(r1, (short) r9, this.h);
        if (r12 != null) goto L27;
        JL_Log.w(r4, "listFiles", "File is not in storage.");
        return 16390;
    L27:
        a(true);
        b(r12, r1);
        return 0;
    }

    public static /* synthetic */ void a(FileBrowseManager r0, FileStruct r1) {
        r0.a(r1);
    }

    public final void b(int r4) {
        b();
        Handler r0 = this.p;
        r0.sendMessageDelayed(r0.obtainMessage(4112, r4, 0), WAITING_CMD_TIMEOUT);
    }

    public static /* synthetic */ int a(FileBrowseManager r0, SDCardBean r1, List r2, boolean r3, DeleteCallback r4) {
        return r0.a(r1, r2, r3, r4);
    }

    public static /* synthetic */ void a(FileBrowseManager r0, int r1) {
        r0.b(r1);
    }

    public final void b() {
        this.p.removeMessages(4112);
    }

    public void cleanCache(BluetoothDevice r5) {
        if (r5 == null) goto L13;
        JL_Log.i(v, "cleanCache", "device : " + r5);
        Iterator<Map.Entry<String, Folder>> r0 = this.e.entrySet().iterator();
    L6:
        if (r0.hasNext() == false) goto L21;
        Map.Entry<String, Folder> r1 = r0.next();
        if (r1.getKey().endsWith(r5.getAddress()) == false) goto L6;
        Folder r2 = r1.getValue();
        if (r2 == null) goto L6;
        r1.setValue(a(r2));
        goto L6
    L21:
        return;
    }

    public final /* synthetic */ void a(List r2, boolean r3) {
        this.c.onFileReceiver(r2);
        this.c.onFileReadStop(r3);
    }

    public final void b(final PathData r4, final SDCardBean r5) {
        if (r4 == null) goto L7;
        if (r5 == null) goto L8;
        this.k = r5;
        this.l = r4;
        JL_Log.d(v, "sendPathDataToDevice", r4 + ",\n" + r5);
        this.a.sendPathDataCmd(r4, FileBrowseUtil.coverPathDataToCmd(r4), new AnonymousClass4(this, r4, r5));
        return;
    L8:
        return;
    }

    public int deleteFile(List<FileStruct> r3, boolean r4, DeleteCallback r5) {
        if (r3 != null) goto L4;
        return 4097;
    L4:
        if (r3.isEmpty() == false) goto L7;
        return 4097;
    L7:
        return deleteFile(getOnlineStorage(r3.get(0)), new ArrayList(r3), r4, r5);
    }

    public int playFile(RegFile r5) {
        if (r5 != null) goto L5;
        return 4097;
    L5:
        SDCardBean r0 = getOnlineStorage(r5);
        if (r0 != null) goto L8;
        return 16384;
    L8:
        if (b(r0) == false) goto L11;
        return 16384;
    L11:
        if (isReading() == false) goto L14;
        return 16385;
    L14:
        JL_Log.d(v, "playFile", "" + r5);
        a(true);
        b(r5.convertPathData(r0, 1, this.h), r0);
        return 0;
    }

    public final /* synthetic */ void a(PathData r2, SDCardBean r3) {
        r2.setRepeatTimes(r2.getRepeatTimes() - 1);
        b(r2, r3);
    }

    public final void a(boolean r1) {
        this.j = r1;
    }

    public final SDCardBean a(int r4) {
        Iterator<SDCardBean> r0 = getSdCardBeans().iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        SDCardBean r1 = r0.next();
        if (r4 != r1.getIndex()) goto L4;
        if (r1.isOnline() == false) goto L4;
        return r1;
    L10:
        return null;
    }

    public void cleanCache(SDCardBean r5) {
        if (r5 == null) goto L9;
        String r0 = a(r5);
        Folder r1 = this.e.get(r0);
        if (r1 != null) goto L7;
        return;
    L7:
        JL_Log.i(v, "cleanCache", r5 + ",\n " + r1);
        this.e.put(r0, a(r1));
        return;
    }

    public final int a(final SDCardBean r17, final List<FileStruct> r18, final boolean r19, final DeleteCallback r20) {
        if (r17 == null) goto L15;
        if (r18 != null) goto L7;
        return 4097;
    L7:
        if (r18.isEmpty() == false) goto L10;
        return 0;
    L10:
        if (r18.size() != 1) goto L12;
        boolean r13 = true;
    L13:
        final FileStruct r0 = r18.remove(r18.size() - 1);
        a(true);
        final boolean r4 = r13;
        this.a.deleteFile(r17.getDevHandler(), r0.isFile() ? 1 : 0, r0.getCluster(), r13, r19, new AnonymousClass3(this, r0, r20, r4, r17, r18, r19));
        return 0;
    L12:
        r13 = false;
        goto L13
    L15:
        return 4097;
    }

    public final String a(SDCardBean r3) {
        if (r3 != null) goto L5;
        return "";
    L5:
        BluetoothDevice r0 = r3.getDevice();
        if (r0 != null) goto L10;
        return String.valueOf(r3.getIndex());
    L10:
        return r3.getIndex() + HelpFormatter.DEFAULT_OPT_PREFIX + r0.getAddress();
    }

    public int appenBrowse(Folder r3) {
        if (r3 != null) goto L5;
        return 4097;
    L5:
        SDCardBean r0 = a(r3.getDevIndex());
        if (r0 != null) goto L8;
        return 16384;
    L8:
        if (b(r0) == false) goto L11;
        return 16384;
    L11:
        return appenBrowse(r3.getFileStruct(), r0);
    }

    public final List<FileStruct> a(Folder r6, int r7) {
        SDCardBean r8 = getOnlineStorage(r6);
        if (r8 == null) goto L5;
        Folder r9 = getCurrentReadFile(r8);
        if (r9 == null) goto L9;
        int r0 = r9.getChildCount();
        boolean r1 = r9.isLoadFinished(false);
        JL_Log.d(v, "readCacheFiles", r0 + ", offset = " + r7 + ", isLoadFinished = " + r1);
        if (r1 == false) goto L16;
        if (r0 < r7) goto L16;
        int r10 = r7 - 1;
        return r9.getChildFileStructs().subList(r10, r0 + r10);
    L16:
        if (r0 < ((this.h + r7) - 1)) goto L18;
        int r11 = r7 - 1;
        return r9.getChildFileStructs().subList(r11, this.h + r11);
    L18:
        return new ArrayList();
    L9:
        return new ArrayList();
    L5:
        return new ArrayList();
    }

    public final boolean a(Folder r2, FileStruct r3) {
        if (r2 == null) goto L14;
        if (r3 == null) goto L14;
        SDCardBean r4 = getOnlineStorage(r2);
        if (r4 != null) goto L9;
        return false;
    L9:
        Folder r5 = getCurrentReadFile(r4);
        if (r5 != null) goto L13;
        return false;
    L13:
        return r5.isEndElement(r3);
    L14:
        return false;
    }

    public final void a(FileStruct r3) {
        if (r3 == null) goto L15;
        SDCardBean r0 = a(r3.getDevIndex());
        if (r0 == null) goto L18;
        Folder r1 = getCurrentReadFile(r0);
        if (r1 == null) goto L19;
    L10:
        if (r1 == null) goto L20;
        if (r1.removeChild(r3.getCluster()) == true) goto L21;
        r1 = r1.getParent();
        goto L10
    L21:
        return;
    L20:
        return;
    L19:
        return;
    L18:
        return;
    }

    public final Folder a(Folder r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        r3.clean();
        Folder r0 = r3.getParent();
    L6:
        Folder r1 = r0;
        Folder r2 = r3;
        r3 = r1;
        if (r3 == null) goto L9;
        r3.clean();
        r0 = r3.getParent();
        goto L6
    L9:
        r2.clean();
        return r2;
    }

    public final Folder a(Folder r4, String r5) {
        if (r4 == null) goto L22;
        if (r5 != null) goto L5;
        return null;
    L5:
        if (r5.isEmpty() == true) goto L27;
        String r0 = java.io.File.separator;
        int r1 = r5.lastIndexOf(r0);
        if (r1 != (-1)) goto L10;
    L21:
        return r4;
    L10:
        if (r0.equals(r5) == true) goto L21;
        int r2 = 0;
        String r6 = r5.substring(0, r1);
        String[] r3 = r6.split(r0);
        if (r3.length != 0) goto L15;
        r3 = new String[]{r6};
    L15:
        int r7 = r3.length;
    L16:
        if (r2 >= r7) goto L21;
        Folder r8 = r4.findFolderByName(r3[r2]);
        if (r8 == null) goto L21;
        r2 = r2 + 1;
        r4 = r8;
        goto L16
    L27:
        return null;
    L22:
        return null;
    }

    public final void a(String r2) {
        this.d.onLrcReadStop(r2);
    }

    public final String a(Context r2, FileStruct r3) {
        if (r3 != null) goto L6;
        return "lrc_Default";
    L6:
        return a(r2) + java.io.File.separator + r3.getName() + r3.getCluster();
    }

    public final String a(Context r4) {
        if (r4 != null) goto L6;
        return "";
    L6:
        if (TextUtils.isEmpty(z) == false) goto L8;
        String r1 = r4.getFilesDir().getPath();
        StringBuilder r2 = new StringBuilder();
        r2.append(r1);
        String r3 = java.io.File.separator;
        r2.append(r3);
        r2.append(r4.getPackageName());
        r2.append(r3);
        r2.append("lrcCache");
        z = r2.toString();
    L8:
        java.io.File r5 = new java.io.File(z);
        if (r5.exists() == true) goto L15;
        if (r5.mkdirs() == true) goto L15;
        JL_Log.w(v, "getLrcCachePath", "can not create lrc cache path");
        return "";
    L15:
        return r5.getPath();
    }
}
