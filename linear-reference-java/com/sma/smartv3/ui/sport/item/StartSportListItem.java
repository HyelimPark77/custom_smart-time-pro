package com.sma.smartv3.ui.sport.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.g85;
import com.android.mltcode.paycertificationapi.h85;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.AppStartSportActivity;
import com.sma.smartv3.ui.sport.SportListActivity;
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
    private int maxSize;
    private int spanCount;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.sport.item.StartSportListItem$initView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends CommonAdapter<Integer> {
        public AnonymousClass2(List<Integer> r2, Context r3) {
            super(r3, R.layout.sport_start_list_item, r2);
        }

        public static /* synthetic */ void OXO1(AnonymousClass2 r0, int r1, View r2) {
            convert$lambda$2(r0, r1, r2);
        }

        private static final void convert$lambda$2(AnonymousClass2 r2, int r3, View r4) {
            Intent r5 = new Intent(r2.mContext, AppStartSportActivity.class);
            r5.putExtra("mArg1", r3);
            r2.mContext.startActivity(r5);
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, Integer r2, int r3) {
            convert(r1, r2.intValue(), r3);
        }

        public void convert(ViewHolder r4, final int r5, int r6) {
            Intrinsics.X0O(r4, "itemHolder");
            Context r7 = this.mContext;
            Intrinsics.O10IXXX0X(r7, "mContext");
            SportRecordData r1 = new SportRecordData();
            r1.setMMode(r5);
            Unit r2 = Unit.OXO1;
            r4.setText(R.id.start_list_tv_name, UtilsKt.XXO(SportRecordDataKt.getWorkoutName(r7, r1)));
            Context r8 = this.mContext;
            Intrinsics.O10IXXX0X(r8, "mContext");
            SportRecordData r0 = new SportRecordData();
            r0.setMMode(r5);
            r4.setImageResource(R.id.start_list_icon_im, SportRecordDataKt.getWorkoutImage(r8, r0));
            if (a15.iO(r5) == false) goto L5;
            r4.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
        L6:
            r4.itemView.setOnClickListener(new h85(this, r5));
            return;
        L5:
            r4.getView(R.id.start_list_icon_im).setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
            goto L6
        }
    }

    public StartSportListItem() {
        this.spanCount = 4;
        this.maxSize = 8;
    }

    public static /* synthetic */ void O00(StartSportListItem r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(StartSportListItem r4, View r5) {
        Context r0 = r4.mContext;
        Context r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mContext");
        r0 = null;
    L5:
        Intent r6 = new Intent(r0, SportListActivity.class);
        Context r7 = r4.mContext;
        if (r7 != null) goto L8;
        Intrinsics.XXO("mContext");
    L9:
        r1.startActivity(r6);
        return;
    L8:
        r1 = r7;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        Context r0 = r5.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        RecyclerView r1 = (RecyclerView) r5.v(R.id.start_recyclerview);
        this.mRecyclerView = r1;
        if (r1 == null) goto L5;
        r1.setLayoutManager(new GridLayoutManager(r5.getContext(), this.spanCount));
    L5:
        this.mMoreList = r5.v(R.id.sport_item_start_list_more);
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
        List<Integer> r0 = a15.XIi00iiXO();
        View r1 = this.mMoreList;
        if (r1 == null) goto L5;
        r1.setOnClickListener(new g85(this));
    L5:
        RecyclerView r2 = this.mRecyclerView;
        if (r2 == null) goto L12;
        Context r3 = this.mContext;
        if (r3 != null) goto L10;
        Intrinsics.XXO("mContext");
        r3 = null;
    L10:
        r2.setAdapter(new AnonymousClass2(r0, r3));
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_item_start;
    }

    @sf5(tag = a15.XIi00iiXO)
    public final void onListDataChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }

    public final void setMaxSize(int r1) {
        this.maxSize = r1;
    }

    public final void setSpanCount(int r1) {
        this.spanCount = r1;
    }
}
