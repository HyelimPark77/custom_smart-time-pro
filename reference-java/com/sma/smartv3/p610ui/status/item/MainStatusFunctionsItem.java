package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStatusFunctionsItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStatusFunctionsItem.kt\ncom/sma/smartv3/ui/status/item/MainStatusFunctionsItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class MainStatusFunctionsItem extends BaseDslItem {

    @tb1
    private Context context;

    @tb1
    private DslAdapter dslAdapter;
    public List<DslAdapterItem> items;

    @tb1
    private RecyclerView mRecyclerView;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        this.context = itemHolder.getContext();
        RecyclerView recyclerViewM3481rv = itemHolder.m3481rv(R.id.f51422rv);
        Intrinsics.X1ii(recyclerViewM3481rv, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.mRecyclerView = recyclerViewM3481rv;
        if (recyclerViewM3481rv != null) {
            recyclerViewM3481rv.setItemViewCacheSize(30);
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(itemHolder.getContext(), 2));
        }
        DslAdapter dslAdapter = new DslAdapter(getItems());
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(dslAdapter);
        }
        this.dslAdapter = dslAdapter;
    }

    @aa1
    public final List<DslAdapterItem> getItems() {
        List<DslAdapterItem> list = this.items;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("items");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_functions;
    }

    public final void setItems(@aa1 List<DslAdapterItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.items = list;
    }
}
