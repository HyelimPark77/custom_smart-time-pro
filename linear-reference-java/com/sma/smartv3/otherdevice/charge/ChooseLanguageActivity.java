package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.III11XI0;
import com.android.mltcode.paycertificationapi.Ii10X;
import com.android.mltcode.paycertificationapi.O001;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OO0X0X0;
import com.android.mltcode.paycertificationapi.OOXX1XOOX;
import com.android.mltcode.paycertificationapi.OXX0I1IIO;
import com.android.mltcode.paycertificationapi.X01iXOO00;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1i0;
import com.android.mltcode.paycertificationapi.iIi0O1X0;
import com.android.mltcode.paycertificationapi.iXX0OI101;
import com.android.mltcode.paycertificationapi.iXXO;
import com.android.mltcode.paycertificationapi.iiXO0Xi;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q04;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.ItemSelectorHelperKt;
import com.angcyo.dsladapter.iO;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.translate.sparkchain.XO0O10;
import com.sma.smartv3.util.FileTransferTextManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nChooseLanguageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,245:1\n774#2:246\n865#2,2:247\n1563#2:252\n1634#2,2:253\n1636#2:256\n1761#2,3:259\n1563#2:279\n1634#2,3:280\n1869#2,2:283\n39#3,3:249\n42#3:255\n44#3,2:257\n31#3,2:262\n55#4,12:264\n84#4,3:276\n*S KotlinDebug\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n*L\n61#1:246\n61#1:247,2\n70#1:252\n70#1:253,2\n70#1:256\n77#1:259,3\n150#1:279\n150#1:280,3\n155#1:283,2\n70#1:249,3\n70#1:255\n70#1:257,2\n86#1:262,2\n103#1:264,12\n103#1:276,3\n*E\n"})
public class ChooseLanguageActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;
    private boolean isSelectorAll;

    @aa1
    private List<LanguageTranslationData> mAllLanguageList;

    @aa1
    private List<LanguageTranslationData> mHistoryLanguageList;
    public LanguageTranslationData mLanguageTranslationData;

    @aa1
    private final Lazy mSearchEdit$delegate;

    @aa1
    private final Lazy mSearchIcon$delegate;
    private int mType;
    private long textChangedLastTime;

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n104#2,6:83\n59#3:89\n62#4:90\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public final /* synthetic */ ChooseLanguageActivity IO;

        public OXO1(ChooseLanguageActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r7) {
            long r0 = System.currentTimeMillis();
            if ((r0 - this.IO.getTextChangedLastTime()) <= 500) goto L6;
            this.IO.setTextChangedLastTime(r0);
            this.IO.searchName(StringsKt__StringsKt.iX1X1(String.valueOf(r7)).toString());
            return;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }
    }

    public static final class XIi00iiXO implements iO {
        public final /* synthetic */ ChooseLanguageActivity OXO1;

        public XIi00iiXO(ChooseLanguageActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.angcyo.dsladapter.iO
        public void OXO1(List<DslAdapterItem> r2, List<Integer> r3, boolean r4, q04 r5) {
            Intrinsics.X0O(r2, "selectorItems");
            Intrinsics.X0O(r3, "selectorIndexList");
            Intrinsics.X0O(r5, "selectorParams");
            iO.OXO1.OXO1(this, r2, r3, r4, r5);
            this.OXO1.setSelectorAll(r4);
        }

        @Override // com.angcyo.dsladapter.iO
        public /* bridge */ void XIi00iiXO(int r1, int r2) {
            iO.OXO1.XIi00iiXO(this, r1, r2);
        }
    }

    public ChooseLanguageActivity() {
        this.TAG = "ChooseLanguageActivity";
        this.mSearchEdit$delegate = LazyKt__LazyJVMKt.iO(new Ii10X(this));
        this.mSearchIcon$delegate = LazyKt__LazyJVMKt.iO(new i1i0(this));
        this.mAllLanguageList = new ArrayList();
        this.mHistoryLanguageList = new ArrayList();
    }

    public static /* synthetic */ ImageView I0iXXO(ChooseLanguageActivity r0) {
        return mSearchIcon_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(LanguageTranslationData r0, ChooseLanguageActivity r1, DslAdapter r2, DslAdapterItem r3) {
        return setData$lambda$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ void IIX1OXO(ChooseLanguageActivity r0, LanguageTranslationData r1, ImageView r2, DslAdapter r3, View r4) {
        setData$lambda$0$0$1$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ boolean O10IXXX0X(Set r0, LanguageTranslationData r1) {
        return onInitBaseLayoutAfter$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(List r0, ChooseLanguageActivity r1, DslAdapter r2) {
        return setData$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(ChooseLanguageActivity r0, List r1, DslAdapter r2) {
        return setData$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit X1ii(LanguageTranslationData r0, DslAdapterItem r1) {
        return setData$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ void XX0(ChooseLanguageActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit XXI(LanguageTranslationData r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return setData$lambda$0$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ EditText XiOIO(ChooseLanguageActivity r0) {
        return mSearchEdit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIii1(DslAdapter r0) {
        return setData$lambda$0$0$2(r0);
    }

    private final List<LanguageTranslationData> getLanguageList() {
        int r0 = this.mType;
        if (r0 == 1) goto L19;
        if (r0 == 2) goto L17;
        if (r0 == 3) goto L15;
        if (r0 == 4) goto L13;
        return CollectionsKt___CollectionsKt.OO0Oi10(LanguageTranslationKt.getTranslationLanguageList());
    L13:
        return CollectionsKt___CollectionsKt.OO0Oi10(XO0O10.IO.XIi00iiXO());
    L15:
        return CollectionsKt___CollectionsKt.OO0Oi10(XO0O10.IO.iO());
    L17:
        return FileTransferTextManager.OXO1.iO();
    L19:
        return CollectionsKt___CollectionsKt.OO0Oi10(LanguageTranslationKt.getCallTranslationLanguageList());
    }

    public static /* synthetic */ Unit iIiiO(LanguageTranslationData r0, ChooseLanguageActivity r1, DslAdapter r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        return setData$lambda$0$0$1$0(r0, r1, r2, r3, r4, r5, r6);
    }

    private static final void initView$lambda$1(ChooseLanguageActivity r0, View r1) {
        r0.searchName(StringsKt__StringsKt.iX1X1(r0.getMSearchEdit().getText().toString()).toString());
    }

    private static final EditText mSearchEdit_delegate$lambda$0(ChooseLanguageActivity r1) {
        return (EditText) r1.findViewById(R.id.choose_language_search_text);
    }

    private static final ImageView mSearchIcon_delegate$lambda$0(ChooseLanguageActivity r1) {
        return (ImageView) r1.findViewById(R.id.choose_language_search_icon);
    }

    private static final boolean onInitBaseLayoutAfter$lambda$1(Set r1, LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "it");
        return r1.contains(r2.getName());
    }

    private static final Unit setData$lambda$0(final ChooseLanguageActivity r2, final List r3, final DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r2.getDslAdapter().clearAllItems();
        r4.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(r4, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(50, new OO0X0X0(r3, r2, r4));
        return Unit.OXO1;
    }

    private static final Unit setData$lambda$0$0(List r9, final ChooseLanguageActivity r10, final DslAdapter r11) {
        Iterator r12 = r9.iterator();
    L4:
        if (r12.hasNext() == false) goto L9;
        final LanguageTranslationData r0 = (LanguageTranslationData) r12.next();
        if (r0.getType() == 1) goto L7;
        DslAdapterExKt.O10IXXX0X(r10.getDslAdapter(), R.layout.item_list_choose_language, new iIi0O1X0(r0, r10, r11));
        goto L4
    L7:
        DslAdapterExKt.O10IXXX0X(r10.getDslAdapter(), R.layout.item_list_choose_language_title, new X01iXOO00(r0));
        goto L4
    L9:
        DslAdapter.render$default(r11, false, null, new iiXO0Xi(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit setData$lambda$0$0$0(final LanguageTranslationData r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new iXXO(r1));
        return Unit.OXO1;
    }

    private static final Unit setData$lambda$0$0$0$0(LanguageTranslationData r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "adapterItem");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv);
        if (r5 == null) goto L6;
        r5.setText(r0.getName());
    L6:
        return Unit.OXO1;
    }

    private static final Unit setData$lambda$0$0$1(final LanguageTranslationData r1, final ChooseLanguageActivity r2, final DslAdapter r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemBindOverride(new III11XI0(r1, r2, r3));
        return Unit.OXO1;
    }

    private static final Unit setData$lambda$0$0$1$0(final LanguageTranslationData r0, final ChooseLanguageActivity r1, final DslAdapter r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "adapterItem");
        Intrinsics.X0O(r6, "<unused var>");
        TextView r7 = r3.tv(R.id.tv);
        if (r7 == null) goto L5;
        r7.setText(r0.getName());
    L5:
        final ImageView r8 = r3.img(R.id.list_item_choose_iv);
        if (Intrinsics.XOO0ii0(r1.getMLanguageTranslationData().getName(), r0.getName()) == false) goto L8;
        Intrinsics.XXI(r8);
        Glide.with(r8.getContext()).load(Integer.valueOf(R.drawable.file_check_icon)).into(r8);
    L9:
        r3.itemView.setOnClickListener(new OOXX1XOOX(r1, r0, r8, r2));
        r8.setVisibility(0);
        return Unit.OXO1;
    L8:
        Intrinsics.XXI(r8);
        Glide.with(r8.getContext()).load(Integer.valueOf(R.drawable.file_uncheck_icon)).into(r8);
        goto L9
    }

    private static final void setData$lambda$0$0$1$0$0(ChooseLanguageActivity r1, LanguageTranslationData r2, ImageView r3, DslAdapter r4, View r5) {
        if (Intrinsics.XOO0ii0(r1.getMLanguageTranslationData().getName(), r2.getName()) == true) goto L13;
        Glide.with(r3.getContext()).load(Integer.valueOf(R.drawable.file_check_icon)).into(r3);
        r1.setMLanguageTranslationData(r2);
        r4.notifyDataChanged();
        int r6 = r1.mType;
        if (r6 != 1) goto L7;
    L11:
        r1.saveListSuccess();
        return;
    L7:
        if (r6 == 2) goto L11;
        r1.putHistoryLanguageList(r2);
        return;
    L13:
        r1.saveListSuccess();
    }

    private static final Unit setData$lambda$0$0$2(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    public final void getHistoryLanguageList() {
        JsonArray r1 = JsonParser.parseString(a01.OXO1.OXO1().getString(LanguageTranslationData.class.getName() + is3.OXO1)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r1);     // Catch: Exception -> L8
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r3 = r1.iterator();     // Catch: Exception -> L8
    L5:
        if (r3.hasNext() == false) goto L9;
        r2.add(new Gson().fromJson(r3.next(), LanguageTranslationData.class));     // Catch: Exception -> L8
    L9:
        this.mHistoryLanguageList = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        return;
    L8:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }

    @aa1
    public final List<LanguageTranslationData> getMHistoryLanguageList() {
        return this.mHistoryLanguageList;
    }

    @aa1
    public final LanguageTranslationData getMLanguageTranslationData() {
        LanguageTranslationData r0 = this.mLanguageTranslationData;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mLanguageTranslationData");
        return null;
    }

    public final EditText getMSearchEdit() {
        return (EditText) getValue();
    }

    public final ImageView getMSearchIcon() {
        return (ImageView) getValue();
    }

    public final int getMType() {
        return this.mType;
    }

    public final long getTextChangedLastTime() {
        return this.textChangedLastTime;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        this.mType = getMArg1();
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        setMLanguageTranslationData((LanguageTranslationData) r3);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.translation_language));
        EditText r0 = getMSearchEdit();
        Intrinsics.O10IXXX0X(r0, "<get-mSearchEdit>(...)");
        r0.addTextChangedListener(new OXO1(this));
        getMSearchIcon().setOnClickListener(new O001(this));
        getDslAdapter().getItemSelectorHelper().iX1O1(new XIi00iiXO(this));
        DslAdapterItem r2 = null;
        boolean r4 = false;
        boolean r5 = false;
        boolean r6 = false;
        Object r7 = null;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        Object r11 = null;
        getDslAdapter().getItemSelectorHelper().O1O(new q04(r2, ItemSelectorHelperKt.XiOIii1(false), r4, r5, r6, r7, r8, r9, r10, r11, 1021, null));
        getDslAdapter().getItemSelectorHelper().X11iII1O1(1);
    }

    public final boolean isSelectorAll() {
        return this.isSelectorAll;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_choose_language;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        List<LanguageTranslationData> r1 = getLanguageList();
        int r2 = this.mType;
        if (r2 != 1) goto L5;
    L19:
        this.mAllLanguageList.addAll(r1);
        setData(this.mAllLanguageList);
        return;
    L5:
        if (r2 == 2) goto L19;
        getHistoryLanguageList();
        LanguageTranslationKt.clearTranslationLanguageList();
        if (this.mHistoryLanguageList.size() <= 0) goto L18;
        List<LanguageTranslationData> r3 = this.mHistoryLanguageList;
        ArrayList r6 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator<T> r4 = r3.iterator();
    L11:
        if (r4.hasNext() == false) goto L13;
        r6.add(((LanguageTranslationData) r4.next()).getName());
        goto L11
    L13:
        final Set r5 = CollectionsKt___CollectionsKt.i1(r6);
        OIXO1IIOO.iIX0i(r1, new iXX0OI101(r5));
        String r8 = getString(R.string.choose_language_all);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        r1.add(0, new LanguageTranslationData(r8, null, null, null, false, 0, null, 1, 126, null));
        Iterator<T> r7 = this.mHistoryLanguageList.iterator();
    L15:
        if (r7.hasNext() == false) goto L17;
        r1.add(0, (LanguageTranslationData) r7.next());
        goto L15
    L17:
        String r9 = getString(R.string.choose_language_recently_used);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        r1.add(0, new LanguageTranslationData(r9, null, null, null, false, 0, null, 1, 126, null));
        goto L19
    L18:
        String r10 = getString(R.string.choose_language_all);
        Intrinsics.O10IXXX0X(r10, "getString(...)");
        r1.add(0, new LanguageTranslationData(r10, null, null, null, false, 0, null, 1, 126, null));
        goto L19
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void putHistoryLanguageList(@aa1 LanguageTranslationData r5) {
        Intrinsics.X0O(r5, "mLanguageTranslationData");
        List<LanguageTranslationData> r0 = this.mHistoryLanguageList;
        if ((r0 instanceof Collection) == true) goto L5;
    L7:
        Iterator<T> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L14;
        if (Intrinsics.XOO0ii0(((LanguageTranslationData) r1.next()).getName(), r5.getName()) == false) goto L9;
    L18:
        saveListSuccess();
        return;
    L14:
        if (this.mHistoryLanguageList.size() >= 3) goto L16;
        this.mHistoryLanguageList.add(r5);
    L17:
        i1O0OXO1O.OXO1.OXO1(this.TAG + "  putHistoryLanguageList  mHistoryLanguageList = " + this.mHistoryLanguageList + "  mLanguageTranslationData = " + r5);
        SPUtils r6 = a01.OXO1.OXO1();
        List<LanguageTranslationData> r2 = this.mHistoryLanguageList;
        StringBuilder r3 = new StringBuilder();
        r3.append(LanguageTranslationData.class.getName());
        r3.append(is3.OXO1);
        r6.put(r3.toString(), new Gson().toJson(r2));
        goto L18
    L16:
        this.mHistoryLanguageList.remove(0);
        this.mHistoryLanguageList.add(r5);
        goto L17
    L5:
        if (r0.isEmpty() == false) goto L7;
        goto L7
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public void saveListSuccess() {
        Intent r0 = getIntent();
        r0.putExtra("language", getMLanguageTranslationData());
        setResult(-1, r0);
        finish();
    }

    public final void searchName(@aa1 String r8) {
        Intrinsics.X0O(r8, "text");
        if (r8.length() != 0) goto L6;
        setData(this.mAllLanguageList);
        return;
    L6:
        List<LanguageTranslationData> r0 = this.mAllLanguageList;
        ArrayList r1 = new ArrayList();
        Iterator<T> r2 = r0.iterator();
    L8:
        if (r2.hasNext() == false) goto L12;
        Object r3 = r2.next();
        if (StringsKt__StringsKt.iIi011O(((LanguageTranslationData) r3).getName(), r8, false, 2, null) == false) goto L8;
        r1.add(r3);
        goto L8
    L12:
        setData(r1);
    }

    public void setData(@aa1 final List<LanguageTranslationData> r2) {
        Intrinsics.X0O(r2, "list");
        if (r2.isEmpty() == false) goto L5;
        return;
    L5:
        renderAdapter(new OXX0I1IIO(this, r2));
    }

    public final void setMHistoryLanguageList(@aa1 List<LanguageTranslationData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHistoryLanguageList = r2;
    }

    public final void setMLanguageTranslationData(@aa1 LanguageTranslationData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLanguageTranslationData = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setSelectorAll(boolean r1) {
        this.isSelectorAll = r1;
    }

    public final void setTextChangedLastTime(long r1) {
        this.textChangedLastTime = r1;
    }
}
