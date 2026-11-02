package com.sma.smartv3.db.dao;

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
import com.android.mltcode.paycertificationapi.o06;
import com.android.mltcode.paycertificationapi.p06;
import com.android.mltcode.paycertificationapi.q06;
import com.android.mltcode.paycertificationapi.r06;
import com.android.mltcode.paycertificationapi.s06;
import com.android.mltcode.paycertificationapi.t06;
import com.android.mltcode.paycertificationapi.u06;
import com.android.mltcode.paycertificationapi.v06;
import com.android.mltcode.paycertificationapi.w06;
import com.sma.smartv3.db.entity.TranslateEntity;
import com.sma.smartv3.db.entity.TranslateSessionEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.db.entity.TranslateSessionWithTranslation;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateSessionDao_Impl implements TranslateSessionDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<TranslateSessionEntity> __deleteAdapterOfTranslateSessionEntity;
    private final EntityInsertAdapter<TranslateSessionEntity> __insertAdapterOfTranslateSessionEntity;
    private final EntityDeleteOrUpdateAdapter<TranslateSessionEntity> __updateAdapterOfTranslateSessionEntity;

    public TranslateSessionDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfTranslateSessionEntity = new AnonymousClass1(this);
        this.__deleteAdapterOfTranslateSessionEntity = new AnonymousClass2(this);
        this.__updateAdapterOfTranslateSessionEntity = new AnonymousClass3(this);
    }

    public static /* synthetic */ List I0IIOi(SQLiteConnection r41) {
        SQLiteStatement r1 = r41.prepare("\n    SELECT \n        parent.*,\n        child.sessionId AS child_sessionId,\n        child.requestId AS child_requestId,\n        child.text AS child_text,\n        child.translate AS child_translate,\n        child.duration AS child_duration,\n        child.createTime AS child_createTime,\n        child.audioPath AS child_audioPath,\n        child.fromLanguage AS child_fromLanguage,\n        child.toLanguage AS child_toLanguage,\n        child.isUpLoaded AS child_isUpLoaded,\n        child.showType as child_showType\n        \n    FROM TranslateSessionEntity AS parent\n    LEFT JOIN TranslateEntity AS child\n        ON child.requestId = (\n            SELECT requestId\n            FROM TranslateEntity\n            WHERE sessionId = parent.sessionId\n            ORDER BY createTime ASC\n            LIMIT 1\n        )\n     WHERE parent.isDelete = 0\n     ORDER BY parent.createTime DESC\n     ");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L51
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "audioPath");     // Catch: Throwable -> L51
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "duration");     // Catch: Throwable -> L51
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "createTime");     // Catch: Throwable -> L51
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "isDelete");     // Catch: Throwable -> L51
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_sessionId");     // Catch: Throwable -> L51
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_requestId");     // Catch: Throwable -> L51
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_text");     // Catch: Throwable -> L51
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_translate");     // Catch: Throwable -> L51
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_duration");     // Catch: Throwable -> L51
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_createTime");     // Catch: Throwable -> L51
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_audioPath");     // Catch: Throwable -> L51
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_fromLanguage");     // Catch: Throwable -> L51
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_toLanguage");     // Catch: Throwable -> L51
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_isUpLoaded");     // Catch: Throwable -> L51
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "child_showType");     // Catch: Throwable -> L51
        ArrayList r15 = new ArrayList();     // Catch: Throwable -> L51
    L4:
        if (r1.step() == false) goto L53;
        String r18 = null;
        if (r1.isNull(r0) == false) goto L9;
        String r20 = null;
    L11:
        if (r1.isNull(r2) == false) goto L13;
        String r21 = null;
    L14:
        int r17 = r2;
        int r27 = r3;
        TranslateSessionEntity r19 = new TranslateSessionEntity(r20, r21, (float) r1.getDouble(r3), r1.getLong(r4), (int) r1.getLong(r5));     // Catch: Throwable -> L51
        if (r1.isNull(r6) == false) goto L17;
        String r32 = null;
    L19:
        if (r1.isNull(r7) == false) goto L21;
        String r29 = null;
    L23:
        if (r1.isNull(r8) == false) goto L25;
        String r30 = null;
    L27:
        if (r1.isNull(r9) == false) goto L30;
        String r31 = null;
    L29:
        int r110 = r4;
        float r22 = (float) r1.getDouble(r10);     // Catch: Throwable -> L51
        long r38 = r1.getLong(r11);     // Catch: Throwable -> L51
        if (r1.isNull(r12) == false) goto L34;
        String r35 = null;
    L36:
        if (r1.isNull(r13) == false) goto L39;
        String r36 = null;
    L38:
        int r23 = r14;
        if (r1.isNull(r23) == false) goto L43;
    L42:
        int r111 = r0;
        int r24 = r42;
        String r37 = r18;
        if (((int) r1.getLong(r24)) == 0) goto L48;
        boolean r25 = true;
    L47:
        boolean r34 = r25;
        int r26 = r16;
        int r112 = r5;
        ArrayList r28 = r15;
        r28.add(new TranslateSessionWithFirstEntity(r19, new TranslateEntity(r29, r30, r31, r32, r22, r34, r35, r36, r37, r38, (int) r1.getLong(r26))));     // Catch: Throwable -> L51
        r0 = r111;
        r42 = r24;
        r15 = r28;
        r2 = r17;
        r4 = r110;
        r5 = r112;
        r14 = r23;
        r16 = r26;
        r3 = r27;
        goto L4
    L48:
        r25 = false;
        goto L47
    L43:
        r18 = r1.getText(r23);     // Catch: Throwable -> L51
        goto L42
    L39:
        r36 = r1.getText(r13);     // Catch: Throwable -> L51
        goto L38
    L34:
        r35 = r1.getText(r12);     // Catch: Throwable -> L51
        goto L36
    L30:
        r31 = r1.getText(r9);     // Catch: Throwable -> L51
        goto L29
    L25:
        r30 = r1.getText(r8);     // Catch: Throwable -> L51
        goto L27
    L21:
        r29 = r1.getText(r7);     // Catch: Throwable -> L51
        goto L23
    L17:
        r32 = r1.getText(r6);     // Catch: Throwable -> L51
        goto L19
    L13:
        r21 = r1.getText(r2);     // Catch: Throwable -> L51
        goto L14
    L9:
        r20 = r1.getText(r0);     // Catch: Throwable -> L51
        goto L11
    L53:
        ArrayList r33 = r15;
        r1.close();
        return r33;
    L51:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Long IiI10X(TranslateSessionDao_Impl r0, TranslateSessionEntity r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfTranslateSessionEntity.insertAndReturnId(r2, r1));
    }

    public static /* synthetic */ Integer O00(TranslateSessionDao_Impl r0, TranslateSessionEntity r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfTranslateSessionEntity.handle(r2, r1));
    }

    public static /* synthetic */ TranslateSessionEntity OIi0(SQLiteConnection r14) {
        SQLiteStatement r15 = r14.prepare("select * from translatesessionentity ORDER BY createTime DESC limit 1");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L15
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "audioPath");     // Catch: Throwable -> L15
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "duration");     // Catch: Throwable -> L15
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "createTime");     // Catch: Throwable -> L15
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "isDelete");     // Catch: Throwable -> L15
        TranslateSessionEntity r6 = null;
        String r7 = null;
        if (r15.step() == true) goto L6;
    L17:
        r15.close();
        return r6;
    L6:
        if (r15.isNull(r0) == false) goto L8;
        String r8 = null;
    L10:
        if (r15.isNull(r1) == true) goto L13;
        r7 = r15.getText(r1);     // Catch: Throwable -> L15
    L13:
        r6 = new TranslateSessionEntity(r8, r7, (float) r15.getDouble(r2), r15.getLong(r3), (int) r15.getLong(r4));     // Catch: Throwable -> L15
        goto L17
    L8:
        r8 = r15.getText(r0);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r15.close();
        throw th;
    }

    public static /* synthetic */ TranslateSessionEntity OXO1(String r13, SQLiteConnection r14) {
        SQLiteStatement r15 = r14.prepare("select * from  translatesessionentity where sessionId = ?");
        if (r13 != null) goto L7;
        r15.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L5
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "audioPath");     // Catch: Throwable -> L5
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "duration");     // Catch: Throwable -> L5
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "createTime");     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r15, "isDelete");     // Catch: Throwable -> L5
        TranslateSessionEntity r5 = null;
        String r6 = null;
        if (r15.step() == true) goto L11;
    L20:
        r15.close();
        return r5;
    L11:
        if (r15.isNull(r16) == false) goto L13;
        String r7 = null;
    L15:
        if (r15.isNull(r0) == true) goto L18;
        r6 = r15.getText(r0);     // Catch: Throwable -> L5
    L18:
        r5 = new TranslateSessionEntity(r7, r6, (float) r15.getDouble(r1), r15.getLong(r2), (int) r15.getLong(r3));     // Catch: Throwable -> L5
        goto L20
    L13:
        r7 = r15.getText(r16);     // Catch: Throwable -> L5
        goto L15
    L7:
        r15.mo3340bindText(1, r13);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r15.close();
        throw th;
    }

    public static /* synthetic */ Object XIi00iiXO(TranslateSessionDao_Impl r0, TranslateSessionEntity r1, SQLiteConnection r2) {
        r0.__deleteAdapterOfTranslateSessionEntity.handle(r2, r1);
        return null;
    }

    public static /* synthetic */ Unit XO0O10(TranslateSessionDao_Impl r0, SQLiteConnection r1, ArrayMap r2) {
        r0.__fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity(r1, r2);
        return Unit.OXO1;
    }

    public static /* synthetic */ List XOO0ii0(SQLiteConnection r15) {
        SQLiteStatement r16 = r15.prepare("select * from translatesessionentity");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L16
        int r1 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "audioPath");     // Catch: Throwable -> L16
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "duration");     // Catch: Throwable -> L16
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "createTime");     // Catch: Throwable -> L16
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r16, "isDelete");     // Catch: Throwable -> L16
        ArrayList r5 = new ArrayList();     // Catch: Throwable -> L16
    L4:
        if (r16.step() == false) goto L18;
        String r7 = null;
        if (r16.isNull(r0) == false) goto L9;
        String r9 = null;
    L11:
        if (r16.isNull(r1) == true) goto L14;
        r7 = r16.getText(r1);     // Catch: Throwable -> L16
    L14:
        r5.add(new TranslateSessionEntity(r9, r7, (float) r16.getDouble(r2), r16.getLong(r3), (int) r16.getLong(r4)));     // Catch: Throwable -> L16
        goto L4
    L9:
        r9 = r16.getText(r0);     // Catch: Throwable -> L16
        goto L11
    L18:
        r16.close();
        return r5;
    L16:
        th = move-exception;
        r16.close();
        throw th;
    }

    private void __fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity(@NonNull final SQLiteConnection _connection, @NonNull final ArrayMap<String, ArrayList<TranslateEntity>> _map) {
        Set<String> r2 = _map.keySet();
        if (r2.isEmpty() == false) goto L6;
        return;
    L6:
        if (_map.size() <= 999) goto L9;
        RelationUtil.recursiveFetchArrayMap(_map, true, new t06(this, _connection));
        return;
    L9:
        StringBuilder r4 = new StringBuilder();
        r4.append("SELECT `requestId`,`text`,`translate`,`sessionId`,`duration`,`isUpLoaded`,`audioPath`,`fromLanguage`,`toLanguage`,`createTime`,`showType` FROM `TranslateEntity` WHERE `sessionId` IN (");
        StringUtil.appendPlaceholders(r4, r2.size());
        r4.append(I000IiI1O.iO.iO);
        SQLiteStatement r5 = _connection.prepare(r4.toString());
        Iterator<String> r0 = r2.iterator();
        int r3 = 1;
    L11:
        if (r0.hasNext() == false) goto L71;
        String r6 = r0.next();
        if (r6 != null) goto L15;
        r5.mo3339bindNull(r3);
    L16:
        r3 = r3 + 1;
        goto L11
    L15:
        r5.mo3340bindText(r3, r6);
        goto L16
    L71:
        int r1 = SQLiteStatementUtil.getColumnIndex(r5, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L65
        if (r1 != (-1)) goto L22;
        r5.close();
        return;
    L22:
        if (r5.step() == false) goto L67;
        String r7 = null;
        if (r5.isNull(r1) == false) goto L27;
        String r8 = null;
    L28:
        if (r8 == null) goto L22;
        ArrayList<TranslateEntity> r9 = _map.get(r8);     // Catch: Throwable -> L65
        if (r9 == null) goto L22;
        if (r5.isNull(0) == false) goto L34;
        String r10 = null;
    L36:
        if (r5.isNull(1) == false) goto L38;
        String r11 = null;
    L40:
        if (r5.isNull(2) == false) goto L42;
        String r12 = null;
    L44:
        if (r5.isNull(3) == false) goto L46;
        String r13 = null;
    L47:
        float r14 = (float) r5.getDouble(4);     // Catch: Throwable -> L65
        if (((int) r5.getLong(5)) == 0) goto L50;
        boolean r15 = true;
    L52:
        if (r5.isNull(6) == false) goto L54;
        String r16 = null;
    L56:
        if (r5.isNull(7) == false) goto L58;
        String r17 = null;
    L60:
        if (r5.isNull(8) == true) goto L63;
        r7 = r5.getText(8);     // Catch: Throwable -> L65
    L63:
        r9.add(new TranslateEntity(r10, r11, r12, r13, r14, r15, r16, r17, r7, r5.getLong(9), (int) r5.getLong(10)));     // Catch: Throwable -> L65
        goto L22
    L58:
        r17 = r5.getText(7);     // Catch: Throwable -> L65
        goto L60
    L54:
        r16 = r5.getText(6);     // Catch: Throwable -> L65
        goto L56
    L50:
        r15 = false;
        goto L52
    L46:
        r13 = r5.getText(3);     // Catch: Throwable -> L65
        goto L47
    L42:
        r12 = r5.getText(2);     // Catch: Throwable -> L65
        goto L44
    L38:
        r11 = r5.getText(1);     // Catch: Throwable -> L65
        goto L40
    L34:
        r10 = r5.getText(0);     // Catch: Throwable -> L65
        goto L36
    L27:
        r8 = r5.getText(r1);     // Catch: Throwable -> L65
        goto L28
    L67:
        r5.close();
        return;
    L65:
        th = move-exception;
        r5.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ TranslateSessionWithTranslation iO(TranslateSessionDao_Impl r17, String r18, SQLiteConnection r19) {
        r17.getClass();
        SQLiteStatement r2 = r19.prepare("select * from  translatesessionentity where sessionId = ?");
        if (r18 != null) goto L7;
        r2.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "audioPath");     // Catch: Throwable -> L5
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "duration");     // Catch: Throwable -> L5
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "createTime");     // Catch: Throwable -> L5
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r2, "isDelete");     // Catch: Throwable -> L5
        ArrayMap<String, ArrayList<TranslateEntity>> r7 = new ArrayMap();     // Catch: Throwable -> L5
    L9:
        TranslateSessionWithTranslation r9 = null;
        String r10 = null;
        String r11 = null;
        if (r2.step() == false) goto L19;
        if (r2.isNull(r0) == true) goto L15;
        r10 = r2.getText(r0);     // Catch: Throwable -> L5
    L15:
        if (r10 == null) goto L9;
        if (r7.containsKey(r10) == true) goto L9;
        r7.put(r10, new ArrayList());     // Catch: Throwable -> L5
        goto L9
    L19:
        r2.reset();     // Catch: Throwable -> L5
        r17.__fetchRelationshipTranslateEntityAscomSmaSmartv3DbEntityTranslateEntity(r19, r7);     // Catch: Throwable -> L5
        if (r2.step() == true) goto L22;
    L37:
        r2.close();
        return r9;
    L22:
        if (r2.isNull(r0) == false) goto L24;
        String r12 = null;
    L26:
        if (r2.isNull(r3) == false) goto L28;
        String r13 = null;
    L29:
        TranslateSessionEntity r14 = new TranslateSessionEntity(r12, r13, (float) r2.getDouble(r4), r2.getLong(r5), (int) r2.getLong(r6));     // Catch: Throwable -> L5
        if (r2.isNull(r0) == true) goto L33;
        r11 = r2.getText(r0);     // Catch: Throwable -> L5
    L33:
        if (r11 == null) goto L35;
        ArrayList<TranslateEntity> r1 = r7.get(r11);     // Catch: Throwable -> L5
    L36:
        r9 = new TranslateSessionWithTranslation(r14, r1);     // Catch: Throwable -> L5
        goto L37
    L35:
        r1 = new ArrayList();     // Catch: Throwable -> L5
        goto L36
    L28:
        r13 = r2.getText(r3);     // Catch: Throwable -> L5
        goto L29
    L24:
        r12 = r2.getText(r0);     // Catch: Throwable -> L5
        goto L26
    L7:
        r2.mo3340bindText(1, r18);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r2.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public void delete(final TranslateSessionEntity sessionEntity) {
        sessionEntity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new o06(this, sessionEntity));
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public List<TranslateSessionWithFirstEntity> getAllSessionsWithFirstEntity() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new r06());
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public List<TranslateSessionEntity> getAllTranslationList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new p06());
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public TranslateSessionEntity getTranslateFirst() {
        return (TranslateSessionEntity) DBUtil.performBlocking(this.__db, true, false, new u06());
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public long insert(final TranslateSessionEntity translateSessionEntity) {
        translateSessionEntity.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new v06(this, translateSessionEntity))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public TranslateSessionWithTranslation queryBySessionId(final String sessionId) {
        return (TranslateSessionWithTranslation) DBUtil.performBlocking(this.__db, true, false, new w06(this, sessionId));
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public TranslateSessionEntity querySessionById(final String sessionId) {
        return (TranslateSessionEntity) DBUtil.performBlocking(this.__db, true, false, new q06(sessionId));
    }

    @Override // com.sma.smartv3.db.dao.TranslateSessionDao
    public int update(final TranslateSessionEntity sessionEntity) {
        sessionEntity.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new s06(this, sessionEntity))).intValue();
    }
}
