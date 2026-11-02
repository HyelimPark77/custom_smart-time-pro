package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OXO1;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.ActivityDao;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.CaloriesActivity;
import com.sma.smartv3.p610ui.status.DistanceActivity;
import com.sma.smartv3.p610ui.status.Weather2Activity;
import com.sma.smartv3.p610ui.status.WeatherActivity;
import com.sma.smartv3.p610ui.status.item.MainStepItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleWeather;
import com.szabh.smable3.entity.BleWeather2;
import com.szabh.smable3.entity.BleWeatherRealtime;
import com.szabh.smable3.entity.BleWeatherRealtime2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainStepItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,195:1\n19#2:196\n15#2:197\n*S KotlinDebug\n*F\n+ 1 MainStepItem.kt\ncom/sma/smartv3/ui/status/item/MainStepItem\n*L\n99#1:196\n99#1:197\n*E\n"})
public class MainStepItem extends BaseDslItem {

    @tb1
    private Activity activity;
    public PFMedium distanceUnit;
    private ImageView ivWeather;
    public Context mContext;
    private DINCondBold tvCalorie;
    private DINCondBold tvDistance;
    public DINCondBold tvTemperature;
    public DINCondBold tvWeatherTime;
    public AppUser userProfile;

    @aa1
    private final ActivityDao mActivityDao = MyDb.INSTANCE.getMDatabase().activityDao();
    private final boolean initEvent = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MainStepItem mainStepItem, View view) {
        if (w85.OXO1.OXO1()) {
            ContextCompat.startActivity(mainStepItem.getMContext(), new Intent(mainStepItem.getMContext(), (Class<?>) CaloriesActivity.class), new Bundle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(MainStepItem mainStepItem, View view) {
        if (w85.OXO1.OXO1()) {
            ContextCompat.startActivity(mainStepItem.getMContext(), new Intent(mainStepItem.getMContext(), (Class<?>) DistanceActivity.class), new Bundle());
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.tvCalorie);
        Intrinsics.XXI(viewM3483v);
        this.tvCalorie = (DINCondBold) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.tvDistance);
        Intrinsics.XXI(viewM3483v2);
        this.tvDistance = (DINCondBold) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.ivWeather);
        Intrinsics.XXI(viewM3483v3);
        this.ivWeather = (ImageView) viewM3483v3;
        DINCondBold dINCondBold = null;
        if (i72.OXO1.IiX1ii()) {
            ImageView imageView = this.ivWeather;
            if (imageView == null) {
                Intrinsics.XXO("ivWeather");
                imageView = null;
            }
            Object parent = imageView.getParent();
            Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.s30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10959IO.weatherDetailsEvent();
                }
            });
        }
        View viewM3483v4 = itemHolder.m3483v(R.id.tvTemperature);
        Intrinsics.XXI(viewM3483v4);
        setTvTemperature((DINCondBold) viewM3483v4);
        View viewM3483v5 = itemHolder.m3483v(R.id.tvWeatherTime);
        Intrinsics.XXI(viewM3483v5);
        setTvWeatherTime((DINCondBold) viewM3483v5);
        View viewM3483v6 = itemHolder.m3483v(R.id.distanceUnit);
        Intrinsics.XXI(viewM3483v6);
        setDistanceUnit((PFMedium) viewM3483v6);
        DINCondBold dINCondBold2 = this.tvCalorie;
        if (dINCondBold2 == null) {
            Intrinsics.XXO("tvCalorie");
        } else {
            dINCondBold = dINCondBold2;
        }
        Context context = dINCondBold.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
        View view = itemHolder.view(R.id.llCalories);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.t30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainStepItem.bindView$lambda$1(this.f11182IO, view2);
                }
            });
        }
        View view2 = itemHolder.view(R.id.llDistance);
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.u30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    MainStepItem.bindView$lambda$2(this.f11416IO, view3);
                }
            });
        }
    }

    @tb1
    public final Activity getActivity() {
        return this.activity;
    }

    @aa1
    public final PFMedium getDistanceUnit() {
        PFMedium pFMedium = this.distanceUnit;
        if (pFMedium != null) {
            return pFMedium;
        }
        Intrinsics.XXO("distanceUnit");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public final DINCondBold getTvTemperature() {
        DINCondBold dINCondBold = this.tvTemperature;
        if (dINCondBold != null) {
            return dINCondBold;
        }
        Intrinsics.XXO("tvTemperature");
        return null;
    }

    @aa1
    public final DINCondBold getTvWeatherTime() {
        DINCondBold dINCondBold = this.tvWeatherTime;
        if (dINCondBold != null) {
            return dINCondBold;
        }
        Intrinsics.XXO("tvWeatherTime");
        return null;
    }

    @aa1
    public final AppUser getUserProfile() {
        AppUser appUser = this.userProfile;
        if (appUser != null) {
            return appUser;
        }
        Intrinsics.XXO("userProfile");
        return null;
    }

    @aa1
    public String getWeatherDateTimeString() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jCurrentTimeMillis = a01.OXO1.m1440iO().getLong(b01.iIXi1iiXI, System.currentTimeMillis());
        } catch (Exception unused) {
        }
        String str = O0X11OiO.m792X1(false, 1, null).format(Long.valueOf(jCurrentTimeMillis));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        setUserProfile((AppUser) appUser);
        updateActivity();
        updateWeather();
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_step;
    }

    @sf5(tag = I01XX0.OXO1)
    public final void onActivityChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onActivityChanged");
        updateActivity();
    }

    @sf5(tag = I01XX0.IiiXiI0I)
    public final void onUnitChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onUnitChange");
        initView();
    }

    @sf5(tag = I01XX0.f1084IO)
    public final void onWeatherRealtimeChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onWeatherRealtimeChanged");
        updateWeather();
    }

    public final void setActivity(@tb1 Activity activity) {
        this.activity = activity;
    }

    public final void setDistanceUnit(@aa1 PFMedium pFMedium) {
        Intrinsics.X0O(pFMedium, "<set-?>");
        this.distanceUnit = pFMedium;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setTvTemperature(@aa1 DINCondBold dINCondBold) {
        Intrinsics.X0O(dINCondBold, "<set-?>");
        this.tvTemperature = dINCondBold;
    }

    public final void setTvWeatherTime(@aa1 DINCondBold dINCondBold) {
        Intrinsics.X0O(dINCondBold, "<set-?>");
        this.tvWeatherTime = dINCondBold;
    }

    public final void setUserProfile(@aa1 AppUser appUser) {
        Intrinsics.X0O(appUser, "<set-?>");
        this.userProfile = appUser;
    }

    public void updateActivity() {
        getDistanceUnit().setText(cp5.XX0(getUserProfile().getUnit()));
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null);
        Activity activity = this.mActivityDao.getActivity(jArrIOOX010X[0], jArrIOOX010X[1]);
        if (activity == null) {
            activity = new Activity(0, 0L, null, 0, 0, 0, 0, 0, 0, 0, 1023, null);
        }
        this.activity = activity;
        DINCondBold dINCondBold = this.tvCalorie;
        if (dINCondBold == null) {
            Intrinsics.XXO("tvCalorie");
            dINCondBold = null;
        }
        Activity activity2 = this.activity;
        Intrinsics.XXI(activity2);
        dINCondBold.setText(String.valueOf(activity2.getMCalorie() / 10000));
        DINCondBold dINCondBold2 = this.tvDistance;
        if (dINCondBold2 == null) {
            Intrinsics.XXO("tvDistance");
            dINCondBold2 = null;
        }
        Activity activity3 = this.activity;
        Intrinsics.XXI(activity3);
        dINCondBold2.setText(cp5.IIX1OXO(activity3.getMDistance() / 10000, getUserProfile().getUnit(), false, 4, null));
        if (q62.OXO1.O00OXOXO() && a01.OXO1.IiI10X().getBoolean(b01.IXI, true)) {
            OXO1 OXO1 = OXO1.XOO0ii0.OXO1();
            Activity activity4 = this.activity;
            Intrinsics.XXI(activity4);
            int mStep = activity4.getMStep();
            Activity activity5 = this.activity;
            Intrinsics.XXI(activity5);
            OXO1.I1XOi1(OXO1, mStep, activity5.getMCalorie() / 10000, null, 4, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[PHI: r6
  0x0059: PHI (r6v5 int) = (r6v2 int), (r6v11 int) binds: [B:29:0x007d, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    public void updateWeather() {
        int mWeatherCode;
        int mCurrentTemperature;
        boolean z;
        q62 q62Var = q62.OXO1;
        ImageView imageView = null;
        if (q62Var.iiX0i1IX()) {
            i72 i72Var = i72.OXO1;
            if (i72Var.m2043IX()) {
                ImageView imageView2 = this.ivWeather;
                if (imageView2 == null) {
                    Intrinsics.XXO("ivWeather");
                    imageView2 = null;
                }
                Object parent = imageView2.getParent();
                Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.View");
                ((View) parent).setVisibility(0);
                if (q62Var.i0IX1()) {
                    BleWeatherRealtime2 bleWeatherRealtime2 = (BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
                    if (bleWeatherRealtime2 != null) {
                        BleWeather2 mWeather = bleWeatherRealtime2.getMWeather();
                        mWeatherCode = mWeather != null ? mWeather.getMWeatherCode() : 0;
                        BleWeather2 mWeather2 = bleWeatherRealtime2.getMWeather();
                        if (mWeather2 != null) {
                            mCurrentTemperature = mWeather2.getMCurrentTemperature();
                        } else {
                            mCurrentTemperature = 0;
                        }
                        z = true;
                    } else {
                        mCurrentTemperature = 0;
                        mWeatherCode = 0;
                        z = false;
                    }
                } else {
                    BleWeatherRealtime bleWeatherRealtime = (BleWeatherRealtime) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null);
                    if (bleWeatherRealtime != null) {
                        BleWeather mWeather3 = bleWeatherRealtime.getMWeather();
                        mWeatherCode = mWeather3 != null ? mWeather3.getMWeatherCode() : 0;
                        BleWeather mWeather4 = bleWeatherRealtime.getMWeather();
                        if (mWeather4 != null) {
                            mCurrentTemperature = mWeather4.getMCurrentTemperature();
                        } else {
                            mCurrentTemperature = 0;
                        }
                        z = true;
                    } else {
                        mCurrentTemperature = 0;
                        mWeatherCode = 0;
                        z = false;
                    }
                }
                if (!z) {
                    ImageView imageView3 = this.ivWeather;
                    if (imageView3 == null) {
                        Intrinsics.XXO("ivWeather");
                    } else {
                        imageView = imageView3;
                    }
                    imageView.setImageResource(R.drawable.ic_weather0);
                    getTvTemperature().setVisibility(4);
                    getTvWeatherTime().setVisibility(4);
                    return;
                }
                ImageView imageView4 = this.ivWeather;
                if (imageView4 == null) {
                    Intrinsics.XXO("ivWeather");
                } else {
                    imageView = imageView4;
                }
                imageView.setImageResource(UtilsKt.iOiXi11II(getMContext(), mWeatherCode));
                getTvTemperature().setText(cp5.II1Xi0(getUserProfile().getUnit()) == 1 ? getMContext().getString(R.string.d_fahrenheit_centigrade, Float.valueOf(cp5.I0iXXO(mCurrentTemperature))) : getMContext().getString(R.string.d_degree_centigrade, Integer.valueOf(mCurrentTemperature)));
                getTvTemperature().setVisibility(0);
                if (i72Var.IXiOXO()) {
                    getTvWeatherTime().setText(getWeatherDateTimeString());
                    getTvWeatherTime().setVisibility(0);
                    return;
                }
                return;
            }
        }
        ImageView imageView5 = this.ivWeather;
        if (imageView5 == null) {
            Intrinsics.XXO("ivWeather");
        } else {
            imageView = imageView5;
        }
        Object parent2 = imageView.getParent();
        Intrinsics.X1ii(parent2, "null cannot be cast to non-null type android.view.View");
        ((View) parent2).setVisibility(8);
    }

    public final void weatherDetailsEvent() {
        if (q62.OXO1.i0IX1()) {
            if (((BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null)) != null) {
                ContextCompat.startActivity(getMContext(), new Intent(getMContext(), (Class<?>) Weather2Activity.class), new Bundle());
                return;
            } else {
                ToastUtils.showLong(R.string.no_weather);
                return;
            }
        }
        if (((BleWeatherRealtime) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null)) != null) {
            ContextCompat.startActivity(getMContext(), new Intent(getMContext(), (Class<?>) WeatherActivity.class), new Bundle());
        } else {
            ToastUtils.showLong(R.string.no_weather);
        }
    }
}
