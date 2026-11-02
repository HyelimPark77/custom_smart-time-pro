package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleMatchLog;
import com.szabh.smable3.entity.BleMatchLog2;
import com.szabh.smable3.entity.BleMatchLog3;
import com.szabh.smable3.entity.BleMatchPeriod;
import com.szabh.smable3.entity.BleMatchPeriod2;
import com.szabh.smable3.entity.BleMatchRecord;
import com.szabh.smable3.entity.BleMatchRecord2;
import com.szabh.smable3.entity.BleMatchRecord3;
import com.szabh.smable3.entity.BleMatchRecordTeam3;
import com.szabh.smable3.entity.BleWeather;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@TypeConverters({MatchRecordConverter.class})
@Entity(indices = {@Index(unique = true, value = {"mStart"})})
@SourceDebugExtension({"SMAP\nMatchRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatchRecord.kt\ncom/sma/smartv3/db/entity/MatchRecord\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,213:1\n1563#2:214\n1634#2,3:215\n1563#2:218\n1634#2,3:219\n1563#2:222\n1634#2,3:223\n1563#2:226\n1634#2,3:227\n1869#2,2:230\n1563#2:232\n1634#2,3:233\n1563#2:236\n1634#2,3:237\n1869#2,2:240\n1869#2,2:242\n*S KotlinDebug\n*F\n+ 1 MatchRecord.kt\ncom/sma/smartv3/db/entity/MatchRecord\n*L\n106#1:214\n106#1:215,3\n107#1:218\n107#1:219,3\n117#1:222\n117#1:223,3\n118#1:226\n118#1:227,3\n127#1:230,2\n147#1:232\n147#1:233,3\n148#1:236\n148#1:237,3\n171#1:240,2\n190#1:242,2\n*E\n"})
public final class MatchRecord implements Serializable {

    @ColumnInfo
    private int mAirPressure;

    @ColumnInfo
    private int mAltitude;

    @ColumnInfo
    private int mGuestTeamScore;

    @ColumnInfo
    private int mHomeTeamScore;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private int mId;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsStopWatchData;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @aa1
    @Ignore
    private List<MatchLog> mLogList;

    @ColumnInfo
    private int mLogListSize;

    @ColumnInfo
    private int mMaxAltitude;

    @ColumnInfo
    private int mMaxPace;

    @ColumnInfo
    private int mMaxSpm;

    @ColumnInfo
    private int mMinAltitude;

    @ColumnInfo
    private int mMinBpm;

    @ColumnInfo
    private int mMinPace;

    @ColumnInfo
    private int mMinSpm;

    @ColumnInfo
    private int mMode;

    @ColumnInfo
    private int mPace;

    @Embedded(prefix = "p_")
    @aa1
    private MatchPeriod mPeriod;

    @aa1
    @Ignore
    private List<MatchPeriod> mPeriodList;

    @ColumnInfo
    private int mPeriodListSize;

    @ColumnInfo
    private int mSource;

    @ColumnInfo
    private int mSpm;

    @ColumnInfo
    private long mStart;

    @tb1
    @ColumnInfo(defaultValue = "")
    private List<Integer> mStopWatchList;

    @tb1
    @ColumnInfo(defaultValue = "")
    private BleMatchRecordTeam3 mTeamInfo;

    @ColumnInfo
    private int mType;

    @tb1
    @ColumnInfo(defaultValue = "")
    private BleWeather mWeather;

    public MatchRecord() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        MatchPeriod r8 = null;
        int r9 = 0;
        int r10 = 0;
        List r11 = null;
        List r12 = null;
        int r13 = 0;
        int r14 = 0;
        List r15 = null;
        BleMatchRecordTeam3 r16 = null;
        BleWeather r17 = null;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, at.IO, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchRecord copy$default(MatchRecord r17, int r18, long r19, String r21, int r22, int r23, int r24, MatchPeriod r25, int r26, int r27, List r28, List r29, int r30, int r31, List r32, BleMatchRecordTeam3 r33, BleWeather r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, Object r50) {
        if ((r49 & 1) == 0) goto L5;
        int r2 = r17.mId;
    L7:
        if ((r49 & 2) == 0) goto L9;
        long r3 = r17.mStart;
    L11:
        if ((r49 & 4) == 0) goto L13;
        String r5 = r17.mLocalTime;
    L15:
        if ((r49 & 8) == 0) goto L17;
        int r6 = r17.mType;
    L19:
        if ((r49 & 16) == 0) goto L21;
        int r7 = r17.mPeriodListSize;
    L23:
        if ((r49 & 32) == 0) goto L25;
        int r8 = r17.mLogListSize;
    L27:
        if ((r49 & 64) == 0) goto L29;
        MatchPeriod r9 = r17.mPeriod;
    L31:
        if ((r49 & 128) == 0) goto L33;
        int r10 = r17.mIsSync;
    L35:
        if ((r49 & 256) == 0) goto L37;
        int r11 = r17.mIsDelete;
    L39:
        if ((r49 & 512) == 0) goto L41;
        List r12 = r17.mPeriodList;
    L43:
        if ((r49 & 1024) == 0) goto L45;
        List r13 = r17.mLogList;
    L47:
        if ((r49 & 2048) == 0) goto L49;
        int r14 = r17.mSource;
    L51:
        if ((r49 & 4096) == 0) goto L53;
        int r15 = r17.mIsStopWatchData;
    L54:
        int r110 = r2;
        if ((r49 & 8192) == 0) goto L57;
        List r4 = r17.mStopWatchList;
    L58:
        List r111 = r4;
        if ((r49 & 16384) == 0) goto L61;
        BleMatchRecordTeam3 r16 = r17.mTeamInfo;
    L63:
        if ((r49 & 32768) == 0) goto L65;
        BleWeather r1 = r17.mWeather;
    L66:
        BleWeather r20 = r1;
        if ((r49 & 65536) == 0) goto L69;
        int r51 = r17.mHomeTeamScore;
    L70:
        int r210 = r51;
        if ((r49 & 131072) == 0) goto L73;
        int r52 = r17.mGuestTeamScore;
    L74:
        int r211 = r52;
        if ((r49 & 262144) == 0) goto L77;
        int r53 = r17.mMode;
    L78:
        int r212 = r53;
        if ((r49 & 524288) == 0) goto L81;
        int r54 = r17.mMinBpm;
    L82:
        int r213 = r54;
        if ((r49 & 1048576) == 0) goto L85;
        int r55 = r17.mAirPressure;
    L86:
        int r214 = r55;
        if ((r49 & 2097152) == 0) goto L89;
        int r56 = r17.mPace;
    L90:
        int r215 = r56;
        if ((r49 & 4194304) == 0) goto L93;
        int r57 = r17.mMaxPace;
    L94:
        int r216 = r57;
        if ((r49 & 8388608) == 0) goto L97;
        int r58 = r17.mMinPace;
    L98:
        int r217 = r58;
        if ((r49 & 16777216) == 0) goto L101;
        int r59 = r17.mSpm;
    L102:
        int r218 = r59;
        if ((r49 & 33554432) == 0) goto L105;
        int r60 = r17.mMaxSpm;
    L106:
        int r310 = r60;
        if ((r49 & 67108864) == 0) goto L109;
        int r61 = r17.mMinSpm;
    L110:
        int r311 = r61;
        if ((r49 & 134217728) == 0) goto L113;
        int r62 = r17.mAltitude;
    L114:
        int r312 = r62;
        if ((r49 & 268435456) == 0) goto L117;
        int r63 = r17.mMaxAltitude;
    L119:
        if ((r49 & 536870912) == 0) goto L122;
        int r313 = r63;
        int r410 = r313;
        int r411 = r17.mMinAltitude;
    L124:
        return r17.copy(r110, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r111, r16, r20, r210, r211, r212, r213, r214, r215, r216, r217, r218, r310, r311, r312, r410, r411);
    L122:
        r411 = r48;
        r410 = r63;
        goto L124
    L117:
        r63 = r47;
        goto L119
    L113:
        r62 = r46;
        goto L114
    L109:
        r61 = r45;
        goto L110
    L105:
        r60 = r44;
        goto L106
    L101:
        r59 = r43;
        goto L102
    L97:
        r58 = r42;
        goto L98
    L93:
        r57 = r41;
        goto L94
    L89:
        r56 = r40;
        goto L90
    L85:
        r55 = r39;
        goto L86
    L81:
        r54 = r38;
        goto L82
    L77:
        r53 = r37;
        goto L78
    L73:
        r52 = r36;
        goto L74
    L69:
        r51 = r35;
        goto L70
    L65:
        r1 = r34;
        goto L66
    L61:
        r16 = r33;
        goto L63
    L57:
        r4 = r32;
        goto L58
    L53:
        r15 = r31;
        goto L54
    L49:
        r14 = r30;
        goto L51
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
        goto L43
    L37:
        r11 = r27;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r9 = r25;
        goto L31
    L25:
        r8 = r24;
        goto L27
    L21:
        r7 = r23;
        goto L23
    L17:
        r6 = r22;
        goto L19
    L13:
        r5 = r21;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    private final void normalTotalScore() {
        Iterator r0 = CollectionsKt___CollectionsKt.IOOIXiI1(this.mLogList).iterator();
    L3:
        int r2 = 255;
    L5:
        if (r0.hasNext() == false) goto L22;
        MatchLog r3 = (MatchLog) r0.next();
        if (r3.getMType() == 8) goto L8;
        if (r3.getMType() == r2) goto L3;
        if (r3.getMType() != 6) goto L18;
        if (this.mHomeTeamScore != 0) goto L18;
        this.mHomeTeamScore = r3.getMCount();
    L18:
        if (r3.getMType() != 7) goto L5;
        if (this.mGuestTeamScore != 0) goto L5;
        this.mGuestTeamScore = r3.getMCount();
        goto L5
    L8:
        r2 = r3.getMCancelType();
        goto L5
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final List<MatchPeriod> component10() {
        return this.mPeriodList;
    }

    @aa1
    public final List<MatchLog> component11() {
        return this.mLogList;
    }

    public final int component12() {
        return this.mSource;
    }

    public final int component13() {
        return this.mIsStopWatchData;
    }

    @tb1
    public final List<Integer> component14() {
        return this.mStopWatchList;
    }

    @tb1
    public final BleMatchRecordTeam3 component15() {
        return this.mTeamInfo;
    }

    @tb1
    public final BleWeather component16() {
        return this.mWeather;
    }

    public final int component17() {
        return this.mHomeTeamScore;
    }

    public final int component18() {
        return this.mGuestTeamScore;
    }

    public final int component19() {
        return this.mMode;
    }

    public final long component2() {
        return this.mStart;
    }

    public final int component20() {
        return this.mMinBpm;
    }

    public final int component21() {
        return this.mAirPressure;
    }

    public final int component22() {
        return this.mPace;
    }

    public final int component23() {
        return this.mMaxPace;
    }

    public final int component24() {
        return this.mMinPace;
    }

    public final int component25() {
        return this.mSpm;
    }

    public final int component26() {
        return this.mMaxSpm;
    }

    public final int component27() {
        return this.mMinSpm;
    }

    public final int component28() {
        return this.mAltitude;
    }

    public final int component29() {
        return this.mMaxAltitude;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component30() {
        return this.mMinAltitude;
    }

    public final int component4() {
        return this.mType;
    }

    public final int component5() {
        return this.mPeriodListSize;
    }

    public final int component6() {
        return this.mLogListSize;
    }

    @aa1
    public final MatchPeriod component7() {
        return this.mPeriod;
    }

    public final int component8() {
        return this.mIsSync;
    }

    public final int component9() {
        return this.mIsDelete;
    }

    @aa1
    public final MatchRecord copy(int r34, long r35, @aa1 String r37, int r38, int r39, int r40, @aa1 MatchPeriod r41, int r42, int r43, @aa1 List<MatchPeriod> r44, @aa1 List<MatchLog> r45, int r46, int r47, @tb1 List<Integer> r48, @tb1 BleMatchRecordTeam3 r49, @tb1 BleWeather r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64) {
        Intrinsics.X0O(r37, "mLocalTime");
        Intrinsics.X0O(r41, "mPeriod");
        Intrinsics.X0O(r44, "mPeriodList");
        Intrinsics.X0O(r45, "mLogList");
        return new MatchRecord(r34, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MatchRecord) == true) goto L8;
        return false;
    L8:
        MatchRecord r9 = (MatchRecord) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mStart == r9.mStart) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mType == r9.mType) goto L21;
        return false;
    L21:
        if (this.mPeriodListSize == r9.mPeriodListSize) goto L24;
        return false;
    L24:
        if (this.mLogListSize == r9.mLogListSize) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mPeriod, r9.mPeriod) == true) goto L30;
        return false;
    L30:
        if (this.mIsSync == r9.mIsSync) goto L33;
        return false;
    L33:
        if (this.mIsDelete == r9.mIsDelete) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mPeriodList, r9.mPeriodList) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mLogList, r9.mLogList) == true) goto L42;
        return false;
    L42:
        if (this.mSource == r9.mSource) goto L45;
        return false;
    L45:
        if (this.mIsStopWatchData == r9.mIsStopWatchData) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mStopWatchList, r9.mStopWatchList) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.mTeamInfo, r9.mTeamInfo) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.mWeather, r9.mWeather) == true) goto L57;
        return false;
    L57:
        if (this.mHomeTeamScore == r9.mHomeTeamScore) goto L60;
        return false;
    L60:
        if (this.mGuestTeamScore == r9.mGuestTeamScore) goto L63;
        return false;
    L63:
        if (this.mMode == r9.mMode) goto L66;
        return false;
    L66:
        if (this.mMinBpm == r9.mMinBpm) goto L69;
        return false;
    L69:
        if (this.mAirPressure == r9.mAirPressure) goto L72;
        return false;
    L72:
        if (this.mPace == r9.mPace) goto L75;
        return false;
    L75:
        if (this.mMaxPace == r9.mMaxPace) goto L78;
        return false;
    L78:
        if (this.mMinPace == r9.mMinPace) goto L81;
        return false;
    L81:
        if (this.mSpm == r9.mSpm) goto L84;
        return false;
    L84:
        if (this.mMaxSpm == r9.mMaxSpm) goto L87;
        return false;
    L87:
        if (this.mMinSpm == r9.mMinSpm) goto L90;
        return false;
    L90:
        if (this.mAltitude == r9.mAltitude) goto L93;
        return false;
    L93:
        if (this.mMaxAltitude == r9.mMaxAltitude) goto L96;
        return false;
    L96:
        if (this.mMinAltitude == r9.mMinAltitude) goto L98;
        return false;
    L98:
        return true;
    }

    public final int getMAirPressure() {
        return this.mAirPressure;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMGuestTeamScore() {
        return this.mGuestTeamScore;
    }

    public final int getMHomeTeamScore() {
        return this.mHomeTeamScore;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsStopWatchData() {
        return this.mIsStopWatchData;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    @aa1
    public final List<MatchLog> getMLogList() {
        return this.mLogList;
    }

    public final int getMLogListSize() {
        return this.mLogListSize;
    }

    public final int getMMaxAltitude() {
        return this.mMaxAltitude;
    }

    public final int getMMaxPace() {
        return this.mMaxPace;
    }

    public final int getMMaxSpm() {
        return this.mMaxSpm;
    }

    public final int getMMinAltitude() {
        return this.mMinAltitude;
    }

    public final int getMMinBpm() {
        return this.mMinBpm;
    }

    public final int getMMinPace() {
        return this.mMinPace;
    }

    public final int getMMinSpm() {
        return this.mMinSpm;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    @aa1
    public final MatchPeriod getMPeriod() {
        return this.mPeriod;
    }

    @aa1
    public final List<MatchPeriod> getMPeriodList() {
        return this.mPeriodList;
    }

    public final int getMPeriodListSize() {
        return this.mPeriodListSize;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMSpm() {
        return this.mSpm;
    }

    public final long getMStart() {
        return this.mStart;
    }

    @tb1
    public final List<Integer> getMStopWatchList() {
        return this.mStopWatchList;
    }

    @tb1
    public final BleMatchRecordTeam3 getMTeamInfo() {
        return this.mTeamInfo;
    }

    public final int getMType() {
        return this.mType;
    }

    @tb1
    public final BleWeather getMWeather() {
        return this.mWeather;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mStart)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mPeriodListSize)) * 31) + Integer.hashCode(this.mLogListSize)) * 31) + this.mPeriod.hashCode()) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + this.mPeriodList.hashCode()) * 31) + this.mLogList.hashCode()) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mIsStopWatchData)) * 31;
        List<Integer> r1 = this.mStopWatchList;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (r0 + r3) * 31;
        BleMatchRecordTeam3 r5 = this.mTeamInfo;
        if (r5 != null) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r4 + r6) * 31;
        BleWeather r8 = this.mWeather;
        if (r8 == null) goto L15;
        r2 = r8.hashCode();
    L15:
        return ((((((((((((((((((((((((((((r7 + r2) * 31) + Integer.hashCode(this.mHomeTeamScore)) * 31) + Integer.hashCode(this.mGuestTeamScore)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude);
    L9:
        r6 = r5.hashCode();
        goto L10
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void rugbyTotalScore() {
        List r1 = CollectionsKt__CollectionsKt.Ii1iii0(new Integer[]{0, 0});
        Iterator r2 = CollectionsKt___CollectionsKt.IOOIXiI1(this.mLogList).iterator();
    L3:
        int r4 = 255;
    L5:
        if (r2.hasNext() == false) goto L29;
        MatchLog r5 = (MatchLog) r2.next();
        if (r5.getMType() == 8) goto L8;
        if (r5.getMType() == r4) goto L3;
        if (r5.getMType() == 17) goto L23;
        if (r5.getMType() == 18) goto L23;
        if (r5.getMType() == 19) goto L23;
        if (r5.getMType() == 20) goto L23;
        if (r5.getMType() != 21) goto L5;
    L23:
        if (r5.getMTeam() == 0) goto L27;
        if (r5.getMTeam() != 1) goto L5;
    L27:
        if (((Number) r1.get(r5.getMTeam())).intValue() != 0) goto L5;
        r1.set(r5.getMTeam(), Integer.valueOf(r5.getMCount()));
        goto L5
    L8:
        r4 = r5.getMCancelType();
        goto L5
    L29:
        this.mHomeTeamScore = ((Number) r1.get(0)).intValue();
        this.mGuestTeamScore = ((Number) r1.get(1)).intValue();
    }

    public final void setMAirPressure(int r1) {
        this.mAirPressure = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMGuestTeamScore(int r1) {
        this.mGuestTeamScore = r1;
    }

    public final void setMHomeTeamScore(int r1) {
        this.mHomeTeamScore = r1;
    }

    public final void setMId(int r1) {
        this.mId = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsStopWatchData(int r1) {
        this.mIsStopWatchData = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMLogList(@aa1 List<MatchLog> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLogList = r2;
    }

    public final void setMLogListSize(int r1) {
        this.mLogListSize = r1;
    }

    public final void setMMaxAltitude(int r1) {
        this.mMaxAltitude = r1;
    }

    public final void setMMaxPace(int r1) {
        this.mMaxPace = r1;
    }

    public final void setMMaxSpm(int r1) {
        this.mMaxSpm = r1;
    }

    public final void setMMinAltitude(int r1) {
        this.mMinAltitude = r1;
    }

    public final void setMMinBpm(int r1) {
        this.mMinBpm = r1;
    }

    public final void setMMinPace(int r1) {
        this.mMinPace = r1;
    }

    public final void setMMinSpm(int r1) {
        this.mMinSpm = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMPeriod(@aa1 MatchPeriod r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriod = r2;
    }

    public final void setMPeriodList(@aa1 List<MatchPeriod> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriodList = r2;
    }

    public final void setMPeriodListSize(int r1) {
        this.mPeriodListSize = r1;
    }

    public final void setMSource(int r1) {
        this.mSource = r1;
    }

    public final void setMSpm(int r1) {
        this.mSpm = r1;
    }

    public final void setMStart(long r1) {
        this.mStart = r1;
    }

    public final void setMStopWatchList(@tb1 List<Integer> r1) {
        this.mStopWatchList = r1;
    }

    public final void setMTeamInfo(@tb1 BleMatchRecordTeam3 r1) {
        this.mTeamInfo = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMWeather(@tb1 BleWeather r1) {
        this.mWeather = r1;
    }

    @aa1
    public String toString() {
        return "MatchRecord(mId=" + this.mId + ", mStart=" + this.mStart + ", mLocalTime=" + this.mLocalTime + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mPeriod=" + this.mPeriod + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + ", mSource=" + this.mSource + ", mIsStopWatchData=" + this.mIsStopWatchData + ", mStopWatchList=" + this.mStopWatchList + ", mTeamInfo=" + this.mTeamInfo + ", mWeather=" + this.mWeather + ", mHomeTeamScore=" + this.mHomeTeamScore + ", mGuestTeamScore=" + this.mGuestTeamScore + ", mMode=" + this.mMode + ", mMinBpm=" + this.mMinBpm + ", mAirPressure=" + this.mAirPressure + ", mPace=" + this.mPace + ", mMaxPace=" + this.mMaxPace + ", mMinPace=" + this.mMinPace + ", mSpm=" + this.mSpm + ", mMaxSpm=" + this.mMaxSpm + ", mMinSpm=" + this.mMinSpm + ", mAltitude=" + this.mAltitude + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinAltitude=" + this.mMinAltitude + I000IiI1O.iO.iO;
    }

    public MatchRecord(int r2, long r3, @aa1 String r5, int r6, int r7, int r8, @aa1 MatchPeriod r9, int r10, int r11, @aa1 List<MatchPeriod> r12, @aa1 List<MatchLog> r13, int r14, int r15, @tb1 List<Integer> r16, @tb1 BleMatchRecordTeam3 r17, @tb1 BleWeather r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32) {
        Intrinsics.X0O(r5, "mLocalTime");
        Intrinsics.X0O(r9, "mPeriod");
        Intrinsics.X0O(r12, "mPeriodList");
        Intrinsics.X0O(r13, "mLogList");
        this.mId = r2;
        this.mStart = r3;
        this.mLocalTime = r5;
        this.mType = r6;
        this.mPeriodListSize = r7;
        this.mLogListSize = r8;
        this.mPeriod = r9;
        this.mIsSync = r10;
        this.mIsDelete = r11;
        this.mPeriodList = r12;
        this.mLogList = r13;
        this.mSource = r14;
        this.mIsStopWatchData = r15;
        this.mStopWatchList = r16;
        this.mTeamInfo = r17;
        this.mWeather = r18;
        this.mHomeTeamScore = r19;
        this.mGuestTeamScore = r20;
        this.mMode = r21;
        this.mMinBpm = r22;
        this.mAirPressure = r23;
        this.mPace = r24;
        this.mMaxPace = r25;
        this.mMinPace = r26;
        this.mSpm = r27;
        this.mMaxSpm = r28;
        this.mMinSpm = r29;
        this.mAltitude = r30;
        this.mMaxAltitude = r31;
        this.mMinAltitude = r32;
    }

    public /* synthetic */ MatchRecord(int r32, long r33, String r35, int r36, int r37, int r38, MatchPeriod r39, int r40, int r41, List r42, List r43, int r44, int r45, List r46, BleMatchRecordTeam3 r47, BleWeather r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, DefaultConstructorMarker r64) {
        if ((r63 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r63 & 2) == 0) goto L9;
        long r3 = 0;
    L11:
        if ((r63 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r63 & 8) == 0) goto L17;
        int r6 = 0;
    L19:
        if ((r63 & 16) == 0) goto L21;
        int r7 = 0;
    L23:
        if ((r63 & 32) == 0) goto L25;
        int r8 = 0;
    L27:
        if ((r63 & 64) == 0) goto L29;
        MatchPeriod r10 = new MatchPeriod(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, bo0.iO, null);
    L31:
        if ((r63 & 128) == 0) goto L33;
        int r9 = 0;
    L35:
        if ((r63 & 256) == 0) goto L37;
        int r11 = 0;
    L39:
        if ((r63 & 512) == 0) goto L41;
        List r12 = new ArrayList();
    L43:
        if ((r63 & 1024) == 0) goto L45;
        List r13 = new ArrayList();
    L47:
        if ((r63 & 2048) == 0) goto L49;
        int r14 = 0;
    L51:
        if ((r63 & 4096) == 0) goto L53;
        int r15 = 0;
    L54:
        BleWeather r16 = null;
        if ((r63 & 8192) == 0) goto L57;
        List r2 = null;
    L58:
        int r34 = r1;
        if ((r63 & 16384) == 0) goto L61;
        BleMatchRecordTeam3 r4 = null;
    L63:
        if ((r63 & 32768) != 0) goto L67;
        r16 = r48;
    L67:
        if ((r63 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r63 & 131072) == 0) goto L73;
        int r18 = 0;
    L75:
        if ((r63 & 262144) == 0) goto L77;
        int r19 = 0;
    L79:
        if ((r63 & 524288) == 0) goto L81;
        int r20 = 0;
    L83:
        if ((r63 & 1048576) == 0) goto L85;
        int r21 = 0;
    L87:
        if ((r63 & 2097152) == 0) goto L89;
        int r22 = 0;
    L91:
        if ((r63 & 4194304) == 0) goto L93;
        int r23 = 0;
    L95:
        if ((r63 & 8388608) == 0) goto L97;
        int r24 = 0;
    L99:
        if ((r63 & 16777216) == 0) goto L101;
        int r25 = 0;
    L103:
        if ((r63 & 33554432) == 0) goto L105;
        int r26 = 0;
    L107:
        if ((r63 & 67108864) == 0) goto L109;
        int r27 = 0;
    L111:
        if ((r63 & 134217728) == 0) goto L113;
        int r28 = 0;
    L115:
        if ((r63 & 268435456) == 0) goto L117;
        int r29 = 0;
    L119:
        if ((r63 & 536870912) == 0) goto L122;
        int r65 = 0;
    L123:
        this(r34, r3, r5, r6, r7, r8, r10, r9, r11, r12, r13, r14, r15, r2, r4, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r65);
        return;
    L122:
        r65 = r62;
        goto L123
    L117:
        r29 = r61;
        goto L119
    L113:
        r28 = r60;
        goto L115
    L109:
        r27 = r59;
        goto L111
    L105:
        r26 = r58;
        goto L107
    L101:
        r25 = r57;
        goto L103
    L97:
        r24 = r56;
        goto L99
    L93:
        r23 = r55;
        goto L95
    L89:
        r22 = r54;
        goto L91
    L85:
        r21 = r53;
        goto L87
    L81:
        r20 = r52;
        goto L83
    L77:
        r19 = r51;
        goto L79
    L73:
        r18 = r50;
        goto L75
    L69:
        r17 = r49;
        goto L71
    L61:
        r4 = r47;
        goto L63
    L57:
        r2 = r46;
        goto L58
    L53:
        r15 = r45;
        goto L54
    L49:
        r14 = r44;
        goto L51
    L45:
        r13 = r43;
        goto L47
    L41:
        r12 = r42;
        goto L43
    L37:
        r11 = r41;
        goto L39
    L33:
        r9 = r40;
        goto L35
    L29:
        r10 = r39;
        goto L31
    L25:
        r8 = r38;
        goto L27
    L21:
        r7 = r37;
        goto L23
    L17:
        r6 = r36;
        goto L19
    L13:
        r5 = r35;
        goto L15
    L9:
        r3 = r33;
        goto L11
    L5:
        r1 = r32;
        goto L7
    }

    public MatchRecord(@aa1 BleMatchRecord r41, long r42) {
        Intrinsics.X0O(r41, "bleMatchRecord");
        long r8 = (((long) (r41.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r42;
        int r11 = r41.getMType();
        int r12 = r41.getMPeriodListSize();
        int r13 = r41.getMLogListSize();
        MatchPeriod r14 = new MatchPeriod(r41.getMPeriod(), r42);
        List<BleMatchPeriod> r2 = r41.getMPeriodList();
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
        Iterator<T> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r4.add(new MatchPeriod((BleMatchPeriod) r3.next(), r42));
        goto L4
    L6:
        List<BleMatchLog> r5 = r41.getMLogList();
        ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r7 = r5.iterator();
    L8:
        if (r7.hasNext() == false) goto L10;
        r6.add(new MatchLog((BleMatchLog) r7.next(), r42));
        goto L8
    L10:
        int r9 = 0;
        String r10 = null;
        int r15 = 0;
        int r16 = 0;
        int r19 = 0;
        int r20 = 0;
        List r21 = null;
        BleMatchRecordTeam3 r22 = null;
        BleWeather r23 = null;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        this(r9, r8, r10, r11, r12, r13, r14, r15, r16, r4, r6, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, 1073740165, null);
    }

    public MatchRecord(@aa1 BleMatchRecord2 r35, long r36) {
        Intrinsics.X0O(r35, "bleMatchRecord");
        long r4 = (((long) (r35.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r36;
        int r5 = r35.getMType();
        int r6 = r35.getMPeriodListSize();
        int r7 = r35.getMLogListSize();
        MatchPeriod r8 = new MatchPeriod(r35.getMPeriod(), r36);
        List<BleMatchPeriod2> r9 = r35.getMPeriodList();
        ArrayList r11 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r9, 10));
        Iterator<T> r10 = r9.iterator();
    L4:
        if (r10.hasNext() == false) goto L6;
        r11.add(new MatchPeriod((BleMatchPeriod2) r10.next(), r36));
        goto L4
    L6:
        List<BleMatchLog2> r12 = r35.getMLogList();
        ArrayList r13 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r12, 10));
        Iterator<T> r14 = r12.iterator();
    L8:
        if (r14.hasNext() == false) goto L10;
        r13.add(new MatchLog((BleMatchLog2) r14.next(), r36));
        goto L8
    L10:
        this(0, r4, null, r5, r6, r7, r8, 0, 0, r11, r13, 1, r35.getMIsStopWatchData(), r35.getMStopWatchList(), new BleMatchRecordTeam3(r35.getMTeamInfo()), r35.getMWeather(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073676677, null);
        Iterator r1 = CollectionsKt___CollectionsKt.IOOIXiI1(this.mLogList).iterator();
    L11:
        int r3 = 255;
    L13:
        if (r1.hasNext() == false) goto L30;
        MatchLog r15 = (MatchLog) r1.next();
        if (r15.getMType() == 8) goto L16;
        if (r15.getMType() == r3) goto L11;
        if (r15.getMType() != 6) goto L26;
        if (this.mHomeTeamScore != 0) goto L26;
        this.mHomeTeamScore = r15.getMCount();
    L26:
        if (r15.getMType() != 7) goto L13;
        if (this.mGuestTeamScore != 0) goto L13;
        this.mGuestTeamScore = r15.getMCount();
        goto L13
    L16:
        r3 = r15.getMCancelType();
        goto L13
    }

    public MatchRecord(@aa1 BleMatchRecord3 r41, long r42) {
        Intrinsics.X0O(r41, "bleMatchRecord");
        long r8 = (((long) (r41.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - r42;
        int r11 = r41.getMType();
        int r12 = r41.getMPeriodListSize();
        int r13 = r41.getMLogListSize();
        MatchPeriod r14 = new MatchPeriod(r41.getMPeriod(), r42);
        List<BleMatchPeriod2> r2 = r41.getMPeriodList();
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
        Iterator<T> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        r4.add(new MatchPeriod((BleMatchPeriod2) r3.next(), r42));
        goto L4
    L6:
        List<BleMatchLog3> r5 = r41.getMLogList();
        ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r5, 10));
        Iterator<T> r7 = r5.iterator();
    L8:
        if (r7.hasNext() == false) goto L10;
        r6.add(new MatchLog((BleMatchLog3) r7.next(), r42));
        goto L8
    L10:
        BleWeather r23 = new BleWeather(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        r23.setMWeatherCode(r41.getMWeather().getMWeatherCode());
        r23.setMCurrentTemperature(r41.getMWeather().getMCurrentTemperature());
        r23.setMMaxTemperature(r41.getMWeather().getMMaxTemperature());
        r23.setMMinTemperature(r41.getMWeather().getMMinTemperature());
        int r9 = 0;
        String r10 = null;
        int r15 = 0;
        int r16 = 0;
        int r19 = 2;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        this(r9, r8, r10, r11, r12, r13, r14, r15, r16, r4, r6, r19, r41.getMIsStopWatchData(), r41.getMStopWatchList(), r41.getMTeamInfo(), r23, 0, 0, 0, 0, 0, 0, 0, 0, 0, r33, r34, r35, r36, r37, 1073676677, null);
        if (r41.getMType() != 6) goto L14;
        rugbyTotalScore();
        return;
    L14:
        normalTotalScore();
    }
}
