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
    public static final Companion Companion = null;
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

    public static final enum BleDeviceEmotion extends Enum<BleDeviceEmotion> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ BleDeviceEmotion[] $VALUES = null;
        public static final BleDeviceEmotion CALM = null;
        public static final BleDeviceEmotion DEFAULT = null;
        public static final BleDeviceEmotion HAPPY = null;
        public static final BleDeviceEmotion SAD = null;
        public static final BleDeviceEmotion WAITING = null;
        private final int value;

        private static final /* synthetic */ BleDeviceEmotion[] $values() {
            return new BleDeviceEmotion[]{DEFAULT, WAITING, CALM, HAPPY, SAD};
        }

        static {
            DEFAULT = new BleDeviceEmotion("DEFAULT", 0, 0);
            WAITING = new BleDeviceEmotion("WAITING", 1, 1);
            CALM = new BleDeviceEmotion("CALM", 2, 2);
            HAPPY = new BleDeviceEmotion("HAPPY", 3, 3);
            SAD = new BleDeviceEmotion("SAD", 4, 4);
            BleDeviceEmotion[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private BleDeviceEmotion(String r1, int r2, int r3) {
            super(r1, r2);
            this.value = r3;
        }

        @aa1
        public static EnumEntries<BleDeviceEmotion> getEntries() {
            return $ENTRIES;
        }

        public static BleDeviceEmotion valueOf(String r1) {
            return (BleDeviceEmotion) Enum.valueOf(BleDeviceEmotion.class, r1);
        }

        public static BleDeviceEmotion[] values() {
            return (BleDeviceEmotion[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final enum BleVoiceMode extends Enum<BleVoiceMode> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ BleVoiceMode[] $VALUES = null;
        public static final BleVoiceMode AI_TRANSLATE = null;
        public static final BleVoiceMode AI_VOICE_ASSISTANT = null;
        public static final BleVoiceMode AI_WATCH_DIAL = null;
        public static final BleVoiceMode EAR_TRANSFER = null;
        public static final BleVoiceMode EAR_TRANSFER_TRANSLATE = null;
        public static final BleVoiceMode ONLY_RECOGNIZE = null;
        public static final BleVoiceMode SIMULTANEOUS = null;
        public static final BleVoiceMode TEST_MODE = null;
        private final int flag;

        private static final /* synthetic */ BleVoiceMode[] $values() {
            return new BleVoiceMode[]{AI_VOICE_ASSISTANT, AI_WATCH_DIAL, AI_TRANSLATE, EAR_TRANSFER, EAR_TRANSFER_TRANSLATE, ONLY_RECOGNIZE, SIMULTANEOUS, TEST_MODE};
        }

        static {
            AI_VOICE_ASSISTANT = new BleVoiceMode("AI_VOICE_ASSISTANT", 0, 0);
            AI_WATCH_DIAL = new BleVoiceMode("AI_WATCH_DIAL", 1, 1);
            AI_TRANSLATE = new BleVoiceMode("AI_TRANSLATE", 2, 2);
            EAR_TRANSFER = new BleVoiceMode("EAR_TRANSFER", 3, 3);
            EAR_TRANSFER_TRANSLATE = new BleVoiceMode("EAR_TRANSFER_TRANSLATE", 4, 4);
            ONLY_RECOGNIZE = new BleVoiceMode("ONLY_RECOGNIZE", 5, 6);
            SIMULTANEOUS = new BleVoiceMode("SIMULTANEOUS", 6, 7);
            TEST_MODE = new BleVoiceMode("TEST_MODE", 7, 8);
            BleVoiceMode[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private BleVoiceMode(String r1, int r2, int r3) {
            super(r1, r2);
            this.flag = r3;
        }

        @aa1
        public static EnumEntries<BleVoiceMode> getEntries() {
            return $ENTRIES;
        }

        public static BleVoiceMode valueOf(String r1) {
            return (BleVoiceMode) Enum.valueOf(BleVoiceMode.class, r1);
        }

        public static BleVoiceMode[] values() {
            return (BleVoiceMode[]) $VALUES.clone();
        }

        public final int getFlag() {
            return this.flag;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public final int getCONTENT_MAX_LENGTH() {
            BleCache r0 = BleCache.INSTANCE;
            if (r0.getMSupportVoiceMaxLength() != 1) goto L10;
            BleDeviceInfo r1 = r0.getMDeviceInfo();
            if (r1 == null) goto L7;
            int r2 = (int) r1.getMIOBufferSize();
        L9:
            return r2 - 25;
        L7:
            r2 = 1024;
            goto L9
        L10:
            return 512;
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleVoice() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        BleDeviceEmotion r4 = null;
        long r5 = 0;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r7, 63, null);
    }

    public static /* synthetic */ BleVoice copy$default(BleVoice r0, int r1, int r2, int r3, BleDeviceEmotion r4, long r5, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mCategory;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mStatus;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mMode;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mDeviceEmotion;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mTime;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = r0.mContent;
    L20:
        String r10 = r7;
        long r11 = r5;
        int r6 = r3;
        BleDeviceEmotion r12 = r4;
        return r0.copy(r1, r2, r6, r12, r11, r10);
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
    public final BleVoice copy(int r10, int r11, int r12, @aa1 BleDeviceEmotion r13, long r14, @aa1 String r16) {
        Intrinsics.X0O(r13, "mDeviceEmotion");
        Intrinsics.X0O(r16, "mContent");
        return new BleVoice(r10, r11, r12, r13, r14, r16);
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
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        int r1 = r0.length;
        Companion r3 = Companion;
        BleWritable.writeInt16$default(this, Math.min(r1, r3.getCONTENT_MAX_LENGTH()), null, 2, null);
        BleWritable.writeStringWithLimit$default(this, this.mContent, r3.getCONTENT_MAX_LENGTH(), null, true, 4, null);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleVoice) == true) goto L8;
        return false;
    L8:
        BleVoice r9 = (BleVoice) r8;
        if (this.mCategory == r9.mCategory) goto L12;
        return false;
    L12:
        if (this.mStatus == r9.mStatus) goto L15;
        return false;
    L15:
        if (this.mMode == r9.mMode) goto L18;
        return false;
    L18:
        if (this.mDeviceEmotion == r9.mDeviceEmotion) goto L21;
        return false;
    L21:
        if (this.mTime == r9.mTime) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L26;
        return false;
    L26:
        return true;
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
        byte[] r0 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return Math.min(r0.length, Companion.getCONTENT_MAX_LENGTH()) + 16;
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

    public final void setMCategory(int r1) {
        this.mCategory = r1;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMDeviceEmotion(@aa1 BleDeviceEmotion r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDeviceEmotion = r2;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleVoice(mCategory=");
        r0.append(this.mCategory);
        r0.append(", mTime=");
        r0.append(this.mTime);
        r0.append(", mMax=");
        r0.append(Companion.getCONTENT_MAX_LENGTH());
        r0.append(", mSize=");
        byte[] r1 = this.mContent.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        r0.append(r1.length);
        r0.append(", mContent='");
        r0.append(this.mContent);
        r0.append("', mStatus=");
        r0.append(this.mStatus);
        r0.append(", mMode=");
        r0.append(this.mMode);
        r0.append(", mDeviceEmotion=");
        r0.append(this.mDeviceEmotion);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleVoice(int r2, int r3, int r4, @aa1 BleDeviceEmotion r5, long r6, @aa1 String r8) {
        Intrinsics.X0O(r5, "mDeviceEmotion");
        Intrinsics.X0O(r8, "mContent");
        this.mCategory = r2;
        this.mStatus = r3;
        this.mMode = r4;
        this.mDeviceEmotion = r5;
        this.mTime = r6;
        this.mContent = r8;
    }

    public /* synthetic */ BleVoice(int r2, int r3, int r4, BleDeviceEmotion r5, long r6, String r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = BleDeviceEmotion.DEFAULT;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L20;
        r8 = "";
    L20:
        long r7 = r6;
        BleDeviceEmotion r11 = r5;
        int r12 = r4;
        int r13 = r3;
        this(r2, r13, r12, r11, r7, r8);
    }
}
