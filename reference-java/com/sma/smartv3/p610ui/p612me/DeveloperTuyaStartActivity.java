package com.sma.smartv3.p610ui.p612me;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.ut3;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.p610ui.device.BaseListFunctionActivity;
import com.sma.smartv3.p610ui.p612me.DeveloperTuyaStartActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperTuyaStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n69#2,3:166\n72#2,5:170\n1#3:169\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity\n*L\n66#1:166,3\n66#1:170,5\n66#1:169\n*E\n"})
public final class DeveloperTuyaStartActivity extends BaseListFunctionActivity<BleDevice> {

    @aa1
    private final Lazy etOldBleName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1O1X1Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaStartActivity.etOldBleName_delegate$lambda$0(this.f1420IO);
        }
    });

    @aa1
    private final Lazy etSignal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I010X10OI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaStartActivity.etSignal_delegate$lambda$0(this.f1038IO);
        }
    });

    @aa1
    private final Lazy mScanner$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1Oii1iIO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperTuyaStartActivity.mScanner_delegate$lambda$0(this.f1434IO);
        }
    });

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[PermissionStatus.values().length];
            try {
                iArr[PermissionStatus.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionStatus.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    public static final class XIi00iiXO implements OOXIOIiOO {
        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice device) {
            Intrinsics.X0O(device, "device");
            a01 a01Var = a01.OXO1;
            String string = a01Var.XIi00iiXO().getString(b01.X00Xi1X, "");
            Intrinsics.O10IXXX0X(string, "getString(...)");
            if (string.length() == 0) {
                return device.getMRssi() > a01Var.XIi00iiXO().getInt(b01.XXiIiX10, -60);
            }
            return device.getMRssi() > a01Var.XIi00iiXO().getInt(b01.XXiIiX10, -60) && Intrinsics.XOO0ii0(q62.OXO1.iOO1ii1(device.getMName()), a01Var.XIi00iiXO().getString(b01.X00Xi1X, ""));
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperTuyaStartActivity$iO */
    @SourceDebugExtension({"SMAP\nDeveloperTuyaStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1011#2,2:166\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity$mScanner$2$2\n*L\n52#1:166,2\n*E\n"})
    public static final class C18914iO implements i1OIOOIiX {

        /* JADX INFO: renamed from: com.sma.smartv3.ui.me.DeveloperTuyaStartActivity$iO$OXO1 */
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity$mScanner$2$2\n*L\n1#1,328:1\n52#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) t).getMRssi()), Integer.valueOf(-((BleDevice) t2).getMRssi()));
            }
        }

        public C18914iO() {
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean z) {
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice device) {
            Intrinsics.X0O(device, "device");
            if (DeveloperTuyaStartActivity.this.getMList().contains(device)) {
                return;
            }
            DeveloperTuyaStartActivity.this.getMList().add(device);
            List mList = DeveloperTuyaStartActivity.this.getMList();
            if (mList.size() > 1) {
                XiX0OOXI0.XOXiX0(mList, new OXO1());
            }
            DeveloperTuyaStartActivity.this.getMListAdapter().notifyDataSetChanged();
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        /* JADX INFO: renamed from: iO */
        public void mo2019iO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etOldBleName_delegate$lambda$0(DeveloperTuyaStartActivity developerTuyaStartActivity) {
        return (EditText) developerTuyaStartActivity.findViewById(R.id.et_old_ble_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etSignal_delegate$lambda$0(DeveloperTuyaStartActivity developerTuyaStartActivity) {
        return (EditText) developerTuyaStartActivity.findViewById(R.id.et_signal);
    }

    private final EditText getEtOldBleName() {
        return (EditText) this.etOldBleName$delegate.getValue();
    }

    private final EditText getEtSignal() {
        return (EditText) this.etSignal$delegate.getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) this.mScanner$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(DeveloperTuyaStartActivity developerTuyaStartActivity, AdapterView adapterView, View view, int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putString("name", developerTuyaStartActivity.getMList().get(i).getMName());
        String address = developerTuyaStartActivity.getMList().get(i).getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(address, "getAddress(...)");
        bundle.putString("mac", oe5.IXO0OOi(address, CertificateUtil.DELIMITER, "", false, 4, null));
        Intent intent = new Intent(developerTuyaStartActivity, (Class<?>) DeveloperTuyaQueryActivity.class);
        intent.putExtras(bundle);
        developerTuyaStartActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OXOI0XII mScanner_delegate$lambda$0(DeveloperTuyaStartActivity developerTuyaStartActivity) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(new XIi00iiXO()).X1ii(developerTuyaStartActivity.new C18914iO());
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (getMPermissionBackgroundPopup() == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.background_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.i0XO0I
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(DeveloperTuyaStartActivity.permissionBackgroundLocationRemind$lambda$0$0(this.f7440IO));
                }
            });
            setMPermissionBackgroundPopup(go0Var);
        }
        go0 mPermissionBackgroundPopup = getMPermissionBackgroundPopup();
        if (mPermissionBackgroundPopup != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            mPermissionBackgroundPopup.I1XOi1(rootView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionBackgroundLocationRemind$lambda$0$0(DeveloperTuyaStartActivity developerTuyaStartActivity) {
        developerTuyaStartActivity.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= 29) {
            permissionBackgroundLocationRemind();
            return;
        }
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1IOiO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperTuyaStartActivity.requestLocationPermission$lambda$0(this.f4269IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLocationPermission$lambda$0(DeveloperTuyaStartActivity developerTuyaStartActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        int i = OXO1.OXO1[it.ordinal()];
        if (i == 1) {
            EditText etOldBleName = developerTuyaStartActivity.getEtOldBleName();
            Intrinsics.O10IXXX0X(etOldBleName, "<get-etOldBleName>(...)");
            developerTuyaStartActivity.startSearch(etOldBleName);
        } else if (i != 2) {
            developerTuyaStartActivity.permissionRemind();
        } else {
            developerTuyaStartActivity.requestLocationPermission();
        }
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getMListView().setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.android.mltcode.paycertificationapi.i1X1OIi1i
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                DeveloperTuyaStartActivity.initView$lambda$0(this.f7663IO, adapterView, view, i, j);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_developer_test_tuya_start;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getMScanner().XIi00iiXO();
    }

    public final void startSearch(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (!PermissionUtils.isGranted("android.permission.ACCESS_FINE_LOCATION")) {
            requestLocationPermission();
            return;
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            requestEnableBluetooth();
            return;
        }
        if (!UtilsKt.m38846X1()) {
            locationServerRemind();
            return;
        }
        ToastUtils.showLong(R.string.search_device_remind);
        if (getEtSignal().getText().toString().length() == 0) {
            getEtSignal().setText("60");
        }
        a01 a01Var = a01.OXO1;
        a01Var.XIi00iiXO().put(b01.XXiIiX10, -Integer.parseInt(getEtSignal().getText().toString()));
        a01Var.XIi00iiXO().put(b01.X00Xi1X, getEtOldBleName().getText().toString());
        getMList().clear();
        getMListAdapter().notifyDataSetChanged();
        getMScanner().XXI(true);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2740np
    public void initItem(@aa1 ug6 holder, @aa1 BleDevice item, int i) {
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        holder.OII(R.id.tv_name, item.getMName());
        holder.OII(R.id.tv_address, item.getMBluetoothDevice().getAddress());
        ((ImageView) holder.O00(R.id.iv_rssi)).setImageLevel(-item.getMRssi());
    }
}
