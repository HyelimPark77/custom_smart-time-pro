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
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.entity.BloodGlucose;
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
public final class BloodGlucose2Item extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private final boolean initEvent;

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao;
    private Context mContext;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    public BloodGlucose2Item() {
        this.mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r8) {
        Intrinsics.X0O(r8, "itemHolder");
        Context r0 = r8.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r8.v(R.id.tempLastTime);
        Intrinsics.XXI(r1);
        this.tempLastTime = (TextView) r1;
        View r2 = r8.v(R.id.tempLastValue);
        Intrinsics.XXI(r2);
        this.tempLastValue = (TextView) r2;
        View r3 = r8.v(R.id.tmpUnit);
        Intrinsics.XXI(r3);
        this.tmpUnit = (TextView) r3;
        View r4 = r8.v(R.id.sbvLevel);
        Intrinsics.XXI(r4);
        this.sbvLevel = (SegmentedBarView) r4;
        View r5 = r8.v(R.id.empty_panel);
        Intrinsics.XXI(r5);
        this.emptyPanel = r5;
        SegmentedBarView r6 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r5 = null;
    L5:
        UtilsKt.IX1XiI(r5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r9 = r8.v(R.id.data_panel);
        Intrinsics.XXI(r9);
        this.dataPanel = r9;
        Context r7 = this.mContext;
        if (r7 != null) goto L8;
        Intrinsics.XXO("mContext");
        r7 = null;
    L8:
        iz3 r10 = new iz3(0.0f, 30.0f, "", r7.getResources().getColor(R.color.bg_level_color_low));
        Context r11 = this.mContext;
        if (r11 != null) goto L11;
        Intrinsics.XXO("mContext");
        r11 = null;
    L11:
        iz3 r12 = new iz3(30.0f, 70.0f, "", r11.getResources().getColor(R.color.bg_level_color_standard));
        Context r13 = this.mContext;
        if (r13 != null) goto L14;
        Intrinsics.XXO("mContext");
        r13 = null;
    L14:
        List<iz3> r14 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3[]{r10, r12, new iz3(70.0f, 100.0f, "", r13.getResources().getColor(R.color.bg_level_color_high))});
        SegmentedBarView r15 = this.sbvLevel;
        if (r15 != null) goto L17;
        Intrinsics.XXO("sbvLevel");
        r15 = null;
    L17:
        r15.setValue(Float.valueOf(40.0f));
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
        List<BloodGlucose> r0 = this.mBloodGlucoseDao.getLastData();
        SegmentedBarView r7 = null;
        View r8 = null;
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
        r8.setVisibility(8);
        return;
    L13:
        r8 = r3;
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
        int r6 = ((BloodGlucose) CollectionsKt___CollectionsKt.Xi1XO00(r0)).getMValue();
        TextView r9 = this.tempLastTime;
        if (r9 != null) goto L25;
        Intrinsics.XXO("tempLastTime");
        r9 = null;
    L25:
        r9.setText(O0X11OiO.XXX11i().format(new Date(((BloodGlucose) CollectionsKt___CollectionsKt.Xi1XO00(r0)).getMTime())));
        TextView r10 = this.tempLastValue;
        if (r10 != null) goto L28;
        Intrinsics.XXO("tempLastValue");
        r10 = null;
    L28:
        StringCompanionObject r11 = StringCompanionObject.OXO1;
        float r12 = r6;
        String r13 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r12 / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(r13, "format(...)");
        r10.setText(r13);
        SegmentedBarView r14 = this.sbvLevel;
        if (r14 != null) goto L31;
        Intrinsics.XXO("sbvLevel");
    L32:
        r7.setValue(Float.valueOf(r12));
        return;
    L31:
        r7 = r14;
        goto L32
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_blood_glucose;
    }

    @sf5(tag = I01XX0.X1ii)
    public final void onBloodGlucoseChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodGlucoseChanged"});
        initView();
    }
}
