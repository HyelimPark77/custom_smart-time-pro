package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleMatchRecord3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecord3.kt\ncom/szabh/smable3/entity/BleMatchRecord3\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,64:1\n222#2,4:65\n232#2,3:69\n222#2,15:72\n232#2,3:87\n222#2,15:90\n222#2,4:105\n222#2,4:109\n*S KotlinDebug\n*F\n+ 1 BleMatchRecord3.kt\ncom/szabh/smable3/entity/BleMatchRecord3\n*L\n31#1:65,4\n33#1:69,3\n33#1:72,15\n41#1:87,3\n41#1:90,15\n43#1:105,4\n44#1:109,4\n*E\n"})
public final class BleMatchRecord3 extends BleReadable {
    public static final int CLASSIC = 1;

    @aa1
    public static final Companion Companion = null;
    public static final int FIELD_HOCKEY = 5;
    public static final int FUTSAL = 4;
    public static final int ITEM_LENGTH = 3862;
    public static final int PROFILE = 2;
    public static final int RUGBY = 6;
    public static final int TRAINING = 3;
    public static final int YOUTH = 0;
    private int mIsStopWatchData;

    @aa1
    private List<BleMatchLog3> mLogList;
    private int mLogListSize;

    @aa1
    private BleMatchPeriod2 mPeriod;

    @aa1
    private List<BleMatchPeriod2> mPeriodList;
    private int mPeriodListSize;
    private int mStart;

    @aa1
    private List<Integer> mStopWatchList;

    @aa1
    private BleMatchRecordTeam3 mTeamInfo;
    private int mType;

    @aa1
    private BleWeather2 mWeather;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchRecord3() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        BleMatchPeriod2 r6 = null;
        List r7 = null;
        List r8 = null;
        List r9 = null;
        BleMatchRecordTeam3 r10 = null;
        BleWeather2 r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecord3 copy$default(BleMatchRecord3 r0, int r1, int r2, int r3, int r4, int r5, BleMatchPeriod2 r6, List r7, List r8, List r9, BleMatchRecordTeam3 r10, BleWeather2 r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mStart;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.mPeriodListSize;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.mLogListSize;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.mIsStopWatchData;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.mPeriod;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.mPeriodList;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.mLogList;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.mStopWatchList;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.mTeamInfo;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.mWeather;
    L35:
        BleMatchRecordTeam3 r14 = r10;
        BleWeather2 r15 = r11;
        List r16 = r8;
        List r17 = r9;
        BleMatchPeriod2 r18 = r6;
        List r19 = r7;
        int r20 = r4;
        int r21 = r5;
        int r22 = r3;
        int r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
    }

    public final int component1() {
        return this.mStart;
    }

    @aa1
    public final BleMatchRecordTeam3 component10() {
        return this.mTeamInfo;
    }

    @aa1
    public final BleWeather2 component11() {
        return this.mWeather;
    }

    public final int component2() {
        return this.mType;
    }

    public final int component3() {
        return this.mPeriodListSize;
    }

    public final int component4() {
        return this.mLogListSize;
    }

    public final int component5() {
        return this.mIsStopWatchData;
    }

    @aa1
    public final BleMatchPeriod2 component6() {
        return this.mPeriod;
    }

    @aa1
    public final List<BleMatchPeriod2> component7() {
        return this.mPeriodList;
    }

    @aa1
    public final List<BleMatchLog3> component8() {
        return this.mLogList;
    }

    @aa1
    public final List<Integer> component9() {
        return this.mStopWatchList;
    }

    @aa1
    public final BleMatchRecord3 copy(int r14, int r15, int r16, int r17, int r18, @aa1 BleMatchPeriod2 r19, @aa1 List<BleMatchPeriod2> r20, @aa1 List<BleMatchLog3> r21, @aa1 List<Integer> r22, @aa1 BleMatchRecordTeam3 r23, @aa1 BleWeather2 r24) {
        Intrinsics.X0O(r19, "mPeriod");
        Intrinsics.X0O(r20, "mPeriodList");
        Intrinsics.X0O(r21, "mLogList");
        Intrinsics.X0O(r22, "mStopWatchList");
        Intrinsics.X0O(r23, "mTeamInfo");
        Intrinsics.X0O(r24, "mWeather");
        return new BleMatchRecord3(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mStart = readInt32(r0);
        this.mType = readUInt8();
        this.mPeriodListSize = readUInt8();
        this.mLogListSize = readUInt8();
        this.mIsStopWatchData = readUInt8();
        BleReadable r2 = (BleReadable) BleMatchPeriod2.class.newInstance();
        r2.setMBytes(readBytes(14));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mPeriod = (BleMatchPeriod2) r2;
        ArrayList r3 = new ArrayList();
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= 9) goto L6;
        BleReadable r6 = (BleReadable) BleMatchPeriod2.class.newInstance();
        r6.setMBytes(readBytes(14));
        r6.decode();
        Intrinsics.XXI(r6);
        r3.add(r6);
        r5 = r5 + 1;
        goto L4
    L6:
        this.mPeriodList = CollectionsKt___CollectionsKt.IO0OOi(r3, this.mPeriodListSize);
        if (this.mIsStopWatchData != 1) goto L13;
        ArrayList r1 = new ArrayList();
    L10:
        if (r4 >= 297) goto L12;
        ByteOrder r7 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r7, "LITTLE_ENDIAN");
        r1.add(Integer.valueOf(readInt32(r7)));
        r4 = r4 + 1;
        goto L10
    L12:
        this.mStopWatchList = CollectionsKt___CollectionsKt.IO0OOi(r1, this.mLogListSize);
    L18:
        BleReadable r8 = (BleReadable) BleMatchRecordTeam3.class.newInstance();
        r8.setMBytes(readBytes(BleMatchRecordTeam3.ITEM_LENGTH));
        r8.decode();
        Intrinsics.XXI(r8);
        this.mTeamInfo = (BleMatchRecordTeam3) r8;
        BleReadable r9 = (BleReadable) BleWeather2.class.newInstance();
        r9.setMBytes(readBytes(20));
        r9.decode();
        Intrinsics.XXI(r9);
        this.mWeather = (BleWeather2) r9;
        BleReadable.readInt16$default(this, null, 1, null);
        return;
    L13:
        ArrayList r10 = new ArrayList();
    L15:
        if (r4 >= 99) goto L17;
        BleReadable r11 = (BleReadable) BleMatchLog3.class.newInstance();
        r11.setMBytes(readBytes(16));
        r11.decode();
        Intrinsics.XXI(r11);
        r10.add(r11);
        r4 = r4 + 1;
        goto L15
    L17:
        this.mLogList = CollectionsKt___CollectionsKt.IO0OOi(r10, this.mLogListSize);
        goto L18
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchRecord3) == true) goto L8;
        return false;
    L8:
        BleMatchRecord3 r6 = (BleMatchRecord3) r5;
        if (this.mStart == r6.mStart) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L15;
        return false;
    L15:
        if (this.mPeriodListSize == r6.mPeriodListSize) goto L18;
        return false;
    L18:
        if (this.mLogListSize == r6.mLogListSize) goto L21;
        return false;
    L21:
        if (this.mIsStopWatchData == r6.mIsStopWatchData) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mPeriod, r6.mPeriod) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mPeriodList, r6.mPeriodList) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mLogList, r6.mLogList) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mStopWatchList, r6.mStopWatchList) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mTeamInfo, r6.mTeamInfo) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mWeather, r6.mWeather) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final int getMIsStopWatchData() {
        return this.mIsStopWatchData;
    }

    @aa1
    public final List<BleMatchLog3> getMLogList() {
        return this.mLogList;
    }

    public final int getMLogListSize() {
        return this.mLogListSize;
    }

    @aa1
    public final BleMatchPeriod2 getMPeriod() {
        return this.mPeriod;
    }

    @aa1
    public final List<BleMatchPeriod2> getMPeriodList() {
        return this.mPeriodList;
    }

    public final int getMPeriodListSize() {
        return this.mPeriodListSize;
    }

    public final int getMStart() {
        return this.mStart;
    }

    @aa1
    public final List<Integer> getMStopWatchList() {
        return this.mStopWatchList;
    }

    @aa1
    public final BleMatchRecordTeam3 getMTeamInfo() {
        return this.mTeamInfo;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final BleWeather2 getMWeather() {
        return this.mWeather;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mPeriodListSize)) * 31) + Integer.hashCode(this.mLogListSize)) * 31) + Integer.hashCode(this.mIsStopWatchData)) * 31) + this.mPeriod.hashCode()) * 31) + this.mPeriodList.hashCode()) * 31) + this.mLogList.hashCode()) * 31) + this.mStopWatchList.hashCode()) * 31) + this.mTeamInfo.hashCode()) * 31) + this.mWeather.hashCode();
    }

    public final void setMIsStopWatchData(int r1) {
        this.mIsStopWatchData = r1;
    }

    public final void setMLogList(@aa1 List<BleMatchLog3> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLogList = r2;
    }

    public final void setMLogListSize(int r1) {
        this.mLogListSize = r1;
    }

    public final void setMPeriod(@aa1 BleMatchPeriod2 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriod = r2;
    }

    public final void setMPeriodList(@aa1 List<BleMatchPeriod2> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriodList = r2;
    }

    public final void setMPeriodListSize(int r1) {
        this.mPeriodListSize = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    public final void setMStopWatchList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mStopWatchList = r2;
    }

    public final void setMTeamInfo(@aa1 BleMatchRecordTeam3 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTeamInfo = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMWeather(@aa1 BleWeather2 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWeather = r2;
    }

    @aa1
    public String toString() {
        return "BleMatchRecord3(mStart=" + this.mStart + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mIsStopWatchData=" + this.mIsStopWatchData + ", mPeriod=" + this.mPeriod + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + ", mStopWatchList=" + this.mStopWatchList + ", mTeamInfo=" + this.mTeamInfo + ", mWeather=" + this.mWeather + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecord3(int r2, int r3, int r4, int r5, int r6, @aa1 BleMatchPeriod2 r7, @aa1 List<BleMatchPeriod2> r8, @aa1 List<BleMatchLog3> r9, @aa1 List<Integer> r10, @aa1 BleMatchRecordTeam3 r11, @aa1 BleWeather2 r12) {
        Intrinsics.X0O(r7, "mPeriod");
        Intrinsics.X0O(r8, "mPeriodList");
        Intrinsics.X0O(r9, "mLogList");
        Intrinsics.X0O(r10, "mStopWatchList");
        Intrinsics.X0O(r11, "mTeamInfo");
        Intrinsics.X0O(r12, "mWeather");
        this.mStart = r2;
        this.mType = r3;
        this.mPeriodListSize = r4;
        this.mLogListSize = r5;
        this.mIsStopWatchData = r6;
        this.mPeriod = r7;
        this.mPeriodList = r8;
        this.mLogList = r9;
        this.mStopWatchList = r10;
        this.mTeamInfo = r11;
        this.mWeather = r12;
    }

    public /* synthetic */ BleMatchRecord3(int r33, int r34, int r35, int r36, int r37, BleMatchPeriod2 r38, List r39, List r40, List r41, BleMatchRecordTeam3 r42, BleWeather2 r43, int r44, DefaultConstructorMarker r45) {
        int r2 = 0;
        if ((r44 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r44 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r44 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r44 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r44 & 16) != 0) goto L23;
        r2 = r37;
    L23:
        if ((r44 & 32) == 0) goto L25;
        BleMatchPeriod2 r7 = new BleMatchPeriod2(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    L27:
        if ((r44 & 64) == 0) goto L29;
        List r6 = new ArrayList();
    L31:
        if ((r44 & 128) == 0) goto L33;
        List r8 = new ArrayList();
    L35:
        if ((r44 & 256) == 0) goto L37;
        List r9 = new ArrayList();
    L39:
        if ((r44 & 512) == 0) goto L41;
        BleMatchRecordTeam3 r11 = new BleMatchRecordTeam3(null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 65535, null);
    L43:
        if ((r44 & 1024) == 0) goto L46;
        BleWeather2 r46 = new BleWeather2(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 131071, null);
    L47:
        this(r1, r3, r4, r5, r2, r7, r6, r8, r9, r11, r46);
        return;
    L46:
        r46 = r43;
        goto L47
    L41:
        r11 = r42;
        goto L43
    L37:
        r9 = r41;
        goto L39
    L33:
        r8 = r40;
        goto L35
    L29:
        r6 = r39;
        goto L31
    L25:
        r7 = r38;
        goto L27
    L17:
        r5 = r36;
        goto L19
    L13:
        r4 = r35;
        goto L15
    L9:
        r3 = r34;
        goto L11
    L5:
        r1 = r33;
        goto L7
    }
}
