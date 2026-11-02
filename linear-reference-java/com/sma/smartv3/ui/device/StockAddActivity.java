package com.sma.smartv3.ui.device;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.oa5;
import com.android.mltcode.paycertificationapi.pa5;
import com.android.mltcode.paycertificationapi.qa5;
import com.android.mltcode.paycertificationapi.ra5;
import com.android.mltcode.paycertificationapi.sa5;
import com.android.mltcode.paycertificationapi.ta5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.Stock;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.StockAdd;
import com.sma.smartv3.network.StockSearch;
import com.sma.smartv3.pro.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStockAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n19#2:252\n15#2:253\n39#2,3:254\n42#2:260\n44#2,2:262\n1563#3:257\n1634#3,2:258\n1636#3:261\n55#4,12:264\n84#4,3:276\n176#5,11:279\n196#5:298\n176#5,11:299\n196#5:318\n252#6,7:290\n270#6:297\n252#6,7:310\n270#6:317\n1#7:319\n*S KotlinDebug\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n*L\n39#1:252\n39#1:253\n42#1:254,3\n42#1:260\n42#1:262,2\n42#1:257\n42#1:258,2\n42#1:261\n70#1:264,12\n70#1:276,3\n94#1:279,11\n94#1:298\n127#1:299,11\n127#1:318\n94#1:290,7\n94#1:297\n127#1:310,7\n127#1:317\n*E\n"})
public final class StockAddActivity extends BaseListActivity<Stock> {

    @aa1
    private AppUser mAppUser;

    @aa1
    private final Lazy mClearImg$delegate;

    @aa1
    private final Lazy mEditText$delegate;

    @tb1
    private uq mLoadingPopup;

    @aa1
    private final Lazy mSearchBtn$delegate;

    @aa1
    private final List<Stock> mSelectedList;
    private int mStockSize;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n71#2,6:83\n59#3:89\n62#4:90\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ StockAddActivity IO;

        public OXO1(StockAddActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            if (r2 != null) goto L4;
        L7:
            StockAddActivity.access$getMClearImg(this.IO).setVisibility(4);
            return;
        L4:
            if (r2.length() <= 0) goto L7;
            StockAddActivity.access$getMClearImg(this.IO).setVisibility(0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public StockAddActivity() {
        this.mEditText$delegate = LazyKt__LazyJVMKt.iO(new pa5(this));
        this.mClearImg$delegate = LazyKt__LazyJVMKt.iO(new qa5(this));
        this.mSearchBtn$delegate = LazyKt__LazyJVMKt.iO(new ra5(this));
        a01 r2 = a01.OXO1;
        SPUtils r3 = r2.IiI10X();
        Object r4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r5 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r5 == null) goto L6;
        r4 = r5;
    L6:
        this.mAppUser = (AppUser) r4;
        JsonArray r6 = JsonParser.parseString(r2.IiI10X().getString(Stock.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L12
        Intrinsics.XXI(r6);     // Catch: Exception -> L12
        Collection r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L12
        Iterator<JsonElement> r8 = r6.iterator();     // Catch: Exception -> L12
    L9:
        if (r8.hasNext() == false) goto L13;
        r7.add(new Gson().fromJson(r8.next(), Stock.class));     // Catch: Exception -> L12
    L13:
        this.mSelectedList = CollectionsKt___CollectionsKt.OO0Oi10(r7);
        return;
    L12:
        r7 = CollectionsKt__CollectionsKt.iI();
        goto L13
    }

    public static /* synthetic */ View I0iXXO(StockAddActivity r0) {
        return mClearImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(StockAddActivity r0) {
        return mSearchBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OIX0iXi(StockAddActivity r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ void X0O(StockAddActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ EditText X1ii(StockAddActivity r0) {
        return mEditText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(boolean r0, StockAddActivity r1, ug6 r2, Stock r3, View r4) {
        initItem$lambda$1(r0, r1, r2, r3, r4);
    }

    public static final /* synthetic */ View access$getMClearImg(StockAddActivity r0) {
        return r0.getMClearImg();
    }

    public static final /* synthetic */ List access$getMList(StockAddActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(StockAddActivity r0) {
        return r0.getMListAdapter();
    }

    public static final /* synthetic */ uq access$getMLoadingPopup$p(StockAddActivity r0) {
        return r0.mLoadingPopup;
    }

    public static final /* synthetic */ void access$setMStockSize$p(StockAddActivity r0, int r1) {
        r0.mStockSize = r1;
    }

    private final void add(int r9) {
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
        HashMap<String, String> r10 = RequestBodyKt.getStockAddBody(this.mAppUser.getIdentity(), r9);
        final O1XIiIO<Stock[]> r4 = new AnonymousClass2(this);
        final Activity r5 = null;
        final uq r6 = r3.loadPopup(null, null);
        String r7 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockAdd.URL);
        r3.printParam(r7 + StockAdd.URL, r10);
        NetWork r8 = NetWork.OXO1;
        String r11 = r7 + StockAdd.URL;
        final O1XIiIO<Response<Stock[]>> r12 = new StockAddActivity$add$$inlined$post$default$1(r5, r4, r6);
        AndroidNetworking.post(r11).addBodyParameter(r10).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Stock[].class}), new StockAddActivity$add$$inlined$post$default$2(r12));
    }

    private final View getMClearImg() {
        return (View) getValue();
    }

    private final EditText getMEditText() {
        return (EditText) getValue();
    }

    private final View getMSearchBtn() {
        return (View) getValue();
    }

    private static final void initItem$lambda$1(boolean r0, StockAddActivity r1, ug6 r2, Stock r3, View r4) {
        if (r0 == false) goto L5;
        return;
    L5:
        if (r1.mStockSize < 5) goto L8;
        ToastUtils.showLong(r1.getString(R.string.stock_max_tip, new Object[]{5}), new Object[0]);
        return;
    L8:
        ((AppCompatRadioButton) r2.O00(R.id.rbSelectedState)).setChecked(true);
        r1.add(r3.getId());
    }

    private static final void initView$lambda$0(StockAddActivity r0, View r1) {
        r0.getMEditText().setText("");
    }

    private static final void initView$lambda$2(StockAddActivity r1, View r2) {
        String r3 = r1.getMEditText().getText().toString();
        if (r3.length() <= 0) goto L6;
        r1.search(r3);
        return;
    L6:
        ToastUtils.showLong(R.string.search_content_tip);
    }

    private static final View mClearImg_delegate$lambda$0(StockAddActivity r1) {
        return r1.findViewById(R.id.clear_edit_tv_img);
    }

    private static final EditText mEditText_delegate$lambda$0(StockAddActivity r1) {
        return (EditText) r1.findViewById(R.id.stock_add_edit);
    }

    private static final View mSearchBtn_delegate$lambda$0(StockAddActivity r1) {
        return r1.findViewById(R.id.stock_search_btn);
    }

    private final void search(String r9) {
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
        HashMap<String, String> r10 = RequestBodyKt.getStockSearchBody(this.mAppUser.getIdentity(), r9);
        final O1XIiIO<Stock[]> r4 = new C34502(this);
        final Activity r5 = null;
        final uq r6 = r3.loadPopup(null, null);
        String r7 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockSearch.URL);
        r3.printParam(r7 + StockSearch.URL, r10);
        NetWork r8 = NetWork.OXO1;
        String r11 = r7 + StockSearch.URL;
        final O1XIiIO<Response<Stock[]>> r12 = new StockAddActivity$search$$inlined$post$default$1(r5, r4, r6);
        AndroidNetworking.post(r11).addBodyParameter(r10).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{Stock[].class}), new StockAddActivity$search$$inlined$post$default$2(r12));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (Stock) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<Stock> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        this.mStockSize = this.mSelectedList.size();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_stock);
        getMListView().setEmptyView(findViewById(R.id.empty));
        getMClearImg().setOnClickListener(new sa5(this));
        EditText r0 = getMEditText();
        Intrinsics.O10IXXX0X(r0, "<get-mEditText>(...)");
        r0.addTextChangedListener(new OXO1(this));
        getMSearchBtn().setOnClickListener(new ta5(this));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.layout_stock_pick_item;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_stock_add;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r2) {
        setTheme(R.style.ContactPickerTheme);
        super.onCreate(r2);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        setResult(-1);
        finish();
    }

    public void initItem(@aa1 final ug6 r10, @aa1 final Stock r11, int r12) {
        Intrinsics.X0O(r10, "holder");
        Intrinsics.X0O(r11, MapController.ITEM_LAYER_TAG);
        ((TextView) r10.O00(R.id.tv_name)).setText(r11.getName());
        ((TextView) r10.O00(R.id.tv_exchange)).setText(r11.getExchange());
        ((TextView) r10.O00(R.id.tv_code)).setText(r11.getCode());
        ((TextView) r10.O00(R.id.tv_exchange_name)).setText(r11.getExchangeInfo());
        ((AppCompatRadioButton) r10.O00(R.id.rbSelectedState)).setButtonTintList(gk4.O00(getMContext(), R.color.text_color));
        Iterator<T> r0 = this.mSelectedList.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (((Stock) r1).getId() != r11.getId()) goto L4;
    L10:
        if (r1 == null) goto L12;
        final boolean r2 = true;
    L13:
        ((AppCompatRadioButton) r10.O00(R.id.rbSelectedState)).setChecked(r2);
        r10.XIi00iiXO().setOnClickListener(new oa5(r2, this, r10, r11));
        ((TextView) r10.O00(R.id.tv_close)).setText(String.valueOf(r11.getRealTimeClose()));
        ((TextView) r10.O00(R.id.tv_change)).setText(String.valueOf(r11.getRealTimeChange()));
        ((TextView) r10.O00(R.id.tv_change_percent)).setText(String.valueOf(r11.getRealTimeChangePercentage()));
        ((TextView) r10.O00(R.id.tv_change)).setTextColor(gk4.iO(getMContext(), R.color.text_color));
        ((TextView) r10.O00(R.id.tv_change_percent)).setTextColor(gk4.iO(getMContext(), R.color.text_color));
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageDrawable(null);
        int r3 = a01.OXO1.OXO1().getInt(b01.XOIX);
        if (r3 == 0) goto L26;
        if (r3 == 1) goto L18;
        return;
    L18:
        if (r11.getRealTimeChange() <= 0.0f) goto L22;
        ((TextView) r10.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_green));
        ((TextView) r10.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_green));
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_rise);
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_green));
        return;
    L22:
        if (r11.getRealTimeChange() >= 0.0f) goto L36;
        ((TextView) r10.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_red));
        ((TextView) r10.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_red));
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_fall);
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_red));
        return;
    L36:
        return;
    L26:
        if (r11.getRealTimeChange() <= 0.0f) goto L30;
        ((TextView) r10.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_red));
        ((TextView) r10.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_red));
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_rise);
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_red));
        return;
    L30:
        if (r11.getRealTimeChange() >= 0.0f) goto L37;
        ((TextView) r10.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_green));
        ((TextView) r10.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_green));
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_fall);
        ((ImageView) r10.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_green));
        return;
    L37:
        return;
    L12:
        r2 = false;
        goto L13
    L8:
        r1 = null;
        goto L10
    }
}
