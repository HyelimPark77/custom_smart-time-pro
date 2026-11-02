package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetAISummary {

    @aa1
    public static final String AI_MODEL = "model";

    @aa1
    public static final String AUDIO_FILE_URL = "audioFileUrl";

    @aa1
    public static final GetAISummary INSTANCE = new GetAISummary();

    @aa1
    public static final String LANGUAGE = "language";

    @aa1
    public static final String NOTE_TIMESTAMPS = "noteTimestamps";

    @aa1
    public static final String PROMPT_ID = "promptId";

    @aa1
    public static final String TEXT = "text";

    @aa1
    public static final String URL = "/ai/aiSummary";

    @aa1
    public static final String URL_V2 = "/ai/aiSummary/v2";

    @aa1
    public static final String URL_V3 = "/ai/aiSummary/v3";

    @aa1
    public static final String diarizationEnabled = "diarizationEnabled";

    private GetAISummary() {
    }
}
