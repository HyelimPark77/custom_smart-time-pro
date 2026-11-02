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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchRecord3() {
        this(0, 0, 0, 0, 0, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecord3 copy$default(BleMatchRecord3 bleMatchRecord3, int i, int i2, int i3, int i4, int i5, BleMatchPeriod2 bleMatchPeriod2, List list, List list2, List list3, BleMatchRecordTeam3 bleMatchRecordTeam3, BleWeather2 bleWeather2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleMatchRecord3.mStart;
        }
        if ((i6 & 2) != 0) {
            i2 = bleMatchRecord3.mType;
        }
        if ((i6 & 4) != 0) {
            i3 = bleMatchRecord3.mPeriodListSize;
        }
        if ((i6 & 8) != 0) {
            i4 = bleMatchRecord3.mLogListSize;
        }
        if ((i6 & 16) != 0) {
            i5 = bleMatchRecord3.mIsStopWatchData;
        }
        if ((i6 & 32) != 0) {
            bleMatchPeriod2 = bleMatchRecord3.mPeriod;
        }
        if ((i6 & 64) != 0) {
            list = bleMatchRecord3.mPeriodList;
        }
        if ((i6 & 128) != 0) {
            list2 = bleMatchRecord3.mLogList;
        }
        if ((i6 & 256) != 0) {
            list3 = bleMatchRecord3.mStopWatchList;
        }
        if ((i6 & 512) != 0) {
            bleMatchRecordTeam3 = bleMatchRecord3.mTeamInfo;
        }
        if ((i6 & 1024) != 0) {
            bleWeather2 = bleMatchRecord3.mWeather;
        }
        BleMatchRecordTeam3 bleMatchRecordTeam4 = bleMatchRecordTeam3;
        BleWeather2 bleWeather3 = bleWeather2;
        List list4 = list2;
        List list5 = list3;
        BleMatchPeriod2 bleMatchPeriod3 = bleMatchPeriod2;
        List list6 = list;
        int i7 = i5;
        int i8 = i3;
        return bleMatchRecord3.copy(i, i2, i8, i4, i7, bleMatchPeriod3, list6, list4, list5, bleMatchRecordTeam4, bleWeather3);
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
    public final BleMatchRecord3 copy(int i, int i2, int i3, int i4, int i5, @aa1 BleMatchPeriod2 mPeriod, @aa1 List<BleMatchPeriod2> mPeriodList, @aa1 List<BleMatchLog3> mLogList, @aa1 List<Integer> mStopWatchList, @aa1 BleMatchRecordTeam3 mTeamInfo, @aa1 BleWeather2 mWeather) {
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        Intrinsics.X0O(mStopWatchList, "mStopWatchList");
        Intrinsics.X0O(mTeamInfo, "mTeamInfo");
        Intrinsics.X0O(mWeather, "mWeather");
        return new BleMatchRecord3(i, i2, i3, i4, i5, mPeriod, mPeriodList, mLogList, mStopWatchList, mTeamInfo, mWeather);
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
                BleReadable bleReadable3 = (BleReadable) BleMatchLog3.class.newInstance();
                bleReadable3.setMBytes(readBytes(16));
                bleReadable3.decode();
                Intrinsics.XXI(bleReadable3);
                arrayList3.add(bleReadable3);
                i++;
            }
            this.mLogList = CollectionsKt___CollectionsKt.IO0OOi(arrayList3, this.mLogListSize);
        }
        BleReadable bleReadable4 = (BleReadable) BleMatchRecordTeam3.class.newInstance();
        bleReadable4.setMBytes(readBytes(BleMatchRecordTeam3.ITEM_LENGTH));
        bleReadable4.decode();
        Intrinsics.XXI(bleReadable4);
        this.mTeamInfo = (BleMatchRecordTeam3) bleReadable4;
        BleReadable bleReadable5 = (BleReadable) BleWeather2.class.newInstance();
        bleReadable5.setMBytes(readBytes(20));
        bleReadable5.decode();
        Intrinsics.XXI(bleReadable5);
        this.mWeather = (BleWeather2) bleReadable5;
        BleReadable.readInt16$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRecord3)) {
            return false;
        }
        BleMatchRecord3 bleMatchRecord3 = (BleMatchRecord3) obj;
        return this.mStart == bleMatchRecord3.mStart && this.mType == bleMatchRecord3.mType && this.mPeriodListSize == bleMatchRecord3.mPeriodListSize && this.mLogListSize == bleMatchRecord3.mLogListSize && this.mIsStopWatchData == bleMatchRecord3.mIsStopWatchData && Intrinsics.XOO0ii0(this.mPeriod, bleMatchRecord3.mPeriod) && Intrinsics.XOO0ii0(this.mPeriodList, bleMatchRecord3.mPeriodList) && Intrinsics.XOO0ii0(this.mLogList, bleMatchRecord3.mLogList) && Intrinsics.XOO0ii0(this.mStopWatchList, bleMatchRecord3.mStopWatchList) && Intrinsics.XOO0ii0(this.mTeamInfo, bleMatchRecord3.mTeamInfo) && Intrinsics.XOO0ii0(this.mWeather, bleMatchRecord3.mWeather);
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

    public final void setMIsStopWatchData(int i) {
        this.mIsStopWatchData = i;
    }

    public final void setMLogList(@aa1 List<BleMatchLog3> list) {
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

    public final void setMTeamInfo(@aa1 BleMatchRecordTeam3 bleMatchRecordTeam3) {
        Intrinsics.X0O(bleMatchRecordTeam3, "<set-?>");
        this.mTeamInfo = bleMatchRecordTeam3;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMWeather(@aa1 BleWeather2 bleWeather2) {
        Intrinsics.X0O(bleWeather2, "<set-?>");
        this.mWeather = bleWeather2;
    }

    @aa1
    public String toString() {
        return "BleMatchRecord3(mStart=" + this.mStart + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mIsStopWatchData=" + this.mIsStopWatchData + ", mPeriod=" + this.mPeriod + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + ", mStopWatchList=" + this.mStopWatchList + ", mTeamInfo=" + this.mTeamInfo + ", mWeather=" + this.mWeather + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecord3(int i, int i2, int i3, int i4, int i5, @aa1 BleMatchPeriod2 mPeriod, @aa1 List<BleMatchPeriod2> mPeriodList, @aa1 List<BleMatchLog3> mLogList, @aa1 List<Integer> mStopWatchList, @aa1 BleMatchRecordTeam3 mTeamInfo, @aa1 BleWeather2 mWeather) {
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

    public /* synthetic */ BleMatchRecord3(int i, int i2, int i3, int i4, int i5, BleMatchPeriod2 bleMatchPeriod2, List list, List list2, List list3, BleMatchRecordTeam3 bleMatchRecordTeam3, BleWeather2 bleWeather2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) == 0 ? i5 : 0, (i6 & 32) != 0 ? new BleMatchPeriod2(0, 0, 0, 0, 0, 0, 0, 0, 255, null) : bleMatchPeriod2, (i6 & 64) != 0 ? new ArrayList() : list, (i6 & 128) != 0 ? new ArrayList() : list2, (i6 & 256) != 0 ? new ArrayList() : list3, (i6 & 512) != 0 ? new BleMatchRecordTeam3(null, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 65535, null) : bleMatchRecordTeam3, (i6 & 1024) != 0 ? new BleWeather2(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 131071, null) : bleWeather2);
    }
}
