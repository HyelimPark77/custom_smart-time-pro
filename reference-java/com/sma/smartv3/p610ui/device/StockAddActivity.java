package com.sma.smartv3.p610ui.device;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.LogUtils;
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
import com.sma.smartv3.p610ui.device.StockAddActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStockAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 6 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n19#2:252\n15#2:253\n39#2,3:254\n42#2:260\n44#2,2:262\n1563#3:257\n1634#3,2:258\n1636#3:261\n55#4,12:264\n84#4,3:276\n176#5,11:279\n196#5:298\n176#5,11:299\n196#5:318\n252#6,7:290\n270#6:297\n252#6,7:310\n270#6:317\n1#7:319\n*S KotlinDebug\n*F\n+ 1 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n*L\n39#1:252\n39#1:253\n42#1:254,3\n42#1:260\n42#1:262,2\n42#1:257\n42#1:258,2\n42#1:261\n70#1:264,12\n70#1:276,3\n94#1:279,11\n94#1:298\n127#1:299,11\n127#1:318\n94#1:290,7\n94#1:297\n127#1:310,7\n127#1:317\n*E\n"})
public final class StockAddActivity extends BaseListActivity<Stock> {

    @aa1
    private AppUser mAppUser;

    @tb1
    private C3006uq mLoadingPopup;

    @aa1
    private final List<Stock> mSelectedList;
    private int mStockSize;

    @aa1
    private final Lazy mEditText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pa5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockAddActivity.mEditText_delegate$lambda$0(this.f10323IO);
        }
    });

    @aa1
    private final Lazy mClearImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qa5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockAddActivity.mClearImg_delegate$lambda$0(this.f10567IO);
        }
    });

    @aa1
    private final Lazy mSearchBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ra5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockAddActivity.mSearchBtn_delegate$lambda$0(this.f10780IO);
        }
    });

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 StockAddActivity.kt\ncom/sma/smartv3/ui/device/StockAddActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n71#2,6:83\n59#3:89\n62#4:90\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() <= 0) {
                StockAddActivity.this.getMClearImg().setVisibility(4);
            } else {
                StockAddActivity.this.getMClearImg().setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public StockAddActivity() {
        Collection collectionM39402iI;
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01Var.IiI10X().getString(Stock.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), Stock.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        this.mSelectedList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
    }

    private final void add(int i) {
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(getMContext());
            c3006uq.I0iXXO(false);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> stockAddBody = RequestBodyKt.getStockAddBody(this.mAppUser.getIdentity(), i);
        final O1XIiIO<Stock[]> o1XIiIO = new O1XIiIO<Stock[]>() { // from class: com.sma.smartv3.ui.device.StockAddActivity.add.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Stock[] stockArr) {
                C3006uq c3006uq3 = StockAddActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                if (stockArr != null) {
                    if (!(stockArr.length == 0)) {
                        StockAddActivity.this.mStockSize = stockArr.length;
                        a01.OXO1.IiI10X().put(Stock.class.getName() + is3.OXO1, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(stockArr)));
                        return;
                    }
                }
                StockAddActivity.this.getMListAdapter().notifyDataSetChanged();
                ToastUtils.showLong("Add error", new Object[0]);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                StockAddActivity.this.getMListAdapter().notifyDataSetChanged();
                C3006uq c3006uq3 = StockAddActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockAdd.URL);
        netWorkUtils.printParam(strConvertBaseUrl + StockAdd.URL, stockAddBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + StockAdd.URL;
        final O1XIiIO<Response<Stock[]>> o1XIiIO2 = new O1XIiIO<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockAddActivity$add$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Stock[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq3 = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) stockAddBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Stock[].class), new ParsedRequestListener<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockAddActivity$add$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Stock[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getMClearImg() {
        return (View) this.mClearImg$delegate.getValue();
    }

    private final EditText getMEditText() {
        return (EditText) this.mEditText$delegate.getValue();
    }

    private final View getMSearchBtn() {
        return (View) this.mSearchBtn$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initItem$lambda$1(boolean z, StockAddActivity stockAddActivity, ug6 ug6Var, Stock stock, View view) {
        if (z) {
            return;
        }
        if (stockAddActivity.mStockSize >= 5) {
            ToastUtils.showLong(stockAddActivity.getString(R.string.stock_max_tip, 5), new Object[0]);
        } else {
            ((AppCompatRadioButton) ug6Var.O00(R.id.rbSelectedState)).setChecked(true);
            stockAddActivity.add(stock.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(StockAddActivity stockAddActivity, View view) {
        stockAddActivity.getMEditText().setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(StockAddActivity stockAddActivity, View view) {
        String string = stockAddActivity.getMEditText().getText().toString();
        if (string.length() > 0) {
            stockAddActivity.search(string);
        } else {
            ToastUtils.showLong(R.string.search_content_tip);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mClearImg_delegate$lambda$0(StockAddActivity stockAddActivity) {
        return stockAddActivity.findViewById(R.id.clear_edit_tv_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mEditText_delegate$lambda$0(StockAddActivity stockAddActivity) {
        return (EditText) stockAddActivity.findViewById(R.id.stock_add_edit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mSearchBtn_delegate$lambda$0(StockAddActivity stockAddActivity) {
        return stockAddActivity.findViewById(R.id.stock_search_btn);
    }

    private final void search(String str) {
        if (this.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(getMContext());
            c3006uq.I0iXXO(false);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> stockSearchBody = RequestBodyKt.getStockSearchBody(this.mAppUser.getIdentity(), str);
        final O1XIiIO<Stock[]> o1XIiIO = new O1XIiIO<Stock[]>() { // from class: com.sma.smartv3.ui.device.StockAddActivity.search.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Stock[] stockArr) {
                String string = Arrays.toString(stockArr);
                Intrinsics.O10IXXX0X(string, "toString(...)");
                LogUtils.m11128d("stock search result -> " + string);
                C3006uq c3006uq3 = StockAddActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                if (stockArr != null) {
                    if (!(stockArr.length == 0)) {
                        StockAddActivity.this.getMList().clear();
                        OIXO1IIOO.m878Oi(StockAddActivity.this.getMList(), stockArr);
                        StockAddActivity.this.getMListAdapter().notifyDataSetChanged();
                        return;
                    }
                }
                ToastUtils.showLong(R.string.no_data);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                C3006uq c3006uq3 = StockAddActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockSearch.URL);
        netWorkUtils.printParam(strConvertBaseUrl + StockSearch.URL, stockSearchBody);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + StockSearch.URL;
        final O1XIiIO<Response<Stock[]>> o1XIiIO2 = new O1XIiIO<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockAddActivity$search$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Stock[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq3 = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) stockSearchBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Stock[].class), new ParsedRequestListener<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockAddActivity$search$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Stock[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<Stock> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        this.mStockSize = this.mSelectedList.size();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.add_stock);
        getMListView().setEmptyView(findViewById(R.id.empty));
        getMClearImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.sa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockAddActivity.initView$lambda$0(this.f10994IO, view);
            }
        });
        EditText mEditText = getMEditText();
        Intrinsics.O10IXXX0X(mEditText, "<get-mEditText>(...)");
        mEditText.addTextChangedListener(new OXO1());
        getMSearchBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ta5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockAddActivity.initView$lambda$2(this.f11223IO, view);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.layout_stock_pick_item;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_stock_add;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        setTheme(R.style.ContactPickerTheme);
        super.onCreate(bundle);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        setResult(-1);
        finish();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 final ug6 holder, @aa1 final Stock item, int i) {
        Object next;
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ((TextView) holder.O00(R.id.tv_name)).setText(item.getName());
        ((TextView) holder.O00(R.id.tv_exchange)).setText(item.getExchange());
        ((TextView) holder.O00(R.id.tv_code)).setText(item.getCode());
        ((TextView) holder.O00(R.id.tv_exchange_name)).setText(item.getExchangeInfo());
        ((AppCompatRadioButton) holder.O00(R.id.rbSelectedState)).setButtonTintList(gk4.O00(getMContext(), R.color.text_color));
        Iterator<T> it = this.mSelectedList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Stock) next).getId() != item.getId());
        final boolean z = next != null;
        ((AppCompatRadioButton) holder.O00(R.id.rbSelectedState)).setChecked(z);
        holder.XIi00iiXO().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.oa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockAddActivity.initItem$lambda$1(z, this, holder, item, view);
            }
        });
        ((TextView) holder.O00(R.id.tv_close)).setText(String.valueOf(item.getRealTimeClose()));
        ((TextView) holder.O00(R.id.tv_change)).setText(String.valueOf(item.getRealTimeChange()));
        ((TextView) holder.O00(R.id.tv_change_percent)).setText(String.valueOf(item.getRealTimeChangePercentage()));
        ((TextView) holder.O00(R.id.tv_change)).setTextColor(gk4.m1859iO(getMContext(), R.color.text_color));
        ((TextView) holder.O00(R.id.tv_change_percent)).setTextColor(gk4.m1859iO(getMContext(), R.color.text_color));
        ((ImageView) holder.O00(R.id.iv_change_percent)).setImageDrawable(null);
        int i2 = a01.OXO1.OXO1().getInt(b01.XOIX);
        if (i2 == 0) {
            if (item.getRealTimeChange() > 0.0f) {
                ((TextView) holder.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_red));
                ((TextView) holder.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_red));
                ((ImageView) holder.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_rise);
                ((ImageView) holder.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_red));
                return;
            }
            if (item.getRealTimeChange() < 0.0f) {
                ((TextView) holder.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_green));
                ((TextView) holder.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_green));
                ((ImageView) holder.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_fall);
                ((ImageView) holder.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_green));
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        if (item.getRealTimeChange() > 0.0f) {
            ((TextView) holder.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_green));
            ((TextView) holder.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_green));
            ((ImageView) holder.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_rise);
            ((ImageView) holder.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_green));
            return;
        }
        if (item.getRealTimeChange() < 0.0f) {
            ((TextView) holder.O00(R.id.tv_change)).setTextColor(getResources().getColor(R.color.stock_color_red));
            ((TextView) holder.O00(R.id.tv_change_percent)).setTextColor(getResources().getColor(R.color.stock_color_red));
            ((ImageView) holder.O00(R.id.iv_change_percent)).setImageResource(R.drawable.icon_stock_fall);
            ((ImageView) holder.O00(R.id.iv_change_percent)).setImageTintList(getResources().getColorStateList(R.color.stock_color_red));
        }
    }
}
