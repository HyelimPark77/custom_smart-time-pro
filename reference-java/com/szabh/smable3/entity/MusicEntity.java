package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public enum MusicEntity {
    PLAYER((byte) 0),
    QUEUE((byte) 1),
    TRACK((byte) 2),
    UNKNOWN((byte) -1);

    private final byte mEntity;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMusicControl.kt\ncom/szabh/smable3/entity/MusicEntity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final MusicEntity m39008of(byte b) {
            for (MusicEntity musicEntity : MusicEntity.values()) {
                if (musicEntity.getMEntity() == b) {
                    if (musicEntity == null) {
                        return MusicEntity.UNKNOWN;
                    }
                    return musicEntity;
                }
            }
            musicEntity = null;
            if (musicEntity == null) {
                return MusicEntity.UNKNOWN;
            }
            return musicEntity;
        }

        private Companion() {
        }
    }

    MusicEntity(byte b) {
        this.mEntity = b;
    }

    @aa1
    public static EnumEntries<MusicEntity> getEntries() {
        return $ENTRIES;
    }

    public final byte getMEntity() {
        return this.mEntity;
    }
}
