package com.sma.smartv3.ui.device.dialpay.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I1iXI00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i0XIiOI;
import com.android.mltcode.paycertificationapi.o91;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.model.WatchFaceBanner;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dialpay.DialMoveActivity;
import com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.indicator.CircleIndicator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nBannerItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/BannerItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,149:1\n50#2,3:150\n53#2:156\n55#2,2:158\n85#2,3:166\n1563#3:153\n1634#3,2:154\n1636#3:157\n1563#3:160\n1634#3,3:161\n37#4,2:164\n*S KotlinDebug\n*F\n+ 1 BannerItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/BannerItem\n*L\n65#1:150,3\n65#1:156\n65#1:158,2\n76#1:166,3\n65#1:153\n65#1:154,2\n65#1:157\n69#1:160\n69#1:161,3\n78#1:164,2\n*E\n"})
public final class BannerItem extends BaseDslItem {
    public Banner<WatchFaceBanner, ImageAdapter> mBanner;

    @aa1
    private final List<WatchFaceBanner> mBannerList;
    public Context mContext;

    public static final class ImageAdapter extends BannerAdapter<WatchFaceBanner, BannerViewHolder> {

        public final class BannerViewHolder extends RecyclerView.ViewHolder {

            @aa1
            private ImageView imageView;
            final /* synthetic */ ImageAdapter this$0;

            public BannerViewHolder(@aa1 @o91 ImageAdapter r2, ImageView r3) {
                Intrinsics.X0O(r3, "imageView");
                this.this$0 = r2;
                super(r3);
                this.imageView = r3;
            }

            @aa1
            public final ImageView getImageView() {
                return this.imageView;
            }

            public final void setImageView(@aa1 ImageView r2) {
                Intrinsics.X0O(r2, "<set-?>");
                this.imageView = r2;
            }
        }

        public ImageAdapter(@tb1 List<WatchFaceBanner> r1) {
            super(r1);
        }

        @Override // com.youth.banner.holder.IViewHolder
        public /* bridge */ /* synthetic */ void onBindView(Object r1, Object r2, int r3, int r4) {
            onBindView((BannerViewHolder) r1, (WatchFaceBanner) r2, r3, r4);
        }

        @Override // com.youth.banner.holder.IViewHolder
        public /* bridge */ /* synthetic */ Object onCreateHolder(ViewGroup r1, int r2) {
            return onCreateHolder(r1, r2);
        }

        public void onBindView(@tb1 BannerViewHolder r1, @tb1 WatchFaceBanner r2, int r3, int r4) {
            String r5 = null;
            if (r1 == null) goto L5;
            ImageView r6 = r1.getImageView();
        L6:
            if (r6 == null) goto L12;
            RequestManager r7 = Glide.with(r1.getImageView().getContext());
            if (r2 == null) goto L10;
            r5 = r2.getSlidePath();
        L10:
            r7.load(r5).into(r1.getImageView());
            return;
        L12:
            return;
        L5:
            r6 = null;
            goto L6
        }

        @Override // com.youth.banner.holder.IViewHolder
        @aa1
        public BannerViewHolder onCreateHolder(@aa1 ViewGroup r2, int r3) {
            Intrinsics.X0O(r2, "parent");
            ImageView r4 = new ImageView(r2.getContext());
            r4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            r4.setScaleType(ImageView.ScaleType.FIT_XY);
            return new BannerViewHolder(this, r4);
        }
    }

    public BannerItem(@aa1 List<WatchFaceBanner> r2) {
        Intrinsics.X0O(r2, "mBannerList");
        this.mBannerList = r2;
    }

    public static /* synthetic */ void IiI10X(BannerItem r0, WatchFaceBanner r1, int r2) {
        bindView$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void O00(Banner r0) {
        initView$lambda$0$0(r0);
    }

    private static final void bindView$lambda$0(BannerItem r8, WatchFaceBanner r9, int r10) {
        String r11 = r9.getSlideType();
        int r0 = r11.hashCode();
        OnlineWatchFaceV2 r4 = null;
        if (r0 == (-1898886909)) goto L36;
        if (r0 == 1176599814) goto L14;
        if (r0 == 1722888108) goto L10;
        return;
    L10:
        if (r11.equals("WatchFace") == false) goto L37;
        Intent r12 = new Intent(r8.getMBanner().getContext(), WatchFaceDialPayDetailActivity.class);
        r12.putExtra("mArg1", r9.getSlideEleId());
        r8.getMBanner().getContext().startActivity(r12);
        return;
    L37:
        return;
    L14:
        if (r11.equals("WatchFaceType") == true) goto L40;
        return;
    L40:
        JsonArray r13 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.Xii11I)).getAsJsonArray();     // Catch: Exception -> L22
        Intrinsics.XXI(r13);     // Catch: Exception -> L22
        Collection r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r13, 10));     // Catch: Exception -> L22
        Iterator<JsonElement> r14 = r13.iterator();     // Catch: Exception -> L22
    L19:
        if (r14.hasNext() == false) goto L23;
        r1.add(new Gson().fromJson(r14.next(), OnlineWatchFaceV2.class));     // Catch: Exception -> L22
    L23:
        List r15 = CollectionsKt___CollectionsKt.OO0Oi10(r1);
        if (r15 == null) goto L52;
        List r16 = r15;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r16, 10));
        Iterator r17 = r16.iterator();
    L28:
        if (r17.hasNext() == false) goto L33;
        OnlineWatchFaceV2 r3 = (OnlineWatchFaceV2) r17.next();
        if (Integer.parseInt(r3.getTypeId()) != r9.getSlideEleId()) goto L32;
        r4 = r3;
    L32:
        r2.add(Unit.OXO1);
        goto L28
    L33:
        if (r4 == null) goto L47;
        SPUtils r18 = a01.OXO1.iO();
        WatchFaceCategoryV2[] r5 = r4.getWatchFaceList();
        Intrinsics.XXI(r5);
        r18.put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(ArraysKt___ArraysKt.XOO0XX(r5).toArray(new WatchFaceCategoryV2[0])), false);
        Intent r19 = new Intent(r8.getMBanner().getContext(), DialMoveActivity.class);
        r19.putExtra("mArg0", r4.getTypeName());
        r19.putExtra("mArg1", r9.getSlideEleId());
        r8.getMBanner().getContext().startActivity(r19);
        return;
    L47:
        return;
    L52:
        return;
    L22:
        r1 = CollectionsKt__CollectionsKt.iI();
        goto L23
    L36:
        if (r11.equals("Points") == false) goto L49;
        Intent r20 = new Intent(r8.getMBanner().getContext(), GoogleWebViewActivity.class);
        r20.putExtra("mArg0", OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null));
        r20.putExtra("mArg1", 2);
        r8.getMBanner().getContext().startActivity(r20);
        return;
    }

    private static final void initView$lambda$0$0(Banner r3) {
        if (r3.getWidth() <= 0) goto L6;
        r3.getLayoutParams().height = (int) (r3.getWidth() / 1.875f);
        r3.requestLayout();
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        View r4 = r3.v(R.id.banner);
        Intrinsics.XXI(r4);
        setMBanner((Banner) r4);
        Context r5 = getMBanner().getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        setMContext(r5);
        List<WatchFaceBanner> r6 = this.mBannerList;
        if (r6 != null) goto L5;
        return;
    L5:
        if (r6.size() <= 0) goto L9;
        getMBanner().setAdapter(new ImageAdapter(this.mBannerList)).setIndicator(new CircleIndicator(getMContext()));
        getMBanner().setOnBannerListener(new I1iXI00(this));
        getMBanner().start();
        return;
    }

    @aa1
    public final Banner<WatchFaceBanner, ImageAdapter> getMBanner() {
        Banner<WatchFaceBanner, ImageAdapter> r0 = this.mBanner;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mBanner");
        return null;
    }

    @aa1
    public final List<WatchFaceBanner> getMBannerList() {
        return this.mBannerList;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        final Banner<WatchFaceBanner, ImageAdapter> r0 = getMBanner();
        if (r0 == null) goto L6;
        r0.post(new i0XIiOI(r0));
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.layout_online_watchface_banner_head;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void onDetach(@aa1 DslViewHolder r2, int r3) {
        Intrinsics.X0O(r2, "itemHolder");
        super.onDetach(r2, r3);
        List<WatchFaceBanner> r4 = this.mBannerList;
        if (r4 != null) goto L5;
        return;
    L5:
        if (r4.size() <= 0) goto L9;
        getMBanner().stop();
        return;
    }

    public final void setMBanner(@aa1 Banner<WatchFaceBanner, ImageAdapter> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBanner = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }
}
