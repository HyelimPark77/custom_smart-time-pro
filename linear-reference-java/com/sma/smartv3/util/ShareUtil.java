package com.sma.smartv3.util;

import android.app.Activity;
import android.content.Context;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e94;
import com.android.mltcode.paycertificationapi.f94;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareUtil {

    @aa1
    public static final ShareUtil OXO1 = null;

    static {
        OXO1 = new ShareUtil();
    }

    public ShareUtil() {
    }

    public static /* synthetic */ void I0IIOi(ShareUtil r0, String r1, String r2, Context r3, i00OIXiO r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L5;
        r2 = "record_detail.txt";
    L5:
        r0.XOO0ii0(r1, r2, r3, r4);
    }

    public static final boolean IiI10X(Function0 r0) {
        r0.invoke();
        return true;
    }

    public static final boolean O00() {
        return true;
    }

    public static /* synthetic */ boolean OXO1() {
        return O00();
    }

    public static /* synthetic */ boolean XIi00iiXO(Function0 r0) {
        return IiI10X(r0);
    }

    @aa1
    public final String OIi0(int r3) {
        if (r3 != 0) goto L5;
        return "00:00";
    L5:
        int r0 = (r3 % 3600) / 60;
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r4 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(r0), Integer.valueOf(r3 % 60)}, 2));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        return r4;
    }

    public final void XO0O10(@aa1 Activity r5, @aa1 final Function0<Unit> r6) {
        Intrinsics.X0O(r5, "mContext");
        Intrinsics.X0O(r6, "actions");
        int r3 = 0;
        go0 r0 = new go0(r5, r3, 2, null);
        r0.O1O(R.string.weather_del_file);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new e94());
        r0.X1IX(R.string.delete, new f94(r6));
        r0.IIX1OXO();
    }

    public final void XOO0ii0(@aa1 String r8, @aa1 String r9, @aa1 Context r10, @aa1 i00OIXiO r11) {
        Intrinsics.X0O(r8, "textToExport");
        Intrinsics.X0O(r9, "name");
        Intrinsics.X0O(r10, "context");
        Intrinsics.X0O(r11, "scope");
        I100X1.O00(r11, IXOX0Xiii.iO(), null, new ShareUtil$export$1(r9, r8, r10, null), 2, null);
    }

    public final void iO(@aa1 String r2) {
        Intrinsics.X0O(r2, "str");
        ClipboardUtils.copyText(r2);
        ToastUtils.showLong(R.string.copied);
    }
}
