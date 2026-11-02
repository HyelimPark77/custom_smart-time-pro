package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppStoreFileList extends JsonFieldContainer implements Serializable {

    @tb1
    private final AppFileDetail[] appx;

    @aa1
    private final String groupId;

    public AppStoreFileList(@aa1 String groupId, @tb1 AppFileDetail[] appFileDetailArr) {
        Intrinsics.X0O(groupId, "groupId");
        this.groupId = groupId;
        this.appx = appFileDetailArr;
    }

    public static /* synthetic */ AppStoreFileList copy$default(AppStoreFileList appStoreFileList, String str, AppFileDetail[] appFileDetailArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appStoreFileList.groupId;
        }
        if ((i & 2) != 0) {
            appFileDetailArr = appStoreFileList.appx;
        }
        return appStoreFileList.copy(str, appFileDetailArr);
    }

    @aa1
    public final String component1() {
        return this.groupId;
    }

    @tb1
    public final AppFileDetail[] component2() {
        return this.appx;
    }

    @aa1
    public final AppStoreFileList copy(@aa1 String groupId, @tb1 AppFileDetail[] appFileDetailArr) {
        Intrinsics.X0O(groupId, "groupId");
        return new AppStoreFileList(groupId, appFileDetailArr);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStoreFileList)) {
            return false;
        }
        AppStoreFileList appStoreFileList = (AppStoreFileList) obj;
        return Intrinsics.XOO0ii0(this.groupId, appStoreFileList.groupId) && Intrinsics.XOO0ii0(this.appx, appStoreFileList.appx);
    }

    @tb1
    public final AppFileDetail[] getAppx() {
        return this.appx;
    }

    @aa1
    public final String getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        int iHashCode = this.groupId.hashCode() * 31;
        AppFileDetail[] appFileDetailArr = this.appx;
        return iHashCode + (appFileDetailArr == null ? 0 : Arrays.hashCode(appFileDetailArr));
    }

    @aa1
    public String toString() {
        return "AppStoreFileList(groupId=" + this.groupId + ", appx=" + Arrays.toString(this.appx) + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ AppStoreFileList(String str, AppFileDetail[] appFileDetailArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, appFileDetailArr);
    }
}
