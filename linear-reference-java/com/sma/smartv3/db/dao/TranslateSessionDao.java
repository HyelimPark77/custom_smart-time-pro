package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.TranslateSessionEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithTranslation;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface TranslateSessionDao {
    @Delete
    void delete(@aa1 TranslateSessionEntity r1);

    @Query("\n    SELECT \n        parent.*,\n        child.sessionId AS child_sessionId,\n        child.requestId AS child_requestId,\n        child.text AS child_text,\n        child.translate AS child_translate,\n        child.duration AS child_duration,\n        child.createTime AS child_createTime,\n        child.audioPath AS child_audioPath,\n        child.fromLanguage AS child_fromLanguage,\n        child.toLanguage AS child_toLanguage,\n        child.isUpLoaded AS child_isUpLoaded,\n        child.showType as child_showType\n        \n    FROM TranslateSessionEntity AS parent\n    LEFT JOIN TranslateEntity AS child\n        ON child.requestId = (\n            SELECT requestId\n            FROM TranslateEntity\n            WHERE sessionId = parent.sessionId\n            ORDER BY createTime ASC\n            LIMIT 1\n        )\n     WHERE parent.isDelete = 0\n     ORDER BY parent.createTime DESC\n     ")
    @aa1
    List<TranslateSessionWithFirstEntity> getAllSessionsWithFirstEntity();

    @Query("select * from translatesessionentity")
    @aa1
    List<TranslateSessionEntity> getAllTranslationList();

    @tb1
    @Query("select * from translatesessionentity ORDER BY createTime DESC limit 1")
    TranslateSessionEntity getTranslateFirst();

    @Insert(onConflict = 3)
    long insert(@aa1 TranslateSessionEntity r1);

    @tb1
    @Query("select * from  translatesessionentity where sessionId = :sessionId")
    TranslateSessionWithTranslation queryBySessionId(@aa1 String r1);

    @tb1
    @Query("select * from  translatesessionentity where sessionId = :sessionId")
    TranslateSessionEntity querySessionById(@aa1 String r1);

    @Update
    int update(@aa1 TranslateSessionEntity r1);
}
