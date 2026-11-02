package com.sma.smartv3.p608db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.p608db.entity.MatchLog;
import com.sma.smartv3.p608db.entity.MatchPeriod;
import com.sma.smartv3.p608db.entity.MatchRecord;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@SourceDebugExtension({"SMAP\nMatchRecordDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchRecordDao.kt\ncom/sma/smartv3/db/dao/MatchRecordDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1869#2,2:75\n1869#2:77\n1869#2,2:78\n1869#2,2:80\n1870#2:82\n*S KotlinDebug\n*F\n+ 1 MatchRecordDao.kt\ncom/sma/smartv3/db/dao/MatchRecordDao\n*L\n17#1:75,2\n25#1:77\n27#1:78,2\n32#1:80,2\n25#1:82\n*E\n"})
public interface MatchRecordDao {

    public static final class DefaultImpls {
        @Deprecated
        public static void delete(@aa1 MatchRecordDao matchRecordDao, int i) {
            MatchRecordDao.super.delete(i);
        }

        @aa1
        @Deprecated
        public static List<MatchRecord> getMatchRecords(@aa1 MatchRecordDao matchRecordDao, int i, int i2) {
            return MatchRecordDao.super.getMatchRecords(i, i2);
        }

        @Deprecated
        public static void insert(@aa1 MatchRecordDao matchRecordDao, @aa1 List<MatchRecord> list) {
            Intrinsics.X0O(list, "list");
            MatchRecordDao.super.insert(list);
        }
    }

    @Query("DELETE FROM MatchLog WHERE mMatchRecordId = :matchRecordId")
    void _deleteMatchLogById(int i);

    @Query("DELETE FROM MatchPeriod WHERE mMatchRecordId = :matchRecordId")
    void _deleteMatchPeriodById(int i);

    @Query("DELETE FROM MatchRecord WHERE mId = :id")
    void _deleteMatchRecordById(int i);

    @Query("SELECT * FROM MatchLog WHERE mMatchRecordId = :matchRecordId")
    @aa1
    List<MatchLog> _getMatchLogById(int i);

    @Query("SELECT * FROM MatchPeriod WHERE mMatchRecordId = :matchRecordId")
    @aa1
    List<MatchPeriod> _getMatchPeriodsById(int i);

    @Query("SELECT * FROM MatchRecord WHERE  mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<MatchRecord> _getMatchRecords(int i, int i2);

    @Insert(onConflict = 1)
    @aa1
    long[] _insertMatchLog(@aa1 List<MatchLog> list);

    @Insert(onConflict = 1)
    @aa1
    long[] _insertMatchPeriod(@aa1 List<MatchPeriod> list);

    @Insert(onConflict = 1)
    long _insertMatchRecord(@aa1 MatchRecord matchRecord);

    default void delete(int i) {
        _deleteMatchLogById(i);
        _deleteMatchPeriodById(i);
        _deleteMatchRecordById(i);
    }

    @Query("SELECT * FROM MatchRecord WHERE mIsDelete != 1")
    @aa1
    List<MatchRecord> getList();

    @Query("SELECT * FROM MatchRecord WHERE mIsDelete != 1 AND mSource = :source")
    @aa1
    List<MatchRecord> getListBySource(int i);

    @aa1
    default List<MatchRecord> getMatchRecords(int i, int i2) {
        List<MatchRecord> list_getMatchRecords = _getMatchRecords(i, i2);
        for (MatchRecord matchRecord : list_getMatchRecords) {
            matchRecord.setMPeriodList(_getMatchPeriodsById(matchRecord.getMId()));
            matchRecord.setMLogList(_getMatchLogById(matchRecord.getMId()));
        }
        return list_getMatchRecords;
    }

    default void insert(@aa1 List<MatchRecord> list) {
        Intrinsics.X0O(list, "list");
        for (MatchRecord matchRecord : list) {
            long j_insertMatchRecord = _insertMatchRecord(matchRecord);
            Iterator<T> it = matchRecord.getMPeriodList().iterator();
            while (it.hasNext()) {
                ((MatchPeriod) it.next()).setMMatchRecordId((int) j_insertMatchRecord);
            }
            _insertMatchPeriod(matchRecord.getMPeriodList());
            Iterator<T> it2 = matchRecord.getMLogList().iterator();
            while (it2.hasNext()) {
                ((MatchLog) it2.next()).setMMatchRecordId((int) j_insertMatchRecord);
            }
            _insertMatchLog(matchRecord.getMLogList());
        }
    }

    @Update
    int update(@aa1 List<MatchRecord> list);
}
