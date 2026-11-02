package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public enum DateTimeFormat {
    yyyyMMdd(0),
    ddMMyyyy(1),
    MMddyyyy(2);

    private final int type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @SourceDebugExtension({"SMAP\nDateTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTime.kt\ncom/sma/smartv3/util/DateTimeFormat$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,798:1\n1#2:799\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        public final DateTimeFormat OXO1(int i) {
            for (DateTimeFormat dateTimeFormat : DateTimeFormat.values()) {
                if (dateTimeFormat.getType() == i) {
                    if (dateTimeFormat == null) {
                        return DateTimeFormat.MMddyyyy;
                    }
                    return dateTimeFormat;
                }
            }
            dateTimeFormat = null;
            if (dateTimeFormat == null) {
                return DateTimeFormat.MMddyyyy;
            }
            return dateTimeFormat;
        }

        public OXO1() {
        }
    }

    DateTimeFormat(int i) {
        this.type = i;
    }

    @aa1
    public static EnumEntries<DateTimeFormat> getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
