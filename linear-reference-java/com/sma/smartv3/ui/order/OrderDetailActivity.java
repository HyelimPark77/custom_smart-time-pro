package com.sma.smartv3.ui.order;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zi1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.order.fragment.DialOrderListFragment;
import com.sma.smartv3.ui.order.fragment.GameOrderListFragment;
import com.sma.smartv3.ui.order.fragment.IntegralOrderListFragment;
import com.sma.smartv3.ui.order.fragment.MemberOrderListFragment;
import com.sma.smartv3.ui.status.base.BaseDetailsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,86:1\n37#2,2:87\n*S KotlinDebug\n*F\n+ 1 OrderDetailActivity.kt\ncom/sma/smartv3/ui/order/OrderDetailActivity\n*L\n74#1:87,2\n*E\n"})
public final class OrderDetailActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy table$delegate;

    public OrderDetailActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new zi1(this));
    }

    public static /* synthetic */ TabLayout OIX0iXi(OrderDetailActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(OrderDetailActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        if (q62.OXO1.OiO() == true) goto L5;
        r0.add(new DialOrderListFragment());
    L5:
        i72 r1 = i72.OXO1;
        if (r1.iIi0() == true) goto L13;
        if (r1.IOX1() == false) goto L10;
        BaseDetailsFragment r2 = new MemberOrderListFragment();
    L11:
        r0.add(r2);
        goto L13
    L10:
        r2 = new IntegralOrderListFragment();
    L13:
        if (r1.iIIIi() == false) goto L16;
        r0.add(new GameOrderListFragment());
    L16:
        return CollectionsKt___CollectionsKt.i0I0O111I(r0);
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.user_order);
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        ArrayList r0 = new ArrayList();
        if (q62.OXO1.OiO() == true) goto L5;
        String r1 = getString(R.string.dial_order);
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        r0.add(r1);
    L5:
        i72 r2 = i72.OXO1;
        if (r2.iIi0() == true) goto L13;
        if (r2.IOX1() == false) goto L10;
        String r3 = getString(R.string.ai_package_order);
    L11:
        Intrinsics.XXI(r3);
        r0.add(r3);
        goto L13
    L10:
        r3 = getString(R.string.integral_order);
    L13:
        if (r2.iIIIi() == false) goto L15;
        String r4 = getString(R.string.game_order);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        r0.add(r4);
    L15:
        getMFragmentPagerAdapter().setTitles((CharSequence[]) r0.toArray(new String[0]));
        if (r0.size() > 1) goto L18;
        getTable().setVisibility(8);
    L18:
        getTable().setupWithViewPager(getMViewPager());
        getMViewPager().setCurrentItem(1);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_order_detail;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
