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
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.is3;
import com.android.mltcode.paycertificationapi.q04;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.InterfaceC3284iO;
import com.angcyo.dsladapter.ItemSelectorHelperKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.model.LanguageTranslationKt;
import com.sma.smartv3.otherdevice.charge.ChooseLanguageActivity;
import com.sma.smartv3.p610ui.translate.sparkchain.XO0O10;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nChooseLanguageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,245:1\n774#2:246\n865#2,2:247\n1563#2:252\n1634#2,2:253\n1636#2:256\n1761#2,3:259\n1563#2:279\n1634#2,3:280\n1869#2,2:283\n39#3,3:249\n42#3:255\n44#3,2:257\n31#3,2:262\n55#4,12:264\n84#4,3:276\n*S KotlinDebug\n*F\n+ 1 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n*L\n61#1:246\n61#1:247,2\n70#1:252\n70#1:253,2\n70#1:256\n77#1:259,3\n150#1:279\n150#1:280,3\n155#1:283,2\n70#1:249,3\n70#1:255\n70#1:257,2\n86#1:262,2\n103#1:264,12\n103#1:276,3\n*E\n"})
public class ChooseLanguageActivity extends BaseDSLRecyclerActivity {
    private boolean isSelectorAll;
    public LanguageTranslationData mLanguageTranslationData;
    private int mType;
    private long textChangedLastTime;

    @aa1
    private final String TAG = "ChooseLanguageActivity";

    @aa1
    private final Lazy mSearchEdit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Ii10X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChooseLanguageActivity.mSearchEdit_delegate$lambda$0(this.f2195IO);
        }
    });

    @aa1
    private final Lazy mSearchIcon$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1i0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ChooseLanguageActivity.mSearchIcon_delegate$lambda$0(this.f7701IO);
        }
    });

    @aa1
    private List<LanguageTranslationData> mAllLanguageList = new ArrayList();

    @aa1
    private List<LanguageTranslationData> mHistoryLanguageList = new ArrayList();

    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ChooseLanguageActivity.kt\ncom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n104#2,6:83\n59#3:89\n62#4:90\n*E\n"})
    public static final class OXO1 implements TextWatcher {
        public OXO1() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - ChooseLanguageActivity.this.getTextChangedLastTime() > 500) {
                ChooseLanguageActivity.this.setTextChangedLastTime(jCurrentTimeMillis);
                ChooseLanguageActivity.this.searchName(StringsKt__StringsKt.iX1X1(String.valueOf(editable)).toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class XIi00iiXO implements InterfaceC3284iO {
        public XIi00iiXO() {
        }

        @Override // com.angcyo.dsladapter.InterfaceC3284iO
        public void OXO1(List<DslAdapterItem> selectorItems, List<Integer> selectorIndexList, boolean z, q04 selectorParams) {
            Intrinsics.X0O(selectorItems, "selectorItems");
            Intrinsics.X0O(selectorIndexList, "selectorIndexList");
            Intrinsics.X0O(selectorParams, "selectorParams");
            InterfaceC3284iO.OXO1.OXO1(this, selectorItems, selectorIndexList, z, selectorParams);
            ChooseLanguageActivity.this.setSelectorAll(z);
        }

        @Override // com.angcyo.dsladapter.InterfaceC3284iO
        public /* bridge */ void XIi00iiXO(int i, int i2) {
            InterfaceC3284iO.OXO1.XIi00iiXO(this, i, i2);
        }
    }

    private final List<LanguageTranslationData> getLanguageList() {
        int i = this.mType;
        if (i == 1) {
            return CollectionsKt___CollectionsKt.OO0Oi10(LanguageTranslationKt.getCallTranslationLanguageList());
        }
        if (i == 2) {
            return FileTransferTextManager.OXO1.m38807iO();
        }
        if (i != 3) {
            return i != 4 ? CollectionsKt___CollectionsKt.OO0Oi10(LanguageTranslationKt.getTranslationLanguageList()) : CollectionsKt___CollectionsKt.OO0Oi10(XO0O10.f54862IO.XIi00iiXO());
        }
        return CollectionsKt___CollectionsKt.OO0Oi10(XO0O10.f54862IO.m38785iO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ChooseLanguageActivity chooseLanguageActivity, View view) {
        chooseLanguageActivity.searchName(StringsKt__StringsKt.iX1X1(chooseLanguageActivity.getMSearchEdit().getText().toString()).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mSearchEdit_delegate$lambda$0(ChooseLanguageActivity chooseLanguageActivity) {
        return (EditText) chooseLanguageActivity.findViewById(R.id.choose_language_search_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mSearchIcon_delegate$lambda$0(ChooseLanguageActivity chooseLanguageActivity) {
        return (ImageView) chooseLanguageActivity.findViewById(R.id.choose_language_search_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onInitBaseLayoutAfter$lambda$1(Set set, LanguageTranslationData it) {
        Intrinsics.X0O(it, "it");
        return set.contains(it.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0(final ChooseLanguageActivity chooseLanguageActivity, final List list, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        chooseLanguageActivity.getDslAdapter().clearAllItems();
        renderAdapter.getItemSelectorHelper().X11iII1O1(1);
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        chooseLanguageActivity.getDslViewHolder().postDelay(50L, new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0X0X0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return ChooseLanguageActivity.setData$lambda$0$0(list, chooseLanguageActivity, renderAdapter);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$0(List list, final ChooseLanguageActivity chooseLanguageActivity, final DslAdapter dslAdapter) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final LanguageTranslationData languageTranslationData = (LanguageTranslationData) it.next();
            if (languageTranslationData.getType() == 1) {
                DslAdapterExKt.O10IXXX0X(chooseLanguageActivity.getDslAdapter(), R.layout.item_list_choose_language_title, new Function1() { // from class: com.android.mltcode.paycertificationapi.X01iXOO00
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ChooseLanguageActivity.setData$lambda$0$0$0(languageTranslationData, (DslAdapterItem) obj);
                    }
                });
            } else {
                DslAdapterExKt.O10IXXX0X(chooseLanguageActivity.getDslAdapter(), R.layout.item_list_choose_language, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIi0O1X0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ChooseLanguageActivity.setData$lambda$0$0$1(languageTranslationData, chooseLanguageActivity, dslAdapter, (DslAdapterItem) obj);
                    }
                });
            }
        }
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iiXO0Xi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChooseLanguageActivity.setData$lambda$0$0$2((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$0$0(final LanguageTranslationData languageTranslationData, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iXXO
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ChooseLanguageActivity.setData$lambda$0$0$0$0(languageTranslationData, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$0$0$0(LanguageTranslationData languageTranslationData, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(languageTranslationData.getName());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$0$1(final LanguageTranslationData languageTranslationData, final ChooseLanguageActivity chooseLanguageActivity, final DslAdapter dslAdapter, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.III11XI0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ChooseLanguageActivity.setData$lambda$0$0$1$0(languageTranslationData, chooseLanguageActivity, dslAdapter, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$0$1$0(final LanguageTranslationData languageTranslationData, final ChooseLanguageActivity chooseLanguageActivity, final DslAdapter dslAdapter, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.f51423tv);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(languageTranslationData.getName());
        }
        final ImageView imageViewImg = itemHolder.img(R.id.list_item_choose_iv);
        if (Intrinsics.XOO0ii0(chooseLanguageActivity.getMLanguageTranslationData().getName(), languageTranslationData.getName())) {
            Intrinsics.XXI(imageViewImg);
            Glide.with(imageViewImg.getContext()).load(Integer.valueOf(R.drawable.file_check_icon)).into(imageViewImg);
        } else {
            Intrinsics.XXI(imageViewImg);
            Glide.with(imageViewImg.getContext()).load(Integer.valueOf(R.drawable.file_uncheck_icon)).into(imageViewImg);
        }
        itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OOXX1XOOX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseLanguageActivity.setData$lambda$0$0$1$0$0(this.f3347IO, languageTranslationData, imageViewImg, dslAdapter, view);
            }
        });
        imageViewImg.setVisibility(0);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$0$0$1$0$0(ChooseLanguageActivity chooseLanguageActivity, LanguageTranslationData languageTranslationData, ImageView imageView, DslAdapter dslAdapter, View view) {
        if (Intrinsics.XOO0ii0(chooseLanguageActivity.getMLanguageTranslationData().getName(), languageTranslationData.getName())) {
            chooseLanguageActivity.saveListSuccess();
            return;
        }
        Glide.with(imageView.getContext()).load(Integer.valueOf(R.drawable.file_check_icon)).into(imageView);
        chooseLanguageActivity.setMLanguageTranslationData(languageTranslationData);
        dslAdapter.notifyDataChanged();
        int i = chooseLanguageActivity.mType;
        if (i == 1 || i == 2) {
            chooseLanguageActivity.saveListSuccess();
        } else {
            chooseLanguageActivity.putHistoryLanguageList(languageTranslationData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$0$2(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    public final void getHistoryLanguageList() {
        Collection collectionM39402iI;
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.OXO1().getString(LanguageTranslationData.class.getName() + is3.OXO1)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), LanguageTranslationData.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        this.mHistoryLanguageList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
    }

    @aa1
    public final List<LanguageTranslationData> getMHistoryLanguageList() {
        return this.mHistoryLanguageList;
    }

    @aa1
    public final LanguageTranslationData getMLanguageTranslationData() {
        LanguageTranslationData languageTranslationData = this.mLanguageTranslationData;
        if (languageTranslationData != null) {
            return languageTranslationData;
        }
        Intrinsics.XXO("mLanguageTranslationData");
        return null;
    }

    public final EditText getMSearchEdit() {
        return (EditText) this.mSearchEdit$delegate.getValue();
    }

    public final ImageView getMSearchIcon() {
        return (ImageView) this.mSearchIcon$delegate.getValue();
    }

    public final int getMType() {
        return this.mType;
    }

    public final long getTextChangedLastTime() {
        return this.textChangedLastTime;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mType = getMArg1();
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.LanguageTranslationData");
        setMLanguageTranslationData((LanguageTranslationData) mArg3);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(getString(R.string.translation_language));
        EditText mSearchEdit = getMSearchEdit();
        Intrinsics.O10IXXX0X(mSearchEdit, "<get-mSearchEdit>(...)");
        mSearchEdit.addTextChangedListener(new OXO1());
        getMSearchIcon().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O001
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseLanguageActivity.initView$lambda$1(this.f2354IO, view);
            }
        });
        getDslAdapter().getItemSelectorHelper().iX1O1(new XIi00iiXO());
        getDslAdapter().getItemSelectorHelper().O1O(new q04(null, ItemSelectorHelperKt.XiOIii1(false), false, false, false, null, false, false, false, null, 1021, null));
        getDslAdapter().getItemSelectorHelper().X11iII1O1(1);
    }

    public final boolean isSelectorAll() {
        return this.isSelectorAll;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_choose_language;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        List<LanguageTranslationData> languageList = getLanguageList();
        int i = this.mType;
        if (i != 1 && i != 2) {
            getHistoryLanguageList();
            LanguageTranslationKt.clearTranslationLanguageList();
            if (this.mHistoryLanguageList.size() > 0) {
                List<LanguageTranslationData> list = this.mHistoryLanguageList;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((LanguageTranslationData) it.next()).getName());
                }
                final Set setM39411i1 = CollectionsKt___CollectionsKt.m39411i1(arrayList);
                OIXO1IIOO.iIX0i(languageList, new Function1() { // from class: com.android.mltcode.paycertificationapi.iXX0OI101
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(ChooseLanguageActivity.onInitBaseLayoutAfter$lambda$1(setM39411i1, (LanguageTranslationData) obj));
                    }
                });
                String string = getString(R.string.choose_language_all);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                languageList.add(0, new LanguageTranslationData(string, null, null, null, false, 0, null, 1, 126, null));
                Iterator<T> it2 = this.mHistoryLanguageList.iterator();
                while (it2.hasNext()) {
                    languageList.add(0, (LanguageTranslationData) it2.next());
                }
                String string2 = getString(R.string.choose_language_recently_used);
                Intrinsics.O10IXXX0X(string2, "getString(...)");
                languageList.add(0, new LanguageTranslationData(string2, null, null, null, false, 0, null, 1, 126, null));
            } else {
                String string3 = getString(R.string.choose_language_all);
                Intrinsics.O10IXXX0X(string3, "getString(...)");
                languageList.add(0, new LanguageTranslationData(string3, null, null, null, false, 0, null, 1, 126, null));
            }
        }
        this.mAllLanguageList.addAll(languageList);
        setData(this.mAllLanguageList);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final void putHistoryLanguageList(@aa1 LanguageTranslationData mLanguageTranslationData) {
        Intrinsics.X0O(mLanguageTranslationData, "mLanguageTranslationData");
        List<LanguageTranslationData> list = this.mHistoryLanguageList;
        if ((list instanceof Collection) && list.isEmpty()) {
            if (this.mHistoryLanguageList.size() < 3) {
                this.mHistoryLanguageList.add(mLanguageTranslationData);
            } else {
                this.mHistoryLanguageList.remove(0);
                this.mHistoryLanguageList.add(mLanguageTranslationData);
            }
            i1O0OXO1O.OXO1.OXO1(this.TAG + "  putHistoryLanguageList  mHistoryLanguageList = " + this.mHistoryLanguageList + "  mLanguageTranslationData = " + mLanguageTranslationData);
            SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
            List<LanguageTranslationData> list2 = this.mHistoryLanguageList;
            StringBuilder sb = new StringBuilder();
            sb.append(LanguageTranslationData.class.getName());
            sb.append(is3.OXO1);
            sPUtilsOXO1.put(sb.toString(), new Gson().toJson(list2));
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.XOO0ii0(((LanguageTranslationData) it.next()).getName(), mLanguageTranslationData.getName())) {
                }
            }
            if (this.mHistoryLanguageList.size() < 3) {
                this.mHistoryLanguageList.add(mLanguageTranslationData);
            } else {
                this.mHistoryLanguageList.remove(0);
                this.mHistoryLanguageList.add(mLanguageTranslationData);
            }
            i1O0OXO1O.OXO1.OXO1(this.TAG + "  putHistoryLanguageList  mHistoryLanguageList = " + this.mHistoryLanguageList + "  mLanguageTranslationData = " + mLanguageTranslationData);
            SPUtils sPUtilsOXO2 = a01.OXO1.OXO1();
            List<LanguageTranslationData> list3 = this.mHistoryLanguageList;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(LanguageTranslationData.class.getName());
            sb2.append(is3.OXO1);
            sPUtilsOXO2.put(sb2.toString(), new Gson().toJson(list3));
        }
        saveListSuccess();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public void saveListSuccess() {
        Intent intent = getIntent();
        intent.putExtra("language", getMLanguageTranslationData());
        setResult(-1, intent);
        finish();
    }

    public final void searchName(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        if (text.length() == 0) {
            setData(this.mAllLanguageList);
            return;
        }
        List<LanguageTranslationData> list = this.mAllLanguageList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt__StringsKt.iIi011O(((LanguageTranslationData) obj).getName(), text, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        setData(arrayList);
    }

    public void setData(@aa1 final List<LanguageTranslationData> list) {
        Intrinsics.X0O(list, "list");
        if (list.isEmpty()) {
            return;
        }
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXX0I1IIO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ChooseLanguageActivity.setData$lambda$0(this.f3531IO, list, (DslAdapter) obj);
            }
        });
    }

    public final void setMHistoryLanguageList(@aa1 List<LanguageTranslationData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mHistoryLanguageList = list;
    }

    public final void setMLanguageTranslationData(@aa1 LanguageTranslationData languageTranslationData) {
        Intrinsics.X0O(languageTranslationData, "<set-?>");
        this.mLanguageTranslationData = languageTranslationData;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setSelectorAll(boolean z) {
        this.isSelectorAll = z;
    }

    public final void setTextChangedLastTime(long j) {
        this.textChangedLastTime = j;
    }
}
