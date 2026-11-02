package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AITranslatorText copy$default(AITranslatorText aITranslatorText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aITranslatorText.text;
        }
        if ((i & 2) != 0) {
            str2 = aITranslatorText.translationLanguage;
        }
        return aITranslatorText.copy(str, str2);
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
    public final AITranslatorText copy(@aa1 String text, @aa1 String translationLanguage) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(translationLanguage, "translationLanguage");
        return new AITranslatorText(text, translationLanguage);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITranslatorText)) {
            return false;
        }
        AITranslatorText aITranslatorText = (AITranslatorText) obj;
        return Intrinsics.XOO0ii0(this.text, aITranslatorText.text) && Intrinsics.XOO0ii0(this.translationLanguage, aITranslatorText.translationLanguage);
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

    public final void setText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.text = str;
    }

    public final void setTranslationLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.translationLanguage = str;
    }

    @aa1
    public String toString() {
        return "AITranslatorText(text=" + this.text + ", translationLanguage=" + this.translationLanguage + I000IiI1O.C2156iO.f1007iO;
    }

    public AITranslatorText(@aa1 String text, @aa1 String translationLanguage) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(translationLanguage, "translationLanguage");
        this.text = text;
        this.translationLanguage = translationLanguage;
    }

    public /* synthetic */ AITranslatorText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
