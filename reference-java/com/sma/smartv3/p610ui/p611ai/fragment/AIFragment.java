package com.sma.smartv3.p610ui.p611ai.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionCat;
import com.sma.smartv3.model.AIFunctionDataKt;
import com.sma.smartv3.p610ui.p611ai.fragment.AIFragment;
import com.sma.smartv3.p610ui.p611ai.item.AIADPBannerItem;
import com.sma.smartv3.p610ui.p611ai.item.AIADPCBannerItem;
import com.sma.smartv3.p610ui.p611ai.item.AIFunctionItem;
import com.sma.smartv3.p610ui.p611ai.item.AITopItem;
import com.sma.smartv3.p610ui.p611ai.item.Hot1AIFunctionItem;
import com.sma.smartv3.p610ui.p611ai.item.HotAIFunctionItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n1878#2,3:173\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n*L\n152#1:171,2\n79#1:173,3\n*E\n"})
public class AIFragment extends BaseDSLRecyclerFragment {

    @tb1
    private BaseDslItem bannerItem;

    @aa1
    private final String ITEM_GROUPS_TAG = "groups";

    @aa1
    private AIFunctionCat mCurCat = AIFunctionCat.LIFE;

    @SourceDebugExtension({"SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n*L\n118#1:171,2\n*E\n"})
    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public OXO1() {
        }

        public static final Unit XIi00iiXO(DslAdapter render) {
            Intrinsics.X0O(render, "$this$render");
            DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
            return Unit.OXO1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.X0O(tab, "tab");
            AIFragment aIFragment = AIFragment.this;
            int position = tab.getPosition();
            aIFragment.setMCurCat(position != 0 ? position != 1 ? AIFunctionCat.AMUSEMENT : AIFunctionCat.WORK : AIFunctionCat.LIFE);
            ArrayList arrayList = new ArrayList();
            List<DslAdapterItem> dataItems = AIFragment.this.getDslAdapter().getDataItems();
            AIFragment aIFragment2 = AIFragment.this;
            for (DslAdapterItem dslAdapterItem : dataItems) {
                if (!dslAdapterItem.getItemIsGroupHead() && Intrinsics.XOO0ii0(dslAdapterItem.getItemGroups(), CollectionsKt__CollectionsKt.Ii1iii0(aIFragment2.getITEM_GROUPS_TAG()))) {
                    arrayList.add(dslAdapterItem);
                }
            }
            AIFragment.this.getDslAdapter().removeItem(arrayList);
            DslAdapter.updateItemDepend$default(AIFragment.this.getDslAdapter(), null, 1, null);
            AIFragment aIFragment3 = AIFragment.this;
            aIFragment3.showAIFunction(aIFragment3.getMCurCat());
            DslAdapter.render$default(AIFragment.this.getDslAdapter(), false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIi1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AIFragment.OXO1.XIi00iiXO((DslAdapter) obj);
                }
            }, 3, null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAIFunction$lambda$0$0(final AIFragment aIFragment, final AIFunction aIFunction, AIFunctionItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(aIFragment.ITEM_GROUPS_TAG));
        dslItem.setItemData(aIFunction);
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.IX1XiI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIFragment.showAIFunction$lambda$0$0$0(this.f1979IO, aIFunction, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAIFunction$lambda$0$0$0(AIFragment aIFragment, AIFunction aIFunction, View it) {
        Intrinsics.X0O(it, "it");
        AIFunctionDataKt.toAIFunction(aIFragment.getMActivity(), aIFunction);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(final AIFragment aIFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        renderAdapter.clearAllItems();
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        aIFragment.getDslViewHolder().postDelay(100L, new Function0() { // from class: com.android.mltcode.paycertificationapi.X0iO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AIFragment.showData$lambda$0$0(renderAdapter, aIFragment);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(DslAdapter dslAdapter, final AIFragment aIFragment) {
        DslAdapterExKt.X0O(dslAdapter, new AITopItem(), new Function1() { // from class: com.android.mltcode.paycertificationapi.iOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIFragment.showData$lambda$0$0$0((AITopItem) obj);
            }
        });
        int i = 0;
        for (Object obj : AIFunctionDataKt.getHotAIFunction()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            final AIFunction aIFunction = (AIFunction) obj;
            DslAdapterExKt.X0O(dslAdapter, i == 0 ? new Hot1AIFunctionItem() : new HotAIFunctionItem(), new Function1() { // from class: com.android.mltcode.paycertificationapi.XXiO0i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AIFragment.showData$lambda$0$0$1$0(aIFunction, aIFragment, (AIFunctionItem) obj2);
                }
            });
            i = i2;
        }
        if (q62.OXO1.iOIi00Ii()) {
            if (aIFragment.bannerItem == null) {
                aIFragment.bannerItem = aIFragment.getAdBannerItem();
            }
            BaseDslItem baseDslItem = aIFragment.bannerItem;
            if (baseDslItem != null) {
            }
        }
        DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.ai_item_group_head, new Function1() { // from class: com.android.mltcode.paycertificationapi.O0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return AIFragment.showData$lambda$0$0$3(this.f2475IO, (DslAdapterItem) obj2);
            }
        });
        aIFragment.showAIFunction(aIFragment.mCurCat);
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi1i0XOX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return AIFragment.showData$lambda$0$0$4((DslAdapter) obj2);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0(AITopItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$1$0(final AIFunction aIFunction, final AIFragment aIFragment, AIFunctionItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemData(aIFunction);
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X111IO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIFragment.showData$lambda$0$0$1$0$0(this.f4214IO, aIFunction, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$1$0$0(AIFragment aIFragment, AIFunction aIFunction, View it) {
        Intrinsics.X0O(it, "it");
        AIFunctionDataKt.toAIFunction(aIFragment.getMActivity(), aIFunction);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$2$0(BaseDslItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$3(final AIFragment aIFragment, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(aIFragment.ITEM_GROUPS_TAG));
        dslItem.setItemIsHover(false);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.Xii11I
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AIFragment.showData$lambda$0$0$3$0(this.f5367IO, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$3$0(AIFragment aIFragment, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(list, "<unused var>");
        View itemView = itemHolder.itemView;
        Intrinsics.O10IXXX0X(itemView, "itemView");
        UtilsKt.IX1XiI(itemView, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        TabLayout tabLayout = (TabLayout) itemHolder.m3483v(R.id.table);
        if (tabLayout != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) aIFragment.new OXO1());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$4(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    @tb1
    public final BaseDslItem getAdBannerItem() {
        i72 i72Var = i72.OXO1;
        if (i72Var.m2046O1()) {
            return new AIADPCBannerItem();
        }
        if (i72Var.XXOXi()) {
            return new AIADPBannerItem();
        }
        return null;
    }

    @tb1
    public final BaseDslItem getBannerItem() {
        return this.bannerItem;
    }

    @aa1
    public final String getITEM_GROUPS_TAG() {
        return this.ITEM_GROUPS_TAG;
    }

    @aa1
    public final AIFunctionCat getMCurCat() {
        return this.mCurCat;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public int layoutId() {
        return R.layout.ai_fragment_rv;
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i72 i72Var = i72.OXO1;
        i1o0oxo1o.OXO1("AI Ad State -> " + i72Var.IOi1O0() + ", " + i72Var.IX0iIX());
        showData();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        showData();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setBannerItem(@tb1 BaseDslItem baseDslItem) {
        this.bannerItem = baseDslItem;
    }

    public final void setMCurCat(@aa1 AIFunctionCat aIFunctionCat) {
        Intrinsics.X0O(aIFunctionCat, "<set-?>");
        this.mCurCat = aIFunctionCat;
    }

    public final void showAIFunction(@aa1 AIFunctionCat cat) {
        Intrinsics.X0O(cat, "cat");
        for (final AIFunction aIFunction : AIFunctionDataKt.getAIFunctionByCat(cat)) {
            DslAdapterExKt.X0O(getDslAdapter(), new AIFunctionItem(0, 1, null), new Function1() { // from class: com.android.mltcode.paycertificationapi.iii0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AIFragment.showAIFunction$lambda$0$0(this.f8664IO, aIFunction, (AIFunctionItem) obj);
                }
            });
        }
    }

    public void showData() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.X00O0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AIFragment.showData$lambda$0(this.f3876IO, (DslAdapter) obj);
            }
        });
    }
}
