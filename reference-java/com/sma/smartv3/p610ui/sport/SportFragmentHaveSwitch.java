package com.sma.smartv3.p610ui.sport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.III011;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.viewpager.BaseFragmentPagerFragment;
import com.blankj.utilcode.util.LogUtils;
import com.facebook.login.widget.ToolTipPopup;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.sma.smartv3.model.CustomConfigInfo;
import com.sma.smartv3.model.DeviceConfigInfo;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.p610ui.sport.SportFragmentHaveSwitch;
import com.sma.smartv3.p610ui.sport.coach.AiCoachFragment;
import com.sma.smartv3.p610ui.sport.course.ClimbingV2Fragment;
import com.sma.smartv3.p610ui.sport.course.CourseFragment;
import com.sma.smartv3.p610ui.sport.course.CyclingV2Fragment;
import com.sma.smartv3.p610ui.sport.course.IndoorV2Fragment;
import com.sma.smartv3.p610ui.sport.course.OutdoorV2Fragment;
import com.sma.smartv3.p610ui.sport.course.SwimV2Fragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportFragmentHaveSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportFragmentHaveSwitch.kt\ncom/sma/smartv3/ui/sport/SportFragmentHaveSwitch\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,283:1\n15#2:284\n15#2:287\n37#3,2:285\n*S KotlinDebug\n*F\n+ 1 SportFragmentHaveSwitch.kt\ncom/sma/smartv3/ui/sport/SportFragmentHaveSwitch\n*L\n84#1:284\n263#1:287\n187#1:285,2\n*E\n"})
public class SportFragmentHaveSwitch extends BaseFragmentPagerFragment {

    @tb1
    private LocationManager locationManager;

    @tb1
    private ActivityResultLauncher<Intent> mActivityResultLauncher;

    @tb1
    private DeviceConfigInfo mDeviceConfigInfo;

    @tb1
    private III011 proxy;

    @aa1
    private final Lazy table$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vz4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportFragmentHaveSwitch.table_delegate$lambda$0(this.f11847IO);
        }
    });
    private int mSportType = a01.OXO1.m1440iO().getInt(b01.OiXI1OiX0, -1);

    @aa1
    private OXO1 listener = new OXO1();

    public static final class OXO1 implements LocationListener {
        public OXO1() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            Intrinsics.X0O(location, "location");
            III011 iii011 = SportFragmentHaveSwitch.this.proxy;
            if (iii011 != null) {
                iii011.OIX0iXi(location);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
            Intrinsics.X0O(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
            Intrinsics.X0O(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    private final boolean getIsSupCourse() {
        CustomConfigInfo customConfig;
        CustomConfigInfo customConfig2;
        try {
            DeviceConfigInfo deviceConfigInfo = this.mDeviceConfigInfo;
            String supCourse = null;
            LogUtils.m11128d("getIsSupCourse" + ((deviceConfigInfo == null || (customConfig2 = deviceConfigInfo.getCustomConfig()) == null) ? null : customConfig2.getSupCourse()) + " ");
            DeviceConfigInfo deviceConfigInfo2 = this.mDeviceConfigInfo;
            if (deviceConfigInfo2 != null && (customConfig = deviceConfigInfo2.getCustomConfig()) != null) {
                supCourse = customConfig.getSupCourse();
            }
            return Intrinsics.XOO0ii0(supCourse, "1");
        } catch (Exception unused) {
            return false;
        }
    }

    private final void initSportSelect() {
        this.mActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.android.mltcode.paycertificationapi.uz4
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SportFragmentHaveSwitch.initSportSelect$lambda$0(this.OXO1, (ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSportSelect$lambda$0(SportFragmentHaveSwitch sportFragmentHaveSwitch, ActivityResult activityResult) {
        if (activityResult != null) {
            if (activityResult.getResultCode() == -1) {
                Intent data = activityResult.getData();
                int intExtra = data != null ? data.getIntExtra(SportTypeSelectionActivity.Companion.OXO1(), -1) : -1;
                int i = sportFragmentHaveSwitch.mSportType;
                if (i == intExtra || i <= 0) {
                    return;
                }
                sportFragmentHaveSwitch.mSportType = intExtra;
                a01.OXO1.m1440iO().put(b01.OiXI1OiX0, intExtra);
                sportFragmentHaveSwitch.onBindStateChange(new Object());
                XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(sportFragmentHaveSwitch), null, null, new SportFragmentHaveSwitch$initSportSelect$1$1$1(sportFragmentHaveSwitch, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabLayout table_delegate$lambda$0(SportFragmentHaveSwitch sportFragmentHaveSwitch) {
        return (TabLayout) sportFragmentHaveSwitch.getMView().findViewById(R.id.table);
    }

    @aa1
    public final Fragment getScreenlessBraceletFragment() {
        if (q62.OXO1.XIXO0iiO(this.mSportType)) {
            GeneralGPSFragment generalGPSFragment = new GeneralGPSFragment();
            generalGPSFragment.setMSportMode(this.mSportType);
            return generalGPSFragment;
        }
        GeneralNoGPSFragment generalNoGPSFragment = new GeneralNoGPSFragment();
        generalNoGPSFragment.setMSportMode(this.mSportType);
        return generalNoGPSFragment;
    }

    public final TabLayout getTable() {
        return (TabLayout) this.table$delegate.getValue();
    }

    @aa1
    public String[] getTiTle() {
        String string;
        ArrayList arrayList = new ArrayList();
        i72 i72Var = i72.OXO1;
        if (i72Var.m2054Xi()) {
            arrayList.add(getString(R.string.abh_ai_coach));
        }
        arrayList.add(getString(R.string.workout9));
        arrayList.add(getString(R.string.workout8));
        arrayList.add(getString(R.string.workout10));
        q62 q62Var = q62.OXO1;
        if (q62Var.I0i1OXiI()) {
            string = getString(R.string.workout11);
        } else if (!q62Var.XI1OX0IO() || this.mSportType == -1) {
            string = getString(R.string.workout13);
        } else {
            Activity mActivity = getMActivity();
            SportRecordData sportRecordData = new SportRecordData();
            sportRecordData.setMMode(this.mSportType);
            Unit unit = Unit.OXO1;
            string = getString(SportRecordDataKt.getWorkoutName(mActivity, sportRecordData));
        }
        arrayList.add(string);
        if (i72Var.Oi1() && getIsSupCourse()) {
            arrayList.add(getString(R.string.sport_fitness));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        this.mDeviceConfigInfo = (DeviceConfigInfo) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(DeviceConfigInfo.class.getName()), DeviceConfigInfo.class);
        initSportSelect();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.jl1
    @aa1
    public List<Fragment> initFragments() {
        Fragment climbingFragment;
        ArrayList arrayList = new ArrayList();
        i72 i72Var = i72.OXO1;
        if (i72Var.m2054Xi()) {
            arrayList.add(new AiCoachFragment());
        }
        arrayList.add(new OutdoorV2Fragment());
        arrayList.add(new IndoorV2Fragment());
        arrayList.add(new CyclingV2Fragment());
        if (i72Var.Oi1() && getIsSupCourse()) {
            arrayList.add(q62.OXO1.I0i1OXiI() ? new SwimV2Fragment() : new ClimbingV2Fragment());
            arrayList.add(new CourseFragment());
            return arrayList;
        }
        q62 q62Var = q62.OXO1;
        if (q62Var.I0i1OXiI()) {
            climbingFragment = new SwimFragment();
        } else {
            climbingFragment = (!q62Var.XI1OX0IO() || this.mSportType == -1) ? new ClimbingFragment() : getScreenlessBraceletFragment();
        }
        arrayList.add(climbingFragment);
        return arrayList;
    }

    @Override // com.bestmafen.androidbase.viewpager.BaseFragmentPagerFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getTable().setBackgroundColor(gk4.m1859iO(getContext(), R.color.view_page_tablayout_bg));
        getTable().setTabMode(i72.OXO1.m2054Xi() ? 2 : 1);
        getMFragmentPagerAdapter().setTitles(getTiTle());
        getTable().setupWithViewPager(getMViewPager());
        Object systemService = getMActivity().getSystemService("location");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (LocationManager) systemService;
        try {
            if (UtilsKt.m38846X1()) {
                this.proxy = III011.OIi0(requireContext());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport;
    }

    @sf5(tag = I01XX0.iXiX011)
    @SuppressLint({"CommitTransaction"})
    public final void onBindStateChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        this.mDeviceConfigInfo = (DeviceConfigInfo) new Gson().fromJson(a01.OXO1.XIi00iiXO().getString(DeviceConfigInfo.class.getName()), DeviceConfigInfo.class);
        int count = getMFragmentPagerAdapter().getCount();
        for (int i = 0; i < count; i++) {
            provideFragmentManager().beginTransaction().remove(getMFragmentPagerAdapter().getItem(i)).commitNowAllowingStateLoss();
        }
        initView();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        III011 iii011 = this.proxy;
        if (iii011 != null) {
            iii011.O10IXXX0X();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            locationManager.removeUpdates(this.listener);
        }
        LogUtils.m11128d("stop removeUpdates listener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (ContextCompat.checkSelfPermission(getMActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
            try {
                LocationManager locationManager = this.locationManager;
                if (locationManager != null) {
                    locationManager.requestLocationUpdates("gps", ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME, 1.0f, this.listener);
                }
                III011 iii011 = this.proxy;
                if (iii011 != null) {
                    iii011.XXI();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            LogUtils.m11128d("start requestLocationUpdates listener");
        }
    }

    @sf5(tag = I01XX0.XXiIiX10)
    public void onThemeChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11128d("SportFragment THEME_CHANGE");
        getTable().setBackgroundColor(gk4.m1859iO(getContext(), R.color.view_page_tablayout_bg));
    }
}
