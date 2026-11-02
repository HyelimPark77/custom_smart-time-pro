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
        public static final OXO1 OXO1 = new OXO1();

        public OXO1() {
            super(null);
        }

        public boolean equals(@tb1 Object obj) {
            return this == obj || (obj instanceof OXO1);
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
        public static final XIi00iiXO OXO1 = new XIi00iiXO();

        public XIi00iiXO() {
            super(null);
        }

        public boolean equals(@tb1 Object obj) {
            return this == obj || (obj instanceof XIi00iiXO);
        }

        public int hashCode() {
            return 2066642645;
        }

        @aa1
        public String toString() {
            return "NORMAL";
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.dto.TransChargeState$iO */
    public static final class C18578iO extends TransChargeState {

        @aa1
        public static final C18578iO OXO1 = new C18578iO();

        public C18578iO() {
            super(null);
        }

        public boolean equals(@tb1 Object obj) {
            return this == obj || (obj instanceof C18578iO);
        }

        public int hashCode() {
            return 1584526324;
        }

        @aa1
        public String toString() {
            return "WARN";
        }
    }

    public /* synthetic */ TransChargeState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TransChargeState() {
    }
}
