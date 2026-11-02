package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.ie0;
import com.android.mltcode.paycertificationapi.je0;
import com.android.mltcode.paycertificationapi.ke0;
import com.android.mltcode.paycertificationapi.le0;
import com.android.mltcode.paycertificationapi.me0;
import com.android.mltcode.paycertificationapi.ne0;
import com.android.mltcode.paycertificationapi.oe0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
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
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvDistanceUnit$delegate;

    @aa1
    private final Lazy tvTemperatureUnit$delegate;

    public MeasureUnitSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new me0(this));
        this.tvDistanceUnit$delegate = LazyKt__LazyJVMKt.iO(new ne0(this));
        this.tvTemperatureUnit$delegate = LazyKt__LazyJVMKt.iO(new oe0(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ boolean I0iXXO(MeasureUnitSettingsActivity r0, int r1) {
        return onItemClick$lambda$2$0(r0, r1);
    }

    public static /* synthetic */ PFMedium I1XOi1(MeasureUnitSettingsActivity r0) {
        return tvTemperatureUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(int r0, MeasureUnitSettingsActivity r1, BleConnector r2) {
        return onItemClick$lambda$2$0$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean OIX0iXi(MeasureUnitSettingsActivity r0, int r1) {
        return onItemClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ PFMedium X0O(MeasureUnitSettingsActivity r0) {
        return tvDistanceUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(MeasureUnitSettingsActivity r0, int r1, BleConnector r2) {
        return onItemClick$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ View XXI(MeasureUnitSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    private final PFMedium getTvDistanceUnit() {
        return (PFMedium) getValue();
    }

    private final PFMedium getTvTemperatureUnit() {
        return (PFMedium) getValue();
    }

    private static final boolean onItemClick$lambda$0$0(final MeasureUnitSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new je0(r2, r3), 1, null);
    }

    private static final Unit onItemClick$lambda$0$0$0(MeasureUnitSettingsActivity r33, int r34, BleConnector r35) {
        Intrinsics.X0O(r35, "it");
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        AppUser r5 = (AppUser) r3;
        if (r34 != 0) goto L9;
        int r6 = 0;
    L10:
        r5.setUnit(r6);
        r33.mAppUser = r5;
        r33.initView();
        r1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(r5));
        I01XX0.XIi00iiXO(I01XX0.IiiXiI0I, null, 2, null);
        I01XX0.XIi00iiXO(I01XX0.O00, null, 2, null);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.USER_PROFILE, BleKeyFlag.UPDATE, r33.mAppUser.getBleUserProfile(), false, false, 24, null);
        return Unit.OXO1;
    L9:
        r6 = 1;
        goto L10
    }

    private static final boolean onItemClick$lambda$2$0(final MeasureUnitSettingsActivity r2, final int r3) {
        return X0IOiX1O.XIi00iiXO(false, new ie0(r3, r2), 1, null);
    }

    private static final Unit onItemClick$lambda$2$0$0(int r9, MeasureUnitSettingsActivity r10, BleConnector r11) {
        Intrinsics.X0O(r11, "it");
        BaseBleConnector.sendInt8$default(r11, BleKey.TEMPERATURE_UNIT, BleKeyFlag.UPDATE, r9, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.IO, null, 2, null);
        r10.initView();
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(MeasureUnitSettingsActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final PFMedium tvDistanceUnit_delegate$lambda$0(MeasureUnitSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_distance_unit);
    }

    private static final PFMedium tvTemperatureUnit_delegate$lambda$0(MeasureUnitSettingsActivity r1) {
        return (PFMedium) r1.findViewById(R.id.tv_temperature_unit);
    }

    public final View getRootView() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.unit_settings_item);
        View r0 = findViewById(R.id.abh_title_right);
        int r1 = 8;
        if (r0 == null) goto L5;
        r0.setVisibility(8);
    L5:
        PFMedium r2 = getTvDistanceUnit();
        if (this.mAppUser.getUnit() != 0) goto L8;
        int r3 = R.string.metric;
    L9:
        r2.setText(r3);
        getTvTemperatureUnit().setText(getResources().getStringArray(R.array.temperature_unit_sk_result)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.TEMPERATURE_UNIT, 0, null, 6, null)]);
        View r4 = findViewById(R.id.ll_temperature_unit);
        if (q62.OXO1.iX1X1() == false) goto L12;
        r1 = 0;
    L12:
        r4.setVisibility(r1);
        return;
    L8:
        r3 = R.string.imperial;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_measure_unit_settings;
    }

    public final void onItemClick(@aa1 View r15) {
        Intrinsics.X0O(r15, "view");
        int r16 = r15.getId();
        if (r16 == R.id.ll_distance_unit) goto L16;
        if (r16 == R.id.ll_temperature_unit) goto L8;
        return;
    L8:
        if (this.mTemperaturePopup != null) goto L10;
        int r4 = R.array.temperature_unit_sk_list;
        int r5 = 0;
        MeasureUnitSettingsActivity r3 = this;
        dj4 r2 = new dj4(r3, r4, r5, 4, null);
        r2.iX(R.string.temperature_unit);
        r2.i010I(new le0(this));
        r3.mTemperaturePopup = r2;
    L11:
        dj4 r17 = r3.mTemperaturePopup;
        if (r17 == null) goto L27;
        r17.II1Xi0(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.TEMPERATURE_UNIT, 0, null, 6, null));
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r17.I1XOi1(r0);
        return;
    L27:
        return;
    L10:
        r3 = this;
        goto L11
    L16:
        if (this.mDistanceUnitPopup != null) goto L18;
        int r10 = R.array.temperature_unit_sk;
        int r11 = 0;
        dj4 r8 = new dj4(this, r10, r11, 4, null);
        r8.iX(R.string.metric_and_imperial_item);
        r8.i010I(new ke0(this));
        this.mDistanceUnitPopup = r8;
    L18:
        dj4 r18 = this.mDistanceUnitPopup;
        if (r18 != null) goto L21;
        return;
    L21:
        if (this.mAppUser.getUnit() != 0) goto L23;
        int r1 = 0;
    L24:
        r18.II1Xi0(r1);
        View r6 = getRootView();
        Intrinsics.O10IXXX0X(r6, "<get-rootView>(...)");
        r18.I1XOi1(r6);
        return;
    L23:
        r1 = 1;
        goto L24
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
