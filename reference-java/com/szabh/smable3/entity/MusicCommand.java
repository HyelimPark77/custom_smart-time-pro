package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public enum MusicCommand {
    PLAY((byte) 0),
    PAUSE((byte) 1),
    TOGGLE((byte) 2),
    NEXT((byte) 3),
    PRE((byte) 4),
    VOLUME_UP((byte) 5),
    VOLUME_DOWN((byte) 6),
    UNKNOWN((byte) -1);

    private final byte mCommand;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleMusicControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMusicControl.kt\ncom/szabh/smable3/entity/MusicCommand$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final MusicCommand m39007of(byte b) {
            for (MusicCommand musicCommand : MusicCommand.values()) {
                if (musicCommand.getMCommand() == b) {
                    if (musicCommand == null) {
                        return MusicCommand.UNKNOWN;
                    }
                    return musicCommand;
                }
            }
            musicCommand = null;
            if (musicCommand == null) {
                return MusicCommand.UNKNOWN;
            }
            return musicCommand;
        }

        private Companion() {
        }
    }

    MusicCommand(byte b) {
        this.mCommand = b;
    }

    @aa1
    public static EnumEntries<MusicCommand> getEntries() {
        return $ENTRIES;
    }

    public final byte getMCommand() {
        return this.mCommand;
    }
}
