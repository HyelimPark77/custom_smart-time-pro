package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.e06;
import com.android.mltcode.paycertificationapi.f06;
import com.android.mltcode.paycertificationapi.g06;
import com.android.mltcode.paycertificationapi.h06;
import com.android.mltcode.paycertificationapi.i06;
import com.android.mltcode.paycertificationapi.j06;
import com.sma.smartv3.db.entity.TranslateEntity;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateDao_Impl implements TranslateDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<TranslateEntity> __deleteAdapterOfTranslateEntity;
    private final EntityInsertAdapter<TranslateEntity> __insertAdapterOfTranslateEntity;
    private final EntityInsertAdapter<TranslateEntity> __insertAdapterOfTranslateEntity_1;
    private final EntityDeleteOrUpdateAdapter<TranslateEntity> __updateAdapterOfTranslateEntity;

    public TranslateDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
        this.__insertAdapterOfTranslateEntity = new AnonymousClass1(this);
        this.__insertAdapterOfTranslateEntity_1 = new AnonymousClass2(this);
        this.__deleteAdapterOfTranslateEntity = new AnonymousClass3(this);
        this.__updateAdapterOfTranslateEntity = new AnonymousClass4(this);
    }

    public static /* synthetic */ List IiI10X(String r29, SQLiteConnection r30) {
        SQLiteStatement r1 = r30.prepare("SELECT * from TranslateEntity where sessionId=?");
        if (r29 != null) goto L7;
        r1.mo3339bindNull(1);     // Catch: Throwable -> L5
    L8:
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "requestId");     // Catch: Throwable -> L5
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "text");     // Catch: Throwable -> L5
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "translate");     // Catch: Throwable -> L5
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L5
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "duration");     // Catch: Throwable -> L5
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "isUpLoaded");     // Catch: Throwable -> L5
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "audioPath");     // Catch: Throwable -> L5
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "fromLanguage");     // Catch: Throwable -> L5
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "toLanguage");     // Catch: Throwable -> L5
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "createTime");     // Catch: Throwable -> L5
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "showType");     // Catch: Throwable -> L5
        ArrayList r13 = new ArrayList();     // Catch: Throwable -> L5
    L9:
        if (r1.step() == false) goto L46;
        String r15 = null;
        if (r1.isNull(r0) == false) goto L14;
        String r17 = null;
    L16:
        if (r1.isNull(r3) == false) goto L18;
        String r18 = null;
    L20:
        if (r1.isNull(r4) == false) goto L22;
        String r19 = null;
    L24:
        if (r1.isNull(r5) == false) goto L27;
        String r20 = null;
    L26:
        int r210 = r3;
        float r2 = (float) r1.getDouble(r6);     // Catch: Throwable -> L5
        if (((int) r1.getLong(r7)) == 0) goto L31;
        boolean r22 = true;
    L33:
        if (r1.isNull(r8) == false) goto L35;
        String r23 = null;
    L37:
        if (r1.isNull(r9) == false) goto L39;
        String r24 = null;
    L41:
        if (r1.isNull(r10) == true) goto L44;
        r15 = r1.getText(r10);     // Catch: Throwable -> L5
    L44:
        r13.add(new TranslateEntity(r17, r18, r19, r20, r2, r22, r23, r24, r15, r1.getLong(r11), (int) r1.getLong(r12)));     // Catch: Throwable -> L5
        r3 = r210;
        goto L9
    L39:
        r24 = r1.getText(r9);     // Catch: Throwable -> L5
        goto L41
    L35:
        r23 = r1.getText(r8);     // Catch: Throwable -> L5
        goto L37
    L31:
        r22 = false;
        goto L33
    L27:
        r20 = r1.getText(r5);     // Catch: Throwable -> L5
        goto L26
    L22:
        r19 = r1.getText(r4);     // Catch: Throwable -> L5
        goto L24
    L18:
        r18 = r1.getText(r3);     // Catch: Throwable -> L5
        goto L20
    L14:
        r17 = r1.getText(r0);     // Catch: Throwable -> L5
        goto L16
    L46:
        r1.close();
        return r13;
    L7:
        r1.mo3340bindText(1, r29);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Object O00(TranslateDao_Impl r0, TranslateEntity r1, SQLiteConnection r2) {
        r0.__updateAdapterOfTranslateEntity.handle(r2, r1);
        return null;
    }

    public static /* synthetic */ List OXO1(SQLiteConnection r28) {
        SQLiteStatement r1 = r28.prepare("\n        SELECT t.*\n        FROM TranslateEntity t\n        INNER JOIN (\n            SELECT sessionId, MIN(createTime) AS firstTime\n            FROM TranslateEntity\n            GROUP BY sessionId\n        ) grouped ON t.sessionId = grouped.sessionId AND t.createTime = grouped.firstTime\n        ORDER BY t.createTime ASC\n    ");
        int r0 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "requestId");     // Catch: Throwable -> L41
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "text");     // Catch: Throwable -> L41
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "translate");     // Catch: Throwable -> L41
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, JsonStorageKeyNames.SESSION_ID_KEY);     // Catch: Throwable -> L41
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "duration");     // Catch: Throwable -> L41
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "isUpLoaded");     // Catch: Throwable -> L41
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "audioPath");     // Catch: Throwable -> L41
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "fromLanguage");     // Catch: Throwable -> L41
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "toLanguage");     // Catch: Throwable -> L41
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "createTime");     // Catch: Throwable -> L41
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "showType");     // Catch: Throwable -> L41
        ArrayList r12 = new ArrayList();     // Catch: Throwable -> L41
    L4:
        if (r1.step() == false) goto L43;
        if (r1.isNull(r0) == false) goto L9;
        String r16 = null;
    L11:
        if (r1.isNull(r2) == false) goto L13;
        String r17 = null;
    L15:
        if (r1.isNull(r3) == false) goto L17;
        String r18 = null;
    L19:
        if (r1.isNull(r4) == false) goto L21;
        String r19 = null;
    L22:
        float r13 = (float) r1.getDouble(r5);     // Catch: Throwable -> L41
        if (((int) r1.getLong(r6)) == 0) goto L26;
        boolean r14 = true;
    L25:
        boolean r21 = r14;
        if (r1.isNull(r7) == false) goto L30;
        String r22 = null;
    L32:
        if (r1.isNull(r8) == false) goto L34;
        String r23 = null;
    L36:
        if (r1.isNull(r9) == false) goto L38;
        String r24 = null;
    L39:
        r12.add(new TranslateEntity(r16, r17, r18, r19, r13, r21, r22, r23, r24, r1.getLong(r10), (int) r1.getLong(r11)));     // Catch: Throwable -> L41
        goto L4
    L38:
        r24 = r1.getText(r9);     // Catch: Throwable -> L41
        goto L39
    L34:
        r23 = r1.getText(r8);     // Catch: Throwable -> L41
        goto L36
    L30:
        r22 = r1.getText(r7);     // Catch: Throwable -> L41
        goto L32
    L26:
        r14 = false;
        goto L25
    L21:
        r19 = r1.getText(r4);     // Catch: Throwable -> L41
        goto L22
    L17:
        r18 = r1.getText(r3);     // Catch: Throwable -> L41
        goto L19
    L13:
        r17 = r1.getText(r2);     // Catch: Throwable -> L41
        goto L15
    L9:
        r16 = r1.getText(r0);     // Catch: Throwable -> L41
        goto L11
    L43:
        r1.close();
        return r12;
    L41:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List XIi00iiXO(TranslateDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfTranslateEntity_1.insertAndReturnIdsList(r2, r1);
    }

    public static /* synthetic */ Object XO0O10(TranslateDao_Impl r0, TranslateEntity r1, SQLiteConnection r2) {
        r0.__deleteAdapterOfTranslateEntity.handle(r2, r1);
        return null;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ Long iO(TranslateDao_Impl r0, TranslateEntity r1, SQLiteConnection r2) {
        return Long.valueOf(r0.__insertAdapterOfTranslateEntity.insertAndReturnId(r2, r1));
    }

    @Override // com.sma.smartv3.db.dao.TranslateDao
    public void delete(final TranslateEntity entity) {
        entity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new i06(this, entity));
    }

    @Override // com.sma.smartv3.db.dao.TranslateDao
    public List<TranslateEntity> getFirstTranslatePerSession() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new j06());
    }

    @Override // com.sma.smartv3.db.dao.TranslateDao
    public List<TranslateEntity> getTranslateEntityWithSessionId(final String sessionId) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new e06(sessionId));
    }

    @Override // com.sma.smartv3.db.dao.TranslateDao
    public long insert(final TranslateEntity entity) {
        entity.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new g06(this, entity))).longValue();
    }

    @Override // com.sma.smartv3.db.dao.TranslateDao
    public List<Long> insertAll(final List<TranslateEntity> list) {
        list.getClass();
        return (List) DBUtil.performBlocking(this.__db, false, true, new f06(this, list));
    }

    @Override // com.sma.smartv3.db.dao.TranslateDao
    public void update(final TranslateEntity entity) {
        entity.getClass();
        DBUtil.performBlocking(this.__db, false, true, new h06(this, entity));
    }
}
