package com.sma.smartv3.p610ui.status.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodOxygenDao;
import com.sma.smartv3.p608db.entity.BloodOxygen;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFRegular;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class BloodOxyGenItem extends BaseDslItem {
    public List<BloodOxygen> bloodOxygenData;
    public long[] range;
    private DINCondBold tempLastTime;
    private DINCondBold tempLastValue;
    private PFRegular tmpUnit;

    @aa1
    private final BloodOxygenDao mBloodOxygenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
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
    }

    @aa1
    public final List<BloodOxygen> getBloodOxygenData() {
        List<BloodOxygen> list = this.bloodOxygenData;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("bloodOxygenData");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final long[] getRange() {
        long[] jArr = this.range;
        if (jArr != null) {
            return jArr;
        }
        Intrinsics.XXO("range");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PFRegular pFRegular = null;
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        setBloodOxygenData(this.mBloodOxygenDao.getBloodOxygen(getRange()[0], getRange()[1]));
        if (getBloodOxygenData().isEmpty()) {
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
            dINCondBold3.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(getBloodOxygenData())).getMTime())));
            DINCondBold dINCondBold4 = this.tempLastValue;
            if (dINCondBold4 == null) {
                Intrinsics.XXO("tempLastValue");
                dINCondBold4 = null;
            }
            dINCondBold4.setText(String.valueOf(((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(getBloodOxygenData())).getMValue()));
        }
        PFRegular pFRegular2 = this.tmpUnit;
        if (pFRegular2 == null) {
            Intrinsics.XXO("tmpUnit");
        } else {
            pFRegular = pFRegular2;
        }
        pFRegular.setText("%");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_blood_oxygen;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodoxygenChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onBloodoxygenChanged");
        initView();
    }

    public final void setBloodOxygenData(@aa1 List<BloodOxygen> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.bloodOxygenData = list;
    }

    public final void setRange(@aa1 long[] jArr) {
        Intrinsics.X0O(jArr, "<set-?>");
        this.range = jArr;
    }
}
