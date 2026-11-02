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
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.entity.BloodOxygen;
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
    private Context mContext;
    private long[] range;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    @aa1
    private final BloodOxygenDao mBloodOxygenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
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
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        iz3 iz3Var = new iz3(0.0f, 70.0f, "", context2.getResources().getColor(R.color.bog_level_color_low));
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        List<iz3> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(iz3Var, new iz3(70.0f, 100.0f, "", context3.getResources().getColor(R.color.bog_level_color_high)));
        SegmentedBarView segmentedBarView2 = this.sbvLevel;
        if (segmentedBarView2 == null) {
            Intrinsics.XXO("sbvLevel");
            segmentedBarView2 = null;
        }
        segmentedBarView2.setValue(Float.valueOf(80.0f));
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
        SegmentedBarView segmentedBarView = null;
        View view = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = jArrIOOX010X;
        BloodOxygenDao bloodOxygenDao = this.mBloodOxygenDao;
        if (jArrIOOX010X == null) {
            Intrinsics.XXO("range");
            jArrIOOX010X = null;
        }
        long j = jArrIOOX010X[0];
        long[] jArr = this.range;
        if (jArr == null) {
            Intrinsics.XXO("range");
            jArr = null;
        }
        List<BloodOxygen> bloodOxygen = bloodOxygenDao.getBloodOxygen(j, jArr[1]);
        if (bloodOxygen.isEmpty()) {
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
        int mValue = ((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(bloodOxygen)).getMValue();
        TextView textView2 = this.tempLastTime;
        if (textView2 == null) {
            Intrinsics.XXO("tempLastTime");
            textView2 = null;
        }
        textView2.setText(O0X11OiO.XXX11i().format(new Date(((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(bloodOxygen)).getMTime())));
        TextView textView3 = this.tempLastValue;
        if (textView3 == null) {
            Intrinsics.XXO("tempLastValue");
            textView3 = null;
        }
        textView3.setText(String.valueOf(mValue));
        SegmentedBarView segmentedBarView2 = this.sbvLevel;
        if (segmentedBarView2 == null) {
            Intrinsics.XXO("sbvLevel");
        } else {
            segmentedBarView = segmentedBarView2;
        }
        segmentedBarView.setValue(Float.valueOf(mValue));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_blood_oxygen;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodoxygenChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onBloodoxygenChanged");
        initView();
    }
}
