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
        private final short px;
        private final short py;
        private final int rotation;
        private final short scaleX;
        private final short scaleY;

        public AnimData() {
            short r1 = 0;
            short r2 = 0;
            int r3 = 0;
            int r4 = 0;
            short r5 = 0;
            short r6 = 0;
            int r7 = 0;
            short r8 = 0;
            short r9 = 0;
            byte r10 = 0;
            this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
        }

        public static /* synthetic */ AnimData copy$default(AnimData r0, short r1, short r2, int r3, int r4, short r5, short r6, int r7, short r8, short r9, byte r10, int r11, Object r12) {
            if ((r11 & 1) == 0) goto L6;
            r1 = r0.px;
        L6:
            if ((r11 & 2) == 0) goto L9;
            r2 = r0.py;
        L9:
            if ((r11 & 4) == 0) goto L12;
            r3 = r0.mode;
        L12:
            if ((r11 & 8) == 0) goto L15;
            r4 = r0.duration;
        L15:
            if ((r11 & 16) == 0) goto L18;
            r5 = r0.byX;
        L18:
            if ((r11 & 32) == 0) goto L21;
            r6 = r0.byY;
        L21:
            if ((r11 & 64) == 0) goto L24;
            r7 = r0.rotation;
        L24:
            if ((r11 & 128) == 0) goto L27;
            r8 = r0.scaleX;
        L27:
            if ((r11 & 256) == 0) goto L30;
            r9 = r0.scaleY;
        L30:
            if ((r11 & 512) == 0) goto L32;
            r10 = r0.alpha;
        L32:
            short r13 = r9;
            byte r14 = r10;
            int r15 = r7;
            short r16 = r8;
            short r17 = r5;
            short r18 = r6;
            int r19 = r3;
            int r20 = r4;
            return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
        }

        public final short component1() {
            return this.px;
        }

        public final byte component10() {
            return this.alpha;
        }

        public final short component2() {
            return this.py;
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
        public final AnimData copy(short r12, short r13, int r14, int r15, short r16, short r17, int r18, short r19, short r20, byte r21) {
            return new AnimData(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AnimData) == true) goto L8;
            return false;
        L8:
            AnimData r6 = (AnimData) r5;
            if (this.px == r6.px) goto L12;
            return false;
        L12:
            if (this.py == r6.py) goto L15;
            return false;
        L15:
            if (this.mode == r6.mode) goto L18;
            return false;
        L18:
            if (this.duration == r6.duration) goto L21;
            return false;
        L21:
            if (this.byX == r6.byX) goto L24;
            return false;
        L24:
            if (this.byY == r6.byY) goto L27;
            return false;
        L27:
            if (this.rotation == r6.rotation) goto L30;
            return false;
        L30:
            if (this.scaleX == r6.scaleX) goto L33;
            return false;
        L33:
            if (this.scaleY == r6.scaleY) goto L36;
            return false;
        L36:
            if (this.alpha == r6.alpha) goto L38;
            return false;
        L38:
            return true;
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
            return this.px;
        }

        public final short getPy() {
            return this.py;
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
            return (((((((((((((((((Short.hashCode(this.px) * 31) + Short.hashCode(this.py)) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.duration)) * 31) + Short.hashCode(this.byX)) * 31) + Short.hashCode(this.byY)) * 31) + Integer.hashCode(this.rotation)) * 31) + Short.hashCode(this.scaleX)) * 31) + Short.hashCode(this.scaleY)) * 31) + Byte.hashCode(this.alpha);
        }

        @aa1
        public String toString() {
            return "AnimData(px=" + this.px + ", py=" + this.py + ", mode=" + this.mode + ", duration=" + this.duration + ", byX=" + this.byX + ", byY=" + this.byY + ", rotation=" + this.rotation + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha=" + this.alpha + HexStringBuilder.COMMENT_END_CHAR;
        }

        public AnimData(short r1, short r2, int r3, int r4, short r5, short r6, int r7, short r8, short r9, byte r10) {
            this.px = r1;
            this.py = r2;
            this.mode = r3;
            this.duration = r4;
            this.byX = r5;
            this.byY = r6;
            this.rotation = r7;
            this.scaleX = r8;
            this.scaleY = r9;
            this.alpha = r10;
        }

        public /* synthetic */ AnimData(short r2, short r3, int r4, int r5, short r6, short r7, int r8, short r9, short r10, byte r11, int r12, DefaultConstructorMarker r13) {
            if ((r12 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r12 & 2) == 0) goto L9;
            r3 = 0;
        L9:
            if ((r12 & 4) == 0) goto L12;
            r4 = 0;
        L12:
            if ((r12 & 8) == 0) goto L15;
            r5 = 0;
        L15:
            if ((r12 & 16) == 0) goto L18;
            r6 = 0;
        L18:
            if ((r12 & 32) == 0) goto L21;
            r7 = 0;
        L21:
            if ((r12 & 64) == 0) goto L24;
            r8 = 0;
        L24:
            if ((r12 & 128) == 0) goto L27;
            r9 = 0;
        L27:
            if ((r12 & 256) == 0) goto L30;
            r10 = 0;
        L30:
            if ((r12 & 512) == 0) goto L33;
            byte r14 = 0;
        L32:
            short r15 = r10;
            short r16 = r9;
            int r17 = r8;
            short r18 = r7;
            short r19 = r6;
            int r20 = r5;
            int r21 = r4;
            this(r2, r3, r21, r20, r19, r18, r17, r16, r15, r14);
            return;
        L33:
            r14 = r11;
            goto L32
        }
    }

    public static final class DateDigitData {
        private final byte flag;

        public DateDigitData() {
            byte r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ DateDigitData copy$default(DateDigitData r0, byte r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.flag;
        L6:
            return r0.copy(r1);
        }

        public final byte component1() {
            return this.flag;
        }

        @aa1
        public final DateDigitData copy(byte r2) {
            return new DateDigitData(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof DateDigitData) == true) goto L9;
            return false;
        L9:
            if (this.flag == ((DateDigitData) r4).flag) goto L11;
            return false;
        L11:
            return true;
        }

        public final byte getFlag() {
            return this.flag;
        }

        public int hashCode() {
            return Byte.hashCode(this.flag);
        }

        @aa1
        public String toString() {
            return "DateDigitData(flag=" + this.flag + HexStringBuilder.COMMENT_END_CHAR;
        }

        public DateDigitData(byte r1) {
            this.flag = r1;
        }

        public /* synthetic */ DateDigitData(byte r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = 0;
        L5:
            this(r1);
        }
    }

    public static final class FrameData {
        private final byte interval;
        private final byte mode;

        public FrameData() {
            byte r2 = 0;
            this(r2, r2, 3, null);
        }

        public static /* synthetic */ FrameData copy$default(FrameData r0, byte r1, byte r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.mode;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.interval;
        L9:
            return r0.copy(r1, r2);
        }

        public final byte component1() {
            return this.mode;
        }

        public final byte component2() {
            return this.interval;
        }

        @aa1
        public final FrameData copy(byte r2, byte r3) {
            return new FrameData(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof FrameData) == true) goto L8;
            return false;
        L8:
            FrameData r6 = (FrameData) r5;
            if (this.mode == r6.mode) goto L12;
            return false;
        L12:
            if (this.interval == r6.interval) goto L14;
            return false;
        L14:
            return true;
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
            return "FrameData(mode=" + this.mode + ", interval=" + this.interval + HexStringBuilder.COMMENT_END_CHAR;
        }

        public FrameData(byte r1, byte r2) {
            this.mode = r1;
            this.interval = r2;
        }

        public /* synthetic */ FrameData(byte r2, byte r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = 0;
        L8:
            this(r2, r3);
        }
    }

    public static final class ParticleData {
        private final int color;

        public ParticleData() {
            int r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ ParticleData copy$default(ParticleData r0, int r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.color;
        L6:
            return r0.copy(r1);
        }

        public final int component1() {
            return this.color;
        }

        @aa1
        public final ParticleData copy(int r2) {
            return new ParticleData(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof ParticleData) == true) goto L9;
            return false;
        L9:
            if (this.color == ((ParticleData) r4).color) goto L11;
            return false;
        L11:
            return true;
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

        public ParticleData(int r1) {
            this.color = r1;
        }

        public /* synthetic */ ParticleData(int r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = 0;
        L5:
            this(r1);
        }
    }

    public static final class PointerData {
        private final int pivotX;
        private final int pivotY;

        public PointerData() {
            int r2 = 0;
            this(r2, r2, 3, null);
        }

        public static /* synthetic */ PointerData copy$default(PointerData r0, int r1, int r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.pivotX;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.pivotY;
        L9:
            return r0.copy(r1, r2);
        }

        public final int component1() {
            return this.pivotX;
        }

        public final int component2() {
            return this.pivotY;
        }

        @aa1
        public final PointerData copy(int r2, int r3) {
            return new PointerData(r2, r3);
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof PointerData) == true) goto L8;
            return false;
        L8:
            PointerData r6 = (PointerData) r5;
            if (this.pivotX == r6.pivotX) goto L12;
            return false;
        L12:
            if (this.pivotY == r6.pivotY) goto L14;
            return false;
        L14:
            return true;
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

        public PointerData(int r1, int r2) {
            this.pivotX = r1;
            this.pivotY = r2;
        }

        public /* synthetic */ PointerData(int r2, int r3, int r4, DefaultConstructorMarker r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = 0;
        L8:
            this(r2, r3);
        }
    }

    public static final class TimeDigitData {
        private final byte flag;

        public TimeDigitData() {
            byte r2 = 0;
            this(r2, 1, null);
        }

        public static /* synthetic */ TimeDigitData copy$default(TimeDigitData r0, byte r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.flag;
        L6:
            return r0.copy(r1);
        }

        public final byte component1() {
            return this.flag;
        }

        @aa1
        public final TimeDigitData copy(byte r2) {
            return new TimeDigitData(r2);
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof TimeDigitData) == true) goto L9;
            return false;
        L9:
            if (this.flag == ((TimeDigitData) r4).flag) goto L11;
            return false;
        L11:
            return true;
        }

        public final byte getFlag() {
            return this.flag;
        }

        public int hashCode() {
            return Byte.hashCode(this.flag);
        }

        @aa1
        public String toString() {
            return "TimeDigitData(flag=" + this.flag + HexStringBuilder.COMMENT_END_CHAR;
        }

        public TimeDigitData(byte r1) {
            this.flag = r1;
        }

        public /* synthetic */ TimeDigitData(byte r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = 0;
        L5:
            this(r1);
        }
    }

    public WatchFaceElement(byte r11, int r12, int r13, byte r14, int r15, int r16, int r17, int r18, @aa1 byte[] r19, @aa1 PointerData r20, @aa1 TimeDigitData r21, @aa1 DateDigitData r22, @aa1 FrameData r23, @aa1 AnimData r24, @aa1 ParticleData r25, @aa1 List<String> r26, @aa1 byte[] r27) {
        Intrinsics.X0O(r19, "reversed");
        Intrinsics.X0O(r20, "pointerData");
        Intrinsics.X0O(r21, "timeDigitData");
        Intrinsics.X0O(r22, "dateDigitData");
        Intrinsics.X0O(r23, "frameData");
        Intrinsics.X0O(r24, "animData");
        Intrinsics.X0O(r25, "particleData");
        Intrinsics.X0O(r26, "reColor");
        Intrinsics.X0O(r27, "reserved");
        this.type = r11;
        this.resDescCount = r12;
        this.resDescIndex = r13;
        this.action = r14;
        this.align = r15;
        this.xOffset = r16;
        this.yOffset = r17;
        this.reColorCount = r18;
        this.reversed = r19;
        this.pointerData = r20;
        this.timeDigitData = r21;
        this.dateDigitData = r22;
        this.frameData = r23;
        this.animData = r24;
        this.particleData = r25;
        this.reColor = r26;
        this.reserved = r27;
    }

    private final byte buildColorCountByte(int r1) {
        return (byte) (r1 << 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchFaceElement copy$default(WatchFaceElement r17, byte r18, int r19, int r20, byte r21, int r22, int r23, int r24, int r25, byte[] r26, PointerData r27, TimeDigitData r28, DateDigitData r29, FrameData r30, AnimData r31, ParticleData r32, List r33, byte[] r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        byte r2 = r17.type;
    L7:
        if ((r35 & 2) == 0) goto L9;
        int r3 = r17.resDescCount;
    L11:
        if ((r35 & 4) == 0) goto L13;
        int r4 = r17.resDescIndex;
    L15:
        if ((r35 & 8) == 0) goto L17;
        byte r5 = r17.action;
    L19:
        if ((r35 & 16) == 0) goto L21;
        int r6 = r17.align;
    L23:
        if ((r35 & 32) == 0) goto L25;
        int r7 = r17.xOffset;
    L27:
        if ((r35 & 64) == 0) goto L29;
        int r8 = r17.yOffset;
    L31:
        if ((r35 & 128) == 0) goto L33;
        int r9 = r17.reColorCount;
    L35:
        if ((r35 & 256) == 0) goto L37;
        byte[] r10 = r17.reversed;
    L39:
        if ((r35 & 512) == 0) goto L41;
        PointerData r11 = r17.pointerData;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        TimeDigitData r12 = r17.timeDigitData;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        DateDigitData r13 = r17.dateDigitData;
    L51:
        if ((r35 & 4096) == 0) goto L53;
        FrameData r14 = r17.frameData;
    L55:
        if ((r35 & 8192) == 0) goto L57;
        AnimData r15 = r17.animData;
    L58:
        byte r110 = r2;
        if ((r35 & 16384) == 0) goto L61;
        ParticleData r16 = r17.particleData;
    L63:
        if ((r35 & 32768) == 0) goto L65;
        List r1 = r17.reColor;
    L67:
        if ((r35 & 65536) == 0) goto L69;
        List r111 = r1;
        List r37 = r111;
        byte[] r38 = r17.reserved;
    L71:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r37, r38);
    L69:
        r38 = r34;
        r37 = r1;
        goto L71
    L65:
        r1 = r33;
        goto L67
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
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
    public final WatchFaceElement copy(byte r20, int r21, int r22, byte r23, int r24, int r25, int r26, int r27, @aa1 byte[] r28, @aa1 PointerData r29, @aa1 TimeDigitData r30, @aa1 DateDigitData r31, @aa1 FrameData r32, @aa1 AnimData r33, @aa1 ParticleData r34, @aa1 List<String> r35, @aa1 byte[] r36) {
        Intrinsics.X0O(r28, "reversed");
        Intrinsics.X0O(r29, "pointerData");
        Intrinsics.X0O(r30, "timeDigitData");
        Intrinsics.X0O(r31, "dateDigitData");
        Intrinsics.X0O(r32, "frameData");
        Intrinsics.X0O(r33, "animData");
        Intrinsics.X0O(r34, "particleData");
        Intrinsics.X0O(r35, "reColor");
        Intrinsics.X0O(r36, "reserved");
        return new WatchFaceElement(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchFaceElement) == true) goto L8;
        return false;
    L8:
        WatchFaceElement r6 = (WatchFaceElement) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (this.resDescCount == r6.resDescCount) goto L15;
        return false;
    L15:
        if (this.resDescIndex == r6.resDescIndex) goto L18;
        return false;
    L18:
        if (this.action == r6.action) goto L21;
        return false;
    L21:
        if (this.align == r6.align) goto L24;
        return false;
    L24:
        if (this.xOffset == r6.xOffset) goto L27;
        return false;
    L27:
        if (this.yOffset == r6.yOffset) goto L30;
        return false;
    L30:
        if (this.reColorCount == r6.reColorCount) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.reversed, r6.reversed) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.pointerData, r6.pointerData) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.timeDigitData, r6.timeDigitData) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.dateDigitData, r6.dateDigitData) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.frameData, r6.frameData) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.animData, r6.animData) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.particleData, r6.particleData) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.reColor, r6.reColor) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.reserved, r6.reserved) == true) goto L59;
        return false;
    L59:
        return true;
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

    public final void setReColorCount(int r1) {
        this.reColorCount = r1;
    }

    @aa1
    public final byte[] toByteArray() {
        ByteBuffer r0 = ByteBuffer.allocate(64);
        r0.order(ByteOrder.LITTLE_ENDIAN);
        r0.put(this.type);
        r0.put((byte) this.resDescCount);
        r0.putShort((short) this.resDescIndex);
        r0.put(this.action);
        r0.put((byte) this.align);
        r0.putShort((short) this.xOffset);
        r0.putShort((short) this.yOffset);
        r0.put(buildColorCountByte(this.reColorCount));
        r0.put(CollectionsKt___CollectionsKt.XX0X0(ArraysKt___ArraysKt.X11i(this.reversed, 5)));
        byte r1 = this.type;
        if (r1 != WatchFaceEnumUtil.ElementType.POINTER_H.getValue()) goto L5;
    L30:
        PointerData r2 = this.pointerData;
        r0.putShort((short) r2.getPivotX());
        r0.putShort((short) r2.getPivotY());
    L31:
        byte[] r3 = r0.array();
        int r4 = this.reColorCount;
        int r5 = 0;
    L32:
        if (r5 >= r4) goto L34;
        byte[] r6 = WatchFaceElementKt.access$colorToRgb565(this.reColor.get(r5));
        r3[(r5 * 2) + 49] = r6[0];
        r3[r5 + 52] = r6[1];
        r5 = r5 + 1;
        goto L32
    L34:
        Intrinsics.XXI(r3);
        return r3;
    L5:
        if (r1 == WatchFaceEnumUtil.ElementType.POINTER_M.getValue()) goto L30;
        if (r1 == WatchFaceEnumUtil.ElementType.POINTER_S.getValue()) goto L30;
        if (r1 != WatchFaceEnumUtil.ElementType.TIME_DIGIT.getValue()) goto L12;
    L29:
        r0.put(this.timeDigitData.getFlag());
        goto L31
    L12:
        if (r1 == WatchFaceEnumUtil.ElementType.HOUR_TENS.getValue()) goto L29;
        if (r1 == WatchFaceEnumUtil.ElementType.HOUR_ONES.getValue()) goto L29;
        if (r1 == WatchFaceEnumUtil.ElementType.MINUTES_TENS.getValue()) goto L29;
        if (r1 == WatchFaceEnumUtil.ElementType.MINUTES_ONES.getValue()) goto L29;
        if (r1 != WatchFaceEnumUtil.ElementType.DATE_DIGIT.getValue()) goto L24;
        r0.put(this.dateDigitData.getFlag());
        goto L31
    L24:
        if (r1 != WatchFaceEnumUtil.ElementType.FRAMES.getValue()) goto L27;
        FrameData r7 = this.frameData;
        r0.put(r7.getMode());
        r0.put(r7.getInterval());
        goto L31
    L27:
        if (r1 != WatchFaceEnumUtil.ElementType.ANIM.getValue()) goto L31;
        AnimData r8 = this.animData;
        r0.putShort(r8.getPx());
        r0.putShort(r8.getPy());
        r0.putInt(r8.getMode());
        r0.putInt(r8.getDuration());
        r0.putShort(r8.getByX());
        r0.putShort(r8.getByY());
        r0.putInt(r8.getRotation());
        r0.putShort(r8.getScaleX());
        r0.putShort(r8.getScaleY());
        r0.put(r8.getAlpha());
        goto L31
    }

    @aa1
    public String toString() {
        return "WatchFaceElement(type=" + this.type + ", resDescCount=" + this.resDescCount + ", resDescIndex=" + this.resDescIndex + ", action=" + this.action + ", align=" + this.align + ", xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ", reColorCount=" + this.reColorCount + ", reversed=" + Arrays.toString(this.reversed) + ", pointerData=" + this.pointerData + ", timeDigitData=" + this.timeDigitData + ", dateDigitData=" + this.dateDigitData + ", frameData=" + this.frameData + ", animData=" + this.animData + ", particleData=" + this.particleData + ", reColor=" + this.reColor + ", reserved=" + Arrays.toString(this.reserved) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public /* synthetic */ WatchFaceElement(byte r30, int r31, int r32, byte r33, int r34, int r35, int r36, int r37, byte[] r38, PointerData r39, TimeDigitData r40, DateDigitData r41, FrameData r42, AnimData r43, ParticleData r44, List r45, byte[] r46, int r47, DefaultConstructorMarker r48) {
        if ((r47 & 1) == 0) goto L5;
        byte r3 = WatchFaceEnumUtil.ElementType.PREVIEW.getValue();
    L7:
        if ((r47 & 8) == 0) goto L9;
        byte r6 = WatchFaceEnumUtil.ClickType.NONE.getValue();
    L11:
        if ((r47 & 16) == 0) goto L13;
        int r7 = WatchFaceEnumUtil.AlignType.LV_ALIGN_MM.getValue();
    L14:
        byte r2 = 0;
        if ((r47 & 32) == 0) goto L17;
        int r8 = 0;
    L19:
        if ((r47 & 64) == 0) goto L21;
        int r9 = 0;
    L23:
        if ((r47 & 128) == 0) goto L25;
        int r10 = 0;
    L27:
        if ((r47 & 256) == 0) goto L29;
        byte[] r11 = new byte[5];
    L30:
        int r4 = 3;
        DefaultConstructorMarker r5 = null;
        if ((r47 & 512) == 0) goto L33;
        PointerData r12 = new PointerData(r2, r2, r4, r5);
    L34:
        int r13 = 1;
        if ((r47 & 1024) == 0) goto L37;
        TimeDigitData r1 = new TimeDigitData(r2, r13, r5);
    L39:
        if ((r47 & 2048) == 0) goto L41;
        DateDigitData r14 = new DateDigitData(r2, r13, r5);
    L43:
        if ((r47 & 4096) == 0) goto L45;
        FrameData r15 = new FrameData(r2, r2, r4, r5);
    L47:
        if ((r47 & 8192) == 0) goto L49;
        AnimData r16 = new AnimData(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
    L51:
        if ((r47 & 16384) == 0) goto L53;
        ParticleData r17 = new ParticleData(r2, r13, r5);
    L55:
        if ((32768 & r47) == 0) goto L57;
        List r18 = new ArrayList();
    L59:
        if ((r47 & 65536) == 0) goto L62;
        byte[] r19 = new byte[8];
    L63:
        this(r3, r31, r32, r6, r7, r8, r9, r10, r11, r12, r1, r14, r15, r16, r17, r18, r19);
        return;
    L62:
        r19 = r46;
        goto L63
    L57:
        r18 = r45;
        goto L59
    L53:
        r17 = r44;
        goto L55
    L49:
        r16 = r43;
        goto L51
    L45:
        r15 = r42;
        goto L47
    L41:
        r14 = r41;
        goto L43
    L37:
        r1 = r40;
        goto L39
    L33:
        r12 = r39;
        goto L34
    L29:
        r11 = r38;
        goto L30
    L25:
        r10 = r37;
        goto L27
    L21:
        r9 = r36;
        goto L23
    L17:
        r8 = r35;
        goto L19
    L13:
        r7 = r34;
        goto L14
    L9:
        r6 = r33;
        goto L11
    L5:
        r3 = r30;
        goto L7
    }
}
