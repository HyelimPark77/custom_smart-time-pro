package com.sma.smartv3.p610ui.sport;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p610ui.sport.SportListItem;
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

    public SportListItem(@aa1 String title, @aa1 List<Integer> sportList) {
        Intrinsics.X0O(title, "title");
        Intrinsics.X0O(sportList, "sportList");
        this.title = title;
        this.sportList = sportList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1$0$0(final SportListItem sportListItem, DslViewHolder dslViewHolder, DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        Iterator<T> it = sportListItem.sportList.iterator();
        while (it.hasNext()) {
            final int iIntValue = ((Number) it.next()).intValue();
            Context context = dslViewHolder.getContext();
            Intrinsics.O10IXXX0X(context, "<get-context>(...)");
            SportRecordData sportRecordData = new SportRecordData();
            sportRecordData.setMMode(iIntValue);
            int workoutImage = SportRecordDataKt.getWorkoutImage(context, sportRecordData);
            Context context2 = dslViewHolder.getContext();
            Intrinsics.O10IXXX0X(context2, "<get-context>(...)");
            SportRecordData sportRecordData2 = new SportRecordData();
            sportRecordData2.setMMode(iIntValue);
            ((SportListInfoItem) DslAdapterExKt.IIX1OXO(render, new SportListInfoItem(iIntValue, workoutImage, SportRecordDataKt.getWorkoutName(context2, sportRecordData2)), null, 2, null)).setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.h05
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportListItem.bindView$lambda$1$0$0$0$2$0(this.f7019IO, iIntValue, (View) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1$0$0$0$2$0(SportListItem sportListItem, int i, View it) {
        Intrinsics.X0O(it, "it");
        Function1<? super Integer, Unit> function1 = sportListItem.sportItemClick;
        if (function1 != null) {
            function1.invoke2(Integer.valueOf(i));
        }
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 final DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
        if (textViewM3482tv != null) {
            textViewM3482tv.setVisibility(UtilsKt.iii0(this.title.length() > 0));
            textViewM3482tv.setText(this.title);
        }
        RecyclerView recyclerViewM3481rv = itemHolder.m3481rv(R.id.recycler_view);
        if (recyclerViewM3481rv != null) {
            recyclerViewM3481rv.setItemViewCacheSize(100);
            recyclerViewM3481rv.setItemAnimator(null);
            recyclerViewM3481rv.setLayoutManager(new GridLayoutManager(itemHolder.getContext(), 2));
            DslAdapter dslAdapter = new DslAdapter(null, 1, null);
            dslAdapter.clearAllItems();
            DslAdapter.render$default(dslAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.g05
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportListItem.bindView$lambda$1$0$0(this.f6786IO, itemHolder, (DslAdapter) obj);
                }
            }, 3, null);
            recyclerViewM3481rv.setAdapter(dslAdapter);
        }
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

    public final void setSportItemClick(@tb1 Function1<? super Integer, Unit> function1) {
        this.sportItemClick = function1;
    }
}
