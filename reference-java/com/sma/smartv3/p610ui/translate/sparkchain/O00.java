package com.sma.smartv3.p610ui.translate.sparkchain;

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

        public OXO1(@tb1 Integer num, @tb1 String str) {
            super(null);
            this.OXO1 = num;
            this.XIi00iiXO = str;
        }

        public static /* synthetic */ OXO1 XO0O10(OXO1 oxo1, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = oxo1.OXO1;
            }
            if ((i & 2) != 0) {
                str = oxo1.XIi00iiXO;
            }
            return oxo1.m38775iO(num, str);
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

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OXO1)) {
                return false;
            }
            OXO1 oxo1 = (OXO1) obj;
            return Intrinsics.XOO0ii0(this.OXO1, oxo1.OXO1) && Intrinsics.XOO0ii0(this.XIi00iiXO, oxo1.XIi00iiXO);
        }

        public int hashCode() {
            Integer num = this.OXO1;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.XIi00iiXO;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @aa1
        /* JADX INFO: renamed from: iO */
        public final OXO1 m38775iO(@tb1 Integer num, @tb1 String str) {
            return new OXO1(num, str);
        }

        @aa1
        public String toString() {
            return "ERROR(code=" + this.OXO1 + ", msg=" + this.XIi00iiXO + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public static final class XIi00iiXO extends O00 {

        @aa1
        public static final XIi00iiXO OXO1 = new XIi00iiXO();

        public XIi00iiXO() {
            super(null);
        }

        public boolean equals(@tb1 Object obj) {
            return this == obj || (obj instanceof XIi00iiXO);
        }

        public int hashCode() {
            return -1052625209;
        }

        @aa1
        public String toString() {
            return "IDLE";
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.O00$iO */
    public static final class C19012iO extends O00 {

        @aa1
        public static final C19012iO OXO1 = new C19012iO();

        public C19012iO() {
            super(null);
        }

        public boolean equals(@tb1 Object obj) {
            return this == obj || (obj instanceof C19012iO);
        }

        public int hashCode() {
            return -543131506;
        }

        @aa1
        public String toString() {
            return "TRANSFERRING";
        }
    }

    public /* synthetic */ O00(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public O00() {
    }
}
