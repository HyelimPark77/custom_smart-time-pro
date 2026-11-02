package com.sma.smartv3.ui.sport;

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
import com.android.mltcode.paycertificationapi.av4;
import com.android.mltcode.paycertificationapi.bv4;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cv4;
import com.android.mltcode.paycertificationapi.dv4;
import com.android.mltcode.paycertificationapi.ev4;
import com.android.mltcode.paycertificationapi.fv4;
import com.android.mltcode.paycertificationapi.gv4;
import com.android.mltcode.paycertificationapi.hv4;
import com.android.mltcode.paycertificationapi.iu4;
import com.android.mltcode.paycertificationapi.iv4;
import com.android.mltcode.paycertificationapi.ju4;
import com.android.mltcode.paycertificationapi.ku4;
import com.android.mltcode.paycertificationapi.lu4;
import com.android.mltcode.paycertificationapi.mu4;
import com.android.mltcode.paycertificationapi.nu4;
import com.android.mltcode.paycertificationapi.ou4;
import com.android.mltcode.paycertificationapi.pu4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qu4;
import com.android.mltcode.paycertificationapi.ru4;
import com.android.mltcode.paycertificationapi.su4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tu4;
import com.android.mltcode.paycertificationapi.uu4;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vu4;
import com.android.mltcode.paycertificationapi.wu4;
import com.android.mltcode.paycertificationapi.xu4;
import com.android.mltcode.paycertificationapi.yu4;
import com.android.mltcode.paycertificationapi.zu4;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.LocationDao;
import com.sma.smartv3.db.entity.Location;
import com.sma.smartv3.db.entity.Workout;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,152:1\n19#2:153\n15#2:154\n*S KotlinDebug\n*F\n+ 1 SportDetailFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailFragment\n*L\n52#1:153\n52#1:154\n*E\n"})
public final class SportDetailFragment extends BaseFragment {

    @aa1
    private final Lazy airpressurePanel$delegate;

    @aa1
    private final Lazy altitudePanel$delegate;

    @aa1
    private final Lazy distancePanel$delegate;
    private boolean isLocationEmpty;

    @aa1
    private final Lazy mLocationDao$delegate;
    private Workout mWorkout;

    @aa1
    private final Lazy pacePanel$delegate;

    @aa1
    private final Lazy pressurePanel$delegate;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy speedPanel$delegate;

    @aa1
    private final Lazy spmPanel$delegate;

    @aa1
    private final Lazy stepPanel$delegate;

    @aa1
    private final Lazy tvAirpressureUnit$delegate;

    @aa1
    private final Lazy tvAirpressureValue$delegate;

    @aa1
    private final Lazy tvAltitudeUnit$delegate;

    @aa1
    private final Lazy tvAltitudeValue$delegate;

    @aa1
    private final Lazy tvAvgHrValue$delegate;

    @aa1
    private final Lazy tvAvgPaceUnit$delegate;

    @aa1
    private final Lazy tvAvgPaceValue$delegate;

    @aa1
    private final Lazy tvAvgSpeedUnit$delegate;

    @aa1
    private final Lazy tvAvgSpeedValue$delegate;

    @aa1
    private final Lazy tvAvgSpmValue$delegate;

    @aa1
    private final Lazy tvCaloriesValue$delegate;

    @aa1
    private final Lazy tvDateTime$delegate;

    @aa1
    private final Lazy tvDistanceUnit$delegate;

    @aa1
    private final Lazy tvDistanceValue$delegate;

    @aa1
    private final Lazy tvDuration$delegate;

    @aa1
    private final Lazy tvPressureValue$delegate;

    @aa1
    private final Lazy tvStepValue$delegate;

    @aa1
    private final AppUser userProfile;

    public SportDetailFragment() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new iu4(this));
        this.tvDateTime$delegate = LazyKt__LazyJVMKt.iO(new ku4(this));
        this.tvDuration$delegate = LazyKt__LazyJVMKt.iO(new su4(this));
        this.tvStepValue$delegate = LazyKt__LazyJVMKt.iO(new uu4(this));
        this.stepPanel$delegate = LazyKt__LazyJVMKt.iO(new vu4(this));
        this.tvAvgSpmValue$delegate = LazyKt__LazyJVMKt.iO(new wu4(this));
        this.spmPanel$delegate = LazyKt__LazyJVMKt.iO(new xu4(this));
        this.tvDistanceValue$delegate = LazyKt__LazyJVMKt.iO(new yu4(this));
        this.distancePanel$delegate = LazyKt__LazyJVMKt.iO(new zu4(this));
        this.tvDistanceUnit$delegate = LazyKt__LazyJVMKt.iO(new av4(this));
        this.tvCaloriesValue$delegate = LazyKt__LazyJVMKt.iO(new tu4(this));
        this.tvAvgHrValue$delegate = LazyKt__LazyJVMKt.iO(new bv4(this));
        this.tvAvgSpeedValue$delegate = LazyKt__LazyJVMKt.iO(new cv4(this));
        this.speedPanel$delegate = LazyKt__LazyJVMKt.iO(new dv4(this));
        this.tvAvgSpeedUnit$delegate = LazyKt__LazyJVMKt.iO(new ev4(this));
        this.tvAvgPaceValue$delegate = LazyKt__LazyJVMKt.iO(new fv4(this));
        this.tvAvgPaceUnit$delegate = LazyKt__LazyJVMKt.iO(new gv4(this));
        this.pacePanel$delegate = LazyKt__LazyJVMKt.iO(new hv4(this));
        this.tvAltitudeValue$delegate = LazyKt__LazyJVMKt.iO(new iv4(this));
        this.tvAltitudeUnit$delegate = LazyKt__LazyJVMKt.iO(new ju4(this));
        this.altitudePanel$delegate = LazyKt__LazyJVMKt.iO(new lu4(this));
        this.tvAirpressureValue$delegate = LazyKt__LazyJVMKt.iO(new mu4(this));
        this.tvAirpressureUnit$delegate = LazyKt__LazyJVMKt.iO(new nu4(this));
        this.airpressurePanel$delegate = LazyKt__LazyJVMKt.iO(new ou4(this));
        this.tvPressureValue$delegate = LazyKt__LazyJVMKt.iO(new pu4(this));
        this.pressurePanel$delegate = LazyKt__LazyJVMKt.iO(new qu4(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.mLocationDao$delegate = LazyKt__LazyJVMKt.iO(new ru4());
        this.isLocationEmpty = true;
    }

    public static /* synthetic */ TextView I0IIOi(SportDetailFragment r0) {
        return tvAvgHrValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I0iXXO(SportDetailFragment r0) {
        return tvDateTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(SportDetailFragment r0) {
        return tvAirpressureUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(SportDetailFragment r0) {
        return tvAvgSpmValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(SportDetailFragment r0) {
        return tvCaloriesValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ NestedScrollView IO(SportDetailFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IiI10X(SportDetailFragment r0) {
        return tvAvgPaceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O00(SportDetailFragment r0) {
        return tvDistanceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(SportDetailFragment r0) {
        return tvAvgSpeedValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OII(SportDetailFragment r0) {
        return tvDistanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LocationDao OIX0iXi() {
        return mLocationDao_delegate$lambda$0();
    }

    public static /* synthetic */ TextView OIi0(SportDetailFragment r0) {
        return tvStepValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(SportDetailFragment r0) {
        return tvPressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OiIIX101O(SportDetailFragment r0) {
        return pressurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(SportDetailFragment r0) {
        return tvAirpressureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(SportDetailFragment r0) {
        return airpressurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(SportDetailFragment r0) {
        return pacePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XIi00iiXO(SportDetailFragment r0) {
        return tvAvgPaceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XO0O10(SportDetailFragment r0) {
        return distancePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XOO0ii0(SportDetailFragment r0) {
        return tvAltitudeValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XX0(SportDetailFragment r0) {
        return stepPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(SportDetailFragment r0) {
        return speedPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIO(SportDetailFragment r0) {
        return altitudePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIii1(SportDetailFragment r0) {
        return tvDuration_delegate$lambda$0(r0);
    }

    private static final View airpressurePanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.airpressure_panel);
    }

    private static final View altitudePanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.altitude_panel);
    }

    private static final View distancePanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.distance_panel);
    }

    private final View getAirpressurePanel() {
        return (View) getValue();
    }

    private final View getAltitudePanel() {
        return (View) getValue();
    }

    private final View getDistancePanel() {
        return (View) getValue();
    }

    private final LocationDao getMLocationDao() {
        return (LocationDao) getValue();
    }

    private final View getPacePanel() {
        return (View) getValue();
    }

    private final View getPressurePanel() {
        return (View) getValue();
    }

    private final NestedScrollView getRootView() {
        return (NestedScrollView) getValue();
    }

    private final View getSpeedPanel() {
        return (View) getValue();
    }

    private final View getSpmPanel() {
        return (View) getValue();
    }

    private final View getStepPanel() {
        return (View) getValue();
    }

    private final TextView getTvAirpressureUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvAirpressureValue() {
        return (TextView) getValue();
    }

    private final TextView getTvAltitudeUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvAltitudeValue() {
        return (TextView) getValue();
    }

    private final TextView getTvAvgHrValue() {
        return (TextView) getValue();
    }

    private final TextView getTvAvgPaceUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvAvgPaceValue() {
        return (TextView) getValue();
    }

    private final TextView getTvAvgSpeedUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvAvgSpeedValue() {
        return (TextView) getValue();
    }

    private final TextView getTvAvgSpmValue() {
        return (TextView) getValue();
    }

    private final TextView getTvCaloriesValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDateTime() {
        return (TextView) getValue();
    }

    private final TextView getTvDistanceUnit() {
        return (TextView) getValue();
    }

    private final TextView getTvDistanceValue() {
        return (TextView) getValue();
    }

    private final TextView getTvDuration() {
        return (TextView) getValue();
    }

    private final TextView getTvPressureValue() {
        return (TextView) getValue();
    }

    private final TextView getTvStepValue() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iIiiO(SportDetailFragment r0) {
        return tvAvgSpeedUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iO(SportDetailFragment r0) {
        return spmPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(SportDetailFragment r0) {
        return tvAltitudeUnit_delegate$lambda$0(r0);
    }

    private static final LocationDao mLocationDao_delegate$lambda$0() {
        return MyDb.INSTANCE.getMDatabase().locationDao();
    }

    private static final View pacePanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.pace_panel);
    }

    private static final View pressurePanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.pressure_panel);
    }

    private static final NestedScrollView rootView_delegate$lambda$0(SportDetailFragment r1) {
        return (NestedScrollView) r1.getMView().findViewById(R.id.root_view);
    }

    private static final View speedPanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.speed_panel);
    }

    private static final View spmPanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.spm_panel);
    }

    private static final View stepPanel_delegate$lambda$0(SportDetailFragment r1) {
        return r1.getMView().findViewById(R.id.step_panel);
    }

    private static final TextView tvAirpressureUnit_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_airpressure_unit);
    }

    private static final TextView tvAirpressureValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_airpressure_value);
    }

    private static final TextView tvAltitudeUnit_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_altitude_unit);
    }

    private static final TextView tvAltitudeValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_altitude_value);
    }

    private static final TextView tvAvgHrValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_hr_value);
    }

    private static final TextView tvAvgPaceUnit_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_pace_unit);
    }

    private static final TextView tvAvgPaceValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_pace_value);
    }

    private static final TextView tvAvgSpeedUnit_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_speed_unit);
    }

    private static final TextView tvAvgSpeedValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_speed_value);
    }

    private static final TextView tvAvgSpmValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_spm_value);
    }

    private static final TextView tvCaloriesValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_calories_value);
    }

    private static final TextView tvDateTime_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_dateTime);
    }

    private static final TextView tvDistanceUnit_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_distance_unit);
    }

    private static final TextView tvDistanceValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_distance_value);
    }

    private static final TextView tvDuration_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_duration);
    }

    private static final TextView tvPressureValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_pressure_value);
    }

    private static final TextView tvStepValue_delegate$lambda$0(SportDetailFragment r1) {
        return (TextView) r1.getMView().findViewById(R.id.tv_step_value);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        Serializable r0 = getMArg3();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout");
        this.mWorkout = (Workout) r0;
        LocationDao r1 = getMLocationDao();
        Workout r2 = this.mWorkout;
        Workout r3 = null;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mWorkout");
        r2 = null;
    L5:
        long r4 = r2.getMStart();
        Workout r5 = this.mWorkout;
        if (r5 != null) goto L8;
        Intrinsics.XXO("mWorkout");
        r5 = null;
    L8:
        List<Location> r6 = r1.getLocation(r4, r5.getMEnd());
        if (r6.isEmpty() == false) goto L11;
    L14:
        boolean r7 = true;
    L15:
        this.isLocationEmpty = r7;
        GridLayout r8 = (GridLayout) getMView().findViewById(R.id.gl);
        TextView r9 = getTvDateTime();
        SimpleDateFormat r10 = O0X11OiO.i0X000X0O(false, false, 3, null);
        Workout r11 = this.mWorkout;
        if (r11 != null) goto L18;
        Intrinsics.XXO("mWorkout");
        r11 = null;
    L18:
        r9.setText(r10.format(new Date(r11.getMStart())));
        TextView r12 = getTvDuration();
        Workout r13 = this.mWorkout;
        if (r13 != null) goto L21;
        Intrinsics.XXO("mWorkout");
        r13 = null;
    L21:
        r12.setText(O0X11OiO.iXiX011(r13.getMDuration() * 1000));
        TextView r14 = getTvCaloriesValue();
        Workout r15 = this.mWorkout;
        if (r15 != null) goto L24;
        Intrinsics.XXO("mWorkout");
        r15 = null;
    L24:
        r14.setText(String.valueOf(r15.getMCalorie() / 1000));
        TextView r16 = getTvAvgHrValue();
        Workout r17 = this.mWorkout;
        if (r17 != null) goto L27;
        Intrinsics.XXO("mWorkout");
        r17 = null;
    L27:
        r16.setText(String.valueOf(r17.getMAvgBpm()));
        q62 r18 = q62.OXO1;
        Workout r19 = this.mWorkout;
        if (r19 != null) goto L31;
        Intrinsics.XXO("mWorkout");
        r19 = null;
    L31:
        if (r18.O1XXXX(r19.getMMode()) == false) goto L39;
        TextView r20 = getTvStepValue();
        Workout r21 = this.mWorkout;
        if (r21 != null) goto L35;
        Intrinsics.XXO("mWorkout");
        r21 = null;
    L35:
        r20.setText(String.valueOf(r21.getMStep()));
        TextView r22 = getTvAvgSpmValue();
        Workout r23 = this.mWorkout;
        if (r23 != null) goto L38;
        Intrinsics.XXO("mWorkout");
        r23 = null;
    L38:
        r22.setText(String.valueOf(r23.getMSpm()));
    L40:
        Workout r24 = this.mWorkout;
        if (r24 != null) goto L44;
        Intrinsics.XXO("mWorkout");
        r24 = null;
    L44:
        if (q62.X0XI11I(r18, r24.getMMode(), false, 2, null) == false) goto L63;
        TextView r25 = getTvDistanceValue();
        Workout r26 = this.mWorkout;
        if (r26 != null) goto L48;
        Intrinsics.XXO("mWorkout");
        r26 = null;
    L48:
        r25.setText(String.valueOf(cp5.X1ii(r26.getMDistance(), this.userProfile.getUnit(), false, 4, null)));
        getTvDistanceUnit().setText(getString(cp5.XX0(this.userProfile.getUnit())));
        TextView r27 = getTvAvgSpeedValue();
        Workout r28 = this.mWorkout;
        if (r28 != null) goto L51;
        Intrinsics.XXO("mWorkout");
        r28 = null;
    L51:
        r27.setText(String.valueOf(cp5.i11I(((double) r28.getMSpeed()) / 1000.0d, this.userProfile.getUnit())));
        TextView r29 = getTvAvgSpeedUnit();
        if (this.userProfile.getUnit() != 0) goto L54;
        int r30 = R.string.km_h;
    L55:
        r29.setText(getString(r30));
        TextView r31 = getTvAvgPaceValue();
        Workout r32 = this.mWorkout;
        if (r32 != null) goto L58;
        Intrinsics.XXO("mWorkout");
        r32 = null;
    L58:
        r31.setText(cp5.Ii1iii0(r32.getMPace(), this.userProfile.getUnit()));
        TextView r33 = getTvAvgPaceUnit();
        if (this.userProfile.getUnit() != 0) goto L61;
        int r34 = R.string.pace_km;
    L62:
        r33.setText(getString(r34));
    L64:
        Workout r35 = this.mWorkout;
        if (r35 != null) goto L68;
        Intrinsics.XXO("mWorkout");
        r35 = null;
    L68:
        if (r18.I1XXi1Oi(r35.getMMode(), true ^ this.isLocationEmpty) == false) goto L77;
        TextView r36 = getTvAltitudeValue();
        Workout r37 = this.mWorkout;
        if (r37 != null) goto L72;
        Intrinsics.XXO("mWorkout");
        r37 = null;
    L72:
        r36.setText(cp5.iIXi1iiXI(r37.getMAltitude(), this.userProfile.getUnit()));
        TextView r38 = getTvAltitudeUnit();
        if (this.userProfile.getUnit() != 0) goto L75;
        int r39 = R.string.m;
    L76:
        r38.setText(getString(r39));
    L78:
        Workout r40 = this.mWorkout;
        if (r40 != null) goto L82;
        Intrinsics.XXO("mWorkout");
        r40 = null;
    L82:
        if (r40.getMAirPressure() == 0) goto L98;
        TextView r41 = getTvAirpressureValue();
        if (this.userProfile.getUnit() != 0) goto L89;
        Workout r42 = this.mWorkout;
        if (r42 != null) goto L88;
        Intrinsics.XXO("mWorkout");
        r42 = null;
    L88:
        int r43 = r42.getMAirPressure();
    L93:
        r41.setText(String.valueOf(r43));
        TextView r44 = getTvAirpressureUnit();
        if (this.userProfile.getUnit() != 0) goto L96;
        int r45 = R.string.kpa;
    L97:
        r44.setText(getString(r45));
    L99:
        Workout r46 = this.mWorkout;
        if (r46 != null) goto L103;
        Intrinsics.XXO("mWorkout");
        r46 = null;
    L103:
        if (r18.OOX(r46.getMMode()) == false) goto L110;
        TextView r47 = getTvPressureValue();
        Workout r48 = this.mWorkout;
        if (r48 != null) goto L107;
        Intrinsics.XXO("mWorkout");
    L108:
        r47.setText(String.valueOf(r3.getMAvgStress()));
        return;
    L107:
        r3 = r48;
        goto L108
    L110:
        r8.removeView(getPressurePanel());
        return;
    L96:
        r45 = R.string.psi;
        goto L97
    L89:
        Workout r49 = this.mWorkout;
        if (r49 != null) goto L92;
        Intrinsics.XXO("mWorkout");
        r49 = null;
    L92:
        r43 = (int) cp5.X0i1O(r49.getMAirPressure());
        goto L93
    L98:
        r8.removeView(getAirpressurePanel());
        goto L99
    L75:
        r39 = R.string.yd;
        goto L76
    L77:
        r8.removeView(getAltitudePanel());
        goto L78
    L61:
        r34 = R.string.pace_mi;
        goto L62
    L54:
        r30 = R.string.mi_h;
        goto L55
    L63:
        r8.removeView(getDistancePanel());
        r8.removeView(getSpeedPanel());
        r8.removeView(getPacePanel());
        goto L64
    L39:
        r8.removeView(getStepPanel());
        r8.removeView(getSpmPanel());
        goto L40
    L11:
        if (r6.size() < 2) goto L14;
        r7 = false;
        goto L15
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_sport_detail;
    }

    public final void share() {
        XIi1i01O r0 = XIi1i01O.OXO1;
        NestedScrollView r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        ImageUtils.save(r0.iO(r1), uz0.XOX0O0(sz0.OXO1), Bitmap.CompressFormat.PNG);
    }
}
