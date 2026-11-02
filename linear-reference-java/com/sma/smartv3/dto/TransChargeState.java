package com.sma.smartv3.dto;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public abstract class TransChargeState {

    public static final class OXO1 extends TransChargeState {

        @aa1
        public static final OXO1 OXO1 = null;

        static {
            OXO1 = new OXO1();
        }

        public OXO1() {
            super(null);
        }

        public boolean equals(@tb1 Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof OXO1) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1859558970;
        }

        @aa1
        public String toString() {
            return "ERROR";
        }
    }

    public static final class XIi00iiXO extends TransChargeState {

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
            return 2066642645;
        }

        @aa1
        public String toString() {
            return "NORMAL";
        }
    }

    public static final class iO extends TransChargeState {

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
            return 1584526324;
        }

        @aa1
        public String toString() {
            return "WARN";
        }
    }

    public /* synthetic */ TransChargeState(DefaultConstructorMarker r1) {
        this();
    }

    private TransChargeState() {
    }
}
