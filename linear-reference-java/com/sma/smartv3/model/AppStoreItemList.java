package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppStoreItemList implements Serializable {
    private boolean isShowAll;

    @aa1
    private final List<AppStoreDataItem> list;

    @aa1
    private final String typeName;

    public AppStoreItemList() {
        String r1 = null;
        List r2 = null;
        boolean r3 = false;
        this(r1, r2, r3, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppStoreItemList copy$default(AppStoreItemList r0, String r1, List r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.typeName;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.list;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.isShowAll;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.typeName;
    }

    @aa1
    public final List<AppStoreDataItem> component2() {
        return this.list;
    }

    public final boolean component3() {
        return this.isShowAll;
    }

    @aa1
    public final AppStoreItemList copy(@aa1 String r2, @aa1 List<AppStoreDataItem> r3, boolean r4) {
        Intrinsics.X0O(r2, "typeName");
        Intrinsics.X0O(r3, "list");
        return new AppStoreItemList(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppStoreItemList) == true) goto L8;
        return false;
    L8:
        AppStoreItemList r6 = (AppStoreItemList) r5;
        if (Intrinsics.XOO0ii0(this.typeName, r6.typeName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.list, r6.list) == true) goto L15;
        return false;
    L15:
        if (this.isShowAll == r6.isShowAll) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final List<AppStoreDataItem> getList() {
        return this.list;
    }

    @aa1
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return (((this.typeName.hashCode() * 31) + this.list.hashCode()) * 31) + Boolean.hashCode(this.isShowAll);
    }

    public final boolean isShowAll() {
        return this.isShowAll;
    }

    public final void setShowAll(boolean r1) {
        this.isShowAll = r1;
    }

    @aa1
    public String toString() {
        return "AppStoreItemList(typeName=" + this.typeName + ", list=" + this.list + ", isShowAll=" + this.isShowAll + I000IiI1O.iO.iO;
    }

    public AppStoreItemList(@aa1 String r2, @aa1 List<AppStoreDataItem> r3, boolean r4) {
        Intrinsics.X0O(r2, "typeName");
        Intrinsics.X0O(r3, "list");
        this.typeName = r2;
        this.list = r3;
        this.isShowAll = r4;
    }

    public /* synthetic */ AppStoreItemList(String r1, List r2, boolean r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = new ArrayList();
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = false;
    L11:
        this(r1, r2, r3);
    }
}
