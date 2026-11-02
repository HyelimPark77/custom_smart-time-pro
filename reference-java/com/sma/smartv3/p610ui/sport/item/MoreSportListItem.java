package com.sma.smartv3.p610ui.sport.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.otherdevice.p609jl.view.CommonDecoration;
import com.sma.smartv3.p610ui.sport.HeartRateZonesActivity;
import com.sma.smartv3.p610ui.sport.MySportRecordActivity;
import com.sma.smartv3.p610ui.sport.item.MoreSportListItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreSportListItem extends BaseDslItem {
    private Context mContext;

    @tb1
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.item.MoreSportListItem$initView$1 */
    public static final class C189771 extends CommonAdapter<Pair<? extends Integer, ? extends String>> {
        public C189771(List<Pair<Integer, String>> list, Context context) {
            super(context, R.layout.sport_more_list_item, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$0(Pair pair, C189771 c189771, View view) {
            ((CommonAdapter) c189771).mContext.startActivity(Intrinsics.XOO0ii0((String) pair.getSecond(), UtilsKt.XXO(R.string.hr_zone)) ? new Intent(((CommonAdapter) c189771).mContext, (Class<?>) HeartRateZonesActivity.class) : new Intent(((CommonAdapter) c189771).mContext, (Class<?>) MySportRecordActivity.class));
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Pair<? extends Integer, ? extends String> pair, int i) {
            convert2(viewHolder, (Pair<Integer, String>) pair, i);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder itemHolder, final Pair<Integer, String> item, int i) {
            Intrinsics.X0O(itemHolder, "itemHolder");
            Intrinsics.X0O(item, "item");
            itemHolder.setImageResource(R.id.start_more_icon_im, item.getFirst().intValue());
            itemHolder.setText(R.id.start_more_text_name, item.getSecond());
            itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.vs0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreSportListItem.C189771.convert$lambda$0(item, this, view);
                }
            });
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        RecyclerView recyclerView;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        this.mContext = context;
        RecyclerView recyclerView2 = (RecyclerView) itemHolder.m3483v(R.id.start_recyclerview);
        this.mRecyclerView = recyclerView2;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new GridLayoutManager(itemHolder.getContext(), 2));
        }
        Context context2 = this.mContext;
        Context context3 = null;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null || recyclerView3.getItemDecorationCount() != 0 || (recyclerView = this.mRecyclerView) == null) {
            return;
        }
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
        } else {
            context3 = context5;
        }
        recyclerView.addItemDecoration(new CommonDecoration(context4, 0, ContextCompat.getColor(context3, R.color.transparent), dimensionPixelSize));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Integer.valueOf(R.drawable.icon_heart_rate_zones), UtilsKt.XXO(R.string.hr_zone)));
        arrayList.add(new Pair(Integer.valueOf(R.drawable.icon_my_records), UtilsKt.XXO(R.string.sports_my_records)));
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.XXO("mContext");
                context = null;
            }
            recyclerView.setAdapter(new C189771(arrayList, context));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_item_more;
    }
}
