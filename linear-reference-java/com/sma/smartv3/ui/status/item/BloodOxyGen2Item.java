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
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.entity.BloodOxygen;
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
public final class BloodOxyGen2Item extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private final boolean initEvent;

    @aa1
    private final BloodOxygenDao mBloodOxygenDao;
    private Context mContext;
    private long[] range;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    public BloodOxyGen2Item() {
        this.mBloodOxygenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
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
        iz3 r10 = new iz3(0.0f, 70.0f, "", r9.getResources().getColor(R.color.bog_level_color_low));
        Context r11 = this.mContext;
        if (r11 != null) goto L11;
        Intrinsics.XXO("mContext");
        r11 = null;
    L11:
        List<iz3> r12 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3[]{r10, new iz3(70.0f, 100.0f, "", r11.getResources().getColor(R.color.bog_level_color_high))});
        SegmentedBarView r13 = this.sbvLevel;
        if (r13 != null) goto L14;
        Intrinsics.XXO("sbvLevel");
        r13 = null;
    L14:
        r13.setValue(Float.valueOf(80.0f));
        SegmentedBarView r14 = this.sbvLevel;
        if (r14 != null) goto L17;
        Intrinsics.XXO("sbvLevel");
    L18:
        r6.setSegments(r12);
        return;
    L17:
        r6 = r14;
        goto L18
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SegmentedBarView r2 = null;
        View r3 = null;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = r0;
        BloodOxygenDao r1 = this.mBloodOxygenDao;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r5 = r0[0];
        long[] r4 = this.range;
        if (r4 != null) goto L8;
        Intrinsics.XXO("range");
        r4 = null;
    L8:
        List<BloodOxygen> r6 = r1.getBloodOxygen(r5, r4[1]);
        if (r6.isEmpty() == false) goto L22;
        TextView r7 = this.tempLastTime;
        if (r7 != null) goto L13;
        Intrinsics.XXO("tempLastTime");
        r7 = null;
    L13:
        r7.setText("");
        View r8 = this.emptyPanel;
        if (r8 != null) goto L16;
        Intrinsics.XXO("emptyPanel");
        r8 = null;
    L16:
        r8.setVisibility(0);
        View r9 = this.dataPanel;
        if (r9 != null) goto L19;
        Intrinsics.XXO("dataPanel");
    L20:
        r3.setVisibility(8);
        return;
    L19:
        r3 = r9;
        goto L20
    L22:
        View r10 = this.emptyPanel;
        if (r10 != null) goto L25;
        Intrinsics.XXO("emptyPanel");
        r10 = null;
    L25:
        r10.setVisibility(8);
        View r11 = this.dataPanel;
        if (r11 != null) goto L28;
        Intrinsics.XXO("dataPanel");
        r11 = null;
    L28:
        r11.setVisibility(0);
        int r12 = ((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMValue();
        TextView r13 = this.tempLastTime;
        if (r13 != null) goto L31;
        Intrinsics.XXO("tempLastTime");
        r13 = null;
    L31:
        r13.setText(O0X11OiO.XXX11i().format(new Date(((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(r6)).getMTime())));
        TextView r14 = this.tempLastValue;
        if (r14 != null) goto L34;
        Intrinsics.XXO("tempLastValue");
        r14 = null;
    L34:
        r14.setText(String.valueOf(r12));
        SegmentedBarView r15 = this.sbvLevel;
        if (r15 != null) goto L37;
        Intrinsics.XXO("sbvLevel");
    L38:
        r2.setValue(Float.valueOf(r12));
        return;
    L37:
        r2 = r15;
        goto L38
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_blood_oxygen;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodoxygenChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodoxygenChanged"});
        initView();
    }
}
