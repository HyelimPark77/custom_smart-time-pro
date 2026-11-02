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
import com.sma.smartv3.p608db.dao.BloodGlucoseDao;
import com.sma.smartv3.p608db.entity.BloodGlucose;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseItem extends BaseDslItem {
    private DINCondBold lastTime;
    private DINCondBold lastValue;

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.lastTime);
        Intrinsics.XXI(viewM3483v);
        this.lastTime = (DINCondBold) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.lastValue);
        Intrinsics.XXI(viewM3483v2);
        this.lastValue = (DINCondBold) viewM3483v2;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        List<BloodGlucose> lastData = this.mBloodGlucoseDao.getLastData();
        DINCondBold dINCondBold = null;
        if (lastData.isEmpty()) {
            DINCondBold dINCondBold2 = this.lastTime;
            if (dINCondBold2 == null) {
                Intrinsics.XXO("lastTime");
                dINCondBold2 = null;
            }
            dINCondBold2.setText(R.string.data_none);
            DINCondBold dINCondBold3 = this.lastValue;
            if (dINCondBold3 == null) {
                Intrinsics.XXO("lastValue");
            } else {
                dINCondBold = dINCondBold3;
            }
            dINCondBold.setText(R.string.data_none);
            return;
        }
        DINCondBold dINCondBold4 = this.lastTime;
        if (dINCondBold4 == null) {
            Intrinsics.XXO("lastTime");
            dINCondBold4 = null;
        }
        dINCondBold4.setText(TimeUtils.millis2String(((BloodGlucose) CollectionsKt___CollectionsKt.IIII0iI(lastData)).getMTime(), O0X11OiO.X0i1O(null, 1, null)));
        DINCondBold dINCondBold5 = this.lastValue;
        if (dINCondBold5 == null) {
            Intrinsics.XXO("lastValue");
        } else {
            dINCondBold = dINCondBold5;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((BloodGlucose) CollectionsKt___CollectionsKt.IIII0iI(lastData)).getMValue() / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        dINCondBold.setText(str);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_blood_glucose;
    }

    @sf5(tag = I01XX0.X1ii)
    public final void onBloodGlucoseChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onBloodGlucoseChanged");
        initView();
    }
}
