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
        String r1 = null;
        List r2 = null;
        boolean r3 = false;
        this(r1, r2, r3, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LearnCardItemList copy$default(LearnCardItemList r0, String r1, List r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.typeName;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.list;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.isAllChoose;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final LearnCardItemList copy(@aa1 String r2, @aa1 List<LearnCardDataItem> r3, boolean r4) {
        Intrinsics.X0O(r2, "typeName");
        Intrinsics.X0O(r3, "list");
        return new LearnCardItemList(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LearnCardItemList) == true) goto L8;
        return false;
    L8:
        LearnCardItemList r6 = (LearnCardItemList) r5;
        if (Intrinsics.XOO0ii0(this.typeName, r6.typeName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.list, r6.list) == true) goto L15;
        return false;
    L15:
        if (this.isAllChoose == r6.isAllChoose) goto L17;
        return false;
    L17:
        return true;
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

    public final void setAllChoose(boolean r1) {
        this.isAllChoose = r1;
    }

    @aa1
    public String toString() {
        return "LearnCardItemList(typeName=" + this.typeName + ", list=" + this.list + ", isAllChoose=" + this.isAllChoose + I000IiI1O.iO.iO;
    }

    public LearnCardItemList(@aa1 String r2, @aa1 List<LearnCardDataItem> r3, boolean r4) {
        Intrinsics.X0O(r2, "typeName");
        Intrinsics.X0O(r3, "list");
        this.typeName = r2;
        this.list = r3;
        this.isAllChoose = r4;
    }

    public /* synthetic */ LearnCardItemList(String r1, List r2, boolean r3, int r4, DefaultConstructorMarker r5) {
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
