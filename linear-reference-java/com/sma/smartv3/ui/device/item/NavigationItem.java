package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.FileTransmissionKt;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.entity.BleAppInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NavigationItem extends BaseDslItem {
    public NavigationItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        boolean r2 = true;
        if (r0.i0() == true) goto L5;
        r0.iXi1();
    L9:
        setItemHidden(r2);
        return;
    L5:
        if (FileTransmissionKt.appStoreIsShowCurrentCategory(BleAppInfo.PACKAGE_NAVIGATION) == false) goto L9;
        r2 = false;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_navigation;
    }
}
