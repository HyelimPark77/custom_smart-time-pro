package com.sma.smartv3.ui.status.bg;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XiiIX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iOIXXO0I;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseMeasurementDetailActivity extends BaseActivity {

    @aa1
    private final Lazy barView$delegate;

    @aa1
    private List<BloodGlucose2> mBloodGlucoseList;

    @aa1
    private final Lazy tvMeasureDate$delegate;

    public BloodGlucoseMeasurementDetailActivity() {
        this.barView$delegate = LazyKt__LazyJVMKt.iO(new XiiIX0(this));
        this.tvMeasureDate$delegate = LazyKt__LazyJVMKt.iO(new iOIXXO0I(this));
        this.mBloodGlucoseList = new ArrayList();
    }

    public static /* synthetic */ TextView I0iXXO(BloodGlucoseMeasurementDetailActivity r0) {
        return tvMeasureDate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SegmentedBarView2 OIX0iXi(BloodGlucoseMeasurementDetailActivity r0) {
        return barView_delegate$lambda$0(r0);
    }

    private static final SegmentedBarView2 barView_delegate$lambda$0(BloodGlucoseMeasurementDetailActivity r1) {
        return (SegmentedBarView2) r1.findViewById(R.id.bar_view);
    }

    private final SegmentedBarView2 getBarView() {
        return (SegmentedBarView2) getValue();
    }

    private final TextView getTvMeasureDate() {
        return (TextView) getValue();
    }

    private final String getValueText(float r2) {
        return r2 + "<br><small>mmol/L</small>";
    }

    private final void initBarView() {
        ArrayList r0 = new ArrayList();
        r0.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(3.4f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_normal_bg), getResources().getColor(R.color.bg_level_color_normal)));
        r0.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_prediabetes_bg), getResources().getColor(R.color.bg_level_color_prediabetes)));
        r0.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(8.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_diabetes_bg), getResources().getColor(R.color.bg_level_color_diabetes)));
        getBarView().setSegments(r0);
    }

    private final void setBarValue(float r6, float r7) {
        getBarView().X1ii(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r6, 0.0f, 2, null), getValueText(r6));
        getBarView().O10IXXX0X(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r7, 0.0f, 2, null), getValueText(r7));
    }

    private static final TextView tvMeasureDate_delegate$lambda$0(BloodGlucoseMeasurementDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_measure_date);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_glucose_range);
        initBarView();
        showData(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_m_detail;
    }

    public final void onHelp(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i72.OXO1.XO1(this);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @sf5(tag = I01XX0.X1ii)
    public final void showData(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        this.mBloodGlucoseList.clear();
        this.mBloodGlucoseList.addAll(MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().getList());
        if (this.mBloodGlucoseList.isEmpty() == true) goto L6;
        BloodGlucose2 r6 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(this.mBloodGlucoseList);
        setBarValue((float) r6.getMLowerBound(), (float) r6.getMUpperBound());
        getTvMeasureDate().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(r6.getMTime())));
        return;
    }
}
