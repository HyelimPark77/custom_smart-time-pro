package com.sma.smartv3.p610ui.sport.v2fragment;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.sma.smartv3.p610ui.sport.item.SportListRecordItem;
import com.sma.smartv3.p610ui.sport.item.StartSportListItem;
import com.sma.smartv3.p610ui.sport.v2fragment.SportListFragment;
import com.sma.smartv3.pro.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportListFragment extends BaseDSLRecyclerFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(SportListFragment sportListFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        sportListFragment.getDslViewHolder().post(new Function0() { // from class: com.android.mltcode.paycertificationapi.d05
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportListFragment.showList$lambda$0$0(renderAdapter);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(DslAdapter dslAdapter) {
        dslAdapter.clearAllItems();
        StartSportListItem startSportListItem = new StartSportListItem();
        startSportListItem.setSpanCount(4);
        startSportListItem.setMaxSize(8);
        DslAdapterExKt.IIX1OXO(dslAdapter, startSportListItem, null, 2, null);
        DslAdapterExKt.IIX1OXO(dslAdapter, new SportListRecordItem(), null, 2, null);
        DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.e05
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportListFragment.showList$lambda$0$0$1((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$1(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(getActivity()));
        showList();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void showList() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.f05
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportListFragment.showList$lambda$0(this.f6549IO, (DslAdapter) obj);
            }
        });
    }
}
