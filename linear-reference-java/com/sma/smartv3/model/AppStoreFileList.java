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

    public AppStoreFileList(@aa1 String r2, @tb1 AppFileDetail[] r3) {
        Intrinsics.X0O(r2, "groupId");
        this.groupId = r2;
        this.appx = r3;
    }

    public static /* synthetic */ AppStoreFileList copy$default(AppStoreFileList r0, String r1, AppFileDetail[] r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.groupId;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.appx;
    L9:
        return r0.copy(r1, r2);
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
    public final AppStoreFileList copy(@aa1 String r2, @tb1 AppFileDetail[] r3) {
        Intrinsics.X0O(r2, "groupId");
        return new AppStoreFileList(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppStoreFileList) == true) goto L8;
        return false;
    L8:
        AppStoreFileList r6 = (AppStoreFileList) r5;
        if (Intrinsics.XOO0ii0(this.groupId, r6.groupId) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.appx, r6.appx) == true) goto L14;
        return false;
    L14:
        return true;
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
        int r0 = this.groupId.hashCode() * 31;
        AppFileDetail[] r1 = this.appx;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = Arrays.hashCode(r1);
        goto L7
    }

    @aa1
    public String toString() {
        return "AppStoreFileList(groupId=" + this.groupId + ", appx=" + Arrays.toString(this.appx) + I000IiI1O.iO.iO;
    }

    public /* synthetic */ AppStoreFileList(String r1, AppFileDetail[] r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1, r2);
    }
}
