package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.RecordDeviceInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface DeviceInfoDao {

    public static final class DefaultImpls {
        @Transaction
        @Deprecated
        public static void setActiveDevice(@aa1 DeviceInfoDao r1, @aa1 String r2) {
            Intrinsics.X0O(r2, "mac");
            DeviceInfoDao.access$setActiveDevice$jd(r1, r2);
        }
    }

    static /* synthetic */ void access$setActiveDevice$jd(DeviceInfoDao r0, String r1) {
        super.setActiveDevice(r1);
    }

    @Query("UPDATE RecordDeviceInfo SET isActive = 0")
    int clearActiveStatus();

    @Delete
    int delete(@aa1 RecordDeviceInfo r1);

    @Query("DELETE FROM RecordDeviceInfo")
    int deleteAll();

    @Query("DELETE FROM RecordDeviceInfo WHERE mMac = :mac")
    int deleteByMac(@aa1 String r1);

    @tb1
    @Query("SELECT * FROM RecordDeviceInfo ORDER BY isActive DESC, mId ASC LIMIT 1")
    RecordDeviceInfo getActiveDevice();

    @Query("SELECT * FROM RecordDeviceInfo")
    @aa1
    List<RecordDeviceInfo> getAllDevices();

    @tb1
    @Query("SELECT * FROM RecordDeviceInfo WHERE mMac = :mac")
    RecordDeviceInfo getDeviceByMac(@aa1 String r1);

    @Query("SELECT COUNT(*) FROM RecordDeviceInfo")
    int getDeviceCount();

    @Query("SELECT EXISTS(SELECT 1 FROM RecordDeviceInfo LIMIT 1)")
    boolean hasDevices();

    @Insert(onConflict = 1)
    long insertOrUpdate(@aa1 RecordDeviceInfo r1);

    @Insert(onConflict = 1)
    @aa1
    long[] insertOrUpdateList(@aa1 List<RecordDeviceInfo> r1);

    @Transaction
    default void setActiveDevice(@aa1 String r2) {
        Intrinsics.X0O(r2, "mac");
        clearActiveStatus();
        setDeviceActive(r2);
    }

    @Query("UPDATE RecordDeviceInfo SET isActive = 1 WHERE mMac = :mac")
    int setDeviceActive(@aa1 String r1);

    @Update
    int update(@aa1 RecordDeviceInfo r1);
}
