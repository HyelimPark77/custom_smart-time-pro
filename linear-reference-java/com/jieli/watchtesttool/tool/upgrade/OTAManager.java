package com.jieli.watchtesttool.tool.upgrade;

import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.jl_bt_ota.impl.BluetoothOTAManager;
import com.jieli.jl_bt_ota.interfaces.IUpgradeCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;
import com.jieli.jl_bt_ota.util.JL_Log;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.util.AppUtil;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class OTAManager extends BluetoothOTAManager {
    public static final String OTA_FILE_NAME = "update.ufw";
    public static final String OTA_FILE_SUFFIX = ".ufw";
    public static final String OTA_ZIP_SUFFIX = ".zip";
    private final BluetoothEventListener mBluetoothEventListener;
    private final BluetoothHelper mBluetoothHelper;
    private Context mContext;
    private String mNeedReconnectAddress;

    public final class CustomUpgradeCallback implements IUpgradeCallback {
        private final IUpgradeCallback mIUpgradeCallback;
        final /* synthetic */ OTAManager this$0;

        public CustomUpgradeCallback(OTAManager r1, IUpgradeCallback r2) {
            this.this$0 = r1;
            this.mIUpgradeCallback = r2;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onCancelOTA() {
            IUpgradeCallback r0 = this.mIUpgradeCallback;
            if (r0 == null) goto L6;
            r0.onCancelOTA();
            return;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onError(BaseError r2) {
            IUpgradeCallback r0 = this.mIUpgradeCallback;
            if (r0 == null) goto L6;
            r0.onError(r2);
            return;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onNeedReconnect(String r4, boolean r5) {
            HistoryRecord r0 = OTAManager.access$000(this.this$0).getBluetoothOp().getHistoryRecord(r4);
            if (r0 != null) goto L5;
        L11:
            IUpgradeCallback r1 = this.mIUpgradeCallback;
            if (r1 == null) goto L17;
            r1.onNeedReconnect(r4, r5);
            return;
        L17:
            return;
        L5:
            if (r0.getConnectType() == 0) goto L11;
            String r2 = r0.getMappedAddress();
            String r3 = r0.getAddress();
            r0.setAddress(r2);
            r0.setConnectType(0);
            r0.setMappedAddress(r3);
            OTAManager.access$000(this.this$0).getBluetoothOp().getHistoryRecordHelper().updateHistoryRecord(r0);     // Catch: Exception -> L9
        L9:
            e = move-exception;
            e.printStackTrace();
            goto L11
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onProgress(int r3, float r4) {
            if (r3 == 0) goto L4;
        L10:
            IUpgradeCallback r0 = this.mIUpgradeCallback;
            if (r0 == null) goto L14;
            r0.onProgress(r3, r4);
            return;
        L14:
            return;
        L4:
            if (r4 <= 50.0f) goto L10;
            if (OTAManager.access$100(this.this$0) != null) goto L10;
            if (OTAManager.access$200(this.this$0) == false) goto L10;
            OTAManager r1 = this.this$0;
            OTAManager.access$102(r1, r1.getConnectedDevice().getAddress());
            goto L10
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStartOTA() {
            IUpgradeCallback r0 = this.mIUpgradeCallback;
            if (r0 == null) goto L6;
            r0.onStartOTA();
            return;
        }

        @Override // com.jieli.jl_bt_ota.interfaces.IUpgradeCallback
        public void onStopOTA() {
            OTAManager.access$300(this.this$0, null);
            OTAManager.access$102(this.this$0, null);
            IUpgradeCallback r0 = this.mIUpgradeCallback;
            if (r0 == null) goto L6;
            r0.onStopOTA();
            return;
        }
    }

    public OTAManager(Context r2) {
        super(r2);
        BluetoothEventListener r0 = new AnonymousClass1(this);
        this.mBluetoothEventListener = r0;
        this.mContext = r2;
        BluetoothHelper r3 = BluetoothHelper.getInstance((Application) r2.getApplicationContext());
        this.mBluetoothHelper = r3;
        r3.addBluetoothEventListener(r0);
        configureOTA();
    }

    public static /* synthetic */ BluetoothHelper access$000(OTAManager r0) {
        return r0.mBluetoothHelper;
    }

    public static /* synthetic */ String access$100(OTAManager r0) {
        return r0.mNeedReconnectAddress;
    }

    public static /* synthetic */ String access$102(OTAManager r0, String r1) {
        r0.mNeedReconnectAddress = r1;
        return r1;
    }

    public static /* synthetic */ boolean access$200(OTAManager r0) {
        return r0.isSingleOTA();
    }

    public static /* synthetic */ void access$300(OTAManager r0, String r1) {
        r0.updateHistoryRecord(r1);
    }

    private void checkDevice(BluetoothDevice r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (this.mBluetoothHelper.getBluetoothOp().isConnectedBLEDevice(r3) == false) goto L10;
        int r0 = this.mBluetoothHelper.getBluetoothOp().getBleMtu(r3);
        if (this.mBluetoothHelper.getBluetoothOp().getDeviceGatt(r3) == null) goto L11;
        onMtuChanged(this.mBluetoothHelper.getBluetoothOp().getDeviceGatt(r3), r0 + 3, 0);
        return;
    L11:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void configureOTA() {
        BluetoothOTAConfigure r0 = BluetoothOTAConfigure.createDefault();
        int r1 = this.mBluetoothHelper.getBluetoothOp().getBluetoothOption().getPriority();
        if (this.mBluetoothHelper.isConnectedDevice() == false) goto L5;
        r1 = this.mBluetoothHelper.getBluetoothOp().isConnectedSppDevice(this.mBluetoothHelper.getConnectedBtDevice());
    L5:
        this.mBluetoothHelper.getBluetoothOp().getBluetoothOption().setNotAssociatedEDR(true);
        r0.setPriority(r1).setNeedChangeMtu(false).setMtu(20).setUseAuthDevice(false).setUseReconnect(false);
        String r2 = AppUtil.createFilePath(this.mContext, new String[]{"upgrade"});
        File r3 = new File(r2);
        boolean r4 = r3.exists();
        if (r4 == true) goto L8;
        r4 = r3.mkdir();
    L8:
        if (r4 == false) goto L13;
        String r5 = AppUtil.obtainUpdateFilePath(r2, OTA_FILE_SUFFIX);
        if (r5 != null) goto L12;
        r5 = r2 + "/" + OTA_FILE_NAME;
    L12:
        r0.setFirmwareFilePath(r5);
    L13:
        JL_Log.d(this.TAG, "configureOTA >> " + r0);
        configure(r0);
        if (this.mBluetoothHelper.isConnectedDevice() == false) goto L17;
        onBtDeviceConnection(getConnectedDevice(), 1);
        checkDevice(getConnectedDevice());
        return;
    }

    private boolean isSingleOTA() {
        TargetInfoResponse r0 = getDeviceInfo();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isSupportDoubleBackup() == true) goto L10;
        return true;
    L10:
        return false;
    }

    private void updateHistoryRecord(String r3) {
        HistoryRecord r0 = this.mBluetoothHelper.getBluetoothOp().getHistoryRecord(this.mNeedReconnectAddress);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.getUpdateAddress() != null) goto L7;
    L8:
        r0.setUpdateAddress(r3);
        this.mBluetoothHelper.getBluetoothOp().getHistoryRecordHelper().updateHistoryRecord(r0);
        return;
    L7:
        if (r0.getUpdateAddress().equals(r3) == false) goto L8;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void connectBluetoothDevice(BluetoothDevice r2) {
        updateHistoryRecord(r2.getAddress());
        this.mBluetoothHelper.connectDeviceWithoutRecord(r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public void disconnectBluetoothDevice(BluetoothDevice r2) {
        this.mBluetoothHelper.disconnectDevice(r2);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public BluetoothGatt getConnectedBluetoothGatt() {
        return this.mBluetoothHelper.getConnectedBluetoothGatt(getConnectedDevice());
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public BluetoothDevice getConnectedDevice() {
        return this.mBluetoothHelper.getConnectedBtDevice();
    }

    @Override // com.jieli.jl_bt_ota.impl.BluetoothOTAManager, com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void release() {
        super.release();
        this.mBluetoothHelper.removeBluetoothEventListener(this.mBluetoothEventListener);
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothManager
    public boolean sendDataToDevice(BluetoothDevice r2, byte[] r3) {
        return this.mBluetoothHelper.sendDataToDevice(r2, r3);
    }

    @Override // com.jieli.jl_bt_ota.impl.BluetoothOTAManager, com.jieli.jl_bt_ota.interfaces.IUpgradeManager
    public void startOTA(IUpgradeCallback r2) {
        checkDevice(getConnectedDevice());
        super.startOTA(new CustomUpgradeCallback(this, r2));
    }
}
