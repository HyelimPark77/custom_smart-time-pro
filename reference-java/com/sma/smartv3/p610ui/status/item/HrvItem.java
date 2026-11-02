package com.sma.smartv3.p610ui.status.item;

import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.HrvDao;
import com.sma.smartv3.p608db.entity.Hrv;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFRegular;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HrvItem extends BaseDslItem {
    private long[] range;
    private DINCondBold tempLastTime;
    private DINCondBold tempLastValue;
    private PFRegular tmpUnit;

    @aa1
    private final HrvDao mHrvDao = MyDb.INSTANCE.getMDatabase().hrvDao();
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

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PFRegular pFRegular = null;
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        this.range = jArrIOOX010X;
        HrvDao hrvDao = this.mHrvDao;
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
        List<Hrv> hrv = hrvDao.getHrv(j, jArr[1]);
        if (hrv.isEmpty()) {
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
            dINCondBold3.setText(TimeUtils.millis2String(((Hrv) CollectionsKt___CollectionsKt.IIII0iI(hrv)).getMTime(), O0X11OiO.X0i1O(null, 1, null)));
            DINCondBold dINCondBold4 = this.tempLastValue;
            if (dINCondBold4 == null) {
                Intrinsics.XXO("tempLastValue");
                dINCondBold4 = null;
            }
            dINCondBold4.setText(String.valueOf(((Hrv) CollectionsKt___CollectionsKt.IIII0iI(hrv)).getMValue()));
        }
        PFRegular pFRegular2 = this.tmpUnit;
        if (pFRegular2 == null) {
            Intrinsics.XXO("tmpUnit");
        } else {
            pFRegular = pFRegular2;
        }
        pFRegular.setText(R.string.f54362ms);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_hrv;
    }

    @sf5(tag = I01XX0.OIi0)
    public final void onHrvChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onHrvChanged");
        initView();
    }
}
