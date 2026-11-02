package com.jieli.bluetooth_connect.data;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.jieli.bluetooth_connect.bean.BluetoothOption;
import com.jieli.bluetooth_connect.bean.history.HistoryRecord;
import com.jieli.bluetooth_connect.data.HistoryRecordDbHelper;
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
    private final ExecutorService mThreadPool = Executors.newSingleThreadExecutor();

    public HistoryRecordDbHelper(Context context, BluetoothOption option, HistoryRecordObserver observer) {
        if (context == null) {
            throw new NullPointerException("Please call initDb method at first!");
        }
        this.mContext = context;
        this.mBtConnectDatabase = BtConnectDatabase.buildDatabase(context);
        this.mObserver = observer;
        syncSystemDeviceList(option);
    }

    public static /* synthetic */ void O00(HistoryRecordDbHelper historyRecordDbHelper, BluetoothDevice bluetoothDevice, int i) {
        HistoryRecord historyRecordByDevice = historyRecordDbHelper.getHistoryRecordByDevice(bluetoothDevice);
        boolean z = historyRecordByDevice == null;
        if (z) {
            historyRecordByDevice = new HistoryRecord();
        } else if (bluetoothDevice.getAddress().equals(historyRecordByDevice.getUpdateAddress())) {
            return;
        }
        historyRecordByDevice.setName(bluetoothDevice.getName());
        historyRecordByDevice.setAddress(bluetoothDevice.getAddress());
        historyRecordByDevice.setDevType(bluetoothDevice.getType());
        historyRecordByDevice.setConnectType(i);
        historyRecordByDevice.setOnlineTime(System.currentTimeMillis());
        JL_Log.m26847d("HistoryRecordDbHelper", "saveHistoryRecord", ConnectUtil.formatString("device : %s, connectWay : %d, isAddRecord = %s", BluetoothUtil.printBtDeviceInfo(historyRecordDbHelper.mContext, bluetoothDevice), Integer.valueOf(i), Boolean.valueOf(z)));
        if (z) {
            historyRecordDbHelper.saveHistoryRecord(historyRecordByDevice);
        } else {
            historyRecordDbHelper.updateHistoryRecord(historyRecordByDevice);
        }
    }

    public static /* synthetic */ void XIi00iiXO(HistoryRecordDbHelper historyRecordDbHelper, BluetoothDevice bluetoothDevice, int i, String str) {
        HistoryRecord historyRecordByDevice = historyRecordDbHelper.getHistoryRecordByDevice(bluetoothDevice);
        if (historyRecordByDevice == null) {
            return;
        }
        historyRecordByDevice.setSdkFlag(i);
        historyRecordByDevice.setMappedAddress(str);
        historyRecordDbHelper.updateHistoryRecord(historyRecordByDevice);
    }

    public static /* synthetic */ void XO0O10(HistoryRecordDbHelper historyRecordDbHelper, BluetoothDevice bluetoothDevice, int i, int i2, int i3) {
        HistoryRecord historyRecordByDevice = historyRecordDbHelper.getHistoryRecordByDevice(bluetoothDevice);
        if (historyRecordByDevice == null) {
            return;
        }
        historyRecordByDevice.setVid(i);
        historyRecordByDevice.setUid(i2);
        historyRecordByDevice.setPid(i3);
        historyRecordDbHelper.updateHistoryRecord(historyRecordByDevice);
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m26837iO(HistoryRecordDbHelper historyRecordDbHelper, BluetoothDevice bluetoothDevice, double d, double d2, int i, long j) {
        HistoryRecord historyRecordByDevice = historyRecordDbHelper.getHistoryRecordByDevice(bluetoothDevice);
        if (historyRecordByDevice != null) {
            if (d == 0.0d && d2 == 0.0d) {
                return;
            }
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                if (d == historyRecordByDevice.getRightDevLatitude() && d2 == historyRecordByDevice.getRightDevLongitude() && j <= historyRecordByDevice.getRightDevUpdateTime()) {
                    return;
                } else {
                    historyRecordByDevice.updateRightDevGpsInfo(d, d2, j);
                }
            } else if (d == historyRecordByDevice.getLeftDevLatitude() && d2 == historyRecordByDevice.getLeftDevLongitude() && j <= historyRecordByDevice.getLeftDevUpdateTime()) {
                return;
            } else {
                historyRecordByDevice.updateLeftDevGpsInfo(d, d2, j);
            }
            historyRecordDbHelper.updateHistoryRecord(historyRecordByDevice);
        }
    }

    public void clearAllHistoryRecord() {
        if (this.mThreadPool.isShutdown()) {
            return;
        }
        this.mThreadPool.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OOi1X1
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRecordDbHelper historyRecordDbHelper = this.f3368IO;
                historyRecordDbHelper.clearHistoryRecords(historyRecordDbHelper.getHistoryRecordList());
            }
        });
    }

    public void clearHistoryRecords(List<HistoryRecord> historyRecords) {
        if (historyRecords == null) {
            return;
        }
        this.mBtConnectDatabase.historyRecordDao().removeHistoryRecords(historyRecords);
        HistoryRecordObserver historyRecordObserver = this.mObserver;
        if (historyRecordObserver != null) {
            historyRecordObserver.onDelete(null);
        }
    }

    public void deleteHistoryRecord(HistoryRecord historyRecord) {
        if (historyRecord == null) {
            return;
        }
        this.mBtConnectDatabase.historyRecordDao().removeHistoryRecord(historyRecord);
        HistoryRecordObserver historyRecordObserver = this.mObserver;
        if (historyRecordObserver != null) {
            historyRecordObserver.onDelete(historyRecord);
        }
    }

    public void destroy() {
        if (this.mThreadPool.isShutdown()) {
            return;
        }
        this.mThreadPool.shutdownNow();
    }

    public HistoryRecord getHistoryRecordByDevice(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        return getHistoryRecordByMac(device.getAddress());
    }

    public HistoryRecord getHistoryRecordByMac(String address) {
        if (BluetoothAdapter.checkBluetoothAddress(address)) {
            return getHistoryRecordDao().getHistoryRecord(address);
        }
        return null;
    }

    public HistoryRecordDao getHistoryRecordDao() {
        return this.mBtConnectDatabase.historyRecordDao();
    }

    public List<HistoryRecord> getHistoryRecordList() {
        return getHistoryRecordDao().getHistoryRecordList();
    }

    public String getMappedAddress(String address) {
        HistoryRecord historyRecordByMac = getHistoryRecordByMac(address);
        if (historyRecordByMac == null) {
            return null;
        }
        return address.equals(historyRecordByMac.getAddress()) ? historyRecordByMac.getMappedAddress() : historyRecordByMac.getAddress();
    }

    public boolean isMatchDevice(String address, String address1) {
        if (!BluetoothAdapter.checkBluetoothAddress(address) || !BluetoothAdapter.checkBluetoothAddress(address1)) {
            return false;
        }
        boolean zEquals = address.equals(address1);
        if (!zEquals) {
            String mappedAddress = getMappedAddress(address);
            if (BluetoothAdapter.checkBluetoothAddress(mappedAddress)) {
                zEquals = mappedAddress.equals(address1);
            }
            if (!zEquals) {
                String mappedAddress2 = getMappedAddress(address1);
                if (BluetoothAdapter.checkBluetoothAddress(mappedAddress2)) {
                    return mappedAddress2.equals(address);
                }
            }
        }
        return zEquals;
    }

    public void saveHistoryRecord(HistoryRecord historyRecord) {
        if (historyRecord == null) {
            return;
        }
        this.mBtConnectDatabase.historyRecordDao().addHistoryRecord(historyRecord);
        HistoryRecordObserver historyRecordObserver = this.mObserver;
        if (historyRecordObserver != null) {
            historyRecordObserver.onInsert(historyRecord);
        }
    }

    public void syncSystemDeviceList(BluetoothOption option) {
        List<HistoryRecord> historyRecordList;
        if ((option == null || !option.isNotAssociatedEDR()) && BluetoothUtil.isBluetoothEnable() && (historyRecordList = getHistoryRecordList()) != null) {
            List<BluetoothDevice> pairedDevices = BluetoothUtil.getPairedDevices(this.mContext);
            ArrayList arrayList = new ArrayList();
            for (HistoryRecord historyRecord : historyRecordList) {
                if (historyRecord.getConnectType() != 0 && historyRecord.getMappedAddress() != null) {
                    if (pairedDevices != null) {
                        Iterator<BluetoothDevice> it = pairedDevices.iterator();
                        while (it.hasNext()) {
                            if (isMatchDevice(historyRecord.getAddress(), it.next().getAddress())) {
                                historyRecord = null;
                                break;
                            }
                        }
                    }
                    if (historyRecord != null) {
                        arrayList.add(historyRecord);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            clearHistoryRecords(arrayList);
        }
    }

    public void updateDeviceIDs(final BluetoothDevice device, final int vid, final int uid, final int pid) {
        if (device == null || this.mThreadPool.isShutdown()) {
            return;
        }
        this.mThreadPool.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O0iOIIiIi
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRecordDbHelper.XO0O10(this.f2596IO, device, vid, uid, pid);
            }
        });
    }

    public void updateDeviceInfo(final BluetoothDevice device, final int sdkFlag, final String mappedAddress) {
        if (device == null || this.mThreadPool.isShutdown()) {
            return;
        }
        this.mThreadPool.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IXX1IiO0
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRecordDbHelper.XIi00iiXO(this.f2092IO, device, sdkFlag, mappedAddress);
            }
        });
    }

    public void updateGpsInfo(final BluetoothDevice device, final int devFlag, final double latitude, final double longitude, final long updateTime) {
        if (device == null || this.mThreadPool.isShutdown()) {
            return;
        }
        this.mThreadPool.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.Xii11
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRecordDbHelper.m26837iO(this.f5366IO, device, latitude, longitude, devFlag, updateTime);
            }
        });
    }

    public void updateHistoryRecord(HistoryRecord historyRecord) {
        if (historyRecord == null) {
            return;
        }
        this.mBtConnectDatabase.historyRecordDao().updateHistoryRecord(historyRecord);
        HistoryRecordObserver historyRecordObserver = this.mObserver;
        if (historyRecordObserver != null) {
            historyRecordObserver.onModify(historyRecord);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void saveHistoryRecord(final BluetoothDevice device, final int connectWay) {
        if (device == null || this.mThreadPool.isShutdown() || !ConnectUtil.isHasConnectPermission(this.mContext)) {
            return;
        }
        this.mThreadPool.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O1OXi
            @Override // java.lang.Runnable
            public final void run() {
                HistoryRecordDbHelper.O00(this.f2764IO, device, connectWay);
            }
        });
    }
}
