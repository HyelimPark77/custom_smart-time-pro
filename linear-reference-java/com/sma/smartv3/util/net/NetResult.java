package com.sma.smartv3.util.net;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public abstract class NetResult<T> {

    public static final class OXO1 extends NetResult {

        @aa1
        public final String OXO1;

        public OXO1(@aa1 String r2) {
            Intrinsics.X0O(r2, "msg");
            super(null);
            this.OXO1 = r2;
        }

        public static /* synthetic */ OXO1 iO(OXO1 r0, String r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            return r0.XIi00iiXO(r1);
        }

        @aa1
        public final String OXO1() {
            return this.OXO1;
        }

        @aa1
        public final OXO1 XIi00iiXO(@aa1 String r2) {
            Intrinsics.X0O(r2, "msg");
            return new OXO1(r2);
        }

        @aa1
        public final String XO0O10() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof OXO1) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.OXO1, ((OXO1) r4).OXO1) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.OXO1.hashCode();
        }

        @aa1
        public String toString() {
            return "Error(msg=" + this.OXO1 + I000IiI1O.iO.iO;
        }
    }

    public static final class XIi00iiXO<T> extends NetResult<T> {

        @tb1
        public final T OXO1;

        public XIi00iiXO(@tb1 T r2) {
            super(null);
            this.OXO1 = r2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ XIi00iiXO iO(XIi00iiXO r0, Object r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            return r0.XIi00iiXO(r1);
        }

        @tb1
        public final T OXO1() {
            return this.OXO1;
        }

        @aa1
        public final XIi00iiXO<T> XIi00iiXO(@tb1 T r2) {
            return new XIi00iiXO(r2);
        }

        @tb1
        public final T XO0O10() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof XIi00iiXO) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.OXO1, ((XIi00iiXO) r4).OXO1) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            T r0 = this.OXO1;
            if (r0 != null) goto L7;
            return 0;
        L7:
            return r0.hashCode();
        }

        @aa1
        public String toString() {
            return "Success(data=" + this.OXO1 + I000IiI1O.iO.iO;
        }
    }

    public /* synthetic */ NetResult(DefaultConstructorMarker r1) {
        this();
    }

    private NetResult() {
    }
}
