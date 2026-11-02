package com.sma.smartv3.p608db.entity;

import androidx.room.Embedded;
import androidx.room.Relation;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TranslateSessionWithTranslation {

    @Embedded
    @aa1
    private final TranslateSessionEntity session;

    @Relation(entityColumn = JsonStorageKeyNames.SESSION_ID_KEY, parentColumn = JsonStorageKeyNames.SESSION_ID_KEY)
    @aa1
    private final List<TranslateEntity> translations;

    public TranslateSessionWithTranslation(@aa1 TranslateSessionEntity session, @aa1 List<TranslateEntity> translations) {
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(translations, "translations");
        this.session = session;
        this.translations = translations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslateSessionWithTranslation copy$default(TranslateSessionWithTranslation translateSessionWithTranslation, TranslateSessionEntity translateSessionEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            translateSessionEntity = translateSessionWithTranslation.session;
        }
        if ((i & 2) != 0) {
            list = translateSessionWithTranslation.translations;
        }
        return translateSessionWithTranslation.copy(translateSessionEntity, list);
    }

    @aa1
    public final TranslateSessionEntity component1() {
        return this.session;
    }

    @aa1
    public final List<TranslateEntity> component2() {
        return this.translations;
    }

    @aa1
    public final TranslateSessionWithTranslation copy(@aa1 TranslateSessionEntity session, @aa1 List<TranslateEntity> translations) {
        Intrinsics.X0O(session, "session");
        Intrinsics.X0O(translations, "translations");
        return new TranslateSessionWithTranslation(session, translations);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateSessionWithTranslation)) {
            return false;
        }
        TranslateSessionWithTranslation translateSessionWithTranslation = (TranslateSessionWithTranslation) obj;
        return Intrinsics.XOO0ii0(this.session, translateSessionWithTranslation.session) && Intrinsics.XOO0ii0(this.translations, translateSessionWithTranslation.translations);
    }

    @aa1
    public final TranslateSessionEntity getSession() {
        return this.session;
    }

    @aa1
    public final List<TranslateEntity> getTranslations() {
        return this.translations;
    }

    public int hashCode() {
        return (this.session.hashCode() * 31) + this.translations.hashCode();
    }

    @aa1
    public String toString() {
        return "TranslateSessionWithTranslation(session=" + this.session + ", translations=" + this.translations + I000IiI1O.C2156iO.f1007iO;
    }
}
