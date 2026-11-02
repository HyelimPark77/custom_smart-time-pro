package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.entity.HanBaoVibration;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class HanBaoVibrationDao_Impl implements HanBaoVibrationDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<HanBaoVibration> __insertAdapterOfHanBaoVibration = new EntityInsertAdapter<HanBaoVibration>() { // from class: com.sma.smartv3.db.dao.HanBaoVibrationDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `HanBaoVibration` (`mId`,`mTime`,`mLocalTime`,`mVibration`,`mBOValue`,`mIsSnore`,`mIsSync`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final HanBaoVibration entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMVibration());
            statement.mo47599bindLong(5, entity.getMBOValue());
            statement.mo47599bindLong(6, entity.getMIsSnore());
            statement.mo47599bindLong(7, entity.getMIsSync());
        }
    };
    private final EntityDeleteOrUpdateAdapter<HanBaoVibration> __updateAdapterOfHanBaoVibration = new EntityDeleteOrUpdateAdapter<HanBaoVibration>() { // from class: com.sma.smartv3.db.dao.HanBaoVibrationDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `HanBaoVibration` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mVibration` = ?,`mBOValue` = ?,`mIsSnore` = ?,`mIsSync` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final HanBaoVibration entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMVibration());
            statement.mo47599bindLong(5, entity.getMBOValue());
            statement.mo47599bindLong(6, entity.getMIsSnore());
            statement.mo47599bindLong(7, entity.getMIsSync());
            statement.mo47599bindLong(8, entity.getMId());
        }
    };

    public HanBaoVibrationDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.p608db.dao.HanBaoVibrationDao
    public long[] insert(final List<HanBaoVibration> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX01i1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f8224IO.__insertAdapterOfHanBaoVibration.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.HanBaoVibrationDao
    public int update(final List<HanBaoVibration> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1XOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f7676IO.__updateAdapterOfHanBaoVibration.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
