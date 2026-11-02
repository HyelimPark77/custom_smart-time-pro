package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ExternalKeyManager extends JsonFieldContainer {

    @aa1
    public static final String AI_KEY = "sma-ai-pro-key";

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String SPEECH_KEY = "sma-speech-key";

    @aa1
    private String first;

    @aa1
    private String second;
    private long timestamp;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ExternalKeyManager() {
        String r1 = null;
        String r2 = null;
        long r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ ExternalKeyManager copy$default(ExternalKeyManager r0, String r1, String r2, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.first;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.second;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.timestamp;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.first;
    }

    @aa1
    public final String component2() {
        return this.second;
    }

    public final long component3() {
        return this.timestamp;
    }

    @aa1
    public final ExternalKeyManager copy(@aa1 String r2, @aa1 String r3, long r4) {
        Intrinsics.X0O(r2, "first");
        Intrinsics.X0O(r3, "second");
        return new ExternalKeyManager(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ExternalKeyManager) == true) goto L8;
        return false;
    L8:
        ExternalKeyManager r9 = (ExternalKeyManager) r8;
        if (Intrinsics.XOO0ii0(this.first, r9.first) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.second, r9.second) == true) goto L15;
        return false;
    L15:
        if (this.timestamp == r9.timestamp) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getFirst() {
        return this.first;
    }

    @aa1
    public final String getSecond() {
        return this.second;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((this.first.hashCode() * 31) + this.second.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public final void setFirst(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.first = r2;
    }

    public final void setSecond(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.second = r2;
    }

    public final void setTimestamp(long r1) {
        this.timestamp = r1;
    }

    @aa1
    public String toString() {
        return "ExternalKeyManager(first=" + this.first + ", second=" + this.second + ", timestamp=" + this.timestamp + I000IiI1O.iO.iO;
    }

    public ExternalKeyManager(@aa1 String r2, @aa1 String r3, long r4) {
        Intrinsics.X0O(r2, "first");
        Intrinsics.X0O(r3, "second");
        this.first = r2;
        this.second = r3;
        this.timestamp = r4;
    }

    public /* synthetic */ ExternalKeyManager(String r2, String r3, long r4, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
