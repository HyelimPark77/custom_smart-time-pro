package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import com.szabh.smable3.entity.BleWeatherRealtime3;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTemperature2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Temperature2Item.kt\ncom/sma/smartv3/ui/status/item/Temperature2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,118:1\n19#2:119\n15#2:120\n*S KotlinDebug\n*F\n+ 1 Temperature2Item.kt\ncom/sma/smartv3/ui/status/item/Temperature2Item\n*L\n83#1:119\n83#1:120\n*E\n"})
public final class Temperature2Item extends BaseDslItem {
    private View dataPanel;
    private View emptyPanel;
    private Context mContext;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    @aa1
    private final TemperatureDao mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
    private final boolean initEvent = true;
    private final int MAX_TEMP = BleWeatherRealtime3.ITEM_LENGTH;
    private final int MIN_TEMP = 240;

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
        iz3 iz3Var = new iz3(0.0f, 1.0f, "", context2.getResources().getColor(R.color.t_level_color_low));
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        iz3 iz3Var2 = new iz3(1.0f, 2.4f, "", context3.getResources().getColor(R.color.t_level_color_standard));
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        List<iz3> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(iz3Var, iz3Var2, new iz3(2.5f, 4.5f, "", context4.getResources().getColor(R.color.t_level_color_high)));
        SegmentedBarView segmentedBarView2 = this.sbvLevel;
        if (segmentedBarView2 == null) {
            Intrinsics.XXO("sbvLevel");
            segmentedBarView2 = null;
        }
        segmentedBarView2.setValue(Float.valueOf(2.0f));
        SegmentedBarView segmentedBarView3 = this.sbvLevel;
        if (segmentedBarView3 == null) {
            Intrinsics.XXO("sbvLevel");
        } else {
            segmentedBarView = segmentedBarView3;
        }
        segmentedBarView.setSegments(listIi1iii0);
        if (q62.OXO1.XI1OX0IO()) {
            TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
            if (textViewM3482tv != null) {
                textViewM3482tv.setText(R.string.body_surface_temperature);
            }
            TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_title_empty);
            if (textViewM3482tv2 != null) {
                textViewM3482tv2.setText(R.string.body_surface_temperature);
            }
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        List<Temperature> lastData = this.mTemperatureDao.getLastData();
        TextView textView = null;
        if (lastData.isEmpty()) {
            TextView textView2 = this.tempLastTime;
            if (textView2 == null) {
                Intrinsics.XXO("tempLastTime");
                textView2 = null;
            }
            textView2.setText("");
            View view = this.emptyPanel;
            if (view == null) {
                Intrinsics.XXO("emptyPanel");
                view = null;
            }
            view.setVisibility(0);
            View view2 = this.dataPanel;
            if (view2 == null) {
                Intrinsics.XXO("dataPanel");
                view2 = null;
            }
            view2.setVisibility(8);
        } else {
            View view3 = this.emptyPanel;
            if (view3 == null) {
                Intrinsics.XXO("emptyPanel");
                view3 = null;
            }
            view3.setVisibility(8);
            View view4 = this.dataPanel;
            if (view4 == null) {
                Intrinsics.XXO("dataPanel");
                view4 = null;
            }
            view4.setVisibility(0);
            int mTemperature = ((Temperature) CollectionsKt___CollectionsKt.IIII0iI(lastData)).getMTemperature();
            TextView textView3 = this.tempLastTime;
            if (textView3 == null) {
                Intrinsics.XXO("tempLastTime");
                textView3 = null;
            }
            textView3.setText(O0X11OiO.XXX11i().format(new Date(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(lastData)).getMTime())));
            TextView textView4 = this.tempLastValue;
            if (textView4 == null) {
                Intrinsics.XXO("tempLastValue");
                textView4 = null;
            }
            textView4.setText(String.valueOf(cp5.i010I(mTemperature / 10.0f, cp5.II1Xi0(appUser2.getUnit()) == 1)));
            int i = this.MAX_TEMP;
            if (mTemperature > i || mTemperature < (i = this.MIN_TEMP)) {
                mTemperature = i;
            }
            if (q62.OXO1.XI1OX0IO()) {
                SegmentedBarView segmentedBarView = this.sbvLevel;
                if (segmentedBarView == null) {
                    Intrinsics.XXO("sbvLevel");
                    segmentedBarView = null;
                }
                segmentedBarView.setValue(Float.valueOf(((mTemperature / 10.0f) - 24.0f) / 4));
            } else {
                SegmentedBarView segmentedBarView2 = this.sbvLevel;
                if (segmentedBarView2 == null) {
                    Intrinsics.XXO("sbvLevel");
                    segmentedBarView2 = null;
                }
                segmentedBarView2.setValue(Float.valueOf((mTemperature / 10.0f) - 35.0f));
            }
        }
        TextView textView5 = this.tmpUnit;
        if (textView5 == null) {
            Intrinsics.XXO("tmpUnit");
        } else {
            textView = textView5;
        }
        textView.setText(cp5.II1Xi0(appUser2.getUnit()) == 1 ? R.string.fahrenheit : R.string.degree_centigrade);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_tempreature;
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onTemperatureChanged");
        initView();
    }
}
