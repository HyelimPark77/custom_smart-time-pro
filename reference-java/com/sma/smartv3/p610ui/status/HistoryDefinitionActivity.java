package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.p610ui.status.HistoryDefinitionActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHistoryDefinitionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2,2:171\n*S KotlinDebug\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n*L\n79#1:171,2\n*E\n"})
public final class HistoryDefinitionActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiiX1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HistoryDefinitionActivity.abhTitleCenter_delegate$lambda$0(this.f1925IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(HistoryDefinitionActivity historyDefinitionActivity) {
        return (TextView) historyDefinitionActivity.findViewById(R.id.abh_title_center);
    }

    private final void findData() {
        String string = a01.OXO1.IiI10X().getString(b01.I1XOi1);
        Intrinsics.XXI(string);
        if (string.length() == 0) {
            string = q62.OXO1.iIIIiIO0();
        }
        String str = string;
        Intrinsics.XXI(str);
        List listI1I = StringsKt__StringsKt.i1I(str, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null);
        for (final String str2 : (String[]) listI1I.toArray(new String[0])) {
            DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_heath_definition_list, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOi0XiO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HistoryDefinitionActivity.findData$lambda$0(str2, this, (DslAdapterItem) obj);
                }
            });
        }
        getDslAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0(final String str, final HistoryDefinitionActivity historyDefinitionActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsHover(false);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iXO1i
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return HistoryDefinitionActivity.findData$lambda$0$0(str, historyDefinitionActivity, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x02c9 A[DONT_INVERT, PHI: r1 r2
  0x02c9: PHI (r1v1 com.sma.smartv3.ui.status.HistoryDefinitionActivity) = 
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v4 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
  (r1v0 com.sma.smartv3.ui.status.HistoryDefinitionActivity)
 binds: [B:3:0x0060, B:56:0x02c7, B:49:0x0229, B:38:0x01c8, B:30:0x01a1, B:22:0x017b, B:14:0x00d5, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]
  0x02c9: PHI (r2v3 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView) = 
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v7 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
  (r2v2 com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView)
 binds: [B:3:0x0060, B:56:0x02c7, B:49:0x0229, B:38:0x01c8, B:30:0x01a1, B:22:0x017b, B:14:0x00d5, B:6:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x02cb  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02d5, code lost:
    
        r2 = r2;
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit findData$lambda$0$0(String str, HistoryDefinitionActivity historyDefinitionActivity, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        HistoryDefinitionActivity historyDefinitionActivity2 = historyDefinitionActivity;
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.item_definition_title);
        itemHolder.m3482tv(R.id.item_definition_tip);
        CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) itemHolder.m3483v(R.id.sbv);
        Double.valueOf(100.0d);
        Double.valueOf(0.0d);
        switch (str) {
            case "pressure":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.pressure));
                }
            case "weight":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.weight));
                }
            case "blood_oxygen":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.blood_oxygen));
                }
            case "sleep":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.sleep));
                }
            case "blood_pressure":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.blood_glucose));
                }
            case "blood_glucose2":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.blood_glucose));
                }
            case "heart_rate":
                if (textViewM3482tv != null) {
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.heart_rate));
                }
            default:
                if (textViewM3482tv != null) {
                    circleThumbSegmentedBarView = circleThumbSegmentedBarView;
                    historyDefinitionActivity2 = historyDefinitionActivity2;
                    textViewM3482tv.setText(historyDefinitionActivity2.getString(R.string.sleep));
                }
        }
        return Unit.OXO1;
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final void setBmi(SegmentedBarView segmentedBarView, float f, List<Double> list, String[] strArr, int[] iArr) {
        Intrinsics.XXI(segmentedBarView);
        WeightMeasureDataKt.setBarView(segmentedBarView, f, list, strArr, iArr, true);
        LibExKt.I0XXi0X(segmentedBarView, true);
    }

    private final void showList() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.Xi10XX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HistoryDefinitionActivity.showList$lambda$0(this.f5217IO, (DslAdapter) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final HistoryDefinitionActivity historyDefinitionActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        historyDefinitionActivity.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iiX1O1i
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return HistoryDefinitionActivity.showList$lambda$0$0(this.f2609IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final HistoryDefinitionActivity historyDefinitionActivity) {
        historyDefinitionActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXXiiXIXX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HistoryDefinitionActivity.showList$lambda$0$0$0(this.f8418IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(HistoryDefinitionActivity historyDefinitionActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        historyDefinitionActivity.findData();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.health_definition_title));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_heath_reports_list;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        showList();
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
