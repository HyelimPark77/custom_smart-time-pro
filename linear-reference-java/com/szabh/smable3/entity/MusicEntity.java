package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final enum MusicEntity extends Enum<MusicEntity> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ MusicEntity[] $VALUES = null;

    @aa1
    public static final Companion Companion = null;
    public static final MusicEntity PLAYER = null;
    public static final MusicEntity QUEUE = null;
    public static final MusicEntity TRACK = null;
    public static final MusicEntity UNKNOWN = null;
    private final byte mEntity;

    @SourceDebugExtension({"SMAP\nBleMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMusicControl.kt\ncom/szabh/smable3/entity/MusicEntity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final MusicEntity of(byte r6) {
            MusicEntity[] r0 = MusicEntity.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            MusicEntity r3 = r0[r2];
            if (r3.getMEntity() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return MusicEntity.UNKNOWN;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MusicEntity[] $values() {
        return new MusicEntity[]{PLAYER, QUEUE, TRACK, UNKNOWN};
    }

    static {
        PLAYER = new MusicEntity("PLAYER", 0, (byte) 0);
        QUEUE = new MusicEntity("QUEUE", 1, (byte) 1);
        TRACK = new MusicEntity("TRACK", 2, (byte) 2);
        UNKNOWN = new MusicEntity("UNKNOWN", 3, (byte) -1);
        MusicEntity[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private MusicEntity(String r1, int r2, byte r3) {
        super(r1, r2);
        this.mEntity = r3;
    }

    @aa1
    public static EnumEntries<MusicEntity> getEntries() {
        return $ENTRIES;
    }

    public static MusicEntity valueOf(String r1) {
        return (MusicEntity) Enum.valueOf(MusicEntity.class, r1);
    }

    public static MusicEntity[] values() {
        return (MusicEntity[]) $VALUES.clone();
    }

    public final byte getMEntity() {
        return this.mEntity;
    }
}
