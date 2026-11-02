package com.sma.smartv3.db.entity;

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

    public TranslateSessionWithFirstEntity(@aa1 TranslateSessionEntity r2, @aa1 TranslateEntity r3) {
        Intrinsics.X0O(r2, "session");
        Intrinsics.X0O(r3, "translations");
        this.session = r2;
        this.translations = r3;
    }

    public static /* synthetic */ TranslateSessionWithFirstEntity copy$default(TranslateSessionWithFirstEntity r0, TranslateSessionEntity r1, TranslateEntity r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.session;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.translations;
    L9:
        return r0.copy(r1, r2);
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
    public final TranslateSessionWithFirstEntity copy(@aa1 TranslateSessionEntity r2, @aa1 TranslateEntity r3) {
        Intrinsics.X0O(r2, "session");
        Intrinsics.X0O(r3, "translations");
        return new TranslateSessionWithFirstEntity(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TranslateSessionWithFirstEntity) == true) goto L8;
        return false;
    L8:
        TranslateSessionWithFirstEntity r6 = (TranslateSessionWithFirstEntity) r5;
        if (Intrinsics.XOO0ii0(this.session, r6.session) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.translations, r6.translations) == true) goto L14;
        return false;
    L14:
        return true;
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
        return "TranslateSessionWithFirstEntity(session=" + this.session + ", translations=" + this.translations + I000IiI1O.iO.iO;
    }
}
