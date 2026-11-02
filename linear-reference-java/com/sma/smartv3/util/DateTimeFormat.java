package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final enum DateTimeFormat extends Enum<DateTimeFormat> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ DateTimeFormat[] $VALUES = null;

    @aa1
    public static final OXO1 Companion = null;
    public static final DateTimeFormat MMddyyyy = null;
    public static final DateTimeFormat ddMMyyyy = null;
    public static final DateTimeFormat yyyyMMdd = null;
    private final int type;

    @SourceDebugExtension({"SMAP\nDateTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTime.kt\ncom/sma/smartv3/util/DateTimeFormat$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,798:1\n1#2:799\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final DateTimeFormat OXO1(int r6) {
            DateTimeFormat[] r0 = DateTimeFormat.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            DateTimeFormat r3 = r0[r2];
            if (r3.getType() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return DateTimeFormat.MMddyyyy;
        L8:
            r3 = null;
            goto L9
        }

        public OXO1() {
        }
    }

    private static final /* synthetic */ DateTimeFormat[] $values() {
        return new DateTimeFormat[]{yyyyMMdd, ddMMyyyy, MMddyyyy};
    }

    static {
        yyyyMMdd = new DateTimeFormat("yyyyMMdd", 0, 0);
        ddMMyyyy = new DateTimeFormat("ddMMyyyy", 1, 1);
        MMddyyyy = new DateTimeFormat("MMddyyyy", 2, 2);
        DateTimeFormat[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new OXO1(null);
    }

    private DateTimeFormat(String r1, int r2, int r3) {
        super(r1, r2);
        this.type = r3;
    }

    @aa1
    public static EnumEntries<DateTimeFormat> getEntries() {
        return $ENTRIES;
    }

    public static DateTimeFormat valueOf(String r1) {
        return (DateTimeFormat) Enum.valueOf(DateTimeFormat.class, r1);
    }

    public static DateTimeFormat[] values() {
        return (DateTimeFormat[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
