package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ab5;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bb5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ua5;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.va5;
import com.android.mltcode.paycertificationapi.wa5;
import com.android.mltcode.paycertificationapi.xa5;
import com.android.mltcode.paycertificationapi.ya5;
import com.android.mltcode.paycertificationapi.za5;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.Stock;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.StockList;
import com.sma.smartv3.network.StockRemove;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleStock;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStockMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n19#2:301\n15#2:302\n39#2,3:345\n42#2:351\n44#2,2:353\n176#3,11:303\n196#3:322\n176#3,11:323\n196#3:342\n252#4,7:314\n270#4:321\n252#4,7:334\n270#4:341\n1869#5,2:343\n1563#5:348\n1634#5,2:349\n1636#5:352\n140#6,5:355\n145#6,5:361\n69#6,3:366\n72#6,5:370\n1#7:360\n1#7:369\n*S KotlinDebug\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity\n*L\n38#1:301\n38#1:302\n273#1:345,3\n273#1:351\n273#1:353,2\n93#1:303,11\n93#1:322\n121#1:323,11\n121#1:342\n93#1:314,7\n93#1:321\n121#1:334,7\n121#1:341\n258#1:343,2\n273#1:348\n273#1:349,2\n273#1:352\n286#1:355,5\n286#1:361,5\n294#1:366,3\n294#1:370,5\n286#1:360\n294#1:369\n*E\n"})
public final class StockMarketActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int STOCK_PICKER_REQUEST = 99;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy btnBottom$delegate;

    @aa1
    private AppUser mAppUser;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final Lazy tvTip$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public StockMarketActivity() {
        this.tvTip$delegate = LazyKt__LazyJVMKt.iO(new ua5(this));
        this.btnBottom$delegate = LazyKt__LazyJVMKt.iO(new va5(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new wa5(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ Unit I0iXXO(Stock r0, StockMarketActivity r1, DslAdapterItem r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return showList$lambda$0$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ ImageView I1XOi1(StockMarketActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(List r0, StockMarketActivity r1, DslAdapter r2) {
        return showList$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ View O10IXXX0X(StockMarketActivity r0) {
        return btnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(StockMarketActivity r0) {
        return tvTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(StockMarketActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(StockMarketActivity r0, Stock r1, DslAdapterItem r2, DslViewHolder r3, View r4) {
        showList$lambda$0$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XiOIO(Stock r0, StockMarketActivity r1, DslAdapterItem r2) {
        return showList$lambda$0$0(r0, r1, r2);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(StockMarketActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(StockMarketActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ void access$showList(StockMarketActivity r0, List r1) {
        r0.showList(r1);
    }

    private static final View btnBottom_delegate$lambda$0(StockMarketActivity r1) {
        return r1.findViewById(R.id.btn_bottom);
    }

    private final void checkCount(List<Stock> r7) {
        TextView r0 = getTvTip();
        int r2 = 0;
        if (r7.isEmpty() == false) goto L5;
        int r1 = 8;
    L6:
        r0.setVisibility(r1);
        int r3 = q62.OXO1.X1OI();
        getTvTip().setText(getString(R.string.stock_max_tip, new Object[]{Integer.valueOf(r3)}));
        View r4 = getBtnBottom();
        if (r7.size() < r3) goto L10;
        r2 = 8;
    L10:
        r4.setVisibility(r2);
        return;
    L5:
        r1 = 0;
        goto L6
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final View getBtnBottom() {
        return (View) getValue();
    }

    private final TextView getTvTip() {
        return (TextView) getValue();
    }

    private final List<Stock> initList() {
        JsonArray r1 = JsonParser.parseString(a01.OXO1.IiI10X().getString(Stock.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r1);     // Catch: Exception -> L8
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r3 = r1.iterator();     // Catch: Exception -> L8
    L5:
        if (r3.hasNext() == false) goto L10;
        r2.add(new Gson().fromJson(r3.next(), Stock.class));     // Catch: Exception -> L8
    L10:
        return CollectionsKt___CollectionsKt.OO0Oi10(r2);
    L8:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L10
    }

    private static final void initView$lambda$0(StockMarketActivity r0) {
        r0.list();
    }

    private final void list() {
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getStockListBody(this.mAppUser.getIdentity());
        final O1XIiIO<Stock[]> r2 = new AnonymousClass1(this);
        final Activity r3 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockList.URL);
        r0.printParam(r5 + StockList.URL, r1);
        NetWork r6 = NetWork.OXO1;
        String r7 = r5 + StockList.URL;
        final O1XIiIO<Response<Stock[]>> r8 = new StockMarketActivity$list$$inlined$post$default$1(r3, r2, r4);
        AndroidNetworking.post(r7).addBodyParameter(r1).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Stock[].class}), new StockMarketActivity$list$$inlined$post$default$2(r8));
    }

    private final void remove(int r9) {
        if (this.mLoadingPopup != null) goto L5;
        uq r1 = new uq(getMContext());
        r1.I0iXXO(false);
        this.mLoadingPopup = r1;
    L5:
        uq r2 = this.mLoadingPopup;
        if (r2 == null) goto L8;
        r2.IIX1OXO();
    L8:
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r10 = RequestBodyKt.getStockRemoveBody(this.mAppUser.getIdentity(), r9);
        final O1XIiIO<Stock[]> r4 = new AnonymousClass2(this);
        final Activity r5 = null;
        final uq r6 = r3.loadPopup(null, null);
        String r7 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockRemove.URL);
        r3.printParam(r7 + StockRemove.URL, r10);
        NetWork r8 = NetWork.OXO1;
        String r11 = r7 + StockRemove.URL;
        final O1XIiIO<Response<Stock[]>> r12 = new StockMarketActivity$remove$$inlined$post$default$1(r5, r4, r6);
        AndroidNetworking.post(r11).addBodyParameter(r10).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Stock[].class}), new StockMarketActivity$remove$$inlined$post$default$2(r12));
    }

    private final void showList(final List<Stock> r3) {
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new ya5(r3, this));
        syncList(r3);
        checkCount(r3);
    }

    private static final Unit showList$lambda$0(List r3, final StockMarketActivity r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        if (r3.isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 1, null, 2, null);
    L10:
        return Unit.OXO1;
    L5:
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 0, null, 2, null);
        Iterator r6 = r3.iterator();
    L7:
        if (r6.hasNext() == false) goto L10;
        final Stock r7 = (Stock) r6.next();
        DslAdapterExKt.O10IXXX0X(r4.getDslAdapter(), R.layout.item_stock, new ab5(r7, r4));
        goto L7
    }

    private static final Unit showList$lambda$0$0(final Stock r1, final StockMarketActivity r2, final DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemSwipeMenuFlag(4);
        r3.setItemBindOverride(new za5(r1, r2, r3));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(final Stock r7, final StockMarketActivity r8, final DslAdapterItem r9, final DslViewHolder r10, int r11, DslAdapterItem r12, List r13) {
        Intrinsics.X0O(r10, "itemHolder");
        Intrinsics.X0O(r12, "<unused var>");
        Intrinsics.X0O(r13, "<unused var>");
        TextView r14 = r10.tv(R.id.tv_name);
        if (r14 == null) goto L5;
        r14.setText(r7.getName());
    L5:
        TextView r15 = r10.tv(R.id.tv_exchange);
        if (r15 == null) goto L8;
        r15.setText(r7.getExchange());
    L8:
        TextView r16 = r10.tv(R.id.tv_code);
        if (r16 == null) goto L11;
        r16.setText(r7.getCode());
    L11:
        TextView r17 = r10.tv(R.id.tv_close);
        if (r17 == null) goto L14;
        r17.setText(String.valueOf(r7.getRealTimeClose()));
    L14:
        TextView r18 = r10.tv(R.id.tv_change);
        if (r18 == null) goto L17;
        r18.setText(String.valueOf(r7.getRealTimeChange()));
    L17:
        TextView r19 = r10.tv(R.id.tv_change_percent);
        if (r19 == null) goto L20;
        r19.setText(String.valueOf(r7.getRealTimeChangePercentage()));
    L20:
        TextView r110 = r10.tv(R.id.tv_change);
        if (r110 == null) goto L23;
        r110.setTextColor(gk4.iO(r8.getMContext(), R.color.text_color));
    L23:
        TextView r111 = r10.tv(R.id.tv_change_percent);
        if (r111 == null) goto L26;
        r111.setTextColor(gk4.iO(r8.getMContext(), R.color.text_color));
    L26:
        ImageView r0 = r10.img(R.id.iv_change_percent);
        if (r0 == null) goto L29;
        r0.setImageDrawable(null);
    L29:
        int r1 = a01.OXO1.OXO1().getInt(b01.XOIX);
        if (r1 == 0) goto L63;
        if (r1 == 1) goto L35;
    L90:
        r10.click(R.id.bt_delete, new xa5(r8, r7, r9, r10));
        return Unit.OXO1;
    L35:
        if (r7.getRealTimeChange() <= 0.0f) goto L49;
        TextView r112 = r10.tv(R.id.tv_change);
        if (r112 == null) goto L39;
        r112.setTextColor(r8.getResources().getColor(R.color.stock_color_green));
    L39:
        TextView r113 = r10.tv(R.id.tv_change_percent);
        if (r113 == null) goto L42;
        r113.setTextColor(r8.getResources().getColor(R.color.stock_color_green));
    L42:
        ImageView r114 = r10.img(R.id.iv_change_percent);
        if (r114 == null) goto L45;
        r114.setImageResource(R.drawable.icon_stock_rise);
    L45:
        ImageView r115 = r10.img(R.id.iv_change_percent);
        if (r115 == null) goto L90;
        r115.setImageTintList(r8.getResources().getColorStateList(R.color.stock_color_green));
        goto L90
    L49:
        if (r7.getRealTimeChange() >= 0.0f) goto L90;
        TextView r116 = r10.tv(R.id.tv_change);
        if (r116 == null) goto L53;
        r116.setTextColor(r8.getResources().getColor(R.color.stock_color_red));
    L53:
        TextView r117 = r10.tv(R.id.tv_change_percent);
        if (r117 == null) goto L56;
        r117.setTextColor(r8.getResources().getColor(R.color.stock_color_red));
    L56:
        ImageView r118 = r10.img(R.id.iv_change_percent);
        if (r118 == null) goto L59;
        r118.setImageResource(R.drawable.icon_stock_fall);
    L59:
        ImageView r119 = r10.img(R.id.iv_change_percent);
        if (r119 == null) goto L90;
        r119.setImageTintList(r8.getResources().getColorStateList(R.color.stock_color_red));
        goto L90
    L63:
        if (r7.getRealTimeChange() <= 0.0f) goto L77;
        TextView r120 = r10.tv(R.id.tv_change);
        if (r120 == null) goto L67;
        r120.setTextColor(r8.getResources().getColor(R.color.stock_color_red));
    L67:
        TextView r121 = r10.tv(R.id.tv_change_percent);
        if (r121 == null) goto L70;
        r121.setTextColor(r8.getResources().getColor(R.color.stock_color_red));
    L70:
        ImageView r122 = r10.img(R.id.iv_change_percent);
        if (r122 == null) goto L73;
        r122.setImageResource(R.drawable.icon_stock_rise);
    L73:
        ImageView r123 = r10.img(R.id.iv_change_percent);
        if (r123 == null) goto L90;
        r123.setImageTintList(r8.getResources().getColorStateList(R.color.stock_color_red));
        goto L90
    L77:
        if (r7.getRealTimeChange() >= 0.0f) goto L90;
        TextView r124 = r10.tv(R.id.tv_change);
        if (r124 == null) goto L81;
        r124.setTextColor(r8.getResources().getColor(R.color.stock_color_green));
    L81:
        TextView r125 = r10.tv(R.id.tv_change_percent);
        if (r125 == null) goto L84;
        r125.setTextColor(r8.getResources().getColor(R.color.stock_color_green));
    L84:
        ImageView r126 = r10.img(R.id.iv_change_percent);
        if (r126 == null) goto L87;
        r126.setImageResource(R.drawable.icon_stock_fall);
    L87:
        ImageView r127 = r10.img(R.id.iv_change_percent);
        if (r127 == null) goto L90;
        r127.setImageTintList(r8.getResources().getColorStateList(R.color.stock_color_green));
        goto L90
    }

    private static final void showList$lambda$0$0$0$0(StockMarketActivity r0, Stock r1, DslAdapterItem r2, DslViewHolder r3, View r4) {
        r0.remove(r1.getId());
        SwipeMenuHelper r5 = r2.get_itemSwipeMenuHelper();
        if (r5 == null) goto L6;
        r5.closeSwipeMenu(r3);
        return;
    }

    private final void syncList(List<Stock> r14) {
        ArrayList r3 = new ArrayList();
        Iterator r15 = CollectionsKt___CollectionsKt.IO0OOi(r14, q62.OXO1.X1OI()).iterator();
    L4:
        if (r15.hasNext() == false) goto L6;
        Stock r0 = (Stock) r15.next();
        r3.add(new BleStock(a01.OXO1.OXO1().getInt(b01.XOIX), r0.getCode(), r0.getRealTimeClose(), r0.getRealTimeChange(), r0.getRealTimeChangePercentage(), 0.0f, 32, null));
        goto L4
    L6:
        BaseBleConnector.sendList$default(BleConnector.INSTANCE, BleKey.STOCK, BleKeyFlag.RESET, r3, false, false, 24, null);
    }

    private static final TextView tvTip_delegate$lambda$0(StockMarketActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_tip);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.stock_market);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_stock_set);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getDslAdapter().getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sockt_empty));
        showList(initList());
        getRefreshLayout().setRefreshing(true);
        new Handler().postDelayed(new bb5(this), 1000);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_stock_market;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r1, int r2, @tb1 Intent r3) {
        super.onActivityResult(r1, r2, r3);
        if (r2 == (-1)) goto L5;
        return;
    L5:
        if (r1 != 99) goto L9;
        showList(initList());
        return;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivityForResult(new Intent(this, StockAddActivity.class), 99);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onRefresh() {
        list();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getDslAdapter().notifyDataSetChanged();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, StockSettingActivity.class));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }
}
