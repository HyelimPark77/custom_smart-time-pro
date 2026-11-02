package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleGirlCareSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGirlCareSettings.kt\ncom/szabh/smable3/entity/BleGirlCareMenstruationDate\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,82:1\n222#2,4:83\n*S KotlinDebug\n*F\n+ 1 BleGirlCareSettings.kt\ncom/szabh/smable3/entity/BleGirlCareMenstruationDate\n*L\n21#1:83,4\n*E\n"})
public final class BleGirlCareMenstruationDate extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 7;

    @aa1
    private BleTime mTime;
    private int mType;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleGirlCareMenstruationDate() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleGirlCareMenstruationDate copy$default(BleGirlCareMenstruationDate r0, int r1, BleTime r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleTime component2() {
        return this.mTime;
    }

    @aa1
    public final BleGirlCareMenstruationDate copy(int r2, @aa1 BleTime r3) {
        Intrinsics.X0O(r3, "mTime");
        return new BleGirlCareMenstruationDate(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        BleReadable r0 = (BleReadable) BleTime.class.newInstance();
        r0.setMBytes(readBytes(6));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mTime = (BleTime) r0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeObject(this.mTime);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGirlCareMenstruationDate) == true) goto L8;
        return false;
    L8:
        BleGirlCareMenstruationDate r6 = (BleGirlCareMenstruationDate) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mTime, r6.mTime) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 7;
    }

    @aa1
    public final BleTime getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mType) * 31) + this.mTime.hashCode();
    }

    public final void setMTime(@aa1 BleTime r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTime = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleGirlCareMenstruationDate(mType=" + this.mType + ", mTime=" + this.mTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGirlCareMenstruationDate(int r2, @aa1 BleTime r3) {
        Intrinsics.X0O(r3, "mTime");
        this.mType = r2;
        this.mTime = r3;
    }

    public /* synthetic */ BleGirlCareMenstruationDate(int r10, BleTime r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r10 = 0;
    L6:
        if ((r12 & 2) == 0) goto L8;
        r11 = new BleTime(0, 0, 0, 0, 0, 0, 63, null);
    L8:
        this(r10, r11);
    }
}
