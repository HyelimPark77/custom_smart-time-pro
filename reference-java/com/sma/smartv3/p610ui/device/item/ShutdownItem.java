package com.sma.smartv3.p610ui.device.item;

import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ShutdownItem extends BaseDslItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        ImageView imageViewImg;
        Intrinsics.X0O(itemHolder, "itemHolder");
        if (!q62.OXO1.XI1OX0IO() || (imageViewImg = itemHolder.img(R.id.f51417iv)) == null) {
            return;
        }
        imageViewImg.setImageResource(R.drawable.icon_shutdown_2);
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
