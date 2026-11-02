package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.IOi0XiO;
import com.android.mltcode.paycertificationapi.IOiiX1I;
import com.android.mltcode.paycertificationapi.O0iiX1O1i;
import com.android.mltcode.paycertificationapi.Xi10XX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.iXO1i;
import com.android.mltcode.paycertificationapi.iXXiiXIXX;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHistoryDefinitionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2,2:171\n*S KotlinDebug\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n*L\n79#1:171,2\n*E\n"})
public final class HistoryDefinitionActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    public HistoryDefinitionActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new IOiiX1I(this));
    }

    public static /* synthetic */ Unit I0iXXO(HistoryDefinitionActivity r0) {
        return showList$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit I1XOi1(HistoryDefinitionActivity r0, DslAdapter r1) {
        return showList$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(HistoryDefinitionActivity r0, DslAdapter r1) {
        return showList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(String r0, HistoryDefinitionActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return findData$lambda$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ TextView X1ii(HistoryDefinitionActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(String r0, HistoryDefinitionActivity r1, DslAdapterItem r2) {
        return findData$lambda$0(r0, r1, r2);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(HistoryDefinitionActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private final void findData() {
        String r0 = a01.OXO1.IiI10X().getString(b01.I1XOi1);
        Intrinsics.XXI(r0);
        if (r0.length() != 0) goto L5;
        r0 = q62.OXO1.iIIIiIO0();
    L5:
        String r1 = r0;
        Intrinsics.XXI(r1);
        List r2 = StringsKt__StringsKt.i1I(r1, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);
        int r3 = 0;
        String[] r4 = (String[]) r2.toArray(new String[0]);
        int r5 = r4.length;
    L6:
        if (r3 >= r5) goto L8;
        final String r6 = r4[r3];
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_heath_definition_list, new IOi0XiO(r6, this));
        r3 = r3 + 1;
        goto L6
    L8:
        getDslAdapter().notifyDataSetChanged();
    }

    private static final Unit findData$lambda$0(final String r1, final HistoryDefinitionActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsHover(false);
        r3.setItemBindOverride(new iXO1i(r1, r2));
        r3.setItemTag(r1);
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0(String r19, HistoryDefinitionActivity r20, DslViewHolder r21, int r22, DslAdapterItem r23, List r24) {
        HistoryDefinitionActivity r1 = r20;
        Intrinsics.X0O(r21, "itemHolder");
        Intrinsics.X0O(r23, "<unused var>");
        Intrinsics.X0O(r24, "<unused var>");
        TextView r3 = r21.tv(R.id.item_definition_title);
        TextView r4 = r21.tv(R.id.item_definition_tip);
        CircleThumbSegmentedBarView r2 = (CircleThumbSegmentedBarView) r21.v(R.id.sbv);
        int r5 = r19.hashCode();
        Double r15 = Double.valueOf(100.0d);
        Double r6 = Double.valueOf(0.0d);
        switch(r5) {
            case -1276242363: goto L56;
            case -791592328: goto L48;
            case -240915579: goto L38;
            case 109522647: goto L30;
            case 560044778: goto L22;
            case 1467734697: goto L14;
            case 1930449209: goto L6;
            default: goto L57;
        };
    L57:
        if (r3 == null) goto L59;
        r3.setText(r1.getString(R.string.sleep));
    L59:
        LibExKt.XX1Oi(r2, true);
    L66:
        return Unit.OXO1;
    L6:
        if (r19.equals("heart_rate") == false) goto L57;
        if (r3 == null) goto L10;
        r3.setText(r1.getString(R.string.heart_rate));
    L10:
        if (r4 == null) goto L12;
        r4.setText(r1.getString(R.string.health_definition_hr));
    L12:
        List<Double> r7 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{r6, Double.valueOf(60.0d), r15, Double.valueOf(180.0d)});
        String r0 = r1.getString(R.string.lightness_low);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        String r8 = r1.getString(R.string.lightness_middle);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        String r9 = r1.getString(R.string.lightness_high);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        r20.setBmi(r2, 80.0f, r7, new String[]{r0, r8, r9}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936, -65536}));
        goto L66
    L14:
        if (r19.equals(q62.O001OXi) == false) goto L57;
        if (r3 == null) goto L18;
        r3.setText(r1.getString(R.string.blood_glucose));
    L18:
        if (r4 == null) goto L20;
        r4.setText(r1.getString(R.string.health_definition_bg));
    L20:
        List<Double> r10 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{r6, Double.valueOf(6.1d), Double.valueOf(6.9d), Double.valueOf(10.0d)});
        String r11 = r1.getString(R.string.bg_normal);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        String r12 = r1.getString(R.string.bg_prediabetes);
        Intrinsics.O10IXXX0X(r12, "getString(...)");
        String r13 = r1.getString(R.string.bg_diabetes);
        Intrinsics.O10IXXX0X(r13, "getString(...)");
        r20.setBmi(r2, 3.0f, r10, new String[]{r11, r12, r13}, ArraysKt___ArraysKt.iiIX1(new Integer[]{Integer.valueOf(r1.getMContext().getResources().getColor(R.color.bg_level_color_normal)), Integer.valueOf(r1.getMContext().getResources().getColor(R.color.bg_level_color_prediabetes)), Integer.valueOf(r1.getMContext().getResources().getColor(R.color.bg_level_color_diabetes))}));
        goto L66
    L22:
        if (r19.equals(q62.OXOXXiI) == false) goto L57;
        if (r3 == null) goto L26;
        r3.setText(r1.getString(R.string.blood_glucose));
    L26:
        if (r4 == null) goto L28;
        r4.setText(r1.getString(R.string.health_definition_bp));
    L28:
        LibExKt.XX1Oi(r2, true);
        goto L66
    L30:
        if (r19.equals("sleep") == false) goto L57;
        if (r3 == null) goto L34;
        r3.setText(r1.getString(R.string.sleep));
    L34:
        LibExKt.XX1Oi(r2, true);
        if (r4 == null) goto L66;
        r4.setText(r1.getString(R.string.health_definition_sleep));
        goto L66
    L38:
        if (r19.equals(q62.IiOIO1OX) == false) goto L57;
        if (r3 == null) goto L42;
        r3.setText(r1.getString(R.string.blood_oxygen));
    L42:
        if (r4 == null) goto L44;
        r4.setText(r1.getString(R.string.health_definition_oxy));
    L44:
        List<Double> r14 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{r6, Double.valueOf(92.0d), r15});
        String r16 = r1.getString(R.string.lightness_low);
        Intrinsics.O10IXXX0X(r16, "getString(...)");
        String r17 = r1.getString(R.string.bg_normal);
        Intrinsics.O10IXXX0X(r17, "getString(...)");
        r20.setBmi(r2, 95.0f, r14, new String[]{r16, r17}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936}));
        if (r2 == null) goto L66;
        r2.setSegmentSideRule(0);
        goto L66
    L48:
        if (r19.equals("weight") == true) goto L50;
        r2 = r2;
        r1 = r1;
        goto L57
    L50:
        if (r3 == null) goto L52;
        r3.setText(r1.getString(R.string.weight));
    L52:
        if (r4 == null) goto L54;
        r4.setText(r1.getString(R.string.health_definition_weight));
    L54:
        List<Double> r18 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{r6, Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d), Double.valueOf(39.9d)});
        String r25 = r1.getString(R.string.thin);
        Intrinsics.O10IXXX0X(r25, "getString(...)");
        String r26 = r1.getString(R.string.normal);
        Intrinsics.O10IXXX0X(r26, "getString(...)");
        String r27 = r1.getString(R.string.too_heavy);
        Intrinsics.O10IXXX0X(r27, "getString(...)");
        String r28 = r1.getString(R.string.class_1_obesity);
        Intrinsics.O10IXXX0X(r28, "getString(...)");
        r20.setBmi(r2, 20.0f, r18, new String[]{r25, r26, r27, r28}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936, Integer.valueOf(r1.getMContext().getResources().getColor(R.color.bg_level_color_prediabetes)), -65536}));
        goto L66
    L56:
        if (r19.equals(q62.IIII0II) == false) goto L57;
        if (r3 == null) goto L62;
        r3.setText(r1.getString(R.string.pressure));
    L62:
        if (r4 == null) goto L64;
        r4.setText(r1.getString(R.string.health_definition_pressure));
    L64:
        List<Double> r29 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{r6, Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), r15});
        String[] r30 = r1.getMContext().getResources().getStringArray(R.array.level_range_4_2_bmi);
        Intrinsics.O10IXXX0X(r30, "getStringArray(...)");
        int[] r31 = r1.getMContext().getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(r31, "getIntArray(...)");
        r20.setBmi(r2, 20.0f, r29, r30, r31);
        goto L66
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final void setBmi(SegmentedBarView r8, float r9, List<Double> r10, String[] r11, int[] r12) {
        Intrinsics.XXI(r8);
        WeightMeasureDataKt.setBarView(r8, r9, r10, r11, r12, true);
        LibExKt.I0XXi0X(r8, true);
    }

    private final void showList() {
        renderAdapter(new Xi10XX(this));
    }

    private static final Unit showList$lambda$0(final HistoryDefinitionActivity r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        r3.getDslViewHolder().postDelay(300, new O0iiX1O1i(r3));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(final HistoryDefinitionActivity r1) {
        r1.renderAdapter(new iXXiiXIXX(r1));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(HistoryDefinitionActivity r3, DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r4, 0, null, 2, null);
        r3.findData();
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.health_definition_title));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_heath_reports_list;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        showList();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }
}
