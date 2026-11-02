package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final enum SGTestType extends Enum<SGTestType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ SGTestType[] $VALUES = null;
    public static final SGTestType ADJUST_VOLUME = null;
    public static final SGTestType AI_VOICE_ASSISTANT = null;

    @aa1
    public static final Companion Companion = null;
    public static final SGTestType ENTER = null;
    public static final SGTestType MUCIC_NEXT = null;
    public static final SGTestType MUISC_PLAY_PAUSE = null;
    public static final SGTestType NONE = null;
    public static final SGTestType QUIT = null;
    public static final SGTestType RECORD_AUDIO_START = null;
    public static final SGTestType RECORD_AUDIO_STOP = null;
    public static final SGTestType RECORD_START = null;
    public static final SGTestType RECORD_STOP = null;
    public static final SGTestType TAKE_PHOTO = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nBleSGTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSGTest.kt\ncom/szabh/smable3/entity/SGTestType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final SGTestType of(int r6) {
            SGTestType[] r0 = SGTestType.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            SGTestType r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return SGTestType.NONE;
        L8:
            r3 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SGTestType[] $values() {
        return new SGTestType[]{MUISC_PLAY_PAUSE, ADJUST_VOLUME, MUCIC_NEXT, TAKE_PHOTO, RECORD_START, RECORD_STOP, AI_VOICE_ASSISTANT, RECORD_AUDIO_START, RECORD_AUDIO_STOP, ENTER, QUIT, NONE};
    }

    static {
        MUISC_PLAY_PAUSE = new SGTestType("MUISC_PLAY_PAUSE", 0, 1);
        ADJUST_VOLUME = new SGTestType("ADJUST_VOLUME", 1, 2);
        MUCIC_NEXT = new SGTestType("MUCIC_NEXT", 2, 3);
        TAKE_PHOTO = new SGTestType("TAKE_PHOTO", 3, 4);
        RECORD_START = new SGTestType("RECORD_START", 4, 5);
        RECORD_STOP = new SGTestType("RECORD_STOP", 5, 6);
        AI_VOICE_ASSISTANT = new SGTestType("AI_VOICE_ASSISTANT", 6, 7);
        RECORD_AUDIO_START = new SGTestType("RECORD_AUDIO_START", 7, 8);
        RECORD_AUDIO_STOP = new SGTestType("RECORD_AUDIO_STOP", 8, 9);
        ENTER = new SGTestType("ENTER", 9, 128);
        QUIT = new SGTestType("QUIT", 10, 129);
        NONE = new SGTestType("NONE", 11, 65535);
        SGTestType[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private SGTestType(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<SGTestType> getEntries() {
        return $ENTRIES;
    }

    public static SGTestType valueOf(String r1) {
        return (SGTestType) Enum.valueOf(SGTestType.class, r1);
    }

    public static SGTestType[] values() {
        return (SGTestType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.type)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(name());
        return r0.toString();
    }
}
