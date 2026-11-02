package com.sma.smartv3.model;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
    public static final Companion Companion = new Companion(null);
    private final long time;

    @aa1
    private final PrayTimeType type;

    @SourceDebugExtension({"SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTime$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,413:1\n77#2:414\n97#2,5:415\n*S KotlinDebug\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTime$Companion\n*L\n303#1:414\n303#1:415,5\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @tb1
        public final PrayerTime findNextTime(@aa1 Map<Long, ? extends List<PrayerTime>> datas, long j) {
            Intrinsics.X0O(datas, "datas");
            ArrayList<PrayerTime> arrayList = new ArrayList();
            Iterator<Map.Entry<Long, ? extends List<PrayerTime>>> it = datas.entrySet().iterator();
            while (it.hasNext()) {
                OIXO1IIOO.XOO0XOOii(arrayList, it.next().getValue());
            }
            for (PrayerTime prayerTime : arrayList) {
                if (j < prayerTime.getTime()) {
                    return prayerTime;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrayTimeType.values().length];
            try {
                iArr[PrayTimeType.FAJR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrayTimeType.SUNRISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrayTimeType.DHUHR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrayTimeType.ASR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrayTimeType.MAGHRIB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrayTimeType.ISHA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PrayerTime(@aa1 PrayTimeType type, long j) {
        Intrinsics.X0O(type, "type");
        this.type = type;
        this.time = j;
    }

    public static /* synthetic */ PrayerTime copy$default(PrayerTime prayerTime, PrayTimeType prayTimeType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            prayTimeType = prayerTime.type;
        }
        if ((i & 2) != 0) {
            j = prayerTime.time;
        }
        return prayerTime.copy(prayTimeType, j);
    }

    @aa1
    public final PrayTimeType component1() {
        return this.type;
    }

    public final long component2() {
        return this.time;
    }

    @aa1
    public final PrayerTime copy(@aa1 PrayTimeType type, long j) {
        Intrinsics.X0O(type, "type");
        return new PrayerTime(type, j);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrayerTime)) {
            return false;
        }
        PrayerTime prayerTime = (PrayerTime) obj;
        return this.type == prayerTime.type && this.time == prayerTime.time;
    }

    public final int getAdjustmentMin() throws IllegalAccessException, InstantiationException {
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        if (objFromJson == null) {
            objFromJson = PrayerTimeSettings.class.newInstance();
        }
        PrayerTimeSettings prayerTimeSettings = (PrayerTimeSettings) objFromJson;
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                return prayerTimeSettings.getFajrAdjustment();
            case 2:
                return prayerTimeSettings.getSunriseAdjustment();
            case 3:
                return prayerTimeSettings.getDhuhrAdjustment();
            case 4:
                return prayerTimeSettings.getAsrAdjustment();
            case 5:
                return prayerTimeSettings.getMaghribAdjustment();
            case 6:
                return prayerTimeSettings.getIshaAdjustment();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeHour() {
        String str = new SimpleDateFormat(DateFormatUtils.f55446HH).format(Long.valueOf(this.time));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return Integer.parseInt(str);
    }

    public final int getTimeIcon(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        try {
            Resources resources = context.getResources();
            String lowerCase = this.type.name().toLowerCase(Locale.ROOT);
            Intrinsics.O10IXXX0X(lowerCase, "toLowerCase(...)");
            int identifier = resources.getIdentifier("icon_qibla_" + lowerCase, "drawable", context.getPackageName());
            return identifier == 0 ? R.drawable.icon_qibla_asr : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.drawable.icon_qibla_asr;
        }
    }

    public final int getTimeMinute() {
        String str = new SimpleDateFormat(DateFormatUtils.MIN).format(Long.valueOf(this.time));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return Integer.parseInt(str);
    }

    public final int getTimeName(@aa1 Context context) {
        Intrinsics.X0O(context, "context");
        try {
            Resources resources = context.getResources();
            String lowerCase = this.type.name().toLowerCase(Locale.ROOT);
            Intrinsics.O10IXXX0X(lowerCase, "toLowerCase(...)");
            int identifier = resources.getIdentifier("prayer_time_" + lowerCase, TypedValues.Custom.S_STRING, Utils.getApp().getPackageName());
            return identifier == 0 ? R.string.prayer_time_asr : identifier;
        } catch (Exception e) {
            e.printStackTrace();
            return R.string.prayer_time_asr;
        }
    }

    @aa1
    public final String getTimeString() {
        String str = new SimpleDateFormat("HH:mm").format(Long.valueOf(this.time));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
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
