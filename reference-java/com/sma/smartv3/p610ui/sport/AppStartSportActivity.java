package com.sma.smartv3.p610ui.sport;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p610ui.sport.AppStartSportActivity;
import com.sma.smartv3.p610ui.sport.v2fragment.AppGpsStartSportFragment;
import com.sma.smartv3.p610ui.sport.v2fragment.AppNoGpsStartSportFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAppStartSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,118:1\n13805#2,2:119\n37#3,2:121\n*S KotlinDebug\n*F\n+ 1 AppStartSportActivity.kt\ncom/sma/smartv3/ui/sport/AppStartSportActivity\n*L\n67#1:119,2\n97#1:121,2\n*E\n"})
public final class AppStartSportActivity extends BaseFragmentPagerActivity {
    public List<Integer> mTableList;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O10i0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AppStartSportActivity.abhTitleCenter_delegate$lambda$0(this.f2645IO);
        }
    });

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIIiiIIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AppStartSportActivity.table_delegate$lambda$0(this.f1601IO);
        }
    });
    private int curMode = 10;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(AppStartSportActivity appStartSportActivity) {
        return (TextView) appStartSportActivity.findViewById(R.id.abh_title_center);
    }

    private final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    private final Fragment getFragment(int i) {
        return a15.m1445iO(i) ? AppGpsStartSportFragment.Companion.OXO1(i) : AppNoGpsStartSportFragment.Companion.OXO1(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(AppStartSportActivity appStartSportActivity) {
        return (TabLayout) appStartSportActivity.findViewById(R.id.table);
    }

    public final int getCurMode() {
        return this.curMode;
    }

    @aa1
    public final List<Integer> getMTableList() {
        List<Integer> list = this.mTableList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("mTableList");
        return null;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @aa1
    public final String[] getTiTle() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = getMTableList().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            Activity mContext = getMContext();
            SportRecordData sportRecordData = new SportRecordData();
            sportRecordData.setMMode(iIntValue);
            Unit unit = Unit.OXO1;
            arrayList.add(getString(SportRecordDataKt.getWorkoutName(mContext, sportRecordData)));
        }
        if (!getMTableList().contains(Integer.valueOf(this.curMode))) {
            Activity mContext2 = getMContext();
            SportRecordData sportRecordData2 = new SportRecordData();
            sportRecordData2.setMMode(this.curMode);
            Unit unit2 = Unit.OXO1;
            arrayList.add(getString(SportRecordDataKt.getWorkoutName(mContext2, sportRecordData2)));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.curMode = getMArg1();
        setMTableList(a15.XIi00iiXO());
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = getMTableList().iterator();
        while (it.hasNext()) {
            arrayList.add(getFragment(it.next().intValue()));
        }
        if (!getMTableList().contains(Integer.valueOf(this.curMode))) {
            arrayList.add(getFragment(this.curMode));
        }
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getAbhTitleCenter().setText(getString(R.string.bottom_sport));
        getTable().setBackgroundColor(gk4.m1859iO(this, R.color.view_page_tablayout_bg));
        getTable().setTabMode(i72.OXO1.m2054Xi() ? 2 : 1);
        String[] tiTle = getTiTle();
        getMFragmentPagerAdapter().setTitles(tiTle);
        getTable().setupWithViewPager(getMViewPager());
        getTable().removeAllTabs();
        for (String str : tiTle) {
            TabLayout.Tab tabNewTab = getTable().newTab();
            Intrinsics.O10IXXX0X(tabNewTab, "newTab(...)");
            View viewInflate = LayoutInflater.from(getTable().getContext()).inflate(R.layout.tab_item_text, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.tv_title)).setText(str);
            tabNewTab.setCustomView(viewInflate);
            getTable().addTab(tabNewTab);
        }
        getTable().setTabMode(0);
        if (getMTableList().contains(Integer.valueOf(this.curMode))) {
            getMViewPager().setCurrentItem(getMTableList().indexOf(Integer.valueOf(this.curMode)));
        } else {
            getMViewPager().setCurrentItem(getMTableList().size());
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_app_start_sport;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void setCurMode(int i) {
        this.curMode = i;
    }

    public final void setMTableList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mTableList = list;
    }
}
