package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.entity.BleAppInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppStoreDataItem implements Serializable {
    private int appStoreType;

    @aa1
    private String binOnlinePath;

    @aa1
    private final BleAppInfo bleAppInfo;
    private final int id;
    private boolean isShowNewFlag;

    @aa1
    private final String onlinePath;
    private final int path;

    public AppStoreDataItem() {
        int r1 = 0;
        BleAppInfo r2 = null;
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        boolean r6 = false;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ AppStoreDataItem copy$default(AppStoreDataItem r0, int r1, BleAppInfo r2, int r3, String r4, String r5, boolean r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.bleAppInfo;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.path;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.onlinePath;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.binOnlinePath;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.isShowNewFlag;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.appStoreType;
    L23:
        boolean r10 = r6;
        int r11 = r7;
        String r12 = r4;
        String r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final BleAppInfo component2() {
        return this.bleAppInfo;
    }

    public final int component3() {
        return this.path;
    }

    @aa1
    public final String component4() {
        return this.onlinePath;
    }

    @aa1
    public final String component5() {
        return this.binOnlinePath;
    }

    public final boolean component6() {
        return this.isShowNewFlag;
    }

    public final int component7() {
        return this.appStoreType;
    }

    @aa1
    public final AppStoreDataItem copy(int r10, @aa1 BleAppInfo r11, int r12, @aa1 String r13, @aa1 String r14, boolean r15, int r16) {
        Intrinsics.X0O(r11, "bleAppInfo");
        Intrinsics.X0O(r13, "onlinePath");
        Intrinsics.X0O(r14, "binOnlinePath");
        return new AppStoreDataItem(r10, r11, r12, r13, r14, r15, r16);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppStoreDataItem) == true) goto L8;
        return false;
    L8:
        AppStoreDataItem r6 = (AppStoreDataItem) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.bleAppInfo, r6.bleAppInfo) == true) goto L15;
        return false;
    L15:
        if (this.path == r6.path) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.onlinePath, r6.onlinePath) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.binOnlinePath, r6.binOnlinePath) == true) goto L24;
        return false;
    L24:
        if (this.isShowNewFlag == r6.isShowNewFlag) goto L27;
        return false;
    L27:
        if (this.appStoreType == r6.appStoreType) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getAppStoreType() {
        return this.appStoreType;
    }

    @aa1
    public final String getBinOnlinePath() {
        return this.binOnlinePath;
    }

    @aa1
    public final BleAppInfo getBleAppInfo() {
        return this.bleAppInfo;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getOnlinePath() {
        return this.onlinePath;
    }

    public final int getPath() {
        return this.path;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.bleAppInfo.hashCode()) * 31) + Integer.hashCode(this.path)) * 31) + this.onlinePath.hashCode()) * 31) + this.binOnlinePath.hashCode()) * 31) + Boolean.hashCode(this.isShowNewFlag)) * 31) + Integer.hashCode(this.appStoreType);
    }

    public final boolean isShowNewFlag() {
        return this.isShowNewFlag;
    }

    public final void setAppStoreType(int r1) {
        this.appStoreType = r1;
    }

    public final void setBinOnlinePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.binOnlinePath = r2;
    }

    public final void setShowNewFlag(boolean r1) {
        this.isShowNewFlag = r1;
    }

    @aa1
    public String toString() {
        return "AppStoreDataItem(id=" + this.id + ", bleAppInfo=" + this.bleAppInfo + ", path=" + this.path + ", onlinePath=" + this.onlinePath + ", binOnlinePath=" + this.binOnlinePath + ", isShowNewFlag=" + this.isShowNewFlag + ", appStoreType=" + this.appStoreType + I000IiI1O.iO.iO;
    }

    public AppStoreDataItem(int r2, @aa1 BleAppInfo r3, int r4, @aa1 String r5, @aa1 String r6, boolean r7, int r8) {
        Intrinsics.X0O(r3, "bleAppInfo");
        Intrinsics.X0O(r5, "onlinePath");
        Intrinsics.X0O(r6, "binOnlinePath");
        this.id = r2;
        this.bleAppInfo = r3;
        this.path = r4;
        this.onlinePath = r5;
        this.binOnlinePath = r6;
        this.isShowNewFlag = r7;
        this.appStoreType = r8;
    }

    public /* synthetic */ AppStoreDataItem(int r13, BleAppInfo r14, int r15, String r16, String r17, boolean r18, int r19, int r20, DefaultConstructorMarker r21) {
        int r1 = -1;
        if ((r20 & 1) == 0) goto L6;
        r13 = -1;
    L6:
        if ((r20 & 2) == 0) goto L9;
        r14 = new BleAppInfo(null, null, null, 0, 0, 0, null, 127, null);
    L9:
        if ((r20 & 4) != 0) goto L12;
        r1 = r15;
    L12:
        String r2 = "";
        if ((r20 & 8) == 0) goto L15;
        String r0 = "";
    L17:
        if ((r20 & 16) != 0) goto L21;
        r2 = r17;
    L21:
        if ((r20 & 32) == 0) goto L23;
        boolean r3 = false;
    L25:
        if ((r20 & 64) == 0) goto L28;
        int r22 = AppStoreItemType.INSTALL.getType();
    L29:
        this(r13, r14, r1, r0, r2, r3, r22);
        return;
    L28:
        r22 = r19;
        goto L29
    L23:
        r3 = r18;
        goto L25
    L15:
        r0 = r16;
        goto L17
    }
}
