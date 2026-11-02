package com.jieli.jl_rcsp.watch;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_rcsp.constant.RcspErrorCode;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.IHandleResult;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.NotificationMsg;
import com.jieli.jl_rcsp.model.WatchConfigure;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.external_flash.ExternalFlashIOCtrlCmd;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.device.DeviceConfiguration;
import com.jieli.jl_rcsp.model.response.ExternalFlashIOCtrlResponse;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.tool.CustomRcspActionCallback;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.SyncMessageTask;
import com.jieli.jl_rcsp.tool.WatchCallbackManager;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public abstract class WatchBase implements IWatchManager {
    public static final int c = 0;
    public static final byte[] d = null;
    protected String TAG;
    public SyncMessageTask a;
    public final OnRcspCallback b;
    protected volatile boolean isOTAResource;
    protected boolean isSysException;
    protected final RcspOpImpl mRcspOp;
    protected final DeviceStatusManager mStatusManager;
    protected final WatchCallbackManager mWatchCallbackManager;

    public static class ExternalFlashIOCtrlBooleanResult extends ExternalFlashIOCtrlHandleResult<Boolean> {
        public ExternalFlashIOCtrlBooleanResult() {
            super(null);
        }

        @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
        public /* bridge */ /* synthetic */ Object handleResult(BluetoothDevice r1, CommandBase r2) {
            return handleResult(r1, (ExternalFlashIOCtrlCmd) r2);
        }

        public /* synthetic */ ExternalFlashIOCtrlBooleanResult(AnonymousClass1 r1) {
            this();
        }

        public Boolean handleResult(BluetoothDevice r1, ExternalFlashIOCtrlCmd r2) {
            return Boolean.TRUE;
        }
    }

    public static abstract class ExternalFlashIOCtrlHandleResult<T> implements IHandleResult<T, ExternalFlashIOCtrlCmd> {
        public ExternalFlashIOCtrlHandleResult() {
        }

        @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
        public /* bridge */ /* synthetic */ int hasResult(BluetoothDevice r1, CommandBase r2) {
            return hasResult(r1, (ExternalFlashIOCtrlCmd) r2);
        }

        public /* synthetic */ ExternalFlashIOCtrlHandleResult(AnonymousClass1 r1) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hasResult(BluetoothDevice r2, ExternalFlashIOCtrlCmd r3) {
            if (r3 != null) goto L6;
            return 1;
        L6:
            if (r3.getStatus() == 0) goto L10;
            return r3.getStatus();
        L10:
            if (r3.getResponse() != 0) goto L13;
            return 1;
        L13:
            return ((ExternalFlashIOCtrlResponse) r3.getResponse()).getResult();
        }
    }

    public static class HandleRcspCallback<T, C extends CommandBase> implements RcspCommandCallback<C> {
        protected final OnWatchOpCallback<T> callback;
        protected final String funcName;
        protected final IHandleResult<T, C> handler;

        public HandleRcspCallback(String r1, OnWatchOpCallback<T> r2, IHandleResult<T, C> r3) {
            this.funcName = r1;
            this.handler = r3;
            this.callback = r2;
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onCommandResponse(BluetoothDevice r4, C r5) {
            if (r5 == null) goto L26;
            IHandleResult<T, C> r0 = this.handler;
            if (r0 != null) goto L7;
            int r1 = 0;
        L8:
            T r2 = null;
            if (r5.getStatus() != 0) goto L20;
            if (r1 != 0) goto L20;
            IHandleResult<T, C> r3 = this.handler;
            if (r3 == null) goto L15;
            r2 = r3.handleResult(r4, r5);
        L15:
            OnWatchOpCallback<T> r6 = this.callback;
            if (r6 == null) goto L25;
            r6.onSuccess(r2);
            return;
        L25:
            return;
        L20:
            if (r5.getStatus() == 0) goto L23;
            onErrCode(r4, RcspErrorCode.buildJsonError(r5.getId(), 12292, r5.getStatus(), null));
            return;
        L23:
            onErrCode(r4, RcspErrorCode.buildJsonError(r5.getId(), 12293, r1, null));
            return;
        L7:
            r1 = r0.hasResult(r4, r5);
            goto L8
        }

        @Override // com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback
        public void onErrCode(BluetoothDevice r3, BaseError r4) {
            String r5 = RcspUtil.formatString("onErrCode ---> %s", new Object[]{r4});
            JL_Log.w("HandleRcspCallback", this.funcName, r5);
            OnWatchOpCallback<T> r6 = this.callback;
            if (r6 == null) goto L6;
            r6.onFailed(new BaseError(r4.getSubCode(), r4.getMessage()));
            return;
        }
    }

    public static class RcspBooleanResult implements IHandleResult<Boolean, CommandBase> {
        public RcspBooleanResult() {
        }

        @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
        public /* bridge */ /* synthetic */ Boolean handleResult(BluetoothDevice r1, CommandBase r2) {
            return handleResult(r1, r2);
        }

        @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
        public int hasResult(BluetoothDevice r1, CommandBase r2) {
            return 0;
        }

        public /* synthetic */ RcspBooleanResult(AnonymousClass1 r1) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.jieli.jl_rcsp.interfaces.IHandleResult
        public Boolean handleResult(BluetoothDevice r1, CommandBase r2) {
            return Boolean.TRUE;
        }
    }

    static {
        d = new byte[]{31, 0, 31, 0, 127, 0, 2, 0, 3, 2, 1, 3, 2, 2, 0, 2, -2, 31, 2, -1, -1};
    }

    public WatchBase(RcspOpImpl r2, WatchCallbackManager r3) {
        this.TAG = getClass().getSimpleName();
        this.mStatusManager = DeviceStatusManager.getInstance();
        this.isSysException = false;
        OnRcspCallback r0 = new AnonymousClass12(this);
        this.b = r0;
        this.mRcspOp = r2;
        this.mWatchCallbackManager = r3;
        r2.registerOnRcspCallback(r0);
    }

    public static /* synthetic */ SyncMessageTask a(WatchBase r0) {
        return r0.a;
    }

    public static /* synthetic */ void b(WatchBase r0) {
        r0.a();
    }

    public static void queryExtFlashMsgForDevice(RcspOpImpl r5, OnOperationCallback<ExternalFlashMsgResponse> r6) {
        if (r5 != null) goto L4;
        return;
    L4:
        r5.sendRcspCommand(r5.getTargetDevice(), CommandBuilder.buildGetExternalFlashMsgCmd(), new CustomRcspActionCallback("queryExtFlashMsgForDevice", r6, new AnonymousClass10()));
    }

    public <T> void callbackError(OnWatchOpCallback<T> r2, int r3) {
        callbackError(r2, r3, FatUtil.getFatFsErrorCodeMsg(r3));
    }

    public void createFileStart(String r5, int r6, OnWatchOpCallback<Boolean> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashInsertNewFileStartCmd(r5, r6), new HandleRcspCallback("createFileStart", r7, new ExternalFlashIOCtrlBooleanResult(null)));
    }

    public void deleteFileStart(String r6, OnWatchOpCallback<Boolean> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashDeleteFileStartCmd(r6), new HandleRcspCallback("deleteFileStart", r7, new ExternalFlashIOCtrlBooleanResult(null)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void destroy() {
        this.mRcspOp.unregisterOnRcspCallback(this.b);
        a();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void enableCustomWatchBg(final String r6, OnWatchOpCallback<FatFile> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashEnableCustomWatchCmd(r6), new HandleRcspCallback("enableCustomWatchBg", r7, new AnonymousClass3(this, r6)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public OnWatchCallback getCallback() {
        return this.mWatchCallbackManager;
    }

    public BluetoothDevice getConnectedDevice() {
        return this.mRcspOp.getTargetDevice();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getCurrentWatchInfo(OnWatchOpCallback<FatFile> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashGetCurrentWatchMsgCmd(), new HandleRcspCallback("getCurrentWatchInfo", r7, new AnonymousClass1(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getCustomWatchBgInfo(String r6, OnWatchOpCallback<String> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "fat file path is null."));
        return;
    L8:
        return;
    L6:
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashGetCustomBgInfoCmd(r6), new HandleRcspCallback("getCustomWatchBgInfo", r7, new AnonymousClass5(this)));
    }

    public ExternalFlashMsgResponse getExternalFlashMsg(BluetoothDevice r2) {
        return this.mStatusManager.getExtFlashMsg(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public /* bridge */ /* synthetic */ IRcspOp getRcspOp() {
        return getRcspOp();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public WatchConfigure getWatchConfigure(BluetoothDevice r3) {
        DeviceConfiguration r4 = this.mStatusManager.getDeviceConfigure(r3);
        if (r4 != null) goto L5;
    L13:
        WatchConfigure r5 = null;
    L14:
        if (r5 == null) goto L16;
        return r5;
    L16:
        return new WatchConfigure(0, d);
    L5:
        if (r4.getType() != 0) goto L13;
        if ((r4 instanceof WatchConfigure) == false) goto L17;
        r5 = (WatchConfigure) r4;
        goto L14
    L17:
        r5 = new WatchConfigure(r4.getVersion(), r4.getData());     // Catch: RuntimeException -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchMessage(String r6, OnWatchOpCallback<String> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "fat file path is null."));
        return;
    L8:
        return;
    L6:
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashGetWatchVersionCmd(r6), new HandleRcspCallback("getWatchMessage", r7, new AnonymousClass6(this)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean isOTAResource() {
        return this.isOTAResource;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public boolean isSysException() {
        return this.isSysException;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void jumpToUpdateResource(boolean r6, OnWatchOpCallback<Boolean> r7) {
        RcspOpImpl r0 = this.mRcspOp;
        r0.sendRcspCommand(r0.getTargetDevice(), CommandBuilder.buildExternalFlashUpdateResourceCmd(r6), new HandleRcspCallback("jumpToUpdateResource", r7, new ExternalFlashIOCtrlBooleanResult(null)));
    }

    public <T> void onCallbackError(OnWatchOpCallback<T> r3, int r4) {
        if (r3 == null) goto L5;
        r3.onFailed(new BaseError(r4, WatchError.getErrorDesc(r4)));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void pushMessageInfo(NotificationMsg r3, OnWatchOpCallback<Boolean> r4) {
        if (this.mRcspOp.isRcspInit() == true) goto L6;
        callbackError(r4, 8192);
        return;
    L6:
        b();
        SyncMessageTask.SyncTask r0 = new SyncMessageTask.SyncTask(0, r3, r4);
        this.a.putNotification(r0);
    }

    public void queryExtFlashMsg(OnOperationCallback<ExternalFlashMsgResponse> r2) {
        queryExtFlashMsgForDevice(this.mRcspOp, r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void registerOnWatchCallback(OnWatchCallback r2) {
        this.mWatchCallbackManager.registerWatchCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void removeMessageInfo(NotificationMsg r3, OnWatchOpCallback<Boolean> r4) {
        if (this.mRcspOp.isRcspInit() == true) goto L6;
        callbackError(r4, 8192);
        return;
    L6:
        b();
        SyncMessageTask.SyncTask r0 = new SyncMessageTask.SyncTask(1, r3, r4);
        this.a.putNotification(r0);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void requestDeviceConfigure(final OnWatchOpCallback<WatchConfigure> r7) {
        final BluetoothDevice r0 = getConnectedDevice();
        if (this.mStatusManager.getDeviceConfigure(r0) != null) goto L6;
        this.mRcspOp.sendRcspCommand(r0, CommandBuilder.buildGetDevConfigureCmd(), new CustomRcspActionCallback("requestDeviceConfigure", new AnonymousClass8(this, r0, r7), new AnonymousClass9(this)));
        return;
    L6:
        if (r7 == null) goto L9;
        r7.onSuccess(getWatchConfigure(r0));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void requestDevicePower(OnWatchOpCallback<Boolean> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildGetPublicSysInfoCmd(1), new HandleRcspCallback("requestDevicePower", r7, new RcspBooleanResult(null)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void sendWriteProtectFlag(final boolean r6, OnWatchOpCallback<Boolean> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashWriteProtectCmd(r6), new HandleRcspCallback("sendWriteProtectFlag", r7, new AnonymousClass7(this, r6)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void setCurrentWatchInfo(final String r6, OnWatchOpCallback<FatFile> r7) {
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), CommandBuilder.buildExternalFlashSetWatchCmd(r6), new HandleRcspCallback("setCurrentWatchInfo", r7, new AnonymousClass2(this, r6)));
    }

    public void setOTAResource(boolean r1) {
        this.isOTAResource = r1;
    }

    public void setSysException(boolean r1) {
        this.isSysException = r1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void syncWeatherInfo(PushInfoDataToDeviceCmd.Weather r6, OnWatchOpCallback<Boolean> r7) {
        if (r6 != null) goto L6;
        if (r7 == null) goto L8;
        r7.onFailed(new BaseError(4097, "Weather is null."));
        return;
    L8:
        return;
    L6:
        PushInfoDataToDeviceCmd r8 = new PushInfoDataToDeviceCmd(new PushInfoDataToDeviceCmd.Param(r6));
        this.mRcspOp.sendRcspCommand(getConnectedDevice(), r8, new HandleRcspCallback("syncWeatherInfo", r7, new RcspBooleanResult(null)));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void unregisterOnWatchCallback(OnWatchCallback r2) {
        this.mWatchCallbackManager.unregisterWatchCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void writeResourceOTAFlag(final boolean r6, OnWatchOpCallback<Boolean> r7) {
        RcspOpImpl r0 = this.mRcspOp;
        r0.sendRcspCommand(r0.getTargetDevice(), CommandBuilder.buildExternalFlashOTAResourceCmd(r6), new HandleRcspCallback("writeResourceOTAFlag", r7, new AnonymousClass4(this, r6)));
    }

    public static /* synthetic */ SyncMessageTask a(WatchBase r0, SyncMessageTask r1) {
        r0.a = r1;
        return r1;
    }

    public final void b() {
        if (this.a != null) goto L6;
        SyncMessageTask r0 = new SyncMessageTask(this.mRcspOp, new AnonymousClass11(this));
        this.a = r0;
        r0.start();
        return;
    }

    public <T> void callbackError(OnWatchOpCallback<T> r2, int r3, String r4) {
        if (r2 == null) goto L5;
        r2.onFailed(new BaseError(r3, r4));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public RcspOpImpl getRcspOp() {
        return this.mRcspOp;
    }

    public final void a() {
        SyncMessageTask r0 = this.a;
        if (r0 == null) goto L6;
        r0.exit();
        return;
    }
}
