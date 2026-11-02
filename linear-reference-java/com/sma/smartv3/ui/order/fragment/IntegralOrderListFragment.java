package com.sma.smartv3.ui.order.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.e8;
import com.android.mltcode.paycertificationapi.f8;
import com.android.mltcode.paycertificationapi.g8;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.h8;
import com.android.mltcode.paycertificationapi.i8;
import com.android.mltcode.paycertificationapi.j8;
import com.android.mltcode.paycertificationapi.k8;
import com.android.mltcode.paycertificationapi.l8;
import com.android.mltcode.paycertificationapi.m8;
import com.android.mltcode.paycertificationapi.n8;
import com.android.mltcode.paycertificationapi.o8;
import com.android.mltcode.paycertificationapi.p8;
import com.android.mltcode.paycertificationapi.q8;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.baidu.platform.comapi.map.MapController;
import com.blankj.utilcode.util.LogUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountOrderData;
import com.sma.smartv3.model.OrderContentData;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nIntegralOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegralOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/IntegralOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1869#2,2:149\n*S KotlinDebug\n*F\n+ 1 IntegralOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/IntegralOrderListFragment\n*L\n109#1:149,2\n*E\n"})
public final class IntegralOrderListFragment extends BaseOrderListFragment {

    @aa1
    private String itemOrderNum;

    public IntegralOrderListFragment() {
        setOrderType("Points");
        this.itemOrderNum = "";
    }

    public static /* synthetic */ void I1(IntegralOrderListFragment r0, OrderContentData r1, int r2, DslAdapterItem r3, DslViewHolder r4, DslAdapter r5, View r6) {
        findData$lambda$0$0$0$0(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ Unit I1XOi1(IntegralOrderListFragment r0, AccountOrderData r1) {
        return getOrderList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit II1Xi0(IntegralOrderListFragment r0, DslViewHolder r1) {
        return setAdapter$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(IntegralOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(IntegralOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(IntegralOrderListFragment r0, OrderContentData r1, DslAdapterItem r2, DslAdapter r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ Unit OiIIX101O(IntegralOrderListFragment r0, OrderContentData r1, DslAdapter r2, DslAdapterItem r3) {
        return findData$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit X01IiOiIi(IntegralOrderListFragment r0) {
        return setAdapter$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean XX0(DslViewHolder r0, View r1, MotionEvent r2) {
        return findData$lambda$0$0$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XiOIO(OrderContentData r0, IntegralOrderListFragment r1, DslAdapterItem r2, View r3) {
        return findData$lambda$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XiOIii1(DslAdapter r0) {
        return setAdapter$lambda$0$2(r0);
    }

    private static final Unit findData$lambda$0$0(final IntegralOrderListFragment r1, final OrderContentData r2, final DslAdapter r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuFlag(4);
        r4.setItemBindOverride(new o8(r1, r2, r4, r3));
        r4.setItemClick(new p8(r2, r1, r4));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(final IntegralOrderListFragment r1, final OrderContentData r2, final DslAdapterItem r3, final DslAdapter r4, final DslViewHolder r5, final int r6, DslAdapterItem r7, List r8) {
        Intrinsics.X0O(r5, "itemHolder");
        Intrinsics.X0O(r7, "<unused var>");
        Intrinsics.X0O(r8, "<unused var>");
        r1.initItem(r5, r2, r6);
        r5.click(R.id.bt_delete_record, new q8(r1, r2, r6, r3, r5, r4));
        View r9 = r5.view(R.id.ll_item_panel);
        if (r9 == null) goto L6;
        r9.setOnTouchListener(new f8(r5));
    L6:
        return Unit.OXO1;
    }

    private static final void findData$lambda$0$0$0$0(IntegralOrderListFragment r0, OrderContentData r1, int r2, DslAdapterItem r3, DslViewHolder r4, DslAdapter r5, View r6) {
        r0.itemOrderNum = r1.getOrderNum();
        r0.deleteRecord(r2);
        r0.deleteOrder(r0.itemOrderNum);
        SwipeMenuHelper r7 = r3.get_itemSwipeMenuHelper();
        if (r7 == null) goto L5;
        r7.closeSwipeMenu(r4);
    L5:
        DslAdapter r8 = r3.getItemDslAdapter();
        if (r8 == null) goto L8;
        DslAdapter.removeItem$default(r8, r3, false, 2, null);
    L8:
        DslAdapter r9 = r3.getItemDslAdapter();
        if (r9 == null) goto L15;
        List<DslAdapterItem> r10 = r9.getDataItems();
        if (r10 == null) goto L15;
        if (r10.size() != 0) goto L15;
        DslAdapter.setAdapterStatus$default(r5, 1, null, 2, null);
    L15:
        DslAdapter r11 = r3.getItemDslAdapter();
        if (r11 == null) goto L19;
        DslAdapter.updateItemDepend$default(r11, null, 1, null);
        return;
    }

    private static final boolean findData$lambda$0$0$0$1$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final Unit findData$lambda$0$0$1(OrderContentData r1, IntegralOrderListFragment r2, DslAdapterItem r3, View r4) {
        Intrinsics.X0O(r4, "view");
        if (XXiO.XO0O10(r1.getPayStatus()) == true) goto L5;
        r2.showConfirm(r1.getOrderNum());
    L5:
        SwipeMenuHelper r5 = r3.get_itemSwipeMenuHelper();
        if (r5 == null) goto L9;
        SwipeMenuHelper.closeSwipeMenu$default(r5, null, 1, null);
    L9:
        return Unit.OXO1;
    }

    private static final Unit getOrderList$lambda$0(IntegralOrderListFragment r1, AccountOrderData r2) {
        if (r2 == null) goto L4;
        r1.getMList().clear();
        r1.getMList().addAll(CollectionsKt___CollectionsKt.OO0Oi10(r2.getContent()));
    L4:
        r1.setAdapter();
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iIiiO(IntegralOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(IntegralOrderListFragment r0, DslAdapter r1, AccountOrderData r2) {
        return setAdapter$lambda$0$1$0$0(r0, r1, r2);
    }

    private static final Unit setAdapter$lambda$0(final IntegralOrderListFragment r8, DslAdapter r9) {
        Intrinsics.X0O(r9, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r9, 2, null, 2, null);
        r9.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        r8.getDslViewHolder().postDelay(500, new e8(r8));
        r9.getDslLoadMoreItem().setOnLoadMore(new i8(r8));
        DslAdapter.render$default(r9, false, null, new j8(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0(final IntegralOrderListFragment r1) {
        r1.renderAdapter(new m8(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0$0(IntegralOrderListFragment r4, DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r5, 0, null, 2, null);
        if (r4.getMList().isEmpty() == false) goto L5;
        DslAdapter.setAdapterStatus$default(r4.getDslAdapter(), 1, null, 2, null);
    L7:
        return Unit.OXO1;
    L5:
        r5.clearAllItems();
        r4.findData(r5, r4.getMList());
        r5.setLoadMoreEnable(true);
        goto L7
    }

    private static final Unit setAdapter$lambda$0$1(final IntegralOrderListFragment r1, DslViewHolder r2) {
        Intrinsics.X0O(r2, "it");
        r1.renderAdapter(new n8(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$1$0(final IntegralOrderListFragment r4, final DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        r4.setPageNum(r4.getPageNum() + 1);
        OrderManager.OXO1.OIi0(r4.getOrderType(), r4.getPageNum(), new l8(r4, r5));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$1$0$0(IntegralOrderListFragment r12, DslAdapter r13, AccountOrderData r14) {
        if (r14 != null) goto L4;
    L8:
        DslAdapter.setLoadMore$default(r13, 2, null, false, 6, null);
    L10:
        return Unit.OXO1;
    L4:
        if (r14.getContent() == null) goto L8;
        if (r14.getContent().isEmpty() == true) goto L8;
        r12.findData(r13, r14.getContent());
        DslAdapter.setLoadMore$default(r13, 0, null, false, 6, null);
        goto L10
    }

    private static final Unit setAdapter$lambda$0$2(DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$render");
        DslAdapter.setAdapterStatus$default(r3, 0, null, 2, null);
        return Unit.OXO1;
    }

    public final void findData(@aa1 final DslAdapter r5, @aa1 List<OrderContentData> r6) {
        Intrinsics.X0O(r5, "<this>");
        Intrinsics.X0O(r6, "mList");
        LogUtils.d(new Object[]{"findData " + getOrderType() + " mList = " + r6.size()});
        Iterator<T> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        final OrderContentData r0 = (OrderContentData) r7.next();
        DslAdapterExKt.O10IXXX0X(r5, R.layout.item_order_integral, new h8(this, r0, r5));
        goto L4
    }

    @aa1
    public final String getItemOrderNum() {
        return this.itemOrderNum;
    }

    @Override // com.sma.smartv3.ui.order.fragment.BaseOrderListFragment
    public void getOrderList() {
        OrderManager.OXO1.OIi0(getOrderType(), getPageNum(), new k8(this));
    }

    public final void initItem(@aa1 DslViewHolder r8, @aa1 OrderContentData r9, int r10) {
        Intrinsics.X0O(r8, "holder");
        Intrinsics.X0O(r9, MapController.ITEM_LAYER_TAG);
        TextView r11 = (TextView) r8.v(R.id.order_integral_remark);
        TextView r0 = (TextView) r8.v(R.id.order_integral_amount);
        TextView r1 = (TextView) r8.v(R.id.order_integral_orderNum);
        TextView r2 = (TextView) r8.v(R.id.order_integral_time);
        TextView r3 = (TextView) r8.v(R.id.order_integral_orderNum_title);
        if (r3 == null) goto L5;
        r3.setText(getString(R.string.order_orderNum) + CertificateUtil.DELIMITER);
    L5:
        if (r11 == null) goto L7;
        r11.setVisibility(0);
    L7:
        if (r11 == null) goto L9;
        r11.setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.iO(r9.getAmount(), null, 2, null));
    L9:
        if (r0 == null) goto L11;
        r0.setText(getString(R.string.recharge) + r9.getSubject() + getString(R.string.points));
    L11:
        if (r1 == null) goto L13;
        r1.setText(r9.getOrderNum());
    L13:
        if (r2 == null) goto L16;
        r2.setText(r9.getCreatedAt());
    L16:
        if (r11 == null) goto L18;
        r11.setTextColor(gk4.iO(getContext(), R.color.text_color));
    L18:
        TextView r12 = (TextView) r8.v(R.id.order_integral_pay_status);
        if (r12 != null) goto L21;
        return;
    L21:
        if (XXiO.XO0O10(r9.getPayStatus()) == false) goto L23;
        r12.setText(getString(R.string.order_pay_status_payed));
        int r13 = gk4.iO(r12.getContext(), R.color.text_color);
    L24:
        r12.setTextColor(r13);
        return;
    L23:
        r12.setText(getString(R.string.order_pay_status_created));
        r13 = gk4.iO(r12.getContext(), R.color.order_text_orange);
        goto L24
    }

    @Override // com.sma.smartv3.ui.order.fragment.BaseOrderListFragment
    public void setAdapter() {
        renderAdapter(new g8(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    public final void setItemOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.itemOrderNum = r2;
    }
}
