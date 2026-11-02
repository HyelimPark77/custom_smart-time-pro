package com.sma.smartv3.ui.status.item;

import android.content.res.Resources;
import android.graphics.Color;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class HeathReportsBaseItem extends BaseDslItem {

    @aa1
    private final TodayData item;

    @tb1
    private TextView tvState;

    @tb1
    private TextView tvTitle;

    @tb1
    private TextView tvValue;

    public HeathReportsBaseItem(@aa1 TodayData r2) {
        Intrinsics.X0O(r2, MapController.ITEM_LAYER_TAG);
        this.item = r2;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        this.tvTitle = (TextView) r2.view(R.id.tv_top_title);
        this.tvValue = (TextView) r2.view(R.id.tv_value);
        this.tvState = (TextView) r2.view(R.id.tv_state_view);
    }

    @aa1
    public final TodayData getItem() {
        return this.item;
    }

    @tb1
    public final TextView getTvState() {
        return this.tvState;
    }

    @tb1
    public final TextView getTvTitle() {
        return this.tvTitle;
    }

    @tb1
    public final TextView getTvValue() {
        return this.tvValue;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView r0 = this.tvTitle;
        if (r0 == null) goto L5;
        r0.setText(this.item.getTitle());
    L5:
        TextView r1 = this.tvValue;
        if (r1 == null) goto L8;
        r1.setText(this.item.getValue());
    L8:
        TextView r2 = this.tvState;
        if (r2 == null) goto L11;
        r2.setText(this.item.getState());
    L11:
        TextView r3 = this.tvState;
        if (r3 == null) goto L25;
        int r4 = this.item.getStateColor();
        if (r4 != 0) goto L16;
        int r5 = Color.parseColor("#FE6D00");
    L23:
        r3.setTextColor(r5);
        return;
    L16:
        if (r4 != 1) goto L18;
        TextView r6 = this.tvState;
        Intrinsics.XXI(r6);
        Resources r7 = r6.getResources();
        Intrinsics.XXI(r7);
        r5 = r7.getColor(R.color.colorAccent);
        goto L23
    L18:
        if (r4 == 2) goto L20;
        r5 = -65536;
        goto L23
    L20:
        r5 = -16711936;
        goto L23
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.heath_reports_item;
    }

    public final void setTvState(@tb1 TextView r1) {
        this.tvState = r1;
    }

    public final void setTvTitle(@tb1 TextView r1) {
        this.tvTitle = r1;
    }

    public final void setTvValue(@tb1 TextView r1) {
        this.tvValue = r1;
    }
}
