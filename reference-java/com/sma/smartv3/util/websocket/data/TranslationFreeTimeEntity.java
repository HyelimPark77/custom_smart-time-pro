package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TranslationFreeTimeEntity {

    @aa1
    private final String expireTime;
    private final float remainDuration;
    private final float totalDuration;

    public TranslationFreeTimeEntity() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public static /* synthetic */ TranslationFreeTimeEntity copy$default(TranslationFreeTimeEntity translationFreeTimeEntity, float f, float f2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = translationFreeTimeEntity.totalDuration;
        }
        if ((i & 2) != 0) {
            f2 = translationFreeTimeEntity.remainDuration;
        }
        if ((i & 4) != 0) {
            str = translationFreeTimeEntity.expireTime;
        }
        return translationFreeTimeEntity.copy(f, f2, str);
    }

    public final float component1() {
        return this.totalDuration;
    }

    public final float component2() {
        return this.remainDuration;
    }

    @aa1
    public final String component3() {
        return this.expireTime;
    }

    @aa1
    public final TranslationFreeTimeEntity copy(float f, float f2, @aa1 String expireTime) {
        Intrinsics.X0O(expireTime, "expireTime");
        return new TranslationFreeTimeEntity(f, f2, expireTime);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationFreeTimeEntity)) {
            return false;
        }
        TranslationFreeTimeEntity translationFreeTimeEntity = (TranslationFreeTimeEntity) obj;
        return Float.compare(this.totalDuration, translationFreeTimeEntity.totalDuration) == 0 && Float.compare(this.remainDuration, translationFreeTimeEntity.remainDuration) == 0 && Intrinsics.XOO0ii0(this.expireTime, translationFreeTimeEntity.expireTime);
    }

    @aa1
    public final String getExpireTime() {
        return this.expireTime;
    }

    public final float getRemainDuration() {
        return this.remainDuration;
    }

    public final float getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (((Float.hashCode(this.totalDuration) * 31) + Float.hashCode(this.remainDuration)) * 31) + this.expireTime.hashCode();
    }

    @aa1
    public String toString() {
        return "TranslationFreeTimeEntity(totalDuration=" + this.totalDuration + ", remainDuration=" + this.remainDuration + ", expireTime=" + this.expireTime + I000IiI1O.C2156iO.f1007iO;
    }

    public TranslationFreeTimeEntity(float f, float f2, @aa1 String expireTime) {
        Intrinsics.X0O(expireTime, "expireTime");
        this.totalDuration = f;
        this.remainDuration = f2;
        this.expireTime = expireTime;
    }

    public /* synthetic */ TranslationFreeTimeEntity(float f, float f2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? "" : str);
    }
}
