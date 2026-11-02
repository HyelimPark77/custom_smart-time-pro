package com.sma.smartv3.p610ui.order.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.SwipeMenuHelper;
import com.blankj.utilcode.util.LogUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountOrderData;
import com.sma.smartv3.model.OrderContentData;
import com.sma.smartv3.p610ui.order.fragment.IntegralOrderListFragment;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final IntegralOrderListFragment integralOrderListFragment, final OrderContentData orderContentData, final DslAdapter dslAdapter, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.o8
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return IntegralOrderListFragment.findData$lambda$0$0$0(this.f10086IO, orderContentData, dslItem, dslAdapter, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.p8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.findData$lambda$0$0$1(orderContentData, integralOrderListFragment, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(final IntegralOrderListFragment integralOrderListFragment, final OrderContentData orderContentData, final DslAdapterItem dslAdapterItem, final DslAdapter dslAdapter, final DslViewHolder itemHolder, final int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        integralOrderListFragment.initItem(itemHolder, orderContentData, i);
        itemHolder.click(R.id.bt_delete_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.q8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntegralOrderListFragment.findData$lambda$0$0$0$0(this.f10551IO, orderContentData, i, dslAdapterItem, itemHolder, dslAdapter, view);
            }
        });
        View view = itemHolder.view(R.id.ll_item_panel);
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.f8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return IntegralOrderListFragment.findData$lambda$0$0$0$1$0(itemHolder, view2, motionEvent);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findData$lambda$0$0$0$0(IntegralOrderListFragment integralOrderListFragment, OrderContentData orderContentData, int i, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, DslAdapter dslAdapter, View view) {
        List<DslAdapterItem> dataItems;
        integralOrderListFragment.itemOrderNum = orderContentData.getOrderNum();
        integralOrderListFragment.deleteRecord(i);
        integralOrderListFragment.deleteOrder(integralOrderListFragment.itemOrderNum);
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            swipeMenuHelper.closeSwipeMenu(dslViewHolder);
        }
        DslAdapter itemDslAdapter = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter != null) {
            DslAdapter.removeItem$default(itemDslAdapter, dslAdapterItem, false, 2, null);
        }
        DslAdapter itemDslAdapter2 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter2 != null && (dataItems = itemDslAdapter2.getDataItems()) != null && dataItems.size() == 0) {
            DslAdapter.setAdapterStatus$default(dslAdapter, 1, null, 2, null);
        }
        DslAdapter itemDslAdapter3 = dslAdapterItem.getItemDslAdapter();
        if (itemDslAdapter3 != null) {
            DslAdapter.updateItemDepend$default(itemDslAdapter3, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findData$lambda$0$0$0$1$0(DslViewHolder dslViewHolder, View view, MotionEvent motionEvent) {
        return dslViewHolder.itemView.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$1(OrderContentData orderContentData, IntegralOrderListFragment integralOrderListFragment, DslAdapterItem dslAdapterItem, View view) {
        Intrinsics.X0O(view, "view");
        if (!XXiO.XO0O10(orderContentData.getPayStatus())) {
            integralOrderListFragment.showConfirm(orderContentData.getOrderNum());
        }
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            SwipeMenuHelper.closeSwipeMenu$default(swipeMenuHelper, null, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderList$lambda$0(IntegralOrderListFragment integralOrderListFragment, AccountOrderData accountOrderData) {
        if (accountOrderData != null) {
            integralOrderListFragment.getMList().clear();
            integralOrderListFragment.getMList().addAll(CollectionsKt___CollectionsKt.OO0Oi10(accountOrderData.getContent()));
        }
        integralOrderListFragment.setAdapter();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0(final IntegralOrderListFragment integralOrderListFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        integralOrderListFragment.getDslViewHolder().postDelay(500L, new Function0() { // from class: com.android.mltcode.paycertificationapi.e8
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return IntegralOrderListFragment.setAdapter$lambda$0$0(this.f6351IO);
            }
        });
        renderAdapter.getDslLoadMoreItem().setOnLoadMore(new Function1() { // from class: com.android.mltcode.paycertificationapi.i8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.setAdapter$lambda$0$1(this.f7770IO, (DslViewHolder) obj);
            }
        });
        DslAdapter.render$default(renderAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.j8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.setAdapter$lambda$0$2((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0(final IntegralOrderListFragment integralOrderListFragment) {
        integralOrderListFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.m8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.setAdapter$lambda$0$0$0(this.f9644IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0$0(IntegralOrderListFragment integralOrderListFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        if (integralOrderListFragment.getMList().isEmpty()) {
            DslAdapter.setAdapterStatus$default(integralOrderListFragment.getDslAdapter(), 1, null, 2, null);
        } else {
            renderAdapter.clearAllItems();
            integralOrderListFragment.findData(renderAdapter, integralOrderListFragment.getMList());
            renderAdapter.setLoadMoreEnable(true);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1(final IntegralOrderListFragment integralOrderListFragment, DslViewHolder it) {
        Intrinsics.X0O(it, "it");
        integralOrderListFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.n8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.setAdapter$lambda$0$1$0(this.f9880IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1$0(final IntegralOrderListFragment integralOrderListFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        integralOrderListFragment.setPageNum(integralOrderListFragment.getPageNum() + 1);
        OrderManager.OXO1.OIi0(integralOrderListFragment.getOrderType(), integralOrderListFragment.getPageNum(), new Function1() { // from class: com.android.mltcode.paycertificationapi.l8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.setAdapter$lambda$0$1$0$0(this.f9375IO, renderAdapter, (AccountOrderData) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1$0$0(IntegralOrderListFragment integralOrderListFragment, DslAdapter dslAdapter, AccountOrderData accountOrderData) {
        if (accountOrderData == null || accountOrderData.getContent() == null || accountOrderData.getContent().isEmpty()) {
            DslAdapter.setLoadMore$default(dslAdapter, 2, null, false, 6, null);
        } else {
            integralOrderListFragment.findData(dslAdapter, accountOrderData.getContent());
            DslAdapter.setLoadMore$default(dslAdapter, 0, null, false, 6, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$2(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    public final void findData(@aa1 final DslAdapter dslAdapter, @aa1 List<OrderContentData> mList) {
        Intrinsics.X0O(dslAdapter, "<this>");
        Intrinsics.X0O(mList, "mList");
        LogUtils.m11128d("findData " + getOrderType() + " mList = " + mList.size());
        for (final OrderContentData orderContentData : mList) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_order_integral, new Function1() { // from class: com.android.mltcode.paycertificationapi.h8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IntegralOrderListFragment.findData$lambda$0$0(this.f7059IO, orderContentData, dslAdapter, (DslAdapterItem) obj);
                }
            });
        }
    }

    @aa1
    public final String getItemOrderNum() {
        return this.itemOrderNum;
    }

    @Override // com.sma.smartv3.p610ui.order.fragment.BaseOrderListFragment
    public void getOrderList() {
        OrderManager.OXO1.OIi0(getOrderType(), getPageNum(), new Function1() { // from class: com.android.mltcode.paycertificationapi.k8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.getOrderList$lambda$0(this.f9123IO, (AccountOrderData) obj);
            }
        });
    }

    public final void initItem(@aa1 DslViewHolder holder, @aa1 OrderContentData item, int i) {
        int iM1859iO;
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        TextView textView = (TextView) holder.m3483v(R.id.order_integral_remark);
        TextView textView2 = (TextView) holder.m3483v(R.id.order_integral_amount);
        TextView textView3 = (TextView) holder.m3483v(R.id.order_integral_orderNum);
        TextView textView4 = (TextView) holder.m3483v(R.id.order_integral_time);
        TextView textView5 = (TextView) holder.m3483v(R.id.order_integral_orderNum_title);
        if (textView5 != null) {
            textView5.setText(getString(R.string.order_orderNum) + CertificateUtil.DELIMITER);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.m1385iO(item.getAmount(), null, 2, null));
        }
        if (textView2 != null) {
            textView2.setText(getString(R.string.recharge) + item.getSubject() + getString(R.string.points));
        }
        if (textView3 != null) {
            textView3.setText(item.getOrderNum());
        }
        if (textView4 != null) {
            textView4.setText(item.getCreatedAt());
        }
        if (textView != null) {
            textView.setTextColor(gk4.m1859iO(getContext(), R.color.text_color));
        }
        TextView textView6 = (TextView) holder.m3483v(R.id.order_integral_pay_status);
        if (textView6 != null) {
            if (XXiO.XO0O10(item.getPayStatus())) {
                textView6.setText(getString(R.string.order_pay_status_payed));
                iM1859iO = gk4.m1859iO(textView6.getContext(), R.color.text_color);
            } else {
                textView6.setText(getString(R.string.order_pay_status_created));
                iM1859iO = gk4.m1859iO(textView6.getContext(), R.color.order_text_orange);
            }
            textView6.setTextColor(iM1859iO);
        }
    }

    @Override // com.sma.smartv3.p610ui.order.fragment.BaseOrderListFragment
    public void setAdapter() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.g8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntegralOrderListFragment.setAdapter$lambda$0(this.f6828IO, (DslAdapter) obj);
            }
        });
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    public final void setItemOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.itemOrderNum = str;
    }
}
