package com.sma.smartv3.ui.me;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.android.mltcode.paycertificationapi.I010X10OI;
import com.android.mltcode.paycertificationapi.I1O1X1Xi;
import com.android.mltcode.paycertificationapi.I1Oii1iIO;
import com.android.mltcode.paycertificationapi.OOXIOIiOO;
import com.android.mltcode.paycertificationapi.OXOI0XII;
import com.android.mltcode.paycertificationapi.X1IOiO;
import com.android.mltcode.paycertificationapi.X1OOO;
import com.android.mltcode.paycertificationapi.XII0Oi10O;
import com.android.mltcode.paycertificationapi.XiX0OOXI0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0XO0I;
import com.android.mltcode.paycertificationapi.i1OIOOIiX;
import com.android.mltcode.paycertificationapi.i1X1OIi1i;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ug6;
import com.android.mltcode.paycertificationapi.ut3;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.bestmafen.baseble.scanner.BleDevice;
import com.bestmafen.baseble.scanner.ScanMode;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.BaseListFunctionActivity;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperTuyaStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n69#2,3:166\n72#2,5:170\n1#3:169\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity\n*L\n66#1:166,3\n66#1:170,5\n66#1:169\n*E\n"})
public final class DeveloperTuyaStartActivity extends BaseListFunctionActivity<BleDevice> {

    @aa1
    private final Lazy etOldBleName$delegate;

    @aa1
    private final Lazy etSignal$delegate;

    @aa1
    private final Lazy mScanner$delegate;

    public static final /* synthetic */ class OXO1 {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[PermissionStatus.values().length];
            r0[PermissionStatus.GRANTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[PermissionStatus.DENIED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    public static final class XIi00iiXO implements OOXIOIiOO {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.OOXIOIiOO
        public boolean OXO1(BleDevice r10) {
            Intrinsics.X0O(r10, "device");
            a01 r0 = a01.OXO1;
            String r1 = r0.XIi00iiXO().getString(b01.X00Xi1X, "");
            Intrinsics.O10IXXX0X(r1, "getString(...)");
            if (r1.length() != 0) goto L9;
            if (r10.getMRssi() <= r0.XIi00iiXO().getInt(b01.XXiIiX10, -60)) goto L7;
            return true;
        L7:
            return false;
        L9:
            if (r10.getMRssi() > r0.XIi00iiXO().getInt(b01.XXiIiX10, -60)) goto L11;
        L13:
            return false;
        L11:
            if (Intrinsics.XOO0ii0(q62.OXO1.iOO1ii1(r10.getMName()), r0.XIi00iiXO().getString(b01.X00Xi1X, "")) == false) goto L13;
            return true;
        }
    }

    @SourceDebugExtension({"SMAP\nDeveloperTuyaStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1011#2,2:166\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity$mScanner$2$2\n*L\n52#1:166,2\n*E\n"})
    public static final class iO implements i1OIOOIiX {
        public final /* synthetic */ DeveloperTuyaStartActivity OXO1;

        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DeveloperTuyaStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaStartActivity$mScanner$2$2\n*L\n1#1,328:1\n52#2:329\n*E\n"})
        public static final class OXO1<T> implements Comparator {
            public OXO1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T r1, T r2) {
                return ComparisonsKt__ComparisonsKt.I0iXXO(Integer.valueOf(-((BleDevice) r1).getMRssi()), Integer.valueOf(-((BleDevice) r2).getMRssi()));
            }
        }

        public iO(DeveloperTuyaStartActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void OXO1(boolean r1) {
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void XIi00iiXO(BleDevice r3) {
            Intrinsics.X0O(r3, "device");
            if (DeveloperTuyaStartActivity.access$getMList(this.OXO1).contains(r3) == false) goto L5;
            return;
        L5:
            DeveloperTuyaStartActivity.access$getMList(this.OXO1).add(r3);
            List r4 = DeveloperTuyaStartActivity.access$getMList(this.OXO1);
            if (r4.size() <= 1) goto L8;
            XiX0OOXI0.XOXiX0(r4, new OXO1());
        L8:
            DeveloperTuyaStartActivity.access$getMListAdapter(this.OXO1).notifyDataSetChanged();
        }

        @Override // com.android.mltcode.paycertificationapi.i1OIOOIiX
        public void iO() {
        }
    }

    public DeveloperTuyaStartActivity() {
        this.etOldBleName$delegate = LazyKt__LazyJVMKt.iO(new I1O1X1Xi(this));
        this.etSignal$delegate = LazyKt__LazyJVMKt.iO(new I010X10OI(this));
        this.mScanner$delegate = LazyKt__LazyJVMKt.iO(new I1Oii1iIO(this));
    }

    public static /* synthetic */ EditText I1XOi1(DeveloperTuyaStartActivity r0) {
        return etOldBleName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(DeveloperTuyaStartActivity r0) {
        return permissionBackgroundLocationRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ OXOI0XII O10IXXX0X(DeveloperTuyaStartActivity r0) {
        return mScanner_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0O(DeveloperTuyaStartActivity r0, PermissionStatus r1) {
        return requestLocationPermission$lambda$0(r0, r1);
    }

    public static /* synthetic */ EditText X1ii(DeveloperTuyaStartActivity r0) {
        return etSignal_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(DeveloperTuyaStartActivity r0, AdapterView r1, View r2, int r3, long r4) {
        initView$lambda$0(r0, r1, r2, r3, r4);
    }

    public static final /* synthetic */ List access$getMList(DeveloperTuyaStartActivity r0) {
        return r0.getMList();
    }

    public static final /* synthetic */ XII0Oi10O access$getMListAdapter(DeveloperTuyaStartActivity r0) {
        return r0.getMListAdapter();
    }

    private static final EditText etOldBleName_delegate$lambda$0(DeveloperTuyaStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_old_ble_name);
    }

    private static final EditText etSignal_delegate$lambda$0(DeveloperTuyaStartActivity r1) {
        return (EditText) r1.findViewById(R.id.et_signal);
    }

    private final EditText getEtOldBleName() {
        return (EditText) getValue();
    }

    private final EditText getEtSignal() {
        return (EditText) getValue();
    }

    private final OXOI0XII getMScanner() {
        return (OXOI0XII) getValue();
    }

    private static final void initView$lambda$0(DeveloperTuyaStartActivity r6, AdapterView r7, View r8, int r9, long r10) {
        Bundle r11 = new Bundle();
        r11.putString("name", r6.getMList().get(r9).getMName());
        String r0 = r6.getMList().get(r9).getMBluetoothDevice().getAddress();
        Intrinsics.O10IXXX0X(r0, "getAddress(...)");
        r11.putString("mac", oe5.IXO0OOi(r0, CertificateUtil.DELIMITER, "", false, 4, null));
        Intent r12 = new Intent(r6, DeveloperTuyaQueryActivity.class);
        r12.putExtras(r11);
        r6.startActivity(r12);
    }

    private static final OXOI0XII mScanner_delegate$lambda$0(DeveloperTuyaStartActivity r4) {
        return ut3.XIi00iiXO(ut3.OXO1, null, ScanMode.LOW_LATENCY, 1, null).IIX1OXO(10).XiOIO(new XIi00iiXO()).X1ii(new iO(r4));
    }

    @RequiresApi(29)
    private final void permissionBackgroundLocationRemind() {
        if (getMPermissionBackgroundPopup() != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.background_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new i0XO0I(this));
        setMPermissionBackgroundPopup(r0);
    L5:
        go0 r1 = getMPermissionBackgroundPopup();
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    private static final boolean permissionBackgroundLocationRemind$lambda$0$0(DeveloperTuyaStartActivity r2) {
        r2.getMContext().requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 3);
        return true;
    }

    private final void requestEnableBluetooth() {
        X1OOO.IIX1OXO(this, "android.bluetooth.adapter.action.REQUEST_ENABLE", 1, 0, 4, null);
    }

    private final void requestLocationPermission() {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        permissionBackgroundLocationRemind();
        return;
    L6:
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new X1IOiO(this), 3, null);
    }

    private static final Unit requestLocationPermission$lambda$0(DeveloperTuyaStartActivity r1, PermissionStatus r2) {
        Intrinsics.X0O(r2, "it");
        int r3 = OXO1.OXO1[r2.ordinal()];
        if (r3 != 1) goto L5;
        EditText r4 = r1.getEtOldBleName();
        Intrinsics.O10IXXX0X(r4, "<get-etOldBleName>(...)");
        r1.startSearch(r4);
    L10:
        return Unit.OXO1;
    L5:
        if (r3 == 2) goto L7;
        r1.permissionRemind();
        goto L10
    L7:
        r1.requestLocationPermission();
        goto L10
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.np
    public /* bridge */ /* synthetic */ void initItem(ug6 r1, Object r2, int r3) {
        initItem(r1, (BleDevice) r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<BleDevice> initList() {
        return new ArrayList();
    }

    @Override // com.bestmafen.androidbase.list.BaseListActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getMListView().setOnItemClickListener(new i1X1OIi1i(this));
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.item_device;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_developer_test_tuya_start;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getMScanner().XIi00iiXO();
    }

    public final void startSearch(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        if (PermissionUtils.isGranted(new String[]{"android.permission.ACCESS_FINE_LOCATION"}) == true) goto L7;
        requestLocationPermission();
        return;
    L7:
        if (BluetoothAdapter.getDefaultAdapter().isEnabled() == true) goto L11;
        requestEnableBluetooth();
        return;
    L11:
        if (UtilsKt.X1() == true) goto L14;
        locationServerRemind();
        return;
    L14:
        ToastUtils.showLong(R.string.search_device_remind);
        if (getEtSignal().getText().toString().length() != 0) goto L17;
        getEtSignal().setText("60");
    L17:
        a01 r5 = a01.OXO1;
        r5.XIi00iiXO().put(b01.XXiIiX10, -Integer.parseInt(getEtSignal().getText().toString()));
        r5.XIi00iiXO().put(b01.X00Xi1X, getEtOldBleName().getText().toString());
        getMList().clear();
        getMListAdapter().notifyDataSetChanged();
        getMScanner().XXI(true);
    }

    public void initItem(@aa1 ug6 r2, @aa1 BleDevice r3, int r4) {
        Intrinsics.X0O(r2, "holder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.OII(R.id.tv_name, r3.getMName());
        r2.OII(R.id.tv_address, r3.getMBluetoothDevice().getAddress());
        ((ImageView) r2.O00(R.id.iv_rssi)).setImageLevel(-r3.getMRssi());
    }
}
