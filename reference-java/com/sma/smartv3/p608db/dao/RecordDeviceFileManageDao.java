package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.RecordDeviceManage;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface RecordDeviceFileManageDao {
    @Delete
    void delete(@aa1 List<RecordDeviceManage> list);

    @Query("DELETE FROM RecordDeviceManage")
    void deleteAll();

    @Query("DELETE FROM RecordDeviceManage WHERE mId = :id")
    void deleteById(long j);

    @Query("SELECT * FROM RecordDeviceManage WHERE mId = :id")
    @aa1
    RecordDeviceManage getDeviceFiletById(long j);

    @Query("SELECT * FROM RecordDeviceManage ")
    @aa1
    List<RecordDeviceManage> getListAll();

    @Query("SELECT * FROM RecordDeviceManage WHERE mFileName == :fileName ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceManage> getListByType(@aa1 String str);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<RecordDeviceManage> list);

    @Query("SELECT * FROM RecordDeviceManage WHERE REPLACE(LOWER(mName), '.aac', '') LIKE '%' || LOWER(:keyword) || '%' ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceManage> searchByNameIgnoreCase(@aa1 String str);

    @Update
    int update(@aa1 List<RecordDeviceManage> list);
}
