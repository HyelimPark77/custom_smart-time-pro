package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetAIAudioToText {

    @aa1
    public static final GetAIAudioToText INSTANCE = null;

    @aa1
    public static final String URL = "/ai/audio2Text";

    @aa1
    public static final String URL_V2 = "/ai/v2/audio2Text";

    static {
        INSTANCE = new GetAIAudioToText();
    }

    private GetAIAudioToText() {
    }
}
