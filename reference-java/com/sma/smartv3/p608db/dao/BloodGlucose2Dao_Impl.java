package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao_Impl;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucose2Dao_Impl implements BloodGlucose2Dao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<BloodGlucose2> __insertAdapterOfBloodGlucose2 = new EntityInsertAdapter<BloodGlucose2>() { // from class: com.sma.smartv3.db.dao.BloodGlucose2Dao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `BloodGlucose2` (`mId`,`mTime`,`mMeasurementId`,`mUserId`,`mStartTime`,`mEndTime`,`mModelNo`,`mLowerBound`,`mUpperBound`,`mFasting`,`mWithin2hrsMeal`,`mCompletedProgress`,`mCurrentLevel`,`mRiskCode`,`mInsights`,`mTips`,`mLocaleInsights`,`mLocaleTips`,`mIsSync`,`mIsDelete`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final BloodGlucose2 entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMMeasurementId() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMMeasurementId());
            }
            if (entity.getMUserId() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMUserId());
            }
            if (entity.getMStartTime() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMStartTime());
            }
            if (entity.getMEndTime() == null) {
                statement.mo47600bindNull(6);
            } else {
                statement.mo47601bindText(6, entity.getMEndTime());
            }
            if (entity.getMModelNo() == null) {
                statement.mo47600bindNull(7);
            } else {
                statement.mo47601bindText(7, entity.getMModelNo());
            }
            statement.mo47598bindDouble(8, entity.getMLowerBound());
            statement.mo47598bindDouble(9, entity.getMUpperBound());
            statement.mo47599bindLong(10, entity.getMFasting());
            statement.mo47599bindLong(11, entity.getMWithin2hrsMeal());
            statement.mo47599bindLong(12, entity.getMCompletedProgress());
            statement.mo47599bindLong(13, entity.getMCurrentLevel());
            if (entity.getMRiskCode() == null) {
                statement.mo47600bindNull(14);
            } else {
                statement.mo47601bindText(14, entity.getMRiskCode());
            }
            if (entity.getMInsights() == null) {
                statement.mo47600bindNull(15);
            } else {
                statement.mo47601bindText(15, entity.getMInsights());
            }
            if (entity.getMTips() == null) {
                statement.mo47600bindNull(16);
            } else {
                statement.mo47601bindText(16, entity.getMTips());
            }
            if (entity.getMLocaleInsights() == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, entity.getMLocaleInsights());
            }
            if (entity.getMLocaleTips() == null) {
                statement.mo47600bindNull(18);
            } else {
                statement.mo47601bindText(18, entity.getMLocaleTips());
            }
            statement.mo47599bindLong(19, entity.getMIsSync());
            statement.mo47599bindLong(20, entity.getMIsDelete());
        }
    };

    public BloodGlucose2Dao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List O00(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        String text2;
        int i3;
        String str;
        int i4;
        String str2;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMeasurementId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStartTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mEndTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModelNo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLowerBound");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUpperBound");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFasting");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWithin2hrsMeal");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCompletedProgress");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCurrentLevel");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRiskCode");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mInsights");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTips");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleInsights");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleTips");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i5 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                int i7 = columnIndexOrThrow2;
                int i8 = columnIndexOrThrow3;
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15)) {
                    i2 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow16;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                }
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i3 = columnIndexOrThrow17;
                    str = null;
                } else {
                    String text8 = sQLiteStatementPrepare.getText(i2);
                    i3 = columnIndexOrThrow17;
                    str = text8;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i4 = columnIndexOrThrow18;
                    str2 = null;
                } else {
                    String text9 = sQLiteStatementPrepare.getText(i3);
                    i4 = columnIndexOrThrow18;
                    str2 = text9;
                }
                int i13 = columnIndexOrThrow19;
                int i14 = i4;
                int i15 = columnIndexOrThrow5;
                int i16 = columnIndexOrThrow20;
                int i17 = columnIndexOrThrow4;
                arrayList2.add(new BloodGlucose2(i6, j, text3, text4, text5, text6, text7, d, d2, i9, i10, i11, i12, text, text2, str, str2, sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), (int) sQLiteStatementPrepare.getLong(i13), (int) sQLiteStatementPrepare.getLong(i16)));
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = columnIndexOrThrow15;
                columnIndexOrThrow16 = i2;
                columnIndexOrThrow17 = i3;
                columnIndexOrThrow18 = i14;
                columnIndexOrThrow19 = i13;
                columnIndexOrThrow2 = i7;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow5 = i15;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i17;
                columnIndexOrThrow20 = i16;
                columnIndexOrThrow3 = i8;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        int i2;
        String text2;
        int i3;
        String str;
        int i4;
        String str2;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM BloodGlucose2 WHERE mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMeasurementId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStartTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mEndTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModelNo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLowerBound");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUpperBound");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFasting");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWithin2hrsMeal");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCompletedProgress");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCurrentLevel");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRiskCode");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mInsights");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTips");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleInsights");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleTips");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i5 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                int i7 = columnIndexOrThrow2;
                int i8 = columnIndexOrThrow3;
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i5);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15)) {
                    i2 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow16;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                }
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i3 = columnIndexOrThrow17;
                    str = null;
                } else {
                    String text8 = sQLiteStatementPrepare.getText(i2);
                    i3 = columnIndexOrThrow17;
                    str = text8;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i4 = columnIndexOrThrow18;
                    str2 = null;
                } else {
                    String text9 = sQLiteStatementPrepare.getText(i3);
                    i4 = columnIndexOrThrow18;
                    str2 = text9;
                }
                int i13 = columnIndexOrThrow19;
                int i14 = i4;
                int i15 = columnIndexOrThrow5;
                int i16 = columnIndexOrThrow20;
                int i17 = columnIndexOrThrow4;
                arrayList2.add(new BloodGlucose2(i6, j, text3, text4, text5, text6, text7, d, d2, i9, i10, i11, i12, text, text2, str, str2, sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), (int) sQLiteStatementPrepare.getLong(i13), (int) sQLiteStatementPrepare.getLong(i16)));
                columnIndexOrThrow = i;
                columnIndexOrThrow15 = columnIndexOrThrow15;
                columnIndexOrThrow16 = i2;
                columnIndexOrThrow17 = i3;
                columnIndexOrThrow18 = i14;
                columnIndexOrThrow19 = i13;
                columnIndexOrThrow2 = i7;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow5 = i15;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i17;
                columnIndexOrThrow20 = i16;
                columnIndexOrThrow3 = i8;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XO0O10(long j, long j2, SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM BloodGlucose2 WHERE mTime >= ? AND mTime < ? AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime ASC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.mo47599bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMeasurementId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStartTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mEndTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModelNo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLowerBound");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUpperBound");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFasting");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWithin2hrsMeal");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCompletedProgress");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCurrentLevel");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRiskCode");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mInsights");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTips");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleInsights");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleTips");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i2);
                }
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                int i10 = columnIndexOrThrow15;
                int i11 = columnIndexOrThrow16;
                String text8 = sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11);
                columnIndexOrThrow16 = i11;
                int i12 = columnIndexOrThrow17;
                String text9 = sQLiteStatementPrepare.isNull(i12) ? null : sQLiteStatementPrepare.getText(i12);
                columnIndexOrThrow17 = i12;
                int i13 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i13;
                String text10 = sQLiteStatementPrepare.isNull(i13) ? null : sQLiteStatementPrepare.getText(i13);
                int i14 = columnIndexOrThrow19;
                int i15 = columnIndexOrThrow5;
                int i16 = columnIndexOrThrow20;
                int i17 = columnIndexOrThrow4;
                arrayList2.add(new BloodGlucose2(i3, j3, text2, text3, text4, text5, text6, d, d2, i6, i7, i8, i9, text, text7, text8, text9, text10, (int) sQLiteStatementPrepare.getLong(i14), (int) sQLiteStatementPrepare.getLong(i16)));
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow19 = i14;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow5 = i15;
                columnIndexOrThrow = i;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i17;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow20 = i16;
                columnIndexOrThrow3 = i5;
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
    public static /* synthetic */ List m38164iO(long j, long j2, SQLiteConnection sQLiteConnection) {
        int i;
        String text;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM BloodGlucose2 WHERE mTime >= ? AND mTime < ? AND mLowerBound > 0 AND mUpperBound > 0 ORDER BY mTime DESC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.mo47599bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMeasurementId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUserId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStartTime");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mEndTime");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModelNo");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLowerBound");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mUpperBound");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFasting");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWithin2hrsMeal");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCompletedProgress");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mCurrentLevel");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRiskCode");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mInsights");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTips");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleInsights");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocaleTips");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i2 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(i2);
                }
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                int i10 = columnIndexOrThrow15;
                int i11 = columnIndexOrThrow16;
                String text8 = sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11);
                columnIndexOrThrow16 = i11;
                int i12 = columnIndexOrThrow17;
                String text9 = sQLiteStatementPrepare.isNull(i12) ? null : sQLiteStatementPrepare.getText(i12);
                columnIndexOrThrow17 = i12;
                int i13 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i13;
                String text10 = sQLiteStatementPrepare.isNull(i13) ? null : sQLiteStatementPrepare.getText(i13);
                int i14 = columnIndexOrThrow19;
                int i15 = columnIndexOrThrow5;
                int i16 = columnIndexOrThrow20;
                int i17 = columnIndexOrThrow4;
                arrayList2.add(new BloodGlucose2(i3, j3, text2, text3, text4, text5, text6, d, d2, i6, i7, i8, i9, text, text7, text8, text9, text10, (int) sQLiteStatementPrepare.getLong(i14), (int) sQLiteStatementPrepare.getLong(i16)));
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow19 = i14;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow5 = i15;
                columnIndexOrThrow = i;
                arrayList = arrayList2;
                columnIndexOrThrow4 = i17;
                columnIndexOrThrow15 = i10;
                columnIndexOrThrow20 = i16;
                columnIndexOrThrow3 = i5;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iI1Xi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucose2Dao_Impl.O00((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListDESC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOI1IIIiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucose2Dao_Impl.XIi00iiXO((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListForDay() {
        return BloodGlucose2Dao.DefaultImpls.getListForDay(this);
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getTodayList() {
        return BloodGlucose2Dao.DefaultImpls.getTodayList(this);
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public long[] insert(final List<BloodGlucose2> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.XO1iI1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f4742IO.__insertAdapterOfBloodGlucose2.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getList(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OO0X0OXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucose2Dao_Impl.XO0O10(start, end, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListDESC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IiiiX01IX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucose2Dao_Impl.m38164iO(start, end, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.BloodGlucose2Dao
    public List<BloodGlucose2> getListForDay(final long start, final long end) {
        return BloodGlucose2Dao.DefaultImpls.getListForDay(this, start, end);
    }
}
