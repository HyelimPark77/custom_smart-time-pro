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
public enum AIImageResolution {
    IR_180P(0, "240X180"),
    IR_360P(1, "480X360"),
    IR_480P(2, "640X480"),
    IR_600P(3, "800X600"),
    IR_720P(4, "960X720");


    @aa1
    private final String label;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nBleSGSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n774#2:68\n865#2,2:69\n1#3:71\n*S KotlinDebug\n*F\n+ 1 BleSGSet.kt\ncom/szabh/smable3/entity/AIImageResolution$Companion\n*L\n57#1:68\n57#1:69,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final List<AIImageResolution> fromMask(int i) {
            EnumEntries<AIImageResolution> entries = AIImageResolution.getEntries();
            ArrayList arrayList = new ArrayList();
            for (AIImageResolution aIImageResolution : entries) {
                if (((1 << aIImageResolution.getValue()) & i) != 0) {
                    arrayList.add(aIImageResolution);
                }
            }
            return arrayList;
        }

        @aa1
        /* JADX INFO: renamed from: of */
        public final AIImageResolution m38988of(int i) {
            AIImageResolution next;
            Iterator<AIImageResolution> it = AIImageResolution.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getValue() != i);
            AIImageResolution aIImageResolution = next;
            return aIImageResolution == null ? AIImageResolution.IR_180P : aIImageResolution;
        }

        private Companion() {
        }
    }

    AIImageResolution(int i, String str) {
        this.value = i;
        this.label = str;
    }

    @aa1
    public static EnumEntries<AIImageResolution> getEntries() {
        return $ENTRIES;
    }

    @aa1
    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }
}
