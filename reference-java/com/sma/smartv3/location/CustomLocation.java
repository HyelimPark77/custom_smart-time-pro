package com.sma.smartv3.location;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CustomLocation {
    public float I0IIOi;

    /* JADX INFO: renamed from: IO */
    public float f51289IO;
    public long IiI10X;
    public int O00;
    public float OIi0;
    public double OXO1;
    public double XIi00iiXO;
    public float XO0O10;

    @aa1
    public TYPE XOO0ii0;

    /* JADX INFO: renamed from: iO */
    public double f51290iO;

    public enum TYPE {
        NORMAL(0),
        NET(1),
        OTHER(2);

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        TYPE(int i) {
        }

        @aa1
        public static EnumEntries<TYPE> getEntries() {
            return $ENTRIES;
        }
    }

    public CustomLocation() {
        this(0.0d, 0.0d, 0.0d, 0.0f, 0, 0L, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    public final float I0IIOi() {
        return this.XO0O10;
    }

    public final void I0iXXO(float f) {
        this.I0IIOi = f;
    }

    public final void I1XOi1(int i) {
        this.O00 = i;
    }

    public final void IIX1OXO(float f) {
        this.XO0O10 = f;
    }

    /* JADX INFO: renamed from: IO */
    public final float m38246IO() {
        return this.f51289IO;
    }

    public final double IiI10X() {
        return this.XIi00iiXO;
    }

    @aa1
    public final TYPE O00() {
        return this.XOO0ii0;
    }

    public final void O10IXXX0X(@aa1 TYPE type) {
        Intrinsics.X0O(type, "<set-?>");
        this.XOO0ii0 = type;
    }

    public final void OIX0iXi(double d) {
        this.f51290iO = d;
    }

    public final long OIi0() {
        return this.IiI10X;
    }

    public final double OXO1() {
        return this.f51290iO;
    }

    public final void X0O(double d) {
        this.XIi00iiXO = d;
    }

    public final void X1ii(double d) {
        this.OXO1 = d;
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

    public final void XXI(float f) {
        this.OIi0 = f;
    }

    public final void XiOIO(long j) {
        this.IiI10X = j;
    }

    public final void iIiiO(float f) {
        this.f51289IO = f;
    }

    /* JADX INFO: renamed from: iO */
    public final float m38247iO() {
        return this.OIi0;
    }

    public CustomLocation(double d, double d2, double d3, float f, int i, long j, @aa1 TYPE mLocationType, float f2, float f3, float f4) {
        Intrinsics.X0O(mLocationType, "mLocationType");
        this.OXO1 = d;
        this.XIi00iiXO = d2;
        this.f51290iO = d3;
        this.XO0O10 = f;
        this.O00 = i;
        this.IiI10X = j;
        this.XOO0ii0 = mLocationType;
        this.I0IIOi = f2;
        this.OIi0 = f3;
        this.f51289IO = f4;
    }

    public /* synthetic */ CustomLocation(double d, double d2, double d3, float f, int i, long j, TYPE type, float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) == 0 ? d3 : 0.0d, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? TYPE.NORMAL : type, (i2 & 128) != 0 ? 0.0f : f2, (i2 & 256) != 0 ? 0.0f : f3, (i2 & 512) != 0 ? 0.0f : f4);
    }
}
