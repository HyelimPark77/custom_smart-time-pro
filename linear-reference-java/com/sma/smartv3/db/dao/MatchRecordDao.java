package com.sma.smartv3.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.db.entity.MatchLog;
import com.sma.smartv3.db.entity.MatchPeriod;
import com.sma.smartv3.db.entity.MatchRecord;
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
        public static void delete(@aa1 MatchRecordDao r0, int r1) {
            MatchRecordDao.access$delete$jd(r0, r1);
        }

        @aa1
        @Deprecated
        public static List<MatchRecord> getMatchRecords(@aa1 MatchRecordDao r0, int r1, int r2) {
            return MatchRecordDao.access$getMatchRecords$jd(r0, r1, r2);
        }

        @Deprecated
        public static void insert(@aa1 MatchRecordDao r1, @aa1 List<MatchRecord> r2) {
            Intrinsics.X0O(r2, "list");
            MatchRecordDao.access$insert$jd(r1, r2);
        }
    }

    static /* synthetic */ void access$delete$jd(MatchRecordDao r0, int r1) {
        super.delete(r1);
    }

    static /* synthetic */ List access$getMatchRecords$jd(MatchRecordDao r0, int r1, int r2) {
        return super.getMatchRecords(r1, r2);
    }

    static /* synthetic */ void access$insert$jd(MatchRecordDao r0, List r1) {
        super.insert(r1);
    }

    @Query("DELETE FROM MatchLog WHERE mMatchRecordId = :matchRecordId")
    void _deleteMatchLogById(int r1);

    @Query("DELETE FROM MatchPeriod WHERE mMatchRecordId = :matchRecordId")
    void _deleteMatchPeriodById(int r1);

    @Query("DELETE FROM MatchRecord WHERE mId = :id")
    void _deleteMatchRecordById(int r1);

    @Query("SELECT * FROM MatchLog WHERE mMatchRecordId = :matchRecordId")
    @aa1
    List<MatchLog> _getMatchLogById(int r1);

    @Query("SELECT * FROM MatchPeriod WHERE mMatchRecordId = :matchRecordId")
    @aa1
    List<MatchPeriod> _getMatchPeriodsById(int r1);

    @Query("SELECT * FROM MatchRecord WHERE  mIsDelete != 1 ORDER BY mStart DESC LIMIT :startIndex, :endIndex")
    @aa1
    List<MatchRecord> _getMatchRecords(int r1, int r2);

    @Insert(onConflict = 1)
    @aa1
    long[] _insertMatchLog(@aa1 List<MatchLog> r1);

    @Insert(onConflict = 1)
    @aa1
    long[] _insertMatchPeriod(@aa1 List<MatchPeriod> r1);

    @Insert(onConflict = 1)
    long _insertMatchRecord(@aa1 MatchRecord r1);

    default void delete(int r1) {
        _deleteMatchLogById(r1);
        _deleteMatchPeriodById(r1);
        _deleteMatchRecordById(r1);
    }

    @Query("SELECT * FROM MatchRecord WHERE mIsDelete != 1")
    @aa1
    List<MatchRecord> getList();

    @Query("SELECT * FROM MatchRecord WHERE mIsDelete != 1 AND mSource = :source")
    @aa1
    List<MatchRecord> getListBySource(int r1);

    @aa1
    default List<MatchRecord> getMatchRecords(int r3, int r4) {
        List<MatchRecord> r5 = _getMatchRecords(r3, r4);
        Iterator<T> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L6;
        MatchRecord r0 = (MatchRecord) r6.next();
        r0.setMPeriodList(_getMatchPeriodsById(r0.getMId()));
        r0.setMLogList(_getMatchLogById(r0.getMId()));
        goto L4
    L6:
        return r5;
    }

    default void insert(@aa1 List<MatchRecord> r7) {
        Intrinsics.X0O(r7, "list");
        Iterator<T> r8 = r7.iterator();
    L4:
        if (r8.hasNext() == false) goto L14;
        MatchRecord r0 = (MatchRecord) r8.next();
        long r1 = _insertMatchRecord(r0);
        Iterator<T> r3 = r0.getMPeriodList().iterator();
    L7:
        if (r3.hasNext() == false) goto L9;
        ((MatchPeriod) r3.next()).setMMatchRecordId((int) r1);
        goto L7
    L9:
        _insertMatchPeriod(r0.getMPeriodList());
        Iterator<T> r4 = r0.getMLogList().iterator();
    L11:
        if (r4.hasNext() == false) goto L13;
        ((MatchLog) r4.next()).setMMatchRecordId((int) r1);
        goto L11
    L13:
        _insertMatchLog(r0.getMLogList());
        goto L4
    }

    @Update
    int update(@aa1 List<MatchRecord> r1);
}
