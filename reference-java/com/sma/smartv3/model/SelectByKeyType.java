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
        this(0, 1, null);
    }

    public static /* synthetic */ SelectByKeyType copy$default(SelectByKeyType selectByKeyType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = selectByKeyType.configValue;
        }
        return selectByKeyType.copy(i);
    }

    public final int component1() {
        return this.configValue;
    }

    @aa1
    public final SelectByKeyType copy(int i) {
        return new SelectByKeyType(i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectByKeyType) && this.configValue == ((SelectByKeyType) obj).configValue;
    }

    public final int getConfigValue() {
        return this.configValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.configValue);
    }

    @aa1
    public String toString() {
        return "SelectByKeyType(configValue=" + this.configValue + I000IiI1O.C2156iO.f1007iO;
    }

    public SelectByKeyType(int i) {
        this.configValue = i;
    }

    public /* synthetic */ SelectByKeyType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
