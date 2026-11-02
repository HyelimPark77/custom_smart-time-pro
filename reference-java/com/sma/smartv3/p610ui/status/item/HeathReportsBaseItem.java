package com.sma.smartv3.p610ui.status.item;

import android.content.res.Resources;
import android.graphics.Color;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
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

    public HeathReportsBaseItem(@aa1 TodayData item) {
        Intrinsics.X0O(item, "item");
        this.item = item;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        this.tvTitle = (TextView) itemHolder.view(R.id.tv_top_title);
        this.tvValue = (TextView) itemHolder.view(R.id.tv_value);
        this.tvState = (TextView) itemHolder.view(R.id.tv_state_view);
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
        int color;
        TextView textView = this.tvTitle;
        if (textView != null) {
            textView.setText(this.item.getTitle());
        }
        TextView textView2 = this.tvValue;
        if (textView2 != null) {
            textView2.setText(this.item.getValue());
        }
        TextView textView3 = this.tvState;
        if (textView3 != null) {
            textView3.setText(this.item.getState());
        }
        TextView textView4 = this.tvState;
        if (textView4 != null) {
            int stateColor = this.item.getStateColor();
            if (stateColor == 0) {
                color = Color.parseColor("#FE6D00");
            } else if (stateColor != 1) {
                color = stateColor != 2 ? -65536 : -16711936;
            } else {
                TextView textView5 = this.tvState;
                Intrinsics.XXI(textView5);
                Resources resources = textView5.getResources();
                Intrinsics.XXI(resources);
                color = resources.getColor(R.color.colorAccent);
            }
            textView4.setTextColor(color);
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.heath_reports_item;
    }

    public final void setTvState(@tb1 TextView textView) {
        this.tvState = textView;
    }

    public final void setTvTitle(@tb1 TextView textView) {
        this.tvTitle = textView;
    }

    public final void setTvValue(@tb1 TextView textView) {
        this.tvValue = textView;
    }
}
