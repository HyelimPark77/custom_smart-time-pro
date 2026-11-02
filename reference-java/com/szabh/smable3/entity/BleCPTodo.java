package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCPTodo extends BleWritable {
    public static final int CONTENT_MAX_LENGTH = 96;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_CREATE = 0;
    public static final int TYPE_DELETE = 2;
    public static final int TYPE_UPDATE = 1;

    @aa1
    private byte[] mAudioData;
    private int mAudioType;

    @aa1
    private String mContent;
    private int mReminder;
    private long mReminderTime;
    private long mTime;
    private int mType;
    private int mUser;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPTodo() {
        this(0L, 0, 0, 0, 0L, null, 0, null, 255, null);
    }

    public static /* synthetic */ BleCPTodo copy$default(BleCPTodo bleCPTodo, long j, int i, int i2, int i3, long j2, String str, int i4, byte[] bArr, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j = bleCPTodo.mTime;
        }
        long j3 = j;
        if ((i5 & 2) != 0) {
            i = bleCPTodo.mType;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = bleCPTodo.mUser;
        }
        return bleCPTodo.copy(j3, i6, i2, (i5 & 8) != 0 ? bleCPTodo.mReminder : i3, (i5 & 16) != 0 ? bleCPTodo.mReminderTime : j2, (i5 & 32) != 0 ? bleCPTodo.mContent : str, (i5 & 64) != 0 ? bleCPTodo.mAudioType : i4, (i5 & 128) != 0 ? bleCPTodo.mAudioData : bArr);
    }

    public final long component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mType;
    }

    public final int component3() {
        return this.mUser;
    }

    public final int component4() {
        return this.mReminder;
    }

    public final long component5() {
        return this.mReminderTime;
    }

    @aa1
    public final String component6() {
        return this.mContent;
    }

    public final int component7() {
        return this.mAudioType;
    }

    @aa1
    public final byte[] component8() {
        return this.mAudioData;
    }

    @aa1
    public final BleCPTodo copy(long j, int i, int i2, int i3, long j2, @aa1 String mContent, int i4, @aa1 byte[] mAudioData) {
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mAudioData, "mAudioData");
        return new BleCPTodo(j, i, i2, i3, j2, mContent, i4, mAudioData);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        this.mType = readInt8();
        this.mUser = readInt8();
        this.mReminder = readInt8();
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mReminderTime = readInt64(LITTLE_ENDIAN);
        byte int8 = readInt8();
        if (int8 > 0) {
            this.mContent = BleReadable.readString$default(this, int8, null, 2, null);
        }
        this.mAudioType = readInt8();
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mAudioData = readBytes(readInt32(LITTLE_ENDIAN));
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        writeInt8(this.mType);
        writeInt8(this.mUser);
        writeInt8(this.mReminder);
        long j2 = this.mReminderTime;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j2, LITTLE_ENDIAN);
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int iMin = Math.min(bytes.length, 96);
        writeInt8(iMin);
        BleWritable.writeStringWithFix$default(this, this.mContent, iMin, null, 4, null);
        writeInt8(this.mAudioType);
        int length = this.mAudioData.length;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(length, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, this.mAudioData, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPTodo)) {
            return false;
        }
        BleCPTodo bleCPTodo = (BleCPTodo) obj;
        return this.mTime == bleCPTodo.mTime && this.mType == bleCPTodo.mType && this.mUser == bleCPTodo.mUser && this.mReminder == bleCPTodo.mReminder && this.mReminderTime == bleCPTodo.mReminderTime && Intrinsics.XOO0ii0(this.mContent, bleCPTodo.mContent) && this.mAudioType == bleCPTodo.mAudioType && Intrinsics.XOO0ii0(this.mAudioData, bleCPTodo.mAudioData);
    }

    @aa1
    public final byte[] getMAudioData() {
        return this.mAudioData;
    }

    public final int getMAudioType() {
        return this.mAudioType;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return Math.min(bytes.length, 96) + 25 + this.mAudioData.length;
    }

    public final int getMReminder() {
        return this.mReminder;
    }

    public final long getMReminderTime() {
        return this.mReminderTime;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMType() {
        return this.mType;
    }

    public final int getMUser() {
        return this.mUser;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mUser)) * 31) + Integer.hashCode(this.mReminder)) * 31) + Long.hashCode(this.mReminderTime)) * 31) + this.mContent.hashCode()) * 31) + Integer.hashCode(this.mAudioType)) * 31) + Arrays.hashCode(this.mAudioData);
    }

    public final void setMAudioData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mAudioData = bArr;
    }

    public final void setMAudioType(int i) {
        this.mAudioType = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMReminder(int i) {
        this.mReminder = i;
    }

    public final void setMReminderTime(long j) {
        this.mReminderTime = j;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMUser(int i) {
        this.mUser = i;
    }

    @aa1
    public String toString() {
        return "BleCPTodo(mTime=" + this.mTime + ", mType=" + this.mType + ", mUser=" + this.mUser + ", mReminder=" + this.mReminder + ", mReminderTime=" + this.mReminderTime + ", mContent='" + this.mContent + "', mAudioType=" + this.mAudioType + ", mAudioData=" + this.mAudioData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPTodo(long j, int i, int i2, int i3, long j2, @aa1 String mContent, int i4, @aa1 byte[] mAudioData) {
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mAudioData, "mAudioData");
        this.mTime = j;
        this.mType = i;
        this.mUser = i2;
        this.mReminder = i3;
        this.mReminderTime = j2;
        this.mContent = mContent;
        this.mAudioType = i4;
        this.mAudioData = mAudioData;
    }

    public /* synthetic */ BleCPTodo(long j, int i, int i2, int i3, long j2, String str, int i4, byte[] bArr, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? "" : str, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? new byte[0] : bArr);
    }
}
