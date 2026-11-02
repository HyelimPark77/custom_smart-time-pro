package com.sma.smartv3.ui.status.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTemperatureItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureItem.kt\ncom/sma/smartv3/ui/status/item/TemperatureItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,62:1\n19#2:63\n15#2:64\n*S KotlinDebug\n*F\n+ 1 TemperatureItem.kt\ncom/sma/smartv3/ui/status/item/TemperatureItem\n*L\n43#1:63\n43#1:64\n*E\n"})
public final class TemperatureItem extends BaseDslItem {
    private final boolean initEvent;

    @aa1
    private final TemperatureDao mTemperatureDao;
    private DINCondBold tempLastTime;
    private DINCondBold tempLastValue;
    private PFMedium tempTitle;
    private PFRegular tmpUnit;

    public TemperatureItem() {
        this.mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.tempLastTime);
        Intrinsics.XXI(r0);
        this.tempLastTime = (DINCondBold) r0;
        View r1 = r2.v(R.id.tempLastValue);
        Intrinsics.XXI(r1);
        this.tempLastValue = (DINCondBold) r1;
        View r3 = r2.v(R.id.tmpUnit);
        Intrinsics.XXI(r3);
        this.tmpUnit = (PFRegular) r3;
        View r4 = r2.v(R.id.tempTitle);
        Intrinsics.XXI(r4);
        this.tempTitle = (PFMedium) r4;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PFMedium r1 = this.tempTitle;
        PFRegular r2 = null;
        if (r1 != null) goto L6;
        Intrinsics.XXO("tempTitle");
        r1 = null;
    L6:
        if (q62.OXO1.XI1OX0IO() == false) goto L8;
        String r3 = UtilsKt.XXO(R.string.body_surface_temperature);
    L9:
        r1.setText(r3);
        SPUtils r4 = a01.OXO1.IiI10X();
        Object r5 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r6 = new Gson().fromJson(r4.getString(AppUser.class.getName()), AppUser.class);
        if (r6 == null) goto L13;
        r5 = r6;
    L13:
        AppUser r7 = (AppUser) r5;
        List<Temperature> r8 = this.mTemperatureDao.getLastData();
        if (r8.isEmpty() == false) goto L22;
        DINCondBold r9 = this.tempLastTime;
        if (r9 != null) goto L18;
        Intrinsics.XXO("tempLastTime");
        r9 = null;
    L18:
        r9.setText(R.string.data_none);
        DINCondBold r10 = this.tempLastValue;
        if (r10 != null) goto L21;
        Intrinsics.XXO("tempLastValue");
        r10 = null;
    L21:
        r10.setText(R.string.data_none);
    L33:
        PFRegular r11 = this.tmpUnit;
        if (r11 != null) goto L36;
        Intrinsics.XXO("tmpUnit");
    L38:
        if (cp5.II1Xi0(r7.getUnit()) != 1) goto L40;
        int r12 = R.string.fahrenheit;
    L41:
        r2.setText(r12);
        return;
    L40:
        r12 = R.string.degree_centigrade;
        goto L41
    L36:
        r2 = r11;
        goto L38
    L22:
        DINCondBold r13 = this.tempLastTime;
        if (r13 != null) goto L25;
        Intrinsics.XXO("tempLastTime");
        r13 = null;
    L25:
        r13.setText(TimeUtils.millis2String(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(r8)).getMTime(), O0X11OiO.X0i1O(null, 1, null)));
        DINCondBold r14 = this.tempLastValue;
        if (r14 != null) goto L28;
        Intrinsics.XXO("tempLastValue");
        r14 = null;
    L28:
        float r15 = ((Temperature) CollectionsKt___CollectionsKt.IIII0iI(r8)).getMTemperature() / 10.0f;
        if (cp5.II1Xi0(r7.getUnit()) != 1) goto L31;
        boolean r16 = true;
    L32:
        r14.setText(String.valueOf(cp5.i010I(r15, r16)));
        goto L33
    L31:
        r16 = false;
        goto L32
    L8:
        r3 = UtilsKt.XXO(R.string.temperature);
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_temperature;
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onTemperatureChanged"});
        initView();
    }
}
