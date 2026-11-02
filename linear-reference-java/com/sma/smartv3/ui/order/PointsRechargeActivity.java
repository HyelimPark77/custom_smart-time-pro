package com.sma.smartv3.ui.order;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXX00X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a02;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b02;
import com.android.mltcode.paycertificationapi.c02;
import com.android.mltcode.paycertificationapi.d02;
import com.android.mltcode.paycertificationapi.e02;
import com.android.mltcode.paycertificationapi.f02;
import com.android.mltcode.paycertificationapi.g02;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tz1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.uz1;
import com.android.mltcode.paycertificationapi.vz1;
import com.android.mltcode.paycertificationapi.wz1;
import com.android.mltcode.paycertificationapi.xz1;
import com.android.mltcode.paycertificationapi.yz1;
import com.android.mltcode.paycertificationapi.zz1;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.PointsPack;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetPointsPack;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "需求变更, 已废弃")
@SourceDebugExtension({"SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,309:1\n19#2:310\n15#2:311\n93#2,2:312\n90#2:314\n176#3,11:315\n196#3:334\n252#4,7:326\n270#4:333\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n*L\n137#1:310\n137#1:311\n153#1:312,2\n153#1:314\n210#1:315,11\n210#1:334\n210#1:326,7\n210#1:333\n*E\n"})
public final class PointsRechargeActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy btnRecharge$delegate;

    @aa1
    private final Lazy cbPointsPrivacy$delegate;
    private boolean isNeedPayDialog;

    @aa1
    private final Lazy ivAvatar$delegate;

    @aa1
    private final Lazy layoutBg$delegate;

    @tb1
    private go0 mPayconfirmPopup;

    @aa1
    private List<PointsPack> mPointsPackList;

    @tb1
    private OIXX00X mRechargePointPopup;

    @tb1
    private PointsPack mSelectPointsPack;

    @aa1
    private final Lazy mUserCardView$delegate;

    @aa1
    private String orderNum;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy rvPointsPack$delegate;

    @aa1
    private final Lazy tvNickname$delegate;

    @aa1
    private final Lazy tvPoints$delegate;

    @aa1
    private final Lazy tvPointsPrivacy$delegate;

    @SourceDebugExtension({"SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n87#2,7:310\n94#2,3:318\n70#2,7:321\n97#2:328\n1#3:317\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n*L\n101#1:310,7\n101#1:318,3\n101#1:321,7\n101#1:328\n101#1:317\n*E\n"})
    public static final class OXO1 extends ClickableSpan {
        public final /* synthetic */ PointsRechargeActivity IO;

        public OXO1(PointsRechargeActivity r1) {
            this.IO = r1;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View r4) {
            Intrinsics.X0O(r4, "widget");
            PointsRechargeActivity r5 = this.IO;
            String r0 = "https://api.iot-solution.net/web/cn/smart_time_pro/webs/points_agreement.html?lang=" + i72.OXO1.iOO1ii1(r5);
            Bundle r1 = new Bundle();
            r1.putString("mArg0", r0);
            r1.putInt("mArg1", 2);
            r1.putParcelable("mArg2", null);
            r1.putSerializable("mArg3", null);
            Intent r2 = new Intent(r5, WebViewActivity.class);
            r2.putExtras(r1);
            r5.startActivity(r2);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint r2) {
            Intrinsics.X0O(r2, "paint");
            r2.setColor(-16776961);
            r2.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.order.PointsRechargeActivity$initPointsPack$1, reason: invalid class name and case insensitive filesystem */
    public static final class C34831 extends CommonAdapter<PointsPack> {
        final /* synthetic */ PointsRechargeActivity this$0;

        public C34831(PointsRechargeActivity r2, List<PointsPack> r3) {
            this.this$0 = r2;
            super(r2, R.layout.item_points_pack_select, r3);
        }

        public static /* synthetic */ void OXO1(C34831 r0, PointsPack r1, PointsRechargeActivity r2, View r3) {
            convert$lambda$1(r0, r1, r2, r3);
        }

        private static final void convert$lambda$1(C34831 r2, PointsPack r3, PointsRechargeActivity r4, View r5) {
            Iterator r6 = r2.mDatas.iterator();
        L4:
            if (r6.hasNext() == false) goto L6;
            ((PointsPack) r6.next()).setSelect(false);
            goto L4
        L6:
            r3.setSelect(true);
            PointsRechargeActivity.access$setMSelectPointsPack$p(r4, r3);
            r2.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, PointsPack r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r5, final PointsPack r6, int r7) {
            Intrinsics.X0O(r5, "holder");
            Intrinsics.X0O(r6, MapController.ITEM_LAYER_TAG);
            View r0 = r5.getView(R.id.selectStatusAmount);
            if (r6.isSelect() == false) goto L5;
            Drawable r1 = gk4.XOO0ii0(this.this$0, R.drawable.rectangular_background_select);
        L6:
            r0.setBackgroundDrawable(r1);
            View r2 = r5.getView(R.id.recommendStatus);
            if (r6.getRecommend() == false) goto L9;
            int r3 = 0;
        L10:
            r2.setVisibility(r3);
            ((TextView) r5.getView(R.id.tv_pack_name)).setText(r6.getPackName());
            TextView r4 = (TextView) r5.getView(R.id.tv_original_amount);
            r4.setText("￥" + r6.getOriginalAmount());
            r4.getPaint().setFlags(17);
            ((TextView) r5.getView(R.id.tv_amount)).setText("￥" + r6.getAmount());
            View r8 = r5.getView(R.id.selectStatusAmount);
            final PointsRechargeActivity r9 = this.this$0;
            r8.setOnClickListener(new g02(this, r6, r9));
            return;
        L9:
            r3 = 4;
            goto L10
        L5:
            r1 = gk4.XOO0ii0(this.this$0, R.drawable.rectangular_background);
            goto L6
        }
    }

    public PointsRechargeActivity() {
        this.TAG = "PointsRecharge";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new tz1(this));
        this.layoutBg$delegate = LazyKt__LazyJVMKt.iO(new xz1(this));
        this.ivAvatar$delegate = LazyKt__LazyJVMKt.iO(new yz1(this));
        this.tvNickname$delegate = LazyKt__LazyJVMKt.iO(new zz1(this));
        this.tvPoints$delegate = LazyKt__LazyJVMKt.iO(new a02(this));
        this.rvPointsPack$delegate = LazyKt__LazyJVMKt.iO(new b02(this));
        this.cbPointsPrivacy$delegate = LazyKt__LazyJVMKt.iO(new c02(this));
        this.tvPointsPrivacy$delegate = LazyKt__LazyJVMKt.iO(new d02(this));
        this.btnRecharge$delegate = LazyKt__LazyJVMKt.iO(new e02(this));
        this.mUserCardView$delegate = LazyKt__LazyJVMKt.iO(new f02(this));
        this.mPointsPackList = new ArrayList();
        this.orderNum = "";
    }

    public static /* synthetic */ View I0iXXO(PointsRechargeActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button I1XOi1(PointsRechargeActivity r0) {
        return btnRecharge_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView IIX1OXO(PointsRechargeActivity r0) {
        return ivAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(PointsRechargeActivity r0) {
        return showPayConfirm$lambda$0$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(PointsRechargeActivity r0) {
        return tvNickname_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(PointsRechargeActivity r0) {
        return layoutBg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(PointsRechargeActivity r0) {
        return tvPoints_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CardView X1ii(PointsRechargeActivity r0) {
        return mUserCardView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX0(PointsRechargeActivity r0) {
        return tvPointsPrivacy_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XXI(PointsRechargeActivity r0) {
        return rvPointsPack_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIO(PointsRechargeActivity r0, boolean r1) {
        return getOrderStatus$lambda$0(r0, r1);
    }

    public static /* synthetic */ AppCompatCheckBox XiOIii1(PointsRechargeActivity r0) {
        return cbPointsPrivacy_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ List access$getMPointsPackList$p(PointsRechargeActivity r0) {
        return r0.mPointsPackList;
    }

    public static final /* synthetic */ RecyclerView access$getRvPointsPack(PointsRechargeActivity r0) {
        return r0.getRvPointsPack();
    }

    public static final /* synthetic */ String access$getTAG$p(PointsRechargeActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setMSelectPointsPack$p(PointsRechargeActivity r0, PointsPack r1) {
        r0.mSelectPointsPack = r1;
    }

    private static final Button btnRecharge_delegate$lambda$0(PointsRechargeActivity r1) {
        return (Button) r1.findViewById(R.id.btn_recharge);
    }

    private static final AppCompatCheckBox cbPointsPrivacy_delegate$lambda$0(PointsRechargeActivity r1) {
        return (AppCompatCheckBox) r1.findViewById(R.id.cb_points_privacy);
    }

    private final Button getBtnRecharge() {
        return (Button) getValue();
    }

    private final AppCompatCheckBox getCbPointsPrivacy() {
        return (AppCompatCheckBox) getValue();
    }

    private final ImageView getIvAvatar() {
        return (ImageView) getValue();
    }

    private final View getLayoutBg() {
        return (View) getValue();
    }

    private final CardView getMUserCardView() {
        return (CardView) getValue();
    }

    private static final Unit getOrderStatus$lambda$0(PointsRechargeActivity r0, boolean r1) {
        if (r1 == false) goto L4;
        r0.showRechargePointPopup();
    L6:
        return Unit.OXO1;
    L4:
        ToastUtils.showLong(R.string.pay_confirm_error);
        goto L6
    }

    private final void getPayInfo() {
    }

    private final void getPointsPack() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " getPointsPack");
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r1 = RequestBodyKt.getPointsPackBody();
        final O1XIiIO<PointsPack[]> r2 = new AnonymousClass1(this);
        final Activity r3 = null;
        final uq r4 = r0.loadPopup(null, null);
        String r5 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetPointsPack.URL);
        r0.printParam(r5 + GetPointsPack.URL, r1);
        NetWork r6 = NetWork.OXO1;
        String r7 = r5 + GetPointsPack.URL;
        final O1XIiIO<Response<PointsPack[]>> r8 = new PointsRechargeActivity$getPointsPack$$inlined$post$default$1(r3, r2, r4);
        AndroidNetworking.post(r7).addBodyParameter(r1).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{PointsPack[].class}), new PointsRechargeActivity$getPointsPack$$inlined$post$default$2(r8));
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final RecyclerView getRvPointsPack() {
        return (RecyclerView) getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) getValue();
    }

    private final TextView getTvPoints() {
        return (TextView) getValue();
    }

    private final TextView getTvPointsPrivacy() {
        return (TextView) getValue();
    }

    public static /* synthetic */ void iIiiO(PointsRechargeActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private final void initPointsPack() {
        getPointsPack();
        getRvPointsPack().setLayoutManager(new GridLayoutManager(this, 2));
        getRvPointsPack().setAdapter(new C34831(this, this.mPointsPackList));
    }

    private final void initUserPanel() {
        TextView r0 = getTvNickname();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        r0.setText(((AppUser) r2).getNickname());
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 r4 = sz0.OXO1;
        if (uz0.OIi0(r4).exists() == false) goto L9;
        getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(r4)));
    L9:
        showPoints();
    }

    private static final void initView$lambda$0(PointsRechargeActivity r1, View r2) {
        if (r1.getCbPointsPrivacy().isChecked() == true) goto L7;
        ToastUtils.showLong(r1.getString(R.string.privacy_tick_tip_v2), new Object[0]);
        return;
    L7:
        if (r1.mSelectPointsPack != null) goto L10;
        ToastUtils.showLong(r1.getString(R.string.select_recharge_tip), new Object[0]);
        return;
    L10:
        r1.getPayInfo();
    }

    private static final ImageView ivAvatar_delegate$lambda$0(PointsRechargeActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_avatar);
    }

    private static final View layoutBg_delegate$lambda$0(PointsRechargeActivity r1) {
        return r1.findViewById(R.id.points_recharge_bg_layout);
    }

    private static final CardView mUserCardView_delegate$lambda$0(PointsRechargeActivity r1) {
        return (CardView) r1.findViewById(R.id.btRecharge);
    }

    private static final View rootView_delegate$lambda$0(PointsRechargeActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final RecyclerView rvPointsPack_delegate$lambda$0(PointsRechargeActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv_points_pack);
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.I0iXXO(false);
        r0.O1O(R.string.payment_completed_tip);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.yes_payment, new wz1(this));
        this.mPayconfirmPopup = r0;
    L5:
        go0 r1 = this.mPayconfirmPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean showPayConfirm$lambda$0$0(PointsRechargeActivity r0) {
        r0.getOrderStatus();
        return true;
    }

    private final void showPoints() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new Gson().fromJson(r0.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), AccountPoints.class);
        if (r1 != null) goto L5;
        r1 = AccountPoints.class.newInstance();
    L5:
        getTvPoints().setText(String.valueOf(((AccountPoints) r1).getPoints()));
    }

    private static final TextView tvNickname_delegate$lambda$0(PointsRechargeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_nickname);
    }

    private static final TextView tvPointsPrivacy_delegate$lambda$0(PointsRechargeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_points_privacy);
    }

    private static final TextView tvPoints_delegate$lambda$0(PointsRechargeActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_points);
    }

    @aa1
    public final String getOrderNum() {
        return this.orderNum;
    }

    public final void getOrderStatus() {
        OrderManager.OXO1.XX0(this.orderNum, "Points", new vz1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.root_view));
        setNavBarColor(this, gk4.iO(this, R.color.points_bg_color));
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.points_recharge);
        initUserPanel();
        initPointsPack();
        SpanUtils.with(getTvPointsPrivacy()).append(getString(R.string.points_privacy_tip1)).append(getString(R.string.points_privacy_tip2)).setClickSpan(new OXO1(this)).create();
        getBtnRecharge().setOnClickListener(new uz1(this));
        getLayoutBg().setBackgroundTintList(ColorStateList.valueOf(gk4.iO(this, R.color.points_bg_color)));
        getMUserCardView().setBackgroundTintList(ColorStateList.valueOf(gk4.iO(this, R.color.points_bg_color_secondary)));
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_order_points_recharge;
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        this.isNeedPayDialog = false;
        go0 r4 = this.mPayconfirmPopup;
        if (r4 == null) goto L6;
        if (r4 == null) goto L6;
        r4.dismiss();
    L6:
        getOrderStatus();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isNeedPayDialog == false) goto L6;
        this.isNeedPayDialog = false;
        showPayConfirm();
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    @sf5(tag = I01XX0.iIi0)
    public final void onUserPointsChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onUserPointsChange");
        showPoints();
    }

    public final void setNeedPayDialog(boolean r1) {
        this.isNeedPayDialog = r1;
    }

    public final void setOrderNum(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.orderNum = r2;
    }

    public final void showRechargePointPopup() {
        LogUtils.d(new Object[]{"onGetFreePoints"});
        if (this.mRechargePointPopup != null) goto L5;
        OrderManager.OXO1.iIXi1iiXI(true);
        OIXX00X r0 = new OIXX00X(this, R.layout.pop_center_prompt_recharge_point);
        r0.O1O(getString(R.string.recharge_points_arrived_tip));
        this.mRechargePointPopup = r0;
    L5:
        OIXX00X r1 = this.mRechargePointPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.XiOIO(r2);
        return;
    }
}
