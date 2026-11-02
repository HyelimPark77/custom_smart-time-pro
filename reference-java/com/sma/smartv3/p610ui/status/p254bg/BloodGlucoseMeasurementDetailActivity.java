package com.sma.smartv3.p610ui.status.p254bg;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import com.sma.smartv3.p610ui.status.p254bg.BloodGlucoseMeasurementDetailActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseMeasurementDetailActivity extends BaseActivity {

    @aa1
    private final Lazy barView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiiIX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMeasurementDetailActivity.barView_delegate$lambda$0(this.f5370IO);
        }
    });

    @aa1
    private final Lazy tvMeasureDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOIXXO0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseMeasurementDetailActivity.tvMeasureDate_delegate$lambda$0(this.f8084IO);
        }
    });

    @aa1
    private List<BloodGlucose2> mBloodGlucoseList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final SegmentedBarView2 barView_delegate$lambda$0(BloodGlucoseMeasurementDetailActivity bloodGlucoseMeasurementDetailActivity) {
        return (SegmentedBarView2) bloodGlucoseMeasurementDetailActivity.findViewById(R.id.bar_view);
    }

    private final SegmentedBarView2 getBarView() {
        return (SegmentedBarView2) this.barView$delegate.getValue();
    }

    private final TextView getTvMeasureDate() {
        return (TextView) this.tvMeasureDate$delegate.getValue();
    }

    private final String getValueText(float f) {
        return f + "<br><small>mmol/L</small>";
    }

    private final void initBarView() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(3.4f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_normal_bg), getResources().getColor(R.color.bg_level_color_normal)));
        arrayList.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_prediabetes_bg), getResources().getColor(R.color.bg_level_color_prediabetes)));
        arrayList.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(8.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_diabetes_bg), getResources().getColor(R.color.bg_level_color_diabetes)));
        getBarView().setSegments(arrayList);
    }

    private final void setBarValue(float f, float f2) {
        getBarView().X1ii(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(f, 0.0f, 2, null), getValueText(f));
        getBarView().O10IXXX0X(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(f2, 0.0f, 2, null), getValueText(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMeasureDate_delegate$lambda$0(BloodGlucoseMeasurementDetailActivity bloodGlucoseMeasurementDetailActivity) {
        return (TextView) bloodGlucoseMeasurementDetailActivity.findViewById(R.id.tv_measure_date);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_glucose_range);
        initBarView();
        showData(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_m_detail;
    }

    public final void onHelp(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i72.OXO1.XO1(this);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @sf5(tag = I01XX0.X1ii)
    public final void showData(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        this.mBloodGlucoseList.clear();
        this.mBloodGlucoseList.addAll(MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().getList());
        if (this.mBloodGlucoseList.isEmpty()) {
            return;
        }
        BloodGlucose2 bloodGlucose2 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(this.mBloodGlucoseList);
        setBarValue((float) bloodGlucose2.getMLowerBound(), (float) bloodGlucose2.getMUpperBound());
        getTvMeasureDate().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(bloodGlucose2.getMTime())));
    }
}
