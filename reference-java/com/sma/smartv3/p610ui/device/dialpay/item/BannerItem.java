package com.sma.smartv3.p610ui.device.dialpay.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.o91;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.model.WatchFaceBanner;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.p610ui.device.dialpay.DialMoveActivity;
import com.sma.smartv3.p610ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.p610ui.device.dialpay.item.BannerItem;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BannerViewHolder(@aa1 @o91 ImageAdapter imageAdapter, ImageView imageView) {
                super(imageView);
                Intrinsics.X0O(imageView, "imageView");
                this.this$0 = imageAdapter;
                this.imageView = imageView;
            }

            @aa1
            public final ImageView getImageView() {
                return this.imageView;
            }

            public final void setImageView(@aa1 ImageView imageView) {
                Intrinsics.X0O(imageView, "<set-?>");
                this.imageView = imageView;
            }
        }

        public ImageAdapter(@tb1 List<WatchFaceBanner> list) {
            super(list);
        }

        @Override // com.youth.banner.holder.IViewHolder
        public void onBindView(@tb1 BannerViewHolder bannerViewHolder, @tb1 WatchFaceBanner watchFaceBanner, int i, int i2) {
            if ((bannerViewHolder != null ? bannerViewHolder.getImageView() : null) != null) {
                Glide.with(bannerViewHolder.getImageView().getContext()).load(watchFaceBanner != null ? watchFaceBanner.getSlidePath() : null).into(bannerViewHolder.getImageView());
            }
        }

        @Override // com.youth.banner.holder.IViewHolder
        @aa1
        public BannerViewHolder onCreateHolder(@aa1 ViewGroup parent, int i) {
            Intrinsics.X0O(parent, "parent");
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return new BannerViewHolder(this, imageView);
        }
    }

    public BannerItem(@aa1 List<WatchFaceBanner> mBannerList) {
        Intrinsics.X0O(mBannerList, "mBannerList");
        this.mBannerList = mBannerList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(BannerItem bannerItem, WatchFaceBanner watchFaceBanner, int i) {
        Collection collectionM39402iI;
        String slideType = watchFaceBanner.getSlideType();
        int iHashCode = slideType.hashCode();
        OnlineWatchFaceV2 onlineWatchFaceV2 = null;
        if (iHashCode == -1898886909) {
            if (slideType.equals("Points")) {
                Intent intent = new Intent(bannerItem.getMBanner().getContext(), (Class<?>) GoogleWebViewActivity.class);
                intent.putExtra("mArg0", OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null));
                intent.putExtra("mArg1", 2);
                bannerItem.getMBanner().getContext().startActivity(intent);
                return;
            }
            return;
        }
        if (iHashCode != 1176599814) {
            if (iHashCode == 1722888108 && slideType.equals("WatchFace")) {
                Intent intent2 = new Intent(bannerItem.getMBanner().getContext(), (Class<?>) WatchFaceDialPayDetailActivity.class);
                intent2.putExtra("mArg1", watchFaceBanner.getSlideEleId());
                bannerItem.getMBanner().getContext().startActivity(intent2);
                return;
            }
            return;
        }
        if (slideType.equals("WatchFaceType")) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.Xii11I)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    collectionM39402iI.add(new Gson().fromJson(it.next(), OnlineWatchFaceV2.class));
                }
            } catch (Exception unused) {
                collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            List listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
            if (listOO0Oi10 == null) {
                return;
            }
            List<OnlineWatchFaceV2> list = listOO0Oi10;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            for (OnlineWatchFaceV2 onlineWatchFaceV3 : list) {
                if (Integer.parseInt(onlineWatchFaceV3.getTypeId()) == watchFaceBanner.getSlideEleId()) {
                    onlineWatchFaceV2 = onlineWatchFaceV3;
                }
                arrayList.add(Unit.OXO1);
            }
            if (onlineWatchFaceV2 != null) {
                SPUtils sPUtilsM1440iO = a01.OXO1.m1440iO();
                WatchFaceCategoryV2[] watchFaceList = onlineWatchFaceV2.getWatchFaceList();
                Intrinsics.XXI(watchFaceList);
                sPUtilsM1440iO.put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(ArraysKt___ArraysKt.XOO0XX(watchFaceList).toArray(new WatchFaceCategoryV2[0])), false);
                Intent intent3 = new Intent(bannerItem.getMBanner().getContext(), (Class<?>) DialMoveActivity.class);
                intent3.putExtra("mArg0", onlineWatchFaceV2.getTypeName());
                intent3.putExtra("mArg1", watchFaceBanner.getSlideEleId());
                bannerItem.getMBanner().getContext().startActivity(intent3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(Banner banner) {
        if (banner.getWidth() > 0) {
            banner.getLayoutParams().height = (int) (banner.getWidth() / 1.875f);
            banner.requestLayout();
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.banner);
        Intrinsics.XXI(viewM3483v);
        setMBanner((Banner) viewM3483v);
        Context context = getMBanner().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        List<WatchFaceBanner> list = this.mBannerList;
        if (list == null || list.size() <= 0) {
            return;
        }
        getMBanner().setAdapter(new ImageAdapter(this.mBannerList)).setIndicator(new CircleIndicator(getMContext()));
        getMBanner().setOnBannerListener(new OnBannerListener() { // from class: com.android.mltcode.paycertificationapi.I1iXI00
            @Override // com.youth.banner.listener.OnBannerListener
            public final void OnBannerClick(Object obj, int i) {
                BannerItem.bindView$lambda$0(this.OXO1, (WatchFaceBanner) obj, i);
            }
        });
        getMBanner().start();
    }

    @aa1
    public final Banner<WatchFaceBanner, ImageAdapter> getMBanner() {
        Banner<WatchFaceBanner, ImageAdapter> banner = this.mBanner;
        if (banner != null) {
            return banner;
        }
        Intrinsics.XXO("mBanner");
        return null;
    }

    @aa1
    public final List<WatchFaceBanner> getMBannerList() {
        return this.mBannerList;
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        final Banner<WatchFaceBanner, ImageAdapter> mBanner = getMBanner();
        if (mBanner != null) {
            mBanner.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i0XIiOI
                @Override // java.lang.Runnable
                public final void run() {
                    BannerItem.initView$lambda$0$0(mBanner);
                }
            });
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.layout_online_watchface_banner_head;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void onDetach(@aa1 DslViewHolder itemHolder, int i) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        super.onDetach(itemHolder, i);
        List<WatchFaceBanner> list = this.mBannerList;
        if (list == null || list.size() <= 0) {
            return;
        }
        getMBanner().stop();
    }

    public final void setMBanner(@aa1 Banner<WatchFaceBanner, ImageAdapter> banner) {
        Intrinsics.X0O(banner, "<set-?>");
        this.mBanner = banner;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }
}
