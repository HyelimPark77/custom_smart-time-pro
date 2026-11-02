package com.sma.smartv3.p608db.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.DeviceInfoDao;
import com.sma.smartv3.p608db.entity.BleDeviceCache;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleDeviceCache {

    @aa1
    private static final String TAG = "BleDeviceCache";

    @tb1
    private static RecordDeviceInfo mDeviceInfo;

    @aa1
    public static final BleDeviceCache INSTANCE = new BleDeviceCache();

    @aa1
    private static final Lazy mDeviceInfoDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BleDeviceCache.mDeviceInfoDao_delegate$lambda$0();
        }
    });

    private BleDeviceCache() {
    }

    private final DeviceInfoDao getMDeviceInfoDao() {
        return (DeviceInfoDao) mDeviceInfoDao$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceInfoDao mDeviceInfoDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().deviceInfoDao();
    }

    public final void addDeviceInfo(@aa1 RecordDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache addDeviceInfo: " + deviceInfo);
        getMDeviceInfoDao().insertOrUpdate(deviceInfo);
    }

    @tb1
    public final RecordDeviceInfo getActiveDeviceInfo() {
        return getMDeviceInfoDao().getActiveDevice();
    }

    @tb1
    public final RecordDeviceInfo getDeviceInfo(@aa1 String mac) {
        Intrinsics.X0O(mac, "mac");
        return getMDeviceInfoDao().getDeviceByMac(mac);
    }

    @aa1
    public final List<RecordDeviceInfo> getDeviceInfos() {
        return getMDeviceInfoDao().getAllDevices();
    }

    @tb1
    public final RecordDeviceInfo getMDeviceInfo() {
        return mDeviceInfo;
    }

    public final void removeDeviceInfo(@aa1 RecordDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache removeDeviceInfo: " + deviceInfo);
        getMDeviceInfoDao().deleteByMac(deviceInfo.getMMac());
    }

    public final void setActiveDeviceInfo(@aa1 RecordDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        mDeviceInfo = deviceInfo;
        if (deviceInfo != null) {
            deviceInfo.setActive(true);
        }
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache setActiveDeviceInfo: " + deviceInfo);
        getMDeviceInfoDao().setActiveDevice(deviceInfo.getMMac());
    }

    public final void setMDeviceInfo(@tb1 RecordDeviceInfo recordDeviceInfo) {
        mDeviceInfo = recordDeviceInfo;
    }

    public final void updateDeviceInfo(@aa1 RecordDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        if (deviceInfo.isActive()) {
            mDeviceInfo = deviceInfo;
        }
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache updateDeviceInfo: " + deviceInfo);
        getMDeviceInfoDao().insertOrUpdate(deviceInfo);
    }
}
