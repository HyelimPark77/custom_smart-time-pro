package com.sma.smartv3.p610ui.sport;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.sport.MySportRecordActivity;
import com.sma.smartv3.p610ui.sport.v2fragment.MySportRecordFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MySportRecordActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MySportRecordActivity.table_delegate$lambda$0(this.f5867IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MySportRecordActivity.abhTitleCenter_delegate$lambda$0(this.f6097IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(MySportRecordActivity mySportRecordActivity) {
        return (TextView) mySportRecordActivity.findViewById(R.id.abh_title_center);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(MySportRecordActivity mySportRecordActivity) {
        return (TabLayout) mySportRecordActivity.findViewById(R.id.table);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList arrayList = new ArrayList();
        MySportRecordFragment mySportRecordFragment = new MySportRecordFragment();
        mySportRecordFragment.setMSportMode(9);
        arrayList.add(mySportRecordFragment);
        MySportRecordFragment mySportRecordFragment2 = new MySportRecordFragment();
        mySportRecordFragment2.setMSportMode(10);
        arrayList.add(mySportRecordFragment2);
        MySportRecordFragment mySportRecordFragment3 = new MySportRecordFragment();
        mySportRecordFragment3.setMSportMode(11);
        arrayList.add(mySportRecordFragment3);
        MySportRecordFragment mySportRecordFragment4 = new MySportRecordFragment();
        mySportRecordFragment4.setMSportMode(13);
        arrayList.add(mySportRecordFragment4);
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.sports_my_records));
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.workout9), getString(R.string.workout10), getString(R.string.workout11), getString(R.string.workout13)});
        getTable().setupWithViewPager(getMViewPager());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_start_sport;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
