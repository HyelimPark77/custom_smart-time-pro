package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p610ui.device.MeasureUnitSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMeasureUnitSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureUnitSettingsActivity.kt\ncom/sma/smartv3/ui/device/MeasureUnitSettingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,118:1\n19#2:119\n15#2:120\n19#2:121\n15#2:122\n11#2,2:123\n*S KotlinDebug\n*F\n+ 1 MeasureUnitSettingsActivity.kt\ncom/sma/smartv3/ui/device/MeasureUnitSettingsActivity\n*L\n39#1:119\n39#1:120\n69#1:121\n69#1:122\n73#1:123,2\n*E\n"})
public final class MeasureUnitSettingsActivity extends BaseActivity {

    @aa1
    private AppUser mAppUser;

    @tb1
    private dj4 mDistanceUnitPopup;

    @tb1
    private dj4 mTemperaturePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.me0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MeasureUnitSettingsActivity.rootView_delegate$lambda$0(this.f9677IO);
        }
    });

    @aa1
    private final Lazy tvDistanceUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ne0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MeasureUnitSettingsActivity.tvDistanceUnit_delegate$lambda$0(this.f9917IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oe0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MeasureUnitSettingsActivity.tvTemperatureUnit_delegate$lambda$0(this.f10116IO);
        }
    });

    public MeasureUnitSettingsActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    private final PFMedium getTvDistanceUnit() {
        return (PFMedium) this.tvDistanceUnit$delegate.getValue();
    }

    private final PFMedium getTvTemperatureUnit() {
        return (PFMedium) this.tvTemperatureUnit$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onItemClick$lambda$0$0(final MeasureUnitSettingsActivity measureUnitSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.je0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureUnitSettingsActivity.onItemClick$lambda$0$0$0(this.f8947IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$0$0$0(MeasureUnitSettingsActivity measureUnitSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        appUser2.setUnit(i == 0 ? 0 : 1);
        measureUnitSettingsActivity.mAppUser = appUser2;
        measureUnitSettingsActivity.initView();
        a01Var.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser2));
        I01XX0.XIi00iiXO(I01XX0.IiiXiI0I, null, 2, null);
        I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.USER_PROFILE, BleKeyFlag.UPDATE, measureUnitSettingsActivity.mAppUser.getBleUserProfile(), false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onItemClick$lambda$2$0(final MeasureUnitSettingsActivity measureUnitSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.ie0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MeasureUnitSettingsActivity.onItemClick$lambda$2$0$0(i, measureUnitSettingsActivity, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$2$0$0(int i, MeasureUnitSettingsActivity measureUnitSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.TEMPERATURE_UNIT, BleKeyFlag.UPDATE, i, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.f1084IO, null, 2, null);
        measureUnitSettingsActivity.initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(MeasureUnitSettingsActivity measureUnitSettingsActivity) {
        return measureUnitSettingsActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvDistanceUnit_delegate$lambda$0(MeasureUnitSettingsActivity measureUnitSettingsActivity) {
        return (PFMedium) measureUnitSettingsActivity.findViewById(R.id.tv_distance_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium tvTemperatureUnit_delegate$lambda$0(MeasureUnitSettingsActivity measureUnitSettingsActivity) {
        return (PFMedium) measureUnitSettingsActivity.findViewById(R.id.tv_temperature_unit);
    }

    public final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.unit_settings_item);
        View viewFindViewById = findViewById(R.id.abh_title_right);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        getTvDistanceUnit().setText(this.mAppUser.getUnit() == 0 ? R.string.metric : R.string.imperial);
        getTvTemperatureUnit().setText(getResources().getStringArray(R.array.temperature_unit_sk_result)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.TEMPERATURE_UNIT, 0, null, 6, null)]);
        findViewById(R.id.ll_temperature_unit).setVisibility(q62.OXO1.iX1X1() ? 0 : 8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_measure_unit_settings;
    }

    public final void onItemClick(@aa1 View view) {
        MeasureUnitSettingsActivity measureUnitSettingsActivity;
        Intrinsics.X0O(view, "view");
        int id = view.getId();
        if (id == R.id.ll_distance_unit) {
            if (this.mDistanceUnitPopup == null) {
                dj4 dj4Var = new dj4(this, R.array.temperature_unit_sk, 0, 4, (DefaultConstructorMarker) null);
                dj4Var.m1671iX(R.string.metric_and_imperial_item);
                dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.ke0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(MeasureUnitSettingsActivity.onItemClick$lambda$0$0(this.f9151IO, ((Integer) obj).intValue()));
                    }
                });
                this.mDistanceUnitPopup = dj4Var;
            }
            dj4 dj4Var2 = this.mDistanceUnitPopup;
            if (dj4Var2 != null) {
                dj4Var2.II1Xi0(this.mAppUser.getUnit() == 0 ? 0 : 1);
                View rootView = getRootView();
                Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
                dj4Var2.I1XOi1(rootView);
                return;
            }
            return;
        }
        if (id != R.id.ll_temperature_unit) {
            return;
        }
        if (this.mTemperaturePopup == null) {
            measureUnitSettingsActivity = this;
            dj4 dj4Var3 = new dj4(measureUnitSettingsActivity, R.array.temperature_unit_sk_list, 0, 4, (DefaultConstructorMarker) null);
            dj4Var3.m1671iX(R.string.temperature_unit);
            dj4Var3.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.le0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(MeasureUnitSettingsActivity.onItemClick$lambda$2$0(this.f9417IO, ((Integer) obj).intValue()));
                }
            });
            measureUnitSettingsActivity.mTemperaturePopup = dj4Var3;
        } else {
            measureUnitSettingsActivity = this;
        }
        dj4 dj4Var4 = measureUnitSettingsActivity.mTemperaturePopup;
        if (dj4Var4 != null) {
            dj4Var4.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.TEMPERATURE_UNIT, 0, null, 6, null));
            View rootView2 = getRootView();
            Intrinsics.O10IXXX0X(rootView2, "<get-rootView>(...)");
            dj4Var4.I1XOi1(rootView2);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
