package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AudioBookLearnItem extends BaseDslItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_left);
        if (textViewM3482tv == null || !q62.OXO1.i000X()) {
            return;
        }
        textViewM3482tv.setText(R.string.storybook);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.X0i1101I());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_audio_book_learn;
    }
}
