package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I0XOO1iOI;
import com.android.mltcode.paycertificationapi.I0i01OO0O;
import com.android.mltcode.paycertificationapi.II0001;
import com.android.mltcode.paycertificationapi.IOiOX1O01;
import com.android.mltcode.paycertificationapi.X010I1I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i0II00;
import com.android.mltcode.paycertificationapi.i0O1ii0OX;
import com.android.mltcode.paycertificationapi.iO00O1i;
import com.android.mltcode.paycertificationapi.iOII1XOi;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.bumptech.glide.Glide;
import com.sma.smartv3.db.entity.HealthyReport;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nHistoryReportsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryReportsActivity.kt\ncom/sma/smartv3/ui/status/HistoryReportsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1869#2,2:134\n87#3,7:136\n94#3,3:144\n70#3,7:147\n97#3:154\n1#4:143\n*S KotlinDebug\n*F\n+ 1 HistoryReportsActivity.kt\ncom/sma/smartv3/ui/status/HistoryReportsActivity\n*L\n83#1:134,2\n102#1:136,7\n102#1:144,3\n102#1:147,7\n102#1:154\n102#1:143\n*E\n"})
public final class HistoryReportsActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy mEmptyImg$delegate;

    @aa1
    private final Lazy mEmptyTv$delegate;

    public HistoryReportsActivity() {
        this.mEmptyImg$delegate = LazyKt__LazyJVMKt.iO(new I0i01OO0O(this));
        this.mEmptyTv$delegate = LazyKt__LazyJVMKt.iO(new IOiOX1O01(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new iO00O1i(this));
    }

    public static /* synthetic */ Unit I0iXXO(List r0, HistoryReportsActivity r1, DslAdapter r2) {
        return showList$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1XOi1(HealthyReport r0, HistoryReportsActivity r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ View IIX1OXO(HistoryReportsActivity r0) {
        return mEmptyTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(HistoryReportsActivity r0, HealthyReport r1, View r2) {
        return findData$lambda$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit X0O(HistoryReportsActivity r0, List r1) {
        return showList$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View X1ii(HistoryReportsActivity r0) {
        return mEmptyImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(HistoryReportsActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(HistoryReportsActivity r0, List r1, DslAdapter r2) {
        return showList$lambda$0(r0, r1, r2);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(HistoryReportsActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private final void findData(List<HealthyReport> r4) {
        Iterator<T> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        final HealthyReport r0 = (HealthyReport) r5.next();
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_heath_reports_list, new I0XOO1iOI(r0, this));
        goto L4
    L6:
        getDslAdapter().notifyDataSetChanged();
    }

    private static final Unit findData$lambda$0$0(final HealthyReport r1, final HistoryReportsActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsHover(false);
        r3.setItemBindOverride(new iOII1XOi(r1, r2));
        r3.setItemTag(r1.getMLocalTime());
        r3.setItemClick(new II0001(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(HealthyReport r2, HistoryReportsActivity r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        Intrinsics.X0O(r4, "itemHolder");
        Intrinsics.X0O(r6, "<unused var>");
        Intrinsics.X0O(r7, "<unused var>");
        ImageView r8 = r4.img(R.id.item_heath_iv);
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type android.widget.ImageView");
        if (r2.getMAbnormalNumber() != 0) goto L10;
        Glide.with(r3).load(Integer.valueOf(R.drawable.ic_right_message)).into(r8);
        TextView r9 = r4.tv(R.id.item_heath_title);
        if (r9 == null) goto L7;
        r9.setText(r3.getString(R.string.normal_indicators));
    L7:
        TextView r10 = r4.tv(R.id.item_heath_time);
        if (r10 == null) goto L17;
        r10.setText(r2.getMLocalTime());
    L17:
        return Unit.OXO1;
    L10:
        Glide.with(r3).load(Integer.valueOf(R.drawable.ic_exception_message)).into(r8);
        TextView r11 = r4.tv(R.id.item_heath_title);
        if (r11 == null) goto L13;
        r11.setText(r3.getString(R.string.abnormal_hint, new Object[]{Integer.valueOf(r2.getMAbnormalNumber())}));
    L13:
        TextView r12 = r4.tv(R.id.item_heath_time);
        if (r12 == null) goto L17;
        r12.setText(r2.getMLocalTime());
        goto L17
    }

    private static final Unit findData$lambda$0$0$1(HistoryReportsActivity r1, HealthyReport r2, View r3) {
        Intrinsics.X0O(r3, "it");
        String r4 = String.valueOf(r2.getMId());
        Bundle r5 = new Bundle();
        r5.putString("mArg0", r4);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r6 = new Intent(r1, HeathReportsResultActivity.class);
        r6.putExtras(r5);
        r1.startActivity(r6);
        return Unit.OXO1;
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final View getMEmptyImg() {
        return (View) getValue();
    }

    private final View getMEmptyTv() {
        return (View) getValue();
    }

    public static /* synthetic */ Unit iIiiO(HealthyReport r0, HistoryReportsActivity r1, DslAdapterItem r2) {
        return findData$lambda$0$0(r0, r1, r2);
    }

    private static final View mEmptyImg_delegate$lambda$0(HistoryReportsActivity r1) {
        return r1.findViewById(R.id.iv_reports_generation);
    }

    private static final View mEmptyTv_delegate$lambda$0(HistoryReportsActivity r1) {
        return r1.findViewById(R.id.tv_reports_generation);
    }

    private final void showList(final List<HealthyReport> r2) {
        renderAdapter(new X010I1I(this, r2));
    }

    private static final Unit showList$lambda$0(final HistoryReportsActivity r1, final List r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r1.getDslViewHolder().postDelay(300, new i0II00(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(final HistoryReportsActivity r1, final List r2) {
        r1.renderAdapter(new i0O1ii0OX(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(List r3, HistoryReportsActivity r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r5, 0, null, 2, null);
        List r6 = r3;
        if (r6 != null) goto L5;
    L8:
        r4.getRecyclerView().setVisibility(8);
        r4.getMEmptyImg().setVisibility(0);
        r4.getMEmptyTv().setVisibility(0);
    L10:
        return Unit.OXO1;
    L5:
        if (r6.isEmpty() == true) goto L8;
        r4.getRecyclerView().setVisibility(0);
        r4.getMEmptyImg().setVisibility(8);
        r4.getMEmptyTv().setVisibility(8);
        r4.findData(r3);
        goto L10
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.history_record));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_heath_reports_list;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        showList(HeathReportsUtils.OXO1.iOO1ii1());
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
