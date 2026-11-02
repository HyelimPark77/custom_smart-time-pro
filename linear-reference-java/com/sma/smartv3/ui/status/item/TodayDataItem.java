package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ru5;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.TodayHealthyDataKt;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTodayDataItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayDataItem.kt\ncom/sma/smartv3/ui/status/item/TodayDataItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public class TodayDataItem extends BaseDslItem {
    private Context context;
    private RecyclerView mRecyclerView;
    private View roomView;

    public TodayDataItem() {
    }

    public static /* synthetic */ Unit O00(int r0) {
        return initView$lambda$0(r0);
    }

    public static final /* synthetic */ Context access$getContext$p(TodayDataItem r0) {
        return r0.context;
    }

    public static final /* synthetic */ RecyclerView access$getMRecyclerView$p(TodayDataItem r0) {
        return r0.mRecyclerView;
    }

    private static final Unit initView$lambda$0(int r0) {
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.status_item_today_health_data);
        Intrinsics.XXI(r0);
        this.mRecyclerView = (RecyclerView) r0;
        View r3 = r2.v(R.id.today_health_title_layout);
        Intrinsics.XXI(r3);
        this.roomView = r3;
        RecyclerView r4 = this.mRecyclerView;
        if (r4 != null) goto L5;
        Intrinsics.XXO("mRecyclerView");
        r4 = null;
    L5:
        Context r5 = r4.getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        this.context = r5;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        RecyclerView r0 = this.mRecyclerView;
        RecyclerView r2 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mRecyclerView");
        r0 = null;
    L5:
        Context r4 = this.context;
        if (r4 != null) goto L8;
        Intrinsics.XXO("context");
        r4 = null;
    L8:
        boolean r6 = true;
        int r7 = 0;
        r0.setLayoutManager(new LinearLayoutManager(r4, 1, false));
        List r1 = TodayHealthyDataKt.getItemHealthyData$default(false, new ru5(), 1, null);
        i1O0OXO1O.OXO1.OXO1("TodayDataItem list = " + r1.size());
        if (r1.size() == 0) goto L12;
        r6 = false;
    L12:
        setItemHidden(r6);
        View r3 = this.roomView;
        if (r3 != null) goto L16;
        Intrinsics.XXO("roomView");
        r3 = null;
    L16:
        if (r1.size() != 0) goto L19;
        r7 = 8;
    L19:
        r3.setVisibility(r7);
        Context r5 = this.context;
        if (r5 != null) goto L22;
        Intrinsics.XXO("context");
        r5 = null;
    L22:
        TodayDataItem$initView$mAdapter$1 r8 = new TodayDataItem$initView$mAdapter$1(r1, this, r5);
        RecyclerView r9 = this.mRecyclerView;
        if (r9 != null) goto L25;
        Intrinsics.XXO("mRecyclerView");
    L26:
        r2.setAdapter(r8);
        return;
    L25:
        r2 = r9;
        goto L26
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_today_health_data;
    }
}
