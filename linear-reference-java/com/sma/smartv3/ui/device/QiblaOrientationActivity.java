package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b92;
import com.android.mltcode.paycertificationapi.c92;
import com.android.mltcode.paycertificationapi.d92;
import com.android.mltcode.paycertificationapi.e92;
import com.android.mltcode.paycertificationapi.f92;
import com.android.mltcode.paycertificationapi.g92;
import com.android.mltcode.paycertificationapi.h92;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1Xi1i0;
import com.android.mltcode.paycertificationapi.i92;
import com.android.mltcode.paycertificationapi.j92;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.VibrateUtils;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayerTime;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaOrientationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,225:1\n18#2,2:226\n15#2:228\n90#2:229\n*S KotlinDebug\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n*L\n46#1:226,2\n46#1:228\n79#1:229\n*E\n"})
public final class QiblaOrientationActivity extends BaseActivity {

    @aa1
    private final Lazy bgQibla$delegate;
    private boolean isVibrate;

    @aa1
    private final Lazy ivQiblaArrow$delegate;

    @aa1
    private final Lazy ivQiblaDial$delegate;

    @tb1
    private i1Xi1i0 mCompass;
    private float mCurAzimuth;

    @aa1
    private CustomLocation mLocation;

    @tb1
    private PrayerTime mNextPrayerTime;
    private Map<Long, ? extends List<PrayerTime>> mPrayerTimeData;

    @aa1
    private final PrayerTimeSettings mPrayerTimeSettings;
    private int mQiblaDegree;

    @aa1
    private final Lazy tvAddress$delegate;

    @aa1
    private final Lazy tvAngleBig$delegate;

    @aa1
    private final Lazy tvCal$delegate;

    @aa1
    private final Lazy tvNextTime$delegate;

    @aa1
    private final Lazy tvQiblaAngle$delegate;

    public static final class OXO1 implements i1Xi1i0.XIi00iiXO {
        public final /* synthetic */ QiblaOrientationActivity OXO1;

        public OXO1(QiblaOrientationActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1Xi1i0.XIi00iiXO
        public void OXO1(float r2) {
            QiblaOrientationActivity.access$adjustQiblaDial(this.OXO1, r2);
            QiblaOrientationActivity.access$adjustQiblaArrow(this.OXO1, r2);
        }
    }

    public QiblaOrientationActivity() {
        this.bgQibla$delegate = LazyKt__LazyJVMKt.iO(new b92(this));
        this.tvQiblaAngle$delegate = LazyKt__LazyJVMKt.iO(new c92(this));
        this.ivQiblaArrow$delegate = LazyKt__LazyJVMKt.iO(new d92(this));
        this.ivQiblaDial$delegate = LazyKt__LazyJVMKt.iO(new e92(this));
        this.tvAddress$delegate = LazyKt__LazyJVMKt.iO(new f92(this));
        this.tvCal$delegate = LazyKt__LazyJVMKt.iO(new g92(this));
        this.tvNextTime$delegate = LazyKt__LazyJVMKt.iO(new h92(this));
        this.tvAngleBig$delegate = LazyKt__LazyJVMKt.iO(new i92(this));
        SPUtils r1 = a01.OXO1.OXO1();
        Object r2 = new Gson().fromJson(r1.getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r2 != null) goto L5;
        r2 = PrayerTimeSettings.class.newInstance();
    L5:
        this.mPrayerTimeSettings = (PrayerTimeSettings) r2;
        this.mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    public static /* synthetic */ ImageView I0iXXO(QiblaOrientationActivity r0) {
        return ivQiblaArrow_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(QiblaOrientationActivity r0) {
        return tvQiblaAngle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(QiblaOrientationActivity r0) {
        return tvAddress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewGroup O10IXXX0X(QiblaOrientationActivity r0) {
        return bgQibla_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(QiblaOrientationActivity r0) {
        return tvCal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(QiblaOrientationActivity r0) {
        return tvAngleBig_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1ii(QiblaOrientationActivity r0) {
        return ivQiblaDial_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(QiblaOrientationActivity r0) {
        return tvNextTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(View r0) {
        initView$lambda$0(r0);
    }

    public static final /* synthetic */ void access$adjustQiblaArrow(QiblaOrientationActivity r0, float r1) {
        r0.adjustQiblaArrow(r1);
    }

    public static final /* synthetic */ void access$adjustQiblaDial(QiblaOrientationActivity r0, float r1) {
        r0.adjustQiblaDial(r1);
    }

    private final void adjustQiblaArrow(float r8) {
        RotateAnimation r0 = new RotateAnimation((-this.mCurAzimuth) + this.mQiblaDegree, -r8, 1, 0.5f, 1, 0.5f);
        this.mCurAzimuth = r8;
        r0.setDuration(500);
        r0.setRepeatCount(0);
        r0.setFillAfter(true);
        getIvQiblaArrow().startAnimation(r0);
        showQiblaArrowDegree();
    }

    private final void adjustQiblaDial(float r8) {
        RotateAnimation r0 = new RotateAnimation(-this.mCurAzimuth, -r8, 1, 0.5f, 1, 0.5f);
        this.mCurAzimuth = r8;
        r0.setDuration(500);
        r0.setRepeatCount(0);
        r0.setFillAfter(true);
        getIvQiblaDial().startAnimation(r0);
    }

    private static final ViewGroup bgQibla_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (ViewGroup) r1.findViewById(R.id.qibla_panel);
    }

    private final double calculateQiblaDegree(double r5, double r7, double r9, double r11) {
        double r6 = r5 * 0.017453292519943295d;
        double r10 = r9 * 0.017453292519943295d;
        double r12 = (r11 - r7) * 0.017453292519943295d;
        double r8 = Math.toDegrees(Math.atan2(Math.sin(r12) * Math.cos(r10), (Math.cos(r6) * Math.sin(r10)) - ((Math.sin(r6) * Math.cos(r10)) * Math.cos(r12))));
        if (r8 < 0.0d) goto L5;
        return r8;
    L5:
        return r8 + ((double) 360);
    }

    private final ViewGroup getBgQibla() {
        return (ViewGroup) getValue();
    }

    private final ImageView getIvQiblaArrow() {
        return (ImageView) getValue();
    }

    private final ImageView getIvQiblaDial() {
        return (ImageView) getValue();
    }

    private final TextView getTvAddress() {
        return (TextView) getValue();
    }

    private final TextView getTvAngleBig() {
        return (TextView) getValue();
    }

    private final TextView getTvCal() {
        return (TextView) getValue();
    }

    private final TextView getTvNextTime() {
        return (TextView) getValue();
    }

    private final TextView getTvQiblaAngle() {
        return (TextView) getValue();
    }

    private static final void initView$lambda$0(View r0) {
        BleInitializer.IO.onRequestAgpsPrerequisite();
    }

    private static final ImageView ivQiblaArrow_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_qibla_arrow);
    }

    private static final ImageView ivQiblaDial_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_qibla_dial);
    }

    private final void showQiblaArrowDegree() {
        float r1 = 360;
        float r2 = r1 - this.mCurAzimuth;
        int r3 = this.mQiblaDegree;
        float r4 = (r2 + r3) % r1;
        float r0 = 360 - r3;
        if (r4 >= r0) goto L5;
        float r5 = r1 - (r0 - r4);
    L6:
        getTvQiblaAngle().setText(((int) r5) + "°");
        if (r4 > 355.0f) goto L14;
        if (r4 < 5.0f) goto L14;
        this.isVibrate = false;
        getBgQibla().setBackgroundResource(R.drawable.pic_qibla_n_bg);
        return;
    L14:
        if (this.isVibrate == true) goto L17;
        VibrateUtils.vibrate(100);
        this.isVibrate = true;
        getBgQibla().setBackgroundResource(R.drawable.pic_qibla_bg);
        return;
    L17:
        return;
    L5:
        r5 = r4 - r0;
        goto L6
    }

    private static final TextView tvAddress_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_address);
    }

    private static final TextView tvAngleBig_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_angle_big);
    }

    private static final TextView tvCal_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_cal);
    }

    private static final TextView tvNextTime_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_next_time);
    }

    private static final TextView tvQiblaAngle_delegate$lambda$0(QiblaOrientationActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_qibla_angle);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.qibla_orientaiton);
        i1Xi1i0 r0 = new i1Xi1i0(this);
        this.mCompass = r0;
        r0.iO(new OXO1(this));
        getTvAddress().setOnClickListener(new j92());
        SPUtils r1 = a01.OXO1.OXO1();
        WeatherRealtime r2 = (WeatherRealtime) new Gson().fromJson(r1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r2 == null) goto L5;
        getTvAddress().setText(r2.getName());
    L5:
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qibla_orientation;
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object r13) {
        Intrinsics.X0O(r13, "data");
        CustomLocation r14 = UtilsKt.XXIIO1i11();
        this.mLocation = r14;
        this.mQiblaDegree = (int) calculateQiblaDegree(r14.XO0O10(), this.mLocation.IiI10X(), 21.422507d, 39.826209d);
        getTvAngleBig().setText(this.mQiblaDegree + "°");
        Calendar r15 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r15, "getInstance(...)");
        this.mPrayerTimeData = PrayerTimesKt.getPrayerTimeMap$default(this.mPrayerTimeSettings, this.mLocation.XO0O10(), this.mLocation.IiI10X(), O0X11OiO.XiOIii1(r15), 0, 16, null);
        long r1 = System.currentTimeMillis();
        PrayerTime.Companion r16 = PrayerTime.Companion;
        Map<Long, ? extends List<PrayerTime>> r3 = this.mPrayerTimeData;
        if (r3 != null) goto L5;
        Intrinsics.XXO("mPrayerTimeData");
        r3 = null;
    L5:
        PrayerTime r17 = r16.findNextTime(r3, r1);
        this.mNextPrayerTime = r17;
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        CustomLocation r6 = this.mLocation;
        int r7 = this.mQiblaDegree;
        Map<Long, ? extends List<PrayerTime>> r8 = this.mPrayerTimeData;
        if (r8 != null) goto L8;
        Intrinsics.XXO("mPrayerTimeData");
        r8 = null;
    L8:
        r4.OXO1("onLocationInfoChange " + r6 + " " + r7 + " " + r17 + ", " + r8);
        if (this.mNextPrayerTime == null) goto L11;
        TextView r18 = getTvNextTime();
        PrayerTime r5 = this.mNextPrayerTime;
        Intrinsics.XXI(r5);
        String r9 = getString(r5.getTimeName(getMContext()));
        PrayerTime r10 = this.mNextPrayerTime;
        Intrinsics.XXI(r10);
        r18.setText(r9 + " " + r10.getTimeString());
    L11:
        getTvCal().setText(O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(r1)));
        getTvCal().setText(O0X11OiO.I1XOi1(System.currentTimeMillis(), 0, 2, null) + " (" + O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(r1)) + I000IiI1O.iO.iO);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i1Xi1i0 r0 = this.mCompass;
        if (r0 == null) goto L6;
        r0.O00();
        return;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i1Xi1i0 r0 = this.mCompass;
        if (r0 == null) goto L6;
        r0.XO0O10();
        return;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        i1Xi1i0 r0 = this.mCompass;
        if (r0 == null) goto L6;
        r0.XO0O10();
        return;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        i1Xi1i0 r0 = this.mCompass;
        if (r0 == null) goto L6;
        r0.O00();
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
