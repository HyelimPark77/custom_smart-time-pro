package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.sma.smartv3.p608db.dao.TranslateSessionDao_Impl;
import com.sma.smartv3.p608db.entity.TranslateEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithTranslation;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateSessionDao_Impl implements TranslateSessionDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<TranslateSessionEntity> __insertAdapterOfTranslateSessionEntity = new EntityInsertAdapter<TranslateSessionEntity>() { // from class: com.sma.smartv3.db.dao.TranslateSessionDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR ABORT INTO `TranslateSessionEntity` (`sessionId`,`audioPath`,`duration`,`createTime`,`isDelete`) VALUES (?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final TranslateSessionEntity entity) {
            if (entity.getSessionId() == null) {
                statement.mo47600bindNull(1);
            } else {
                statement.mo47601bindText(1, entity.getSessionId());
            }
            if (entity.getAudioPath() == null) {
                statement.mo47600bindNull(2);
            } else {
                statement.mo47601bindText(2, entity.getAudioPath());
            }
            statement.mo47598bindDouble(3, entity.getDuration());
            statement.mo47599bindLong(4, entity.getCreateTime());
            statement.mo47599bindLong(5, entity.isDelete());
        }
    };
    private final EntityDeleteOrUpdateAdapter<TranslateSessionEntity> __deleteAdapterOfTranslateSessionEntity = new EntityDeleteOrUpdateAdapter<TranslateSessionEntity>() { // from class: com.sma.smartv3.db.dao.TranslateSessionDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `TranslateSessionEntity` WHERE `sessionId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final TranslateSessionEntity entity) {
            if (entity.getSessionId() == null) {
                statement.mo47600bindNull(1);
            } else {
                statement.mo47601bindText(1, entity.getSessionId());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<TranslateSessionEntity> __updateAdapterOfTranslateSessionEntity = new EntityDeleteOrUpdateAdapter<TranslateSessionEntity>() { // from class: com.sma.smartv3.db.dao.TranslateSessionDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `TranslateSessionEntity` SET `sessionId` = ?,`audioPath` = ?,`duration` = ?,`createTime` = ?,`isDelete` = ? WHERE `sessionId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final TranslateSessionEntity entity) {
            if (entity.getSessionId() == null) {
                statement.mo47600bindNull(1);
            } else {
                statement.mo47601bindText(1, entity.getSessionId());
            }
            if (entity.getAudioPath() == null) {
                statement.mo47600bindNull(2);
            } else {
                statement.mo47601bindText(2, entity.getAudioPath());
            }
            statement.mo47598bindDouble(3, entity.getDuration());
            statement.mo47599bindLong(4, entity.getCreateTime());
            statement.mo47599bindLong(5, entity.isDelete());
            if (entity.getSessionId() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getSessionId());
            }
        }
    };

    public TranslateSessionDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List I0IIOi(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n    SELECT \n        parent.*,\n        child.sessionId AS child_sessionId,\n        child.requestId AS child_requestId,\n        child.text AS child_text,\n        child.translate AS child_translate,\n        child.duration AS child_duration,\n        child.createTime AS child_createTime,\n        child.audioPath AS child_audioPath,\n        child.fromLanguage AS child_fromLanguage,\n        child.toLanguage AS child_toLanguage,\n        child.isUpLoaded AS child_isUpLoaded,\n        child.showType as child_showType\n        \n    FROM TranslateSessionEntity AS parent\n    LEFT JOIN TranslateEntity AS child\n        ON child.requestId = (\n            SELECT requestId\n            FROM TranslateEntity\n            WHERE sessionId = parent.sessionId\n            ORDER BY createTime ASC\n            LIMIT 1\n        )\n     WHERE parent.isDelete = 0\n     ORDER BY parent.createTime DESC\n     ");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDelete");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_sessionId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_requestId");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_text");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_translate");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_duration");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_createTime");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_audioPath");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_fromLanguage");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_toLanguage");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_isUpLoaded");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "child_showType");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow2;
                int i2 = columnIndexOrThrow3;
                TranslateSessionEntity translateSessionEntity = new TranslateSessionEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                int i3 = columnIndexOrThrow4;
                float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow10);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i4 = columnIndexOrThrow14;
                int i5 = columnIndexOrThrow;
                int i6 = columnIndexOrThrow15;
                int i7 = columnIndexOrThrow16;
                int i8 = columnIndexOrThrow5;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new TranslateSessionWithFirstEntity(translateSessionEntity, new TranslateEntity(text2, text3, text4, text, f, ((int) sQLiteStatementPrepare.getLong(i6)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), j, (int) sQLiteStatementPrepare.getLong(i7))));
                columnIndexOrThrow = i5;
                columnIndexOrThrow15 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow4 = i3;
                columnIndexOrThrow5 = i8;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow3 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TranslateSessionEntity OIi0(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from translatesessionentity ORDER BY createTime DESC limit 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDelete");
            TranslateSessionEntity translateSessionEntity = null;
            if (sQLiteStatementPrepare.step()) {
                translateSessionEntity = new TranslateSessionEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
            }
            return translateSessionEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ TranslateSessionEntity OXO1(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from  translatesessionentity where sessionId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDelete");
            TranslateSessionEntity translateSessionEntity = null;
            if (sQLiteStatementPrepare.step()) {
                translateSessionEntity = new TranslateSessionEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
            }
            sQLiteStatementPrepare.close();
            return translateSessionEntity;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Object XIi00iiXO(TranslateSessionDao_Impl translateSessionDao_Impl, TranslateSessionEntity translateSessionEntity, SQLiteConnection sQLiteConnection) {
        translateSessionDao_Impl.__deleteAdapterOfTranslateSessionEntity.handle(sQLiteConnection, translateSessionEntity);
        return null;
    }

    public static /* synthetic */ Unit XO0O10(TranslateSessionDao_Impl translateSessionDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap arrayMap) {
        translateSessionDao_Impl.m38192xf9ad41a1(sQLiteConnection, arrayMap);
        return Unit.OXO1;
    }

    public static /* synthetic */ List XOO0ii0(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from translatesessionentity");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new TranslateSessionEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: renamed from: __fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity */
    private void m38192xf9ad41a1(@NonNull final SQLiteConnection _connection, @NonNull final ArrayMap<String, ArrayList<TranslateEntity>> _map) {
        ArrayList<TranslateEntity> arrayList;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.t06
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TranslateSessionDao_Impl.XO0O10(this.f11168IO, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `requestId`,`text`,`translate`,`sessionId`,`duration`,`isUpLoaded`,`audioPath`,`fromLanguage`,`toLanguage`,`createTime`,`showType` FROM `TranslateEntity` WHERE `sessionId` IN (");
        StringUtil.appendPlaceholders(sb, setKeySet.size());
        sb.append(I000IiI1O.C2156iO.f1007iO);
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(sb.toString());
        int i = 1;
        for (String str : setKeySet) {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(i);
            } else {
                sQLiteStatementPrepare.mo47601bindText(i, str);
            }
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndex) ? null : sQLiteStatementPrepare.getText(columnIndex);
                if (text != null && (arrayList = _map.get(text)) != null) {
                    arrayList.add(new TranslateEntity(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0), sQLiteStatementPrepare.isNull(1) ? null : sQLiteStatementPrepare.getText(1), sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2), sQLiteStatementPrepare.isNull(3) ? null : sQLiteStatementPrepare.getText(3), (float) sQLiteStatementPrepare.getDouble(4), ((int) sQLiteStatementPrepare.getLong(5)) != 0, sQLiteStatementPrepare.isNull(6) ? null : sQLiteStatementPrepare.getText(6), sQLiteStatementPrepare.isNull(7) ? null : sQLiteStatementPrepare.getText(7), sQLiteStatementPrepare.isNull(8) ? null : sQLiteStatementPrepare.getText(8), sQLiteStatementPrepare.getLong(9), (int) sQLiteStatementPrepare.getLong(10)));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ TranslateSessionWithTranslation m38193iO(TranslateSessionDao_Impl translateSessionDao_Impl, String str, SQLiteConnection sQLiteConnection) {
        TranslateSessionWithTranslation translateSessionWithTranslation;
        String text;
        translateSessionDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("select * from  translatesessionentity where sessionId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, JsonStorageKeyNames.SESSION_ID_KEY);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "audioPath");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "duration");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isDelete");
            ArrayMap<String, ArrayList<TranslateEntity>> arrayMap = new ArrayMap<>();
            while (true) {
                translateSessionWithTranslation = null;
                String text2 = null;
                text = null;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                if (text2 != null && !arrayMap.containsKey(text2)) {
                    arrayMap.put(text2, new ArrayList<>());
                }
            }
            sQLiteStatementPrepare.reset();
            translateSessionDao_Impl.m38192xf9ad41a1(sQLiteConnection, arrayMap);
            if (sQLiteStatementPrepare.step()) {
                TranslateSessionEntity translateSessionEntity = new TranslateSessionEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                translateSessionWithTranslation = new TranslateSessionWithTranslation(translateSessionEntity, text != null ? arrayMap.get(text) : new ArrayList<>());
            }
            sQLiteStatementPrepare.close();
            return translateSessionWithTranslation;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public void delete(final TranslateSessionEntity sessionEntity) {
        sessionEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.o06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateSessionDao_Impl.XIi00iiXO(this.f10052IO, sessionEntity, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public List<TranslateSessionWithFirstEntity> getAllSessionsWithFirstEntity() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.r06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateSessionDao_Impl.I0IIOi((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public List<TranslateSessionEntity> getAllTranslationList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.p06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateSessionDao_Impl.XOO0ii0((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public TranslateSessionEntity getTranslateFirst() {
        return (TranslateSessionEntity) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.u06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateSessionDao_Impl.OIi0((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public long insert(final TranslateSessionEntity translateSessionEntity) {
        translateSessionEntity.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.v06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f11624IO.__insertAdapterOfTranslateSessionEntity.insertAndReturnId((SQLiteConnection) obj, translateSessionEntity));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public TranslateSessionWithTranslation queryBySessionId(final String sessionId) {
        return (TranslateSessionWithTranslation) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.w06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateSessionDao_Impl.m38193iO(this.f11854IO, sessionId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public TranslateSessionEntity querySessionById(final String sessionId) {
        return (TranslateSessionEntity) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.q06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TranslateSessionDao_Impl.OXO1(sessionId, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.TranslateSessionDao
    public int update(final TranslateSessionEntity sessionEntity) {
        sessionEntity.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.s06
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f10945IO.__updateAdapterOfTranslateSessionEntity.handle((SQLiteConnection) obj, sessionEntity));
            }
        })).intValue();
    }
}
