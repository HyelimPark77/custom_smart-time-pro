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
public final class LearnCardItemList implements Serializable {
    private boolean isAllChoose;

    @aa1
    private final List<LearnCardDataItem> list;

    @aa1
    private final String typeName;

    public LearnCardItemList() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LearnCardItemList copy$default(LearnCardItemList learnCardItemList, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = learnCardItemList.typeName;
        }
        if ((i & 2) != 0) {
            list = learnCardItemList.list;
        }
        if ((i & 4) != 0) {
            z = learnCardItemList.isAllChoose;
        }
        return learnCardItemList.copy(str, list, z);
    }

    @aa1
    public final String component1() {
        return this.typeName;
    }

    @aa1
    public final List<LearnCardDataItem> component2() {
        return this.list;
    }

    public final boolean component3() {
        return this.isAllChoose;
    }

    @aa1
    public final LearnCardItemList copy(@aa1 String typeName, @aa1 List<LearnCardDataItem> list, boolean z) {
        Intrinsics.X0O(typeName, "typeName");
        Intrinsics.X0O(list, "list");
        return new LearnCardItemList(typeName, list, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnCardItemList)) {
            return false;
        }
        LearnCardItemList learnCardItemList = (LearnCardItemList) obj;
        return Intrinsics.XOO0ii0(this.typeName, learnCardItemList.typeName) && Intrinsics.XOO0ii0(this.list, learnCardItemList.list) && this.isAllChoose == learnCardItemList.isAllChoose;
    }

    @aa1
    public final List<LearnCardDataItem> getList() {
        return this.list;
    }

    @aa1
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return (((this.typeName.hashCode() * 31) + this.list.hashCode()) * 31) + Boolean.hashCode(this.isAllChoose);
    }

    public final boolean isAllChoose() {
        return this.isAllChoose;
    }

    public final void setAllChoose(boolean z) {
        this.isAllChoose = z;
    }

    @aa1
    public String toString() {
        return "LearnCardItemList(typeName=" + this.typeName + ", list=" + this.list + ", isAllChoose=" + this.isAllChoose + I000IiI1O.C2156iO.f1007iO;
    }

    public LearnCardItemList(@aa1 String typeName, @aa1 List<LearnCardDataItem> list, boolean z) {
        Intrinsics.X0O(typeName, "typeName");
        Intrinsics.X0O(list, "list");
        this.typeName = typeName;
        this.list = list;
        this.isAllChoose = z;
    }

    public /* synthetic */ LearnCardItemList(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? false : z);
    }
}
