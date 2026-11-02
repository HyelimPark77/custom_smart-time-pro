package com.sma.smartv3.p610ui.device.item;

import android.content.Context;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameStoreItem extends BaseDslItem {

    @tb1
    private ImageView itemGameImg;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        this.itemGameImg = itemHolder.img(R.id.game_store_icon);
    }

    @tb1
    public final ImageView getItemGameImg() {
        return this.itemGameImg;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        ImageView imageView;
        setItemHidden(!i72.OXO1.iIIIi());
        if (getItemHidden() || (imageView = this.itemGameImg) == null) {
            return;
        }
        Intrinsics.XXI(imageView);
        Context context = imageView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        int i = UtilsKt.IXI(context) ? R.drawable.device_game_icon_entrance : R.drawable.device_game_icon_entrance_en;
        ImageView imageView2 = this.itemGameImg;
        Intrinsics.XXI(imageView2);
        RequestBuilder<GifDrawable> requestBuilderLoad = Glide.with(imageView2.getContext()).asGif().load(Integer.valueOf(i));
        ImageView imageView3 = this.itemGameImg;
        Intrinsics.XXI(imageView3);
        requestBuilderLoad.into(imageView3);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_game_store;
    }

    public final void setItemGameImg(@tb1 ImageView imageView) {
        this.itemGameImg = imageView;
    }
}
