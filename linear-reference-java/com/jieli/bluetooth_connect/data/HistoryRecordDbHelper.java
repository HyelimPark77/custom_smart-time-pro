package com.jieli.bluetooth_connect.data;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.android.mltcode.paycertificationapi.IXX1IiO0;
import com.android.mltcode.paycertificationapi.O0iOIIiIi;
import com.android.mltcode.paycertificationapi.O1OXi;
import com.android.mltcode.paycertificationapi.OOi1X1;
import com.android.mltcode.paycertificationapi.Xii11;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.data.dao.HistoryRecordDao;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.jieli.bluetooth_connect.util.JL_Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class HistoryRecordDbHelper {
    private final BtConnectDatabase mBtConnectDatabase;
    private final Context mContext;
    private final HistoryRecordObserver mObserver;
    private final ExecutorService mThreadPool;

    public HistoryRecordDbHelper(Context context, BluetoothOption option, HistoryRecordObserver observer) {
        this.mThreadPool = Executors.newSingleThreadExecutor();
        if (context == null) goto L7;
        this.mContext = context;
        this.mBtConnectDatabase = BtConnectDatabase.buildDatabase(context);
        this.mObserver = observer;
        syncSystemDeviceList(option);
        return;
    L7:
        throw new NullPointerException("Please call initDb method at first!");
    }

    public static /* synthetic */ void O00(HistoryRecordDbHelper r4, BluetoothDevice r5, int r6) {
        HistoryRecord r0 = r4.getHistoryRecordByDevice(r5);
        if (r0 != null) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L9;
        r0 = new HistoryRecord();
    L11:
        r0.setName(r5.getName());
        r0.setAddress(r5.getAddress());
        r0.setDevType(r5.getType());
        r0.setConnectType(r6);
        r0.setOnlineTime(System.currentTimeMillis());
        JL_Log.d("HistoryRecordDbHelper", "saveHistoryRecord", ConnectUtil.formatString("device : %s, connectWay : %d, isAddRecord = %s", new Object[]{BluetoothUtil.printBtDeviceInfo(r4.mContext, r5), Integer.valueOf(r6), Boolean.valueOf(r1)}));
        if (r1 == false) goto L15;
        r4.saveHistoryRecord(r0);
        return;
    L15:
        r4.updateHistoryRecord(r0);
        return;
    L9:
        if (r5.getAddress().equals(r0.getUpdateAddress()) == false) goto L11;
        return;
    L5:
        r1 = false;
        goto L6
    }

    public static /* synthetic */ void OXO1(HistoryRecordDbHelper r1) {
        r1.clearHistoryRecords(r1.getHistoryRecordList());
    }

    public static /* synthetic */ void XIi00iiXO(HistoryRecordDbHelper r0, BluetoothDevice r1, int r2, String r3) {
        HistoryRecord r4 = r0.getHistoryRecordByDevice(r1);
        if (r4 != null) goto L5;
        return;
    L5:
        r4.setSdkFlag(r2);
        r4.setMappedAddress(r3);
        r0.updateHistoryRecord(r4);
    }

    public static /* synthetic */ void XO0O10(HistoryRecordDbHelper r0, BluetoothDevice r1, int r2, int r3, int r4) {
        HistoryRecord r5 = r0.getHistoryRecordByDevice(r1);
        if (r5 != null) goto L5;
        return;
    L5:
        r5.setVid(r2);
        r5.setUid(r3);
        r5.setPid(r4);
        r0.updateHistoryRecord(r5);
    }

    public static /* synthetic */ void iO(HistoryRecordDbHelper r3, BluetoothDevice r4, double r5, double r7, int r9, long r10) {
        HistoryRecord r6 = r3.getHistoryRecordByDevice(r4);
        if (r6 != null) goto L5;
        return;
    L5:
        if (r5 == 0.0d) goto L7;
    L9:
        if (r9 == 0) goto L21;
        if (r9 == 1) goto L14;
        return;
    L14:
        if (r5 == r6.getRightDevLatitude()) goto L16;
    L19:
        r6.updateRightDevGpsInfo(r5, r7, r10);
    L27:
        r3.updateHistoryRecord(r6);
        return;
    L16:
        if (r7 != r6.getRightDevLongitude()) goto L19;
        if (r10 > r6.getRightDevUpdateTime()) goto L19;
        return;
    L21:
        if (r5 == r6.getLeftDevLatitude()) goto L23;
    L26:
        r6.updateLeftDevGpsInfo(r5, r7, r10);
        goto L27
    L23:
        if (r7 != r6.getLeftDevLongitude()) goto L26;
        if (r10 > r6.getLeftDevUpdateTime()) goto L26;
        return;
    L7:
        if (r7 != 0.0d) goto L9;
    }

    public void clearAllHistoryRecord() {
        if (this.mThreadPool.isShutdown() == false) goto L5;
        return;
    L5:
        this.mThreadPool.submit(new OOi1X1(this));
    }

    public void clearHistoryRecords(List<HistoryRecord> historyRecords) {
        if (historyRecords == null) goto L9;
        this.mBtConnectDatabase.historyRecordDao().removeHistoryRecords(historyRecords);
        HistoryRecordObserver r2 = this.mObserver;
        if (r2 == null) goto L8;
        r2.onDelete(null);
        return;
    L8:
        return;
    }

    public void deleteHistoryRecord(HistoryRecord historyRecord) {
        if (historyRecord == null) goto L9;
        this.mBtConnectDatabase.historyRecordDao().removeHistoryRecord(historyRecord);
        HistoryRecordObserver r0 = this.mObserver;
        if (r0 == null) goto L8;
        r0.onDelete(historyRecord);
        return;
    L8:
        return;
    }

    public void destroy() {
        if (this.mThreadPool.isShutdown() == true) goto L6;
        this.mThreadPool.shutdownNow();
        return;
    }

    public HistoryRecord getHistoryRecordByDevice(BluetoothDevice device) {
        if (device != null) goto L6;
        return null;
    L6:
        return getHistoryRecordByMac(device.getAddress());
    }

    public HistoryRecord getHistoryRecordByMac(String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L7;
        return null;
    L7:
        return getHistoryRecordDao().getHistoryRecord(address);
    }

    public HistoryRecordDao getHistoryRecordDao() {
        return this.mBtConnectDatabase.historyRecordDao();
    }

    public List<HistoryRecord> getHistoryRecordList() {
        return getHistoryRecordDao().getHistoryRecordList();
    }

    public String getMappedAddress(String address) {
        HistoryRecord r0 = getHistoryRecordByMac(address);
        if (r0 != null) goto L7;
        return null;
    L7:
        if (address.equals(r0.getAddress()) == false) goto L11;
        return r0.getMappedAddress();
    L11:
        return r0.getAddress();
    }

    public boolean isMatchDevice(String address, String address1) {
        if (BluetoothAdapter.checkBluetoothAddress(address) == true) goto L5;
        return false;
    L5:
        if (BluetoothAdapter.checkBluetoothAddress(address1) == false) goto L19;
        boolean r0 = address.equals(address1);
        if (r0 == true) goto L16;
        String r1 = getMappedAddress(address);
        if (BluetoothAdapter.checkBluetoothAddress(r1) == false) goto L11;
        r0 = r1.equals(address1);
    L11:
        if (r0 == true) goto L16;
        String r5 = getMappedAddress(address1);
        if (BluetoothAdapter.checkBluetoothAddress(r5) == false) goto L16;
        return r5.equals(address);
    L16:
        return r0;
    L19:
        return false;
    }

    public void saveHistoryRecord(HistoryRecord historyRecord) {
        if (historyRecord == null) goto L9;
        this.mBtConnectDatabase.historyRecordDao().addHistoryRecord(historyRecord);
        HistoryRecordObserver r0 = this.mObserver;
        if (r0 == null) goto L8;
        r0.onInsert(historyRecord);
        return;
    L8:
        return;
    }

    public void syncSystemDeviceList(BluetoothOption option) {
        if (option == null) goto L7;
        if (option.isNotAssociatedEDR() == false) goto L7;
        return;
    L7:
        if (BluetoothUtil.isBluetoothEnable() == false) goto L47;
        List<HistoryRecord> r7 = getHistoryRecordList();
        if (r7 == null) goto L48;
        List<BluetoothDevice> r0 = BluetoothUtil.getPairedDevices(this.mContext);
        ArrayList r1 = new ArrayList();
        Iterator<HistoryRecord> r8 = r7.iterator();
    L14:
        if (r8.hasNext() == false) goto L30;
        HistoryRecord r2 = r8.next();
        if (r2.getConnectType() == 0) goto L14;
        if (r2.getMappedAddress() == null) goto L14;
        if (r0 == null) goto L27;
        Iterator<BluetoothDevice> r3 = r0.iterator();
    L23:
        if (r3.hasNext() == false) goto L27;
        BluetoothDevice r4 = r3.next();
        if (isMatchDevice(r2.getAddress(), r4.getAddress()) == false) goto L23;
        r2 = null;
    L27:
        if (r2 == null) goto L14;
        r1.add(r2);
        goto L14
    L30:
        if (r1.isEmpty() == true) goto L45;
        clearHistoryRecords(r1);
        return;
    L45:
        return;
    L48:
        return;
    }

    public void updateDeviceIDs(final BluetoothDevice device, final int vid, final int uid, final int pid) {
        if (device != null) goto L4;
        return;
    L4:
        if (this.mThreadPool.isShutdown() == true) goto L9;
        this.mThreadPool.submit(new O0iOIIiIi(this, device, vid, uid, pid));
        return;
    }

    public void updateDeviceInfo(final BluetoothDevice device, final int sdkFlag, final String mappedAddress) {
        if (device != null) goto L4;
        return;
    L4:
        if (this.mThreadPool.isShutdown() == true) goto L9;
        this.mThreadPool.submit(new IXX1IiO0(this, device, sdkFlag, mappedAddress));
        return;
    }

    public void updateGpsInfo(final BluetoothDevice device, final int devFlag, final double latitude, final double longitude, final long updateTime) {
        if (device != null) goto L4;
        return;
    L4:
        if (this.mThreadPool.isShutdown() == true) goto L9;
        this.mThreadPool.submit(new Xii11(this, device, latitude, longitude, devFlag, updateTime));
        return;
    }

    public void updateHistoryRecord(HistoryRecord historyRecord) {
        if (historyRecord == null) goto L9;
        this.mBtConnectDatabase.historyRecordDao().updateHistoryRecord(historyRecord);
        HistoryRecordObserver r0 = this.mObserver;
        if (r0 == null) goto L8;
        r0.onModify(historyRecord);
        return;
    L8:
        return;
    }

    @SuppressLint({"MissingPermission"})
    public void saveHistoryRecord(final BluetoothDevice device, final int connectWay) {
        if (device != null) goto L4;
        return;
    L4:
        if (this.mThreadPool.isShutdown() == false) goto L6;
        return;
    L6:
        if (ConnectUtil.isHasConnectPermission(this.mContext) == false) goto L12;
        this.mThreadPool.submit(new O1OXi(this, device, connectWay));
        return;
    }
}
