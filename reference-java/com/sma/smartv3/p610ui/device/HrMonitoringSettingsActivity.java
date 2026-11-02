package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.XiiOXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ot5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.p610ui.device.HrMonitoringSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleHrWarningSettings;
import com.szabh.smable3.entity.BleTimeRange;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHrMonitoringSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrMonitoringSettingsActivity.kt\ncom/sma/smartv3/ui/device/HrMonitoringSettingsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"})
public final class HrMonitoringSettingsActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int HR_MAX = 200;
    public static final int HR_MIN = 20;

    @tb1
    private qv1 mHighPopup;

    @aa1
    private final BleHrMonitoringSettings mHrMonitoringSettings;

    @aa1
    private final BleHrWarningSettings mHrWarningSettings;

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private qv1 mLowPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOI0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.rootView_delegate$lambda$0(this.f5056IO);
        }
    });

    @aa1
    private final Lazy modePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOO0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.modePanel_delegate$lambda$0(this.f3251IO);
        }
    });

    @aa1
    private final Lazy itemHeaderReal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1i11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemHeaderReal_delegate$lambda$0(this.f4381IO);
        }
    });

    @aa1
    private final Lazy itemHeaderSmart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOO1X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemHeaderSmart_delegate$lambda$0(this.f1832IO);
        }
    });

    @aa1
    private final Lazy timePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OXiX0OiO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.timePanel_delegate$lambda$0(this.f3582IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOi00
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemHeader_delegate$lambda$0(this.f3357IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiOX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemTimeRange_delegate$lambda$0(this.f3750IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIIX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemInterval_delegate$lambda$0(this.f3221IO);
        }
    });

    @aa1
    private final Lazy warnPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1ii0OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.warnPanel_delegate$lambda$0(this.f4397IO);
        }
    });

    @aa1
    private final Lazy itemHeaderHigh$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0O1XO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemHeaderHigh_delegate$lambda$0(this.f7385IO);
        }
    });

    @aa1
    private final Lazy itemHighValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiO1O0OOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemHighValue_delegate$lambda$0(this.f8600IO);
        }
    });

    @aa1
    private final Lazy itemHeaderLow$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiIXXX1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemHeaderLow_delegate$lambda$0(this.f5275IO);
        }
    });

    @aa1
    private final Lazy itemLowValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiOO0I01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return HrMonitoringSettingsActivity.itemLowValue_delegate$lambda$0(this.f8607IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.HrMonitoringSettingsActivity$delayPostEvent$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.device.HrMonitoringSettingsActivity$delayPostEvent$1", m39466f = "HrMonitoringSettingsActivity.kt", m39467i = {}, m39468l = {185}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C187581 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C187581(Continuation<? super C187581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C187581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C187581) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(1000L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            I01XX0.XIi00iiXO(I01XX0.OiIIX101O, null, 2, null);
            LogUtils.m11130i(" delayPostEvent HR_MONITORING_CHANGE");
            return Unit.OXO1;
        }
    }

    public HrMonitoringSettingsActivity() {
        BleCache bleCache = BleCache.INSTANCE;
        this.mHrMonitoringSettings = (BleHrMonitoringSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.HR_MONITORING, BleHrMonitoringSettings.class, null, null, 12, null);
        this.mHrWarningSettings = (BleHrWarningSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.HR_WARNING_SET, BleHrWarningSettings.class, null, null, 12, null);
    }

    private final void delayPostEvent() {
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C187581(null), 3, null);
    }

    private final AbhSettingsHeader getItemHeader() {
        return (AbhSettingsHeader) this.itemHeader$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderHigh() {
        return (AbhSettingsHeader) this.itemHeaderHigh$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderLow() {
        return (AbhSettingsHeader) this.itemHeaderLow$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderReal() {
        return (AbhSettingsHeader) this.itemHeaderReal$delegate.getValue();
    }

    private final AbhSettingsHeader getItemHeaderSmart() {
        return (AbhSettingsHeader) this.itemHeaderSmart$delegate.getValue();
    }

    private final AbhSettingsItem getItemHighValue() {
        return (AbhSettingsItem) this.itemHighValue$delegate.getValue();
    }

    private final AbhSettingsItem getItemInterval() {
        return (AbhSettingsItem) this.itemInterval$delegate.getValue();
    }

    private final AbhSettingsItem getItemLowValue() {
        return (AbhSettingsItem) this.itemLowValue$delegate.getValue();
    }

    private final AbhSettingsItem getItemTimeRange() {
        return (AbhSettingsItem) this.itemTimeRange$delegate.getValue();
    }

    private final View getModePanel() {
        return (View) this.modePanel$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final View getTimePanel() {
        return (View) this.timePanel$delegate.getValue();
    }

    private final View getWarnPanel() {
        return (View) this.warnPanel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XXXIOOiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$0$0$0(this.f5120IO, (BleConnector) obj);
            }
        }, 1, null)) {
            hrMonitoringSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(hrMonitoringSettingsActivity.mHrMonitoringSettings);
        hrMonitoringSettingsActivity.mHrMonitoringSettings.getMBleTimeRange().setMEnabled(hrMonitoringSettingsActivity.mHrMonitoringSettings.getMBleTimeRange().getMEnabled() == 0 ? 255 : 0);
        BaseBleConnector.sendObject$default(it, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrMonitoringSettings, false, false, 24, null);
        hrMonitoringSettingsActivity.delayPostEvent();
        LogUtils.m11128d("HR_MONITORING");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, boolean z) {
        LogUtils.m11128d("onCheckChange" + z);
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOiiXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$1$0$0((BleConnector) obj);
            }
        }, 1, null)) {
            hrMonitoringSettingsActivity.getItemHeaderReal().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$1$0$0(BleConnector it) {
        Intrinsics.X0O(it, "it");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.O10OXXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$2$0$0((BleConnector) obj);
            }
        }, 1, null)) {
            hrMonitoringSettingsActivity.getItemHeaderSmart().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2$0$0(BleConnector it) {
        Intrinsics.X0O(it, "it");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, final boolean z) {
        hrMonitoringSettingsActivity.delayPostEvent();
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XO1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$3$0$0(this.f4729IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            hrMonitoringSettingsActivity.getItemHeaderHigh().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$3$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(hrMonitoringSettingsActivity.mHrWarningSettings);
        hrMonitoringSettingsActivity.mHrWarningSettings.setMHighSwitch(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrWarningSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, final boolean z) {
        hrMonitoringSettingsActivity.delayPostEvent();
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIIii0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$4$0$0(this.f7860IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            hrMonitoringSettingsActivity.getItemHeaderLow().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(hrMonitoringSettingsActivity.mHrWarningSettings);
        hrMonitoringSettingsActivity.mHrWarningSettings.setMLowSwitch(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrWarningSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderHigh_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsHeader) hrMonitoringSettingsActivity.findViewById(R.id.item_header_high);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderLow_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsHeader) hrMonitoringSettingsActivity.findViewById(R.id.item_header_low);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderReal_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsHeader) hrMonitoringSettingsActivity.findViewById(R.id.item_header_real);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeaderSmart_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsHeader) hrMonitoringSettingsActivity.findViewById(R.id.item_header_smart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsHeader) hrMonitoringSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemHighValue_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsItem) hrMonitoringSettingsActivity.findViewById(R.id.item_high_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsItem) hrMonitoringSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemLowValue_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsItem) hrMonitoringSettingsActivity.findViewById(R.id.item_low_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return (AbhSettingsItem) hrMonitoringSettingsActivity.findViewById(R.id.item_time_range);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View modePanel_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return hrMonitoringSettingsActivity.findViewById(R.id.ll_mode_panel);
    }

    public static /* synthetic */ void onDeviceSetInterval$default(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 15;
        }
        if ((i3 & 2) != 0) {
            i2 = R.array.hr_monitoring_intervals;
        }
        hrMonitoringSettingsActivity.onDeviceSetInterval(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onDeviceSetInterval$lambda$0$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, final int i, final int i2) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IIO0I000O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.onDeviceSetInterval$lambda$0$0$0(this.f1606IO, i, i2, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceSetInterval$lambda$0$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, int i, int i2, BleConnector it) {
        Intrinsics.X0O(it, "it");
        hrMonitoringSettingsActivity.mHrMonitoringSettings.setMInterval(i * ((int) Math.pow(2.0d, i2)));
        hrMonitoringSettingsActivity.getItemInterval().setMRightText(cp5.m1624iI(hrMonitoringSettingsActivity.mHrMonitoringSettings.getMInterval()));
        BaseBleConnector.sendObject$default(it, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrMonitoringSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetHighValue$lambda$1$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IX01i1IIi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.onSetHighValue$lambda$1$0$0(this.f1938IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetHighValue$lambda$1$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        hrMonitoringSettingsActivity.mHrWarningSettings.setMHighValue(i + 20);
        BaseBleConnector.sendObject$default(it, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrWarningSettings, false, false, 24, null);
        hrMonitoringSettingsActivity.updateHigh();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetLowValue$lambda$1$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, final int i) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1Xi1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.onSetLowValue$lambda$1$0$0(this.f4366IO, i, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetLowValue$lambda$1$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, int i, BleConnector it) {
        Intrinsics.X0O(it, "it");
        hrMonitoringSettingsActivity.mHrWarningSettings.setMLowValue(i + 20);
        BaseBleConnector.sendObject$default(it, BleKey.HR_WARNING_SET, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrWarningSettings, false, false, 24, null);
        hrMonitoringSettingsActivity.updateLow();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final HrMonitoringSettingsActivity hrMonitoringSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XIOIXI1IX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f4551IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleTimeRange mBleTimeRange = hrMonitoringSettingsActivity.mHrMonitoringSettings.getMBleTimeRange();
        mBleTimeRange.setMStartHour(i);
        mBleTimeRange.setMStartMinute(i2);
        mBleTimeRange.setMEndHour(i3);
        mBleTimeRange.setMEndMinute(i4);
        BaseBleConnector.sendObject$default(it, BleKey.HR_MONITORING, BleKeyFlag.UPDATE, hrMonitoringSettingsActivity.mHrMonitoringSettings, false, false, 24, null);
        hrMonitoringSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return hrMonitoringSettingsActivity.findViewById(R.id.root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View timePanel_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return hrMonitoringSettingsActivity.findViewById(R.id.ll_time_panel);
    }

    private final void updateHigh() {
        getItemHighValue().setMRightText(String.valueOf(this.mHrWarningSettings.getMHighValue()));
    }

    private final void updateLow() {
        getItemLowValue().setMRightText(String.valueOf(this.mHrWarningSettings.getMLowValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View warnPanel_delegate$lambda$0(HrMonitoringSettingsActivity hrMonitoringSettingsActivity) {
        return hrMonitoringSettingsActivity.findViewById(R.id.ll_warn_panel);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.heart_rate_monitoring);
        q62 q62Var = q62.OXO1;
        if (q62Var.m2889Xi() && q62Var.iI0OIOO()) {
            getTimePanel().setVisibility(0);
            AbhSettingsHeader itemHeader = getItemHeader();
            itemHeader.setChecked(q62Var.IIX(this.mHrMonitoringSettings.getMBleTimeRange().getMEnabled()));
            itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.iX1OX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HrMonitoringSettingsActivity.initView$lambda$0$0(this.f8289IO, ((Boolean) obj).booleanValue());
                }
            });
            getItemTimeRange().setMRightText(cp5.IXI(this.mHrMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
            getItemInterval().setMRightText(cp5.m1624iI(this.mHrMonitoringSettings.getMInterval()));
        } else {
            getTimePanel().setVisibility(8);
        }
        if (q62Var.IXXI1()) {
            getModePanel().setVisibility(0);
            AbhSettingsHeader itemHeaderReal = getItemHeaderReal();
            itemHeaderReal.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
            itemHeaderReal.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.XOXi1I1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HrMonitoringSettingsActivity.initView$lambda$1$0(this.f4882IO, ((Boolean) obj).booleanValue());
                }
            });
            AbhSettingsHeader itemHeaderSmart = getItemHeaderSmart();
            itemHeaderSmart.getCheckEnabled().setButtonDrawable(R.drawable.selector_radio);
            itemHeaderSmart.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.iXOiXX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HrMonitoringSettingsActivity.initView$lambda$2$0(this.f8378IO, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            getModePanel().setVisibility(8);
        }
        if (!q62Var.Ii1X()) {
            getWarnPanel().setVisibility(8);
            return;
        }
        getWarnPanel().setVisibility(0);
        AbhSettingsHeader itemHeaderHigh = getItemHeaderHigh();
        itemHeaderHigh.setChecked(OiOX0i.XIi00iiXO(this.mHrWarningSettings.getMHighSwitch()));
        itemHeaderHigh.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.XX1ii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$3$0(this.f5012IO, ((Boolean) obj).booleanValue());
            }
        });
        updateHigh();
        AbhSettingsHeader itemHeaderLow = getItemHeaderLow();
        itemHeaderLow.setChecked(OiOX0i.XIi00iiXO(this.mHrWarningSettings.getMLowSwitch()));
        itemHeaderLow.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.XXIX0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HrMonitoringSettingsActivity.initView$lambda$4$0(this.f5033IO, ((Boolean) obj).booleanValue());
            }
        });
        updateLow();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_hr_monitoring_settings;
    }

    public final void onDeviceSetInterval(final int i, int i2) {
        HrMonitoringSettingsActivity hrMonitoringSettingsActivity;
        if (this.mIntervalPopup == null) {
            hrMonitoringSettingsActivity = this;
            dj4 dj4Var = new dj4(hrMonitoringSettingsActivity, i2, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.monitoring_interval);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.X10O101O
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HrMonitoringSettingsActivity.onDeviceSetInterval$lambda$0$0(this.f4154IO, i, ((Integer) obj).intValue()));
                }
            });
            hrMonitoringSettingsActivity.mIntervalPopup = dj4Var;
        } else {
            hrMonitoringSettingsActivity = this;
        }
        dj4 dj4Var2 = hrMonitoringSettingsActivity.mIntervalPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(XiiOXI.OXO1(hrMonitoringSettingsActivity.mHrMonitoringSettings.getMInterval() / i));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public final void onSetHighValue(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mHighPopup == null) {
            ArrayList arrayList = new ArrayList(181);
            for (int i = 0; i < 181; i++) {
                arrayList.add(String.valueOf(i + 20));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.heart_rate_limit);
            qv1Var.i010I().setVisibility(8);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.I11i0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HrMonitoringSettingsActivity.onSetHighValue$lambda$1$0(this.f1358IO, ((Integer) obj).intValue()));
                }
            });
            this.mHighPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mHighPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mHrWarningSettings.getMHighValue() - 20);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            qv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (q62.OXO1.X0100I()) {
            onDeviceSetInterval(30, R.array.hr_monitoring_intervals_ring);
        } else {
            onDeviceSetInterval$default(this, 0, 0, 3, null);
        }
    }

    public final void onSetLowValue(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mLowPopup == null) {
            ArrayList arrayList = new ArrayList(181);
            for (int i = 0; i < 181; i++) {
                arrayList.add(String.valueOf(i + 20));
            }
            qv1 qv1Var = new qv1(this, arrayList);
            qv1Var.IXXOO(R.string.heart_rate_lower_limit);
            qv1Var.i010I().setVisibility(8);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.i1X0XOiX
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(HrMonitoringSettingsActivity.onSetLowValue$lambda$1$0(this.f7659IO, ((Integer) obj).intValue()));
                }
            });
            this.mLowPopup = qv1Var;
        }
        qv1 qv1Var2 = this.mLowPopup;
        if (qv1Var2 != null) {
            qv1Var2.O1O(this.mHrWarningSettings.getMLowValue() - 20);
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            qv1Var2.I1XOi1(rootView);
        }
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.iOXi0III
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(HrMonitoringSettingsActivity.onSetTimeRange$lambda$0$0(this.f8169IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mHrMonitoringSettings.getMBleTimeRange().getMStartHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMStartMinute(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndHour(), this.mHrMonitoringSettings.getMBleTimeRange().getMEndMinute());
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
