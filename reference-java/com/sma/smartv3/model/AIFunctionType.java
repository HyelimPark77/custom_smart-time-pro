package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes19.dex */
public enum AIFunctionType {
    AI(257),
    HEALTH_QA(258),
    PERSONAL_TRAINER(259),
    EAT_HEALTHY(260),
    DEAL_REVIEWS(261),
    HIGH_EQ_RESPONSE(262),
    SURNAME(263),
    PSYCHOLOGICAL_COUNSELOR(264),
    COMPLIMENT_MASTERS(265),
    APOLOGIZE(266),
    DREAM_INTERPRETATION(267),
    EVENT_PLANNING(513),
    SHORT_VIDEO_SCRIPTS(514),
    E_MARKET_COPY(515),
    DAILY_WEEKLY(516),
    MARKET_ANALYSIS(517),
    MOMENTS_COPYWRITING(769),
    TRAVEL_GUIDES(770),
    LITTLE_RED_BOOK_STYLE(771),
    AI_TRANSLATION(1025),
    SIMULTANEOUS_INTERPRETATION(1026),
    HEALTH_QA_ANALYZE(1027),
    AI_NOTE(1028),
    MULTI_DEVICE(1029),
    DEVICE_EMOTION(1030);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int type;

    AIFunctionType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<AIFunctionType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
