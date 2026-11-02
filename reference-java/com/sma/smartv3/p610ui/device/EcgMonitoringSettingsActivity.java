package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
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
import com.sma.smartv3.p610ui.device.EcgMonitoringSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleEcgSettings;
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
public final class EcgMonitoringSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIO1XXO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgMonitoringSettingsActivity.rootView_delegate$lambda$0(this.f4540IO);
        }
    });

    @aa1
    private final Lazy timePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XXII1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgMonitoringSettingsActivity.timePanel_delegate$lambda$0(this.f1461IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XiiXO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgMonitoringSettingsActivity.itemHeader_delegate$lambda$0(this.f1471IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiXXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgMonitoringSettingsActivity.itemTimeRange_delegate$lambda$0(this.f2337IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I00XIO1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EcgMonitoringSettingsActivity.itemInterval_delegate$lambda$0(this.f1029IO);
        }
    });

    @aa1
    private final BleEcgSettings mEcgMonitoringSettings = (BleEcgSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.ECG_SET, BleEcgSettings.class, null, null, 12, null);

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

    private final View getTimePanel() {
        return (View) this.timePanel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity, boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.I0OIXiX0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgMonitoringSettingsActivity.initView$lambda$0$0$0(this.f1161IO, (BleConnector) obj);
            }
        }, 1, null)) {
            ecgMonitoringSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(ecgMonitoringSettingsActivity.mEcgMonitoringSettings);
        ecgMonitoringSettingsActivity.mEcgMonitoringSettings.getMBleTimeRange().setMEnabled(ecgMonitoringSettingsActivity.mEcgMonitoringSettings.getMBleTimeRange().getMEnabled() == 0 ? 255 : 0);
        BaseBleConnector.sendObject$default(it, BleKey.ECG_SET, BleKeyFlag.UPDATE, ecgMonitoringSettingsActivity.mEcgMonitoringSettings, false, false, 24, null);
        I01XX0.XIi00iiXO(I01XX0.XiOIii1, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity) {
        return (AbhSettingsHeader) ecgMonitoringSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity) {
        return (AbhSettingsItem) ecgMonitoringSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity) {
        return (AbhSettingsItem) ecgMonitoringSettingsActivity.findViewById(R.id.item_time_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetInterval$lambda$0$0(final EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IX1iXXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgMonitoringSettingsActivity.onSetInterval$lambda$0$0$0(this.f1985IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetInterval$lambda$0$0$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        ecgMonitoringSettingsActivity.mEcgMonitoringSettings.setMInterval(((int) Math.pow(2.0d, i)) * 15);
        ecgMonitoringSettingsActivity.getItemInterval().setMRightText(cp5.m1624iI(ecgMonitoringSettingsActivity.mEcgMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(it, BleKey.ECG_SET, BleKeyFlag.UPDATE, ecgMonitoringSettingsActivity.mEcgMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iO1Oi0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgMonitoringSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f8038IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleTimeRange mBleTimeRange = ecgMonitoringSettingsActivity.mEcgMonitoringSettings.getMBleTimeRange();
        mBleTimeRange.setMStartHour(i);
        mBleTimeRange.setMStartMinute(i2);
        mBleTimeRange.setMEndHour(i3);
        mBleTimeRange.setMEndMinute(i4);
        BaseBleConnector.sendObject$default(it, BleKey.ECG_SET, BleKeyFlag.UPDATE, ecgMonitoringSettingsActivity.mEcgMonitoringSettings, false, false, 24, null);
        ecgMonitoringSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity) {
        return ecgMonitoringSettingsActivity.findViewById(R.id.root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View timePanel_delegate$lambda$0(EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity) {
        return ecgMonitoringSettingsActivity.findViewById(R.id.ll_time_panel);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.electrocardiogram_monitoring);
        q62 q62Var = q62.OXO1;
        if (!q62Var.XXI0XOIX()) {
            getTimePanel().setVisibility(8);
            return;
        }
        getTimePanel().setVisibility(0);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(q62Var.IIX(this.mEcgMonitoringSettings.getMBleTimeRange().getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXOOO0III
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EcgMonitoringSettingsActivity.initView$lambda$0$0(this.f3512IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemTimeRange().setMRightText(cp5.IXI(this.mEcgMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.m1624iI(this.mEcgMonitoringSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ecg_monitoring_settings;
    }

    public final void onSetInterval(@aa1 View view) {
        EcgMonitoringSettingsActivity ecgMonitoringSettingsActivity;
        Intrinsics.X0O(view, "view");
        if (this.mIntervalPopup == null) {
            ecgMonitoringSettingsActivity = this;
            dj4 dj4Var = new dj4(ecgMonitoringSettingsActivity, R.array.hr_monitoring_intervals, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.monitoring_interval);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.iIOI01
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(EcgMonitoringSettingsActivity.onSetInterval$lambda$0$0(this.f7871IO, ((Integer) obj).intValue()));
                }
            });
            ecgMonitoringSettingsActivity.mIntervalPopup = dj4Var;
        } else {
            ecgMonitoringSettingsActivity = this;
        }
        dj4 dj4Var2 = ecgMonitoringSettingsActivity.mIntervalPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(XiiOXI.OXO1(ecgMonitoringSettingsActivity.mEcgMonitoringSettings.getMInterval() / 15));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.i111XXX
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(EcgMonitoringSettingsActivity.onSetTimeRange$lambda$0$0(this.f7537IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mEcgMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mEcgMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
