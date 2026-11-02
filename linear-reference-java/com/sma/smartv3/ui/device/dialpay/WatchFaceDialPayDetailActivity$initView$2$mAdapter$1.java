package com.sma.smartv3.ui.device.dialpay;

import android.app.Activity;
import android.view.View;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.xo6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
import com.sma.smartv3.view.SquareImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WatchFaceDialPayDetailActivity$initView$2$mAdapter$1 extends CommonAdapter<WatchFaceCategoryV2> {
    final /* synthetic */ WatchFaceDialPayDetailActivity this$0;

    public WatchFaceDialPayDetailActivity$initView$2$mAdapter$1(WatchFaceDialPayDetailActivity r1, Activity r2, List<WatchFaceCategoryV2> r3) {
        this.this$0 = r1;
        super(r2, R.layout.item_dial_f3_v2, r3);
    }

    public static /* synthetic */ void OXO1(WatchFaceDialPayDetailActivity r0, WatchFaceCategoryV2 r1, View r2) {
        convert$lambda$0(r0, r1, r2);
    }

    private static final void convert$lambda$0(WatchFaceDialPayDetailActivity r0, WatchFaceCategoryV2 r1, View r2) {
        if (r0.isSync() == false) goto L6;
        ToastUtils.showLong(R.string.syncing_remind);
        return;
    L6:
        r0.setMArg0(r1.getPreviewUrl());
        r0.setMArg1(r1.getId());
        r0.setMArg3(null);
        r0.watchFaceClick();
        WatchFaceDialPayDetailActivity.access$initData(r0);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, WatchFaceCategoryV2 r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r10, final WatchFaceCategoryV2 r11, int r12) {
        Intrinsics.X0O(r10, "viewHolder");
        Intrinsics.X0O(r11, MapController.ITEM_LAYER_TAG);
        SquareImageView r13 = (SquareImageView) r10.getView(R.id.iv);
        Glide.with(this.this$0).load(r11.getPreviewUrl()).into(r13);
        ProgressButtonV2 r0 = (ProgressButtonV2) r10.getView(R.id.pb);
        Intrinsics.XXI(r0);
        XXiO.IiI10X(r0, r11.getDollar(), r11.getAmount(), r11.getDollarDis(), r11.getAmountDis(), r11.getLimitFreeFlag(), r11.getMemberAttr(), r11.getPayStatus());
        if (WatchFaceDialPayDetailActivity.access$getMDialIds$p(this.this$0).contains(Integer.valueOf(r11.getId())) == false) goto L5;
        ProgressButtonV2.IiI10X(r0, R.string.synced, true, 0, false, 0, null, 60, null);
    L5:
        View r14 = r10.itemView;
        final WatchFaceDialPayDetailActivity r15 = this.this$0;
        r14.setOnClickListener(new xo6(r15, r11));
    }
}
