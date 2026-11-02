package com.sma.smartv3.ui.status.fragment;

import android.content.Intent;
import android.view.View;
import com.android.mltcode.paycertificationapi.I10IO1;
import com.android.mltcode.paycertificationapi.IIIIOX;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XiI1IXOI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0OXiXIXi;
import com.blankj.utilcode.util.LogUtils;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.sma.smartv3.db.entity.Electrocardiogram;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.EleMeasurementActivity;
import com.sma.smartv3.ui.status.ElectrocardiogramDetailsActivity;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEcgV2DayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcgV2DayFragment.kt\ncom/sma/smartv3/ui/status/fragment/EcgV2DayFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n78#2,3:103\n81#2,5:107\n78#2,3:112\n81#2,5:116\n1#3:106\n1#3:115\n*S KotlinDebug\n*F\n+ 1 EcgV2DayFragment.kt\ncom/sma/smartv3/ui/status/fragment/EcgV2DayFragment\n*L\n58#1:103,3\n58#1:107,5\n62#1:112,3\n62#1:116,5\n58#1:106\n62#1:115\n*E\n"})
public final class EcgV2DayFragment extends BaseDetailDaysFragment<Electrocardiogram> {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btnMeasure$delegate;

    @aa1
    private final Lazy measurePanel$delegate;
    public LineDataSet setValue;

    @aa1
    private final List<Entry> values;

    public EcgV2DayFragment() {
        this.TAG = "EcgV2DayFragment";
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new IIIIOX(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new I10IO1(this));
        this.values = new ArrayList();
    }

    public static /* synthetic */ View O10IXXX0X(EcgV2DayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(EcgV2DayFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ View X1ii(EcgV2DayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(EcgV2DayFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    private static final View btnMeasure_delegate$lambda$0(EcgV2DayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private final void filterData(List<Electrocardiogram> r3) {
        LogUtils.d(new Object[]{this.TAG + " filterData heartRates.size = " + r3.size()});
        this.values.clear();
    }

    private final View getBtnMeasure() {
        return (View) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private static final void initView$lambda$0(EcgV2DayFragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), EleMeasurementActivity.class));
    }

    private static final void initView$lambda$1(EcgV2DayFragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), ElectrocardiogramDetailsActivity.class));
    }

    private static final View measurePanel_delegate$lambda$0(EcgV2DayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private final void updateChartData(List<Entry> r1) {
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        LogUtils.d(new Object[]{this.TAG + " initView"});
        super.initView();
        View r0 = getMeasurePanel();
        if (r0 == null) goto L5;
        r0.setVisibility(0);
    L5:
        getBtnMeasure().setOnClickListener(new XiI1IXOI(this));
        getMView().findViewById(R.id.view_day_item).setOnClickListener(new i0OXiXIXi(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_ecg_day_v2;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Electrocardiogram> r3) {
        Intrinsics.X0O(r3, "data");
        LogUtils.d(new Object[]{this.TAG + " onDataChange"});
        filterData(r3);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Electrocardiogram> onTimePeriodChange(@aa1 Calendar r2, int r3, @aa1 TimePeriod r4) {
        Intrinsics.X0O(r2, "calendar");
        Intrinsics.X0O(r4, "timePeriod");
        setRange(O0X11OiO.I1(r2, r4, r3));
        return new ArrayList();
    }

    @aa1
    public final String setDataLabel() {
        return "ecg day Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(String.valueOf((int) r2.O00()));
    }
}
