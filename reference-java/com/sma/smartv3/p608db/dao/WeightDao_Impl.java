package com.sma.smartv3.p608db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.sma.smartv3.p608db.dao.WeightDao_Impl;
import com.sma.smartv3.p608db.entity.ListDoubleConverter;
import com.sma.smartv3.p608db.entity.Weight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightDao_Impl implements WeightDao {
    private final RoomDatabase __db;
    private final ListDoubleConverter __listDoubleConverter = new ListDoubleConverter();
    private final EntityInsertAdapter<Weight> __insertAdapterOfWeight = new EntityInsertAdapter<Weight>() { // from class: com.sma.smartv3.db.dao.WeightDao_Impl.1
        @Override // androidx.room.EntityInsertAdapter
        @NonNull
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Weight` (`mId`,`mTime`,`mLocalTime`,`mWeight`,`mIsSync`,`mIsMeasure`,`mBmi`,`mRatioOfFat`,`mWeightOfMuscle`,`mWeightOfFat`,`mRatioOfProtein`,`mRatioOfWater`,`mStateOfNutrition`,`mIdealWeight`,`mAgeOfBody`,`mAgeOfBodyRange`,`mBmiRange`,`mBmiWHORange`,`mBmr`,`mBmrRange`,`mBodyShape`,`mDesirableWeight`,`mFatFreeBodyWeight`,`mFatToControl`,`mLevelOfVisceralFat`,`mLevelOfVisceralFatRange`,`mMuscleToControl`,`mRatioOfFatRange`,`mRatioOfMuscle`,`mRatioOfMuscleRange`,`mRatioOfProteinRange`,`mRatioOfSkeletalMuscle`,`mRatioOfSkeletalMuscleRange`,`mRatioOfSubcutaneousFat`,`mRatioOfSubcutaneousFatRange`,`mRatioOfWaterRange`,`mScore`,`mWeightOfBone`,`mWeightOfBoneRange`,`mWeightOfFatRange`,`mWeightOfMuscleRange`,`mWeightOfProtein`,`mWeightOfProteinRange`,`mWeightOfSkeletalMuscle`,`mWeightOfSkeletalMuscleRange`,`mWeightOfWater`,`mWeightOfWaterRange`,`mWeightRange`,`mWeightToControl`,`mWeightWHORange`,`mIsDelete`,`mRatioOfProteinLevel`,`mRatioOfWaterLevel`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final Weight entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47598bindDouble(4, entity.getMWeight());
            statement.mo47599bindLong(5, entity.getMIsSync());
            statement.mo47599bindLong(6, entity.getMIsMeasure());
            statement.mo47598bindDouble(7, entity.getMBmi());
            statement.mo47598bindDouble(8, entity.getMRatioOfFat());
            statement.mo47598bindDouble(9, entity.getMWeightOfMuscle());
            statement.mo47598bindDouble(10, entity.getMWeightOfFat());
            statement.mo47598bindDouble(11, entity.getMRatioOfProtein());
            statement.mo47598bindDouble(12, entity.getMRatioOfWater());
            statement.mo47598bindDouble(13, entity.getMStateOfNutrition());
            statement.mo47598bindDouble(14, entity.getMIdealWeight());
            statement.mo47598bindDouble(15, entity.getMAgeOfBody());
            String strObjectToString = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMAgeOfBodyRange());
            if (strObjectToString == null) {
                statement.mo47600bindNull(16);
            } else {
                statement.mo47601bindText(16, strObjectToString);
            }
            String strObjectToString2 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMBmiRange());
            if (strObjectToString2 == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, strObjectToString2);
            }
            String strObjectToString3 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMBmiWHORange());
            if (strObjectToString3 == null) {
                statement.mo47600bindNull(18);
            } else {
                statement.mo47601bindText(18, strObjectToString3);
            }
            statement.mo47598bindDouble(19, entity.getMBmr());
            String strObjectToString4 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMBmrRange());
            if (strObjectToString4 == null) {
                statement.mo47600bindNull(20);
            } else {
                statement.mo47601bindText(20, strObjectToString4);
            }
            statement.mo47598bindDouble(21, entity.getMBodyShape());
            statement.mo47598bindDouble(22, entity.getMDesirableWeight());
            statement.mo47598bindDouble(23, entity.getMFatFreeBodyWeight());
            statement.mo47598bindDouble(24, entity.getMFatToControl());
            statement.mo47598bindDouble(25, entity.getMLevelOfVisceralFat());
            String strObjectToString5 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMLevelOfVisceralFatRange());
            if (strObjectToString5 == null) {
                statement.mo47600bindNull(26);
            } else {
                statement.mo47601bindText(26, strObjectToString5);
            }
            statement.mo47598bindDouble(27, entity.getMMuscleToControl());
            String strObjectToString6 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfFatRange());
            if (strObjectToString6 == null) {
                statement.mo47600bindNull(28);
            } else {
                statement.mo47601bindText(28, strObjectToString6);
            }
            statement.mo47598bindDouble(29, entity.getMRatioOfMuscle());
            String strObjectToString7 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfMuscleRange());
            if (strObjectToString7 == null) {
                statement.mo47600bindNull(30);
            } else {
                statement.mo47601bindText(30, strObjectToString7);
            }
            String strObjectToString8 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfProteinRange());
            if (strObjectToString8 == null) {
                statement.mo47600bindNull(31);
            } else {
                statement.mo47601bindText(31, strObjectToString8);
            }
            statement.mo47598bindDouble(32, entity.getMRatioOfSkeletalMuscle());
            String strObjectToString9 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfSkeletalMuscleRange());
            if (strObjectToString9 == null) {
                statement.mo47600bindNull(33);
            } else {
                statement.mo47601bindText(33, strObjectToString9);
            }
            statement.mo47598bindDouble(34, entity.getMRatioOfSubcutaneousFat());
            String strObjectToString10 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfSubcutaneousFatRange());
            if (strObjectToString10 == null) {
                statement.mo47600bindNull(35);
            } else {
                statement.mo47601bindText(35, strObjectToString10);
            }
            String strObjectToString11 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfWaterRange());
            if (strObjectToString11 == null) {
                statement.mo47600bindNull(36);
            } else {
                statement.mo47601bindText(36, strObjectToString11);
            }
            statement.mo47598bindDouble(37, entity.getMScore());
            statement.mo47598bindDouble(38, entity.getMWeightOfBone());
            String strObjectToString12 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfBoneRange());
            if (strObjectToString12 == null) {
                statement.mo47600bindNull(39);
            } else {
                statement.mo47601bindText(39, strObjectToString12);
            }
            String strObjectToString13 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfFatRange());
            if (strObjectToString13 == null) {
                statement.mo47600bindNull(40);
            } else {
                statement.mo47601bindText(40, strObjectToString13);
            }
            String strObjectToString14 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfMuscleRange());
            if (strObjectToString14 == null) {
                statement.mo47600bindNull(41);
            } else {
                statement.mo47601bindText(41, strObjectToString14);
            }
            statement.mo47598bindDouble(42, entity.getMWeightOfProtein());
            String strObjectToString15 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfProteinRange());
            if (strObjectToString15 == null) {
                statement.mo47600bindNull(43);
            } else {
                statement.mo47601bindText(43, strObjectToString15);
            }
            statement.mo47598bindDouble(44, entity.getMWeightOfSkeletalMuscle());
            String strObjectToString16 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfSkeletalMuscleRange());
            if (strObjectToString16 == null) {
                statement.mo47600bindNull(45);
            } else {
                statement.mo47601bindText(45, strObjectToString16);
            }
            statement.mo47598bindDouble(46, entity.getMWeightOfWater());
            String strObjectToString17 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfWaterRange());
            if (strObjectToString17 == null) {
                statement.mo47600bindNull(47);
            } else {
                statement.mo47601bindText(47, strObjectToString17);
            }
            String strObjectToString18 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightRange());
            if (strObjectToString18 == null) {
                statement.mo47600bindNull(48);
            } else {
                statement.mo47601bindText(48, strObjectToString18);
            }
            statement.mo47598bindDouble(49, entity.getMWeightToControl());
            String strObjectToString19 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightWHORange());
            if (strObjectToString19 == null) {
                statement.mo47600bindNull(50);
            } else {
                statement.mo47601bindText(50, strObjectToString19);
            }
            statement.mo47599bindLong(51, entity.getMIsDelete());
            statement.mo47599bindLong(52, entity.getMRatioOfProteinLevel());
            statement.mo47599bindLong(53, entity.getMRatioOfWaterLevel());
        }
    };
    private final EntityDeleteOrUpdateAdapter<Weight> __updateAdapterOfWeight = new EntityDeleteOrUpdateAdapter<Weight>() { // from class: com.sma.smartv3.db.dao.WeightDao_Impl.2
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        @NonNull
        public String createQuery() {
            return "UPDATE OR ABORT `Weight` SET `mId` = ?,`mTime` = ?,`mLocalTime` = ?,`mWeight` = ?,`mIsSync` = ?,`mIsMeasure` = ?,`mBmi` = ?,`mRatioOfFat` = ?,`mWeightOfMuscle` = ?,`mWeightOfFat` = ?,`mRatioOfProtein` = ?,`mRatioOfWater` = ?,`mStateOfNutrition` = ?,`mIdealWeight` = ?,`mAgeOfBody` = ?,`mAgeOfBodyRange` = ?,`mBmiRange` = ?,`mBmiWHORange` = ?,`mBmr` = ?,`mBmrRange` = ?,`mBodyShape` = ?,`mDesirableWeight` = ?,`mFatFreeBodyWeight` = ?,`mFatToControl` = ?,`mLevelOfVisceralFat` = ?,`mLevelOfVisceralFatRange` = ?,`mMuscleToControl` = ?,`mRatioOfFatRange` = ?,`mRatioOfMuscle` = ?,`mRatioOfMuscleRange` = ?,`mRatioOfProteinRange` = ?,`mRatioOfSkeletalMuscle` = ?,`mRatioOfSkeletalMuscleRange` = ?,`mRatioOfSubcutaneousFat` = ?,`mRatioOfSubcutaneousFatRange` = ?,`mRatioOfWaterRange` = ?,`mScore` = ?,`mWeightOfBone` = ?,`mWeightOfBoneRange` = ?,`mWeightOfFatRange` = ?,`mWeightOfMuscleRange` = ?,`mWeightOfProtein` = ?,`mWeightOfProteinRange` = ?,`mWeightOfSkeletalMuscle` = ?,`mWeightOfSkeletalMuscleRange` = ?,`mWeightOfWater` = ?,`mWeightOfWaterRange` = ?,`mWeightRange` = ?,`mWeightToControl` = ?,`mWeightWHORange` = ?,`mIsDelete` = ?,`mRatioOfProteinLevel` = ?,`mRatioOfWaterLevel` = ? WHERE `mId` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public void bind(@NonNull final SQLiteStatement statement, @NonNull final Weight entity) {
            statement.mo47599bindLong(1, entity.getMId());
            statement.mo47599bindLong(2, entity.getMTime());
            if (entity.getMLocalTime() == null) {
                statement.mo47600bindNull(3);
            } else {
                statement.mo47601bindText(3, entity.getMLocalTime());
            }
            statement.mo47598bindDouble(4, entity.getMWeight());
            statement.mo47599bindLong(5, entity.getMIsSync());
            statement.mo47599bindLong(6, entity.getMIsMeasure());
            statement.mo47598bindDouble(7, entity.getMBmi());
            statement.mo47598bindDouble(8, entity.getMRatioOfFat());
            statement.mo47598bindDouble(9, entity.getMWeightOfMuscle());
            statement.mo47598bindDouble(10, entity.getMWeightOfFat());
            statement.mo47598bindDouble(11, entity.getMRatioOfProtein());
            statement.mo47598bindDouble(12, entity.getMRatioOfWater());
            statement.mo47598bindDouble(13, entity.getMStateOfNutrition());
            statement.mo47598bindDouble(14, entity.getMIdealWeight());
            statement.mo47598bindDouble(15, entity.getMAgeOfBody());
            String strObjectToString = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMAgeOfBodyRange());
            if (strObjectToString == null) {
                statement.mo47600bindNull(16);
            } else {
                statement.mo47601bindText(16, strObjectToString);
            }
            String strObjectToString2 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMBmiRange());
            if (strObjectToString2 == null) {
                statement.mo47600bindNull(17);
            } else {
                statement.mo47601bindText(17, strObjectToString2);
            }
            String strObjectToString3 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMBmiWHORange());
            if (strObjectToString3 == null) {
                statement.mo47600bindNull(18);
            } else {
                statement.mo47601bindText(18, strObjectToString3);
            }
            statement.mo47598bindDouble(19, entity.getMBmr());
            String strObjectToString4 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMBmrRange());
            if (strObjectToString4 == null) {
                statement.mo47600bindNull(20);
            } else {
                statement.mo47601bindText(20, strObjectToString4);
            }
            statement.mo47598bindDouble(21, entity.getMBodyShape());
            statement.mo47598bindDouble(22, entity.getMDesirableWeight());
            statement.mo47598bindDouble(23, entity.getMFatFreeBodyWeight());
            statement.mo47598bindDouble(24, entity.getMFatToControl());
            statement.mo47598bindDouble(25, entity.getMLevelOfVisceralFat());
            String strObjectToString5 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMLevelOfVisceralFatRange());
            if (strObjectToString5 == null) {
                statement.mo47600bindNull(26);
            } else {
                statement.mo47601bindText(26, strObjectToString5);
            }
            statement.mo47598bindDouble(27, entity.getMMuscleToControl());
            String strObjectToString6 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfFatRange());
            if (strObjectToString6 == null) {
                statement.mo47600bindNull(28);
            } else {
                statement.mo47601bindText(28, strObjectToString6);
            }
            statement.mo47598bindDouble(29, entity.getMRatioOfMuscle());
            String strObjectToString7 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfMuscleRange());
            if (strObjectToString7 == null) {
                statement.mo47600bindNull(30);
            } else {
                statement.mo47601bindText(30, strObjectToString7);
            }
            String strObjectToString8 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfProteinRange());
            if (strObjectToString8 == null) {
                statement.mo47600bindNull(31);
            } else {
                statement.mo47601bindText(31, strObjectToString8);
            }
            statement.mo47598bindDouble(32, entity.getMRatioOfSkeletalMuscle());
            String strObjectToString9 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfSkeletalMuscleRange());
            if (strObjectToString9 == null) {
                statement.mo47600bindNull(33);
            } else {
                statement.mo47601bindText(33, strObjectToString9);
            }
            statement.mo47598bindDouble(34, entity.getMRatioOfSubcutaneousFat());
            String strObjectToString10 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfSubcutaneousFatRange());
            if (strObjectToString10 == null) {
                statement.mo47600bindNull(35);
            } else {
                statement.mo47601bindText(35, strObjectToString10);
            }
            String strObjectToString11 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMRatioOfWaterRange());
            if (strObjectToString11 == null) {
                statement.mo47600bindNull(36);
            } else {
                statement.mo47601bindText(36, strObjectToString11);
            }
            statement.mo47598bindDouble(37, entity.getMScore());
            statement.mo47598bindDouble(38, entity.getMWeightOfBone());
            String strObjectToString12 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfBoneRange());
            if (strObjectToString12 == null) {
                statement.mo47600bindNull(39);
            } else {
                statement.mo47601bindText(39, strObjectToString12);
            }
            String strObjectToString13 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfFatRange());
            if (strObjectToString13 == null) {
                statement.mo47600bindNull(40);
            } else {
                statement.mo47601bindText(40, strObjectToString13);
            }
            String strObjectToString14 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfMuscleRange());
            if (strObjectToString14 == null) {
                statement.mo47600bindNull(41);
            } else {
                statement.mo47601bindText(41, strObjectToString14);
            }
            statement.mo47598bindDouble(42, entity.getMWeightOfProtein());
            String strObjectToString15 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfProteinRange());
            if (strObjectToString15 == null) {
                statement.mo47600bindNull(43);
            } else {
                statement.mo47601bindText(43, strObjectToString15);
            }
            statement.mo47598bindDouble(44, entity.getMWeightOfSkeletalMuscle());
            String strObjectToString16 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfSkeletalMuscleRange());
            if (strObjectToString16 == null) {
                statement.mo47600bindNull(45);
            } else {
                statement.mo47601bindText(45, strObjectToString16);
            }
            statement.mo47598bindDouble(46, entity.getMWeightOfWater());
            String strObjectToString17 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightOfWaterRange());
            if (strObjectToString17 == null) {
                statement.mo47600bindNull(47);
            } else {
                statement.mo47601bindText(47, strObjectToString17);
            }
            String strObjectToString18 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightRange());
            if (strObjectToString18 == null) {
                statement.mo47600bindNull(48);
            } else {
                statement.mo47601bindText(48, strObjectToString18);
            }
            statement.mo47598bindDouble(49, entity.getMWeightToControl());
            String strObjectToString19 = WeightDao_Impl.this.__listDoubleConverter.objectToString(entity.getMWeightWHORange());
            if (strObjectToString19 == null) {
                statement.mo47600bindNull(50);
            } else {
                statement.mo47601bindText(50, strObjectToString19);
            }
            statement.mo47599bindLong(51, entity.getMIsDelete());
            statement.mo47599bindLong(52, entity.getMRatioOfProteinLevel());
            statement.mo47599bindLong(53, entity.getMRatioOfWaterLevel());
            statement.mo47599bindLong(54, entity.getMId());
        }
    };

    public WeightDao_Impl(@NonNull final RoomDatabase __db) {
        this.__db = __db;
    }

    public static /* synthetic */ List IiI10X(WeightDao_Impl weightDao_Impl, long j, long j2, SQLiteConnection sQLiteConnection) {
        weightDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM Weight WHERE mTime >= ? AND mTime < ? AND mIsDelete != 1 ORDER BY mTime ASC");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.mo47599bindLong(2, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsMeasure");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmi");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFat");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscle");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFat");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProtein");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWater");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStateOfNutrition");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIdealWeight");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBody");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBodyRange");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiRange");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiWHORange");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmr");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmrRange");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBodyShape");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDesirableWeight");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatFreeBodyWeight");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatToControl");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFat");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFatRange");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMuscleToControl");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFatRange");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscle");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscleRange");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinRange");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscle");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscleRange");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFat");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFatRange");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterRange");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScore");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBone");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBoneRange");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFatRange");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscleRange");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProtein");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProteinRange");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscle");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscleRange");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWater");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWaterRange");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightRange");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightToControl");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightWHORange");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinLevel");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterLevel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4);
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d3 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                double d4 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow10);
                double d5 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow11);
                double d6 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow12);
                double d7 = sQLiteStatementPrepare.getDouble(i);
                double d8 = sQLiteStatementPrepare.getDouble(i2);
                int i6 = columnIndexOrThrow15;
                double d9 = sQLiteStatementPrepare.getDouble(i6);
                columnIndexOrThrow15 = i6;
                columnIndexOrThrow16 = columnIndexOrThrow16;
                List<Double> listStringToObject = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                int i7 = columnIndexOrThrow17;
                columnIndexOrThrow17 = i7;
                List<Double> listStringToObject2 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i7) ? null : sQLiteStatementPrepare.getText(i7));
                int i8 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i8;
                List<Double> listStringToObject3 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i8) ? null : sQLiteStatementPrepare.getText(i8));
                columnIndexOrThrow19 = columnIndexOrThrow19;
                double d10 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow19);
                int i9 = columnIndexOrThrow20;
                columnIndexOrThrow20 = i9;
                List<Double> listStringToObject4 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i9) ? null : sQLiteStatementPrepare.getText(i9));
                int i10 = columnIndexOrThrow21;
                double d11 = sQLiteStatementPrepare.getDouble(i10);
                int i11 = columnIndexOrThrow22;
                double d12 = sQLiteStatementPrepare.getDouble(i11);
                columnIndexOrThrow21 = i10;
                int i12 = columnIndexOrThrow23;
                double d13 = sQLiteStatementPrepare.getDouble(i12);
                columnIndexOrThrow23 = i12;
                int i13 = columnIndexOrThrow24;
                double d14 = sQLiteStatementPrepare.getDouble(i13);
                columnIndexOrThrow24 = i13;
                int i14 = columnIndexOrThrow25;
                double d15 = sQLiteStatementPrepare.getDouble(i14);
                columnIndexOrThrow25 = i14;
                columnIndexOrThrow26 = columnIndexOrThrow26;
                columnIndexOrThrow22 = i11;
                List<Double> listStringToObject5 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                int i15 = columnIndexOrThrow27;
                double d16 = sQLiteStatementPrepare.getDouble(i15);
                int i16 = columnIndexOrThrow28;
                List<Double> listStringToObject6 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = columnIndexOrThrow29;
                double d17 = sQLiteStatementPrepare.getDouble(i17);
                int i18 = columnIndexOrThrow30;
                List<Double> listStringToObject7 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18));
                int i19 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i19;
                List<Double> listStringToObject8 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i19) ? null : sQLiteStatementPrepare.getText(i19));
                int i20 = columnIndexOrThrow32;
                double d18 = sQLiteStatementPrepare.getDouble(i20);
                int i21 = columnIndexOrThrow33;
                List<Double> listStringToObject9 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                int i22 = columnIndexOrThrow34;
                double d19 = sQLiteStatementPrepare.getDouble(i22);
                int i23 = columnIndexOrThrow35;
                List<Double> listStringToObject10 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                int i24 = columnIndexOrThrow36;
                columnIndexOrThrow36 = i24;
                List<Double> listStringToObject11 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i24) ? null : sQLiteStatementPrepare.getText(i24));
                int i25 = columnIndexOrThrow37;
                double d20 = sQLiteStatementPrepare.getDouble(i25);
                int i26 = columnIndexOrThrow38;
                double d21 = sQLiteStatementPrepare.getDouble(i26);
                columnIndexOrThrow37 = i25;
                columnIndexOrThrow39 = columnIndexOrThrow39;
                columnIndexOrThrow38 = i26;
                List<Double> listStringToObject12 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                int i27 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i27;
                List<Double> listStringToObject13 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27));
                int i28 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i28;
                List<Double> listStringToObject14 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i28) ? null : sQLiteStatementPrepare.getText(i28));
                int i29 = columnIndexOrThrow42;
                double d22 = sQLiteStatementPrepare.getDouble(i29);
                int i30 = columnIndexOrThrow43;
                List<Double> listStringToObject15 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                int i31 = columnIndexOrThrow44;
                double d23 = sQLiteStatementPrepare.getDouble(i31);
                int i32 = columnIndexOrThrow45;
                List<Double> listStringToObject16 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                int i33 = columnIndexOrThrow46;
                double d24 = sQLiteStatementPrepare.getDouble(i33);
                int i34 = columnIndexOrThrow47;
                List<Double> listStringToObject17 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                int i35 = columnIndexOrThrow48;
                columnIndexOrThrow48 = i35;
                List<Double> listStringToObject18 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                int i36 = columnIndexOrThrow49;
                double d25 = sQLiteStatementPrepare.getDouble(i36);
                int i37 = columnIndexOrThrow50;
                columnIndexOrThrow49 = i36;
                columnIndexOrThrow50 = i37;
                List<Double> listStringToObject19 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                int i38 = columnIndexOrThrow51;
                columnIndexOrThrow51 = i38;
                int i39 = columnIndexOrThrow52;
                int i40 = columnIndexOrThrow4;
                int i41 = columnIndexOrThrow53;
                arrayList.add(new Weight(i3, j3, text, f, i4, i5, d, d2, d3, d4, d5, d6, d7, d8, d9, listStringToObject, listStringToObject2, listStringToObject3, d10, listStringToObject4, d11, d12, d13, d14, d15, listStringToObject5, d16, listStringToObject6, d17, listStringToObject7, listStringToObject8, d18, listStringToObject9, d19, listStringToObject10, listStringToObject11, d20, d21, listStringToObject12, listStringToObject13, listStringToObject14, d22, listStringToObject15, d23, listStringToObject16, d24, listStringToObject17, listStringToObject18, d25, listStringToObject19, (int) sQLiteStatementPrepare.getLong(i38), (int) sQLiteStatementPrepare.getLong(i39), (int) sQLiteStatementPrepare.getLong(i41)));
                columnIndexOrThrow28 = i16;
                columnIndexOrThrow27 = i15;
                columnIndexOrThrow30 = i18;
                columnIndexOrThrow29 = i17;
                columnIndexOrThrow33 = i21;
                columnIndexOrThrow32 = i20;
                columnIndexOrThrow35 = i23;
                columnIndexOrThrow34 = i22;
                columnIndexOrThrow43 = i30;
                columnIndexOrThrow42 = i29;
                columnIndexOrThrow45 = i32;
                columnIndexOrThrow44 = i31;
                columnIndexOrThrow47 = i34;
                columnIndexOrThrow46 = i33;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow4 = i40;
                columnIndexOrThrow52 = i39;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow53 = i41;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List O00(WeightDao_Impl weightDao_Impl, SQLiteConnection sQLiteConnection) {
        weightDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM Weight WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsMeasure");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmi");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFat");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscle");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFat");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProtein");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWater");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStateOfNutrition");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIdealWeight");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBody");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBodyRange");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiRange");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiWHORange");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmr");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmrRange");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBodyShape");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDesirableWeight");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatFreeBodyWeight");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatToControl");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFat");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFatRange");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMuscleToControl");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFatRange");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscle");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscleRange");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinRange");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscle");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscleRange");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFat");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFatRange");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterRange");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScore");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBone");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBoneRange");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFatRange");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscleRange");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProtein");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProteinRange");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscle");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscleRange");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWater");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWaterRange");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightRange");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightToControl");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightWHORange");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinLevel");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterLevel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4);
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d3 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                double d4 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow10);
                double d5 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow11);
                double d6 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow12);
                double d7 = sQLiteStatementPrepare.getDouble(i);
                double d8 = sQLiteStatementPrepare.getDouble(i2);
                int i6 = columnIndexOrThrow15;
                double d9 = sQLiteStatementPrepare.getDouble(i6);
                columnIndexOrThrow15 = i6;
                int i7 = columnIndexOrThrow16;
                List<Double> listStringToObject = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i7) ? null : sQLiteStatementPrepare.getText(i7));
                int i8 = columnIndexOrThrow17;
                columnIndexOrThrow17 = i8;
                List<Double> listStringToObject2 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i8) ? null : sQLiteStatementPrepare.getText(i8));
                int i9 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i9;
                List<Double> listStringToObject3 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i9) ? null : sQLiteStatementPrepare.getText(i9));
                int i10 = columnIndexOrThrow19;
                double d10 = sQLiteStatementPrepare.getDouble(i10);
                int i11 = columnIndexOrThrow20;
                List<Double> listStringToObject4 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11));
                int i12 = columnIndexOrThrow21;
                double d11 = sQLiteStatementPrepare.getDouble(i12);
                int i13 = columnIndexOrThrow22;
                double d12 = sQLiteStatementPrepare.getDouble(i13);
                columnIndexOrThrow21 = i12;
                int i14 = columnIndexOrThrow23;
                double d13 = sQLiteStatementPrepare.getDouble(i14);
                columnIndexOrThrow23 = i14;
                int i15 = columnIndexOrThrow24;
                double d14 = sQLiteStatementPrepare.getDouble(i15);
                columnIndexOrThrow24 = i15;
                int i16 = columnIndexOrThrow25;
                double d15 = sQLiteStatementPrepare.getDouble(i16);
                columnIndexOrThrow25 = i16;
                columnIndexOrThrow26 = columnIndexOrThrow26;
                columnIndexOrThrow22 = i13;
                List<Double> listStringToObject5 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                int i17 = columnIndexOrThrow27;
                double d16 = sQLiteStatementPrepare.getDouble(i17);
                int i18 = columnIndexOrThrow28;
                List<Double> listStringToObject6 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18));
                int i19 = columnIndexOrThrow29;
                double d17 = sQLiteStatementPrepare.getDouble(i19);
                int i20 = columnIndexOrThrow30;
                List<Double> listStringToObject7 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i20) ? null : sQLiteStatementPrepare.getText(i20));
                int i21 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i21;
                List<Double> listStringToObject8 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                int i22 = columnIndexOrThrow32;
                double d18 = sQLiteStatementPrepare.getDouble(i22);
                int i23 = columnIndexOrThrow33;
                List<Double> listStringToObject9 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                int i24 = columnIndexOrThrow34;
                double d19 = sQLiteStatementPrepare.getDouble(i24);
                int i25 = columnIndexOrThrow35;
                List<Double> listStringToObject10 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i25) ? null : sQLiteStatementPrepare.getText(i25));
                int i26 = columnIndexOrThrow36;
                columnIndexOrThrow36 = i26;
                List<Double> listStringToObject11 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                int i27 = columnIndexOrThrow37;
                double d20 = sQLiteStatementPrepare.getDouble(i27);
                int i28 = columnIndexOrThrow38;
                double d21 = sQLiteStatementPrepare.getDouble(i28);
                columnIndexOrThrow37 = i27;
                columnIndexOrThrow39 = columnIndexOrThrow39;
                columnIndexOrThrow38 = i28;
                List<Double> listStringToObject12 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                int i29 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i29;
                List<Double> listStringToObject13 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29));
                int i30 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i30;
                List<Double> listStringToObject14 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                int i31 = columnIndexOrThrow42;
                double d22 = sQLiteStatementPrepare.getDouble(i31);
                int i32 = columnIndexOrThrow43;
                List<Double> listStringToObject15 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                int i33 = columnIndexOrThrow44;
                double d23 = sQLiteStatementPrepare.getDouble(i33);
                int i34 = columnIndexOrThrow45;
                List<Double> listStringToObject16 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                int i35 = columnIndexOrThrow46;
                double d24 = sQLiteStatementPrepare.getDouble(i35);
                int i36 = columnIndexOrThrow47;
                List<Double> listStringToObject17 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                int i37 = columnIndexOrThrow48;
                columnIndexOrThrow48 = i37;
                List<Double> listStringToObject18 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                int i38 = columnIndexOrThrow49;
                double d25 = sQLiteStatementPrepare.getDouble(i38);
                int i39 = columnIndexOrThrow50;
                columnIndexOrThrow49 = i38;
                columnIndexOrThrow50 = i39;
                List<Double> listStringToObject19 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                int i40 = columnIndexOrThrow51;
                columnIndexOrThrow51 = i40;
                int i41 = columnIndexOrThrow52;
                int i42 = columnIndexOrThrow4;
                int i43 = columnIndexOrThrow53;
                arrayList.add(new Weight(i3, j, text, f, i4, i5, d, d2, d3, d4, d5, d6, d7, d8, d9, listStringToObject, listStringToObject2, listStringToObject3, d10, listStringToObject4, d11, d12, d13, d14, d15, listStringToObject5, d16, listStringToObject6, d17, listStringToObject7, listStringToObject8, d18, listStringToObject9, d19, listStringToObject10, listStringToObject11, d20, d21, listStringToObject12, listStringToObject13, listStringToObject14, d22, listStringToObject15, d23, listStringToObject16, d24, listStringToObject17, listStringToObject18, d25, listStringToObject19, (int) sQLiteStatementPrepare.getLong(i40), (int) sQLiteStatementPrepare.getLong(i41), (int) sQLiteStatementPrepare.getLong(i43)));
                columnIndexOrThrow20 = i11;
                columnIndexOrThrow19 = i10;
                columnIndexOrThrow28 = i18;
                columnIndexOrThrow27 = i17;
                columnIndexOrThrow30 = i20;
                columnIndexOrThrow29 = i19;
                columnIndexOrThrow33 = i23;
                columnIndexOrThrow32 = i22;
                columnIndexOrThrow35 = i25;
                columnIndexOrThrow34 = i24;
                columnIndexOrThrow43 = i32;
                columnIndexOrThrow42 = i31;
                columnIndexOrThrow45 = i34;
                columnIndexOrThrow44 = i33;
                columnIndexOrThrow47 = i36;
                columnIndexOrThrow46 = i35;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow4 = i42;
                columnIndexOrThrow52 = i41;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow53 = i43;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ Object OXO1(long j, SQLiteConnection sQLiteConnection) {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM Weight WHERE mTime = ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, j);
            sQLiteStatementPrepare.step();
            return null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static /* synthetic */ List XOO0ii0(WeightDao_Impl weightDao_Impl, SQLiteConnection sQLiteConnection) {
        weightDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM Weight WHERE mIsDelete != 1 ORDER BY mTime ASC");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsMeasure");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmi");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFat");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscle");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFat");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProtein");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWater");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStateOfNutrition");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIdealWeight");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBody");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBodyRange");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiRange");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiWHORange");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmr");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmrRange");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBodyShape");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDesirableWeight");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatFreeBodyWeight");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatToControl");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFat");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFatRange");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMuscleToControl");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFatRange");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscle");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscleRange");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinRange");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscle");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscleRange");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFat");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFatRange");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterRange");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScore");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBone");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBoneRange");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFatRange");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscleRange");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProtein");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProteinRange");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscle");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscleRange");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWater");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWaterRange");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightRange");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightToControl");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightWHORange");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinLevel");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterLevel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i = columnIndexOrThrow13;
                int i2 = columnIndexOrThrow14;
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4);
                int i4 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d3 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                double d4 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow10);
                double d5 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow11);
                double d6 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow12);
                double d7 = sQLiteStatementPrepare.getDouble(i);
                double d8 = sQLiteStatementPrepare.getDouble(i2);
                int i6 = columnIndexOrThrow15;
                double d9 = sQLiteStatementPrepare.getDouble(i6);
                columnIndexOrThrow15 = i6;
                int i7 = columnIndexOrThrow16;
                List<Double> listStringToObject = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i7) ? null : sQLiteStatementPrepare.getText(i7));
                int i8 = columnIndexOrThrow17;
                columnIndexOrThrow17 = i8;
                List<Double> listStringToObject2 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i8) ? null : sQLiteStatementPrepare.getText(i8));
                int i9 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i9;
                List<Double> listStringToObject3 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i9) ? null : sQLiteStatementPrepare.getText(i9));
                int i10 = columnIndexOrThrow19;
                double d10 = sQLiteStatementPrepare.getDouble(i10);
                int i11 = columnIndexOrThrow20;
                List<Double> listStringToObject4 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11));
                int i12 = columnIndexOrThrow21;
                double d11 = sQLiteStatementPrepare.getDouble(i12);
                int i13 = columnIndexOrThrow22;
                double d12 = sQLiteStatementPrepare.getDouble(i13);
                columnIndexOrThrow21 = i12;
                int i14 = columnIndexOrThrow23;
                double d13 = sQLiteStatementPrepare.getDouble(i14);
                columnIndexOrThrow23 = i14;
                int i15 = columnIndexOrThrow24;
                double d14 = sQLiteStatementPrepare.getDouble(i15);
                columnIndexOrThrow24 = i15;
                int i16 = columnIndexOrThrow25;
                double d15 = sQLiteStatementPrepare.getDouble(i16);
                columnIndexOrThrow25 = i16;
                columnIndexOrThrow26 = columnIndexOrThrow26;
                columnIndexOrThrow22 = i13;
                List<Double> listStringToObject5 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                int i17 = columnIndexOrThrow27;
                double d16 = sQLiteStatementPrepare.getDouble(i17);
                int i18 = columnIndexOrThrow28;
                List<Double> listStringToObject6 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18));
                int i19 = columnIndexOrThrow29;
                double d17 = sQLiteStatementPrepare.getDouble(i19);
                int i20 = columnIndexOrThrow30;
                List<Double> listStringToObject7 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i20) ? null : sQLiteStatementPrepare.getText(i20));
                int i21 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i21;
                List<Double> listStringToObject8 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                int i22 = columnIndexOrThrow32;
                double d18 = sQLiteStatementPrepare.getDouble(i22);
                int i23 = columnIndexOrThrow33;
                List<Double> listStringToObject9 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23));
                int i24 = columnIndexOrThrow34;
                double d19 = sQLiteStatementPrepare.getDouble(i24);
                int i25 = columnIndexOrThrow35;
                List<Double> listStringToObject10 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i25) ? null : sQLiteStatementPrepare.getText(i25));
                int i26 = columnIndexOrThrow36;
                columnIndexOrThrow36 = i26;
                List<Double> listStringToObject11 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                int i27 = columnIndexOrThrow37;
                double d20 = sQLiteStatementPrepare.getDouble(i27);
                int i28 = columnIndexOrThrow38;
                double d21 = sQLiteStatementPrepare.getDouble(i28);
                columnIndexOrThrow37 = i27;
                columnIndexOrThrow39 = columnIndexOrThrow39;
                columnIndexOrThrow38 = i28;
                List<Double> listStringToObject12 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                int i29 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i29;
                List<Double> listStringToObject13 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29));
                int i30 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i30;
                List<Double> listStringToObject14 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                int i31 = columnIndexOrThrow42;
                double d22 = sQLiteStatementPrepare.getDouble(i31);
                int i32 = columnIndexOrThrow43;
                List<Double> listStringToObject15 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32));
                int i33 = columnIndexOrThrow44;
                double d23 = sQLiteStatementPrepare.getDouble(i33);
                int i34 = columnIndexOrThrow45;
                List<Double> listStringToObject16 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i34) ? null : sQLiteStatementPrepare.getText(i34));
                int i35 = columnIndexOrThrow46;
                double d24 = sQLiteStatementPrepare.getDouble(i35);
                int i36 = columnIndexOrThrow47;
                List<Double> listStringToObject17 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i36) ? null : sQLiteStatementPrepare.getText(i36));
                int i37 = columnIndexOrThrow48;
                columnIndexOrThrow48 = i37;
                List<Double> listStringToObject18 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                int i38 = columnIndexOrThrow49;
                double d25 = sQLiteStatementPrepare.getDouble(i38);
                int i39 = columnIndexOrThrow50;
                columnIndexOrThrow49 = i38;
                columnIndexOrThrow50 = i39;
                List<Double> listStringToObject19 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i39) ? null : sQLiteStatementPrepare.getText(i39));
                int i40 = columnIndexOrThrow51;
                columnIndexOrThrow51 = i40;
                int i41 = columnIndexOrThrow52;
                int i42 = columnIndexOrThrow4;
                int i43 = columnIndexOrThrow53;
                arrayList.add(new Weight(i3, j, text, f, i4, i5, d, d2, d3, d4, d5, d6, d7, d8, d9, listStringToObject, listStringToObject2, listStringToObject3, d10, listStringToObject4, d11, d12, d13, d14, d15, listStringToObject5, d16, listStringToObject6, d17, listStringToObject7, listStringToObject8, d18, listStringToObject9, d19, listStringToObject10, listStringToObject11, d20, d21, listStringToObject12, listStringToObject13, listStringToObject14, d22, listStringToObject15, d23, listStringToObject16, d24, listStringToObject17, listStringToObject18, d25, listStringToObject19, (int) sQLiteStatementPrepare.getLong(i40), (int) sQLiteStatementPrepare.getLong(i41), (int) sQLiteStatementPrepare.getLong(i43)));
                columnIndexOrThrow20 = i11;
                columnIndexOrThrow19 = i10;
                columnIndexOrThrow28 = i18;
                columnIndexOrThrow27 = i17;
                columnIndexOrThrow30 = i20;
                columnIndexOrThrow29 = i19;
                columnIndexOrThrow33 = i23;
                columnIndexOrThrow32 = i22;
                columnIndexOrThrow35 = i25;
                columnIndexOrThrow34 = i24;
                columnIndexOrThrow43 = i32;
                columnIndexOrThrow42 = i31;
                columnIndexOrThrow45 = i34;
                columnIndexOrThrow44 = i33;
                columnIndexOrThrow47 = i36;
                columnIndexOrThrow46 = i35;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow13 = i;
                columnIndexOrThrow4 = i42;
                columnIndexOrThrow52 = i41;
                columnIndexOrThrow16 = i7;
                columnIndexOrThrow14 = i2;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow53 = i43;
                columnIndexOrThrow2 = columnIndexOrThrow2;
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
    public static /* synthetic */ List m38195iO(WeightDao_Impl weightDao_Impl, int i, int i2, SQLiteConnection sQLiteConnection) {
        weightDao_Impl.getClass();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM Weight WHERE  mIsDelete != 1 ORDER BY mTime DESC LIMIT ?, ?");
        try {
            sQLiteStatementPrepare.mo47599bindLong(1, i);
            sQLiteStatementPrepare.mo47599bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLocalTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeight");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsSync");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsMeasure");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmi");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFat");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscle");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFat");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProtein");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWater");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mStateOfNutrition");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIdealWeight");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBody");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mAgeOfBodyRange");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiRange");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmiWHORange");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmr");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBmrRange");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mBodyShape");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mDesirableWeight");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatFreeBodyWeight");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mFatToControl");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFat");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mLevelOfVisceralFatRange");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mMuscleToControl");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfFatRange");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscle");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfMuscleRange");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinRange");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscle");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSkeletalMuscleRange");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFat");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfSubcutaneousFatRange");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterRange");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mScore");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBone");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfBoneRange");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfFatRange");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfMuscleRange");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProtein");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfProteinRange");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscle");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfSkeletalMuscleRange");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWater");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightOfWaterRange");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightRange");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightToControl");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mWeightWHORange");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mIsDelete");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfProteinLevel");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mRatioOfWaterLevel");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                int i3 = columnIndexOrThrow13;
                int i4 = columnIndexOrThrow14;
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                float f = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow4);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow7);
                double d2 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                double d3 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow9);
                double d4 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow10);
                double d5 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow11);
                double d6 = sQLiteStatementPrepare.getDouble(columnIndexOrThrow12);
                double d7 = sQLiteStatementPrepare.getDouble(i3);
                double d8 = sQLiteStatementPrepare.getDouble(i4);
                int i8 = columnIndexOrThrow15;
                double d9 = sQLiteStatementPrepare.getDouble(i8);
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = columnIndexOrThrow16;
                List<Double> listStringToObject = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16));
                int i9 = columnIndexOrThrow17;
                columnIndexOrThrow17 = i9;
                List<Double> listStringToObject2 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i9) ? null : sQLiteStatementPrepare.getText(i9));
                int i10 = columnIndexOrThrow18;
                columnIndexOrThrow18 = i10;
                List<Double> listStringToObject3 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10));
                int i11 = columnIndexOrThrow19;
                double d10 = sQLiteStatementPrepare.getDouble(i11);
                int i12 = columnIndexOrThrow20;
                List<Double> listStringToObject4 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i12) ? null : sQLiteStatementPrepare.getText(i12));
                int i13 = columnIndexOrThrow21;
                double d11 = sQLiteStatementPrepare.getDouble(i13);
                int i14 = columnIndexOrThrow22;
                double d12 = sQLiteStatementPrepare.getDouble(i14);
                columnIndexOrThrow21 = i13;
                int i15 = columnIndexOrThrow23;
                double d13 = sQLiteStatementPrepare.getDouble(i15);
                columnIndexOrThrow23 = i15;
                int i16 = columnIndexOrThrow24;
                double d14 = sQLiteStatementPrepare.getDouble(i16);
                columnIndexOrThrow24 = i16;
                int i17 = columnIndexOrThrow25;
                double d15 = sQLiteStatementPrepare.getDouble(i17);
                columnIndexOrThrow25 = i17;
                columnIndexOrThrow26 = columnIndexOrThrow26;
                columnIndexOrThrow22 = i14;
                List<Double> listStringToObject5 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26));
                int i18 = columnIndexOrThrow27;
                double d16 = sQLiteStatementPrepare.getDouble(i18);
                int i19 = columnIndexOrThrow28;
                List<Double> listStringToObject6 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i19) ? null : sQLiteStatementPrepare.getText(i19));
                int i20 = columnIndexOrThrow29;
                double d17 = sQLiteStatementPrepare.getDouble(i20);
                int i21 = columnIndexOrThrow30;
                List<Double> listStringToObject7 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                int i22 = columnIndexOrThrow31;
                columnIndexOrThrow31 = i22;
                List<Double> listStringToObject8 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                int i23 = columnIndexOrThrow32;
                double d18 = sQLiteStatementPrepare.getDouble(i23);
                int i24 = columnIndexOrThrow33;
                List<Double> listStringToObject9 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i24) ? null : sQLiteStatementPrepare.getText(i24));
                int i25 = columnIndexOrThrow34;
                double d19 = sQLiteStatementPrepare.getDouble(i25);
                int i26 = columnIndexOrThrow35;
                List<Double> listStringToObject10 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i26) ? null : sQLiteStatementPrepare.getText(i26));
                int i27 = columnIndexOrThrow36;
                columnIndexOrThrow36 = i27;
                List<Double> listStringToObject11 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i27) ? null : sQLiteStatementPrepare.getText(i27));
                int i28 = columnIndexOrThrow37;
                double d20 = sQLiteStatementPrepare.getDouble(i28);
                int i29 = columnIndexOrThrow38;
                double d21 = sQLiteStatementPrepare.getDouble(i29);
                columnIndexOrThrow37 = i28;
                columnIndexOrThrow39 = columnIndexOrThrow39;
                columnIndexOrThrow38 = i29;
                List<Double> listStringToObject12 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39));
                int i30 = columnIndexOrThrow40;
                columnIndexOrThrow40 = i30;
                List<Double> listStringToObject13 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30));
                int i31 = columnIndexOrThrow41;
                columnIndexOrThrow41 = i31;
                List<Double> listStringToObject14 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i31) ? null : sQLiteStatementPrepare.getText(i31));
                int i32 = columnIndexOrThrow42;
                double d22 = sQLiteStatementPrepare.getDouble(i32);
                int i33 = columnIndexOrThrow43;
                List<Double> listStringToObject15 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                int i34 = columnIndexOrThrow44;
                double d23 = sQLiteStatementPrepare.getDouble(i34);
                int i35 = columnIndexOrThrow45;
                List<Double> listStringToObject16 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i35) ? null : sQLiteStatementPrepare.getText(i35));
                int i36 = columnIndexOrThrow46;
                double d24 = sQLiteStatementPrepare.getDouble(i36);
                int i37 = columnIndexOrThrow47;
                List<Double> listStringToObject17 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i37) ? null : sQLiteStatementPrepare.getText(i37));
                int i38 = columnIndexOrThrow48;
                columnIndexOrThrow48 = i38;
                List<Double> listStringToObject18 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i38) ? null : sQLiteStatementPrepare.getText(i38));
                int i39 = columnIndexOrThrow49;
                double d25 = sQLiteStatementPrepare.getDouble(i39);
                int i40 = columnIndexOrThrow50;
                columnIndexOrThrow49 = i39;
                columnIndexOrThrow50 = i40;
                List<Double> listStringToObject19 = weightDao_Impl.__listDoubleConverter.stringToObject(sQLiteStatementPrepare.isNull(i40) ? null : sQLiteStatementPrepare.getText(i40));
                int i41 = columnIndexOrThrow51;
                columnIndexOrThrow51 = i41;
                int i42 = columnIndexOrThrow52;
                int i43 = columnIndexOrThrow4;
                int i44 = columnIndexOrThrow53;
                arrayList.add(new Weight(i5, j, text, f, i6, i7, d, d2, d3, d4, d5, d6, d7, d8, d9, listStringToObject, listStringToObject2, listStringToObject3, d10, listStringToObject4, d11, d12, d13, d14, d15, listStringToObject5, d16, listStringToObject6, d17, listStringToObject7, listStringToObject8, d18, listStringToObject9, d19, listStringToObject10, listStringToObject11, d20, d21, listStringToObject12, listStringToObject13, listStringToObject14, d22, listStringToObject15, d23, listStringToObject16, d24, listStringToObject17, listStringToObject18, d25, listStringToObject19, (int) sQLiteStatementPrepare.getLong(i41), (int) sQLiteStatementPrepare.getLong(i42), (int) sQLiteStatementPrepare.getLong(i44)));
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow19 = i11;
                columnIndexOrThrow28 = i19;
                columnIndexOrThrow27 = i18;
                columnIndexOrThrow30 = i21;
                columnIndexOrThrow29 = i20;
                columnIndexOrThrow33 = i24;
                columnIndexOrThrow32 = i23;
                columnIndexOrThrow35 = i26;
                columnIndexOrThrow34 = i25;
                columnIndexOrThrow43 = i33;
                columnIndexOrThrow42 = i32;
                columnIndexOrThrow45 = i35;
                columnIndexOrThrow44 = i34;
                columnIndexOrThrow47 = i37;
                columnIndexOrThrow46 = i36;
                columnIndexOrThrow = columnIndexOrThrow;
                columnIndexOrThrow4 = i43;
                columnIndexOrThrow52 = i42;
                columnIndexOrThrow13 = i3;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow3 = columnIndexOrThrow3;
                columnIndexOrThrow53 = i44;
                columnIndexOrThrow2 = columnIndexOrThrow2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public void delete(final long mTime) {
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.my6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightDao_Impl.OXO1(mTime, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public List<Weight> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ny6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightDao_Impl.O00(this.f10041IO, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public List<Weight> getTestWeights(final long start, final long end) {
        return WeightDao.DefaultImpls.getTestWeights(this, start, end);
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public List<Weight> getWeights() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ky6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightDao_Impl.XOO0ii0(this.f9309IO, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public List<Weight> getWeightsASC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.oy6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightDao_Impl.IiI10X(this.f10252IO, start, end, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public List<Weight> getWeightsDESC(final int startIndex, final int endIndex) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.py6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeightDao_Impl.m38195iO(this.f10465IO, startIndex, endIndex, (SQLiteConnection) obj);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public long[] insert(final List<Weight> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.ly6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return this.f9569IO.__insertAdapterOfWeight.insertAndReturnIdsArray((SQLiteConnection) obj, list);
            }
        });
    }

    @Override // com.sma.smartv3.p608db.dao.WeightDao
    public int update(final List<Weight> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: com.android.mltcode.paycertificationapi.jy6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Integer.valueOf(this.f9073IO.__updateAdapterOfWeight.handleMultiple((SQLiteConnection) obj, lists));
            }
        })).intValue();
    }
}
