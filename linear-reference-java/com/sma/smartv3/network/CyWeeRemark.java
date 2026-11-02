package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CyWeeRemark {
    private int type;

    @aa1
    private String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public CyWeeRemark() {
        String r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CyWeeRemark copy$default(CyWeeRemark r0, String r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.uuid;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.type;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.uuid;
    }

    public final int component2() {
        return this.type;
    }

    @aa1
    public final CyWeeRemark copy(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "uuid");
        return new CyWeeRemark(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CyWeeRemark) == true) goto L8;
        return false;
    L8:
        CyWeeRemark r6 = (CyWeeRemark) r5;
        if (Intrinsics.XOO0ii0(this.uuid, r6.uuid) == true) goto L12;
        return false;
    L12:
        if (this.type == r6.type) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getType() {
        return this.type;
    }

    @aa1
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + Integer.hashCode(this.type);
    }

    public final void setType(int r1) {
        this.type = r1;
    }

    public final void setUuid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.uuid = r2;
    }

    @aa1
    public String toString() {
        return "CyWeeRemark(uuid=" + this.uuid + ", type=" + this.type + I000IiI1O.iO.iO;
    }

    public CyWeeRemark(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "uuid");
        this.uuid = r2;
        this.type = r3;
    }

    public /* synthetic */ CyWeeRemark(String r1, int r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
