package com.sma.smartv3.ui.sport.course;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I011;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0OIXI10O;
import com.android.mltcode.paycertificationapi.I101O0I;
import com.android.mltcode.paycertificationapi.I1XX0XOi;
import com.android.mltcode.paycertificationapi.IO0000IOX;
import com.android.mltcode.paycertificationapi.IXi11iX;
import com.android.mltcode.paycertificationapi.Ii1X0iO;
import com.android.mltcode.paycertificationapi.O1XIXiXX;
import com.android.mltcode.paycertificationapi.O1iiXO;
import com.android.mltcode.paycertificationapi.OXXII1;
import com.android.mltcode.paycertificationapi.OiI0X011;
import com.android.mltcode.paycertificationapi.XO1I1;
import com.android.mltcode.paycertificationapi.XX11iX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.iX1I0I0O;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.baidu.platform.comapi.map.MapController;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.item.AISearchTopItem;
import com.sma.smartv3.ui.ai.item.SearchAIFillingItem;
import com.sma.smartv3.ui.ai.item.SearchAIFunctionItem;
import java.util.ArrayList;
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
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCourseSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseSearchActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseSearchActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,279:1\n55#2,12:280\n84#2,3:292\n1869#3,2:295\n1563#3:300\n1634#3,2:301\n1636#3:304\n1869#3,2:309\n1869#3,2:311\n39#4,3:297\n42#4:303\n44#4,2:305\n31#4,2:307\n31#4,2:313\n*S KotlinDebug\n*F\n+ 1 CourseSearchActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseSearchActivity\n*L\n77#1:280,12\n77#1:292,3\n145#1:295,2\n157#1:300\n157#1:301,2\n157#1:304\n190#1:309,2\n213#1:311,2\n157#1:297,3\n157#1:303\n157#1:305,2\n239#1:307,2\n263#1:313,2\n*E\n"})
public final class CourseSearchActivity extends BaseDSLRecyclerActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static final int SEARCH_FILLING = 255;
    private static final int SEARCH_INITIAL = 253;
    private static final int SEARCH_RESULT = 254;
    private boolean isProgrammaticallySet;
    private int mAdapterType;

    @tb1
    private go0 mAllDeleteTipPopup;

    @tb1
    private List<String> mRecords;

    @aa1
    private final Lazy searchView$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 CourseSearchActivity.kt\ncom/sma/smartv3/ui/sport/course/CourseSearchActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n78#2,4:83\n59#3:87\n62#4:88\n*E\n"})
    public static final class XIi00iiXO implements TextWatcher {
        public final /* synthetic */ CourseSearchActivity IO;

        public XIi00iiXO(CourseSearchActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r2) {
            if (this.IO.isProgrammaticallySet() == true) goto L6;
            CourseSearchActivity.access$editChanged(this.IO, r2);
            return;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class iO implements TextView.OnEditorActionListener {
        public final /* synthetic */ CourseSearchActivity IO;

        public iO(CourseSearchActivity r1) {
            this.IO = r1;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView r1, int r2, KeyEvent r3) {
            if (r2 != 0) goto L4;
        L7:
            Editable r4 = CourseSearchActivity.access$getSearchView(this.IO).getText();
            this.IO.saveRecords(r4.toString());
            CourseSearchActivity.access$editChanged(this.IO, r4);
            return true;
        L4:
            if (r2 == 6) goto L7;
            return false;
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public CourseSearchActivity() {
        this.searchView$delegate = LazyKt__LazyJVMKt.iO(new XX11iX(this));
        this.mAdapterType = 253;
    }

    public static /* synthetic */ Unit I0iXXO(CourseSearchActivity r0, DslAdapter r1, List r2) {
        return showData$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1XOi1(CourseSearchActivity r0, AIFunction r1, View r2) {
        return showData$lambda$0$0$2$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit IIX1OXO(AISearchTopItem r0) {
        return showData$lambda$0$0$3(r0);
    }

    public static /* synthetic */ EditText O10IXXX0X(CourseSearchActivity r0) {
        return searchView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OII(AISearchTopItem r0) {
        return showData$lambda$0$0$1(r0);
    }

    public static /* synthetic */ Unit OX(AIFunction r0, CourseSearchActivity r1, SearchAIFunctionItem r2) {
        return showData$lambda$0$0$4$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OiIIX101O(CourseSearchActivity r0, AIFunction r1, SearchAIFillingItem r2, View r3) {
        return showData$lambda$0$0$2$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit X0O(AISearchTopItem r0) {
        return showData$lambda$0$0$0(r0);
    }

    public static /* synthetic */ boolean X1ii() {
        return showDeleteTipPopup$lambda$0$0();
    }

    public static /* synthetic */ Unit XX0(CourseSearchActivity r0, List r1, DslAdapter r2) {
        return showData$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XXI(CourseSearchActivity r0, AIFunction r1, View r2) {
        return showData$lambda$0$0$4$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean XiOIO(CourseSearchActivity r0) {
        return showDeleteTipPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit XiOIii1(AIFunction r0, CourseSearchActivity r1, SearchAIFillingItem r2) {
        return showData$lambda$0$0$2$0(r0, r1, r2);
    }

    public static final /* synthetic */ void access$editChanged(CourseSearchActivity r0, Editable r1) {
        r0.editChanged(r1);
    }

    public static final /* synthetic */ EditText access$getSearchView(CourseSearchActivity r0) {
        return r0.getSearchView();
    }

    private final void editChanged(Editable r2) {
        if (r2 != null) goto L4;
    L6:
        int r0 = 255;
    L7:
        this.mAdapterType = r0;
        notifyDataChanged(String.valueOf(r2));
        return;
    L4:
        if (r2.length() != 0) goto L6;
        r0 = 253;
        goto L7
    }

    private final EditText getSearchView() {
        return (EditText) getValue();
    }

    public static /* synthetic */ Unit iIiiO(DslAdapter r0) {
        return showData$lambda$0$0$5(r0);
    }

    public static /* synthetic */ List initList$default(CourseSearchActivity r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = "";
    L6:
        return r0.initList(r1);
    }

    private static final EditText searchView_delegate$lambda$0(CourseSearchActivity r1) {
        return (EditText) r1.findViewById(R.id.search_view);
    }

    private final void showData(String r4) {
        final List<AIFunction> r5 = initList(r4);
        View r0 = findViewById(R.id.rv_empty);
        if (r5.isEmpty() == true) goto L5;
    L7:
        int r1 = 8;
    L8:
        r0.setVisibility(r1);
        renderAdapter(new I0OIXI10O(this, r5));
        return;
    L5:
        if (this.mAdapterType == 253) goto L7;
        r1 = 0;
        goto L8
    }

    public static /* synthetic */ void showData$default(CourseSearchActivity r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        r0.showData(r1);
    }

    private static final Unit showData$lambda$0(final CourseSearchActivity r2, final List r3, final DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r4.clearAllItems();
        DslAdapter.setAdapterStatus$default(r4, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(100, new I011(r2, r4, r3));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(final CourseSearchActivity r6, DslAdapter r7, List r8) {
        switch(r6.mAdapterType) {
            case 253: goto L16;
            case 254: goto L12;
            case 255: goto L6;
            default: goto L17;
        };
    L12:
        List<String> r1 = r6.mRecords;
        Intrinsics.XXI(r1);
        DslAdapterExKt.X0O(r7, new AISearchTopItem(r1), new O1iiXO());
        Iterator r9 = r8.iterator();
    L14:
        if (r9.hasNext() == false) goto L17;
        final AIFunction r0 = (AIFunction) r9.next();
        DslAdapterExKt.X0O(r6.getDslAdapter(), new SearchAIFunctionItem(), new OiI0X011(r0, r6));
        goto L14
    L16:
        List<String> r10 = r6.mRecords;
        Intrinsics.XXI(r10);
        DslAdapterExKt.X0O(r7, new AISearchTopItem(r10), new IO0000IOX());
    L17:
        DslAdapter.render$default(r7, false, null, new O1XIXiXX(), 3, null);
        return Unit.OXO1;
    L6:
        if (r8.isEmpty() == false) goto L8;
        List<String> r11 = r6.mRecords;
        Intrinsics.XXI(r11);
        DslAdapterExKt.X0O(r7, new AISearchTopItem(r11), new OXXII1());
        goto L17
    L8:
        Iterator r12 = r8.iterator();
    L10:
        if (r12.hasNext() == false) goto L17;
        final AIFunction r2 = (AIFunction) r12.next();
        DslAdapterExKt.X0O(r6.getDslAdapter(), new SearchAIFillingItem(), new I101O0I(r2, r6));
        goto L10
    }

    private static final Unit showData$lambda$0$0$0(AISearchTopItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$1(AISearchTopItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$2$0(final AIFunction r1, final CourseSearchActivity r2, final SearchAIFillingItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemData(r1);
        r3.setItemClick(new iX1I0I0O(r2, r1, r3));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$2$0$0(final CourseSearchActivity r1, final AIFunction r2, SearchAIFillingItem r3, View r4) {
        Intrinsics.X0O(r4, "it");
        r1.saveRecords(r2.getTitle());
        r3.setItemClick(new I1XX0XOi(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$2$0$0$0(CourseSearchActivity r1, AIFunction r2, View r3) {
        Intrinsics.X0O(r3, "it");
        AIFunctionDataKt.toAIFunction(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$3(AISearchTopItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$4$0(final AIFunction r1, final CourseSearchActivity r2, SearchAIFunctionItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemData(r1);
        r3.setItemClick(new IXi11iX(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$4$0$0(CourseSearchActivity r1, AIFunction r2, View r3) {
        Intrinsics.X0O(r3, "it");
        AIFunctionDataKt.toAIFunction(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$5(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    private static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$0$1(CourseSearchActivity r4) {
        List<String> r0 = r4.mRecords;
        List<String> r1 = null;
        if (r0 == null) goto L5;
        List r2 = CollectionsKt___CollectionsKt.OO0Oi10(r0);
    L6:
        if (r2 == null) goto L8;
        r2.clear();
    L8:
        if (r2 == null) goto L10;
        r1 = CollectionsKt___CollectionsKt.i0I0O111I(r2);
    L10:
        r4.mRecords = r1;
        SPUtils r3 = a01.OXO1.IiI10X();
        Intrinsics.XXI(r2);
        r3.put(String.class.getName() + is3.OXO1, new Gson().toJson(r2));
        ToastUtils.showLong(R.string.clear_success);
        r4.notifyDataChanged(r4.getSearchView().getText().toString());
        return true;
    L5:
        r2 = null;
        goto L6
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @sf5(tag = I01XX0.X11I)
    public final void clearRecords(@aa1 String r2) {
        Intrinsics.X0O(r2, MapController.ITEM_LAYER_TAG);
        showDeleteTipPopup();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<AIFunction> initList(@aa1 String r6) {
        Intrinsics.X0O(r6, "newText");
        List<AIFunction> r0 = AIFunctionDataKt.getAIFunction();
        ArrayList r1 = new ArrayList();
        if (r6.length() <= 0) goto L10;
        Iterator<T> r2 = r0.iterator();
    L6:
        if (r2.hasNext() == false) goto L10;
        AIFunction r3 = (AIFunction) r2.next();
        if (StringsKt__StringsKt.iOiXX(r3.getTitle(), r6, true) == false) goto L6;
        r1.add(r3);
    L10:
        return r1;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        transparentStatusBar();
        getSearchView().setText("功能开发中..");
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        EditText r0 = getSearchView();
        Intrinsics.O10IXXX0X(r0, "<get-searchView>(...)");
        r0.addTextChangedListener(new XIi00iiXO(this));
        getSearchView().setOnEditorActionListener(new iO(this));
        notifyDataChanged("");
    }

    public final boolean isProgrammaticallySet() {
        return this.isProgrammaticallySet;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_search_func;
    }

    public final void notifyDataChanged(@aa1 String r2) {
        Intrinsics.X0O(r2, MapController.ITEM_LAYER_TAG);
        showData(r2);
        if (getDslAdapter() == null) goto L6;
        getDslAdapter().notifyDataSetChanged();
        return;
    }

    @sf5(tag = I01XX0.iiiO)
    public final void onCodePairChange(@aa1 String r5) {
        Intrinsics.X0O(r5, MapController.ITEM_LAYER_TAG);
        this.mAdapterType = 254;
        this.isProgrammaticallySet = true;
        getSearchView().setText(r5);
        saveRecords(r5);
        getSearchView().setSelection(r5.length());
        this.isProgrammaticallySet = false;
        List<AIFunction> r2 = initList(r5);
        if (r2.size() == 1) goto L5;
    L8:
        notifyDataChanged(r5);
        return;
    L5:
        if (Intrinsics.XOO0ii0(r2.get(0).getTitle(), r5) == false) goto L8;
        AIFunctionDataKt.toAIFunction(this, r2.get(0));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getDslAdapter() != null) goto L13;
        return;
    L13:
        JsonArray r1 = JsonParser.parseString(a01.OXO1.IiI10X().getString(String.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L10
        Intrinsics.XXI(r1);     // Catch: Exception -> L10
        List r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L10
        Iterator<JsonElement> r3 = r1.iterator();     // Catch: Exception -> L10
    L7:
        if (r3.hasNext() == false) goto L11;
        r2.add(new Gson().fromJson(r3.next(), String.class));     // Catch: Exception -> L10
    L11:
        this.mRecords = r2;
        getDslAdapter().notifyDataSetChanged();
        return;
    L10:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L11
    }

    public final void onSearch(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        String r3 = getSearchView().getText().toString();
        this.mAdapterType = 254;
        saveRecords(r3);
        notifyDataChanged(r3);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void saveRecords(@aa1 String r4) {
        Intrinsics.X0O(r4, "text");
        List<String> r0 = this.mRecords;
        if (r0 == null) goto L5;
        List r1 = CollectionsKt___CollectionsKt.OO0Oi10(r0);
    L6:
        Intrinsics.XXI(r1);
        if (r1.contains(r4) == false) goto L9;
        return;
    L9:
        if (r1.size() <= 10) goto L11;
        r1.remove(0);
    L11:
        r1.add(r4);
        this.mRecords = CollectionsKt___CollectionsKt.i0I0O111I(r1);
        a01.OXO1.IiI10X().put(String.class.getName() + is3.OXO1, new Gson().toJson(r1));
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final void setProgrammaticallySet(boolean r1) {
        this.isProgrammaticallySet = r1;
    }

    public final void showDeleteTipPopup() {
        if (this.mAllDeleteTipPopup != null) goto L5;
        int r3 = 0;
        go0 r0 = new go0(this, r3, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(R.string.clear_ai_chat_records));
        r0.iX1O1(Integer.valueOf(R.string.cancel), new Ii1X0iO());
        r0.X1IX(R.string.confirm, new XO1I1(this));
        this.mAllDeleteTipPopup = r0;
    L5:
        go0 r1 = this.mAllDeleteTipPopup;
        if (r1 == null) goto L9;
        r1.IIX1OXO();
        return;
    }
}
