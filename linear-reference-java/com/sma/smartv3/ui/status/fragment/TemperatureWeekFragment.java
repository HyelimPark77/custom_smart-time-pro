package com.sma.smartv3.ui.status.fragment;

import android.view.MotionEvent;
import android.widget.ImageView;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.TemperatureDataParse;
import com.sma.smartv3.model.TemperatureDayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.StatusBaseWeekFragment;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.CustomBarChartView;
import com.sma.smartv3.view.text.DINCondBold;
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
    private final TemperatureDao mTemperatureDao;

    @aa1
    private final List<TemperatureDayData> temperatureDayDataList;

    public static final class OXO1 implements CustomBarChartView.OXO1 {
        public final /* synthetic */ TemperatureWeekFragment OXO1;

        public OXO1(TemperatureWeekFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.view.CustomBarChartView.OXO1
        public void OXO1(MotionEvent r2) {
            Intrinsics.X0O(r2, "motionEvent");
            if (r2.getAction() != 1) goto L6;
            this.OXO1.getScrollView().requestDisallowInterceptTouchEvent(false);
            return;
        L6:
            this.OXO1.getScrollView().requestDisallowInterceptTouchEvent(true);
        }
    }

    public TemperatureWeekFragment() {
        this.mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
        this.temperatureDayDataList = new ArrayList();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void filterData(@aa1 List<? extends Temperature> r8) {
        Intrinsics.X0O(r8, "data");
        super.filterData(r8);
        getBarChart().i11I();
        TemperatureDataParse.INSTANCE.filterDayData(this.isImperial, r8, getWeekData(), this.temperatureDayDataList, getValues());
        updateChartData(getValues());
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        boolean r1 = true;
        if (cp5.II1Xi0(this.mAppUser.getUnit()) == 1) goto L6;
        r1 = false;
    L6:
        this.isImperial = r1;
        setAxisMinimum(20.0f);
        super.initView();
        getOneLl().setVisibility(8);
        ImageView r0 = getImage();
        if (q62.OXO1.XI1OX0IO() == false) goto L9;
        int r2 = R.drawable.icon_skin_temperature;
    L10:
        r0.setImageResource(r2);
        PFMedium r3 = getValueUnit();
        boolean r4 = this.isImperial;
        int r5 = R.string.degree_centigrade;
        if (r4 == false) goto L13;
        int r6 = R.string.fahrenheit;
    L14:
        r3.setText(r6);
        getTwoTV().setText(R.string.ave_temp);
        PFMedium r7 = getTwoUnit();
        if (this.isImperial == false) goto L17;
        r5 = R.string.fahrenheit;
    L17:
        r7.setText(r5);
        return;
    L13:
        r6 = R.string.degree_centigrade;
        goto L14
    L9:
        r2 = R.drawable.icon_temperature;
        goto L10
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Temperature> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Temperature> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        long[] r8 = O0X11OiO.I1(r5, r7, r6);
        setWeekDay(O0X11OiO.IXXOO(r8[0]));
        clearCache(r8[0]);
        return this.mTemperatureDao.getListDesc(r8[0], r8[1]);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setChartRenderer() {
        getBarChart().getAxisRight().IXOIIIO(0.5f);
        getBarChart().setOnChartTouchListener(new OXO1(this));
        Oi01X10i r0 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r0.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        r0.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.temp_day_item_center_7), ContextCompat.getColor(getMActivity(), R.color.temp_day_item_center_8)});
        r0.iIiiO(1);
        getBarChart().setRenderer(r0);
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.I011X(CollectionsKt__CollectionsKt.iXiX011(new Integer[]{0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))}));
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    @aa1
    public String setDataLabel() {
        return "temp week Data";
    }

    @Override // com.sma.smartv3.ui.status.base.StatusBaseWeekFragment
    public void updateItemData(@aa1 Entry r5) {
        Intrinsics.X0O(r5, "e");
        TemperatureDayData r6 = this.temperatureDayDataList.get((int) r5.OIX0iXi());
        getNowValue().setText(UtilsKt.II1Xi0(r6.getMin(), r6.getMax()));
        DINCondBold r0 = getTwoValue();
        if (r6.getAvg() != 0.0f) goto L5;
        String r7 = UtilsKt.X01IiOiIi(r6.getAvg());
    L6:
        r0.setText(r7);
        return;
    L5:
        r7 = cp5.X11iII1O1(r6.getAvg(), false, 2, null);
        goto L6
    }
}
