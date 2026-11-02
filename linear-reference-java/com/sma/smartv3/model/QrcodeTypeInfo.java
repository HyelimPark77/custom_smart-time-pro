package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class QrcodeTypeInfo implements Serializable {
    private int QrcodeType;

    @aa1
    private byte[] data;
    private long dateTime;
    private int iconResId;

    @aa1
    private String name;
    private int qrcodeStreamType;
    private int width;

    public QrcodeTypeInfo() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        long r5 = 0;
        int r7 = 0;
        byte[] r8 = null;
        this(r1, r2, r3, r4, r5, r7, r8, 127, null);
    }

    public static /* synthetic */ QrcodeTypeInfo copy$default(QrcodeTypeInfo r0, int r1, int r2, int r3, String r4, long r5, int r7, byte[] r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.qrcodeStreamType;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.QrcodeType;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.iconResId;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.name;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.dateTime;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = r0.width;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = r0.data;
    L23:
        long r11 = r5;
        int r6 = r3;
        String r12 = r4;
        int r13 = r1;
        int r14 = r2;
        return r0.copy(r13, r14, r6, r12, r11, r7, r8);
    }

    public final int component1() {
        return this.qrcodeStreamType;
    }

    public final int component2() {
        return this.QrcodeType;
    }

    public final int component3() {
        return this.iconResId;
    }

    @aa1
    public final String component4() {
        return this.name;
    }

    public final long component5() {
        return this.dateTime;
    }

    public final int component6() {
        return this.width;
    }

    @aa1
    public final byte[] component7() {
        return this.data;
    }

    @aa1
    public final QrcodeTypeInfo copy(int r11, int r12, int r13, @aa1 String r14, long r15, int r17, @aa1 byte[] r18) {
        Intrinsics.X0O(r14, "name");
        Intrinsics.X0O(r18, "data");
        return new QrcodeTypeInfo(r11, r12, r13, r14, r15, r17, r18);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof QrcodeTypeInfo) == true) goto L8;
        return false;
    L8:
        QrcodeTypeInfo r9 = (QrcodeTypeInfo) r8;
        if (this.qrcodeStreamType == r9.qrcodeStreamType) goto L12;
        return false;
    L12:
        if (this.QrcodeType == r9.QrcodeType) goto L15;
        return false;
    L15:
        if (this.iconResId == r9.iconResId) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.name, r9.name) == true) goto L21;
        return false;
    L21:
        if (this.dateTime == r9.dateTime) goto L24;
        return false;
    L24:
        if (this.width == r9.width) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.data, r9.data) == true) goto L29;
        return false;
    L29:
        return true;
    }

    @aa1
    public final byte[] getData() {
        return this.data;
    }

    public final long getDateTime() {
        return this.dateTime;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final int getQrcodeStreamType() {
        return this.qrcodeStreamType;
    }

    public final int getQrcodeType() {
        return this.QrcodeType;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.qrcodeStreamType) * 31) + Integer.hashCode(this.QrcodeType)) * 31) + Integer.hashCode(this.iconResId)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.dateTime)) * 31) + Integer.hashCode(this.width)) * 31) + Arrays.hashCode(this.data);
    }

    public final void setData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.data = r2;
    }

    public final void setDateTime(long r1) {
        this.dateTime = r1;
    }

    public final void setIconResId(int r1) {
        this.iconResId = r1;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setQrcodeStreamType(int r1) {
        this.qrcodeStreamType = r1;
    }

    public final void setQrcodeType(int r1) {
        this.QrcodeType = r1;
    }

    public final void setWidth(int r1) {
        this.width = r1;
    }

    @aa1
    public String toString() {
        return "QrcodeTypeInfo(qrcodeStreamType=" + this.qrcodeStreamType + ", QrcodeType=" + this.QrcodeType + ", iconResId=" + this.iconResId + ", name=" + this.name + ", dateTime=" + this.dateTime + ", width=" + this.width + ", data=" + Arrays.toString(this.data) + I000IiI1O.iO.iO;
    }

    public QrcodeTypeInfo(int r2, int r3, int r4, @aa1 String r5, long r6, int r8, @aa1 byte[] r9) {
        Intrinsics.X0O(r5, "name");
        Intrinsics.X0O(r9, "data");
        this.qrcodeStreamType = r2;
        this.QrcodeType = r3;
        this.iconResId = r4;
        this.name = r5;
        this.dateTime = r6;
        this.width = r8;
        this.data = r9;
    }

    public /* synthetic */ QrcodeTypeInfo(int r2, int r3, int r4, String r5, long r6, int r8, byte[] r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r10 & 64) == 0) goto L23;
        r9 = new byte[0];
    L23:
        long r7 = r6;
        String r12 = r5;
        int r13 = r4;
        int r14 = r3;
        int r15 = r2;
        this(r15, r14, r13, r12, r7, r8, r9);
    }
}
