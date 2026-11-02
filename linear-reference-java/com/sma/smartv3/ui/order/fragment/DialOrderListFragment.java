package com.sma.smartv3.ui.order.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.IIXIIIiI0;
import com.android.mltcode.paycertificationapi.IOIiIIii;
import com.android.mltcode.paycertificationapi.IX1O0I;
import com.android.mltcode.paycertificationapi.O11IiI0;
import com.android.mltcode.paycertificationapi.OXXOOiOO;
import com.android.mltcode.paycertificationapi.OiOii1;
import com.android.mltcode.paycertificationapi.X101O;
import com.android.mltcode.paycertificationapi.X1I0iOX1O;
import com.android.mltcode.paycertificationapi.XO0O0i1;
import com.android.mltcode.paycertificationapi.XX0i00III;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iOXO1O1X;
import com.android.mltcode.paycertificationapi.iX1O01;
import com.android.mltcode.paycertificationapi.iXOOX0i;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.baidu.platform.comapi.map.MapController;
import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
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
@SourceDebugExtension({"SMAP\nDialOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/DialOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1869#2,2:162\n*S KotlinDebug\n*F\n+ 1 DialOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/DialOrderListFragment\n*L\n116#1:162,2\n*E\n"})
public final class DialOrderListFragment extends BaseOrderListFragment {

    @aa1
    private String itemOrderNum;

    public DialOrderListFragment() {
        setOrderType("WatchFace");
        this.itemOrderNum = "";
    }

    public static /* synthetic */ Unit I1(DialOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(DialOrderListFragment r0, DslAdapter r1, AccountOrderData r2) {
        return setAdapter$lambda$0$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit II1Xi0(DslAdapter r0) {
        return setAdapter$lambda$0$2(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(DialOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(DialOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(OrderContentData r0, DialOrderListFragment r1, DslAdapterItem r2, View r3) {
        return findData$lambda$0$0$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit OiIIX101O(DialOrderListFragment r0, OrderContentData r1, DslAdapterItem r2, DslAdapter r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ Unit X01IiOiIi(DialOrderListFragment r0) {
        return setAdapter$lambda$0$0(r0);
    }

    public static /* synthetic */ void XX0(DialOrderListFragment r0, int r1, DslAdapterItem r2, DslViewHolder r3, DslAdapter r4, View r5) {
        findData$lambda$0$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit XiOIO(DialOrderListFragment r0, DslViewHolder r1) {
        return setAdapter$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ Unit XiOIii1(DialOrderListFragment r0, OrderContentData r1, DslAdapter r2, DslAdapterItem r3) {
        return findData$lambda$0$0(r0, r1, r2, r3);
    }

    private static final Unit findData$lambda$0$0(final DialOrderListFragment r1, final OrderContentData r2, final DslAdapter r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuFlag(4);
        r4.setItemBindOverride(new XX0i00III(r1, r2, r4, r3));
        r4.setItemClick(new OiOii1(r2, r1, r4));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(final DialOrderListFragment r1, OrderContentData r2, final DslAdapterItem r3, final DslAdapter r4, final DslViewHolder r5, final int r6, DslAdapterItem r7, List r8) {
        Intrinsics.X0O(r5, "itemHolder");
        Intrinsics.X0O(r7, "<unused var>");
        Intrinsics.X0O(r8, "<unused var>");
        r1.initItem(r5, r2, r6);
        r1.itemOrderNum = r2.getOrderNum();
        r5.click(R.id.bt_delete_record, new OXXOOiOO(r1, r6, r3, r5, r4));
        View r9 = r5.view(R.id.ll_item_panel);
        if (r9 == null) goto L6;
        r9.setOnTouchListener(new IX1O0I(r5));
    L6:
        return Unit.OXO1;
    }

    private static final void findData$lambda$0$0$0$0(DialOrderListFragment r0, int r1, DslAdapterItem r2, DslViewHolder r3, DslAdapter r4, View r5) {
        r0.deleteRecord(r1);
        r0.deleteOrder(r0.itemOrderNum);
        SwipeMenuHelper r6 = r2.get_itemSwipeMenuHelper();
        if (r6 == null) goto L5;
        r6.closeSwipeMenu(r3);
    L5:
        DslAdapter r7 = r2.getItemDslAdapter();
        if (r7 == null) goto L8;
        DslAdapter.removeItem$default(r7, r2, false, 2, null);
    L8:
        DslAdapter r8 = r2.getItemDslAdapter();
        if (r8 == null) goto L15;
        List<DslAdapterItem> r9 = r8.getDataItems();
        if (r9 == null) goto L15;
        if (r9.size() != 0) goto L15;
        DslAdapter.setAdapterStatus$default(r4, 1, null, 2, null);
    L15:
        DslAdapter r10 = r2.getItemDslAdapter();
        if (r10 == null) goto L19;
        DslAdapter.updateItemDepend$default(r10, null, 1, null);
        return;
    }

    private static final boolean findData$lambda$0$0$0$1$0(DslViewHolder r0, View r1, MotionEvent r2) {
        return r0.itemView.onTouchEvent(r2);
    }

    private static final Unit findData$lambda$0$0$1(OrderContentData r1, DialOrderListFragment r2, DslAdapterItem r3, View r4) {
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

    private static final Unit getOrderList$lambda$0(DialOrderListFragment r1, AccountOrderData r2) {
        if (r2 == null) goto L4;
        r1.getMList().clear();
        r1.getMList().addAll(CollectionsKt___CollectionsKt.OO0Oi10(r2.getContent()));
    L4:
        r1.setAdapter();
        return Unit.OXO1;
    }

    public static /* synthetic */ boolean iIiiO(DslViewHolder r0, View r1, MotionEvent r2) {
        return findData$lambda$0$0$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit iOOX010X(DialOrderListFragment r0, AccountOrderData r1) {
        return getOrderList$lambda$0(r0, r1);
    }

    private static final Unit setAdapter$lambda$0(final DialOrderListFragment r8, DslAdapter r9) {
        Intrinsics.X0O(r9, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r9, 2, null, 2, null);
        r9.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        r8.getDslViewHolder().postDelay(300, new iOXO1O1X(r8));
        r9.getDslLoadMoreItem().setOnLoadMore(new XO0O0i1(r8));
        DslAdapter.render$default(r9, false, null, new IOIiIIii(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0(final DialOrderListFragment r1) {
        r1.renderAdapter(new X101O(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0$0(DialOrderListFragment r4, DslAdapter r5) {
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

    private static final Unit setAdapter$lambda$0$1(final DialOrderListFragment r1, DslViewHolder r2) {
        Intrinsics.X0O(r2, "it");
        r1.renderAdapter(new IIXIIIiI0(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$1$0(final DialOrderListFragment r4, final DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        r4.setPageNum(r4.getPageNum() + 1);
        OrderManager.OXO1.OIi0(r4.getOrderType(), r4.getPageNum(), new X1I0iOX1O(r4, r5));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$1$0$0(DialOrderListFragment r12, DslAdapter r13, AccountOrderData r14) {
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
        Intrinsics.X0O(r6, "mData");
        LogUtils.d(new Object[]{"findData " + getOrderType() + " mData = " + r6.size()});
        Iterator<T> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        final OrderContentData r0 = (OrderContentData) r7.next();
        DslAdapterExKt.O10IXXX0X(r5, R.layout.item_order_integral, new iX1O01(this, r0, r5));
        goto L4
    }

    @aa1
    public final String getItemOrderNum() {
        return this.itemOrderNum;
    }

    @Override // com.sma.smartv3.ui.order.fragment.BaseOrderListFragment
    public void getOrderList() {
        OrderManager.OXO1.OIi0(getOrderType(), getPageNum(), new iXOOX0i(this));
    }

    public final void initItem(@aa1 DslViewHolder r7, @aa1 OrderContentData r8, int r9) {
        Intrinsics.X0O(r7, "holder");
        Intrinsics.X0O(r8, MapController.ITEM_LAYER_TAG);
        ImageView r10 = (ImageView) r7.v(R.id.order_integral_img);
        if (r10 == null) goto L5;
        r10.setVisibility(0);
    L5:
        if (r10 == null) goto L7;
        Glide.with(requireActivity()).load(r8.getElePath()).into(r10);
    L7:
        TextView r11 = (TextView) r7.v(R.id.order_integral_amount);
        TextView r0 = (TextView) r7.v(R.id.order_integral_orderNum);
        TextView r1 = (TextView) r7.v(R.id.order_integral_time);
        TextView r2 = (TextView) r7.v(R.id.order_integral_orderNum_title);
        if (r2 == null) goto L10;
        r2.setText(getString(R.string.order_orderNum) + CertificateUtil.DELIMITER);
    L10:
        if (r11 == null) goto L12;
        r11.setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.iO(r8.getAmount(), null, 2, null));
    L12:
        if (r0 == null) goto L14;
        r0.setText(r8.getOrderNum());
    L14:
        if (r1 == null) goto L16;
        r1.setText(r8.getCreatedAt());
    L16:
        TextView r12 = (TextView) r7.v(R.id.order_integral_pay_status);
        if (r12 != null) goto L19;
        return;
    L19:
        if (XXiO.XO0O10(r8.getPayStatus()) == false) goto L21;
        r12.setText(getString(R.string.order_pay_status_payed));
        int r13 = gk4.iO(r12.getContext(), R.color.text_color);
    L22:
        r12.setTextColor(r13);
        return;
    L21:
        r12.setText(getString(R.string.order_pay_status_created));
        r13 = gk4.iO(r12.getContext(), R.color.order_text_orange);
        goto L22
    }

    @Override // com.sma.smartv3.ui.order.fragment.BaseOrderListFragment
    public void setAdapter() {
        renderAdapter(new O11IiI0(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    public final void setItemOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.itemOrderNum = r2;
    }
}
