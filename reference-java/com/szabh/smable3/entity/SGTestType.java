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
public enum SGTestType {
    MUISC_PLAY_PAUSE(1),
    ADJUST_VOLUME(2),
    MUCIC_NEXT(3),
    TAKE_PHOTO(4),
    RECORD_START(5),
    RECORD_STOP(6),
    AI_VOICE_ASSISTANT(7),
    RECORD_AUDIO_START(8),
    RECORD_AUDIO_STOP(9),
    ENTER(128),
    QUIT(129),
    NONE(65535);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleSGTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSGTest.kt\ncom/szabh/smable3/entity/SGTestType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        /* JADX INFO: renamed from: of */
        public final SGTestType m39009of(int i) {
            for (SGTestType sGTestType : SGTestType.values()) {
                if (sGTestType.getType() == i) {
                    if (sGTestType == null) {
                        return SGTestType.NONE;
                    }
                    return sGTestType;
                }
            }
            sGTestType = null;
            if (sGTestType == null) {
                return SGTestType.NONE;
            }
            return sGTestType;
        }

        private Companion() {
        }
    }

    SGTestType(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<SGTestType> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.type)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(name());
        return sb.toString();
    }
}
