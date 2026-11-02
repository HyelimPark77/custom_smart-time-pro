package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public final enum AIFunctionType extends Enum<AIFunctionType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AIFunctionType[] $VALUES = null;
    public static final AIFunctionType AI = null;
    public static final AIFunctionType AI_NOTE = null;
    public static final AIFunctionType AI_TRANSLATION = null;
    public static final AIFunctionType APOLOGIZE = null;
    public static final AIFunctionType COMPLIMENT_MASTERS = null;
    public static final AIFunctionType DAILY_WEEKLY = null;
    public static final AIFunctionType DEAL_REVIEWS = null;
    public static final AIFunctionType DEVICE_EMOTION = null;
    public static final AIFunctionType DREAM_INTERPRETATION = null;
    public static final AIFunctionType EAT_HEALTHY = null;
    public static final AIFunctionType EVENT_PLANNING = null;
    public static final AIFunctionType E_MARKET_COPY = null;
    public static final AIFunctionType HEALTH_QA = null;
    public static final AIFunctionType HEALTH_QA_ANALYZE = null;
    public static final AIFunctionType HIGH_EQ_RESPONSE = null;
    public static final AIFunctionType LITTLE_RED_BOOK_STYLE = null;
    public static final AIFunctionType MARKET_ANALYSIS = null;
    public static final AIFunctionType MOMENTS_COPYWRITING = null;
    public static final AIFunctionType MULTI_DEVICE = null;
    public static final AIFunctionType PERSONAL_TRAINER = null;
    public static final AIFunctionType PSYCHOLOGICAL_COUNSELOR = null;
    public static final AIFunctionType SHORT_VIDEO_SCRIPTS = null;
    public static final AIFunctionType SIMULTANEOUS_INTERPRETATION = null;
    public static final AIFunctionType SURNAME = null;
    public static final AIFunctionType TRAVEL_GUIDES = null;
    private final int type;

    private static final /* synthetic */ AIFunctionType[] $values() {
        return new AIFunctionType[]{AI, HEALTH_QA, PERSONAL_TRAINER, EAT_HEALTHY, DEAL_REVIEWS, HIGH_EQ_RESPONSE, SURNAME, PSYCHOLOGICAL_COUNSELOR, COMPLIMENT_MASTERS, APOLOGIZE, DREAM_INTERPRETATION, EVENT_PLANNING, SHORT_VIDEO_SCRIPTS, E_MARKET_COPY, DAILY_WEEKLY, MARKET_ANALYSIS, MOMENTS_COPYWRITING, TRAVEL_GUIDES, LITTLE_RED_BOOK_STYLE, AI_TRANSLATION, SIMULTANEOUS_INTERPRETATION, HEALTH_QA_ANALYZE, AI_NOTE, MULTI_DEVICE, DEVICE_EMOTION};
    }

    static {
        AI = new AIFunctionType("AI", 0, 257);
        HEALTH_QA = new AIFunctionType("HEALTH_QA", 1, 258);
        PERSONAL_TRAINER = new AIFunctionType("PERSONAL_TRAINER", 2, 259);
        EAT_HEALTHY = new AIFunctionType("EAT_HEALTHY", 3, 260);
        DEAL_REVIEWS = new AIFunctionType("DEAL_REVIEWS", 4, 261);
        HIGH_EQ_RESPONSE = new AIFunctionType("HIGH_EQ_RESPONSE", 5, 262);
        SURNAME = new AIFunctionType("SURNAME", 6, 263);
        PSYCHOLOGICAL_COUNSELOR = new AIFunctionType("PSYCHOLOGICAL_COUNSELOR", 7, 264);
        COMPLIMENT_MASTERS = new AIFunctionType("COMPLIMENT_MASTERS", 8, 265);
        APOLOGIZE = new AIFunctionType("APOLOGIZE", 9, 266);
        DREAM_INTERPRETATION = new AIFunctionType("DREAM_INTERPRETATION", 10, 267);
        EVENT_PLANNING = new AIFunctionType("EVENT_PLANNING", 11, 513);
        SHORT_VIDEO_SCRIPTS = new AIFunctionType("SHORT_VIDEO_SCRIPTS", 12, 514);
        E_MARKET_COPY = new AIFunctionType("E_MARKET_COPY", 13, 515);
        DAILY_WEEKLY = new AIFunctionType("DAILY_WEEKLY", 14, 516);
        MARKET_ANALYSIS = new AIFunctionType("MARKET_ANALYSIS", 15, 517);
        MOMENTS_COPYWRITING = new AIFunctionType("MOMENTS_COPYWRITING", 16, 769);
        TRAVEL_GUIDES = new AIFunctionType("TRAVEL_GUIDES", 17, 770);
        LITTLE_RED_BOOK_STYLE = new AIFunctionType("LITTLE_RED_BOOK_STYLE", 18, 771);
        AI_TRANSLATION = new AIFunctionType("AI_TRANSLATION", 19, 1025);
        SIMULTANEOUS_INTERPRETATION = new AIFunctionType("SIMULTANEOUS_INTERPRETATION", 20, 1026);
        HEALTH_QA_ANALYZE = new AIFunctionType("HEALTH_QA_ANALYZE", 21, 1027);
        AI_NOTE = new AIFunctionType("AI_NOTE", 22, 1028);
        MULTI_DEVICE = new AIFunctionType("MULTI_DEVICE", 23, 1029);
        DEVICE_EMOTION = new AIFunctionType("DEVICE_EMOTION", 24, 1030);
        AIFunctionType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private AIFunctionType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<AIFunctionType> getEntries() {
        return $ENTRIES;
    }

    public static AIFunctionType valueOf(String r1) {
        return (AIFunctionType) Enum.valueOf(AIFunctionType.class, r1);
    }

    public static AIFunctionType[] values() {
        return (AIFunctionType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
