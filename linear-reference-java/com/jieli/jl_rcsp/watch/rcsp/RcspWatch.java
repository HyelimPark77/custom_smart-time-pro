package com.jieli.jl_rcsp.watch.rcsp;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.mltcode.paycertificationapi.cf2;
import com.android.mltcode.paycertificationapi.df2;
import com.android.mltcode.paycertificationapi.ef2;
import com.android.mltcode.paycertificationapi.ff2;
import com.android.mltcode.paycertificationapi.gf2;
import com.google.gson.GsonBuilder;
import com.ironsource.C2985d4;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.model.FileExtMsg;
import com.jieli.jl_fatfs.tool.PackResFormat;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.impl.SettingFunctionImpl;
import com.jieli.jl_rcsp.impl.WatchOpImpl;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.WatchConfigure;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CmdError;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.DialExpandInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.task.GetFileByClusterTask;
import com.jieli.jl_rcsp.task.GetFileTask;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskListener;
import com.jieli.jl_rcsp.task.TransferTask;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.UpdateResourceTask;
import com.jieli.jl_rcsp.tool.WatchCallbackManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.WatchBase;
import com.jieli.jl_rcsp.watch.WatchProgressHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class RcspWatch extends WatchBase implements IWatchManager, TaskListener {
    public static final int o = 4114;
    public OnFatFileProgressListener e;
    public OnWatchOpCallback<byte[]> f;
    public PackResFormat g;
    public ITask h;
    public UpdateResourceTask i;
    public volatile boolean j;
    public volatile boolean k;
    public ExecutorService l;
    public final Handler m;
    public final FileObserver n;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.watch.rcsp.RcspWatch$1, reason: invalid class name */
    public class AnonymousClass1 implements OnWatchOpCallback<ArrayList<FatFile>> {
        public int a;
        public final /* synthetic */ RcspWatch b;

        public AnonymousClass1(RcspWatch r1) {
            this.b = r1;
        }

        public final /* synthetic */ void a() {
            this.b.listWatchList(this);
        }

        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
        public void onFailed(BaseError r4) {
            if (r4.getSubCode() != 16385) goto L8;
            int r0 = this.a;
            if (r0 >= 2) goto L8;
            this.a = r0 + 1;
            RcspWatch.r(this.b).postDelayed(new OXO1(this), 500);
            return;
        L8:
            JL_Log.e(RcspWatch.t(this.b), "MSG_INIT_WATCH#listWatchList", "onFailed ---> " + r4);
            this.a = 0;
            RcspWatch.a(this.b, r4.getSubCode());
        }

        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
        public /* bridge */ /* synthetic */ void onSuccess(ArrayList<FatFile> r1) {
            onSuccess2(r1);
        }

        /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
        public void onSuccess2(ArrayList<FatFile> r6) {
            JL_Log.i(RcspWatch.i(this.b), "MSG_INIT_WATCH#listWatchList", "onSuccess :: " + r6);
            this.a = 0;
            BluetoothDevice r0 = this.b.getConnectedDevice();
            WatchConfigure r1 = this.b.getWatchConfigure(r0);
            JL_Log.d(RcspWatch.k(this.b), "MSG_INIT_WATCH", "" + r1);
            if (r1 != null) goto L5;
        L7:
            RcspWatch.a(this.b, 0);
            if (r1 != null) goto L10;
        L15:
            JL_Log.w(RcspWatch.n(this.b), "MSG_INIT_WATCH", "isOTAResource = " + RcspWatch.o(this.b));
            if (RcspWatch.p(this.b) == false) goto L19;
            RcspWatch.q(this.b).onResourceUpdateUnfinished(r0);
            return;
        L19:
            return;
        L10:
            if (r1.getFunctionOption().isSupportNetworkModule() == false) goto L15;
            RcspWatch r7 = this.b;
            if (RcspWatch.a(r7, RcspWatch.l(r7).getDeviceInfo().getNetworkInfo()) == false) goto L15;
            JL_Log.w(RcspWatch.m(this.b), "MSG_INIT_WATCH", "Network Module has exception. ");
            return;
        L5:
            if (r1.getFunctionOption().isSupportDialExpandInfo() == false) goto L7;
            RcspWatch.a(this.b, r0);
            goto L7
        }
    }

    public class ListDirObserver implements FileObserver {
        public final OnWatchOpCallback<ArrayList<FatFile>> a;
        public final /* synthetic */ RcspWatch b;

        public /* synthetic */ ListDirObserver(RcspWatch r1, OnWatchOpCallback r2, AnonymousClass1 r3) {
            this(r1, r2);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean r1) {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int r5) {
            OnWatchOpCallback<ArrayList<FatFile>> r0 = this.a;
            if (r0 == null) goto L5;
            r0.onFailed(RcspErrorCode.buildJsonError(13, 12293, r5, null));
        L5:
            FileBrowseManager.getInstance().removeFileObserver(this);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean r3) {
            if (r3 == true) goto L4;
            FileBrowseManager.getInstance().loadMore(RcspWatch.c(this.b));
        L5:
            if (r3 == false) goto L8;
            FileBrowseManager.getInstance().removeFileObserver(this);
            return;
        L8:
            return;
        L4:
            this.b.listWatchList(this.a);
            goto L5
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> r1) {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> r1) {
        }

        public ListDirObserver(RcspWatch r1, OnWatchOpCallback<ArrayList<FatFile>> r2) {
            this.b = r1;
            this.a = r2;
        }
    }

    public RcspWatch(RcspOpImpl r2, WatchCallbackManager r3) {
        super(r2, r3);
        this.l = Executors.newSingleThreadExecutor();
        this.m = new Handler(Looper.getMainLooper(), new ff2(this));
        this.n = new AnonymousClass9(this);
    }

    public static /* synthetic */ boolean a(RcspWatch r0, boolean r1) {
        r0.k = r1;
        return r1;
    }

    public static /* synthetic */ UpdateResourceTask b(RcspWatch r0) {
        return r0.i;
    }

    public static /* synthetic */ SDCardBean c(RcspWatch r0) {
        return r0.e();
    }

    public static /* synthetic */ String d(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String e(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ DeviceStatusManager g(RcspWatch r0) {
        return r0.mStatusManager;
    }

    public static /* synthetic */ String h(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String i(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ DeviceStatusManager j(RcspWatch r0) {
        return r0.mStatusManager;
    }

    public static /* synthetic */ String k(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ RcspOpImpl l(RcspWatch r0) {
        return r0.mRcspOp;
    }

    public static /* synthetic */ String m(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String n(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ boolean o(RcspWatch r0) {
        return r0.isOTAResource;
    }

    public static /* synthetic */ boolean p(RcspWatch r0) {
        return r0.isOTAResource;
    }

    public static /* synthetic */ WatchCallbackManager q(RcspWatch r0) {
        return r0.mWatchCallbackManager;
    }

    public static /* synthetic */ Handler r(RcspWatch r0) {
        return r0.m;
    }

    public static /* synthetic */ String s(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String t(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ boolean u(RcspWatch r0) {
        return r0.j;
    }

    public static /* synthetic */ void v(RcspWatch r0) {
        r0.i();
    }

    public static /* synthetic */ String w(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ RcspOpImpl x(RcspWatch r0) {
        return r0.mRcspOp;
    }

    public static /* synthetic */ String y(RcspWatch r0) {
        return r0.TAG;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean cancelTransfer() {
        return d();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void createWatchFile(String r5, boolean r6, OnFatFileProgressListener r7) {
        if (e() != null) goto L7;
        if (r7 == null) goto L17;
        r7.onStop(16384);
        return;
    L17:
        return;
    L7:
        File r0 = new File(r5);
        if (r0.exists() == true) goto L10;
    L14:
        if (r7 == null) goto L18;
        r7.onStop(5);
        return;
    L18:
        return;
    L10:
        if (r0.isFile() == false) goto L14;
        String r1 = FatUtil.getFatFilePath(r5);
        JL_Log.d(this.TAG, "createWatchFile", "fatFilePath : " + r1 + ", OnFatFileProgressListener = " + r7);
        a(r5, r6, new WatchProgressHandler(this, 1, r7));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void deleteWatchFile(String r4, final OnFatFileProgressListener r5) {
        final SDCardBean r0 = e();
        if (r0 != null) goto L7;
        if (r5 == null) goto L16;
        r5.onStop(16384);
        return;
    L16:
        return;
    L7:
        final FileStruct r6 = a(r4);
        if (r6 != null) goto L12;
        if (r5 == null) goto L17;
        r5.onStop(4);
        return;
    L17:
        return;
    L12:
        if (r5 == null) goto L14;
        r5.onStart(r6.getName());
        r5.onProgress(0.0f);
    L14:
        deleteFileStart("/" + r6.getName(), new AnonymousClass6(this, r0, r6, r5));
    }

    @Override // com.jieli.jl_rcsp.watch.WatchBase, com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void destroy() {
        super.destroy();
        this.j = false;
        d();
        this.m.removeCallbacksAndMessages(null);
        if (this.l.isShutdown() == true) goto L5;
        this.l.shutdownNow();
    L5:
        UpdateResourceTask r0 = this.i;
        if (r0 == null) goto L8;
        r0.stopThread();
    L8:
        FileBrowseManager.getInstance().removeFileObserver(this.n);
        PackResFormat r1 = this.g;
        if (r1 == null) goto L11;
        r1.destroy();
        this.g = null;
    L11:
        this.h = null;
    }

    public final void f() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public String getCurrentBrowsePath() {
        SDCardBean r0 = e();
        if (r0 != null) goto L5;
        return null;
    L5:
        Folder r1 = FileBrowseManager.getInstance().getCurrentReadFile(r0);
        if (r1 != null) goto L9;
        return null;
    L9:
        return r1.getPathString();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public FatFile getWatchFileByPath(String r1) {
        FileStruct r2 = a(r1);
        if (r2 != null) goto L7;
        return null;
    L7:
        return FatFile.create(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchFileSize(String r6, OnWatchOpCallback<WatchFileContent> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(19, FatUtil.getFatFsErrorCodeMsg(19)));
        return;
    L8:
        return;
    L6:
        RcspOpImpl r0 = this.mRcspOp;
        r0.sendRcspCommand(r0.getTargetDevice(), CommandBuilder.buildExternalFlashGetFileMsgCmd(r6), 5000, new WatchBase.HandleRcspCallback("getWatchFileSize", r7, new AnonymousClass8(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchSysLeftSize(OnWatchOpCallback<Long> r7) {
        RcspOpImpl r0 = this.mRcspOp;
        r0.sendRcspCommand(r0.getTargetDevice(), CommandBuilder.buildExternalFlashGetLeftSpaceCmd(), new WatchBase.HandleRcspCallback("getWatchSysLeftSize", r7, new AnonymousClass7(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void init() {
        boolean r0 = false;
        this.j = false;
        this.k = false;
        FileBrowseManager.getInstance().addFileObserver(this.n);
        this.g = new PackResFormat();
        if (this.l.isShutdown() == false) goto L5;
        this.l = Executors.newSingleThreadExecutor();
    L5:
        BluetoothDevice r1 = getConnectedDevice();
        DeviceInfo r2 = this.mRcspOp.getDeviceInfo(r1);
        JL_Log.w(this.TAG, C2985d4.a.f, "" + r2);
        if (r2 != null) goto L9;
        b(8192);
        return;
    L9:
        ExternalFlashMsgResponse r3 = getExternalFlashMsg(r1);
        if (r3 == null) goto L20;
        if (r3.getSysStatus() == 0) goto L14;
        boolean r4 = true;
    L15:
        setSysException(r4);
        JL_Log.w(this.TAG, C2985d4.a.f, "isSysException = " + this.isSysException);
        if (this.isSysException == false) goto L20;
        b(r3.getSysStatus());
        return;
    L14:
        r4 = false;
    L20:
        if (r2.getExpandMode() != 1) goto L22;
        r0 = true;
    L22:
        setOTAResource(r0);
        if (r2.isSupportDevConfigure() == false) goto L26;
        this.k = true;
        requestDeviceConfigure(new AnonymousClass2(this));
        return;
    L26:
        i();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public boolean isInit() {
        if (getConnectedDevice() != null) goto L5;
        return false;
    L5:
        ExternalFlashMsgResponse r0 = getExternalFlashMsg(getConnectedDevice());
        if (r0 != null) goto L8;
    L13:
        return false;
    L8:
        if (r0.getSysStatus() != 0) goto L13;
        if (this.j == false) goto L13;
        return true;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void listWatchList(OnWatchOpCallback<ArrayList<FatFile>> r8) {
        SDCardBean r0 = e();
        JL_Log.d(this.TAG, "listWatchList", "flash = " + r0);
        if (r0 != null) goto L6;
        onCallbackError(r8, 16384);
        return;
    L6:
        Folder r1 = FileBrowseManager.getInstance().getCurrentReadFile(r0);
        JL_Log.d(this.TAG, "listWatchList", "folder = " + r1);
        if (r1 != null) goto L10;
        onCallbackError(r8, 16387);
        return;
    L10:
        boolean r2 = FileBrowseManager.getInstance().isReading();
        JL_Log.d(this.TAG, "listWatchList", "isReading = " + r2);
        if (r2 == false) goto L14;
        onCallbackError(r8, 16385);
        return;
    L14:
        List<FileStruct> r3 = r1.getChildFileStructs();
        if (r1.isLoadFinished(false) == true) goto L18;
        FileBrowseManager.getInstance().addFileObserver(new ListDirObserver(this, r8, null));
        FileBrowseManager.getInstance().loadMore(r0);
        JL_Log.d(this.TAG, "listWatchList", "loadMore >>>> ");
        return;
    L18:
        ArrayList<FatFile> r4 = new ArrayList();
        Iterator<FileStruct> r5 = r3.iterator();
    L20:
        if (r5.hasNext() == false) goto L25;
        FileStruct r6 = r5.next();
        if (FatFileSystem.isIgnoreFile(r6.getName()) == true) goto L20;
        r4.add(FatFile.create(r6));
        goto L20
    L25:
        JL_Log.d(this.TAG, "listWatchList", "callback ----> " + r4.size());
        if (r8 == null) goto L34;
        r8.onSuccess(r4);
        return;
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onBegin() {
        c();
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onCancel(int r4) {
        JL_Log.w(this.TAG, "Transfer", "onCancel ==== >>> reason = " + r4);
        a(4098);
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onError(int r4, String r5) {
        JL_Log.e(this.TAG, "Transfer", "onError ==== >>> code = " + r4 + ", message = " + r5);
        if (r4 != 12293) goto L17;
        CmdError r6 = CmdError.parseCmdError(r5);
        if (r6 == null) goto L17;
        if (r6.getCmdId() != 27) goto L9;
    L10:
        int r7 = r6.getSubCode();
        if (r7 != 3) goto L13;
        r4 = 12544;
        goto L17
    L13:
        if (r7 != 4) goto L17;
        r4 = 20;
        goto L17
    L9:
        if (r6.getCmdId() == 28) goto L10;
    L17:
        a(r4);
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onFinish() {
        JL_Log.i(this.TAG, "Transfer", "onFinish ==== >>> ");
        a(0);
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onProgress(int r1) {
        a(r1);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void openWatchFile(String r3, OnWatchOpCallback<byte[]> r4) {
        if (e() != null) goto L6;
        onCallbackError(r4, 16384);
        return;
    L6:
        FileStruct r5 = a(r3);
        if (r5 != null) goto L11;
        if (r4 == null) goto L13;
        r4.onFailed(new BaseError(4, FatUtil.getFatFsErrorCodeMsg(4)));
        return;
    L13:
        return;
    L11:
        this.f = r4;
        d(r5.getCluster());
    }

    public void reLoadFolder(OnWatchOpCallback<ArrayList<FatFile>> r3) {
        SDCardBean r0 = e();
        if (r0 == null) goto L5;
        FileBrowseManager.getInstance().cleanCache(r0);
    L5:
        listWatchList(r3);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void replaceWatchFile(String r2, OnFatFileProgressListener r3) {
        if (e() != null) goto L8;
        if (r3 == null) goto L14;
        r3.onStop(16384);
        return;
    L14:
        return;
    L8:
        if (WatchFileUtil.isFileExist(r2) == true) goto L12;
        if (r3 == null) goto L15;
        r3.onStop(5);
        return;
    L15:
        return;
    L12:
        createWatchFile(r2, true, r3);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void restoreWatchSystem(OnFatFileProgressListener r7) {
        if (e() != null) goto L7;
        if (r7 == null) goto L11;
        r7.onStop(16384);
        return;
    L11:
        return;
    L7:
        if (r7 == null) goto L9;
        r7.onStart("/");
        r7.onProgress(0.0f);
    L9:
        final WatchProgressHandler r0 = new WatchProgressHandler(this, 4, r7);
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashRestoreSystemCmd(), 5000, new CustomRcspActionCallback("restoreWatchSystem", new AnonymousClass3(this, r0), new AnonymousClass4(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void updateWatchResource(final String r2, final OnUpdateResourceCallback r3) {
        if (e() != null) goto L7;
        if (r3 == null) goto L9;
        r3.onError(16384, WatchError.getErrorDesc(16384));
        return;
    L9:
        return;
    L7:
        listWatchList(new AnonymousClass5(this, r2, r3));
    }

    public static /* synthetic */ String a(RcspWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String f(RcspWatch r0) {
        return r0.TAG;
    }

    public final void b(String r4) {
        if (e() != null) goto L6;
        a(16384);
        return;
    L6:
        ITask r0 = this.h;
        if (r0 != null) goto L9;
    L15:
        TransferTask.Param r1 = new TransferTask.Param();
        r1.devHandler = e().getDevHandler();
        r1.useFlash = true;
        this.h = new TransferTask(this.mRcspOp, r4, r1);
    L16:
        this.h.setListener(this);
        ((TransferTask) this.h).setPath(r4);
        this.h.start();
        return;
    L9:
        if (r0.isRun() == false) goto L15;
        if (this.h.isRun() == false) goto L16;
        a(4352);
    }

    public final void c() {
        this.m.post(new df2(this));
    }

    public final void d(int r5) {
        if (e() != null) goto L6;
        a(16384);
        return;
    L6:
        ITask r0 = this.h;
        if (r0 != null) goto L9;
    L15:
        GetFileByClusterTask.Param r1 = new GetFileByClusterTask.Param(e().getDevHandler(), 0, r5, GetFileTask.BYTE_ARRAY_STREAM);
        this.h = new GetFileByClusterTask(this.mRcspOp, r1);
    L16:
        this.h.setListener(this);
        this.h.start();
        return;
    L9:
        if (r0.isRun() == false) goto L15;
        if (this.h.isRun() == false) goto L16;
        a(4352);
    }

    public final SDCardBean e() {
        return a(FileBrowseManager.getInstance().getOnlineDev());
    }

    public final boolean g() {
        ITask r0 = this.h;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isRun() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final /* synthetic */ void h() {
        if (this.e == null) goto L12;
        ITask r0 = this.h;
        if (r0 != null) goto L7;
    L9:
        String r1 = null;
    L10:
        this.e.onStart(r1);
        return;
    L7:
        if ((r0 instanceof TransferTask) == false) goto L9;
        r1 = ((TransferTask) r0).getPath();
        goto L10
    }

    public final void i() {
        if (this.j == false) goto L5;
        return;
    L5:
        if (this.k == true) goto L17;
        SDCardBean r0 = e();
        this.m.removeMessages(4114);
        if (r0 != null) goto L10;
    L14:
        this.m.sendEmptyMessageDelayed(4114, 3000);
        return;
    L10:
        if (r0.isOnline() == false) goto L14;
        this.m.sendEmptyMessage(4114);
        return;
    }

    public static /* synthetic */ UpdateResourceTask a(RcspWatch r0, UpdateResourceTask r1) {
        r0.i = r1;
        return r1;
    }

    public final /* synthetic */ void c(int r5) {
        JL_Log.i(this.TAG, "callbackStop", "result = " + r5);
        OnFatFileProgressListener r0 = this.e;
        if (r0 == null) goto L5;
        r0.onStop(r5);
        this.e = null;
    L5:
        ITask r1 = this.h;
        if ((r1 instanceof GetFileByClusterTask) == false) goto L14;
        OnWatchOpCallback<byte[]> r2 = this.f;
        if (r2 == null) goto L15;
        if (r5 != 0) goto L11;
        this.f.onSuccess(((GetFileByClusterTask) r1).getCacheData());
    L12:
        this.f = null;
        return;
    L11:
        r2.onFailed(new BaseError(r5, WatchError.getErrorDesc(r5)));
        goto L12
    L15:
        return;
    }

    public static /* synthetic */ void a(RcspWatch r0, SDCardBean r1, FileStruct r2, OnFatFileProgressListener r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void a(RcspWatch r0, BluetoothDevice r1) {
        r0.a(r1);
    }

    public static /* synthetic */ void a(RcspWatch r0, int r1) {
        r0.b(r1);
    }

    public static /* synthetic */ boolean a(RcspWatch r0, NetworkInfo r1) {
        return r0.a(r1);
    }

    public final /* synthetic */ boolean a(Message r4) {
        if (r4.what == 4114) goto L5;
        return true;
    L5:
        if (this.j == false) goto L8;
        return false;
    L8:
        SDCardBean r5 = e();
        JL_Log.w(this.TAG, "MSG_INIT_WATCH", "flash = " + r5);
        if (r5 != null) goto L11;
    L14:
        b(16384);
        return true;
    L11:
        if (r5.isOnline() == false) goto L14;
        listWatchList(new AnonymousClass1(this));
        return true;
    }

    public final boolean d() {
        ITask r0 = this.h;
        if (r0 != null) goto L5;
    L8:
        return false;
    L5:
        if (r0.isRun() == false) goto L8;
        this.h.cancel((byte) 0);
        return true;
    }

    public final void b(int r4) {
        if (r4 != 0) goto L4;
        boolean r0 = true;
    L5:
        this.j = r0;
        JL_Log.i(this.TAG, "callbackWatchSystemInit", "code : " + r4 + ", isInit = " + this.j);
        this.mWatchCallbackManager.onWatchSystemInit(r4);
        return;
    L4:
        r0 = false;
        goto L5
    }

    public final SDCardBean a(List<SDCardBean> r8) {
        int[] r0 = WatchOpImpl.WATCH_STORAGE_INDEX_LIST;
        if (r0 != null) goto L5;
        return null;
    L5:
        Iterator<SDCardBean> r9 = r8.iterator();
    L7:
        if (r9.hasNext() == false) goto L14;
        SDCardBean r2 = r9.next();
        int r3 = r0.length;
        int r4 = 0;
    L9:
        if (r4 >= r3) goto L7;
        int r5 = r0[r4];
        if (r2.getIndex() == r5) goto L12;
        r4 = r4 + 1;
        goto L9
    L12:
        return r2;
    L14:
        return null;
    }

    public final /* synthetic */ void b(float r2) {
        OnFatFileProgressListener r0 = this.e;
        if (r0 == null) goto L6;
        r0.onProgress(r2);
        return;
    }

    public final FileStruct a(String r8) {
        String r0 = WatchFileUtil.getFileName(r8);
        if (r0 != null) goto L6;
        JL_Log.w(this.TAG, "getFileStructByFlashPath", "fileName is null.");
        return null;
    L6:
        SDCardBean r3 = e();
        if (r3 != null) goto L10;
        JL_Log.w(this.TAG, "getFileStructByFlashPath", "flash is null.");
        return null;
    L10:
        Folder r4 = FileBrowseManager.getInstance().getCurrentReadFile(r3);
        if (r4 != null) goto L14;
        JL_Log.w(this.TAG, "getFileStructByFlashPath", "folder is null.");
        return null;
    L14:
        List<FileStruct> r5 = r4.getChildFileStructs();
        Iterator<FileStruct> r6 = r5.iterator();
    L16:
        if (r6.hasNext() == false) goto L20;
        FileStruct r7 = r6.next();
        if (r0.equalsIgnoreCase(r7.getName()) == false) goto L16;
        return r7;
    L20:
        JL_Log.w(this.TAG, "getFileStructByFlashPath", "not found file info. file size = " + r5.size() + ", path = " + r8);
        return null;
    }

    public final void a(SDCardBean r3, FileStruct r4, final OnFatFileProgressListener r5) {
        ArrayList r0 = new ArrayList();
        r0.add(r4);
        int r6 = FileBrowseManager.getInstance().deleteFile(r3, r0, new AnonymousClass10(this, r5));
        JL_Log.w(this.TAG, "deleteFlashFile", "delResult = " + r6);
        if (r6 == 0) goto L7;
        if (r5 == null) goto L8;
        r5.onStop(r6);
        return;
    L8:
        return;
    }

    public final boolean a(String r10, byte[] r11) {
        String r12 = WatchFileUtil.getJsonFileName(r10);
        PackResFormat r0 = this.g;
        if (r0 == null) goto L41;
        if (r12 == null) goto L41;
        if (r11 == null) goto L41;
        if (r11.length == 0) goto L41;
        byte[] r13 = r0.getFileData(r11, r12);
        String r14 = this.TAG;
        StringBuilder r1 = new StringBuilder();
        r1.append("data = ");
        r1.append(CHexConver.byte2HexStr(r13));
        r1.append(", text = ");
        if (r13 != null) goto L12;
        String r2 = "";
    L13:
        r1.append(r2);
        JL_Log.d(r14, "isMatchVersion", r1.toString());
        if (r13 != null) goto L42;
        return false;
    L42:
        FileExtMsg r15 = (FileExtMsg) new GsonBuilder().create().fromJson(new String(r13).trim(), FileExtMsg.class);     // Catch: Exception -> L22
        JL_Log.d(this.TAG, "isMatchVersion", "fileExtMsg = " + r15);     // Catch: Exception -> L22
        if (r15 != null) goto L20;
        return false;
    L20:
        if (getExternalFlashMsg(this.mRcspOp.getTargetDevice()) == null) goto L24;
        String[] r16 = getExternalFlashMsg(this.mRcspOp.getTargetDevice()).getMatchVersions();     // Catch: Exception -> L22
    L25:
        String r3 = this.TAG;     // Catch: Exception -> L22
        StringBuilder r4 = new StringBuilder();     // Catch: Exception -> L22
        r4.append("matchVersions = ");     // Catch: Exception -> L22
        if (r16 != null) goto L28;
        String r5 = "null";
    L29:
        r4.append(r5);     // Catch: Exception -> L22
        JL_Log.d(r3, "isMatchVersion", r4.toString());     // Catch: Exception -> L22
        if (r16 != null) goto L32;
    L39:
        return true;
    L32:
        if (r16.length <= 0) goto L39;
        int r6 = r16.length;     // Catch: Exception -> L22
        int r7 = 0;
    L34:
        if (r7 >= r6) goto L41;
        String r8 = r16[r7];     // Catch: Exception -> L22
        JL_Log.d(this.TAG, "isMatchVersion", "version = " + r8);     // Catch: Exception -> L22
        if (r8.equalsIgnoreCase(r15.getVersionID()) == true) goto L37;
        r7 = r7 + 1;
        goto L34
    L37:
        return true;
    L28:
        r5 = Arrays.toString(r16);     // Catch: Exception -> L22
        goto L29
    L24:
        r16 = null;
    L22:
        e = move-exception;
        e.printStackTrace();
        goto L41
    L12:
        r2 = new String(r13);
    L41:
        return false;
    }

    public final void a(final String r2, final boolean r3, OnFatFileProgressListener r4) {
        if (g() == false) goto L7;
        if (r4 == null) goto L9;
        r4.onStop(4352);
        return;
    L9:
        return;
    L7:
        this.e = r4;
        this.l.submit(new cf2(this, r2, r3));
    }

    public final /* synthetic */ void a(String r3, boolean r4) {
        byte[] r0 = WatchFileUtil.readFileData(r3);
        if (r0 != null) goto L5;
    L15:
        a(4);
        return;
    L5:
        if (r0.length == 0) goto L15;
        if (r4 == false) goto L9;
    L13:
        b(r3);
        return;
    L9:
        if (a(r3, r0) == true) goto L13;
        a(16896);
    }

    public final void a(final float r3) {
        this.m.post(new gf2(this, r3));
    }

    public final void a(final int r3) {
        this.m.post(new ef2(this, r3));
    }

    public final boolean a(NetworkInfo r4) {
        JL_Log.d(this.TAG, "checkNetworkOTAState", "networkInfo = " + r4);
        if (r4 != null) goto L5;
        return false;
    L5:
        if (r4.isMandatoryOTA() == false) goto L10;
        this.mWatchCallbackManager.onNetworkModuleException(getConnectedDevice(), r4);
        return true;
    L10:
        return false;
    }

    public final void a(final BluetoothDevice r4) {
        SettingFunctionImpl.instance(this.mRcspOp).settingFunction(r4, new PublicSettingsCmd.Param(new DialExpandInfo()), new AnonymousClass11(this, r4));
    }
}
