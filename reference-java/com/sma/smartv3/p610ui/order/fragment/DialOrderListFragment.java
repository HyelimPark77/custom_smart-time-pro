package com.sma.smartv3.p610ui.order.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
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
import com.bumptech.glide.Glide;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountOrderData;
import com.sma.smartv3.model.OrderContentData;
import com.sma.smartv3.p610ui.order.fragment.DialOrderListFragment;
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
@SourceDebugExtension({"SMAP\nDialOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/DialOrderListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n1869#2,2:162\n*S KotlinDebug\n*F\n+ 1 DialOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/DialOrderListFragment\n*L\n116#1:162,2\n*E\n"})
public final class DialOrderListFragment extends BaseOrderListFragment {

    @aa1
    private String itemOrderNum;

    public DialOrderListFragment() {
        setOrderType("WatchFace");
        this.itemOrderNum = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final DialOrderListFragment dialOrderListFragment, final OrderContentData orderContentData, final DslAdapter dslAdapter, final DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.XX0i00III
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DialOrderListFragment.findData$lambda$0$0$0(this.f4958IO, orderContentData, dslItem, dslAdapter, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.OiOii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.findData$lambda$0$0$1(orderContentData, dialOrderListFragment, dslItem, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(final DialOrderListFragment dialOrderListFragment, OrderContentData orderContentData, final DslAdapterItem dslAdapterItem, final DslAdapter dslAdapter, final DslViewHolder itemHolder, final int i, DslAdapterItem dslAdapterItem2, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem2, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        dialOrderListFragment.initItem(itemHolder, orderContentData, i);
        dialOrderListFragment.itemOrderNum = orderContentData.getOrderNum();
        itemHolder.click(R.id.bt_delete_record, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OXXOOiOO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialOrderListFragment.findData$lambda$0$0$0$0(this.f3555IO, i, dslAdapterItem, itemHolder, dslAdapter, view);
            }
        });
        View view = itemHolder.view(R.id.ll_item_panel);
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.IX1O0I
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return DialOrderListFragment.findData$lambda$0$0$0$1$0(itemHolder, view2, motionEvent);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findData$lambda$0$0$0$0(DialOrderListFragment dialOrderListFragment, int i, DslAdapterItem dslAdapterItem, DslViewHolder dslViewHolder, DslAdapter dslAdapter, View view) {
        List<DslAdapterItem> dataItems;
        dialOrderListFragment.deleteRecord(i);
        dialOrderListFragment.deleteOrder(dialOrderListFragment.itemOrderNum);
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
    public static final Unit findData$lambda$0$0$1(OrderContentData orderContentData, DialOrderListFragment dialOrderListFragment, DslAdapterItem dslAdapterItem, View view) {
        Intrinsics.X0O(view, "view");
        if (!XXiO.XO0O10(orderContentData.getPayStatus())) {
            dialOrderListFragment.showConfirm(orderContentData.getOrderNum());
        }
        SwipeMenuHelper swipeMenuHelper = dslAdapterItem.get_itemSwipeMenuHelper();
        if (swipeMenuHelper != null) {
            SwipeMenuHelper.closeSwipeMenu$default(swipeMenuHelper, null, 1, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderList$lambda$0(DialOrderListFragment dialOrderListFragment, AccountOrderData accountOrderData) {
        if (accountOrderData != null) {
            dialOrderListFragment.getMList().clear();
            dialOrderListFragment.getMList().addAll(CollectionsKt___CollectionsKt.OO0Oi10(accountOrderData.getContent()));
        }
        dialOrderListFragment.setAdapter();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0(final DialOrderListFragment dialOrderListFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        dialOrderListFragment.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOXO1O1X
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DialOrderListFragment.setAdapter$lambda$0$0(this.f8153IO);
            }
        });
        renderAdapter.getDslLoadMoreItem().setOnLoadMore(new Function1() { // from class: com.android.mltcode.paycertificationapi.XO0O0i1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.setAdapter$lambda$0$1(this.f4667IO, (DslViewHolder) obj);
            }
        });
        DslAdapter.render$default(renderAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.IOIiIIii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.setAdapter$lambda$0$2((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0(final DialOrderListFragment dialOrderListFragment) {
        dialOrderListFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.X101O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.setAdapter$lambda$0$0$0(this.f4133IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$0$0(DialOrderListFragment dialOrderListFragment, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        if (dialOrderListFragment.getMList().isEmpty()) {
            DslAdapter.setAdapterStatus$default(dialOrderListFragment.getDslAdapter(), 1, null, 2, null);
        } else {
            renderAdapter.clearAllItems();
            dialOrderListFragment.findData(renderAdapter, dialOrderListFragment.getMList());
            renderAdapter.setLoadMoreEnable(true);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1(final DialOrderListFragment dialOrderListFragment, DslViewHolder it) {
        Intrinsics.X0O(it, "it");
        dialOrderListFragment.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIXIIIiI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.setAdapter$lambda$0$1$0(this.f1648IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1$0(final DialOrderListFragment dialOrderListFragment, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        dialOrderListFragment.setPageNum(dialOrderListFragment.getPageNum() + 1);
        OrderManager.OXO1.OIi0(dialOrderListFragment.getOrderType(), dialOrderListFragment.getPageNum(), new Function1() { // from class: com.android.mltcode.paycertificationapi.X1I0iOX1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.setAdapter$lambda$0$1$0$0(this.f4253IO, renderAdapter, (AccountOrderData) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAdapter$lambda$0$1$0$0(DialOrderListFragment dialOrderListFragment, DslAdapter dslAdapter, AccountOrderData accountOrderData) {
        if (accountOrderData == null || accountOrderData.getContent() == null || accountOrderData.getContent().isEmpty()) {
            DslAdapter.setLoadMore$default(dslAdapter, 2, null, false, 6, null);
        } else {
            dialOrderListFragment.findData(dslAdapter, accountOrderData.getContent());
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

    public final void findData(@aa1 final DslAdapter dslAdapter, @aa1 List<OrderContentData> mData) {
        Intrinsics.X0O(dslAdapter, "<this>");
        Intrinsics.X0O(mData, "mData");
        LogUtils.m11128d("findData " + getOrderType() + " mData = " + mData.size());
        for (final OrderContentData orderContentData : mData) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_order_integral, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX1O01
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DialOrderListFragment.findData$lambda$0$0(this.f8286IO, orderContentData, dslAdapter, (DslAdapterItem) obj);
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
        OrderManager.OXO1.OIi0(getOrderType(), getPageNum(), new Function1() { // from class: com.android.mltcode.paycertificationapi.iXOOX0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.getOrderList$lambda$0(this.f8370IO, (AccountOrderData) obj);
            }
        });
    }

    public final void initItem(@aa1 DslViewHolder holder, @aa1 OrderContentData item, int i) {
        int iM1859iO;
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        ImageView imageView = (ImageView) holder.m3483v(R.id.order_integral_img);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (imageView != null) {
            Glide.with(requireActivity()).load(item.getElePath()).into(imageView);
        }
        TextView textView = (TextView) holder.m3483v(R.id.order_integral_amount);
        TextView textView2 = (TextView) holder.m3483v(R.id.order_integral_orderNum);
        TextView textView3 = (TextView) holder.m3483v(R.id.order_integral_time);
        TextView textView4 = (TextView) holder.m3483v(R.id.order_integral_orderNum_title);
        if (textView4 != null) {
            textView4.setText(getString(R.string.order_orderNum) + CertificateUtil.DELIMITER);
        }
        if (textView != null) {
            textView.setText(getString(R.string.order_pay_amount_name) + ": " + XXiO.m1385iO(item.getAmount(), null, 2, null));
        }
        if (textView2 != null) {
            textView2.setText(item.getOrderNum());
        }
        if (textView3 != null) {
            textView3.setText(item.getCreatedAt());
        }
        TextView textView5 = (TextView) holder.m3483v(R.id.order_integral_pay_status);
        if (textView5 != null) {
            if (XXiO.XO0O10(item.getPayStatus())) {
                textView5.setText(getString(R.string.order_pay_status_payed));
                iM1859iO = gk4.m1859iO(textView5.getContext(), R.color.text_color);
            } else {
                textView5.setText(getString(R.string.order_pay_status_created));
                iM1859iO = gk4.m1859iO(textView5.getContext(), R.color.order_text_orange);
            }
            textView5.setTextColor(iM1859iO);
        }
    }

    @Override // com.sma.smartv3.p610ui.order.fragment.BaseOrderListFragment
    public void setAdapter() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.O11IiI0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOrderListFragment.setAdapter$lambda$0(this.f2674IO, (DslAdapter) obj);
            }
        });
        SwipeMenuHelper.Companion.OXO1((RecyclerView) getDslViewHolder().m3483v(recyclerViewId()));
    }

    public final void setItemOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.itemOrderNum = str;
    }
}
