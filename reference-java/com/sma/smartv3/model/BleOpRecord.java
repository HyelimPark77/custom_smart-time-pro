package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BleOpRecord extends JsonFieldContainer {

    @aa1
    public static final Companion Companion = new Companion(null);

    @aa1
    public static final String TYPE_AIR_PRESSURE = "1";

    @aa1
    private String bleName;

    @aa1
    private String mac;

    @aa1
    private String markType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleOpRecord() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BleOpRecord copy$default(BleOpRecord bleOpRecord, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleOpRecord.bleName;
        }
        if ((i & 2) != 0) {
            str2 = bleOpRecord.mac;
        }
        if ((i & 4) != 0) {
            str3 = bleOpRecord.markType;
        }
        return bleOpRecord.copy(str, str2, str3);
    }

    @aa1
    public final String component1() {
        return this.bleName;
    }

    @aa1
    public final String component2() {
        return this.mac;
    }

    @aa1
    public final String component3() {
        return this.markType;
    }

    @aa1
    public final BleOpRecord copy(@aa1 String bleName, @aa1 String mac, @aa1 String markType) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(markType, "markType");
        return new BleOpRecord(bleName, mac, markType);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleOpRecord)) {
            return false;
        }
        BleOpRecord bleOpRecord = (BleOpRecord) obj;
        return Intrinsics.XOO0ii0(this.bleName, bleOpRecord.bleName) && Intrinsics.XOO0ii0(this.mac, bleOpRecord.mac) && Intrinsics.XOO0ii0(this.markType, bleOpRecord.markType);
    }

    @aa1
    public final String getBleName() {
        return this.bleName;
    }

    @aa1
    public final String getMac() {
        return this.mac;
    }

    @aa1
    public final String getMarkType() {
        return this.markType;
    }

    public int hashCode() {
        return (((this.bleName.hashCode() * 31) + this.mac.hashCode()) * 31) + this.markType.hashCode();
    }

    public final void setBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bleName = str;
    }

    public final void setMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mac = str;
    }

    public final void setMarkType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.markType = str;
    }

    @aa1
    public String toString() {
        return "BleOpRecord(bleName=" + this.bleName + ", mac=" + this.mac + ", markType=" + this.markType + I000IiI1O.C2156iO.f1007iO;
    }

    public BleOpRecord(@aa1 String bleName, @aa1 String mac, @aa1 String markType) {
        Intrinsics.X0O(bleName, "bleName");
        Intrinsics.X0O(mac, "mac");
        Intrinsics.X0O(markType, "markType");
        this.bleName = bleName;
        this.mac = mac;
        this.markType = markType;
    }

    public /* synthetic */ BleOpRecord(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
