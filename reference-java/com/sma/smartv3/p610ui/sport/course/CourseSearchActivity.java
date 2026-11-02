package com.sma.smartv3.p610ui.sport.course;

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
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionDataKt;
import com.sma.smartv3.p610ui.p611ai.item.AISearchTopItem;
import com.sma.smartv3.p610ui.p611ai.item.SearchAIFillingItem;
import com.sma.smartv3.p610ui.p611ai.item.SearchAIFunctionItem;
import com.sma.smartv3.p610ui.sport.course.CourseSearchActivity;
import com.sma.smartv3.pro.R;
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

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseSearchActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseSearchActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,279:1\n55#2,12:280\n84#2,3:292\n1869#3,2:295\n1563#3:300\n1634#3,2:301\n1636#3:304\n1869#3,2:309\n1869#3,2:311\n39#4,3:297\n42#4:303\n44#4,2:305\n31#4,2:307\n31#4,2:313\n*S KotlinDebug\n*F\n+ 1 CourseSearchActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseSearchActivity\n*L\n77#1:280,12\n77#1:292,3\n145#1:295,2\n157#1:300\n157#1:301,2\n157#1:304\n190#1:309,2\n213#1:311,2\n157#1:297,3\n157#1:303\n157#1:305,2\n239#1:307,2\n263#1:313,2\n*E\n"})
public final class CourseSearchActivity extends BaseDSLRecyclerActivity {

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
    private final Lazy searchView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XX11iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CourseSearchActivity.searchView_delegate$lambda$0(this.f4982IO);
        }
    });
    private int mAdapterType = 253;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 CourseSearchActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseSearchActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n78#2,4:83\n59#3:87\n62#4:88\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public XIi00iiXO() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (CourseSearchActivity.this.isProgrammaticallySet()) {
                return;
            }
            CourseSearchActivity.this.editChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.course.CourseSearchActivity$iO */
    public static final class C18974iO implements TextView.OnEditorActionListener {
        public C18974iO() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 0 && i != 6) {
                return false;
            }
            Editable text = CourseSearchActivity.this.getSearchView().getText();
            CourseSearchActivity.this.saveRecords(text.toString());
            CourseSearchActivity.this.editChanged(text);
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

    public static /* synthetic */ List initList$default(CourseSearchActivity courseSearchActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return courseSearchActivity.initList(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText searchView_delegate$lambda$0(CourseSearchActivity courseSearchActivity) {
        return (EditText) courseSearchActivity.findViewById(R.id.search_view);
    }

    private final void showData(String str) {
        final List<AIFunction> listInitList = initList(str);
        findViewById(R.id.rv_empty).setVisibility((!listInitList.isEmpty() || this.mAdapterType == 253) ? 8 : 0);
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0OIXI10O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.showData$lambda$0(this.f1160IO, listInitList, (DslAdapter) obj);
            }
        });
    }

    public static /* synthetic */ void showData$default(CourseSearchActivity courseSearchActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        courseSearchActivity.showData(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final CourseSearchActivity courseSearchActivity, final List list, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        courseSearchActivity.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.I011
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CourseSearchActivity.showData$lambda$0$0(this.f1042IO, renderAdapter, list);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(final CourseSearchActivity courseSearchActivity, DslAdapter dslAdapter, List list) {
        switch (courseSearchActivity.mAdapterType) {
            case 253:
                List<String> list2 = courseSearchActivity.mRecords;
                Intrinsics.XXI(list2);
                DslAdapterExKt.X0O(dslAdapter, new AISearchTopItem(list2), new Function1() { // from class: com.android.mltcode.paycertificationapi.IO0000IOX
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return CourseSearchActivity.showData$lambda$0$0$0((AISearchTopItem) obj);
                    }
                });
                break;
            case 254:
                List<String> list3 = courseSearchActivity.mRecords;
                Intrinsics.XXI(list3);
                DslAdapterExKt.X0O(dslAdapter, new AISearchTopItem(list3), new Function1() { // from class: com.android.mltcode.paycertificationapi.O1iiXO
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return CourseSearchActivity.showData$lambda$0$0$3((AISearchTopItem) obj);
                    }
                });
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final AIFunction aIFunction = (AIFunction) it.next();
                    DslAdapterExKt.X0O(courseSearchActivity.getDslAdapter(), new SearchAIFunctionItem(), new Function1() { // from class: com.android.mltcode.paycertificationapi.OiI0X011
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return CourseSearchActivity.showData$lambda$0$0$4$0(aIFunction, courseSearchActivity, (SearchAIFunctionItem) obj);
                        }
                    });
                }
                break;
            case 255:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        final AIFunction aIFunction2 = (AIFunction) it2.next();
                        DslAdapterExKt.X0O(courseSearchActivity.getDslAdapter(), new SearchAIFillingItem(), new Function1() { // from class: com.android.mltcode.paycertificationapi.I101O0I
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return CourseSearchActivity.showData$lambda$0$0$2$0(aIFunction2, courseSearchActivity, (SearchAIFillingItem) obj);
                            }
                        });
                    }
                } else {
                    List<String> list4 = courseSearchActivity.mRecords;
                    Intrinsics.XXI(list4);
                    DslAdapterExKt.X0O(dslAdapter, new AISearchTopItem(list4), new Function1() { // from class: com.android.mltcode.paycertificationapi.OXXII1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return CourseSearchActivity.showData$lambda$0$0$1((AISearchTopItem) obj);
                        }
                    });
                }
                break;
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1XIXiXX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.showData$lambda$0$0$5((DslAdapter) obj);
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
    public static final Unit showData$lambda$0$0$2$0(final AIFunction aIFunction, final CourseSearchActivity courseSearchActivity, final SearchAIFillingItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemData(aIFunction);
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.iX1I0I0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.showData$lambda$0$0$2$0$0(this.f8276IO, aIFunction, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$2$0$0(final CourseSearchActivity courseSearchActivity, final AIFunction aIFunction, SearchAIFillingItem searchAIFillingItem, View it) {
        Intrinsics.X0O(it, "it");
        courseSearchActivity.saveRecords(aIFunction.getTitle());
        searchAIFillingItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I1XX0XOi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.showData$lambda$0$0$2$0$0$0(this.f1460IO, aIFunction, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$2$0$0$0(CourseSearchActivity courseSearchActivity, AIFunction aIFunction, View it) {
        Intrinsics.X0O(it, "it");
        AIFunctionDataKt.toAIFunction(courseSearchActivity, aIFunction);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$3(AISearchTopItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$4$0(final AIFunction aIFunction, final CourseSearchActivity courseSearchActivity, SearchAIFunctionItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemData(aIFunction);
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IXi11iX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CourseSearchActivity.showData$lambda$0$0$4$0$0(this.f2130IO, aIFunction, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$4$0$0(CourseSearchActivity courseSearchActivity, AIFunction aIFunction, View it) {
        Intrinsics.X0O(it, "it");
        AIFunctionDataKt.toAIFunction(courseSearchActivity, aIFunction);
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
    public static final boolean showDeleteTipPopup$lambda$0$1(CourseSearchActivity courseSearchActivity) {
        List<String> list = courseSearchActivity.mRecords;
        List listOO0Oi10 = list != null ? CollectionsKt___CollectionsKt.OO0Oi10(list) : null;
        if (listOO0Oi10 != null) {
            listOO0Oi10.clear();
        }
        courseSearchActivity.mRecords = listOO0Oi10 != null ? CollectionsKt___CollectionsKt.i0I0O111I(listOO0Oi10) : null;
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Intrinsics.XXI(listOO0Oi10);
        sPUtilsIiI10X.put(String.class.getName() + is3.OXO1, new Gson().toJson(listOO0Oi10));
        ToastUtils.showLong(R.string.clear_success);
        courseSearchActivity.notifyDataChanged(courseSearchActivity.getSearchView().getText().toString());
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
        super.initView();
        transparentStatusBar();
        getSearchView().setText("功能开发中..");
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        EditText searchView = getSearchView();
        Intrinsics.O10IXXX0X(searchView, "<get-searchView>(...)");
        searchView.addTextChangedListener(new XIi00iiXO());
        getSearchView().setOnEditorActionListener(new C18974iO());
        notifyDataChanged("");
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
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii1X0iO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(CourseSearchActivity.showDeleteTipPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.XO1I1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(CourseSearchActivity.showDeleteTipPopup$lambda$0$1(this.f4716IO));
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
