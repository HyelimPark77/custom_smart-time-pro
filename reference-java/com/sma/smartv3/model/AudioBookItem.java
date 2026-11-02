package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AudioBookItem implements Serializable {

    @aa1
    private String binOnlinePath;

    /* JADX INFO: renamed from: id */
    private final int f51300id;
    private boolean isChoose;
    private boolean isShowNewFlag;

    @aa1
    private String mPackage;
    private int mSize;

    @aa1
    private final String name;

    @aa1
    private final String onlinePath;
    private final int size;

    public AudioBookItem() {
        this(0, null, 0, false, null, null, false, null, 0, 511, null);
    }

    public static /* synthetic */ AudioBookItem copy$default(AudioBookItem audioBookItem, int i, String str, int i2, boolean z, String str2, String str3, boolean z2, String str4, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = audioBookItem.f51300id;
        }
        if ((i4 & 2) != 0) {
            str = audioBookItem.name;
        }
        if ((i4 & 4) != 0) {
            i2 = audioBookItem.size;
        }
        if ((i4 & 8) != 0) {
            z = audioBookItem.isChoose;
        }
        if ((i4 & 16) != 0) {
            str2 = audioBookItem.onlinePath;
        }
        if ((i4 & 32) != 0) {
            str3 = audioBookItem.binOnlinePath;
        }
        if ((i4 & 64) != 0) {
            z2 = audioBookItem.isShowNewFlag;
        }
        if ((i4 & 128) != 0) {
            str4 = audioBookItem.mPackage;
        }
        if ((i4 & 256) != 0) {
            i3 = audioBookItem.mSize;
        }
        String str5 = str4;
        int i5 = i3;
        String str6 = str3;
        boolean z3 = z2;
        String str7 = str2;
        int i6 = i2;
        return audioBookItem.copy(i, str, i6, z, str7, str6, z3, str5, i5);
    }

    public final int component1() {
        return this.f51300id;
    }

    @aa1
    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.size;
    }

    public final boolean component4() {
        return this.isChoose;
    }

    @aa1
    public final String component5() {
        return this.onlinePath;
    }

    @aa1
    public final String component6() {
        return this.binOnlinePath;
    }

    public final boolean component7() {
        return this.isShowNewFlag;
    }

    @aa1
    public final String component8() {
        return this.mPackage;
    }

    public final int component9() {
        return this.mSize;
    }

    @aa1
    public final AudioBookItem copy(int i, @aa1 String name, int i2, boolean z, @aa1 String onlinePath, @aa1 String binOnlinePath, boolean z2, @aa1 String mPackage, int i3) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(onlinePath, "onlinePath");
        Intrinsics.X0O(binOnlinePath, "binOnlinePath");
        Intrinsics.X0O(mPackage, "mPackage");
        return new AudioBookItem(i, name, i2, z, onlinePath, binOnlinePath, z2, mPackage, i3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookItem)) {
            return false;
        }
        AudioBookItem audioBookItem = (AudioBookItem) obj;
        return this.f51300id == audioBookItem.f51300id && Intrinsics.XOO0ii0(this.name, audioBookItem.name) && this.size == audioBookItem.size && this.isChoose == audioBookItem.isChoose && Intrinsics.XOO0ii0(this.onlinePath, audioBookItem.onlinePath) && Intrinsics.XOO0ii0(this.binOnlinePath, audioBookItem.binOnlinePath) && this.isShowNewFlag == audioBookItem.isShowNewFlag && Intrinsics.XOO0ii0(this.mPackage, audioBookItem.mPackage) && this.mSize == audioBookItem.mSize;
    }

    @aa1
    public final String getBinOnlinePath() {
        return this.binOnlinePath;
    }

    public final int getId() {
        return this.f51300id;
    }

    @aa1
    public final String getMPackage() {
        return this.mPackage;
    }

    public final int getMSize() {
        return this.mSize;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getOnlinePath() {
        return this.onlinePath;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f51300id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Boolean.hashCode(this.isChoose)) * 31) + this.onlinePath.hashCode()) * 31) + this.binOnlinePath.hashCode()) * 31) + Boolean.hashCode(this.isShowNewFlag)) * 31) + this.mPackage.hashCode()) * 31) + Integer.hashCode(this.mSize);
    }

    public final boolean isChoose() {
        return this.isChoose;
    }

    public final boolean isShowNewFlag() {
        return this.isShowNewFlag;
    }

    public final void setBinOnlinePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.binOnlinePath = str;
    }

    public final void setChoose(boolean z) {
        this.isChoose = z;
    }

    public final void setMPackage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPackage = str;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    public final void setShowNewFlag(boolean z) {
        this.isShowNewFlag = z;
    }

    @aa1
    public String toString() {
        return "AudioBookItem(id=" + this.f51300id + ", name=" + this.name + ", size=" + this.size + ", isChoose=" + this.isChoose + ", onlinePath=" + this.onlinePath + ", binOnlinePath=" + this.binOnlinePath + ", isShowNewFlag=" + this.isShowNewFlag + ", mPackage=" + this.mPackage + ", mSize=" + this.mSize + I000IiI1O.C2156iO.f1007iO;
    }

    public AudioBookItem(int i, @aa1 String name, int i2, boolean z, @aa1 String onlinePath, @aa1 String binOnlinePath, boolean z2, @aa1 String mPackage, int i3) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(onlinePath, "onlinePath");
        Intrinsics.X0O(binOnlinePath, "binOnlinePath");
        Intrinsics.X0O(mPackage, "mPackage");
        this.f51300id = i;
        this.name = name;
        this.size = i2;
        this.isChoose = z;
        this.onlinePath = onlinePath;
        this.binOnlinePath = binOnlinePath;
        this.isShowNewFlag = z2;
        this.mPackage = mPackage;
        this.mSize = i3;
    }

    public /* synthetic */ AudioBookItem(int i, String str, int i2, boolean z, String str2, String str3, boolean z2, String str4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? false : z2, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? 0 : i3);
    }
}
