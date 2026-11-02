package com.sma.smartv3.p610ui.status.item;

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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.entity.Temperature;
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
    private DINCondBold tempLastTime;
    private DINCondBold tempLastValue;
    private PFMedium tempTitle;
    private PFRegular tmpUnit;

    @aa1
    private final TemperatureDao mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.tempLastTime);
        Intrinsics.XXI(viewM3483v);
        this.tempLastTime = (DINCondBold) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.tempLastValue);
        Intrinsics.XXI(viewM3483v2);
        this.tempLastValue = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.tmpUnit);
        Intrinsics.XXI(viewM3483v3);
        this.tmpUnit = (PFRegular) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.tempTitle);
        Intrinsics.XXI(viewM3483v4);
        this.tempTitle = (PFMedium) viewM3483v4;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PFMedium pFMedium = this.tempTitle;
        PFRegular pFRegular = null;
        if (pFMedium == null) {
            Intrinsics.XXO("tempTitle");
            pFMedium = null;
        }
        pFMedium.setText(q62.OXO1.XI1OX0IO() ? UtilsKt.XXO(R.string.body_surface_temperature) : UtilsKt.XXO(R.string.temperature));
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        List<Temperature> lastData = this.mTemperatureDao.getLastData();
        if (lastData.isEmpty()) {
            DINCondBold dINCondBold = this.tempLastTime;
            if (dINCondBold == null) {
                Intrinsics.XXO("tempLastTime");
                dINCondBold = null;
            }
            dINCondBold.setText(R.string.data_none);
            DINCondBold dINCondBold2 = this.tempLastValue;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("tempLastValue");
                dINCondBold2 = null;
            }
            dINCondBold2.setText(R.string.data_none);
        } else {
            DINCondBold dINCondBold3 = this.tempLastTime;
            if (dINCondBold3 == null) {
                Intrinsics.XXO("tempLastTime");
                dINCondBold3 = null;
            }
            dINCondBold3.setText(TimeUtils.millis2String(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(lastData)).getMTime(), O0X11OiO.X0i1O(null, 1, null)));
            DINCondBold dINCondBold4 = this.tempLastValue;
            if (dINCondBold4 == null) {
                Intrinsics.XXO("tempLastValue");
                dINCondBold4 = null;
            }
            dINCondBold4.setText(String.valueOf(cp5.i010I(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(lastData)).getMTemperature() / 10.0f, cp5.II1Xi0(appUser2.getUnit()) == 1)));
        }
        PFRegular pFRegular2 = this.tmpUnit;
        if (pFRegular2 == null) {
            Intrinsics.XXO("tmpUnit");
        } else {
            pFRegular = pFRegular2;
        }
        pFRegular.setText(cp5.II1Xi0(appUser2.getUnit()) == 1 ? R.string.fahrenheit : R.string.degree_centigrade);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_temperature;
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onTemperatureChanged");
        initView();
    }
}
