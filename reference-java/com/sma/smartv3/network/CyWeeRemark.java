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
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CyWeeRemark copy$default(CyWeeRemark cyWeeRemark, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cyWeeRemark.uuid;
        }
        if ((i2 & 2) != 0) {
            i = cyWeeRemark.type;
        }
        return cyWeeRemark.copy(str, i);
    }

    @aa1
    public final String component1() {
        return this.uuid;
    }

    public final int component2() {
        return this.type;
    }

    @aa1
    public final CyWeeRemark copy(@aa1 String uuid, int i) {
        Intrinsics.X0O(uuid, "uuid");
        return new CyWeeRemark(uuid, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CyWeeRemark)) {
            return false;
        }
        CyWeeRemark cyWeeRemark = (CyWeeRemark) obj;
        return Intrinsics.XOO0ii0(this.uuid, cyWeeRemark.uuid) && this.type == cyWeeRemark.type;
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

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUuid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.uuid = str;
    }

    @aa1
    public String toString() {
        return "CyWeeRemark(uuid=" + this.uuid + ", type=" + this.type + I000IiI1O.C2156iO.f1007iO;
    }

    public CyWeeRemark(@aa1 String uuid, int i) {
        Intrinsics.X0O(uuid, "uuid");
        this.uuid = uuid;
        this.type = i;
    }

    public /* synthetic */ CyWeeRemark(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
