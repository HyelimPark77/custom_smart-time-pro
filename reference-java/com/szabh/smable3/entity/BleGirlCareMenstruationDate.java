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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 7;

    @aa1
    private BleTime mTime;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleGirlCareMenstruationDate() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleGirlCareMenstruationDate copy$default(BleGirlCareMenstruationDate bleGirlCareMenstruationDate, int i, BleTime bleTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleGirlCareMenstruationDate.mType;
        }
        if ((i2 & 2) != 0) {
            bleTime = bleGirlCareMenstruationDate.mTime;
        }
        return bleGirlCareMenstruationDate.copy(i, bleTime);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleTime component2() {
        return this.mTime;
    }

    @aa1
    public final BleGirlCareMenstruationDate copy(int i, @aa1 BleTime mTime) {
        Intrinsics.X0O(mTime, "mTime");
        return new BleGirlCareMenstruationDate(i, mTime);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        BleReadable bleReadable = (BleReadable) BleTime.class.newInstance();
        bleReadable.setMBytes(readBytes(6));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mTime = (BleTime) bleReadable;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        writeObject(this.mTime);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGirlCareMenstruationDate)) {
            return false;
        }
        BleGirlCareMenstruationDate bleGirlCareMenstruationDate = (BleGirlCareMenstruationDate) obj;
        return this.mType == bleGirlCareMenstruationDate.mType && Intrinsics.XOO0ii0(this.mTime, bleGirlCareMenstruationDate.mTime);
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

    public final void setMTime(@aa1 BleTime bleTime) {
        Intrinsics.X0O(bleTime, "<set-?>");
        this.mTime = bleTime;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleGirlCareMenstruationDate(mType=" + this.mType + ", mTime=" + this.mTime + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGirlCareMenstruationDate(int i, @aa1 BleTime mTime) {
        Intrinsics.X0O(mTime, "mTime");
        this.mType = i;
        this.mTime = mTime;
    }

    public /* synthetic */ BleGirlCareMenstruationDate(int i, BleTime bleTime, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new BleTime(0, 0, 0, 0, 0, 0, 63, null) : bleTime);
    }
}
