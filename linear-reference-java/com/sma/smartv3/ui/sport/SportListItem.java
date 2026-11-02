package com.sma.smartv3.ui.sport;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.g05;
import com.android.mltcode.paycertificationapi.h05;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListItem.kt\ncom/sma/smartv3/ui/sport/SportListItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1869#2,2:72\n*S KotlinDebug\n*F\n+ 1 SportListItem.kt\ncom/sma/smartv3/ui/sport/SportListItem\n*L\n31#1:72,2\n*E\n"})
public final class SportListItem extends BaseDslItem {

    @tb1
    private Function1<? super Integer, Unit> sportItemClick;

    @aa1
    private final List<Integer> sportList;

    @aa1
    private final String title;

    public SportListItem(@aa1 String r2, @aa1 List<Integer> r3) {
        Intrinsics.X0O(r2, "title");
        Intrinsics.X0O(r3, "sportList");
        this.title = r2;
        this.sportList = r3;
    }

    public static /* synthetic */ Unit IiI10X(SportListItem r0, DslViewHolder r1, DslAdapter r2) {
        return bindView$lambda$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit O00(SportListItem r0, int r1, View r2) {
        return bindView$lambda$1$0$0$0$2$0(r0, r1, r2);
    }

    private static final Unit bindView$lambda$1$0$0(final SportListItem r5, DslViewHolder r6, DslAdapter r7) {
        Intrinsics.X0O(r7, "$this$render");
        Iterator<T> r0 = r5.sportList.iterator();
    L4:
        if (r0.hasNext() == false) goto L7;
        final int r1 = ((Number) r0.next()).intValue();
        Context r2 = r6.getContext();
        Intrinsics.O10IXXX0X(r2, "<get-context>(...)");
        SportRecordData r4 = new SportRecordData();
        r4.setMMode(r1);
        int r3 = SportRecordDataKt.getWorkoutImage(r2, r4);
        Context r8 = r6.getContext();
        Intrinsics.O10IXXX0X(r8, "<get-context>(...)");
        SportRecordData r9 = new SportRecordData();
        r9.setMMode(r1);
        ((SportListInfoItem) DslAdapterExKt.IIX1OXO(r7, new SportListInfoItem(r1, r3, SportRecordDataKt.getWorkoutName(r8, r9)), null, 2, null)).setItemClick(new h05(r5, r1));
        goto L4
    L7:
        return Unit.OXO1;
    }

    private static final Unit bindView$lambda$1$0$0$0$2$0(SportListItem r1, int r2, View r3) {
        Intrinsics.X0O(r3, "it");
        Function1<? super Integer, Unit> r4 = r1.sportItemClick;
        if (r4 == null) goto L6;
        r4.invoke(Integer.valueOf(r2));
    L6:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 final DslViewHolder r13) {
        Intrinsics.X0O(r13, "itemHolder");
        TextView r0 = r13.tv(R.id.tv_title);
        int r1 = 1;
        if (r0 != null) goto L5;
    L9:
        RecyclerView r2 = r13.rv(R.id.recycler_view);
        if (r2 == null) goto L13;
        r2.setItemViewCacheSize(100);
        r2.setItemAnimator(null);
        r2.setLayoutManager(new GridLayoutManager(r13.getContext(), 2));
        DslAdapter r6 = new DslAdapter(null, r1, 0 == true ? 1 : 0);
        r6.clearAllItems();
        DslAdapter.render$default(r6, false, null, new g05(this, r13), 3, null);
        r2.setAdapter(r6);
        return;
    L13:
        return;
    L5:
        if (this.title.length() <= 0) goto L7;
        boolean r3 = true;
    L8:
        r0.setVisibility(UtilsKt.iii0(r3));
        r0.setText(this.title);
        goto L9
    L7:
        r3 = false;
        goto L8
    }

    @tb1
    public final Function1<Integer, Unit> getSportItemClick() {
        return this.sportItemClick;
    }

    @aa1
    public final List<Integer> getSportList() {
        return this.sportList;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.sport_type_list_item;
    }

    public final void setSportItemClick(@tb1 Function1<? super Integer, Unit> r1) {
        this.sportItemClick = r1;
    }
}
