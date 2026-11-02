package com.sma.smartv3.ui.me.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.y30;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.VipBenefit;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MainUserOrderItem$initRecyclerView$mAdapter$1 extends CommonAdapter<VipBenefit> {
    final /* synthetic */ MainUserOrderItem this$0;

    public MainUserOrderItem$initRecyclerView$mAdapter$1(MainUserOrderItem r1, Context r2, List<VipBenefit> r3) {
        this.this$0 = r1;
        super(r2, R.layout.item_horizontal_vip_class, r3);
    }

    public static /* synthetic */ void OXO1(MainUserOrderItem r0, MainUserOrderItem$initRecyclerView$mAdapter$1 r1, VipBenefit r2, View r3) {
        convert$lambda$0(r0, r1, r2, r3);
    }

    private static final void convert$lambda$0(MainUserOrderItem r0, MainUserOrderItem$initRecyclerView$mAdapter$1 r1, VipBenefit r2, View r3) {
        Context r4 = r1.mContext;
        Intrinsics.O10IXXX0X(r4, "mContext");
        r0.toVipBenefitIntent(r4, r2.getType());
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, VipBenefit r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r3, final VipBenefit r4, int r5) {
        Intrinsics.X0O(r3, "viewHolder");
        Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
        r3.setText(R.id.item_dial_class_tv, r4.getTitle());
        ImageView r6 = (ImageView) r3.getView(R.id.item_dial_class_iv);
        Glide.with(this.mContext).load(Integer.valueOf(r4.getIvIcon())).into(r6);
        final MainUserOrderItem r7 = this.this$0;
        r3.setOnClickListener(R.id.item_dial_class_ll, new y30(r7, this, r4));
    }
}
