package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum MusicAttr {
    PLAYER_NAME((byte) 0),
    PLAYER_PLAYBACK_INFO((byte) 1),
    PLAYER_VOLUME((byte) 2),
    QUEUE_INDEX((byte) 0),
    QUEUE_COUNT((byte) 1),
    QUEUE_SHUFFLE_MODE((byte) 2),
    QUEUE_REPEAT_MODE((byte) 3),
    TRACK_ARTIST((byte) 0),
    TRACK_ALBUM((byte) 1),
    TRACK_TITLE((byte) 2),
    TRACK_DURATION((byte) 3),
    UNKNOWN((byte) -1);

    private final byte mAttr;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MusicEntity.values().length];
                try {
                    iArr[MusicEntity.PLAYER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MusicEntity.QUEUE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MusicEntity.TRACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        /* JADX INFO: renamed from: of */
        public final MusicAttr m39006of(@aa1 MusicEntity entity, byte b) {
            Intrinsics.X0O(entity, "entity");
            int i = WhenMappings.$EnumSwitchMapping$0[entity.ordinal()];
            if (i == 1) {
                if (b == 0) {
                    return MusicAttr.PLAYER_NAME;
                }
                if (b == 1) {
                    return MusicAttr.PLAYER_PLAYBACK_INFO;
                }
                return b == 2 ? MusicAttr.PLAYER_VOLUME : MusicAttr.UNKNOWN;
            }
            if (i == 2) {
                if (b == 0) {
                    return MusicAttr.QUEUE_INDEX;
                }
                if (b == 1) {
                    return MusicAttr.QUEUE_COUNT;
                }
                if (b == 2) {
                    return MusicAttr.QUEUE_SHUFFLE_MODE;
                }
                return b == 3 ? MusicAttr.QUEUE_REPEAT_MODE : MusicAttr.UNKNOWN;
            }
            if (i != 3) {
                return MusicAttr.UNKNOWN;
            }
            if (b == 0) {
                return MusicAttr.TRACK_ARTIST;
            }
            if (b == 1) {
                return MusicAttr.TRACK_ALBUM;
            }
            if (b == 2) {
                return MusicAttr.TRACK_TITLE;
            }
            return b == 3 ? MusicAttr.TRACK_DURATION : MusicAttr.UNKNOWN;
        }

        private Companion() {
        }

        @aa1
        /* JADX INFO: renamed from: of */
        public final MusicAttr m39005of(byte b, byte b2) {
            return m39006of(MusicEntity.Companion.m39008of(b), b2);
        }
    }

    MusicAttr(byte b) {
        this.mAttr = b;
    }

    @aa1
    public static EnumEntries<MusicAttr> getEntries() {
        return $ENTRIES;
    }

    public final byte getMAttr() {
        return this.mAttr;
    }
}
