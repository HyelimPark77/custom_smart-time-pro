package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.RecordDeviceFileDao_Impl;
import com.sma.smartv3.p608db.entity.RecordDeviceFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class RecordDeviceFileDao_Impl implements RecordDeviceFileDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<RecordDeviceFile> __insertAdapterOfRecordDeviceFile = new EntityInsertAdapter<RecordDeviceFile>() { // from class: com.sma.smartv3.db.dao.RecordDeviceFileDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `RecordDeviceFile` (`mId`,`mTime`,`mLocalTime`,`mName`,`mPath`,`mSize`,`mWidth`,`mHeight`,`mDuration`,`mThumbnail`,`mFileType`,`mIsFavority`,`mContent`,`mIsSync`,`mIsDelete`,`mProcessType`,`mProcessStatus`,`mProcessPath`,`mIsRead`,`mIsConversion`,`mReservedTextType`,`mReservedText`,`mIsSummaryReport`,`mSummaryReportText`,`mFileName`,`mTaskId`,`mModel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceFile entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            if (entity.getMName() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMName());
            }
            if (entity.getMPath() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMPath());
            }
            statement.mo47599bindLong(6, entity.getMSize());
            statement.mo47599bindLong(7, entity.getMWidth());
            statement.mo47599bindLong(8, entity.getMHeight());
            statement.mo47599bindLong(9, entity.getMDuration());
            if (entity.getMThumbnail() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMThumbnail());
            }
            statement.mo47599bindLong(11, entity.getMFileType());
            statement.mo47599bindLong(12, entity.getMIsFavority());
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, entity.getMContent());
            }
            statement.mo47599bindLong(14, entity.getMIsSync());
            statement.mo47599bindLong(15, entity.getMIsDelete());
            statement.mo47599bindLong(16, entity.getMProcessType());
            statement.mo47599bindLong(17, entity.getMProcessStatus());
            if (entity.getMProcessPath() == null) {
                statement.mo47600bindNull(18);
            } else {
                statement.mo47601bindText(18, entity.getMProcessPath());
            }
            statement.mo47599bindLong(19, entity.getMIsRead());
            statement.mo47599bindLong(20, entity.getMIsConversion());
            statement.mo47599bindLong(21, entity.getMReservedTextType());
            if (entity.getMReservedText() == null) {
                statement.mo47600bindNull(22);
            } else {
                statement.mo47601bindText(22, entity.getMReservedText());
            }
            statement.mo47599bindLong(23, entity.getMIsSummaryReport());
            if (entity.getMSummaryReportText() == null) {
                statement.mo47600bindNull(24);
            } else {
                statement.mo47601bindText(24, entity.getMSummaryReportText());
            }
            if (entity.getMFileName() == null) {
                statement.mo47600bindNull(25);
            } else {
                statement.mo47601bindText(25, entity.getMFileName());
            }
            if (entity.getMTaskId() == null) {
                statement.mo47600bindNull(26);
            } else {
                statement.mo47601bindText(26, entity.getMTaskId());
            }
            statement.mo47599bindLong(27, entity.getMModel());
        }
    };
    private final EntityDeleteOrUpdateAdapter<RecordDeviceFile> __deleteAdapterOfRecordDeviceFile = new EntityDeleteOrUpdateAdapter<RecordDeviceFile>() { // from class: com.sma.smartv3.db.dao.RecordDeviceFileDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "DELETE FROM `RecordDeviceFile` WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceFile entity) {
            statement.mo47599bindLong(1, entity.getMId());
        }
    };
    private final EntityDeleteOrUpdateAdapter<RecordDeviceFile> __updateAdapterOfRecordDeviceFile = new EntityDeleteOrUpdateAdapter<RecordDeviceFile>() { // from class: com.sma.smartv3.db.dao.RecordDeviceFileDao_Impl.3
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `RecordDeviceFile` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mName` = ?,`mPath` = ?,`mSize` = ?,`mWidth` = ?,`mHeight` = ?,`mDuration` = ?,`mThumbnail` = ?,`mFileType` = ?,`mIsFavority` = ?,`mContent` = ?,`mIsSync` = ?,`mIsDelete` = ?,`mProcessType` = ?,`mProcessStatus` = ?,`mProcessPath` = ?,`mIsRead` = ?,`mIsConversion` = ?,`mReservedTextType` = ?,`mReservedText` = ?,`mIsSummaryReport` = ?,`mSummaryReportText` = ?,`mFileName` = ?,`mTaskId` = ?,`mModel` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final RecordDeviceFile entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            if (entity.getMName() == null) {
                statement.mo47600bindNull(4);
            } else {
                statement.mo47601bindText(4, entity.getMName());
            }
            if (entity.getMPath() == null) {
                statement.mo47600bindNull(5);
            } else {
                statement.mo47601bindText(5, entity.getMPath());
            }
            statement.mo47599bindLong(6, entity.getMSize());
            statement.mo47599bindLong(7, entity.getMWidth());
            statement.mo47599bindLong(8, entity.getMHeight());
            statement.mo47599bindLong(9, entity.getMDuration());
            if (entity.getMThumbnail() == null) {
                statement.mo47600bindNull(10);
            } else {
                statement.mo47601bindText(10, entity.getMThumbnail());
            }
            statement.mo47599bindLong(11, entity.getMFileType());
            statement.mo47599bindLong(12, entity.getMIsFavority());
            if (entity.getMContent() == null) {
                statement.mo47600bindNull(13);
            } else {
                statement.mo47601bindText(13, entity.getMContent());
            }
            statement.mo47599bindLong(14, entity.getMIsSync());
            statement.mo47599bindLong(15, entity.getMIsDelete());
            statement.mo47599bindLong(16, entity.getMProcessType());
            statement.mo47599bindLong(17, entity.getMProcessStatus());
            if (entity.getMProcessPath() == null) {
                statement.mo47600bindNull(18);
            } else {
                statement.mo47601bindText(18, entity.getMProcessPath());
            }
            statement.mo47599bindLong(19, entity.getMIsRead());
            statement.mo47599bindLong(20, entity.getMIsConversion());
            statement.mo47599bindLong(21, entity.getMReservedTextType());
            if (entity.getMReservedText() == null) {
                statement.mo47600bindNull(22);
            } else {
                statement.mo47601bindText(22, entity.getMReservedText());
            }
            statement.mo47599bindLong(23, entity.getMIsSummaryReport());
            if (entity.getMSummaryReportText() == null) {
                statement.mo47600bindNull(24);
            } else {
                statement.mo47601bindText(24, entity.getMSummaryReportText());
            }
            if (entity.getMFileName() == null) {
                statement.mo47600bindNull(25);
            } else {
                statement.mo47601bindText(25, entity.getMFileName());
            }
            if (entity.getMTaskId() == null) {
                statement.mo47600bindNull(26);
            } else {
                statement.mo47601bindText(26, entity.getMTaskId());
            }
            statement.mo47599bindLong(27, entity.getMModel());
            statement.mo47599bindLong(28, entity.getMId());
        }
    };

    public RecordDeviceFileDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ RecordDeviceFile I0IIOi(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceFile WHERE mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPath");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWidth");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeight");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mThumbnail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsFavority");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessType");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessStatus");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessPath");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsRead");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsConversion");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedTextType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedText");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSummaryReport");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSummaryReportText");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTaskId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModel");
            RecordDeviceFile recordDeviceFile = null;
            if (sQLiteStatementPrepare.step()) {
                RecordDeviceFile recordDeviceFile2 = new RecordDeviceFile();
                recordDeviceFile2.setMId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                recordDeviceFile2.setMTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                recordDeviceFile2.setMLocalTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                recordDeviceFile2.setMName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                recordDeviceFile2.setMPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                recordDeviceFile2.setMSize(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                recordDeviceFile2.setMWidth((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                recordDeviceFile2.setMHeight((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                recordDeviceFile2.setMDuration(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                recordDeviceFile2.setMThumbnail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                recordDeviceFile2.setMFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                recordDeviceFile2.setMIsFavority((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                recordDeviceFile2.setMContent(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                recordDeviceFile2.setMIsSync((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                recordDeviceFile2.setMIsDelete((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15));
                recordDeviceFile2.setMProcessType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16));
                recordDeviceFile2.setMProcessStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17));
                recordDeviceFile2.setMProcessPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                recordDeviceFile2.setMIsRead((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow19));
                recordDeviceFile2.setMIsConversion((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20));
                recordDeviceFile2.setMReservedTextType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                recordDeviceFile2.setMReservedText(sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22));
                recordDeviceFile2.setMIsSummaryReport((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                recordDeviceFile2.setMSummaryReportText(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                recordDeviceFile2.setMFileName(sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                recordDeviceFile2.setMTaskId(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                recordDeviceFile2.setMModel((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow27));
                recordDeviceFile = recordDeviceFile2;
            }
            return recordDeviceFile;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object IiI10X(RecordDeviceFileDao_Impl recordDeviceFileDao_Impl, List list, SQLiteConnection sQLiteConnection) {
        recordDeviceFileDao_Impl.__deleteAdapterOfRecordDeviceFile.handleMultiple(sQLiteConnection, list);
        return null;
    }

    public static /* synthetic */ List O00(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 4 OR mFileType == 5 ORDER BY mTime DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPath");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWidth");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeight");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mThumbnail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsFavority");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessType");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessStatus");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessPath");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsRead");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsConversion");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedTextType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedText");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSummaryReport");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSummaryReportText");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTaskId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                RecordDeviceFile recordDeviceFile = new RecordDeviceFile();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                recordDeviceFile.setMId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                recordDeviceFile.setMTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                recordDeviceFile.setMLocalTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                recordDeviceFile.setMName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                recordDeviceFile.setMPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                recordDeviceFile.setMSize(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                recordDeviceFile.setMWidth((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                recordDeviceFile.setMHeight((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                recordDeviceFile.setMDuration(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                recordDeviceFile.setMThumbnail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                recordDeviceFile.setMFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                recordDeviceFile.setMIsFavority((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                recordDeviceFile.setMContent(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                recordDeviceFile.setMIsSync((int) sQLiteStatementPrepare.getLong(i2));
                int i5 = columnIndexOrThrow15;
                recordDeviceFile.setMIsDelete((int) sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow16;
                int i7 = columnIndexOrThrow4;
                recordDeviceFile.setMProcessType((int) sQLiteStatementPrepare.getLong(i6));
                int i8 = columnIndexOrThrow17;
                int i9 = columnIndexOrThrow5;
                recordDeviceFile.setMProcessStatus((int) sQLiteStatementPrepare.getLong(i8));
                int i10 = columnIndexOrThrow18;
                recordDeviceFile.setMProcessPath(sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10));
                int i11 = columnIndexOrThrow19;
                recordDeviceFile.setMIsRead((int) sQLiteStatementPrepare.getLong(i11));
                int i12 = columnIndexOrThrow20;
                recordDeviceFile.setMIsConversion((int) sQLiteStatementPrepare.getLong(i12));
                int i13 = columnIndexOrThrow21;
                recordDeviceFile.setMReservedTextType((int) sQLiteStatementPrepare.getLong(i13));
                int i14 = columnIndexOrThrow22;
                recordDeviceFile.setMReservedText(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14));
                int i15 = columnIndexOrThrow23;
                recordDeviceFile.setMIsSummaryReport((int) sQLiteStatementPrepare.getLong(i15));
                int i16 = columnIndexOrThrow24;
                recordDeviceFile.setMSummaryReportText(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = columnIndexOrThrow25;
                recordDeviceFile.setMFileName(sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
                columnIndexOrThrow26 = columnIndexOrThrow26;
                recordDeviceFile.setMTaskId(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                columnIndexOrThrow24 = i16;
                int i18 = columnIndexOrThrow27;
                recordDeviceFile.setMModel((int) sQLiteStatementPrepare.getLong(i18));
                arrayList2.add(recordDeviceFile);
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow27 = i18;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow25 = i17;
                columnIndexOrThrow22 = i14;
                columnIndexOrThrow4 = i7;
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow5 = i9;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow21 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow3 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object OIX0iXi(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM RecordDeviceFile");
        try {
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List OIi0(String str, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT * FROM RecordDeviceFile \n        WHERE LOWER(mName) LIKE '%.aac' \n        AND SUBSTR(mName, 1, LENGTH(mName) - 4) LIKE '%' || ? || '%' COLLATE NOCASE \n        ORDER BY mTime DESC\n        ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo47600bindNull(1);
            } else {
                sQLiteStatementPrepare.mo47601bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPath");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWidth");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeight");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mThumbnail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsFavority");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessType");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessStatus");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessPath");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsRead");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsConversion");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedTextType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedText");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSummaryReport");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSummaryReportText");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTaskId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                RecordDeviceFile recordDeviceFile = new RecordDeviceFile();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                recordDeviceFile.setMId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                recordDeviceFile.setMTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                recordDeviceFile.setMLocalTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                recordDeviceFile.setMName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                recordDeviceFile.setMPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                recordDeviceFile.setMSize(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                recordDeviceFile.setMWidth((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                recordDeviceFile.setMHeight((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                recordDeviceFile.setMDuration(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                recordDeviceFile.setMThumbnail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                recordDeviceFile.setMFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                recordDeviceFile.setMIsFavority((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                recordDeviceFile.setMContent(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                recordDeviceFile.setMIsSync((int) sQLiteStatementPrepare.getLong(i2));
                int i5 = columnIndexOrThrow15;
                recordDeviceFile.setMIsDelete((int) sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow16;
                int i7 = columnIndexOrThrow4;
                recordDeviceFile.setMProcessType((int) sQLiteStatementPrepare.getLong(i6));
                int i8 = columnIndexOrThrow17;
                int i9 = columnIndexOrThrow5;
                recordDeviceFile.setMProcessStatus((int) sQLiteStatementPrepare.getLong(i8));
                int i10 = columnIndexOrThrow18;
                recordDeviceFile.setMProcessPath(sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10));
                int i11 = columnIndexOrThrow19;
                recordDeviceFile.setMIsRead((int) sQLiteStatementPrepare.getLong(i11));
                int i12 = columnIndexOrThrow20;
                recordDeviceFile.setMIsConversion((int) sQLiteStatementPrepare.getLong(i12));
                int i13 = columnIndexOrThrow21;
                recordDeviceFile.setMReservedTextType((int) sQLiteStatementPrepare.getLong(i13));
                int i14 = columnIndexOrThrow22;
                recordDeviceFile.setMReservedText(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14));
                int i15 = columnIndexOrThrow23;
                recordDeviceFile.setMIsSummaryReport((int) sQLiteStatementPrepare.getLong(i15));
                int i16 = columnIndexOrThrow24;
                recordDeviceFile.setMSummaryReportText(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = columnIndexOrThrow25;
                recordDeviceFile.setMFileName(sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
                columnIndexOrThrow26 = columnIndexOrThrow26;
                recordDeviceFile.setMTaskId(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                columnIndexOrThrow24 = i16;
                int i18 = columnIndexOrThrow27;
                recordDeviceFile.setMModel((int) sQLiteStatementPrepare.getLong(i18));
                arrayList2.add(recordDeviceFile);
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow4 = i7;
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow22 = i14;
                columnIndexOrThrow27 = i18;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow25 = i17;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow5 = i9;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow21 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow3 = i4;
            }
            ArrayList arrayList3 = arrayList;
            sQLiteStatementPrepare.close();
            return arrayList3;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static /* synthetic */ Object OXO1(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM RecordDeviceFile WHERE mId = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XIi00iiXO(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceFile WHERE mIsFavority == 1 ORDER BY mTime DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPath");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWidth");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeight");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mThumbnail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsFavority");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessType");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessStatus");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessPath");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsRead");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsConversion");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedTextType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedText");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSummaryReport");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSummaryReportText");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTaskId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                RecordDeviceFile recordDeviceFile = new RecordDeviceFile();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                recordDeviceFile.setMId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                recordDeviceFile.setMTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                recordDeviceFile.setMLocalTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                recordDeviceFile.setMName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                recordDeviceFile.setMPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                recordDeviceFile.setMSize(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                recordDeviceFile.setMWidth((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                recordDeviceFile.setMHeight((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                recordDeviceFile.setMDuration(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                recordDeviceFile.setMThumbnail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                recordDeviceFile.setMFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                recordDeviceFile.setMIsFavority((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                recordDeviceFile.setMContent(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                recordDeviceFile.setMIsSync((int) sQLiteStatementPrepare.getLong(i2));
                int i5 = columnIndexOrThrow15;
                recordDeviceFile.setMIsDelete((int) sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow16;
                int i7 = columnIndexOrThrow4;
                recordDeviceFile.setMProcessType((int) sQLiteStatementPrepare.getLong(i6));
                int i8 = columnIndexOrThrow17;
                int i9 = columnIndexOrThrow5;
                recordDeviceFile.setMProcessStatus((int) sQLiteStatementPrepare.getLong(i8));
                int i10 = columnIndexOrThrow18;
                recordDeviceFile.setMProcessPath(sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10));
                int i11 = columnIndexOrThrow19;
                recordDeviceFile.setMIsRead((int) sQLiteStatementPrepare.getLong(i11));
                int i12 = columnIndexOrThrow20;
                recordDeviceFile.setMIsConversion((int) sQLiteStatementPrepare.getLong(i12));
                int i13 = columnIndexOrThrow21;
                recordDeviceFile.setMReservedTextType((int) sQLiteStatementPrepare.getLong(i13));
                int i14 = columnIndexOrThrow22;
                recordDeviceFile.setMReservedText(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14));
                int i15 = columnIndexOrThrow23;
                recordDeviceFile.setMIsSummaryReport((int) sQLiteStatementPrepare.getLong(i15));
                int i16 = columnIndexOrThrow24;
                recordDeviceFile.setMSummaryReportText(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = columnIndexOrThrow25;
                recordDeviceFile.setMFileName(sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
                columnIndexOrThrow26 = columnIndexOrThrow26;
                recordDeviceFile.setMTaskId(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                columnIndexOrThrow24 = i16;
                int i18 = columnIndexOrThrow27;
                recordDeviceFile.setMModel((int) sQLiteStatementPrepare.getLong(i18));
                arrayList2.add(recordDeviceFile);
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow27 = i18;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow25 = i17;
                columnIndexOrThrow22 = i14;
                columnIndexOrThrow4 = i7;
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow5 = i9;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow21 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow3 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XO0O10(SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceFile WHERE mFileType == 0 OR mFileType == 2  OR mFileType == 5 ORDER BY mTime DESC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPath");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWidth");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeight");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mThumbnail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsFavority");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessType");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessStatus");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessPath");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsRead");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsConversion");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedTextType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedText");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSummaryReport");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSummaryReportText");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTaskId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                RecordDeviceFile recordDeviceFile = new RecordDeviceFile();
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                recordDeviceFile.setMId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                recordDeviceFile.setMTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                recordDeviceFile.setMLocalTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                recordDeviceFile.setMName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                recordDeviceFile.setMPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                recordDeviceFile.setMSize(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                recordDeviceFile.setMWidth((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                recordDeviceFile.setMHeight((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                recordDeviceFile.setMDuration(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                recordDeviceFile.setMThumbnail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                recordDeviceFile.setMFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                recordDeviceFile.setMIsFavority((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                recordDeviceFile.setMContent(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i));
                recordDeviceFile.setMIsSync((int) sQLiteStatementPrepare.getLong(i2));
                int i5 = columnIndexOrThrow15;
                recordDeviceFile.setMIsDelete((int) sQLiteStatementPrepare.getLong(i5));
                int i6 = columnIndexOrThrow16;
                int i7 = columnIndexOrThrow4;
                recordDeviceFile.setMProcessType((int) sQLiteStatementPrepare.getLong(i6));
                int i8 = columnIndexOrThrow17;
                int i9 = columnIndexOrThrow5;
                recordDeviceFile.setMProcessStatus((int) sQLiteStatementPrepare.getLong(i8));
                int i10 = columnIndexOrThrow18;
                recordDeviceFile.setMProcessPath(sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10));
                int i11 = columnIndexOrThrow19;
                recordDeviceFile.setMIsRead((int) sQLiteStatementPrepare.getLong(i11));
                int i12 = columnIndexOrThrow20;
                recordDeviceFile.setMIsConversion((int) sQLiteStatementPrepare.getLong(i12));
                int i13 = columnIndexOrThrow21;
                recordDeviceFile.setMReservedTextType((int) sQLiteStatementPrepare.getLong(i13));
                int i14 = columnIndexOrThrow22;
                recordDeviceFile.setMReservedText(sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14));
                int i15 = columnIndexOrThrow23;
                recordDeviceFile.setMIsSummaryReport((int) sQLiteStatementPrepare.getLong(i15));
                int i16 = columnIndexOrThrow24;
                recordDeviceFile.setMSummaryReportText(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = columnIndexOrThrow25;
                recordDeviceFile.setMFileName(sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
                columnIndexOrThrow26 = columnIndexOrThrow26;
                recordDeviceFile.setMTaskId(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                columnIndexOrThrow24 = i16;
                int i18 = columnIndexOrThrow27;
                recordDeviceFile.setMModel((int) sQLiteStatementPrepare.getLong(i18));
                arrayList2.add(recordDeviceFile);
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow27 = i18;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow25 = i17;
                columnIndexOrThrow22 = i14;
                columnIndexOrThrow4 = i7;
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow23 = i15;
                columnIndexOrThrow5 = i9;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow21 = i13;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow3 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XOO0ii0(int i, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM RecordDeviceFile WHERE mFileType == ? ORDER BY mTime DESC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mPath");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSize");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWidth");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mHeight");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDuration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mThumbnail");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsFavority");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mContent");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessType");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessStatus");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mProcessPath");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsRead");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsConversion");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedTextType");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mReservedText");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSummaryReport");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mSummaryReportText");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFileName");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTaskId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mModel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                ArrayList arrayList2 = arrayList;
                RecordDeviceFile recordDeviceFile = new RecordDeviceFile();
                int i2 = columnIndexOrThrow13;
                int i3 = columnIndexOrThrow14;
                recordDeviceFile.setMId(sQLiteStatementPrepare.getLong(columnIndexOrThrow));
                recordDeviceFile.setMTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                recordDeviceFile.setMLocalTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                recordDeviceFile.setMName(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                recordDeviceFile.setMPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                recordDeviceFile.setMSize(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                recordDeviceFile.setMWidth((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7));
                recordDeviceFile.setMHeight((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                recordDeviceFile.setMDuration(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                recordDeviceFile.setMThumbnail(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                recordDeviceFile.setMFileType((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                recordDeviceFile.setMIsFavority((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                recordDeviceFile.setMContent(sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2));
                recordDeviceFile.setMIsSync((int) sQLiteStatementPrepare.getLong(i3));
                int i6 = columnIndexOrThrow15;
                recordDeviceFile.setMIsDelete((int) sQLiteStatementPrepare.getLong(i6));
                int i7 = columnIndexOrThrow16;
                int i8 = columnIndexOrThrow4;
                recordDeviceFile.setMProcessType((int) sQLiteStatementPrepare.getLong(i7));
                int i9 = columnIndexOrThrow17;
                int i10 = columnIndexOrThrow5;
                recordDeviceFile.setMProcessStatus((int) sQLiteStatementPrepare.getLong(i9));
                int i11 = columnIndexOrThrow18;
                recordDeviceFile.setMProcessPath(sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11));
                int i12 = columnIndexOrThrow19;
                recordDeviceFile.setMIsRead((int) sQLiteStatementPrepare.getLong(i12));
                int i13 = columnIndexOrThrow20;
                recordDeviceFile.setMIsConversion((int) sQLiteStatementPrepare.getLong(i13));
                int i14 = columnIndexOrThrow21;
                recordDeviceFile.setMReservedTextType((int) sQLiteStatementPrepare.getLong(i14));
                int i15 = columnIndexOrThrow22;
                recordDeviceFile.setMReservedText(sQLiteStatementPrepare.isNull(i15) ? null : sQLiteStatementPrepare.getText(i15));
                int i16 = columnIndexOrThrow23;
                recordDeviceFile.setMIsSummaryReport((int) sQLiteStatementPrepare.getLong(i16));
                int i17 = columnIndexOrThrow24;
                recordDeviceFile.setMSummaryReportText(sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
                int i18 = columnIndexOrThrow25;
                recordDeviceFile.setMFileName(sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18));
                columnIndexOrThrow26 = columnIndexOrThrow26;
                recordDeviceFile.setMTaskId(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                columnIndexOrThrow24 = i17;
                int i19 = columnIndexOrThrow27;
                recordDeviceFile.setMModel((int) sQLiteStatementPrepare.getLong(i19));
                arrayList2.add(recordDeviceFile);
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow4 = i8;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow18 = i11;
                columnIndexOrThrow20 = i13;
                columnIndexOrThrow22 = i15;
                columnIndexOrThrow27 = i19;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow25 = i18;
                columnIndexOrThrow23 = i16;
                columnIndexOrThrow5 = i10;
                columnIndexOrThrow17 = i9;
                columnIndexOrThrow19 = i12;
                columnIndexOrThrow21 = i14;
                arrayList = arrayList2;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow13 = i2;
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

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public void delete(final List<RecordDeviceFile> lists) {
        lists.getClass();
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.kc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.IiI10X(this.f9147IO, lists, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public void deleteAll() {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.ic3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.OIX0iXi((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public void deleteById(final long id) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.mc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.OXO1(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getAlbumListAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.lc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.O00((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public RecordDeviceFile getDeviceFiletById(final long id) {
        return (RecordDeviceFile) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.jc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.I0IIOi(id, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getFavorityList() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.cc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.XIi00iiXO((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getListAll() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.dc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.XO0O10((SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> getListByType(final int fileType) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.hc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.XOO0ii0(fileType, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public long[] insert(final List<RecordDeviceFile> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.ec3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f6385IO.__insertAdapterOfRecordDeviceFile.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public List<RecordDeviceFile> searchByNameIgnoreCase(final String keyword) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.gc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RecordDeviceFileDao_Impl.OIi0(keyword, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.RecordDeviceFileDao
    public int update(final List<RecordDeviceFile> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.fc3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f6613IO.__updateAdapterOfRecordDeviceFile.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
