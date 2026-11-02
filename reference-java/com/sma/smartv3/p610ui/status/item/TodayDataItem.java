package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.TodayHealthyDataKt;
import com.sma.smartv3.p610ui.status.item.TodayDataItem;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTodayDataItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayDataItem.kt\ncom/sma/smartv3/ui/status/item/TodayDataItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public class TodayDataItem extends BaseDslItem {
    private Context context;
    private RecyclerView mRecyclerView;
    private View roomView;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(int i) {
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.status_item_today_health_data);
        Intrinsics.XXI(viewM3483v);
        this.mRecyclerView = (RecyclerView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.today_health_title_layout);
        Intrinsics.XXI(viewM3483v2);
        this.roomView = viewM3483v2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            Intrinsics.XXO("mRecyclerView");
            recyclerView = null;
        }
        Context context = recyclerView.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.context = context;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        RecyclerView recyclerView = this.mRecyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.XXO("mRecyclerView");
            recyclerView = null;
        }
        Context context = this.context;
        if (context == null) {
            Intrinsics.XXO("context");
            context = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        List itemHealthyData$default = TodayHealthyDataKt.getItemHealthyData$default(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ru5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TodayDataItem.initView$lambda$0(((Integer) obj).intValue());
            }
        }, 1, null);
        i1O0OXO1O.OXO1.OXO1("TodayDataItem list = " + itemHealthyData$default.size());
        setItemHidden(itemHealthyData$default.size() == 0);
        View view = this.roomView;
        if (view == null) {
            Intrinsics.XXO("roomView");
            view = null;
        }
        view.setVisibility(itemHealthyData$default.size() == 0 ? 8 : 0);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.XXO("context");
            context2 = null;
        }
        TodayDataItem$initView$mAdapter$1 todayDataItem$initView$mAdapter$1 = new TodayDataItem$initView$mAdapter$1(itemHealthyData$default, this, context2);
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.XXO("mRecyclerView");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(todayDataItem$initView$mAdapter$1);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_today_health_data;
    }
}
