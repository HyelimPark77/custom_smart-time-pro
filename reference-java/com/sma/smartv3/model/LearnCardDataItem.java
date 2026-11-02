package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LearnCardDataItem implements Serializable {

    /* JADX INFO: renamed from: id */
    private final int f51311id;
    private boolean isChoose;

    @aa1
    private final String name;
    private final int path;

    @aa1
    private final String size;

    public LearnCardDataItem() {
        this(0, null, null, false, 0, 31, null);
    }

    public static /* synthetic */ LearnCardDataItem copy$default(LearnCardDataItem learnCardDataItem, int i, String str, String str2, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = learnCardDataItem.f51311id;
        }
        if ((i3 & 2) != 0) {
            str = learnCardDataItem.name;
        }
        if ((i3 & 4) != 0) {
            str2 = learnCardDataItem.size;
        }
        if ((i3 & 8) != 0) {
            z = learnCardDataItem.isChoose;
        }
        if ((i3 & 16) != 0) {
            i2 = learnCardDataItem.path;
        }
        int i4 = i2;
        String str3 = str2;
        return learnCardDataItem.copy(i, str, str3, z, i4);
    }

    public final int component1() {
        return this.f51311id;
    }

    @aa1
    public final String component2() {
        return this.name;
    }

    @aa1
    public final String component3() {
        return this.size;
    }

    public final boolean component4() {
        return this.isChoose;
    }

    public final int component5() {
        return this.path;
    }

    @aa1
    public final LearnCardDataItem copy(int i, @aa1 String name, @aa1 String size, boolean z, int i2) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(size, "size");
        return new LearnCardDataItem(i, name, size, z, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnCardDataItem)) {
            return false;
        }
        LearnCardDataItem learnCardDataItem = (LearnCardDataItem) obj;
        return this.f51311id == learnCardDataItem.f51311id && Intrinsics.XOO0ii0(this.name, learnCardDataItem.name) && Intrinsics.XOO0ii0(this.size, learnCardDataItem.size) && this.isChoose == learnCardDataItem.isChoose && this.path == learnCardDataItem.path;
    }

    public final int getId() {
        return this.f51311id;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final int getPath() {
        return this.path;
    }

    @aa1
    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f51311id) * 31) + this.name.hashCode()) * 31) + this.size.hashCode()) * 31) + Boolean.hashCode(this.isChoose)) * 31) + Integer.hashCode(this.path);
    }

    public final boolean isChoose() {
        return this.isChoose;
    }

    public final void setChoose(boolean z) {
        this.isChoose = z;
    }

    @aa1
    public String toString() {
        return "LearnCardDataItem(id=" + this.f51311id + ", name=" + this.name + ", size=" + this.size + ", isChoose=" + this.isChoose + ", path=" + this.path + I000IiI1O.C2156iO.f1007iO;
    }

    public LearnCardDataItem(int i, @aa1 String name, @aa1 String size, boolean z, int i2) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(size, "size");
        this.f51311id = i;
        this.name = name;
        this.size = size;
        this.isChoose = z;
        this.path = i2;
    }

    public /* synthetic */ LearnCardDataItem(int i, String str, String str2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "0KB" : str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? -1 : i2);
    }
}
