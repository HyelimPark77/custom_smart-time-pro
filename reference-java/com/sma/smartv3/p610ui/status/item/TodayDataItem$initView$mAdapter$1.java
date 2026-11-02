package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.w85;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.p610ui.status.TodayHealthyDataActivity;
import com.sma.smartv3.p610ui.status.item.TodayDataItem$initView$mAdapter$1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TodayDataItem$initView$mAdapter$1 extends CommonAdapter<TodayData> {
    final /* synthetic */ List<TodayData> $list;
    final /* synthetic */ TodayDataItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayDataItem$initView$mAdapter$1(List<TodayData> list, TodayDataItem todayDataItem, Context context) {
        super(context, R.layout.item_today_healthy_data, list);
        this.$list = list;
        this.this$0 = todayDataItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0$0(TodayDataItem todayDataItem, View view) {
        if (w85.OXO1.OXO1()) {
            RecyclerView recyclerView = todayDataItem.mRecyclerView;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                Intrinsics.XXO("mRecyclerView");
                recyclerView = null;
            }
            Context context = recyclerView.getContext();
            RecyclerView recyclerView3 = todayDataItem.mRecyclerView;
            if (recyclerView3 == null) {
                Intrinsics.XXO("mRecyclerView");
            } else {
                recyclerView2 = recyclerView3;
            }
            context.startActivity(new Intent(recyclerView2.getContext(), (Class<?>) TodayHealthyDataActivity.class));
        }
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, TodayData item, int i) {
        int color;
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        viewHolder.getView(R.id.today_healthy_data_top_view).setVisibility(i == 0 ? 4 : 0);
        viewHolder.getView(R.id.today_healthy_data_btn_view).setVisibility(i != this.$list.size() - 1 ? 0 : 4);
        TextView textView = (TextView) viewHolder.getView(R.id.item_today_healthy_data_time);
        TextView textView2 = (TextView) viewHolder.getView(R.id.item_today_healthy_data_title);
        TextView textView3 = (TextView) viewHolder.getView(R.id.item_today_healthy_data_value);
        TextView textView4 = (TextView) viewHolder.getView(R.id.item_today_healthy_data_state);
        Context context = null;
        textView.setText(O0X11OiO.IXI(false, 1, null).format(Long.valueOf(item.getTime())));
        textView2.setText(item.getTitle());
        textView3.setText(item.getValue());
        textView4.setText(item.getState());
        int stateColor = item.getStateColor();
        if (stateColor == 0) {
            color = Color.parseColor("#FE6D00");
        } else if (stateColor != 1) {
            color = stateColor != 2 ? -65536 : -16711936;
        } else {
            Context context2 = this.this$0.context;
            if (context2 == null) {
                Intrinsics.XXO("context");
            } else {
                context = context2;
            }
            color = context.getColor(R.color.colorAccent);
        }
        textView4.setTextColor(color);
        View view = viewHolder.getView(R.id.item_today_healthy_data_layout);
        final TodayDataItem todayDataItem = this.this$0;
        view.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(view.getContext(), R.color.today_healthy_item_bg)));
        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.su5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TodayDataItem$initView$mAdapter$1.convert$lambda$0$0(todayDataItem, view2);
            }
        });
    }
}
