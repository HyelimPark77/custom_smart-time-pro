package com.sma.smartv3.p610ui.status.fragment;

import android.content.Intent;
import android.view.View;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.LogUtils;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.p608db.entity.Electrocardiogram;
import com.sma.smartv3.p610ui.status.EleMeasurementActivity;
import com.sma.smartv3.p610ui.status.ElectrocardiogramDetailsActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.EcgV2DayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEcgV2DayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgV2DayFragment.kt\ncom/sma/smartv3/ui/status/fragment/EcgV2DayFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n78#2,3:103\n81#2,5:107\n78#2,3:112\n81#2,5:116\n1#3:106\n1#3:115\n*S KotlinDebug\n*F\n+ 1 EcgV2DayFragment.kt\ncom/sma/smartv3/ui/status/fragment/EcgV2DayFragment\n*L\n58#1:103,3\n58#1:107,5\n62#1:112,3\n62#1:116,5\n58#1:106\n62#1:115\n*E\n"})
public final class EcgV2DayFragment extends BaseDetailDaysFragment<Electrocardiogram> {
    public LineDataSet setValue;

    @aa1
    private final String TAG = "EcgV2DayFragment";

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIIIOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgV2DayFragment.measurePanel_delegate$lambda$0(this.f1583IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10IO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgV2DayFragment.btnMeasure_delegate$lambda$0(this.f1307IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(EcgV2DayFragment ecgV2DayFragment) {
        return ecgV2DayFragment.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<Electrocardiogram> list) {
        LogUtils.m11128d(this.TAG + " filterData heartRates.size = " + list.size());
        this.values.clear();
    }

    private final View getBtnMeasure() {
        return (View) this.btnMeasure$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(EcgV2DayFragment ecgV2DayFragment, View view) {
        ecgV2DayFragment.startActivity(new Intent(ecgV2DayFragment.getActivity(), (Class<?>) EleMeasurementActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(EcgV2DayFragment ecgV2DayFragment, View view) {
        ecgV2DayFragment.startActivity(new Intent(ecgV2DayFragment.getActivity(), (Class<?>) ElectrocardiogramDetailsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(EcgV2DayFragment ecgV2DayFragment) {
        return ecgV2DayFragment.getMView().findViewById(R.id.measure_panel);
    }

    private final void updateChartData(List<Entry> list) {
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet lineDataSet = this.setValue;
        if (lineDataSet != null) {
            return lineDataSet;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        LogUtils.m11128d(this.TAG + " initView");
        super.initView();
        View measurePanel = getMeasurePanel();
        if (measurePanel != null) {
            measurePanel.setVisibility(0);
        }
        getBtnMeasure().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XiI1IXOI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgV2DayFragment.initView$lambda$0(this.f5252IO, view);
            }
        });
        getMView().findViewById(R.id.view_day_item).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i0OXiXIXi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgV2DayFragment.initView$lambda$1(this.f7405IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_ecg_day_v2;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Electrocardiogram> data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d(this.TAG + " onDataChange");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Electrocardiogram> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return new ArrayList();
    }

    @aa1
    public final String setDataLabel() {
        return "ecg day Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    public final void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(String.valueOf((int) e.O00()));
    }
}
