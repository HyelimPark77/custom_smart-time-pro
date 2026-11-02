package com.sma.smartv3.util.websocket;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public abstract class ConnectionState {

    public static final class OXO1 extends ConnectionState {

        @aa1
        public static final OXO1 OXO1 = null;

        static {
            OXO1 = new OXO1();
        }

        public OXO1() {
            super(null);
        }
    }

    public static final class XIi00iiXO extends ConnectionState {

        @aa1
        public static final XIi00iiXO OXO1 = null;

        static {
            OXO1 = new XIi00iiXO();
        }

        public XIi00iiXO() {
            super(null);
        }
    }

    public static final class XO0O10 extends ConnectionState {

        @aa1
        public final Throwable OXO1;

        public XO0O10(@aa1 Throwable r2) {
            Intrinsics.X0O(r2, "throwable");
            super(null);
            this.OXO1 = r2;
        }

        public static /* synthetic */ XO0O10 iO(XO0O10 r0, Throwable r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            return r0.XIi00iiXO(r1);
        }

        @aa1
        public final Throwable OXO1() {
            return this.OXO1;
        }

        @aa1
        public final XO0O10 XIi00iiXO(@aa1 Throwable r2) {
            Intrinsics.X0O(r2, "throwable");
            return new XO0O10(r2);
        }

        @aa1
        public final Throwable XO0O10() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof XO0O10) == true) goto L9;
            return false;
        L9:
            if (Intrinsics.XOO0ii0(this.OXO1, ((XO0O10) r4).OXO1) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.OXO1.hashCode();
        }

        @aa1
        public String toString() {
            return "Error(throwable=" + this.OXO1 + I000IiI1O.iO.iO;
        }
    }

    public static final class iO extends ConnectionState {

        @aa1
        public static final iO OXO1 = null;

        static {
            OXO1 = new iO();
        }

        public iO() {
            super(null);
        }
    }

    public /* synthetic */ ConnectionState(DefaultConstructorMarker r1) {
        this();
    }

    private ConnectionState() {
    }
}
