package com.jieli.jl_rcsp.watch;

import android.os.Handler;
import android.os.Looper;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.external_flash.ExternalFlashIOCtrlCmd;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
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
    public static final String i = "WatchProgressHandler";
    public final RcspOpImpl a;
    public final IWatchManager b;
    public final int c;
    public final OnFatFileProgressListener d;
    public final Handler e;
    public int f;
    public final CustomRcspActionCallback<Boolean, ExternalFlashIOCtrlCmd> g;
    public final OnWatchOpCallback<Boolean> h;

    /* JADX INFO: renamed from: com.jieli.jl_rcsp.watch.WatchProgressHandler$2, reason: invalid class name */
    public class AnonymousClass2 implements OnOperationCallback<ExternalFlashMsgResponse> {
        public final /* synthetic */ WatchProgressHandler a;

        public AnonymousClass2(WatchProgressHandler r1) {
            this.a = r1;
        }

        public final /* synthetic */ void a(int r3) {
            WatchProgressHandler r0 = this.a;
            WatchProgressHandler.a(r0, WatchProgressHandler.f(r0));
            WatchProgressHandler.d(this.a).getCallback().onWatchSystemException(WatchProgressHandler.a(this.a).getTargetDevice(), r3);
        }

        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
        public void onFailed(BaseError r4) {
            JL_Log.w(WatchProgressHandler.a(), "handleWatchSysException", "onFailed = " + r4);
            WatchProgressHandler r5 = this.a;
            WatchProgressHandler.a(r5, WatchProgressHandler.f(r5));
        }

        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
        public /* bridge */ /* synthetic */ void onSuccess(ExternalFlashMsgResponse r1) {
            onSuccess2(r1);
        }

        /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
        public void onSuccess2(ExternalFlashMsgResponse r5) {
            final int r6 = r5.getSysStatus();
            JL_Log.w(WatchProgressHandler.a(), "handleWatchSysException", "SysStatus = " + r6);
            if (r6 != 0) goto L7;
            WatchProgressHandler.c(this.a);
            return;
        L7:
            if ((WatchProgressHandler.d(this.a) instanceof FatFsWatch) == false) goto L9;
            ((FatFsWatch) WatchProgressHandler.d(this.a)).destroyFatFileSystem();
        L9:
            WatchProgressHandler.e(this.a).postDelayed(new OXO1(this, r6), 1000);
        }
    }

    static {
    }

    public WatchProgressHandler(IWatchManager r5, int r6, OnFatFileProgressListener r7) {
        this.e = new Handler(Looper.getMainLooper());
        this.f = -1;
        this.g = new CustomRcspActionCallback("handleStopEvent", new AnonymousClass3(this), new AnonymousClass4(this));
        this.h = new AnonymousClass5(this);
        this.b = r5;
        this.a = (RcspOpImpl) r5.getRcspOp();
        this.c = r6;
        this.d = r7;
    }

    public static /* synthetic */ String a() {
        return i;
    }

    public static /* synthetic */ void b(WatchProgressHandler r0) {
        r0.c();
    }

    public static /* synthetic */ void c(WatchProgressHandler r0) {
        r0.b();
    }

    public static /* synthetic */ IWatchManager d(WatchProgressHandler r0) {
        return r0.b;
    }

    public static /* synthetic */ Handler e(WatchProgressHandler r0) {
        return r0.e;
    }

    public static /* synthetic */ int f(WatchProgressHandler r0) {
        return r0.f;
    }

    public static /* synthetic */ int g(WatchProgressHandler r0) {
        return r0.c;
    }

    public static /* synthetic */ OnWatchOpCallback h(WatchProgressHandler r0) {
        return r0.h;
    }

    @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
    public void onProgress(float r2) {
        OnFatFileProgressListener r0 = this.d;
        if (r0 == null) goto L6;
        r0.onProgress(r2);
        return;
    }

    @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
    public void onStart(String r2) {
        OnFatFileProgressListener r0 = this.d;
        if (r0 == null) goto L6;
        r0.onStart(r2);
        return;
    }

    @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
    public void onStop(int r2) {
        this.f = r2;
        if (r2 == 0) goto L10;
        if (this.b.isSysException() == false) goto L10;
        a(r2, this.b.isSysException());
        return;
    L10:
        if ((this.b instanceof RcspWatch) == false) goto L13;
        a(this.f);
        return;
    L13:
        b();
    }

    public static /* synthetic */ RcspOpImpl a(WatchProgressHandler r0) {
        return r0.a;
    }

    public final void b() {
        int r0 = this.c;
        if (r0 != 1) goto L5;
        RcspOpImpl r1 = this.a;
        r1.sendRcspCommand(r1.getTargetDevice(), CommandBuilder.buildExternalFlashInsertNewFileEndCmd(), this.g);
        return;
    L5:
        if (r0 == 2) goto L8;
        this.b.jumpToUpdateResource(true, this.h);
        return;
    L8:
        RcspOpImpl r2 = this.a;
        r2.sendRcspCommand(r2.getTargetDevice(), CommandBuilder.buildExternalFlashDeleteFileEndCmd(), this.g);
    }

    public final void c() {
        JL_Log.d(i, "handleWatchSysException", "query system status by device.");
        WatchBase.queryExtFlashMsgForDevice(this.a, new AnonymousClass2(this));
    }

    public static /* synthetic */ void a(WatchProgressHandler r0, int r1) {
        r0.a(r1);
    }

    public final void a(int r6) {
        int r0 = WatchError.fatfsToWatchErr(r6);
        JL_Log.w(i, "callbackOpStop", RcspUtil.formatString("result : %d(0x%X), code = %d(0x%X)", new Object[]{Integer.valueOf(r6), Integer.valueOf(r6), Integer.valueOf(r0), Integer.valueOf(r0)}));
        OnFatFileProgressListener r7 = this.d;
        if (r7 == null) goto L6;
        r7.onStop(r0);
        return;
    }

    public final void a(int r6, boolean r7) {
        String r0 = i;
        JL_Log.i(r0, "handleStopEventBySysException", "result = " + r6 + ", isSysException : " + r7);
        DeviceInfo r1 = this.a.getDeviceInfo();
        if (this.c == 4) goto L13;
        if (r7 == false) goto L13;
        if (r1 == null) goto L13;
        JL_Log.d(r0, "handleStopEventBySysException", "Obtain the current phone Status : " + r1.getPhoneStatus());
        if (r1.getPhoneStatus() != 1) goto L11;
        JL_Log.d(r0, "handleStopEventBySysException", "add OnRcspEventListener, waiting for phone status.");
        this.a.registerOnRcspEventListener(new AnonymousClass1(this));
        return;
    L11:
        c();
        return;
    L13:
        a(r6);
    }
}
