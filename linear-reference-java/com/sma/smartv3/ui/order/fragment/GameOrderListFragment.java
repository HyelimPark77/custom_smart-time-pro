package com.sma.smartv3.ui.order.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.II0IiXX;
import com.android.mltcode.paycertificationapi.IO1iI000I;
import com.android.mltcode.paycertificationapi.OIIIiiI0;
import com.android.mltcode.paycertificationapi.OiX10i1OI;
import com.android.mltcode.paycertificationapi.X000;
import com.android.mltcode.paycertificationapi.X0OiXOi;
import com.android.mltcode.paycertificationapi.XIIO00XXX;
import com.android.mltcode.paycertificationapi.XIXi0X0iX;
import com.android.mltcode.paycertificationapi.XO11;
import com.android.mltcode.paycertificationapi.XXi00XiI;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i010Oi;
import com.android.mltcode.paycertificationapi.i10Iii;
import com.android.mltcode.paycertificationapi.i1XiXOiX0;
import com.android.mltcode.paycertificationapi.iIi1i0;
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
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nGameOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1869#2,2:182\n99#3,7:184\n106#3,3:192\n79#3,7:195\n109#3:202\n1#4:191\n*S KotlinDebug\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n*L\n115#1:182,2\n174#1:184,7\n174#1:192,3\n174#1:195,7\n174#1:202\n174#1:191\n*E\n"})
public final class GameOrderListFragment extends BaseOrderListFragment {

    @aa1
    private String itemOrderNum;

    public GameOrderListFragment() {
        setOrderType(OrderManager.OXO1.II1Xi0());
        this.itemOrderNum = "";
    }

    public static /* synthetic */ boolean I1(GameOrderListFragment r0, String r1) {
        return showGameConfirm$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(GameOrderListFragment r0, DslAdapter r1, AccountOrderData r2) {
        return setAdapter$lambda$0$1$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit II1Xi0(GameOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ boolean IIX1OXO(DslViewHolder r0, View r1, MotionEvent r2) {
        return findData$lambda$0$0$0$1$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OII(GameOrderListFragment r0, AccountOrderData r1) {
        return getOrderList$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit OX(GameOrderListFragment r0) {
        return setAdapter$lambda$0$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(GameOrderListFragment r0, int r1, DslAdapterItem r2, DslViewHolder r3, DslAdapter r4, View r5) {
        findData$lambda$0$0$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit X01IiOiIi(GameOrderListFragment r0, OrderContentData r1, DslAdapter r2, DslAdapterItem r3) {
        return findData$lambda$0$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XX0(GameOrderListFragment r0, OrderContentData r1, DslAdapterItem r2, DslAdapter r3, DslViewHolder r4, int r5, DslAdapterItem r6, List r7) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ Unit XiOIO(DslAdapter r0) {
        return setAdapter$lambda$0$2(r0);
    }

    public static /* synthetic */ Unit XiOIii1(GameOrderListFragment r0, OrderContentData r1, DslAdapterItem r2, View r3) {
        return findData$lambda$0$0$1(r0, r1, r2, r3);
    }

    private static final Unit findData$lambda$0$0(final GameOrderListFragment r1, final OrderContentData r2, final DslAdapter r3, final DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuFlag(4);
        r4.setItemBindOverride(new II0IiXX(r1, r2, r4, r3));
        r4.setItemClick(new OIIIiiI0(r1, r2, r4));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(final GameOrderListFragment r1, OrderContentData r2, final DslAdapterItem r3, final DslAdapter r4, final DslViewHolder r5, final int r6, DslAdapterItem r7, List r8) {
        Intrinsics.X0O(r5, "itemHolder");
        Intrinsics.X0O(r7, "<unused var>");
        Intrinsics.X0O(r8, "<unused var>");
        r1.initItem(r5, r2, r6);
        r1.itemOrderNum = r2.getOrderNum();
        r5.click(R.id.bt_delete_record, new XIXi0X0iX(r1, r6, r3, r5, r4));
        View r9 = r5.view(R.id.ll_item_panel);
        if (r9 == null) goto L6;
        r9.setOnTouchListener(new XXi00XiI(r5));
    L6:
        return Unit.OXO1;
    }

    private static final void findData$lambda$0$0$0$0(GameOrderListFragment r0, int r1, DslAdapterItem r2, DslViewHolder r3, DslAdapter r4, View r5) {
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

    private static final Unit findData$lambda$0$0$1(GameOrderListFragment r3, OrderContentData r4, DslAdapterItem r5, View r6) {
        Intrinsics.X0O(r6, "view");
        r3.itemOrderNum = r4.getOrderNum();
        if (XXiO.XO0O10(r4.getPayStatus()) == true) goto L5;
        LogUtils.d(new Object[]{"OrderList itemClick itemClick itemOrderNum = " + r3.itemOrderNum + " orderNum = " + r4.getOrderNum()});
        r3.showGameConfirm(r4.getOrderNum());
    L5:
        SwipeMenuHelper r7 = r5.get_itemSwipeMenuHelper();
        if (r7 == null) goto L9;
        SwipeMenuHelper.closeSwipeMenu$default(r7, null, 1, null);
    L9:
        return Unit.OXO1;
    }

    private static final Unit getOrderList$lambda$0(GameOrderListFragment r1, AccountOrderData r2) {
        if (r2 == null) goto L4;
        r1.getMList().clear();
        r1.getMList().addAll(CollectionsKt___CollectionsKt.OO0Oi10(r2.getContent()));
    L4:
        r1.setAdapter();
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit i010I(GameOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit iIiiO(GameOrderListFragment r0, DslAdapter r1) {
        return setAdapter$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit iOOX010X(GameOrderListFragment r0, DslViewHolder r1) {
        return setAdapter$lambda$0$1(r0, r1);
    }

    private static final Unit setAdapter$lambda$0(final GameOrderListFragment r8, DslAdapter r9) {
        Intrinsics.X0O(r9, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r9, 2, null, 2, null);
        r9.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        r8.getDslViewHolder().postDelay(300, new XO11(r8));
        r9.getDslLoadMoreItem().setOnLoadMore(new iIi1i0(r8));
        DslAdapter.render$default(r9, false, null, new i010Oi(), 3, null);
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0(final GameOrderListFragment r1) {
        r1.renderAdapter(new OiX10i1OI(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$0$0(GameOrderListFragment r4, DslAdapter r5) {
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

    private static final Unit setAdapter$lambda$0$1(final GameOrderListFragment r1, DslViewHolder r2) {
        Intrinsics.X0O(r2, "it");
        r1.renderAdapter(new i10Iii(r1));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$1$0(final GameOrderListFragment r4, final DslAdapter r5) {
        Intrinsics.X0O(r5, "$this$renderAdapter");
        r4.setPageNum(r4.getPageNum() + 1);
        OrderManager.OXO1.OIi0(r4.getOrderType(), r4.getPageNum(), new i1XiXOiX0(r4, r5));
        return Unit.OXO1;
    }

    private static final Unit setAdapter$lambda$0$1$0$0(GameOrderListFragment r12, DslAdapter r13, AccountOrderData r14) {
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

    private static final boolean showGameConfirm$lambda$0$0(GameOrderListFragment r4, String r5) {
        LogUtils.d(new Object[]{"OrderList orderType = " + r4.getOrderType() + " orderNum = " + r5});
        r4.setNeedPayDialog(true);
        OrderManager r1 = OrderManager.OXO1;
        String r6 = r1.XiOIO(r5, r4.getOrderType(), r1.X0O());
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r6);
        r2.putInt("mArg1", 2);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r7 = new Intent(r4.getActivity(), GoogleWebViewActivity.class);
        r7.putExtras(r2);
        r4.startActivity(r7);
        return true;
    }

    public final void findData(@aa1 final DslAdapter r5, @aa1 List<OrderContentData> r6) {
        Intrinsics.X0O(r5, "<this>");
        Intrinsics.X0O(r6, "mData");
        LogUtils.d(new Object[]{"findData " + getOrderType() + " mData = " + r6.size()});
        Iterator<T> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L6;
        final OrderContentData r0 = (OrderContentData) r7.next();
        DslAdapterExKt.O10IXXX0X(r5, R.layout.item_order_integral, new X0OiXOi(this, r0, r5));
        goto L4
    }

    @aa1
    public final String getItemOrderNum() {
        return this.itemOrderNum;
    }

    @Override // com.sma.smartv3.ui.order.fragment.BaseOrderListFragment
    public void getOrderList() {
        OrderManager r0 = OrderManager.OXO1;
        r0.OIi0(r0.II1Xi0() + I000IiI1O.iO.XO0O10 + r0.i010I(), getPageNum(), new X000(this));
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
        r0.setText(r9.getSubject());
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
        renderAdapter(new XIIO00XXX(this));
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().v(recyclerViewId()));
    }

    public final void setItemOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.itemOrderNum = r2;
    }

    public final void showGameConfirm(@aa1 final String r6) {
        Intrinsics.X0O(r6, "orderNum");
        go0 r0 = new go0(getMActivity(), 0, 2, null);
        r0.I0iXXO(false);
        r0.IXXOO(1);
        r0.O1O(R.string.guide_warm_title);
        r0.iX(Integer.valueOf(R.string.pay_completed_tip));
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.yes_payment_go, new IO1iI000I(this, r6));
        r0.IIX1OXO();
    }
}
