package com.sma.smartv3.p610ui.sport.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p610ui.sport.AppStartSportActivity;
import com.sma.smartv3.p610ui.sport.SportListActivity;
import com.sma.smartv3.p610ui.sport.item.StartSportListItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StartSportListItem extends BaseDslItem {
    private Context mContext;

    @tb1
    private View mMoreList;

    @tb1
    private RecyclerView mRecyclerView;
    private int spanCount = 4;
    private int maxSize = 8;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.item.StartSportListItem$initView$2 */
    public static final class C189782 extends CommonAdapter<Integer> {
        public C189782(List<Integer> list, Context context) {
            super(context, R.layout.sport_start_list_item, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$2(C189782 c189782, int i, View view) {
            Intent intent = new Intent(((CommonAdapter) c189782).mContext, (Class<?>) AppStartSportActivity.class);
            intent.putExtra("mArg1", i);
            ((CommonAdapter) c189782).mContext.startActivity(intent);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Integer num, int i) {
            convert(viewHolder, num.intValue(), i);
        }

        public void convert(ViewHolder itemHolder, final int i, int i2) {
            Intrinsics.X0O(itemHolder, "itemHolder");
            Context mContext = ((CommonAdapter) this).mContext;
            Intrinsics.O10IXXX0X(mContext, "mContext");
            SportRecordData sportRecordData = new SportRecordData();
            sportRecordData.setMMode(i);
            Unit unit = Unit.OXO1;
            itemHolder.setText(R.id.start_list_tv_name, UtilsKt.XXO(SportRecordDataKt.getWorkoutName(mContext, sportRecordData)));
            Context mContext2 = ((CommonAdapter) this).mContext;
            Intrinsics.O10IXXX0X(mContext2, "mContext");
            SportRecordData sportRecordData2 = new SportRecordData();
            sportRecordData2.setMMode(i);
            itemHolder.setImageResource(R.id.start_list_icon_im, SportRecordDataKt.getWorkoutImage(mContext2, sportRecordData2));
            if (a15.m1445iO(i)) {
                itemHolder.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
            } else {
                itemHolder.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
            }
            itemHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.h85
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StartSportListItem.C189782.convert$lambda$2(this.f7063IO, i, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(StartSportListItem startSportListItem, View view) {
        Context context = startSportListItem.mContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.XXO("mContext");
            context = null;
        }
        Intent intent = new Intent(context, (Class<?>) SportListActivity.class);
        Context context3 = startSportListItem.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
        } else {
            context2 = context3;
        }
        context2.startActivity(intent);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        this.mContext = context;
        RecyclerView recyclerView = (RecyclerView) itemHolder.m3483v(R.id.start_recyclerview);
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(itemHolder.getContext(), this.spanCount));
        }
        this.mMoreList = itemHolder.m3483v(R.id.sport_item_start_list_more);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return true;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        List<Integer> listXIi00iiXO = a15.XIi00iiXO();
        View view = this.mMoreList;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.g85
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StartSportListItem.initView$lambda$0(this.f6831IO, view2);
                }
            });
        }
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.XXO("mContext");
                context = null;
            }
            recyclerView.setAdapter(new C189782(listXIi00iiXO, context));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_item_start;
    }

    @sf5(tag = a15.XIi00iiXO)
    public final void onListDataChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }

    public final void setMaxSize(int i) {
        this.maxSize = i;
    }

    public final void setSpanCount(int i) {
        this.spanCount = i;
    }
}
