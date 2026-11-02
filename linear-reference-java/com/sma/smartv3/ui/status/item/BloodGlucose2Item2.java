package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodGlucose2Dao;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.model.BloodGlucoseLevel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucose2Item2 extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private final boolean initEvent;

    @aa1
    private final BloodGlucose2Dao mBloodGlucose2Dao;
    private Context mContext;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    public BloodGlucose2Item2() {
        this.mBloodGlucose2Dao = MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r11) {
        Intrinsics.X0O(r11, "itemHolder");
        Context r0 = r11.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r11.v(R.id.tempLastTime);
        Intrinsics.XXI(r1);
        this.tempLastTime = (TextView) r1;
        View r2 = r11.v(R.id.tempLastValue);
        Intrinsics.XXI(r2);
        this.tempLastValue = (TextView) r2;
        View r3 = r11.v(R.id.tmpUnit);
        Intrinsics.XXI(r3);
        this.tmpUnit = (TextView) r3;
        View r4 = r11.v(R.id.sbvLevel);
        Intrinsics.XXI(r4);
        this.sbvLevel = (SegmentedBarView) r4;
        View r5 = r11.v(R.id.empty_panel);
        Intrinsics.XXI(r5);
        this.emptyPanel = r5;
        SegmentedBarView r6 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r5 = null;
    L5:
        UtilsKt.IX1XiI(r5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r12 = r11.v(R.id.data_panel);
        Intrinsics.XXI(r12);
        this.dataPanel = r12;
        float r7 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(BloodGlucoseLevel.START.getMValue(), 0.0f, 2, null);
        BloodGlucoseLevel r8 = BloodGlucoseLevel.NORMAL;
        float r9 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r8.getMValue(), 0.0f, 2, null);
        Context r10 = this.mContext;
        if (r10 != null) goto L8;
        Intrinsics.XXO("mContext");
        r10 = null;
    L8:
        iz3 r13 = new iz3(r7, r9, r10.getResources().getColor(R.color.bg_level_color_normal));
        float r14 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r8.getMValue(), 0.0f, 2, null);
        BloodGlucoseLevel r15 = BloodGlucoseLevel.PREDIABETES;
        float r16 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r15.getMValue(), 0.0f, 2, null);
        Context r17 = this.mContext;
        if (r17 != null) goto L11;
        Intrinsics.XXO("mContext");
        r17 = null;
    L11:
        iz3 r18 = new iz3(r14, r16, r17.getResources().getColor(R.color.bg_level_color_prediabetes));
        float r19 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r15.getMValue(), 0.0f, 2, null);
        float r20 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(BloodGlucoseLevel.DIABETES.getMValue(), 0.0f, 2, null);
        Context r21 = this.mContext;
        if (r21 != null) goto L14;
        Intrinsics.XXO("mContext");
        r21 = null;
    L14:
        List<iz3> r110 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3[]{r13, r18, new iz3(r19, r20, r21.getResources().getColor(R.color.bg_level_color_diabetes))});
        SegmentedBarView r22 = this.sbvLevel;
        if (r22 != null) goto L17;
        Intrinsics.XXO("sbvLevel");
        r22 = null;
    L17:
        r22.setValue(Float.valueOf(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(5.0f, 0.0f, 2, null)));
        SegmentedBarView r23 = this.sbvLevel;
        if (r23 != null) goto L20;
        Intrinsics.XXO("sbvLevel");
    L21:
        r6.setSegments(r110);
        return;
    L20:
        r6 = r23;
        goto L21
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        List<BloodGlucose2> r0 = this.mBloodGlucose2Dao.getListForDay();
        View r7 = null;
        if (r0.isEmpty() == false) goto L16;
        TextView r1 = this.tempLastTime;
        if (r1 != null) goto L7;
        Intrinsics.XXO("tempLastTime");
        r1 = null;
    L7:
        r1.setText("");
        View r2 = this.emptyPanel;
        if (r2 != null) goto L10;
        Intrinsics.XXO("emptyPanel");
        r2 = null;
    L10:
        r2.setVisibility(0);
        View r3 = this.dataPanel;
        if (r3 != null) goto L13;
        Intrinsics.XXO("dataPanel");
    L14:
        r7.setVisibility(8);
        return;
    L13:
        r7 = r3;
        goto L14
    L16:
        View r4 = this.emptyPanel;
        if (r4 != null) goto L19;
        Intrinsics.XXO("emptyPanel");
        r4 = null;
    L19:
        r4.setVisibility(8);
        View r5 = this.dataPanel;
        if (r5 != null) goto L22;
        Intrinsics.XXO("dataPanel");
        r5 = null;
    L22:
        r5.setVisibility(0);
        BloodGlucose2 r6 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(r0);
        TextView r8 = this.tempLastTime;
        if (r8 != null) goto L25;
        Intrinsics.XXO("tempLastTime");
        r8 = null;
    L25:
        r8.setText(O0X11OiO.XXX11i().format(new Date(r6.getMTime())));
        TextView r9 = this.tempLastValue;
        if (r9 != null) goto L28;
        Intrinsics.XXO("tempLastValue");
        r9 = null;
    L28:
        StringCompanionObject r10 = StringCompanionObject.OXO1;
        String r11 = String.format("%.1f-%.1f", Arrays.copyOf(new Object[]{Double.valueOf(r6.getMLowerBound()), Double.valueOf(r6.getMUpperBound())}, 2));
        Intrinsics.O10IXXX0X(r11, "format(...)");
        r9.setText(r11);
        SegmentedBarView r12 = this.sbvLevel;
        if (r12 != null) goto L31;
        Intrinsics.XXO("sbvLevel");
        r12 = null;
    L31:
        r12.setValue(Float.valueOf(BloodGlucose2DataKt.getBloodGlucoseBarValue$default((float) r6.getMUpperBound(), 0.0f, 2, null)));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_blood_glucose2;
    }

    @sf5(tag = I01XX0.X1ii)
    public final void onBloodGlucoseChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodGlucoseChanged"});
        initView();
    }
}
