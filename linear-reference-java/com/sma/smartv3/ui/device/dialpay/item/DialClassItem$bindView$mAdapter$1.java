package com.sma.smartv3.ui.device.dialpay.item;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.iX11XX1O;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DialClassItem$bindView$mAdapter$1 extends CommonAdapter<OnlineWatchFaceV2> {
    final /* synthetic */ DialClassItem this$0;

    public DialClassItem$bindView$mAdapter$1(DialClassItem r1, Context r2, List<OnlineWatchFaceV2> r3) {
        this.this$0 = r1;
        super(r2, R.layout.item_horizontal_dial_class, r3);
    }

    public static /* synthetic */ void OXO1(DialClassItem r0, int r1, View r2) {
        convert$lambda$0(r0, r1, r2);
    }

    private static final void convert$lambda$0(DialClassItem r0, int r1, View r2) {
        DialClassItem.access$onAdapterClick(r0, r1);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, OnlineWatchFaceV2 r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r3, OnlineWatchFaceV2 r4, final int r5) {
        Intrinsics.X0O(r3, "viewHolder");
        Intrinsics.X0O(r4, MapController.ITEM_LAYER_TAG);
        r3.setText(R.id.item_dial_class_tv, r4.getTypeName());
        ImageView r0 = (ImageView) r3.getView(R.id.item_dial_class_iv);
        Glide.with(this.mContext).load(r4.getTypeCssClass()).into(r0);
        final DialClassItem r6 = this.this$0;
        r3.setOnClickListener(R.id.item_dial_class_ll, new iX11XX1O(r6, r5));
    }
}
