package com.sma.smartv3.ui.sport.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.vs0;
import com.angcyo.dsladapter.DslViewHolder;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.otherdevice.jl.view.CommonDecoration;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.HeartRateZonesActivity;
import com.sma.smartv3.ui.sport.MySportRecordActivity;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.item.MoreSportListItem$initView$1, reason: invalid class name */
    public static final class AnonymousClass1 extends CommonAdapter<Pair<? extends Integer, ? extends String>> {
        public AnonymousClass1(List<Pair<Integer, String>> r2, Context r3) {
            super(r3, R.layout.sport_more_list_item, r2);
        }

        public static /* synthetic */ void OXO1(Pair r0, AnonymousClass1 r1, View r2) {
            convert$lambda$0(r0, r1, r2);
        }

        private static final void convert$lambda$0(Pair r1, AnonymousClass1 r2, View r3) {
            if (Intrinsics.XOO0ii0((String) r1.getSecond(), UtilsKt.XXO(R.string.hr_zone)) == false) goto L5;
            Intent r4 = new Intent(r2.mContext, HeartRateZonesActivity.class);
        L6:
            r2.mContext.startActivity(r4);
            return;
        L5:
            r4 = new Intent(r2.mContext, MySportRecordActivity.class);
            goto L6
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, Pair<? extends Integer, ? extends String> r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r2, final Pair<Integer, String> r3, int r4) {
            Intrinsics.X0O(r2, "itemHolder");
            Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
            r2.setImageResource(R.id.start_more_icon_im, r3.getFirst().intValue());
            r2.setText(R.id.start_more_text_name, r3.getSecond());
            r2.itemView.setOnClickListener(new vs0(r3, this));
        }
    }

    public MoreSportListItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r7) {
        Intrinsics.X0O(r7, "itemHolder");
        Context r0 = r7.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        RecyclerView r1 = (RecyclerView) r7.v(R.id.start_recyclerview);
        this.mRecyclerView = r1;
        if (r1 == null) goto L5;
        r1.setLayoutManager(new GridLayoutManager(r7.getContext(), 2));
    L5:
        Context r8 = this.mContext;
        Context r2 = null;
        if (r8 != null) goto L8;
        Intrinsics.XXO("mContext");
        r8 = null;
    L8:
        int r9 = r8.getResources().getDimensionPixelSize(R.dimen.activity_horizontal_margin);
        RecyclerView r3 = this.mRecyclerView;
        if (r3 != null) goto L11;
        return;
    L11:
        if (r3.getItemDecorationCount() != 0) goto L24;
        RecyclerView r4 = this.mRecyclerView;
        if (r4 == null) goto L25;
        Context r5 = this.mContext;
        if (r5 != null) goto L17;
        Intrinsics.XXO("mContext");
        r5 = null;
    L17:
        Context r6 = this.mContext;
        if (r6 != null) goto L20;
        Intrinsics.XXO("mContext");
    L21:
        r4.addItemDecoration(new CommonDecoration(r5, 0, ContextCompat.getColor(r2, R.color.transparent), r9));
        return;
    L20:
        r2 = r6;
        goto L21
    L25:
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        ArrayList r0 = new ArrayList();
        r0.add(new Pair(Integer.valueOf(R.drawable.icon_heart_rate_zones), UtilsKt.XXO(R.string.hr_zone)));
        r0.add(new Pair(Integer.valueOf(R.drawable.icon_my_records), UtilsKt.XXO(R.string.sports_my_records)));
        RecyclerView r1 = this.mRecyclerView;
        if (r1 == null) goto L9;
        Context r2 = this.mContext;
        if (r2 != null) goto L7;
        Intrinsics.XXO("mContext");
        r2 = null;
    L7:
        r1.setAdapter(new AnonymousClass1(r0, r2));
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_item_more;
    }
}
