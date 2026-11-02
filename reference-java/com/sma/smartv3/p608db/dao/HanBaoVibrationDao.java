package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.HanBaoVibration;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface HanBaoVibrationDao {
    @Insert(onConflict = 1)
    @aa1
    long[] insert(@aa1 List<HanBaoVibration> list);

    @Update
    int update(@aa1 List<HanBaoVibration> list);
}
