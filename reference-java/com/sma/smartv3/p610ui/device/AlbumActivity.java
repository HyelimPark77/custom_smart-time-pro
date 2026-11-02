package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iO0O1OIIi;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.recycler.BaseRecyclerActivity;
import com.blankj.utilcode.util.ScreenUtils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.p610ui.device.AlbumActivity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n87#2,7:59\n94#2,3:67\n70#2,7:70\n97#2:77\n1#3:66\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/sma/smartv3/ui/device/AlbumActivity\n*L\n40#1:59,7\n40#1:67,3\n40#1:70,7\n40#1:77\n40#1:66\n*E\n"})
public final class AlbumActivity extends BaseRecyclerActivity<Uri> {
    private final int mItemWidth = ScreenUtils.getAppScreenWidth() / 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$0$0(AlbumActivity albumActivity, int i, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", i);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(albumActivity, (Class<?>) GalleryActivity.class);
        intent.putExtras(bundle);
        albumActivity.startActivity(intent);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<Uri> initList() {
        return iO0O1OIIi.OXO1();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.album);
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMContext(), 3));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_photo;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_album;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.ag3
    public void initItem(@aa1 ViewHolder holder, @aa1 Uri item, final int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ImageView imageView = (ImageView) holder.getView(R.id.f51417iv);
        Intrinsics.XXI(imageView);
        int i2 = this.mItemWidth;
        LibExKt.i100IXOX(imageView, i2, i2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XI0OI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumActivity.initItem$lambda$0$0(this.f4431IO, i, view);
            }
        });
        Glide.with((FragmentActivity) this).load(item).override(100, 100).into(imageView);
    }
}
