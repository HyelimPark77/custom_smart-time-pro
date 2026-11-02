package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum PlaybackState {
    PAUSED((byte) 0),
    PLAYING((byte) 1),
    REWINDING((byte) 2),
    FAST_FORWARDING((byte) 3),
    UNKNOWN((byte) -1);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final byte mState;

    PlaybackState(byte b) {
        this.mState = b;
    }

    @aa1
    public static EnumEntries<PlaybackState> getEntries() {
        return $ENTRIES;
    }

    public final byte getMState() {
        return this.mState;
    }
}
