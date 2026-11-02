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
    public static final TimeUtil OXO1 = null;

    static {
        OXO1 = new TimeUtil();
    }

    public TimeUtil() {
    }

    public static /* synthetic */ ii0iIIX0 XIi00iiXO(TimeUtil r0, k85 r1, long r2, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = 1000;
    L6:
        return r0.OXO1(r1, r2);
    }

    public final int IiI10X(@aa1 Calendar r5, @aa1 Calendar r6) {
        Intrinsics.X0O(r5, "start");
        Intrinsics.X0O(r6, "end");
        long r0 = r6.getTimeInMillis() - r5.getTimeInMillis();
        TimeUnit r7 = TimeUnit.MILLISECONDS;
        long r2 = r7.toDays(r0);
        if ((r7.toHours(r0) % ((long) 24)) <= 0) goto L7;
        return (int) (r2 + 1);
    L7:
        return (int) r2;
    }

    @aa1
    public final String O00(long r6) {
        long r0 = TimeConstants.HOUR;
        long r3 = 60000;
        StringCompanionObject r7 = StringCompanionObject.OXO1;
        String r8 = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (r6 / r0)), Integer.valueOf((int) ((r6 % r0) / r3)), Integer.valueOf((int) ((r6 % r3) / ((long) 1000)))}, 3));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        return r8;
    }

    @aa1
    public final ii0iIIX0<String> OXO1(@aa1 k85<Boolean> r3, long r4) {
        Intrinsics.X0O(r3, "isSpeaking");
        return iX0XiO.OX0X1O10X(r3, new TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1(null, r4));
    }

    @aa1
    public final Calendar XO0O10(int r2, int r3, int r4) {
        Calendar r0 = Calendar.getInstance();
        r0.clear();
        r0.set(r2, r3 - 1, r4);
        Intrinsics.XXI(r0);
        return r0;
    }

    @aa1
    public final String XOO0ii0(int r5) {
        if (r5 > 0) goto L4;
        String r6 = iO(Math.abs(r5));
        if (StringsKt__StringsKt.iIi011O(r6, "0", false, 2, null) == false) goto L9;
        return r6;
    L9:
        return HelpFormatter.DEFAULT_OPT_PREFIX + r6;
    L4:
        return iO(r5);
    }

    public final String iO(int r4) {
        int r0 = r4 / 60;
        int r5 = r4 % 60;
        if (r0 <= 0) goto L7;
        return r0 + "时" + r5 + "分";
    L7:
        return r5 + "分";
    }
}
