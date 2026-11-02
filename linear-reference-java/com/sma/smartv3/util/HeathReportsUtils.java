package com.sma.smartv3.util;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I00XXO;
import com.android.mltcode.paycertificationapi.I0X0iO;
import com.android.mltcode.paycertificationapi.IIi00OX;
import com.android.mltcode.paycertificationapi.IOOOX1O0O;
import com.android.mltcode.paycertificationapi.IXI1ii;
import com.android.mltcode.paycertificationapi.IXOOIiOI;
import com.android.mltcode.paycertificationapi.Ii1OIiiI0;
import com.android.mltcode.paycertificationapi.IiI1iX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O10i01;
import com.android.mltcode.paycertificationapi.O1IIXO0;
import com.android.mltcode.paycertificationapi.OI0I00I;
import com.android.mltcode.paycertificationapi.OIiO00X;
import com.android.mltcode.paycertificationapi.X0I0OI;
import com.android.mltcode.paycertificationapi.X1IiO01;
import com.android.mltcode.paycertificationapi.XIIiX110;
import com.android.mltcode.paycertificationapi.XXi11OO0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i11XOi1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOii1iIX1;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodGlucose2Dao;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.dao.HealthyReportDao;
import com.sma.smartv3.db.dao.HeartRateDao;
import com.sma.smartv3.db.dao.PressureDao;
import com.sma.smartv3.db.dao.SleepDao;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.dao.WorkoutDao;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.db.entity.HealthyReport;
import com.sma.smartv3.db.entity.HeartRate;
import com.sma.smartv3.db.entity.Sleep;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.db.entity.Workout;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.AIChatActivity;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.ui.status.HeathReportsGenerateActivity;
import com.sma.smartv3.ui.status.HistoryReportsActivity;
import com.sma.smartv3.ui.timezonepicker.TimeZonePicker;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.lang3.time.DateUtils;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHeathReportsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsUtils.kt\ncom/sma/smartv3/util/HeathReportsUtils\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,787:1\n69#2,3:788\n72#2,5:792\n87#2,7:838\n94#2,3:846\n70#2,7:849\n97#2:856\n69#2,3:857\n72#2,5:861\n1#3:791\n1#3:825\n1#3:845\n1#3:860\n1563#4:797\n1634#4,3:798\n1563#4:803\n1634#4,3:804\n1563#4:809\n1634#4,3:810\n1563#4:818\n1634#4,2:819\n1636#4:822\n1563#4:829\n1634#4,2:830\n1636#4:833\n19#5:801\n15#5:802\n19#5:807\n15#5:808\n19#5:813\n15#5:814\n50#5,3:815\n53#5:821\n55#5,2:823\n50#5,3:826\n53#5:832\n55#5,2:834\n35#5,2:836\n*S KotlinDebug\n*F\n+ 1 HeathReportsUtils.kt\ncom/sma/smartv3/util/HeathReportsUtils\n*L\n141#1:788,3\n141#1:792,5\n162#1:838,7\n162#1:846,3\n162#1:849,7\n162#1:856\n173#1:857,3\n173#1:861,5\n141#1:791\n162#1:845\n173#1:860\n226#1:797\n226#1:798,3\n330#1:803\n330#1:804,3\n460#1:809\n460#1:810,3\n663#1:818\n663#1:819,2\n663#1:822\n717#1:829\n717#1:830,2\n717#1:833\n252#1:801\n252#1:802\n450#1:807\n450#1:808\n604#1:813\n604#1:814\n663#1:815,3\n663#1:821\n663#1:823,2\n717#1:826,3\n717#1:832\n717#1:834,2\n731#1:836,2\n*E\n"})
public final class HeathReportsUtils {

    @aa1
    public static final Lazy I0IIOi = null;

    @aa1
    public static final String I0iXXO = null;

    @aa1
    public static final Lazy IO = null;

    @aa1
    public static final Lazy IiI10X = null;

    @aa1
    public static final Lazy O00 = null;
    public static final int O10IXXX0X = 0;

    @tb1
    public static go0 OIX0iXi;

    @aa1
    public static final Lazy OIi0 = null;

    @aa1
    public static final HeathReportsUtils OXO1 = null;
    public static final int X1ii = 0;

    @aa1
    public static final Lazy XIi00iiXO = null;

    @aa1
    public static final Lazy XO0O10 = null;

    @aa1
    public static final Lazy XOO0ii0 = null;

    @aa1
    public static final String XXI = null;

    @aa1
    public static final Lazy iO = null;

    static {
        OXO1 = new HeathReportsUtils();
        XIi00iiXO = LazyKt__LazyJVMKt.iO(new IXI1ii());
        iO = LazyKt__LazyJVMKt.iO(new XXi11OO0());
        XO0O10 = LazyKt__LazyJVMKt.iO(new iOii1iIX1());
        O00 = LazyKt__LazyJVMKt.iO(new IIi00OX());
        IiI10X = LazyKt__LazyJVMKt.iO(new I0X0iO());
        XOO0ii0 = LazyKt__LazyJVMKt.iO(new IOOOX1O0O());
        I0IIOi = LazyKt__LazyJVMKt.iO(new OI0I00I());
        OIi0 = LazyKt__LazyJVMKt.iO(new I00XXO());
        IO = LazyKt__LazyJVMKt.iO(new Ii1OIiiI0());
        I0iXXO = "HeathReportsUtils";
        XXI = "WeeklyExerciseStatistics";
        O10IXXX0X = 1;
    }

    public HeathReportsUtils() {
    }

    public static /* synthetic */ void I0IIOi(TextView r0) {
        Ii0X0X(r0);
    }

    public static /* synthetic */ SleepDao I0iXXO() {
        return iiIOiX();
    }

    public static /* synthetic */ void I1(HeathReportsUtils r7, List r8, float r9, float r10, long r11, String r13, int r14, Object r15) {
        if ((r14 & 16) == 0) goto L5;
        r13 = "";
    L5:
        r7.OX(r8, r9, r10, r11, r13);
    }

    public static /* synthetic */ void I1XOi1(Activity r0, View r1, String r2, TextView r3, String r4, long r5, View r7) {
        i0X000X0O(r0, r1, r2, r3, r4, r5, r7);
    }

    public static /* synthetic */ HealthyReportDao IIX1OXO() {
        return XOIX();
    }

    public static /* synthetic */ void IO(AIAnswer r0, View r1, TextView r2, String r3, long r4) {
        X00Xi1X(r0, r1, r2, r3, r4);
    }

    public static final WorkoutDao IO0iXO0O() {
        return MyDb.INSTANCE.getMDatabase().workoutDao();
    }

    public static final boolean IX1XiI(Function1 r1) {
        r1.invoke(Boolean.FALSE);
        return true;
    }

    public static final BloodOxygenDao IXI() {
        return MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
    }

    public static final void IXOIIIO(Activity r15, View r16) {
        AIFunctionDataKt.toAIFunction(r15, new AIFunction(AIFunctionType.HEALTH_QA, UtilsKt.XXO(R.string.health_qa), R.drawable.ai_function_health_qa_bg, UtilsKt.XXO(R.string.health_qa_desc), R.drawable.icon_ai_function_health_qa, 0, null, null, null, null, true, new Intent(Utils.getApp(), AIChatActivity.class), TimeZonePicker.OXO1, null));
    }

    public static final void Ii0X0X(TextView r1) {
        r1.setText("");
    }

    public static final BloodGlucose2Dao Ii0i() {
        return MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();
    }

    public static /* synthetic */ Unit IiI10X(Activity r0, View r1, TextView r2, String r3, long r4, AIAnswer r6) {
        return XXiIiX10(r0, r1, r2, r3, r4, r6);
    }

    public static final BloodPressureDao IiiXiI0I() {
        return MyDb.INSTANCE.getMDatabase().bloodPressureDao();
    }

    public static /* synthetic */ BloodOxygenDao O00() {
        return IXI();
    }

    public static /* synthetic */ void O10IXXX0X(View r0) {
        i11I(r0);
    }

    public static /* synthetic */ void OII(HeathReportsUtils r7, List r8, int r9, int r10, long r11, String r13, int r14, Object r15) {
        if ((r14 & 16) == 0) goto L5;
        r13 = "";
    L5:
        r7.XiOIii1(r8, r9, r10, r11, r13);
    }

    public static /* synthetic */ boolean OIX0iXi(Function1 r0) {
        return IX1XiI(r0);
    }

    public static /* synthetic */ PressureDao OIi0() {
        return XOO0XOOii();
    }

    public static /* synthetic */ void OXO1(Activity r0, View r1) {
        IXOIIIO(r0, r1);
    }

    public static final WeightDao Oi() {
        return MyDb.INSTANCE.getMDatabase().weightDao();
    }

    public static /* synthetic */ void OiIIX101O(HeathReportsUtils r7, List r8, int r9, int r10, long r11, String r13, int r14, Object r15) {
        if ((r14 & 16) == 0) goto L5;
        r13 = "";
    L5:
        r7.XX0(r8, r9, r10, r11, r13);
    }

    public static /* synthetic */ void X00XIX1(HeathReportsUtils r13, View r14, View r15, TextView r16, Activity r17, String r18, String r19, long r20, String r22, boolean r23, int r24, Object r25) {
        if ((r24 & 128) == 0) goto L5;
        String r11 = "";
    L7:
        if ((r24 & 256) == 0) goto L10;
        boolean r12 = i72.OXO1.I0i0();
    L11:
        r13.iOiXi11II(r14, r15, r16, r17, r18, r19, r20, r11, r12);
        return;
    L10:
        r12 = r23;
        goto L11
    L5:
        r11 = r22;
        goto L7
    }

    public static final void X00Xi1X(AIAnswer r1, View r2, TextView r3, String r4, long r5) {
        if (r1 != null) goto L6;
        r2.setEnabled(true);
        return;
    L6:
        r3.setVisibility(0);
        r3.setText(r1.getText());
        if (r1.getEnded() != 1) goto L10;
        OXO1.IO0II0i(r4, r5, r1.getText());
        return;
    }

    public static /* synthetic */ void X01IiOiIi(HeathReportsUtils r0, Activity r1, Function1 r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = X1ii;
    L5:
        r0.iOOX010X(r1, r2, r3);
    }

    public static /* synthetic */ WorkoutDao X0O() {
        return IO0iXO0O();
    }

    public static /* synthetic */ BloodPressureDao X1ii() {
        return IiiXiI0I();
    }

    public static /* synthetic */ Unit XIi00iiXO(Activity r0, String r1, View r2, TextView r3, String r4, long r5, boolean r7) {
        return XO0X10iO(r0, r1, r2, r3, r4, r5, r7);
    }

    public static /* synthetic */ BloodGlucose2Dao XO0O10() {
        return Ii0i();
    }

    public static final Unit XO0X10iO(final Activity r7, String r8, final View r9, final TextView r10, final String r11, final long r12, boolean r14) {
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " startHeathAnalyze b = " + r14);
        if (r14 == false) goto L5;
        a01.OXO1.OXO1().put(b01.OI1IiOO1i, true);
        r7.runOnUiThread(new IXOOIiOI(r10));
        iXi(OXO1, r8, 0, new X1IiO01(r7, r9, r10, r11, r12), 2, null);
    L7:
        return Unit.OXO1;
    L5:
        r9.setEnabled(true);
        goto L7
    }

    public static final HealthyReportDao XOIX() {
        return MyDb.INSTANCE.getMDatabase().healthyReportDao();
    }

    public static final PressureDao XOO0XOOii() {
        return MyDb.INSTANCE.getMDatabase().pressureDao();
    }

    public static /* synthetic */ WeightDao XOO0ii0() {
        return Oi();
    }

    public static final HeartRateDao XOXiX0() {
        return MyDb.INSTANCE.getMDatabase().heartRateDao();
    }

    public static /* synthetic */ HeartRateDao XXI() {
        return XOXiX0();
    }

    public static final Unit XXiIiX10(Activity r9, final View r10, final TextView r11, final String r12, final long r13, final AIAnswer r15) {
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " startAIAnalyze");
        r9.runOnUiThread(new O10i01(r15, r10, r11, r12, r13));
        return Unit.OXO1;
    }

    public static final boolean XXiO0i(int r3, Activity r4, int r5, Function1 r6) {
        if (r3 == R.string.agree) goto L12;
        if (r3 != R.string.confirm) goto L7;
        String r7 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r8 = new Bundle();
        r8.putString("mArg0", r7);
        r8.putInt("mArg1", 2);
        r8.putParcelable("mArg2", null);
        r8.putSerializable("mArg3", null);
        Intent r9 = new Intent(r4, GoogleWebViewActivity.class);
        r9.putExtras(r8);
        r4.startActivity(r9);
    L15:
        return true;
    L7:
        if (r3 != R.string.heath_reports_history_btn) goto L15;
        r4.startActivity(new Intent(r4, HistoryReportsActivity.class));
        goto L15
    L12:
        if (r5 != X1ii) goto L14;
        r6.invoke(Boolean.TRUE);
        goto L15
    L14:
        OIX0iXi = null;
        a01.OXO1.OXO1().put(b01.OI1IiOO1i, true);
        OXO1.iOOX010X(r4, r6, r5);
        goto L15
    }

    public static /* synthetic */ void Xi1i0XOX0(HeathReportsUtils r0, Activity r1, Function1 r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = X1ii;
    L5:
        r0.O0O(r1, r2, r3);
    }

    public static final void i0X000X0O(final Activity r8, final View r9, final String r10, final TextView r11, final String r12, final long r13, View r15) {
        r8.runOnUiThread(new i11XOi1(r9));
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " setOnClickListener");
        OXO1.O0O(r8, new XIIiX110(r8, r10, r9, r11, r12, r13), X1ii);
    }

    public static final void i11I(View r1) {
        r1.setEnabled(false);
    }

    public static /* synthetic */ void iIiiO(HeathReportsUtils r7, List r8, double r9, long r11, String r13, int r14, Object r15) {
        if ((r14 & 8) == 0) goto L5;
        r13 = "";
    L5:
        r7.XiOIO(r8, r9, r11, r13);
    }

    public static /* synthetic */ boolean iO(int r0, Activity r1, int r2, Function1 r3) {
        return XXiO0i(r0, r1, r2, r3);
    }

    public static /* synthetic */ void iOI(HeathReportsUtils r8, Activity r9, int r10, int r11, int r12, int r13, Function1 r14, int r15, int r16, Object r17) {
        if ((r16 & 2) == 0) goto L5;
        r10 = R.string.tip;
    L5:
        int r2 = r10;
        if ((r16 & 4) == 0) goto L8;
        r11 = R.string.points_insufficient_tip;
    L8:
        int r3 = r11;
        if ((r16 & 8) == 0) goto L11;
        r12 = R.string.cancel;
    L11:
        int r4 = r12;
        if ((r16 & 16) == 0) goto L14;
        r13 = R.string.confirm;
    L14:
        int r5 = r13;
        if ((r16 & 64) == 0) goto L18;
        int r7 = X1ii;
    L19:
        r8.O0O0X0iOi(r9, r2, r3, r4, r5, r14, r7);
        return;
    L18:
        r7 = r15;
        goto L19
    }

    public static /* synthetic */ String iX1O1(HeathReportsUtils r0, String r1, String r2, String r3, int r4, int r5, Object r6) {
        if ((r5 & 8) == 0) goto L6;
        r4 = 50;
    L6:
        return r0.iI(r1, r2, r3, r4);
    }

    public static /* synthetic */ void iXi(HeathReportsUtils r0, String r1, int r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 50;
    L8:
        r0.IX0IXOi(r1, r2, r3);
    }

    public static final SleepDao iiIOiX() {
        return MyDb.INSTANCE.getMDatabase().sleepDao();
    }

    public static /* synthetic */ void iiiO(HeathReportsUtils r0, List r1, List r2, long r3, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        r0.Ii1iii0(r1, r2, r3);
    }

    public final void II1Xi0(@aa1 List<BloodGlucose2> r10, @aa1 List<TodayData> r11) {
        Intrinsics.X0O(r10, "bloodGlucose2List");
        Intrinsics.X0O(r11, "list");
        if (r10.isEmpty() == true) goto L6;
        BloodGlucose2 r12 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(r10);
        iIiiO(this, r11, r12.getMUpperBound(), r12.getMTime(), null, 8, null);
        return;
    }

    public final void IO0II0i(String r11, long r12, String r14) {
        JsonArray r0 = JsonParser.parseString(a01.OXO1.OXO1().getString(b01.X11)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r0);     // Catch: Exception -> L8
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r1 = r0.iterator();     // Catch: Exception -> L8
    L5:
        if (r1.hasNext() == false) goto L9;
        JsonElement r3 = r1.next();     // Catch: Exception -> L8
        r2.add(new Gson().fromJson(r3, HeathItemReports.class));     // Catch: Exception -> L8
    L9:
        List r4 = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        if (r4 != null) goto L12;
        r4 = new ArrayList();
    L12:
        Iterator r5 = r4.iterator();
    L14:
        if (r5.hasNext() == false) goto L18;
        Object r6 = r5.next();
        if (Intrinsics.XOO0ii0(((HeathItemReports) r6).getDataType(), r11) == false) goto L14;
    L19:
        HeathItemReports r7 = (HeathItemReports) r6;
        if (r7 != null) goto L23;
        r4.add(new HeathItemReports(r12, r11, 1, r14));
    L27:
        a01.OXO1.OXO1().put(b01.X11, new Gson().toJson(r4));
        return;
    L23:
        if (XOX0O0(r12, r7.getTime()) == false) goto L25;
        r7.setNumber(r7.getNumber() + 1);
        r7.setTime(r12);
    L26:
        r7.setAiExtraInfo(r14);
        goto L27
    L25:
        r7.setNumber(1);
        r7.setTime(r12);
        goto L26
    L18:
        r6 = null;
    L8:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    public final void IX0IXOi(@aa1 String r11, int r12, @aa1 final Function1<? super AIAnswer, Unit> r13) {
        Intrinsics.X0O(r11, "mAiQuestion");
        Intrinsics.X0O(r13, "action");
        if (i72.OXO1.OIIOI() == false) goto L6;
        AIManager.OXO1.XXO(new AIQuestion(AIFunctionType.HEALTH_QA_ANALYZE, r11, null, null, false, false, 60, null), new HeathReportsUtils$startAIAnalyze$1(r13), false);
        return;
    L6:
        AIManager.iXiX011(AIManager.OXO1, new AIQuestion(AIFunctionType.HEALTH_QA_ANALYZE, r11, null, null, false, false, 60, null), new HeathReportsUtils$startAIAnalyze$2(r13), false, false, r12, 0, 40, null);
    }

    public final int IXXOO() {
        return O10IXXX0X;
    }

    public final void Ii1iii0(List<Sleep> r10, List<TodayData> r11, long r12) {
        if (r10.isEmpty() == true) goto L21;
        SleepAllDayData r13 = SleepAllDayDataParse.INSTANCE.filterData(r10, 100.0f, null, r12);
        LogUtils.d(new Object[]{r13.toString()});
        int r14 = (r13.getStatus().get(1) + r13.getStatus().get(2)) + r13.getStatus().get(3);
        int r3 = r13.getStatus().get(8);
        if (r14 == 0) goto L22;
        List<Sleep> r15 = r10;
        ArrayList r16 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r15, 10));
        Iterator<T> r17 = r15.iterator();
        long r4 = 0;
    L8:
        if (r17.hasNext() == false) goto L15;
        Sleep r2 = (Sleep) r17.next();
        if (r2.getMMode() != 17) goto L14;
        if (r4 != 0) goto L14;
        r4 = r2.getMTime();
    L14:
        r16.add(Unit.OXO1);
        goto L8
    L15:
        OiIIX101O(this, r11, r14, r3, r4, null, 16, null);
        return;
    L22:
        return;
    }

    public final SleepDao O001I() {
        return (SleepDao) O00.getValue();
    }

    public final void O0O(@aa1 Activity r12, @aa1 Function1<? super Boolean, Unit> r13, int r14) {
        Intrinsics.X0O(r12, "activity");
        Intrinsics.X0O(r13, "action");
        q62 r0 = q62.OXO1;
        if (r0.OO1O00iI() == false) goto L13;
        i72 r1 = i72.OXO1;
        if (r1.Ii() == true) goto L13;
        if (r0.OIXOOi() == true) goto L13;
        if (r0.IiO0() == true) goto L13;
        i1O0OXO1O.OXO1.OXO1("startHeathAnalyze NO AI inlineSupport = " + r0.OO1O00iI() + " , isUserMember = " + r1.Ii() + ",  userMemberLatestDateTime = " + r1.XXO() + " isSupportSparkChainAI = " + r0.OIXOOi());
        iOI(this, r12, 0, R.string.ai_benefit_buy_tip, 0, 0, r13, r14, 26, null);
        return;
    L13:
        if (a01.OXO1.OXO1().getBoolean(b01.OI1IiOO1i, false) == false) goto L16;
        iOOX010X(r12, r13, r14);
        return;
    L16:
        O0O0X0iOi(r12, R.string.information_authorization, R.string.information_authorization_content, R.string.dis_agree, R.string.agree, r13, r14);
    }

    public final void O0O0X0iOi(final Activity r6, int r7, int r8, int r9, final int r10, final Function1<? super Boolean, Unit> r11, final int r12) {
        if (OIX0iXi != null) goto L5;
        int r4 = 0;
        go0 r0 = new go0(r6, r4, 2, null);
        r0.O1O(r7);
        r0.iX(Integer.valueOf(r8));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(r9), new OIiO00X(r11));
        r0.X1IX(r10, new IiI1iX0(r10, r6, r12, r11));
        OIX0iXi = r0;
    L5:
        go0 r13 = OIX0iXi;
        if (r13 != null) goto L8;
    L10:
        go0 r14 = OIX0iXi;
        if (r14 == null) goto L14;
        r14.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r13.isShowing() != true) goto L10;
    }

    @aa1
    public final List<TodayData> O1O() {
        ArrayList r0 = new ArrayList();
        long r4 = System.currentTimeMillis();
        HeartRateDao r1 = iIXi1iiXI();
        long r2 = r4 - ((long) O0X11OiO.iXiX011);
        TodayHealthyDataKt.getHealthyDataHeart(r1.getHeartRates(r2, r4), r0);
        TodayHealthyDataKt.getBloodPressureDataHeart(X1IX().getBloodPressures(r2, r4), r0);
        TodayHealthyDataKt.getBloodOxyDataHeart(XXX11i().getBloodOxygen(r2, r4), r0);
        Ii1iii0(O001I().getSleeps(r2, r4), r0, r4);
        TodayHealthyDataKt.getHealthyDataPressure(iXiX011().getPressures(r2, r4), r0);
        II1Xi0(X11iII1O1().getList(r2, r4), r0);
        XX1Oi(XXO().getWeightsASC(r2, r4), r0);
        long r3 = r4 - ((long) 604800000);
        X100O(r3, WorkoutDao.getListDESC$default(iXiiiO(), r3, r4, 0, 4, null), r0);
        return r0;
    }

    public final void OO(@tb1 List<TodayData> r54, @aa1 Function1<? super Long, Unit> r55) {
        Intrinsics.X0O(r55, "action");
        List<TodayData> r1 = r54;
        if (r1 != null) goto L5;
    L44:
        r55.invoke(0L);
        return;
    L5:
        if (r1.isEmpty() == true) goto L44;
        SPUtils r2 = a01.OXO1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L11;
        r3 = r4;
    L11:
        AppUser r5 = (AppUser) r3;
        long r6 = System.currentTimeMillis();
        HealthyReport r7 = new HealthyReport(0, 0, 0.0f, 0.0f, 0, null, 0, 0, 0, null, 0, 0, 0, null, 0, 0, null, 0, 0.0f, 0.0f, null, 0, 0, null, 0, 0.0f, null, 0, 0.0f, null, 0, 0, 0, null, 0, -1, 7, null);
        r7.setMUserGender(r5.getGender());
        r7.setMUserWeight(r5.getWeight());
        r7.setMUserHeight(r5.getHeight());
        r7.setMTime(r6);
        String r8 = O0X11OiO.XO0O10().format(Long.valueOf(r6));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        r7.setMLocalTime(r8);
        Intrinsics.XXI(r54);
        List<TodayData> r9 = r54;
        ArrayList r10 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r9, 10));
        Iterator<T> r11 = r9.iterator();
        int r12 = 0;
    L13:
        if (r11.hasNext() == false) goto L42;
        TodayData r13 = (TodayData) r11.next();
        if (r13.getStateColor() == 2) goto L17;
        r12 = r12 + 1;
    L17:
        String r14 = r13.getDataType();
        if (Intrinsics.XOO0ii0(r14, "heart_rate") == false) goto L21;
        r7.setMHeartRateTime(r13.getTime());
        r7.setMHeartRateValue((int) r13.getValue1());
        r7.setMHeartRateAIRecords(r13.getMExtraInfo());
    L41:
        r10.add(Unit.OXO1);
        goto L13
    L21:
        if (Intrinsics.XOO0ii0(r14, q62.OXOXXiI) == false) goto L24;
        r7.setMBloodPressureTime(r13.getTime());
        r7.setMSystolicValue((int) r13.getValue1());
        r7.setMDiastolicValue((int) r13.getValue2());
        r7.setMBloodPressureAIRecords(r13.getMExtraInfo());
        goto L41
    L24:
        if (Intrinsics.XOO0ii0(r14, q62.IiOIO1OX) == false) goto L27;
        r7.setMBloodOxygenTime(r13.getTime());
        r7.setMBloodOxygenValue((int) r13.getValue1());
        r7.setMBloodOxygenAIRecords(r13.getMExtraInfo());
        goto L41
    L27:
        if (Intrinsics.XOO0ii0(r14, "sleep") == false) goto L30;
        r7.setMSleepTime(r13.getTime());
        r7.setMSleepDeepLengthTime(r13.getValue1());
        r7.setMSleepPiecemealTime(r13.getValue2());
        r7.setMSleepAIRecords(r13.getMExtraInfo());
        goto L41
    L30:
        if (Intrinsics.XOO0ii0(r14, q62.IIII0II) == false) goto L33;
        r7.setMPressureTime(r13.getTime());
        r7.setMPressureValue((int) r13.getValue1());
        r7.setMPressureAIRecords(r13.getMExtraInfo());
        goto L41
    L33:
        if (Intrinsics.XOO0ii0(r14, q62.O001OXi) == false) goto L36;
        r7.setMBloodGlucose2Time(r13.getTime());
        r7.setMBloodGlucose2Value(r13.getValue1());
        r7.setMBloodGlucose2AIRecords(r13.getMExtraInfo());
        goto L41
    L36:
        if (Intrinsics.XOO0ii0(r14, "weight") == false) goto L39;
        r7.setMWeightTime(r13.getTime());
        r7.setMWeightValue(r13.getValue1());
        r7.setMWeightAIRecords(r13.getMExtraInfo());
        goto L41
    L39:
        if (Intrinsics.XOO0ii0(r14, XXI) == false) goto L41;
        r7.setMWeekSportsTime(r13.getTime());
        r7.setMWeekSportsNumber((int) r13.getValue1());
        r7.setMWeekSportsAllTime((int) r13.getValue2());
        r7.setMWeekSportsAIRecords(r13.getMExtraInfo());
        goto L41
    L42:
        r7.setMIsSync(0);
        r7.setMAbnormalNumber(r12);
        r55.invoke(Long.valueOf(X0i1O().insert(r7)));
    }

    public final void OX(@aa1 List<TodayData> r16, float r17, float r18, long r19, @aa1 String r21) {
        Intrinsics.X0O(r16, "list");
        Intrinsics.X0O(r21, "mExtraInfo");
        float r12 = r17 / ((r18 * r18) / 10000);
        double r1 = r12;
        if (r1 < 29.9d) goto L7;
        String r2 = UtilsKt.XXO(R.string.too_heavy);
        int r3 = 3;
    L5:
        String r6 = r2;
        int r7 = r3;
        r16.add(new TodayData(r19, UtilsKt.XXO(R.string.weight), r17 + UtilsKt.XXO(R.string.kg) + "\n" + UtilsKt.XXO(R.string.bmi) + CertificateUtil.DELIMITER + cp5.I0IIOi(r17, r18), r6, r7, "weight", 0, r21, r17, r12, 64, null));
        return;
    L7:
        if (r1 <= 24.9d) goto L10;
        r2 = UtilsKt.XXO(R.string.too_heavy);
        r3 = 1;
        goto L5
    L10:
        if (r1 <= 18.4d) goto L12;
        r2 = UtilsKt.XXO(R.string.normal);
        r3 = 2;
        goto L5
    L12:
        r2 = UtilsKt.XXO(R.string.thin);
        r3 = 0;
        goto L5
    }

    @aa1
    public final List<TodayData> OX110i(@tb1 HealthyReport r9) {
        ArrayList r1 = new ArrayList();
        if (r9 != null) goto L5;
    L30:
        return r1;
    L5:
        if (r9.getMHeartRateValue() <= 0) goto L8;
        TodayHealthyDataKt.addHealthyDataHeart(r1, r9.getMHeartRateValue(), r9.getMHeartRateTime(), r9.getMHeartRateAIRecords());
    L8:
        if (r9.getMSystolicValue() <= 0) goto L13;
        if (r9.getMDiastolicValue() <= 0) goto L13;
        TodayHealthyDataKt.addHealthyDataBloodPressure(r1, r9.getMSystolicValue(), r9.getMDiastolicValue(), r9.getMBloodPressureTime(), r9.getMBloodPressureAIRecords());
        r1 = r1;
    L13:
        if (r9.getMBloodOxygenTime() <= 0) goto L16;
        TodayHealthyDataKt.addHealthyDataBloodOxy(r1, r9.getMBloodOxygenValue(), r9.getMBloodOxygenTime(), r9.getMBloodOxygenAIRecords());
    L16:
        if (r9.getMSleepTime() <= 0) goto L19;
        XX0(r1, (int) r9.getMSleepDeepLengthTime(), (int) r9.getMSleepPiecemealTime(), r9.getMSleepTime(), r9.getMSleepAIRecords());
    L19:
        if (r9.getMPressureValue() <= 0) goto L22;
        TodayHealthyDataKt.addHealthyDataPressure(r1, r9.getMPressureValue(), r9.getMPressureTime(), r9.getMPressureAIRecords());
    L22:
        if (r9.getMBloodGlucose2Value() <= 0.0f) goto L25;
        XiOIO(r1, r9.getMBloodGlucose2Value(), r9.getMBloodGlucose2Time(), r9.getMBloodGlucose2AIRecords());
    L25:
        if (r9.getMWeightValue() <= 0.0f) goto L28;
        OX(r1, r9.getMWeightValue(), r9.getMUserHeight(), r9.getMWeightTime(), r9.getMWeightAIRecords());
    L28:
        if (r9.getMWeekSportsAllTime() <= 0) goto L30;
        XiOIii1(r1, r9.getMWeekSportsNumber(), r9.getMWeekSportsAllTime(), r9.getMWeekSportsTime(), r9.getMWeekSportsAIRecords());
        goto L30
    }

    public final HealthyReportDao X0i1O() {
        return (HealthyReportDao) IO.getValue();
    }

    public final void X1(@aa1 String r17, long r18, @aa1 View r20, @aa1 TextView r21, @aa1 View r22, @aa1 View r23, @aa1 final Activity r24) {
        Intrinsics.X0O(r17, "itemType");
        Intrinsics.X0O(r20, "btn");
        Intrinsics.X0O(r21, "tv");
        Intrinsics.X0O(r22, "layoutTip");
        Intrinsics.X0O(r23, "questionsBtn");
        Intrinsics.X0O(r24, "activity");
        JsonArray r8 = JsonParser.parseString(a01.OXO1.OXO1().getString(b01.X11)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r8);     // Catch: Exception -> L8
        Collection r9 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r10 = r8.iterator();     // Catch: Exception -> L8
    L5:
        if (r10.hasNext() == false) goto L9;
        r9.add(new Gson().fromJson(r10.next(), HeathItemReports.class));     // Catch: Exception -> L8
    L9:
        if (r9 != null) goto L11;
        r9 = new ArrayList();
    L11:
        r20.setEnabled(false);
        Iterator r11 = r9.iterator();
    L13:
        if (r11.hasNext() == false) goto L17;
        Object r12 = r11.next();
        if (Intrinsics.XOO0ii0(((HeathItemReports) r12).getDataType(), r17) == false) goto L13;
    L18:
        HeathItemReports r13 = (HeathItemReports) r12;
        i1O0OXO1O.OXO1.OXO1(I0iXXO + " itemLayoutNumberControl item = " + r13);
        if (r13 != null) goto L22;
        r21.setVisibility(8);
        r22.setVisibility(8);
        r20.setEnabled(true);
    L28:
        r23.setOnClickListener(new X0I0OI(r24));
        return;
    L22:
        if (r18 == r13.getTime()) goto L27;
        if (iii0(r18, r13.getTime()) == false) goto L27;
        r20.setEnabled(true);
        r22.setVisibility(0);
        r21.setVisibility(0);
        r21.setText(r13.getAiExtraInfo());
        r21.setText(UtilsKt.XXO(R.string.ai_parsing_time) + " : " + O0X11OiO.iI().format(Long.valueOf(r13.getTime())) + " \n" + r13.getAiExtraInfo());
    L27:
        r22.setVisibility(0);
        r21.setVisibility(0);
        r21.setText(r13.getAiExtraInfo());
        r21.setText(UtilsKt.XXO(R.string.ai_parsing_time) + " : " + O0X11OiO.iI().format(Long.valueOf(r13.getTime())) + " \n" + r13.getAiExtraInfo());
        goto L28
    L17:
        r12 = null;
    L8:
        r9 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    public final void X100O(long r11, @aa1 List<Workout> r13, @aa1 List<TodayData> r14) {
        Intrinsics.X0O(r13, "workoutList");
        Intrinsics.X0O(r14, "list");
        List<Workout> r0 = r13;
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
        int r4 = 0;
    L4:
        if (r2.hasNext() == false) goto L6;
        r4 = r4 + ((Workout) r2.next()).getMDuration();
        r1.add(Unit.OXO1);
        goto L4
    L6:
        if (r4 <= 0) goto L10;
        OII(this, r14, r13.size(), r4, r11, null, 16, null);
        return;
    }

    @aa1
    public final String X11I() {
        return XXI;
    }

    public final BloodGlucose2Dao X11iII1O1() {
        return (BloodGlucose2Dao) XOO0ii0.getValue();
    }

    public final BloodPressureDao X1IX() {
        return (BloodPressureDao) iO.getValue();
    }

    public final boolean XOX0O0(long r1, long r3) {
        return Instant.ofEpochMilli(r1).atZone(ZoneId.systemDefault()).toLocalDate().isEqual(Instant.ofEpochMilli(r3).atZone(ZoneId.systemDefault()).toLocalDate());
    }

    public final void XX0(@aa1 List<TodayData> r19, int r20, int r21, long r22, @aa1 String r24) {
        Intrinsics.X0O(r19, "list");
        Intrinsics.X0O(r24, "mExtraInfo");
        if (r21 == 0) goto L6;
        String r3 = UtilsKt.XXO(R.string.night_sleep) + CertificateUtil.DELIMITER + (r20 / 60) + UtilsKt.XXO(R.string.h) + (r20 % 60) + UtilsKt.XXO(R.string.h_m) + "\n" + UtilsKt.XXO(R.string.piecemeal) + CertificateUtil.DELIMITER + (r21 / 60) + UtilsKt.XXO(R.string.h) + (r21 % 60) + UtilsKt.XXO(R.string.h_m);
        int r7 = r20 + r21;
    L5:
        String r8 = r3;
        int r9 = r7 / 60;
        if (r9 < 9) goto L12;
        String r4 = UtilsKt.XXO(R.string.lightness_high);
        int r5 = 3;
    L16:
        r19.add(new TodayData(r22, UtilsKt.XXO(R.string.sleep), r8, r4, r5, "sleep", 0, r24, r20, r21, 64, null));
        return;
    L12:
        if (r9 < 7) goto L15;
        if (r9 >= 9) goto L15;
        r4 = UtilsKt.XXO(R.string.general);
        r5 = 2;
    L15:
        r4 = UtilsKt.XXO(R.string.data_lower);
        r5 = 1;
        goto L16
    L6:
        r3 = UtilsKt.XXO(R.string.night_sleep) + CertificateUtil.DELIMITER + (r20 / 60) + UtilsKt.XXO(R.string.h) + (r20 % 60) + UtilsKt.XXO(R.string.h_m);
        r7 = r20;
        goto L5
    }

    public final String XX00i10X(String r7) {
        return oe5.IXO0OOi(r7, "\n", I000IiI1O.iO.XO0O10, false, 4, null);
    }

    public final void XX1Oi(@aa1 List<Weight> r35, @aa1 List<TodayData> r36) {
        Intrinsics.X0O(r35, "weightList");
        Intrinsics.X0O(r36, "list");
        if (r35.isEmpty() == true) goto L10;
        Weight r0 = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(r35);
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r2 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r2 == null) goto L8;
        r4 = r2;
    L8:
        float r5 = ((AppUser) r4).getHeight();
        I1(this, r36, r0.getMWeight(), r5, r0.getMTime(), null, 16, null);
        return;
    }

    public final String XXIIO1i11(String r2) {
        switch(r2.hashCode()) {
            case -1276242363: goto L36;
            case -791592328: goto L31;
            case -240915579: goto L26;
            case 109522647: goto L21;
            case 560044778: goto L16;
            case 1467734697: goto L11;
            case 1930449209: goto L6;
            default: goto L38;
        };
    L6:
        if (r2.equals("heart_rate") == false) goto L38;
        return UtilsKt.XXO(R.string.heart_rate);
    L11:
        if (r2.equals(q62.O001OXi) == false) goto L38;
        return UtilsKt.XXO(R.string.blood_glucose);
    L16:
        if (r2.equals(q62.OXOXXiI) == false) goto L38;
        return UtilsKt.XXO(R.string.blood_pressure);
    L21:
        if (r2.equals("sleep") == false) goto L38;
        return UtilsKt.XXO(R.string.sleep);
    L26:
        if (r2.equals(q62.IiOIO1OX) == false) goto L38;
        return UtilsKt.XXO(R.string.blood_oxygen);
    L31:
        if (r2.equals("weight") == false) goto L38;
        return UtilsKt.XXO(R.string.weight);
    L36:
        if (r2.equals(q62.IIII0II) == false) goto L38;
        return UtilsKt.XXO(R.string.pressure);
    L38:
        return UtilsKt.XXO(R.string.health_data);
    }

    public final WeightDao XXO() {
        return (WeightDao) I0IIOi.getValue();
    }

    public final BloodOxygenDao XXX11i() {
        return (BloodOxygenDao) XO0O10.getValue();
    }

    public final void XiOIO(@aa1 List<TodayData> r19, double r20, long r22, @aa1 String r24) {
        Intrinsics.X0O(r19, "list");
        Intrinsics.X0O(r24, "mExtraInfo");
        if (r20 < 6.9d) goto L7;
        String r3 = UtilsKt.XXO(R.string.lightness_high);
        int r4 = 3;
    L5:
        String r9 = r3;
        int r10 = r4;
        r19.add(new TodayData(r22, UtilsKt.XXO(R.string.blood_glucose), r20 + UtilsKt.XXO(R.string.bg_unit), r9, r10, q62.O001OXi, 0, r24, (float) r20, 0.0f, 576, null));
        return;
    L7:
        if (r20 >= 6.1d) goto L9;
        r3 = UtilsKt.XXO(R.string.data_lower);
        r4 = 1;
        goto L5
    L9:
        r3 = UtilsKt.XXO(R.string.pressure_level_normal);
        r4 = 2;
        goto L5
    }

    public final void XiOIii1(@aa1 List<TodayData> r19, int r20, int r21, long r22, @aa1 String r24) {
        Intrinsics.X0O(r19, "list");
        Intrinsics.X0O(r24, "mExtraInfo");
        String r7 = UtilsKt.XXO(R.string.heath_week_sport_title);
        String r3 = UtilsKt.XXO(R.string.times);
        String r4 = UtilsKt.XXO(R.string.heath_week_sport_alltime);
        r19.add(new TodayData(r22, r7, r20 + r3 + "\n" + r4 + CertificateUtil.DELIMITER + (r21 / 3600) + O0X11OiO.iOO1ii1, "", 2, XXI, 0, r24, r20, r21, 64, null));
    }

    @aa1
    public final HealthyReport i010I(long r2) {
        return X0i1O().getHealthyReport(r2);
    }

    @aa1
    public final String iI(@aa1 String r36, @aa1 String r37, @aa1 String r38, int r39) {
        Intrinsics.X0O(r36, "itemType");
        Intrinsics.X0O(r37, "title");
        Intrinsics.X0O(r38, "query");
        String r2 = XX00i10X(r38);
        Application r4 = Utils.getApp();
        Intrinsics.O10IXXX0X(r4, "getApp(...)");
        if (UtilsKt.IXI(r4) == false) goto L5;
        int r5 = r39;
    L7:
        switch(r36.hashCode()) {
            case -1276242363: goto L40;
            case -791592328: goto L27;
            case -240915579: goto L24;
            case 109522647: goto L19;
            case 560044778: goto L16;
            case 1467734697: goto L13;
            case 1930449209: goto L10;
            default: goto L45;
        };
    L45:
        return "";
    L10:
        if (r36.equals("heart_rate") == true) goto L42;
        return "";
    L42:
        return String.valueOf(Utils.getApp().getString(R.string.ai_heath_question1, new Object[]{r37, r2, r37, r2, Integer.valueOf(r5)}));
    L13:
        if (r36.equals(q62.O001OXi) == true) goto L42;
        return "";
    L16:
        if (r36.equals(q62.OXOXXiI) == true) goto L42;
        return "";
    L19:
        if (r36.equals("sleep") == true) goto L22;
        return "";
    L22:
        return String.valueOf(Utils.getApp().getString(R.string.ai_heath_question2, new Object[]{r37, r2, Integer.valueOf(r5)}));
    L24:
        if (r36.equals(q62.IiOIO1OX) == true) goto L42;
        return "";
    L27:
        if (r36.equals("weight") == false) goto L51;
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r6 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r1 = new Gson().fromJson(r0.getString(AppUser.class.getName()), AppUser.class);
        if (r1 == null) goto L33;
        r6 = r1;
    L33:
        AppUser r7 = (AppUser) r6;
        if (r7.getGender() != 0) goto L36;
        String r3 = Utils.getApp().getString(R.string.female);
    L37:
        Intrinsics.XXI(r3);
        return String.valueOf(Utils.getApp().getString(R.string.ai_heath_question3, new Object[]{r3, String.valueOf(r7.getHeight()), r2, Integer.valueOf(r5)}));
    L36:
        r3 = Utils.getApp().getString(R.string.male);
        goto L37
    L51:
        return "";
    L40:
        if (r36.equals(q62.IIII0II) == true) goto L42;
        return "";
    L5:
        r5 = r39 * 2;
        goto L7
    }

    public final HeartRateDao iIXi1iiXI() {
        return (HeartRateDao) XIi00iiXO.getValue();
    }

    @aa1
    public final List<HealthyReport> iOO1ii1() {
        return X0i1O().getListASC();
    }

    public final void iOOX010X(Activity r10, Function1<? super Boolean, Unit> r11, int r12) {
        if (r12 != X1ii) goto L6;
        r11.invoke(Boolean.TRUE);
        return;
    L6:
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        List<HeartRate> r1 = iIXi1iiXI().getHeartRates(r0[0], r0[1]);
        long r2 = a01.OXO1.OXO1().getLong(b01.XOO0Xi, 0);
        if (r1.isEmpty() == true) goto L14;
        if ((r2 + ((long) O0X11OiO.iXiX011)) > System.currentTimeMillis()) goto L14;
        r11.invoke(Boolean.FALSE);
        r10.startActivity(new Intent(r10, HeathReportsGenerateActivity.class));
        return;
    L14:
        if (r1.isEmpty() == false) goto L17;
        int r3 = R.string.heath_reports_lack_of_data_tip;
    L18:
        O0O0X0iOi(r10, R.string.guide_warm_title, r3, R.string.game_detail_guidance_knew, R.string.heath_reports_history_btn, r11, r12);
        return;
    L17:
        r3 = R.string.heath_reports_unchanged_of_data_tip;
        goto L18
    }

    public final void iOiXi11II(@aa1 View r9, @aa1 final View r10, @aa1 final TextView r11, @aa1 final Activity r12, @aa1 final String r13, @aa1 String r14, final long r15, @aa1 String r17, boolean r18) {
        Intrinsics.X0O(r9, "layout");
        Intrinsics.X0O(r10, "btn");
        Intrinsics.X0O(r11, "tv");
        Intrinsics.X0O(r12, "activity");
        Intrinsics.X0O(r13, "itemType");
        Intrinsics.X0O(r14, "query");
        Intrinsics.X0O(r17, "mAiQuestion");
        if (r17.length() != 0) goto L5;
        HeathReportsUtils r0 = OXO1;
        final String r3 = iX1O1(r0, r13, r0.XXIIO1i11(r13), r14, 0, 8, null);
    L6:
        i1O0OXO1O.OXO1.OXO1("Project isLayoutVisibility :" + i72.OXO1.I0i0());
        if (r18 == false) goto L9;
        r10.setOnClickListener(new O1IIXO0(r12, r10, r3, r11, r13, r15));
        int r16 = 0;
    L10:
        r9.setVisibility(r16);
        return;
    L9:
        r16 = 8;
        goto L10
    L5:
        r3 = r17;
        goto L6
    }

    public final int iX() {
        return X1ii;
    }

    public final PressureDao iXiX011() {
        return (PressureDao) IiI10X.getValue();
    }

    public final WorkoutDao iXiiiO() {
        return (WorkoutDao) OIi0.getValue();
    }

    public final boolean iii0(long r1, long r3) {
        if ((r1 - r3) <= DateUtils.iO) goto L6;
        return true;
    L6:
        return false;
    }
}
