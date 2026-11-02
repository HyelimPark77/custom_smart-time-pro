package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nEvaluation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Evaluation.kt\ncom/sma/smartv3/model/EvaluationKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,95:1\n93#2,2:96\n90#2:98\n85#2,3:99\n*S KotlinDebug\n*F\n+ 1 Evaluation.kt\ncom/sma/smartv3/model/EvaluationKt\n*L\n19#1:96,2\n19#1:98\n41#1:99,3\n*E\n"})
public final class EvaluationKt {
    public static final boolean isShowEvaluationDialog() {
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.OXO1();
        Object r2 = new Gson().fromJson(r1.getString(b01.Xi + '_' + EvaluationTimeData.class.getName()), EvaluationTimeData.class);
        if (r2 != null) goto L5;
        r2 = EvaluationTimeData.class.newInstance();
    L5:
        EvaluationTimeData r3 = (EvaluationTimeData) r2;
        long r7 = specialProcessingTime(b01.X0I1);
        long r9 = specialProcessingTime(b01.I0i0);
        long r12 = specialProcessingTime(b01.iX01);
        i1O0OXO1O r14 = i1O0OXO1O.OXO1;
        r14.OXO1("isShowEvaluationDialog evaluationData " + r3 + " ");
        if (r3.getNoShowPop() == false) goto L8;
    L26:
        q62 r6 = q62.OXO1;
        if (r6.iOXiO1O1I() == false) goto L29;
        r0.OXO1().remove(b01.Xi);
        r0.OXO1().remove(b01.X0I1);
        r0.OXO1().remove(b01.I0i0);
        r0.OXO1().remove(b01.iX01);
    L29:
        r14.OXO1("isShowEvaluationDialog  noShowPop  " + r3.getNoShowPop() + " || " + r6.iOXiO1O1I() + " ");
        return false;
    L8:
        if (q62.OXO1.iOXiO1O1I() == true) goto L26;
        if (r3.getTime() != 0) goto L23;
        if (r3.getVersionCode() != 0) goto L23;
        if (timeGreaterThan(r7, 15) == false) goto L23;
        if (timeGreaterThan(r9, 15) == false) goto L23;
        if (timeGreaterThan(r12, 15) == false) goto L23;
        r0.OXO1().put(b01.Xi + '_' + EvaluationTimeData.class.getName(), new Gson().toJson(new EvaluationTimeData(System.currentTimeMillis(), AppUtils.getAppVersionCode(), 0, false, 12, null)), false);
        r14.OXO1("isShowEvaluationDialog   showTime");
        return true;
    L23:
        if (r3.getVersionCode() >= AppUtils.getAppVersionCode()) goto L25;
        long r5 = System.currentTimeMillis();
        r0.OXO1().remove(b01.Xi);
        r0.OXO1().put(b01.X0I1, r5);
        r0.OXO1().put(b01.I0i0, r5);
        r0.OXO1().put(b01.iX01, r5);
        r14.OXO1("isShowEvaluationDialog   replaceTime");
    L25:
        return false;
    }

    public static final void putConnectionTimeoutTime() {
        a01.OXO1.OXO1().put(b01.X0I1, System.currentTimeMillis());
    }

    public static final void putDialFailureTime() {
        a01.OXO1.OXO1().put(b01.I0i0, System.currentTimeMillis());
    }

    public static final void putOtaFailureTime() {
        a01.OXO1.OXO1().put(b01.iX01, System.currentTimeMillis());
    }

    public static final long specialProcessingTime(@aa1 String r6) {
        Intrinsics.X0O(r6, "key");
        a01 r0 = a01.OXO1;
        long r4 = r0.OXO1().getLong(r6, 0);
        if (r4 != 0) goto L6;
        long r1 = System.currentTimeMillis();
        r0.OXO1().put(r6, r1);
        return r1;
    L6:
        return r4;
    }

    private static final boolean timeGreaterThan(long r4, int r6) {
        long r0 = System.currentTimeMillis() - r4;
        if (r0 >= 0) goto L6;
        return false;
    L6:
        if (r0 <= (r6 * 86400000)) goto L9;
        return true;
    L9:
        return false;
    }

    public static /* synthetic */ boolean timeGreaterThan$default(long r0, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 3;
    L6:
        return timeGreaterThan(r0, r2);
    }
}
