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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleTouchSettings() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ BleTouchSettings copy$default(BleTouchSettings bleTouchSettings, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = bleTouchSettings.mEnabled;
        }
        if ((i6 & 2) != 0) {
            i2 = bleTouchSettings.mType;
        }
        if ((i6 & 4) != 0) {
            i3 = bleTouchSettings.mCustomSingle;
        }
        if ((i6 & 8) != 0) {
            i4 = bleTouchSettings.mCustomDouble;
        }
        if ((i6 & 16) != 0) {
            i5 = bleTouchSettings.mCustomLong;
        }
        int i7 = i5;
        int i8 = i3;
        return bleTouchSettings.copy(i, i2, i8, i4, i7);
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
    public final BleTouchSettings copy(int i, int i2, int i3, int i4, int i5) {
        return new BleTouchSettings(i, i2, i3, i4, i5);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleTouchSettings)) {
            return false;
        }
        BleTouchSettings bleTouchSettings = (BleTouchSettings) obj;
        return this.mEnabled == bleTouchSettings.mEnabled && this.mType == bleTouchSettings.mType && this.mCustomSingle == bleTouchSettings.mCustomSingle && this.mCustomDouble == bleTouchSettings.mCustomDouble && this.mCustomLong == bleTouchSettings.mCustomLong;
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

    public final void setMCustomDouble(int i) {
        this.mCustomDouble = i;
    }

    public final void setMCustomLong(int i) {
        this.mCustomLong = i;
    }

    public final void setMCustomSingle(int i) {
        this.mCustomSingle = i;
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleTouchSettings(mEnabled=" + this.mEnabled + ", mType=" + this.mType + ", mCustomSingle=" + this.mCustomSingle + ", mCustomDouble=" + this.mCustomDouble + ", mCustomLong=" + this.mCustomLong + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTouchSettings(int i, int i2, int i3, int i4, int i5) {
        this.mEnabled = i;
        this.mType = i2;
        this.mCustomSingle = i3;
        this.mCustomDouble = i4;
        this.mCustomLong = i5;
    }

    public /* synthetic */ BleTouchSettings(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
