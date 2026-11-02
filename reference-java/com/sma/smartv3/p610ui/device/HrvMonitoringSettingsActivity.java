package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p610ui.device.HrvMonitoringSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleHrvMonitoringSettings;
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
public final class HrvMonitoringSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1iOOOXOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvMonitoringSettingsActivity.rootView_delegate$lambda$0(this.f2850IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1OXIX0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvMonitoringSettingsActivity.itemHeader_delegate$lambda$0(this.f7641IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX001I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvMonitoringSettingsActivity.itemTimeRange_delegate$lambda$0(this.f1928IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XOiX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrvMonitoringSettingsActivity.itemInterval_delegate$lambda$0(this.f1230IO);
        }
    });

    @aa1
    private final BleHrvMonitoringSettings mHrvMonitoringSettings = (BleHrvMonitoringSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.HRV_SET, BleHrvMonitoringSettings.class, null, null, 12, null);

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
    public static final Unit initView$lambda$0$0(final HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iO01OX1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrvMonitoringSettingsActivity.initView$lambda$0$0$0(this.f7983IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            hrvMonitoringSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        hrvMonitoringSettingsActivity.mHrvMonitoringSettings.getMBleTimeRange().setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.HRV_SET, BleKeyFlag.UPDATE, hrvMonitoringSettingsActivity.mHrvMonitoringSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.IiiiOIIi0, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity) {
        return (AbhSettingsHeader) hrvMonitoringSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity) {
        return (AbhSettingsItem) hrvMonitoringSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity) {
        return (AbhSettingsItem) hrvMonitoringSettingsActivity.findViewById(R.id.item_time_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetInterval$lambda$0$0(final HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i0IX0I0i
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrvMonitoringSettingsActivity.onSetInterval$lambda$0$0$0(this.f7358IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetInterval$lambda$0$0$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        hrvMonitoringSettingsActivity.mHrvMonitoringSettings.setMInterval(((int) Math.pow(2.0d, i)) * 15);
        hrvMonitoringSettingsActivity.getItemInterval().setMRightText(cp5.m1624iI(hrvMonitoringSettingsActivity.mHrvMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(it, BleKey.HRV_SET, BleKeyFlag.UPDATE, hrvMonitoringSettingsActivity.mHrvMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O1O0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrvMonitoringSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f2734IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleTimeRange mBleTimeRange = hrvMonitoringSettingsActivity.mHrvMonitoringSettings.getMBleTimeRange();
        mBleTimeRange.setMStartHour(i);
        mBleTimeRange.setMStartMinute(i2);
        mBleTimeRange.setMEndHour(i3);
        mBleTimeRange.setMEndMinute(i4);
        BaseBleConnector.sendObject$default(it, BleKey.HRV_SET, BleKeyFlag.UPDATE, hrvMonitoringSettingsActivity.mHrvMonitoringSettings, false, false, 24, null);
        hrvMonitoringSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity) {
        return hrvMonitoringSettingsActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.hvr_monitoring_set);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(OiOX0i.XIi00iiXO(this.mHrvMonitoringSettings.getMBleTimeRange().getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.O0OXI0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrvMonitoringSettingsActivity.initView$lambda$0$0(this.f2511IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemTimeRange().setMRightText(cp5.IXI(this.mHrvMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.m1624iI(this.mHrvMonitoringSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_hrv_monitoring_settings;
    }

    public final void onSetInterval(@aa1 View view) {
        HrvMonitoringSettingsActivity hrvMonitoringSettingsActivity;
        Intrinsics.X0O(view, "view");
        if (this.mIntervalPopup == null) {
            hrvMonitoringSettingsActivity = this;
            dj4 dj4Var = new dj4(hrvMonitoringSettingsActivity, R.array.hr_monitoring_intervals, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.monitoring_interval);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.XIiiX0I
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HrvMonitoringSettingsActivity.onSetInterval$lambda$0$0(this.f4638IO, ((Integer) obj).intValue()));
                }
            });
            hrvMonitoringSettingsActivity.mIntervalPopup = dj4Var;
        } else {
            hrvMonitoringSettingsActivity = this;
        }
        dj4 dj4Var2 = hrvMonitoringSettingsActivity.mIntervalPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(XiiOXI.OXO1(hrvMonitoringSettingsActivity.mHrvMonitoringSettings.getMInterval() / 15));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.X10O0IIXO
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(HrvMonitoringSettingsActivity.onSetTimeRange$lambda$0$0(this.f4151IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mHrvMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrvMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
