package com.sma.smartv3.p610ui.device.dialpay.item;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.OnlineWatchFaceV2;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialClassItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialClassItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/DialClassItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class DialClassItem extends BaseDslItem {

    @aa1
    private final List<OnlineWatchFaceV2> categorys;
    public Context mContext;

    @tb1
    private OXO1 mOnItemClickListener;
    private RecyclerView mRecyclerView;

    public interface OXO1 {
        void OXO1(int i);
    }

    public DialClassItem(@aa1 List<OnlineWatchFaceV2> categorys) {
        Intrinsics.X0O(categorys, "categorys");
        this.categorys = categorys;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdapterClick(int i) {
        OXO1 oxo1 = this.mOnItemClickListener;
        if (oxo1 != null) {
            oxo1.OXO1(i);
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.my_class_recyclerView);
        Intrinsics.XXI(viewM3483v);
        RecyclerView recyclerView = (RecyclerView) viewM3483v;
        this.mRecyclerView = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.XXO("mRecyclerView");
            recyclerView = null;
        }
        Context context = recyclerView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.XXO("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getMContext(), 0, false));
        if (this.categorys.isEmpty()) {
            return;
        }
        DialClassItem$bindView$mAdapter$1 dialClassItem$bindView$mAdapter$1 = new DialClassItem$bindView$mAdapter$1(this, getMContext(), this.categorys);
        RecyclerView recyclerView4 = this.mRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.XXO("mRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setAdapter(dialClassItem$bindView$mAdapter$1);
    }

    @aa1
    public final List<OnlineWatchFaceV2> getCategorys() {
        return this.categorys;
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @tb1
    public final OXO1 getMOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.layout_online_watchface_class_head;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMOnItemClickListener(@tb1 OXO1 oxo1) {
        this.mOnItemClickListener = oxo1;
    }

    public final void setOnItemClickListener(@aa1 OXO1 listener) {
        Intrinsics.X0O(listener, "listener");
        this.mOnItemClickListener = listener;
    }
}
