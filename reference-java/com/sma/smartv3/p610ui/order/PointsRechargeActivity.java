package com.sma.smartv3.p610ui.order;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
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
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OIXX00X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
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
import com.sma.smartv3.p610ui.order.PointsRechargeActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "需求变更, 已废弃")
@SourceDebugExtension({"SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,309:1\n19#2:310\n15#2:311\n93#2,2:312\n90#2:314\n176#3,11:315\n196#3:334\n252#4,7:326\n270#4:333\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity\n*L\n137#1:310\n137#1:311\n153#1:312,2\n153#1:314\n210#1:315,11\n210#1:334\n210#1:326,7\n210#1:333\n*E\n"})
public final class PointsRechargeActivity extends BaseActivity {
    private boolean isNeedPayDialog;

    @tb1
    private go0 mPayconfirmPopup;

    @tb1
    private OIXX00X mRechargePointPopup;

    @tb1
    private PointsPack mSelectPointsPack;

    @aa1
    private final String TAG = "PointsRecharge";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.rootView_delegate$lambda$0(this.f11394IO);
        }
    });

    @aa1
    private final Lazy layoutBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.layoutBg_delegate$lambda$0(this.f12273IO);
        }
    });

    @aa1
    private final Lazy ivAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.ivAvatar_delegate$lambda$0(this.f12486IO);
        }
    });

    @aa1
    private final Lazy tvNickname$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.tvNickname_delegate$lambda$0(this.f12729IO);
        }
    });

    @aa1
    private final Lazy tvPoints$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a02
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.tvPoints_delegate$lambda$0(this.f5387IO);
        }
    });

    @aa1
    private final Lazy rvPointsPack$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b02
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.rvPointsPack_delegate$lambda$0(this.f5639IO);
        }
    });

    @aa1
    private final Lazy cbPointsPrivacy$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c02
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.cbPointsPrivacy_delegate$lambda$0(this.f5868IO);
        }
    });

    @aa1
    private final Lazy tvPointsPrivacy$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d02
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.tvPointsPrivacy_delegate$lambda$0(this.f6098IO);
        }
    });

    @aa1
    private final Lazy btnRecharge$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e02
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.btnRecharge_delegate$lambda$0(this.f6310IO);
        }
    });

    @aa1
    private final Lazy mUserCardView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f02
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsRechargeActivity.mUserCardView_delegate$lambda$0(this.f6548IO);
        }
    });

    @aa1
    private List<PointsPack> mPointsPackList = new ArrayList();

    @aa1
    private String orderNum = "";

    @SourceDebugExtension({"SMAP\nPointsRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n87#2,7:310\n94#2,3:318\n70#2,7:321\n97#2:328\n1#3:317\n*S KotlinDebug\n*F\n+ 1 PointsRechargeActivity.kt\ncom/sma/smartv3/ui/order/PointsRechargeActivity$initView$1\n*L\n101#1:310,7\n101#1:318,3\n101#1:321,7\n101#1:328\n101#1:317\n*E\n"})
    public static final class OXO1 extends ClickableSpan {
        public OXO1() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.X0O(widget, "widget");
            PointsRechargeActivity pointsRechargeActivity = PointsRechargeActivity.this;
            String str = "https://api.iot-solution.net/web/cn/smart_time_pro/webs/points_agreement.html?lang=" + i72.OXO1.iOO1ii1(pointsRechargeActivity);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", str);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(pointsRechargeActivity, (Class<?>) WebViewActivity.class);
            intent.putExtras(bundle);
            pointsRechargeActivity.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint paint) {
            Intrinsics.X0O(paint, "paint");
            paint.setColor(-16776961);
            paint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.order.PointsRechargeActivity$initPointsPack$1, reason: case insensitive filesystem */
    public static final class C290161 extends CommonAdapter<PointsPack> {
        public C290161(List<PointsPack> list) {
            super(PointsRechargeActivity.this, R.layout.item_points_pack_select, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$1(C290161 c290161, PointsPack pointsPack, PointsRechargeActivity pointsRechargeActivity, View view) {
            Iterator it = ((CommonAdapter) c290161).mDatas.iterator();
            while (it.hasNext()) {
                ((PointsPack) it.next()).setSelect(false);
            }
            pointsPack.setSelect(true);
            pointsRechargeActivity.mSelectPointsPack = pointsPack;
            c290161.notifyDataSetChanged();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final PointsPack item, int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(item, "item");
            holder.getView(R.id.selectStatusAmount).setBackgroundDrawable(item.isSelect() ? gk4.XOO0ii0(PointsRechargeActivity.this, R.drawable.rectangular_background_select) : gk4.XOO0ii0(PointsRechargeActivity.this, R.drawable.rectangular_background));
            holder.getView(R.id.recommendStatus).setVisibility(item.getRecommend() ? 0 : 4);
            ((TextView) holder.getView(R.id.tv_pack_name)).setText(item.getPackName());
            TextView textView = (TextView) holder.getView(R.id.tv_original_amount);
            textView.setText("￥" + item.getOriginalAmount());
            textView.getPaint().setFlags(17);
            ((TextView) holder.getView(R.id.tv_amount)).setText("￥" + item.getAmount());
            View view = holder.getView(R.id.selectStatusAmount);
            final PointsRechargeActivity pointsRechargeActivity = PointsRechargeActivity.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.g02
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PointsRechargeActivity.C290161.convert$lambda$1(this.f6784IO, item, pointsRechargeActivity, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnRecharge_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (Button) pointsRechargeActivity.findViewById(R.id.btn_recharge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox cbPointsPrivacy_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (AppCompatCheckBox) pointsRechargeActivity.findViewById(R.id.cb_points_privacy);
    }

    private final Button getBtnRecharge() {
        return (Button) this.btnRecharge$delegate.getValue();
    }

    private final AppCompatCheckBox getCbPointsPrivacy() {
        return (AppCompatCheckBox) this.cbPointsPrivacy$delegate.getValue();
    }

    private final ImageView getIvAvatar() {
        return (ImageView) this.ivAvatar$delegate.getValue();
    }

    private final View getLayoutBg() {
        return (View) this.layoutBg$delegate.getValue();
    }

    private final CardView getMUserCardView() {
        return (CardView) this.mUserCardView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getOrderStatus$lambda$0(PointsRechargeActivity pointsRechargeActivity, boolean z) {
        if (z) {
            pointsRechargeActivity.showRechargePointPopup();
        } else {
            ToastUtils.showLong(R.string.pay_confirm_error);
        }
        return Unit.OXO1;
    }

    private final void getPayInfo() {
    }

    private final void getPointsPack() {
        i1O0OXO1O.OXO1.OXO1(this.TAG + " getPointsPack");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> pointsPackBody = RequestBodyKt.getPointsPackBody();
        final O1XIiIO<PointsPack[]> o1XIiIO = new O1XIiIO<PointsPack[]>() { // from class: com.sma.smartv3.ui.order.PointsRechargeActivity.getPointsPack.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(PointsPack[] pointsPackArr) {
                i1O0OXO1O.OXO1.OXO1(PointsRechargeActivity.this.TAG + " handleResponse -> " + pointsPackArr);
                if (pointsPackArr != null) {
                    PointsRechargeActivity.this.mPointsPackList.clear();
                    OIXO1IIOO.m878Oi(PointsRechargeActivity.this.mPointsPackList, pointsPackArr);
                    RecyclerView.Adapter adapter = PointsRechargeActivity.this.getRvPointsPack().getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(PointsRechargeActivity.this.TAG + " handleError -> " + error);
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetPointsPack.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetPointsPack.URL, pointsPackBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + GetPointsPack.URL;
        final O1XIiIO<Response<PointsPack[]>> o1XIiIO2 = new O1XIiIO<Response<PointsPack[]>>() { // from class: com.sma.smartv3.ui.order.PointsRechargeActivity$getPointsPack$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<PointsPack[]> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) pointsPackBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, PointsPack[].class), new ParsedRequestListener<Response<PointsPack[]>>() { // from class: com.sma.smartv3.ui.order.PointsRechargeActivity$getPointsPack$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<PointsPack[]> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRvPointsPack() {
        return (RecyclerView) this.rvPointsPack$delegate.getValue();
    }

    private final TextView getTvNickname() {
        return (TextView) this.tvNickname$delegate.getValue();
    }

    private final TextView getTvPoints() {
        return (TextView) this.tvPoints$delegate.getValue();
    }

    private final TextView getTvPointsPrivacy() {
        return (TextView) this.tvPointsPrivacy$delegate.getValue();
    }

    private final void initPointsPack() {
        getPointsPack();
        getRvPointsPack().setLayoutManager(new GridLayoutManager(this, 2));
        getRvPointsPack().setAdapter(new C290161(this.mPointsPackList));
    }

    private final void initUserPanel() throws IllegalAccessException, InstantiationException {
        TextView tvNickname = getTvNickname();
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        tvNickname.setText(((AppUser) appUser).getNickname());
        getIvAvatar().setImageDrawable(gk4.XOO0ii0(getIvAvatar().getContext(), R.drawable.pic_avatar_default));
        sz0 sz0Var = sz0.OXO1;
        if (uz0.OIi0(sz0Var).exists()) {
            getIvAvatar().setImageURI(Uri.fromFile(uz0.OIi0(sz0Var)));
        }
        showPoints();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PointsRechargeActivity pointsRechargeActivity, View view) {
        if (!pointsRechargeActivity.getCbPointsPrivacy().isChecked()) {
            ToastUtils.showLong(pointsRechargeActivity.getString(R.string.privacy_tick_tip_v2), new Object[0]);
        } else if (pointsRechargeActivity.mSelectPointsPack == null) {
            ToastUtils.showLong(pointsRechargeActivity.getString(R.string.select_recharge_tip), new Object[0]);
        } else {
            pointsRechargeActivity.getPayInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivAvatar_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (ImageView) pointsRechargeActivity.findViewById(R.id.iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View layoutBg_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return pointsRechargeActivity.findViewById(R.id.points_recharge_bg_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardView mUserCardView_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (CardView) pointsRechargeActivity.findViewById(R.id.btRecharge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return pointsRechargeActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvPointsPack_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (RecyclerView) pointsRechargeActivity.findViewById(R.id.rv_points_pack);
    }

    private final void showPayConfirm() {
        if (this.mPayconfirmPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.I0iXXO(false);
            go0Var.O1O(R.string.payment_completed_tip);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.yes_payment, new Function0() { // from class: com.android.mltcode.paycertificationapi.wz1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(PointsRechargeActivity.showPayConfirm$lambda$0$0(this.f12076IO));
                }
            });
            this.mPayconfirmPopup = go0Var;
        }
        go0 go0Var2 = this.mPayconfirmPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayConfirm$lambda$0$0(PointsRechargeActivity pointsRechargeActivity) {
        pointsRechargeActivity.getOrderStatus();
        return true;
    }

    private final void showPoints() throws IllegalAccessException, InstantiationException {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), (Class<Object>) AccountPoints.class);
        if (objFromJson == null) {
            objFromJson = AccountPoints.class.newInstance();
        }
        getTvPoints().setText(String.valueOf(((AccountPoints) objFromJson).getPoints()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNickname_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (TextView) pointsRechargeActivity.findViewById(R.id.tv_nickname);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPointsPrivacy_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (TextView) pointsRechargeActivity.findViewById(R.id.tv_points_privacy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPoints_delegate$lambda$0(PointsRechargeActivity pointsRechargeActivity) {
        return (TextView) pointsRechargeActivity.findViewById(R.id.tv_points);
    }

    @aa1
    public final String getOrderNum() {
        return this.orderNum;
    }

    public final void getOrderStatus() {
        OrderManager.OXO1.XX0(this.orderNum, "Points", new Function1() { // from class: com.android.mltcode.paycertificationapi.vz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsRechargeActivity.getOrderStatus$lambda$0(this.f11845IO, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.root_view));
        setNavBarColor(this, gk4.m1859iO(this, R.color.points_bg_color));
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.points_recharge);
        initUserPanel();
        initPointsPack();
        SpanUtils.with(getTvPointsPrivacy()).append(getString(R.string.points_privacy_tip1)).append(getString(R.string.points_privacy_tip2)).setClickSpan(new OXO1()).create();
        getBtnRecharge().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.uz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PointsRechargeActivity.initView$lambda$0(this.f11612IO, view);
            }
        });
        getLayoutBg().setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(this, R.color.points_bg_color)));
        getMUserCardView().setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(this, R.color.points_bg_color_secondary)));
    }

    public final boolean isNeedPayDialog() {
        return this.isNeedPayDialog;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_order_points_recharge;
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        this.isNeedPayDialog = false;
        go0 go0Var = this.mPayconfirmPopup;
        if (go0Var != null && go0Var != null) {
            go0Var.dismiss();
        }
        getOrderStatus();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isNeedPayDialog) {
            this.isNeedPayDialog = false;
            showPayConfirm();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @sf5(tag = I01XX0.iIi0)
    public final void onUserPointsChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onUserPointsChange");
        showPoints();
    }

    public final void setNeedPayDialog(boolean z) {
        this.isNeedPayDialog = z;
    }

    public final void setOrderNum(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.orderNum = str;
    }

    public final void showRechargePointPopup() {
        LogUtils.m11128d("onGetFreePoints");
        if (this.mRechargePointPopup == null) {
            OrderManager.OXO1.iIXi1iiXI(true);
            OIXX00X oixx00x = new OIXX00X(this, R.layout.pop_center_prompt_recharge_point);
            oixx00x.O1O(getString(R.string.recharge_points_arrived_tip));
            this.mRechargePointPopup = oixx00x;
        }
        OIXX00X oixx00x2 = this.mRechargePointPopup;
        if (oixx00x2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            oixx00x2.XiOIO(rootView);
        }
    }
}
