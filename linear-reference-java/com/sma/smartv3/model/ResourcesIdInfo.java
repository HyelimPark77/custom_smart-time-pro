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
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ResourcesIdInfo copy$default(ResourcesIdInfo r0, int r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.resId;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.secondaryId;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.isSelect;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final ResourcesIdInfo copy(int r2, int r3, boolean r4) {
        return new ResourcesIdInfo(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ResourcesIdInfo) == true) goto L8;
        return false;
    L8:
        ResourcesIdInfo r6 = (ResourcesIdInfo) r5;
        if (this.resId == r6.resId) goto L12;
        return false;
    L12:
        if (this.secondaryId == r6.secondaryId) goto L15;
        return false;
    L15:
        if (this.isSelect == r6.isSelect) goto L17;
        return false;
    L17:
        return true;
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

    public final void setResId(int r1) {
        this.resId = r1;
    }

    public final void setSecondaryId(int r1) {
        this.secondaryId = r1;
    }

    public final void setSelect(boolean r1) {
        this.isSelect = r1;
    }

    @aa1
    public String toString() {
        return "ResourcesIdInfo(resId=" + this.resId + ", secondaryId=" + this.secondaryId + ", isSelect=" + this.isSelect + I000IiI1O.iO.iO;
    }

    public ResourcesIdInfo(int r1, int r2, boolean r3) {
        this.resId = r1;
        this.secondaryId = r2;
        this.isSelect = r3;
    }

    public /* synthetic */ ResourcesIdInfo(int r2, int r3, boolean r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
