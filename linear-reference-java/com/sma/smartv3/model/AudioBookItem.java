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
    private final int id;
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
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        boolean r4 = false;
        String r5 = null;
        String r6 = null;
        boolean r7 = false;
        String r8 = null;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ AudioBookItem copy$default(AudioBookItem r0, int r1, String r2, int r3, boolean r4, String r5, String r6, boolean r7, String r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.size;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.isChoose;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.onlinePath;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.binOnlinePath;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.isShowNewFlag;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mPackage;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mSize;
    L29:
        String r12 = r8;
        int r13 = r9;
        String r14 = r6;
        boolean r15 = r7;
        boolean r16 = r4;
        String r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.id;
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
    public final AudioBookItem copy(int r12, @aa1 String r13, int r14, boolean r15, @aa1 String r16, @aa1 String r17, boolean r18, @aa1 String r19, int r20) {
        Intrinsics.X0O(r13, "name");
        Intrinsics.X0O(r16, "onlinePath");
        Intrinsics.X0O(r17, "binOnlinePath");
        Intrinsics.X0O(r19, "mPackage");
        return new AudioBookItem(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AudioBookItem) == true) goto L8;
        return false;
    L8:
        AudioBookItem r6 = (AudioBookItem) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L15;
        return false;
    L15:
        if (this.size == r6.size) goto L18;
        return false;
    L18:
        if (this.isChoose == r6.isChoose) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.onlinePath, r6.onlinePath) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.binOnlinePath, r6.binOnlinePath) == true) goto L27;
        return false;
    L27:
        if (this.isShowNewFlag == r6.isShowNewFlag) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mPackage, r6.mPackage) == true) goto L33;
        return false;
    L33:
        if (this.mSize == r6.mSize) goto L35;
        return false;
    L35:
        return true;
    }

    @aa1
    public final String getBinOnlinePath() {
        return this.binOnlinePath;
    }

    public final int getId() {
        return this.id;
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
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Boolean.hashCode(this.isChoose)) * 31) + this.onlinePath.hashCode()) * 31) + this.binOnlinePath.hashCode()) * 31) + Boolean.hashCode(this.isShowNewFlag)) * 31) + this.mPackage.hashCode()) * 31) + Integer.hashCode(this.mSize);
    }

    public final boolean isChoose() {
        return this.isChoose;
    }

    public final boolean isShowNewFlag() {
        return this.isShowNewFlag;
    }

    public final void setBinOnlinePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.binOnlinePath = r2;
    }

    public final void setChoose(boolean r1) {
        this.isChoose = r1;
    }

    public final void setMPackage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPackage = r2;
    }

    public final void setMSize(int r1) {
        this.mSize = r1;
    }

    public final void setShowNewFlag(boolean r1) {
        this.isShowNewFlag = r1;
    }

    @aa1
    public String toString() {
        return "AudioBookItem(id=" + this.id + ", name=" + this.name + ", size=" + this.size + ", isChoose=" + this.isChoose + ", onlinePath=" + this.onlinePath + ", binOnlinePath=" + this.binOnlinePath + ", isShowNewFlag=" + this.isShowNewFlag + ", mPackage=" + this.mPackage + ", mSize=" + this.mSize + I000IiI1O.iO.iO;
    }

    public AudioBookItem(int r2, @aa1 String r3, int r4, boolean r5, @aa1 String r6, @aa1 String r7, boolean r8, @aa1 String r9, int r10) {
        Intrinsics.X0O(r3, "name");
        Intrinsics.X0O(r6, "onlinePath");
        Intrinsics.X0O(r7, "binOnlinePath");
        Intrinsics.X0O(r9, "mPackage");
        this.id = r2;
        this.name = r3;
        this.size = r4;
        this.isChoose = r5;
        this.onlinePath = r6;
        this.binOnlinePath = r7;
        this.isShowNewFlag = r8;
        this.mPackage = r9;
        this.mSize = r10;
    }

    public /* synthetic */ AudioBookItem(int r3, String r4, int r5, boolean r6, String r7, String r8, boolean r9, String r10, int r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = -1;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r12 & 256) == 0) goto L29;
        int r14 = 0;
    L30:
        this(r3, r4, r5, r6, r7, r8, r9, r10, r14);
        return;
    L29:
        r14 = r11;
        goto L30
    }
}
