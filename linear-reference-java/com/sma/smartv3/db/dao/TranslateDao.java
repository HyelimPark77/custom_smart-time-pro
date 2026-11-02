package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.TranslateEntity;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface TranslateDao {
    @Delete
    void delete(@aa1 TranslateEntity r1);

    @Query("\n        SELECT t.*\n        FROM TranslateEntity t\n        INNER JOIN (\n            SELECT sessionId, MIN(createTime) AS firstTime\n            FROM TranslateEntity\n            GROUP BY sessionId\n        ) grouped ON t.sessionId = grouped.sessionId AND t.createTime = grouped.firstTime\n        ORDER BY t.createTime ASC\n    ")
    @aa1
    List<TranslateEntity> getFirstTranslatePerSession();

    @Query("SELECT * from TranslateEntity where sessionId=:sessionId")
    @aa1
    List<TranslateEntity> getTranslateEntityWithSessionId(@aa1 String r1);

    @Insert(onConflict = 1)
    long insert(@aa1 TranslateEntity r1);

    @Insert(onConflict = 5)
    @aa1
    List<Long> insertAll(@aa1 List<TranslateEntity> r1);

    @Update
    void update(@aa1 TranslateEntity r1);
}
