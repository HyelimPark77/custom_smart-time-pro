package com.jieli.watchtesttool.tool.watch;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.impl.WatchOpImpl;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener;
import com.jieli.watchtesttool.tool.bluetooth.BluetoothHelper;
import com.jieli.watchtesttool.util.AppUtil;
import com.jieli.watchtesttool.util.WatchTestConstant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class WatchManager extends WatchOpImpl {
    private static final String TAG = "WatchManager";
    private static volatile WatchManager instance;
    private ArrayList<FatFile> devFatFileList;
    private final BluetoothHelper mBluetoothHelper;
    private Context mContext;
    private final BluetoothEventListener mEventListener;
    private BluetoothDevice mTargetDevice;

    private WatchManager(int i, Context context) {
        super(i);
        BluetoothEventListener bluetoothEventListener = new BluetoothEventListener() { // from class: com.jieli.watchtesttool.tool.watch.WatchManager.1
            @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
            public void onConnection(BluetoothDevice bluetoothDevice, int i2) {
                int iConvertWatchConnectStatus = AppUtil.convertWatchConnectStatus(i2);
                if (iConvertWatchConnectStatus == 1) {
                    WatchManager.this.updateHistoryRecordMsg(bluetoothDevice);
                    if (WatchManager.this.mBluetoothHelper.isUsedBtDevice(bluetoothDevice)) {
                        WatchManager.this.setTargetDevice(bluetoothDevice);
                        return;
                    }
                    return;
                }
                if (BluetoothUtil.deviceEquals(WatchManager.this.mTargetDevice, bluetoothDevice)) {
                    WatchManager.this.notifyBtDeviceConnection(bluetoothDevice, iConvertWatchConnectStatus);
                    if (iConvertWatchConnectStatus == 2 || iConvertWatchConnectStatus == 0) {
                        WatchManager.this.setTargetDevice(null);
                    }
                }
            }

            @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
            public void onReceiveData(BluetoothDevice bluetoothDevice, byte[] bArr) {
                if (BluetoothUtil.deviceEquals(bluetoothDevice, WatchManager.this.getConnectedDevice())) {
                    WatchManager.this.notifyReceiveDeviceData(bluetoothDevice, bArr);
                }
            }

            @Override // com.jieli.watchtesttool.tool.bluetooth.BluetoothEventListener
            public void onSwitchConnectedDevice(BluetoothDevice bluetoothDevice) {
                if (bluetoothDevice != null) {
                    WatchManager.this.setTargetDevice(bluetoothDevice);
                }
            }
        };
        this.mEventListener = bluetoothEventListener;
        this.mContext = context;
        RcspOpImpl.sUseNewDataHandler = true;
        BluetoothHelper bluetoothHelper = BluetoothHelper.getInstance((Application) context.getApplicationContext());
        this.mBluetoothHelper = bluetoothHelper;
        bluetoothHelper.addBluetoothEventListener(bluetoothEventListener);
        if (bluetoothHelper.isConnectedDevice()) {
            setTargetDevice(bluetoothHelper.getConnectedBtDevice());
        }
    }

    public static WatchManager getInstance(Application application) {
        if (instance == null) {
            synchronized (WatchManager.class) {
                try {
                    if (instance == null) {
                        instance = new WatchManager(1, application);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private ArrayList<FatFile> getWatchList(ArrayList<FatFile> arrayList) {
        if (arrayList == null) {
            return new ArrayList<>();
        }
        ArrayList<FatFile> arrayList2 = new ArrayList<>();
        for (FatFile fatFile : arrayList) {
            if (fatFile.getName().startsWith(DeviceTypes.WATCH) || fatFile.getName().startsWith(WatchTestConstant.DIR_WATCH)) {
                arrayList2.add(fatFile);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetDevice(BluetoothDevice bluetoothDevice) {
        if (BluetoothUtil.deviceEquals(bluetoothDevice, this.mTargetDevice)) {
            return;
        }
        this.mTargetDevice = bluetoothDevice;
        JL_Log.m27882i("jl_rcsp", "-setTargetDevice- device = " + AppUtil.printBtDeviceInfo(bluetoothDevice) + ", connectedDevice = " + AppUtil.printBtDeviceInfo(getTargetDevice()));
        if (bluetoothDevice != null) {
            notifyBtDeviceConnection(bluetoothDevice, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHistoryRecordMsg(BluetoothDevice bluetoothDevice) {
        DeviceInfo deviceInfo;
        if (this.mBluetoothHelper.isConnectedBtDevice(bluetoothDevice) && (deviceInfo = this.mStatusManager.getDeviceInfo(bluetoothDevice)) != null) {
            String bleAddr = this.mBluetoothHelper.getBluetoothOp().isConnectedSppDevice(bluetoothDevice) ? deviceInfo.getBleAddr() : deviceInfo.getEdrAddr();
            if (BluetoothAdapter.checkBluetoothAddress(bleAddr)) {
                this.mBluetoothHelper.getBluetoothOp().getHistoryRecordHelper().updateDeviceInfo(bluetoothDevice, deviceInfo.getSdkType(), bleAddr);
            }
            if (deviceInfo.getVid() == 0 && deviceInfo.getPid() == 0) {
                return;
            }
            this.mBluetoothHelper.getBluetoothOp().getHistoryRecordHelper().updateDeviceIDs(bluetoothDevice, deviceInfo.getVid(), deviceInfo.getVid(), deviceInfo.getPid());
        }
    }

    public BluetoothHelper getBluetoothHelper() {
        return this.mBluetoothHelper;
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public BluetoothDevice getConnectedDevice() {
        return this.mTargetDevice;
    }

    public ArrayList<FatFile> getDevFatFileList() {
        return this.devFatFileList;
    }

    @Override // com.jieli.jl_rcsp.impl.RcspOpImpl
    public DeviceInfo getDeviceInfo(BluetoothDevice bluetoothDevice) {
        return this.mStatusManager.getDeviceInfo(bluetoothDevice);
    }

    public ExternalFlashMsgResponse getExternalFlashMsg(BluetoothDevice bluetoothDevice) {
        return this.mStatusManager.getExtFlashMsg(bluetoothDevice);
    }

    public boolean isExistSDCard() {
        DeviceInfo deviceInfo = getDeviceInfo(getConnectedDevice());
        if (deviceInfo == null) {
            return false;
        }
        boolean zIsSupportSd1 = deviceInfo.isSupportSd1();
        JL_Log.m27876d("jl_rcsp", "-isExistSDCard- ret = " + zIsSupportSd1);
        return zIsSupportSd1;
    }

    public boolean isWatchSystemInit(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && BluetoothUtil.deviceEquals(getConnectedDevice(), bluetoothDevice) && isWatchSystemOk();
    }

    @Override // com.jieli.jl_rcsp.impl.WatchOpImpl, com.jieli.jl_rcsp.impl.RcspOpImpl, com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void release() {
        super.release();
        this.mBluetoothHelper.removeBluetoothEventListener(this.mEventListener);
        instance = null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public boolean sendDataToDevice(BluetoothDevice bluetoothDevice, byte[] bArr) {
        JL_Log.m27876d("write data to device", CHexConver.byte2HexStr(bArr));
        return this.mBluetoothHelper.sendDataToDevice(bluetoothDevice, bArr);
    }
}
