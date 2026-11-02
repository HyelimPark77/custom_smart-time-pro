package com.sma.smartv3.ui.device.item;

import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ShutdownItem extends BaseDslItem {
    public ShutdownItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        if (q62.OXO1.XI1OX0IO() == false) goto L8;
        ImageView r3 = r2.img(R.id.iv);
        if (r3 == null) goto L9;
        r3.setImageResource(R.drawable.icon_shutdown_2);
        return;
    L9:
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.IO0OOi());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_shutdown;
    }
}
