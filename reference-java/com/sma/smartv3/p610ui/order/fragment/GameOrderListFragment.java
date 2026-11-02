package com.sma.smartv3.p610ui.order.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
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
import com.sma.smartv3.p610ui.order.fragment.GameOrderListFragment;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
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
@SourceDebugExtension({"SMAP\nGameOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1869#2,2:182\n99#3,7:184\n106#3,3:192\n79#3,7:195\n109#3:202\n1#4:191\n*S KotlinDebug\n*F\n+ 1 GameOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/GameOrderListFragment\n*L\n115#1:182,2\n174#1:184,7\n174#1:192,3\n174#1:195,7\n174#1:202\n174#1:191\n*E\n"})
public final class GameOrderListFragment extends BaseOrderListFragment {

    @aa1
    private String itemOrderNum;

    public GameOrderListFragment() {
        setOrderType(OrderManager.OXO1.II1Xi0());
        this.itemOrderNum = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final GameOrderListFragment gameOrderListFragment, final OrderContentData orderContentData, final DslAdapter dslAdapter, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.II0IiXX
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GameOrderListFragment.findData$lambda$0$0$0(this.f1525IO, orderContentData, dslItem, dslAdapter, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIIIiiI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.findData$lambda$0$0$1(this.f2971IO, orderContentData, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(final GameOrderListFragment gameOrderListFragment, OrderContentData orderContentData, final DslAdapterItem dslAdapterItem, final DslAdapter dslAdapter, final DslViewHolder itemHolder, final int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        gameOrderListFragment.initItem(itemHolder, orderContentData, i);
        gameOrderListFragment.itemOrderNum = orderContentData.getOrderNum();
        itemHolder.click(R.id.bt_delete_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XIXi0X0iX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameOrderListFragment.findData$lambda$0$0$0$0(this.f4599IO, i, dslAdapterItem, itemHolder, dslAdapter, view);
            }
        });
        View view = itemHolder.view(R.id.ll_item_panel);
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.XXi00XiI
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return GameOrderListFragment.findData$lambda$0$0$0$1$0(itemHolder, view2, motionEvent);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findData$lambda$0$0$0$0(GameOrderListFragment gameOrderListFragment, int i, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, DslAdapter dslAdapter, View view) {
        List<DslAdapterItem> dataItems;
        gameOrderListFragment.deleteRecord(i);
        gameOrderListFragment.deleteOrder(gameOrderListFragment.itemOrderNum);
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
    public static final Unit findData$lambda$0$0$1(GameOrderListFragment gameOrderListFragment, OrderContentData orderContentData, DslAdapterItem dslAdapterItem, View view) {
        Intrinsics.X0O(view, "view");
        gameOrderListFragment.itemOrderNum = orderContentData.getOrderNum();
        if (!XXiO.XO0O10(orderContentData.getPayStatus())) {
            LogUtils.m11128d("OrderList itemClick itemClick itemOrderNum = " + gameOrderListFragment.itemOrderNum + " orderNum = " + orderContentData.getOrderNum());
            gameOrderListFragment.showGameConfirm(orderContentData.getOrderNum());
        }
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            SwipeMenuHelper.closeSwipeMenu$default(swipeMenuHelper, null, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderList$lambda$0(GameOrderListFragment gameOrderListFragment, AccountOrderData accountOrderData) {
        if (accountOrderData != null) {
            gameOrderListFragment.getMList().clear();
            gameOrderListFragment.getMList().addAll(CollectionsKt___CollectionsKt.OO0Oi10(accountOrderData.getContent()));
        }
        gameOrderListFragment.setAdapter();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0(final GameOrderListFragment gameOrderListFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        gameOrderListFragment.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.XO11
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return GameOrderListFragment.setAdapter$lambda$0$0(this.f4707IO);
            }
        });
        renderAdapter.getDslLoadMoreItem().setOnLoadMore(new Function1() { // from class: com.android.mltcode.paycertificationapi.iIi1i0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.setAdapter$lambda$0$1(this.f7953IO, (DslViewHolder) obj);
            }
        });
        DslAdapter.render$default(renderAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.i010Oi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.setAdapter$lambda$0$2((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0(final GameOrderListFragment gameOrderListFragment) {
        gameOrderListFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OiX10i1OI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.setAdapter$lambda$0$0$0(this.f3773IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0$0(GameOrderListFragment gameOrderListFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        if (gameOrderListFragment.getMList().isEmpty()) {
            DslAdapter.setAdapterStatus$default(gameOrderListFragment.getDslAdapter(), 1, null, 2, null);
        } else {
            renderAdapter.clearAllItems();
            gameOrderListFragment.findData(renderAdapter, gameOrderListFragment.getMList());
            renderAdapter.setLoadMoreEnable(true);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1(final GameOrderListFragment gameOrderListFragment, DslViewHolder it) {
        Intrinsics.X0O(it, "it");
        gameOrderListFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.i10Iii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.setAdapter$lambda$0$1$0(this.f7508IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1$0(final GameOrderListFragment gameOrderListFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        gameOrderListFragment.setPageNum(gameOrderListFragment.getPageNum() + 1);
        OrderManager.OXO1.OIi0(gameOrderListFragment.getOrderType(), gameOrderListFragment.getPageNum(), new Function1() { // from class: com.android.mltcode.paycertificationapi.i1XiXOiX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.setAdapter$lambda$0$1$0$0(this.f7695IO, renderAdapter, (AccountOrderData) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1$0$0(GameOrderListFragment gameOrderListFragment, DslAdapter dslAdapter, AccountOrderData accountOrderData) {
        if (accountOrderData == null || accountOrderData.getContent() == null || accountOrderData.getContent().isEmpty()) {
            DslAdapter.setLoadMore$default(dslAdapter, 2, null, false, 6, null);
        } else {
            gameOrderListFragment.findData(dslAdapter, accountOrderData.getContent());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showGameConfirm$lambda$0$0(GameOrderListFragment gameOrderListFragment, String str) {
        LogUtils.m11128d("OrderList orderType = " + gameOrderListFragment.getOrderType() + " orderNum = " + str);
        gameOrderListFragment.setNeedPayDialog(true);
        OrderManager orderManager = OrderManager.OXO1;
        String strXiOIO = orderManager.XiOIO(str, gameOrderListFragment.getOrderType(), orderManager.X0O());
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strXiOIO);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(gameOrderListFragment.getActivity(), (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        gameOrderListFragment.startActivity(intent);
        return true;
    }

    public final void findData(@aa1 final DslAdapter dslAdapter, @aa1 List<OrderContentData> mData) {
        Intrinsics.X0O(dslAdapter, "<this>");
        Intrinsics.X0O(mData, "mData");
        LogUtils.m11128d("findData " + getOrderType() + " mData = " + mData.size());
        for (final OrderContentData orderContentData : mData) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_order_integral, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0OiXOi
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GameOrderListFragment.findData$lambda$0$0(this.f4017IO, orderContentData, dslAdapter, (DslAdapterItem) obj);
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
        OrderManager orderManager = OrderManager.OXO1;
        orderManager.OIi0(orderManager.II1Xi0() + I000IiI1O.C2156iO.XO0O10 + orderManager.i010I(), getPageNum(), new Function1() { // from class: com.android.mltcode.paycertificationapi.X000
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.getOrderList$lambda$0(this.f3843IO, (AccountOrderData) obj);
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
            textView2.setText(item.getSubject());
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
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIIO00XXX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameOrderListFragment.setAdapter$lambda$0(this.f4516IO, (DslAdapter) obj);
            }
        });
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    public final void setItemOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.itemOrderNum = str;
    }

    public final void showGameConfirm(@aa1 final String orderNum) {
        Intrinsics.X0O(orderNum, "orderNum");
        go0 go0Var = new go0(getMActivity(), 0, 2, null);
        go0Var.I0iXXO(false);
        go0Var.IXXOO(1);
        go0Var.O1O(R.string.guide_warm_title);
        go0Var.m1865iX(Integer.valueOf(R.string.pay_completed_tip));
        go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
        go0Var.X1IX(R.string.yes_payment_go, new Function0() { // from class: com.android.mltcode.paycertificationapi.IO1iI000I
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(GameOrderListFragment.showGameConfirm$lambda$0$0(this.f1781IO, orderNum));
            }
        });
        go0Var.IIX1OXO();
    }
}
