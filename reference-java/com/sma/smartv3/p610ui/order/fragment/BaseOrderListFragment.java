package com.sma.smartv3.p610ui.order.fragment;

import android.content.Intent;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountOrderData;
import com.sma.smartv3.model.OrderContentData;
import com.sma.smartv3.p610ui.order.fragment.BaseOrderListFragment;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/BaseOrderListFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n90#2:167\n99#3,7:168\n106#3,3:176\n79#3,7:179\n109#3:186\n1#4:175\n*S KotlinDebug\n*F\n+ 1 BaseOrderListFragment.kt\ncom/sma/smartv3/ui/order/fragment/BaseOrderListFragment\n*L\n138#1:167\n97#1:168,7\n97#1:176,3\n97#1:179,7\n97#1:186\n97#1:175\n*E\n"})
public class BaseOrderListFragment extends BaseRecyclerRecordsFragment<OrderContentData> {
    private boolean isNeedPayDialog;

    @tb1
    private go0 mConfirmPopup;

    @tb1
    private go0 mDeletePopup;

    @aa1
    private final List<OrderContentData> mList;

    @aa1
    private final TimePeriod mTimePeriod = TimePeriod.DAY;

    @aa1
    private String orderNum;

    @aa1
    private String orderType;
    private int pageNum;

    public BaseOrderListFragment() {
        setInitUpdate(false);
        this.pageNum = 1;
        this.orderType = "";
        this.orderNum = "";
        this.mList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteOrder$lambda$0(boolean z) {
        ToastUtils.showLong(z ? R.string.success_save : R.string.fail);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderStatus$lambda$0(BaseOrderListFragment baseOrderListFragment, boolean z) {
        if (z) {
            baseOrderListFragment.pageNum = 1;
            baseOrderListFragment.getOrderList();
        } else {
            ToastUtils.showLong(R.string.pay_confirm_error);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showConfirm$lambda$0$0(BaseOrderListFragment baseOrderListFragment) {
        LogUtils.m11128d("OrderList orderType = " + baseOrderListFragment.orderType + " orderNum = " + baseOrderListFragment.orderNum);
        baseOrderListFragment.isNeedPayDialog = true;
        String strIIiiO = OrderManager.iIiiO(OrderManager.OXO1, baseOrderListFragment.orderNum, baseOrderListFragment.orderType, null, 4, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strIIiiO);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseOrderListFragment.getActivity(), (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        baseOrderListFragment.startActivity(intent);
        return true;
    }

    public final void deleteOrder(@aa1 String orderId) {
        Intrinsics.X0O(orderId, "orderId");
        OrderManager.OXO1.m38110iO(orderId, new Function1() { // from class: com.android.mltcode.paycertificationapi.O01OX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseOrderListFragment.deleteOrder$lambda$0(((Boolean) obj).booleanValue());
            }
        });
    }

    public final void deleteRecord(int i) {
        if (this.mList.isEmpty() || this.mList.size() <= i + 1) {
            return;
        }
        this.mList.remove(i);
    }

    @tb1
    public final go0 getMDeletePopup() {
        return this.mDeletePopup;
    }

    @aa1
    public final List<OrderContentData> getMList() {
        return this.mList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    public void getOrderList() {
    }

    public final void getOrderStatus() {
        OrderManager.OXO1.XX0(this.orderNum, this.orderType, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXiXO1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseOrderListFragment.getOrderStatus$lambda$0(this.f2150IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    @aa1
    public final String getOrderType() {
        return this.orderType;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<OrderContentData> initList() {
        List<OrderContentData> content;
        List listOO0Oi10;
        this.mList.clear();
        List<OrderContentData> list = this.mList;
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String str = b01.XOIO11O + this.orderType;
        AccountOrderData accountOrderData = (AccountOrderData) new Gson().fromJson(sPUtilsIiI10X.getString(str + '_' + AccountOrderData.class.getName()), AccountOrderData.class);
        list.addAll((accountOrderData == null || (content = accountOrderData.getContent()) == null || (listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(content)) == null) ? new ArrayList<>() : listOO0Oi10);
        return this.mList;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        initList();
        getOrderList();
        super.initView();
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_order_dial;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<OrderContentData> data) {
        Intrinsics.X0O(data, "data");
        getDslAdapter().clearAllItems();
        onInitBaseLayoutAfter();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        setAdapter();
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        this.isNeedPayDialog = false;
        i1O0OXO1O.OXO1.OXO1("onOrderPayStatusChange");
        getOrderList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDslAdapter().notifyDataChanged();
        if (this.isNeedPayDialog) {
            this.pageNum = 1;
            this.isNeedPayDialog = false;
            getOrderList();
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<OrderContentData> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        LogUtils.m11128d("onTimePeriodChange");
        return initList();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
    public int recyclerViewId() {
        return R.id.recycler_view;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment
    public int refreshLayoutId() {
        return 0;
    }

    public void setAdapter() {
    }

    public final void setMDeletePopup(@tb1 go0 go0Var) {
        this.mDeletePopup = go0Var;
    }

    public final void setNeedPayDialog(boolean z) {
        this.isNeedPayDialog = z;
    }

    public final void setOrderType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderType = str;
    }

    public final void setPageNum(int i) {
        this.pageNum = i;
    }

    public final void showConfirm(@aa1 String ordernum) {
        Intrinsics.X0O(ordernum, "ordernum");
        this.orderNum = ordernum;
        if (this.mConfirmPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.IXXOO(1);
            go0Var.O1O(R.string.guide_warm_title);
            go0Var.m1865iX(Integer.valueOf(R.string.pay_completed_tip));
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.yes_payment_go, new Function0() { // from class: com.android.mltcode.paycertificationapi.O1i0iXXIi
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseOrderListFragment.showConfirm$lambda$0$0(this.f2833IO));
                }
            });
            this.mConfirmPopup = go0Var;
        }
        go0 go0Var2 = this.mConfirmPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }
}
