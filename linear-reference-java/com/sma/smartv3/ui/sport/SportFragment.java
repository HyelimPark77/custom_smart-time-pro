package com.sma.smartv3.ui.sport;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.III011;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tz4;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerFragment;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.facebook.login.widget.ToolTipPopup;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sma.smartv3.model.CustomConfigInfo;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AiCoachFragment;
import com.sma.smartv3.ui.sport.course.ClimbingV2Fragment;
import com.sma.smartv3.ui.sport.course.CourseFragment;
import com.sma.smartv3.ui.sport.course.CyclingV2Fragment;
import com.sma.smartv3.ui.sport.course.IndoorV2Fragment;
import com.sma.smartv3.ui.sport.course.OutdoorV2Fragment;
import com.sma.smartv3.ui.sport.course.SwimV2Fragment;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportFragment.kt\ncom/sma/smartv3/ui/sport/SportFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,207:1\n15#2:208\n15#2:211\n37#3,2:209\n*S KotlinDebug\n*F\n+ 1 SportFragment.kt\ncom/sma/smartv3/ui/sport/SportFragment\n*L\n64#1:208\n186#1:211\n130#1:209,2\n*E\n"})
public class SportFragment extends BaseFragmentPagerFragment {

    @aa1
    private OXO1 listener;

    @tb1
    private LocationManager locationManager;

    @tb1
    private DeviceConfigInfo mDeviceConfigInfo;

    @tb1
    private III011 proxy;

    @aa1
    private final Lazy table$delegate;

    public static final class OXO1 implements LocationListener {
        public final /* synthetic */ SportFragment OXO1;

        public OXO1(SportFragment r1) {
            this.OXO1 = r1;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location r2) {
            Intrinsics.X0O(r2, "location");
            III011 r0 = SportFragment.access$getProxy$p(this.OXO1);
            if (r0 == null) goto L6;
            r0.OIX0iXi(r2);
            return;
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String r2) {
            Intrinsics.X0O(r2, IronSourceConstants.EVENTS_PROVIDER);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String r2) {
            Intrinsics.X0O(r2, IronSourceConstants.EVENTS_PROVIDER);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String r1, int r2, Bundle r3) {
        }
    }

    public SportFragment() {
        this.table$delegate = LazyKt__LazyJVMKt.iO(new tz4(this));
        this.listener = new OXO1(this);
    }

    public static /* synthetic */ TabLayout XIi00iiXO(SportFragment r0) {
        return table_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ III011 access$getProxy$p(SportFragment r0) {
        return r0.proxy;
    }

    private final boolean getIsSupCourse() {
        DeviceConfigInfo r0 = this.mDeviceConfigInfo;     // Catch: Exception -> L15
        String r1 = null;
        if (r0 == null) goto L7;
        CustomConfigInfo r2 = r0.getCustomConfig();     // Catch: Exception -> L15
        if (r2 == null) goto L7;
        String r3 = r2.getSupCourse();     // Catch: Exception -> L15
    L8:
        LogUtils.d(new Object[]{"getIsSupCourse" + r3 + " "});     // Catch: Exception -> L15
        DeviceConfigInfo r4 = this.mDeviceConfigInfo;     // Catch: Exception -> L15
        if (r4 == null) goto L13;
        CustomConfigInfo r5 = r4.getCustomConfig();     // Catch: Exception -> L15
        if (r5 == null) goto L13;
        r1 = r5.getSupCourse();     // Catch: Exception -> L15
    L13:
        return Intrinsics.XOO0ii0(r1, "1");
    L7:
        r3 = null;
    L15:
        return false;
    }

    private static final TabLayout table_delegate$lambda$0(SportFragment r1) {
        return (TabLayout) r1.getMView().findViewById(R.id.table);
    }

    public final TabLayout getTable() {
        return (TabLayout) getValue();
    }

    @aa1
    public String[] getTiTle() {
        ArrayList r0 = new ArrayList();
        i72 r1 = i72.OXO1;
        if (r1.Xi() == false) goto L5;
        r0.add(getString(R.string.abh_ai_coach));
    L5:
        r0.add(getString(R.string.workout9));
        r0.add(getString(R.string.workout8));
        r0.add(getString(R.string.workout10));
        if (q62.OXO1.I0i1OXiI() == false) goto L8;
        String r2 = getString(R.string.workout11);
    L9:
        r0.add(r2);
        if (r1.Oi1() == false) goto L15;
        if (getIsSupCourse() == false) goto L15;
        r0.add(getString(R.string.sport_fitness));
    L15:
        return (String[]) r0.toArray(new String[0]);
    L8:
        r2 = getString(R.string.workout13);
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        SPUtils r5 = a01.OXO1.XIi00iiXO();
        this.mDeviceConfigInfo = (DeviceConfigInfo) new Gson().fromJson(r5.getString(DeviceConfigInfo.class.getName()), DeviceConfigInfo.class);
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        ArrayList r0 = new ArrayList();
        i72 r1 = i72.OXO1;
        if (r1.Xi() == false) goto L5;
        r0.add(new AiCoachFragment());
    L5:
        r0.add(new OutdoorV2Fragment());
        r0.add(new IndoorV2Fragment());
        r0.add(new CyclingV2Fragment());
        if (r1.Oi1() == false) goto L16;
        if (getIsSupCourse() == false) goto L16;
        if (q62.OXO1.I0i1OXiI() == false) goto L12;
        ActivityResultCaller r2 = new SwimV2Fragment();
    L13:
        r0.add(r2);
        r0.add(new CourseFragment());
        return r0;
    L12:
        r2 = new ClimbingV2Fragment();
    L16:
        if (q62.OXO1.I0i1OXiI() == false) goto L18;
        ActivityResultCaller r3 = new SwimFragment();
    L19:
        r0.add(r3);
        return r0;
    L18:
        r3 = new ClimbingFragment();
        goto L19
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getTable().setBackgroundColor(gk4.iO(getContext(), R.color.view_page_tablayout_bg));
        TabLayout r0 = getTable();
        if (i72.OXO1.Xi() == false) goto L5;
        int r1 = 2;
    L6:
        r0.setTabMode(r1);
        getMFragmentPagerAdapter().setTitles(getTiTle());
        getTable().setupWithViewPager(getMViewPager());
        Object r2 = getMActivity().getSystemService("location");
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (LocationManager) r2;
    L11:
        e = move-exception;
        e.printStackTrace();
        return;
    L8:
        if (UtilsKt.X1() == false) goto L16;
        this.proxy = III011.OIi0(requireContext());     // Catch: Exception -> L11
        return;
    L16:
        return;
    L5:
        r1 = 1;
        goto L6
    }

    public int layoutId() {
        return R.layout.fragment_sport;
    }

    @sf5(tag = I01XX0.iXiX011)
    @SuppressLint({"CommitTransaction"})
    public final void onBindStateChange(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        SPUtils r5 = a01.OXO1.XIi00iiXO();
        this.mDeviceConfigInfo = (DeviceConfigInfo) new Gson().fromJson(r5.getString(DeviceConfigInfo.class.getName()), DeviceConfigInfo.class);
        int r6 = getMFragmentPagerAdapter().getCount();
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L5;
        provideFragmentManager().beginTransaction().remove(getMFragmentPagerAdapter().getItem(r0)).commitNowAllowingStateLoss();
        r0 = r0 + 1;
        goto L3
    L5:
        initView();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        III011 r0 = this.proxy;
        if (r0 == null) goto L6;
        r0.O10IXXX0X();
        return;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LocationManager r0 = this.locationManager;
        if (r0 == null) goto L5;
        r0.removeUpdates(this.listener);
    L5:
        LogUtils.d(new Object[]{"stop removeUpdates listener"});
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (ContextCompat.checkSelfPermission(getMActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0) goto L5;
        return;
    L5:
        if (BleConnector.INSTANCE.isBound() == false) goto L21;
        LocationManager r1 = this.locationManager;     // Catch: Exception -> L9
        if (r1 == null) goto L11;
        r1.requestLocationUpdates("gps", ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, 1.0f, this.listener);     // Catch: Exception -> L9
    L11:
        III011 r0 = this.proxy;     // Catch: Exception -> L9
        if (r0 == null) goto L16;
        r0.XXI();     // Catch: Exception -> L9
    L16:
        LogUtils.d(new Object[]{"start requestLocationUpdates listener"});
        return;
    L9:
        e = move-exception;
        e.printStackTrace();
        goto L16
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public void onThemeChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        LogUtils.d(new Object[]{"SportFragment THEME_CHANGE"});
        getTable().setBackgroundColor(gk4.iO(getContext(), R.color.view_page_tablayout_bg));
    }
}
