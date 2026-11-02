package com.jieli.jl_rcsp.watch;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspEventListener;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.external_flash.ExternalFlashIOCtrlCmd;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashIOCtrlResponse;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.watch.fatfs.FatFsWatch;
import com.jieli.jl_rcsp.watch.rcsp.RcspWatch;

/* JADX INFO: loaded from: classes17.dex */
public class WatchProgressHandler implements OnFatFileProgressListener {
    public static final int OP_CREATE_FILE = 1;
    public static final int OP_DELETE_FILE = 2;
    public static final int OP_REPLACE_FILE = 3;
    public static final int OP_RESTORE_SYS = 4;

    /* JADX INFO: renamed from: i */
    public static final String f38396i = "WatchProgressHandler";

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f38397a;

    /* JADX INFO: renamed from: b */
    public final IWatchManager f38398b;

    /* JADX INFO: renamed from: c */
    public final int f38399c;

    /* JADX INFO: renamed from: d */
    public final OnFatFileProgressListener f38400d;

    /* JADX INFO: renamed from: e */
    public final Handler f38401e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public int f38402f = -1;

    /* JADX INFO: renamed from: g */
    public final CustomRcspActionCallback<Boolean, ExternalFlashIOCtrlCmd> f38403g = new CustomRcspActionCallback<>("handleStopEvent", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.WatchProgressHandler.3
        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
        public void onFailed(BaseError baseError) {
            WatchProgressHandler.this.m27912a(baseError.getSubCode());
        }

        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
        public void onSuccess(Boolean bool) {
            if (!(WatchProgressHandler.this.f38398b instanceof RcspWatch) || WatchProgressHandler.this.f38399c != 1) {
                WatchProgressHandler.this.f38398b.jumpToUpdateResource(true, WatchProgressHandler.this.f38404h);
            } else {
                WatchProgressHandler watchProgressHandler = WatchProgressHandler.this;
                watchProgressHandler.m27912a(watchProgressHandler.f38402f);
            }
        }
    }, new IHandleResult<Boolean, ExternalFlashIOCtrlCmd>() { // from class: com.jieli.jl_rcsp.watch.WatchProgressHandler.4
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
    });

    /* JADX INFO: renamed from: h */
    public final OnWatchOpCallback<Boolean> f38404h = new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.WatchProgressHandler.5
        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
        public void onFailed(BaseError baseError) {
            WatchProgressHandler.this.m27912a(baseError.getSubCode());
        }

        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
        public void onSuccess(Boolean bool) {
            WatchProgressHandler watchProgressHandler = WatchProgressHandler.this;
            watchProgressHandler.m27912a(watchProgressHandler.f38402f);
        }
    };

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.watch.WatchProgressHandler$2 */
    public class C133582 implements OnOperationCallback<ExternalFlashMsgResponse> {
        public C133582() {
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void m27916a(int i) {
            WatchProgressHandler watchProgressHandler = WatchProgressHandler.this;
            watchProgressHandler.m27912a(watchProgressHandler.f38402f);
            WatchProgressHandler.this.f38398b.getCallback().onWatchSystemException(WatchProgressHandler.this.f38397a.getTargetDevice(), i);
        }

        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
        public void onFailed(BaseError baseError) {
            JL_Log.m27887w(WatchProgressHandler.f38396i, "handleWatchSysException", "onFailed = " + baseError);
            WatchProgressHandler watchProgressHandler = WatchProgressHandler.this;
            watchProgressHandler.m27912a(watchProgressHandler.f38402f);
        }

        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
        public void onSuccess(ExternalFlashMsgResponse externalFlashMsgResponse) {
            final int sysStatus = externalFlashMsgResponse.getSysStatus();
            JL_Log.m27887w(WatchProgressHandler.f38396i, "handleWatchSysException", "SysStatus = " + sysStatus);
            if (sysStatus == 0) {
                WatchProgressHandler.this.m27914b();
                return;
            }
            if (WatchProgressHandler.this.f38398b instanceof FatFsWatch) {
                ((FatFsWatch) WatchProgressHandler.this.f38398b).destroyFatFileSystem();
            }
            WatchProgressHandler.this.f38401e.postDelayed(new Runnable() { // from class: com.jieli.jl_rcsp.watch.OXO1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38374IO.m27916a(sysStatus);
                }
            }, 1000L);
        }
    }

    public WatchProgressHandler(IWatchManager iWatchManager, int i, OnFatFileProgressListener onFatFileProgressListener) {
        this.f38398b = iWatchManager;
        this.f38397a = (RcspOpImpl) iWatchManager.getRcspOp();
        this.f38399c = i;
        this.f38400d = onFatFileProgressListener;
    }

    @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
    public void onProgress(float f) {
        OnFatFileProgressListener onFatFileProgressListener = this.f38400d;
        if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onProgress(f);
        }
    }

    @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
    public void onStart(String str) {
        OnFatFileProgressListener onFatFileProgressListener = this.f38400d;
        if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStart(str);
        }
    }

    @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
    public void onStop(int i) {
        this.f38402f = i;
        if (i != 0 && this.f38398b.isSysException()) {
            m27913a(i, this.f38398b.isSysException());
        } else if (this.f38398b instanceof RcspWatch) {
            m27912a(this.f38402f);
        } else {
            m27914b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27914b() {
        int i = this.f38399c;
        if (i == 1) {
            RcspOpImpl rcspOpImpl = this.f38397a;
            rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildExternalFlashInsertNewFileEndCmd(), this.f38403g);
        } else if (i != 2) {
            this.f38398b.jumpToUpdateResource(true, this.f38404h);
        } else {
            RcspOpImpl rcspOpImpl2 = this.f38397a;
            rcspOpImpl2.sendRcspCommand(rcspOpImpl2.getTargetDevice(), CommandBuilder.buildExternalFlashDeleteFileEndCmd(), this.f38403g);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27915c() {
        JL_Log.m27877d(f38396i, "handleWatchSysException", "query system status by device.");
        WatchBase.queryExtFlashMsgForDevice(this.f38397a, new C133582());
    }

    /* JADX INFO: renamed from: a */
    public final void m27912a(int i) {
        int iFatfsToWatchErr = WatchError.fatfsToWatchErr(i);
        JL_Log.m27887w(f38396i, "callbackOpStop", RcspUtil.formatString("result : %d(0x%X), code = %d(0x%X)", Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(iFatfsToWatchErr), Integer.valueOf(iFatfsToWatchErr)));
        OnFatFileProgressListener onFatFileProgressListener = this.f38400d;
        if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStop(iFatfsToWatchErr);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27913a(int i, boolean z) {
        String str = f38396i;
        JL_Log.m27883i(str, "handleStopEventBySysException", "result = " + i + ", isSysException : " + z);
        DeviceInfo deviceInfo = this.f38397a.getDeviceInfo();
        if (this.f38399c != 4 && z && deviceInfo != null) {
            JL_Log.m27877d(str, "handleStopEventBySysException", "Obtain the current phone Status : " + deviceInfo.getPhoneStatus());
            if (deviceInfo.getPhoneStatus() == 1) {
                JL_Log.m27877d(str, "handleStopEventBySysException", "add OnRcspEventListener, waiting for phone status.");
                this.f38397a.registerOnRcspEventListener(new OnRcspEventListener() { // from class: com.jieli.jl_rcsp.watch.WatchProgressHandler.1
                    @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspEventListener
                    public void onPhoneCallStatusChange(BluetoothDevice bluetoothDevice, int i2) {
                        JL_Log.m27883i(WatchProgressHandler.f38396i, "handleStopEventBySysException", "onPhoneCallStatusChange : " + i2);
                        if (i2 == 0) {
                            WatchProgressHandler.this.f38397a.unregisterOnRcspEventListener(this);
                            WatchProgressHandler.this.m27915c();
                        }
                    }
                });
                return;
            } else {
                m27915c();
                return;
            }
        }
        m27912a(i);
    }
}
