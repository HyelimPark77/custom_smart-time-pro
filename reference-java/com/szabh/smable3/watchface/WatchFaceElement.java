package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceElement {
    private final byte action;
    private final int align;

    @aa1
    private final AnimData animData;

    @aa1
    private final DateDigitData dateDigitData;

    @aa1
    private final FrameData frameData;

    @aa1
    private final ParticleData particleData;

    @aa1
    private final PointerData pointerData;

    @aa1
    private final List<String> reColor;
    private int reColorCount;
    private final int resDescCount;
    private final int resDescIndex;

    @aa1
    private final byte[] reserved;

    @aa1
    private final byte[] reversed;

    @aa1
    private final TimeDigitData timeDigitData;
    private final byte type;
    private final int xOffset;
    private final int yOffset;

    public static final class AnimData {
        private final byte alpha;
        private final short byX;
        private final short byY;
        private final int duration;
        private final int mode;

        /* JADX INFO: renamed from: px */
        private final short f55358px;

        /* JADX INFO: renamed from: py */
        private final short f55359py;
        private final int rotation;
        private final short scaleX;
        private final short scaleY;

        public AnimData() {
            this((short) 0, (short) 0, 0, 0, (short) 0, (short) 0, 0, (short) 0, (short) 0, (byte) 0, 1023, null);
        }

        public static /* synthetic */ AnimData copy$default(AnimData animData, short s, short s2, int i, int i2, short s3, short s4, int i3, short s5, short s6, byte b, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                s = animData.f55358px;
            }
            if ((i4 & 2) != 0) {
                s2 = animData.f55359py;
            }
            if ((i4 & 4) != 0) {
                i = animData.mode;
            }
            if ((i4 & 8) != 0) {
                i2 = animData.duration;
            }
            if ((i4 & 16) != 0) {
                s3 = animData.byX;
            }
            if ((i4 & 32) != 0) {
                s4 = animData.byY;
            }
            if ((i4 & 64) != 0) {
                i3 = animData.rotation;
            }
            if ((i4 & 128) != 0) {
                s5 = animData.scaleX;
            }
            if ((i4 & 256) != 0) {
                s6 = animData.scaleY;
            }
            if ((i4 & 512) != 0) {
                b = animData.alpha;
            }
            short s7 = s6;
            byte b2 = b;
            int i5 = i3;
            short s8 = s5;
            short s9 = s3;
            short s10 = s4;
            return animData.copy(s, s2, i, i2, s9, s10, i5, s8, s7, b2);
        }

        public final short component1() {
            return this.f55358px;
        }

        public final byte component10() {
            return this.alpha;
        }

        public final short component2() {
            return this.f55359py;
        }

        public final int component3() {
            return this.mode;
        }

        public final int component4() {
            return this.duration;
        }

        public final short component5() {
            return this.byX;
        }

        public final short component6() {
            return this.byY;
        }

        public final int component7() {
            return this.rotation;
        }

        public final short component8() {
            return this.scaleX;
        }

        public final short component9() {
            return this.scaleY;
        }

        @aa1
        public final AnimData copy(short s, short s2, int i, int i2, short s3, short s4, int i3, short s5, short s6, byte b) {
            return new AnimData(s, s2, i, i2, s3, s4, i3, s5, s6, b);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            return this.f55358px == animData.f55358px && this.f55359py == animData.f55359py && this.mode == animData.mode && this.duration == animData.duration && this.byX == animData.byX && this.byY == animData.byY && this.rotation == animData.rotation && this.scaleX == animData.scaleX && this.scaleY == animData.scaleY && this.alpha == animData.alpha;
        }

        public final byte getAlpha() {
            return this.alpha;
        }

        public final short getByX() {
            return this.byX;
        }

        public final short getByY() {
            return this.byY;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final int getMode() {
            return this.mode;
        }

        public final short getPx() {
            return this.f55358px;
        }

        public final short getPy() {
            return this.f55359py;
        }

        public final int getRotation() {
            return this.rotation;
        }

        public final short getScaleX() {
            return this.scaleX;
        }

        public final short getScaleY() {
            return this.scaleY;
        }

        public int hashCode() {
            return (((((((((((((((((Short.hashCode(this.f55358px) * 31) + Short.hashCode(this.f55359py)) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.duration)) * 31) + Short.hashCode(this.byX)) * 31) + Short.hashCode(this.byY)) * 31) + Integer.hashCode(this.rotation)) * 31) + Short.hashCode(this.scaleX)) * 31) + Short.hashCode(this.scaleY)) * 31) + Byte.hashCode(this.alpha);
        }

        @aa1
        public String toString() {
            return "AnimData(px=" + ((int) this.f55358px) + ", py=" + ((int) this.f55359py) + ", mode=" + this.mode + ", duration=" + this.duration + ", byX=" + ((int) this.byX) + ", byY=" + ((int) this.byY) + ", rotation=" + this.rotation + ", scaleX=" + ((int) this.scaleX) + ", scaleY=" + ((int) this.scaleY) + ", alpha=" + ((int) this.alpha) + HexStringBuilder.COMMENT_END_CHAR;
        }

        public AnimData(short s, short s2, int i, int i2, short s3, short s4, int i3, short s5, short s6, byte b) {
            this.f55358px = s;
            this.f55359py = s2;
            this.mode = i;
            this.duration = i2;
            this.byX = s3;
            this.byY = s4;
            this.rotation = i3;
            this.scaleX = s5;
            this.scaleY = s6;
            this.alpha = b;
        }

        public /* synthetic */ AnimData(short s, short s2, int i, int i2, short s3, short s4, int i3, short s5, short s6, byte b, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? (short) 0 : s, (i4 & 2) != 0 ? (short) 0 : s2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? (short) 0 : s3, (i4 & 32) != 0 ? (short) 0 : s4, (i4 & 64) != 0 ? 0 : i3, (i4 & 128) != 0 ? (short) 0 : s5, (i4 & 256) != 0 ? (short) 0 : s6, (i4 & 512) != 0 ? (byte) 0 : b);
        }
    }

    public static final class DateDigitData {
        private final byte flag;

        public DateDigitData() {
            this((byte) 0, 1, null);
        }

        public static /* synthetic */ DateDigitData copy$default(DateDigitData dateDigitData, byte b, int i, Object obj) {
            if ((i & 1) != 0) {
                b = dateDigitData.flag;
            }
            return dateDigitData.copy(b);
        }

        public final byte component1() {
            return this.flag;
        }

        @aa1
        public final DateDigitData copy(byte b) {
            return new DateDigitData(b);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateDigitData) && this.flag == ((DateDigitData) obj).flag;
        }

        public final byte getFlag() {
            return this.flag;
        }

        public int hashCode() {
            return Byte.hashCode(this.flag);
        }

        @aa1
        public String toString() {
            return "DateDigitData(flag=" + ((int) this.flag) + HexStringBuilder.COMMENT_END_CHAR;
        }

        public DateDigitData(byte b) {
            this.flag = b;
        }

        public /* synthetic */ DateDigitData(byte b, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? (byte) 0 : b);
        }
    }

    public static final class FrameData {
        private final byte interval;
        private final byte mode;

        /* JADX WARN: Illegal instructions before constructor call */
        public FrameData() {
            byte b = 0;
            this(b, b, 3, null);
        }

        public static /* synthetic */ FrameData copy$default(FrameData frameData, byte b, byte b2, int i, Object obj) {
            if ((i & 1) != 0) {
                b = frameData.mode;
            }
            if ((i & 2) != 0) {
                b2 = frameData.interval;
            }
            return frameData.copy(b, b2);
        }

        public final byte component1() {
            return this.mode;
        }

        public final byte component2() {
            return this.interval;
        }

        @aa1
        public final FrameData copy(byte b, byte b2) {
            return new FrameData(b, b2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrameData)) {
                return false;
            }
            FrameData frameData = (FrameData) obj;
            return this.mode == frameData.mode && this.interval == frameData.interval;
        }

        public final byte getInterval() {
            return this.interval;
        }

        public final byte getMode() {
            return this.mode;
        }

        public int hashCode() {
            return (Byte.hashCode(this.mode) * 31) + Byte.hashCode(this.interval);
        }

        @aa1
        public String toString() {
            return "FrameData(mode=" + ((int) this.mode) + ", interval=" + ((int) this.interval) + HexStringBuilder.COMMENT_END_CHAR;
        }

        public FrameData(byte b, byte b2) {
            this.mode = b;
            this.interval = b2;
        }

        public /* synthetic */ FrameData(byte b, byte b2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? (byte) 0 : b, (i & 2) != 0 ? (byte) 0 : b2);
        }
    }

    public static final class ParticleData {
        private final int color;

        public ParticleData() {
            this(0, 1, null);
        }

        public static /* synthetic */ ParticleData copy$default(ParticleData particleData, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = particleData.color;
            }
            return particleData.copy(i);
        }

        public final int component1() {
            return this.color;
        }

        @aa1
        public final ParticleData copy(int i) {
            return new ParticleData(i);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ParticleData) && this.color == ((ParticleData) obj).color;
        }

        public final int getColor() {
            return this.color;
        }

        public int hashCode() {
            return Integer.hashCode(this.color);
        }

        @aa1
        public String toString() {
            return "ParticleData(color=" + this.color + HexStringBuilder.COMMENT_END_CHAR;
        }

        public ParticleData(int i) {
            this.color = i;
        }

        public /* synthetic */ ParticleData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    public static final class PointerData {
        private final int pivotX;
        private final int pivotY;

        /* JADX WARN: Illegal instructions before constructor call */
        public PointerData() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ PointerData copy$default(PointerData pointerData, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = pointerData.pivotX;
            }
            if ((i3 & 2) != 0) {
                i2 = pointerData.pivotY;
            }
            return pointerData.copy(i, i2);
        }

        public final int component1() {
            return this.pivotX;
        }

        public final int component2() {
            return this.pivotY;
        }

        @aa1
        public final PointerData copy(int i, int i2) {
            return new PointerData(i, i2);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointerData)) {
                return false;
            }
            PointerData pointerData = (PointerData) obj;
            return this.pivotX == pointerData.pivotX && this.pivotY == pointerData.pivotY;
        }

        public final int getPivotX() {
            return this.pivotX;
        }

        public final int getPivotY() {
            return this.pivotY;
        }

        public int hashCode() {
            return (Integer.hashCode(this.pivotX) * 31) + Integer.hashCode(this.pivotY);
        }

        @aa1
        public String toString() {
            return "PointerData(pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + HexStringBuilder.COMMENT_END_CHAR;
        }

        public PointerData(int i, int i2) {
            this.pivotX = i;
            this.pivotY = i2;
        }

        public /* synthetic */ PointerData(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    public static final class TimeDigitData {
        private final byte flag;

        public TimeDigitData() {
            this((byte) 0, 1, null);
        }

        public static /* synthetic */ TimeDigitData copy$default(TimeDigitData timeDigitData, byte b, int i, Object obj) {
            if ((i & 1) != 0) {
                b = timeDigitData.flag;
            }
            return timeDigitData.copy(b);
        }

        public final byte component1() {
            return this.flag;
        }

        @aa1
        public final TimeDigitData copy(byte b) {
            return new TimeDigitData(b);
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeDigitData) && this.flag == ((TimeDigitData) obj).flag;
        }

        public final byte getFlag() {
            return this.flag;
        }

        public int hashCode() {
            return Byte.hashCode(this.flag);
        }

        @aa1
        public String toString() {
            return "TimeDigitData(flag=" + ((int) this.flag) + HexStringBuilder.COMMENT_END_CHAR;
        }

        public TimeDigitData(byte b) {
            this.flag = b;
        }

        public /* synthetic */ TimeDigitData(byte b, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? (byte) 0 : b);
        }
    }

    public WatchFaceElement(byte b, int i, int i2, byte b2, int i3, int i4, int i5, int i6, @aa1 byte[] reversed, @aa1 PointerData pointerData, @aa1 TimeDigitData timeDigitData, @aa1 DateDigitData dateDigitData, @aa1 FrameData frameData, @aa1 AnimData animData, @aa1 ParticleData particleData, @aa1 List<String> reColor, @aa1 byte[] reserved) {
        Intrinsics.X0O(reversed, "reversed");
        Intrinsics.X0O(pointerData, "pointerData");
        Intrinsics.X0O(timeDigitData, "timeDigitData");
        Intrinsics.X0O(dateDigitData, "dateDigitData");
        Intrinsics.X0O(frameData, "frameData");
        Intrinsics.X0O(animData, "animData");
        Intrinsics.X0O(particleData, "particleData");
        Intrinsics.X0O(reColor, "reColor");
        Intrinsics.X0O(reserved, "reserved");
        this.type = b;
        this.resDescCount = i;
        this.resDescIndex = i2;
        this.action = b2;
        this.align = i3;
        this.xOffset = i4;
        this.yOffset = i5;
        this.reColorCount = i6;
        this.reversed = reversed;
        this.pointerData = pointerData;
        this.timeDigitData = timeDigitData;
        this.dateDigitData = dateDigitData;
        this.frameData = frameData;
        this.animData = animData;
        this.particleData = particleData;
        this.reColor = reColor;
        this.reserved = reserved;
    }

    private final byte buildColorCountByte(int i) {
        return (byte) (i << 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchFaceElement copy$default(WatchFaceElement watchFaceElement, byte b, int i, int i2, byte b2, int i3, int i4, int i5, int i6, byte[] bArr, PointerData pointerData, TimeDigitData timeDigitData, DateDigitData dateDigitData, FrameData frameData, AnimData animData, ParticleData particleData, List list, byte[] bArr2, int i7, Object obj) {
        byte[] bArr3;
        List list2;
        byte b3 = (i7 & 1) != 0 ? watchFaceElement.type : b;
        int i8 = (i7 & 2) != 0 ? watchFaceElement.resDescCount : i;
        int i9 = (i7 & 4) != 0 ? watchFaceElement.resDescIndex : i2;
        byte b4 = (i7 & 8) != 0 ? watchFaceElement.action : b2;
        int i10 = (i7 & 16) != 0 ? watchFaceElement.align : i3;
        int i11 = (i7 & 32) != 0 ? watchFaceElement.xOffset : i4;
        int i12 = (i7 & 64) != 0 ? watchFaceElement.yOffset : i5;
        int i13 = (i7 & 128) != 0 ? watchFaceElement.reColorCount : i6;
        byte[] bArr4 = (i7 & 256) != 0 ? watchFaceElement.reversed : bArr;
        PointerData pointerData2 = (i7 & 512) != 0 ? watchFaceElement.pointerData : pointerData;
        TimeDigitData timeDigitData2 = (i7 & 1024) != 0 ? watchFaceElement.timeDigitData : timeDigitData;
        DateDigitData dateDigitData2 = (i7 & 2048) != 0 ? watchFaceElement.dateDigitData : dateDigitData;
        FrameData frameData2 = (i7 & 4096) != 0 ? watchFaceElement.frameData : frameData;
        AnimData animData2 = (i7 & 8192) != 0 ? watchFaceElement.animData : animData;
        byte b5 = b3;
        ParticleData particleData2 = (i7 & 16384) != 0 ? watchFaceElement.particleData : particleData;
        List list3 = (i7 & 32768) != 0 ? watchFaceElement.reColor : list;
        if ((i7 & 65536) != 0) {
            list2 = list3;
            bArr3 = watchFaceElement.reserved;
        } else {
            bArr3 = bArr2;
            list2 = list3;
        }
        return watchFaceElement.copy(b5, i8, i9, b4, i10, i11, i12, i13, bArr4, pointerData2, timeDigitData2, dateDigitData2, frameData2, animData2, particleData2, list2, bArr3);
    }

    public final byte component1() {
        return this.type;
    }

    @aa1
    public final PointerData component10() {
        return this.pointerData;
    }

    @aa1
    public final TimeDigitData component11() {
        return this.timeDigitData;
    }

    @aa1
    public final DateDigitData component12() {
        return this.dateDigitData;
    }

    @aa1
    public final FrameData component13() {
        return this.frameData;
    }

    @aa1
    public final AnimData component14() {
        return this.animData;
    }

    @aa1
    public final ParticleData component15() {
        return this.particleData;
    }

    @aa1
    public final List<String> component16() {
        return this.reColor;
    }

    @aa1
    public final byte[] component17() {
        return this.reserved;
    }

    public final int component2() {
        return this.resDescCount;
    }

    public final int component3() {
        return this.resDescIndex;
    }

    public final byte component4() {
        return this.action;
    }

    public final int component5() {
        return this.align;
    }

    public final int component6() {
        return this.xOffset;
    }

    public final int component7() {
        return this.yOffset;
    }

    public final int component8() {
        return this.reColorCount;
    }

    @aa1
    public final byte[] component9() {
        return this.reversed;
    }

    @aa1
    public final WatchFaceElement copy(byte b, int i, int i2, byte b2, int i3, int i4, int i5, int i6, @aa1 byte[] reversed, @aa1 PointerData pointerData, @aa1 TimeDigitData timeDigitData, @aa1 DateDigitData dateDigitData, @aa1 FrameData frameData, @aa1 AnimData animData, @aa1 ParticleData particleData, @aa1 List<String> reColor, @aa1 byte[] reserved) {
        Intrinsics.X0O(reversed, "reversed");
        Intrinsics.X0O(pointerData, "pointerData");
        Intrinsics.X0O(timeDigitData, "timeDigitData");
        Intrinsics.X0O(dateDigitData, "dateDigitData");
        Intrinsics.X0O(frameData, "frameData");
        Intrinsics.X0O(animData, "animData");
        Intrinsics.X0O(particleData, "particleData");
        Intrinsics.X0O(reColor, "reColor");
        Intrinsics.X0O(reserved, "reserved");
        return new WatchFaceElement(b, i, i2, b2, i3, i4, i5, i6, reversed, pointerData, timeDigitData, dateDigitData, frameData, animData, particleData, reColor, reserved);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchFaceElement)) {
            return false;
        }
        WatchFaceElement watchFaceElement = (WatchFaceElement) obj;
        return this.type == watchFaceElement.type && this.resDescCount == watchFaceElement.resDescCount && this.resDescIndex == watchFaceElement.resDescIndex && this.action == watchFaceElement.action && this.align == watchFaceElement.align && this.xOffset == watchFaceElement.xOffset && this.yOffset == watchFaceElement.yOffset && this.reColorCount == watchFaceElement.reColorCount && Intrinsics.XOO0ii0(this.reversed, watchFaceElement.reversed) && Intrinsics.XOO0ii0(this.pointerData, watchFaceElement.pointerData) && Intrinsics.XOO0ii0(this.timeDigitData, watchFaceElement.timeDigitData) && Intrinsics.XOO0ii0(this.dateDigitData, watchFaceElement.dateDigitData) && Intrinsics.XOO0ii0(this.frameData, watchFaceElement.frameData) && Intrinsics.XOO0ii0(this.animData, watchFaceElement.animData) && Intrinsics.XOO0ii0(this.particleData, watchFaceElement.particleData) && Intrinsics.XOO0ii0(this.reColor, watchFaceElement.reColor) && Intrinsics.XOO0ii0(this.reserved, watchFaceElement.reserved);
    }

    public final byte getAction() {
        return this.action;
    }

    public final int getAlign() {
        return this.align;
    }

    @aa1
    public final AnimData getAnimData() {
        return this.animData;
    }

    @aa1
    public final DateDigitData getDateDigitData() {
        return this.dateDigitData;
    }

    @aa1
    public final FrameData getFrameData() {
        return this.frameData;
    }

    @aa1
    public final ParticleData getParticleData() {
        return this.particleData;
    }

    @aa1
    public final PointerData getPointerData() {
        return this.pointerData;
    }

    @aa1
    public final List<String> getReColor() {
        return this.reColor;
    }

    public final int getReColorCount() {
        return this.reColorCount;
    }

    public final int getResDescCount() {
        return this.resDescCount;
    }

    public final int getResDescIndex() {
        return this.resDescIndex;
    }

    @aa1
    public final byte[] getReserved() {
        return this.reserved;
    }

    @aa1
    public final byte[] getReversed() {
        return this.reversed;
    }

    @aa1
    public final TimeDigitData getTimeDigitData() {
        return this.timeDigitData;
    }

    public final byte getType() {
        return this.type;
    }

    public final int getXOffset() {
        return this.xOffset;
    }

    public final int getYOffset() {
        return this.yOffset;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Byte.hashCode(this.type) * 31) + Integer.hashCode(this.resDescCount)) * 31) + Integer.hashCode(this.resDescIndex)) * 31) + Byte.hashCode(this.action)) * 31) + Integer.hashCode(this.align)) * 31) + Integer.hashCode(this.xOffset)) * 31) + Integer.hashCode(this.yOffset)) * 31) + Integer.hashCode(this.reColorCount)) * 31) + Arrays.hashCode(this.reversed)) * 31) + this.pointerData.hashCode()) * 31) + this.timeDigitData.hashCode()) * 31) + this.dateDigitData.hashCode()) * 31) + this.frameData.hashCode()) * 31) + this.animData.hashCode()) * 31) + this.particleData.hashCode()) * 31) + this.reColor.hashCode()) * 31) + Arrays.hashCode(this.reserved);
    }

    public final void setReColorCount(int i) {
        this.reColorCount = i;
    }

    @aa1
    public final byte[] toByteArray() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(64);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(this.type);
        byteBufferAllocate.put((byte) this.resDescCount);
        byteBufferAllocate.putShort((short) this.resDescIndex);
        byteBufferAllocate.put(this.action);
        byteBufferAllocate.put((byte) this.align);
        byteBufferAllocate.putShort((short) this.xOffset);
        byteBufferAllocate.putShort((short) this.yOffset);
        byteBufferAllocate.put(buildColorCountByte(this.reColorCount));
        byteBufferAllocate.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.reversed, 5)));
        byte b = this.type;
        if (b == WatchFaceEnumUtil.ElementType.POINTER_H.getValue() || b == WatchFaceEnumUtil.ElementType.POINTER_M.getValue() || b == WatchFaceEnumUtil.ElementType.POINTER_S.getValue()) {
            PointerData pointerData = this.pointerData;
            byteBufferAllocate.putShort((short) pointerData.getPivotX());
            byteBufferAllocate.putShort((short) pointerData.getPivotY());
        } else if (b == WatchFaceEnumUtil.ElementType.TIME_DIGIT.getValue() || b == WatchFaceEnumUtil.ElementType.HOUR_TENS.getValue() || b == WatchFaceEnumUtil.ElementType.HOUR_ONES.getValue() || b == WatchFaceEnumUtil.ElementType.MINUTES_TENS.getValue() || b == WatchFaceEnumUtil.ElementType.MINUTES_ONES.getValue()) {
            byteBufferAllocate.put(this.timeDigitData.getFlag());
        } else if (b == WatchFaceEnumUtil.ElementType.DATE_DIGIT.getValue()) {
            byteBufferAllocate.put(this.dateDigitData.getFlag());
        } else if (b == WatchFaceEnumUtil.ElementType.FRAMES.getValue()) {
            FrameData frameData = this.frameData;
            byteBufferAllocate.put(frameData.getMode());
            byteBufferAllocate.put(frameData.getInterval());
        } else if (b == WatchFaceEnumUtil.ElementType.ANIM.getValue()) {
            AnimData animData = this.animData;
            byteBufferAllocate.putShort(animData.getPx());
            byteBufferAllocate.putShort(animData.getPy());
            byteBufferAllocate.putInt(animData.getMode());
            byteBufferAllocate.putInt(animData.getDuration());
            byteBufferAllocate.putShort(animData.getByX());
            byteBufferAllocate.putShort(animData.getByY());
            byteBufferAllocate.putInt(animData.getRotation());
            byteBufferAllocate.putShort(animData.getScaleX());
            byteBufferAllocate.putShort(animData.getScaleY());
            byteBufferAllocate.put(animData.getAlpha());
        }
        byte[] bArrArray = byteBufferAllocate.array();
        int i = this.reColorCount;
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArrColorToRgb565 = WatchFaceElementKt.colorToRgb565(this.reColor.get(i2));
            bArrArray[(i2 * 2) + 49] = bArrColorToRgb565[0];
            bArrArray[i2 + 52] = bArrColorToRgb565[1];
        }
        Intrinsics.XXI(bArrArray);
        return bArrArray;
    }

    @aa1
    public String toString() {
        return "WatchFaceElement(type=" + ((int) this.type) + ", resDescCount=" + this.resDescCount + ", resDescIndex=" + this.resDescIndex + ", action=" + ((int) this.action) + ", align=" + this.align + ", xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ", reColorCount=" + this.reColorCount + ", reversed=" + Arrays.toString(this.reversed) + ", pointerData=" + this.pointerData + ", timeDigitData=" + this.timeDigitData + ", dateDigitData=" + this.dateDigitData + ", frameData=" + this.frameData + ", animData=" + this.animData + ", particleData=" + this.particleData + ", reColor=" + this.reColor + ", reserved=" + Arrays.toString(this.reserved) + HexStringBuilder.COMMENT_END_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WatchFaceElement(byte b, int i, int i2, byte b2, int i3, int i4, int i5, int i6, byte[] bArr, PointerData pointerData, TimeDigitData timeDigitData, DateDigitData dateDigitData, FrameData frameData, AnimData animData, ParticleData particleData, List list, byte[] bArr2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        byte b3 = 0;
        int i8 = 3;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i9 = 1;
        this((i7 & 1) != 0 ? WatchFaceEnumUtil.ElementType.PREVIEW.getValue() : b, i, i2, (i7 & 8) != 0 ? WatchFaceEnumUtil.ClickType.NONE.getValue() : b2, (i7 & 16) != 0 ? WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue() : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) != 0 ? 0 : i5, (i7 & 128) != 0 ? 0 : i6, (i7 & 256) != 0 ? new byte[5] : bArr, (i7 & 512) != 0 ? new PointerData(b3, b3, i8, defaultConstructorMarker2) : pointerData, (i7 & 1024) != 0 ? new TimeDigitData(b3, i9, defaultConstructorMarker2) : timeDigitData, (i7 & 2048) != 0 ? new DateDigitData(b3, i9, defaultConstructorMarker2) : dateDigitData, (i7 & 4096) != 0 ? new FrameData(b3, b3, i8, defaultConstructorMarker2) : frameData, (i7 & 8192) != 0 ? new AnimData((short) 0, (short) 0, 0, 0, (short) 0, (short) 0, 0, (short) 0, (short) 0, (byte) 0, 1023, null) : animData, (i7 & 16384) != 0 ? new ParticleData(b3, i9, defaultConstructorMarker2) : particleData, (32768 & i7) != 0 ? new ArrayList() : list, (i7 & 65536) != 0 ? new byte[8] : bArr2);
    }
}
