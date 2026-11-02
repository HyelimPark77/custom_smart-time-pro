package com.sma.smartv3.model;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.sma.smartv3.pro.R;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTime\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,413:1\n18#2,2:414\n15#2:416\n*S KotlinDebug\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTime\n*L\n286#1:414,2\n286#1:416\n*E\n"})
public final class PrayerTime {

    @aa1
    public static final Companion Companion = null;
    private final long time;

    @aa1
    private final PrayTimeType type;

    @SourceDebugExtension({"SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTime$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,413:1\n77#2:414\n97#2,5:415\n*S KotlinDebug\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTime$Companion\n*L\n303#1:414\n303#1:415,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @tb1
        public final PrayerTime findNextTime(@aa1 Map<Long, ? extends List<PrayerTime>> r4, long r5) {
            Intrinsics.X0O(r4, "datas");
            ArrayList r0 = new ArrayList();
            Iterator<Map.Entry<Long, ? extends List<PrayerTime>>> r6 = r4.entrySet().iterator();
        L4:
            if (r6.hasNext() == false) goto L6;
            OIXO1IIOO.XOO0XOOii(r0, r6.next().getValue());
            goto L4
        L6:
            Iterator r7 = r0.iterator();
        L8:
            if (r7.hasNext() == false) goto L12;
            PrayerTime r1 = (PrayerTime) r7.next();
            if (r5 >= r1.getTime()) goto L8;
            return r1;
        L12:
            return null;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[PrayTimeType.values().length];
            r0[PrayTimeType.FAJR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
        L19:
            r0[PrayTimeType.SUNRISE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
        L27:
            r0[PrayTimeType.DHUHR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L21:
            r0[PrayTimeType.ASR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L23:
            r0[PrayTimeType.MAGHRIB.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
        L17:
            r0[PrayTimeType.ISHA.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public PrayerTime(@aa1 PrayTimeType r2, long r3) {
        Intrinsics.X0O(r2, "type");
        this.type = r2;
        this.time = r3;
    }

    public static /* synthetic */ PrayerTime copy$default(PrayerTime r0, PrayTimeType r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.time;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final PrayTimeType component1() {
        return this.type;
    }

    public final long component2() {
        return this.time;
    }

    @aa1
    public final PrayerTime copy(@aa1 PrayTimeType r2, long r3) {
        Intrinsics.X0O(r2, "type");
        return new PrayerTime(r2, r3);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof PrayerTime) == true) goto L8;
        return false;
    L8:
        PrayerTime r9 = (PrayerTime) r8;
        if (this.type == r9.type) goto L12;
        return false;
    L12:
        if (this.time == r9.time) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getAdjustmentMin() {
        SPUtils r0 = a01.OXO1.OXO1();
        Object r1 = new Gson().fromJson(r0.getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r1 != null) goto L5;
        r1 = PrayerTimeSettings.class.newInstance();
    L5:
        PrayerTimeSettings r2 = (PrayerTimeSettings) r1;
        PrayTimeType r3 = this.type;
        switch(WhenMappings.$EnumSwitchMapping$0[r3.ordinal()]) {
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            default: goto L8;
        };
    L8:
        throw new NoWhenBranchMatchedException();
    L10:
        return r2.getIshaAdjustment();
    L12:
        return r2.getMaghribAdjustment();
    L14:
        return r2.getAsrAdjustment();
    L16:
        return r2.getDhuhrAdjustment();
    L18:
        return r2.getSunriseAdjustment();
    L20:
        return r2.getFajrAdjustment();
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeHour() {
        String r0 = new SimpleDateFormat(DateFormatUtils.HH).format(Long.valueOf(this.time));
        Intrinsics.O10IXXX0X(r0, "format(...)");
        return Integer.parseInt(r0);
    }

    public final int getTimeIcon(@aa1 Context r6) {
        Intrinsics.X0O(r6, "context");
        Resources r1 = r6.getResources();     // Catch: Exception -> L7
        String r2 = this.type.name().toLowerCase(Locale.ROOT);     // Catch: Exception -> L7
        Intrinsics.O10IXXX0X(r2, "toLowerCase(...)");     // Catch: Exception -> L7
        int r7 = r1.getIdentifier("icon_qibla_" + r2, "drawable", r6.getPackageName());     // Catch: Exception -> L7
        if (r7 != 0) goto L6;
        return R.drawable.icon_qibla_asr;
    L6:
        return r7;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.drawable.icon_qibla_asr;
    }

    public final int getTimeMinute() {
        String r0 = new SimpleDateFormat(DateFormatUtils.MIN).format(Long.valueOf(this.time));
        Intrinsics.O10IXXX0X(r0, "format(...)");
        return Integer.parseInt(r0);
    }

    public final int getTimeName(@aa1 Context r5) {
        Intrinsics.X0O(r5, "context");
        Resources r6 = r5.getResources();     // Catch: Exception -> L7
        String r1 = this.type.name().toLowerCase(Locale.ROOT);     // Catch: Exception -> L7
        Intrinsics.O10IXXX0X(r1, "toLowerCase(...)");     // Catch: Exception -> L7
        int r7 = r6.getIdentifier("prayer_time_" + r1, TypedValues.Custom.S_STRING, Utils.getApp().getPackageName());     // Catch: Exception -> L7
        if (r7 != 0) goto L6;
        return R.string.prayer_time_asr;
    L6:
        return r7;
    L7:
        e = move-exception;
        e.printStackTrace();
        return R.string.prayer_time_asr;
    }

    @aa1
    public final String getTimeString() {
        String r0 = new SimpleDateFormat("HH:mm").format(Long.valueOf(this.time));
        Intrinsics.O10IXXX0X(r0, "format(...)");
        return r0;
    }

    @aa1
    public final PrayTimeType getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Long.hashCode(this.time);
    }

    @aa1
    public String toString() {
        return this.type.name() + ": " + getTimeString();
    }
}
