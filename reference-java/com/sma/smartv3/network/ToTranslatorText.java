package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class ToTranslatorText {

    @aa1
    public static final String FLAG_ORIGINAL_LANGUAGE = "originalLanguage";

    @aa1
    public static final String FLAG_SOURCE = "source";

    @aa1
    public static final String FLAG_TEXT_FORM = "textForm";

    @aa1
    public static final String FLAG_TRANSLATION_LANGUAGE = "translationLanguage";

    @aa1
    public static final ToTranslatorText INSTANCE = new ToTranslatorText();

    @aa1
    public static final String URL = "/translator/translatorText";

    private ToTranslatorText() {
    }
}
