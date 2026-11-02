package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O00 {

    public static final class OXO1 extends O00 {

        @tb1
        public final Integer OXO1;

        @tb1
        public final String XIi00iiXO;

        public OXO1(@tb1 Integer r2, @tb1 String r3) {
            super(null);
            this.OXO1 = r2;
            this.XIi00iiXO = r3;
        }

        public static /* synthetic */ OXO1 XO0O10(OXO1 r0, Integer r1, String r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r0.XIi00iiXO;
        L9:
            return r0.iO(r1, r2);
        }

        @tb1
        public final String IiI10X() {
            return this.XIi00iiXO;
        }

        @tb1
        public final Integer O00() {
            return this.OXO1;
        }

        @tb1
        public final Integer OXO1() {
            return this.OXO1;
        }

        @tb1
        public final String XIi00iiXO() {
            return this.XIi00iiXO;
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof OXO1) == true) goto L8;
            return false;
        L8:
            OXO1 r6 = (OXO1) r5;
            if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Integer r0 = this.OXO1;
            int r1 = 0;
            if (r0 != null) goto L5;
            int r2 = 0;
        L6:
            int r3 = r2 * 31;
            String r4 = this.XIi00iiXO;
            if (r4 == null) goto L11;
            r1 = r4.hashCode();
        L11:
            return r3 + r1;
        L5:
            r2 = r0.hashCode();
            goto L6
        }

        @aa1
        public final OXO1 iO(@tb1 Integer r2, @tb1 String r3) {
            return new OXO1(r2, r3);
        }

        @aa1
        public String toString() {
            return "ERROR(code=" + this.OXO1 + ", msg=" + this.XIi00iiXO + I000IiI1O.iO.iO;
        }
    }

    public static final class XIi00iiXO extends O00 {

        @aa1
        public static final XIi00iiXO OXO1 = null;

        static {
            OXO1 = new XIi00iiXO();
        }

        public XIi00iiXO() {
            super(null);
        }

        public boolean equals(@tb1 Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof XIi00iiXO) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1052625209;
        }

        @aa1
        public String toString() {
            return "IDLE";
        }
    }

    public static final class iO extends O00 {

        @aa1
        public static final iO OXO1 = null;

        static {
            OXO1 = new iO();
        }

        public iO() {
            super(null);
        }

        public boolean equals(@tb1 Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof iO) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -543131506;
        }

        @aa1
        public String toString() {
            return "TRANSFERRING";
        }
    }

    public /* synthetic */ O00(DefaultConstructorMarker r1) {
        this();
    }

    public O00() {
    }
}
