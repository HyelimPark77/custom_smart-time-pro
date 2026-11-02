package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.IOiOOI0;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.qu0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.OXO1;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class WatchFaceElementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] colorToRgb565(String str) {
        int i;
        int i2;
        int i3;
        String strIiIiIiX = StringsKt__StringsKt.IiIiIiX(str, qu0.XO0O10);
        int length = strIiIiIiX.length();
        if (length == 3) {
            String strSubstring = strIiIiIiX.substring(0, 1);
            Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
            i = Integer.parseInt(oe5.OXOO0X0i(strSubstring, 2), OXO1.OXO1(16));
            String strSubstring2 = strIiIiIiX.substring(1, 2);
            Intrinsics.O10IXXX0X(strSubstring2, "substring(...)");
            i2 = Integer.parseInt(oe5.OXOO0X0i(strSubstring2, 2), OXO1.OXO1(16));
            String strSubstring3 = strIiIiIiX.substring(2, 3);
            Intrinsics.O10IXXX0X(strSubstring3, "substring(...)");
            i3 = Integer.parseInt(oe5.OXOO0X0i(strSubstring3, 2), OXO1.OXO1(16));
        } else if (length != 6) {
            i3 = 255;
            i = 255;
            i2 = 255;
        } else {
            String strSubstring4 = strIiIiIiX.substring(0, 2);
            Intrinsics.O10IXXX0X(strSubstring4, "substring(...)");
            i = Integer.parseInt(strSubstring4, OXO1.OXO1(16));
            String strSubstring5 = strIiIiIiX.substring(2, 4);
            Intrinsics.O10IXXX0X(strSubstring5, "substring(...)");
            i2 = Integer.parseInt(strSubstring5, OXO1.OXO1(16));
            String strSubstring6 = strIiIiIiX.substring(4, 6);
            Intrinsics.O10IXXX0X(strSubstring6, "substring(...)");
            i3 = Integer.parseInt(strSubstring6, OXO1.OXO1(16));
        }
        int i4 = (i3 >> 3) | ((i & 248) << 8) | ((i2 & IOiOOI0.X0O) << 3);
        return new byte[]{(byte) (i4 & 255), (byte) ((i4 >> 8) & 255)};
    }
}
