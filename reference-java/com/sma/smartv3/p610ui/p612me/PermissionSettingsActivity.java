package com.sma.smartv3.p610ui.p612me;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.RomUtils;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.p612me.PermissionSettingsActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPermissionSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n87#2,7:167\n94#2,3:175\n70#2,7:178\n97#2:185\n1#3:174\n*S KotlinDebug\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n*L\n77#1:167,7\n77#1:175,3\n77#1:178,7\n77#1:185\n77#1:174\n*E\n"})
public final class PermissionSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ir1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.rootView_delegate$lambda$0(this.f8742IO);
        }
    });

    @aa1
    private final Lazy tvNotificationState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvNotificationState_delegate$lambda$0(this.f10883IO);
        }
    });

    @aa1
    private final Lazy tvLocationState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvLocationState_delegate$lambda$0(this.f11110IO);
        }
    });

    @aa1
    private final Lazy tvContactState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvContactState_delegate$lambda$0(this.f11339IO);
        }
    });

    @aa1
    private final Lazy tvPhoneState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ur1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvPhoneState_delegate$lambda$0(this.f11551IO);
        }
    });

    @aa1
    private final Lazy tvSmsState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvSmsState_delegate$lambda$0(this.f11792IO);
        }
    });

    @aa1
    private final Lazy tvStoreState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvStoreState_delegate$lambda$0(this.f12020IO);
        }
    });

    @aa1
    private final Lazy tvBatteryState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvBatteryState_delegate$lambda$0(this.f12222IO);
        }
    });

    @aa1
    private final Lazy tvActivityState$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvActivityState_delegate$lambda$0(this.f12434IO);
        }
    });

    @aa1
    private final Lazy tvLocationPermissionsText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zr1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return PermissionSettingsActivity.tvLocationPermissionsText_delegate$lambda$0(this.f12679IO);
        }
    });

    private final TextView getTvActivityState() {
        return (TextView) this.tvActivityState$delegate.getValue();
    }

    private final TextView getTvBatteryState() {
        return (TextView) this.tvBatteryState$delegate.getValue();
    }

    private final TextView getTvContactState() {
        return (TextView) this.tvContactState$delegate.getValue();
    }

    private final TextView getTvLocationPermissionsText() {
        return (TextView) this.tvLocationPermissionsText$delegate.getValue();
    }

    private final TextView getTvLocationState() {
        return (TextView) this.tvLocationState$delegate.getValue();
    }

    private final TextView getTvNotificationState() {
        return (TextView) this.tvNotificationState$delegate.getValue();
    }

    private final TextView getTvPhoneState() {
        return (TextView) this.tvPhoneState$delegate.getValue();
    }

    private final TextView getTvSmsState() {
        return (TextView) this.tvSmsState$delegate.getValue();
    }

    private final TextView getTvStoreState() {
        return (TextView) this.tvStoreState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$0(boolean z) {
        if (!z) {
            I01XX0.XIi00iiXO(I01XX0.XOO0XOOii, null, 2, null);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$1(boolean z) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$2(PermissionSettingsActivity permissionSettingsActivity, boolean z) {
        if (z) {
            BleInitializer.f51208IO.IIX(permissionSettingsActivity.getMContext());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$3(boolean z) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$4(boolean z) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$5(boolean z) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$6(boolean z) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onItemClick$lambda$7(boolean z) {
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return permissionSettingsActivity.findViewById(R.id.root_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvActivityState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_activityState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvBatteryState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_batteryState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvContactState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_contactState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLocationPermissionsText_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_location_permissions_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvLocationState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_locationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNotificationState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_notificationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPhoneState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_phoneState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSmsState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_smsState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvStoreState_delegate$lambda$0(PermissionSettingsActivity permissionSettingsActivity) {
        return (TextView) permissionSettingsActivity.findViewById(R.id.tv_storeState);
    }

    public final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.permission_settings);
        TextView tvNotificationState = getTvNotificationState();
        boolean zO00 = MyNotificationListenerService.O001I.O00(this);
        int i = R.string.permission_state_off;
        tvNotificationState.setText(zO00 ? R.string.permission_state_on : R.string.permission_state_off);
        TextView tvLocationState = getTvLocationState();
        hr1 hr1Var = hr1.OXO1;
        tvLocationState.setText(hr1Var.X00Xi1X(this) ? R.string.permission_state_on : R.string.permission_state_off);
        getTvContactState().setText(hr1Var.XO0X10iO(this) ? R.string.permission_state_on : R.string.permission_state_off);
        getTvPhoneState().setText(hr1Var.m1931X1(this) ? R.string.permission_state_on : R.string.permission_state_off);
        getTvSmsState().setText(hr1Var.IO0II0i(this) ? R.string.permission_state_on : R.string.permission_state_off);
        getTvStoreState().setText(hr1Var.Ii0X0X(this) ? R.string.permission_state_on : R.string.permission_state_off);
        getTvBatteryState().setText(hr1Var.XXiIiX10(this) ? R.string.permission_state_on : R.string.permission_state_off);
        TextView tvActivityState = getTvActivityState();
        if (hr1Var.XOX0O0(this)) {
            i = R.string.permission_state_on;
        }
        tvActivityState.setText(i);
        getTvLocationPermissionsText().setText(getString(R.string.location_permissions_tip, AppUtils.getAppName(), AppUtils.getAppName()));
        findViewById(R.id.ll_adjust_media_volume_permissions).setVisibility(RomUtils.isXiaomi() ? 0 : 8);
        View viewFindViewById = findViewById(R.id.ll_activity_permissions);
        i72 i72Var = i72.OXO1;
        viewFindViewById.setVisibility((!i72Var.IOI0i0I() || Build.VERSION.SDK_INT < 29) ? 8 : 0);
        findViewById(R.id.ll_store_permissions).setVisibility(Build.VERSION.SDK_INT >= 33 ? 8 : 0);
        findViewById(R.id.ll_permissions_tip_all).setVisibility(i72Var.iXi() ? 0 : 8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_permission_settings;
    }

    public final void onItemClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        switch (view.getId()) {
            case R.id.ll_activity_permissions /* 2131363530 */:
                hr1 hr1Var = hr1.OXO1;
                if (!hr1Var.XOX0O0(this)) {
                    hr1Var.iIiiO(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.qr1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$7(((Boolean) obj).booleanValue());
                        }
                    });
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
            case R.id.ll_adjust_media_volume_permissions /* 2131363531 */:
                hr1.OXO1.Ii0i(this);
                break;
            case R.id.ll_background_permissions /* 2131363538 */:
                hr1.OXO1.OII(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.pr1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return PermissionSettingsActivity.onItemClick$lambda$6(((Boolean) obj).booleanValue());
                    }
                });
                break;
            case R.id.ll_battery_permissions /* 2131363540 */:
                hr1 hr1Var2 = hr1.OXO1;
                if (!hr1Var2.XXiIiX10(this)) {
                    hr1Var2.iOO1ii1(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.or1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$5(((Boolean) obj).booleanValue());
                        }
                    });
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
            case R.id.ll_contacts_permissions /* 2131363549 */:
                hr1 hr1Var3 = hr1.OXO1;
                if (!hr1Var3.XO0X10iO(this)) {
                    hr1Var3.II1Xi0(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.kr1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$1(((Boolean) obj).booleanValue());
                        }
                    });
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
            case R.id.ll_location_permissions /* 2131363587 */:
                hr1 hr1Var4 = hr1.OXO1;
                if (!hr1Var4.X00Xi1X(this)) {
                    hr1.X0i1O(hr1Var4, this, false, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.jr1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$0(((Boolean) obj).booleanValue());
                        }
                    }, 6, null);
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
            case R.id.ll_notification_permissions /* 2131363599 */:
                MyNotificationListenerService.O001I.I0IIOi(this);
                break;
            case R.id.ll_permissions_tip /* 2131363602 */:
                String str = "https://api.iot-solution.net/web/guide/dist/?&app=" + AppUtils.getAppName() + "&pid=58&phoneName=" + RomUtils.getRomInfo().getName() + "&lang=" + i72.OXO1.iOO1ii1(this);
                Bundle bundle = new Bundle();
                bundle.putString("mArg0", str);
                bundle.putInt("mArg1", 0);
                bundle.putParcelable("mArg2", null);
                bundle.putSerializable("mArg3", null);
                Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.ll_phone_permissions /* 2131363605 */:
                hr1 hr1Var5 = hr1.OXO1;
                if (!hr1Var5.m1931X1(this)) {
                    hr1Var5.XXO(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.lr1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$2(this.f9500IO, ((Boolean) obj).booleanValue());
                        }
                    });
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
            case R.id.ll_sms_permissions /* 2131363621 */:
                hr1 hr1Var6 = hr1.OXO1;
                if (!hr1Var6.IO0II0i(this)) {
                    hr1Var6.X11I(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.mr1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$3(((Boolean) obj).booleanValue());
                        }
                    });
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
            case R.id.ll_store_permissions /* 2131363622 */:
                hr1 hr1Var7 = hr1.OXO1;
                if (!hr1Var7.Ii0X0X(this)) {
                    hr1Var7.m1932iX(this, new Function1() { // from class: com.android.mltcode.paycertificationapi.nr1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return PermissionSettingsActivity.onItemClick$lambda$4(((Boolean) obj).booleanValue());
                        }
                    });
                } else {
                    PermissionUtils.launchAppDetailsSettings();
                }
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
