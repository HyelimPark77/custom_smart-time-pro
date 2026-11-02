package com.sma.smartv3.ui.me;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hr1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ir1;
import com.android.mltcode.paycertificationapi.jr1;
import com.android.mltcode.paycertificationapi.kr1;
import com.android.mltcode.paycertificationapi.lr1;
import com.android.mltcode.paycertificationapi.mr1;
import com.android.mltcode.paycertificationapi.nr1;
import com.android.mltcode.paycertificationapi.or1;
import com.android.mltcode.paycertificationapi.pr1;
import com.android.mltcode.paycertificationapi.qr1;
import com.android.mltcode.paycertificationapi.rr1;
import com.android.mltcode.paycertificationapi.sr1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tr1;
import com.android.mltcode.paycertificationapi.ur1;
import com.android.mltcode.paycertificationapi.vr1;
import com.android.mltcode.paycertificationapi.wr1;
import com.android.mltcode.paycertificationapi.xr1;
import com.android.mltcode.paycertificationapi.yr1;
import com.android.mltcode.paycertificationapi.zr1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.RomUtils;
import com.sma.smartv3.ble.MyNotificationListenerService;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nPermissionSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n87#2,7:167\n94#2,3:175\n70#2,7:178\n97#2:185\n1#3:174\n*S KotlinDebug\n*F\n+ 1 PermissionSettingsActivity.kt\ncom/sma/smartv3/ui/me/PermissionSettingsActivity\n*L\n77#1:167,7\n77#1:175,3\n77#1:178,7\n77#1:185\n77#1:174\n*E\n"})
public final class PermissionSettingsActivity extends BaseActivity {

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final Lazy tvActivityState$delegate;

    @aa1
    private final Lazy tvBatteryState$delegate;

    @aa1
    private final Lazy tvContactState$delegate;

    @aa1
    private final Lazy tvLocationPermissionsText$delegate;

    @aa1
    private final Lazy tvLocationState$delegate;

    @aa1
    private final Lazy tvNotificationState$delegate;

    @aa1
    private final Lazy tvPhoneState$delegate;

    @aa1
    private final Lazy tvSmsState$delegate;

    @aa1
    private final Lazy tvStoreState$delegate;

    public PermissionSettingsActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new ir1(this));
        this.tvNotificationState$delegate = LazyKt__LazyJVMKt.iO(new rr1(this));
        this.tvLocationState$delegate = LazyKt__LazyJVMKt.iO(new sr1(this));
        this.tvContactState$delegate = LazyKt__LazyJVMKt.iO(new tr1(this));
        this.tvPhoneState$delegate = LazyKt__LazyJVMKt.iO(new ur1(this));
        this.tvSmsState$delegate = LazyKt__LazyJVMKt.iO(new vr1(this));
        this.tvStoreState$delegate = LazyKt__LazyJVMKt.iO(new wr1(this));
        this.tvBatteryState$delegate = LazyKt__LazyJVMKt.iO(new xr1(this));
        this.tvActivityState$delegate = LazyKt__LazyJVMKt.iO(new yr1(this));
        this.tvLocationPermissionsText$delegate = LazyKt__LazyJVMKt.iO(new zr1(this));
    }

    public static /* synthetic */ View I0iXXO(PermissionSettingsActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1(boolean r0) {
        return onItemClick$lambda$5(r0);
    }

    public static /* synthetic */ Unit I1XOi1(boolean r0) {
        return onItemClick$lambda$3(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(PermissionSettingsActivity r0) {
        return tvLocationPermissionsText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(PermissionSettingsActivity r0) {
        return tvContactState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OII(PermissionSettingsActivity r0) {
        return tvPhoneState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(PermissionSettingsActivity r0) {
        return tvBatteryState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OX(boolean r0) {
        return onItemClick$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(boolean r0) {
        return onItemClick$lambda$4(r0);
    }

    public static /* synthetic */ Unit X01IiOiIi(boolean r0) {
        return onItemClick$lambda$1(r0);
    }

    public static /* synthetic */ Unit X0O(PermissionSettingsActivity r0, boolean r1) {
        return onItemClick$lambda$2(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(boolean r0) {
        return onItemClick$lambda$7(r0);
    }

    public static /* synthetic */ TextView XX0(PermissionSettingsActivity r0) {
        return tvNotificationState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(PermissionSettingsActivity r0) {
        return tvStoreState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(PermissionSettingsActivity r0) {
        return tvLocationState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIii1(PermissionSettingsActivity r0) {
        return tvSmsState_delegate$lambda$0(r0);
    }

    private final TextView getTvActivityState() {
        return (TextView) getValue();
    }

    private final TextView getTvBatteryState() {
        return (TextView) getValue();
    }

    private final TextView getTvContactState() {
        return (TextView) getValue();
    }

    private final TextView getTvLocationPermissionsText() {
        return (TextView) getValue();
    }

    private final TextView getTvLocationState() {
        return (TextView) getValue();
    }

    private final TextView getTvNotificationState() {
        return (TextView) getValue();
    }

    private final TextView getTvPhoneState() {
        return (TextView) getValue();
    }

    private final TextView getTvSmsState() {
        return (TextView) getValue();
    }

    private final TextView getTvStoreState() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iIiiO(PermissionSettingsActivity r0) {
        return tvActivityState_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iOOX010X(boolean r0) {
        return onItemClick$lambda$6(r0);
    }

    private static final Unit onItemClick$lambda$0(boolean r2) {
        if (r2 == true) goto L5;
        I01XX0.XIi00iiXO(I01XX0.XOO0XOOii, null, 2, null);
    L5:
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$1(boolean r0) {
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$2(PermissionSettingsActivity r0, boolean r1) {
        if (r1 == false) goto L5;
        BleInitializer.IO.IIX(r0.getMContext());
    L5:
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$3(boolean r0) {
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$4(boolean r0) {
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$5(boolean r0) {
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$6(boolean r0) {
        return Unit.OXO1;
    }

    private static final Unit onItemClick$lambda$7(boolean r0) {
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(PermissionSettingsActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    private static final TextView tvActivityState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_activityState);
    }

    private static final TextView tvBatteryState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_batteryState);
    }

    private static final TextView tvContactState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_contactState);
    }

    private static final TextView tvLocationPermissionsText_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_location_permissions_text);
    }

    private static final TextView tvLocationState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_locationState);
    }

    private static final TextView tvNotificationState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_notificationState);
    }

    private static final TextView tvPhoneState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_phoneState);
    }

    private static final TextView tvSmsState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_smsState);
    }

    private static final TextView tvStoreState_delegate$lambda$0(PermissionSettingsActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_storeState);
    }

    public final View getRootView() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.permission_settings);
        TextView r0 = getTvNotificationState();
        boolean r1 = MyNotificationListenerService.O001I.O00(this);
        int r2 = R.string.permission_state_off;
        if (r1 == false) goto L5;
        int r3 = R.string.permission_state_on;
    L6:
        r0.setText(r3);
        TextView r4 = getTvLocationState();
        hr1 r5 = hr1.OXO1;
        if (r5.X00Xi1X(this) == false) goto L9;
        int r6 = R.string.permission_state_on;
    L10:
        r4.setText(r6);
        TextView r7 = getTvContactState();
        if (r5.XO0X10iO(this) == false) goto L13;
        int r8 = R.string.permission_state_on;
    L14:
        r7.setText(r8);
        TextView r9 = getTvPhoneState();
        if (r5.X1(this) == false) goto L17;
        int r10 = R.string.permission_state_on;
    L18:
        r9.setText(r10);
        TextView r11 = getTvSmsState();
        if (r5.IO0II0i(this) == false) goto L21;
        int r12 = R.string.permission_state_on;
    L22:
        r11.setText(r12);
        TextView r13 = getTvStoreState();
        if (r5.Ii0X0X(this) == false) goto L25;
        int r14 = R.string.permission_state_on;
    L26:
        r13.setText(r14);
        TextView r15 = getTvBatteryState();
        if (r5.XXiIiX10(this) == false) goto L29;
        int r16 = R.string.permission_state_on;
    L30:
        r15.setText(r16);
        TextView r17 = getTvActivityState();
        if (r5.XOX0O0(this) == false) goto L33;
        r2 = R.string.permission_state_on;
    L33:
        r17.setText(r2);
        getTvLocationPermissionsText().setText(getString(R.string.location_permissions_tip, new Object[]{AppUtils.getAppName(), AppUtils.getAppName()}));
        View r18 = findViewById(R.id.ll_adjust_media_volume_permissions);
        int r19 = 8;
        if (RomUtils.isXiaomi() == false) goto L36;
        int r20 = 0;
    L37:
        r18.setVisibility(r20);
        View r21 = findViewById(R.id.ll_activity_permissions);
        i72 r22 = i72.OXO1;
        if (r22.IOI0i0I() == true) goto L40;
    L42:
        int r23 = 8;
    L43:
        r21.setVisibility(r23);
        View r24 = findViewById(R.id.ll_store_permissions);
        if (Build.VERSION.SDK_INT < 33) goto L46;
        int r25 = 8;
    L47:
        r24.setVisibility(r25);
        View r26 = findViewById(R.id.ll_permissions_tip_all);
        if (r22.iXi() == false) goto L50;
        r19 = 0;
    L50:
        r26.setVisibility(r19);
        return;
    L46:
        r25 = 0;
        goto L47
    L40:
        if (Build.VERSION.SDK_INT < 29) goto L42;
        r23 = 0;
        goto L43
    L36:
        r20 = 8;
        goto L37
    L29:
        r16 = R.string.permission_state_off;
        goto L30
    L25:
        r14 = R.string.permission_state_off;
        goto L26
    L21:
        r12 = R.string.permission_state_off;
        goto L22
    L17:
        r10 = R.string.permission_state_off;
        goto L18
    L13:
        r8 = R.string.permission_state_off;
        goto L14
    L9:
        r6 = R.string.permission_state_off;
        goto L10
    L5:
        r3 = R.string.permission_state_off;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_permission_settings;
    }

    public final void onItemClick(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        switch(r8.getId()) {
            case 2131363530: goto L49;
            case 2131363531: goto L47;
            case 2131363538: goto L45;
            case 2131363540: goto L39;
            case 2131363549: goto L33;
            case 2131363587: goto L27;
            case 2131363599: goto L25;
            case 2131363602: goto L23;
            case 2131363605: goto L17;
            case 2131363621: goto L11;
            case 2131363622: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        hr1 r9 = hr1.OXO1;
        if (r9.Ii0X0X(this) == true) goto L9;
        r9.iX(this, new nr1());
        return;
    L9:
        PermissionUtils.launchAppDetailsSettings();
        return;
    L11:
        hr1 r10 = hr1.OXO1;
        if (r10.IO0II0i(this) == true) goto L15;
        r10.X11I(this, new mr1());
        return;
    L15:
        PermissionUtils.launchAppDetailsSettings();
        return;
    L17:
        hr1 r11 = hr1.OXO1;
        if (r11.X1(this) == true) goto L21;
        r11.XXO(this, new lr1(this));
        return;
    L21:
        PermissionUtils.launchAppDetailsSettings();
        return;
    L23:
        String r12 = "https://api.iot-solution.net/web/guide/dist/?&app=" + AppUtils.getAppName() + "&pid=58&phoneName=" + RomUtils.getRomInfo().getName() + "&lang=" + i72.OXO1.iOO1ii1(this);
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r12);
        r0.putInt("mArg1", 0);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r13 = new Intent(this, WebViewActivity.class);
        r13.putExtras(r0);
        startActivity(r13);
        return;
    L25:
        MyNotificationListenerService.O001I.I0IIOi(this);
        return;
    L27:
        hr1 r1 = hr1.OXO1;
        if (r1.X00Xi1X(this) == true) goto L31;
        hr1.X0i1O(r1, this, false, false, new jr1(), 6, null);
        return;
    L31:
        PermissionUtils.launchAppDetailsSettings();
        return;
    L33:
        hr1 r14 = hr1.OXO1;
        if (r14.XO0X10iO(this) == true) goto L37;
        r14.II1Xi0(this, new kr1());
        return;
    L37:
        PermissionUtils.launchAppDetailsSettings();
        return;
    L39:
        hr1 r15 = hr1.OXO1;
        if (r15.XXiIiX10(this) == true) goto L43;
        r15.iOO1ii1(this, new or1());
        return;
    L43:
        PermissionUtils.launchAppDetailsSettings();
        return;
    L45:
        hr1.OXO1.OII(this, new pr1());
        return;
    L47:
        hr1.OXO1.Ii0i(this);
        return;
    L49:
        hr1 r16 = hr1.OXO1;
        if (r16.XOX0O0(this) == true) goto L53;
        r16.iIiiO(this, new qr1());
        return;
    L53:
        PermissionUtils.launchAppDetailsSettings();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
