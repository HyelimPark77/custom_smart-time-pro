package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.su5;
import com.android.mltcode.paycertificationapi.w85;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.TodayHealthyDataActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TodayDataItem$initView$mAdapter$1 extends CommonAdapter<TodayData> {
    final /* synthetic */ List<TodayData> $list;
    final /* synthetic */ TodayDataItem this$0;

    public TodayDataItem$initView$mAdapter$1(List<TodayData> r1, TodayDataItem r2, Context r3) {
        this.$list = r1;
        this.this$0 = r2;
        super(r3, R.layout.item_today_healthy_data, r1);
    }

    public static /* synthetic */ void OXO1(TodayDataItem r0, View r1) {
        convert$lambda$0$0(r0, r1);
    }

    private static final void convert$lambda$0$0(TodayDataItem r3, View r4) {
        if (w85.OXO1.OXO1() == false) goto L13;
        RecyclerView r5 = TodayDataItem.access$getMRecyclerView$p(r3);
        RecyclerView r0 = null;
        if (r5 != null) goto L7;
        Intrinsics.XXO("mRecyclerView");
        r5 = null;
    L7:
        Context r6 = r5.getContext();
        RecyclerView r7 = TodayDataItem.access$getMRecyclerView$p(r3);
        if (r7 != null) goto L10;
        Intrinsics.XXO("mRecyclerView");
    L11:
        r6.startActivity(new Intent(r0.getContext(), TodayHealthyDataActivity.class));
        return;
    L10:
        r0 = r7;
        goto L11
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, TodayData r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r9, TodayData r10, int r11) {
        Intrinsics.X0O(r9, "viewHolder");
        Intrinsics.X0O(r10, MapController.ITEM_LAYER_TAG);
        View r0 = r9.getView(R.id.today_healthy_data_top_view);
        int r1 = 4;
        if (r11 != 0) goto L5;
        int r3 = 4;
    L6:
        r0.setVisibility(r3);
        View r2 = r9.getView(R.id.today_healthy_data_btn_view);
        if (r11 == (this.$list.size() - 1)) goto L10;
        r1 = 0;
    L10:
        r2.setVisibility(r1);
        TextView r12 = (TextView) r9.getView(R.id.item_today_healthy_data_time);
        TextView r4 = (TextView) r9.getView(R.id.item_today_healthy_data_title);
        TextView r5 = (TextView) r9.getView(R.id.item_today_healthy_data_value);
        TextView r6 = (TextView) r9.getView(R.id.item_today_healthy_data_state);
        Context r7 = null;
        r12.setText(O0X11OiO.IXI(false, 1, null).format(Long.valueOf(r10.getTime())));
        r4.setText(r10.getTitle());
        r5.setText(r10.getValue());
        r6.setText(r10.getState());
        int r13 = r10.getStateColor();
        if (r13 == 0) goto L22;
        if (r13 != 1) goto L14;
        Context r14 = TodayDataItem.access$getContext$p(this.this$0);
        if (r14 != null) goto L20;
        Intrinsics.XXO("context");
    L21:
        int r15 = r7.getColor(R.color.colorAccent);
    L23:
        r6.setTextColor(r15);
        View r16 = r9.getView(R.id.item_today_healthy_data_layout);
        final TodayDataItem r17 = this.this$0;
        r16.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(r16.getContext(), R.color.today_healthy_item_bg)));
        r16.setOnClickListener(new su5(r17));
        return;
    L20:
        r7 = r14;
        goto L21
    L14:
        if (r13 == 2) goto L16;
        r15 = -65536;
        goto L23
    L16:
        r15 = -16711936;
        goto L23
    L22:
        r15 = Color.parseColor("#FE6D00");
        goto L23
    L5:
        r3 = 0;
        goto L6
    }
}
