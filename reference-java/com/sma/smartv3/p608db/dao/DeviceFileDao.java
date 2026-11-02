package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.RecordDeviceFile;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface DeviceFileDao {
    @Delete
    void delete(@aa1 List<RecordDeviceFile> list);

    @Query("DELETE FROM DeviceFile")
    void deleteAll();

    @Query("DELETE FROM DeviceFile WHERE mId = :id")
    void deleteById(long j);

    @Query("SELECT * FROM DeviceFile WHERE mFileType == 1 OR mFileType == 2 ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getAlbumListAll();

    @Query("SELECT * FROM DeviceFile WHERE mId = :id")
    @aa1
    RecordDeviceFile getDeviceFiletById(long j);

    @Query("SELECT * FROM DeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getFavorityList();

    @Query("SELECT * FROM DeviceFile WHERE mFileType == :fileType ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getListByType(int i);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<RecordDeviceFile> list);

    @Update
    int update(@aa1 List<RecordDeviceFile> list);
}
