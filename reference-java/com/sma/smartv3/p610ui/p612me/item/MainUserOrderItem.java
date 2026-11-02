package com.sma.smartv3.p610ui.p612me.item;

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
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.p610ui.p612me.item.MainUserOrderItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nMainUserOrderItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,269:1\n93#2,2:270\n90#2:272\n93#2,2:273\n90#2:275\n1#3:276\n1#3:284\n87#4,7:277\n94#4,3:285\n70#4,7:288\n97#4:295\n*S KotlinDebug\n*F\n+ 1 MainUserOrderItem.kt\ncom/sma/smartv3/ui/me/item/MainUserOrderItem\n*L\n118#1:270,2\n118#1:272\n141#1:273,2\n141#1:275\n202#1:284\n202#1:277,7\n202#1:285,3\n202#1:288,7\n202#1:295\n*E\n"})
public class MainUserOrderItem extends BaseDslItem {
    public View btPointsDetail;
    public View btRecharge;
    public View btUserOrder;
    private final boolean initEvent = true;
    public View layoutPoints;

    @tb1
    private View.OnClickListener mOnClick;
    public RecyclerView rvVipInterests;
    public PFMedium tvBenefitPackage;
    public PFMedium tvBenefitPackageTip;
    public TextView tvRecharge;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toWatchFaceActivity$lambda$0(Context context, final int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        i72 i72Var = i72.OXO1;
        Intrinsics.X1ii(context, "null cannot be cast to non-null type android.app.Activity");
        i72Var.OOIX((Activity) context);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.x30
            @Override // java.lang.Runnable
            public final void run() {
                MainUserOrderItem.toWatchFaceActivity$lambda$0$0(i);
            }
        }, 500L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toWatchFaceActivity$lambda$0$0(int i) {
        I01XX0.OXO1(I01XX0.O1iXiI, Integer.valueOf(i));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.btRecharge);
        Intrinsics.XXI(viewM3483v);
        setBtRecharge(viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.btPointsDetail);
        Intrinsics.XXI(viewM3483v2);
        setBtPointsDetail(viewM3483v2);
        View viewM3483v3 = itemHolder.m3483v(R.id.btUserOrder);
        Intrinsics.XXI(viewM3483v3);
        setBtUserOrder(viewM3483v3);
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvRecharge);
        Intrinsics.XXI(textViewM3482tv);
        setTvRecharge(textViewM3482tv);
        View viewM3483v4 = itemHolder.m3483v(R.id.me_points_layout);
        Intrinsics.XXI(viewM3483v4);
        setLayoutPoints(viewM3483v4);
        View viewM3483v5 = itemHolder.m3483v(R.id.user_order_ai_benefit_package);
        Intrinsics.XXI(viewM3483v5);
        setTvBenefitPackage((PFMedium) viewM3483v5);
        View viewM3483v6 = itemHolder.m3483v(R.id.user_order_ai_benefit_package_tip);
        Intrinsics.XXI(viewM3483v6);
        setTvBenefitPackageTip((PFMedium) viewM3483v6);
        View viewM3483v7 = itemHolder.m3483v(R.id.user_order_horizontal_recycler);
        Intrinsics.XXI(viewM3483v7);
        setRvVipInterests((RecyclerView) viewM3483v7);
        itemHolder.click(R.id.btRecharge, this.mOnClick);
        itemHolder.click(R.id.btPointsDetail, this.mOnClick);
        itemHolder.click(R.id.btUserOrder, this.mOnClick);
    }

    @aa1
    public final View getBtPointsDetail() {
        View view = this.btPointsDetail;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btPointsDetail");
        return null;
    }

    @aa1
    public final View getBtRecharge() {
        View view = this.btRecharge;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btRecharge");
        return null;
    }

    @aa1
    public final View getBtUserOrder() {
        View view = this.btUserOrder;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("btUserOrder");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final View getLayoutPoints() {
        View view = this.layoutPoints;
        if (view != null) {
            return view;
        }
        Intrinsics.XXO("layoutPoints");
        return null;
    }

    @tb1
    public final View.OnClickListener getMOnClick() {
        return this.mOnClick;
    }

    @aa1
    public final RecyclerView getRvVipInterests() {
        RecyclerView recyclerView = this.rvVipInterests;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.XXO("rvVipInterests");
        return null;
    }

    @aa1
    public final PFMedium getTvBenefitPackage() {
        PFMedium pFMedium = this.tvBenefitPackage;
        if (pFMedium != null) {
            return pFMedium;
        }
        Intrinsics.XXO("tvBenefitPackage");
        return null;
    }

    @aa1
    public final PFMedium getTvBenefitPackageTip() {
        PFMedium pFMedium = this.tvBenefitPackageTip;
        if (pFMedium != null) {
            return pFMedium;
        }
        Intrinsics.XXO("tvBenefitPackageTip");
        return null;
    }

    @aa1
    public final TextView getTvRecharge() {
        TextView textView = this.tvRecharge;
        if (textView != null) {
            return textView;
        }
        Intrinsics.XXO("tvRecharge");
        return null;
    }

    public final void initRecyclerView() {
        getRvVipInterests().setLayoutManager(new LinearLayoutManager(getRvVipInterests().getContext(), 0, false));
        getRvVipInterests().setAdapter(new MainUserOrderItem$initRecyclerView$mAdapter$1(this, getRvVipInterests().getContext(), UserOrderKt.getVipBenefitList()));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() throws IllegalAccessException, InstantiationException {
        String strXXO;
        i72 i72Var = i72.OXO1;
        setItemHidden(!i72Var.O101());
        UtilsKt.IX1XiI(getLayoutPoints(), Utils.getApp().getResources().getDimension(R.dimen.common_item_radius));
        if (i72Var.IOX1()) {
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
            if (objFromJson == null) {
                objFromJson = UserMember.class.newInstance();
            }
            UserMember userMember = (UserMember) objFromJson;
            OiOX0i.m1037iO(userMember.getGetMemberFlag());
            if (userMember.getLatestDateTime() > 0) {
                getTvBenefitPackage().setVisibility(0);
                PFMedium tvBenefitPackageTip = getTvBenefitPackageTip();
                if (userMember.getServerDateTime() > userMember.getLatestDateTime()) {
                    strXXO = UtilsKt.XXO(R.string.ai_expired_tip);
                } else {
                    strXXO = UtilsKt.XXO(R.string.valid_until) + O0X11OiO.I0IIOi().format(new Date(userMember.getLatestDateTime()));
                }
                tvBenefitPackageTip.setText(strXXO);
                getTvRecharge().setText(UtilsKt.XXO(R.string.renew_now));
            } else {
                getTvBenefitPackage().setVisibility(8);
                getTvBenefitPackageTip().setText(UtilsKt.XXO(R.string.buy_ai_tip));
                getTvRecharge().setText(UtilsKt.XXO(R.string.go_recharge));
            }
            getBtPointsDetail().setVisibility(8);
        } else {
            SPUtils sPUtilsIiI10X2 = a01.OXO1.IiI10X();
            Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X2.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), (Class<Object>) AccountPoints.class);
            if (objFromJson2 == null) {
                objFromJson2 = AccountPoints.class.newInstance();
            }
            ((AccountPoints) objFromJson2).getGetPointFlag();
            getTvRecharge().setText(UtilsKt.XXO(R.string.go_recharge));
            getTvBenefitPackageTip().setText(UtilsKt.XXO(R.string.me_points_recharge_tip));
            getTvBenefitPackage().setVisibility(8);
            getBtPointsDetail().setVisibility(0);
        }
        initRecyclerView();
        pointDetailBg();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.me_item_user_order;
    }

    @sf5(tag = I01XX0.iOX)
    public final void onGetFreePoints(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onGetFreePoints");
        initView();
    }

    @sf5(tag = I01XX0.Ii0X0X)
    public final void onLoginDone(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        initView();
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public final void onThemeChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("onThemeChange");
        if (i72.OXO1.IOX1()) {
            getLayoutPoints().setBackground(gk4.XOO0ii0(getLayoutPoints().getContext(), R.drawable.shape_me_bottom_ll_bg));
        }
        pointDetailBg();
    }

    @sf5(tag = I01XX0.O101)
    public final void onUserMemberChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onUserMemberChange");
        initView();
    }

    @sf5(tag = I01XX0.iIi0)
    public final void onUserPointsChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onUserPointsChange");
        initView();
    }

    public final void pointDetailBg() {
        getBtPointsDetail().setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(getBtPointsDetail().getContext(), R.color.points_secondary_bg_color)));
        getTvRecharge().setTextColor(gk4.m1859iO(getTvRecharge().getContext(), R.color.points_go_recharge_color));
    }

    public final void setBtPointsDetail(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btPointsDetail = view;
    }

    public final void setBtRecharge(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btRecharge = view;
    }

    public final void setBtUserOrder(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.btUserOrder = view;
    }

    public final void setLayoutPoints(@aa1 View view) {
        Intrinsics.X0O(view, "<set-?>");
        this.layoutPoints = view;
    }

    public final void setMOnClick(@tb1 View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
    }

    public final void setRvVipInterests(@aa1 RecyclerView recyclerView) {
        Intrinsics.X0O(recyclerView, "<set-?>");
        this.rvVipInterests = recyclerView;
    }

    public final void setTvBenefitPackage(@aa1 PFMedium pFMedium) {
        Intrinsics.X0O(pFMedium, "<set-?>");
        this.tvBenefitPackage = pFMedium;
    }

    public final void setTvBenefitPackageTip(@aa1 PFMedium pFMedium) {
        Intrinsics.X0O(pFMedium, "<set-?>");
        this.tvBenefitPackageTip = pFMedium;
    }

    public final void setTvRecharge(@aa1 TextView textView) {
        Intrinsics.X0O(textView, "<set-?>");
        this.tvRecharge = textView;
    }

    public final void toVipBenefitIntent(@aa1 Context context, int i) {
        Intrinsics.X0O(context, "context");
        if (i == VipBenefitType.AI.getType()) {
            List<AIFunction> aIFunction = AIFunctionDataKt.getAIFunction();
            if (aIFunction.isEmpty()) {
                return;
            }
            AIFunctionDataKt.toAIFunction((Activity) context, aIFunction.get(0));
            return;
        }
        if (i == VipBenefitType.AIGC.getType()) {
            toWatchFaceActivity(context, 1);
            return;
        }
        if (i == VipBenefitType.DIAL.getType()) {
            toWatchFaceActivity(context, 0);
            return;
        }
        if (i == VipBenefitType.BUY_VIP.getType()) {
            Activity activity = (Activity) context;
            String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strX11iII1O1);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(activity, (Class<?>) GoogleWebViewActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    public final void toWatchFaceActivity(@aa1 final Context context, final int i) {
        Intrinsics.X0O(context, "context");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.w30
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainUserOrderItem.toWatchFaceActivity$lambda$0(context, i, (BleConnector) obj);
            }
        }, 1, null);
    }
}
