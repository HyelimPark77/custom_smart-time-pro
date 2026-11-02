package com.sma.smartv3.ui.order;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.fz1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gz1;
import com.android.mltcode.paycertificationapi.hz1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iz1;
import com.android.mltcode.paycertificationapi.jz1;
import com.android.mltcode.paycertificationapi.kz1;
import com.android.mltcode.paycertificationapi.lz1;
import com.android.mltcode.paycertificationapi.mz1;
import com.android.mltcode.paycertificationapi.nz1;
import com.android.mltcode.paycertificationapi.oz1;
import com.android.mltcode.paycertificationapi.pz1;
import com.android.mltcode.paycertificationapi.qz1;
import com.android.mltcode.paycertificationapi.rz1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz1;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountIntegralData;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.IntegralContentData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPointsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsDetailActivity.kt\ncom/sma/smartv3/ui/order/PointsDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n93#2,2:185\n90#2:187\n90#2:209\n1869#3,2:188\n87#4,7:190\n94#4,3:198\n70#4,7:201\n97#4:208\n1#5:197\n*S KotlinDebug\n*F\n+ 1 PointsDetailActivity.kt\ncom/sma/smartv3/ui/order/PointsDetailActivity\n*L\n97#1:185,2\n97#1:187\n113#1:209\n147#1:188,2\n70#1:190,7\n70#1:198,3\n70#1:201,7\n70#1:208\n70#1:197\n*E\n"})
public final class PointsDetailActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btnRecharge$delegate;

    @aa1
    private final Lazy layoutBg$delegate;
    private int pageNum;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy titleBg$delegate;

    @aa1
    private final Lazy tvPoints$delegate;

    public PointsDetailActivity() {
        this.TAG = "PointsDetail";
        this.pageNum = 1;
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new mz1(this));
        this.layoutBg$delegate = LazyKt__LazyJVMKt.iO(new nz1(this));
        this.tvPoints$delegate = LazyKt__LazyJVMKt.iO(new oz1(this));
        this.btnRecharge$delegate = LazyKt__LazyJVMKt.iO(new pz1(this));
        this.titleBg$delegate = LazyKt__LazyJVMKt.iO(new qz1(this));
    }

    public static /* synthetic */ Unit I0iXXO(PointsDetailActivity r0, DslAdapter r1, AccountIntegralData r2) {
        return renderRecyclerAdapter$lambda$0$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView I1XOi1(PointsDetailActivity r0) {
        return tvPoints_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(IntegralContentData r0, DslAdapterItem r1) {
        return showData$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View O10IXXX0X(PointsDetailActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OII(PointsDetailActivity r0) {
        return titleBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OX(PointsDetailActivity r0) {
        return layoutBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(PointsDetailActivity r0, DslAdapter r1) {
        return renderRecyclerAdapter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(PointsDetailActivity r0, AccountIntegralData r1) {
        return onInitBaseLayoutAfter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Button X1ii(PointsDetailActivity r0) {
        return btnRecharge_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(PointsDetailActivity r0, DslViewHolder r1) {
        return renderRecyclerAdapter$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI(DslAdapter r0) {
        return renderRecyclerAdapter$lambda$0$1(r0);
    }

    public static /* synthetic */ void XiOIO(PointsDetailActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(PointsDetailActivity r0, DslAdapter r1) {
        return renderRecyclerAdapter$lambda$0(r0, r1);
    }

    private static final Button btnRecharge_delegate$lambda$0(PointsDetailActivity r1) {
        return (Button) r1.findViewById(R.id.btn_recharge);
    }

    private final Button getBtnRecharge() {
        return (Button) getValue();
    }

    private final View getLayoutBg() {
        return (View) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final View getTitleBg() {
        return (View) getValue();
    }

    private final TextView getTvPoints() {
        return (TextView) getValue();
    }

    public static /* synthetic */ Unit iIiiO(IntegralContentData r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return showData$lambda$0$0$0(r0, r1, r2, r3, r4);
    }

    private static final void initView$lambda$0(PointsDetailActivity r3, View r4) {
        String r5 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r5);
        r0.putInt("mArg1", 2);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(r3, GoogleWebViewActivity.class);
        r6.putExtras(r0);
        r3.startActivity(r6);
    }

    private static final View layoutBg_delegate$lambda$0(PointsDetailActivity r1) {
        return r1.findViewById(R.id.points_recharge_bg_layout);
    }

    private static final Unit onInitBaseLayoutAfter$lambda$0(PointsDetailActivity r0, AccountIntegralData r1) {
        r0.renderRecyclerAdapter();
        return Unit.OXO1;
    }

    private static final Unit renderRecyclerAdapter$lambda$0(final PointsDetailActivity r8, DslAdapter r9) {
        Intrinsics.X0O(r9, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r9, 2, null, 2, null);
        r9.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        SPUtils r2 = a01.OXO1.IiI10X();
        AccountIntegralData r3 = (AccountIntegralData) new Gson().fromJson(r2.getString(b01.XIO11I + '_' + AccountIntegralData.class.getName()), AccountIntegralData.class);
        if (r3 != null) goto L5;
    L7:
        DslAdapter.setAdapterStatus$default(r8.getDslAdapter(), 1, null, 2, null);
    L8:
        r9.getDslLoadMoreItem().setOnLoadMore(new fz1(r8));
        DslAdapter.render$default(r9, false, null, new kz1(), 3, null);
        return Unit.OXO1;
    L5:
        if (r3.getContent().isEmpty() == true) goto L7;
        r8.showData(r9, r3);
        r9.setLoadMoreEnable(true);
        goto L8
    }

    private static final Unit renderRecyclerAdapter$lambda$0$0(final PointsDetailActivity r1, DslViewHolder r2) {
        Intrinsics.X0O(r2, "it");
        r1.renderAdapter(new rz1(r1));
        return Unit.OXO1;
    }

    private static final Unit renderRecyclerAdapter$lambda$0$0$0(final PointsDetailActivity r3, final DslAdapter r4) {
        Intrinsics.X0O(r4, "$this$renderAdapter");
        int r0 = r3.pageNum + 1;
        r3.pageNum = r0;
        OrderManager.OXO1.I0IIOi(r0, new gz1(r3, r4));
        return Unit.OXO1;
    }

    private static final Unit renderRecyclerAdapter$lambda$0$0$0$0(PointsDetailActivity r13, DslAdapter r14, AccountIntegralData r15) {
        if (r15 != null) goto L4;
    L8:
        DslAdapter.setLoadMore$default(r14, 2, null, false, 6, null);
    L10:
        return Unit.OXO1;
    L4:
        if (r15.getContent() == null) goto L8;
        if (r15.getContent().isEmpty() == true) goto L8;
        r13.showData(r14, r15);
        DslAdapter.setLoadMore$default(r14, 0, null, false, 6, null);
        goto L10
    }

    private static final Unit renderRecyclerAdapter$lambda$0$1(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(PointsDetailActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private final void showData(DslAdapter r4, AccountIntegralData r5) {
        if (r5.getContent() != null) goto L6;
        LogUtils.e(new Object[]{"integralData.content == null"});
        return;
    L6:
        LogUtils.d(new Object[]{"integralData.content == " + r5.getContent().size()});
        Iterator<T> r6 = r5.getContent().iterator();
    L8:
        if (r6.hasNext() == false) goto L10;
        final IntegralContentData r0 = (IntegralContentData) r6.next();
        DslAdapterExKt.O10IXXX0X(r4, R.layout.item_points_detail, new lz1(r0));
        goto L8
    }

    private static final Unit showData$lambda$0$0(final IntegralContentData r1, DslAdapterItem r2) {
        Intrinsics.X0O(r2, "$this$dslItem");
        r2.setItemBindOverride(new iz1(r1));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$0$0(IntegralContentData r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "holder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv_name);
        if (r5 == null) goto L5;
        r5.setText(r0.getRecordItem());
    L5:
        TextView r6 = r1.tv(R.id.tv_date);
        if (r6 == null) goto L8;
        r6.setText(r0.getCreatedAt());
    L8:
        TextView r7 = r1.tv(R.id.tv_points_change);
        if (r7 == null) goto L15;
        r7.setText(r0.getPointsChange());
        if (r0.getChangeFlag() != 0) goto L13;
        int r8 = gk4.iO(r7.getContext(), R.color.order_text_orange);
    L14:
        r7.setTextColor(r8);
        goto L15
    L13:
        r8 = gk4.iO(r7.getContext(), R.color.line_color);
    L15:
        View r9 = r1.v(R.id.item_points_detail_layout);
        if (r9 == null) goto L19;
        r9.setBackgroundTintList(ColorStateList.valueOf(gk4.iO(r9.getContext(), R.color.points_three_bg_color)));
    L19:
        return Unit.OXO1;
    }

    private final void showPoints() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new Gson().fromJson(r0.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), AccountPoints.class);
        if (r1 != null) goto L5;
        r1 = AccountPoints.class.newInstance();
    L5:
        getTvPoints().setText(cp5.X1IX(((AccountPoints) r1).getPoints(), false, 2, null));
    }

    private static final View titleBg_delegate$lambda$0(PointsDetailActivity r1) {
        return r1.findViewById(R.id.order_points_detail_title_bg);
    }

    private static final TextView tvPoints_delegate$lambda$0(PointsDetailActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_points);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.root_view));
        setNavBarColor(this, gk4.iO(this, R.color.points_bg_color));
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.points_detail);
        getBtnRecharge().setOnClickListener(new jz1(this));
        showPoints();
        getTitleBg().setBackgroundTintList(ColorStateList.valueOf(gk4.iO(this, R.color.points_three_bg_color)));
        getBtnRecharge().setBackgroundTintList(ColorStateList.valueOf(gk4.iO(this, R.color.order_points_detail_btn_bg)));
        getLayoutBg().setBackgroundTintList(ColorStateList.valueOf(gk4.iO(this, R.color.points_bg_color)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_order_points_detail;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        OrderManager.OXO1.I0IIOi(this.pageNum, new hz1(this));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @sf5(tag = I01XX0.iIi0)
    public final void onUserPointsChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onUserPointsChange");
        showPoints();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv_points_detail;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void renderRecyclerAdapter() {
        renderAdapter(new sz1(this));
    }
}
