package com.sma.smartv3.p610ui.status.fragment.p255v2;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment;
import com.sma.smartv3.p610ui.status.fragment.p255v2.StepMonthV2Fragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStepMonthV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepMonthV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepMonthV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,160:1\n19#2:161\n15#2:162\n*S KotlinDebug\n*F\n+ 1 StepMonthV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepMonthV2Fragment\n*L\n36#1:161\n36#1:162\n*E\n"})
public final class StepMonthV2Fragment extends StatusBaseMonthFragment<Activity> {

    @aa1
    private final String formatDecimal;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final ActivityDao mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();

    @aa1
    private final Lazy caloriesValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ja5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepMonthV2Fragment.caloriesValue_delegate$lambda$0(this.f8928IO);
        }
    });

    @aa1
    private final Lazy distanceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ka5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepMonthV2Fragment.distanceValue_delegate$lambda$0(this.f9137IO);
        }
    });

    public StepMonthV2Fragment() {
        this.formatDecimal = q62.OXO1.iIX0i() ? "%.2f" : "%.1f";
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold caloriesValue_delegate$lambda$0(StepMonthV2Fragment stepMonthV2Fragment) {
        return (DINCondBold) stepMonthV2Fragment.getMView().findViewById(R.id.step_v2_calories_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceValue_delegate$lambda$0(StepMonthV2Fragment stepMonthV2Fragment) {
        return (DINCondBold) stepMonthV2Fragment.getMView().findViewById(R.id.step_v2_distance_value);
    }

    private final DINCondBold getCaloriesValue() {
        return (DINCondBold) this.caloriesValue$delegate.getValue();
    }

    private final DINCondBold getDistanceValue() {
        return (DINCondBold) this.distanceValue$delegate.getValue();
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends Activity> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        float fX1ii = 0.0f;
        int mStep = 0;
        int i = 0;
        int mCalorie = 0;
        for (Activity activity : data) {
            getValues().add(new BarEntry(i, activity.getMStep()));
            mStep += activity.getMStep();
            mCalorie += activity.getMCalorie();
            fX1ii += cp5.X1ii(activity.getMDistance(), this.userProfile.getUnit(), false, 4, null);
            i++;
        }
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(mStep)));
        getTwoValue().setText(UtilsKt.Ii1iii0(String.valueOf(mStep / i)));
        getCaloriesValue().setText(UtilsKt.Ii1iii0(String.valueOf(mCalorie)));
        DINCondBold distanceValue = getDistanceValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(fX1ii)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        distanceValue.setText(UtilsKt.Ii1iii0(str));
        updateChartData(getValues());
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_step_info_v2);
        getValueUnit().setText(R.string.steps);
        getOneTV().setText(R.string.total_steps);
        getOneUnit().setText(R.string.steps);
        getTwoTV().setText(R.string.average_steps);
        getTwoUnit().setText(R.string.steps);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_month_v2;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Activity> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Activity> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        List<Activity> listASC = this.mActivityDao.getListASC(jArrM787I1[0], jArrM787I1[1]);
        setMonthDays(O0X11OiO.XiOIO(jArrM787I1[0], null, 2, null));
        clearCache(jArrM787I1[0]);
        for (Activity activity : listASC) {
            for (Map.Entry<Long, ArrayList<Activity>> entry : getMonthData().entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Activity> value = entry.getValue();
                if (activity.getMTime() < jLongValue) {
                    value.add(activity);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> it = getMonthData().entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Activity> value2 = it.next().getValue();
            if (value2.isEmpty()) {
                arrayList.add(new Activity(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 1023, null));
            } else {
                Iterator<Activity> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    Activity activity2 = next;
                    int mStep = activity2.getMStep();
                    if (i2 <= mStep) {
                        i5 += mStep - i2;
                    }
                    int mDistance = activity2.getMDistance() / 10000;
                    if (i3 <= mDistance) {
                        i7 += mDistance - i3;
                    }
                    int mCalorie = activity2.getMCalorie() / 10000;
                    if (i4 <= mCalorie) {
                        i6 += mCalorie - i4;
                    }
                    i4 = mCalorie;
                    i3 = mDistance;
                    i2 = mStep;
                }
                arrayList.add(new Activity(0, 0L, null, 0, 0, i5, i6, i7, 0, 0, 799, null));
            }
        }
        return arrayList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.step_show_1_v2), ContextCompat.getColor(getMActivity(), R.color.step_show_2_v2));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "Step Month Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) e.O00())));
    }
}
