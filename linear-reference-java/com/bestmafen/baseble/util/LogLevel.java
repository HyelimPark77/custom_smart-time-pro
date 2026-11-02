package com.bestmafen.baseble.util;

import androidx.exifinterface.media.ExifInterface;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes13.dex */
public final enum LogLevel extends Enum<LogLevel> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ LogLevel[] $VALUES = null;
    public static final LogLevel D = null;
    public static final LogLevel E = null;
    public static final LogLevel I = null;
    public static final LogLevel V = null;
    public static final LogLevel W = null;

    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{V, D, I, W, E};
    }

    static {
        V = new LogLevel(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, 0);
        D = new LogLevel("D", 1);
        I = new LogLevel("I", 2);
        W = new LogLevel(ExifInterface.LONGITUDE_WEST, 3);
        E = new LogLevel(ExifInterface.LONGITUDE_EAST, 4);
        LogLevel[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private LogLevel(String r1, int r2) {
        super(r1, r2);
    }

    @aa1
    public static EnumEntries<LogLevel> getEntries() {
        return $ENTRIES;
    }

    public static LogLevel valueOf(String r1) {
        return (LogLevel) Enum.valueOf(LogLevel.class, r1);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
