package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.IOiOOI0;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.qu0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.OXO1;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceElementKt {
    public static final /* synthetic */ byte[] access$colorToRgb565(String r0) {
        return colorToRgb565(r0);
    }

    private static final byte[] colorToRgb565(String r12) {
        String r13 = StringsKt__StringsKt.IiIiIiX(r12, qu0.XO0O10);
        int r4 = r13.length();
        if (r4 != 3) goto L5;
        String r5 = r13.substring(0, 1);
        Intrinsics.O10IXXX0X(r5, "substring(...)");
        int r6 = Integer.parseInt(oe5.OXOO0X0i(r5, 2), OXO1.OXO1(16));
        String r8 = r13.substring(1, 2);
        Intrinsics.O10IXXX0X(r8, "substring(...)");
        int r10 = Integer.parseInt(oe5.OXOO0X0i(r8, 2), OXO1.OXO1(16));
        String r14 = r13.substring(2, 3);
        Intrinsics.O10IXXX0X(r14, "substring(...)");
        int r15 = Integer.parseInt(oe5.OXOO0X0i(r14, 2), OXO1.OXO1(16));
    L9:
        int r16 = (r15 >> 3) | (((r6 & 248) << 8) | ((r10 & IOiOOI0.X0O) << 3));
        return new byte[]{(byte) (r16 & 255), (byte) ((r16 >> 8) & 255)};
    L5:
        if (r4 == 6) goto L7;
        r15 = 255;
        r6 = 255;
        r10 = 255;
        goto L9
    L7:
        String r7 = r13.substring(0, 2);
        Intrinsics.O10IXXX0X(r7, "substring(...)");
        r6 = Integer.parseInt(r7, OXO1.OXO1(16));
        String r11 = r13.substring(2, 4);
        Intrinsics.O10IXXX0X(r11, "substring(...)");
        r10 = Integer.parseInt(r11, OXO1.OXO1(16));
        String r17 = r13.substring(4, 6);
        Intrinsics.O10IXXX0X(r17, "substring(...)");
        r15 = Integer.parseInt(r17, OXO1.OXO1(16));
        goto L9
    }
}
