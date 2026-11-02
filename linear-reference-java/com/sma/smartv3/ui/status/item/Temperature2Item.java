package com.sma.smartv3.ui.status.item;

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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.model.AppUser;
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
    private final int MAX_TEMP;
    private final int MIN_TEMP;
    private View dataPanel;
    private View emptyPanel;
    private final boolean initEvent;
    private Context mContext;

    @aa1
    private final TemperatureDao mTemperatureDao;
    private SegmentedBarView sbvLevel;
    private TextView tempLastTime;
    private TextView tempLastValue;
    private TextView tmpUnit;

    public Temperature2Item() {
        this.mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
        this.initEvent = true;
        this.MAX_TEMP = BleWeatherRealtime3.ITEM_LENGTH;
        this.MIN_TEMP = 240;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r9) {
        Intrinsics.X0O(r9, "itemHolder");
        Context r0 = r9.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r9.v(R.id.tempLastTime);
        Intrinsics.XXI(r1);
        this.tempLastTime = (TextView) r1;
        View r2 = r9.v(R.id.tempLastValue);
        Intrinsics.XXI(r2);
        this.tempLastValue = (TextView) r2;
        View r3 = r9.v(R.id.tmpUnit);
        Intrinsics.XXI(r3);
        this.tmpUnit = (TextView) r3;
        View r4 = r9.v(R.id.sbvLevel);
        Intrinsics.XXI(r4);
        this.sbvLevel = (SegmentedBarView) r4;
        View r5 = r9.v(R.id.empty_panel);
        Intrinsics.XXI(r5);
        this.emptyPanel = r5;
        SegmentedBarView r6 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("emptyPanel");
        r5 = null;
    L5:
        UtilsKt.IX1XiI(r5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        View r7 = r9.v(R.id.data_panel);
        Intrinsics.XXI(r7);
        this.dataPanel = r7;
        Context r8 = this.mContext;
        if (r8 != null) goto L8;
        Intrinsics.XXO("mContext");
        r8 = null;
    L8:
        iz3 r10 = new iz3(0.0f, 1.0f, "", r8.getResources().getColor(R.color.t_level_color_low));
        Context r11 = this.mContext;
        if (r11 != null) goto L11;
        Intrinsics.XXO("mContext");
        r11 = null;
    L11:
        iz3 r12 = new iz3(1.0f, 2.4f, "", r11.getResources().getColor(R.color.t_level_color_standard));
        Context r13 = this.mContext;
        if (r13 != null) goto L14;
        Intrinsics.XXO("mContext");
        r13 = null;
    L14:
        List<iz3> r14 = CollectionsKt__CollectionsKt.Ii1iii0(new iz3[]{r10, r12, new iz3(2.5f, 4.5f, "", r13.getResources().getColor(R.color.t_level_color_high))});
        SegmentedBarView r15 = this.sbvLevel;
        if (r15 != null) goto L17;
        Intrinsics.XXO("sbvLevel");
        r15 = null;
    L17:
        r15.setValue(Float.valueOf(2.0f));
        SegmentedBarView r16 = this.sbvLevel;
        if (r16 != null) goto L20;
        Intrinsics.XXO("sbvLevel");
    L21:
        r6.setSegments(r14);
        if (q62.OXO1.XI1OX0IO() == false) goto L30;
        TextView r17 = r9.tv(R.id.tv_title);
        if (r17 == null) goto L26;
        r17.setText(R.string.body_surface_temperature);
    L26:
        TextView r18 = r9.tv(R.id.tv_title_empty);
        if (r18 == null) goto L31;
        r18.setText(R.string.body_surface_temperature);
        return;
    L31:
        return;
    L30:
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
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        AppUser r4 = (AppUser) r2;
        List<Temperature> r5 = this.mTemperatureDao.getLastData();
        boolean r9 = false;
        TextView r10 = null;
        if (r5.isEmpty() == false) goto L18;
        TextView r6 = this.tempLastTime;
        if (r6 != null) goto L11;
        Intrinsics.XXO("tempLastTime");
        r6 = null;
    L11:
        r6.setText("");
        View r7 = this.emptyPanel;
        if (r7 != null) goto L14;
        Intrinsics.XXO("emptyPanel");
        r7 = null;
    L14:
        r7.setVisibility(0);
        View r8 = this.dataPanel;
        if (r8 != null) goto L17;
        Intrinsics.XXO("dataPanel");
        r8 = null;
    L17:
        r8.setVisibility(8);
    L49:
        TextView r11 = this.tmpUnit;
        if (r11 != null) goto L52;
        Intrinsics.XXO("tmpUnit");
    L54:
        if (cp5.II1Xi0(r4.getUnit()) != 1) goto L56;
        int r12 = R.string.fahrenheit;
    L57:
        r10.setText(r12);
        return;
    L56:
        r12 = R.string.degree_centigrade;
        goto L57
    L52:
        r10 = r11;
        goto L54
    L18:
        View r13 = this.emptyPanel;
        if (r13 != null) goto L21;
        Intrinsics.XXO("emptyPanel");
        r13 = null;
    L21:
        r13.setVisibility(8);
        View r14 = this.dataPanel;
        if (r14 != null) goto L24;
        Intrinsics.XXO("dataPanel");
        r14 = null;
    L24:
        r14.setVisibility(0);
        int r15 = ((Temperature) CollectionsKt___CollectionsKt.IIII0iI(r5)).getMTemperature();
        TextView r16 = this.tempLastTime;
        if (r16 != null) goto L27;
        Intrinsics.XXO("tempLastTime");
        r16 = null;
    L27:
        r16.setText(O0X11OiO.XXX11i().format(new Date(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(r5)).getMTime())));
        TextView r17 = this.tempLastValue;
        if (r17 != null) goto L30;
        Intrinsics.XXO("tempLastValue");
        r17 = null;
    L30:
        float r18 = r15 / 10.0f;
        if (cp5.II1Xi0(r4.getUnit()) != 1) goto L33;
        r9 = true;
    L33:
        r17.setText(String.valueOf(cp5.i010I(r18, r9)));
        int r19 = this.MAX_TEMP;
        if (r15 <= r19) goto L36;
    L35:
        r15 = r19;
    L40:
        if (q62.OXO1.XI1OX0IO() == false) goto L45;
        SegmentedBarView r20 = this.sbvLevel;
        if (r20 != null) goto L44;
        Intrinsics.XXO("sbvLevel");
        r20 = null;
    L44:
        r20.setValue(Float.valueOf(((r15 / 10.0f) - 24.0f) / 4));
        goto L49
    L45:
        SegmentedBarView r21 = this.sbvLevel;
        if (r21 != null) goto L48;
        Intrinsics.XXO("sbvLevel");
        r21 = null;
    L48:
        r21.setValue(Float.valueOf((r15 / 10.0f) - 35.0f));
        goto L49
    L36:
        r19 = this.MIN_TEMP;
        if (r15 >= r19) goto L40;
        goto L35
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_tempreature;
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onTemperatureChanged"});
        initView();
    }
}
