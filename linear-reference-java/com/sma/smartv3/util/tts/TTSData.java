package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TTSData {

    @aa1
    public final String OXO1;

    @aa1
    public final String XIi00iiXO;

    @aa1
    public final TTSType iO;

    public static final enum TTSType extends Enum<TTSType> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ TTSType[] $VALUES = null;
        public static final TTSType Server = null;

        private static final /* synthetic */ TTSType[] $values() {
            return new TTSType[]{Server};
        }

        static {
            Server = new TTSType("Server", 0);
            TTSType[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private TTSType(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<TTSType> getEntries() {
            return $ENTRIES;
        }

        public static TTSType valueOf(String r1) {
            return (TTSType) Enum.valueOf(TTSType.class, r1);
        }

        public static TTSType[] values() {
            return (TTSType[]) $VALUES.clone();
        }
    }

    public TTSData(@aa1 String r2, @aa1 String r3, @aa1 TTSType r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, "model");
        Intrinsics.X0O(r4, "type");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = r4;
    }

    public static /* synthetic */ TTSData O00(TTSData r0, String r1, String r2, TTSType r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.OXO1;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.XIi00iiXO;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.iO;
    L12:
        return r0.XO0O10(r1, r2, r3);
    }

    @aa1
    public final TTSType I0IIOi() {
        return this.iO;
    }

    @aa1
    public final String IiI10X() {
        return this.XIi00iiXO;
    }

    @aa1
    public final String OXO1() {
        return this.OXO1;
    }

    @aa1
    public final String XIi00iiXO() {
        return this.XIi00iiXO;
    }

    @aa1
    public final TTSData XO0O10(@aa1 String r2, @aa1 String r3, @aa1 TTSType r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, "model");
        Intrinsics.X0O(r4, "type");
        return new TTSData(r2, r3, r4);
    }

    @aa1
    public final String XOO0ii0() {
        return this.OXO1;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TTSData) == true) goto L8;
        return false;
    L8:
        TTSData r6 = (TTSData) r5;
        if (Intrinsics.XOO0ii0(this.OXO1, r6.OXO1) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.XIi00iiXO, r6.XIi00iiXO) == true) goto L15;
        return false;
    L15:
        if (this.iO == r6.iO) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + this.iO.hashCode();
    }

    @aa1
    public final TTSType iO() {
        return this.iO;
    }

    @aa1
    public String toString() {
        return "TTSData(text=" + this.OXO1 + ", model=" + this.XIi00iiXO + ", type=" + this.iO + I000IiI1O.iO.iO;
    }

    public /* synthetic */ TTSData(String r1, String r2, TTSType r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = TTSType.Server;
    L8:
        this(r1, r2, r3);
    }
}
