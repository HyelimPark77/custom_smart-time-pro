package com.sma.smartv3.p610ui.device;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
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
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.Stock;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.StockList;
import com.sma.smartv3.network.StockRemove;
import com.sma.smartv3.p610ui.device.StockMarketActivity;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleStock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nStockMarketActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n19#2:301\n15#2:302\n39#2,3:345\n42#2:351\n44#2,2:353\n176#3,11:303\n196#3:322\n176#3,11:323\n196#3:342\n252#4,7:314\n270#4:321\n252#4,7:334\n270#4:341\n1869#5,2:343\n1563#5:348\n1634#5,2:349\n1636#5:352\n140#6,5:355\n145#6,5:361\n69#6,3:366\n72#6,5:370\n1#7:360\n1#7:369\n*S KotlinDebug\n*F\n+ 1 StockMarketActivity.kt\ncom/sma/smartv3/ui/device/StockMarketActivity\n*L\n38#1:301\n38#1:302\n273#1:345,3\n273#1:351\n273#1:353,2\n93#1:303,11\n93#1:322\n121#1:323,11\n121#1:342\n93#1:314,7\n93#1:321\n121#1:334,7\n121#1:341\n258#1:343,2\n273#1:348\n273#1:349,2\n273#1:352\n286#1:355,5\n286#1:361,5\n294#1:366,3\n294#1:370,5\n286#1:360\n294#1:369\n*E\n"})
public final class StockMarketActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int STOCK_PICKER_REQUEST = 99;

    @aa1
    private AppUser mAppUser;

    @tb1
    private C3006uq mLoadingPopup;

    @aa1
    private final Lazy tvTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ua5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockMarketActivity.tvTip_delegate$lambda$0(this.f11454IO);
        }
    });

    @aa1
    private final Lazy btnBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.va5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockMarketActivity.btnBottom_delegate$lambda$0(this.f11687IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wa5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StockMarketActivity.abhTitleRight_delegate$lambda$0(this.f11913IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public StockMarketActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(StockMarketActivity stockMarketActivity) {
        return (ImageView) stockMarketActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnBottom_delegate$lambda$0(StockMarketActivity stockMarketActivity) {
        return stockMarketActivity.findViewById(R.id.btn_bottom);
    }

    private final void checkCount(List<Stock> list) {
        getTvTip().setVisibility(list.isEmpty() ? 8 : 0);
        int iX1OI = q62.OXO1.X1OI();
        getTvTip().setText(getString(R.string.stock_max_tip, Integer.valueOf(iX1OI)));
        getBtnBottom().setVisibility(list.size() >= iX1OI ? 8 : 0);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final View getBtnBottom() {
        return (View) this.btnBottom$delegate.getValue();
    }

    private final TextView getTvTip() {
        return (TextView) this.tvTip$delegate.getValue();
    }

    private final List<Stock> initList() {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(Stock.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), Stock.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        return CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void list() {
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> stockListBody = RequestBodyKt.getStockListBody(this.mAppUser.getIdentity());
        final O1XIiIO<Stock[]> o1XIiIO = new O1XIiIO<Stock[]>() { // from class: com.sma.smartv3.ui.device.StockMarketActivity.list.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Stock[] stockArr) {
                StockMarketActivity.this.getRefreshLayout().setRefreshing(false);
                if (stockArr != null) {
                    a01.OXO1.IiI10X().put(Stock.class.getName() + is3.OXO1, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(stockArr)));
                    StockMarketActivity.this.showList(ArraysKt___ArraysKt.OXI0X0(stockArr));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                StockMarketActivity.this.getRefreshLayout().setRefreshing(false);
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockList.URL);
        netWorkUtils.printParam(strConvertBaseUrl + StockList.URL, stockListBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + StockList.URL;
        final O1XIiIO<Response<Stock[]>> o1XIiIO2 = new O1XIiIO<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockMarketActivity$list$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Stock[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) stockListBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Stock[].class), new ParsedRequestListener<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockMarketActivity$list$$inlined$post$default$2
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

    private final void remove(int i) {
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
        HashMap<String, String> stockRemoveBody = RequestBodyKt.getStockRemoveBody(this.mAppUser.getIdentity(), i);
        final O1XIiIO<Stock[]> o1XIiIO = new O1XIiIO<Stock[]>() { // from class: com.sma.smartv3.ui.device.StockMarketActivity.remove.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Stock[] stockArr) {
                C3006uq c3006uq3 = StockMarketActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                if (stockArr == null) {
                    ToastUtils.showLong(R.string.failed_to_delete);
                    return;
                }
                a01.OXO1.IiI10X().put(Stock.class.getName() + is3.OXO1, new Gson().toJson(ArraysKt___ArraysKt.OXI0X0(stockArr)));
                StockMarketActivity.this.showList(ArraysKt___ArraysKt.OXI0X0(stockArr));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                C3006uq c3006uq3 = StockMarketActivity.this.mLoadingPopup;
                if (c3006uq3 != null) {
                    c3006uq3.dismiss();
                }
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), StockRemove.URL);
        netWorkUtils.printParam(strConvertBaseUrl + StockRemove.URL, stockRemoveBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + StockRemove.URL;
        final O1XIiIO<Response<Stock[]>> o1XIiIO2 = new O1XIiIO<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockMarketActivity$remove$$inlined$post$default$1
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
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) stockRemoveBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Stock[].class), new ParsedRequestListener<Response<Stock[]>>() { // from class: com.sma.smartv3.ui.device.StockMarketActivity$remove$$inlined$post$default$2
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
    public final void showList(final List<Stock> list) {
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.ya5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return StockMarketActivity.showList$lambda$0(list, this, (DslAdapter) obj);
            }
        });
        syncList(list);
        checkCount(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(List list, final StockMarketActivity stockMarketActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        if (list.isEmpty()) {
            DslAdapter.setAdapterStatus$default(stockMarketActivity.getDslAdapter(), 1, null, 2, null);
        } else {
            DslAdapter.setAdapterStatus$default(stockMarketActivity.getDslAdapter(), 0, null, 2, null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final Stock stock = (Stock) it.next();
                DslAdapterExKt.O10IXXX0X(stockMarketActivity.getDslAdapter(), R.layout.item_stock, new Function1() { // from class: com.android.mltcode.paycertificationapi.ab5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return StockMarketActivity.showList$lambda$0$0(stock, stockMarketActivity, (DslAdapterItem) obj);
                    }
                });
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final Stock stock, final StockMarketActivity stockMarketActivity, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.za5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return StockMarketActivity.showList$lambda$0$0$0(stock, stockMarketActivity, dslItem, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(final Stock stock, final StockMarketActivity stockMarketActivity, final DslAdapterItem dslAdapterItem, final DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(stock.getName());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_exchange);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(stock.getExchange());
        }
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.tv_code);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(stock.getCode());
        }
        TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.tv_close);
        if (textViewM3482tv4 != null) {
            textViewM3482tv4.setText(String.valueOf(stock.getRealTimeClose()));
        }
        TextView textViewM3482tv5 = itemHolder.m3482tv(R.id.tv_change);
        if (textViewM3482tv5 != null) {
            textViewM3482tv5.setText(String.valueOf(stock.getRealTimeChange()));
        }
        TextView textViewM3482tv6 = itemHolder.m3482tv(R.id.tv_change_percent);
        if (textViewM3482tv6 != null) {
            textViewM3482tv6.setText(String.valueOf(stock.getRealTimeChangePercentage()));
        }
        TextView textViewM3482tv7 = itemHolder.m3482tv(R.id.tv_change);
        if (textViewM3482tv7 != null) {
            textViewM3482tv7.setTextColor(gk4.m1859iO(stockMarketActivity.getMContext(), R.color.text_color));
        }
        TextView textViewM3482tv8 = itemHolder.m3482tv(R.id.tv_change_percent);
        if (textViewM3482tv8 != null) {
            textViewM3482tv8.setTextColor(gk4.m1859iO(stockMarketActivity.getMContext(), R.color.text_color));
        }
        ImageView imageViewImg = itemHolder.img(R.id.iv_change_percent);
        if (imageViewImg != null) {
            imageViewImg.setImageDrawable(null);
        }
        int i2 = a01.OXO1.OXO1().getInt(b01.XOIX);
        if (i2 != 0) {
            if (i2 == 1) {
                if (stock.getRealTimeChange() > 0.0f) {
                    TextView textViewM3482tv9 = itemHolder.m3482tv(R.id.tv_change);
                    if (textViewM3482tv9 != null) {
                        textViewM3482tv9.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_green));
                    }
                    TextView textViewM3482tv10 = itemHolder.m3482tv(R.id.tv_change_percent);
                    if (textViewM3482tv10 != null) {
                        textViewM3482tv10.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_green));
                    }
                    ImageView imageViewImg2 = itemHolder.img(R.id.iv_change_percent);
                    if (imageViewImg2 != null) {
                        imageViewImg2.setImageResource(R.drawable.icon_stock_rise);
                    }
                    ImageView imageViewImg3 = itemHolder.img(R.id.iv_change_percent);
                    if (imageViewImg3 != null) {
                        imageViewImg3.setImageTintList(stockMarketActivity.getResources().getColorStateList(R.color.stock_color_green));
                    }
                } else if (stock.getRealTimeChange() < 0.0f) {
                    TextView textViewM3482tv11 = itemHolder.m3482tv(R.id.tv_change);
                    if (textViewM3482tv11 != null) {
                        textViewM3482tv11.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_red));
                    }
                    TextView textViewM3482tv12 = itemHolder.m3482tv(R.id.tv_change_percent);
                    if (textViewM3482tv12 != null) {
                        textViewM3482tv12.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_red));
                    }
                    ImageView imageViewImg4 = itemHolder.img(R.id.iv_change_percent);
                    if (imageViewImg4 != null) {
                        imageViewImg4.setImageResource(R.drawable.icon_stock_fall);
                    }
                    ImageView imageViewImg5 = itemHolder.img(R.id.iv_change_percent);
                    if (imageViewImg5 != null) {
                        imageViewImg5.setImageTintList(stockMarketActivity.getResources().getColorStateList(R.color.stock_color_red));
                    }
                }
            }
        } else if (stock.getRealTimeChange() > 0.0f) {
            TextView textViewM3482tv13 = itemHolder.m3482tv(R.id.tv_change);
            if (textViewM3482tv13 != null) {
                textViewM3482tv13.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_red));
            }
            TextView textViewM3482tv14 = itemHolder.m3482tv(R.id.tv_change_percent);
            if (textViewM3482tv14 != null) {
                textViewM3482tv14.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_red));
            }
            ImageView imageViewImg6 = itemHolder.img(R.id.iv_change_percent);
            if (imageViewImg6 != null) {
                imageViewImg6.setImageResource(R.drawable.icon_stock_rise);
            }
            ImageView imageViewImg7 = itemHolder.img(R.id.iv_change_percent);
            if (imageViewImg7 != null) {
                imageViewImg7.setImageTintList(stockMarketActivity.getResources().getColorStateList(R.color.stock_color_red));
            }
        } else if (stock.getRealTimeChange() < 0.0f) {
            TextView textViewM3482tv15 = itemHolder.m3482tv(R.id.tv_change);
            if (textViewM3482tv15 != null) {
                textViewM3482tv15.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_green));
            }
            TextView textViewM3482tv16 = itemHolder.m3482tv(R.id.tv_change_percent);
            if (textViewM3482tv16 != null) {
                textViewM3482tv16.setTextColor(stockMarketActivity.getResources().getColor(R.color.stock_color_green));
            }
            ImageView imageViewImg8 = itemHolder.img(R.id.iv_change_percent);
            if (imageViewImg8 != null) {
                imageViewImg8.setImageResource(R.drawable.icon_stock_fall);
            }
            ImageView imageViewImg9 = itemHolder.img(R.id.iv_change_percent);
            if (imageViewImg9 != null) {
                imageViewImg9.setImageTintList(stockMarketActivity.getResources().getColorStateList(R.color.stock_color_green));
            }
        }
        itemHolder.click(R.id.bt_delete, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockMarketActivity.showList$lambda$0$0$0$0(this.f12139IO, stock, dslAdapterItem, itemHolder, view);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showList$lambda$0$0$0$0(StockMarketActivity stockMarketActivity, Stock stock, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, View view) {
        stockMarketActivity.remove(stock.getId());
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            swipeMenuHelper.closeSwipeMenu(dslViewHolder);
        }
    }

    private final void syncList(List<Stock> list) {
        ArrayList arrayList = new ArrayList();
        for (Stock stock : CollectionsKt___CollectionsKt.IO0OOi(list, q62.OXO1.X1OI())) {
            arrayList.add(new BleStock(a01.OXO1.OXO1().getInt(b01.XOIX), stock.getCode(), stock.getRealTimeClose(), stock.getRealTimeChange(), stock.getRealTimeChangePercentage(), 0.0f, 32, null));
        }
        BaseBleConnector.sendList$default(BleConnector.INSTANCE, BleKey.STOCK, BleKeyFlag.RESET, arrayList, false, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTip_delegate$lambda$0(StockMarketActivity stockMarketActivity) {
        return (TextView) stockMarketActivity.findViewById(R.id.tv_tip);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.stock_market);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.icon_stock_set);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getDslAdapter().getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sockt_empty));
        showList(initList());
        getRefreshLayout().setRefreshing(true);
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.bb5
            @Override // java.lang.Runnable
            public final void run() {
                this.f5702IO.list();
            }
        }, 1000L);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_stock_market;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 99) {
            showList(initList());
        }
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivityForResult(new Intent(this, (Class<?>) StockAddActivity.class), 99);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
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

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) StockSettingActivity.class));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return R.id.srf;
    }
}
