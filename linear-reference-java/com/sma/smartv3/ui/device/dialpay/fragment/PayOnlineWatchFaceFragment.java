package com.sma.smartv3.ui.device.dialpay.fragment;

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
import com.android.mltcode.paycertificationapi.aq1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bq1;
import com.android.mltcode.paycertificationapi.cq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.op1;
import com.android.mltcode.paycertificationapi.pp1;
import com.android.mltcode.paycertificationapi.qp1;
import com.android.mltcode.paycertificationapi.rp1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sp1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tp1;
import com.android.mltcode.paycertificationapi.up1;
import com.android.mltcode.paycertificationapi.vp1;
import com.android.mltcode.paycertificationapi.wp1;
import com.android.mltcode.paycertificationapi.xp1;
import com.android.mltcode.paycertificationapi.yp1;
import com.android.mltcode.paycertificationapi.zp1;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.DialPickerPopup;
import com.sma.smartv3.ui.device.dialpay.DialMoveActivity;
import com.sma.smartv3.ui.device.dialpay.DialMoveV2Activity;
import com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivity;
import com.sma.smartv3.ui.device.dialpay.item.BannerItem;
import com.sma.smartv3.ui.device.dialpay.item.DialClassItem;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayOnlineWatchFaceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n50#2,3:239\n53#2:245\n55#2,2:247\n85#2,3:249\n50#2,3:290\n53#2:296\n55#2,2:298\n50#2,3:300\n53#2:306\n55#2,2:308\n1563#3:242\n1634#3,2:243\n1636#3:246\n1563#3:293\n1634#3,2:294\n1636#3:297\n1563#3:303\n1634#3,2:304\n1636#3:307\n1563#3:310\n1634#3,3:311\n99#4,7:252\n106#4,3:260\n79#4,7:263\n109#4:270\n99#4,7:271\n106#4,3:279\n79#4,7:282\n109#4:289\n99#4,7:314\n106#4,3:322\n79#4,7:325\n109#4:332\n1#5:259\n1#5:278\n1#5:321\n*S KotlinDebug\n*F\n+ 1 PayOnlineWatchFaceFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineWatchFaceFragment\n*L\n67#1:239,3\n67#1:245\n67#1:247,2\n155#1:249,3\n96#1:290,3\n96#1:296\n96#1:298,2\n113#1:300,3\n113#1:306\n113#1:308,2\n67#1:242\n67#1:243,2\n67#1:246\n96#1:293\n96#1:294,2\n96#1:297\n113#1:303\n113#1:304,2\n113#1:307\n130#1:310\n130#1:311,3\n156#1:252,7\n156#1:260,3\n156#1:263,7\n156#1:270\n159#1:271,7\n159#1:279,3\n159#1:282,7\n159#1:289\n226#1:314,7\n226#1:322,3\n226#1:325,7\n226#1:332\n156#1:259\n159#1:278\n226#1:321\n*E\n"})
public final class PayOnlineWatchFaceFragment extends BaseDSLRecyclerFragment {

    @aa1
    private final String TAG;

    @tb1
    private DialPickerPopup dialPickerPopup;

    @aa1
    private final Lazy emptyView$delegate;

    @aa1
    private List<WatchFaceBanner> mBannerList;

    @tb1
    private List<OnlineWatchFaceV2> mWatchFaceList;

    public static final class OXO1 implements DialClassItem.OXO1 {
        public final /* synthetic */ List<OnlineWatchFaceV2> OXO1;
        public final /* synthetic */ PayOnlineWatchFaceFragment XIi00iiXO;

        public OXO1(List<OnlineWatchFaceV2> r1, PayOnlineWatchFaceFragment r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.sma.smartv3.ui.device.dialpay.item.DialClassItem.OXO1
        public void OXO1(int r4) {
            OnlineWatchFaceV2 r5 = this.OXO1.get(r4);
            PayOnlineWatchFaceFragment.access$onClickMove(this.XIi00iiXO, r5, r5.getTypeName(), r5.getTypeId());
        }
    }

    public PayOnlineWatchFaceFragment() {
        this.TAG = "PayOnlineWatchFaceFragment";
        this.emptyView$delegate = LazyKt__LazyJVMKt.iO(new zp1(this));
        JsonArray r0 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.i11I)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r0);     // Catch: Exception -> L8
        Collection r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r2 = r0.iterator();     // Catch: Exception -> L8
    L5:
        if (r2.hasNext() == false) goto L9;
        JsonElement r3 = r2.next();     // Catch: Exception -> L8
        r1.add(new Gson().fromJson(r3, WatchFaceBanner.class));     // Catch: Exception -> L8
    L9:
        this.mBannerList = CollectionsKt___CollectionsKt.OO0Oi10(r1);
        return;
    L8:
        r1 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    public static /* synthetic */ Unit I0IIOi(PayOnlineWatchFaceFragment r0, boolean r1) {
        return getWatchFaceList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I0iXXO(WatchFaceCategoryV2 r0, PayOnlineWatchFaceFragment r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return findData$lambda$3$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit I1XOi1(PayOnlineWatchFaceFragment r0, DslAdapter r1) {
        return initData$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IO(List r0, PayOnlineWatchFaceFragment r1, DialClassItem r2) {
        return findData$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit IiI10X(OnlineWatchFaceV2 r0, WatchFaceCategoryV2 r1, PayOnlineWatchFaceFragment r2, DslAdapterItem r3) {
        return findData$lambda$3(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit O00(BannerItem r0) {
        return findData$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(PayOnlineWatchFaceFragment r0) {
        return emptyView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(OnlineWatchFaceV2 r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return findData$lambda$2$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit OIi0(PayOnlineWatchFaceFragment r0, DslAdapter r1) {
        return initData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(PayOnlineWatchFaceFragment r0) {
        return initData$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit X1ii(PayOnlineWatchFaceFragment r0, boolean r1) {
        return onInitBaseLayoutAfter$lambda$2(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(PayOnlineWatchFaceFragment r0, WatchFaceCategoryV2 r1, View r2) {
        return findData$lambda$3$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit XOO0ii0(OnlineWatchFaceV2 r0, PayOnlineWatchFaceFragment r1, DslAdapterItem r2) {
        return findData$lambda$2(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXI(DslAdapter r0) {
        return onInitBaseLayoutAfter$lambda$1(r0);
    }

    public static final /* synthetic */ void access$onClickMove(PayOnlineWatchFaceFragment r0, OnlineWatchFaceV2 r1, String r2, String r3) {
        r0.onClickMove(r1, r2, r3);
    }

    private static final TextView emptyView_delegate$lambda$0(PayOnlineWatchFaceFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.empty_view);
    }

    private final void findData(final List<OnlineWatchFaceV2> r6) {
        DslAdapterExKt.X0O(getDslAdapter(), new BannerItem(this.mBannerList), new vp1());
        DslAdapterExKt.X0O(getDslAdapter(), new DialClassItem(r6), new wp1(r6, this));
        i1O0OXO1O.OXO1.OXO1(this.TAG + " listSize = " + r6.size());
        Iterator<OnlineWatchFaceV2> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L20;
        final OnlineWatchFaceV2 r0 = r7.next();
        WatchFaceCategoryV2[] r1 = r0.getWatchFaceList();
        if (r1 != null) goto L8;
        Boolean r2 = null;
    L13:
        Intrinsics.XXI(r2);
        if (r2.booleanValue() == false) goto L16;
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.layout_online_watchface_category_head, new xp1(r0, this));
    L16:
        Iterator r3 = ArraysKt___ArraysKt.XXiO0(r0.getWatchFaceList(), 6).iterator();
    L18:
        if (r3.hasNext() == false) goto L4;
        final WatchFaceCategoryV2 r4 = (WatchFaceCategoryV2) r3.next();
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_dial_f3_v2, new yp1(r0, r4, this));
        goto L18
    L8:
        if (r1.length != 0) goto L10;
        boolean r5 = true;
    L11:
        r2 = Boolean.valueOf(!r5);
        goto L13
    L10:
        r5 = false;
        goto L11
    }

    private static final Unit findData$lambda$0(BannerItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$1(List r1, PayOnlineWatchFaceFragment r2, DialClassItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemSpanCount(-1);
        r3.setOnItemClickListener(new OXO1(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$2(final OnlineWatchFaceV2 r1, final PayOnlineWatchFaceFragment r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsGroupHead(true);
        r3.setItemIsHover(false);
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r3.setItemBindOverride(new qp1(r1));
        r3.setItemTag(r1.getTypeName());
        r3.setItemClick(new rp1(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$2$0(OnlineWatchFaceV2 r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv_name);
        if (r5 == null) goto L5;
        r5.setText(r0.getTypeName());
    L5:
        TextView r6 = r1.tv(R.id.watchface_more_tv);
        if (r6 == null) goto L9;
        r6.setVisibility(4);
    L9:
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$2$1(PayOnlineWatchFaceFragment r1, OnlineWatchFaceV2 r2, View r3) {
        Intrinsics.X0O(r3, "it");
        r1.onClickMove(r2, r2.getTypeName(), r2.getTypeId());
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$3(OnlineWatchFaceV2 r1, final WatchFaceCategoryV2 r2, final PayOnlineWatchFaceFragment r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getTypeName()}));
        r4.setItemBindOverride(new aq1(r2, r3));
        r4.setItemClick(new bq1(r3, r2));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$3$0(WatchFaceCategoryV2 r8, PayOnlineWatchFaceFragment r9, DslViewHolder r10, int r11, DslAdapterItem r12, List r13) {
        Intrinsics.X0O(r10, "itemHolder");
        Intrinsics.X0O(r12, "adapterItem");
        Intrinsics.X0O(r13, "payloads");
        View r14 = r10.v(R.id.pb);
        Intrinsics.XXI(r14);
        ProgressButtonV2 r0 = (ProgressButtonV2) r14;
        View r15 = r10.v(R.id.iv);
        Intrinsics.XXI(r15);
        SquareImageView r16 = (SquareImageView) r15;
        View r17 = r10.v(R.id.item_dial_new_ll);
        if (r17 != null) goto L5;
    L11:
        Glide.with(r9.requireContext()).load(r8.getPreviewUrl()).into(r16);
        XXiO.IiI10X(r0, r8.getDollar(), r8.getAmount(), r8.getDollarDis(), r8.getAmountDis(), r8.getLimitFreeFlag(), r8.getMemberAttr(), r8.getPayStatus());
        return Unit.OXO1;
    L5:
        if (r8.getNewFlag() == true) goto L7;
    L9:
        int r18 = 8;
    L10:
        r17.setVisibility(r18);
        goto L11
    L7:
        if (i72.OXO1.X1i() == false) goto L9;
        r18 = 0;
        goto L10
    }

    private static final Unit findData$lambda$3$1(PayOnlineWatchFaceFragment r3, WatchFaceCategoryV2 r4, View r5) {
        Intrinsics.X0O(r5, "it");
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
        return Unit.OXO1;
    }

    private final TextView getEmptyView() {
        return (TextView) getValue();
    }

    private static final Unit getWatchFaceList$lambda$0(PayOnlineWatchFaceFragment r4, boolean r5) {
        if (r5 == true) goto L13;
    L11:
        r4.initData();
        return Unit.OXO1;
    L13:
        JsonArray r6 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.Xii11I)).getAsJsonArray();     // Catch: Exception -> L9
        Intrinsics.XXI(r6);     // Catch: Exception -> L9
        Collection r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L9
        Iterator<JsonElement> r7 = r6.iterator();     // Catch: Exception -> L9
    L6:
        if (r7.hasNext() == false) goto L10;
        JsonElement r1 = r7.next();     // Catch: Exception -> L9
        r0.add(new Gson().fromJson(r1, OnlineWatchFaceV2.class));     // Catch: Exception -> L9
    L10:
        r4.mWatchFaceList = CollectionsKt___CollectionsKt.OO0Oi10(r0);
    L9:
        r0 = CollectionsKt__CollectionsKt.iI();
        goto L10
    }

    public static /* synthetic */ Unit iO(PayOnlineWatchFaceFragment r0, OnlineWatchFaceV2 r1, View r2) {
        return findData$lambda$2$1(r0, r1, r2);
    }

    private final void initData() {
        renderAdapter(new op1(this));
    }

    private static final Unit initData$lambda$0(final PayOnlineWatchFaceFragment r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r3.getDslViewHolder().postDelay(300, new up1(r3));
        return Unit.OXO1;
    }

    private static final Unit initData$lambda$0$0(final PayOnlineWatchFaceFragment r1) {
        r1.renderAdapter(new pp1(r1));
        return Unit.OXO1;
    }

    private static final Unit initData$lambda$0$0$0(PayOnlineWatchFaceFragment r6, DslAdapter r7) {
        Intrinsics.X0O(r7, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r7, 0, null, 2, null);
        List<OnlineWatchFaceV2> r8 = r6.mWatchFaceList;
        if (r8 == null) goto L25;
        if (r8 != null) goto L6;
    L8:
        List<OnlineWatchFaceV2> r9 = r6.mWatchFaceList;
        boolean r3 = true;
        if (r9 == null) goto L21;
        List<OnlineWatchFaceV2> r10 = r9;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r10, 10));
        Iterator<T> r11 = r10.iterator();
    L12:
        if (r11.hasNext() == false) goto L21;
        WatchFaceCategoryV2[] r5 = ((OnlineWatchFaceV2) r11.next()).getWatchFaceList();
        if (r5 == null) goto L16;
        Integer r12 = Integer.valueOf(r5.length);
    L17:
        Intrinsics.XXI(r12);
        if (r12.intValue() <= 0) goto L20;
        r3 = false;
    L20:
        r4.add(Unit.OXO1);
        goto L12
    L16:
        r12 = null;
    L21:
        if (r3 == false) goto L23;
        r6.getRecyclerView().setVisibility(8);
        r6.getEmptyView().setVisibility(0);
    L24:
        i1O0OXO1O.OXO1.OXO1(r6.TAG + " isEmptyData = " + r3);
    L27:
        return Unit.OXO1;
    L23:
        r6.getRecyclerView().setVisibility(0);
        r6.getEmptyView().setVisibility(8);
        List<OnlineWatchFaceV2> r13 = r6.mWatchFaceList;
        Intrinsics.XXI(r13);
        r6.findData(r13);
        goto L24
    L6:
        if (r8.size() != 0) goto L8;
    L25:
        r6.getRecyclerView().setVisibility(8);
        r6.getEmptyView().setVisibility(0);
        goto L27
    }

    private final void onClickMove(OnlineWatchFaceV2 r9, String r10, String r11) {
        if (Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(r11).toString(), "1") == false) goto L6;
        a01.OXO1.iO().put(b01.i0X000X0O + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(r9.getWatchFaceList()), false);
        int r12 = Integer.parseInt(r9.getTypeId());
        Bundle r13 = new Bundle();
        r13.putString("mArg0", r10);
        r13.putInt("mArg1", r12);
        r13.putParcelable("mArg2", null);
        r13.putSerializable("mArg3", null);
        Intent r14 = new Intent(getActivity(), DialMoveActivity.class);
        r14.putExtras(r13);
        startActivity(r14);
        return;
    L6:
        int r15 = Integer.parseInt(r11);
        Bundle r16 = new Bundle();
        r16.putString("mArg0", r10);
        r16.putInt("mArg1", r15);
        r16.putParcelable("mArg2", null);
        r16.putSerializable("mArg3", null);
        Intent r17 = new Intent(getActivity(), DialMoveV2Activity.class);
        r17.putExtras(r16);
        startActivity(r17);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$1(DslAdapter r2) {
        Intrinsics.X0O(r2, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r2, 2, null, 2, null);
        return Unit.OXO1;
    }

    private static final Unit onInitBaseLayoutAfter$lambda$2(PayOnlineWatchFaceFragment r4, boolean r5) {
        JsonArray r6 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.i11I)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r6);     // Catch: Exception -> L8
        Collection r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r7 = r6.iterator();     // Catch: Exception -> L8
    L5:
        if (r7.hasNext() == false) goto L9;
        JsonElement r1 = r7.next();     // Catch: Exception -> L8
        r0.add(new Gson().fromJson(r1, WatchFaceBanner.class));     // Catch: Exception -> L8
    L9:
        r4.mBannerList = CollectionsKt___CollectionsKt.OO0Oi10(r0);
        r4.getDslAdapter().notifyItemChanged(0);
        return Unit.OXO1;
    L8:
        r0 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    public final void getWatchFaceList() {
        WatchFaceManager r0 = WatchFaceManager.OXO1;
        Activity r1 = getMActivity();
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        WatchFaceManager.iO(r0, false, (AppCompatActivity) r1, new cq1(this), 1, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_online_watchface_2;
    }

    @sf5(tag = I01XX0.XIIO11I)
    public final void onChangedData(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getDslAdapter().clearAllItems();
        getWatchFaceList();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        GridLayoutManager r0 = new GridLayoutManager(getMActivity(), 3);
        getRecyclerView().setLayoutManager(r0);
        r0.setSpanSizeLookup(BaseDSLRecyclerFragmentKt.XIi00iiXO(r0, getDslAdapter()));
        renderAdapter(new sp1());
        getWatchFaceList();
        WatchFaceManager.OXO1.I0IIOi(new tp1(this));
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
