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
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class WatchManager extends WatchOpImpl {
    private static final String TAG = "WatchManager";
    private static volatile WatchManager instance;
    private ArrayList<FatFile> devFatFileList;
    private final BluetoothHelper mBluetoothHelper;
    private Context mContext;
    private final BluetoothEventListener mEventListener;
    private BluetoothDevice mTargetDevice;

    static {
    }

    private WatchManager(int r2, Context r3) {
        super(r2);
        BluetoothEventListener r4 = new AnonymousClass1(this);
        this.mEventListener = r4;
        this.mContext = r3;
        RcspOpImpl.sUseNewDataHandler = true;
        BluetoothHelper r5 = BluetoothHelper.getInstance((Application) r3.getApplicationContext());
        this.mBluetoothHelper = r5;
        r5.addBluetoothEventListener(r4);
        if (r5.isConnectedDevice() == false) goto L6;
        setTargetDevice(r5.getConnectedBtDevice());
        return;
    }

    public static /* synthetic */ void access$000(WatchManager r0, BluetoothDevice r1) {
        r0.updateHistoryRecordMsg(r1);
    }

    public static /* synthetic */ BluetoothHelper access$100(WatchManager r0) {
        return r0.mBluetoothHelper;
    }

    public static /* synthetic */ void access$200(WatchManager r0, BluetoothDevice r1) {
        r0.setTargetDevice(r1);
    }

    public static /* synthetic */ BluetoothDevice access$300(WatchManager r0) {
        return r0.mTargetDevice;
    }

    public static WatchManager getInstance(Application r3) {
        if (instance != null) goto L16;
        monitor-enter(WatchManager.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (instance != null) goto L11;
        instance = new WatchManager(1, r3);     // Catch: Throwable -> L9
    L11:
        monitor-exit(WatchManager.class);     // Catch: Throwable -> L9
    L16:
        return instance;
    }

    private ArrayList<FatFile> getWatchList(ArrayList<FatFile> r5) {
        if (r5 == null) goto L4;
        ArrayList<FatFile> r0 = new ArrayList();
        Iterator<FatFile> r6 = r5.iterator();
    L7:
        if (r6.hasNext() == false) goto L13;
        FatFile r1 = r6.next();
        if (r1.getName().startsWith(DeviceTypes.WATCH) == true) goto L12;
        if (r1.getName().startsWith(WatchTestConstant.DIR_WATCH) == false) goto L7;
    L12:
        r0.add(r1);
        goto L7
    L13:
        return r0;
    L4:
        return new ArrayList();
    }

    private void setTargetDevice(BluetoothDevice r4) {
        if (BluetoothUtil.deviceEquals(r4, this.mTargetDevice) == true) goto L8;
        this.mTargetDevice = r4;
        JL_Log.i("jl_rcsp", "-setTargetDevice- device = " + AppUtil.printBtDeviceInfo(r4) + ", connectedDevice = " + AppUtil.printBtDeviceInfo(getTargetDevice()));
        if (r4 == null) goto L9;
        notifyBtDeviceConnection(r4, 1);
        return;
    L9:
        return;
    }

    private void updateHistoryRecordMsg(BluetoothDevice r5) {
        if (this.mBluetoothHelper.isConnectedBtDevice(r5) == false) goto L23;
        DeviceInfo r0 = this.mStatusManager.getDeviceInfo(r5);
        if (r0 != null) goto L9;
        return;
    L9:
        if (this.mBluetoothHelper.getBluetoothOp().isConnectedSppDevice(r5) != true) goto L11;
        String r1 = r0.getBleAddr();
    L13:
        if (BluetoothAdapter.checkBluetoothAddress(r1) == false) goto L16;
        this.mBluetoothHelper.getBluetoothOp().getHistoryRecordHelper().updateDeviceInfo(r5, r0.getSdkType(), r1);
    L16:
        if (r0.getVid() == 0) goto L18;
    L21:
        this.mBluetoothHelper.getBluetoothOp().getHistoryRecordHelper().updateDeviceIDs(r5, r0.getVid(), r0.getVid(), r0.getPid());
        return;
    L18:
        if (r0.getPid() != 0) goto L21;
        return;
    L11:
        r1 = r0.getEdrAddr();
        goto L13
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
    public DeviceInfo getDeviceInfo(BluetoothDevice r2) {
        return this.mStatusManager.getDeviceInfo(r2);
    }

    public ExternalFlashMsgResponse getExternalFlashMsg(BluetoothDevice r2) {
        return this.mStatusManager.getExtFlashMsg(r2);
    }

    public boolean isExistSDCard() {
        DeviceInfo r0 = getDeviceInfo(getConnectedDevice());
        if (r0 != null) goto L6;
        return false;
    L6:
        boolean r1 = r0.isSupportSd1();
        JL_Log.d("jl_rcsp", "-isExistSDCard- ret = " + r1);
        return r1;
    }

    public boolean isWatchSystemInit(BluetoothDevice r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if (BluetoothUtil.deviceEquals(getConnectedDevice(), r3) == true) goto L8;
    L11:
        return false;
    L8:
        if (isWatchSystemOk() == false) goto L11;
        return true;
    }

    @Override // com.jieli.jl_rcsp.impl.WatchOpImpl, com.jieli.jl_rcsp.impl.RcspOpImpl, com.jieli.jl_rcsp.interfaces.rcsp.IRcspOp
    public void release() {
        super.release();
        this.mBluetoothHelper.removeBluetoothEventListener(this.mEventListener);
        instance = null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.bluetooth.IBluetoothProxy
    public boolean sendDataToDevice(BluetoothDevice r3, byte[] r4) {
        JL_Log.d("write data to device", CHexConver.byte2HexStr(r4));
        return this.mBluetoothHelper.sendDataToDevice(r3, r4);
    }
}
