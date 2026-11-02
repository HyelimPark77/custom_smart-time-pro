package com.sma.smartv3.ui.device.dialpay.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.cp1;
import com.android.mltcode.paycertificationapi.dp1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bumptech.glide.Glide;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayDialRecordingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n99#2,7:211\n106#2,3:219\n79#2,7:222\n109#2:229\n99#2,7:230\n106#2,3:238\n79#2,7:241\n109#2:248\n1#3:218\n1#3:237\n*S KotlinDebug\n*F\n+ 1 PayDialRecordingFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1\n*L\n109#1:211,7\n109#1:219,3\n109#1:222,7\n109#1:229\n112#1:230,7\n112#1:238,3\n112#1:241,7\n112#1:248\n109#1:218\n112#1:237\n*E\n"})
public final class PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1 extends CommonAdapter<WatchFaceCategoryV2> {
    final /* synthetic */ PayDialRecordingFragment this$0;

    public PayDialRecordingFragment$recordingPurchaseHistory$1$mAdapter$1(PayDialRecordingFragment r1, Context r2, List<WatchFaceCategoryV2> r3) {
        this.this$0 = r1;
        super(r2, R.layout.item_dial_f3_v3, r3);
    }

    public static /* synthetic */ void OXO1(PayDialRecordingFragment r0, WatchFaceCategoryV2 r1, View r2) {
        convert$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void XIi00iiXO(PayDialRecordingFragment r0, WatchFaceCategoryV2 r1, View r2) {
        convert$lambda$0$1(r0, r1, r2);
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
    public void convert2(ViewHolder r7, final WatchFaceCategoryV2 r8, int r9) {
        Intrinsics.X0O(r7, "viewHolder");
        Intrinsics.X0O(r8, MapController.ITEM_LAYER_TAG);
        Context r10 = this.this$0.getContext();
        if (r10 == null) goto L6;
        final PayDialRecordingFragment r0 = this.this$0;
        Glide.with(r10).load(r8.getPreviewUrl()).into((ImageView) r7.getView(R.id.iv));
        ((TextView) r7.getView(R.id.pb)).setText(XXiO.iO(r8.getAmount(), null, 2, null));
        r7.setOnClickListener(R.id.iv, new cp1(r0, r8));
        r7.setOnClickListener(R.id.pb, new dp1(r0, r8));
        return;
    }
}
