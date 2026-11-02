package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TranslationTime {
    private final float buyMin;

    @tb1
    private final List<TranslationFreeTimeEntity> freeList;
    private final float freeMin;

    @tb1
    private final Integer getPointFlag;

    @tb1
    private final String macAdd;

    @tb1
    private final Integer points;
    private final float totalBuyMin;

    @tb1
    private final Integer translatedFree;

    @tb1
    private final Double translatedMin;
    private final int userId;

    public TranslationTime() {
        Integer r1 = null;
        Integer r2 = null;
        Double r3 = null;
        Integer r4 = null;
        String r5 = null;
        int r6 = 0;
        float r7 = 0.0f;
        float r8 = 0.0f;
        float r9 = 0.0f;
        List r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslationTime copy$default(TranslationTime r0, Integer r1, Integer r2, Double r3, Integer r4, String r5, int r6, float r7, float r8, float r9, List r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.getPointFlag;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.points;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.translatedMin;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.translatedFree;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.macAdd;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.userId;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.freeMin;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.totalBuyMin;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.buyMin;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.freeList;
    L32:
        float r13 = r9;
        List r14 = r10;
        float r15 = r7;
        float r16 = r8;
        String r17 = r5;
        int r18 = r6;
        Double r19 = r3;
        Integer r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    @tb1
    public final Integer component1() {
        return this.getPointFlag;
    }

    @tb1
    public final List<TranslationFreeTimeEntity> component10() {
        return this.freeList;
    }

    @tb1
    public final Integer component2() {
        return this.points;
    }

    @tb1
    public final Double component3() {
        return this.translatedMin;
    }

    @tb1
    public final Integer component4() {
        return this.translatedFree;
    }

    @tb1
    public final String component5() {
        return this.macAdd;
    }

    public final int component6() {
        return this.userId;
    }

    public final float component7() {
        return this.freeMin;
    }

    public final float component8() {
        return this.totalBuyMin;
    }

    public final float component9() {
        return this.buyMin;
    }

    @aa1
    public final TranslationTime copy(@tb1 Integer r12, @tb1 Integer r13, @tb1 Double r14, @tb1 Integer r15, @tb1 String r16, int r17, float r18, float r19, float r20, @tb1 List<TranslationFreeTimeEntity> r21) {
        return new TranslationTime(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TranslationTime) == true) goto L8;
        return false;
    L8:
        TranslationTime r6 = (TranslationTime) r5;
        if (Intrinsics.XOO0ii0(this.getPointFlag, r6.getPointFlag) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.points, r6.points) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.translatedMin, r6.translatedMin) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.translatedFree, r6.translatedFree) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.macAdd, r6.macAdd) == true) goto L24;
        return false;
    L24:
        if (this.userId == r6.userId) goto L27;
        return false;
    L27:
        if (Float.compare(this.freeMin, r6.freeMin) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.totalBuyMin, r6.totalBuyMin) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.buyMin, r6.buyMin) == 0) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.freeList, r6.freeList) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final float getBuyMin() {
        return this.buyMin;
    }

    @tb1
    public final List<TranslationFreeTimeEntity> getFreeList() {
        return this.freeList;
    }

    public final float getFreeMin() {
        return this.freeMin;
    }

    @tb1
    public final Integer getGetPointFlag() {
        return this.getPointFlag;
    }

    @tb1
    public final String getMacAdd() {
        return this.macAdd;
    }

    @tb1
    public final Integer getPoints() {
        return this.points;
    }

    public final float getTotalBuyMin() {
        return this.totalBuyMin;
    }

    @tb1
    public final Integer getTranslatedFree() {
        return this.translatedFree;
    }

    @tb1
    public final Double getTranslatedMin() {
        return this.translatedMin;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer r0 = this.getPointFlag;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Integer r4 = this.points;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        Double r7 = this.translatedMin;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Integer r10 = this.translatedFree;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        String r13 = this.macAdd;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (((((((((r12 + r14) * 31) + Integer.hashCode(this.userId)) * 31) + Float.hashCode(this.freeMin)) * 31) + Float.hashCode(this.totalBuyMin)) * 31) + Float.hashCode(this.buyMin)) * 31;
        List<TranslationFreeTimeEntity> r16 = this.freeList;
        if (r16 == null) goto L27;
        r1 = r16.hashCode();
    L27:
        return r15 + r1;
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    @aa1
    public String toString() {
        return "TranslationTime(getPointFlag=" + this.getPointFlag + ", points=" + this.points + ", translatedMin=" + this.translatedMin + ", translatedFree=" + this.translatedFree + ", macAdd=" + this.macAdd + ", userId=" + this.userId + ", freeMin=" + this.freeMin + ", totalBuyMin=" + this.totalBuyMin + ", buyMin=" + this.buyMin + ", freeList=" + this.freeList + I000IiI1O.iO.iO;
    }

    public TranslationTime(@tb1 Integer r1, @tb1 Integer r2, @tb1 Double r3, @tb1 Integer r4, @tb1 String r5, int r6, float r7, float r8, float r9, @tb1 List<TranslationFreeTimeEntity> r10) {
        this.getPointFlag = r1;
        this.points = r2;
        this.translatedMin = r3;
        this.translatedFree = r4;
        this.macAdd = r5;
        this.userId = r6;
        this.freeMin = r7;
        this.totalBuyMin = r8;
        this.buyMin = r9;
        this.freeList = r10;
    }

    public /* synthetic */ TranslationTime(Integer r10, Integer r11, Double r12, Integer r13, String r14, int r15, float r16, float r17, float r18, List r19, int r20, DefaultConstructorMarker r21) {
        int r2 = 0;
        Integer r3 = 0;
        if ((r20 & 1) == 0) goto L6;
        r10 = r3;
    L6:
        if ((r20 & 2) == 0) goto L9;
        r11 = r3;
    L9:
        if ((r20 & 4) == 0) goto L12;
        r12 = Double.valueOf(0.0d);
    L12:
        if ((r20 & 8) != 0) goto L16;
        r3 = r13;
    L16:
        if ((r20 & 16) == 0) goto L18;
        String r1 = null;
    L20:
        if ((r20 & 32) != 0) goto L23;
        r2 = r15;
    L23:
        float r6 = 0.0f;
        if ((r20 & 64) == 0) goto L26;
        float r5 = 0.0f;
    L28:
        if ((r20 & 128) == 0) goto L30;
        float r7 = 0.0f;
    L32:
        if ((r20 & 256) != 0) goto L36;
        r6 = r18;
    L36:
        if ((r20 & 512) == 0) goto L39;
        List r22 = null;
    L38:
        Double r110 = r12;
        this(r10, r11, r110, r3, r1, r2, r5, r7, r6, r22);
        return;
    L39:
        r22 = r19;
        goto L38
    L30:
        r7 = r17;
        goto L32
    L26:
        r5 = r16;
        goto L28
    L18:
        r1 = r14;
        goto L20
    }
}
