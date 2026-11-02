package com.sma.smartv3.p610ui.status;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.status.SportRecordsV3Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportRecordsV3Activity extends BaseFragmentPagerActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    public static final String TAG = "SportRecordsActivity";
    public SportRecordsV3Fragment mRecordsAllV3Fragment;
    public SportRecordsV3Fragment mRecordsMonthV3Fragment;
    public SportRecordsV3Fragment mRecordsWeekV3Fragment;
    public SportRecordsV3Fragment mRecordsYearV3Fragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m45
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsV3Activity.table_delegate$lambda$0(this.f9622IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n45
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportRecordsV3Activity.abhTitleCenter_delegate$lambda$0(this.f9847IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(SportRecordsV3Activity sportRecordsV3Activity) {
        return (PFMedium) sportRecordsV3Activity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(SportRecordsV3Activity sportRecordsV3Activity) {
        return (TabLayout) sportRecordsV3Activity.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsAllV3Fragment() {
        SportRecordsV3Fragment sportRecordsV3Fragment = this.mRecordsAllV3Fragment;
        if (sportRecordsV3Fragment != null) {
            return sportRecordsV3Fragment;
        }
        Intrinsics.XXO("mRecordsAllV3Fragment");
        return null;
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsMonthV3Fragment() {
        SportRecordsV3Fragment sportRecordsV3Fragment = this.mRecordsMonthV3Fragment;
        if (sportRecordsV3Fragment != null) {
            return sportRecordsV3Fragment;
        }
        Intrinsics.XXO("mRecordsMonthV3Fragment");
        return null;
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsWeekV3Fragment() {
        SportRecordsV3Fragment sportRecordsV3Fragment = this.mRecordsWeekV3Fragment;
        if (sportRecordsV3Fragment != null) {
            return sportRecordsV3Fragment;
        }
        Intrinsics.XXO("mRecordsWeekV3Fragment");
        return null;
    }

    @aa1
    public final SportRecordsV3Fragment getMRecordsYearV3Fragment() {
        SportRecordsV3Fragment sportRecordsV3Fragment = this.mRecordsYearV3Fragment;
        if (sportRecordsV3Fragment != null) {
            return sportRecordsV3Fragment;
        }
        Intrinsics.XXO("mRecordsYearV3Fragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        SportRecordsV3Fragment sportRecordsV3Fragment = new SportRecordsV3Fragment();
        sportRecordsV3Fragment.setMTimePeriod(TimePeriod.WEEK);
        setMRecordsWeekV3Fragment(sportRecordsV3Fragment);
        SportRecordsV3Fragment sportRecordsV3Fragment2 = new SportRecordsV3Fragment();
        sportRecordsV3Fragment2.setMTimePeriod(TimePeriod.MONTH);
        setMRecordsMonthV3Fragment(sportRecordsV3Fragment2);
        SportRecordsV3Fragment sportRecordsV3Fragment3 = new SportRecordsV3Fragment();
        sportRecordsV3Fragment3.setMTimePeriod(TimePeriod.YEAR);
        setMRecordsYearV3Fragment(sportRecordsV3Fragment3);
        SportRecordsV3Fragment sportRecordsV3Fragment4 = new SportRecordsV3Fragment();
        sportRecordsV3Fragment4.setMTimePeriod(TimePeriod.ALL);
        setMRecordsAllV3Fragment(sportRecordsV3Fragment4);
        if (getMArg1() > -1) {
            SportRecordsV3Fragment mRecordsWeekV3Fragment = getMRecordsWeekV3Fragment();
            Bundle bundle = new Bundle();
            bundle.putInt("mArg1", getMArg1());
            mRecordsWeekV3Fragment.setArguments(bundle);
            SportRecordsV3Fragment mRecordsMonthV3Fragment = getMRecordsMonthV3Fragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("mArg1", getMArg1());
            mRecordsMonthV3Fragment.setArguments(bundle2);
            SportRecordsV3Fragment mRecordsYearV3Fragment = getMRecordsYearV3Fragment();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("mArg1", getMArg1());
            mRecordsYearV3Fragment.setArguments(bundle3);
            SportRecordsV3Fragment mRecordsAllV3Fragment = getMRecordsAllV3Fragment();
            Bundle bundle4 = new Bundle();
            bundle4.putInt("mArg1", getMArg1());
            mRecordsAllV3Fragment.setArguments(bundle4);
        }
        return CollectionsKt__CollectionsKt.iXiX011(getMRecordsWeekV3Fragment(), getMRecordsMonthV3Fragment(), getMRecordsYearV3Fragment(), getMRecordsAllV3Fragment());
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(setTitle());
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.transparent));
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.week), getString(R.string.month), getString(R.string.year), getString(R.string.all)});
        getAbhTitleCenter().setText(setTitle());
        getTable().setupWithViewPager(getMViewPager());
        TabLayout.Tab tabAt = getTable().getTabAt(3);
        if (tabAt != null) {
            tabAt.select();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_records_v3_list;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void setMRecordsAllV3Fragment(@aa1 SportRecordsV3Fragment sportRecordsV3Fragment) {
        Intrinsics.X0O(sportRecordsV3Fragment, "<set-?>");
        this.mRecordsAllV3Fragment = sportRecordsV3Fragment;
    }

    public final void setMRecordsMonthV3Fragment(@aa1 SportRecordsV3Fragment sportRecordsV3Fragment) {
        Intrinsics.X0O(sportRecordsV3Fragment, "<set-?>");
        this.mRecordsMonthV3Fragment = sportRecordsV3Fragment;
    }

    public final void setMRecordsWeekV3Fragment(@aa1 SportRecordsV3Fragment sportRecordsV3Fragment) {
        Intrinsics.X0O(sportRecordsV3Fragment, "<set-?>");
        this.mRecordsWeekV3Fragment = sportRecordsV3Fragment;
    }

    public final void setMRecordsYearV3Fragment(@aa1 SportRecordsV3Fragment sportRecordsV3Fragment) {
        Intrinsics.X0O(sportRecordsV3Fragment, "<set-?>");
        this.mRecordsYearV3Fragment = sportRecordsV3Fragment;
    }

    @aa1
    public final String setTitle() {
        if (getMArg1() > -1) {
            String string = getString(R.string.game_record);
            Intrinsics.XXI(string);
            return string;
        }
        String string2 = getString(R.string.sports_record);
        Intrinsics.XXI(string2);
        return string2;
    }
}
