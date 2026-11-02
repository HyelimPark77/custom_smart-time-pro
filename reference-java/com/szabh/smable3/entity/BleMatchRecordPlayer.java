package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMatchRecordPlayer extends BleReadable implements Serializable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 26;
    public static final int NAME_LENGTH = 25;

    @aa1
    private String mName;
    private int mNum;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleMatchRecordPlayer() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleMatchRecordPlayer copy$default(BleMatchRecordPlayer bleMatchRecordPlayer, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleMatchRecordPlayer.mName;
        }
        if ((i2 & 2) != 0) {
            i = bleMatchRecordPlayer.mNum;
        }
        return bleMatchRecordPlayer.copy(str, i);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    public final int component2() {
        return this.mNum;
    }

    @aa1
    public final BleMatchRecordPlayer copy(@aa1 String mName, int i) {
        Intrinsics.X0O(mName, "mName");
        return new BleMatchRecordPlayer(mName, i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mName = BleReadable.readString$default(this, 25, null, 2, null);
        this.mNum = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleMatchRecordPlayer)) {
            return false;
        }
        BleMatchRecordPlayer bleMatchRecordPlayer = (BleMatchRecordPlayer) obj;
        return Intrinsics.XOO0ii0(this.mName, bleMatchRecordPlayer.mName) && this.mNum == bleMatchRecordPlayer.mNum;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMNum() {
        return this.mNum;
    }

    public int hashCode() {
        return (this.mName.hashCode() * 31) + Integer.hashCode(this.mNum);
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMNum(int i) {
        this.mNum = i;
    }

    @aa1
    public String toString() {
        return "BleMatchRecordPlayer(mName=" + this.mName + ", mNum=" + this.mNum + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMatchRecordPlayer(@aa1 String mName, int i) {
        Intrinsics.X0O(mName, "mName");
        this.mName = mName;
        this.mNum = i;
    }

    public /* synthetic */ BleMatchRecordPlayer(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
