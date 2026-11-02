package com.sma.smartv3.p610ui.device.dialpay.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.p610ui.device.dialpay.item.DialClassItem;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DialClassItem$bindView$mAdapter$1 extends CommonAdapter<OnlineWatchFaceV2> {
    final /* synthetic */ DialClassItem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialClassItem$bindView$mAdapter$1(DialClassItem dialClassItem, Context context, List<OnlineWatchFaceV2> list) {
        super(context, R.layout.item_horizontal_dial_class, list);
        this.this$0 = dialClassItem;
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, OnlineWatchFaceV2 item, final int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        viewHolder.setText(R.id.item_dial_class_tv, item.getTypeName());
        Glide.with(((CommonAdapter) this).mContext).load(item.getTypeCssClass()).into((ImageView) viewHolder.getView(R.id.item_dial_class_iv));
        final DialClassItem dialClassItem = this.this$0;
        viewHolder.setOnClickListener(R.id.item_dial_class_ll, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iX11XX1O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialClassItem.access$onAdapterClick(dialClassItem, i);
            }
        });
    }
}
