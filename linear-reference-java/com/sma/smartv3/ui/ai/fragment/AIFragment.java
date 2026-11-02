package com.sma.smartv3.ui.ai.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IX0IXOi;
import com.android.mltcode.paycertificationapi.IX1XiI;
import com.android.mltcode.paycertificationapi.O0O;
import com.android.mltcode.paycertificationapi.X00O0;
import com.android.mltcode.paycertificationapi.X0iO;
import com.android.mltcode.paycertificationapi.X111IO;
import com.android.mltcode.paycertificationapi.XXiO0i;
import com.android.mltcode.paycertificationapi.Xi1i0XOX0;
import com.android.mltcode.paycertificationapi.Xii11I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIi1;
import com.android.mltcode.paycertificationapi.iOI;
import com.android.mltcode.paycertificationapi.iii0;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai.item.AIADPBannerItem;
import com.sma.smartv3.ui.ai.item.AIADPCBannerItem;
import com.sma.smartv3.ui.ai.item.AIFunctionItem;
import com.sma.smartv3.ui.ai.item.AITopItem;
import com.sma.smartv3.ui.ai.item.Hot1AIFunctionItem;
import com.sma.smartv3.ui.ai.item.HotAIFunctionItem;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n1878#2,3:173\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment\n*L\n152#1:171,2\n79#1:173,3\n*E\n"})
public class AIFragment extends BaseDSLRecyclerFragment {

    @aa1
    private final String ITEM_GROUPS_TAG;

    @tb1
    private BaseDslItem bannerItem;

    @aa1
    private AIFunctionCat mCurCat;

    @SourceDebugExtension({"SMAP\nAIFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1869#2,2:171\n*S KotlinDebug\n*F\n+ 1 AIFragment.kt\ncom/sma/smartv3/ui/ai/fragment/AIFragment$showData$1$1$4$1$1\n*L\n118#1:171,2\n*E\n"})
    public static final class OXO1 implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ AIFragment OXO1;

        public OXO1(AIFragment r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ Unit OXO1(DslAdapter r0) {
            return XIi00iiXO(r0);
        }

        public static final Unit XIi00iiXO(DslAdapter r3) {
            Intrinsics.X0O(r3, "$this$render");
            DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
            return Unit.OXO1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab r1) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab r7) {
            Intrinsics.X0O(r7, "tab");
            AIFragment r0 = this.OXO1;
            int r8 = r7.getPosition();
            if (r8 == 0) goto L7;
            if (r8 == 1) goto L6;
            AIFunctionCat r9 = AIFunctionCat.AMUSEMENT;
        L8:
            r0.setMCurCat(r9);
            ArrayList r10 = new ArrayList();
            List<DslAdapterItem> r1 = this.OXO1.getDslAdapter().getDataItems();
            AIFragment r2 = this.OXO1;
            Iterator<T> r3 = r1.iterator();
        L10:
            if (r3.hasNext() == false) goto L16;
            DslAdapterItem r4 = (DslAdapterItem) r3.next();
            if (r4.getItemIsGroupHead() == true) goto L10;
            if (Intrinsics.XOO0ii0(r4.getItemGroups(), CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r2.getITEM_GROUPS_TAG()})) == false) goto L10;
            r10.add(r4);
            goto L10
        L16:
            this.OXO1.getDslAdapter().removeItem(r10);
            DslAdapter.updateItemDepend$default(this.OXO1.getDslAdapter(), null, 1, null);
            AIFragment r11 = this.OXO1;
            r11.showAIFunction(r11.getMCurCat());
            DslAdapter.render$default(this.OXO1.getDslAdapter(), false, null, new iIi1(), 3, null);
            return;
        L6:
            r9 = AIFunctionCat.WORK;
            goto L8
        L7:
            r9 = AIFunctionCat.LIFE;
            goto L8
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab r1) {
        }
    }

    public AIFragment() {
        this.ITEM_GROUPS_TAG = "groups";
        this.mCurCat = AIFunctionCat.LIFE;
    }

    public static /* synthetic */ Unit I0IIOi(AIFragment r0, AIFunction r1, View r2) {
        return showData$lambda$0$0$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I0iXXO(AIFragment r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return showData$lambda$0$0$3$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit IO(DslAdapter r0, AIFragment r1) {
        return showData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IiI10X(AIFragment r0, AIFunction r1, View r2) {
        return showAIFunction$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit O00(AIFragment r0, DslAdapter r1) {
        return showData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OIX0iXi(AIFunction r0, AIFragment r1, AIFunctionItem r2) {
        return showData$lambda$0$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OIi0(AIFragment r0, DslAdapterItem r1) {
        return showData$lambda$0$0$3(r0, r1);
    }

    public static /* synthetic */ Unit XO0O10(BaseDslItem r0) {
        return showData$lambda$0$0$2$0(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(DslAdapter r0) {
        return showData$lambda$0$0$4(r0);
    }

    public static /* synthetic */ Unit XXI(AIFragment r0, AIFunction r1, AIFunctionItem r2) {
        return showAIFunction$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iO(AITopItem r0) {
        return showData$lambda$0$0$0(r0);
    }

    private static final Unit showAIFunction$lambda$0$0(final AIFragment r1, final AIFunction r2, AIFunctionItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.ITEM_GROUPS_TAG}));
        r3.setItemData(r2);
        r3.setItemClick(new IX1XiI(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showAIFunction$lambda$0$0$0(AIFragment r1, AIFunction r2, View r3) {
        Intrinsics.X0O(r3, "it");
        AIFunctionDataKt.toAIFunction(r1.getMActivity(), r2);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0(final AIFragment r2, final DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r3.clearAllItems();
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r2.getDslViewHolder().postDelay(100, new X0iO(r3, r2));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0(DslAdapter r7, final AIFragment r8) {
        DslAdapterExKt.X0O(r7, new AITopItem(), new iOI());
        Iterator<T> r0 = AIFunctionDataKt.getHotAIFunction().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L14;
        Object r2 = r0.next();
        int r3 = r1 + 1;
        if (r1 >= 0) goto L8;
        CollectionsKt__CollectionsKt.XOX0O0();
    L8:
        final AIFunction r4 = (AIFunction) r2;
        if (r1 != 0) goto L11;
        DslAdapterItem r5 = new Hot1AIFunctionItem();
    L12:
        DslAdapterExKt.X0O(r7, r5, new XXiO0i(r4, r8));
        r1 = r3;
        goto L4
    L11:
        r5 = new HotAIFunctionItem();
        goto L12
    L14:
        if (q62.OXO1.iOIi00Ii() == true) goto L16;
    L21:
        DslAdapterExKt.O10IXXX0X(r7, R.layout.ai_item_group_head, new O0O(r8));
        r8.showAIFunction(r8.mCurCat);
        DslAdapter.render$default(r7, false, null, new Xi1i0XOX0(), 3, null);
        return Unit.OXO1;
    L16:
        if (r8.bannerItem != null) goto L18;
        r8.bannerItem = r8.getAdBannerItem();
    L18:
        BaseDslItem r6 = r8.bannerItem;
        if (r6 == null) goto L21;
        BaseDslItem r9 = (BaseDslItem) DslAdapterExKt.X0O(r7, r6, new IX0IXOi());
        goto L21
    }

    private static final Unit showData$lambda$0$0$0(AITopItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$1$0(final AIFunction r1, final AIFragment r2, AIFunctionItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemData(r1);
        r3.setItemClick(new X111IO(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$1$0$0(AIFragment r1, AIFunction r2, View r3) {
        Intrinsics.X0O(r3, "it");
        AIFunctionDataKt.toAIFunction(r1.getMActivity(), r2);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$2$0(BaseDslItem r1) {
        Intrinsics.X0O(r1, "$this$dslItem");
        r1.setItemSpanCount(-1);
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$3(final AIFragment r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemIsGroupHead(true);
        r2.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.ITEM_GROUPS_TAG}));
        r2.setItemIsHover(false);
        r2.setItemBindOverride(new Xii11I(r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$3$0(AIFragment r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "adapterItem");
        Intrinsics.X0O(r4, "<unused var>");
        View r5 = r1.itemView;
        Intrinsics.O10IXXX0X(r5, "itemView");
        UtilsKt.IX1XiI(r5, Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        TabLayout r6 = (TabLayout) r1.v(R.id.table);
        if (r6 == null) goto L6;
        r6.addOnTabSelectedListener(new OXO1(r0));
    L6:
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$4(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    @tb1
    public final BaseDslItem getAdBannerItem() {
        i72 r0 = i72.OXO1;
        if (r0.O1() == false) goto L7;
        return new AIADPCBannerItem();
    L7:
        if (r0.XXOXi() == true) goto L9;
        return null;
    L9:
        return new AIADPBannerItem();
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public int layoutId() {
        return R.layout.ai_fragment_rv;
    }

    @sf5(tag = I01XX0.I0XXi0X)
    public final void onAdStateChange(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        i1O0OXO1O r6 = i1O0OXO1O.OXO1;
        i72 r0 = i72.OXO1;
        r6.OXO1("AI Ad State -> " + r0.IOi1O0() + ", " + r0.IX0iIX());
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
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setBannerItem(@tb1 BaseDslItem r1) {
        this.bannerItem = r1;
    }

    public final void setMCurCat(@aa1 AIFunctionCat r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCurCat = r2;
    }

    public final void showAIFunction(@aa1 AIFunctionCat r7) {
        Intrinsics.X0O(r7, "cat");
        Iterator<T> r8 = AIFunctionDataKt.getAIFunctionByCat(r7).iterator();
    L4:
        if (r8.hasNext() == false) goto L6;
        final AIFunction r0 = (AIFunction) r8.next();
        DslAdapterExKt.X0O(getDslAdapter(), new AIFunctionItem(0, 1, null), new iii0(this, r0));
        goto L4
    }

    public void showData() {
        renderAdapter(new X00O0(this));
    }
}
