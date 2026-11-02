package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class SelectByKeyType extends JsonFieldContainer implements Serializable {
    private final int configValue;

    public SelectByKeyType() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ SelectByKeyType copy$default(SelectByKeyType r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.configValue;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.configValue;
    }

    @aa1
    public final SelectByKeyType copy(int r2) {
        return new SelectByKeyType(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof SelectByKeyType) == true) goto L9;
        return false;
    L9:
        if (this.configValue == ((SelectByKeyType) r4).configValue) goto L11;
        return false;
    L11:
        return true;
    }

    public final int getConfigValue() {
        return this.configValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.configValue);
    }

    @aa1
    public String toString() {
        return "SelectByKeyType(configValue=" + this.configValue + I000IiI1O.iO.iO;
    }

    public SelectByKeyType(int r1) {
        this.configValue = r1;
    }

    public /* synthetic */ SelectByKeyType(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
