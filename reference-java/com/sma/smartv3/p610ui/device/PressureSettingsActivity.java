package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.device.PressureSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BlePressureTimingMeasurement;
import com.szabh.smable3.entity.BleTimeRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PressureSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureSettingsActivity.rootView_delegate$lambda$0(this.f11187IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureSettingsActivity.itemHeader_delegate$lambda$0(this.f11422IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureSettingsActivity.itemTimeRange_delegate$lambda$0(this.f11646IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w42
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PressureSettingsActivity.itemInterval_delegate$lambda$0(this.f11879IO);
        }
    });

    @aa1
    private final BlePressureTimingMeasurement mSettings = (BlePressureTimingMeasurement) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.PRESSURE_TIMING_MEASUREMENT, BlePressureTimingMeasurement.class, null, null, 12, null);

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) this.itemInterval$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) this.itemTimeRange$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final PressureSettingsActivity pressureSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.s42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PressureSettingsActivity.initView$lambda$0$0$0(this.f10964IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            pressureSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(PressureSettingsActivity pressureSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(pressureSettingsActivity.mSettings);
        pressureSettingsActivity.mSettings.getMBleTimeRange().setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.PRESSURE_TIMING_MEASUREMENT, BleKeyFlag.UPDATE, pressureSettingsActivity.mSettings, false, false, 24, null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.z42
            @Override // java.lang.Runnable
            public final void run() {
                I01XX0.XIi00iiXO(I01XX0.f1095iX, null, 2, null);
            }
        }, 150L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(PressureSettingsActivity pressureSettingsActivity) {
        return (AbhSettingsHeader) pressureSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(PressureSettingsActivity pressureSettingsActivity) {
        return (AbhSettingsItem) pressureSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(PressureSettingsActivity pressureSettingsActivity) {
        return (AbhSettingsItem) pressureSettingsActivity.findViewById(R.id.item_time_range);
    }

    private final void onDeviceSetInterval(final int i, int i2) {
        PressureSettingsActivity pressureSettingsActivity;
        if (this.mIntervalPopup == null) {
            pressureSettingsActivity = this;
            dj4 dj4Var = new dj4(pressureSettingsActivity, i2, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.interval);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.p42
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(PressureSettingsActivity.onDeviceSetInterval$lambda$0$0(this.f10292IO, i, ((Integer) obj).intValue()));
                }
            });
            pressureSettingsActivity.mIntervalPopup = dj4Var;
        } else {
            pressureSettingsActivity = this;
        }
        dj4 dj4Var2 = pressureSettingsActivity.mIntervalPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(XiiOXI.OXO1(pressureSettingsActivity.mSettings.getMInterval() / i));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public static /* synthetic */ void onDeviceSetInterval$default(PressureSettingsActivity pressureSettingsActivity, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 15;
        }
        if ((i3 & 2) != 0) {
            i2 = R.array.pressure_set_intervals;
        }
        pressureSettingsActivity.onDeviceSetInterval(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onDeviceSetInterval$lambda$0$0(final PressureSettingsActivity pressureSettingsActivity, final int i, final int i2) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.y42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PressureSettingsActivity.onDeviceSetInterval$lambda$0$0$0(this.f12305IO, i, i2, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceSetInterval$lambda$0$0$0(PressureSettingsActivity pressureSettingsActivity, int i, int i2, BleConnector it) {
        Intrinsics.X0O(it, "it");
        pressureSettingsActivity.mSettings.setMInterval(i * ((int) Math.pow(2.0d, i2)));
        pressureSettingsActivity.getItemInterval().setMRightText(cp5.m1624iI(pressureSettingsActivity.mSettings.getMInterval()));
        BaseBleConnector.sendObject$default(it, BleKey.PRESSURE_TIMING_MEASUREMENT, BleKeyFlag.UPDATE, pressureSettingsActivity.mSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final PressureSettingsActivity pressureSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.q42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PressureSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f10510IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(PressureSettingsActivity pressureSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleTimeRange mBleTimeRange = pressureSettingsActivity.mSettings.getMBleTimeRange();
        mBleTimeRange.setMStartHour(i);
        mBleTimeRange.setMStartMinute(i2);
        mBleTimeRange.setMEndHour(i3);
        mBleTimeRange.setMEndMinute(i4);
        BaseBleConnector.sendObject$default(it, BleKey.PRESSURE_TIMING_MEASUREMENT, BleKeyFlag.UPDATE, pressureSettingsActivity.mSettings, false, false, 24, null);
        pressureSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(PressureSettingsActivity pressureSettingsActivity) {
        return pressureSettingsActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.pressure_set);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(q62.OXO1.IIX(this.mSettings.getMBleTimeRange().getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.x42
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PressureSettingsActivity.initView$lambda$0$0(this.f12102IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemTimeRange().setMRightText(cp5.IXI(this.mSettings.getMBleTimeRange().getMStartHour(), this.mSettings.getMBleTimeRange().getMStartMinute(), this.mSettings.getMBleTimeRange().getMEndHour(), this.mSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.m1624iI(this.mSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_pressure_settings;
    }

    public final void onSetInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (q62.OXO1.X0100I()) {
            onDeviceSetInterval(60, R.array.pressure_set_intervals_ring);
        } else {
            onDeviceSetInterval$default(this, 0, 0, 3, null);
        }
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.r42
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(PressureSettingsActivity.onSetTimeRange$lambda$0$0(this.f10747IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mSettings.getMBleTimeRange().getMStartHour(), this.mSettings.getMBleTimeRange().getMStartMinute(), this.mSettings.getMBleTimeRange().getMEndHour(), this.mSettings.getMBleTimeRange().getMEndMinute());
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            ot5Var2.I1XOi1(rootView);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
