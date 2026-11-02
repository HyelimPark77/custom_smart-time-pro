package com.sma.smartv3.p608db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.android.mltcode.paycertificationapi.C2229at;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
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
        this(0, 0L, null, 0, 0, 0, null, 0, 0, null, null, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, C2229at.f5560IO, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchRecord copy$default(MatchRecord matchRecord, int i, long j, String str, int i2, int i3, int i4, MatchPeriod matchPeriod, int i5, int i6, List list, List list2, int i7, int i8, List list3, BleMatchRecordTeam3 bleMatchRecordTeam3, BleWeather bleWeather, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj) {
        int i24;
        int i25;
        int i26 = (i23 & 1) != 0 ? matchRecord.mId : i;
        long j2 = (i23 & 2) != 0 ? matchRecord.mStart : j;
        String str2 = (i23 & 4) != 0 ? matchRecord.mLocalTime : str;
        int i27 = (i23 & 8) != 0 ? matchRecord.mType : i2;
        int i28 = (i23 & 16) != 0 ? matchRecord.mPeriodListSize : i3;
        int i29 = (i23 & 32) != 0 ? matchRecord.mLogListSize : i4;
        MatchPeriod matchPeriod2 = (i23 & 64) != 0 ? matchRecord.mPeriod : matchPeriod;
        int i30 = (i23 & 128) != 0 ? matchRecord.mIsSync : i5;
        int i31 = (i23 & 256) != 0 ? matchRecord.mIsDelete : i6;
        List list4 = (i23 & 512) != 0 ? matchRecord.mPeriodList : list;
        List list5 = (i23 & 1024) != 0 ? matchRecord.mLogList : list2;
        int i32 = (i23 & 2048) != 0 ? matchRecord.mSource : i7;
        int i33 = (i23 & 4096) != 0 ? matchRecord.mIsStopWatchData : i8;
        int i34 = i26;
        List list6 = (i23 & 8192) != 0 ? matchRecord.mStopWatchList : list3;
        BleMatchRecordTeam3 bleMatchRecordTeam4 = (i23 & 16384) != 0 ? matchRecord.mTeamInfo : bleMatchRecordTeam3;
        BleWeather bleWeather2 = (i23 & 32768) != 0 ? matchRecord.mWeather : bleWeather;
        int i35 = (i23 & 65536) != 0 ? matchRecord.mHomeTeamScore : i9;
        int i36 = (i23 & 131072) != 0 ? matchRecord.mGuestTeamScore : i10;
        int i37 = (i23 & 262144) != 0 ? matchRecord.mMode : i11;
        int i38 = (i23 & 524288) != 0 ? matchRecord.mMinBpm : i12;
        int i39 = (i23 & 1048576) != 0 ? matchRecord.mAirPressure : i13;
        int i40 = (i23 & 2097152) != 0 ? matchRecord.mPace : i14;
        int i41 = (i23 & 4194304) != 0 ? matchRecord.mMaxPace : i15;
        int i42 = (i23 & 8388608) != 0 ? matchRecord.mMinPace : i16;
        int i43 = (i23 & 16777216) != 0 ? matchRecord.mSpm : i17;
        int i44 = (i23 & 33554432) != 0 ? matchRecord.mMaxSpm : i18;
        int i45 = (i23 & 67108864) != 0 ? matchRecord.mMinSpm : i19;
        int i46 = (i23 & 134217728) != 0 ? matchRecord.mAltitude : i20;
        int i47 = (i23 & 268435456) != 0 ? matchRecord.mMaxAltitude : i21;
        if ((i23 & 536870912) != 0) {
            i25 = i47;
            i24 = matchRecord.mMinAltitude;
        } else {
            i24 = i22;
            i25 = i47;
        }
        return matchRecord.copy(i34, j2, str2, i27, i28, i29, matchPeriod2, i30, i31, list4, list5, i32, i33, list6, bleMatchRecordTeam4, bleWeather2, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, i45, i46, i25, i24);
    }

    private final void normalTotalScore() {
        while (true) {
            int mCancelType = 255;
            for (MatchLog matchLog : CollectionsKt___CollectionsKt.IOOIXiI1(this.mLogList)) {
                if (matchLog.getMType() == 8) {
                    mCancelType = matchLog.getMCancelType();
                } else if (matchLog.getMType() != mCancelType) {
                    if (matchLog.getMType() == 6 && this.mHomeTeamScore == 0) {
                        this.mHomeTeamScore = matchLog.getMCount();
                    } else if (matchLog.getMType() == 7 && this.mGuestTeamScore == 0) {
                        this.mGuestTeamScore = matchLog.getMCount();
                    }
                }
            }
            return;
        }
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
    public final MatchRecord copy(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, @aa1 MatchPeriod mPeriod, int i5, int i6, @aa1 List<MatchPeriod> mPeriodList, @aa1 List<MatchLog> mLogList, int i7, int i8, @tb1 List<Integer> list, @tb1 BleMatchRecordTeam3 bleMatchRecordTeam3, @tb1 BleWeather bleWeather, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        return new MatchRecord(i, j, mLocalTime, i2, i3, i4, mPeriod, i5, i6, mPeriodList, mLogList, i7, i8, list, bleMatchRecordTeam3, bleWeather, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchRecord)) {
            return false;
        }
        MatchRecord matchRecord = (MatchRecord) obj;
        return this.mId == matchRecord.mId && this.mStart == matchRecord.mStart && Intrinsics.XOO0ii0(this.mLocalTime, matchRecord.mLocalTime) && this.mType == matchRecord.mType && this.mPeriodListSize == matchRecord.mPeriodListSize && this.mLogListSize == matchRecord.mLogListSize && Intrinsics.XOO0ii0(this.mPeriod, matchRecord.mPeriod) && this.mIsSync == matchRecord.mIsSync && this.mIsDelete == matchRecord.mIsDelete && Intrinsics.XOO0ii0(this.mPeriodList, matchRecord.mPeriodList) && Intrinsics.XOO0ii0(this.mLogList, matchRecord.mLogList) && this.mSource == matchRecord.mSource && this.mIsStopWatchData == matchRecord.mIsStopWatchData && Intrinsics.XOO0ii0(this.mStopWatchList, matchRecord.mStopWatchList) && Intrinsics.XOO0ii0(this.mTeamInfo, matchRecord.mTeamInfo) && Intrinsics.XOO0ii0(this.mWeather, matchRecord.mWeather) && this.mHomeTeamScore == matchRecord.mHomeTeamScore && this.mGuestTeamScore == matchRecord.mGuestTeamScore && this.mMode == matchRecord.mMode && this.mMinBpm == matchRecord.mMinBpm && this.mAirPressure == matchRecord.mAirPressure && this.mPace == matchRecord.mPace && this.mMaxPace == matchRecord.mMaxPace && this.mMinPace == matchRecord.mMinPace && this.mSpm == matchRecord.mSpm && this.mMaxSpm == matchRecord.mMaxSpm && this.mMinSpm == matchRecord.mMinSpm && this.mAltitude == matchRecord.mAltitude && this.mMaxAltitude == matchRecord.mMaxAltitude && this.mMinAltitude == matchRecord.mMinAltitude;
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
        int iHashCode = ((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mStart)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mPeriodListSize)) * 31) + Integer.hashCode(this.mLogListSize)) * 31) + this.mPeriod.hashCode()) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + this.mPeriodList.hashCode()) * 31) + this.mLogList.hashCode()) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mIsStopWatchData)) * 31;
        List<Integer> list = this.mStopWatchList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BleMatchRecordTeam3 bleMatchRecordTeam3 = this.mTeamInfo;
        int iHashCode3 = (iHashCode2 + (bleMatchRecordTeam3 == null ? 0 : bleMatchRecordTeam3.hashCode())) * 31;
        BleWeather bleWeather = this.mWeather;
        return ((((((((((((((((((((((((((((iHashCode3 + (bleWeather != null ? bleWeather.hashCode() : 0)) * 31) + Integer.hashCode(this.mHomeTeamScore)) * 31) + Integer.hashCode(this.mGuestTeamScore)) * 31) + Integer.hashCode(this.mMode)) * 31) + Integer.hashCode(this.mMinBpm)) * 31) + Integer.hashCode(this.mAirPressure)) * 31) + Integer.hashCode(this.mPace)) * 31) + Integer.hashCode(this.mMaxPace)) * 31) + Integer.hashCode(this.mMinPace)) * 31) + Integer.hashCode(this.mSpm)) * 31) + Integer.hashCode(this.mMaxSpm)) * 31) + Integer.hashCode(this.mMinSpm)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Integer.hashCode(this.mMaxAltitude)) * 31) + Integer.hashCode(this.mMinAltitude);
    }

    public final void rugbyTotalScore() {
        List listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(0, 0);
        Iterator it = CollectionsKt___CollectionsKt.IOOIXiI1(this.mLogList).iterator();
        while (true) {
            int mCancelType = 255;
            while (true) {
                if (!it.hasNext()) {
                    this.mHomeTeamScore = ((Number) listIi1iii0.get(0)).intValue();
                    this.mGuestTeamScore = ((Number) listIi1iii0.get(1)).intValue();
                    return;
                }
                MatchLog matchLog = (MatchLog) it.next();
                if (matchLog.getMType() == 8) {
                    mCancelType = matchLog.getMCancelType();
                } else {
                    if (matchLog.getMType() == mCancelType) {
                        break;
                    }
                    if (matchLog.getMType() == 17 || matchLog.getMType() == 18 || matchLog.getMType() == 19 || matchLog.getMType() == 20 || matchLog.getMType() == 21) {
                        if (matchLog.getMTeam() == 0 || matchLog.getMTeam() == 1) {
                            if (((Number) listIi1iii0.get(matchLog.getMTeam())).intValue() == 0) {
                                listIi1iii0.set(matchLog.getMTeam(), Integer.valueOf(matchLog.getMCount()));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void setMAirPressure(int i) {
        this.mAirPressure = i;
    }

    public final void setMAltitude(int i) {
        this.mAltitude = i;
    }

    public final void setMGuestTeamScore(int i) {
        this.mGuestTeamScore = i;
    }

    public final void setMHomeTeamScore(int i) {
        this.mHomeTeamScore = i;
    }

    public final void setMId(int i) {
        this.mId = i;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsStopWatchData(int i) {
        this.mIsStopWatchData = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMLogList(@aa1 List<MatchLog> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLogList = list;
    }

    public final void setMLogListSize(int i) {
        this.mLogListSize = i;
    }

    public final void setMMaxAltitude(int i) {
        this.mMaxAltitude = i;
    }

    public final void setMMaxPace(int i) {
        this.mMaxPace = i;
    }

    public final void setMMaxSpm(int i) {
        this.mMaxSpm = i;
    }

    public final void setMMinAltitude(int i) {
        this.mMinAltitude = i;
    }

    public final void setMMinBpm(int i) {
        this.mMinBpm = i;
    }

    public final void setMMinPace(int i) {
        this.mMinPace = i;
    }

    public final void setMMinSpm(int i) {
        this.mMinSpm = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMPeriod(@aa1 MatchPeriod matchPeriod) {
        Intrinsics.X0O(matchPeriod, "<set-?>");
        this.mPeriod = matchPeriod;
    }

    public final void setMPeriodList(@aa1 List<MatchPeriod> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPeriodList = list;
    }

    public final void setMPeriodListSize(int i) {
        this.mPeriodListSize = i;
    }

    public final void setMSource(int i) {
        this.mSource = i;
    }

    public final void setMSpm(int i) {
        this.mSpm = i;
    }

    public final void setMStart(long j) {
        this.mStart = j;
    }

    public final void setMStopWatchList(@tb1 List<Integer> list) {
        this.mStopWatchList = list;
    }

    public final void setMTeamInfo(@tb1 BleMatchRecordTeam3 bleMatchRecordTeam3) {
        this.mTeamInfo = bleMatchRecordTeam3;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMWeather(@tb1 BleWeather bleWeather) {
        this.mWeather = bleWeather;
    }

    @aa1
    public String toString() {
        return "MatchRecord(mId=" + this.mId + ", mStart=" + this.mStart + ", mLocalTime=" + this.mLocalTime + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mPeriod=" + this.mPeriod + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + ", mSource=" + this.mSource + ", mIsStopWatchData=" + this.mIsStopWatchData + ", mStopWatchList=" + this.mStopWatchList + ", mTeamInfo=" + this.mTeamInfo + ", mWeather=" + this.mWeather + ", mHomeTeamScore=" + this.mHomeTeamScore + ", mGuestTeamScore=" + this.mGuestTeamScore + ", mMode=" + this.mMode + ", mMinBpm=" + this.mMinBpm + ", mAirPressure=" + this.mAirPressure + ", mPace=" + this.mPace + ", mMaxPace=" + this.mMaxPace + ", mMinPace=" + this.mMinPace + ", mSpm=" + this.mSpm + ", mMaxSpm=" + this.mMaxSpm + ", mMinSpm=" + this.mMinSpm + ", mAltitude=" + this.mAltitude + ", mMaxAltitude=" + this.mMaxAltitude + ", mMinAltitude=" + this.mMinAltitude + I000IiI1O.C2156iO.f1007iO;
    }

    public MatchRecord(int i, long j, @aa1 String mLocalTime, int i2, int i3, int i4, @aa1 MatchPeriod mPeriod, int i5, int i6, @aa1 List<MatchPeriod> mPeriodList, @aa1 List<MatchLog> mLogList, int i7, int i8, @tb1 List<Integer> list, @tb1 BleMatchRecordTeam3 bleMatchRecordTeam3, @tb1 BleWeather bleWeather, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        this.mId = i;
        this.mStart = j;
        this.mLocalTime = mLocalTime;
        this.mType = i2;
        this.mPeriodListSize = i3;
        this.mLogListSize = i4;
        this.mPeriod = mPeriod;
        this.mIsSync = i5;
        this.mIsDelete = i6;
        this.mPeriodList = mPeriodList;
        this.mLogList = mLogList;
        this.mSource = i7;
        this.mIsStopWatchData = i8;
        this.mStopWatchList = list;
        this.mTeamInfo = bleMatchRecordTeam3;
        this.mWeather = bleWeather;
        this.mHomeTeamScore = i9;
        this.mGuestTeamScore = i10;
        this.mMode = i11;
        this.mMinBpm = i12;
        this.mAirPressure = i13;
        this.mPace = i14;
        this.mMaxPace = i15;
        this.mMinPace = i16;
        this.mSpm = i17;
        this.mMaxSpm = i18;
        this.mMinSpm = i19;
        this.mAltitude = i20;
        this.mMaxAltitude = i21;
        this.mMinAltitude = i22;
    }

    public /* synthetic */ MatchRecord(int i, long j, String str, int i2, int i3, int i4, MatchPeriod matchPeriod, int i5, int i6, List list, List list2, int i7, int i8, List list3, BleMatchRecordTeam3 bleMatchRecordTeam3, BleWeather bleWeather, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, DefaultConstructorMarker defaultConstructorMarker) {
        this((i23 & 1) != 0 ? 0 : i, (i23 & 2) != 0 ? 0L : j, (i23 & 4) != 0 ? "" : str, (i23 & 8) != 0 ? 0 : i2, (i23 & 16) != 0 ? 0 : i3, (i23 & 32) != 0 ? 0 : i4, (i23 & 64) != 0 ? new MatchPeriod(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, bo0.f5772iO, null) : matchPeriod, (i23 & 128) != 0 ? 0 : i5, (i23 & 256) != 0 ? 0 : i6, (i23 & 512) != 0 ? new ArrayList() : list, (i23 & 1024) != 0 ? new ArrayList() : list2, (i23 & 2048) != 0 ? 0 : i7, (i23 & 4096) != 0 ? 0 : i8, (i23 & 8192) != 0 ? null : list3, (i23 & 16384) != 0 ? null : bleMatchRecordTeam3, (i23 & 32768) == 0 ? bleWeather : null, (i23 & 65536) != 0 ? 0 : i9, (i23 & 131072) != 0 ? 0 : i10, (i23 & 262144) != 0 ? 0 : i11, (i23 & 524288) != 0 ? 0 : i12, (i23 & 1048576) != 0 ? 0 : i13, (i23 & 2097152) != 0 ? 0 : i14, (i23 & 4194304) != 0 ? 0 : i15, (i23 & 8388608) != 0 ? 0 : i16, (i23 & 16777216) != 0 ? 0 : i17, (i23 & 33554432) != 0 ? 0 : i18, (i23 & 67108864) != 0 ? 0 : i19, (i23 & 134217728) != 0 ? 0 : i20, (i23 & 268435456) != 0 ? 0 : i21, (i23 & 536870912) != 0 ? 0 : i22);
    }

    public MatchRecord(@aa1 BleMatchRecord bleMatchRecord, long j) {
        Intrinsics.X0O(bleMatchRecord, "bleMatchRecord");
        long mStart = (((long) (bleMatchRecord.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j;
        int mType = bleMatchRecord.getMType();
        int mPeriodListSize = bleMatchRecord.getMPeriodListSize();
        int mLogListSize = bleMatchRecord.getMLogListSize();
        MatchPeriod matchPeriod = new MatchPeriod(bleMatchRecord.getMPeriod(), j);
        List<BleMatchPeriod> mPeriodList = bleMatchRecord.getMPeriodList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mPeriodList, 10));
        Iterator<T> it = mPeriodList.iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchPeriod((BleMatchPeriod) it.next(), j));
        }
        List<BleMatchLog> mLogList = bleMatchRecord.getMLogList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mLogList, 10));
        Iterator<T> it2 = mLogList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new MatchLog((BleMatchLog) it2.next(), j));
        }
        this(0, mStart, null, mType, mPeriodListSize, mLogListSize, matchPeriod, 0, 0, arrayList, arrayList2, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073740165, null);
    }

    public MatchRecord(@aa1 BleMatchRecord2 bleMatchRecord, long j) {
        Intrinsics.X0O(bleMatchRecord, "bleMatchRecord");
        long mStart = (((long) (bleMatchRecord.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j;
        int mType = bleMatchRecord.getMType();
        int mPeriodListSize = bleMatchRecord.getMPeriodListSize();
        int mLogListSize = bleMatchRecord.getMLogListSize();
        MatchPeriod matchPeriod = new MatchPeriod(bleMatchRecord.getMPeriod(), j);
        List<BleMatchPeriod2> mPeriodList = bleMatchRecord.getMPeriodList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mPeriodList, 10));
        Iterator<T> it = mPeriodList.iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchPeriod((BleMatchPeriod2) it.next(), j));
        }
        List<BleMatchLog2> mLogList = bleMatchRecord.getMLogList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mLogList, 10));
        Iterator<T> it2 = mLogList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new MatchLog((BleMatchLog2) it2.next(), j));
        }
        this(0, mStart, null, mType, mPeriodListSize, mLogListSize, matchPeriod, 0, 0, arrayList, arrayList2, 1, bleMatchRecord.getMIsStopWatchData(), bleMatchRecord.getMStopWatchList(), new BleMatchRecordTeam3(bleMatchRecord.getMTeamInfo()), bleMatchRecord.getMWeather(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073676677, null);
        while (true) {
            int mCancelType = 255;
            for (MatchLog matchLog : CollectionsKt___CollectionsKt.IOOIXiI1(this.mLogList)) {
                if (matchLog.getMType() == 8) {
                    mCancelType = matchLog.getMCancelType();
                } else if (matchLog.getMType() != mCancelType) {
                    if (matchLog.getMType() == 6 && this.mHomeTeamScore == 0) {
                        this.mHomeTeamScore = matchLog.getMCount();
                    } else if (matchLog.getMType() == 7 && this.mGuestTeamScore == 0) {
                        this.mGuestTeamScore = matchLog.getMCount();
                    }
                }
            }
            return;
        }
    }

    public MatchRecord(@aa1 BleMatchRecord3 bleMatchRecord, long j) {
        Intrinsics.X0O(bleMatchRecord, "bleMatchRecord");
        long mStart = (((long) (bleMatchRecord.getMStart() + BleConstsKt.DATA_EPOCH)) * 1000) - j;
        int mType = bleMatchRecord.getMType();
        int mPeriodListSize = bleMatchRecord.getMPeriodListSize();
        int mLogListSize = bleMatchRecord.getMLogListSize();
        MatchPeriod matchPeriod = new MatchPeriod(bleMatchRecord.getMPeriod(), j);
        List<BleMatchPeriod2> mPeriodList = bleMatchRecord.getMPeriodList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mPeriodList, 10));
        Iterator<T> it = mPeriodList.iterator();
        while (it.hasNext()) {
            arrayList.add(new MatchPeriod((BleMatchPeriod2) it.next(), j));
        }
        List<BleMatchLog3> mLogList = bleMatchRecord.getMLogList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(mLogList, 10));
        Iterator<T> it2 = mLogList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new MatchLog((BleMatchLog3) it2.next(), j));
        }
        BleWeather bleWeather = new BleWeather(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        bleWeather.setMWeatherCode(bleMatchRecord.getMWeather().getMWeatherCode());
        bleWeather.setMCurrentTemperature(bleMatchRecord.getMWeather().getMCurrentTemperature());
        bleWeather.setMMaxTemperature(bleMatchRecord.getMWeather().getMMaxTemperature());
        bleWeather.setMMinTemperature(bleMatchRecord.getMWeather().getMMinTemperature());
        this(0, mStart, null, mType, mPeriodListSize, mLogListSize, matchPeriod, 0, 0, arrayList, arrayList2, 2, bleMatchRecord.getMIsStopWatchData(), bleMatchRecord.getMStopWatchList(), bleMatchRecord.getMTeamInfo(), bleWeather, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073676677, null);
        if (bleMatchRecord.getMType() == 6) {
            rugbyTotalScore();
        } else {
            normalTotalScore();
        }
    }
}
