package com.sma.smartv3.ui.status.fragment.v2;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ma5;
import com.android.mltcode.paycertificationapi.na5;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStepWeekV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepWeekV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepWeekV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,158:1\n19#2:159\n15#2:160\n*S KotlinDebug\n*F\n+ 1 StepWeekV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepWeekV2Fragment\n*L\n34#1:159\n34#1:160\n*E\n"})
public final class StepWeekV2Fragment extends StatusBaseWeekFragment<Activity> {

    @aa1
    private final Lazy caloriesValue$delegate;

    @aa1
    private final Lazy distanceValue$delegate;

    @aa1
    private final String formatDecimal;

    @aa1
    private final ActivityDao mActivityDao;

    @aa1
    private final AppUser userProfile;

    public StepWeekV2Fragment() {
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        this.caloriesValue$delegate = LazyKt__LazyJVMKt.iO(new ma5(this));
        this.distanceValue$delegate = LazyKt__LazyJVMKt.iO(new na5(this));
        if (q62.OXO1.iIX0i() == false) goto L5;
        String r1 = "%.2f";
    L6:
        this.formatDecimal = r1;
        SPUtils r2 = a01.OXO1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L10;
        r3 = r4;
    L10:
        this.userProfile = (AppUser) r3;
        return;
    L5:
        r1 = "%.1f";
        goto L6
    }

    public static /* synthetic */ DINCondBold OiIIX101O(StepWeekV2Fragment r0) {
        return distanceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XX0(StepWeekV2Fragment r0) {
        return caloriesValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold caloriesValue_delegate$lambda$0(StepWeekV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.step_v2_calories_value);
    }

    private static final DINCondBold distanceValue_delegate$lambda$0(StepWeekV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.step_v2_distance_value);
    }

    private final DINCondBold getCaloriesValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getDistanceValue() {
        return (DINCondBold) getValue();
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Activity> r11) {
        Intrinsics.X0O(r11, "data");
        super.filterData(r11);
        Iterator<? extends Activity> r12 = r11.iterator();
        float r1 = 0.0f;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r12.hasNext() == false) goto L6;
        Activity r5 = r12.next();
        getValues().add(new BarEntry(r3, r5.getMStep()));
        r2 = r2 + r5.getMStep();
        r4 = r4 + r5.getMCalorie();
        r1 = r1 + cp5.X1ii(r5.getMDistance(), this.userProfile.getUnit(), false, 4, null);
        r3 = r3 + 1;
        goto L4
    L6:
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(r2)));
        getTwoValue().setText(UtilsKt.Ii1iii0(String.valueOf(r2 / r3)));
        getCaloriesValue().setText(UtilsKt.Ii1iii0(String.valueOf(r4)));
        DINCondBold r13 = getDistanceValue();
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r6 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r6, "format(...)");
        r13.setText(UtilsKt.Ii1iii0(r6));
        updateChartData(getValues());
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_step_info_v2);
        getValueUnit().setText(R.string.steps);
        getOneTV().setText(R.string.total_steps);
        getOneUnit().setText(R.string.steps);
        getTwoTV().setText(R.string.average_steps);
        getTwoUnit().setText(R.string.steps);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_week_v2;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Activity> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Activity> onTimePeriodChange(@aa1 Calendar r21, int r22, @aa1 TimePeriod r23) {
        Intrinsics.X0O(r21, "calendar");
        Intrinsics.X0O(r23, "timePeriod");
        long[] r1 = O0X11OiO.I1(r21, r23, r22);
        List<Activity> r2 = this.mActivityDao.getListASC(r1[0], r1[1]);
        setWeekDay(O0X11OiO.IXXOO(r1[0]));
        clearCache(r1[0]);
        Iterator<Activity> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L11;
        Activity r4 = r3.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r5 = getWeekData().entrySet().iterator();
    L7:
        if (r5.hasNext() == false) goto L4;
        Map.Entry<Long, ArrayList<Activity>> r6 = r5.next();
        long r7 = r6.getKey().longValue();
        ArrayList<Activity> r8 = r6.getValue();
        if (r4.getMTime() >= r7) goto L7;
        r8.add(r4);
        goto L4
    L11:
        ArrayList r9 = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r10 = getWeekData().entrySet().iterator();
    L13:
        if (r10.hasNext() == false) goto L31;
        ArrayList<Activity> r11 = r10.next().getValue();
        if (r11.isEmpty() == true) goto L16;
        Iterator<Activity> r12 = r11.iterator();
        Intrinsics.O10IXXX0X(r12, "iterator(...)");
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
    L19:
        if (r12.hasNext() == false) goto L30;
        Activity r19 = r12.next();
        Intrinsics.O10IXXX0X(r19, "next(...)");
        Activity r20 = r19;
        int r24 = r20.getMStep();
        if (r13 > r24) goto L23;
        r16 = r16 + (r24 - r13);
    L23:
        int r25 = r20.getMDistance() / 10000;
        if (r14 > r25) goto L26;
        r18 = r18 + (r25 - r14);
    L26:
        int r26 = r20.getMCalorie() / 10000;
        if (r15 > r26) goto L29;
        r17 = r17 + (r26 - r15);
    L29:
        r15 = r26;
        r14 = r25;
        r13 = r24;
        goto L19
    L30:
        r9.add(new Activity(0, 0, null, 0, 0, r16, r17, r18, 0, 0, 799, null));
        goto L13
    L16:
        r9.add(new Activity(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 1023, null));
        goto L13
    L31:
        return r9;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.step_show_1_v2), ContextCompat.getColor(getMActivity(), R.color.step_show_2_v2));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "Step Week Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) r2.O00())));
    }
}
