package com.sma.smartv3.p610ui.order;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.order.OrderDetailActivity;
import com.sma.smartv3.p610ui.order.fragment.DialOrderListFragment;
import com.sma.smartv3.p610ui.order.fragment.GameOrderListFragment;
import com.sma.smartv3.p610ui.order.fragment.IntegralOrderListFragment;
import com.sma.smartv3.p610ui.order.fragment.MemberOrderListFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,86:1\n37#2,2:87\n*S KotlinDebug\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n*L\n74#1:87,2\n*E\n"})
public final class OrderDetailActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return OrderDetailActivity.table_delegate$lambda$0(this.f12624IO);
        }
    });

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(OrderDetailActivity orderDetailActivity) {
        return (TabLayout) orderDetailActivity.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList arrayList = new ArrayList();
        if (!q62.OXO1.OiO()) {
            arrayList.add(new DialOrderListFragment());
        }
        i72 i72Var = i72.OXO1;
        if (!i72Var.iIi0()) {
            arrayList.add(i72Var.IOX1() ? new MemberOrderListFragment() : new IntegralOrderListFragment());
        }
        if (i72Var.iIIIi()) {
            arrayList.add(new GameOrderListFragment());
        }
        return CollectionsKt___CollectionsKt.i0I0O111I(arrayList);
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.user_order);
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        ArrayList arrayList = new ArrayList();
        if (!q62.OXO1.OiO()) {
            String string = getString(R.string.dial_order);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            arrayList.add(string);
        }
        i72 i72Var = i72.OXO1;
        if (!i72Var.iIi0()) {
            String string2 = i72Var.IOX1() ? getString(R.string.ai_package_order) : getString(R.string.integral_order);
            Intrinsics.XXI(string2);
            arrayList.add(string2);
        }
        if (i72Var.iIIIi()) {
            String string3 = getString(R.string.game_order);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            arrayList.add(string3);
        }
        getMFragmentPagerAdapter().setTitles((CharSequence[]) arrayList.toArray(new String[0]));
        if (arrayList.size() <= 1) {
            getTable().setVisibility(8);
        }
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().setCurrentItem(1);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_order_detail;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
