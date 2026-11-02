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
import com.sma.smartv3.p610ui.device.BloodOxyGenSettingsActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleBloodOxyGenSettings;
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
public final class BloodOxyGenSettingsActivity extends BaseActivity {

    @tb1
    private dj4 mIntervalPopup;

    @tb1
    private ot5 mTimeRangePopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIXII11iI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenSettingsActivity.rootView_delegate$lambda$0(this.f7910IO);
        }
    });

    @aa1
    private final Lazy itemHeader$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0iO1I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenSettingsActivity.itemHeader_delegate$lambda$0(this.f8534IO);
        }
    });

    @aa1
    private final Lazy itemTimeRange$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1OXX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenSettingsActivity.itemTimeRange_delegate$lambda$0(this.f2760IO);
        }
    });

    @aa1
    private final Lazy itemInterval$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OI0IO0XX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodOxyGenSettingsActivity.itemInterval_delegate$lambda$0(this.f2878IO);
        }
    });

    @aa1
    private final BleBloodOxyGenSettings mBloodOxyGenSettings = (BleBloodOxyGenSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.BLOOD_OXYGEN_SET, BleBloodOxyGenSettings.class, null, null, 12, null);

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
    public static final Unit initView$lambda$0$0(final BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, final boolean z) {
        if (!X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.iX0O01iI1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodOxyGenSettingsActivity.initView$lambda$0$0$0(this.f8233IO, z, (BleConnector) obj);
            }
        }, 1, null)) {
            bloodOxyGenSettingsActivity.getItemHeader().setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, boolean z, BleConnector it) {
        Intrinsics.X0O(it, "it");
        LogUtils.m11128d(bloodOxyGenSettingsActivity.mBloodOxyGenSettings);
        bloodOxyGenSettingsActivity.mBloodOxyGenSettings.getMBleTimeRange().setMEnabled(OiOX0i.m1037iO(z));
        BaseBleConnector.sendObject$default(it, BleKey.BLOOD_OXYGEN_SET, BleKeyFlag.UPDATE, bloodOxyGenSettingsActivity.mBloodOxyGenSettings, false, false, 24, null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i0Xi1
            @Override // java.lang.Runnable
            public final void run() {
                I01XX0.XIi00iiXO(I01XX0.iOOX010X, null, 2, null);
            }
        }, 150L);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsHeader itemHeader_delegate$lambda$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity) {
        return (AbhSettingsHeader) bloodOxyGenSettingsActivity.findViewById(R.id.item_header);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemInterval_delegate$lambda$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity) {
        return (AbhSettingsItem) bloodOxyGenSettingsActivity.findViewById(R.id.item_interval);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemTimeRange_delegate$lambda$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity) {
        return (AbhSettingsItem) bloodOxyGenSettingsActivity.findViewById(R.id.item_time_range);
    }

    private final void onDeviceSetInterval(final int i, int i2) {
        BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity;
        if (this.mIntervalPopup == null) {
            bloodOxyGenSettingsActivity = this;
            dj4 dj4Var = new dj4(bloodOxyGenSettingsActivity, i2, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.interval);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.XI00I0X
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(BloodOxyGenSettingsActivity.onDeviceSetInterval$lambda$0$0(this.f4408IO, i, ((Integer) obj).intValue()));
                }
            });
            bloodOxyGenSettingsActivity.mIntervalPopup = dj4Var;
        } else {
            bloodOxyGenSettingsActivity = this;
        }
        dj4 dj4Var2 = bloodOxyGenSettingsActivity.mIntervalPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(XiiOXI.OXO1(bloodOxyGenSettingsActivity.mBloodOxyGenSettings.getMInterval() / i));
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            dj4Var2.I1XOi1(rootView);
        }
    }

    public static /* synthetic */ void onDeviceSetInterval$default(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 15;
        }
        if ((i3 & 2) != 0) {
            i2 = R.array.blood_oxygen_set_intervals;
        }
        bloodOxyGenSettingsActivity.onDeviceSetInterval(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onDeviceSetInterval$lambda$0$0(final BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, final int i, final int i2) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.IXO11X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodOxyGenSettingsActivity.onDeviceSetInterval$lambda$0$0$0(this.f2041IO, i, i2, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceSetInterval$lambda$0$0$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, int i, int i2, BleConnector it) {
        Intrinsics.X0O(it, "it");
        bloodOxyGenSettingsActivity.mBloodOxyGenSettings.setMInterval(i * ((int) Math.pow(2.0d, i2)));
        bloodOxyGenSettingsActivity.getItemInterval().setMRightText(cp5.m1624iI(bloodOxyGenSettingsActivity.mBloodOxyGenSettings.getMInterval()));
        BaseBleConnector.sendObject$default(it, BleKey.BLOOD_OXYGEN_SET, BleKeyFlag.UPDATE, bloodOxyGenSettingsActivity.mBloodOxyGenSettings, false, false, 24, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetTimeRange$lambda$0$0(final BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, final int i, final int i2, final int i3, final int i4) {
        return X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.XXO1XOXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodOxyGenSettingsActivity.onSetTimeRange$lambda$0$0$0(this.f5054IO, i, i2, i3, i4, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSetTimeRange$lambda$0$0$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity, int i, int i2, int i3, int i4, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BleTimeRange mBleTimeRange = bloodOxyGenSettingsActivity.mBloodOxyGenSettings.getMBleTimeRange();
        mBleTimeRange.setMStartHour(i);
        mBleTimeRange.setMStartMinute(i2);
        mBleTimeRange.setMEndHour(i3);
        mBleTimeRange.setMEndMinute(i4);
        BaseBleConnector.sendObject$default(it, BleKey.BLOOD_OXYGEN_SET, BleKeyFlag.UPDATE, bloodOxyGenSettingsActivity.mBloodOxyGenSettings, false, false, 24, null);
        bloodOxyGenSettingsActivity.getItemTimeRange().setMRightText(cp5.IXI(i, i2, i3, i4, i72.OXO1.i0X000X0O()));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(BloodOxyGenSettingsActivity bloodOxyGenSettingsActivity) {
        return bloodOxyGenSettingsActivity.findViewById(R.id.root);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_oxygen_set);
        AbhSettingsHeader itemHeader = getItemHeader();
        itemHeader.setChecked(q62.OXO1.IIX(this.mBloodOxyGenSettings.getMBleTimeRange().getMEnabled()));
        itemHeader.setMListener(new Function1() { // from class: com.android.mltcode.paycertificationapi.O0Xi0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodOxyGenSettingsActivity.initView$lambda$0$0(this.f2573IO, ((Boolean) obj).booleanValue());
            }
        });
        getItemTimeRange().setMRightText(cp5.IXI(this.mBloodOxyGenSettings.getMBleTimeRange().getMStartHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMStartMinute(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndMinute(), i72.OXO1.i0X000X0O()));
        getItemInterval().setMRightText(cp5.m1624iI(this.mBloodOxyGenSettings.getMInterval()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_blood_oxygen_settings;
    }

    public final void onSetInterval(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (q62.OXO1.X0100I()) {
            onDeviceSetInterval(60, R.array.blood_oxygen_set_intervals_ring);
        } else {
            onDeviceSetInterval$default(this, 0, 0, 3, null);
        }
    }

    public final void onSetTimeRange(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mTimeRangePopup == null) {
            ot5 ot5Var = new ot5(this, i72.OXO1.i0X000X0O());
            ot5Var.X01IiOiIi(new Function4() { // from class: com.android.mltcode.paycertificationapi.iO0i01I
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return Boolean.valueOf(BloodOxyGenSettingsActivity.onSetTimeRange$lambda$0$0(this.f8007IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()));
                }
            });
            this.mTimeRangePopup = ot5Var;
        }
        ot5 ot5Var2 = this.mTimeRangePopup;
        if (ot5Var2 != null) {
            ot5Var2.II1Xi0(this.mBloodOxyGenSettings.getMBleTimeRange().getMStartHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMStartMinute(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndHour(), this.mBloodOxyGenSettings.getMBleTimeRange().getMEndMinute());
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
