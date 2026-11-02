package com.sma.smartv3.p610ui.p611ai;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.ad.ADPCAdError;
import com.sma.smartv3.biz.ad.ADPCAdListener;
import com.sma.smartv3.biz.p242ad.ADPAdError;
import com.sma.smartv3.biz.p242ad.ADPAdListener;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionDataKt;
import com.sma.smartv3.p610ui.p611ai.SearchFuncActivity;
import com.sma.smartv3.p610ui.p611ai.item.AISearchTopItem;
import com.sma.smartv3.p610ui.p611ai.item.SearchAIFillingItem;
import com.sma.smartv3.p610ui.p611ai.item.SearchAIFunctionItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.p256ad.ADPAdContainerView;
import com.sma.smartv3.view.p256ad.ADPCAdContainerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nSearchFuncActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,308:1\n55#2,12:309\n84#2,3:321\n1869#3,2:324\n1563#3:329\n1634#3,2:330\n1636#3:333\n1869#3,2:338\n1869#3,2:340\n39#4,3:326\n42#4:332\n44#4,2:334\n31#4,2:336\n31#4,2:342\n*S KotlinDebug\n*F\n+ 1 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n*L\n74#1:309,12\n74#1:321,3\n175#1:324,2\n187#1:329\n187#1:330,2\n187#1:333\n220#1:338,2\n243#1:340,2\n187#1:326,3\n187#1:332\n187#1:334,2\n269#1:336,2\n293#1:342,2\n*E\n"})
public final class SearchFuncActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static final int SEARCH_FILLING = 255;
    private static final int SEARCH_INITIAL = 253;
    private static final int SEARCH_RESULT = 254;
    private boolean isProgrammaticallySet;

    @tb1
    private go0 mAllDeleteTipPopup;

    @tb1
    private List<String> mRecords;

    @aa1
    private final String TAG = "SearchFunc";

    @aa1
    private final Lazy searchView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bx3
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SearchFuncActivity.searchView_delegate$lambda$0(this.f5842IO);
        }
    });
    private int mAdapterType = 253;

    public static final class O00 extends ADPAdListener {
        public O00() {
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdFailed(ADPAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(SearchFuncActivity.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
        }

        @Override // com.sma.smartv3.biz.p242ad.ADPAdListener
        public void onAdLoaded(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(SearchFuncActivity.this.TAG + " -> Ad State : Loaded");
        }
    }

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchFuncActivity.kt\ncom/sma/smartv3/ui/ai/SearchFuncActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n75#2,4:83\n59#3:87\n62#4:88\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public XIi00iiXO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (SearchFuncActivity.this.isProgrammaticallySet()) {
                return;
            }
            SearchFuncActivity.this.editChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class XO0O10 extends ADPCAdListener {
        public XO0O10() {
        }

        public void onADError(ADPCAdError error, String adUnitId) {
            Intrinsics.X0O(error, "error");
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(SearchFuncActivity.this.TAG + " -> Ad State : Error, Info: " + error.getCode() + ", " + error.getMsg());
        }

        public void onADReceive(String adUnitId) {
            Intrinsics.X0O(adUnitId, "adUnitId");
            i1O0OXO1O.OXO1.OXO1(SearchFuncActivity.this.TAG + " -> Ad State : Loaded");
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.SearchFuncActivity$iO */
    public static final class C18649iO implements TextView.OnEditorActionListener {
        public C18649iO() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 0 && i != 6) {
                return false;
            }
            Editable text = SearchFuncActivity.this.getSearchView().getText();
            SearchFuncActivity.this.saveRecords(text.toString());
            SearchFuncActivity.this.editChanged(text);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void editChanged(Editable editable) {
        this.mAdapterType = (editable == null || editable.length() != 0) ? 255 : 253;
        notifyDataChanged(String.valueOf(editable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText getSearchView() {
        return (EditText) this.searchView$delegate.getValue();
    }

    public static /* synthetic */ List initList$default(SearchFuncActivity searchFuncActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return searchFuncActivity.initList(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText searchView_delegate$lambda$0(SearchFuncActivity searchFuncActivity) {
        return (EditText) searchFuncActivity.findViewById(R.id.search_view);
    }

    private final void showData(String str) {
        final List<AIFunction> listInitList = initList(str);
        findViewById(R.id.rv_empty).setVisibility((!listInitList.isEmpty() || this.mAdapterType == 253) ? 8 : 0);
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.fx3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SearchFuncActivity.showData$lambda$0(this.f6756IO, listInitList, (DslAdapter) obj);
            }
        });
    }

    public static /* synthetic */ void showData$default(SearchFuncActivity searchFuncActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        searchFuncActivity.showData(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final SearchFuncActivity searchFuncActivity, final List list, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        searchFuncActivity.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.cx3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SearchFuncActivity.showData$lambda$0$0(this.f6074IO, renderAdapter, list);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(final SearchFuncActivity searchFuncActivity, DslAdapter dslAdapter, List list) {
        switch (searchFuncActivity.mAdapterType) {
            case 253:
                List<String> list2 = searchFuncActivity.mRecords;
                Intrinsics.XXI(list2);
                DslAdapterExKt.X0O(dslAdapter, new AISearchTopItem(list2), new Function1() { // from class: com.android.mltcode.paycertificationapi.jx3
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SearchFuncActivity.showData$lambda$0$0$0((AISearchTopItem) obj);
                    }
                });
                break;
            case 254:
                List<String> list3 = searchFuncActivity.mRecords;
                Intrinsics.XXI(list3);
                DslAdapterExKt.X0O(dslAdapter, new AISearchTopItem(list3), new Function1() { // from class: com.android.mltcode.paycertificationapi.mx3
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return SearchFuncActivity.showData$lambda$0$0$3((AISearchTopItem) obj);
                    }
                });
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AIFunction aIFunction = (AIFunction) it.next();
                    DslAdapterExKt.X0O(searchFuncActivity.getDslAdapter(), new SearchAIFunctionItem(), new Function1() { // from class: com.android.mltcode.paycertificationapi.nx3
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SearchFuncActivity.showData$lambda$0$0$4$0(aIFunction, searchFuncActivity, (SearchAIFunctionItem) obj);
                        }
                    });
                }
                break;
            case 255:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        final AIFunction aIFunction2 = (AIFunction) it2.next();
                        DslAdapterExKt.X0O(searchFuncActivity.getDslAdapter(), new SearchAIFillingItem(), new Function1() { // from class: com.android.mltcode.paycertificationapi.lx3
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return SearchFuncActivity.showData$lambda$0$0$2$0(aIFunction2, searchFuncActivity, (SearchAIFillingItem) obj);
                            }
                        });
                    }
                } else {
                    List<String> list4 = searchFuncActivity.mRecords;
                    Intrinsics.XXI(list4);
                    DslAdapterExKt.X0O(dslAdapter, new AISearchTopItem(list4), new Function1() { // from class: com.android.mltcode.paycertificationapi.kx3
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SearchFuncActivity.showData$lambda$0$0$1((AISearchTopItem) obj);
                        }
                    });
                }
                break;
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ox3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SearchFuncActivity.showData$lambda$0$0$5((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0(AISearchTopItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$1(AISearchTopItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$2$0(final AIFunction aIFunction, final SearchFuncActivity searchFuncActivity, final SearchAIFillingItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemData(aIFunction);
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.gx3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SearchFuncActivity.showData$lambda$0$0$2$0$0(this.f6987IO, aIFunction, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$2$0$0(final SearchFuncActivity searchFuncActivity, final AIFunction aIFunction, SearchAIFillingItem searchAIFillingItem, View it) {
        Intrinsics.X0O(it, "it");
        searchFuncActivity.saveRecords(aIFunction.getTitle());
        searchAIFillingItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.ex3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SearchFuncActivity.showData$lambda$0$0$2$0$0$0(this.f6510IO, aIFunction, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$2$0$0$0(SearchFuncActivity searchFuncActivity, AIFunction aIFunction, View it) {
        Intrinsics.X0O(it, "it");
        AIFunctionDataKt.toAIFunction(searchFuncActivity, aIFunction);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$3(AISearchTopItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$4$0(final AIFunction aIFunction, final SearchFuncActivity searchFuncActivity, SearchAIFunctionItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemData(aIFunction);
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.dx3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SearchFuncActivity.showData$lambda$0$0$4$0$0(this.f6290IO, aIFunction, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$4$0$0(SearchFuncActivity searchFuncActivity, AIFunction aIFunction, View it) {
        Intrinsics.X0O(it, "it");
        AIFunctionDataKt.toAIFunction(searchFuncActivity, aIFunction);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$5(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$1(SearchFuncActivity searchFuncActivity) {
        List<String> list = searchFuncActivity.mRecords;
        List listOO0Oi10 = list != null ? CollectionsKt___CollectionsKt.OO0Oi10(list) : null;
        if (listOO0Oi10 != null) {
            listOO0Oi10.clear();
        }
        searchFuncActivity.mRecords = listOO0Oi10 != null ? CollectionsKt___CollectionsKt.i0I0O111I(listOO0Oi10) : null;
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Intrinsics.XXI(listOO0Oi10);
        sPUtilsIiI10X.put(String.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
        ToastUtils.showLong(R.string.clear_success);
        searchFuncActivity.notifyDataChanged(searchFuncActivity.getSearchView().getText().toString());
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @sf5(tag = I01XX0.X11I)
    public final void clearRecords(@aa1 String item) {
        Intrinsics.X0O(item, "item");
        showDeleteTipPopup();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<AIFunction> initList(@aa1 String newText) {
        Intrinsics.X0O(newText, "newText");
        List<AIFunction> aIFunction = AIFunctionDataKt.getAIFunction();
        ArrayList arrayList = new ArrayList();
        if (newText.length() > 0) {
            for (AIFunction aIFunction2 : aIFunction) {
                if (StringsKt__StringsKt.iOiXX(aIFunction2.getTitle(), newText, true)) {
                    arrayList.add(aIFunction2);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ADPAdContainerView aDPAdContainerView;
        super.initView();
        transparentStatusBar();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        EditText searchView = getSearchView();
        Intrinsics.O10IXXX0X(searchView, "<get-searchView>(...)");
        searchView.addTextChangedListener(new XIi00iiXO());
        getSearchView().setOnEditorActionListener(new C18649iO());
        notifyDataChanged("");
        i72 i72Var = i72.OXO1;
        if (i72Var.IX0iIX()) {
            ADPCAdContainerView aDPCAdContainerView = (ADPCAdContainerView) findViewById(R.id.adpcAdContainerView);
            if (aDPCAdContainerView != null) {
                i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + aDPCAdContainerView.getAdUnitId());
                aDPCAdContainerView.setAdListener(new XO0O10());
                ADPCAdContainerView.loadAdView$default(aDPCAdContainerView, null, 0, false, null, 15, null);
                return;
            }
            return;
        }
        if (!i72Var.IOi1O0() || (aDPAdContainerView = (ADPAdContainerView) findViewById(R.id.adpAdContainerView)) == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> id:" + aDPAdContainerView.getAdUnitId());
        aDPAdContainerView.setAdListener(new O00());
        ADPAdContainerView.loadAdView$default(aDPAdContainerView, null, 0, false, null, 15, null);
    }

    public final boolean isProgrammaticallySet() {
        return this.isProgrammaticallySet;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_search_func;
    }

    public final void notifyDataChanged(@aa1 String item) {
        Intrinsics.X0O(item, "item");
        showData(item);
        if (getDslAdapter() != null) {
            getDslAdapter().notifyDataSetChanged();
        }
    }

    @sf5(tag = I01XX0.iiiO)
    public final void onCodePairChange(@aa1 String item) {
        Intrinsics.X0O(item, "item");
        this.mAdapterType = 254;
        this.isProgrammaticallySet = true;
        getSearchView().setText(item);
        saveRecords(item);
        getSearchView().setSelection(item.length());
        this.isProgrammaticallySet = false;
        List<AIFunction> listInitList = initList(item);
        if (listInitList.size() == 1 && Intrinsics.XOO0ii0(listInitList.get(0).getTitle(), item)) {
            AIFunctionDataKt.toAIFunction(this, listInitList.get(0));
        } else {
            notifyDataChanged(item);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        List listM39402iI;
        super.onResume();
        if (getDslAdapter() != null) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(String.class.getName() + is3.OXO1)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                listM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    listM39402iI.add(new Gson().fromJson(it.next(), String.class));
                }
            } catch (Exception unused) {
                listM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            this.mRecords = listM39402iI;
            getDslAdapter().notifyDataSetChanged();
        }
    }

    public final void onSearch(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        String string = getSearchView().getText().toString();
        this.mAdapterType = 254;
        saveRecords(string);
        notifyDataChanged(string);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void saveRecords(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        List<String> list = this.mRecords;
        List listOO0Oi10 = list != null ? CollectionsKt___CollectionsKt.OO0Oi10(list) : null;
        Intrinsics.XXI(listOO0Oi10);
        if (listOO0Oi10.contains(text)) {
            return;
        }
        if (listOO0Oi10.size() > 10) {
            listOO0Oi10.remove(0);
        }
        listOO0Oi10.add(text);
        this.mRecords = CollectionsKt___CollectionsKt.i0I0O111I(listOO0Oi10);
        a01.OXO1.IiI10X().put(String.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
    }

    public final void setProgrammaticallySet(boolean z) {
        this.isProgrammaticallySet = z;
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.tip);
            go0Var.m1865iX(Integer.valueOf(R.string.clear_ai_chat_records));
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.hx3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SearchFuncActivity.showDeleteTipPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.ix3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(SearchFuncActivity.showDeleteTipPopup$lambda$0$1(this.f8785IO));
                }
            });
            this.mAllDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mAllDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }
}
