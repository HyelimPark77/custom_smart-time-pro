package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.TranslateDao_Impl;
import com.sma.smartv3.p608db.entity.TranslateEntity;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateDao_Impl implements TranslateDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<TranslateEntity> __insertAdapterOfTranslateEntity = new EntityInsertAdapter<TranslateEntity>() { // from class: com.sma.smartv3.db.dao.TranslateDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `TranslateEntity` (`requestId`,`text`,`translate`,`sessionId`,`duration`,`isUpLoaded`,`audioPath`,`fromLanguage`,`toLanguage`,`createTime`,`showType`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull TranslateEntity translateEntity) {
            if (translateEntity.getRequestId() == null) {
                sQLiteStatement.mo47600bindNull(1);
            } else {
                sQLiteStatement.mo47601bindText(1, translateEntity.getRequestId());
            }
            if (translateEntity.getText() == null) {
                sQLiteStatement.mo47600bindNull(2);
            } else {
                sQLiteStatement.mo47601bindText(2, translateEntity.getText());
            }
            if (translateEntity.getTranslate() == null) {
                sQLiteStatement.mo47600bindNull(3);
            } else {
                sQLiteStatement.mo47601bindText(3, translateEntity.getTranslate());
            }
            if (translateEntity.getSessionId() == null) {
                sQLiteStatement.mo47600bindNull(4);
            } else {
                sQLiteStatement.mo47601bindText(4, translateEntity.getSessionId());
            }
            sQLiteStatement.mo47598bindDouble(5, translateEntity.getDuration());
            sQLiteStatement.mo47599bindLong(6, translateEntity.isUpLoaded() ? 1L : 0L);
            if (translateEntity.getAudioPath() == null) {
                sQLiteStatement.mo47600bindNull(7);
            } else {
                sQLiteStatement.mo47601bindText(7, translateEntity.getAudioPath());
            }
            if (translateEntity.getFromLanguage() == null) {
                sQLiteStatement.mo47600bindNull(8);
            } else {
                sQLiteStatement.mo47601bindText(8, translateEntity.getFromLanguage());
            }
            if (translateEntity.getToLanguage() == null) {
                sQLiteStatement.mo47600bindNull(9);
            } else {
                sQLiteStatement.mo47601bindText(9, translateEntity.getToLanguage());
            }
            sQLiteStatement.mo47599bindLong(10, translateEntity.getCreateTime());
            sQLiteStatement.mo47599bindLong(11, translateEntity.getShowType());
        }
    };
    private final EntityInsertAdapter<TranslateEntity> __insertAdapterOfTranslateEntity_1 = new EntityInsertAdapter<TranslateEntity>() { // from class: com.sma.smartv3.db.dao.TranslateDao_Impl.2
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR IGNORE INTO `TranslateEntity` (`requestId`,`text`,`translate`,`sessionId`,`duration`,`isUpLoaded`,`audioPath`,`fromLanguage`,`toLanguage`,`createTime`,`showType`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull TranslateEntity translateEntity) {
            if (translateEntity.getRequestId() == null) {
                sQLiteStatement.mo47600bindNull(1);
            } else {
                sQLiteStatement.mo47601bindText(1, translateEntity.getRequestId());
            }
            if (translateEntity.getText() == null) {
                sQLiteStatement.mo47600bindNull(2);
            } else {
                sQLiteStatement.mo47601bindText(2, translateEntity.getText());
            }
            if (translateEntity.getTranslate() == null) {
                sQLiteStatement.mo47600bindNull(3);
            } else {
                sQLiteStatement.mo47601bindText(3, translateEntity.getTranslate());
            }
            if (translateEntity.getSessionId() == null) {
                sQLiteStatement.mo47600bindNull(4);
            } else {
                sQLiteStatement.mo47601bindText(4, translateEntity.getSessionId());
            }
            sQLiteStatement.mo47598bindDouble(5, translateEntity.getDuration());
            sQLiteStatement.mo47599bindLong(6, translateEntity.isUpLoaded() ? 1L : 0L);
            if (translateEntity.getAudioPath() == null) {
                sQLiteStatement.mo47600bindNull(7);
            } else {
                sQLiteStatement.mo47601bindText(7, translateEntity.getAudioPath());
            }
            if (translateEntity.getFromLanguage() == null) {
                sQLiteStatement.mo47600bindNull(8);
            } else {
                sQLiteStatement.mo47601bindText(8, translateEntity.getFromLanguage());
            }
            if (translateEntity.getToLanguage() == null) {
                sQLiteStatement.mo47600bindNull(9);
            } else {
                sQLiteStatement.mo47601bindText(9, translateEntity.getToLanguage());
            }
            sQLiteStatement.mo47599bindLong(10, translateEntity.getCreateTime());
            sQLiteStatement.mo47599bindLong(11, translateEntity.getShowType());
        }
    };
    private final EntityDeleteOrUpdateAdapter<TranslateEntity> __deleteAdapterOfTranslateEntity = new EntityDeleteOrUpdateAdapter<TranslateEntity>() { // from class: com.sma.smartv3.db.dao.TranslateDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `TranslateEntity` WHERE `requestId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final TranslateEntity entity) {
            if (entity.getRequestId() == null) {
                statement.mo47600bindNull(1);
            } else {
                statement.mo47601bindText(1, entity.getRequestId());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<TranslateEntity> __updateAdapterOfTranslateEntity = new EntityDeleteOrUpdateAdapter<TranslateEntity>() { // from class: com.sma.smartv3.db.dao.TranslateDao_Impl.4
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `TranslateEntity` SET `requestId` = ?,`text` = ?,`translate` = ?,`sessionId` = ?,`duration` = ?,`isUpLoaded` = ?,`audioPath` = ?,`fromLanguage` = ?,`toLanguage` = ?,`createTime` = ?,`showType` = ? WHERE `requestId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull SQLiteStatement sQLiteStatement, @NonNull TranslateEntity translateEntity) {
            if (translateEntity.getRequestId() == null) {
                sQLiteStatement.mo47600bindNull(1);
            } else {
                sQLiteStatement.mo47601bindText(1, translateEntity.getRequestId());
            }
            if (translateEntity.getText() == null) {
                sQLiteStatement.mo47600bindNull(2);
            } else {
                sQLiteStatement.mo47601bindText(2, translateEntity.getText());
            }
            if (translateEntity.getTranslate() == null) {
                sQLiteStatement.mo47600bindNull(3);
            } else {
                sQLiteStatement.mo47601bindText(3, translateEntity.getTranslate());
            }
            if (translateEntity.getSessionId() == null) {
                sQLiteStatement.mo47600bindNull(4);
            } else {
                sQLiteStatement.mo47601bindText(4, translateEntity.getSessionId());
            }
            sQLiteStatement.mo47598bindDouble(5, translateEntity.getDuration());
            sQLiteStatement.mo47599bindLong(6, translateEntity.isUpLoaded() ? 1L : 0L);
            if (translateEntity.getAudioPath() == null) {
                sQLiteStatement.mo47600bindNull(7);
            } else {
                sQLiteStatement.mo47601bindText(7, translateEntity.getAudioPath());
            }
            if (translateEntity.getFromLanguage() == null) {
                sQLiteStatement.mo47600bindNull(8);
            } else {
                sQLiteStatement.mo47601bindText(8, translateEntity.getFromLanguage());
            }
            if (translateEntity.getToLanguage() == null) {
                sQLiteStatement.mo47600bindNull(9);
            } else {
                sQLiteStatement.mo47601bindText(9, translateEntity.getToLanguage());
            }
            sQLiteStatement.mo47599bindLong(10, translateEntity.getCreateTime());
            sQLiteStatement.mo47599bindLong(11, translateEntity.getShowType());
            if (translateEntity.getRequestId() == null) {
                sQLiteStatement.mo47600bindNull(12);
            } else {
                sQLiteStatement.mo47601bindText(12, translateEntity.getRequestId());
            }
        }
    };

    public TranslateDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List IiI10X(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * from TranslateEntity where sessionId=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "text");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "translate");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpLoaded");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromLanguage");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toLanguage");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "showType");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow2;
                arrayList.add(new TranslateEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
                columnIndexOrThrow2 = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Object O00(TranslateDao_Impl translateDao_Impl, TranslateEntity translateEntity, SQLiteConnection sQLiteConnection) {
        translateDao_Impl.__updateAdapterOfTranslateEntity.handle(sQLiteConnection, translateEntity);
        return null;
    }

    public static /* synthetic */ List OXO1(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT t.*\n        FROM TranslateEntity t\n        INNER JOIN (\n            SELECT sessionId, MIN(createTime) AS firstTime\n            FROM TranslateEntity\n            GROUP BY sessionId\n        ) grouped ON t.sessionId = grouped.sessionId AND t.createTime = grouped.firstTime\n        ORDER BY t.createTime ASC\n    ");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requestId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "text");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "translate");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isUpLoaded");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromLanguage");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toLanguage");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "showType");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TranslateEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object XO0O10(TranslateDao_Impl translateDao_Impl, TranslateEntity translateEntity, SQLiteConnection sQLiteConnection) {
        translateDao_Impl.__deleteAdapterOfTranslateEntity.handle(sQLiteConnection, translateEntity);
        return null;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateDao
    public void delete(final TranslateEntity entity) {
        entity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.i06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateDao_Impl.XO0O10(this.f7333IO, entity, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateDao
    public List<TranslateEntity> getFirstTranslatePerSession() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.j06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateDao_Impl.OXO1((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateDao
    public List<TranslateEntity> getTranslateEntityWithSessionId(final String sessionId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.e06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateDao_Impl.IiI10X(sessionId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateDao
    public long insert(final TranslateEntity entity) {
        entity.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.g06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f6788IO.__insertAdapterOfTranslateEntity.insertAndReturnId((SQLiteConnection) obj, entity));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateDao
    public List<Long> insertAll(final List<TranslateEntity> list) {
        list.getClass();
        return (List) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.f06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f6551IO.__insertAdapterOfTranslateEntity_1.insertAndReturnIdsList((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateDao
    public void update(final TranslateEntity entity) {
        entity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.h06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateDao_Impl.O00(this.f7021IO, entity, (SQLiteConnection) obj);
            }
        });
    }
}
