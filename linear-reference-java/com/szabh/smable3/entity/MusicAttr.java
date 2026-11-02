package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final enum MusicAttr extends Enum<MusicAttr> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ MusicAttr[] $VALUES = null;

    @aa1
    public static final Companion Companion = null;
    public static final MusicAttr PLAYER_NAME = null;
    public static final MusicAttr PLAYER_PLAYBACK_INFO = null;
    public static final MusicAttr PLAYER_VOLUME = null;
    public static final MusicAttr QUEUE_COUNT = null;
    public static final MusicAttr QUEUE_INDEX = null;
    public static final MusicAttr QUEUE_REPEAT_MODE = null;
    public static final MusicAttr QUEUE_SHUFFLE_MODE = null;
    public static final MusicAttr TRACK_ALBUM = null;
    public static final MusicAttr TRACK_ARTIST = null;
    public static final MusicAttr TRACK_DURATION = null;
    public static final MusicAttr TRACK_TITLE = null;
    public static final MusicAttr UNKNOWN = null;
    private final byte mAttr;

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r0 = new int[MusicEntity.values().length];
                r0[MusicEntity.PLAYER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
            L11:
                r0[MusicEntity.QUEUE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
            L15:
                r0[MusicEntity.TRACK.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
            L6:
                $EnumSwitchMapping$0 = r0;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final MusicAttr of(@aa1 MusicEntity r4, byte r5) {
            Intrinsics.X0O(r4, "entity");
            int r6 = WhenMappings.$EnumSwitchMapping$0[r4.ordinal()];
            if (r6 != 1) goto L5;
            if (r5 == 0) goto L39;
            if (r5 == 1) goto L42;
            if (r5 != 2) goto L47;
            return MusicAttr.PLAYER_VOLUME;
        L47:
            return MusicAttr.UNKNOWN;
        L42:
            return MusicAttr.PLAYER_PLAYBACK_INFO;
        L39:
            return MusicAttr.PLAYER_NAME;
        L5:
            if (r6 == 2) goto L23;
            if (r6 != 3) goto L8;
            if (r5 == 0) goto L11;
            if (r5 == 1) goto L14;
            if (r5 == 2) goto L17;
            if (r5 != 3) goto L22;
            return MusicAttr.TRACK_DURATION;
        L22:
            return MusicAttr.UNKNOWN;
        L17:
            return MusicAttr.TRACK_TITLE;
        L14:
            return MusicAttr.TRACK_ALBUM;
        L11:
            return MusicAttr.TRACK_ARTIST;
        L8:
            return MusicAttr.UNKNOWN;
        L23:
            if (r5 == 0) goto L25;
            if (r5 == 1) goto L28;
            if (r5 == 2) goto L31;
            if (r5 != 3) goto L36;
            return MusicAttr.QUEUE_REPEAT_MODE;
        L36:
            return MusicAttr.UNKNOWN;
        L31:
            return MusicAttr.QUEUE_SHUFFLE_MODE;
        L28:
            return MusicAttr.QUEUE_COUNT;
        L25:
            return MusicAttr.QUEUE_INDEX;
        }

        private Companion() {
        }

        @aa1
        public final MusicAttr of(byte r2, byte r3) {
            return of(MusicEntity.Companion.of(r2), r3);
        }
    }

    private static final /* synthetic */ MusicAttr[] $values() {
        return new MusicAttr[]{PLAYER_NAME, PLAYER_PLAYBACK_INFO, PLAYER_VOLUME, QUEUE_INDEX, QUEUE_COUNT, QUEUE_SHUFFLE_MODE, QUEUE_REPEAT_MODE, TRACK_ARTIST, TRACK_ALBUM, TRACK_TITLE, TRACK_DURATION, UNKNOWN};
    }

    static {
        PLAYER_NAME = new MusicAttr("PLAYER_NAME", 0, (byte) 0);
        PLAYER_PLAYBACK_INFO = new MusicAttr("PLAYER_PLAYBACK_INFO", 1, (byte) 1);
        PLAYER_VOLUME = new MusicAttr("PLAYER_VOLUME", 2, (byte) 2);
        QUEUE_INDEX = new MusicAttr("QUEUE_INDEX", 3, (byte) 0);
        QUEUE_COUNT = new MusicAttr("QUEUE_COUNT", 4, (byte) 1);
        QUEUE_SHUFFLE_MODE = new MusicAttr("QUEUE_SHUFFLE_MODE", 5, (byte) 2);
        QUEUE_REPEAT_MODE = new MusicAttr("QUEUE_REPEAT_MODE", 6, (byte) 3);
        TRACK_ARTIST = new MusicAttr("TRACK_ARTIST", 7, (byte) 0);
        TRACK_ALBUM = new MusicAttr("TRACK_ALBUM", 8, (byte) 1);
        TRACK_TITLE = new MusicAttr("TRACK_TITLE", 9, (byte) 2);
        TRACK_DURATION = new MusicAttr("TRACK_DURATION", 10, (byte) 3);
        UNKNOWN = new MusicAttr("UNKNOWN", 11, (byte) -1);
        MusicAttr[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private MusicAttr(String r1, int r2, byte r3) {
        super(r1, r2);
        this.mAttr = r3;
    }

    @aa1
    public static EnumEntries<MusicAttr> getEntries() {
        return $ENTRIES;
    }

    public static MusicAttr valueOf(String r1) {
        return (MusicAttr) Enum.valueOf(MusicAttr.class, r1);
    }

    public static MusicAttr[] values() {
        return (MusicAttr[]) $VALUES.clone();
    }

    public final byte getMAttr() {
        return this.mAttr;
    }
}
