package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.AlipayBindInfo;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface AlipayBindInfoDao {
    @Query("SELECT * FROM AlipayBindInfo WHERE  mIsSync = 0  AND mTime > 0 ORDER BY mTime ASC LIMIT 150")
    @aa1
    List<AlipayBindInfo> getListASC();

    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<AlipayBindInfo> list);

    @Update
    int update(@aa1 List<AlipayBindInfo> list);
}
