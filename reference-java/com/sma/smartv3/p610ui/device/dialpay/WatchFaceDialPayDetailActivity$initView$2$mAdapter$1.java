package com.sma.smartv3.p610ui.device.dialpay;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.XXiO;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.p610ui.device.dialpay.WatchFaceDialPayDetailActivity$initView$2$mAdapter$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
import com.sma.smartv3.view.SquareImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WatchFaceDialPayDetailActivity$initView$2$mAdapter$1 extends CommonAdapter<WatchFaceCategoryV2> {
    final /* synthetic */ WatchFaceDialPayDetailActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchFaceDialPayDetailActivity$initView$2$mAdapter$1(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, Activity activity, List<WatchFaceCategoryV2> list) {
        super(activity, R.layout.item_dial_f3_v2, list);
        this.this$0 = watchFaceDialPayDetailActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$0(WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity, WatchFaceCategoryV2 watchFaceCategoryV2, View view) {
        if (watchFaceDialPayDetailActivity.isSync()) {
            ToastUtils.showLong(R.string.syncing_remind);
            return;
        }
        watchFaceDialPayDetailActivity.setMArg0(watchFaceCategoryV2.getPreviewUrl());
        watchFaceDialPayDetailActivity.setMArg1(watchFaceCategoryV2.getId());
        watchFaceDialPayDetailActivity.setMArg3(null);
        watchFaceDialPayDetailActivity.watchFaceClick();
        watchFaceDialPayDetailActivity.initData();
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final WatchFaceCategoryV2 item, int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        Glide.with((FragmentActivity) this.this$0).load(item.getPreviewUrl()).into((SquareImageView) viewHolder.getView(R.id.f51417iv));
        ProgressButtonV2 progressButtonV2 = (ProgressButtonV2) viewHolder.getView(R.id.f51421pb);
        Intrinsics.XXI(progressButtonV2);
        XXiO.IiI10X(progressButtonV2, item.getDollar(), item.getAmount(), item.getDollarDis(), item.getAmountDis(), item.getLimitFreeFlag(), item.getMemberAttr(), item.getPayStatus());
        if (this.this$0.mDialIds.contains(Integer.valueOf(item.getId()))) {
            ProgressButtonV2.IiI10X(progressButtonV2, R.string.synced, true, 0, false, 0, null, 60, null);
        }
        View view = viewHolder.itemView;
        final WatchFaceDialPayDetailActivity watchFaceDialPayDetailActivity = this.this$0;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xo6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WatchFaceDialPayDetailActivity$initView$2$mAdapter$1.convert$lambda$0(watchFaceDialPayDetailActivity, item, view2);
            }
        });
    }
}
