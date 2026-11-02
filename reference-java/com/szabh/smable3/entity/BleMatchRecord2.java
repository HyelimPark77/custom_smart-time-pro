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
@SourceDebugExtension({"SMAP\nBleMatchRecord2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecord2.kt\ncom/szabh/smable3/entity/BleMatchRecord2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,55:1\n222#2,4:56\n232#2,3:60\n222#2,15:63\n232#2,3:78\n222#2,15:81\n222#2,4:96\n222#2,4:100\n*S KotlinDebug\n*F\n+ 1 BleMatchRecord2.kt\ncom/szabh/smable3/entity/BleMatchRecord2\n*L\n30#1:56,4\n31#1:60,3\n31#1:63,15\n39#1:78,3\n39#1:81,15\n41#1:96,4\n42#1:100,4\n*E\n"})
public final class BleMatchRecord2 extends BleReadable {
    public static final int CLASSIC = 1;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 3256;
    public static final int PROFILE = 2;
    public static final int TRAINING = 3;
    public static final int YOUTH = 0;
    private int mIsStopWatchData;

    @aa1
    private List<BleMatchLog2> mLogList;
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
    private BleMatchRecordTeam mTeamInfo;
    private int mType;

    @aa1
    private BleWeather mWeather;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchRecord2() {
        this(0, 0, 0, 0, 0, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecord2 copy$default(BleMatchRecord2 bleMatchRecord2, int i, int i2, int i3, int i4, int i5, BleMatchPeriod2 bleMatchPeriod2, List list, List list2, List list3, BleMatchRecordTeam bleMatchRecordTeam, BleWeather bleWeather, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleMatchRecord2.mStart;
        }
        if ((i6 & 2) != 0) {
            i2 = bleMatchRecord2.mType;
        }
        if ((i6 & 4) != 0) {
            i3 = bleMatchRecord2.mPeriodListSize;
        }
        if ((i6 & 8) != 0) {
            i4 = bleMatchRecord2.mLogListSize;
        }
        if ((i6 & 16) != 0) {
            i5 = bleMatchRecord2.mIsStopWatchData;
        }
        if ((i6 & 32) != 0) {
            bleMatchPeriod2 = bleMatchRecord2.mPeriod;
        }
        if ((i6 & 64) != 0) {
            list = bleMatchRecord2.mPeriodList;
        }
        if ((i6 & 128) != 0) {
            list2 = bleMatchRecord2.mLogList;
        }
        if ((i6 & 256) != 0) {
            list3 = bleMatchRecord2.mStopWatchList;
        }
        if ((i6 & 512) != 0) {
            bleMatchRecordTeam = bleMatchRecord2.mTeamInfo;
        }
        if ((i6 & 1024) != 0) {
            bleWeather = bleMatchRecord2.mWeather;
        }
        BleMatchRecordTeam bleMatchRecordTeam2 = bleMatchRecordTeam;
        BleWeather bleWeather2 = bleWeather;
        List list4 = list2;
        List list5 = list3;
        BleMatchPeriod2 bleMatchPeriod3 = bleMatchPeriod2;
        List list6 = list;
        int i7 = i5;
        int i8 = i3;
        return bleMatchRecord2.copy(i, i2, i8, i4, i7, bleMatchPeriod3, list6, list4, list5, bleMatchRecordTeam2, bleWeather2);
    }

    public final int component1() {
        return this.mStart;
    }

    @aa1
    public final BleMatchRecordTeam component10() {
        return this.mTeamInfo;
    }

    @aa1
    public final BleWeather component11() {
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
    public final List<BleMatchLog2> component8() {
        return this.mLogList;
    }

    @aa1
    public final List<Integer> component9() {
        return this.mStopWatchList;
    }

    @aa1
    public final BleMatchRecord2 copy(int i, int i2, int i3, int i4, int i5, @aa1 BleMatchPeriod2 mPeriod, @aa1 List<BleMatchPeriod2> mPeriodList, @aa1 List<BleMatchLog2> mLogList, @aa1 List<Integer> mStopWatchList, @aa1 BleMatchRecordTeam mTeamInfo, @aa1 BleWeather mWeather) {
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        Intrinsics.X0O(mStopWatchList, "mStopWatchList");
        Intrinsics.X0O(mTeamInfo, "mTeamInfo");
        Intrinsics.X0O(mWeather, "mWeather");
        return new BleMatchRecord2(i, i2, i3, i4, i5, mPeriod, mPeriodList, mLogList, mStopWatchList, mTeamInfo, mWeather);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mStart = readInt32(LITTLE_ENDIAN);
        this.mType = readUInt8();
        this.mPeriodListSize = readUInt8();
        this.mLogListSize = readUInt8();
        this.mIsStopWatchData = readUInt8();
        BleReadable bleReadable = (BleReadable) BleMatchPeriod2.class.newInstance();
        bleReadable.setMBytes(readBytes(14));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mPeriod = (BleMatchPeriod2) bleReadable;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            BleReadable bleReadable2 = (BleReadable) BleMatchPeriod2.class.newInstance();
            bleReadable2.setMBytes(readBytes(14));
            bleReadable2.decode();
            Intrinsics.XXI(bleReadable2);
            arrayList.add(bleReadable2);
        }
        this.mPeriodList = CollectionsKt___CollectionsKt.IO0OOi(arrayList, this.mPeriodListSize);
        if (this.mIsStopWatchData == 1) {
            ArrayList arrayList2 = new ArrayList();
            while (i < 297) {
                ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                arrayList2.add(Integer.valueOf(readInt32(LITTLE_ENDIAN2)));
                i++;
            }
            this.mStopWatchList = CollectionsKt___CollectionsKt.IO0OOi(arrayList2, this.mLogListSize);
        } else {
            ArrayList arrayList3 = new ArrayList();
            while (i < 99) {
                BleReadable bleReadable3 = (BleReadable) BleMatchLog2.class.newInstance();
                bleReadable3.setMBytes(readBytes(12));
                bleReadable3.decode();
                Intrinsics.XXI(bleReadable3);
                arrayList3.add(bleReadable3);
                i++;
            }
            this.mLogList = CollectionsKt___CollectionsKt.IO0OOi(arrayList3, this.mLogListSize);
        }
        BleReadable bleReadable4 = (BleReadable) BleMatchRecordTeam.class.newInstance();
        bleReadable4.setMBytes(readBytes(BleMatchRecordTeam.ITEM_LENGTH));
        bleReadable4.decode();
        Intrinsics.XXI(bleReadable4);
        this.mTeamInfo = (BleMatchRecordTeam) bleReadable4;
        BleReadable bleReadable5 = (BleReadable) BleWeather.class.newInstance();
        bleReadable5.setMBytes(readBytes(10));
        bleReadable5.decode();
        Intrinsics.XXI(bleReadable5);
        this.mWeather = (BleWeather) bleReadable5;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRecord2)) {
            return false;
        }
        BleMatchRecord2 bleMatchRecord2 = (BleMatchRecord2) obj;
        return this.mStart == bleMatchRecord2.mStart && this.mType == bleMatchRecord2.mType && this.mPeriodListSize == bleMatchRecord2.mPeriodListSize && this.mLogListSize == bleMatchRecord2.mLogListSize && this.mIsStopWatchData == bleMatchRecord2.mIsStopWatchData && Intrinsics.XOO0ii0(this.mPeriod, bleMatchRecord2.mPeriod) && Intrinsics.XOO0ii0(this.mPeriodList, bleMatchRecord2.mPeriodList) && Intrinsics.XOO0ii0(this.mLogList, bleMatchRecord2.mLogList) && Intrinsics.XOO0ii0(this.mStopWatchList, bleMatchRecord2.mStopWatchList) && Intrinsics.XOO0ii0(this.mTeamInfo, bleMatchRecord2.mTeamInfo) && Intrinsics.XOO0ii0(this.mWeather, bleMatchRecord2.mWeather);
    }

    public final int getMIsStopWatchData() {
        return this.mIsStopWatchData;
    }

    @aa1
    public final List<BleMatchLog2> getMLogList() {
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
    public final BleMatchRecordTeam getMTeamInfo() {
        return this.mTeamInfo;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final BleWeather getMWeather() {
        return this.mWeather;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mPeriodListSize)) * 31) + Integer.hashCode(this.mLogListSize)) * 31) + Integer.hashCode(this.mIsStopWatchData)) * 31) + this.mPeriod.hashCode()) * 31) + this.mPeriodList.hashCode()) * 31) + this.mLogList.hashCode()) * 31) + this.mStopWatchList.hashCode()) * 31) + this.mTeamInfo.hashCode()) * 31) + this.mWeather.hashCode();
    }

    public final void setMIsStopWatchData(int i) {
        this.mIsStopWatchData = i;
    }

    public final void setMLogList(@aa1 List<BleMatchLog2> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLogList = list;
    }

    public final void setMLogListSize(int i) {
        this.mLogListSize = i;
    }

    public final void setMPeriod(@aa1 BleMatchPeriod2 bleMatchPeriod2) {
        Intrinsics.X0O(bleMatchPeriod2, "<set-?>");
        this.mPeriod = bleMatchPeriod2;
    }

    public final void setMPeriodList(@aa1 List<BleMatchPeriod2> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPeriodList = list;
    }

    public final void setMPeriodListSize(int i) {
        this.mPeriodListSize = i;
    }

    public final void setMStart(int i) {
        this.mStart = i;
    }

    public final void setMStopWatchList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mStopWatchList = list;
    }

    public final void setMTeamInfo(@aa1 BleMatchRecordTeam bleMatchRecordTeam) {
        Intrinsics.X0O(bleMatchRecordTeam, "<set-?>");
        this.mTeamInfo = bleMatchRecordTeam;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMWeather(@aa1 BleWeather bleWeather) {
        Intrinsics.X0O(bleWeather, "<set-?>");
        this.mWeather = bleWeather;
    }

    @aa1
    public String toString() {
        return "BleMatchRecord2(mStart=" + this.mStart + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mIsStopWatchData=" + this.mIsStopWatchData + ", mPeriod=" + this.mPeriod + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + ", mStopWatchList=" + this.mStopWatchList + ", mTeamInfo=" + this.mTeamInfo + ", mWeather=" + this.mWeather + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecord2(int i, int i2, int i3, int i4, int i5, @aa1 BleMatchPeriod2 mPeriod, @aa1 List<BleMatchPeriod2> mPeriodList, @aa1 List<BleMatchLog2> mLogList, @aa1 List<Integer> mStopWatchList, @aa1 BleMatchRecordTeam mTeamInfo, @aa1 BleWeather mWeather) {
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        Intrinsics.X0O(mStopWatchList, "mStopWatchList");
        Intrinsics.X0O(mTeamInfo, "mTeamInfo");
        Intrinsics.X0O(mWeather, "mWeather");
        this.mStart = i;
        this.mType = i2;
        this.mPeriodListSize = i3;
        this.mLogListSize = i4;
        this.mIsStopWatchData = i5;
        this.mPeriod = mPeriod;
        this.mPeriodList = mPeriodList;
        this.mLogList = mLogList;
        this.mStopWatchList = mStopWatchList;
        this.mTeamInfo = mTeamInfo;
        this.mWeather = mWeather;
    }

    public /* synthetic */ BleMatchRecord2(int i, int i2, int i3, int i4, int i5, BleMatchPeriod2 bleMatchPeriod2, List list, List list2, List list3, BleMatchRecordTeam bleMatchRecordTeam, BleWeather bleWeather, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) == 0 ? i5 : 0, (i6 & 32) != 0 ? new BleMatchPeriod2(0, 0, 0, 0, 0, 0, 0, 0, 255, null) : bleMatchPeriod2, (i6 & 64) != 0 ? new ArrayList() : list, (i6 & 128) != 0 ? new ArrayList() : list2, (i6 & 256) != 0 ? new ArrayList() : list3, (i6 & 512) != 0 ? new BleMatchRecordTeam(null, 0, 0, null, null, null, null, null, null, 511, null) : bleMatchRecordTeam, (i6 & 1024) != 0 ? new BleWeather(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null) : bleWeather);
    }
}
