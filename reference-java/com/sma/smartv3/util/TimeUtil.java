package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.blankj.utilcode.constant.TimeConstants;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTimeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,96:1\n189#2:97\n*S KotlinDebug\n*F\n+ 1 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n21#1:97\n*E\n"})
public final class TimeUtil {

    @aa1
    public static final TimeUtil OXO1 = new TimeUtil();

    public static /* synthetic */ ii0iIIX0 XIi00iiXO(TimeUtil timeUtil, k85 k85Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        return timeUtil.OXO1(k85Var, j);
    }

    public final int IiI10X(@aa1 Calendar start, @aa1 Calendar end) {
        Intrinsics.X0O(start, "start");
        Intrinsics.X0O(end, "end");
        long timeInMillis = end.getTimeInMillis() - start.getTimeInMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(timeInMillis);
        return timeUnit.toHours(timeInMillis) % ((long) 24) > 0 ? (int) (days + 1) : (int) days;
    }

    @aa1
    public final String O00(long j) {
        long j2 = TimeConstants.HOUR;
        long j3 = 60000;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (j / j2)), Integer.valueOf((int) ((j % j2) / j3)), Integer.valueOf((int) ((j % j3) / ((long) 1000)))}, 3));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    @aa1
    public final ii0iIIX0<String> OXO1(@aa1 k85<Boolean> isSpeaking, long j) {
        Intrinsics.X0O(isSpeaking, "isSpeaking");
        return iX0XiO.OX0X1O10X(isSpeaking, new TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1(null, j));
    }

    @aa1
    public final Calendar XO0O10(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i, i2 - 1, i3);
        Intrinsics.XXI(calendar);
        return calendar;
    }

    @aa1
    public final String XOO0ii0(int i) {
        if (i > 0) {
            return m38840iO(i);
        }
        String strM38840iO = m38840iO(Math.abs(i));
        if (StringsKt__StringsKt.iIi011O(strM38840iO, "0", false, 2, null)) {
            return strM38840iO;
        }
        return HelpFormatter.DEFAULT_OPT_PREFIX + strM38840iO;
    }

    /* JADX INFO: renamed from: iO */
    public final String m38840iO(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 <= 0) {
            return i3 + "分";
        }
        return i2 + "时" + i3 + "分";
    }
}
