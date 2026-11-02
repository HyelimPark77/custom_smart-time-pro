package com.jieli.jl_rcsp.watch.rcsp;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.gson.GsonBuilder;
import com.ironsource.C12616d4;
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
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.NetworkOpImpl;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.impl.SettingFunctionImpl;
import com.jieli.jl_rcsp.impl.WatchOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.WatchConfigure;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CmdError;
import com.jieli.jl_rcsp.model.command.external_flash.ExternalFlashIOCtrlCmd;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.settings.p201v0.DialExpandInfo;
import com.jieli.jl_rcsp.model.device.settings.p201v0.NetworkInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashIOCtrlResponse;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.task.GetFileByClusterTask;
import com.jieli.jl_rcsp.task.GetFileTask;
import com.jieli.jl_rcsp.task.ITask;
import com.jieli.jl_rcsp.task.TaskListener;
import com.jieli.jl_rcsp.task.TransferTask;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
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
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class RcspWatch extends WatchBase implements IWatchManager, TaskListener {

    /* JADX INFO: renamed from: o */
    public static final int f38455o = 4114;

    /* JADX INFO: renamed from: e */
    public OnFatFileProgressListener f38456e;

    /* JADX INFO: renamed from: f */
    public OnWatchOpCallback<byte[]> f38457f;

    /* JADX INFO: renamed from: g */
    public PackResFormat f38458g;

    /* JADX INFO: renamed from: h */
    public ITask f38459h;

    /* JADX INFO: renamed from: i */
    public UpdateResourceTask f38460i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f38461j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f38462k;

    /* JADX INFO: renamed from: l */
    public ExecutorService f38463l;

    /* JADX INFO: renamed from: m */
    public final Handler f38464m;

    /* JADX INFO: renamed from: n */
    public final FileObserver f38465n;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.watch.rcsp.RcspWatch$1 */
    public class C133771 implements OnWatchOpCallback<ArrayList<FatFile>> {

        /* JADX INFO: renamed from: a */
        public int f38466a;

        public C133771() {
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void m28034a() {
            RcspWatch.this.listWatchList(this);
        }

        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
        public void onFailed(BaseError baseError) {
            int i;
            if (baseError.getSubCode() == 16385 && (i = this.f38466a) < 2) {
                this.f38466a = i + 1;
                RcspWatch.this.f38464m.postDelayed(new Runnable() { // from class: com.jieli.jl_rcsp.watch.rcsp.OXO1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38454IO.m28034a();
                    }
                }, 500L);
                return;
            }
            JL_Log.m27880e(((WatchBase) RcspWatch.this).TAG, "MSG_INIT_WATCH#listWatchList", "onFailed ---> " + baseError);
            this.f38466a = 0;
            RcspWatch.this.m28023b(baseError.getSubCode());
        }

        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
        public void onSuccess(ArrayList<FatFile> arrayList) {
            JL_Log.m27883i(((WatchBase) RcspWatch.this).TAG, "MSG_INIT_WATCH#listWatchList", "onSuccess :: " + arrayList);
            this.f38466a = 0;
            BluetoothDevice connectedDevice = RcspWatch.this.getConnectedDevice();
            WatchConfigure watchConfigure = RcspWatch.this.getWatchConfigure(connectedDevice);
            JL_Log.m27877d(((WatchBase) RcspWatch.this).TAG, "MSG_INIT_WATCH", "" + watchConfigure);
            if (watchConfigure != null && watchConfigure.getFunctionOption().isSupportDialExpandInfo()) {
                RcspWatch.this.m28015a(connectedDevice);
            }
            RcspWatch.this.m28023b(0);
            if (watchConfigure != null && watchConfigure.getFunctionOption().isSupportNetworkModule()) {
                RcspWatch rcspWatch = RcspWatch.this;
                if (rcspWatch.m28020a(((WatchBase) rcspWatch).mRcspOp.getDeviceInfo().getNetworkInfo())) {
                    JL_Log.m27887w(((WatchBase) RcspWatch.this).TAG, "MSG_INIT_WATCH", "Network Module has exception. ");
                    return;
                }
            }
            JL_Log.m27887w(((WatchBase) RcspWatch.this).TAG, "MSG_INIT_WATCH", "isOTAResource = " + ((WatchBase) RcspWatch.this).isOTAResource);
            if (((WatchBase) RcspWatch.this).isOTAResource) {
                ((WatchBase) RcspWatch.this).mWatchCallbackManager.onResourceUpdateUnfinished(connectedDevice);
            }
        }
    }

    public class ListDirObserver implements FileObserver {

        /* JADX INFO: renamed from: a */
        public final OnWatchOpCallback<ArrayList<FatFile>> f38488a;

        public /* synthetic */ ListDirObserver(RcspWatch rcspWatch, OnWatchOpCallback onWatchOpCallback, C133771 c133771) {
            this(onWatchOpCallback);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean z) {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int i) {
            OnWatchOpCallback<ArrayList<FatFile>> onWatchOpCallback = this.f38488a;
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onFailed(RcspErrorCode.buildJsonError(13, 12293, i, null));
            }
            FileBrowseManager.getInstance().removeFileObserver(this);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean z) {
            if (z) {
                RcspWatch.this.listWatchList(this.f38488a);
            } else {
                FileBrowseManager.getInstance().loadMore(RcspWatch.this.m28029e());
            }
            if (z) {
                FileBrowseManager.getInstance().removeFileObserver(this);
            }
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> list) {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> list) {
        }

        public ListDirObserver(OnWatchOpCallback<ArrayList<FatFile>> onWatchOpCallback) {
            this.f38488a = onWatchOpCallback;
        }
    }

    public RcspWatch(RcspOpImpl rcspOpImpl, WatchCallbackManager watchCallbackManager) {
        super(rcspOpImpl, watchCallbackManager);
        this.f38463l = Executors.newSingleThreadExecutor();
        this.f38464m = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.ff2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6627IO.m28019a(message);
            }
        });
        this.f38465n = new FileObserver() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.9
            @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
            public void OnFlayCallback(boolean z) {
            }

            @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
            public void onFileReadFailed(int i) {
            }

            @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
            public void onFileReadStart() {
            }

            @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
            public void onFileReadStop(boolean z) {
            }

            @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
            public void onFileReceiver(List<FileStruct> list) {
            }

            @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
            public void onSdCardStatusChange(List<SDCardBean> list) {
                RcspWatch.this.m28033i();
            }
        };
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean cancelTransfer() {
        return m28028d();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void createWatchFile(String str, boolean z, OnFatFileProgressListener onFatFileProgressListener) {
        if (m28029e() == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(16384);
                return;
            }
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(5);
                return;
            }
            return;
        }
        String fatFilePath = FatUtil.getFatFilePath(str);
        JL_Log.m27877d(this.TAG, "createWatchFile", "fatFilePath : " + fatFilePath + ", OnFatFileProgressListener = " + onFatFileProgressListener);
        m28018a(str, z, new WatchProgressHandler(this, 1, onFatFileProgressListener));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void deleteWatchFile(String str, final OnFatFileProgressListener onFatFileProgressListener) {
        final SDCardBean sDCardBeanM28029e = m28029e();
        if (sDCardBeanM28029e == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(16384);
                return;
            }
            return;
        }
        final FileStruct fileStructM28011a = m28011a(str);
        if (fileStructM28011a == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(4);
                return;
            }
            return;
        }
        if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStart(fileStructM28011a.getName());
            onFatFileProgressListener.onProgress(0.0f);
        }
        deleteFileStart("/" + fileStructM28011a.getName(), new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.6
            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onFailed(BaseError baseError) {
                OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                if (onFatFileProgressListener2 != null) {
                    onFatFileProgressListener2.onStop(baseError.getSubCode());
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onSuccess(Boolean bool) {
                RcspWatch.this.m28016a(sDCardBeanM28029e, fileStructM28011a, onFatFileProgressListener);
            }
        });
    }

    @Override // com.jieli.jl_rcsp.watch.WatchBase, com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void destroy() {
        super.destroy();
        this.f38461j = false;
        m28028d();
        this.f38464m.removeCallbacksAndMessages(null);
        if (!this.f38463l.isShutdown()) {
            this.f38463l.shutdownNow();
        }
        UpdateResourceTask updateResourceTask = this.f38460i;
        if (updateResourceTask != null) {
            updateResourceTask.stopThread();
        }
        FileBrowseManager.getInstance().removeFileObserver(this.f38465n);
        PackResFormat packResFormat = this.f38458g;
        if (packResFormat != null) {
            packResFormat.destroy();
            this.f38458g = null;
        }
        this.f38459h = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m28030f() {
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public String getCurrentBrowsePath() {
        Folder currentReadFile;
        SDCardBean sDCardBeanM28029e = m28029e();
        if (sDCardBeanM28029e == null || (currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBeanM28029e)) == null) {
            return null;
        }
        return currentReadFile.getPathString();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public FatFile getWatchFileByPath(String str) {
        FileStruct fileStructM28011a = m28011a(str);
        if (fileStructM28011a == null) {
            return null;
        }
        return FatFile.create(fileStructM28011a);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchFileSize(String str, OnWatchOpCallback<WatchFileContent> onWatchOpCallback) {
        if (str != null) {
            RcspOpImpl rcspOpImpl = this.mRcspOp;
            rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildExternalFlashGetFileMsgCmd(str), 5000, new WatchBase.HandleRcspCallback("getWatchFileSize", onWatchOpCallback, new IHandleResult<WatchFileContent, ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.8
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public WatchFileContent handleResult(BluetoothDevice bluetoothDevice, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                    if (externalFlashIOCtrlCmd.getResponse() == 0) {
                        return null;
                    }
                    return new WatchFileContent(((ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse()).getSize(), ((ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse()).getCrc16());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public int hasResult(BluetoothDevice bluetoothDevice, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                    if (externalFlashIOCtrlCmd == null) {
                        return 1;
                    }
                    if (externalFlashIOCtrlCmd.getStatus() != 0) {
                        return externalFlashIOCtrlCmd.getStatus();
                    }
                    if (externalFlashIOCtrlCmd.getResponse() == 0) {
                        return 1;
                    }
                    return ((ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse()).getResult();
                }
            }));
        } else if (onWatchOpCallback != null) {
            onWatchOpCallback.onFailed(new BaseError(19, FatUtil.getFatFsErrorCodeMsg(19)));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchSysLeftSize(OnWatchOpCallback<Long> onWatchOpCallback) {
        RcspOpImpl rcspOpImpl = this.mRcspOp;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildExternalFlashGetLeftSpaceCmd(), new WatchBase.HandleRcspCallback("getWatchSysLeftSize", onWatchOpCallback, new IHandleResult<Long, ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public Long handleResult(BluetoothDevice bluetoothDevice, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                if (externalFlashIOCtrlCmd.getResponse() == 0) {
                    return 0L;
                }
                return Long.valueOf(((long) ((ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse()).getSize()) * 1024);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
            public int hasResult(BluetoothDevice bluetoothDevice, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                if (externalFlashIOCtrlCmd == null) {
                    return 1;
                }
                if (externalFlashIOCtrlCmd.getStatus() != 0) {
                    return externalFlashIOCtrlCmd.getStatus();
                }
                if (externalFlashIOCtrlCmd.getResponse() == 0) {
                    return 1;
                }
                return ((ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse()).getResult();
            }
        }));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void init() {
        this.f38461j = false;
        this.f38462k = false;
        FileBrowseManager.getInstance().addFileObserver(this.f38465n);
        this.f38458g = new PackResFormat();
        if (this.f38463l.isShutdown()) {
            this.f38463l = Executors.newSingleThreadExecutor();
        }
        BluetoothDevice connectedDevice = getConnectedDevice();
        DeviceInfo deviceInfo = this.mRcspOp.getDeviceInfo(connectedDevice);
        JL_Log.m27887w(this.TAG, C12616d4.a.f34169f, "" + deviceInfo);
        if (deviceInfo == null) {
            m28023b(8192);
            return;
        }
        ExternalFlashMsgResponse externalFlashMsg = getExternalFlashMsg(connectedDevice);
        if (externalFlashMsg != null) {
            setSysException(externalFlashMsg.getSysStatus() != 0);
            JL_Log.m27887w(this.TAG, C12616d4.a.f34169f, "isSysException = " + this.isSysException);
            if (this.isSysException) {
                m28023b(externalFlashMsg.getSysStatus());
                return;
            }
        }
        setOTAResource(deviceInfo.getExpandMode() == 1);
        if (!deviceInfo.isSupportDevConfigure()) {
            m28033i();
        } else {
            this.f38462k = true;
            requestDeviceConfigure(new OnWatchOpCallback<WatchConfigure>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.2
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    JL_Log.m27887w(((WatchBase) RcspWatch.this).TAG, "init#requestDeviceConfigure", "onFailed ---> " + baseError);
                    RcspWatch.this.f38462k = false;
                    RcspWatch.this.m28033i();
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(WatchConfigure watchConfigure) {
                    RcspWatch.this.f38462k = false;
                    JL_Log.m27877d(((WatchBase) RcspWatch.this).TAG, "init#requestDeviceConfigure", "" + watchConfigure);
                    if (watchConfigure == null || !watchConfigure.getFunctionOption().isSupportNetworkModule()) {
                        RcspWatch.this.m28033i();
                    } else {
                        NetworkOpImpl.instance(((WatchBase) RcspWatch.this).mRcspOp).queryNetworkInfo(RcspWatch.this.getConnectedDevice(), new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.2.1
                            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                            public void onFailed(BaseError baseError) {
                                JL_Log.m27887w(((WatchBase) RcspWatch.this).TAG, "init#queryNetworkInfo", "onFailed ---> " + baseError);
                                RcspWatch.this.m28033i();
                            }

                            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                            public void onSuccess(Boolean bool) {
                                NetworkInfo networkInfo = ((WatchBase) RcspWatch.this).mStatusManager.getDeviceInfo(RcspWatch.this.getConnectedDevice()).getNetworkInfo();
                                JL_Log.m27877d(((WatchBase) RcspWatch.this).TAG, "init#queryNetworkInfo", networkInfo + ", isInit = " + RcspWatch.this.f38461j);
                                if (RcspWatch.this.f38461j) {
                                    RcspWatch.this.m28020a(networkInfo);
                                } else {
                                    RcspWatch.this.m28033i();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public boolean isInit() {
        ExternalFlashMsgResponse externalFlashMsg;
        return getConnectedDevice() != null && (externalFlashMsg = getExternalFlashMsg(getConnectedDevice())) != null && externalFlashMsg.getSysStatus() == 0 && this.f38461j;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void listWatchList(OnWatchOpCallback<ArrayList<FatFile>> onWatchOpCallback) {
        SDCardBean sDCardBeanM28029e = m28029e();
        JL_Log.m27877d(this.TAG, "listWatchList", "flash = " + sDCardBeanM28029e);
        if (sDCardBeanM28029e == null) {
            onCallbackError(onWatchOpCallback, 16384);
            return;
        }
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBeanM28029e);
        JL_Log.m27877d(this.TAG, "listWatchList", "folder = " + currentReadFile);
        if (currentReadFile == null) {
            onCallbackError(onWatchOpCallback, 16387);
            return;
        }
        boolean zIsReading = FileBrowseManager.getInstance().isReading();
        JL_Log.m27877d(this.TAG, "listWatchList", "isReading = " + zIsReading);
        if (zIsReading) {
            onCallbackError(onWatchOpCallback, 16385);
            return;
        }
        List<FileStruct> childFileStructs = currentReadFile.getChildFileStructs();
        if (!currentReadFile.isLoadFinished(false)) {
            FileBrowseManager.getInstance().addFileObserver(new ListDirObserver(this, onWatchOpCallback, null));
            FileBrowseManager.getInstance().loadMore(sDCardBeanM28029e);
            JL_Log.m27877d(this.TAG, "listWatchList", "loadMore >>>> ");
            return;
        }
        ArrayList<FatFile> arrayList = new ArrayList<>();
        for (FileStruct fileStruct : childFileStructs) {
            if (!FatFileSystem.isIgnoreFile(fileStruct.getName())) {
                arrayList.add(FatFile.create(fileStruct));
            }
        }
        JL_Log.m27877d(this.TAG, "listWatchList", "callback ----> " + arrayList.size());
        if (onWatchOpCallback != null) {
            onWatchOpCallback.onSuccess(arrayList);
        }
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onBegin() {
        m28025c();
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onCancel(int i) {
        JL_Log.m27887w(this.TAG, "Transfer", "onCancel ==== >>> reason = " + i);
        m28014a(4098);
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onError(int i, String str) {
        CmdError cmdError;
        JL_Log.m27880e(this.TAG, "Transfer", "onError ==== >>> code = " + i + ", message = " + str);
        if (i == 12293 && (cmdError = CmdError.parseCmdError(str)) != null && (cmdError.getCmdId() == 27 || cmdError.getCmdId() == 28)) {
            int subCode = cmdError.getSubCode();
            if (subCode == 3) {
                i = 12544;
            } else if (subCode == 4) {
                i = 20;
            }
        }
        m28014a(i);
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onFinish() {
        JL_Log.m27883i(this.TAG, "Transfer", "onFinish ==== >>> ");
        m28014a(0);
    }

    @Override // com.jieli.jl_rcsp.task.TaskListener
    public void onProgress(int i) {
        m28013a(i);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void openWatchFile(String str, OnWatchOpCallback<byte[]> onWatchOpCallback) {
        if (m28029e() == null) {
            onCallbackError(onWatchOpCallback, 16384);
            return;
        }
        FileStruct fileStructM28011a = m28011a(str);
        if (fileStructM28011a != null) {
            this.f38457f = onWatchOpCallback;
            m28027d(fileStructM28011a.getCluster());
        } else if (onWatchOpCallback != null) {
            onWatchOpCallback.onFailed(new BaseError(4, FatUtil.getFatFsErrorCodeMsg(4)));
        }
    }

    public void reLoadFolder(OnWatchOpCallback<ArrayList<FatFile>> onWatchOpCallback) {
        SDCardBean sDCardBeanM28029e = m28029e();
        if (sDCardBeanM28029e != null) {
            FileBrowseManager.getInstance().cleanCache(sDCardBeanM28029e);
        }
        listWatchList(onWatchOpCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void replaceWatchFile(String str, OnFatFileProgressListener onFatFileProgressListener) {
        if (m28029e() == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(16384);
            }
        } else if (WatchFileUtil.isFileExist(str)) {
            createWatchFile(str, true, onFatFileProgressListener);
        } else if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStop(5);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void restoreWatchSystem(OnFatFileProgressListener onFatFileProgressListener) {
        if (m28029e() == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(16384);
            }
        } else {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStart("/");
                onFatFileProgressListener.onProgress(0.0f);
            }
            final WatchProgressHandler watchProgressHandler = new WatchProgressHandler(this, 4, onFatFileProgressListener);
            this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashRestoreSystemCmd(), 5000, new CustomRcspActionCallback("restoreWatchSystem", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.3
                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onFailed(BaseError baseError) {
                    watchProgressHandler.onStop(baseError.getSubCode());
                }

                @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                public void onSuccess(Boolean bool) {
                    watchProgressHandler.onProgress(100.0f);
                    watchProgressHandler.onStop(0);
                }
            }, new IHandleResult<Boolean, ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.4
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public Boolean handleResult(BluetoothDevice bluetoothDevice, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                    return Boolean.TRUE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
                public int hasResult(BluetoothDevice bluetoothDevice, ExternalFlashIOCtrlCmd externalFlashIOCtrlCmd) {
                    ExternalFlashIOCtrlResponse externalFlashIOCtrlResponse;
                    if (externalFlashIOCtrlCmd == null || (externalFlashIOCtrlResponse = (ExternalFlashIOCtrlResponse) externalFlashIOCtrlCmd.getResponse()) == null) {
                        return -1;
                    }
                    return externalFlashIOCtrlResponse.getResult();
                }
            }));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void updateWatchResource(final String str, final OnUpdateResourceCallback onUpdateResourceCallback) {
        if (m28029e() != null) {
            listWatchList(new OnWatchOpCallback<ArrayList<FatFile>>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.5
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    OnUpdateResourceCallback onUpdateResourceCallback2 = onUpdateResourceCallback;
                    if (onUpdateResourceCallback2 != null) {
                        onUpdateResourceCallback2.onError(baseError.getSubCode(), WatchError.getErrorDesc(baseError.getSubCode()));
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(ArrayList<FatFile> arrayList) {
                    if (RcspWatch.this.f38460i == null) {
                        RcspWatch.this.f38460i = new UpdateResourceTask(RcspWatch.this, str, onUpdateResourceCallback, new ThreadStateListener() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.5.1
                            @Override // com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener
                            public void onFinish(long j) {
                                if (RcspWatch.this.f38460i == null || RcspWatch.this.f38460i.getId() != j) {
                                    return;
                                }
                                RcspWatch.this.f38460i = null;
                            }

                            @Override // com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener
                            public void onStart(long j) {
                            }
                        });
                        RcspWatch.this.f38460i.start();
                    }
                }
            });
        } else if (onUpdateResourceCallback != null) {
            onUpdateResourceCallback.onError(16384, WatchError.getErrorDesc(16384));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m28024b(String str) {
        if (m28029e() == null) {
            m28014a(16384);
            return;
        }
        ITask iTask = this.f38459h;
        if (iTask == null || !iTask.isRun()) {
            TransferTask.Param param = new TransferTask.Param();
            param.devHandler = m28029e().getDevHandler();
            param.useFlash = true;
            this.f38459h = new TransferTask(this.mRcspOp, str, param);
        } else if (this.f38459h.isRun()) {
            m28014a(4352);
            return;
        }
        this.f38459h.setListener(this);
        ((TransferTask) this.f38459h).setPath(str);
        this.f38459h.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m28025c() {
        this.f38464m.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.df2
            @Override // java.lang.Runnable
            public final void run() {
                this.f6176IO.m28032h();
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m28027d(int i) {
        if (m28029e() == null) {
            m28014a(16384);
            return;
        }
        ITask iTask = this.f38459h;
        if (iTask == null || !iTask.isRun()) {
            this.f38459h = new GetFileByClusterTask(this.mRcspOp, new GetFileByClusterTask.Param(m28029e().getDevHandler(), 0, i, GetFileTask.BYTE_ARRAY_STREAM));
        } else if (this.f38459h.isRun()) {
            m28014a(4352);
            return;
        }
        this.f38459h.setListener(this);
        this.f38459h.start();
    }

    /* JADX INFO: renamed from: e */
    public final SDCardBean m28029e() {
        return m28012a(FileBrowseManager.getInstance().getOnlineDev());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28031g() {
        ITask iTask = this.f38459h;
        return iTask != null && iTask.isRun();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m28032h() {
        if (this.f38456e != null) {
            ITask iTask = this.f38459h;
            this.f38456e.onStart((iTask == null || !(iTask instanceof TransferTask)) ? null : ((TransferTask) iTask).getPath());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m28033i() {
        if (this.f38461j || this.f38462k) {
            return;
        }
        SDCardBean sDCardBeanM28029e = m28029e();
        this.f38464m.removeMessages(4114);
        if (sDCardBeanM28029e == null || !sDCardBeanM28029e.isOnline()) {
            this.f38464m.sendEmptyMessageDelayed(4114, 3000L);
        } else {
            this.f38464m.sendEmptyMessage(4114);
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m28026c(int i) {
        OnWatchOpCallback<byte[]> onWatchOpCallback;
        JL_Log.m27883i(this.TAG, "callbackStop", "result = " + i);
        OnFatFileProgressListener onFatFileProgressListener = this.f38456e;
        if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStop(i);
            this.f38456e = null;
        }
        ITask iTask = this.f38459h;
        if (!(iTask instanceof GetFileByClusterTask) || (onWatchOpCallback = this.f38457f) == null) {
            return;
        }
        if (i == 0) {
            this.f38457f.onSuccess(((GetFileByClusterTask) iTask).getCacheData());
        } else {
            onWatchOpCallback.onFailed(new BaseError(i, WatchError.getErrorDesc(i)));
        }
        this.f38457f = null;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean m28019a(Message message) {
        if (message.what != 4114) {
            return true;
        }
        if (this.f38461j) {
            return false;
        }
        SDCardBean sDCardBeanM28029e = m28029e();
        JL_Log.m27887w(this.TAG, "MSG_INIT_WATCH", "flash = " + sDCardBeanM28029e);
        if (sDCardBeanM28029e != null && sDCardBeanM28029e.isOnline()) {
            listWatchList(new C133771());
            return true;
        }
        m28023b(16384);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28028d() {
        ITask iTask = this.f38459h;
        if (iTask == null || !iTask.isRun()) {
            return false;
        }
        this.f38459h.cancel((byte) 0);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m28023b(int i) {
        this.f38461j = i == 0;
        JL_Log.m27883i(this.TAG, "callbackWatchSystemInit", "code : " + i + ", isInit = " + this.f38461j);
        this.mWatchCallbackManager.onWatchSystemInit(i);
    }

    /* JADX INFO: renamed from: a */
    public final SDCardBean m28012a(List<SDCardBean> list) {
        int[] iArr = WatchOpImpl.WATCH_STORAGE_INDEX_LIST;
        if (iArr == null) {
            return null;
        }
        for (SDCardBean sDCardBean : list) {
            for (int i : iArr) {
                if (sDCardBean.getIndex() == i) {
                    return sDCardBean;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m28022b(float f) {
        OnFatFileProgressListener onFatFileProgressListener = this.f38456e;
        if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onProgress(f);
        }
    }

    /* JADX INFO: renamed from: a */
    public final FileStruct m28011a(String str) {
        String fileName = WatchFileUtil.getFileName(str);
        if (fileName == null) {
            JL_Log.m27887w(this.TAG, "getFileStructByFlashPath", "fileName is null.");
            return null;
        }
        SDCardBean sDCardBeanM28029e = m28029e();
        if (sDCardBeanM28029e == null) {
            JL_Log.m27887w(this.TAG, "getFileStructByFlashPath", "flash is null.");
            return null;
        }
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBeanM28029e);
        if (currentReadFile == null) {
            JL_Log.m27887w(this.TAG, "getFileStructByFlashPath", "folder is null.");
            return null;
        }
        List<FileStruct> childFileStructs = currentReadFile.getChildFileStructs();
        for (FileStruct fileStruct : childFileStructs) {
            if (fileName.equalsIgnoreCase(fileStruct.getName())) {
                return fileStruct;
            }
        }
        JL_Log.m27887w(this.TAG, "getFileStructByFlashPath", "not found file info. file size = " + childFileStructs.size() + ", path = " + str);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m28016a(SDCardBean sDCardBean, FileStruct fileStruct, final OnFatFileProgressListener onFatFileProgressListener) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fileStruct);
        int iDeleteFile = FileBrowseManager.getInstance().deleteFile(sDCardBean, arrayList, new DeleteCallback() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.10
            @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
            public void onError(int i, FileStruct fileStruct2) {
                JL_Log.m27887w(((WatchBase) RcspWatch.this).TAG, "deleteFlashFile", "onError :: code = " + i + ", " + fileStruct2);
                OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                if (onFatFileProgressListener2 != null) {
                    onFatFileProgressListener2.onStop(i);
                }
            }

            @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
            public void onFinish() {
            }

            @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
            public void onSuccess(FileStruct fileStruct2) {
                JL_Log.m27883i(((WatchBase) RcspWatch.this).TAG, "deleteFlashFile", "onSuccess :: " + fileStruct2);
                OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                if (onFatFileProgressListener2 != null) {
                    onFatFileProgressListener2.onProgress(100.0f);
                    onFatFileProgressListener.onStop(0);
                }
            }
        });
        JL_Log.m27887w(this.TAG, "deleteFlashFile", "delResult = " + iDeleteFile);
        if (iDeleteFile == 0 || onFatFileProgressListener == null) {
            return;
        }
        onFatFileProgressListener.onStop(iDeleteFile);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28021a(String str, byte[] bArr) {
        String jsonFileName = WatchFileUtil.getJsonFileName(str);
        PackResFormat packResFormat = this.f38458g;
        if (packResFormat != null && jsonFileName != null && bArr != null && bArr.length != 0) {
            byte[] fileData = packResFormat.getFileData(bArr, jsonFileName);
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("data = ");
            sb.append(CHexConver.byte2HexStr(fileData));
            sb.append(", text = ");
            sb.append(fileData == null ? "" : new String(fileData));
            JL_Log.m27877d(str2, "isMatchVersion", sb.toString());
            if (fileData == null) {
                return false;
            }
            try {
                FileExtMsg fileExtMsg = (FileExtMsg) new GsonBuilder().create().fromJson(new String(fileData).trim(), FileExtMsg.class);
                JL_Log.m27877d(this.TAG, "isMatchVersion", "fileExtMsg = " + fileExtMsg);
                if (fileExtMsg == null) {
                    return false;
                }
                String[] matchVersions = getExternalFlashMsg(this.mRcspOp.getTargetDevice()) != null ? getExternalFlashMsg(this.mRcspOp.getTargetDevice()).getMatchVersions() : null;
                String str3 = this.TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("matchVersions = ");
                sb2.append(matchVersions == null ? "null" : Arrays.toString(matchVersions));
                JL_Log.m27877d(str3, "isMatchVersion", sb2.toString());
                if (matchVersions == null || matchVersions.length <= 0) {
                    return true;
                }
                for (String str4 : matchVersions) {
                    JL_Log.m27877d(this.TAG, "isMatchVersion", "version = " + str4);
                    if (str4.equalsIgnoreCase(fileExtMsg.getVersionID())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m28018a(final String str, final boolean z, OnFatFileProgressListener onFatFileProgressListener) {
        if (!m28031g()) {
            this.f38456e = onFatFileProgressListener;
            this.f38463l.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.cf2
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f5969IO.m28017a(str, z);
                }
            });
        } else if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStop(4352);
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m28017a(String str, boolean z) throws Throwable {
        byte[] fileData = WatchFileUtil.readFileData(str);
        if (fileData != null && fileData.length != 0) {
            if (!z && !m28021a(str, fileData)) {
                m28014a(16896);
                return;
            } else {
                m28024b(str);
                return;
            }
        }
        m28014a(4);
    }

    /* JADX INFO: renamed from: a */
    public final void m28013a(final float f) {
        this.f38464m.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.gf2
            @Override // java.lang.Runnable
            public final void run() {
                this.f6868IO.m28022b(f);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m28014a(final int i) {
        this.f38464m.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.ef2
            @Override // java.lang.Runnable
            public final void run() {
                this.f6409IO.m28026c(i);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28020a(NetworkInfo networkInfo) {
        JL_Log.m27877d(this.TAG, "checkNetworkOTAState", "networkInfo = " + networkInfo);
        if (networkInfo == null || !networkInfo.isMandatoryOTA()) {
            return false;
        }
        this.mWatchCallbackManager.onNetworkModuleException(getConnectedDevice(), networkInfo);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m28015a(final BluetoothDevice bluetoothDevice) {
        SettingFunctionImpl.instance(this.mRcspOp).settingFunction(bluetoothDevice, new PublicSettingsCmd.Param(new DialExpandInfo()), new OnOperationCallback<PublicSettingsCmd.Response>() { // from class: com.jieli.jl_rcsp.watch.rcsp.RcspWatch.11
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                JL_Log.m27877d(((WatchBase) RcspWatch.this).TAG, "readDialExpandInfo", "onFailed :: " + baseError);
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(PublicSettingsCmd.Response response) {
                WatchConfigure watchConfigure = RcspWatch.this.getWatchConfigure(bluetoothDevice);
                JL_Log.m27877d(((WatchBase) RcspWatch.this).TAG, "readDialExpandInfo", "onSuccess :: " + response);
                if (watchConfigure == null || !(response.getSettingData() instanceof DialExpandInfo)) {
                    return;
                }
                watchConfigure.setDialExpandInfo((DialExpandInfo) response.getSettingData());
                ((WatchBase) RcspWatch.this).mStatusManager.updateDeviceConfigure(bluetoothDevice, watchConfigure);
            }
        });
    }
}
