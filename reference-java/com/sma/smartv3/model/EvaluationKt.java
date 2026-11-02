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
    public static final boolean isShowEvaluationDialog() throws IllegalAccessException, InstantiationException {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsOXO1 = a01Var.OXO1();
        Object objFromJson = new Gson().fromJson(sPUtilsOXO1.getString(b01.f5635Xi + '_' + EvaluationTimeData.class.getName()), (Class<Object>) EvaluationTimeData.class);
        if (objFromJson == null) {
            objFromJson = EvaluationTimeData.class.newInstance();
        }
        EvaluationTimeData evaluationTimeData = (EvaluationTimeData) objFromJson;
        long jSpecialProcessingTime = specialProcessingTime(b01.X0I1);
        long jSpecialProcessingTime2 = specialProcessingTime(b01.I0i0);
        long jSpecialProcessingTime3 = specialProcessingTime(b01.iX01);
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("isShowEvaluationDialog evaluationData " + evaluationTimeData + " ");
        if (evaluationTimeData.getNoShowPop() || q62.OXO1.iOXiO1O1I()) {
            q62 q62Var = q62.OXO1;
            if (q62Var.iOXiO1O1I()) {
                a01Var.OXO1().remove(b01.f5635Xi);
                a01Var.OXO1().remove(b01.X0I1);
                a01Var.OXO1().remove(b01.I0i0);
                a01Var.OXO1().remove(b01.iX01);
            }
            i1o0oxo1o.OXO1("isShowEvaluationDialog  noShowPop  " + evaluationTimeData.getNoShowPop() + " || " + q62Var.iOXiO1O1I() + " ");
            return false;
        }
        if (evaluationTimeData.getTime() != 0 || evaluationTimeData.getVersionCode() != 0 || !timeGreaterThan(jSpecialProcessingTime, 15) || !timeGreaterThan(jSpecialProcessingTime2, 15) || !timeGreaterThan(jSpecialProcessingTime3, 15)) {
            if (evaluationTimeData.getVersionCode() < AppUtils.getAppVersionCode()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                a01Var.OXO1().remove(b01.f5635Xi);
                a01Var.OXO1().put(b01.X0I1, jCurrentTimeMillis);
                a01Var.OXO1().put(b01.I0i0, jCurrentTimeMillis);
                a01Var.OXO1().put(b01.iX01, jCurrentTimeMillis);
                i1o0oxo1o.OXO1("isShowEvaluationDialog   replaceTime");
            }
            return false;
        }
        a01Var.OXO1().put(b01.f5635Xi + '_' + EvaluationTimeData.class.getName(), new Gson().toJson(new EvaluationTimeData(System.currentTimeMillis(), AppUtils.getAppVersionCode(), 0L, false, 12, null)), false);
        i1o0oxo1o.OXO1("isShowEvaluationDialog   showTime");
        return true;
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

    public static final long specialProcessingTime(@aa1 String key) {
        Intrinsics.X0O(key, "key");
        a01 a01Var = a01.OXO1;
        long j = a01Var.OXO1().getLong(key, 0L);
        if (j != 0) {
            return j;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        a01Var.OXO1().put(key, jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    private static final boolean timeGreaterThan(long j, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        return jCurrentTimeMillis >= 0 && jCurrentTimeMillis > ((long) (i * 86400000));
    }

    public static /* synthetic */ boolean timeGreaterThan$default(long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        return timeGreaterThan(j, i);
    }
}
