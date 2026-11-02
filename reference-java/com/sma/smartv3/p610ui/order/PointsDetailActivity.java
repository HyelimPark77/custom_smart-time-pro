package com.sma.smartv3.p610ui.order;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountIntegralData;
import com.sma.smartv3.model.AccountPoints;
import com.sma.smartv3.model.IntegralContentData;
import com.sma.smartv3.p610ui.order.PointsDetailActivity;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPointsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointsDetailActivity.kt\ncom/sma/smartv3/ui/order/PointsDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n93#2,2:185\n90#2:187\n90#2:209\n1869#3,2:188\n87#4,7:190\n94#4,3:198\n70#4,7:201\n97#4:208\n1#5:197\n*S KotlinDebug\n*F\n+ 1 PointsDetailActivity.kt\ncom/sma/smartv3/ui/order/PointsDetailActivity\n*L\n97#1:185,2\n97#1:187\n113#1:209\n147#1:188,2\n70#1:190,7\n70#1:198,3\n70#1:201,7\n70#1:208\n70#1:197\n*E\n"})
public final class PointsDetailActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG = "PointsDetail";
    private int pageNum = 1;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsDetailActivity.rootView_delegate$lambda$0(this.f9818IO);
        }
    });

    @aa1
    private final Lazy layoutBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsDetailActivity.layoutBg_delegate$lambda$0(this.f10044IO);
        }
    });

    @aa1
    private final Lazy tvPoints$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsDetailActivity.tvPoints_delegate$lambda$0(this.f10255IO);
        }
    });

    @aa1
    private final Lazy btnRecharge$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsDetailActivity.btnRecharge_delegate$lambda$0(this.f10469IO);
        }
    });

    @aa1
    private final Lazy titleBg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qz1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PointsDetailActivity.titleBg_delegate$lambda$0(this.f10714IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnRecharge_delegate$lambda$0(PointsDetailActivity pointsDetailActivity) {
        return (Button) pointsDetailActivity.findViewById(R.id.btn_recharge);
    }

    private final Button getBtnRecharge() {
        return (Button) this.btnRecharge$delegate.getValue();
    }

    private final View getLayoutBg() {
        return (View) this.layoutBg$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final View getTitleBg() {
        return (View) this.titleBg$delegate.getValue();
    }

    private final TextView getTvPoints() {
        return (TextView) this.tvPoints$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(PointsDetailActivity pointsDetailActivity, View view) {
        String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strX11iII1O1);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(pointsDetailActivity, (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        pointsDetailActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View layoutBg_delegate$lambda$0(PointsDetailActivity pointsDetailActivity) {
        return pointsDetailActivity.findViewById(R.id.points_recharge_bg_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInitBaseLayoutAfter$lambda$0(PointsDetailActivity pointsDetailActivity, AccountIntegralData accountIntegralData) {
        pointsDetailActivity.renderRecyclerAdapter();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRecyclerAdapter$lambda$0(final PointsDetailActivity pointsDetailActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 2, null, 2, null);
        renderAdapter.getDslAdapterStatusItem().getItemStateLayoutMap().put(1, Integer.valueOf(R.layout.layout_sport_empty_v2));
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        AccountIntegralData accountIntegralData = (AccountIntegralData) new Gson().fromJson(sPUtilsIiI10X.getString(b01.XIO11I + '_' + AccountIntegralData.class.getName()), AccountIntegralData.class);
        if (accountIntegralData == null || accountIntegralData.getContent().isEmpty()) {
            DslAdapter.setAdapterStatus$default(pointsDetailActivity.getDslAdapter(), 1, null, 2, null);
        } else {
            pointsDetailActivity.showData(renderAdapter, accountIntegralData);
            renderAdapter.setLoadMoreEnable(true);
        }
        renderAdapter.getDslLoadMoreItem().setOnLoadMore(new Function1() { // from class: com.android.mltcode.paycertificationapi.fz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsDetailActivity.renderRecyclerAdapter$lambda$0$0(this.f6773IO, (DslViewHolder) obj);
            }
        });
        DslAdapter.render$default(renderAdapter, false, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.kz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsDetailActivity.renderRecyclerAdapter$lambda$0$1((DslAdapter) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRecyclerAdapter$lambda$0$0(final PointsDetailActivity pointsDetailActivity, DslViewHolder it) {
        Intrinsics.X0O(it, "it");
        pointsDetailActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.rz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsDetailActivity.renderRecyclerAdapter$lambda$0$0$0(this.f10935IO, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRecyclerAdapter$lambda$0$0$0(final PointsDetailActivity pointsDetailActivity, final DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        int i = pointsDetailActivity.pageNum + 1;
        pointsDetailActivity.pageNum = i;
        OrderManager.OXO1.I0IIOi(i, new Function1() { // from class: com.android.mltcode.paycertificationapi.gz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsDetailActivity.renderRecyclerAdapter$lambda$0$0$0$0(this.f6999IO, renderAdapter, (AccountIntegralData) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRecyclerAdapter$lambda$0$0$0$0(PointsDetailActivity pointsDetailActivity, DslAdapter dslAdapter, AccountIntegralData accountIntegralData) {
        if (accountIntegralData == null || accountIntegralData.getContent() == null || accountIntegralData.getContent().isEmpty()) {
            DslAdapter.setLoadMore$default(dslAdapter, 2, null, false, 6, null);
        } else {
            pointsDetailActivity.showData(dslAdapter, accountIntegralData);
            DslAdapter.setLoadMore$default(dslAdapter, 0, null, false, 6, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRecyclerAdapter$lambda$0$1(DslAdapter render) {
        Intrinsics.X0O(render, "$this$render");
        DslAdapter.setAdapterStatus$default(render, 0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(PointsDetailActivity pointsDetailActivity) {
        return pointsDetailActivity.findViewById(R.id.root_view);
    }

    private final void showData(DslAdapter dslAdapter, AccountIntegralData accountIntegralData) {
        if (accountIntegralData.getContent() == null) {
            LogUtils.m11129e("integralData.content == null");
            return;
        }
        LogUtils.m11128d("integralData.content == " + accountIntegralData.getContent().size());
        for (final IntegralContentData integralContentData : accountIntegralData.getContent()) {
            DslAdapterExKt.O10IXXX0X(dslAdapter, R.layout.item_points_detail, new Function1() { // from class: com.android.mltcode.paycertificationapi.lz1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PointsDetailActivity.showData$lambda$0$0(integralContentData, (DslAdapterItem) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0(final IntegralContentData integralContentData, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iz1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PointsDetailActivity.showData$lambda$0$0$0(integralContentData, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$0$0(IntegralContentData integralContentData, DslViewHolder holder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = holder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(integralContentData.getRecordItem());
        }
        TextView textViewM3482tv2 = holder.m3482tv(R.id.tv_date);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(integralContentData.getCreatedAt());
        }
        TextView textViewM3482tv3 = holder.m3482tv(R.id.tv_points_change);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(integralContentData.getPointsChange());
            textViewM3482tv3.setTextColor(integralContentData.getChangeFlag() == 0 ? gk4.m1859iO(textViewM3482tv3.getContext(), R.color.order_text_orange) : gk4.m1859iO(textViewM3482tv3.getContext(), R.color.line_color));
        }
        View viewM3483v = holder.m3483v(R.id.item_points_detail_layout);
        if (viewM3483v != null) {
            viewM3483v.setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(viewM3483v.getContext(), R.color.points_three_bg_color)));
        }
        return Unit.OXO1;
    }

    private final void showPoints() throws IllegalAccessException, InstantiationException {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.iIi0 + '_' + AccountPoints.class.getName()), (Class<Object>) AccountPoints.class);
        if (objFromJson == null) {
            objFromJson = AccountPoints.class.newInstance();
        }
        getTvPoints().setText(cp5.X1IX(((AccountPoints) objFromJson).getPoints(), false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View titleBg_delegate$lambda$0(PointsDetailActivity pointsDetailActivity) {
        return pointsDetailActivity.findViewById(R.id.order_points_detail_title_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPoints_delegate$lambda$0(PointsDetailActivity pointsDetailActivity) {
        return (TextView) pointsDetailActivity.findViewById(R.id.tv_points);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        transparentStatusBar();
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.root_view));
        setNavBarColor(this, gk4.m1859iO(this, R.color.points_bg_color));
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.points_detail);
        getBtnRecharge().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.jz1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PointsDetailActivity.initView$lambda$0(this.f9075IO, view);
            }
        });
        showPoints();
        getTitleBg().setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(this, R.color.points_three_bg_color)));
        getBtnRecharge().setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(this, R.color.order_points_detail_btn_bg)));
        getLayoutBg().setBackgroundTintList(ColorStateList.valueOf(gk4.m1859iO(this, R.color.points_bg_color)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_order_points_detail;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        OrderManager.OXO1.I0IIOi(this.pageNum, new Function1() { // from class: com.android.mltcode.paycertificationapi.hz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsDetailActivity.onInitBaseLayoutAfter$lambda$0(this.f7244IO, (AccountIntegralData) obj);
            }
        });
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

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv_points_detail;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void renderRecyclerAdapter() {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.sz1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PointsDetailActivity.renderRecyclerAdapter$lambda$0(this.f11159IO, (DslAdapter) obj);
            }
        });
    }
}
