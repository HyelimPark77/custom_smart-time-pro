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
public interface RecordDeviceFileDao {
    @Delete
    void delete(@aa1 List<RecordDeviceFile> list);

    @Query("DELETE FROM RecordDeviceFile")
    void deleteAll();

    @Query("DELETE FROM RecordDeviceFile WHERE mId = :id")
    void deleteById(long j);

    @Query("SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 4 OR mFileType == 5 ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getAlbumListAll();

    @Query("SELECT * FROM RecordDeviceFile WHERE mId = :id")
    @aa1
    RecordDeviceFile getDeviceFiletById(long j);

    @Query("SELECT * FROM RecordDeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getFavorityList();

    @Query("SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 5 ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getListAll();

    @Query("SELECT * FROM RecordDeviceFile WHERE mFileType == :fileType ORDER BY mTime DESC")
    @aa1
    List<RecordDeviceFile> getListByType(int i);

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<RecordDeviceFile> list);

    @Query("\n        SELECT * FROM RecordDeviceFile \n        WHERE LOWER(mName) LIKE '%.aac' \n        AND SUBSTR(mName, 1, LENGTH(mName) - 4) LIKE '%' || :keyword || '%' COLLATE NOCASE \n        ORDER BY mTime DESC\n        ")
    @aa1
    List<RecordDeviceFile> searchByNameIgnoreCase(@aa1 String str);

    @Update
    int update(@aa1 List<RecordDeviceFile> list);
}
