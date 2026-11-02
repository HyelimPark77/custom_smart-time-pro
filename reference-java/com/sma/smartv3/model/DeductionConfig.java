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

    /* JADX WARN: Illegal instructions before constructor call */
    public DeductionConfig() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ DeductionConfig copy$default(DeductionConfig deductionConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = deductionConfig.openAI_ImgPoints;
        }
        if ((i3 & 2) != 0) {
            i2 = deductionConfig.openAI_ChatPoints;
        }
        return deductionConfig.copy(i, i2);
    }

    public final int component1() {
        return this.openAI_ImgPoints;
    }

    public final int component2() {
        return this.openAI_ChatPoints;
    }

    @aa1
    public final DeductionConfig copy(int i, int i2) {
        return new DeductionConfig(i, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeductionConfig)) {
            return false;
        }
        DeductionConfig deductionConfig = (DeductionConfig) obj;
        return this.openAI_ImgPoints == deductionConfig.openAI_ImgPoints && this.openAI_ChatPoints == deductionConfig.openAI_ChatPoints;
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
        return "DeductionConfig(openAI_ImgPoints=" + this.openAI_ImgPoints + ", openAI_ChatPoints=" + this.openAI_ChatPoints + I000IiI1O.C2156iO.f1007iO;
    }

    public DeductionConfig(int i, int i2) {
        this.openAI_ImgPoints = i;
        this.openAI_ChatPoints = i2;
    }

    public /* synthetic */ DeductionConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
