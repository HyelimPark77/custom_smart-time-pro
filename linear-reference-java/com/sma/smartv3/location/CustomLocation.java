package com.sma.smartv3.location;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CustomLocation {
    public float I0IIOi;
    public float IO;
    public long IiI10X;
    public int O00;
    public float OIi0;
    public double OXO1;
    public double XIi00iiXO;
    public float XO0O10;

    @aa1
    public TYPE XOO0ii0;
    public double iO;

    public static final enum TYPE extends Enum<TYPE> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ TYPE[] $VALUES = null;
        public static final TYPE NET = null;
        public static final TYPE NORMAL = null;
        public static final TYPE OTHER = null;

        private static final /* synthetic */ TYPE[] $values() {
            return new TYPE[]{NORMAL, NET, OTHER};
        }

        static {
            NORMAL = new TYPE("NORMAL", 0, 0);
            NET = new TYPE("NET", 1, 1);
            OTHER = new TYPE("OTHER", 2, 2);
            TYPE[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private TYPE(String r1, int r2, int r3) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<TYPE> getEntries() {
            return $ENTRIES;
        }

        public static TYPE valueOf(String r1) {
            return (TYPE) Enum.valueOf(TYPE.class, r1);
        }

        public static TYPE[] values() {
            return (TYPE[]) $VALUES.clone();
        }
    }

    public CustomLocation() {
        double r1 = 0.0d;
        double r3 = 0.0d;
        double r5 = 0.0d;
        float r7 = 0.0f;
        int r8 = 0;
        long r9 = 0;
        TYPE r11 = null;
        float r12 = 0.0f;
        float r13 = 0.0f;
        float r14 = 0.0f;
        this(r1, r3, r5, r7, r8, r9, r11, r12, r13, r14, 1023, null);
    }

    public final float I0IIOi() {
        return this.XO0O10;
    }

    public final void I0iXXO(float r1) {
        this.I0IIOi = r1;
    }

    public final void I1XOi1(int r1) {
        this.O00 = r1;
    }

    public final void IIX1OXO(float r1) {
        this.XO0O10 = r1;
    }

    public final float IO() {
        return this.IO;
    }

    public final double IiI10X() {
        return this.XIi00iiXO;
    }

    @aa1
    public final TYPE O00() {
        return this.XOO0ii0;
    }

    public final void O10IXXX0X(@aa1 TYPE r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XOO0ii0 = r2;
    }

    public final void OIX0iXi(double r1) {
        this.iO = r1;
    }

    public final long OIi0() {
        return this.IiI10X;
    }

    public final double OXO1() {
        return this.iO;
    }

    public final void X0O(double r1) {
        this.XIi00iiXO = r1;
    }

    public final void X1ii(double r1) {
        this.OXO1 = r1;
    }

    public final float XIi00iiXO() {
        return this.I0IIOi;
    }

    public final double XO0O10() {
        return this.OXO1;
    }

    public final int XOO0ii0() {
        return this.O00;
    }

    public final void XXI(float r1) {
        this.OIi0 = r1;
    }

    public final void XiOIO(long r1) {
        this.IiI10X = r1;
    }

    public final void iIiiO(float r1) {
        this.IO = r1;
    }

    public final float iO() {
        return this.OIi0;
    }

    public CustomLocation(double r2, double r4, double r6, float r8, int r9, long r10, @aa1 TYPE r12, float r13, float r14, float r15) {
        Intrinsics.X0O(r12, "mLocationType");
        this.OXO1 = r2;
        this.XIi00iiXO = r4;
        this.iO = r6;
        this.XO0O10 = r8;
        this.O00 = r9;
        this.IiI10X = r10;
        this.XOO0ii0 = r12;
        this.I0IIOi = r13;
        this.OIi0 = r14;
        this.IO = r15;
    }

    public /* synthetic */ CustomLocation(double r16, double r18, double r20, float r22, int r23, long r24, TYPE r26, float r27, float r28, float r29, int r30, DefaultConstructorMarker r31) {
        double r2 = 0.0d;
        if ((r30 & 1) == 0) goto L5;
        double r4 = 0.0d;
    L7:
        if ((r30 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r30 & 4) != 0) goto L15;
        r2 = r20;
    L15:
        if ((r30 & 8) == 0) goto L17;
        float r1 = 0.0f;
    L19:
        if ((r30 & 16) == 0) goto L21;
        int r9 = 0;
    L23:
        if ((r30 & 32) == 0) goto L25;
        long r10 = 0;
    L27:
        if ((r30 & 64) == 0) goto L29;
        TYPE r12 = TYPE.NORMAL;
    L31:
        if ((r30 & 128) == 0) goto L33;
        float r13 = 0.0f;
    L35:
        if ((r30 & 256) == 0) goto L37;
        float r14 = 0.0f;
    L39:
        if ((r30 & 512) == 0) goto L42;
        float r32 = 0.0f;
    L43:
        this(r4, r6, r2, r1, r9, r10, r12, r13, r14, r32);
        return;
    L42:
        r32 = r29;
        goto L43
    L37:
        r14 = r28;
        goto L39
    L33:
        r13 = r27;
        goto L35
    L29:
        r12 = r26;
        goto L31
    L25:
        r10 = r24;
        goto L27
    L21:
        r9 = r23;
        goto L23
    L17:
        r1 = r22;
        goto L19
    L9:
        r6 = r18;
        goto L11
    L5:
        r4 = r16;
        goto L7
    }
}
