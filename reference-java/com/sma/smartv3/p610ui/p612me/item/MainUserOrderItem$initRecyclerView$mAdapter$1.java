package com.sma.smartv3.p610ui.p612me.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.VipBenefit;
import com.sma.smartv3.p610ui.p612me.item.MainUserOrderItem$initRecyclerView$mAdapter$1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MainUserOrderItem$initRecyclerView$mAdapter$1 extends CommonAdapter<VipBenefit> {
    final /* synthetic */ MainUserOrderItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainUserOrderItem$initRecyclerView$mAdapter$1(MainUserOrderItem mainUserOrderItem, Context context, List<VipBenefit> list) {
        super(context, R.layout.item_horizontal_vip_class, list);
        this.this$0 = mainUserOrderItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0(MainUserOrderItem mainUserOrderItem, MainUserOrderItem$initRecyclerView$mAdapter$1 mainUserOrderItem$initRecyclerView$mAdapter$1, VipBenefit vipBenefit, View view) {
        Context mContext = ((CommonAdapter) mainUserOrderItem$initRecyclerView$mAdapter$1).mContext;
        Intrinsics.O10IXXX0X(mContext, "mContext");
        mainUserOrderItem.toVipBenefitIntent(mContext, vipBenefit.getType());
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final VipBenefit item, int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        viewHolder.setText(R.id.item_dial_class_tv, item.getTitle());
        Glide.with(((CommonAdapter) this).mContext).load(Integer.valueOf(item.getIvIcon())).into((ImageView) viewHolder.getView(R.id.item_dial_class_iv));
        final MainUserOrderItem mainUserOrderItem = this.this$0;
        viewHolder.setOnClickListener(R.id.item_dial_class_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.y30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainUserOrderItem$initRecyclerView$mAdapter$1.convert$lambda$0(mainUserOrderItem, this, item, view);
            }
        });
    }
}
