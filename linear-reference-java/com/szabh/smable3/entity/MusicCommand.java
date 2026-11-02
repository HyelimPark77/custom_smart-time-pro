package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final enum MusicCommand extends Enum<MusicCommand> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ MusicCommand[] $VALUES = null;

    @aa1
    public static final Companion Companion = null;
    public static final MusicCommand NEXT = null;
    public static final MusicCommand PAUSE = null;
    public static final MusicCommand PLAY = null;
    public static final MusicCommand PRE = null;
    public static final MusicCommand TOGGLE = null;
    public static final MusicCommand UNKNOWN = null;
    public static final MusicCommand VOLUME_DOWN = null;
    public static final MusicCommand VOLUME_UP = null;
    private final byte mCommand;

    @SourceDebugExtension({"SMAP\nBleMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMusicControl.kt\ncom/szabh/smable3/entity/MusicCommand$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final MusicCommand of(byte r6) {
            MusicCommand[] r0 = MusicCommand.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            MusicCommand r3 = r0[r2];
            if (r3.getMCommand() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return MusicCommand.UNKNOWN;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MusicCommand[] $values() {
        return new MusicCommand[]{PLAY, PAUSE, TOGGLE, NEXT, PRE, VOLUME_UP, VOLUME_DOWN, UNKNOWN};
    }

    static {
        PLAY = new MusicCommand("PLAY", 0, (byte) 0);
        PAUSE = new MusicCommand("PAUSE", 1, (byte) 1);
        TOGGLE = new MusicCommand("TOGGLE", 2, (byte) 2);
        NEXT = new MusicCommand("NEXT", 3, (byte) 3);
        PRE = new MusicCommand("PRE", 4, (byte) 4);
        VOLUME_UP = new MusicCommand("VOLUME_UP", 5, (byte) 5);
        VOLUME_DOWN = new MusicCommand("VOLUME_DOWN", 6, (byte) 6);
        UNKNOWN = new MusicCommand("UNKNOWN", 7, (byte) -1);
        MusicCommand[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private MusicCommand(String r1, int r2, byte r3) {
        super(r1, r2);
        this.mCommand = r3;
    }

    @aa1
    public static EnumEntries<MusicCommand> getEntries() {
        return $ENTRIES;
    }

    public static MusicCommand valueOf(String r1) {
        return (MusicCommand) Enum.valueOf(MusicCommand.class, r1);
    }

    public static MusicCommand[] values() {
        return (MusicCommand[]) $VALUES.clone();
    }

    public final byte getMCommand() {
        return this.mCommand;
    }
}
