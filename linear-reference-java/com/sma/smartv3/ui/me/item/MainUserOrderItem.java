package com.sma.smartv3.ui.me.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w30;
import com.android.mltcode.paycertificationapi.x30;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIFunctionDataKt;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.model.UserOrderKt;
import com.sma.smartv3.model.VipBenefitType;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nMainUserOrderItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,269:1\n93#2,2:270\n90#2:272\n93#2,2:273\n90#2:275\n1#3:276\n1#3:284\n87#4,7:277\n94#4,3:285\n70#4,7:288\n97#4:295\n*S KotlinDebug\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n*L\n118#1:270,2\n118#1:272\n141#1:273,2\n141#1:275\n202#1:284\n202#1:277,7\n202#1:285,3\n202#1:288,7\n202#1:295\n*E\n"})
public class MainUserOrderItem extends BaseDslItem {
    public View btPointsDetail;
    public View btRecharge;
    public View btUserOrder;
    private final boolean initEvent;
    public View layoutPoints;

    @tb1
    private View.OnClickListener mOnClick;
    public RecyclerView rvVipInterests;
    public PFMedium tvBenefitPackage;
    public PFMedium tvBenefitPackageTip;
    public TextView tvRecharge;

    public MainUserOrderItem() {
        this.initEvent = true;
    }

    public static /* synthetic */ Unit IiI10X(Context r0, int r1, BleConnector r2) {
        return toWatchFaceActivity$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void O00(int r0) {
        toWatchFaceActivity$lambda$0$0(r0);
    }

    private static final Unit toWatchFaceActivity$lambda$0(Context r2, final int r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        i72 r5 = i72.OXO1;
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.app.Activity");
        r5.OOIX((Activity) r2);
        new Handler(Looper.getMainLooper()).postDelayed(new x30(r3), 500);
        return Unit.OXO1;
    }

    private static final void toWatchFaceActivity$lambda$0$0(int r1) {
        I01XX0.OXO1(I01XX0.O1iXiI, Integer.valueOf(r1));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        View r1 = r5.v(R.id.btRecharge);
        Intrinsics.XXI(r1);
        setBtRecharge(r1);
        View r2 = r5.v(R.id.btPointsDetail);
        Intrinsics.XXI(r2);
        setBtPointsDetail(r2);
        View r3 = r5.v(R.id.btUserOrder);
        Intrinsics.XXI(r3);
        setBtUserOrder(r3);
        TextView r4 = r5.tv(R.id.tvRecharge);
        Intrinsics.XXI(r4);
        setTvRecharge(r4);
        View r6 = r5.v(R.id.me_points_layout);
        Intrinsics.XXI(r6);
        setLayoutPoints(r6);
        View r7 = r5.v(R.id.user_order_ai_benefit_package);
        Intrinsics.XXI(r7);
        setTvBenefitPackage((PFMedium) r7);
        View r8 = r5.v(R.id.user_order_ai_benefit_package_tip);
        Intrinsics.XXI(r8);
        setTvBenefitPackageTip((PFMedium) r8);
        View r9 = r5.v(R.id.user_order_horizontal_recycler);
        Intrinsics.XXI(r9);
        setRvVipInterests((RecyclerView) r9);
        r5.click(R.id.btRecharge, this.mOnClick);
        r5.click(R.id.btPointsDetail, this.mOnClick);
        r5.click(R.id.btUserOrder, this.mOnClick);
    }

    @aa1
    public final View getBtPointsDetail() {
        View r0 = this.btPointsDetail;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btPointsDetail");
        return null;
    }

    @aa1
    public final View getBtRecharge() {
        View r0 = this.btRecharge;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btRecharge");
        return null;
    }

    @aa1
    public final View getBtUserOrder() {
        View r0 = this.btUserOrder;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("btUserOrder");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final View getLayoutPoints() {
        View r0 = this.layoutPoints;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("layoutPoints");
        return null;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    @aa1
    public final RecyclerView getRvVipInterests() {
        RecyclerView r0 = this.rvVipInterests;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("rvVipInterests");
        return null;
    }

    @aa1
    public final PFMedium getTvBenefitPackage() {
        PFMedium r0 = this.tvBenefitPackage;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvBenefitPackage");
        return null;
    }

    @aa1
    public final PFMedium getTvBenefitPackageTip() {
        PFMedium r0 = this.tvBenefitPackageTip;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvBenefitPackageTip");
        return null;
    }

    @aa1
    public final TextView getTvRecharge() {
        TextView r0 = this.tvRecharge;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("tvRecharge");
        return null;
    }

    public final void initRecyclerView() {
        getRvVipInterests().setLayoutManager(new LinearLayoutManager(getRvVipInterests().getContext(), 0, false));
        MainUserOrderItem$initRecyclerView$mAdapter$1 r2 = new MainUserOrderItem$initRecyclerView$mAdapter$1(this, getRvVipInterests().getContext(), UserOrderKt.getVipBenefitList());
        getRvVipInterests().setAdapter(r2);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        i72 r0 = i72.OXO1;
        setItemHidden(!r0.O101());
        UtilsKt.IX1XiI(getLayoutPoints(), Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        if (r0.IOX1() == false) goto L16;
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r2 != null) goto L7;
        r2 = UserMember.class.newInstance();
    L7:
        UserMember r3 = (UserMember) r2;
        OiOX0i.iO(r3.getGetMemberFlag());
        if (r3.getLatestDateTime() <= 0) goto L14;
        getTvBenefitPackage().setVisibility(0);
        PFMedium r4 = getTvBenefitPackageTip();
        if (r3.getServerDateTime() <= r3.getLatestDateTime()) goto L12;
        String r5 = UtilsKt.XXO(R.string.ai_expired_tip);
    L13:
        r4.setText(r5);
        getTvRecharge().setText(UtilsKt.XXO(R.string.renew_now));
    L15:
        getBtPointsDetail().setVisibility(8);
    L20:
        initRecyclerView();
        pointDetailBg();
        return;
    L12:
        r5 = UtilsKt.XXO(R.string.valid_until) + O0X11OiO.I0IIOi().format(new Date(r3.getLatestDateTime()));
        goto L13
    L14:
        getTvBenefitPackage().setVisibility(8);
        getTvBenefitPackageTip().setText(UtilsKt.XXO(R.string.buy_ai_tip));
        getTvRecharge().setText(UtilsKt.XXO(R.string.go_recharge));
        goto L15
    L16:
        SPUtils r6 = a01.OXO1.IiI10X();
        Object r7 = new Gson().fromJson(r6.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), AccountPoints.class);
        if (r7 != null) goto L19;
        r7 = AccountPoints.class.newInstance();
    L19:
        ((AccountPoints) r7).getGetPointFlag();
        getTvRecharge().setText(UtilsKt.XXO(R.string.go_recharge));
        getTvBenefitPackageTip().setText(UtilsKt.XXO(R.string.me_points_recharge_tip));
        getTvBenefitPackage().setVisibility(8);
        getBtPointsDetail().setVisibility(0);
        goto L20
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_user_order;
    }

    @sf5(tag = I01XX0.iOX)
    public final void onGetFreePoints(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onGetFreePoints");
        initView();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onLoginDone(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        LogUtils.d(new Object[]{"onThemeChange"});
        if (i72.OXO1.IOX1() == false) goto L5;
        getLayoutPoints().setBackground(gk4.XOO0ii0(getLayoutPoints().getContext(), R.drawable.shape_me_bottom_ll_bg));
    L5:
        pointDetailBg();
    }

    @sf5(tag = I01XX0.O101)
    public final void onUserMemberChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onUserMemberChange");
        initView();
    }

    @sf5(tag = I01XX0.iIi0)
    public final void onUserPointsChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onUserPointsChange");
        initView();
    }

    public final void pointDetailBg() {
        getBtPointsDetail().setBackgroundTintList(ColorStateList.valueOf(gk4.iO(getBtPointsDetail().getContext(), R.color.points_secondary_bg_color)));
        getTvRecharge().setTextColor(gk4.iO(getTvRecharge().getContext(), R.color.points_go_recharge_color));
    }

    public final void setBtPointsDetail(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btPointsDetail = r2;
    }

    public final void setBtRecharge(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btRecharge = r2;
    }

    public final void setBtUserOrder(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.btUserOrder = r2;
    }

    public final void setLayoutPoints(@aa1 View r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.layoutPoints = r2;
    }

    public final void setMOnClick(@tb1 View.OnClickListener r1) {
        this.mOnClick = r1;
    }

    public final void setRvVipInterests(@aa1 RecyclerView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.rvVipInterests = r2;
    }

    public final void setTvBenefitPackage(@aa1 PFMedium r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvBenefitPackage = r2;
    }

    public final void setTvBenefitPackageTip(@aa1 PFMedium r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvBenefitPackageTip = r2;
    }

    public final void setTvRecharge(@aa1 TextView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tvRecharge = r2;
    }

    public final void toVipBenefitIntent(@aa1 Context r4, int r5) {
        Intrinsics.X0O(r4, "context");
        if (r5 != VipBenefitType.AI.getType()) goto L9;
        List<AIFunction> r6 = AIFunctionDataKt.getAIFunction();
        if (r6.isEmpty() == true) goto L20;
        AIFunctionDataKt.toAIFunction((Activity) r4, r6.get(0));
        return;
    L20:
        return;
    L9:
        if (r5 != VipBenefitType.AIGC.getType()) goto L13;
        toWatchFaceActivity(r4, 1);
        return;
    L13:
        if (r5 != VipBenefitType.DIAL.getType()) goto L17;
        toWatchFaceActivity(r4, 0);
        return;
    L17:
        if (r5 != VipBenefitType.BUY_VIP.getType()) goto L21;
        Activity r7 = (Activity) r4;
        String r8 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r8);
        r0.putInt("mArg1", 2);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r9 = new Intent(r7, GoogleWebViewActivity.class);
        r9.putExtras(r0);
        r7.startActivity(r9);
        return;
    }

    public final void toWatchFaceActivity(@aa1 final Context r3, final int r4) {
        Intrinsics.X0O(r3, "context");
        X0IOiX1O.XIi00iiXO(false, new w30(r3, r4), 1, null);
    }
}
