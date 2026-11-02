package com.jieli.jl_rcsp.impl;

import android.bluetooth.BluetoothDevice;
import com.ironsource.C12616d4;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.data.OnDataEventCallback;
import com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener;
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
import com.jieli.jl_rcsp.model.command.external_flash.ExtFlashIOCtrlNoResponseCmd;
import com.jieli.jl_rcsp.model.command.external_flash.GetExternalFlashMsgCmd;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.data.DataParams;
import com.jieli.jl_rcsp.model.data.SendParams;
import com.jieli.jl_rcsp.model.device.BatteryInfo;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.parameter.ExternalFlashIOCtrlParam;
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
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class WatchOpImpl extends RcspOpImpl implements IWatchOp {
    public static final int FUNC_FILE_BROWSE = 2;
    public static final int FUNC_RCSP = 0;
    public static final int FUNC_WATCH = 1;
    public static int[] WATCH_STORAGE_INDEX_LIST = {3, 6};

    /* JADX INFO: renamed from: g */
    public static final String f37983g = "WatchOpImpl";

    /* JADX INFO: renamed from: a */
    public final WatchCallbackManager f37984a;

    /* JADX INFO: renamed from: b */
    public final int f37985b;

    /* JADX INFO: renamed from: c */
    public IWatchManager f37986c;

    /* JADX INFO: renamed from: d */
    public final DataTransferOpImpl f37987d;

    /* JADX INFO: renamed from: e */
    public final OnRcspCallback f37988e;

    /* JADX INFO: renamed from: f */
    public final OnRcspEventListener f37989f;

    public final class RcspProgressListener implements OnFatFileProgressListener {

        /* JADX INFO: renamed from: a */
        public final OnFatFileProgressListener f37995a;

        public RcspProgressListener(OnFatFileProgressListener onFatFileProgressListener) {
            this.f37995a = onFatFileProgressListener;
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onProgress(float f) {
            OnFatFileProgressListener onFatFileProgressListener = this.f37995a;
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onProgress(f);
            }
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStart(String str) {
            OnFatFileProgressListener onFatFileProgressListener = this.f37995a;
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStart(str);
            }
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStop(int i) {
            if (!(WatchOpImpl.this.f37986c instanceof RcspWatch)) {
                OnFatFileProgressListener onFatFileProgressListener = this.f37995a;
                if (onFatFileProgressListener != null) {
                    onFatFileProgressListener.onStop(i);
                    return;
                }
                return;
            }
            if (i == 0) {
                ((RcspWatch) WatchOpImpl.this.f37986c).reLoadFolder(new OnWatchOpCallback<ArrayList<FatFile>>() { // from class: com.jieli.jl_rcsp.impl.WatchOpImpl.RcspProgressListener.1
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        if (RcspProgressListener.this.f37995a != null) {
                            RcspProgressListener.this.f37995a.onStop(baseError.getSubCode());
                        }
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(ArrayList<FatFile> arrayList) {
                        if (RcspProgressListener.this.f37995a != null) {
                            RcspProgressListener.this.f37995a.onStop(0);
                        }
                    }
                });
                JL_Log.m27887w(WatchOpImpl.f37983g, "RcspHandProgressListener", "reLoadFolder >>>> ");
            } else {
                OnFatFileProgressListener onFatFileProgressListener2 = this.f37995a;
                if (onFatFileProgressListener2 != null) {
                    onFatFileProgressListener2.onStop(i);
                }
            }
        }
    }

    public WatchOpImpl(int i) {
        OnRcspCallback onRcspCallback = new OnRcspCallback() { // from class: com.jieli.jl_rcsp.impl.WatchOpImpl.3
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onConnectStateChange(BluetoothDevice bluetoothDevice, int i2) {
                BluetoothDevice targetDevice = WatchOpImpl.this.getTargetDevice();
                JL_Log.m27887w(WatchOpImpl.f37983g, "onConnectStateChange", "device = " + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", connectedDevice = " + RcspUtil.printBtDeviceInfo(targetDevice) + ", status = " + i2);
                if (RcspUtil.deviceEquals(bluetoothDevice, targetDevice) && (i2 == 2 || i2 == 0)) {
                    WatchOpImpl.this.m27443b();
                }
                WatchOpImpl.this.f37984a.onConnectStateChange(bluetoothDevice, i2);
                super.onConnectStateChange(bluetoothDevice, i2);
            }

            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onMandatoryUpgrade(BluetoothDevice bluetoothDevice) {
                WatchOpImpl.this.f37984a.onMandatoryUpgrade(bluetoothDevice);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                WatchOpImpl.this.f37984a.onRcspCommand(bluetoothDevice, commandBase);
                if (commandBase.getId() == 26 && (commandBase instanceof ExtFlashIOCtrlNoResponseCmd)) {
                    ExternalFlashIOCtrlParam externalFlashIOCtrlParam = (ExternalFlashIOCtrlParam) ((ExtFlashIOCtrlNoResponseCmd) commandBase).getParam();
                    if (externalFlashIOCtrlParam.getOp() == 3 && externalFlashIOCtrlParam.getWatchOp() == 2) {
                        WatchOpImpl.this.f37984a.onCurrentWatchInfo(bluetoothDevice, externalFlashIOCtrlParam.getFilePath());
                    }
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspDataCmd(BluetoothDevice bluetoothDevice, CommandBase commandBase) {
                WatchOpImpl.this.f37984a.onRcspDataCmd(bluetoothDevice, commandBase);
            }

            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspError(BluetoothDevice bluetoothDevice, BaseError baseError) {
                WatchOpImpl.this.f37984a.onRcspError(bluetoothDevice, baseError);
            }

            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback
            public void onRcspInit(BluetoothDevice bluetoothDevice, boolean z) {
                JL_Log.m27883i(WatchOpImpl.f37983g, "onRcspInit", "device = " + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", isInit = " + z);
                WatchOpImpl.this.f37984a.onRcspInit(bluetoothDevice, z);
                if (z) {
                    WatchOpImpl.this.m27443b();
                    WatchOpImpl.this.m27436a(bluetoothDevice);
                }
            }
        };
        this.f37988e = onRcspCallback;
        this.f37989f = new OnRcspEventListener() { // from class: com.jieli.jl_rcsp.impl.WatchOpImpl.4
            @Override // com.jieli.jl_rcsp.interfaces.rcsp.OnRcspEventListener
            public void onBatteryChange(BluetoothDevice bluetoothDevice, BatteryInfo batteryInfo) {
                WatchOpImpl.this.f37984a.onDevicePower(bluetoothDevice, batteryInfo);
            }
        };
        this.f37984a = new WatchCallbackManager();
        this.f37985b = i;
        JL_Log.m27883i(f37983g, C12616d4.a.f34169f, RcspUtil.formatString("Lib name = %s(%d), func =  %d. clazz : %s", WatchConstant.getLibVersionName(), Integer.valueOf(WatchConstant.getLibVersionCode()), Integer.valueOf(i), this));
        if (i == 1) {
            registerOnRcspCallback(onRcspCallback);
            if (!FileBrowseManager.getInstance().isInit()) {
                FileBrowseManager.getInstance().init(this);
            }
        } else if (i == 2 && !FileBrowseManager.getInstance().isInit()) {
            FileBrowseManager.getInstance().init(this);
        }
        DataTransferOpImpl dataTransferOpImplInstance = DataTransferOpImpl.instance(this);
        this.f37987d = dataTransferOpImplInstance;
        dataTransferOpImplInstance.addListener(new OnDataTransferListener() { // from class: com.jieli.jl_rcsp.impl.WatchOpImpl.1
            @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
            public void onError(BluetoothDevice bluetoothDevice, BaseError baseError) {
                WatchOpImpl.this.f37984a.onBigDataError(bluetoothDevice, baseError);
            }

            @Override // com.jieli.jl_rcsp.interfaces.data.OnDataTransferListener
            public void onReceiveData(BluetoothDevice bluetoothDevice, int i2, byte[] bArr) {
                WatchOpImpl.this.f37984a.onReceiveBigData(bluetoothDevice, i2, bArr);
                if (i2 == 2) {
                    WatchOpImpl watchOpImpl = WatchOpImpl.this;
                    RTCOpImpl.parseRTCBigData(watchOpImpl, watchOpImpl.mRcspEventListenerManager, bArr);
                } else if (i2 == 5) {
                    WatchOpImpl.this.m27439a(bArr);
                }
            }
        });
    }

    public void cancelDataTransfer(OnOperationCallback<Boolean> onOperationCallback) {
        this.f37987d.cancelDataTransfer(onOperationCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean cancelTransfer() {
        IWatchManager iWatchManager = this.f37986c;
        if (iWatchManager == null) {
            return false;
        }
        return iWatchManager.cancelTransfer();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void createWatchFile(String str, boolean z, OnFatFileProgressListener onFatFileProgressListener) {
        if (!m27440a(onFatFileProgressListener) || m27442a("createWatchFile", onFatFileProgressListener)) {
            return;
        }
        this.f37986c.createWatchFile(str, z, new RcspProgressListener(onFatFileProgressListener));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void deleteWatchFile(String str, OnFatFileProgressListener onFatFileProgressListener) {
        if (!m27440a(onFatFileProgressListener) || m27442a("deleteWatchFile", onFatFileProgressListener)) {
            return;
        }
        this.f37986c.deleteWatchFile(str, onFatFileProgressListener);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void enableCustomWatchBg(String str, OnWatchOpCallback<FatFile> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.enableCustomWatchBg(str, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public String getCurrentBrowsePath() {
        IWatchManager iWatchManager = this.f37986c;
        if (iWatchManager == null) {
            return null;
        }
        return iWatchManager.getCurrentBrowsePath();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getCurrentWatchInfo(OnWatchOpCallback<FatFile> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.getCurrentWatchInfo(onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getCustomWatchBgInfo(String str, OnWatchOpCallback<String> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.getCustomWatchBgInfo(str, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public WatchConfigure getWatchConfigure(BluetoothDevice bluetoothDevice) {
        IWatchManager iWatchManager = this.f37986c;
        if (iWatchManager == null) {
            return null;
        }
        return iWatchManager.getWatchConfigure(bluetoothDevice);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchFileSize(String str, OnWatchOpCallback<WatchFileContent> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.getWatchFileSize(str, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchMessage(String str, OnWatchOpCallback<String> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.getWatchMessage(str, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchSysLeftSize(OnWatchOpCallback<Long> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.getWatchSysLeftSize(onWatchOpCallback);
        }
    }

    public boolean isDataTransfer() {
        return this.f37987d.isDataTransfer();
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public boolean isDeviceConnected(BluetoothDevice bluetoothDevice) {
        return RcspUtil.deviceEquals(bluetoothDevice, getConnectedDevice());
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean isOTAResource() {
        IWatchManager iWatchManager = this.f37986c;
        return iWatchManager != null && iWatchManager.isOTAResource();
    }

    public boolean isWatchSystemOk() {
        IWatchManager iWatchManager = this.f37986c;
        return iWatchManager != null && iWatchManager.isInit();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void jumpToUpdateResource(boolean z, OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.jumpToUpdateResource(z, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void listWatchList(OnWatchOpCallback<ArrayList<FatFile>> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.listWatchList(onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void openWatchFile(String str, OnWatchOpCallback<byte[]> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            if (!m27445c()) {
                this.f37986c.openWatchFile(str, onWatchOpCallback);
                return;
            }
            JL_Log.m27887w(f37983g, "openWatchFile", "The device is busy.");
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onFailed(new BaseError(12545, WatchError.getErrorDesc(12545)));
            }
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void pushMessageInfo(NotificationMsg notificationMsg, OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.pushMessageInfo(notificationMsg, onWatchOpCallback);
        }
    }

    public void readLargeData(DataParams dataParams, OnDataEventCallback onDataEventCallback) {
        this.f37987d.readLargeData(dataParams, onDataEventCallback);
    }

    @Override // com.jieli.jl_rcsp.impl.RcspOpImpl, com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public void receiveDataFromDevice(BluetoothDevice bluetoothDevice, BasePacket basePacket) {
        super.receiveDataFromDevice(bluetoothDevice, basePacket);
        m27437a(bluetoothDevice, basePacket);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void registerOnWatchCallback(OnWatchCallback onWatchCallback) {
        this.f37984a.registerWatchCallback(onWatchCallback);
        BluetoothDevice targetDevice = getTargetDevice();
        if (targetDevice != null) {
            DeviceInfo deviceInfo = this.mStatusManager.getDeviceInfo(targetDevice);
            ExternalFlashMsgResponse extFlashMsg = this.mStatusManager.getExtFlashMsg(targetDevice);
            if (deviceInfo != null) {
                if (deviceInfo.isMandatoryUpgrade()) {
                    onWatchCallback.onMandatoryUpgrade(targetDevice);
                    return;
                }
                if (extFlashMsg != null && extFlashMsg.getSysStatus() != 0) {
                    onWatchCallback.onWatchSystemException(targetDevice, extFlashMsg.getSysStatus());
                } else if (deviceInfo.getExpandMode() == 1) {
                    JL_Log.m27887w(f37983g, "registerOnWatchCallback", "onResourceUpdateUnfinished >>> ");
                    onWatchCallback.onResourceUpdateUnfinished(targetDevice);
                }
            }
        }
    }

    @Override // com.jieli.jl_rcsp.impl.RcspOpImpl, com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void release() {
        JL_Log.m27883i(f37983g, "release", "clazz : " + this);
        FileBrowseManager.getInstance().release();
        unregisterOnRcspCallback(this.f37988e);
        super.release();
        m27443b();
        this.f37987d.destroy();
        this.f37984a.release();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void removeMessageInfo(NotificationMsg notificationMsg, OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.removeMessageInfo(notificationMsg, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void replaceWatchFile(String str, OnFatFileProgressListener onFatFileProgressListener) {
        if (!m27440a(onFatFileProgressListener) || m27442a("replaceWatchFile", onFatFileProgressListener)) {
            return;
        }
        this.f37986c.replaceWatchFile(str, new RcspProgressListener(onFatFileProgressListener));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void requestDeviceConfigure(OnWatchOpCallback<WatchConfigure> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.requestDeviceConfigure(onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void requestDevicePower(OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.requestDevicePower(onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void restoreWatchSystem(OnFatFileProgressListener onFatFileProgressListener) {
        if (m27440a(onFatFileProgressListener)) {
            this.f37986c.restoreWatchSystem(onFatFileProgressListener);
        }
    }

    public void sendLargeData(SendParams sendParams, OnDataEventCallback onDataEventCallback) {
        this.f37987d.sendLargeData(sendParams, onDataEventCallback);
    }

    public void sendRcspCommand(CommandBase commandBase, RcspCommandCallback rcspCommandCallback) {
        sendRcspCommand(getConnectedDevice(), commandBase, rcspCommandCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void setCurrentWatchInfo(String str, OnWatchOpCallback<FatFile> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.setCurrentWatchInfo(str, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void syncWeatherInfo(PushInfoDataToDeviceCmd.Weather weather, OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.syncWeatherInfo(weather, onWatchOpCallback);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void unregisterOnWatchCallback(OnWatchCallback onWatchCallback) {
        this.f37984a.unregisterWatchCallback(onWatchCallback);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void updateWatchResource(String str, OnUpdateResourceCallback onUpdateResourceCallback) {
        IWatchManager iWatchManager = this.f37986c;
        if (iWatchManager != null) {
            iWatchManager.updateWatchResource(str, onUpdateResourceCallback);
        } else if (onUpdateResourceCallback != null) {
            onUpdateResourceCallback.onError(WatchError.ERR_FAT_JNI_INIT, WatchError.getErrorDesc(WatchError.ERR_FAT_JNI_INIT));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void writeResourceOTAFlag(boolean z, OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (m27441a(onWatchOpCallback)) {
            this.f37986c.writeResourceOTAFlag(z, onWatchOpCallback);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27443b() {
        if (this.f37986c != null) {
            unregisterOnRcspEventListener(this.f37989f);
            this.f37986c.destroy();
            this.f37986c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27445c() {
        DeviceInfo deviceInfo = getDeviceInfo();
        return deviceInfo != null && deviceInfo.getPhoneStatus() == 1;
    }

    /* JADX INFO: renamed from: a */
    private void m27433a(OnOperationCallback<ExternalFlashMsgResponse> onOperationCallback) {
        WatchBase.queryExtFlashMsgForDevice(this, onOperationCallback);
    }

    /* JADX INFO: renamed from: a */
    public final void m27436a(final BluetoothDevice bluetoothDevice) {
        if (this.f37985b != 1) {
            return;
        }
        DeviceInfo deviceInfo = this.mStatusManager.getDeviceInfo(bluetoothDevice);
        String str = f37983g;
        JL_Log.m27877d(str, "handleRcspInit", "device : " + RcspUtil.printBtDeviceInfo(bluetoothDevice) + ", " + deviceInfo);
        if (deviceInfo != null) {
            if (deviceInfo.isSupportExternalFlashTransfer()) {
                ExternalFlashMsgResponse extFlashMsg = this.mStatusManager.getExtFlashMsg(bluetoothDevice);
                JL_Log.m27877d(str, "handleRcspInit", "flashMsg = " + extFlashMsg);
                if (extFlashMsg == null) {
                    m27433a(new OnOperationCallback<ExternalFlashMsgResponse>() { // from class: com.jieli.jl_rcsp.impl.WatchOpImpl.2
                        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                        public void onFailed(BaseError baseError) {
                            WatchOpImpl.this.f37984a.onWatchSystemInit(baseError.getSubCode());
                        }

                        @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                        public void onSuccess(ExternalFlashMsgResponse externalFlashMsgResponse) {
                            if (WatchOpImpl.this.mStatusManager.getExtFlashMsg(bluetoothDevice) == null) {
                                WatchOpImpl.this.mStatusManager.updateExtFlashMsg(bluetoothDevice, externalFlashMsgResponse);
                            }
                            WatchOpImpl.this.m27436a(bluetoothDevice);
                        }
                    });
                    return;
                }
                if (extFlashMsg.getSystem() == 0) {
                    this.f37986c = new FatFsWatch(this, this.f37984a);
                } else {
                    this.f37986c = new RcspWatch(this, this.f37984a);
                }
                this.f37986c.init();
                JL_Log.m27887w(str, "handleRcspInit", "init WatchManager....SysStatus = " + extFlashMsg.getSysStatus());
                registerOnRcspEventListener(this.f37989f);
                return;
            }
            JL_Log.m27887w(str, "handleRcspInit", "device does not support flash to transfer data.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27444b(byte[] bArr) {
        List<LtvBean> lTVData2 = DataUtil.parseLTVData2(bArr);
        HashMap map = new HashMap();
        for (LtvBean ltvBean : lTVData2) {
            byte[] data = ltvBean.getData();
            int type = ltvBean.getType();
            if (type == 0 || type == 1 || type == 2 || type == 3) {
                if (data[0] == 0) {
                    int length = data.length - 1;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(data, 1, bArr2, 0, length);
                    map.put(Integer.valueOf(ltvBean.getType()), RcspUtil.parseLTVData(bArr2));
                }
            }
        }
        RcspEventListenerManager rcspEventListenerManager = this.mRcspEventListenerManager;
        if (rcspEventListenerManager != null) {
            rcspEventListenerManager.onPlatformInterfaceInfoChange(getConnectedDevice(), map);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m27437a(final BluetoothDevice bluetoothDevice, BasePacket basePacket) {
        final ExternalFlashMsgResponse externalFlashMsgResponse;
        int opCode = basePacket.getOpCode();
        boolean z = basePacket.getType() == 1;
        CommandBase commandBaseConvert2Command = ParseHelper.convert2Command(bluetoothDevice, basePacket);
        if (commandBaseConvert2Command == null) {
            BaseError baseError = new BaseError(12289, "Failed to parse RCSP data.");
            baseError.setOpCode(basePacket.getOpCode());
            this.f37984a.onRcspError(bluetoothDevice, baseError);
            return;
        }
        if (z || opCode != 214 || basePacket.getStatus() != 0 || (externalFlashMsgResponse = (ExternalFlashMsgResponse) ((GetExternalFlashMsgCmd) commandBaseConvert2Command).getResponse()) == null) {
            return;
        }
        JL_Log.m27883i(f37983g, "handleWatchCmd", "getDevExtFlashMsg ok, response : " + externalFlashMsgResponse);
        this.mStatusManager.updateExtFlashMsg(bluetoothDevice, externalFlashMsgResponse);
        this.f37984a.onExternalFlashMsg(bluetoothDevice, externalFlashMsgResponse);
        if (externalFlashMsgResponse.getSysStatus() != 0) {
            if (this.f37986c == null) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.zp6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12669IO.m27438a(bluetoothDevice, externalFlashMsgResponse);
                    }
                }, 100L);
            } else {
                this.f37984a.onWatchSystemException(bluetoothDevice, externalFlashMsgResponse.getSysStatus());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27438a(BluetoothDevice bluetoothDevice, ExternalFlashMsgResponse externalFlashMsgResponse) {
        this.f37984a.onWatchSystemException(bluetoothDevice, externalFlashMsgResponse.getSysStatus());
    }

    /* JADX INFO: renamed from: a */
    public final void m27439a(byte[] bArr) {
        JL_Log.m27877d(f37983g, "parsePlatformInterfaceBigData", "data : " + CHexConver.byte2HexStr(bArr));
        if ((bArr[0] & 15) != 0 || bArr.length < 5) {
            return;
        }
        int iBytesToInt = CHexConver.bytesToInt(bArr, 1, 4);
        if (bArr.length >= iBytesToInt + 5) {
            byte[] bArr2 = new byte[iBytesToInt];
            System.arraycopy(bArr, 5, bArr2, 0, iBytesToInt);
            m27444b(bArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27440a(OnFatFileProgressListener onFatFileProgressListener) {
        if (this.f37986c != null) {
            return true;
        }
        JL_Log.m27880e(f37983g, "checkWatchManagerIsInit", "Watch system has not been initialized.");
        if (onFatFileProgressListener == null) {
            return false;
        }
        onFatFileProgressListener.onStop(WatchError.ERR_FAT_JNI_INIT);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27442a(String str, OnFatFileProgressListener onFatFileProgressListener) {
        if (!m27445c()) {
            return false;
        }
        JL_Log.m27887w(f37983g, str, WatchError.getErrorDesc(12545));
        if (onFatFileProgressListener == null) {
            return true;
        }
        onFatFileProgressListener.onStop(12545);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final <T> boolean m27441a(OnWatchOpCallback<T> onWatchOpCallback) {
        if (this.f37986c != null) {
            return true;
        }
        if (onWatchOpCallback == null) {
            return false;
        }
        onWatchOpCallback.onFailed(new BaseError(WatchError.ERR_FAT_JNI_INIT, WatchError.getErrorDesc(WatchError.ERR_FAT_JNI_INIT)));
        return false;
    }
}
