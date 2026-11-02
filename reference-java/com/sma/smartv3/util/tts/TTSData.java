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

    /* JADX INFO: renamed from: iO */
    @aa1
    public final TTSType f54941iO;

    public enum TTSType {
        Server;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<TTSType> getEntries() {
            return $ENTRIES;
        }
    }

    public TTSData(@aa1 String text, @aa1 String model, @aa1 TTSType type) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(type, "type");
        this.OXO1 = text;
        this.XIi00iiXO = model;
        this.f54941iO = type;
    }

    public static /* synthetic */ TTSData O00(TTSData tTSData, String str, String str2, TTSType tTSType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTSData.OXO1;
        }
        if ((i & 2) != 0) {
            str2 = tTSData.XIi00iiXO;
        }
        if ((i & 4) != 0) {
            tTSType = tTSData.f54941iO;
        }
        return tTSData.XO0O10(str, str2, tTSType);
    }

    @aa1
    public final TTSType I0IIOi() {
        return this.f54941iO;
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
    public final TTSData XO0O10(@aa1 String text, @aa1 String model, @aa1 TTSType type) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(model, "model");
        Intrinsics.X0O(type, "type");
        return new TTSData(text, model, type);
    }

    @aa1
    public final String XOO0ii0() {
        return this.OXO1;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTSData)) {
            return false;
        }
        TTSData tTSData = (TTSData) obj;
        return Intrinsics.XOO0ii0(this.OXO1, tTSData.OXO1) && Intrinsics.XOO0ii0(this.XIi00iiXO, tTSData.XIi00iiXO) && this.f54941iO == tTSData.f54941iO;
    }

    public int hashCode() {
        return (((this.OXO1.hashCode() * 31) + this.XIi00iiXO.hashCode()) * 31) + this.f54941iO.hashCode();
    }

    @aa1
    /* JADX INFO: renamed from: iO */
    public final TTSType m38864iO() {
        return this.f54941iO;
    }

    @aa1
    public String toString() {
        return "TTSData(text=" + this.OXO1 + ", model=" + this.XIi00iiXO + ", type=" + this.f54941iO + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ TTSData(String str, String str2, TTSType tTSType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? TTSType.Server : tTSType);
    }
}
