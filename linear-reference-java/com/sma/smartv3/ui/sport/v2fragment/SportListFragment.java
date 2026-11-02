package com.sma.smartv3.ui.sport.v2fragment;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.d05;
import com.android.mltcode.paycertificationapi.e05;
import com.android.mltcode.paycertificationapi.f05;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.item.SportListRecordItem;
import com.sma.smartv3.ui.sport.item.StartSportListItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportListFragment extends BaseDSLRecyclerFragment {
    public SportListFragment() {
    }

    public static /* synthetic */ Unit O00(DslAdapter r0) {
        return showList$lambda$0$0$1(r0);
    }

    public static /* synthetic */ Unit XO0O10(DslAdapter r0) {
        return showList$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit iO(SportListFragment r0, DslAdapter r1) {
        return showList$lambda$0(r0, r1);
    }

    private static final Unit showList$lambda$0(SportListFragment r2, final DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r3, 2, null, 2, null);
        r2.getDslViewHolder().post(new d05(r3));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(DslAdapter r9) {
        r9.clearAllItems();
        StartSportListItem r0 = new StartSportListItem();
        r0.setSpanCount(4);
        r0.setMaxSize(8);
        DslAdapterExKt.IIX1OXO(r9, r0, null, 2, null);
        DslAdapterExKt.IIX1OXO(r9, new SportListRecordItem(), null, 2, null);
        DslAdapter.render$default(r9, false, null, new e05(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$1(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
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
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void showList() {
        renderAdapter(new f05(this));
    }
}
