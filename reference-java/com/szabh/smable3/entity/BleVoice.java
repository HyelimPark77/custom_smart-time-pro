package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.component.BleCache;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVoice extends BleWritable {
    public static final int CATEGORY_EMOTION = 2;
    public static final int CATEGORY_INPUT_TEXT = 0;
    public static final int CATEGORY_OUTPUT_TEXT = 1;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int STATUS_END = 3;
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_GOING = 2;
    public static final int STATUS_NORMAL = 0;
    private int mCategory;

    @aa1
    private String mContent;

    @aa1
    private BleDeviceEmotion mDeviceEmotion;
    private int mMode;
    private int mStatus;
    private long mTime;

    public enum BleDeviceEmotion {
        DEFAULT(0),
        WAITING(1),
        CALM(2),
        HAPPY(3),
        SAD(4);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int value;

        BleDeviceEmotion(int i) {
            this.value = i;
        }

        @aa1
        public static EnumEntries<BleDeviceEmotion> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum BleVoiceMode {
        AI_VOICE_ASSISTANT(0),
        AI_WATCH_DIAL(1),
        AI_TRANSLATE(2),
        EAR_TRANSFER(3),
        EAR_TRANSFER_TRANSLATE(4),
        ONLY_RECOGNIZE(6),
        SIMULTANEOUS(7),
        TEST_MODE(8);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
        private final int flag;

        BleVoiceMode(int i) {
            this.flag = i;
        }

        @aa1
        public static EnumEntries<BleVoiceMode> getEntries() {
            return $ENTRIES;
        }

        public final int getFlag() {
            return this.flag;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCONTENT_MAX_LENGTH() {
            BleCache bleCache = BleCache.INSTANCE;
            if (bleCache.getMSupportVoiceMaxLength() != 1) {
                return 512;
            }
            BleDeviceInfo mDeviceInfo = bleCache.getMDeviceInfo();
            return (mDeviceInfo != null ? (int) mDeviceInfo.getMIOBufferSize() : 1024) - 25;
        }

        private Companion() {
        }
    }

    public BleVoice() {
        this(0, 0, 0, null, 0L, null, 63, null);
    }

    public static /* synthetic */ BleVoice copy$default(BleVoice bleVoice, int i, int i2, int i3, BleDeviceEmotion bleDeviceEmotion, long j, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleVoice.mCategory;
        }
        if ((i4 & 2) != 0) {
            i2 = bleVoice.mStatus;
        }
        if ((i4 & 4) != 0) {
            i3 = bleVoice.mMode;
        }
        if ((i4 & 8) != 0) {
            bleDeviceEmotion = bleVoice.mDeviceEmotion;
        }
        if ((i4 & 16) != 0) {
            j = bleVoice.mTime;
        }
        if ((i4 & 32) != 0) {
            str = bleVoice.mContent;
        }
        String str2 = str;
        long j2 = j;
        return bleVoice.copy(i, i2, i3, bleDeviceEmotion, j2, str2);
    }

    public final int component1() {
        return this.mCategory;
    }

    public final int component2() {
        return this.mStatus;
    }

    public final int component3() {
        return this.mMode;
    }

    @aa1
    public final BleDeviceEmotion component4() {
        return this.mDeviceEmotion;
    }

    public final long component5() {
        return this.mTime;
    }

    @aa1
    public final String component6() {
        return this.mContent;
    }

    @aa1
    public final BleVoice copy(int i, int i2, int i3, @aa1 BleDeviceEmotion mDeviceEmotion, long j, @aa1 String mContent) {
        Intrinsics.X0O(mDeviceEmotion, "mDeviceEmotion");
        Intrinsics.X0O(mContent, "mContent");
        return new BleVoice(i, i2, i3, mDeviceEmotion, j, mContent);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCategory);
        writeInt8(this.mStatus);
        writeInt8(this.mMode);
        BleWritable.writeBytes$default(this, new byte[4], null, 2, null);
        writeInt8(this.mDeviceEmotion.getValue());
        writeObject(BleTime.Companion.ofLocal(this.mTime));
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int length = bytes.length;
        Companion companion = Companion;
        BleWritable.writeInt16$default(this, Math.min(length, companion.getCONTENT_MAX_LENGTH()), null, 2, null);
        BleWritable.writeStringWithLimit$default(this, this.mContent, companion.getCONTENT_MAX_LENGTH(), null, true, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleVoice)) {
            return false;
        }
        BleVoice bleVoice = (BleVoice) obj;
        return this.mCategory == bleVoice.mCategory && this.mStatus == bleVoice.mStatus && this.mMode == bleVoice.mMode && this.mDeviceEmotion == bleVoice.mDeviceEmotion && this.mTime == bleVoice.mTime && Intrinsics.XOO0ii0(this.mContent, bleVoice.mContent);
    }

    public final int getMCategory() {
        return this.mCategory;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    @aa1
    public final BleDeviceEmotion getMDeviceEmotion() {
        return this.mDeviceEmotion;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return Math.min(bytes.length, Companion.getCONTENT_MAX_LENGTH()) + 16;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mCategory) * 31) + Integer.hashCode(this.mStatus)) * 31) + Integer.hashCode(this.mMode)) * 31) + this.mDeviceEmotion.hashCode()) * 31) + Long.hashCode(this.mTime)) * 31) + this.mContent.hashCode();
    }

    public final void setMCategory(int i) {
        this.mCategory = i;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMDeviceEmotion(@aa1 BleDeviceEmotion bleDeviceEmotion) {
        Intrinsics.X0O(bleDeviceEmotion, "<set-?>");
        this.mDeviceEmotion = bleDeviceEmotion;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleVoice(mCategory=");
        sb.append(this.mCategory);
        sb.append(", mTime=");
        sb.append(this.mTime);
        sb.append(", mMax=");
        sb.append(Companion.getCONTENT_MAX_LENGTH());
        sb.append(", mSize=");
        byte[] bytes = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        sb.append(bytes.length);
        sb.append(", mContent='");
        sb.append(this.mContent);
        sb.append("', mStatus=");
        sb.append(this.mStatus);
        sb.append(", mMode=");
        sb.append(this.mMode);
        sb.append(", mDeviceEmotion=");
        sb.append(this.mDeviceEmotion);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleVoice(int i, int i2, int i3, @aa1 BleDeviceEmotion mDeviceEmotion, long j, @aa1 String mContent) {
        Intrinsics.X0O(mDeviceEmotion, "mDeviceEmotion");
        Intrinsics.X0O(mContent, "mContent");
        this.mCategory = i;
        this.mStatus = i2;
        this.mMode = i3;
        this.mDeviceEmotion = mDeviceEmotion;
        this.mTime = j;
        this.mContent = mContent;
    }

    public /* synthetic */ BleVoice(int i, int i2, int i3, BleDeviceEmotion bleDeviceEmotion, long j, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? BleDeviceEmotion.DEFAULT : bleDeviceEmotion, (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? "" : str);
    }
}
