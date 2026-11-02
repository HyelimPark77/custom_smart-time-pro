package com.sma.smartv3.util;

import android.app.Activity;
import android.content.Context;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.ShareUtil;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareUtil {

    @aa1
    public static final ShareUtil OXO1 = new ShareUtil();

    public static /* synthetic */ void I0IIOi(ShareUtil shareUtil, String str, String str2, Context context, i00OIXiO i00oixio, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "record_detail.txt";
        }
        shareUtil.XOO0ii0(str, str2, context, i00oixio);
    }

    public static final boolean IiI10X(Function0 function0) {
        function0.invoke2();
        return true;
    }

    public static final boolean O00() {
        return true;
    }

    @aa1
    public final String OIi0(int i) {
        if (i == 0) {
            return "00:00";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 2));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    public final void XO0O10(@aa1 Activity mContext, @aa1 final Function0<Unit> actions) {
        Intrinsics.X0O(mContext, "mContext");
        Intrinsics.X0O(actions, "actions");
        go0 go0Var = new go0(mContext, 0, 2, null);
        go0Var.O1O(R.string.weather_del_file);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.e94
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(ShareUtil.O00());
            }
        });
        go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.f94
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(ShareUtil.IiI10X(actions));
            }
        });
        go0Var.IIX1OXO();
    }

    public final void XOO0ii0(@aa1 String textToExport, @aa1 String name, @aa1 Context context, @aa1 i00OIXiO scope) {
        Intrinsics.X0O(textToExport, "textToExport");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(scope, "scope");
        XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new ShareUtil$export$1(name, textToExport, context, null), 2, null);
    }

    /* JADX INFO: renamed from: iO */
    public final void m38839iO(@aa1 String str) {
        Intrinsics.X0O(str, "str");
        ClipboardUtils.copyText(str);
        ToastUtils.showLong(R.string.copied);
    }
}
