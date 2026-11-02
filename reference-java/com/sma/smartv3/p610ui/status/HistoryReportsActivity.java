package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.bumptech.glide.Glide;
import com.sma.smartv3.p608db.entity.HealthyReport;
import com.sma.smartv3.p610ui.status.HistoryReportsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHistoryReportsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryReportsActivity.kt\ncom/sma/smartv3/ui/status/HistoryReportsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1869#2,2:134\n87#3,7:136\n94#3,3:144\n70#3,7:147\n97#3:154\n1#4:143\n*S KotlinDebug\n*F\n+ 1 HistoryReportsActivity.kt\ncom/sma/smartv3/ui/status/HistoryReportsActivity\n*L\n83#1:134,2\n102#1:136,7\n102#1:144,3\n102#1:147,7\n102#1:154\n102#1:143\n*E\n"})
public final class HistoryReportsActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy mEmptyImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0i01OO0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HistoryReportsActivity.mEmptyImg_delegate$lambda$0(this.f1257IO);
        }
    });

    @aa1
    private final Lazy mEmptyTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiOX1O01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HistoryReportsActivity.mEmptyTv_delegate$lambda$0(this.f1914IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iO00O1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HistoryReportsActivity.abhTitleCenter_delegate$lambda$0(this.f7974IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(HistoryReportsActivity historyReportsActivity) {
        return (TextView) historyReportsActivity.findViewById(R.id.abh_title_center);
    }

    private final void findData(List<HealthyReport> list) {
        for (final HealthyReport healthyReport : list) {
            DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_heath_reports_list, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0XOO1iOI
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HistoryReportsActivity.findData$lambda$0$0(healthyReport, this, (DslAdapterItem) obj);
                }
            });
        }
        getDslAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final HealthyReport healthyReport, final HistoryReportsActivity historyReportsActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsHover(false);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iOII1XOi
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return HistoryReportsActivity.findData$lambda$0$0$0(healthyReport, historyReportsActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(healthyReport.getMLocalTime());
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.II0001
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HistoryReportsActivity.findData$lambda$0$0$1(this.f1513IO, healthyReport, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(HealthyReport healthyReport, HistoryReportsActivity historyReportsActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        ImageView imageViewImg = itemHolder.img(R.id.item_heath_iv);
        Intrinsics.X1ii(imageViewImg, "null cannot be cast to non-null type android.widget.ImageView");
        if (healthyReport.getMAbnormalNumber() == 0) {
            Glide.with((FragmentActivity) historyReportsActivity).load(Integer.valueOf(R.drawable.ic_right_message)).into(imageViewImg);
            TextView textViewM3482tv = itemHolder.m3482tv(R.id.item_heath_title);
            if (textViewM3482tv != null) {
                textViewM3482tv.setText(historyReportsActivity.getString(R.string.normal_indicators));
            }
            TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.item_heath_time);
            if (textViewM3482tv2 != null) {
                textViewM3482tv2.setText(healthyReport.getMLocalTime());
            }
        } else {
            Glide.with((FragmentActivity) historyReportsActivity).load(Integer.valueOf(R.drawable.ic_exception_message)).into(imageViewImg);
            TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.item_heath_title);
            if (textViewM3482tv3 != null) {
                textViewM3482tv3.setText(historyReportsActivity.getString(R.string.abnormal_hint, Integer.valueOf(healthyReport.getMAbnormalNumber())));
            }
            TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.item_heath_time);
            if (textViewM3482tv4 != null) {
                textViewM3482tv4.setText(healthyReport.getMLocalTime());
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$1(HistoryReportsActivity historyReportsActivity, HealthyReport healthyReport, View it) {
        Intrinsics.X0O(it, "it");
        String strValueOf = String.valueOf(healthyReport.getMId());
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strValueOf);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(historyReportsActivity, (Class<?>) HeathReportsResultActivity.class);
        intent.putExtras(bundle);
        historyReportsActivity.startActivity(intent);
        return Unit.OXO1;
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final View getMEmptyImg() {
        return (View) this.mEmptyImg$delegate.getValue();
    }

    private final View getMEmptyTv() {
        return (View) this.mEmptyTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mEmptyImg_delegate$lambda$0(HistoryReportsActivity historyReportsActivity) {
        return historyReportsActivity.findViewById(R.id.iv_reports_generation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mEmptyTv_delegate$lambda$0(HistoryReportsActivity historyReportsActivity) {
        return historyReportsActivity.findViewById(R.id.tv_reports_generation);
    }

    private final void showList(final List<HealthyReport> list) {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.X010I1I
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HistoryReportsActivity.showList$lambda$0(this.f3904IO, list, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final HistoryReportsActivity historyReportsActivity, final List list, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        historyReportsActivity.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.i0II00
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return HistoryReportsActivity.showList$lambda$0$0(this.f7351IO, list);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final HistoryReportsActivity historyReportsActivity, final List list) {
        historyReportsActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.i0O1ii0OX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HistoryReportsActivity.showList$lambda$0$0$0(list, historyReportsActivity, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(List list, HistoryReportsActivity historyReportsActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            historyReportsActivity.getRecyclerView().setVisibility(8);
            historyReportsActivity.getMEmptyImg().setVisibility(0);
            historyReportsActivity.getMEmptyTv().setVisibility(0);
        } else {
            historyReportsActivity.getRecyclerView().setVisibility(0);
            historyReportsActivity.getMEmptyImg().setVisibility(8);
            historyReportsActivity.getMEmptyTv().setVisibility(8);
            historyReportsActivity.findData(list);
        }
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.history_record));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_heath_reports_list;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        showList(HeathReportsUtils.OXO1.iOO1ii1());
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
