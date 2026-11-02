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
        this(null, null, null, null, null, 0, 0.0f, 0.0f, 0.0f, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslationTime copy$default(TranslationTime translationTime, Integer num, Integer num2, Double d, Integer num3, String str, int i, float f, float f2, float f3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = translationTime.getPointFlag;
        }
        if ((i2 & 2) != 0) {
            num2 = translationTime.points;
        }
        if ((i2 & 4) != 0) {
            d = translationTime.translatedMin;
        }
        if ((i2 & 8) != 0) {
            num3 = translationTime.translatedFree;
        }
        if ((i2 & 16) != 0) {
            str = translationTime.macAdd;
        }
        if ((i2 & 32) != 0) {
            i = translationTime.userId;
        }
        if ((i2 & 64) != 0) {
            f = translationTime.freeMin;
        }
        if ((i2 & 128) != 0) {
            f2 = translationTime.totalBuyMin;
        }
        if ((i2 & 256) != 0) {
            f3 = translationTime.buyMin;
        }
        if ((i2 & 512) != 0) {
            list = translationTime.freeList;
        }
        float f4 = f3;
        List list2 = list;
        float f5 = f;
        float f6 = f2;
        String str2 = str;
        int i3 = i;
        return translationTime.copy(num, num2, d, num3, str2, i3, f5, f6, f4, list2);
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
    public final TranslationTime copy(@tb1 Integer num, @tb1 Integer num2, @tb1 Double d, @tb1 Integer num3, @tb1 String str, int i, float f, float f2, float f3, @tb1 List<TranslationFreeTimeEntity> list) {
        return new TranslationTime(num, num2, d, num3, str, i, f, f2, f3, list);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationTime)) {
            return false;
        }
        TranslationTime translationTime = (TranslationTime) obj;
        return Intrinsics.XOO0ii0(this.getPointFlag, translationTime.getPointFlag) && Intrinsics.XOO0ii0(this.points, translationTime.points) && Intrinsics.XOO0ii0(this.translatedMin, translationTime.translatedMin) && Intrinsics.XOO0ii0(this.translatedFree, translationTime.translatedFree) && Intrinsics.XOO0ii0(this.macAdd, translationTime.macAdd) && this.userId == translationTime.userId && Float.compare(this.freeMin, translationTime.freeMin) == 0 && Float.compare(this.totalBuyMin, translationTime.totalBuyMin) == 0 && Float.compare(this.buyMin, translationTime.buyMin) == 0 && Intrinsics.XOO0ii0(this.freeList, translationTime.freeList);
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
        Integer num = this.getPointFlag;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.points;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.translatedMin;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.translatedFree;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.macAdd;
        int iHashCode5 = (((((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.userId)) * 31) + Float.hashCode(this.freeMin)) * 31) + Float.hashCode(this.totalBuyMin)) * 31) + Float.hashCode(this.buyMin)) * 31;
        List<TranslationFreeTimeEntity> list = this.freeList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @aa1
    public String toString() {
        return "TranslationTime(getPointFlag=" + this.getPointFlag + ", points=" + this.points + ", translatedMin=" + this.translatedMin + ", translatedFree=" + this.translatedFree + ", macAdd=" + this.macAdd + ", userId=" + this.userId + ", freeMin=" + this.freeMin + ", totalBuyMin=" + this.totalBuyMin + ", buyMin=" + this.buyMin + ", freeList=" + this.freeList + I000IiI1O.C2156iO.f1007iO;
    }

    public TranslationTime(@tb1 Integer num, @tb1 Integer num2, @tb1 Double d, @tb1 Integer num3, @tb1 String str, int i, float f, float f2, float f3, @tb1 List<TranslationFreeTimeEntity> list) {
        this.getPointFlag = num;
        this.points = num2;
        this.translatedMin = d;
        this.translatedFree = num3;
        this.macAdd = str;
        this.userId = i;
        this.freeMin = f;
        this.totalBuyMin = f2;
        this.buyMin = f3;
        this.freeList = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TranslationTime(Integer num, Integer num2, Double d, Integer num3, String str, int i, float f, float f2, float f3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4 = 0;
        this((i2 & 1) != 0 ? num4 : num, (i2 & 2) != 0 ? num4 : num2, (i2 & 4) != 0 ? Double.valueOf(0.0d) : d, (i2 & 8) == 0 ? num3 : 0, (i2 & 16) != 0 ? null : str, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? 0.0f : f, (i2 & 128) != 0 ? 0.0f : f2, (i2 & 256) == 0 ? f3 : 0.0f, (i2 & 512) != 0 ? null : list);
    }
}
