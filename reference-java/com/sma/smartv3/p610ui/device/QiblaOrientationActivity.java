package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1Xi1i0;
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
import com.sma.smartv3.p610ui.device.QiblaOrientationActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaOrientationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,225:1\n18#2,2:226\n15#2:228\n90#2:229\n*S KotlinDebug\n*F\n+ 1 QiblaOrientationActivity.kt\ncom/sma/smartv3/ui/device/QiblaOrientationActivity\n*L\n46#1:226,2\n46#1:228\n79#1:229\n*E\n"})
public final class QiblaOrientationActivity extends BaseActivity {
    private boolean isVibrate;

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
    private final Lazy bgQibla$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.bgQibla_delegate$lambda$0(this.f5688IO);
        }
    });

    @aa1
    private final Lazy tvQiblaAngle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.tvQiblaAngle_delegate$lambda$0(this.f5931IO);
        }
    });

    @aa1
    private final Lazy ivQiblaArrow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.ivQiblaArrow_delegate$lambda$0(this.f6149IO);
        }
    });

    @aa1
    private final Lazy ivQiblaDial$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.ivQiblaDial_delegate$lambda$0(this.f6362IO);
        }
    });

    @aa1
    private final Lazy tvAddress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.tvAddress_delegate$lambda$0(this.f6598IO);
        }
    });

    @aa1
    private final Lazy tvCal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.tvCal_delegate$lambda$0(this.f6834IO);
        }
    });

    @aa1
    private final Lazy tvNextTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.tvNextTime_delegate$lambda$0(this.f7065IO);
        }
    });

    @aa1
    private final Lazy tvAngleBig$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i92
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaOrientationActivity.tvAngleBig_delegate$lambda$0(this.f7774IO);
        }
    });

    public static final class OXO1 implements i1Xi1i0.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.i1Xi1i0.XIi00iiXO
        public void OXO1(float f) {
            QiblaOrientationActivity.this.adjustQiblaDial(f);
            QiblaOrientationActivity.this.adjustQiblaArrow(f);
        }
    }

    public QiblaOrientationActivity() {
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        this.mPrayerTimeSettings = (PrayerTimeSettings) (objFromJson == null ? PrayerTimeSettings.class.newInstance() : objFromJson);
        this.mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0L, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustQiblaArrow(float f) {
        RotateAnimation rotateAnimation = new RotateAnimation((-this.mCurAzimuth) + this.mQiblaDegree, -f, 1, 0.5f, 1, 0.5f);
        this.mCurAzimuth = f;
        rotateAnimation.setDuration(500L);
        rotateAnimation.setRepeatCount(0);
        rotateAnimation.setFillAfter(true);
        getIvQiblaArrow().startAnimation(rotateAnimation);
        showQiblaArrowDegree();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustQiblaDial(float f) {
        RotateAnimation rotateAnimation = new RotateAnimation(-this.mCurAzimuth, -f, 1, 0.5f, 1, 0.5f);
        this.mCurAzimuth = f;
        rotateAnimation.setDuration(500L);
        rotateAnimation.setRepeatCount(0);
        rotateAnimation.setFillAfter(true);
        getIvQiblaDial().startAnimation(rotateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup bgQibla_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (ViewGroup) qiblaOrientationActivity.findViewById(R.id.qibla_panel);
    }

    private final double calculateQiblaDegree(double d, double d2, double d3, double d4) {
        double d5 = d * 0.017453292519943295d;
        double d6 = d3 * 0.017453292519943295d;
        double d7 = (d4 - d2) * 0.017453292519943295d;
        double degrees = Math.toDegrees(Math.atan2(Math.sin(d7) * Math.cos(d6), (Math.cos(d5) * Math.sin(d6)) - ((Math.sin(d5) * Math.cos(d6)) * Math.cos(d7))));
        return degrees < 0.0d ? degrees + ((double) 360) : degrees;
    }

    private final ViewGroup getBgQibla() {
        return (ViewGroup) this.bgQibla$delegate.getValue();
    }

    private final ImageView getIvQiblaArrow() {
        return (ImageView) this.ivQiblaArrow$delegate.getValue();
    }

    private final ImageView getIvQiblaDial() {
        return (ImageView) this.ivQiblaDial$delegate.getValue();
    }

    private final TextView getTvAddress() {
        return (TextView) this.tvAddress$delegate.getValue();
    }

    private final TextView getTvAngleBig() {
        return (TextView) this.tvAngleBig$delegate.getValue();
    }

    private final TextView getTvCal() {
        return (TextView) this.tvCal$delegate.getValue();
    }

    private final TextView getTvNextTime() {
        return (TextView) this.tvNextTime$delegate.getValue();
    }

    private final TextView getTvQiblaAngle() {
        return (TextView) this.tvQiblaAngle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(View view) {
        BleInitializer.f51208IO.onRequestAgpsPrerequisite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivQiblaArrow_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (ImageView) qiblaOrientationActivity.findViewById(R.id.iv_qibla_arrow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivQiblaDial_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (ImageView) qiblaOrientationActivity.findViewById(R.id.iv_qibla_dial);
    }

    private final void showQiblaArrowDegree() {
        float f = 360;
        float f2 = f - this.mCurAzimuth;
        int i = this.mQiblaDegree;
        float f3 = (f2 + i) % f;
        float f4 = 360 - i;
        float f5 = f3 < f4 ? f - (f4 - f3) : f3 - f4;
        getTvQiblaAngle().setText(((int) f5) + "°");
        if (f3 <= 355.0f && f3 >= 5.0f) {
            this.isVibrate = false;
            getBgQibla().setBackgroundResource(R.drawable.pic_qibla_n_bg);
        } else {
            if (this.isVibrate) {
                return;
            }
            VibrateUtils.vibrate(100L);
            this.isVibrate = true;
            getBgQibla().setBackgroundResource(R.drawable.pic_qibla_bg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAddress_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (TextView) qiblaOrientationActivity.findViewById(R.id.tv_address);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvAngleBig_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (TextView) qiblaOrientationActivity.findViewById(R.id.tv_angle_big);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCal_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (TextView) qiblaOrientationActivity.findViewById(R.id.tv_cal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNextTime_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (TextView) qiblaOrientationActivity.findViewById(R.id.tv_next_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvQiblaAngle_delegate$lambda$0(QiblaOrientationActivity qiblaOrientationActivity) {
        return (TextView) qiblaOrientationActivity.findViewById(R.id.tv_qibla_angle);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.qibla_orientaiton);
        i1Xi1i0 i1xi1i0 = new i1Xi1i0(this);
        this.mCompass = i1xi1i0;
        i1xi1i0.m2028iO(new OXO1());
        getTvAddress().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.j92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QiblaOrientationActivity.initView$lambda$0(view);
            }
        });
        SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (weatherRealtime != null) {
            getTvAddress().setText(weatherRealtime.getName());
        }
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qibla_orientation;
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        CustomLocation customLocationXXIIO1i11 = UtilsKt.XXIIO1i11();
        this.mLocation = customLocationXXIIO1i11;
        this.mQiblaDegree = (int) calculateQiblaDegree(customLocationXXIIO1i11.XO0O10(), this.mLocation.IiI10X(), 21.422507d, 39.826209d);
        getTvAngleBig().setText(this.mQiblaDegree + "°");
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        this.mPrayerTimeData = PrayerTimesKt.getPrayerTimeMap(this.mPrayerTimeSettings, this.mLocation.XO0O10(), this.mLocation.IiI10X(), O0X11OiO.XiOIii1(calendar), (16 & 16) != 0 ? 31 : 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        PrayerTime.Companion companion = PrayerTime.Companion;
        Map<Long, ? extends List<PrayerTime>> map = this.mPrayerTimeData;
        if (map == null) {
            Intrinsics.XXO("mPrayerTimeData");
            map = null;
        }
        PrayerTime prayerTimeFindNextTime = companion.findNextTime(map, jCurrentTimeMillis);
        this.mNextPrayerTime = prayerTimeFindNextTime;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        CustomLocation customLocation = this.mLocation;
        int i = this.mQiblaDegree;
        Map<Long, ? extends List<PrayerTime>> map2 = this.mPrayerTimeData;
        if (map2 == null) {
            Intrinsics.XXO("mPrayerTimeData");
            map2 = null;
        }
        i1o0oxo1o.OXO1("onLocationInfoChange " + customLocation + " " + i + " " + prayerTimeFindNextTime + ", " + map2);
        if (this.mNextPrayerTime != null) {
            TextView tvNextTime = getTvNextTime();
            PrayerTime prayerTime = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime);
            String string = getString(prayerTime.getTimeName(getMContext()));
            PrayerTime prayerTime2 = this.mNextPrayerTime;
            Intrinsics.XXI(prayerTime2);
            tvNextTime.setText(string + " " + prayerTime2.getTimeString());
        }
        getTvCal().setText(O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(jCurrentTimeMillis)));
        getTvCal().setText(O0X11OiO.I1XOi1(System.currentTimeMillis(), 0, 2, null) + " (" + O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(jCurrentTimeMillis)) + I000IiI1O.C2156iO.f1007iO);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i1Xi1i0 i1xi1i0 = this.mCompass;
        if (i1xi1i0 != null) {
            i1xi1i0.O00();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        i1Xi1i0 i1xi1i0 = this.mCompass;
        if (i1xi1i0 != null) {
            i1xi1i0.XO0O10();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        i1Xi1i0 i1xi1i0 = this.mCompass;
        if (i1xi1i0 != null) {
            i1xi1i0.XO0O10();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        i1Xi1i0 i1xi1i0 = this.mCompass;
        if (i1xi1i0 != null) {
            i1xi1i0.O00();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
