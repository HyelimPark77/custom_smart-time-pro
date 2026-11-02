package com.sma.smartv3.ui.sport;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c01;
import com.android.mltcode.paycertificationapi.d01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.v2fragment.MySportRecordFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MySportRecordActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy table$delegate;

    public MySportRecordActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new c01(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new d01(this));
    }

    public static /* synthetic */ TextView I0iXXO(MySportRecordActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TabLayout OIX0iXi(MySportRecordActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(MySportRecordActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    private static final TabLayout table_delegate$lambda$0(MySportRecordActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        MySportRecordFragment r1 = new MySportRecordFragment();
        r1.setMSportMode(9);
        r0.add(r1);
        MySportRecordFragment r2 = new MySportRecordFragment();
        r2.setMSportMode(10);
        r0.add(r2);
        MySportRecordFragment r3 = new MySportRecordFragment();
        r3.setMSportMode(11);
        r0.add(r3);
        MySportRecordFragment r4 = new MySportRecordFragment();
        r4.setMSportMode(13);
        r0.add(r4);
        return r0;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.sports_my_records));
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.workout9), getString(R.string.workout10), getString(R.string.workout11), getString(R.string.workout13)});
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_start_sport;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
