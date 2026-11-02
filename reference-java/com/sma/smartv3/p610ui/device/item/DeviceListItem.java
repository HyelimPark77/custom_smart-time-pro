package com.sma.smartv3.p610ui.device.item;

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

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        this.context = itemHolder.getContext();
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
        if (textViewM3482tv != null) {
            if (this.mTitle != 0) {
                textViewM3482tv.setVisibility(0);
                textViewM3482tv.setText(this.mTitle);
            } else {
                textViewM3482tv.setVisibility(8);
            }
        }
        RecyclerView recyclerViewM3481rv = itemHolder.m3481rv(R.id.recycler_view);
        Intrinsics.X1ii(recyclerViewM3481rv, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.mRecyclerView = recyclerViewM3481rv;
        if (recyclerViewM3481rv != null) {
            recyclerViewM3481rv.setItemViewCacheSize(100);
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        RecyclerView recyclerView2 = this.mRecyclerView;
        boolean z = true;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
        }
        for (DslAdapterItem dslAdapterItem : getItems()) {
            if (dslAdapterItem instanceof BaseDslItem) {
                ((BaseDslItem) dslAdapterItem).initView();
                if (!dslAdapterItem.getItemHidden()) {
                    z = false;
                }
            }
        }
        DslAdapter dslAdapter = new DslAdapter(getItems());
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(dslAdapter);
        }
        this.dslAdapter = dslAdapter;
        setItemHidden(z);
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

    public final void setItems(@aa1 List<DslAdapterItem> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.items = list;
    }

    public final void setMTitle(int i) {
        this.mTitle = i;
    }
}
