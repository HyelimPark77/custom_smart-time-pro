package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class ResourcesIdInfo {
    private boolean isSelect;
    private int resId;
    private int secondaryId;

    public ResourcesIdInfo() {
        this(0, 0, false, 7, null);
    }

    public static /* synthetic */ ResourcesIdInfo copy$default(ResourcesIdInfo resourcesIdInfo, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resourcesIdInfo.resId;
        }
        if ((i3 & 2) != 0) {
            i2 = resourcesIdInfo.secondaryId;
        }
        if ((i3 & 4) != 0) {
            z = resourcesIdInfo.isSelect;
        }
        return resourcesIdInfo.copy(i, i2, z);
    }

    public final int component1() {
        return this.resId;
    }

    public final int component2() {
        return this.secondaryId;
    }

    public final boolean component3() {
        return this.isSelect;
    }

    @aa1
    public final ResourcesIdInfo copy(int i, int i2, boolean z) {
        return new ResourcesIdInfo(i, i2, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourcesIdInfo)) {
            return false;
        }
        ResourcesIdInfo resourcesIdInfo = (ResourcesIdInfo) obj;
        return this.resId == resourcesIdInfo.resId && this.secondaryId == resourcesIdInfo.secondaryId && this.isSelect == resourcesIdInfo.isSelect;
    }

    public final int getResId() {
        return this.resId;
    }

    public final int getSecondaryId() {
        return this.secondaryId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resId) * 31) + Integer.hashCode(this.secondaryId)) * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setResId(int i) {
        this.resId = i;
    }

    public final void setSecondaryId(int i) {
        this.secondaryId = i;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @aa1
    public String toString() {
        return "ResourcesIdInfo(resId=" + this.resId + ", secondaryId=" + this.secondaryId + ", isSelect=" + this.isSelect + I000IiI1O.C2156iO.f1007iO;
    }

    public ResourcesIdInfo(int i, int i2, boolean z) {
        this.resId = i;
        this.secondaryId = i2;
        this.isSelect = z;
    }

    public /* synthetic */ ResourcesIdInfo(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z);
    }
}
