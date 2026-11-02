package com.sma.smartv3.p610ui.status.base;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.p610ui.status.base.StatusBaseActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StatusBaseActivity extends BaseFragmentPagerActivity {
    public BaseStatusFragment dayFragment;
    public BaseStatusFragment monthFragment;
    public BaseStatusFragment weeFragment;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseActivity.table_delegate$lambda$0(this.f12131IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseActivity.abhTitleCenter_delegate$lambda$0(this.f12333IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z85
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseActivity.abhTitleRight_delegate$lambda$0(this.f12559IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StatusBaseActivity.abhTitleOtherRight_delegate$lambda$0(this.f5448IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(StatusBaseActivity statusBaseActivity) {
        return (PFMedium) statusBaseActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(StatusBaseActivity statusBaseActivity) {
        return (ImageView) statusBaseActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(StatusBaseActivity statusBaseActivity) {
        return (ImageView) statusBaseActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(StatusBaseActivity statusBaseActivity) {
        return (TabLayout) statusBaseActivity.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @aa1
    public final BaseStatusFragment getDayFragment() {
        BaseStatusFragment baseStatusFragment = this.dayFragment;
        if (baseStatusFragment != null) {
            return baseStatusFragment;
        }
        Intrinsics.XXO("dayFragment");
        return null;
    }

    @aa1
    public final BaseStatusFragment getMonthFragment() {
        BaseStatusFragment baseStatusFragment = this.monthFragment;
        if (baseStatusFragment != null) {
            return baseStatusFragment;
        }
        Intrinsics.XXO("monthFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @aa1
    public final BaseStatusFragment getWeeFragment() {
        BaseStatusFragment baseStatusFragment = this.weeFragment;
        if (baseStatusFragment != null) {
            return baseStatusFragment;
        }
        Intrinsics.XXO("weeFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        initFragment();
    }

    public abstract void initFragment();

    @aa1
    public List<Fragment> initFragments() {
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_calendar_normal);
        return CollectionsKt__CollectionsKt.iXiX011(getDayFragment(), getWeeFragment(), getMonthFragment());
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTable().setBackgroundColor(gk4.m1859iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.day), getString(R.string.week), getString(R.string.month)});
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        getTable().setupWithViewPager(getMViewPager());
    }

    public int layoutId() {
        return R.layout.activity_status_info;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.dayFragment != null && getDayFragment().getUserVisibleHint()) {
            getDayFragment().share();
            return;
        }
        if (this.weeFragment != null && getWeeFragment().getUserVisibleHint()) {
            getWeeFragment().share();
        } else {
            if (this.monthFragment == null || !getMonthFragment().getUserVisibleHint()) {
                return;
            }
            getMonthFragment().share();
        }
    }

    public void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (getDayFragment().getUserVisibleHint()) {
            getDayFragment().showCalendarPopop();
        } else if (getWeeFragment().getUserVisibleHint()) {
            getWeeFragment().showCalendarPopop();
        } else if (getMonthFragment().getUserVisibleHint()) {
            getMonthFragment().showCalendarPopop();
        }
    }

    public final void setDayFragment(@aa1 BaseStatusFragment baseStatusFragment) {
        Intrinsics.X0O(baseStatusFragment, "<set-?>");
        this.dayFragment = baseStatusFragment;
    }

    public final void setMonthFragment(@aa1 BaseStatusFragment baseStatusFragment) {
        Intrinsics.X0O(baseStatusFragment, "<set-?>");
        this.monthFragment = baseStatusFragment;
    }

    @aa1
    public abstract String setTitle();

    public final void setWeeFragment(@aa1 BaseStatusFragment baseStatusFragment) {
        Intrinsics.X0O(baseStatusFragment, "<set-?>");
        this.weeFragment = baseStatusFragment;
    }
}
