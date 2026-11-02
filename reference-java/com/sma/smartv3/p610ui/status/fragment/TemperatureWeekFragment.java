package com.sma.smartv3.p610ui.status.fragment;

import android.view.MotionEvent;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.data.Entry;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.TemperatureDataParse;
import com.sma.smartv3.model.TemperatureDayData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTemperatureWeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureWeekFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,133:1\n19#2:134\n15#2:135\n*S KotlinDebug\n*F\n+ 1 TemperatureWeekFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureWeekFragment\n*L\n29#1:134\n29#1:135\n*E\n"})
public final class TemperatureWeekFragment extends StatusBaseWeekFragment<Temperature> {
    private boolean isImperial;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final TemperatureDao mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();

    @aa1
    private final List<TemperatureDayData> temperatureDayDataList = new ArrayList();

    public static final class OXO1 implements CustomBarChartView.OXO1 {
        public OXO1() {
        }

        @Override // com.sma.smartv3.view.CustomBarChartView.OXO1
        public void OXO1(MotionEvent motionEvent) {
            Intrinsics.X0O(motionEvent, "motionEvent");
            if (motionEvent.getAction() == 1) {
                TemperatureWeekFragment.this.getScrollView().requestDisallowInterceptTouchEvent(false);
            } else {
                TemperatureWeekFragment.this.getScrollView().requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public TemperatureWeekFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Temperature> data) {
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        getBarChart().i11I();
        TemperatureDataParse.INSTANCE.filterDayData(this.isImperial, data, getWeekData(), this.temperatureDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        this.isImperial = cp5.II1Xi0(this.mAppUser.getUnit()) == 1;
        setAxisMinimum(20.0f);
        super.initView();
        getOneLl().setVisibility(8);
        getImage().setImageResource(q62.OXO1.XI1OX0IO() ? R.drawable.icon_skin_temperature : R.drawable.icon_temperature);
        PFMedium valueUnit = getValueUnit();
        boolean z = this.isImperial;
        int i = R.string.degree_centigrade;
        valueUnit.setText(z ? R.string.fahrenheit : R.string.degree_centigrade);
        getTwoTV().setText(R.string.ave_temp);
        PFMedium twoUnit = getTwoUnit();
        if (this.isImperial) {
            i = R.string.fahrenheit;
        }
        twoUnit.setText(i);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Temperature> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Temperature> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setWeekDay(O0X11OiO.IXXOO(jArrM787I1[0]));
        clearCache(jArrM787I1[0]);
        return this.mTemperatureDao.getListDesc(jArrM787I1[0], jArrM787I1[1]);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setChartRenderer() {
        getBarChart().getAxisRight().IXOIIIO(0.5f);
        getBarChart().setOnChartTouchListener(new OXO1());
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.temp_day_item_center_7), ContextCompat.getColor(getMActivity(), R.color.temp_day_item_center_8)});
        oi01X10i.iIiiO(1);
        getBarChart().setRenderer(oi01X10i);
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))));
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "temp week Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        TemperatureDayData temperatureDayData = this.temperatureDayDataList.get((int) e.OIX0iXi());
        getNowValue().setText(UtilsKt.II1Xi0(temperatureDayData.getMin(), temperatureDayData.getMax()));
        getTwoValue().setText(temperatureDayData.getAvg() == 0.0f ? UtilsKt.X01IiOiIi(temperatureDayData.getAvg()) : cp5.X11iII1O1(temperatureDayData.getAvg(), false, 2, null));
    }
}
