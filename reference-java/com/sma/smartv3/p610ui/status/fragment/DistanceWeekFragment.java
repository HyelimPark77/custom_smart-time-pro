package com.sma.smartv3.p610ui.status.fragment;

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
import com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDistanceWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceWeekFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,121:1\n19#2:122\n15#2:123\n*S KotlinDebug\n*F\n+ 1 DistanceWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceWeekFragment\n*L\n19#1:122\n19#1:123\n*E\n"})
public final class DistanceWeekFragment extends StatusBaseWeekFragment<Activity> {

    @aa1
    private final String formatDecimal;

    @aa1
    private final ActivityDao mActivityDao;

    @aa1
    private final AppUser userProfile;

    public DistanceWeekFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        this.formatDecimal = q62.OXO1.iIX0i() ? "%.2f" : "%.1f";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Activity> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        Iterator<? extends Activity> it = data.iterator();
        float f = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            float fX1ii = cp5.X1ii(it.next().getMDistance(), this.userProfile.getUnit(), false, 4, null);
            getValues().add(new BarEntry(i, fX1ii));
            f += fX1ii;
            i++;
        }
        DINCondBold oneValue = getOneValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        oneValue.setText(UtilsKt.Ii1iii0(str));
        DINCondBold twoValue = getTwoValue();
        String str2 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(f / i)}, 1));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        twoValue.setText(UtilsKt.Ii1iii0(str2));
        updateChartData(getValues());
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_distance_info);
        getValueUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getOneTV().setText(R.string.total_distance);
        getOneUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getTwoTV().setText(R.string.average_distance);
        getTwoUnit().setText(cp5.XX0(this.userProfile.getUnit()));
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
        setWeekDay(O0X11OiO.IXXOO(jArrM787I1[0]));
        clearCache(jArrM787I1[0]);
        for (Activity activity : listASC) {
            for (Map.Entry<Long, ArrayList<Activity>> entry : getWeekData().entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Activity> value = entry.getValue();
                if (activity.getMTime() < jLongValue) {
                    value.add(activity);
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> it = getWeekData().entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<Activity> value2 = it.next().getValue();
            if (value2.isEmpty()) {
                arrayList.add(new Activity(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 1023, null));
            } else {
                Iterator<Activity> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int i2 = 0;
                int i3 = 0;
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    int mDistance = next.getMDistance() / 10000;
                    if (i2 <= mDistance) {
                        i3 += mDistance - i2;
                    }
                    i2 = mDistance;
                }
                arrayList.add(new Activity(0, 0L, null, 0, 0, 0, 0, i3, 0, 0, 895, null));
            }
        }
        return arrayList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.distance_show_1), ContextCompat.getColor(getMActivity(), R.color.distance_show_2));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "Distance week Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        DINCondBold nowValue = getNowValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(e.O00())}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        nowValue.setText(UtilsKt.Ii1iii0(str));
    }
}
