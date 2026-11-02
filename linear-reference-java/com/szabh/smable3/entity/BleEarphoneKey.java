package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEarphoneKey extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 9;
    public static final int KEY_NEXT = 2;
    public static final int KEY_NONE = 0;
    public static final int KEY_PLAY_PAUSE = 3;
    public static final int KEY_PRE = 1;
    public static final int KEY_SWITCH_ENV = 4;
    public static final int KEY_TURN_OFF_AI = 9;
    public static final int KEY_TURN_OFF_TRANSLATION = 11;
    public static final int KEY_TURN_ON_AI = 8;
    public static final int KEY_TURN_ON_TRANSLATION = 10;
    public static final int KEY_VOICE_ASSISTANT = 7;
    public static final int KEY_VOL_DOWN = 6;
    public static final int KEY_VOL_UP = 5;
    private int mLeftClick;
    private int mLeftDoubleClick;
    private int mLeftLongClick;
    private int mLeftTripleClick;
    private int mRightClick;
    private int mRightDoubleClick;
    private int mRightLongClick;
    private int mRightTripleClick;
    private int mType;

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

    public BleEarphoneKey() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BleEarphoneKey copy$default(BleEarphoneKey r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mLeftClick;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mLeftDoubleClick;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mLeftTripleClick;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mLeftLongClick;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mRightClick;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mRightDoubleClick;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mRightTripleClick;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mRightLongClick;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mType;
    L29:
        int r12 = r8;
        int r13 = r9;
        int r14 = r6;
        int r15 = r7;
        int r16 = r4;
        int r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.mLeftClick;
    }

    public final int component2() {
        return this.mLeftDoubleClick;
    }

    public final int component3() {
        return this.mLeftTripleClick;
    }

    public final int component4() {
        return this.mLeftLongClick;
    }

    public final int component5() {
        return this.mRightClick;
    }

    public final int component6() {
        return this.mRightDoubleClick;
    }

    public final int component7() {
        return this.mRightTripleClick;
    }

    public final int component8() {
        return this.mRightLongClick;
    }

    public final int component9() {
        return this.mType;
    }

    @aa1
    public final BleEarphoneKey copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        return new BleEarphoneKey(r11, r12, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mLeftClick = readInt8();
        this.mLeftDoubleClick = readInt8();
        this.mLeftTripleClick = readInt8();
        this.mLeftLongClick = readInt8();
        this.mRightClick = readInt8();
        this.mRightDoubleClick = readInt8();
        this.mRightTripleClick = readInt8();
        this.mRightLongClick = readInt8();
        this.mType = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mLeftClick);
        writeInt8(this.mLeftDoubleClick);
        writeInt8(this.mLeftTripleClick);
        writeInt8(this.mLeftLongClick);
        writeInt8(this.mRightClick);
        writeInt8(this.mRightDoubleClick);
        writeInt8(this.mRightTripleClick);
        writeInt8(this.mRightLongClick);
        writeInt8(this.mType);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleEarphoneKey) == true) goto L8;
        return false;
    L8:
        BleEarphoneKey r6 = (BleEarphoneKey) r5;
        if (this.mLeftClick == r6.mLeftClick) goto L12;
        return false;
    L12:
        if (this.mLeftDoubleClick == r6.mLeftDoubleClick) goto L15;
        return false;
    L15:
        if (this.mLeftTripleClick == r6.mLeftTripleClick) goto L18;
        return false;
    L18:
        if (this.mLeftLongClick == r6.mLeftLongClick) goto L21;
        return false;
    L21:
        if (this.mRightClick == r6.mRightClick) goto L24;
        return false;
    L24:
        if (this.mRightDoubleClick == r6.mRightDoubleClick) goto L27;
        return false;
    L27:
        if (this.mRightTripleClick == r6.mRightTripleClick) goto L30;
        return false;
    L30:
        if (this.mRightLongClick == r6.mRightLongClick) goto L33;
        return false;
    L33:
        if (this.mType == r6.mType) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMLeftClick() {
        return this.mLeftClick;
    }

    public final int getMLeftDoubleClick() {
        return this.mLeftDoubleClick;
    }

    public final int getMLeftLongClick() {
        return this.mLeftLongClick;
    }

    public final int getMLeftTripleClick() {
        return this.mLeftTripleClick;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 9;
    }

    public final int getMRightClick() {
        return this.mRightClick;
    }

    public final int getMRightDoubleClick() {
        return this.mRightDoubleClick;
    }

    public final int getMRightLongClick() {
        return this.mRightLongClick;
    }

    public final int getMRightTripleClick() {
        return this.mRightTripleClick;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mLeftClick) * 31) + Integer.hashCode(this.mLeftDoubleClick)) * 31) + Integer.hashCode(this.mLeftTripleClick)) * 31) + Integer.hashCode(this.mLeftLongClick)) * 31) + Integer.hashCode(this.mRightClick)) * 31) + Integer.hashCode(this.mRightDoubleClick)) * 31) + Integer.hashCode(this.mRightTripleClick)) * 31) + Integer.hashCode(this.mRightLongClick)) * 31) + Integer.hashCode(this.mType);
    }

    public final void setMLeftClick(int r1) {
        this.mLeftClick = r1;
    }

    public final void setMLeftDoubleClick(int r1) {
        this.mLeftDoubleClick = r1;
    }

    public final void setMLeftLongClick(int r1) {
        this.mLeftLongClick = r1;
    }

    public final void setMLeftTripleClick(int r1) {
        this.mLeftTripleClick = r1;
    }

    public final void setMRightClick(int r1) {
        this.mRightClick = r1;
    }

    public final void setMRightDoubleClick(int r1) {
        this.mRightDoubleClick = r1;
    }

    public final void setMRightLongClick(int r1) {
        this.mRightLongClick = r1;
    }

    public final void setMRightTripleClick(int r1) {
        this.mRightTripleClick = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleEarphoneKey(mLeftClick=" + this.mLeftClick + ", mLeftDoubleClick=" + this.mLeftDoubleClick + ", mLeftTripleClick=" + this.mLeftTripleClick + ", mLeftLongClick=" + this.mLeftLongClick + ", mRightClick=" + this.mRightClick + ", mRightDoubleClick=" + this.mRightDoubleClick + ", mRightTripleClick=" + this.mRightTripleClick + ", mRightLongClick=" + this.mRightLongClick + ", mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEarphoneKey(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        this.mLeftClick = r1;
        this.mLeftDoubleClick = r2;
        this.mLeftTripleClick = r3;
        this.mLeftLongClick = r4;
        this.mRightClick = r5;
        this.mRightDoubleClick = r6;
        this.mRightTripleClick = r7;
        this.mRightLongClick = r8;
        this.mType = r9;
    }

    public /* synthetic */ BleEarphoneKey(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r11 & 256) == 0) goto L30;
        int r13 = 0;
    L29:
        int r14 = r9;
        int r15 = r8;
        int r16 = r7;
        int r17 = r6;
        int r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }
}
