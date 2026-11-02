package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final enum PlaybackState extends Enum<PlaybackState> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ PlaybackState[] $VALUES = null;
    public static final PlaybackState FAST_FORWARDING = null;
    public static final PlaybackState PAUSED = null;
    public static final PlaybackState PLAYING = null;
    public static final PlaybackState REWINDING = null;
    public static final PlaybackState UNKNOWN = null;
    private final byte mState;

    private static final /* synthetic */ PlaybackState[] $values() {
        return new PlaybackState[]{PAUSED, PLAYING, REWINDING, FAST_FORWARDING, UNKNOWN};
    }

    static {
        PAUSED = new PlaybackState("PAUSED", 0, (byte) 0);
        PLAYING = new PlaybackState("PLAYING", 1, (byte) 1);
        REWINDING = new PlaybackState("REWINDING", 2, (byte) 2);
        FAST_FORWARDING = new PlaybackState("FAST_FORWARDING", 3, (byte) 3);
        UNKNOWN = new PlaybackState("UNKNOWN", 4, (byte) -1);
        PlaybackState[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private PlaybackState(String r1, int r2, byte r3) {
        super(r1, r2);
        this.mState = r3;
    }

    @aa1
    public static EnumEntries<PlaybackState> getEntries() {
        return $ENTRIES;
    }

    public static PlaybackState valueOf(String r1) {
        return (PlaybackState) Enum.valueOf(PlaybackState.class, r1);
    }

    public static PlaybackState[] values() {
        return (PlaybackState[]) $VALUES.clone();
    }

    public final byte getMState() {
        return this.mState;
    }
}
