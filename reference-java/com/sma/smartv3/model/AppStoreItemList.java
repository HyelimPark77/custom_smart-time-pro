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
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppStoreItemList copy$default(AppStoreItemList appStoreItemList, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appStoreItemList.typeName;
        }
        if ((i & 2) != 0) {
            list = appStoreItemList.list;
        }
        if ((i & 4) != 0) {
            z = appStoreItemList.isShowAll;
        }
        return appStoreItemList.copy(str, list, z);
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
    public final AppStoreItemList copy(@aa1 String typeName, @aa1 List<AppStoreDataItem> list, boolean z) {
        Intrinsics.X0O(typeName, "typeName");
        Intrinsics.X0O(list, "list");
        return new AppStoreItemList(typeName, list, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppStoreItemList)) {
            return false;
        }
        AppStoreItemList appStoreItemList = (AppStoreItemList) obj;
        return Intrinsics.XOO0ii0(this.typeName, appStoreItemList.typeName) && Intrinsics.XOO0ii0(this.list, appStoreItemList.list) && this.isShowAll == appStoreItemList.isShowAll;
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

    public final void setShowAll(boolean z) {
        this.isShowAll = z;
    }

    @aa1
    public String toString() {
        return "AppStoreItemList(typeName=" + this.typeName + ", list=" + this.list + ", isShowAll=" + this.isShowAll + I000IiI1O.C2156iO.f1007iO;
    }

    public AppStoreItemList(@aa1 String typeName, @aa1 List<AppStoreDataItem> list, boolean z) {
        Intrinsics.X0O(typeName, "typeName");
        Intrinsics.X0O(list, "list");
        this.typeName = typeName;
        this.list = list;
        this.isShowAll = z;
    }

    public /* synthetic */ AppStoreItemList(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? false : z);
    }
}
