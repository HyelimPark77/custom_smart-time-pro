package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTouchSettings extends BleWritable {
    public static final int CUSTOM_DOUBLE = 1;
    public static final int CUSTOM_MUSIC_NEXT = 10;
    public static final int CUSTOM_MUSIC_PLAY_PAUSE = 11;
    public static final int CUSTOM_MUSIC_PREV = 9;
    public static final int CUSTOM_NONE = 0;
    public static final int CUSTOM_SWIPE_BACK = 6;
    public static final int CUSTOM_SWIPE_DOWN = 3;
    public static final int CUSTOM_SWIPE_LEFT = 4;
    public static final int CUSTOM_SWIPE_RIGHT = 5;
    public static final int CUSTOM_SWIPE_UP = 2;
    public static final int CUSTOM_VOL_DEC = 8;
    public static final int CUSTOM_VOL_INC = 7;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int TYPE_CUSTOM = 3;
    public static final int TYPE_MUSIC = 0;
    public static final int TYPE_PHOTO = 1;
    public static final int TYPE_SLIDE = 2;
    private int mCustomDouble;
    private int mCustomLong;
    private int mCustomSingle;
    private int mEnabled;
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

    public BleTouchSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleTouchSettings copy$default(BleTouchSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mType;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mCustomSingle;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mCustomDouble;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mCustomLong;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mType;
    }

    public final int component3() {
        return this.mCustomSingle;
    }

    public final int component4() {
        return this.mCustomDouble;
    }

    public final int component5() {
        return this.mCustomLong;
    }

    @aa1
    public final BleTouchSettings copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleTouchSettings(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readInt8();
        this.mType = readInt8();
        this.mCustomSingle = readInt8();
        this.mCustomDouble = readInt8();
        this.mCustomLong = readInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(this.mType);
        writeInt8(this.mCustomSingle);
        writeInt8(this.mCustomDouble);
        writeInt8(this.mCustomLong);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleTouchSettings) == true) goto L8;
        return false;
    L8:
        BleTouchSettings r6 = (BleTouchSettings) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mType == r6.mType) goto L15;
        return false;
    L15:
        if (this.mCustomSingle == r6.mCustomSingle) goto L18;
        return false;
    L18:
        if (this.mCustomDouble == r6.mCustomDouble) goto L21;
        return false;
    L21:
        if (this.mCustomLong == r6.mCustomLong) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMCustomDouble() {
        return this.mCustomDouble;
    }

    public final int getMCustomLong() {
        return this.mCustomLong;
    }

    public final int getMCustomSingle() {
        return this.mCustomSingle;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mType)) * 31) + Integer.hashCode(this.mCustomSingle)) * 31) + Integer.hashCode(this.mCustomDouble)) * 31) + Integer.hashCode(this.mCustomLong);
    }

    public final void setMCustomDouble(int r1) {
        this.mCustomDouble = r1;
    }

    public final void setMCustomLong(int r1) {
        this.mCustomLong = r1;
    }

    public final void setMCustomSingle(int r1) {
        this.mCustomSingle = r1;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleTouchSettings(mEnabled=" + this.mEnabled + ", mType=" + this.mType + ", mCustomSingle=" + this.mCustomSingle + ", mCustomDouble=" + this.mCustomDouble + ", mCustomLong=" + this.mCustomLong + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTouchSettings(int r1, int r2, int r3, int r4, int r5) {
        this.mEnabled = r1;
        this.mType = r2;
        this.mCustomSingle = r3;
        this.mCustomDouble = r4;
        this.mCustomLong = r5;
    }

    public /* synthetic */ BleTouchSettings(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 0;
    L17:
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
