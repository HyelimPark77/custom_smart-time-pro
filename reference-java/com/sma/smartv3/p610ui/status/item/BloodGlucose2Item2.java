package com.sma.smartv3.p610ui.status.item;

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
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.model.BloodGlucoseLevel;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
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
    private Context mContext;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    @aa1
    private final BloodGlucose2Dao mBloodGlucose2Dao = MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        this.mContext = context;
        View viewM3483v = itemHolder.m3483v(R.id.tempLastTime);
        Intrinsics.XXI(viewM3483v);
        this.tempLastTime = (TextView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.tempLastValue);
        Intrinsics.XXI(viewM3483v2);
        this.tempLastValue = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.tmpUnit);
        Intrinsics.XXI(viewM3483v3);
        this.tmpUnit = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.sbvLevel);
        Intrinsics.XXI(viewM3483v4);
        this.sbvLevel = (SegmentedBarView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.empty_panel);
        Intrinsics.XXI(viewM3483v5);
        this.emptyPanel = viewM3483v5;
        SegmentedBarView segmentedBarView = null;
        if (viewM3483v5 == null) {
            Intrinsics.XXO("emptyPanel");
            viewM3483v5 = null;
        }
        UtilsKt.IX1XiI(viewM3483v5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View viewM3483v6 = itemHolder.m3483v(R.id.data_panel);
        Intrinsics.XXI(viewM3483v6);
        this.dataPanel = viewM3483v6;
        float bloodGlucoseBarValue$default = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(BloodGlucoseLevel.START.getMValue(), 0.0f, 2, null);
        BloodGlucoseLevel bloodGlucoseLevel = BloodGlucoseLevel.NORMAL;
        float bloodGlucoseBarValue$default2 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(bloodGlucoseLevel.getMValue(), 0.0f, 2, null);
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        iz3 iz3Var = new iz3(bloodGlucoseBarValue$default, bloodGlucoseBarValue$default2, context2.getResources().getColor(R.color.bg_level_color_normal));
        float bloodGlucoseBarValue$default3 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(bloodGlucoseLevel.getMValue(), 0.0f, 2, null);
        BloodGlucoseLevel bloodGlucoseLevel2 = BloodGlucoseLevel.PREDIABETES;
        float bloodGlucoseBarValue$default4 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(bloodGlucoseLevel2.getMValue(), 0.0f, 2, null);
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        iz3 iz3Var2 = new iz3(bloodGlucoseBarValue$default3, bloodGlucoseBarValue$default4, context3.getResources().getColor(R.color.bg_level_color_prediabetes));
        float bloodGlucoseBarValue$default5 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(bloodGlucoseLevel2.getMValue(), 0.0f, 2, null);
        float bloodGlucoseBarValue$default6 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(BloodGlucoseLevel.DIABETES.getMValue(), 0.0f, 2, null);
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        List<iz3> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(iz3Var, iz3Var2, new iz3(bloodGlucoseBarValue$default5, bloodGlucoseBarValue$default6, context4.getResources().getColor(R.color.bg_level_color_diabetes)));
        SegmentedBarView segmentedBarView2 = this.sbvLevel;
        if (segmentedBarView2 == null) {
            Intrinsics.XXO("sbvLevel");
            segmentedBarView2 = null;
        }
        segmentedBarView2.setValue(Float.valueOf(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(5.0f, 0.0f, 2, null)));
        SegmentedBarView segmentedBarView3 = this.sbvLevel;
        if (segmentedBarView3 == null) {
            Intrinsics.XXO("sbvLevel");
        } else {
            segmentedBarView = segmentedBarView3;
        }
        segmentedBarView.setSegments(listIi1iii0);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        List<BloodGlucose2> listForDay = this.mBloodGlucose2Dao.getListForDay();
        View view = null;
        if (listForDay.isEmpty()) {
            TextView textView = this.tempLastTime;
            if (textView == null) {
                Intrinsics.XXO("tempLastTime");
                textView = null;
            }
            textView.setText("");
            View view2 = this.emptyPanel;
            if (view2 == null) {
                Intrinsics.XXO("emptyPanel");
                view2 = null;
            }
            view2.setVisibility(0);
            View view3 = this.dataPanel;
            if (view3 == null) {
                Intrinsics.XXO("dataPanel");
            } else {
                view = view3;
            }
            view.setVisibility(8);
            return;
        }
        View view4 = this.emptyPanel;
        if (view4 == null) {
            Intrinsics.XXO("emptyPanel");
            view4 = null;
        }
        view4.setVisibility(8);
        View view5 = this.dataPanel;
        if (view5 == null) {
            Intrinsics.XXO("dataPanel");
            view5 = null;
        }
        view5.setVisibility(0);
        BloodGlucose2 bloodGlucose2 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(listForDay);
        TextView textView2 = this.tempLastTime;
        if (textView2 == null) {
            Intrinsics.XXO("tempLastTime");
            textView2 = null;
        }
        textView2.setText(O0X11OiO.XXX11i().format(new Date(bloodGlucose2.getMTime())));
        TextView textView3 = this.tempLastValue;
        if (textView3 == null) {
            Intrinsics.XXO("tempLastValue");
            textView3 = null;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%.1f-%.1f", Arrays.copyOf(new Object[]{Double.valueOf(bloodGlucose2.getMLowerBound()), Double.valueOf(bloodGlucose2.getMUpperBound())}, 2));
        Intrinsics.O10IXXX0X(str, "format(...)");
        textView3.setText(str);
        SegmentedBarView segmentedBarView = this.sbvLevel;
        if (segmentedBarView == null) {
            Intrinsics.XXO("sbvLevel");
            segmentedBarView = null;
        }
        segmentedBarView.setValue(Float.valueOf(BloodGlucose2DataKt.getBloodGlucoseBarValue$default((float) bloodGlucose2.getMUpperBound(), 0.0f, 2, null)));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_blood_glucose2;
    }

    @sf5(tag = I01XX0.X1ii)
    public final void onBloodGlucoseChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onBloodGlucoseChanged");
        initView();
    }
}
