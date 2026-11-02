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
@SourceDebugExtension({"SMAP\nBleMatchRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMatchRecord.kt\ncom/szabh/smable3/entity/BleMatchRecord\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,42:1\n222#2,4:43\n232#2,3:47\n222#2,15:50\n232#2,3:65\n222#2,15:68\n*S KotlinDebug\n*F\n+ 1 BleMatchRecord.kt\ncom/szabh/smable3/entity/BleMatchRecord\n*L\n27#1:43,4\n28#1:47,3\n28#1:50,15\n29#1:65,3\n29#1:68,15\n*E\n"})
public final class BleMatchRecord extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 920;
    public static final int PROFILE1 = 1;
    public static final int PROFILE2 = 2;
    public static final int TRAINING = 3;
    public static final int YOUTH = 0;

    @aa1
    private List<BleMatchLog> mLogList;
    private int mLogListSize;

    @aa1
    private BleMatchPeriod mPeriod;

    @aa1
    private List<BleMatchPeriod> mPeriodList;
    private int mPeriodListSize;
    private int mStart;
    private int mType;
    private int mUndefined;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleMatchRecord() {
        this(0, 0, 0, 0, 0, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecord copy$default(BleMatchRecord bleMatchRecord, int i, int i2, int i3, int i4, int i5, BleMatchPeriod bleMatchPeriod, List list, List list2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleMatchRecord.mStart;
        }
        if ((i6 & 2) != 0) {
            i2 = bleMatchRecord.mType;
        }
        if ((i6 & 4) != 0) {
            i3 = bleMatchRecord.mPeriodListSize;
        }
        if ((i6 & 8) != 0) {
            i4 = bleMatchRecord.mLogListSize;
        }
        if ((i6 & 16) != 0) {
            i5 = bleMatchRecord.mUndefined;
        }
        if ((i6 & 32) != 0) {
            bleMatchPeriod = bleMatchRecord.mPeriod;
        }
        if ((i6 & 64) != 0) {
            list = bleMatchRecord.mPeriodList;
        }
        if ((i6 & 128) != 0) {
            list2 = bleMatchRecord.mLogList;
        }
        List list3 = list;
        List list4 = list2;
        int i7 = i5;
        BleMatchPeriod bleMatchPeriod2 = bleMatchPeriod;
        return bleMatchRecord.copy(i, i2, i3, i4, i7, bleMatchPeriod2, list3, list4);
    }

    public final int component1() {
        return this.mStart;
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
        return this.mUndefined;
    }

    @aa1
    public final BleMatchPeriod component6() {
        return this.mPeriod;
    }

    @aa1
    public final List<BleMatchPeriod> component7() {
        return this.mPeriodList;
    }

    @aa1
    public final List<BleMatchLog> component8() {
        return this.mLogList;
    }

    @aa1
    public final BleMatchRecord copy(int i, int i2, int i3, int i4, int i5, @aa1 BleMatchPeriod mPeriod, @aa1 List<BleMatchPeriod> mPeriodList, @aa1 List<BleMatchLog> mLogList) {
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        return new BleMatchRecord(i, i2, i3, i4, i5, mPeriod, mPeriodList, mLogList);
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
        this.mUndefined = readUInt8();
        BleReadable bleReadable = (BleReadable) BleMatchPeriod.class.newInstance();
        bleReadable.setMBytes(readBytes(12));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mPeriod = (BleMatchPeriod) bleReadable;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            BleReadable bleReadable2 = (BleReadable) BleMatchPeriod.class.newInstance();
            bleReadable2.setMBytes(readBytes(12));
            bleReadable2.decode();
            Intrinsics.XXI(bleReadable2);
            arrayList.add(bleReadable2);
        }
        this.mPeriodList = CollectionsKt___CollectionsKt.IO0OOi(arrayList, this.mPeriodListSize);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 99; i2++) {
            BleReadable bleReadable3 = (BleReadable) BleMatchLog.class.newInstance();
            bleReadable3.setMBytes(readBytes(8));
            bleReadable3.decode();
            Intrinsics.XXI(bleReadable3);
            arrayList2.add(bleReadable3);
        }
        this.mLogList = CollectionsKt___CollectionsKt.IO0OOi(arrayList2, this.mLogListSize);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRecord)) {
            return false;
        }
        BleMatchRecord bleMatchRecord = (BleMatchRecord) obj;
        return this.mStart == bleMatchRecord.mStart && this.mType == bleMatchRecord.mType && this.mPeriodListSize == bleMatchRecord.mPeriodListSize && this.mLogListSize == bleMatchRecord.mLogListSize && this.mUndefined == bleMatchRecord.mUndefined && Intrinsics.XOO0ii0(this.mPeriod, bleMatchRecord.mPeriod) && Intrinsics.XOO0ii0(this.mPeriodList, bleMatchRecord.mPeriodList) && Intrinsics.XOO0ii0(this.mLogList, bleMatchRecord.mLogList);
    }

    @aa1
    public final List<BleMatchLog> getMLogList() {
        return this.mLogList;
    }

    public final int getMLogListSize() {
        return this.mLogListSize;
    }

    @aa1
    public final BleMatchPeriod getMPeriod() {
        return this.mPeriod;
    }

    @aa1
    public final List<BleMatchPeriod> getMPeriodList() {
        return this.mPeriodList;
    }

    public final int getMPeriodListSize() {
        return this.mPeriodListSize;
    }

    public final int getMStart() {
        return this.mStart;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMUndefined() {
        return this.mUndefined;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.mStart) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mPeriodListSize)) * 31) + Integer.hashCode(this.mLogListSize)) * 31) + Integer.hashCode(this.mUndefined)) * 31) + this.mPeriod.hashCode()) * 31) + this.mPeriodList.hashCode()) * 31) + this.mLogList.hashCode();
    }

    public final void setMLogList(@aa1 List<BleMatchLog> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mLogList = list;
    }

    public final void setMLogListSize(int i) {
        this.mLogListSize = i;
    }

    public final void setMPeriod(@aa1 BleMatchPeriod bleMatchPeriod) {
        Intrinsics.X0O(bleMatchPeriod, "<set-?>");
        this.mPeriod = bleMatchPeriod;
    }

    public final void setMPeriodList(@aa1 List<BleMatchPeriod> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPeriodList = list;
    }

    public final void setMPeriodListSize(int i) {
        this.mPeriodListSize = i;
    }

    public final void setMStart(int i) {
        this.mStart = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMUndefined(int i) {
        this.mUndefined = i;
    }

    @aa1
    public String toString() {
        return "BleMatchRecord(mStart=" + this.mStart + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mUndefined=" + this.mUndefined + ", mPeriod=" + this.mPeriod + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecord(int i, int i2, int i3, int i4, int i5, @aa1 BleMatchPeriod mPeriod, @aa1 List<BleMatchPeriod> mPeriodList, @aa1 List<BleMatchLog> mLogList) {
        Intrinsics.X0O(mPeriod, "mPeriod");
        Intrinsics.X0O(mPeriodList, "mPeriodList");
        Intrinsics.X0O(mLogList, "mLogList");
        this.mStart = i;
        this.mType = i2;
        this.mPeriodListSize = i3;
        this.mLogListSize = i4;
        this.mUndefined = i5;
        this.mPeriod = mPeriod;
        this.mPeriodList = mPeriodList;
        this.mLogList = mLogList;
    }

    public /* synthetic */ BleMatchRecord(int i, int i2, int i3, int i4, int i5, BleMatchPeriod bleMatchPeriod, List list, List list2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) == 0 ? i5 : 0, (i6 & 32) != 0 ? new BleMatchPeriod(0, 0, 0, 0, 0, 0, 0, 127, null) : bleMatchPeriod, (i6 & 64) != 0 ? new ArrayList() : list, (i6 & 128) != 0 ? new ArrayList() : list2);
    }
}
