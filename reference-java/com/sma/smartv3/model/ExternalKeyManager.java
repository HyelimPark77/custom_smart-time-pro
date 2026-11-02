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
    public static final Companion Companion = new Companion(null);

    @aa1
    public static final String SPEECH_KEY = "sma-speech-key";

    @aa1
    private String first;

    @aa1
    private String second;
    private long timestamp;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ExternalKeyManager() {
        this(null, null, 0L, 7, null);
    }

    public static /* synthetic */ ExternalKeyManager copy$default(ExternalKeyManager externalKeyManager, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalKeyManager.first;
        }
        if ((i & 2) != 0) {
            str2 = externalKeyManager.second;
        }
        if ((i & 4) != 0) {
            j = externalKeyManager.timestamp;
        }
        return externalKeyManager.copy(str, str2, j);
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
    public final ExternalKeyManager copy(@aa1 String first, @aa1 String second, long j) {
        Intrinsics.X0O(first, "first");
        Intrinsics.X0O(second, "second");
        return new ExternalKeyManager(first, second, j);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalKeyManager)) {
            return false;
        }
        ExternalKeyManager externalKeyManager = (ExternalKeyManager) obj;
        return Intrinsics.XOO0ii0(this.first, externalKeyManager.first) && Intrinsics.XOO0ii0(this.second, externalKeyManager.second) && this.timestamp == externalKeyManager.timestamp;
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

    public final void setFirst(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.first = str;
    }

    public final void setSecond(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.second = str;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @aa1
    public String toString() {
        return "ExternalKeyManager(first=" + this.first + ", second=" + this.second + ", timestamp=" + this.timestamp + I000IiI1O.C2156iO.f1007iO;
    }

    public ExternalKeyManager(@aa1 String first, @aa1 String second, long j) {
        Intrinsics.X0O(first, "first");
        Intrinsics.X0O(second, "second");
        this.first = first;
        this.second = second;
        this.timestamp = j;
    }

    public /* synthetic */ ExternalKeyManager(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j);
    }
}
