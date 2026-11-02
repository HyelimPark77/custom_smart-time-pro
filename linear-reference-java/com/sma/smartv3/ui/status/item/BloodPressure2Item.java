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
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodPressure2Item extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private final boolean initEvent;

    @aa1
    private final BloodPressureDao mBloodPressureDao;
    private Context mContext;
    private long[] range;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    public BloodPressure2Item() {
        this.mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r7) {
        Intrinsics.X0O(r7, "itemHolder");
        Context r0 = r7.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r7.v(R.id.tempLastTime);
        Intrinsics.XXI(r1);
        this.tempLastTime = (TextView) r1;
        View r2 = r7.v(R.id.tempLastValue);
        Intrinsics.XXI(r2);
        this.tempLastValue = (TextView) r2;
        View r3 = r7.v(R.id.tmpUnit);
        Intrinsics.XXI(r3);
        this.tmpUnit = (TextView) r3;
        View r4 = r7.v(R.id.sbvLevel);
        Intrinsics.XXI(r4);
        this.sbvLevel = (SegmentedBarView) r4;
        View r5 = r7.v(R.id.empty_panel);
        Intrinsics.XXI(r5);
        this.emptyPanel = r5;
        SegmentedBarView r6 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r5 = null;
    L5:
        UtilsKt.IX1XiI(r5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r8 = r7.v(R.id.data_panel);
        Intrinsics.XXI(r8);
        this.dataPanel = r8;
        Context r9 = this.mContext;
        if (r9 != null) goto L8;
        Intrinsics.XXO("mContext");
        r9 = null;
    L8:
        iz3 r10 = new iz3("", "", r9.getResources().getColor(R.color.bp_level_color_low));
        Context r11 = this.mContext;
        if (r11 != null) goto L11;
        Intrinsics.XXO("mContext");
        r11 = null;
    L11:
        iz3 r12 = new iz3("", "", r11.getResources().getColor(R.color.bp_level_color_standard));
        Context r13 = this.mContext;
        if (r13 != null) goto L14;
        Intrinsics.XXO("mContext");
        r13 = null;
    L14:
        List<iz3> r14 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3[]{r10, r12, new iz3("", "", r13.getResources().getColor(R.color.bp_level_color_high))});
        SegmentedBarView r15 = this.sbvLevel;
        if (r15 != null) goto L17;
        Intrinsics.XXO("sbvLevel");
        r15 = null;
    L17:
        r15.setValueSegment(1);
        SegmentedBarView r16 = this.sbvLevel;
        if (r16 != null) goto L20;
        Intrinsics.XXO("sbvLevel");
    L21:
        r6.setSegments(r14);
        return;
    L20:
        r6 = r16;
        goto L21
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SegmentedBarView r2 = null;
        View r3 = null;
        int r4 = 0;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = r0;
        BloodPressureDao r1 = this.mBloodPressureDao;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r5 = r0[0];
        long[] r6 = this.range;
        if (r6 != null) goto L8;
        Intrinsics.XXO("range");
        r6 = null;
    L8:
        List<BloodPressure> r7 = r1.getBloodPressures(r5, r6[1]);
        if (r7.isEmpty() == false) goto L28;
        TextView r8 = this.tempLastTime;
        if (r8 != null) goto L13;
        Intrinsics.XXO("tempLastTime");
        r8 = null;
    L13:
        r8.setText("");
        TextView r9 = this.tmpUnit;
        if (r9 != null) goto L16;
        Intrinsics.XXO("tmpUnit");
        r9 = null;
    L16:
        r9.setText("");
        TextView r10 = this.tempLastValue;
        if (r10 != null) goto L19;
        Intrinsics.XXO("tempLastValue");
        r10 = null;
    L19:
        r10.setVisibility(8);
        View r11 = this.emptyPanel;
        if (r11 != null) goto L22;
        Intrinsics.XXO("emptyPanel");
        r11 = null;
    L22:
        r11.setVisibility(0);
        View r12 = this.dataPanel;
        if (r12 != null) goto L25;
        Intrinsics.XXO("dataPanel");
    L26:
        r3.setVisibility(8);
        return;
    L25:
        r3 = r12;
        goto L26
    L28:
        View r13 = this.emptyPanel;
        if (r13 != null) goto L31;
        Intrinsics.XXO("emptyPanel");
        r13 = null;
    L31:
        r13.setVisibility(8);
        View r14 = this.dataPanel;
        if (r14 != null) goto L34;
        Intrinsics.XXO("dataPanel");
        r14 = null;
    L34:
        r14.setVisibility(0);
        TextView r15 = this.tempLastValue;
        if (r15 != null) goto L37;
        Intrinsics.XXO("tempLastValue");
        r15 = null;
    L37:
        r15.setVisibility(0);
        TextView r16 = this.tmpUnit;
        if (r16 != null) goto L40;
        Intrinsics.XXO("tmpUnit");
        r16 = null;
    L40:
        r16.setText(R.string.mmhg);
        int r17 = ((BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r7)).getMDiastolic();
        int r18 = ((BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r7)).getMSystolic();
        if (r18 < 140) goto L44;
        if (r17 < 90) goto L44;
        r4 = 2;
    L50:
        TextView r19 = this.tempLastTime;
        if (r19 != null) goto L53;
        Intrinsics.XXO("tempLastTime");
        r19 = null;
    L53:
        r19.setText(O0X11OiO.XXX11i().format(new Date(((BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r7)).getMTime())));
        TextView r20 = this.tempLastValue;
        if (r20 != null) goto L56;
        Intrinsics.XXO("tempLastValue");
        r20 = null;
    L56:
        r20.setText(r18 + "/" + r17);
        SegmentedBarView r21 = this.sbvLevel;
        if (r21 != null) goto L59;
        Intrinsics.XXO("sbvLevel");
    L60:
        r2.setValueSegment(Integer.valueOf(r4));
        return;
    L59:
        r2 = r21;
    L44:
        if (90 > r18) goto L50;
        if (r18 >= 140) goto L50;
        if (60 > r17) goto L50;
        if (r17 >= 90) goto L50;
        r4 = 1;
        goto L50
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_blood_pressure;
    }

    @sf5(tag = I01XX0.iO)
    public final void onBloodPressureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodPressureChanged"});
        initView();
    }
}
