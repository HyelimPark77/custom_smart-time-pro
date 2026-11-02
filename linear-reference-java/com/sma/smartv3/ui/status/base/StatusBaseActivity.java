package com.sma.smartv3.ui.status.base;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.a95;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.x85;
import com.android.mltcode.paycertificationapi.y85;
import com.android.mltcode.paycertificationapi.z85;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StatusBaseActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    public BaseStatusFragment dayFragment;
    public BaseStatusFragment monthFragment;

    @aa1
    private final Lazy table$delegate;
    public BaseStatusFragment weeFragment;

    public StatusBaseActivity() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new x85(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new y85(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new z85(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new a95(this));
    }

    public static /* synthetic */ TabLayout I0iXXO(StatusBaseActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(StatusBaseActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium X1ii(StatusBaseActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(StatusBaseActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(StatusBaseActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(StatusBaseActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(StatusBaseActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final TabLayout table_delegate$lambda$0(StatusBaseActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final BaseStatusFragment getDayFragment() {
        BaseStatusFragment r0 = this.dayFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("dayFragment");
        return null;
    }

    @aa1
    public final BaseStatusFragment getMonthFragment() {
        BaseStatusFragment r0 = this.monthFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("monthFragment");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @aa1
    public final BaseStatusFragment getWeeFragment() {
        BaseStatusFragment r0 = this.weeFragment;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("weeFragment");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        initFragment();
    }

    public abstract void initFragment();

    @aa1
    public List<Fragment> initFragments() {
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.icon_calendar_normal);
        return CollectionsKt__CollectionsKt.iXiX011(new Fragment[]{getDayFragment(), getWeeFragment(), getMonthFragment()});
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTable().setBackgroundColor(gk4.iO(getMContext(), R.color.view_page_tablayout_bg));
        getMFragmentPagerAdapter().setTitles(new String[]{getString(R.string.day), getString(R.string.week), getString(R.string.month)});
        getAbhTitleCenter().setText(setTitle());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_share);
        getTable().setupWithViewPager(getMViewPager());
    }

    public int layoutId() {
        return R.layout.activity_status_info;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (this.dayFragment == null) goto L9;
        if (getDayFragment().getUserVisibleHint() == false) goto L9;
        getDayFragment().share();
        return;
    L9:
        if (this.weeFragment == null) goto L15;
        if (getWeeFragment().getUserVisibleHint() == false) goto L15;
        getWeeFragment().share();
        return;
    L15:
        if (this.monthFragment != null) goto L17;
        return;
    L17:
        if (getMonthFragment().getUserVisibleHint() == false) goto L21;
        getMonthFragment().share();
        return;
    }

    public void onTitleRightOtherClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        if (getDayFragment().getUserVisibleHint() == false) goto L7;
        getDayFragment().showCalendarPopop();
        return;
    L7:
        if (getWeeFragment().getUserVisibleHint() == false) goto L11;
        getWeeFragment().showCalendarPopop();
        return;
    L11:
        if (getMonthFragment().getUserVisibleHint() == false) goto L14;
        getMonthFragment().showCalendarPopop();
        return;
    }

    public final void setDayFragment(@aa1 BaseStatusFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dayFragment = r2;
    }

    public final void setMonthFragment(@aa1 BaseStatusFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.monthFragment = r2;
    }

    @aa1
    public abstract String setTitle();

    public final void setWeeFragment(@aa1 BaseStatusFragment r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weeFragment = r2;
    }
}
