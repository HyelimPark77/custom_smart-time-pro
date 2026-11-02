package com.sma.smartv3.ui.device.item;

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

    public GameStoreItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        this.itemGameImg = r2.img(R.id.game_store_icon);
    }

    @tb1
    public final ImageView getItemGameImg() {
        return this.itemGameImg;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!i72.OXO1.iIIIi());
        if (getItemHidden() == true) goto L12;
        ImageView r0 = this.itemGameImg;
        if (r0 == null) goto L13;
        Intrinsics.XXI(r0);
        Context r1 = r0.getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        if (UtilsKt.IXI(r1) == false) goto L9;
        int r2 = R.drawable.device_game_icon_entrance;
    L10:
        ImageView r3 = this.itemGameImg;
        Intrinsics.XXI(r3);
        RequestBuilder<GifDrawable> r4 = Glide.with(r3.getContext()).asGif().load(Integer.valueOf(r2));
        ImageView r5 = this.itemGameImg;
        Intrinsics.XXI(r5);
        r4.into(r5);
        return;
    L9:
        r2 = R.drawable.device_game_icon_entrance_en;
        goto L10
    L13:
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_game_store;
    }

    public final void setItemGameImg(@tb1 ImageView r1) {
        this.itemGameImg = r1;
    }
}
