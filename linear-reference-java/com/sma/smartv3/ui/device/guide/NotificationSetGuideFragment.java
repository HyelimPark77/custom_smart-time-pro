package com.sma.smartv3.ui.device.guide;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.X1Oi0i;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.gb1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.la1;
import com.android.mltcode.paycertificationapi.ma1;
import com.android.mltcode.paycertificationapi.na1;
import com.android.mltcode.paycertificationapi.oa1;
import com.android.mltcode.paycertificationapi.pa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.vg6;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nNotificationSetGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n13805#2,2:186\n1#3:188\n*S KotlinDebug\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n*L\n76#1:186,2\n*E\n"})
public final class NotificationSetGuideFragment extends BaseFragment implements CompoundButton.OnCheckedChangeListener {
    private CheckBox checkCall;
    private CheckBox checkSms;
    private ListView defautListView;
    private View ll;

    @tb1
    private go0 mPermissionPopup;

    public static final class OXO1 extends XII0Oi10O<X1Oi0i> {
        public final /* synthetic */ List<X1Oi0i> X11iII1O1;

        public OXO1(List<X1Oi0i> r2, Activity r3) {
            this.X11iII1O1 = r2;
            super(r3, R.layout.item_notification, r2);
        }

        public static /* synthetic */ void O00(List r0, int r1, View r2) {
            XOO0ii0(r0, r1, r2);
        }

        public static final void XOO0ii0(List r3, int r4, View r5) {
            ((X1Oi0i) r3.get(r4)).O00(!((X1Oi0i) r3.get(r4)).XO0O10());
            a01.OXO1.iO().put(b01.OXO1 + ((X1Oi0i) r3.get(r4)).iO(), ((X1Oi0i) r3.get(r4)).XO0O10());
            LogUtils.d(new Object[]{((X1Oi0i) r3.get(r4)).toString()});
        }

        public void IiI10X(ug6 r6, X1Oi0i r7, final int r8) {
            Intrinsics.X0O(r6, "holder");
            Intrinsics.X0O(r7, MapController.ITEM_LAYER_TAG);
            final List<X1Oi0i> r9 = this.X11iII1O1;
            r6.I0iXXO(R.id.iv_icon, r9.get(r8).OXO1());
            r6.OII(R.id.tv_name, r9.get(r8).XIi00iiXO());
            r9.get(r8).O00(a01.OXO1.iO().getBoolean(b01.OXO1 + r9.get(r8).iO(), false));
            r6.IO(R.id.check_enabled, r9.get(r8).XO0O10());
            vg6.OXO1(r6, R.id.check_enabled, new pa1(r9, r8));
        }

        @Override // com.android.mltcode.paycertificationapi.XII0Oi10O, com.android.mltcode.paycertificationapi.sv0
        public /* bridge */ /* synthetic */ void XIi00iiXO(ug6 r1, Object r2, int r3) {
            IiI10X(r1, (X1Oi0i) r2, r3);
        }

        @Override // com.android.mltcode.paycertificationapi.sv0, android.widget.Adapter
        public int getCount() {
            return this.X11iII1O1.size();
        }
    }

    public NotificationSetGuideFragment() {
    }

    public static /* synthetic */ Unit XIi00iiXO(boolean r0, NotificationSetGuideFragment r1, CompoundButton r2, PermissionStatus r3) {
        return onCheckedChanged$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XO0O10(boolean r0, NotificationSetGuideFragment r1, CompoundButton r2, PermissionStatus r3) {
        return onCheckedChanged$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ boolean iO() {
        return permissionRemind$lambda$0$0();
    }

    private static final Unit onCheckedChanged$lambda$0(boolean r1, NotificationSetGuideFragment r2, CompoundButton r3, PermissionStatus r4) {
        Intrinsics.X0O(r4, "it");
        if (r4 != PermissionStatus.GRANTED) goto L5;
        a01.OXO1.iO().put(b01.XIi00iiXO, r1);
        BleInitializer r5 = BleInitializer.IO;
        r5.IOI();
        r5.IIX(r2.getMActivity());
    L7:
        return Unit.OXO1;
    L5:
        r2.permissionRemind();
        r3.setChecked(!r1);
        goto L7
    }

    private static final Unit onCheckedChanged$lambda$1(boolean r1, NotificationSetGuideFragment r2, CompoundButton r3, PermissionStatus r4) {
        Intrinsics.X0O(r4, "it");
        if (r4 != PermissionStatus.GRANTED) goto L5;
        a01.OXO1.iO().put(b01.iO, r1);
        BleInitializer.IO.O0i();
    L7:
        return Unit.OXO1;
    L5:
        r2.permissionRemind();
        r3.setChecked(!r1);
        goto L7
    }

    private static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private final void showDefaultList() {
        ArrayList r0 = new ArrayList();
        String[] r1 = i72.OXO1.I1();
        int r2 = r1.length;
        int r4 = 0;
    L3:
        ListView r5 = null;
        Drawable r6 = null;
        if (r4 >= r2) goto L20;
        String r7 = r1[r4];
        ApplicationInfo r8 = getMActivity().getPackageManager().getApplicationInfo(r7, 0);     // Catch: Exception -> L8
    L9:
        if (r8 == null) goto L12;
        X1Oi0i r9 = new X1Oi0i();
        r9.IiI10X(r8.loadIcon(getMActivity().getPackageManager()));
        r9.XOO0ii0(r8.loadLabel(getMActivity().getPackageManager()).toString());
        r9.I0IIOi(r8.packageName);
        r0.add(r9);
    L19:
        r4 = r4 + 1;
        goto L3
    L12:
        if (i72.OXO1.O0Ii() == false) goto L19;
        Pair<Integer, String> r10 = la1.OXO1.OXO1(r7);
        int r11 = r10.component1().intValue();
        String r12 = r10.component2();
        if (r12.length() <= 0) goto L19;
        X1Oi0i r13 = new X1Oi0i();
        FragmentActivity r14 = getActivity();
        if (r14 == null) goto L18;
        r6 = r14.getDrawable(r11);
    L18:
        r13.IiI10X(r6);
        r13.XOO0ii0(r12);
        r13.I0IIOi(r7);
        r0.add(r13);
    L8:
        r8 = null;
        goto L9
    L20:
        OXO1 r3 = new OXO1(r0, getMActivity());
        ListView r15 = this.defautListView;
        if (r15 != null) goto L23;
        Intrinsics.XXO("defautListView");
    L24:
        r5.setAdapter(r3);
        return;
    L23:
        r5 = r15;
        goto L24
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMView().findViewById(R.id.ll);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        this.ll = r0;
        View r1 = getMView().findViewById(R.id.check_call);
        Intrinsics.O10IXXX0X(r1, "findViewById(...)");
        this.checkCall = (CheckBox) r1;
        View r2 = getMView().findViewById(R.id.check_sms);
        Intrinsics.O10IXXX0X(r2, "findViewById(...)");
        this.checkSms = (CheckBox) r2;
        View r3 = getMView().findViewById(R.id.default_list_view);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        this.defautListView = (ListView) r3;
        boolean r4 = true;
        CheckBox r6 = null;
        if (q62.OXO1.OI() == false) goto L16;
        View r5 = this.ll;
        if (r5 != null) goto L7;
        Intrinsics.XXO("ll");
        r5 = null;
    L7:
        r5.setVisibility(0);
        boolean r7 = a01.OXO1.iO().getBoolean(b01.XIi00iiXO, false);
        CheckBox r8 = this.checkCall;
        if (r8 != null) goto L10;
        Intrinsics.XXO("checkCall");
        r8 = null;
    L10:
        if (r7 == false) goto L14;
        String[] r9 = gb1.OXO1();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r9, r9.length)) == false) goto L14;
        boolean r10 = true;
    L15:
        r8.setChecked(r10);
    L20:
        boolean r11 = a01.OXO1.iO().getBoolean(b01.iO, false);
        CheckBox r12 = this.checkSms;
        if (r12 != null) goto L23;
        Intrinsics.XXO("checkSms");
        r12 = null;
    L23:
        if (r11 == false) goto L27;
        String[] r13 = gb1.XIi00iiXO();
        if (PermissionUtils.isGranted((String[]) Arrays.copyOf(r13, r13.length)) == false) goto L27;
    L28:
        r12.setChecked(r4);
        CheckBox r14 = this.checkCall;
        if (r14 != null) goto L31;
        Intrinsics.XXO("checkCall");
        r14 = null;
    L31:
        r14.setOnCheckedChangeListener(this);
        CheckBox r15 = this.checkSms;
        if (r15 != null) goto L34;
        Intrinsics.XXO("checkSms");
    L35:
        r6.setOnCheckedChangeListener(this);
        showDefaultList();
        return;
    L34:
        r6 = r15;
    L27:
        r4 = false;
    L14:
        r10 = false;
        goto L15
    L16:
        View r16 = this.ll;
        if (r16 != null) goto L19;
        Intrinsics.XXO("ll");
        r16 = null;
    L19:
        r16.setVisibility(8);
        a01.OXO1.iO().put(b01.XIi00iiXO, false);
        goto L20
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_app_guide_notification;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@aa1 final CompoundButton r10, final boolean r11) {
        Intrinsics.X0O(r10, "buttonView");
        int r0 = r10.getId();
        if (r0 != R.id.check_call) goto L5;
        if (r11 == false) goto L15;
        PermissionUtils r3 = PermissionUtils.permission(new String[]{"PHONE", PermissionConstants.CONTACTS});
        Intrinsics.O10IXXX0X(r3, "permission(...)");
        ds1.iO(r3, null, null, new ma1(r11, this, r10), 3, null);
        return;
    L15:
        a01.OXO1.iO().put(b01.XIi00iiXO, r11);
        BleInitializer.IO.IOI();
        return;
    L5:
        if (r0 == R.id.check_sms) goto L7;
        return;
    L7:
        if (r11 == false) goto L10;
        PermissionUtils r4 = PermissionUtils.permission(new String[]{PermissionConstants.SMS});
        Intrinsics.O10IXXX0X(r4, "permission(...)");
        ds1.iO(r4, null, null, new na1(r11, this, r10), 3, null);
        return;
    L10:
        a01.OXO1.iO().put(b01.iO, r11);
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup != null) goto L5;
        go0 r0 = new go0(getMActivity(), 0, 2, null);
        r0.O1O(R.string.permission_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new oa1());
        this.mPermissionPopup = r0;
    L5:
        go0 r1 = this.mPermissionPopup;
        if (r1 == null) goto L9;
        r1.X0O(R.id.root_view);
        return;
    }
}
