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
import com.sma.smartv3.db.dao.BloodGlucoseDao;
import com.sma.smartv3.db.entity.BloodGlucose;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BloodGlucoseItem extends BaseDslItem {
    private final boolean initEvent;
    private DINCondBold lastTime;
    private DINCondBold lastValue;

    @aa1
    private final BloodGlucoseDao mBloodGlucoseDao;

    public BloodGlucoseItem() {
        this.mBloodGlucoseDao = MyDb.INSTANCE.getMDatabase().bloodGlucoseDao();
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.lastTime);
        Intrinsics.XXI(r0);
        this.lastTime = (DINCondBold) r0;
        View r3 = r2.v(R.id.lastValue);
        Intrinsics.XXI(r3);
        this.lastValue = (DINCondBold) r3;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        List<BloodGlucose> r0 = this.mBloodGlucoseDao.getLastData();
        DINCondBold r4 = null;
        if (r0.isEmpty() == false) goto L13;
        DINCondBold r1 = this.lastTime;
        if (r1 != null) goto L7;
        Intrinsics.XXO("lastTime");
        r1 = null;
    L7:
        r1.setText(R.string.data_none);
        DINCondBold r2 = this.lastValue;
        if (r2 != null) goto L10;
        Intrinsics.XXO("lastValue");
    L11:
        r4.setText(R.string.data_none);
        return;
    L10:
        r4 = r2;
        goto L11
    L13:
        DINCondBold r3 = this.lastTime;
        if (r3 != null) goto L16;
        Intrinsics.XXO("lastTime");
        r3 = null;
    L16:
        r3.setText(TimeUtils.millis2String(((BloodGlucose) CollectionsKt___CollectionsKt.IIII0iI(r0)).getMTime(), O0X11OiO.X0i1O(null, 1, null)));
        DINCondBold r5 = this.lastValue;
        if (r5 != null) goto L19;
        Intrinsics.XXO("lastValue");
    L20:
        StringCompanionObject r6 = StringCompanionObject.OXO1;
        String r7 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((BloodGlucose) CollectionsKt___CollectionsKt.IIII0iI(r0)).getMValue() / 10.0f)}, 1));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        r4.setText(r7);
        return;
    L19:
        r4 = r5;
        goto L20
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_blood_glucose;
    }

    @sf5(tag = I01XX0.X1ii)
    public final void onBloodGlucoseChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onBloodGlucoseChanged"});
        initView();
    }
}
