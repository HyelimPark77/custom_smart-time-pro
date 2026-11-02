package com.sma.smartv3.ui.status;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.m45;
import com.android.mltcode.paycertificationapi.n45;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportRecordsV3Activity extends BaseFragmentPagerActivity {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    public static final String TAG = "SportRecordsActivity";

    @aa1
    private final Lazy abhTitleCenter$delegate;
    public SportRecordsV3Fragment mRecordsAllV3Fragment;
    public SportRecordsV3Fragment mRecordsMonthV3Fragment;
    public SportRecordsV3Fragment mRecordsWeekV3Fragment;
    public SportRecordsV3Fragment mRecordsYearV3Fragment;

    @aa1
    private final Lazy table$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public SportRecordsV3Activity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new m45(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new n45(this));
    }

    public static /* synthetic */ TabLayout I0iXXO(SportRecordsV3Activity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(SportRecordsV3Activity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(SportRecordsV3Activity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final TabLayout table_delegate$lambda$0(SportRecordsV3Activity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsAllV3Fragment() {
        SportRecordsV3Fragment r0 = this.mRecordsAllV3Fragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRecordsAllV3Fragment");
        return null;
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsMonthV3Fragment() {
        SportRecordsV3Fragment r0 = this.mRecordsMonthV3Fragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRecordsMonthV3Fragment");
        return null;
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsWeekV3Fragment() {
        SportRecordsV3Fragment r0 = this.mRecordsWeekV3Fragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRecordsWeekV3Fragment");
        return null;
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsYearV3Fragment() {
        SportRecordsV3Fragment r0 = this.mRecordsYearV3Fragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mRecordsYearV3Fragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        SportRecordsV3Fragment r0 = new SportRecordsV3Fragment();
        r0.setMTimePeriod(TimePeriod.WEEK);
        setMRecordsWeekV3Fragment(r0);
        SportRecordsV3Fragment r1 = new SportRecordsV3Fragment();
        r1.setMTimePeriod(TimePeriod.MONTH);
        setMRecordsMonthV3Fragment(r1);
        SportRecordsV3Fragment r2 = new SportRecordsV3Fragment();
        r2.setMTimePeriod(TimePeriod.YEAR);
        setMRecordsYearV3Fragment(r2);
        SportRecordsV3Fragment r3 = new SportRecordsV3Fragment();
        r3.setMTimePeriod(TimePeriod.ALL);
        setMRecordsAllV3Fragment(r3);
        if (getMArg1() <= (-1)) goto L6;
        SportRecordsV3Fragment r4 = getMRecordsWeekV3Fragment();
        Bundle r5 = new Bundle();
        r5.putInt("mArg1", getMArg1());
        r4.setArguments(r5);
        SportRecordsV3Fragment r6 = getMRecordsMonthV3Fragment();
        Bundle r7 = new Bundle();
        r7.putInt("mArg1", getMArg1());
        r6.setArguments(r7);
        SportRecordsV3Fragment r8 = getMRecordsYearV3Fragment();
        Bundle r9 = new Bundle();
        r9.putInt("mArg1", getMArg1());
        r8.setArguments(r9);
        SportRecordsV3Fragment r10 = getMRecordsAllV3Fragment();
        Bundle r11 = new Bundle();
        r11.putInt("mArg1", getMArg1());
        r10.setArguments(r11);
    L6:
        return CollectionsKt__CollectionsKt.iXiX011(new Fragment[]{getMRecordsWeekV3Fragment(), getMRecordsMonthV3Fragment(), getMRecordsYearV3Fragment(), getMRecordsAllV3Fragment()});
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(setTitle());
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.transparent));
        String[] r0 = {getString(R.string.week), getString(R.string.month), getString(R.string.year), getString(R.string.all)};
        getMFragmentPagerAdapter().setTitles(r0);
        getAbhTitleCenter().setText(setTitle());
        getTable().setupWithViewPager(getMViewPager());
        TabLayout.Tab r1 = getTable().getTabAt(3);
        if (r1 == null) goto L6;
        r1.select();
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_records_v3_list;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void setMRecordsAllV3Fragment(@aa1 SportRecordsV3Fragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecordsAllV3Fragment = r2;
    }

    public final void setMRecordsMonthV3Fragment(@aa1 SportRecordsV3Fragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecordsMonthV3Fragment = r2;
    }

    public final void setMRecordsWeekV3Fragment(@aa1 SportRecordsV3Fragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecordsWeekV3Fragment = r2;
    }

    public final void setMRecordsYearV3Fragment(@aa1 SportRecordsV3Fragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRecordsYearV3Fragment = r2;
    }

    @aa1
    public final String setTitle() {
        if (getMArg1() <= (-1)) goto L6;
        String r0 = getString(R.string.game_record);
        Intrinsics.XXI(r0);
        return r0;
    L6:
        String r1 = getString(R.string.sports_record);
        Intrinsics.XXI(r1);
        return r1;
    }
}
