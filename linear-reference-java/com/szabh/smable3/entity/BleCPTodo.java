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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleCPTodo() {
        long r1 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        long r6 = 0;
        String r8 = null;
        int r9 = 0;
        byte[] r10 = null;
        this(r1, r3, r4, r5, r6, r8, r9, r10, 255, null);
    }

    public static /* synthetic */ BleCPTodo copy$default(BleCPTodo r11, long r12, int r14, int r15, int r16, long r17, String r19, int r20, byte[] r21, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        r12 = r11.mTime;
    L5:
        long r1 = r12;
        if ((r22 & 2) == 0) goto L8;
        r14 = r11.mType;
    L8:
        int r3 = r14;
        if ((r22 & 4) == 0) goto L11;
        r15 = r11.mUser;
    L11:
        int r4 = r15;
        if ((r22 & 8) == 0) goto L14;
        int r5 = r11.mReminder;
    L16:
        if ((r22 & 16) == 0) goto L18;
        long r6 = r11.mReminderTime;
    L20:
        if ((r22 & 32) == 0) goto L22;
        String r8 = r11.mContent;
    L24:
        if ((r22 & 64) == 0) goto L26;
        int r9 = r11.mAudioType;
    L28:
        if ((r22 & 128) == 0) goto L31;
        byte[] r10 = r11.mAudioData;
    L33:
        return r11.copy(r1, r3, r4, r5, r6, r8, r9, r10);
    L31:
        r10 = r21;
        goto L33
    L26:
        r9 = r20;
        goto L28
    L22:
        r8 = r19;
        goto L24
    L18:
        r6 = r17;
        goto L20
    L14:
        r5 = r16;
        goto L16
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
    public final BleCPTodo copy(long r13, int r15, int r16, int r17, long r18, @aa1 String r20, int r21, @aa1 byte[] r22) {
        Intrinsics.X0O(r20, "mContent");
        Intrinsics.X0O(r22, "mAudioData");
        return new BleCPTodo(r13, r15, r16, r17, r18, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        this.mType = readInt8();
        this.mUser = readInt8();
        this.mReminder = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mReminderTime = readInt64(r0);
        byte r2 = readInt8();
        if (r2 <= 0) goto L5;
        this.mContent = BleReadable.readString$default(this, r2, null, 2, null);
    L5:
        this.mAudioType = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mAudioData = readBytes(readInt32(r0));
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        writeInt8(this.mType);
        writeInt8(this.mUser);
        writeInt8(this.mReminder);
        long r1 = this.mReminderTime;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r1, r2);
        byte[] r3 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");
        int r6 = Math.min(r3.length, 96);
        writeInt8(r6);
        BleWritable.writeStringWithFix$default(this, this.mContent, r6, null, 4, null);
        writeInt8(this.mAudioType);
        int r4 = this.mAudioData.length;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt32(r4, r2);
        BleWritable.writeBytes$default(this, this.mAudioData, null, 2, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPTodo) == true) goto L8;
        return false;
    L8:
        BleCPTodo r9 = (BleCPTodo) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mType == r9.mType) goto L15;
        return false;
    L15:
        if (this.mUser == r9.mUser) goto L18;
        return false;
    L18:
        if (this.mReminder == r9.mReminder) goto L21;
        return false;
    L21:
        if (this.mReminderTime == r9.mReminderTime) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L27;
        return false;
    L27:
        if (this.mAudioType == r9.mAudioType) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mAudioData, r9.mAudioData) == true) goto L32;
        return false;
    L32:
        return true;
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
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return (Math.min(r0.length, 96) + 25) + this.mAudioData.length;
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

    public final void setMAudioData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAudioData = r2;
    }

    public final void setMAudioType(int r1) {
        this.mAudioType = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMReminder(int r1) {
        this.mReminder = r1;
    }

    public final void setMReminderTime(long r1) {
        this.mReminderTime = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUser(int r1) {
        this.mUser = r1;
    }

    @aa1
    public String toString() {
        return "BleCPTodo(mTime=" + this.mTime + ", mType=" + this.mType + ", mUser=" + this.mUser + ", mReminder=" + this.mReminder + ", mReminderTime=" + this.mReminderTime + ", mContent='" + this.mContent + "', mAudioType=" + this.mAudioType + ", mAudioData=" + this.mAudioData.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPTodo(long r2, int r4, int r5, int r6, long r7, @aa1 String r9, int r10, @aa1 byte[] r11) {
        Intrinsics.X0O(r9, "mContent");
        Intrinsics.X0O(r11, "mAudioData");
        this.mTime = r2;
        this.mType = r4;
        this.mUser = r5;
        this.mReminder = r6;
        this.mReminderTime = r7;
        this.mContent = r9;
        this.mAudioType = r10;
        this.mAudioData = r11;
    }

    public /* synthetic */ BleCPTodo(long r4, int r6, int r7, int r8, long r9, String r11, int r12, byte[] r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r6 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r8 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r9 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r11 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r12 = 0;
    L24:
        if ((r14 & 128) == 0) goto L26;
        r13 = new byte[0];
    L26:
        byte[] r16 = r13;
        long r10 = r9;
        int r17 = r8;
        int r18 = r7;
        int r19 = r6;
        long r5 = r4;
        this(r5, r19, r18, r17, r10, r11, r12, r16);
    }
}
