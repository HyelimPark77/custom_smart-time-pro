package com.sma.smartv3.util;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionDataKt;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.HeathItemReports;
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.model.TodayHealthyDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.dao.HealthyReportDao;
import com.sma.smartv3.p608db.dao.HeartRateDao;
import com.sma.smartv3.p608db.dao.PressureDao;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.dao.WorkoutDao;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import com.sma.smartv3.p608db.entity.HealthyReport;
import com.sma.smartv3.p608db.entity.HeartRate;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.p611ai.AIChatActivity;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.p610ui.status.HeathReportsGenerateActivity;
import com.sma.smartv3.p610ui.status.HistoryReportsActivity;
import com.sma.smartv3.p610ui.timezonepicker.TimeZonePicker;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.time.DateUtils;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsUtils.kt\ncom/sma/smartv3/util/HeathReportsUtils\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,787:1\n69#2,3:788\n72#2,5:792\n87#2,7:838\n94#2,3:846\n70#2,7:849\n97#2:856\n69#2,3:857\n72#2,5:861\n1#3:791\n1#3:825\n1#3:845\n1#3:860\n1563#4:797\n1634#4,3:798\n1563#4:803\n1634#4,3:804\n1563#4:809\n1634#4,3:810\n1563#4:818\n1634#4,2:819\n1636#4:822\n1563#4:829\n1634#4,2:830\n1636#4:833\n19#5:801\n15#5:802\n19#5:807\n15#5:808\n19#5:813\n15#5:814\n50#5,3:815\n53#5:821\n55#5,2:823\n50#5,3:826\n53#5:832\n55#5,2:834\n35#5,2:836\n*S KotlinDebug\n*F\n+ 1 HeathReportsUtils.kt\ncom/sma/smartv3/util/HeathReportsUtils\n*L\n141#1:788,3\n141#1:792,5\n162#1:838,7\n162#1:846,3\n162#1:849,7\n162#1:856\n173#1:857,3\n173#1:861,5\n141#1:791\n162#1:845\n173#1:860\n226#1:797\n226#1:798,3\n330#1:803\n330#1:804,3\n460#1:809\n460#1:810,3\n663#1:818\n663#1:819,2\n663#1:822\n717#1:829\n717#1:830,2\n717#1:833\n252#1:801\n252#1:802\n450#1:807\n450#1:808\n604#1:813\n604#1:814\n663#1:815,3\n663#1:821\n663#1:823,2\n717#1:826,3\n717#1:832\n717#1:834,2\n731#1:836,2\n*E\n"})
public final class HeathReportsUtils {

    @tb1
    public static go0 OIX0iXi;
    public static final int X1ii = 0;

    @aa1
    public static final HeathReportsUtils OXO1 = new HeathReportsUtils();

    @aa1
    public static final Lazy XIi00iiXO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXI1ii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.XOXiX0();
        }
    });

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final Lazy f54907iO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXi11OO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.IiiXiI0I();
        }
    });

    @aa1
    public static final Lazy XO0O10 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOii1iIX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.IXI();
        }
    });

    @aa1
    public static final Lazy O00 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIi00OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.iiIOiX();
        }
    });

    @aa1
    public static final Lazy IiI10X = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0X0iO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.XOO0XOOii();
        }
    });

    @aa1
    public static final Lazy XOO0ii0 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOOOX1O0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.Ii0i();
        }
    });

    @aa1
    public static final Lazy I0IIOi = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0I00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.m38810Oi();
        }
    });

    @aa1
    public static final Lazy OIi0 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00XXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.IO0iXO0O();
        }
    });

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final Lazy f54906IO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii1OIiiI0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HeathReportsUtils.XOIX();
        }
    });

    @aa1
    public static final String I0iXXO = "HeathReportsUtils";

    @aa1
    public static final String XXI = "WeeklyExerciseStatistics";
    public static final int O10IXXX0X = 1;

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ void m38808I1(HeathReportsUtils heathReportsUtils, List list, float f, float f2, long j, String str, int i, Object obj) {
        if ((i & 16) != 0) {
            str = "";
        }
        heathReportsUtils.m38813OX(list, f, f2, j, str);
    }

    public static final WorkoutDao IO0iXO0O() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    public static final boolean IX1XiI(Function1 function1) {
        function1.invoke2(Boolean.FALSE);
        return true;
    }

    public static final BloodOxygenDao IXI() {
        return MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
    }

    public static final void IXOIIIO(Activity activity, View view) {
        AIFunctionDataKt.toAIFunction(activity, new AIFunction(AIFunctionType.HEALTH_QA, UtilsKt.XXO(R.string.health_qa), R.drawable.ai_function_health_qa_bg, UtilsKt.XXO(R.string.health_qa_desc), R.drawable.icon_ai_function_health_qa, 0, null, null, null, null, true, new Intent(Utils.getApp(), (Class<?>) AIChatActivity.class), TimeZonePicker.OXO1, null));
    }

    public static final void Ii0X0X(TextView textView) {
        textView.setText("");
    }

    public static final BloodGlucose2Dao Ii0i() {
        return MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();
    }

    public static final BloodPressureDao IiiXiI0I() {
        return MyDb.INSTANCE.getMDatabase().bloodPressureDao();
    }

    public static /* synthetic */ void OII(HeathReportsUtils heathReportsUtils, List list, int i, int i2, long j, String str, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            str = "";
        }
        heathReportsUtils.XiOIii1(list, i, i2, j, str);
    }

    /* JADX INFO: renamed from: Oi */
    public static final WeightDao m38810Oi() {
        return MyDb.INSTANCE.getMDatabase().weightDao();
    }

    public static /* synthetic */ void OiIIX101O(HeathReportsUtils heathReportsUtils, List list, int i, int i2, long j, String str, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            str = "";
        }
        heathReportsUtils.XX0(list, i, i2, j, str);
    }

    public static final void X00Xi1X(AIAnswer aIAnswer, View view, TextView textView, String str, long j) {
        if (aIAnswer == null) {
            view.setEnabled(true);
            return;
        }
        textView.setVisibility(0);
        textView.setText(aIAnswer.getText());
        if (aIAnswer.getEnded() == 1) {
            OXO1.IO0II0i(str, j, aIAnswer.getText());
        }
    }

    public static /* synthetic */ void X01IiOiIi(HeathReportsUtils heathReportsUtils, Activity activity, Function1 function1, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = X1ii;
        }
        heathReportsUtils.iOOX010X(activity, function1, i);
    }

    public static final Unit XO0X10iO(final Activity activity, String str, final View view, final TextView textView, final String str2, final long j, boolean z) {
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " startHeathAnalyze b = " + z);
        if (z) {
            a01.OXO1.OXO1().put(b01.OI1IiOO1i, true);
            activity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IXOOIiOI
                @Override // java.lang.Runnable
                public final void run() {
                    HeathReportsUtils.Ii0X0X(textView);
                }
            });
            iXi(OXO1, str, 0, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1IiO01
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HeathReportsUtils.XXiIiX10(activity, view, textView, str2, j, (AIAnswer) obj);
                }
            }, 2, null);
        } else {
            view.setEnabled(true);
        }
        return Unit.OXO1;
    }

    public static final HealthyReportDao XOIX() {
        return MyDb.INSTANCE.getMDatabase().healthyReportDao();
    }

    public static final PressureDao XOO0XOOii() {
        return MyDb.INSTANCE.getMDatabase().pressureDao();
    }

    public static final HeartRateDao XOXiX0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    public static final Unit XXiIiX10(Activity activity, final View view, final TextView textView, final String str, final long j, final AIAnswer aIAnswer) {
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " startAIAnalyze");
        activity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O10i01
            @Override // java.lang.Runnable
            public final void run() {
                HeathReportsUtils.X00Xi1X(aIAnswer, view, textView, str, j);
            }
        });
        return Unit.OXO1;
    }

    public static final boolean XXiO0i(int i, Activity activity, int i2, Function1 function1) {
        if (i != R.string.agree) {
            if (i == R.string.confirm) {
                String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", strX11iII1O1);
                bundle.putInt("mArg1", 2);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", null);
                Intent intent = new Intent(activity, (Class<?>) GoogleWebViewActivity.class);
                intent.putExtras(bundle);
                activity.startActivity(intent);
            } else if (i == R.string.heath_reports_history_btn) {
                activity.startActivity(new Intent(activity, (Class<?>) HistoryReportsActivity.class));
            }
        } else if (i2 == X1ii) {
            function1.invoke2(Boolean.TRUE);
        } else {
            OIX0iXi = null;
            a01.OXO1.OXO1().put(b01.OI1IiOO1i, true);
            OXO1.iOOX010X(activity, function1, i2);
        }
        return true;
    }

    public static /* synthetic */ void Xi1i0XOX0(HeathReportsUtils heathReportsUtils, Activity activity, Function1 function1, int i, int i2, Object obj) throws IllegalAccessException, InstantiationException {
        if ((i2 & 4) != 0) {
            i = X1ii;
        }
        heathReportsUtils.O0O(activity, function1, i);
    }

    public static final void i0X000X0O(final Activity activity, final View view, final String str, final TextView textView, final String str2, final long j, View view2) throws IllegalAccessException, InstantiationException {
        activity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i11XOi1
            @Override // java.lang.Runnable
            public final void run() {
                HeathReportsUtils.i11I(view);
            }
        });
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " setOnClickListener");
        OXO1.O0O(activity, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIIiX110
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HeathReportsUtils.XO0X10iO(activity, str, view, textView, str2, j, ((Boolean) obj).booleanValue());
            }
        }, X1ii);
    }

    public static final void i11I(View view) {
        view.setEnabled(false);
    }

    public static /* synthetic */ void iIiiO(HeathReportsUtils heathReportsUtils, List list, double d, long j, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        heathReportsUtils.XiOIO(list, d, j, str);
    }

    public static /* synthetic */ void iOI(HeathReportsUtils heathReportsUtils, Activity activity, int i, int i2, int i3, int i4, Function1 function1, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i = R.string.tip;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            i2 = R.string.points_insufficient_tip;
        }
        int i8 = i2;
        if ((i6 & 8) != 0) {
            i3 = R.string.cancel;
        }
        int i9 = i3;
        if ((i6 & 16) != 0) {
            i4 = R.string.confirm;
        }
        heathReportsUtils.O0O0X0iOi(activity, i7, i8, i9, i4, function1, (i6 & 64) != 0 ? X1ii : i5);
    }

    public static /* synthetic */ String iX1O1(HeathReportsUtils heathReportsUtils, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 50;
        }
        return heathReportsUtils.m38815iI(str, str2, str3, i);
    }

    public static /* synthetic */ void iXi(HeathReportsUtils heathReportsUtils, String str, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            i = 50;
        }
        heathReportsUtils.IX0IXOi(str, i, function1);
    }

    public static final SleepDao iiIOiX() {
        return MyDb.INSTANCE.getMDatabase().sleepDao();
    }

    public static /* synthetic */ void iiiO(HeathReportsUtils heathReportsUtils, List list, List list2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        heathReportsUtils.Ii1iii0(list, list2, j);
    }

    public final void II1Xi0(@aa1 List<BloodGlucose2> bloodGlucose2List, @aa1 List<TodayData> list) {
        Intrinsics.X0O(bloodGlucose2List, "bloodGlucose2List");
        Intrinsics.X0O(list, "list");
        if (bloodGlucose2List.isEmpty()) {
            return;
        }
        BloodGlucose2 bloodGlucose2 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(bloodGlucose2List);
        iIiiO(this, list, bloodGlucose2.getMUpperBound(), bloodGlucose2.getMTime(), null, 8, null);
    }

    public final void IO0II0i(String str, long j, String str2) {
        Collection collectionM39402iI;
        Object next;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.OXO1().getString(b01.X11)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), HeathItemReports.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        if (listOO0Oi10 == null) {
            listOO0Oi10 = new ArrayList();
        }
        Iterator it2 = listOO0Oi10.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.XOO0ii0(((HeathItemReports) next).getDataType(), str));
        HeathItemReports heathItemReports = (HeathItemReports) next;
        if (heathItemReports == null) {
            listOO0Oi10.add(new HeathItemReports(j, str, 1, str2));
        } else {
            if (XOX0O0(j, heathItemReports.getTime())) {
                heathItemReports.setNumber(heathItemReports.getNumber() + 1);
                heathItemReports.setTime(j);
            } else {
                heathItemReports.setNumber(1);
                heathItemReports.setTime(j);
            }
            heathItemReports.setAiExtraInfo(str2);
        }
        a01.OXO1.OXO1().put(b01.X11, new Gson().toJson(listOO0Oi10));
    }

    public final void IX0IXOi(@aa1 String mAiQuestion, int i, @aa1 final Function1<? super AIAnswer, Unit> action) {
        Intrinsics.X0O(mAiQuestion, "mAiQuestion");
        Intrinsics.X0O(action, "action");
        if (i72.OXO1.OIIOI()) {
            AIManager.OXO1.XXO(new AIQuestion(AIFunctionType.HEALTH_QA_ANALYZE, mAiQuestion, null, null, false, false, 60, null), new O1XIiIO<AIAnswer>() { // from class: com.sma.smartv3.util.HeathReportsUtils$startAIAnalyze$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(AIAnswer aIAnswer) {
                    if (aIAnswer != null) {
                        action.invoke2(aIAnswer);
                        return;
                    }
                    i1O0OXO1O.OXO1.XIi00iiXO("startAIAnalyze v2 handleResponse error ");
                    ToastUtils.showLong(UtilsKt.XXO(R.string.voice_assistant_common_error), new Object[0]);
                    action.invoke2(null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.XIi00iiXO("startAIAnalyze v2 handleError error = " + error);
                    ToastUtils.showLong(error, new Object[0]);
                    action.invoke2(null);
                }
            }, false);
        } else {
            AIManager.iXiX011(AIManager.OXO1, new AIQuestion(AIFunctionType.HEALTH_QA_ANALYZE, mAiQuestion, null, null, false, false, 60, null), new O1XIiIO<AIAnswer>() { // from class: com.sma.smartv3.util.HeathReportsUtils$startAIAnalyze$2
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(AIAnswer aIAnswer) {
                    if (aIAnswer != null) {
                        action.invoke2(aIAnswer);
                        return;
                    }
                    i1O0OXO1O.OXO1.XIi00iiXO("startAIAnalyze handleResponse error ");
                    ToastUtils.showLong(UtilsKt.XXO(R.string.voice_assistant_common_error), new Object[0]);
                    action.invoke2(null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.XIi00iiXO("startAIAnalyze handleError error = " + error);
                    ToastUtils.showLong(error, new Object[0]);
                    action.invoke2(null);
                }
            }, false, false, i, 0, 40, null);
        }
    }

    public final int IXXOO() {
        return O10IXXX0X;
    }

    public final void Ii1iii0(List<Sleep> list, List<TodayData> list2, long j) {
        if (list.isEmpty()) {
            return;
        }
        SleepAllDayData sleepAllDayDataFilterData = SleepAllDayDataParse.INSTANCE.filterData(list, 100.0f, null, j);
        LogUtils.m11128d(sleepAllDayDataFilterData.toString());
        int i = sleepAllDayDataFilterData.getStatus().get(1) + sleepAllDayDataFilterData.getStatus().get(2) + sleepAllDayDataFilterData.getStatus().get(3);
        int i2 = sleepAllDayDataFilterData.getStatus().get(8);
        if (i != 0) {
            List<Sleep> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
            long mTime = 0;
            for (Sleep sleep : list3) {
                if (sleep.getMMode() == 17 && mTime == 0) {
                    mTime = sleep.getMTime();
                }
                arrayList.add(Unit.OXO1);
            }
            OiIIX101O(this, list2, i, i2, mTime, null, 16, null);
        }
    }

    public final SleepDao O001I() {
        return (SleepDao) O00.getValue();
    }

    public final void O0O(@aa1 Activity activity, @aa1 Function1<? super Boolean, Unit> action, int i) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(action, "action");
        q62 q62Var = q62.OXO1;
        if (q62Var.OO1O00iI()) {
            i72 i72Var = i72.OXO1;
            if (!i72Var.m2044Ii() && !q62Var.OIXOOi() && !q62Var.IiO0()) {
                i1O0OXO1O.OXO1.OXO1("startHeathAnalyze NO AI inlineSupport = " + q62Var.OO1O00iI() + " , isUserMember = " + i72Var.m2044Ii() + ",  userMemberLatestDateTime = " + i72Var.XXO() + " isSupportSparkChainAI = " + q62Var.OIXOOi());
                iOI(this, activity, 0, R.string.ai_benefit_buy_tip, 0, 0, action, i, 26, null);
                return;
            }
        }
        if (a01.OXO1.OXO1().getBoolean(b01.OI1IiOO1i, false)) {
            iOOX010X(activity, action, i);
        } else {
            O0O0X0iOi(activity, R.string.information_authorization, R.string.information_authorization_content, R.string.dis_agree, R.string.agree, action, i);
        }
    }

    public final void O0O0X0iOi(final Activity activity, int i, int i2, int i3, final int i4, final Function1<? super Boolean, Unit> function1, final int i5) {
        go0 go0Var;
        if (OIX0iXi == null) {
            go0 go0Var2 = new go0(activity, 0, 2, null);
            go0Var2.O1O(i);
            go0Var2.m1865iX(Integer.valueOf(i2));
            go0Var2.IXXOO(1);
            go0Var2.iX1O1(Integer.valueOf(i3), new Function0() { // from class: com.android.mltcode.paycertificationapi.OIiO00X
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(HeathReportsUtils.IX1XiI(function1));
                }
            });
            go0Var2.X1IX(i4, new Function0() { // from class: com.android.mltcode.paycertificationapi.IiI1iX0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(HeathReportsUtils.XXiO0i(i4, activity, i5, function1));
                }
            });
            OIX0iXi = go0Var2;
        }
        go0 go0Var3 = OIX0iXi;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = OIX0iXi) != null) {
            go0Var.IIX1OXO();
        }
    }

    @aa1
    public final List<TodayData> O1O() {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HeartRateDao heartRateDaoIIXi1iiXI = iIXi1iiXI();
        long j = jCurrentTimeMillis - ((long) O0X11OiO.iXiX011);
        TodayHealthyDataKt.getHealthyDataHeart(heartRateDaoIIXi1iiXI.getHeartRates(j, jCurrentTimeMillis), arrayList);
        TodayHealthyDataKt.getBloodPressureDataHeart(X1IX().getBloodPressures(j, jCurrentTimeMillis), arrayList);
        TodayHealthyDataKt.getBloodOxyDataHeart(XXX11i().getBloodOxygen(j, jCurrentTimeMillis), arrayList);
        Ii1iii0(O001I().getSleeps(j, jCurrentTimeMillis), arrayList, jCurrentTimeMillis);
        TodayHealthyDataKt.getHealthyDataPressure(iXiX011().getPressures(j, jCurrentTimeMillis), arrayList);
        II1Xi0(X11iII1O1().getList(j, jCurrentTimeMillis), arrayList);
        XX1Oi(XXO().getWeightsASC(j, jCurrentTimeMillis), arrayList);
        long j2 = jCurrentTimeMillis - ((long) 604800000);
        X100O(j2, WorkoutDao.getListDESC$default(iXiiiO(), j2, jCurrentTimeMillis, 0, 4, (Object) null), arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: OO */
    public final void m38812OO(@tb1 List<TodayData> list, @aa1 Function1<? super Long, Unit> action) {
        Intrinsics.X0O(action, "action");
        List<TodayData> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            action.invoke2(0L);
            return;
        }
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HealthyReport healthyReport = new HealthyReport(0, 0, 0.0f, 0.0f, 0L, null, 0, 0L, 0, null, 0L, 0, 0, null, 0L, 0, null, 0L, 0.0f, 0.0f, null, 0L, 0, null, 0L, 0.0f, null, 0L, 0.0f, null, 0L, 0, 0, null, 0, -1, 7, null);
        healthyReport.setMUserGender(appUser2.getGender());
        healthyReport.setMUserWeight(appUser2.getWeight());
        healthyReport.setMUserHeight(appUser2.getHeight());
        healthyReport.setMTime(jCurrentTimeMillis);
        String str = O0X11OiO.XO0O10().format(Long.valueOf(jCurrentTimeMillis));
        Intrinsics.O10IXXX0X(str, "format(...)");
        healthyReport.setMLocalTime(str);
        Intrinsics.XXI(list);
        List<TodayData> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
        int i = 0;
        for (TodayData todayData : list3) {
            if (todayData.getStateColor() != 2) {
                i++;
            }
            String dataType = todayData.getDataType();
            if (Intrinsics.XOO0ii0(dataType, "heart_rate")) {
                healthyReport.setMHeartRateTime(todayData.getTime());
                healthyReport.setMHeartRateValue((int) todayData.getValue1());
                healthyReport.setMHeartRateAIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, q62.OXOXXiI)) {
                healthyReport.setMBloodPressureTime(todayData.getTime());
                healthyReport.setMSystolicValue((int) todayData.getValue1());
                healthyReport.setMDiastolicValue((int) todayData.getValue2());
                healthyReport.setMBloodPressureAIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, q62.IiOIO1OX)) {
                healthyReport.setMBloodOxygenTime(todayData.getTime());
                healthyReport.setMBloodOxygenValue((int) todayData.getValue1());
                healthyReport.setMBloodOxygenAIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, "sleep")) {
                healthyReport.setMSleepTime(todayData.getTime());
                healthyReport.setMSleepDeepLengthTime(todayData.getValue1());
                healthyReport.setMSleepPiecemealTime(todayData.getValue2());
                healthyReport.setMSleepAIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, q62.IIII0II)) {
                healthyReport.setMPressureTime(todayData.getTime());
                healthyReport.setMPressureValue((int) todayData.getValue1());
                healthyReport.setMPressureAIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, q62.O001OXi)) {
                healthyReport.setMBloodGlucose2Time(todayData.getTime());
                healthyReport.setMBloodGlucose2Value(todayData.getValue1());
                healthyReport.setMBloodGlucose2AIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, "weight")) {
                healthyReport.setMWeightTime(todayData.getTime());
                healthyReport.setMWeightValue(todayData.getValue1());
                healthyReport.setMWeightAIRecords(todayData.getMExtraInfo());
            } else if (Intrinsics.XOO0ii0(dataType, XXI)) {
                healthyReport.setMWeekSportsTime(todayData.getTime());
                healthyReport.setMWeekSportsNumber((int) todayData.getValue1());
                healthyReport.setMWeekSportsAllTime((int) todayData.getValue2());
                healthyReport.setMWeekSportsAIRecords(todayData.getMExtraInfo());
            }
            arrayList.add(Unit.OXO1);
        }
        healthyReport.setMIsSync(0);
        healthyReport.setMAbnormalNumber(i);
        action.invoke2(Long.valueOf(X0i1O().insert(healthyReport)));
    }

    /* JADX INFO: renamed from: OX */
    public final void m38813OX(@aa1 List<TodayData> list, float f, float f2, long j, @aa1 String mExtraInfo) {
        String strXXO;
        int i;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        float f3 = f / ((f2 * f2) / 10000);
        double d = f3;
        if (d >= 29.9d) {
            strXXO = UtilsKt.XXO(R.string.too_heavy);
            i = 3;
        } else if (d > 24.9d) {
            strXXO = UtilsKt.XXO(R.string.too_heavy);
            i = 1;
        } else if (d > 18.4d) {
            strXXO = UtilsKt.XXO(R.string.normal);
            i = 2;
        } else {
            strXXO = UtilsKt.XXO(R.string.thin);
            i = 0;
        }
        String str = strXXO;
        int i2 = i;
        list.add(new TodayData(j, UtilsKt.XXO(R.string.weight), f + UtilsKt.XXO(R.string.f54355kg) + "\n" + UtilsKt.XXO(R.string.bmi) + CertificateUtil.DELIMITER + cp5.I0IIOi(f, f2), str, i2, "weight", 0, mExtraInfo, f, f3, 64, null));
    }

    @aa1
    public final List<TodayData> OX110i(@tb1 HealthyReport healthyReport) {
        ArrayList arrayList = new ArrayList();
        if (healthyReport != null) {
            if (healthyReport.getMHeartRateValue() > 0) {
                TodayHealthyDataKt.addHealthyDataHeart(arrayList, healthyReport.getMHeartRateValue(), healthyReport.getMHeartRateTime(), healthyReport.getMHeartRateAIRecords());
            }
            if (healthyReport.getMSystolicValue() > 0 && healthyReport.getMDiastolicValue() > 0) {
                TodayHealthyDataKt.addHealthyDataBloodPressure(arrayList, healthyReport.getMSystolicValue(), healthyReport.getMDiastolicValue(), healthyReport.getMBloodPressureTime(), healthyReport.getMBloodPressureAIRecords());
                arrayList = arrayList;
            }
            if (healthyReport.getMBloodOxygenTime() > 0) {
                TodayHealthyDataKt.addHealthyDataBloodOxy(arrayList, healthyReport.getMBloodOxygenValue(), healthyReport.getMBloodOxygenTime(), healthyReport.getMBloodOxygenAIRecords());
            }
            if (healthyReport.getMSleepTime() > 0) {
                XX0(arrayList, (int) healthyReport.getMSleepDeepLengthTime(), (int) healthyReport.getMSleepPiecemealTime(), healthyReport.getMSleepTime(), healthyReport.getMSleepAIRecords());
            }
            if (healthyReport.getMPressureValue() > 0) {
                TodayHealthyDataKt.addHealthyDataPressure(arrayList, healthyReport.getMPressureValue(), healthyReport.getMPressureTime(), healthyReport.getMPressureAIRecords());
            }
            if (healthyReport.getMBloodGlucose2Value() > 0.0f) {
                XiOIO(arrayList, healthyReport.getMBloodGlucose2Value(), healthyReport.getMBloodGlucose2Time(), healthyReport.getMBloodGlucose2AIRecords());
            }
            if (healthyReport.getMWeightValue() > 0.0f) {
                m38813OX(arrayList, healthyReport.getMWeightValue(), healthyReport.getMUserHeight(), healthyReport.getMWeightTime(), healthyReport.getMWeightAIRecords());
            }
            if (healthyReport.getMWeekSportsAllTime() > 0) {
                XiOIii1(arrayList, healthyReport.getMWeekSportsNumber(), healthyReport.getMWeekSportsAllTime(), healthyReport.getMWeekSportsTime(), healthyReport.getMWeekSportsAIRecords());
            }
        }
        return arrayList;
    }

    public final HealthyReportDao X0i1O() {
        return (HealthyReportDao) f54906IO.getValue();
    }

    /* JADX INFO: renamed from: X1 */
    public final void m38814X1(@aa1 String itemType, long j, @aa1 View btn, @aa1 TextView tv, @aa1 View layoutTip, @aa1 View questionsBtn, @aa1 final Activity activity) {
        Collection collectionM39402iI;
        Object next;
        Intrinsics.X0O(itemType, "itemType");
        Intrinsics.X0O(btn, "btn");
        Intrinsics.X0O(tv, "tv");
        Intrinsics.X0O(layoutTip, "layoutTip");
        Intrinsics.X0O(questionsBtn, "questionsBtn");
        Intrinsics.X0O(activity, "activity");
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.OXO1().getString(b01.X11)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), HeathItemReports.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        if (collectionM39402iI == null) {
            collectionM39402iI = new ArrayList();
        }
        btn.setEnabled(false);
        Iterator it2 = collectionM39402iI.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.XOO0ii0(((HeathItemReports) next).getDataType(), itemType));
        HeathItemReports heathItemReports = (HeathItemReports) next;
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " itemLayoutNumberControl item = " + heathItemReports);
        if (heathItemReports == null) {
            tv.setVisibility(8);
            layoutTip.setVisibility(8);
            btn.setEnabled(true);
        } else if (j == heathItemReports.getTime() || !iii0(j, heathItemReports.getTime())) {
            layoutTip.setVisibility(0);
            tv.setVisibility(0);
            tv.setText(heathItemReports.getAiExtraInfo());
            tv.setText(UtilsKt.XXO(R.string.ai_parsing_time) + " : " + O0X11OiO.m793iI().format(Long.valueOf(heathItemReports.getTime())) + " \n" + heathItemReports.getAiExtraInfo());
        } else {
            btn.setEnabled(true);
            layoutTip.setVisibility(0);
            tv.setVisibility(0);
            tv.setText(heathItemReports.getAiExtraInfo());
            tv.setText(UtilsKt.XXO(R.string.ai_parsing_time) + " : " + O0X11OiO.m793iI().format(Long.valueOf(heathItemReports.getTime())) + " \n" + heathItemReports.getAiExtraInfo());
        }
        questionsBtn.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X0I0OI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeathReportsUtils.IXOIIIO(activity, view);
            }
        });
    }

    public final void X100O(long j, @aa1 List<Workout> workoutList, @aa1 List<TodayData> list) {
        Intrinsics.X0O(workoutList, "workoutList");
        Intrinsics.X0O(list, "list");
        List<Workout> list2 = workoutList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
        Iterator<T> it = list2.iterator();
        int mDuration = 0;
        while (it.hasNext()) {
            mDuration += ((Workout) it.next()).getMDuration();
            arrayList.add(Unit.OXO1);
        }
        if (mDuration > 0) {
            OII(this, list, workoutList.size(), mDuration, j, null, 16, null);
        }
    }

    @aa1
    public final String X11I() {
        return XXI;
    }

    public final BloodGlucose2Dao X11iII1O1() {
        return (BloodGlucose2Dao) XOO0ii0.getValue();
    }

    public final BloodPressureDao X1IX() {
        return (BloodPressureDao) f54907iO.getValue();
    }

    public final boolean XOX0O0(long j, long j2) {
        return Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).toLocalDate().isEqual(Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).toLocalDate());
    }

    public final void XX0(@aa1 List<TodayData> list, int i, int i2, long j, @aa1 String mExtraInfo) {
        String str;
        int i3;
        String strXXO;
        int i4;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        if (i2 != 0) {
            str = UtilsKt.XXO(R.string.night_sleep) + CertificateUtil.DELIMITER + (i / 60) + UtilsKt.XXO(R.string.f54354h) + (i % 60) + UtilsKt.XXO(R.string.h_m) + "\n" + UtilsKt.XXO(R.string.piecemeal) + CertificateUtil.DELIMITER + (i2 / 60) + UtilsKt.XXO(R.string.f54354h) + (i2 % 60) + UtilsKt.XXO(R.string.h_m);
            i3 = i + i2;
        } else {
            str = UtilsKt.XXO(R.string.night_sleep) + CertificateUtil.DELIMITER + (i / 60) + UtilsKt.XXO(R.string.f54354h) + (i % 60) + UtilsKt.XXO(R.string.h_m);
            i3 = i;
        }
        String str2 = str;
        int i5 = i3 / 60;
        if (i5 >= 9) {
            strXXO = UtilsKt.XXO(R.string.lightness_high);
            i4 = 3;
        } else if (i5 < 7 || i5 >= 9) {
            strXXO = UtilsKt.XXO(R.string.data_lower);
            i4 = 1;
        } else {
            strXXO = UtilsKt.XXO(R.string.general);
            i4 = 2;
        }
        list.add(new TodayData(j, UtilsKt.XXO(R.string.sleep), str2, strXXO, i4, "sleep", 0, mExtraInfo, i, i2, 64, null));
    }

    public final String XX00i10X(String str) {
        return oe5.IXO0OOi(str, "\n", I000IiI1O.C2156iO.XO0O10, false, 4, null);
    }

    public final void XX1Oi(@aa1 List<Weight> weightList, @aa1 List<TodayData> list) {
        Intrinsics.X0O(weightList, "weightList");
        Intrinsics.X0O(list, "list");
        if (weightList.isEmpty()) {
            return;
        }
        Weight weight = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(weightList);
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        m38808I1(this, list, weight.getMWeight(), ((AppUser) appUser).getHeight(), weight.getMTime(), null, 16, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String XXIIO1i11(String str) {
        switch (str.hashCode()) {
            case -1276242363:
                if (str.equals(q62.IIII0II)) {
                    return UtilsKt.XXO(R.string.pressure);
                }
                break;
            case -791592328:
                if (str.equals("weight")) {
                    return UtilsKt.XXO(R.string.weight);
                }
                break;
            case -240915579:
                if (str.equals(q62.IiOIO1OX)) {
                    return UtilsKt.XXO(R.string.blood_oxygen);
                }
                break;
            case 109522647:
                if (str.equals("sleep")) {
                    return UtilsKt.XXO(R.string.sleep);
                }
                break;
            case 560044778:
                if (str.equals(q62.OXOXXiI)) {
                    return UtilsKt.XXO(R.string.blood_pressure);
                }
                break;
            case 1467734697:
                if (str.equals(q62.O001OXi)) {
                    return UtilsKt.XXO(R.string.blood_glucose);
                }
                break;
            case 1930449209:
                if (str.equals("heart_rate")) {
                    return UtilsKt.XXO(R.string.heart_rate);
                }
                break;
        }
        return UtilsKt.XXO(R.string.health_data);
    }

    public final WeightDao XXO() {
        return (WeightDao) I0IIOi.getValue();
    }

    public final BloodOxygenDao XXX11i() {
        return (BloodOxygenDao) XO0O10.getValue();
    }

    public final void XiOIO(@aa1 List<TodayData> list, double d, long j, @aa1 String mExtraInfo) {
        String strXXO;
        int i;
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        if (d >= 6.9d) {
            strXXO = UtilsKt.XXO(R.string.lightness_high);
            i = 3;
        } else if (d < 6.1d) {
            strXXO = UtilsKt.XXO(R.string.data_lower);
            i = 1;
        } else {
            strXXO = UtilsKt.XXO(R.string.pressure_level_normal);
            i = 2;
        }
        String str = strXXO;
        int i2 = i;
        list.add(new TodayData(j, UtilsKt.XXO(R.string.blood_glucose), d + UtilsKt.XXO(R.string.bg_unit), str, i2, q62.O001OXi, 0, mExtraInfo, (float) d, 0.0f, 576, null));
    }

    public final void XiOIii1(@aa1 List<TodayData> list, int i, int i2, long j, @aa1 String mExtraInfo) {
        Intrinsics.X0O(list, "list");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        list.add(new TodayData(j, UtilsKt.XXO(R.string.heath_week_sport_title), i + UtilsKt.XXO(R.string.times) + "\n" + UtilsKt.XXO(R.string.heath_week_sport_alltime) + CertificateUtil.DELIMITER + (i2 / 3600) + O0X11OiO.iOO1ii1, "", 2, XXI, 0, mExtraInfo, i, i2, 64, null));
    }

    @aa1
    public final HealthyReport i010I(long j) {
        return X0i1O().getHealthyReport(j);
    }

    @aa1
    /* JADX INFO: renamed from: iI */
    public final String m38815iI(@aa1 String itemType, @aa1 String title, @aa1 String query, int i) {
        Intrinsics.X0O(itemType, "itemType");
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(query, "query");
        String strXX00i10X = XX00i10X(query);
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        int i2 = UtilsKt.IXI(app) ? i : i * 2;
        switch (itemType.hashCode()) {
            case -1276242363:
                if (!itemType.equals(q62.IIII0II)) {
                    return "";
                }
                break;
            case -791592328:
                if (!itemType.equals("weight")) {
                    return "";
                }
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
                Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
                if (objFromJson != null) {
                    appUser = objFromJson;
                }
                AppUser appUser2 = (AppUser) appUser;
                String string = appUser2.getGender() == 0 ? Utils.getApp().getString(R.string.female) : Utils.getApp().getString(R.string.male);
                Intrinsics.XXI(string);
                return String.valueOf(Utils.getApp().getString(R.string.ai_heath_question3, string, String.valueOf(appUser2.getHeight()), strXX00i10X, Integer.valueOf(i2)));
            case -240915579:
                if (!itemType.equals(q62.IiOIO1OX)) {
                    return "";
                }
                break;
            case 109522647:
                return !itemType.equals("sleep") ? "" : String.valueOf(Utils.getApp().getString(R.string.ai_heath_question2, title, strXX00i10X, Integer.valueOf(i2)));
            case 560044778:
                if (!itemType.equals(q62.OXOXXiI)) {
                    return "";
                }
                break;
            case 1467734697:
                if (!itemType.equals(q62.O001OXi)) {
                    return "";
                }
                break;
            case 1930449209:
                if (!itemType.equals("heart_rate")) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return String.valueOf(Utils.getApp().getString(R.string.ai_heath_question1, title, strXX00i10X, title, strXX00i10X, Integer.valueOf(i2)));
    }

    public final HeartRateDao iIXi1iiXI() {
        return (HeartRateDao) XIi00iiXO.getValue();
    }

    @aa1
    public final List<HealthyReport> iOO1ii1() {
        return X0i1O().getListASC();
    }

    public final void iOOX010X(Activity activity, Function1<? super Boolean, Unit> function1, int i) {
        if (i == X1ii) {
            function1.invoke2(Boolean.TRUE);
            return;
        }
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        List<HeartRate> heartRates = iIXi1iiXI().getHeartRates(jArrIOOX010X[0], jArrIOOX010X[1]);
        long j = a01.OXO1.OXO1().getLong(b01.XOO0Xi, 0L);
        if (heartRates.isEmpty() || j + ((long) O0X11OiO.iXiX011) > System.currentTimeMillis()) {
            O0O0X0iOi(activity, R.string.guide_warm_title, heartRates.isEmpty() ? R.string.heath_reports_lack_of_data_tip : R.string.heath_reports_unchanged_of_data_tip, R.string.game_detail_guidance_knew, R.string.heath_reports_history_btn, function1, i);
        } else {
            function1.invoke2(Boolean.FALSE);
            activity.startActivity(new Intent(activity, (Class<?>) HeathReportsGenerateActivity.class));
        }
    }

    public final void iOiXi11II(@aa1 View layout, @aa1 final View btn, @aa1 final TextView tv, @aa1 final Activity activity, @aa1 final String itemType, @aa1 String query, final long j, @aa1 String mAiQuestion, boolean z) {
        final String strIX1O1;
        int i;
        Intrinsics.X0O(layout, "layout");
        Intrinsics.X0O(btn, "btn");
        Intrinsics.X0O(tv, "tv");
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(itemType, "itemType");
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(mAiQuestion, "mAiQuestion");
        if (mAiQuestion.length() == 0) {
            HeathReportsUtils heathReportsUtils = OXO1;
            strIX1O1 = iX1O1(heathReportsUtils, itemType, heathReportsUtils.XXIIO1i11(itemType), query, 0, 8, null);
        } else {
            strIX1O1 = mAiQuestion;
        }
        i1O0OXO1O.OXO1.OXO1("Project isLayoutVisibility :" + i72.OXO1.I0i0());
        if (z) {
            btn.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O1IIXO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                    HeathReportsUtils.i0X000X0O(activity, btn, strIX1O1, tv, itemType, j, view);
                }
            });
            i = 0;
        } else {
            i = 8;
        }
        layout.setVisibility(i);
    }

    /* JADX INFO: renamed from: iX */
    public final int m38816iX() {
        return X1ii;
    }

    public final PressureDao iXiX011() {
        return (PressureDao) IiI10X.getValue();
    }

    public final WorkoutDao iXiiiO() {
        return (WorkoutDao) OIi0.getValue();
    }

    public final boolean iii0(long j, long j2) {
        return j - j2 > DateUtils.f56805iO;
    }
}
