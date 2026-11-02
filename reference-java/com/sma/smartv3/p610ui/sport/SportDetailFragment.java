package com.sma.smartv3.p610ui.sport;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.gridlayout.widget.GridLayout;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.LocationDao;
import com.sma.smartv3.p608db.entity.Location;
import com.sma.smartv3.p608db.entity.Workout;
import com.sma.smartv3.p610ui.sport.SportDetailFragment;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,152:1\n19#2:153\n15#2:154\n*S KotlinDebug\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n*L\n52#1:153\n52#1:154\n*E\n"})
public final class SportDetailFragment extends BaseFragment {
    private boolean isLocationEmpty;

    @aa1
    private final Lazy mLocationDao$delegate;
    private Workout mWorkout;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.rootView_delegate$lambda$0(this.f8759IO);
        }
    });

    @aa1
    private final Lazy tvDateTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ku4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvDateTime_delegate$lambda$0(this.f9285IO);
        }
    });

    @aa1
    private final Lazy tvDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.su4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvDuration_delegate$lambda$0(this.f11132IO);
        }
    });

    @aa1
    private final Lazy tvStepValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvStepValue_delegate$lambda$0(this.f11572IO);
        }
    });

    @aa1
    private final Lazy stepPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.stepPanel_delegate$lambda$0(this.f11816IO);
        }
    });

    @aa1
    private final Lazy tvAvgSpmValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAvgSpmValue_delegate$lambda$0(this.f12039IO);
        }
    });

    @aa1
    private final Lazy spmPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.spmPanel_delegate$lambda$0(this.f12239IO);
        }
    });

    @aa1
    private final Lazy tvDistanceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvDistanceValue_delegate$lambda$0(this.f12453IO);
        }
    });

    @aa1
    private final Lazy distancePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.distancePanel_delegate$lambda$0(this.f12696IO);
        }
    });

    @aa1
    private final Lazy tvDistanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.av4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvDistanceUnit_delegate$lambda$0(this.f5582IO);
        }
    });

    @aa1
    private final Lazy tvCaloriesValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvCaloriesValue_delegate$lambda$0(this.f11362IO);
        }
    });

    @aa1
    private final Lazy tvAvgHrValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAvgHrValue_delegate$lambda$0(this.f5831IO);
        }
    });

    @aa1
    private final Lazy tvAvgSpeedValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAvgSpeedValue_delegate$lambda$0(this.f6060IO);
        }
    });

    @aa1
    private final Lazy speedPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.speedPanel_delegate$lambda$0(this.f6277IO);
        }
    });

    @aa1
    private final Lazy tvAvgSpeedUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ev4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAvgSpeedUnit_delegate$lambda$0(this.f6496IO);
        }
    });

    @aa1
    private final Lazy tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAvgPaceValue_delegate$lambda$0(this.f6743IO);
        }
    });

    @aa1
    private final Lazy tvAvgPaceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAvgPaceUnit_delegate$lambda$0(this.f6970IO);
        }
    });

    @aa1
    private final Lazy pacePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.pacePanel_delegate$lambda$0(this.f7214IO);
        }
    });

    @aa1
    private final Lazy tvAltitudeValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iv4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAltitudeValue_delegate$lambda$0(this.f8767IO);
        }
    });

    @aa1
    private final Lazy tvAltitudeUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ju4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAltitudeUnit_delegate$lambda$0(this.f9041IO);
        }
    });

    @aa1
    private final Lazy altitudePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.altitudePanel_delegate$lambda$0(this.f9523IO);
        }
    });

    @aa1
    private final Lazy tvAirpressureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAirpressureValue_delegate$lambda$0(this.f9790IO);
        }
    });

    @aa1
    private final Lazy tvAirpressureUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvAirpressureUnit_delegate$lambda$0(this.f10014IO);
        }
    });

    @aa1
    private final Lazy airpressurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ou4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.airpressurePanel_delegate$lambda$0(this.f10226IO);
        }
    });

    @aa1
    private final Lazy tvPressureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.tvPressureValue_delegate$lambda$0(this.f10441IO);
        }
    });

    @aa1
    private final Lazy pressurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qu4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SportDetailFragment.pressurePanel_delegate$lambda$0(this.f10683IO);
        }
    });

    public SportDetailFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ru4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SportDetailFragment.mLocationDao_delegate$lambda$0();
            }
        });
        this.isLocationEmpty = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View airpressurePanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.airpressure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View altitudePanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.altitude_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View distancePanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.distance_panel);
    }

    private final View getAirpressurePanel() {
        return (View) this.airpressurePanel$delegate.getValue();
    }

    private final View getAltitudePanel() {
        return (View) this.altitudePanel$delegate.getValue();
    }

    private final View getDistancePanel() {
        return (View) this.distancePanel$delegate.getValue();
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) this.mLocationDao$delegate.getValue();
    }

    private final View getPacePanel() {
        return (View) this.pacePanel$delegate.getValue();
    }

    private final View getPressurePanel() {
        return (View) this.pressurePanel$delegate.getValue();
    }

    private final NestedScrollView getRootView() {
        return (NestedScrollView) this.rootView$delegate.getValue();
    }

    private final View getSpeedPanel() {
        return (View) this.speedPanel$delegate.getValue();
    }

    private final View getSpmPanel() {
        return (View) this.spmPanel$delegate.getValue();
    }

    private final View getStepPanel() {
        return (View) this.stepPanel$delegate.getValue();
    }

    private final TextView getTvAirpressureUnit() {
        return (TextView) this.tvAirpressureUnit$delegate.getValue();
    }

    private final TextView getTvAirpressureValue() {
        return (TextView) this.tvAirpressureValue$delegate.getValue();
    }

    private final TextView getTvAltitudeUnit() {
        return (TextView) this.tvAltitudeUnit$delegate.getValue();
    }

    private final TextView getTvAltitudeValue() {
        return (TextView) this.tvAltitudeValue$delegate.getValue();
    }

    private final TextView getTvAvgHrValue() {
        return (TextView) this.tvAvgHrValue$delegate.getValue();
    }

    private final TextView getTvAvgPaceUnit() {
        return (TextView) this.tvAvgPaceUnit$delegate.getValue();
    }

    private final TextView getTvAvgPaceValue() {
        return (TextView) this.tvAvgPaceValue$delegate.getValue();
    }

    private final TextView getTvAvgSpeedUnit() {
        return (TextView) this.tvAvgSpeedUnit$delegate.getValue();
    }

    private final TextView getTvAvgSpeedValue() {
        return (TextView) this.tvAvgSpeedValue$delegate.getValue();
    }

    private final TextView getTvAvgSpmValue() {
        return (TextView) this.tvAvgSpmValue$delegate.getValue();
    }

    private final TextView getTvCaloriesValue() {
        return (TextView) this.tvCaloriesValue$delegate.getValue();
    }

    private final TextView getTvDateTime() {
        return (TextView) this.tvDateTime$delegate.getValue();
    }

    private final TextView getTvDistanceUnit() {
        return (TextView) this.tvDistanceUnit$delegate.getValue();
    }

    private final TextView getTvDistanceValue() {
        return (TextView) this.tvDistanceValue$delegate.getValue();
    }

    private final TextView getTvDuration() {
        return (TextView) this.tvDuration$delegate.getValue();
    }

    private final TextView getTvPressureValue() {
        return (TextView) this.tvPressureValue$delegate.getValue();
    }

    private final TextView getTvStepValue() {
        return (TextView) this.tvStepValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View pacePanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.pace_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View pressurePanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.pressure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollView rootView_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (NestedScrollView) sportDetailFragment.getMView().findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View speedPanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.speed_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View spmPanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.spm_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View stepPanel_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return sportDetailFragment.getMView().findViewById(R.id.step_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAirpressureUnit_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_airpressure_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAirpressureValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_airpressure_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAltitudeUnit_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_altitude_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAltitudeValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_altitude_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgHrValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_hr_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgPaceUnit_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_pace_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgPaceValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_pace_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgSpeedUnit_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_speed_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgSpeedValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_speed_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAvgSpmValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_spm_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCaloriesValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_calories_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDateTime_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_dateTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceUnit_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_distance_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDistanceValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_distance_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDuration_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPressureValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_pressure_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvStepValue_delegate$lambda$0(SportDetailFragment sportDetailFragment) {
        return (TextView) sportDetailFragment.getMView().findViewById(R.id.tv_step_value);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int iX0i1O;
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        this.mWorkout = (Workout) mArg3;
        LocationDao mLocationDao = getMLocationDao();
        Workout workout = this.mWorkout;
        Workout workout2 = null;
        if (workout == null) {
            Intrinsics.XXO("mWorkout");
            workout = null;
        }
        long mStart = workout.getMStart();
        Workout workout3 = this.mWorkout;
        if (workout3 == null) {
            Intrinsics.XXO("mWorkout");
            workout3 = null;
        }
        List<Location> location = mLocationDao.getLocation(mStart, workout3.getMEnd());
        this.isLocationEmpty = location.isEmpty() || location.size() < 2;
        GridLayout gridLayout = (GridLayout) getMView().findViewById(R.id.f51416gl);
        TextView tvDateTime = getTvDateTime();
        SimpleDateFormat simpleDateFormatI0X000X0O = O0X11OiO.i0X000X0O(false, false, 3, null);
        Workout workout4 = this.mWorkout;
        if (workout4 == null) {
            Intrinsics.XXO("mWorkout");
            workout4 = null;
        }
        tvDateTime.setText(simpleDateFormatI0X000X0O.format(new Date(workout4.getMStart())));
        TextView tvDuration = getTvDuration();
        Workout workout5 = this.mWorkout;
        if (workout5 == null) {
            Intrinsics.XXO("mWorkout");
            workout5 = null;
        }
        tvDuration.setText(O0X11OiO.iXiX011(workout5.getMDuration() * 1000));
        TextView tvCaloriesValue = getTvCaloriesValue();
        Workout workout6 = this.mWorkout;
        if (workout6 == null) {
            Intrinsics.XXO("mWorkout");
            workout6 = null;
        }
        tvCaloriesValue.setText(String.valueOf(workout6.getMCalorie() / 1000));
        TextView tvAvgHrValue = getTvAvgHrValue();
        Workout workout7 = this.mWorkout;
        if (workout7 == null) {
            Intrinsics.XXO("mWorkout");
            workout7 = null;
        }
        tvAvgHrValue.setText(String.valueOf(workout7.getMAvgBpm()));
        q62 q62Var = q62.OXO1;
        Workout workout8 = this.mWorkout;
        if (workout8 == null) {
            Intrinsics.XXO("mWorkout");
            workout8 = null;
        }
        if (q62Var.O1XXXX(workout8.getMMode())) {
            TextView tvStepValue = getTvStepValue();
            Workout workout9 = this.mWorkout;
            if (workout9 == null) {
                Intrinsics.XXO("mWorkout");
                workout9 = null;
            }
            tvStepValue.setText(String.valueOf(workout9.getMStep()));
            TextView tvAvgSpmValue = getTvAvgSpmValue();
            Workout workout10 = this.mWorkout;
            if (workout10 == null) {
                Intrinsics.XXO("mWorkout");
                workout10 = null;
            }
            tvAvgSpmValue.setText(String.valueOf(workout10.getMSpm()));
        } else {
            gridLayout.removeView(getStepPanel());
            gridLayout.removeView(getSpmPanel());
        }
        Workout workout11 = this.mWorkout;
        if (workout11 == null) {
            Intrinsics.XXO("mWorkout");
            workout11 = null;
        }
        if (q62.X0XI11I(q62Var, workout11.getMMode(), false, 2, null)) {
            TextView tvDistanceValue = getTvDistanceValue();
            Workout workout12 = this.mWorkout;
            if (workout12 == null) {
                Intrinsics.XXO("mWorkout");
                workout12 = null;
            }
            tvDistanceValue.setText(String.valueOf(cp5.X1ii(workout12.getMDistance(), this.userProfile.getUnit(), false, 4, null)));
            getTvDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
            TextView tvAvgSpeedValue = getTvAvgSpeedValue();
            Workout workout13 = this.mWorkout;
            if (workout13 == null) {
                Intrinsics.XXO("mWorkout");
                workout13 = null;
            }
            tvAvgSpeedValue.setText(String.valueOf(cp5.i11I(((double) workout13.getMSpeed()) / 1000.0d, this.userProfile.getUnit())));
            getTvAvgSpeedUnit().setText(getString(this.userProfile.getUnit() == 0 ? R.string.km_h : R.string.mi_h));
            TextView tvAvgPaceValue = getTvAvgPaceValue();
            Workout workout14 = this.mWorkout;
            if (workout14 == null) {
                Intrinsics.XXO("mWorkout");
                workout14 = null;
            }
            tvAvgPaceValue.setText(cp5.Ii1iii0(workout14.getMPace(), this.userProfile.getUnit()));
            getTvAvgPaceUnit().setText(getString(this.userProfile.getUnit() == 0 ? R.string.pace_km : R.string.pace_mi));
        } else {
            gridLayout.removeView(getDistancePanel());
            gridLayout.removeView(getSpeedPanel());
            gridLayout.removeView(getPacePanel());
        }
        Workout workout15 = this.mWorkout;
        if (workout15 == null) {
            Intrinsics.XXO("mWorkout");
            workout15 = null;
        }
        if (q62Var.I1XXi1Oi(workout15.getMMode(), true ^ this.isLocationEmpty)) {
            TextView tvAltitudeValue = getTvAltitudeValue();
            Workout workout16 = this.mWorkout;
            if (workout16 == null) {
                Intrinsics.XXO("mWorkout");
                workout16 = null;
            }
            tvAltitudeValue.setText(cp5.iIXi1iiXI(workout16.getMAltitude(), this.userProfile.getUnit()));
            getTvAltitudeUnit().setText(getString(this.userProfile.getUnit() == 0 ? R.string.f54360m : R.string.f54374yd));
        } else {
            gridLayout.removeView(getAltitudePanel());
        }
        Workout workout17 = this.mWorkout;
        if (workout17 == null) {
            Intrinsics.XXO("mWorkout");
            workout17 = null;
        }
        if (workout17.getMAirPressure() != 0) {
            TextView tvAirpressureValue = getTvAirpressureValue();
            if (this.userProfile.getUnit() == 0) {
                Workout workout18 = this.mWorkout;
                if (workout18 == null) {
                    Intrinsics.XXO("mWorkout");
                    workout18 = null;
                }
                iX0i1O = workout18.getMAirPressure();
            } else {
                Workout workout19 = this.mWorkout;
                if (workout19 == null) {
                    Intrinsics.XXO("mWorkout");
                    workout19 = null;
                }
                iX0i1O = (int) cp5.X0i1O(workout19.getMAirPressure());
            }
            tvAirpressureValue.setText(String.valueOf(iX0i1O));
            getTvAirpressureUnit().setText(getString(this.userProfile.getUnit() == 0 ? R.string.kpa : R.string.psi));
        } else {
            gridLayout.removeView(getAirpressurePanel());
        }
        Workout workout20 = this.mWorkout;
        if (workout20 == null) {
            Intrinsics.XXO("mWorkout");
            workout20 = null;
        }
        if (!q62Var.OOX(workout20.getMMode())) {
            gridLayout.removeView(getPressurePanel());
            return;
        }
        TextView tvPressureValue = getTvPressureValue();
        Workout workout21 = this.mWorkout;
        if (workout21 == null) {
            Intrinsics.XXO("mWorkout");
        } else {
            workout2 = workout21;
        }
        tvPressureValue.setText(String.valueOf(workout2.getMAvgStress()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_sport_detail;
    }

    public final void share() {
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        NestedScrollView rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        ImageUtils.save(xIi1i01O.m1250iO(rootView), uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.PNG);
    }
}
