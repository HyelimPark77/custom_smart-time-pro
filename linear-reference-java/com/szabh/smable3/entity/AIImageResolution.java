package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final enum AIImageResolution extends Enum<AIImageResolution> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ AIImageResolution[] $VALUES = null;

    @aa1
    public static final Companion Companion = null;
    public static final AIImageResolution IR_180P = null;
    public static final AIImageResolution IR_360P = null;
    public static final AIImageResolution IR_480P = null;
    public static final AIImageResolution IR_600P = null;
    public static final AIImageResolution IR_720P = null;

    @aa1
    private final String label;
    private final int value;

    @SourceDebugExtension({"SMAP\nBleSGSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n774#2:68\n865#2,2:69\n1#3:71\n*S KotlinDebug\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n*L\n57#1:68\n57#1:69,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final List<AIImageResolution> fromMask(int r6) {
            EnumEntries<AIImageResolution> r0 = AIImageResolution.getEntries();
            ArrayList r1 = new ArrayList();
            Iterator<AIImageResolution> r2 = r0.iterator();
        L4:
            if (r2.hasNext() == false) goto L8;
            AIImageResolution r3 = r2.next();
            if (((1 << r3.getValue()) & r6) == 0) goto L4;
            r1.add(r3);
            goto L4
        L8:
            return r1;
        }

        @aa1
        public final AIImageResolution of(int r4) {
            Iterator<AIImageResolution> r0 = AIImageResolution.getEntries().iterator();
        L4:
            if (r0.hasNext() == false) goto L8;
            AIImageResolution r1 = r0.next();
            if (r1.getValue() != r4) goto L4;
        L9:
            AIImageResolution r2 = r1;
            if (r2 == null) goto L12;
            return r2;
        L12:
            return AIImageResolution.IR_180P;
        L8:
            r1 = null;
            goto L9
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AIImageResolution[] $values() {
        return new AIImageResolution[]{IR_180P, IR_360P, IR_480P, IR_600P, IR_720P};
    }

    static {
        IR_180P = new AIImageResolution("IR_180P", 0, 0, "240X180");
        IR_360P = new AIImageResolution("IR_360P", 1, 1, "480X360");
        IR_480P = new AIImageResolution("IR_480P", 2, 2, "640X480");
        IR_600P = new AIImageResolution("IR_600P", 3, 3, "800X600");
        IR_720P = new AIImageResolution("IR_720P", 4, 4, "960X720");
        AIImageResolution[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new Companion(null);
    }

    private AIImageResolution(String r1, int r2, int r3, String r4) {
        super(r1, r2);
        this.value = r3;
        this.label = r4;
    }

    @aa1
    public static EnumEntries<AIImageResolution> getEntries() {
        return $ENTRIES;
    }

    public static AIImageResolution valueOf(String r1) {
        return (AIImageResolution) Enum.valueOf(AIImageResolution.class, r1);
    }

    public static AIImageResolution[] values() {
        return (AIImageResolution[]) $VALUES.clone();
    }

    @aa1
    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }
}
