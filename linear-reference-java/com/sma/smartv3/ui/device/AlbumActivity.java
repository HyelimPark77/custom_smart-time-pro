package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.XI0OI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO0O1OIIi;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.LibExKt;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.recycler.BaseRecyclerActivity;
import com.blankj.utilcode.util.ScreenUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n87#2,7:59\n94#2,3:67\n70#2,7:70\n97#2:77\n1#3:66\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n*L\n40#1:59,7\n40#1:67,3\n40#1:70,7\n40#1:77\n40#1:66\n*E\n"})
public final class AlbumActivity extends BaseRecyclerActivity<Uri> {
    private final int mItemWidth;

    public AlbumActivity() {
        this.mItemWidth = ScreenUtils.getAppScreenWidth() / 3;
    }

    public static /* synthetic */ void OIX0iXi(AlbumActivity r0, int r1, View r2) {
        initItem$lambda$0$0(r0, r1, r2);
    }

    private static final void initItem$lambda$0$0(AlbumActivity r2, int r3, View r4) {
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", r3);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r6 = new Intent(r2, GalleryActivity.class);
        r6.putExtras(r5);
        r2.startActivity(r6);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.ag3
    public /* bridge */ /* synthetic */ void initItem(ViewHolder r1, Object r2, int r3) {
        initItem(r1, (Uri) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<Uri> initList() {
        return iO0O1OIIi.OXO1();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.album);
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMContext(), 3));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_photo;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_album;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void initItem(@aa1 ViewHolder r2, @aa1 Uri r3, final int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        ImageView r5 = (ImageView) r2.getView(R.id.iv);
        Intrinsics.XXI(r5);
        int r0 = this.mItemWidth;
        LibExKt.i100IXOX(r5, r0, r0);
        r5.setOnClickListener(new XI0OI(this, r4));
        Glide.with(this).load(r3).override(100, 100).into(r5);
    }
}
