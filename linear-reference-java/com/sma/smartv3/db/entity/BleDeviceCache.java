package com.sma.smartv3.db.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1X1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.DeviceInfoDao;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleDeviceCache {

    @aa1
    public static final BleDeviceCache INSTANCE = null;

    @aa1
    private static final String TAG = "BleDeviceCache";

    @tb1
    private static RecordDeviceInfo mDeviceInfo;

    @aa1
    private static final Lazy mDeviceInfoDao$delegate = null;

    static {
        INSTANCE = new BleDeviceCache();
        mDeviceInfoDao$delegate = LazyKt__LazyJVMKt.iO(new i1X1());
    }

    private BleDeviceCache() {
    }

    public static /* synthetic */ DeviceInfoDao OXO1() {
        return mDeviceInfoDao_delegate$lambda$0();
    }

    private final DeviceInfoDao getMDeviceInfoDao() {
        return (DeviceInfoDao) mDeviceInfoDao$delegate.getValue();
    }

    private static final DeviceInfoDao mDeviceInfoDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().deviceInfoDao();
    }

    public final void addDeviceInfo(@aa1 RecordDeviceInfo r4) {
        Intrinsics.X0O(r4, "deviceInfo");
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache addDeviceInfo: " + r4);
        getMDeviceInfoDao().insertOrUpdate(r4);
    }

    @tb1
    public final RecordDeviceInfo getActiveDeviceInfo() {
        return getMDeviceInfoDao().getActiveDevice();
    }

    @tb1
    public final RecordDeviceInfo getDeviceInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "mac");
        return getMDeviceInfoDao().getDeviceByMac(r2);
    }

    @aa1
    public final List<RecordDeviceInfo> getDeviceInfos() {
        return getMDeviceInfoDao().getAllDevices();
    }

    @tb1
    public final RecordDeviceInfo getMDeviceInfo() {
        return mDeviceInfo;
    }

    public final void removeDeviceInfo(@aa1 RecordDeviceInfo r4) {
        Intrinsics.X0O(r4, "deviceInfo");
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache removeDeviceInfo: " + r4);
        getMDeviceInfoDao().deleteByMac(r4.getMMac());
    }

    public final void setActiveDeviceInfo(@aa1 RecordDeviceInfo r4) {
        Intrinsics.X0O(r4, "deviceInfo");
        mDeviceInfo = r4;
        if (r4 == null) goto L5;
        r4.setActive(true);
    L5:
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache setActiveDeviceInfo: " + r4);
        getMDeviceInfoDao().setActiveDevice(r4.getMMac());
    }

    public final void setMDeviceInfo(@tb1 RecordDeviceInfo r1) {
        mDeviceInfo = r1;
    }

    public final void updateDeviceInfo(@aa1 RecordDeviceInfo r4) {
        Intrinsics.X0O(r4, "deviceInfo");
        if (r4.isActive() == false) goto L5;
        mDeviceInfo = r4;
    L5:
        i1O0OXO1O.OXO1.OXO1("BleDeviceCache updateDeviceInfo: " + r4);
        getMDeviceInfoDao().insertOrUpdate(r4);
    }
}
