package com.sma.smartv3.ui.status.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.HrvDao;
import com.sma.smartv3.db.entity.Hrv;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFRegular;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HrvItem extends BaseDslItem {
    private final boolean initEvent;

    @aa1
    private final HrvDao mHrvDao;
    private long[] range;
    private DINCondBold tempLastTime;
    private DINCondBold tempLastValue;
    private PFRegular tmpUnit;

    public HrvItem() {
        this.mHrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();
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

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PFRegular r2 = null;
        long[] r0 = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = r0;
        HrvDao r1 = this.mHrvDao;
        if (r0 != null) goto L5;
        Intrinsics.XXO("range");
        r0 = null;
    L5:
        long r5 = r0[0];
        long[] r3 = this.range;
        if (r3 != null) goto L8;
        Intrinsics.XXO("range");
        r3 = null;
    L8:
        List<Hrv> r4 = r1.getHrv(r5, r3[1]);
        if (r4.isEmpty() == false) goto L17;
        DINCondBold r6 = this.tempLastTime;
        if (r6 != null) goto L13;
        Intrinsics.XXO("tempLastTime");
        r6 = null;
    L13:
        r6.setText(R.string.data_none);
        DINCondBold r7 = this.tempLastValue;
        if (r7 != null) goto L16;
        Intrinsics.XXO("tempLastValue");
        r7 = null;
    L16:
        r7.setText(R.string.data_none);
    L24:
        PFRegular r8 = this.tmpUnit;
        if (r8 != null) goto L27;
        Intrinsics.XXO("tmpUnit");
    L28:
        r2.setText(R.string.ms);
        return;
    L27:
        r2 = r8;
        goto L28
    L17:
        DINCondBold r9 = this.tempLastTime;
        if (r9 != null) goto L20;
        Intrinsics.XXO("tempLastTime");
        r9 = null;
    L20:
        r9.setText(TimeUtils.millis2String(((Hrv) CollectionsKt___CollectionsKt.IIII0iI(r4)).getMTime(), O0X11OiO.X0i1O(null, 1, null)));
        DINCondBold r10 = this.tempLastValue;
        if (r10 != null) goto L23;
        Intrinsics.XXO("tempLastValue");
        r10 = null;
    L23:
        r10.setText(String.valueOf(((Hrv) CollectionsKt___CollectionsKt.IIII0iI(r4)).getMValue()));
        goto L24
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_hrv;
    }

    @sf5(tag = I01XX0.OIi0)
    public final void onHrvChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onHrvChanged"});
        initView();
    }
}
