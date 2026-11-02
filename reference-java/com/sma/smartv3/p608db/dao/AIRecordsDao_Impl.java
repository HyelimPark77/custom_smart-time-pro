package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.AIRecordsDao_Impl;
import com.sma.smartv3.p608db.entity.AIRecords;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class AIRecordsDao_Impl implements AIRecordsDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<AIRecords> __insertAdapterOfAIRecords = new EntityInsertAdapter<AIRecords>() { // from class: com.sma.smartv3.db.dao.AIRecordsDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `AIRecords` (`mId`,`mTime`,`mLocalTime`,`mAIFuncType`,`mType`,`mContent`,`mExtraInfo`,`mStatus`,`mIsSync`,`mIsDelete`,`mAITitle`,`mTranslateLanguage`,`mTranslateToLanguage`,`mLocation`,`mAudioPath`,`mAudioDuration`,`ttsVoiceName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AIRecords entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMAIFuncType());
            statement.mo47599bindLong(5, entity.getMType());
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMContent());
            }
            if (entity.getMExtraInfo() == null) {
                statement.mo47600bindNull(7);
            } else {
                statement.mo47601bindText(7, entity.getMExtraInfo());
            }
            statement.mo47599bindLong(8, entity.getMStatus());
            statement.mo47599bindLong(9, entity.getMIsSync());
            statement.mo47599bindLong(10, entity.getMIsDelete());
            if (entity.getMAITitle() == null) {
                statement.mo47600bindNull(11);
            } else {
                statement.mo47601bindText(11, entity.getMAITitle());
            }
            if (entity.getMTranslateLanguage() == null) {
                statement.mo47600bindNull(12);
            } else {
                statement.mo47601bindText(12, entity.getMTranslateLanguage());
            }
            if (entity.getMTranslateToLanguage() == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, entity.getMTranslateToLanguage());
            }
            if (entity.getMLocation() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMLocation());
            }
            if (entity.getMAudioPath() == null) {
                statement.mo47600bindNull(15);
            } else {
                statement.mo47601bindText(15, entity.getMAudioPath());
            }
            statement.mo47599bindLong(16, entity.getMAudioDuration());
            if (entity.getTtsVoiceName() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getTtsVoiceName());
            }
        }
    };
    private final EntityInsertAdapter<AIRecords> __insertAdapterOfAIRecords_1 = new EntityInsertAdapter<AIRecords>() { // from class: com.sma.smartv3.db.dao.AIRecordsDao_Impl.2
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR ABORT INTO `AIRecords` (`mId`,`mTime`,`mLocalTime`,`mAIFuncType`,`mType`,`mContent`,`mExtraInfo`,`mStatus`,`mIsSync`,`mIsDelete`,`mAITitle`,`mTranslateLanguage`,`mTranslateToLanguage`,`mLocation`,`mAudioPath`,`mAudioDuration`,`ttsVoiceName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AIRecords entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMAIFuncType());
            statement.mo47599bindLong(5, entity.getMType());
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMContent());
            }
            if (entity.getMExtraInfo() == null) {
                statement.mo47600bindNull(7);
            } else {
                statement.mo47601bindText(7, entity.getMExtraInfo());
            }
            statement.mo47599bindLong(8, entity.getMStatus());
            statement.mo47599bindLong(9, entity.getMIsSync());
            statement.mo47599bindLong(10, entity.getMIsDelete());
            if (entity.getMAITitle() == null) {
                statement.mo47600bindNull(11);
            } else {
                statement.mo47601bindText(11, entity.getMAITitle());
            }
            if (entity.getMTranslateLanguage() == null) {
                statement.mo47600bindNull(12);
            } else {
                statement.mo47601bindText(12, entity.getMTranslateLanguage());
            }
            if (entity.getMTranslateToLanguage() == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, entity.getMTranslateToLanguage());
            }
            if (entity.getMLocation() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMLocation());
            }
            if (entity.getMAudioPath() == null) {
                statement.mo47600bindNull(15);
            } else {
                statement.mo47601bindText(15, entity.getMAudioPath());
            }
            statement.mo47599bindLong(16, entity.getMAudioDuration());
            if (entity.getTtsVoiceName() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getTtsVoiceName());
            }
        }
    };
    private final EntityDeleteOrUpdateAdapter<AIRecords> __updateAdapterOfAIRecords = new EntityDeleteOrUpdateAdapter<AIRecords>() { // from class: com.sma.smartv3.db.dao.AIRecordsDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `AIRecords` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mAIFuncType` = ?,`mType` = ?,`mContent` = ?,`mExtraInfo` = ?,`mStatus` = ?,`mIsSync` = ?,`mIsDelete` = ?,`mAITitle` = ?,`mTranslateLanguage` = ?,`mTranslateToLanguage` = ?,`mLocation` = ?,`mAudioPath` = ?,`mAudioDuration` = ?,`ttsVoiceName` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final AIRecords entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47599bindLong(4, entity.getMAIFuncType());
            statement.mo47599bindLong(5, entity.getMType());
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMContent());
            }
            if (entity.getMExtraInfo() == null) {
                statement.mo47600bindNull(7);
            } else {
                statement.mo47601bindText(7, entity.getMExtraInfo());
            }
            statement.mo47599bindLong(8, entity.getMStatus());
            statement.mo47599bindLong(9, entity.getMIsSync());
            statement.mo47599bindLong(10, entity.getMIsDelete());
            if (entity.getMAITitle() == null) {
                statement.mo47600bindNull(11);
            } else {
                statement.mo47601bindText(11, entity.getMAITitle());
            }
            if (entity.getMTranslateLanguage() == null) {
                statement.mo47600bindNull(12);
            } else {
                statement.mo47601bindText(12, entity.getMTranslateLanguage());
            }
            if (entity.getMTranslateToLanguage() == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, entity.getMTranslateToLanguage());
            }
            if (entity.getMLocation() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMLocation());
            }
            if (entity.getMAudioPath() == null) {
                statement.mo47600bindNull(15);
            } else {
                statement.mo47601bindText(15, entity.getMAudioPath());
            }
            statement.mo47599bindLong(16, entity.getMAudioDuration());
            if (entity.getTtsVoiceName() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getTtsVoiceName());
            }
            statement.mo47599bindLong(18, entity.getMId());
        }
    };

    public AIRecordsDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List O00(int i, SQLiteConnection sQLiteConnection) {
        int i2;
        String text;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM airecords WHERE mAIFuncType = ? AND mIsDelete !=1 ORDER BY mTime DESC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAIFuncType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mExtraInfo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStatus");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAITitle");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateLanguage");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateToLanguage");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocation");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioPath");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioDuration");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ttsVoiceName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i2 = columnIndexOrThrow;
                    text = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i3);
                }
                int i10 = columnIndexOrThrow16;
                int i11 = columnIndexOrThrow17;
                arrayList2.add(new AIRecords(i4, j, text2, i5, i6, text3, text4, i7, i8, i9, text5, text6, text7, text, sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), (int) sQLiteStatementPrepare.getLong(i10), sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11)));
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                arrayList = arrayList2;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow = i2;
                columnIndexOrThrow15 = columnIndexOrThrow15;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List OXO1(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        String text2;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM airecords WHERE  mIsSync = 0  ORDER BY mTime ASC LIMIT 150");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAIFuncType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mExtraInfo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStatus");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAITitle");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateLanguage");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateToLanguage");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocation");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioPath");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioDuration");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ttsVoiceName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i3);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15)) {
                    i2 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow16;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                }
                int i10 = columnIndexOrThrow17;
                arrayList2.add(new AIRecords(i4, j, text3, i5, i6, text4, text5, i7, i8, i9, text6, text7, text8, text, text2, (int) sQLiteStatementPrepare.getLong(i2), sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10)));
                int i11 = i2;
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = columnIndexOrThrow15;
                columnIndexOrThrow16 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                arrayList = arrayList2;
                columnIndexOrThrow14 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XOO0ii0(int i, SQLiteConnection sQLiteConnection) {
        int i2;
        String text;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM airecords WHERE mAIFuncType = ? AND mIsDelete !=1  ORDER BY mTime ASC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAIFuncType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mExtraInfo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStatus");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAITitle");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateLanguage");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateToLanguage");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocation");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioPath");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioDuration");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ttsVoiceName");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i2 = columnIndexOrThrow;
                    text = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i3);
                }
                int i10 = columnIndexOrThrow16;
                int i11 = columnIndexOrThrow17;
                arrayList2.add(new AIRecords(i4, j, text2, i5, i6, text3, text4, i7, i8, i9, text5, text6, text7, text, sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), (int) sQLiteStatementPrepare.getLong(i10), sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11)));
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow2 = columnIndexOrThrow2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                arrayList = arrayList2;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow = i2;
                columnIndexOrThrow15 = columnIndexOrThrow15;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ AIRecords m38160iO(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM airecords WHERE  mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAIFuncType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mExtraInfo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStatus");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAITitle");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateLanguage");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTranslateToLanguage");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocation");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioPath");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAudioDuration");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ttsVoiceName");
            AIRecords aIRecords = null;
            if (sQLiteStatementPrepare.step()) {
                aIRecords = new AIRecords((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17));
            }
            return aIRecords;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public AIRecords getAIRecord(final long id) {
        return (AIRecords) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1i0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIRecordsDao_Impl.m38160iO(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public List<AIRecords> getListASC(final int type) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOX1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIRecordsDao_Impl.XOO0ii0(type, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public List<AIRecords> getListDESC(final int type) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Oiii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIRecordsDao_Impl.O00(type, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public long[] insert(final List<AIRecords> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX0iii0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f8258IO.__insertAdapterOfAIRecords.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public int update(final List<AIRecords> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOOI0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f4807IO.__updateAdapterOfAIRecords.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public List<AIRecords> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OXI0Xi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIRecordsDao_Impl.OXO1((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public long insert(final AIRecords mAIRecords) {
        mAIRecords.getClass();
        return ((Long) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIIIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Long.valueOf(this.f4512IO.__insertAdapterOfAIRecords_1.insertAndReturnId((SQLiteConnection) obj, mAIRecords));
            }
        })).longValue();
    }

    @Override // com.sma.smartv3.p608db.dao.AIRecordsDao
    public int update(final AIRecords aiRecords) {
        aiRecords.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f7377IO.__updateAdapterOfAIRecords.handle((SQLiteConnection) obj, aiRecords));
            }
        })).intValue();
    }
}
