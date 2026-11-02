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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OXO1(@aa1 String msg) {
            super(null);
            Intrinsics.X0O(msg, "msg");
            this.OXO1 = msg;
        }

        /* JADX INFO: renamed from: iO */
        public static /* synthetic */ OXO1 m38856iO(OXO1 oxo1, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oxo1.OXO1;
            }
            return oxo1.XIi00iiXO(str);
        }

        @aa1
        public final String OXO1() {
            return this.OXO1;
        }

        @aa1
        public final OXO1 XIi00iiXO(@aa1 String msg) {
            Intrinsics.X0O(msg, "msg");
            return new OXO1(msg);
        }

        @aa1
        public final String XO0O10() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OXO1) && Intrinsics.XOO0ii0(this.OXO1, ((OXO1) obj).OXO1);
        }

        public int hashCode() {
            return this.OXO1.hashCode();
        }

        @aa1
        public String toString() {
            return "Error(msg=" + this.OXO1 + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public static final class XIi00iiXO<T> extends NetResult<T> {

        @tb1
        public final T OXO1;

        public XIi00iiXO(@tb1 T t) {
            super(null);
            this.OXO1 = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: iO */
        public static /* synthetic */ XIi00iiXO m38857iO(XIi00iiXO xIi00iiXO, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = xIi00iiXO.OXO1;
            }
            return xIi00iiXO.XIi00iiXO(obj);
        }

        @tb1
        public final T OXO1() {
            return this.OXO1;
        }

        @aa1
        public final XIi00iiXO<T> XIi00iiXO(@tb1 T t) {
            return new XIi00iiXO<>(t);
        }

        @tb1
        public final T XO0O10() {
            return this.OXO1;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof XIi00iiXO) && Intrinsics.XOO0ii0(this.OXO1, ((XIi00iiXO) obj).OXO1);
        }

        public int hashCode() {
            T t = this.OXO1;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @aa1
        public String toString() {
            return "Success(data=" + this.OXO1 + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public /* synthetic */ NetResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetResult() {
    }
}
