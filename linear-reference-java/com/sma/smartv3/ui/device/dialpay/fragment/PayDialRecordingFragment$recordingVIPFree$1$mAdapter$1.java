package com.sma.smartv3.ui.device.dialpay.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.ep1;
import com.android.mltcode.paycertificationapi.fp1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.view.ProgressButtonV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayDialRecordingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n99#2,7:211\n106#2,3:219\n79#2,7:222\n109#2:229\n99#2,7:230\n106#2,3:238\n79#2,7:241\n109#2:248\n1#3:218\n1#3:237\n*S KotlinDebug\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1\n*L\n160#1:211,7\n160#1:219,3\n160#1:222,7\n160#1:229\n163#1:230,7\n163#1:238,3\n163#1:241,7\n163#1:248\n160#1:218\n163#1:237\n*E\n"})
public final class PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1 extends CommonAdapter<WatchFaceCategoryV2> {
    final /* synthetic */ List<Integer> $mDialIds;
    final /* synthetic */ PayDialRecordingFragment this$0;

    public PayDialRecordingFragment$recordingVIPFree$1$mAdapter$1(PayDialRecordingFragment r1, List<Integer> r2, Context r3, List<WatchFaceCategoryV2> r4) {
        this.this$0 = r1;
        this.$mDialIds = r2;
        super(r3, R.layout.item_dial_f3_v2, r4);
    }

    public static /* synthetic */ void OXO1(PayDialRecordingFragment r0, WatchFaceCategoryV2 r1, View r2) {
        convert$lambda$0$1(r0, r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(PayDialRecordingFragment r0, WatchFaceCategoryV2 r1, View r2) {
        convert$lambda$0$0(r0, r1, r2);
    }

    private static final void convert$lambda$0$0(PayDialRecordingFragment r3, WatchFaceCategoryV2 r4, View r5) {
        String r6 = r4.getPreviewUrl();
        int r0 = r4.getId();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r6);
        r1.putInt("mArg1", r0);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r4);
        Intent r7 = new Intent(r3.getActivity(), WatchFaceDialPayDetailActivity.class);
        r7.putExtras(r1);
        r3.startActivity(r7);
    }

    private static final void convert$lambda$0$1(PayDialRecordingFragment r3, WatchFaceCategoryV2 r4, View r5) {
        String r6 = r4.getPreviewUrl();
        int r0 = r4.getId();
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r6);
        r1.putInt("mArg1", r0);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", r4);
        Intent r7 = new Intent(r3.getActivity(), WatchFaceDialPayDetailActivity.class);
        r7.putExtras(r1);
        r3.startActivity(r7);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, WatchFaceCategoryV2 r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r18, final WatchFaceCategoryV2 r19, int r20) {
        Intrinsics.X0O(r18, "viewHolder");
        Intrinsics.X0O(r19, MapController.ITEM_LAYER_TAG);
        Context r3 = this.this$0.getContext();
        if (r3 == null) goto L15;
        List<Integer> r4 = this.$mDialIds;
        final PayDialRecordingFragment r5 = this.this$0;
        Glide.with(r3).load(r19.getPreviewUrl()).into((ImageView) r18.getView(R.id.iv));
        ProgressButtonV2 r8 = (ProgressButtonV2) r18.getView(R.id.pb);
        if (r4.contains(Integer.valueOf(r19.getId())) == false) goto L8;
        Intrinsics.XXI(r8);
        ProgressButtonV2.IiI10X(r8, R.string.synced, true, 0, false, R.color.order_text_orange, null, 44, null);
    L13:
        r18.setOnClickListener(R.id.iv, new ep1(r5, r19));
        r18.setOnClickListener(R.id.pb, new fp1(r5, r19));
        return;
    L8:
        if (r19.getLimitFreeFlag() == false) goto L11;
        r8.setDrawablesLift(R.drawable.limited_time_icon);
        Intrinsics.XXI(r8);
        ProgressButtonV2.IiI10X(r8, R.string.free_order_amount, false, 1, false, R.color.order_text_orange, null, 34, null);
        goto L13
    L11:
        if (Intrinsics.XOO0ii0(r19.getMemberAttr(), "1") == false) goto L13;
        r8.setDrawablesLift(R.drawable.memberattr_vip_icon);
        Intrinsics.XXI(r8);
        ProgressButtonV2.IiI10X(r8, R.string.dial_vip_exclusive, false, 1, false, R.color.order_text_orange, null, 34, null);
        goto L13
    }
}
