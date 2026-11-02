package com.sma.smartv3.ui.order.fragment;

import android.content.Intent;
import android.os.Bundle;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXiXO1;
import com.android.mltcode.paycertificationapi.O01OX;
import com.android.mltcode.paycertificationapi.O1i0iXXIi;
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
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
    private final TimePeriod mTimePeriod;

    @aa1
    private String orderNum;

    @aa1
    private String orderType;
    private int pageNum;

    public BaseOrderListFragment() {
        this.mTimePeriod = TimePeriod.DAY;
        setInitUpdate(false);
        this.pageNum = 1;
        this.orderType = "";
        this.orderNum = "";
        this.mList = new ArrayList();
    }

    public static /* synthetic */ Unit O10IXXX0X(BaseOrderListFragment r0, boolean r1) {
        return getOrderStatus$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean X0O(BaseOrderListFragment r0) {
        return showConfirm$lambda$0$0(r0);
    }

    public static /* synthetic */ Unit X1ii(boolean r0) {
        return deleteOrder$lambda$0(r0);
    }

    private static final Unit deleteOrder$lambda$0(boolean r0) {
        if (r0 == false) goto L4;
        int r1 = R.string.success_save;
    L5:
        ToastUtils.showLong(r1);
        return Unit.OXO1;
    L4:
        r1 = R.string.fail;
        goto L5
    }

    private static final Unit getOrderStatus$lambda$0(BaseOrderListFragment r0, boolean r1) {
        if (r1 == false) goto L4;
        r0.pageNum = 1;
        r0.getOrderList();
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.pay_confirm_error);
        goto L6
    }

    private static final boolean showConfirm$lambda$0$0(BaseOrderListFragment r7) {
        LogUtils.d(new Object[]{"OrderList orderType = " + r7.orderType + " orderNum = " + r7.orderNum});
        r7.isNeedPayDialog = true;
        String r1 = OrderManager.iIiiO(OrderManager.OXO1, r7.orderNum, r7.orderType, null, 4, null);
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r1);
        r2.putInt("mArg1", 2);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r3 = new Intent(r7.getActivity(), GoogleWebViewActivity.class);
        r3.putExtras(r2);
        r7.startActivity(r3);
        return true;
    }

    public final void deleteOrder(@aa1 String r3) {
        Intrinsics.X0O(r3, "orderId");
        OrderManager.OXO1.iO(r3, new O01OX());
    }

    public final void deleteRecord(int r3) {
        if (this.mList.isEmpty() == false) goto L5;
        return;
    L5:
        if (this.mList.size() <= (r3 + 1)) goto L9;
        this.mList.remove(r3);
        return;
    }

    @tb1
    public final go0 getMDeletePopup() {
        return this.mDeletePopup;
    }

    @aa1
    public final List<OrderContentData> getMList() {
        return this.mList;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    public void getOrderList() {
    }

    public final void getOrderStatus() {
        OrderManager.OXO1.XX0(this.orderNum, this.orderType, new IXiXO1(this));
    }

    @aa1
    public final String getOrderType() {
        return this.orderType;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @aa1
    public final List<OrderContentData> initList() {
        this.mList.clear();
        List<OrderContentData> r0 = this.mList;
        SPUtils r1 = a01.OXO1.IiI10X();
        String r2 = b01.XOIO11O + this.orderType;
        AccountOrderData r3 = (AccountOrderData) new Gson().fromJson(r1.getString(r2 + '_' + AccountOrderData.class.getName()), AccountOrderData.class);
        if (r3 == null) goto L9;
        List<OrderContentData> r4 = r3.getContent();
        if (r4 == null) goto L9;
        List r5 = CollectionsKt___CollectionsKt.OO0Oi10(r4);
        if (r5 == null) goto L9;
        List r6 = r5;
    L10:
        r0.addAll(r6);
        return this.mList;
    L9:
        r6 = new ArrayList();
        goto L10
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        initList();
        getOrderList();
        super.initView();
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_order_dial;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<OrderContentData> r2) {
        Intrinsics.X0O(r2, "data");
        getDslAdapter().clearAllItems();
        onInitBaseLayoutAfter();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        setAdapter();
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        this.isNeedPayDialog = false;
        i1O0OXO1O.OXO1.OXO1("onOrderPayStatusChange");
        getOrderList();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDslAdapter().notifyDataChanged();
        if (this.isNeedPayDialog == false) goto L6;
        this.pageNum = 1;
        this.isNeedPayDialog = false;
        getOrderList();
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<OrderContentData> onTimePeriodChange(@aa1 Calendar r1, int r2, @aa1 TimePeriod r3) {
        Intrinsics.X0O(r1, "calendar");
        Intrinsics.X0O(r3, "timePeriod");
        LogUtils.d(new Object[]{"onTimePeriodChange"});
        return initList();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    public int recyclerViewId() {
        return R.id.recycler_view;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment
    public int refreshLayoutId() {
        return 0;
    }

    public void setAdapter() {
    }

    public final void setMDeletePopup(@tb1 go0 r1) {
        this.mDeletePopup = r1;
    }

    public final void setNeedPayDialog(boolean r1) {
        this.isNeedPayDialog = r1;
    }

    public final void setOrderType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderType = r2;
    }

    public final void setPageNum(int r1) {
        this.pageNum = r1;
    }

    public final void showConfirm(@aa1 String r5) {
        Intrinsics.X0O(r5, "ordernum");
        this.orderNum = r5;
        if (this.mConfirmPopup != null) goto L5;
        go0 r6 = new go0(getMActivity(), 0, 2, null);
        r6.I0iXXO(false);
        r6.IXXOO(1);
        r6.O1O(R.string.guide_warm_title);
        r6.iX(Integer.valueOf(R.string.pay_completed_tip));
        go0.X11iII1O1(r6, Integer.valueOf(R.string.cancel), null, 2, null);
        r6.X1IX(R.string.yes_payment_go, new O1i0iXXIi(this));
        this.mConfirmPopup = r6;
    L5:
        go0 r7 = this.mConfirmPopup;
        if (r7 == null) goto L9;
        r7.IIX1OXO();
        return;
    }
}
