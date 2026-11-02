package com.sma.smartv3.ui.status.fragment;

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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.ActivityDao;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseMonthFragment;
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
@SourceDebugExtension({"SMAP\nDistanceMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceMonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceMonthFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,122:1\n19#2:123\n15#2:124\n*S KotlinDebug\n*F\n+ 1 DistanceMonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceMonthFragment\n*L\n20#1:123\n20#1:124\n*E\n"})
public final class DistanceMonthFragment extends StatusBaseMonthFragment<Activity> {

    @aa1
    private final String formatDecimal;

    @aa1
    private final ActivityDao mActivityDao;

    @aa1
    private final AppUser userProfile;

    public DistanceMonthFragment() {
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
        if (q62.OXO1.iIX0i() == false) goto L9;
        String r4 = "%.2f";
    L10:
        this.formatDecimal = r4;
        return;
    L9:
        r4 = "%.1f";
        goto L10
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void filterData(@aa1 List<? extends Activity> r8) {
        Intrinsics.X0O(r8, "data");
        super.filterData(r8);
        Iterator<? extends Activity> r9 = r8.iterator();
        float r1 = 0.0f;
        int r2 = 0;
    L4:
        if (r9.hasNext() == false) goto L6;
        float r3 = cp5.X1ii(r9.next().getMDistance(), this.userProfile.getUnit(), false, 4, null);
        getValues().add(new BarEntry(r2, r3));
        r1 = r1 + r3;
        r2 = r2 + 1;
        goto L4
    L6:
        DINCondBold r10 = getOneValue();
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r4 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        r10.setText(UtilsKt.Ii1iii0(r4));
        DINCondBold r11 = getTwoValue();
        String r5 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r1 / r2)}, 1));
        Intrinsics.O10IXXX0X(r5, "format(...)");
        r11.setText(UtilsKt.Ii1iii0(r5));
        updateChartData(getValues());
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_distance_info);
        getValueUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getOneTV().setText(R.string.total_distance);
        getOneUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getTwoTV().setText(R.string.average_distance);
        getTwoUnit().setText(cp5.XX0(this.userProfile.getUnit()));
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
        setMonthDays(O0X11OiO.XiOIO(r1[0], null, 2, null));
        clearCache(r1[0]);
        Iterator<Activity> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L11;
        Activity r4 = r3.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r5 = getMonthData().entrySet().iterator();
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
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r10 = getMonthData().entrySet().iterator();
    L13:
        if (r10.hasNext() == false) goto L25;
        ArrayList<Activity> r11 = r10.next().getValue();
        if (r11.isEmpty() == true) goto L16;
        Iterator<Activity> r12 = r11.iterator();
        Intrinsics.O10IXXX0X(r12, "iterator(...)");
        int r13 = 0;
        int r15 = 0;
    L19:
        if (r12.hasNext() == false) goto L24;
        Activity r14 = r12.next();
        Intrinsics.O10IXXX0X(r14, "next(...)");
        int r16 = r14.getMDistance() / 10000;
        if (r13 > r16) goto L23;
        r15 = r15 + (r16 - r13);
    L23:
        r13 = r16;
        goto L19
    L24:
        r9.add(new Activity(0, 0, null, 0, 0, 0, 0, r15, 0, 0, 895, null));
        goto L13
    L16:
        r9.add(new Activity(0, 0, null, 0, 0, 0, 0, 0, 0, 0, 1023, null));
        goto L13
    L25:
        return r9;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.distance_show_1), ContextCompat.getColor(getMActivity(), R.color.distance_show_2));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    @aa1
    public String setDataLabel() {
        return "Distance month Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseMonthFragment
    public void updateItemData(@aa1 Entry r4) {
        Intrinsics.X0O(r4, "e");
        DINCondBold r0 = getNowValue();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r5 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r4.O00())}, 1));
        Intrinsics.O10IXXX0X(r5, "format(...)");
        r0.setText(UtilsKt.Ii1iii0(r5));
    }
}
