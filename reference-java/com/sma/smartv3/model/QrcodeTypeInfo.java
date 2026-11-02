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
        this(0, 0, 0, null, 0L, 0, null, 127, null);
    }

    public static /* synthetic */ QrcodeTypeInfo copy$default(QrcodeTypeInfo qrcodeTypeInfo, int i, int i2, int i3, String str, long j, int i4, byte[] bArr, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = qrcodeTypeInfo.qrcodeStreamType;
        }
        if ((i5 & 2) != 0) {
            i2 = qrcodeTypeInfo.QrcodeType;
        }
        if ((i5 & 4) != 0) {
            i3 = qrcodeTypeInfo.iconResId;
        }
        if ((i5 & 8) != 0) {
            str = qrcodeTypeInfo.name;
        }
        if ((i5 & 16) != 0) {
            j = qrcodeTypeInfo.dateTime;
        }
        if ((i5 & 32) != 0) {
            i4 = qrcodeTypeInfo.width;
        }
        if ((i5 & 64) != 0) {
            bArr = qrcodeTypeInfo.data;
        }
        long j2 = j;
        int i6 = i3;
        String str2 = str;
        return qrcodeTypeInfo.copy(i, i2, i6, str2, j2, i4, bArr);
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
    public final QrcodeTypeInfo copy(int i, int i2, int i3, @aa1 String name, long j, int i4, @aa1 byte[] data) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(data, "data");
        return new QrcodeTypeInfo(i, i2, i3, name, j, i4, data);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrcodeTypeInfo)) {
            return false;
        }
        QrcodeTypeInfo qrcodeTypeInfo = (QrcodeTypeInfo) obj;
        return this.qrcodeStreamType == qrcodeTypeInfo.qrcodeStreamType && this.QrcodeType == qrcodeTypeInfo.QrcodeType && this.iconResId == qrcodeTypeInfo.iconResId && Intrinsics.XOO0ii0(this.name, qrcodeTypeInfo.name) && this.dateTime == qrcodeTypeInfo.dateTime && this.width == qrcodeTypeInfo.width && Intrinsics.XOO0ii0(this.data, qrcodeTypeInfo.data);
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

    public final void setData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.data = bArr;
    }

    public final void setDateTime(long j) {
        this.dateTime = j;
    }

    public final void setIconResId(int i) {
        this.iconResId = i;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setQrcodeStreamType(int i) {
        this.qrcodeStreamType = i;
    }

    public final void setQrcodeType(int i) {
        this.QrcodeType = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @aa1
    public String toString() {
        return "QrcodeTypeInfo(qrcodeStreamType=" + this.qrcodeStreamType + ", QrcodeType=" + this.QrcodeType + ", iconResId=" + this.iconResId + ", name=" + this.name + ", dateTime=" + this.dateTime + ", width=" + this.width + ", data=" + Arrays.toString(this.data) + I000IiI1O.C2156iO.f1007iO;
    }

    public QrcodeTypeInfo(int i, int i2, int i3, @aa1 String name, long j, int i4, @aa1 byte[] data) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(data, "data");
        this.qrcodeStreamType = i;
        this.QrcodeType = i2;
        this.iconResId = i3;
        this.name = name;
        this.dateTime = j;
        this.width = i4;
        this.data = data;
    }

    public /* synthetic */ QrcodeTypeInfo(int i, int i2, int i3, String str, long j, int i4, byte[] bArr, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? 0L : j, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? new byte[0] : bArr);
    }
}
