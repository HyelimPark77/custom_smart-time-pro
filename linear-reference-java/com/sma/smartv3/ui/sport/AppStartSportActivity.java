package com.sma.smartv3.ui.sport;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.IIIiiIIO;
import com.android.mltcode.paycertificationapi.O10i0i;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.v2fragment.AppGpsStartSportFragment;
import com.sma.smartv3.ui.sport.v2fragment.AppNoGpsStartSportFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAppStartSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n13805#2,2:119\n37#3,2:121\n*S KotlinDebug\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n*L\n67#1:119,2\n97#1:121,2\n*E\n"})
public final class AppStartSportActivity extends BaseFragmentPagerActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private int curMode;
    public List<Integer> mTableList;

    @aa1
    private final Lazy table$delegate;

    public AppStartSportActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new O10i0i(this));
        this.table$delegate = LazyKt__LazyJVMKt.iO(new IIIiiIIO(this));
        this.curMode = 10;
    }

    public static /* synthetic */ TabLayout I0iXXO(AppStartSportActivity r0) {
        return table_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(AppStartSportActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(AppStartSportActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    private final Fragment getFragment(int r2) {
        if (a15.iO(r2) == false) goto L7;
        return AppGpsStartSportFragment.Companion.OXO1(r2);
    L7:
        return AppNoGpsStartSportFragment.Companion.OXO1(r2);
    }

    private static final TabLayout table_delegate$lambda$0(AppStartSportActivity r1) {
        return (TabLayout) r1.findViewById(R.id.table);
    }

    public final int getCurMode() {
        return this.curMode;
    }

    @aa1
    public final List<Integer> getMTableList() {
        List<Integer> r0 = this.mTableList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mTableList");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @aa1
    public final String[] getTiTle() {
        ArrayList r0 = new ArrayList();
        Iterator<Integer> r1 = getMTableList().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        int r2 = r1.next().intValue();
        Activity r3 = getMContext();
        SportRecordData r4 = new SportRecordData();
        r4.setMMode(r2);
        Unit r5 = Unit.OXO1;
        r0.add(getString(SportRecordDataKt.getWorkoutName(r3, r4)));
        goto L4
    L7:
        if (getMTableList().contains(Integer.valueOf(this.curMode)) == true) goto L10;
        Activity r6 = getMContext();
        SportRecordData r7 = new SportRecordData();
        r7.setMMode(this.curMode);
        Unit r8 = Unit.OXO1;
        r0.add(getString(SportRecordDataKt.getWorkoutName(r6, r7)));
    L10:
        return (String[]) r0.toArray(new String[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        this.curMode = getMArg1();
        setMTableList(a15.XIi00iiXO());
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        Iterator<Integer> r1 = getMTableList().iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        r0.add(getFragment(r1.next().intValue()));
        goto L4
    L7:
        if (getMTableList().contains(Integer.valueOf(this.curMode)) == true) goto L9;
        r0.add(getFragment(this.curMode));
    L9:
        return r0;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.bottom_sport));
        getTable().setBackgroundColor(gk4.iO(this, R.color.view_page_tablayout_bg));
        TabLayout r0 = getTable();
        if (i72.OXO1.Xi() == false) goto L5;
        int r1 = 2;
    L6:
        r0.setTabMode(r1);
        String[] r2 = getTiTle();
        getMFragmentPagerAdapter().setTitles(r2);
        getTable().setupWithViewPager(getMViewPager());
        getTable().removeAllTabs();
        int r3 = r2.length;
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L9;
        String r5 = r2[r4];
        TabLayout.Tab r6 = getTable().newTab();
        Intrinsics.O10IXXX0X(r6, "newTab(...)");
        View r7 = LayoutInflater.from(getTable().getContext()).inflate(R.layout.tab_item_text, null);
        ((TextView) r7.findViewById(R.id.tv_title)).setText(r5);
        r6.setCustomView(r7);
        getTable().addTab(r6);
        r4 = r4 + 1;
        goto L7
    L9:
        getTable().setTabMode(0);
        if (getMTableList().contains(Integer.valueOf(this.curMode)) == true) goto L13;
        getMViewPager().setCurrentItem(getMTableList().size());
        return;
    L13:
        getMViewPager().setCurrentItem(getMTableList().indexOf(Integer.valueOf(this.curMode)));
        return;
    L5:
        r1 = 1;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_app_start_sport;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void setCurMode(int r1) {
        this.curMode = r1;
    }

    public final void setMTableList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTableList = r2;
    }
}
