package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupHeaderItem extends BaseDeviceItem {
    private final int titleRes;

    @tb1
    private TextView tvTitle;

    public GroupHeaderItem(int i) {
        this.titleRes = i;
    }

    @Override // com.sma.smartv3.p610ui.device.item.BaseDeviceItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.bindView(itemHolder);
        TextView textView = (TextView) itemHolder.m3483v(R.id.tv_title);
        this.tvTitle = textView;
        if (textView != null) {
            textView.setText(this.titleRes);
        }
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    @tb1
    public final TextView getTvTitle() {
        return this.tvTitle;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_group_header;
    }

    public final void setTvTitle(@tb1 TextView textView) {
        this.tvTitle = textView;
    }
}
