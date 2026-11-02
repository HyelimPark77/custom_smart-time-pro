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

    /* JADX INFO: renamed from: id */
    private final int f51298id;
    private boolean isShowNewFlag;

    @aa1
    private final String onlinePath;
    private final int path;

    public AppStoreDataItem() {
        this(0, null, 0, null, null, false, 0, 127, null);
    }

    public static /* synthetic */ AppStoreDataItem copy$default(AppStoreDataItem appStoreDataItem, int i, BleAppInfo bleAppInfo, int i2, String str, String str2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = appStoreDataItem.f51298id;
        }
        if ((i4 & 2) != 0) {
            bleAppInfo = appStoreDataItem.bleAppInfo;
        }
        if ((i4 & 4) != 0) {
            i2 = appStoreDataItem.path;
        }
        if ((i4 & 8) != 0) {
            str = appStoreDataItem.onlinePath;
        }
        if ((i4 & 16) != 0) {
            str2 = appStoreDataItem.binOnlinePath;
        }
        if ((i4 & 32) != 0) {
            z = appStoreDataItem.isShowNewFlag;
        }
        if ((i4 & 64) != 0) {
            i3 = appStoreDataItem.appStoreType;
        }
        boolean z2 = z;
        int i5 = i3;
        String str3 = str2;
        int i6 = i2;
        return appStoreDataItem.copy(i, bleAppInfo, i6, str, str3, z2, i5);
    }

    public final int component1() {
        return this.f51298id;
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
    public final AppStoreDataItem copy(int i, @aa1 BleAppInfo bleAppInfo, int i2, @aa1 String onlinePath, @aa1 String binOnlinePath, boolean z, int i3) {
        Intrinsics.X0O(bleAppInfo, "bleAppInfo");
        Intrinsics.X0O(onlinePath, "onlinePath");
        Intrinsics.X0O(binOnlinePath, "binOnlinePath");
        return new AppStoreDataItem(i, bleAppInfo, i2, onlinePath, binOnlinePath, z, i3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStoreDataItem)) {
            return false;
        }
        AppStoreDataItem appStoreDataItem = (AppStoreDataItem) obj;
        return this.f51298id == appStoreDataItem.f51298id && Intrinsics.XOO0ii0(this.bleAppInfo, appStoreDataItem.bleAppInfo) && this.path == appStoreDataItem.path && Intrinsics.XOO0ii0(this.onlinePath, appStoreDataItem.onlinePath) && Intrinsics.XOO0ii0(this.binOnlinePath, appStoreDataItem.binOnlinePath) && this.isShowNewFlag == appStoreDataItem.isShowNewFlag && this.appStoreType == appStoreDataItem.appStoreType;
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
        return this.f51298id;
    }

    @aa1
    public final String getOnlinePath() {
        return this.onlinePath;
    }

    public final int getPath() {
        return this.path;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f51298id) * 31) + this.bleAppInfo.hashCode()) * 31) + Integer.hashCode(this.path)) * 31) + this.onlinePath.hashCode()) * 31) + this.binOnlinePath.hashCode()) * 31) + Boolean.hashCode(this.isShowNewFlag)) * 31) + Integer.hashCode(this.appStoreType);
    }

    public final boolean isShowNewFlag() {
        return this.isShowNewFlag;
    }

    public final void setAppStoreType(int i) {
        this.appStoreType = i;
    }

    public final void setBinOnlinePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.binOnlinePath = str;
    }

    public final void setShowNewFlag(boolean z) {
        this.isShowNewFlag = z;
    }

    @aa1
    public String toString() {
        return "AppStoreDataItem(id=" + this.f51298id + ", bleAppInfo=" + this.bleAppInfo + ", path=" + this.path + ", onlinePath=" + this.onlinePath + ", binOnlinePath=" + this.binOnlinePath + ", isShowNewFlag=" + this.isShowNewFlag + ", appStoreType=" + this.appStoreType + I000IiI1O.C2156iO.f1007iO;
    }

    public AppStoreDataItem(int i, @aa1 BleAppInfo bleAppInfo, int i2, @aa1 String onlinePath, @aa1 String binOnlinePath, boolean z, int i3) {
        Intrinsics.X0O(bleAppInfo, "bleAppInfo");
        Intrinsics.X0O(onlinePath, "onlinePath");
        Intrinsics.X0O(binOnlinePath, "binOnlinePath");
        this.f51298id = i;
        this.bleAppInfo = bleAppInfo;
        this.path = i2;
        this.onlinePath = onlinePath;
        this.binOnlinePath = binOnlinePath;
        this.isShowNewFlag = z;
        this.appStoreType = i3;
    }

    public /* synthetic */ AppStoreDataItem(int i, BleAppInfo bleAppInfo, int i2, String str, String str2, boolean z, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? new BleAppInfo(null, null, null, 0, 0, 0, null, 127, null) : bleAppInfo, (i4 & 4) == 0 ? i2 : -1, (i4 & 8) != 0 ? "" : str, (i4 & 16) == 0 ? str2 : "", (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? AppStoreItemType.INSTALL.getType() : i3);
    }
}
