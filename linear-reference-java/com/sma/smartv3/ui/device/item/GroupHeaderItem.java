package com.sma.smartv3.ui.device.item;

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

    public GroupHeaderItem(int r1) {
        this.titleRes = r1;
    }

    @Override // com.sma.smartv3.ui.device.item.BaseDeviceItem, com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        super.bindView(r2);
        TextView r3 = (TextView) r2.v(R.id.tv_title);
        this.tvTitle = r3;
        if (r3 == null) goto L6;
        r3.setText(this.titleRes);
        return;
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

    public final void setTvTitle(@tb1 TextView r1) {
        this.tvTitle = r1;
    }
}
