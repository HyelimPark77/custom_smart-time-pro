package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class DeductionConfig extends JsonFieldContainer implements Serializable {
    private final int openAI_ChatPoints;
    private final int openAI_ImgPoints;

    public DeductionConfig() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ DeductionConfig copy$default(DeductionConfig r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.openAI_ImgPoints;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.openAI_ChatPoints;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.openAI_ImgPoints;
    }

    public final int component2() {
        return this.openAI_ChatPoints;
    }

    @aa1
    public final DeductionConfig copy(int r2, int r3) {
        return new DeductionConfig(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeductionConfig) == true) goto L8;
        return false;
    L8:
        DeductionConfig r6 = (DeductionConfig) r5;
        if (this.openAI_ImgPoints == r6.openAI_ImgPoints) goto L12;
        return false;
    L12:
        if (this.openAI_ChatPoints == r6.openAI_ChatPoints) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getOpenAI_ChatPoints() {
        return this.openAI_ChatPoints;
    }

    public final int getOpenAI_ImgPoints() {
        return this.openAI_ImgPoints;
    }

    public int hashCode() {
        return (Integer.hashCode(this.openAI_ImgPoints) * 31) + Integer.hashCode(this.openAI_ChatPoints);
    }

    @aa1
    public String toString() {
        return "DeductionConfig(openAI_ImgPoints=" + this.openAI_ImgPoints + ", openAI_ChatPoints=" + this.openAI_ChatPoints + I000IiI1O.iO.iO;
    }

    public DeductionConfig(int r1, int r2) {
        this.openAI_ImgPoints = r1;
        this.openAI_ChatPoints = r2;
    }

    public /* synthetic */ DeductionConfig(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
