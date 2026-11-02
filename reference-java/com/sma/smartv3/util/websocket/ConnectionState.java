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
        public static final OXO1 OXO1 = new OXO1();

        public OXO1() {
            super(null);
        }
    }

    public static final class XIi00iiXO extends ConnectionState {

        @aa1
        public static final XIi00iiXO OXO1 = new XIi00iiXO();

        public XIi00iiXO() {
            super(null);
        }
    }

    public static final class XO0O10 extends ConnectionState {

        @aa1
        public final Throwable OXO1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XO0O10(@aa1 Throwable throwable) {
            super(null);
            Intrinsics.X0O(throwable, "throwable");
            this.OXO1 = throwable;
        }

        /* JADX INFO: renamed from: iO */
        public static /* synthetic */ XO0O10 m38866iO(XO0O10 xo0o10, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = xo0o10.OXO1;
            }
            return xo0o10.XIi00iiXO(th);
        }

        @aa1
        public final Throwable OXO1() {
            return this.OXO1;
        }

        @aa1
        public final XO0O10 XIi00iiXO(@aa1 Throwable throwable) {
            Intrinsics.X0O(throwable, "throwable");
            return new XO0O10(throwable);
        }

        @aa1
        public final Throwable XO0O10() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof XO0O10) && Intrinsics.XOO0ii0(this.OXO1, ((XO0O10) obj).OXO1);
        }

        public int hashCode() {
            return this.OXO1.hashCode();
        }

        @aa1
        public String toString() {
            return "Error(throwable=" + this.OXO1 + I000IiI1O.C2156iO.f1007iO;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.util.websocket.ConnectionState$iO */
    public static final class C19062iO extends ConnectionState {

        @aa1
        public static final C19062iO OXO1 = new C19062iO();

        public C19062iO() {
            super(null);
        }
    }

    public /* synthetic */ ConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ConnectionState() {
    }
}
