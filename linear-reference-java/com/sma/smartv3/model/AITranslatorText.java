package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.ToTranslatorText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AITranslatorText {

    @aa1
    private String text;

    @aa1
    private String translationLanguage;

    /* JADX WARN: Multi-variable type inference failed */
    public AITranslatorText() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AITranslatorText copy$default(AITranslatorText r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.text;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.translationLanguage;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.text;
    }

    @aa1
    public final String component2() {
        return this.translationLanguage;
    }

    @aa1
    public final AITranslatorText copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, ToTranslatorText.FLAG_TRANSLATION_LANGUAGE);
        return new AITranslatorText(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AITranslatorText) == true) goto L8;
        return false;
    L8:
        AITranslatorText r6 = (AITranslatorText) r5;
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.translationLanguage, r6.translationLanguage) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    @aa1
    public final String getTranslationLanguage() {
        return this.translationLanguage;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.translationLanguage.hashCode();
    }

    public final void setText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.text = r2;
    }

    public final void setTranslationLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.translationLanguage = r2;
    }

    @aa1
    public String toString() {
        return "AITranslatorText(text=" + this.text + ", translationLanguage=" + this.translationLanguage + I000IiI1O.iO.iO;
    }

    public AITranslatorText(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, ToTranslatorText.FLAG_TRANSLATION_LANGUAGE);
        this.text = r2;
        this.translationLanguage = r3;
    }

    public /* synthetic */ AITranslatorText(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
