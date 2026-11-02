package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.zp6;
import com.ironsource.C2985d4;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspEventListener;
import com.jieli.jl_rcsp.interfaces.rcsp.RcspCommandCallback;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.IWatchOp;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.LtvBean;
import com.jieli.jl_rcsp.model.NotificationMsg;
import com.jieli.jl_rcsp.model.WatchConfigure;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.BasePacket;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.external_flash.GetExternalFlashMsgCmd;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.data.DataParams;
import com.jieli.jl_rcsp.model.data.SendParams;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.tool.WatchCallbackManager;
import com.jieli.jl_rcsp.tool.callback.RcspEventListenerManager;
import com.jieli.jl_rcsp.tool.datahandles.ParseHelper;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.DataUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.watch.WatchBase;
import com.jieli.jl_rcsp.watch.fatfs.FatFsWatch;
import com.jieli.jl_rcsp.watch.rcsp.RcspWatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class WatchOpImpl extends RcspOpImpl implements IWatchOp {
    public static final int FUNC_FILE_BROWSE = 2;
    public static final int FUNC_RCSP = 0;
    public static final int FUNC_WATCH = 1;
    public static int[] WATCH_STORAGE_INDEX_LIST = null;
    public static final String g = "WatchOpImpl";
    public final WatchCallbackManager a;
    public final int b;
    public IWatchManager c;
    public final DataTransferOpImpl d;
    public final OnRcspCallback e;
    public final OnRcspEventListener f;

    public final class RcspProgressListener implements OnFatFileProgressListener {
        public final OnFatFileProgressListener a;
        public final /* synthetic */ WatchOpImpl b;

        public RcspProgressListener(WatchOpImpl r1, OnFatFileProgressListener r2) {
            this.b = r1;
            this.a = r2;
        }

        public static /* synthetic */ OnFatFileProgressListener a(RcspProgressListener r0) {
            return r0.a;
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onProgress(float r2) {
            OnFatFileProgressListener r0 = this.a;
            if (r0 == null) goto L6;
            r0.onProgress(r2);
            return;
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStart(String r2) {
            OnFatFileProgressListener r0 = this.a;
            if (r0 == null) goto L6;
            r0.onStart(r2);
            return;
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStop(int r3) {
            if ((WatchOpImpl.c(this.b) instanceof RcspWatch) == false) goto L11;
            if (r3 != 0) goto L7;
            ((RcspWatch) WatchOpImpl.c(this.b)).reLoadFolder(new AnonymousClass1(this));
            JL_Log.w(WatchOpImpl.a(), "RcspHandProgressListener", "reLoadFolder >>>> ");
            return;
        L7:
            OnFatFileProgressListener r0 = this.a;
            if (r0 == null) goto L15;
            r0.onStop(r3);
            return;
        L15:
            return;
        L11:
            OnFatFileProgressListener r1 = this.a;
            if (r1 == null) goto L16;
            r1.onStop(r3);
            return;
        }
    }

    static {
        WATCH_STORAGE_INDEX_LIST = new int[]{3, 6};
    }

    public WatchOpImpl(int r6) {
        OnRcspCallback r0 = new AnonymousClass3(this);
        this.e = r0;
        this.f = new AnonymousClass4(this);
        this.a = new WatchCallbackManager();
        this.b = r6;
        JL_Log.i(g, C2985d4.a.f, RcspUtil.formatString("Lib name = %s(%d), func =  %d. clazz : %s", new Object[]{WatchConstant.getLibVersionName(), Integer.valueOf(WatchConstant.getLibVersionCode()), Integer.valueOf(r6), this}));
        if (r6 != 1) goto L5;
        registerOnRcspCallback(r0);
        if (FileBrowseManager.getInstance().isInit() == true) goto L13;
        FileBrowseManager.getInstance().init(this);
    L13:
        DataTransferOpImpl r7 = DataTransferOpImpl.instance(this);
        this.d = r7;
        r7.addListener(new AnonymousClass1(this));
        return;
    L5:
        if (r6 != 2) goto L13;
        if (FileBrowseManager.getInstance().isInit() == true) goto L13;
        FileBrowseManager.getInstance().init(this);
        goto L13
    }

    public static /* synthetic */ WatchCallbackManager a(WatchOpImpl r0) {
        return r0.a;
    }

    public static /* synthetic */ void b(WatchOpImpl r0) {
        r0.b();
    }

    public static /* synthetic */ IWatchManager c(WatchOpImpl r0) {
        return r0.c;
    }

    public void cancelDataTransfer(OnOperationCallback<Boolean> r2) {
        this.d.cancelDataTransfer(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean cancelTransfer() {
        IWatchManager r0 = this.c;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.cancelTransfer();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void createWatchFile(String r3, boolean r4, OnFatFileProgressListener r5) {
        if (a(r5) == true) goto L5;
        return;
    L5:
        if (a("createWatchFile", r5) == true) goto L10;
        this.c.createWatchFile(r3, r4, new RcspProgressListener(this, r5));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void deleteWatchFile(String r2, OnFatFileProgressListener r3) {
        if (a(r3) == true) goto L5;
        return;
    L5:
        if (a("deleteWatchFile", r3) == true) goto L10;
        this.c.deleteWatchFile(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void enableCustomWatchBg(String r2, OnWatchOpCallback<FatFile> r3) {
        if (a(r3) == false) goto L6;
        this.c.enableCustomWatchBg(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public String getCurrentBrowsePath() {
        IWatchManager r0 = this.c;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getCurrentBrowsePath();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getCurrentWatchInfo(OnWatchOpCallback<FatFile> r2) {
        if (a(r2) == false) goto L6;
        this.c.getCurrentWatchInfo(r2);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getCustomWatchBgInfo(String r2, OnWatchOpCallback<String> r3) {
        if (a(r3) == false) goto L6;
        this.c.getCustomWatchBgInfo(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public WatchConfigure getWatchConfigure(BluetoothDevice r2) {
        IWatchManager r0 = this.c;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getWatchConfigure(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchFileSize(String r2, OnWatchOpCallback<WatchFileContent> r3) {
        if (a(r3) == false) goto L6;
        this.c.getWatchFileSize(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchMessage(String r2, OnWatchOpCallback<String> r3) {
        if (a(r3) == false) goto L6;
        this.c.getWatchMessage(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchSysLeftSize(OnWatchOpCallback<Long> r2) {
        if (a(r2) == false) goto L6;
        this.c.getWatchSysLeftSize(r2);
        return;
    }

    public boolean isDataTransfer() {
        return this.d.isDataTransfer();
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public boolean isDeviceConnected(BluetoothDevice r2) {
        return RcspUtil.deviceEquals(r2, getConnectedDevice());
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean isOTAResource() {
        IWatchManager r0 = this.c;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isOTAResource() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isWatchSystemOk() {
        IWatchManager r0 = this.c;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isInit() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void jumpToUpdateResource(boolean r2, OnWatchOpCallback<Boolean> r3) {
        if (a(r3) == false) goto L6;
        this.c.jumpToUpdateResource(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void listWatchList(OnWatchOpCallback<ArrayList<FatFile>> r2) {
        if (a(r2) == false) goto L6;
        this.c.listWatchList(r2);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void openWatchFile(String r3, OnWatchOpCallback<byte[]> r4) {
        if (a(r4) == true) goto L5;
        return;
    L5:
        if (c() == false) goto L10;
        JL_Log.w(g, "openWatchFile", "The device is busy.");
        if (r4 == null) goto L13;
        r4.onFailed(new BaseError(12545, WatchError.getErrorDesc(12545)));
        return;
    L13:
        return;
    L10:
        this.c.openWatchFile(r3, r4);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void pushMessageInfo(NotificationMsg r2, OnWatchOpCallback<Boolean> r3) {
        if (a(r3) == false) goto L6;
        this.c.pushMessageInfo(r2, r3);
        return;
    }

    public void readLargeData(DataParams r2, OnDataEventCallback r3) {
        this.d.readLargeData(r2, r3);
    }

    @Override // com.jieli.jl_rcsp.impl.RcspOpImpl, com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void receiveDataFromDevice(BluetoothDevice r1, BasePacket r2) {
        super.receiveDataFromDevice(r1, r2);
        a(r1, r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void registerOnWatchCallback(OnWatchCallback r5) {
        this.a.registerWatchCallback(r5);
        BluetoothDevice r0 = getTargetDevice();
        if (r0 == null) goto L19;
        DeviceInfo r1 = this.mStatusManager.getDeviceInfo(r0);
        ExternalFlashMsgResponse r2 = this.mStatusManager.getExtFlashMsg(r0);
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.isMandatoryUpgrade() == false) goto L10;
        r5.onMandatoryUpgrade(r0);
        return;
    L10:
        if (r2 == null) goto L16;
        if (r2.getSysStatus() == 0) goto L16;
        r5.onWatchSystemException(r0, r2.getSysStatus());
        return;
    L16:
        if (r1.getExpandMode() != 1) goto L21;
        JL_Log.w(g, "registerOnWatchCallback", "onResourceUpdateUnfinished >>> ");
        r5.onResourceUpdateUnfinished(r0);
        return;
    L21:
        return;
    }

    @Override // com.jieli.jl_rcsp.impl.RcspOpImpl, com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void release() {
        JL_Log.i(g, "release", "clazz : " + this);
        FileBrowseManager.getInstance().release();
        unregisterOnRcspCallback(this.e);
        super.release();
        b();
        this.d.destroy();
        this.a.release();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void removeMessageInfo(NotificationMsg r2, OnWatchOpCallback<Boolean> r3) {
        if (a(r3) == false) goto L6;
        this.c.removeMessageInfo(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void replaceWatchFile(String r3, OnFatFileProgressListener r4) {
        if (a(r4) == true) goto L5;
        return;
    L5:
        if (a("replaceWatchFile", r4) == true) goto L10;
        this.c.replaceWatchFile(r3, new RcspProgressListener(this, r4));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void requestDeviceConfigure(OnWatchOpCallback<WatchConfigure> r2) {
        if (a(r2) == false) goto L6;
        this.c.requestDeviceConfigure(r2);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void requestDevicePower(OnWatchOpCallback<Boolean> r2) {
        if (a(r2) == false) goto L6;
        this.c.requestDevicePower(r2);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void restoreWatchSystem(OnFatFileProgressListener r2) {
        if (a(r2) == false) goto L6;
        this.c.restoreWatchSystem(r2);
        return;
    }

    public void sendLargeData(SendParams r2, OnDataEventCallback r3) {
        this.d.sendLargeData(r2, r3);
    }

    public void sendRcspCommand(CommandBase r2, RcspCommandCallback r3) {
        sendRcspCommand(getConnectedDevice(), r2, r3);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void setCurrentWatchInfo(String r2, OnWatchOpCallback<FatFile> r3) {
        if (a(r3) == false) goto L6;
        this.c.setCurrentWatchInfo(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void syncWeatherInfo(PushInfoDataToDeviceCmd.Weather r2, OnWatchOpCallback<Boolean> r3) {
        if (a(r3) == false) goto L6;
        this.c.syncWeatherInfo(r2, r3);
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void unregisterOnWatchCallback(OnWatchCallback r2) {
        this.a.unregisterWatchCallback(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void updateWatchResource(String r2, OnUpdateResourceCallback r3) {
        IWatchManager r0 = this.c;
        if (r0 == null) goto L6;
        r0.updateWatchResource(r2, r3);
        return;
    L6:
        if (r3 == null) goto L9;
        r3.onError(WatchError.ERR_FAT_JNI_INIT, WatchError.getErrorDesc(WatchError.ERR_FAT_JNI_INIT));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void writeResourceOTAFlag(boolean r2, OnWatchOpCallback<Boolean> r3) {
        if (a(r3) == false) goto L6;
        this.c.writeResourceOTAFlag(r2, r3);
        return;
    }

    public static /* synthetic */ void a(WatchOpImpl r0, byte[] r1) {
        r0.a(r1);
    }

    public final void b() {
        if (this.c == null) goto L6;
        unregisterOnRcspEventListener(this.f);
        this.c.destroy();
        this.c = null;
        return;
    }

    public final boolean c() {
        DeviceInfo r0 = getDeviceInfo();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.getPhoneStatus() != 1) goto L9;
        return true;
    L9:
        return false;
    }

    public static /* synthetic */ void a(WatchOpImpl r0, BluetoothDevice r1) {
        r0.a(r1);
    }

    public static /* synthetic */ String a() {
        return g;
    }

    private void a(OnOperationCallback<ExternalFlashMsgResponse> r1) {
        WatchBase.queryExtFlashMsgForDevice(this, r1);
    }

    public final void a(final BluetoothDevice r6) {
        if (this.b != 1) goto L22;
        DeviceInfo r0 = this.mStatusManager.getDeviceInfo(r6);
        String r1 = g;
        JL_Log.d(r1, "handleRcspInit", "device : " + RcspUtil.printBtDeviceInfo(r6) + ", " + r0);
        if (r0 != null) goto L8;
        return;
    L8:
        if (r0.isSupportExternalFlashTransfer() == false) goto L19;
        ExternalFlashMsgResponse r2 = this.mStatusManager.getExtFlashMsg(r6);
        JL_Log.d(r1, "handleRcspInit", "flashMsg = " + r2);
        if (r2 != null) goto L14;
        a(new AnonymousClass2(this, r6));
        return;
    L14:
        if (r2.getSystem() != 0) goto L16;
        this.c = new FatFsWatch(this, this.a);
    L17:
        this.c.init();
        JL_Log.w(r1, "handleRcspInit", "init WatchManager....SysStatus = " + r2.getSysStatus());
        registerOnRcspEventListener(this.f);
        return;
    L16:
        this.c = new RcspWatch(this, this.a);
        goto L17
    L19:
        JL_Log.w(r1, "handleRcspInit", "device does not support flash to transfer data.");
        return;
    }

    public final void b(byte[] r8) {
        List<LtvBean> r9 = DataUtil.parseLTVData2(r8);
        HashMap r0 = new HashMap();
        Iterator<LtvBean> r10 = r9.iterator();
    L4:
        if (r10.hasNext() == false) goto L16;
        LtvBean r1 = r10.next();
        byte[] r2 = r1.getData();
        int r3 = r1.getType();
        if (r3 == 0) goto L14;
        if (r3 == 1) goto L14;
        if (r3 == 2) goto L14;
        if (r3 != 3) goto L4;
    L14:
        if (r2[0] != 0) goto L4;
        int r5 = r2.length - 1;
        byte[] r6 = new byte[r5];
        System.arraycopy(r2, 1, r6, 0, r5);
        List<LtvBean> r4 = RcspUtil.parseLTVData(r6);
        r0.put(Integer.valueOf(r1.getType()), r4);
        goto L4
    L16:
        RcspEventListenerManager r11 = this.mRcspEventListenerManager;
        if (r11 == null) goto L30;
        r11.onPlatformInterfaceInfoChange(getConnectedDevice(), r0);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final BluetoothDevice r4, BasePacket r5) {
        int r0 = r5.getOpCode();
        boolean r2 = true;
        if (r5.getType() == 1) goto L6;
        r2 = false;
    L6:
        CommandBase r1 = ParseHelper.convert2Command(r4, r5);
        if (r1 != null) goto L10;
        BaseError r3 = new BaseError(12289, "Failed to parse RCSP data.");
        r3.setOpCode(r5.getOpCode());
        this.a.onRcspError(r4, r3);
        return;
    L10:
        if (r2 == false) goto L12;
        return;
    L12:
        if (r0 == 214) goto L14;
        return;
    L14:
        if (r5.getStatus() != 0) goto L27;
        final ExternalFlashMsgResponse r6 = (ExternalFlashMsgResponse) ((GetExternalFlashMsgCmd) r1).getResponse();
        if (r6 == null) goto L28;
        JL_Log.i(g, "handleWatchCmd", "getDevExtFlashMsg ok, response : " + r6);
        this.mStatusManager.updateExtFlashMsg(r4, r6);
        this.a.onExternalFlashMsg(r4, r6);
        if (r6.getSysStatus() != 0) goto L20;
        return;
    L20:
        if (this.c != null) goto L23;
        this.mHandler.postDelayed(new zp6(this, r4, r6), 100);
        return;
    L23:
        this.a.onWatchSystemException(r4, r6.getSysStatus());
        return;
    L28:
        return;
    }

    public final /* synthetic */ void a(BluetoothDevice r2, ExternalFlashMsgResponse r3) {
        this.a.onWatchSystemException(r2, r3.getSysStatus());
    }

    public final void a(byte[] r6) {
        JL_Log.d(g, "parsePlatformInterfaceBigData", "data : " + CHexConver.byte2HexStr(r6));
        if ((r6[0] & 15) == 0) goto L5;
        return;
    L5:
        if (r6.length < 5) goto L11;
        int r1 = CHexConver.bytesToInt(r6, 1, 4);
        if (r6.length < (r1 + 5)) goto L12;
        byte[] r3 = new byte[r1];
        System.arraycopy(r6, 5, r3, 0, r1);
        b(r3);
        return;
    L12:
        return;
    }

    public final boolean a(OnFatFileProgressListener r4) {
        if (this.c != null) goto L9;
        JL_Log.e(g, "checkWatchManagerIsInit", "Watch system has not been initialized.");
        if (r4 == null) goto L11;
        r4.onStop(WatchError.ERR_FAT_JNI_INIT);
        return false;
    L11:
        return false;
    L9:
        return true;
    }

    public final boolean a(String r4, OnFatFileProgressListener r5) {
        if (c() == false) goto L9;
        JL_Log.w(g, r4, WatchError.getErrorDesc(12545));
        if (r5 == null) goto L11;
        r5.onStop(12545);
        return true;
    L11:
        return true;
    L9:
        return false;
    }

    public final <T> boolean a(OnWatchOpCallback<T> r4) {
        if (this.c != null) goto L8;
        if (r4 == null) goto L10;
        r4.onFailed(new BaseError(WatchError.ERR_FAT_JNI_INIT, WatchError.getErrorDesc(WatchError.ERR_FAT_JNI_INIT)));
        return false;
    L10:
        return false;
    L8:
        return true;
    }
}
