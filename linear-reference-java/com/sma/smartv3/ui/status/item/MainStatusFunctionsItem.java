package com.sma.smartv3.ui.status.item;

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

    public MainStatusFunctionsItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r4) {
        Intrinsics.X0O(r4, "itemHolder");
        this.context = r4.getContext();
        RecyclerView r0 = r4.rv(R.id.rv);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.mRecyclerView = r0;
        if (r0 == null) goto L5;
        r0.setItemViewCacheSize(30);
    L5:
        RecyclerView r1 = this.mRecyclerView;
        if (r1 == null) goto L8;
        r1.setItemAnimator(null);
    L8:
        RecyclerView r2 = this.mRecyclerView;
        if (r2 == null) goto L11;
        r2.setLayoutManager(new GridLayoutManager(r4.getContext(), 2));
    L11:
        DslAdapter r5 = new DslAdapter(getItems());
        RecyclerView r3 = this.mRecyclerView;
        if (r3 == null) goto L14;
        r3.setAdapter(r5);
    L14:
        this.dslAdapter = r5;
    }

    @aa1
    public final List<DslAdapterItem> getItems() {
        List<DslAdapterItem> r0 = this.items;
        if (r0 == null) goto L5;
        return r0;
    L5:
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

    public final void setItems(@aa1 List<DslAdapterItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.items = r2;
    }
}
