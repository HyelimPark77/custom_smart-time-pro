package com.sma.smartv3.db.dao;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.android.mltcode.paycertificationapi.jy6;
import com.android.mltcode.paycertificationapi.ky6;
import com.android.mltcode.paycertificationapi.ly6;
import com.android.mltcode.paycertificationapi.my6;
import com.android.mltcode.paycertificationapi.ny6;
import com.android.mltcode.paycertificationapi.oy6;
import com.android.mltcode.paycertificationapi.py6;
import com.sma.smartv3.db.entity.ListDoubleConverter;
import com.sma.smartv3.db.entity.Weight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightDao_Impl implements WeightDao {
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Weight> __insertAdapterOfWeight;
    private final ListDoubleConverter __listDoubleConverter;
    private final EntityDeleteOrUpdateAdapter<Weight> __updateAdapterOfWeight;

    public WeightDao_Impl(@NonNull final RoomDatabase __db) {
        this.__listDoubleConverter = new ListDoubleConverter();
        this.__db = __db;
        this.__insertAdapterOfWeight = new AnonymousClass1(this);
        this.__updateAdapterOfWeight = new AnonymousClass2(this);
    }

    public static /* bridge */ /* synthetic */ ListDoubleConverter I0IIOi(WeightDao_Impl r0) {
        return r0.__listDoubleConverter;
    }

    public static /* synthetic */ List IiI10X(WeightDao_Impl r134, long r135, long r137, SQLiteConnection r139) {
        r134.getClass();
        SQLiteStatement r1 = r139.prepare("SELECT * FROM Weight WHERE mTime >= ? AND mTime < ? AND mIsDelete != 1 ORDER BY mTime ASC");
        r1.mo3338bindLong(1, r135);     // Catch: Throwable -> L106
        r1.mo3338bindLong(2, r137);     // Catch: Throwable -> L106
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L106
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L106
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L106
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeight");     // Catch: Throwable -> L106
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L106
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsMeasure");     // Catch: Throwable -> L106
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmi");     // Catch: Throwable -> L106
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFat");     // Catch: Throwable -> L106
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscle");     // Catch: Throwable -> L106
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFat");     // Catch: Throwable -> L106
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProtein");     // Catch: Throwable -> L106
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWater");     // Catch: Throwable -> L106
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStateOfNutrition");     // Catch: Throwable -> L106
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIdealWeight");     // Catch: Throwable -> L106
        int r136 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBody");     // Catch: Throwable -> L106
        int r138 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBodyRange");     // Catch: Throwable -> L106
        int r1310 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiRange");     // Catch: Throwable -> L106
        int r1311 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiWHORange");     // Catch: Throwable -> L106
        int r1312 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmr");     // Catch: Throwable -> L106
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmrRange");     // Catch: Throwable -> L106
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBodyShape");     // Catch: Throwable -> L106
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDesirableWeight");     // Catch: Throwable -> L106
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatFreeBodyWeight");     // Catch: Throwable -> L106
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatToControl");     // Catch: Throwable -> L106
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFat");     // Catch: Throwable -> L106
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFatRange");     // Catch: Throwable -> L106
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMuscleToControl");     // Catch: Throwable -> L106
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFatRange");     // Catch: Throwable -> L106
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscle");     // Catch: Throwable -> L106
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscleRange");     // Catch: Throwable -> L106
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinRange");     // Catch: Throwable -> L106
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFat");     // Catch: Throwable -> L106
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFatRange");     // Catch: Throwable -> L106
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterRange");     // Catch: Throwable -> L106
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScore");     // Catch: Throwable -> L106
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBone");     // Catch: Throwable -> L106
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBoneRange");     // Catch: Throwable -> L106
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFatRange");     // Catch: Throwable -> L106
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscleRange");     // Catch: Throwable -> L106
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProtein");     // Catch: Throwable -> L106
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProteinRange");     // Catch: Throwable -> L106
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWater");     // Catch: Throwable -> L106
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWaterRange");     // Catch: Throwable -> L106
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightRange");     // Catch: Throwable -> L106
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightToControl");     // Catch: Throwable -> L106
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightWHORange");     // Catch: Throwable -> L106
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L106
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinLevel");     // Catch: Throwable -> L106
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterLevel");     // Catch: Throwable -> L106
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L106
    L4:
        if (r1.step() == false) goto L108;
        int r50 = r14;
        int r51 = r15;
        int r110 = (int) r1.getLong(r2);     // Catch: Throwable -> L106
        long r54 = r1.getLong(r3);     // Catch: Throwable -> L106
        String r52 = null;
        if (r1.isNull(r4) == false) goto L9;
        String r56 = null;
    L10:
        float r53 = (float) r1.getDouble(r5);     // Catch: Throwable -> L106
        int r55 = (int) r1.getLong(r6);     // Catch: Throwable -> L106
        int r57 = (int) r1.getLong(r7);     // Catch: Throwable -> L106
        double r60 = r1.getDouble(r8);     // Catch: Throwable -> L106
        double r62 = r1.getDouble(r9);     // Catch: Throwable -> L106
        double r64 = r1.getDouble(r10);     // Catch: Throwable -> L106
        double r66 = r1.getDouble(r11);     // Catch: Throwable -> L106
        double r68 = r1.getDouble(r12);     // Catch: Throwable -> L106
        double r70 = r1.getDouble(r13);     // Catch: Throwable -> L106
        double r72 = r1.getDouble(r50);     // Catch: Throwable -> L106
        double r74 = r1.getDouble(r51);     // Catch: Throwable -> L106
        int r58 = r136;
        double r76 = r1.getDouble(r58);     // Catch: Throwable -> L106
        r136 = r58;
        r138 = r138;
        if (r1.isNull(r138) == false) goto L14;
        String r59 = null;
    L15:
        List<Double> r78 = r134.__listDoubleConverter.stringToObject(r59);     // Catch: Throwable -> L106
        int r61 = r1310;
        if (r1.isNull(r61) == false) goto L19;
        String r63 = null;
    L18:
        r1310 = r61;
        List<Double> r79 = r134.__listDoubleConverter.stringToObject(r63);     // Catch: Throwable -> L106
        int r65 = r1311;
        if (r1.isNull(r65) == false) goto L24;
        String r67 = null;
    L23:
        r1311 = r65;
        List<Double> r80 = r134.__listDoubleConverter.stringToObject(r67);     // Catch: Throwable -> L106
        r1312 = r1312;
        double r81 = r1.getDouble(r1312);     // Catch: Throwable -> L106
        int r69 = r16;
        if (r1.isNull(r69) == false) goto L29;
        String r71 = null;
    L28:
        r16 = r69;
        List<Double> r83 = r134.__listDoubleConverter.stringToObject(r71);     // Catch: Throwable -> L106
        int r73 = r17;
        double r84 = r1.getDouble(r73);     // Catch: Throwable -> L106
        int r75 = r18;
        double r86 = r1.getDouble(r75);     // Catch: Throwable -> L106
        r17 = r73;
        int r77 = r19;
        double r88 = r1.getDouble(r77);     // Catch: Throwable -> L106
        r19 = r77;
        int r82 = r20;
        double r90 = r1.getDouble(r82);     // Catch: Throwable -> L106
        r20 = r82;
        int r85 = r21;
        double r92 = r1.getDouble(r85);     // Catch: Throwable -> L106
        r21 = r85;
        r22 = r22;
        if (r1.isNull(r22) == false) goto L34;
        String r87 = null;
    L33:
        r18 = r75;
        List<Double> r94 = r134.__listDoubleConverter.stringToObject(r87);     // Catch: Throwable -> L106
        int r89 = r23;
        double r95 = r1.getDouble(r89);     // Catch: Throwable -> L106
        int r91 = r24;
        if (r1.isNull(r91) == false) goto L39;
        String r93 = null;
    L40:
        List<Double> r97 = r134.__listDoubleConverter.stringToObject(r93);     // Catch: Throwable -> L106
        int r96 = r25;
        double r98 = r1.getDouble(r96);     // Catch: Throwable -> L106
        int r99 = r26;
        if (r1.isNull(r99) == false) goto L44;
        String r100 = null;
    L45:
        List<Double> r101 = r134.__listDoubleConverter.stringToObject(r100);     // Catch: Throwable -> L106
        int r102 = r27;
        if (r1.isNull(r102) == false) goto L49;
        String r103 = null;
    L48:
        r27 = r102;
        List<Double> r104 = r134.__listDoubleConverter.stringToObject(r103);     // Catch: Throwable -> L106
        int r105 = r28;
        double r106 = r1.getDouble(r105);     // Catch: Throwable -> L106
        int r107 = r29;
        if (r1.isNull(r107) == false) goto L54;
        String r108 = null;
    L55:
        List<Double> r109 = r134.__listDoubleConverter.stringToObject(r108);     // Catch: Throwable -> L106
        int r111 = r30;
        double r1010 = r1.getDouble(r111);     // Catch: Throwable -> L106
        int r112 = r31;
        if (r1.isNull(r112) == false) goto L59;
        String r113 = null;
    L60:
        List<Double> r1011 = r134.__listDoubleConverter.stringToObject(r113);     // Catch: Throwable -> L106
        int r114 = r32;
        if (r1.isNull(r114) == false) goto L64;
        String r115 = null;
    L63:
        r32 = r114;
        List<Double> r1012 = r134.__listDoubleConverter.stringToObject(r115);     // Catch: Throwable -> L106
        int r116 = r33;
        double r1013 = r1.getDouble(r116);     // Catch: Throwable -> L106
        int r117 = r34;
        double r118 = r1.getDouble(r117);     // Catch: Throwable -> L106
        r33 = r116;
        r35 = r35;
        if (r1.isNull(r35) == false) goto L69;
        String r119 = null;
    L68:
        r34 = r117;
        List<Double> r1110 = r134.__listDoubleConverter.stringToObject(r119);     // Catch: Throwable -> L106
        int r120 = r36;
        if (r1.isNull(r120) == false) goto L74;
        String r121 = null;
    L73:
        r36 = r120;
        List<Double> r1111 = r134.__listDoubleConverter.stringToObject(r121);     // Catch: Throwable -> L106
        int r122 = r37;
        if (r1.isNull(r122) == false) goto L79;
        String r123 = null;
    L78:
        r37 = r122;
        List<Double> r1112 = r134.__listDoubleConverter.stringToObject(r123);     // Catch: Throwable -> L106
        int r124 = r38;
        double r1113 = r1.getDouble(r124);     // Catch: Throwable -> L106
        int r125 = r39;
        if (r1.isNull(r125) == false) goto L84;
        String r126 = null;
    L85:
        List<Double> r1114 = r134.__listDoubleConverter.stringToObject(r126);     // Catch: Throwable -> L106
        int r127 = r40;
        double r1115 = r1.getDouble(r127);     // Catch: Throwable -> L106
        int r128 = r41;
        if (r1.isNull(r128) == false) goto L89;
        String r129 = null;
    L90:
        List<Double> r1210 = r134.__listDoubleConverter.stringToObject(r129);     // Catch: Throwable -> L106
        int r130 = r42;
        double r1211 = r1.getDouble(r130);     // Catch: Throwable -> L106
        int r131 = r43;
        if (r1.isNull(r131) == false) goto L94;
        String r132 = null;
    L95:
        List<Double> r1212 = r134.__listDoubleConverter.stringToObject(r132);     // Catch: Throwable -> L106
        int r133 = r44;
        if (r1.isNull(r133) == false) goto L99;
        String r140 = null;
    L98:
        r44 = r133;
        List<Double> r1213 = r134.__listDoubleConverter.stringToObject(r140);     // Catch: Throwable -> L106
        int r141 = r45;
        double r1214 = r1.getDouble(r141);     // Catch: Throwable -> L106
        int r142 = r46;
        if (r1.isNull(r142) == false) goto L103;
    L102:
        r45 = r141;
        r46 = r142;
        List<Double> r1215 = r134.__listDoubleConverter.stringToObject(r52);     // Catch: Throwable -> L106
        int r143 = r47;
        r47 = r143;
        int r144 = r48;
        int r410 = r5;
        int r145 = r49;
        r0.add(new Weight(r110, r54, r56, r53, r55, r57, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r79, r80, r81, r83, r84, r86, r88, r90, r92, r94, r95, r97, r98, r101, r104, r106, r109, r1010, r1011, r1012, r1013, r118, r1110, r1111, r1112, r1113, r1114, r1115, r1210, r1211, r1212, r1213, r1214, r1215, (int) r1.getLong(r143), (int) r1.getLong(r144), (int) r1.getLong(r145)));     // Catch: Throwable -> L106
        r24 = r91;
        r23 = r89;
        r26 = r99;
        r25 = r96;
        r29 = r107;
        r28 = r105;
        r31 = r112;
        r30 = r111;
        r39 = r125;
        r38 = r124;
        r41 = r128;
        r40 = r127;
        r43 = r131;
        r42 = r130;
        r2 = r2;
        r5 = r410;
        r48 = r144;
        r14 = r50;
        r15 = r51;
        r4 = r4;
        r49 = r145;
        r3 = r3;
        goto L4
    L103:
        r52 = r1.getText(r142);     // Catch: Throwable -> L106
        goto L102
    L99:
        r140 = r1.getText(r133);     // Catch: Throwable -> L106
        goto L98
    L94:
        r132 = r1.getText(r131);     // Catch: Throwable -> L106
        goto L95
    L89:
        r129 = r1.getText(r128);     // Catch: Throwable -> L106
        goto L90
    L84:
        r126 = r1.getText(r125);     // Catch: Throwable -> L106
        goto L85
    L79:
        r123 = r1.getText(r122);     // Catch: Throwable -> L106
        goto L78
    L74:
        r121 = r1.getText(r120);     // Catch: Throwable -> L106
        goto L73
    L69:
        r119 = r1.getText(r35);     // Catch: Throwable -> L106
        goto L68
    L64:
        r115 = r1.getText(r114);     // Catch: Throwable -> L106
        goto L63
    L59:
        r113 = r1.getText(r112);     // Catch: Throwable -> L106
        goto L60
    L54:
        r108 = r1.getText(r107);     // Catch: Throwable -> L106
        goto L55
    L49:
        r103 = r1.getText(r102);     // Catch: Throwable -> L106
        goto L48
    L44:
        r100 = r1.getText(r99);     // Catch: Throwable -> L106
        goto L45
    L39:
        r93 = r1.getText(r91);     // Catch: Throwable -> L106
        goto L40
    L34:
        r87 = r1.getText(r22);     // Catch: Throwable -> L106
        goto L33
    L29:
        r71 = r1.getText(r69);     // Catch: Throwable -> L106
        goto L28
    L24:
        r67 = r1.getText(r65);     // Catch: Throwable -> L106
        goto L23
    L19:
        r63 = r1.getText(r61);     // Catch: Throwable -> L106
        goto L18
    L14:
        r59 = r1.getText(r138);     // Catch: Throwable -> L106
        goto L15
    L9:
        r56 = r1.getText(r4);     // Catch: Throwable -> L106
        goto L10
    L108:
        r1.close();
        return r0;
    L106:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ List O00(WeightDao_Impl r138, SQLiteConnection r139) {
        r138.getClass();
        SQLiteStatement r1 = r139.prepare("SELECT * FROM Weight WHERE  mIsSync = 0 AND mTime > 0 ORDER BY mTime ASC LIMIT 150");
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L106
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L106
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L106
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeight");     // Catch: Throwable -> L106
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L106
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsMeasure");     // Catch: Throwable -> L106
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmi");     // Catch: Throwable -> L106
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFat");     // Catch: Throwable -> L106
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscle");     // Catch: Throwable -> L106
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFat");     // Catch: Throwable -> L106
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProtein");     // Catch: Throwable -> L106
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWater");     // Catch: Throwable -> L106
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStateOfNutrition");     // Catch: Throwable -> L106
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIdealWeight");     // Catch: Throwable -> L106
        int r1310 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBody");     // Catch: Throwable -> L106
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBodyRange");     // Catch: Throwable -> L106
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiRange");     // Catch: Throwable -> L106
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiWHORange");     // Catch: Throwable -> L106
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmr");     // Catch: Throwable -> L106
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmrRange");     // Catch: Throwable -> L106
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBodyShape");     // Catch: Throwable -> L106
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDesirableWeight");     // Catch: Throwable -> L106
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatFreeBodyWeight");     // Catch: Throwable -> L106
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatToControl");     // Catch: Throwable -> L106
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFat");     // Catch: Throwable -> L106
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFatRange");     // Catch: Throwable -> L106
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMuscleToControl");     // Catch: Throwable -> L106
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFatRange");     // Catch: Throwable -> L106
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscle");     // Catch: Throwable -> L106
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscleRange");     // Catch: Throwable -> L106
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinRange");     // Catch: Throwable -> L106
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFat");     // Catch: Throwable -> L106
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFatRange");     // Catch: Throwable -> L106
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterRange");     // Catch: Throwable -> L106
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScore");     // Catch: Throwable -> L106
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBone");     // Catch: Throwable -> L106
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBoneRange");     // Catch: Throwable -> L106
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFatRange");     // Catch: Throwable -> L106
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscleRange");     // Catch: Throwable -> L106
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProtein");     // Catch: Throwable -> L106
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProteinRange");     // Catch: Throwable -> L106
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWater");     // Catch: Throwable -> L106
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWaterRange");     // Catch: Throwable -> L106
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightRange");     // Catch: Throwable -> L106
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightToControl");     // Catch: Throwable -> L106
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightWHORange");     // Catch: Throwable -> L106
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L106
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinLevel");     // Catch: Throwable -> L106
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterLevel");     // Catch: Throwable -> L106
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L106
    L4:
        if (r1.step() == false) goto L108;
        int r54 = r14;
        int r55 = r15;
        int r110 = (int) r1.getLong(r2);     // Catch: Throwable -> L106
        long r58 = r1.getLong(r3);     // Catch: Throwable -> L106
        String r56 = null;
        if (r1.isNull(r4) == false) goto L9;
        String r60 = null;
    L10:
        float r57 = (float) r1.getDouble(r5);     // Catch: Throwable -> L106
        int r59 = (int) r1.getLong(r6);     // Catch: Throwable -> L106
        int r61 = (int) r1.getLong(r7);     // Catch: Throwable -> L106
        double r64 = r1.getDouble(r8);     // Catch: Throwable -> L106
        double r66 = r1.getDouble(r9);     // Catch: Throwable -> L106
        double r68 = r1.getDouble(r10);     // Catch: Throwable -> L106
        double r70 = r1.getDouble(r11);     // Catch: Throwable -> L106
        double r72 = r1.getDouble(r12);     // Catch: Throwable -> L106
        double r74 = r1.getDouble(r13);     // Catch: Throwable -> L106
        double r76 = r1.getDouble(r54);     // Catch: Throwable -> L106
        double r78 = r1.getDouble(r55);     // Catch: Throwable -> L106
        int r62 = r1310;
        double r80 = r1.getDouble(r62);     // Catch: Throwable -> L106
        r1310 = r62;
        int r63 = r16;
        if (r1.isNull(r63) == false) goto L14;
        String r65 = null;
    L15:
        List<Double> r82 = r138.__listDoubleConverter.stringToObject(r65);     // Catch: Throwable -> L106
        int r67 = r17;
        if (r1.isNull(r67) == false) goto L19;
        String r69 = null;
    L18:
        r17 = r67;
        List<Double> r83 = r138.__listDoubleConverter.stringToObject(r69);     // Catch: Throwable -> L106
        int r71 = r18;
        if (r1.isNull(r71) == false) goto L24;
        String r73 = null;
    L23:
        r18 = r71;
        List<Double> r84 = r138.__listDoubleConverter.stringToObject(r73);     // Catch: Throwable -> L106
        int r75 = r19;
        double r85 = r1.getDouble(r75);     // Catch: Throwable -> L106
        int r77 = r20;
        if (r1.isNull(r77) == false) goto L29;
        String r79 = null;
    L30:
        List<Double> r87 = r138.__listDoubleConverter.stringToObject(r79);     // Catch: Throwable -> L106
        int r81 = r21;
        double r88 = r1.getDouble(r81);     // Catch: Throwable -> L106
        int r86 = r22;
        double r90 = r1.getDouble(r86);     // Catch: Throwable -> L106
        r21 = r81;
        int r89 = r23;
        double r92 = r1.getDouble(r89);     // Catch: Throwable -> L106
        r23 = r89;
        int r91 = r24;
        double r94 = r1.getDouble(r91);     // Catch: Throwable -> L106
        r24 = r91;
        int r93 = r25;
        double r96 = r1.getDouble(r93);     // Catch: Throwable -> L106
        r25 = r93;
        r26 = r26;
        if (r1.isNull(r26) == false) goto L34;
        String r95 = null;
    L33:
        r22 = r86;
        List<Double> r98 = r138.__listDoubleConverter.stringToObject(r95);     // Catch: Throwable -> L106
        int r97 = r27;
        double r99 = r1.getDouble(r97);     // Catch: Throwable -> L106
        int r100 = r28;
        if (r1.isNull(r100) == false) goto L39;
        String r101 = null;
    L40:
        List<Double> r102 = r138.__listDoubleConverter.stringToObject(r101);     // Catch: Throwable -> L106
        int r103 = r29;
        double r104 = r1.getDouble(r103);     // Catch: Throwable -> L106
        int r105 = r30;
        if (r1.isNull(r105) == false) goto L44;
        String r106 = null;
    L45:
        List<Double> r107 = r138.__listDoubleConverter.stringToObject(r106);     // Catch: Throwable -> L106
        int r108 = r31;
        if (r1.isNull(r108) == false) goto L49;
        String r109 = null;
    L48:
        r31 = r108;
        List<Double> r1010 = r138.__listDoubleConverter.stringToObject(r109);     // Catch: Throwable -> L106
        int r111 = r32;
        double r1011 = r1.getDouble(r111);     // Catch: Throwable -> L106
        int r112 = r33;
        if (r1.isNull(r112) == false) goto L54;
        String r113 = null;
    L55:
        List<Double> r1012 = r138.__listDoubleConverter.stringToObject(r113);     // Catch: Throwable -> L106
        int r114 = r34;
        double r1013 = r1.getDouble(r114);     // Catch: Throwable -> L106
        int r115 = r35;
        if (r1.isNull(r115) == false) goto L59;
        String r116 = null;
    L60:
        List<Double> r117 = r138.__listDoubleConverter.stringToObject(r116);     // Catch: Throwable -> L106
        int r118 = r36;
        if (r1.isNull(r118) == false) goto L64;
        String r119 = null;
    L63:
        r36 = r118;
        List<Double> r1110 = r138.__listDoubleConverter.stringToObject(r119);     // Catch: Throwable -> L106
        int r120 = r37;
        double r1111 = r1.getDouble(r120);     // Catch: Throwable -> L106
        int r121 = r38;
        double r1112 = r1.getDouble(r121);     // Catch: Throwable -> L106
        r37 = r120;
        r39 = r39;
        if (r1.isNull(r39) == false) goto L69;
        String r122 = null;
    L68:
        r38 = r121;
        List<Double> r1113 = r138.__listDoubleConverter.stringToObject(r122);     // Catch: Throwable -> L106
        int r123 = r40;
        if (r1.isNull(r123) == false) goto L74;
        String r124 = null;
    L73:
        r40 = r123;
        List<Double> r1114 = r138.__listDoubleConverter.stringToObject(r124);     // Catch: Throwable -> L106
        int r125 = r41;
        if (r1.isNull(r125) == false) goto L79;
        String r126 = null;
    L78:
        r41 = r125;
        List<Double> r1115 = r138.__listDoubleConverter.stringToObject(r126);     // Catch: Throwable -> L106
        int r127 = r42;
        double r128 = r1.getDouble(r127);     // Catch: Throwable -> L106
        int r129 = r43;
        if (r1.isNull(r129) == false) goto L84;
        String r130 = null;
    L85:
        List<Double> r1210 = r138.__listDoubleConverter.stringToObject(r130);     // Catch: Throwable -> L106
        int r131 = r44;
        double r1211 = r1.getDouble(r131);     // Catch: Throwable -> L106
        int r132 = r45;
        if (r1.isNull(r132) == false) goto L89;
        String r133 = null;
    L90:
        List<Double> r1212 = r138.__listDoubleConverter.stringToObject(r133);     // Catch: Throwable -> L106
        int r134 = r46;
        double r1213 = r1.getDouble(r134);     // Catch: Throwable -> L106
        int r135 = r47;
        if (r1.isNull(r135) == false) goto L94;
        String r136 = null;
    L95:
        List<Double> r1214 = r138.__listDoubleConverter.stringToObject(r136);     // Catch: Throwable -> L106
        int r137 = r48;
        if (r1.isNull(r137) == false) goto L99;
        String r140 = null;
    L98:
        r48 = r137;
        List<Double> r1215 = r138.__listDoubleConverter.stringToObject(r140);     // Catch: Throwable -> L106
        int r141 = r49;
        double r1311 = r1.getDouble(r141);     // Catch: Throwable -> L106
        int r142 = r50;
        if (r1.isNull(r142) == false) goto L103;
    L102:
        r49 = r141;
        r50 = r142;
        List<Double> r1312 = r138.__listDoubleConverter.stringToObject(r56);     // Catch: Throwable -> L106
        int r143 = r51;
        r51 = r143;
        int r144 = r52;
        int r510 = r5;
        int r145 = r53;
        r0.add(new Weight(r110, r58, r60, r57, r59, r61, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r83, r84, r85, r87, r88, r90, r92, r94, r96, r98, r99, r102, r104, r107, r1010, r1011, r1012, r1013, r117, r1110, r1111, r1112, r1113, r1114, r1115, r128, r1210, r1211, r1212, r1213, r1214, r1215, r1311, r1312, (int) r1.getLong(r143), (int) r1.getLong(r144), (int) r1.getLong(r145)));     // Catch: Throwable -> L106
        r20 = r77;
        r19 = r75;
        r28 = r100;
        r27 = r97;
        r30 = r105;
        r29 = r103;
        r33 = r112;
        r32 = r111;
        r35 = r115;
        r34 = r114;
        r43 = r129;
        r42 = r127;
        r45 = r132;
        r44 = r131;
        r47 = r135;
        r46 = r134;
        r2 = r2;
        r14 = r54;
        r5 = r510;
        r52 = r144;
        r16 = r63;
        r15 = r55;
        r4 = r4;
        r53 = r145;
        r3 = r3;
        goto L4
    L103:
        r56 = r1.getText(r142);     // Catch: Throwable -> L106
        goto L102
    L99:
        r140 = r1.getText(r137);     // Catch: Throwable -> L106
        goto L98
    L94:
        r136 = r1.getText(r135);     // Catch: Throwable -> L106
        goto L95
    L89:
        r133 = r1.getText(r132);     // Catch: Throwable -> L106
        goto L90
    L84:
        r130 = r1.getText(r129);     // Catch: Throwable -> L106
        goto L85
    L79:
        r126 = r1.getText(r125);     // Catch: Throwable -> L106
        goto L78
    L74:
        r124 = r1.getText(r123);     // Catch: Throwable -> L106
        goto L73
    L69:
        r122 = r1.getText(r39);     // Catch: Throwable -> L106
        goto L68
    L64:
        r119 = r1.getText(r118);     // Catch: Throwable -> L106
        goto L63
    L59:
        r116 = r1.getText(r115);     // Catch: Throwable -> L106
        goto L60
    L54:
        r113 = r1.getText(r112);     // Catch: Throwable -> L106
        goto L55
    L49:
        r109 = r1.getText(r108);     // Catch: Throwable -> L106
        goto L48
    L44:
        r106 = r1.getText(r105);     // Catch: Throwable -> L106
        goto L45
    L39:
        r101 = r1.getText(r100);     // Catch: Throwable -> L106
        goto L40
    L34:
        r95 = r1.getText(r26);     // Catch: Throwable -> L106
        goto L33
    L29:
        r79 = r1.getText(r77);     // Catch: Throwable -> L106
        goto L30
    L24:
        r73 = r1.getText(r71);     // Catch: Throwable -> L106
        goto L23
    L19:
        r69 = r1.getText(r67);     // Catch: Throwable -> L106
        goto L18
    L14:
        r65 = r1.getText(r63);     // Catch: Throwable -> L106
        goto L15
    L9:
        r60 = r1.getText(r4);     // Catch: Throwable -> L106
        goto L10
    L108:
        r1.close();
        return r0;
    L106:
        th = move-exception;
        r1.close();
        throw th;
    }

    public static /* synthetic */ Object OXO1(long r1, SQLiteConnection r3) {
        SQLiteStatement r4 = r3.prepare("DELETE FROM Weight WHERE mTime = ?");
        r4.mo3338bindLong(1, r1);     // Catch: Throwable -> L6
        r4.step();     // Catch: Throwable -> L6
        r4.close();
        return null;
    L6:
        th = move-exception;
        r4.close();
        throw th;
    }

    public static /* synthetic */ Integer XIi00iiXO(WeightDao_Impl r0, List r1, SQLiteConnection r2) {
        return Integer.valueOf(r0.__updateAdapterOfWeight.handleMultiple(r2, r1));
    }

    public static /* synthetic */ long[] XO0O10(WeightDao_Impl r0, List r1, SQLiteConnection r2) {
        return r0.__insertAdapterOfWeight.insertAndReturnIdsArray(r2, r1);
    }

    public static /* synthetic */ List XOO0ii0(WeightDao_Impl r138, SQLiteConnection r139) {
        r138.getClass();
        SQLiteStatement r1 = r139.prepare("SELECT * FROM Weight WHERE mIsDelete != 1 ORDER BY mTime ASC");
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L106
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L106
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L106
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeight");     // Catch: Throwable -> L106
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L106
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsMeasure");     // Catch: Throwable -> L106
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmi");     // Catch: Throwable -> L106
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFat");     // Catch: Throwable -> L106
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscle");     // Catch: Throwable -> L106
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFat");     // Catch: Throwable -> L106
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProtein");     // Catch: Throwable -> L106
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWater");     // Catch: Throwable -> L106
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStateOfNutrition");     // Catch: Throwable -> L106
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIdealWeight");     // Catch: Throwable -> L106
        int r1310 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBody");     // Catch: Throwable -> L106
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBodyRange");     // Catch: Throwable -> L106
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiRange");     // Catch: Throwable -> L106
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiWHORange");     // Catch: Throwable -> L106
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmr");     // Catch: Throwable -> L106
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmrRange");     // Catch: Throwable -> L106
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBodyShape");     // Catch: Throwable -> L106
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDesirableWeight");     // Catch: Throwable -> L106
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatFreeBodyWeight");     // Catch: Throwable -> L106
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatToControl");     // Catch: Throwable -> L106
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFat");     // Catch: Throwable -> L106
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFatRange");     // Catch: Throwable -> L106
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMuscleToControl");     // Catch: Throwable -> L106
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFatRange");     // Catch: Throwable -> L106
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscle");     // Catch: Throwable -> L106
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscleRange");     // Catch: Throwable -> L106
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinRange");     // Catch: Throwable -> L106
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFat");     // Catch: Throwable -> L106
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFatRange");     // Catch: Throwable -> L106
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterRange");     // Catch: Throwable -> L106
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScore");     // Catch: Throwable -> L106
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBone");     // Catch: Throwable -> L106
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBoneRange");     // Catch: Throwable -> L106
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFatRange");     // Catch: Throwable -> L106
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscleRange");     // Catch: Throwable -> L106
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProtein");     // Catch: Throwable -> L106
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProteinRange");     // Catch: Throwable -> L106
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWater");     // Catch: Throwable -> L106
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWaterRange");     // Catch: Throwable -> L106
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightRange");     // Catch: Throwable -> L106
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightToControl");     // Catch: Throwable -> L106
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightWHORange");     // Catch: Throwable -> L106
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L106
        int r52 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinLevel");     // Catch: Throwable -> L106
        int r53 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterLevel");     // Catch: Throwable -> L106
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L106
    L4:
        if (r1.step() == false) goto L108;
        int r54 = r14;
        int r55 = r15;
        int r110 = (int) r1.getLong(r2);     // Catch: Throwable -> L106
        long r58 = r1.getLong(r3);     // Catch: Throwable -> L106
        String r56 = null;
        if (r1.isNull(r4) == false) goto L9;
        String r60 = null;
    L10:
        float r57 = (float) r1.getDouble(r5);     // Catch: Throwable -> L106
        int r59 = (int) r1.getLong(r6);     // Catch: Throwable -> L106
        int r61 = (int) r1.getLong(r7);     // Catch: Throwable -> L106
        double r64 = r1.getDouble(r8);     // Catch: Throwable -> L106
        double r66 = r1.getDouble(r9);     // Catch: Throwable -> L106
        double r68 = r1.getDouble(r10);     // Catch: Throwable -> L106
        double r70 = r1.getDouble(r11);     // Catch: Throwable -> L106
        double r72 = r1.getDouble(r12);     // Catch: Throwable -> L106
        double r74 = r1.getDouble(r13);     // Catch: Throwable -> L106
        double r76 = r1.getDouble(r54);     // Catch: Throwable -> L106
        double r78 = r1.getDouble(r55);     // Catch: Throwable -> L106
        int r62 = r1310;
        double r80 = r1.getDouble(r62);     // Catch: Throwable -> L106
        r1310 = r62;
        int r63 = r16;
        if (r1.isNull(r63) == false) goto L14;
        String r65 = null;
    L15:
        List<Double> r82 = r138.__listDoubleConverter.stringToObject(r65);     // Catch: Throwable -> L106
        int r67 = r17;
        if (r1.isNull(r67) == false) goto L19;
        String r69 = null;
    L18:
        r17 = r67;
        List<Double> r83 = r138.__listDoubleConverter.stringToObject(r69);     // Catch: Throwable -> L106
        int r71 = r18;
        if (r1.isNull(r71) == false) goto L24;
        String r73 = null;
    L23:
        r18 = r71;
        List<Double> r84 = r138.__listDoubleConverter.stringToObject(r73);     // Catch: Throwable -> L106
        int r75 = r19;
        double r85 = r1.getDouble(r75);     // Catch: Throwable -> L106
        int r77 = r20;
        if (r1.isNull(r77) == false) goto L29;
        String r79 = null;
    L30:
        List<Double> r87 = r138.__listDoubleConverter.stringToObject(r79);     // Catch: Throwable -> L106
        int r81 = r21;
        double r88 = r1.getDouble(r81);     // Catch: Throwable -> L106
        int r86 = r22;
        double r90 = r1.getDouble(r86);     // Catch: Throwable -> L106
        r21 = r81;
        int r89 = r23;
        double r92 = r1.getDouble(r89);     // Catch: Throwable -> L106
        r23 = r89;
        int r91 = r24;
        double r94 = r1.getDouble(r91);     // Catch: Throwable -> L106
        r24 = r91;
        int r93 = r25;
        double r96 = r1.getDouble(r93);     // Catch: Throwable -> L106
        r25 = r93;
        r26 = r26;
        if (r1.isNull(r26) == false) goto L34;
        String r95 = null;
    L33:
        r22 = r86;
        List<Double> r98 = r138.__listDoubleConverter.stringToObject(r95);     // Catch: Throwable -> L106
        int r97 = r27;
        double r99 = r1.getDouble(r97);     // Catch: Throwable -> L106
        int r100 = r28;
        if (r1.isNull(r100) == false) goto L39;
        String r101 = null;
    L40:
        List<Double> r102 = r138.__listDoubleConverter.stringToObject(r101);     // Catch: Throwable -> L106
        int r103 = r29;
        double r104 = r1.getDouble(r103);     // Catch: Throwable -> L106
        int r105 = r30;
        if (r1.isNull(r105) == false) goto L44;
        String r106 = null;
    L45:
        List<Double> r107 = r138.__listDoubleConverter.stringToObject(r106);     // Catch: Throwable -> L106
        int r108 = r31;
        if (r1.isNull(r108) == false) goto L49;
        String r109 = null;
    L48:
        r31 = r108;
        List<Double> r1010 = r138.__listDoubleConverter.stringToObject(r109);     // Catch: Throwable -> L106
        int r111 = r32;
        double r1011 = r1.getDouble(r111);     // Catch: Throwable -> L106
        int r112 = r33;
        if (r1.isNull(r112) == false) goto L54;
        String r113 = null;
    L55:
        List<Double> r1012 = r138.__listDoubleConverter.stringToObject(r113);     // Catch: Throwable -> L106
        int r114 = r34;
        double r1013 = r1.getDouble(r114);     // Catch: Throwable -> L106
        int r115 = r35;
        if (r1.isNull(r115) == false) goto L59;
        String r116 = null;
    L60:
        List<Double> r117 = r138.__listDoubleConverter.stringToObject(r116);     // Catch: Throwable -> L106
        int r118 = r36;
        if (r1.isNull(r118) == false) goto L64;
        String r119 = null;
    L63:
        r36 = r118;
        List<Double> r1110 = r138.__listDoubleConverter.stringToObject(r119);     // Catch: Throwable -> L106
        int r120 = r37;
        double r1111 = r1.getDouble(r120);     // Catch: Throwable -> L106
        int r121 = r38;
        double r1112 = r1.getDouble(r121);     // Catch: Throwable -> L106
        r37 = r120;
        r39 = r39;
        if (r1.isNull(r39) == false) goto L69;
        String r122 = null;
    L68:
        r38 = r121;
        List<Double> r1113 = r138.__listDoubleConverter.stringToObject(r122);     // Catch: Throwable -> L106
        int r123 = r40;
        if (r1.isNull(r123) == false) goto L74;
        String r124 = null;
    L73:
        r40 = r123;
        List<Double> r1114 = r138.__listDoubleConverter.stringToObject(r124);     // Catch: Throwable -> L106
        int r125 = r41;
        if (r1.isNull(r125) == false) goto L79;
        String r126 = null;
    L78:
        r41 = r125;
        List<Double> r1115 = r138.__listDoubleConverter.stringToObject(r126);     // Catch: Throwable -> L106
        int r127 = r42;
        double r128 = r1.getDouble(r127);     // Catch: Throwable -> L106
        int r129 = r43;
        if (r1.isNull(r129) == false) goto L84;
        String r130 = null;
    L85:
        List<Double> r1210 = r138.__listDoubleConverter.stringToObject(r130);     // Catch: Throwable -> L106
        int r131 = r44;
        double r1211 = r1.getDouble(r131);     // Catch: Throwable -> L106
        int r132 = r45;
        if (r1.isNull(r132) == false) goto L89;
        String r133 = null;
    L90:
        List<Double> r1212 = r138.__listDoubleConverter.stringToObject(r133);     // Catch: Throwable -> L106
        int r134 = r46;
        double r1213 = r1.getDouble(r134);     // Catch: Throwable -> L106
        int r135 = r47;
        if (r1.isNull(r135) == false) goto L94;
        String r136 = null;
    L95:
        List<Double> r1214 = r138.__listDoubleConverter.stringToObject(r136);     // Catch: Throwable -> L106
        int r137 = r48;
        if (r1.isNull(r137) == false) goto L99;
        String r140 = null;
    L98:
        r48 = r137;
        List<Double> r1215 = r138.__listDoubleConverter.stringToObject(r140);     // Catch: Throwable -> L106
        int r141 = r49;
        double r1311 = r1.getDouble(r141);     // Catch: Throwable -> L106
        int r142 = r50;
        if (r1.isNull(r142) == false) goto L103;
    L102:
        r49 = r141;
        r50 = r142;
        List<Double> r1312 = r138.__listDoubleConverter.stringToObject(r56);     // Catch: Throwable -> L106
        int r143 = r51;
        r51 = r143;
        int r144 = r52;
        int r510 = r5;
        int r145 = r53;
        r0.add(new Weight(r110, r58, r60, r57, r59, r61, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r83, r84, r85, r87, r88, r90, r92, r94, r96, r98, r99, r102, r104, r107, r1010, r1011, r1012, r1013, r117, r1110, r1111, r1112, r1113, r1114, r1115, r128, r1210, r1211, r1212, r1213, r1214, r1215, r1311, r1312, (int) r1.getLong(r143), (int) r1.getLong(r144), (int) r1.getLong(r145)));     // Catch: Throwable -> L106
        r20 = r77;
        r19 = r75;
        r28 = r100;
        r27 = r97;
        r30 = r105;
        r29 = r103;
        r33 = r112;
        r32 = r111;
        r35 = r115;
        r34 = r114;
        r43 = r129;
        r42 = r127;
        r45 = r132;
        r44 = r131;
        r47 = r135;
        r46 = r134;
        r2 = r2;
        r14 = r54;
        r5 = r510;
        r52 = r144;
        r16 = r63;
        r15 = r55;
        r4 = r4;
        r53 = r145;
        r3 = r3;
        goto L4
    L103:
        r56 = r1.getText(r142);     // Catch: Throwable -> L106
        goto L102
    L99:
        r140 = r1.getText(r137);     // Catch: Throwable -> L106
        goto L98
    L94:
        r136 = r1.getText(r135);     // Catch: Throwable -> L106
        goto L95
    L89:
        r133 = r1.getText(r132);     // Catch: Throwable -> L106
        goto L90
    L84:
        r130 = r1.getText(r129);     // Catch: Throwable -> L106
        goto L85
    L79:
        r126 = r1.getText(r125);     // Catch: Throwable -> L106
        goto L78
    L74:
        r124 = r1.getText(r123);     // Catch: Throwable -> L106
        goto L73
    L69:
        r122 = r1.getText(r39);     // Catch: Throwable -> L106
        goto L68
    L64:
        r119 = r1.getText(r118);     // Catch: Throwable -> L106
        goto L63
    L59:
        r116 = r1.getText(r115);     // Catch: Throwable -> L106
        goto L60
    L54:
        r113 = r1.getText(r112);     // Catch: Throwable -> L106
        goto L55
    L49:
        r109 = r1.getText(r108);     // Catch: Throwable -> L106
        goto L48
    L44:
        r106 = r1.getText(r105);     // Catch: Throwable -> L106
        goto L45
    L39:
        r101 = r1.getText(r100);     // Catch: Throwable -> L106
        goto L40
    L34:
        r95 = r1.getText(r26);     // Catch: Throwable -> L106
        goto L33
    L29:
        r79 = r1.getText(r77);     // Catch: Throwable -> L106
        goto L30
    L24:
        r73 = r1.getText(r71);     // Catch: Throwable -> L106
        goto L23
    L19:
        r69 = r1.getText(r67);     // Catch: Throwable -> L106
        goto L18
    L14:
        r65 = r1.getText(r63);     // Catch: Throwable -> L106
        goto L15
    L9:
        r60 = r1.getText(r4);     // Catch: Throwable -> L106
        goto L10
    L108:
        r1.close();
        return r0;
    L106:
        th = move-exception;
        r1.close();
        throw th;
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    public static /* synthetic */ List iO(WeightDao_Impl r136, int r137, int r138, SQLiteConnection r139) {
        r136.getClass();
        SQLiteStatement r1 = r139.prepare("SELECT * FROM Weight WHERE  mIsDelete != 1 ORDER BY mTime DESC LIMIT ?, ?");
        r1.mo3338bindLong(1, r137);     // Catch: Throwable -> L106
        r1.mo3338bindLong(2, r138);     // Catch: Throwable -> L106
        int r2 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mId");     // Catch: Throwable -> L106
        int r3 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mTime");     // Catch: Throwable -> L106
        int r4 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLocalTime");     // Catch: Throwable -> L106
        int r5 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeight");     // Catch: Throwable -> L106
        int r6 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsSync");     // Catch: Throwable -> L106
        int r7 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsMeasure");     // Catch: Throwable -> L106
        int r8 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmi");     // Catch: Throwable -> L106
        int r9 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFat");     // Catch: Throwable -> L106
        int r10 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscle");     // Catch: Throwable -> L106
        int r11 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFat");     // Catch: Throwable -> L106
        int r12 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProtein");     // Catch: Throwable -> L106
        int r13 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWater");     // Catch: Throwable -> L106
        int r14 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mStateOfNutrition");     // Catch: Throwable -> L106
        int r15 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIdealWeight");     // Catch: Throwable -> L106
        int r1310 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBody");     // Catch: Throwable -> L106
        int r1311 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mAgeOfBodyRange");     // Catch: Throwable -> L106
        int r1312 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiRange");     // Catch: Throwable -> L106
        int r16 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmiWHORange");     // Catch: Throwable -> L106
        int r17 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmr");     // Catch: Throwable -> L106
        int r18 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBmrRange");     // Catch: Throwable -> L106
        int r19 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mBodyShape");     // Catch: Throwable -> L106
        int r20 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mDesirableWeight");     // Catch: Throwable -> L106
        int r21 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatFreeBodyWeight");     // Catch: Throwable -> L106
        int r22 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mFatToControl");     // Catch: Throwable -> L106
        int r23 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFat");     // Catch: Throwable -> L106
        int r24 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mLevelOfVisceralFatRange");     // Catch: Throwable -> L106
        int r25 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mMuscleToControl");     // Catch: Throwable -> L106
        int r26 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfFatRange");     // Catch: Throwable -> L106
        int r27 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscle");     // Catch: Throwable -> L106
        int r28 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfMuscleRange");     // Catch: Throwable -> L106
        int r29 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinRange");     // Catch: Throwable -> L106
        int r30 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r31 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r32 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFat");     // Catch: Throwable -> L106
        int r33 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfSubcutaneousFatRange");     // Catch: Throwable -> L106
        int r34 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterRange");     // Catch: Throwable -> L106
        int r35 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mScore");     // Catch: Throwable -> L106
        int r36 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBone");     // Catch: Throwable -> L106
        int r37 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfBoneRange");     // Catch: Throwable -> L106
        int r38 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfFatRange");     // Catch: Throwable -> L106
        int r39 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfMuscleRange");     // Catch: Throwable -> L106
        int r40 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProtein");     // Catch: Throwable -> L106
        int r41 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfProteinRange");     // Catch: Throwable -> L106
        int r42 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscle");     // Catch: Throwable -> L106
        int r43 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfSkeletalMuscleRange");     // Catch: Throwable -> L106
        int r44 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWater");     // Catch: Throwable -> L106
        int r45 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightOfWaterRange");     // Catch: Throwable -> L106
        int r46 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightRange");     // Catch: Throwable -> L106
        int r47 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightToControl");     // Catch: Throwable -> L106
        int r48 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mWeightWHORange");     // Catch: Throwable -> L106
        int r49 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mIsDelete");     // Catch: Throwable -> L106
        int r50 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfProteinLevel");     // Catch: Throwable -> L106
        int r51 = SQLiteStatementUtil.getColumnIndexOrThrow(r1, "mRatioOfWaterLevel");     // Catch: Throwable -> L106
        ArrayList r0 = new ArrayList();     // Catch: Throwable -> L106
    L4:
        if (r1.step() == false) goto L108;
        int r52 = r14;
        int r53 = r15;
        int r110 = (int) r1.getLong(r2);     // Catch: Throwable -> L106
        long r56 = r1.getLong(r3);     // Catch: Throwable -> L106
        String r54 = null;
        if (r1.isNull(r4) == false) goto L9;
        String r58 = null;
    L10:
        float r55 = (float) r1.getDouble(r5);     // Catch: Throwable -> L106
        int r57 = (int) r1.getLong(r6);     // Catch: Throwable -> L106
        int r59 = (int) r1.getLong(r7);     // Catch: Throwable -> L106
        double r62 = r1.getDouble(r8);     // Catch: Throwable -> L106
        double r64 = r1.getDouble(r9);     // Catch: Throwable -> L106
        double r66 = r1.getDouble(r10);     // Catch: Throwable -> L106
        double r68 = r1.getDouble(r11);     // Catch: Throwable -> L106
        double r70 = r1.getDouble(r12);     // Catch: Throwable -> L106
        double r72 = r1.getDouble(r13);     // Catch: Throwable -> L106
        double r74 = r1.getDouble(r52);     // Catch: Throwable -> L106
        double r76 = r1.getDouble(r53);     // Catch: Throwable -> L106
        int r60 = r1310;
        double r78 = r1.getDouble(r60);     // Catch: Throwable -> L106
        r1310 = r60;
        r1311 = r1311;
        if (r1.isNull(r1311) == false) goto L14;
        String r61 = null;
    L15:
        List<Double> r80 = r136.__listDoubleConverter.stringToObject(r61);     // Catch: Throwable -> L106
        int r63 = r1312;
        if (r1.isNull(r63) == false) goto L19;
        String r65 = null;
    L18:
        r1312 = r63;
        List<Double> r81 = r136.__listDoubleConverter.stringToObject(r65);     // Catch: Throwable -> L106
        int r67 = r16;
        if (r1.isNull(r67) == false) goto L24;
        String r69 = null;
    L23:
        r16 = r67;
        List<Double> r82 = r136.__listDoubleConverter.stringToObject(r69);     // Catch: Throwable -> L106
        int r71 = r17;
        double r83 = r1.getDouble(r71);     // Catch: Throwable -> L106
        int r73 = r18;
        if (r1.isNull(r73) == false) goto L29;
        String r75 = null;
    L30:
        List<Double> r85 = r136.__listDoubleConverter.stringToObject(r75);     // Catch: Throwable -> L106
        int r77 = r19;
        double r86 = r1.getDouble(r77);     // Catch: Throwable -> L106
        int r79 = r20;
        double r88 = r1.getDouble(r79);     // Catch: Throwable -> L106
        r19 = r77;
        int r84 = r21;
        double r90 = r1.getDouble(r84);     // Catch: Throwable -> L106
        r21 = r84;
        int r87 = r22;
        double r92 = r1.getDouble(r87);     // Catch: Throwable -> L106
        r22 = r87;
        int r89 = r23;
        double r94 = r1.getDouble(r89);     // Catch: Throwable -> L106
        r23 = r89;
        r24 = r24;
        if (r1.isNull(r24) == false) goto L34;
        String r91 = null;
    L33:
        r20 = r79;
        List<Double> r96 = r136.__listDoubleConverter.stringToObject(r91);     // Catch: Throwable -> L106
        int r93 = r25;
        double r97 = r1.getDouble(r93);     // Catch: Throwable -> L106
        int r95 = r26;
        if (r1.isNull(r95) == false) goto L39;
        String r98 = null;
    L40:
        List<Double> r99 = r136.__listDoubleConverter.stringToObject(r98);     // Catch: Throwable -> L106
        int r100 = r27;
        double r101 = r1.getDouble(r100);     // Catch: Throwable -> L106
        int r102 = r28;
        if (r1.isNull(r102) == false) goto L44;
        String r103 = null;
    L45:
        List<Double> r104 = r136.__listDoubleConverter.stringToObject(r103);     // Catch: Throwable -> L106
        int r105 = r29;
        if (r1.isNull(r105) == false) goto L49;
        String r106 = null;
    L48:
        r29 = r105;
        List<Double> r107 = r136.__listDoubleConverter.stringToObject(r106);     // Catch: Throwable -> L106
        int r108 = r30;
        double r109 = r1.getDouble(r108);     // Catch: Throwable -> L106
        int r111 = r31;
        if (r1.isNull(r111) == false) goto L54;
        String r112 = null;
    L55:
        List<Double> r1010 = r136.__listDoubleConverter.stringToObject(r112);     // Catch: Throwable -> L106
        int r113 = r32;
        double r1011 = r1.getDouble(r113);     // Catch: Throwable -> L106
        int r114 = r33;
        if (r1.isNull(r114) == false) goto L59;
        String r115 = null;
    L60:
        List<Double> r1012 = r136.__listDoubleConverter.stringToObject(r115);     // Catch: Throwable -> L106
        int r116 = r34;
        if (r1.isNull(r116) == false) goto L64;
        String r117 = null;
    L63:
        r34 = r116;
        List<Double> r118 = r136.__listDoubleConverter.stringToObject(r117);     // Catch: Throwable -> L106
        int r119 = r35;
        double r1110 = r1.getDouble(r119);     // Catch: Throwable -> L106
        int r120 = r36;
        double r1111 = r1.getDouble(r120);     // Catch: Throwable -> L106
        r35 = r119;
        r37 = r37;
        if (r1.isNull(r37) == false) goto L69;
        String r121 = null;
    L68:
        r36 = r120;
        List<Double> r1112 = r136.__listDoubleConverter.stringToObject(r121);     // Catch: Throwable -> L106
        int r122 = r38;
        if (r1.isNull(r122) == false) goto L74;
        String r123 = null;
    L73:
        r38 = r122;
        List<Double> r1113 = r136.__listDoubleConverter.stringToObject(r123);     // Catch: Throwable -> L106
        int r124 = r39;
        if (r1.isNull(r124) == false) goto L79;
        String r125 = null;
    L78:
        r39 = r124;
        List<Double> r1114 = r136.__listDoubleConverter.stringToObject(r125);     // Catch: Throwable -> L106
        int r126 = r40;
        double r1115 = r1.getDouble(r126);     // Catch: Throwable -> L106
        int r127 = r41;
        if (r1.isNull(r127) == false) goto L84;
        String r128 = null;
    L85:
        List<Double> r129 = r136.__listDoubleConverter.stringToObject(r128);     // Catch: Throwable -> L106
        int r130 = r42;
        double r1210 = r1.getDouble(r130);     // Catch: Throwable -> L106
        int r131 = r43;
        if (r1.isNull(r131) == false) goto L89;
        String r132 = null;
    L90:
        List<Double> r1211 = r136.__listDoubleConverter.stringToObject(r132);     // Catch: Throwable -> L106
        int r133 = r44;
        double r1212 = r1.getDouble(r133);     // Catch: Throwable -> L106
        int r134 = r45;
        if (r1.isNull(r134) == false) goto L94;
        String r135 = null;
    L95:
        List<Double> r1213 = r136.__listDoubleConverter.stringToObject(r135);     // Catch: Throwable -> L106
        int r140 = r46;
        if (r1.isNull(r140) == false) goto L99;
        String r141 = null;
    L98:
        r46 = r140;
        List<Double> r1214 = r136.__listDoubleConverter.stringToObject(r141);     // Catch: Throwable -> L106
        int r142 = r47;
        double r1215 = r1.getDouble(r142);     // Catch: Throwable -> L106
        int r143 = r48;
        if (r1.isNull(r143) == false) goto L103;
    L102:
        r47 = r142;
        r48 = r143;
        List<Double> r1313 = r136.__listDoubleConverter.stringToObject(r54);     // Catch: Throwable -> L106
        int r144 = r49;
        r49 = r144;
        int r145 = r50;
        int r510 = r5;
        int r146 = r51;
        r0.add(new Weight(r110, r56, r58, r55, r57, r59, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r81, r82, r83, r85, r86, r88, r90, r92, r94, r96, r97, r99, r101, r104, r107, r109, r1010, r1011, r1012, r118, r1110, r1111, r1112, r1113, r1114, r1115, r129, r1210, r1211, r1212, r1213, r1214, r1215, r1313, (int) r1.getLong(r144), (int) r1.getLong(r145), (int) r1.getLong(r146)));     // Catch: Throwable -> L106
        r18 = r73;
        r17 = r71;
        r26 = r95;
        r25 = r93;
        r28 = r102;
        r27 = r100;
        r31 = r111;
        r30 = r108;
        r33 = r114;
        r32 = r113;
        r41 = r127;
        r40 = r126;
        r43 = r131;
        r42 = r130;
        r45 = r134;
        r44 = r133;
        r2 = r2;
        r5 = r510;
        r50 = r145;
        r14 = r52;
        r15 = r53;
        r4 = r4;
        r51 = r146;
        r3 = r3;
        goto L4
    L103:
        r54 = r1.getText(r143);     // Catch: Throwable -> L106
        goto L102
    L99:
        r141 = r1.getText(r140);     // Catch: Throwable -> L106
        goto L98
    L94:
        r135 = r1.getText(r134);     // Catch: Throwable -> L106
        goto L95
    L89:
        r132 = r1.getText(r131);     // Catch: Throwable -> L106
        goto L90
    L84:
        r128 = r1.getText(r127);     // Catch: Throwable -> L106
        goto L85
    L79:
        r125 = r1.getText(r124);     // Catch: Throwable -> L106
        goto L78
    L74:
        r123 = r1.getText(r122);     // Catch: Throwable -> L106
        goto L73
    L69:
        r121 = r1.getText(r37);     // Catch: Throwable -> L106
        goto L68
    L64:
        r117 = r1.getText(r116);     // Catch: Throwable -> L106
        goto L63
    L59:
        r115 = r1.getText(r114);     // Catch: Throwable -> L106
        goto L60
    L54:
        r112 = r1.getText(r111);     // Catch: Throwable -> L106
        goto L55
    L49:
        r106 = r1.getText(r105);     // Catch: Throwable -> L106
        goto L48
    L44:
        r103 = r1.getText(r102);     // Catch: Throwable -> L106
        goto L45
    L39:
        r98 = r1.getText(r95);     // Catch: Throwable -> L106
        goto L40
    L34:
        r91 = r1.getText(r24);     // Catch: Throwable -> L106
        goto L33
    L29:
        r75 = r1.getText(r73);     // Catch: Throwable -> L106
        goto L30
    L24:
        r69 = r1.getText(r67);     // Catch: Throwable -> L106
        goto L23
    L19:
        r65 = r1.getText(r63);     // Catch: Throwable -> L106
        goto L18
    L14:
        r61 = r1.getText(r1311);     // Catch: Throwable -> L106
        goto L15
    L9:
        r58 = r1.getText(r4);     // Catch: Throwable -> L106
        goto L10
    L108:
        r1.close();
        return r0;
    L106:
        th = move-exception;
        r1.close();
        throw th;
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public void delete(final long mTime) {
        DBUtil.performBlocking(this.__db, false, true, new my6(mTime));
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public List<Weight> getListASC() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ny6(this));
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public List<Weight> getTestWeights(final long start, final long end) {
        return WeightDao.DefaultImpls.getTestWeights(this, start, end);
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public List<Weight> getWeights() {
        return (List) DBUtil.performBlocking(this.__db, true, false, new ky6(this));
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public List<Weight> getWeightsASC(final long start, final long end) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new oy6(this, start, end));
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public List<Weight> getWeightsDESC(final int startIndex, final int endIndex) {
        return (List) DBUtil.performBlocking(this.__db, true, false, new py6(this, startIndex, endIndex));
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public long[] insert(final List<Weight> list) {
        list.getClass();
        return (long[]) DBUtil.performBlocking(this.__db, false, true, new ly6(this, list));
    }

    @Override // com.sma.smartv3.db.dao.WeightDao
    public int update(final List<Weight> lists) {
        lists.getClass();
        return ((Integer) DBUtil.performBlocking(this.__db, false, true, new jy6(this, lists))).intValue();
    }
}
