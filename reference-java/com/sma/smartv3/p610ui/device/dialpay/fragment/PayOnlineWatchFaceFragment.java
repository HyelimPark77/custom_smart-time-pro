package com.sma.smartv3.p610ui.device.dialpay.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragmentKt;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.model.WatchFaceBanner;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.p610ui.device.dial.DialPickerPopup;
import com.sma.smartv3.p610ui.device.dialpay.DialMoveActivity;
import com.sma.smartv3.p610ui.device.dialpay.DialMoveV2Activity;
import com.sma.smartv3.p610ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayOnlineWatchFaceFragment;
import com.sma.smartv3.p610ui.device.dialpay.item.BannerItem;
import com.sma.smartv3.p610ui.device.dialpay.item.DialClassItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
import com.sma.smartv3.view.SquareImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayOnlineWatchFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n50#2,3:239\n53#2:245\n55#2,2:247\n85#2,3:249\n50#2,3:290\n53#2:296\n55#2,2:298\n50#2,3:300\n53#2:306\n55#2,2:308\n1563#3:242\n1634#3,2:243\n1636#3:246\n1563#3:293\n1634#3,2:294\n1636#3:297\n1563#3:303\n1634#3,2:304\n1636#3:307\n1563#3:310\n1634#3,3:311\n99#4,7:252\n106#4,3:260\n79#4,7:263\n109#4:270\n99#4,7:271\n106#4,3:279\n79#4,7:282\n109#4:289\n99#4,7:314\n106#4,3:322\n79#4,7:325\n109#4:332\n1#5:259\n1#5:278\n1#5:321\n*S KotlinDebug\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n*L\n67#1:239,3\n67#1:245\n67#1:247,2\n155#1:249,3\n96#1:290,3\n96#1:296\n96#1:298,2\n113#1:300,3\n113#1:306\n113#1:308,2\n67#1:242\n67#1:243,2\n67#1:246\n96#1:293\n96#1:294,2\n96#1:297\n113#1:303\n113#1:304,2\n113#1:307\n130#1:310\n130#1:311,3\n156#1:252,7\n156#1:260,3\n156#1:263,7\n156#1:270\n159#1:271,7\n159#1:279,3\n159#1:282,7\n159#1:289\n226#1:314,7\n226#1:322,3\n226#1:325,7\n226#1:332\n156#1:259\n159#1:278\n226#1:321\n*E\n"})
public final class PayOnlineWatchFaceFragment extends BaseDSLRecyclerFragment {

    @tb1
    private DialPickerPopup dialPickerPopup;

    @aa1
    private List<WatchFaceBanner> mBannerList;

    @tb1
    private List<OnlineWatchFaceV2> mWatchFaceList;

    @aa1
    private final String TAG = "PayOnlineWatchFaceFragment";

    @aa1
    private final Lazy emptyView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zp1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PayOnlineWatchFaceFragment.emptyView_delegate$lambda$0(this.f12663IO);
        }
    });

    public static final class OXO1 implements DialClassItem.OXO1 {
        public final /* synthetic */ List<OnlineWatchFaceV2> OXO1;
        public final /* synthetic */ PayOnlineWatchFaceFragment XIi00iiXO;

        public OXO1(List<OnlineWatchFaceV2> list, PayOnlineWatchFaceFragment payOnlineWatchFaceFragment) {
            this.OXO1 = list;
            this.XIi00iiXO = payOnlineWatchFaceFragment;
        }

        @Override // com.sma.smartv3.ui.device.dialpay.item.DialClassItem.OXO1
        public void OXO1(int i) {
            OnlineWatchFaceV2 onlineWatchFaceV2 = this.OXO1.get(i);
            this.XIi00iiXO.onClickMove(onlineWatchFaceV2, onlineWatchFaceV2.getTypeName(), onlineWatchFaceV2.getTypeId());
        }
    }

    public PayOnlineWatchFaceFragment() {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.i11I)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), WatchFaceBanner.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        this.mBannerList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView emptyView_delegate$lambda$0(PayOnlineWatchFaceFragment payOnlineWatchFaceFragment) {
        return (TextView) payOnlineWatchFaceFragment.getMView().findViewById(R.id.empty_view);
    }

    private final void findData(final List<OnlineWatchFaceV2> list) {
        DslAdapterExKt.X0O(getDslAdapter(), new BannerItem(this.mBannerList), new Function1() { // from class: com.android.mltcode.paycertificationapi.vp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.findData$lambda$0((BannerItem) obj);
            }
        });
        DslAdapterExKt.X0O(getDslAdapter(), new DialClassItem(list), new Function1() { // from class: com.android.mltcode.paycertificationapi.wp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.findData$lambda$1(list, this, (DialClassItem) obj);
            }
        });
        i1O0OXO1O.OXO1.OXO1(this.TAG + " listSize = " + list.size());
        for (final OnlineWatchFaceV2 onlineWatchFaceV2 : list) {
            WatchFaceCategoryV2[] watchFaceList = onlineWatchFaceV2.getWatchFaceList();
            Boolean boolValueOf = watchFaceList != null ? Boolean.valueOf(!(watchFaceList.length == 0)) : null;
            Intrinsics.XXI(boolValueOf);
            if (boolValueOf.booleanValue()) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.layout_online_watchface_category_head, new Function1() { // from class: com.android.mltcode.paycertificationapi.xp1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return PayOnlineWatchFaceFragment.findData$lambda$2(onlineWatchFaceV2, this, (DslAdapterItem) obj);
                    }
                });
            }
            for (final WatchFaceCategoryV2 watchFaceCategoryV2 : ArraysKt___ArraysKt.XXiO0(onlineWatchFaceV2.getWatchFaceList(), 6)) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_dial_f3_v2, new Function1() { // from class: com.android.mltcode.paycertificationapi.yp1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return PayOnlineWatchFaceFragment.findData$lambda$3(onlineWatchFaceV2, watchFaceCategoryV2, this, (DslAdapterItem) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0(BannerItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$1(List list, PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, DialClassItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        dslItem.setOnItemClickListener(new OXO1(list, payOnlineWatchFaceFragment));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$2(final OnlineWatchFaceV2 onlineWatchFaceV2, final PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(onlineWatchFaceV2.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.qp1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PayOnlineWatchFaceFragment.findData$lambda$2$0(onlineWatchFaceV2, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(onlineWatchFaceV2.getTypeName());
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.rp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.findData$lambda$2$1(this.f10867IO, onlineWatchFaceV2, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$2$0(OnlineWatchFaceV2 onlineWatchFaceV2, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(onlineWatchFaceV2.getTypeName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.watchface_more_tv);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setVisibility(4);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$2$1(PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, OnlineWatchFaceV2 onlineWatchFaceV2, View it) {
        Intrinsics.X0O(it, "it");
        payOnlineWatchFaceFragment.onClickMove(onlineWatchFaceV2, onlineWatchFaceV2.getTypeName(), onlineWatchFaceV2.getTypeId());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$3(OnlineWatchFaceV2 onlineWatchFaceV2, final WatchFaceCategoryV2 watchFaceCategoryV2, final PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(onlineWatchFaceV2.getTypeName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.aq1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PayOnlineWatchFaceFragment.findData$lambda$3$0(watchFaceCategoryV2, payOnlineWatchFaceFragment, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.bq1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.findData$lambda$3$1(this.f5786IO, watchFaceCategoryV2, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$3$0(WatchFaceCategoryV2 watchFaceCategoryV2, PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List payloads) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(payloads, "payloads");
        View viewM3483v = itemHolder.m3483v(R.id.f51421pb);
        Intrinsics.XXI(viewM3483v);
        ProgressButtonV2 progressButtonV2 = (ProgressButtonV2) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.f51417iv);
        Intrinsics.XXI(viewM3483v2);
        SquareImageView squareImageView = (SquareImageView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.item_dial_new_ll);
        if (viewM3483v3 != null) {
            viewM3483v3.setVisibility((watchFaceCategoryV2.getNewFlag() && i72.OXO1.X1i()) ? 0 : 8);
        }
        Glide.with(payOnlineWatchFaceFragment.requireContext()).load(watchFaceCategoryV2.getPreviewUrl()).into(squareImageView);
        XXiO.IiI10X(progressButtonV2, watchFaceCategoryV2.getDollar(), watchFaceCategoryV2.getAmount(), watchFaceCategoryV2.getDollarDis(), watchFaceCategoryV2.getAmountDis(), watchFaceCategoryV2.getLimitFreeFlag(), watchFaceCategoryV2.getMemberAttr(), watchFaceCategoryV2.getPayStatus());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$3$1(PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, WatchFaceCategoryV2 watchFaceCategoryV2, View it) {
        Intrinsics.X0O(it, "it");
        String previewUrl = watchFaceCategoryV2.getPreviewUrl();
        int id = watchFaceCategoryV2.getId();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", previewUrl);
        bundle.putInt("mArg1", id);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", watchFaceCategoryV2);
        Intent intent = new Intent(payOnlineWatchFaceFragment.getActivity(), (Class<?>) WatchFaceDialPayDetailActivity.class);
        intent.putExtras(bundle);
        payOnlineWatchFaceFragment.startActivity(intent);
        return Unit.OXO1;
    }

    private final TextView getEmptyView() {
        return (TextView) this.emptyView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWatchFaceList$lambda$0(PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, boolean z) {
        Collection collectionM39402iI;
        if (z) {
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
            payOnlineWatchFaceFragment.mWatchFaceList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        }
        payOnlineWatchFaceFragment.initData();
        return Unit.OXO1;
    }

    private final void initData() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.op1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.initData$lambda$0(this.f10189IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$0(final PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        payOnlineWatchFaceFragment.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.up1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return PayOnlineWatchFaceFragment.initData$lambda$0$0(this.f11543IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$0$0(final PayOnlineWatchFaceFragment payOnlineWatchFaceFragment) {
        payOnlineWatchFaceFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.pp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.initData$lambda$0$0$0(this.f10414IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$0$0$0(PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        List<OnlineWatchFaceV2> list = payOnlineWatchFaceFragment.mWatchFaceList;
        if (list == null || (list != null && list.size() == 0)) {
            payOnlineWatchFaceFragment.getRecyclerView().setVisibility(8);
            payOnlineWatchFaceFragment.getEmptyView().setVisibility(0);
        } else {
            List<OnlineWatchFaceV2> list2 = payOnlineWatchFaceFragment.mWatchFaceList;
            boolean z = true;
            if (list2 != null) {
                List<OnlineWatchFaceV2> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    WatchFaceCategoryV2[] watchFaceList = ((OnlineWatchFaceV2) it.next()).getWatchFaceList();
                    Integer numValueOf = watchFaceList != null ? Integer.valueOf(watchFaceList.length) : null;
                    Intrinsics.XXI(numValueOf);
                    if (numValueOf.intValue() > 0) {
                        z = false;
                    }
                    arrayList.add(Unit.OXO1);
                }
            }
            if (z) {
                payOnlineWatchFaceFragment.getRecyclerView().setVisibility(8);
                payOnlineWatchFaceFragment.getEmptyView().setVisibility(0);
            } else {
                payOnlineWatchFaceFragment.getRecyclerView().setVisibility(0);
                payOnlineWatchFaceFragment.getEmptyView().setVisibility(8);
                List<OnlineWatchFaceV2> list4 = payOnlineWatchFaceFragment.mWatchFaceList;
                Intrinsics.XXI(list4);
                payOnlineWatchFaceFragment.findData(list4);
            }
            i1O0OXO1O.OXO1.OXO1(payOnlineWatchFaceFragment.TAG + " isEmptyData = " + z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickMove(OnlineWatchFaceV2 onlineWatchFaceV2, String str, String str2) {
        if (!Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(str2).toString(), "1")) {
            int i = Integer.parseInt(str2);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", str);
            bundle.putInt("mArg1", i);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(getActivity(), (Class<?>) DialMoveV2Activity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            return;
        }
        a01.OXO1.m1440iO().put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(onlineWatchFaceV2.getWatchFaceList()), false);
        int i2 = Integer.parseInt(onlineWatchFaceV2.getTypeId());
        Bundle bundle2 = new Bundle();
        bundle2.putString("mArg0", str);
        bundle2.putInt("mArg1", i2);
        bundle2.putParcelable("mArg2", null);
        bundle2.putSerializable("mArg3", null);
        Intent intent2 = new Intent(getActivity(), (Class<?>) DialMoveActivity.class);
        intent2.putExtras(bundle2);
        startActivity(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$1(DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$2(PayOnlineWatchFaceFragment payOnlineWatchFaceFragment, boolean z) {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.i11I)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), WatchFaceBanner.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        payOnlineWatchFaceFragment.mBannerList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        payOnlineWatchFaceFragment.getDslAdapter().notifyItemChanged(0);
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final void getWatchFaceList() {
        WatchFaceManager watchFaceManager = WatchFaceManager.OXO1;
        Activity mActivity = getMActivity();
        Intrinsics.X1ii(mActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        WatchFaceManager.m38118iO(watchFaceManager, false, (AppCompatActivity) mActivity, new Function1() { // from class: com.android.mltcode.paycertificationapi.cq1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.getWatchFaceList$lambda$0(this.f6029IO, ((Boolean) obj).booleanValue());
            }
        }, 1, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_online_watchface_2;
    }

    @sf5(tag = I01XX0.XIIO11I)
    public final void onChangedData(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getDslAdapter().clearAllItems();
        getWatchFaceList();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), 3);
        getRecyclerView().setLayoutManager(gridLayoutManager);
        gridLayoutManager.setSpanSizeLookup(BaseDSLRecyclerFragmentKt.XIi00iiXO(gridLayoutManager, getDslAdapter()));
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.sp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.onInitBaseLayoutAfter$lambda$1((DslAdapter) obj);
            }
        });
        getWatchFaceList();
        WatchFaceManager.OXO1.I0IIOi(new Function1() { // from class: com.android.mltcode.paycertificationapi.tp1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineWatchFaceFragment.onInitBaseLayoutAfter$lambda$2(this.f11325IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDslAdapter().notifyDataChanged();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.recycler_view;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }
}
