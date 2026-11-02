package com.sma.smartv3.p610ui.device.guide;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
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
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.vg6;
import com.bestmafen.androidbase.base.BaseFragment;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.guide.NotificationSetGuideFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nNotificationSetGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n13805#2,2:186\n1#3:188\n*S KotlinDebug\n*F\n+ 1 NotificationSetGuideFragment.kt\ncom/sma/smartv3/ui/device/guide/NotificationSetGuideFragment\n*L\n76#1:186,2\n*E\n"})
public final class NotificationSetGuideFragment extends BaseFragment implements CompoundButton.OnCheckedChangeListener {
    private CheckBox checkCall;
    private CheckBox checkSms;
    private ListView defautListView;

    /* JADX INFO: renamed from: ll */
    private View f54568ll;

    @tb1
    private go0 mPermissionPopup;

    public static final class OXO1 extends XII0Oi10O<X1Oi0i> {
        public final /* synthetic */ List<X1Oi0i> X11iII1O1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OXO1(List<X1Oi0i> list, Activity activity) {
            super(activity, R.layout.item_notification, list);
            this.X11iII1O1 = list;
        }

        public static final void XOO0ii0(List list, int i, View view) {
            ((X1Oi0i) list.get(i)).O00(!((X1Oi0i) list.get(i)).XO0O10());
            a01.OXO1.m1440iO().put(b01.OXO1 + ((X1Oi0i) list.get(i)).m1164iO(), ((X1Oi0i) list.get(i)).XO0O10());
            LogUtils.m11128d(((X1Oi0i) list.get(i)).toString());
        }

        @Override // com.android.mltcode.paycertificationapi.XII0Oi10O, com.android.mltcode.paycertificationapi.sv0
        /* JADX INFO: renamed from: IiI10X, reason: merged with bridge method [inline-methods] */
        public void XIi00iiXO(ug6 holder, X1Oi0i item, final int i) {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(item, "item");
            final List<X1Oi0i> list = this.X11iII1O1;
            holder.I0iXXO(R.id.iv_icon, list.get(i).OXO1());
            holder.OII(R.id.tv_name, list.get(i).XIi00iiXO());
            list.get(i).O00(a01.OXO1.m1440iO().getBoolean(b01.OXO1 + list.get(i).m1164iO(), false));
            holder.m3168IO(R.id.check_enabled, list.get(i).XO0O10());
            vg6.OXO1(holder, R.id.check_enabled, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.pa1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NotificationSetGuideFragment.OXO1.XOO0ii0(list, i, view);
                }
            });
        }

        @Override // com.android.mltcode.paycertificationapi.sv0, android.widget.Adapter
        public int getCount() {
            return this.X11iII1O1.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCheckedChanged$lambda$0(boolean z, NotificationSetGuideFragment notificationSetGuideFragment, CompoundButton compoundButton, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            a01.OXO1.m1440iO().put(b01.XIi00iiXO, z);
            BleInitializer bleInitializer = BleInitializer.f51208IO;
            bleInitializer.IOI();
            bleInitializer.IIX(notificationSetGuideFragment.getMActivity());
        } else {
            notificationSetGuideFragment.permissionRemind();
            compoundButton.setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCheckedChanged$lambda$1(boolean z, NotificationSetGuideFragment notificationSetGuideFragment, CompoundButton compoundButton, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            a01.OXO1.m1440iO().put(b01.f5637iO, z);
            BleInitializer.f51208IO.O0i();
        } else {
            notificationSetGuideFragment.permissionRemind();
            compoundButton.setChecked(!z);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private final void showDefaultList() {
        ListView listView;
        ApplicationInfo applicationInfo;
        ArrayList arrayList = new ArrayList();
        String[] strArrM2040I1 = i72.OXO1.m2040I1();
        int length = strArrM2040I1.length;
        int i = 0;
        while (true) {
            listView = null;
            if (i >= length) {
                break;
            }
            String str = strArrM2040I1[i];
            try {
                applicationInfo = getMActivity().getPackageManager().getApplicationInfo(str, 0);
            } catch (Exception unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                X1Oi0i x1Oi0i = new X1Oi0i();
                x1Oi0i.IiI10X(applicationInfo.loadIcon(getMActivity().getPackageManager()));
                x1Oi0i.XOO0ii0(applicationInfo.loadLabel(getMActivity().getPackageManager()).toString());
                x1Oi0i.I0IIOi(applicationInfo.packageName);
                arrayList.add(x1Oi0i);
            } else if (i72.OXO1.O0Ii()) {
                Pair<Integer, String> pairOXO1 = la1.OXO1.OXO1(str);
                int iIntValue = pairOXO1.component1().intValue();
                String strComponent2 = pairOXO1.component2();
                if (strComponent2.length() > 0) {
                    X1Oi0i x1Oi0i2 = new X1Oi0i();
                    FragmentActivity activity = getActivity();
                    x1Oi0i2.IiI10X(activity != null ? activity.getDrawable(iIntValue) : null);
                    x1Oi0i2.XOO0ii0(strComponent2);
                    x1Oi0i2.I0IIOi(str);
                    arrayList.add(x1Oi0i2);
                }
            }
            i++;
        }
        OXO1 oxo1 = new OXO1(arrayList, getMActivity());
        ListView listView2 = this.defautListView;
        if (listView2 == null) {
            Intrinsics.XXO("defautListView");
        } else {
            listView = listView2;
        }
        listView.setAdapter((ListAdapter) oxo1);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0  */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        boolean z;
        boolean z2;
        View viewFindViewById = getMView().findViewById(R.id.f51418ll);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f54568ll = viewFindViewById;
        View viewFindViewById2 = getMView().findViewById(R.id.check_call);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.checkCall = (CheckBox) viewFindViewById2;
        View viewFindViewById3 = getMView().findViewById(R.id.check_sms);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.checkSms = (CheckBox) viewFindViewById3;
        View viewFindViewById4 = getMView().findViewById(R.id.default_list_view);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        this.defautListView = (ListView) viewFindViewById4;
        CheckBox checkBox = null;
        if (q62.OXO1.m2882OI()) {
            View view = this.f54568ll;
            if (view == null) {
                Intrinsics.XXO("ll");
                view = null;
            }
            view.setVisibility(0);
            boolean z3 = a01.OXO1.m1440iO().getBoolean(b01.XIi00iiXO, false);
            CheckBox checkBox2 = this.checkCall;
            if (checkBox2 == null) {
                Intrinsics.XXO("checkCall");
                checkBox2 = null;
            }
            if (z3) {
                String[] strArrOXO1 = gb1.OXO1();
                if (PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrOXO1, strArrOXO1.length))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            checkBox2.setChecked(z2);
        } else {
            View view2 = this.f54568ll;
            if (view2 == null) {
                Intrinsics.XXO("ll");
                view2 = null;
            }
            view2.setVisibility(8);
            a01.OXO1.m1440iO().put(b01.XIi00iiXO, false);
        }
        boolean z4 = a01.OXO1.m1440iO().getBoolean(b01.f5637iO, false);
        CheckBox checkBox3 = this.checkSms;
        if (checkBox3 == null) {
            Intrinsics.XXO("checkSms");
            checkBox3 = null;
        }
        if (z4) {
            String[] strArrXIi00iiXO = gb1.XIi00iiXO();
            z = PermissionUtils.isGranted((String[]) Arrays.copyOf(strArrXIi00iiXO, strArrXIi00iiXO.length));
        }
        checkBox3.setChecked(z);
        CheckBox checkBox4 = this.checkCall;
        if (checkBox4 == null) {
            Intrinsics.XXO("checkCall");
            checkBox4 = null;
        }
        checkBox4.setOnCheckedChangeListener(this);
        CheckBox checkBox5 = this.checkSms;
        if (checkBox5 == null) {
            Intrinsics.XXO("checkSms");
        } else {
            checkBox = checkBox5;
        }
        checkBox.setOnCheckedChangeListener(this);
        showDefaultList();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_app_guide_notification;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(@aa1 final CompoundButton buttonView, final boolean z) {
        Intrinsics.X0O(buttonView, "buttonView");
        int id = buttonView.getId();
        if (id == R.id.check_call) {
            if (!z) {
                a01.OXO1.m1440iO().put(b01.XIi00iiXO, z);
                BleInitializer.f51208IO.IOI();
                return;
            } else {
                PermissionUtils permissionUtilsPermission = PermissionUtils.permission("PHONE", PermissionConstants.CONTACTS);
                Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
                ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ma1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return NotificationSetGuideFragment.onCheckedChanged$lambda$0(z, this, buttonView, (PermissionStatus) obj);
                    }
                }, 3, null);
                return;
            }
        }
        if (id != R.id.check_sms) {
            return;
        }
        if (!z) {
            a01.OXO1.m1440iO().put(b01.f5637iO, z);
            return;
        }
        PermissionUtils permissionUtilsPermission2 = PermissionUtils.permission(PermissionConstants.SMS);
        Intrinsics.O10IXXX0X(permissionUtilsPermission2, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission2, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.na1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotificationSetGuideFragment.onCheckedChanged$lambda$1(z, this, buttonView, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.O1O(R.string.permission_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.oa1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(NotificationSetGuideFragment.permissionRemind$lambda$0$0());
                }
            });
            this.mPermissionPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionPopup;
        if (go0Var2 != null) {
            go0Var2.X0O(R.id.root_view);
        }
    }
}
