package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.O1OOiOO1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleAICoachBeforePlanV2\n*L\n41#1:328,4\n*E\n"})
public final class BleAICoachBeforePlanV2 extends BleReadable {
    public static final int AI_COACH_PLAN_TRAINING = 4;
    public static final int CHECKSUM_LENGTH = 128;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int DELETE_AI_COACH_PLAN = 3;
    public static final int GET_AI_COACH_PLAN = 1;
    public static final int GET_AI_COACH_PLAN_SUM = 0;
    public static final int LEAVE_AI_COACH_PLAN = 2;
    private int mCoachType;

    @aa1
    private String mCurrentChecksum;

    @aa1
    private String mLastChecksum;
    private long mPlanStartTime;

    @aa1
    private List<Integer> mPlanTime;
    private int mPlanWeekNum;
    private int mSource;
    private int mVo2Max;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleAICoachBeforePlanV2() {
        this(null, null, 0, 0, 0, null, 0, 0L, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAICoachBeforePlanV2 copy$default(BleAICoachBeforePlanV2 bleAICoachBeforePlanV2, String str, String str2, int i, int i2, int i3, List list, int i4, long j, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = bleAICoachBeforePlanV2.mCurrentChecksum;
        }
        if ((i5 & 2) != 0) {
            str2 = bleAICoachBeforePlanV2.mLastChecksum;
        }
        if ((i5 & 4) != 0) {
            i = bleAICoachBeforePlanV2.mSource;
        }
        if ((i5 & 8) != 0) {
            i2 = bleAICoachBeforePlanV2.mCoachType;
        }
        if ((i5 & 16) != 0) {
            i3 = bleAICoachBeforePlanV2.mVo2Max;
        }
        if ((i5 & 32) != 0) {
            list = bleAICoachBeforePlanV2.mPlanTime;
        }
        if ((i5 & 64) != 0) {
            i4 = bleAICoachBeforePlanV2.mPlanWeekNum;
        }
        if ((i5 & 128) != 0) {
            j = bleAICoachBeforePlanV2.mPlanStartTime;
        }
        long j2 = j;
        List list2 = list;
        int i6 = i4;
        int i7 = i3;
        int i8 = i;
        return bleAICoachBeforePlanV2.copy(str, str2, i8, i2, i7, list2, i6, j2);
    }

    @aa1
    public final String component1() {
        return this.mCurrentChecksum;
    }

    @aa1
    public final String component2() {
        return this.mLastChecksum;
    }

    public final int component3() {
        return this.mSource;
    }

    public final int component4() {
        return this.mCoachType;
    }

    public final int component5() {
        return this.mVo2Max;
    }

    @aa1
    public final List<Integer> component6() {
        return this.mPlanTime;
    }

    public final int component7() {
        return this.mPlanWeekNum;
    }

    public final long component8() {
        return this.mPlanStartTime;
    }

    @aa1
    public final BleAICoachBeforePlanV2 copy(@aa1 String mCurrentChecksum, @aa1 String mLastChecksum, int i, int i2, int i3, @aa1 List<Integer> mPlanTime, int i4, long j) {
        Intrinsics.X0O(mCurrentChecksum, "mCurrentChecksum");
        Intrinsics.X0O(mLastChecksum, "mLastChecksum");
        Intrinsics.X0O(mPlanTime, "mPlanTime");
        return new BleAICoachBeforePlanV2(mCurrentChecksum, mLastChecksum, i, i2, i3, mPlanTime, i4, j);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCurrentChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        this.mLastChecksum = BleReadable.readString$default(this, 128, null, 2, null);
        this.mSource = readInt8();
        this.mCoachType = readInt8();
        this.mVo2Max = readInt8();
        this.mPlanTime.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            arrayList.add(Integer.valueOf(readIntN(1)));
        }
        O1OOiOO1i.I11X11OX(arrayList);
        this.mPlanTime.addAll(arrayList);
        this.mPlanWeekNum = readInt8();
        BleTime.Companion companion = BleTime.Companion;
        BleReadable bleReadable = (BleReadable) BleTime.class.newInstance();
        bleReadable.setMBytes(readBytes(6));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mPlanStartTime = companion.timeInMillis((BleTime) bleReadable);
        readBytes(8);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICoachBeforePlanV2)) {
            return false;
        }
        BleAICoachBeforePlanV2 bleAICoachBeforePlanV2 = (BleAICoachBeforePlanV2) obj;
        return Intrinsics.XOO0ii0(this.mCurrentChecksum, bleAICoachBeforePlanV2.mCurrentChecksum) && Intrinsics.XOO0ii0(this.mLastChecksum, bleAICoachBeforePlanV2.mLastChecksum) && this.mSource == bleAICoachBeforePlanV2.mSource && this.mCoachType == bleAICoachBeforePlanV2.mCoachType && this.mVo2Max == bleAICoachBeforePlanV2.mVo2Max && Intrinsics.XOO0ii0(this.mPlanTime, bleAICoachBeforePlanV2.mPlanTime) && this.mPlanWeekNum == bleAICoachBeforePlanV2.mPlanWeekNum && this.mPlanStartTime == bleAICoachBeforePlanV2.mPlanStartTime;
    }

    public final int getMCoachType() {
        return this.mCoachType;
    }

    @aa1
    public final String getMCurrentChecksum() {
        return this.mCurrentChecksum;
    }

    @aa1
    public final String getMLastChecksum() {
        return this.mLastChecksum;
    }

    public final long getMPlanStartTime() {
        return this.mPlanStartTime;
    }

    @aa1
    public final List<Integer> getMPlanTime() {
        return this.mPlanTime;
    }

    public final int getMPlanWeekNum() {
        return this.mPlanWeekNum;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final int getMVo2Max() {
        return this.mVo2Max;
    }

    public int hashCode() {
        return (((((((((((((this.mCurrentChecksum.hashCode() * 31) + this.mLastChecksum.hashCode()) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mCoachType)) * 31) + Integer.hashCode(this.mVo2Max)) * 31) + this.mPlanTime.hashCode()) * 31) + Integer.hashCode(this.mPlanWeekNum)) * 31) + Long.hashCode(this.mPlanStartTime);
    }

    public final void setMCoachType(int i) {
        this.mCoachType = i;
    }

    public final void setMCurrentChecksum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCurrentChecksum = str;
    }

    public final void setMLastChecksum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLastChecksum = str;
    }

    public final void setMPlanStartTime(long j) {
        this.mPlanStartTime = j;
    }

    public final void setMPlanTime(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPlanTime = list;
    }

    public final void setMPlanWeekNum(int i) {
        this.mPlanWeekNum = i;
    }

    public final void setMSource(int i) {
        this.mSource = i;
    }

    public final void setMVo2Max(int i) {
        this.mVo2Max = i;
    }

    @aa1
    public String toString() {
        return "BleAICoachPlan(mCurrentChecksum=" + this.mCurrentChecksum + ", mLastChecksum=" + this.mLastChecksum + " , mSource = " + this.mSource + " , mCoachType = " + this.mCoachType + ", mVo2Max = " + this.mVo2Max + " , mPlanTime = " + this.mPlanTime + " , mPlanWeekNum = " + this.mPlanWeekNum + " , mPlanStartTime = " + this.mPlanStartTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICoachBeforePlanV2(@aa1 String mCurrentChecksum, @aa1 String mLastChecksum, int i, int i2, int i3, @aa1 List<Integer> mPlanTime, int i4, long j) {
        Intrinsics.X0O(mCurrentChecksum, "mCurrentChecksum");
        Intrinsics.X0O(mLastChecksum, "mLastChecksum");
        Intrinsics.X0O(mPlanTime, "mPlanTime");
        this.mCurrentChecksum = mCurrentChecksum;
        this.mLastChecksum = mLastChecksum;
        this.mSource = i;
        this.mCoachType = i2;
        this.mVo2Max = i3;
        this.mPlanTime = mPlanTime;
        this.mPlanWeekNum = i4;
        this.mPlanStartTime = j;
    }

    public /* synthetic */ BleAICoachBeforePlanV2(String str, String str2, int i, int i2, int i3, List list, int i4, long j, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "-999" : str2, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? new ArrayList() : list, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? 0L : j);
    }
}
