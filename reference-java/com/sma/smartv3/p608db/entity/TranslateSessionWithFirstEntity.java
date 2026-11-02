package com.sma.smartv3.p608db.entity;

import androidx.room.Embedded;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateSessionWithFirstEntity {

    @Embedded
    @aa1
    private final TranslateSessionEntity session;

    @Embedded(prefix = "child_")
    @aa1
    private final TranslateEntity translations;

    public TranslateSessionWithFirstEntity(@aa1 TranslateSessionEntity session, @aa1 TranslateEntity translations) {
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(translations, "translations");
        this.session = session;
        this.translations = translations;
    }

    public static /* synthetic */ TranslateSessionWithFirstEntity copy$default(TranslateSessionWithFirstEntity translateSessionWithFirstEntity, TranslateSessionEntity translateSessionEntity, TranslateEntity translateEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            translateSessionEntity = translateSessionWithFirstEntity.session;
        }
        if ((i & 2) != 0) {
            translateEntity = translateSessionWithFirstEntity.translations;
        }
        return translateSessionWithFirstEntity.copy(translateSessionEntity, translateEntity);
    }

    @aa1
    public final TranslateSessionEntity component1() {
        return this.session;
    }

    @aa1
    public final TranslateEntity component2() {
        return this.translations;
    }

    @aa1
    public final TranslateSessionWithFirstEntity copy(@aa1 TranslateSessionEntity session, @aa1 TranslateEntity translations) {
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(translations, "translations");
        return new TranslateSessionWithFirstEntity(session, translations);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateSessionWithFirstEntity)) {
            return false;
        }
        TranslateSessionWithFirstEntity translateSessionWithFirstEntity = (TranslateSessionWithFirstEntity) obj;
        return Intrinsics.XOO0ii0(this.session, translateSessionWithFirstEntity.session) && Intrinsics.XOO0ii0(this.translations, translateSessionWithFirstEntity.translations);
    }

    @aa1
    public final TranslateSessionEntity getSession() {
        return this.session;
    }

    @aa1
    public final TranslateEntity getTranslations() {
        return this.translations;
    }

    public int hashCode() {
        return (this.session.hashCode() * 31) + this.translations.hashCode();
    }

    @aa1
    public String toString() {
        return "TranslateSessionWithFirstEntity(session=" + this.session + ", translations=" + this.translations + I000IiI1O.C2156iO.f1007iO;
    }
}
