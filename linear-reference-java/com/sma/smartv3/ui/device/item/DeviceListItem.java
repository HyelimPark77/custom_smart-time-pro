package com.sma.smartv3.ui.device.item;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDeviceListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceListItem.kt\ncom/sma/smartv3/ui/device/item/DeviceListItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public class DeviceListItem extends BaseDslItem {

    @tb1
    private Context context;

    @tb1
    private DslAdapter dslAdapter;
    public List<DslAdapterItem> items;

    @tb1
    private RecyclerView mRecyclerView;
    private int mTitle;

    public DeviceListItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        this.context = r5.getContext();
        TextView r0 = r5.tv(R.id.tv_title);
        if (r0 != null) goto L5;
    L8:
        RecyclerView r6 = r5.rv(R.id.recycler_view);
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.mRecyclerView = r6;
        if (r6 == null) goto L11;
        r6.setItemViewCacheSize(100);
    L11:
        RecyclerView r7 = this.mRecyclerView;
        if (r7 == null) goto L14;
        r7.setItemAnimator(null);
    L14:
        RecyclerView r8 = this.mRecyclerView;
        boolean r1 = true;
        if (r8 == null) goto L17;
        r8.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
    L17:
        Iterator<DslAdapterItem> r9 = getItems().iterator();
    L19:
        if (r9.hasNext() == false) goto L25;
        DslAdapterItem r2 = r9.next();
        if ((r2 instanceof BaseDslItem) == false) goto L19;
        ((BaseDslItem) r2).initView();
        if (r2.getItemHidden() == true) goto L19;
        r1 = false;
        goto L19
    L25:
        DslAdapter r10 = new DslAdapter(getItems());
        RecyclerView r3 = this.mRecyclerView;
        if (r3 == null) goto L28;
        r3.setAdapter(r10);
    L28:
        this.dslAdapter = r10;
        setItemHidden(r1);
        return;
    L5:
        if (this.mTitle == 0) goto L7;
        r0.setVisibility(0);
        r0.setText(this.mTitle);
        goto L8
    L7:
        r0.setVisibility(8);
        goto L8
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

    public final int getMTitle() {
        return this.mTitle;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_list_item;
    }

    public final void setItems(@aa1 List<DslAdapterItem> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.items = r2;
    }

    public final void setMTitle(int r1) {
        this.mTitle = r1;
    }
}
