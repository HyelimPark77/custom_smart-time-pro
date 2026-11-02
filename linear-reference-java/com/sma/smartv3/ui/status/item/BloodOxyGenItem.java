package com.sma.smartv3.ui.status.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodOxygenDao;
import com.sma.smartv3.db.entity.BloodOxygen;
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
    private final boolean initEvent;

    @aa1
    private final BloodOxygenDao mBloodOxygenDao;
    public long[] range;
    private DINCondBold tempLastTime;
    private DINCondBold tempLastValue;
    private PFRegular tmpUnit;

    public BloodOxyGenItem() {
        this.mBloodOxygenDao = MyDb.INSTANCE.getMDatabase().bloodOxygenDao();
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
    }

    @aa1
    public final List<BloodOxygen> getBloodOxygenData() {
        List<BloodOxygen> r0 = this.bloodOxygenData;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("bloodOxygenData");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final long[] getRange() {
        long[] r0 = this.range;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("range");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PFRegular r2 = null;
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        setBloodOxygenData(this.mBloodOxygenDao.getBloodOxygen(getRange()[0], getRange()[1]));
        if (getBloodOxygenData().isEmpty() == false) goto L11;
        DINCondBold r0 = this.tempLastTime;
        if (r0 != null) goto L7;
        Intrinsics.XXO("tempLastTime");
        r0 = null;
    L7:
        r0.setText(R.string.data_none);
        DINCondBold r1 = this.tempLastValue;
        if (r1 != null) goto L10;
        Intrinsics.XXO("tempLastValue");
        r1 = null;
    L10:
        r1.setText(R.string.data_none);
    L18:
        PFRegular r3 = this.tmpUnit;
        if (r3 != null) goto L21;
        Intrinsics.XXO("tmpUnit");
    L22:
        r2.setText("%");
        return;
    L21:
        r2 = r3;
        goto L22
    L11:
        DINCondBold r4 = this.tempLastTime;
        if (r4 != null) goto L14;
        Intrinsics.XXO("tempLastTime");
        r4 = null;
    L14:
        r4.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(getBloodOxygenData())).getMTime())));
        DINCondBold r5 = this.tempLastValue;
        if (r5 != null) goto L17;
        Intrinsics.XXO("tempLastValue");
        r5 = null;
    L17:
        r5.setText(String.valueOf(((BloodOxygen) CollectionsKt___CollectionsKt.Xi1XO00(getBloodOxygenData())).getMValue()));
        goto L18
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_blood_oxygen;
    }

    @sf5(tag = I01XX0.I0IIOi)
    public final void onBloodoxygenChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodoxygenChanged"});
        initView();
    }

    public final void setBloodOxygenData(@aa1 List<BloodOxygen> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bloodOxygenData = r2;
    }

    public final void setRange(@aa1 long[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.range = r2;
    }
}
