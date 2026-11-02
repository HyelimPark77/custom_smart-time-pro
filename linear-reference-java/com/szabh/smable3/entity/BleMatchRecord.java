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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleMatchRecord() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        BleMatchPeriod r6 = null;
        List r7 = null;
        List r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchRecord copy$default(BleMatchRecord r0, int r1, int r2, int r3, int r4, int r5, BleMatchPeriod r6, List r7, List r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mStart;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.mPeriodListSize;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.mLogListSize;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.mUndefined;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.mPeriod;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.mPeriodList;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.mLogList;
    L26:
        List r11 = r7;
        List r12 = r8;
        int r13 = r5;
        BleMatchPeriod r14 = r6;
        int r15 = r3;
        int r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
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
    public final BleMatchRecord copy(int r11, int r12, int r13, int r14, int r15, @aa1 BleMatchPeriod r16, @aa1 List<BleMatchPeriod> r17, @aa1 List<BleMatchLog> r18) {
        Intrinsics.X0O(r16, "mPeriod");
        Intrinsics.X0O(r17, "mPeriodList");
        Intrinsics.X0O(r18, "mLogList");
        return new BleMatchRecord(r11, r12, r13, r14, r15, r16, r17, r18);
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
        this.mUndefined = readUInt8();
        BleReadable r1 = (BleReadable) BleMatchPeriod.class.newInstance();
        r1.setMBytes(readBytes(12));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mPeriod = (BleMatchPeriod) r1;
        ArrayList r2 = new ArrayList();
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r4 >= 9) goto L6;
        BleReadable r5 = (BleReadable) BleMatchPeriod.class.newInstance();
        r5.setMBytes(readBytes(12));
        r5.decode();
        Intrinsics.XXI(r5);
        r2.add(r5);
        r4 = r4 + 1;
        goto L4
    L6:
        this.mPeriodList = CollectionsKt___CollectionsKt.IO0OOi(r2, this.mPeriodListSize);
        ArrayList r6 = new ArrayList();
    L8:
        if (r3 >= 99) goto L10;
        BleReadable r7 = (BleReadable) BleMatchLog.class.newInstance();
        r7.setMBytes(readBytes(8));
        r7.decode();
        Intrinsics.XXI(r7);
        r6.add(r7);
        r3 = r3 + 1;
        goto L8
    L10:
        this.mLogList = CollectionsKt___CollectionsKt.IO0OOi(r6, this.mLogListSize);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleMatchRecord) == true) goto L8;
        return false;
    L8:
        BleMatchRecord r6 = (BleMatchRecord) r5;
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
        if (this.mUndefined == r6.mUndefined) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mPeriod, r6.mPeriod) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mPeriodList, r6.mPeriodList) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mLogList, r6.mLogList) == true) goto L32;
        return false;
    L32:
        return true;
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

    public final void setMLogList(@aa1 List<BleMatchLog> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLogList = r2;
    }

    public final void setMLogListSize(int r1) {
        this.mLogListSize = r1;
    }

    public final void setMPeriod(@aa1 BleMatchPeriod r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriod = r2;
    }

    public final void setMPeriodList(@aa1 List<BleMatchPeriod> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPeriodList = r2;
    }

    public final void setMPeriodListSize(int r1) {
        this.mPeriodListSize = r1;
    }

    public final void setMStart(int r1) {
        this.mStart = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUndefined(int r1) {
        this.mUndefined = r1;
    }

    @aa1
    public String toString() {
        return "BleMatchRecord(mStart=" + this.mStart + ", mType=" + this.mType + ", mPeriodListSize=" + this.mPeriodListSize + ", mLogListSize=" + this.mLogListSize + ", mUndefined=" + this.mUndefined + ", mPeriod=" + this.mPeriod + ", mPeriodList=" + this.mPeriodList + ", mLogList=" + this.mLogList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecord(int r2, int r3, int r4, int r5, int r6, @aa1 BleMatchPeriod r7, @aa1 List<BleMatchPeriod> r8, @aa1 List<BleMatchLog> r9) {
        Intrinsics.X0O(r7, "mPeriod");
        Intrinsics.X0O(r8, "mPeriodList");
        Intrinsics.X0O(r9, "mLogList");
        this.mStart = r2;
        this.mType = r3;
        this.mPeriodListSize = r4;
        this.mLogListSize = r5;
        this.mUndefined = r6;
        this.mPeriod = r7;
        this.mPeriodList = r8;
        this.mLogList = r9;
    }

    public /* synthetic */ BleMatchRecord(int r18, int r19, int r20, int r21, int r22, BleMatchPeriod r23, List r24, List r25, int r26, DefaultConstructorMarker r27) {
        int r2 = 0;
        if ((r26 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r26 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r26 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r26 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r26 & 16) != 0) goto L23;
        r2 = r22;
    L23:
        if ((r26 & 32) == 0) goto L25;
        BleMatchPeriod r7 = new BleMatchPeriod(0, 0, 0, 0, 0, 0, 0, 127, null);
    L27:
        if ((r26 & 64) == 0) goto L29;
        List r6 = new ArrayList();
    L31:
        if ((r26 & 128) == 0) goto L34;
        List r28 = new ArrayList();
    L35:
        this(r1, r3, r4, r5, r2, r7, r6, r28);
        return;
    L34:
        r28 = r25;
        goto L35
    L29:
        r6 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
