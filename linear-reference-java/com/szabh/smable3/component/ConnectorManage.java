package com.szabh.smable3.component;

import android.app.Application;
import com.android.mltcode.paycertificationapi.X0i1I1IX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nConnectorManage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectorManage.kt\ncom/szabh/smable3/component/ConnectorManage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n1#2:195\n1869#3,2:196\n*S KotlinDebug\n*F\n+ 1 ConnectorManage.kt\ncom/szabh/smable3/component/ConnectorManage\n*L\n134#1:196,2\n*E\n"})
public final class ConnectorManage {

    @aa1
    public static final ConnectorManage INSTANCE = null;
    private static boolean isMultiDevice;
    private static Application mApp;

    @aa1
    private static final List<MultiDeviceBleConnector> mBleConnectors = null;

    static {
        INSTANCE = new ConnectorManage();
        mBleConnectors = new ArrayList();
    }

    private ConnectorManage() {
    }

    public static /* synthetic */ Unit OXO1(Function1 r0, MultiDeviceBleConnector r1) {
        return forConnector$lambda$0(r0, r1);
    }

    private static final Unit forConnector$lambda$0(Function1 r1, MultiDeviceBleConnector r2) {
        Intrinsics.X0O(r2, "it");
        r1.invoke(r2);
        return Unit.OXO1;
    }

    private final void forEachConnector(List<MultiDeviceBleConnector> r2, Function1<? super MultiDeviceBleConnector, Unit> r3) {
        Iterator<T> r4 = r2.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        r3.invoke((MultiDeviceBleConnector) r4.next());
        goto L4
    }

    @aa1
    public final MultiDeviceBleConnector buildBleConnector(@aa1 String r15) {
        Intrinsics.X0O(r15, "mac");
        Iterator<T> r0 = mBleConnectors.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((MultiDeviceBleConnector) r1).getAddress(), r15) == false) goto L4;
    L9:
        MultiDeviceBleConnector r2 = (MultiDeviceBleConnector) r1;
        if (r2 != null) goto L17;
        MultiDeviceBleConnector r3 = new MultiDeviceBleConnector();
        Application r4 = mApp;
        if (r4 != null) goto L14;
        Intrinsics.XXO("mApp");
        Application r5 = null;
    L15:
        BaseBleConnector.init$default(r3, r5, false, false, false, false, false, 0, BaseBleCache.Companion.create(r15), 126, null);
        mBleConnectors.add(r3);
        r3.setRefreshDeviceInfo(false);
        BleConnector.INSTANCE.activateMultiDeviceConnector(r3);
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(r3.getBleCache());
        return r3;
    L14:
        r5 = r4;
        goto L15
    L17:
        BleConnector.INSTANCE.activateMultiDeviceConnector(r2);
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(r2.getBleCache());
        return r2;
    L8:
        r1 = null;
        goto L9
    }

    public final boolean deleteMultiDeviceBleConnector(@aa1 String r4) {
        Intrinsics.X0O(r4, "mac");
        Iterator<T> r0 = mBleConnectors.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((MultiDeviceBleConnector) r1).getAddress(), r4) == false) goto L4;
    L9:
        MultiDeviceBleConnector r2 = (MultiDeviceBleConnector) r1;
        if (r2 == null) goto L15;
        r2.getBleCache().clear();
        r2.removeCallbacksAndMessages();
        List<MultiDeviceBleConnector> r5 = mBleConnectors;
        boolean r3 = r5.remove(r2);
        if (r5.isEmpty() == false) goto L14;
        BleCache.INSTANCE.clear();
    L14:
        return r3;
    L15:
        return false;
    L8:
        r1 = null;
        goto L9
    }

    public final void forConnector(@aa1 final Function1<? super MultiDeviceBleConnector, Unit> r3) {
        Intrinsics.X0O(r3, "action");
        forEachConnector(mBleConnectors, new X0i1I1IX(r3));
    }

    @tb1
    public final MultiDeviceBleConnector getCurDeviceBleConnector(@aa1 String r5) {
        Intrinsics.X0O(r5, "mac");
        Iterator<T> r0 = mBleConnectors.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((MultiDeviceBleConnector) r1).getAddress(), r5) == false) goto L4;
    L9:
        MultiDeviceBleConnector r2 = (MultiDeviceBleConnector) r1;
        if (r2 == null) goto L12;
        return r2;
    L12:
        return null;
    L8:
        r1 = null;
        goto L9
    }

    @tb1
    public final MultiDeviceBleConnector getMultiDeviceBleConnector(@aa1 String r3) {
        Intrinsics.X0O(r3, "mac");
        MultiDeviceBleConnector r4 = getCurDeviceBleConnector(r3);
        if (r4 == null) goto L5;
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(r4.getBleCache());
        BleConnector.INSTANCE.activateMultiDeviceConnector(r4);
    L5:
        return r4;
    }

    @aa1
    public final List<MultiDeviceBleConnector> getMultiDeviceList() {
        return mBleConnectors;
    }

    public final void init(@aa1 Application r2) {
        Intrinsics.X0O(r2, "app");
        if (mApp == null) goto L5;
        return;
    L5:
        mApp = r2;
    }

    public final boolean isMultiDevice() {
        return isMultiDevice;
    }

    @aa1
    public final MultiDeviceBleConnector newBleConnector(@aa1 String r15) {
        Intrinsics.X0O(r15, "mac");
        Iterator<T> r0 = mBleConnectors.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        Object r1 = r0.next();
        if (Intrinsics.XOO0ii0(((MultiDeviceBleConnector) r1).getAddress(), r15) == false) goto L4;
    L9:
        MultiDeviceBleConnector r2 = (MultiDeviceBleConnector) r1;
        if (r2 != null) goto L17;
        MultiDeviceBleConnector r3 = new MultiDeviceBleConnector();
        Application r4 = mApp;
        if (r4 != null) goto L14;
        Intrinsics.XXO("mApp");
        Application r5 = null;
    L15:
        BaseBleConnector.init$default(r3, r5, false, false, false, false, false, 0, BaseBleCache.Companion.create(r15), 126, null);
        mBleConnectors.add(r3);
        r3.setRefreshDeviceInfo(false);
        BleConnector.INSTANCE.activateMultiDeviceConnector(r3);
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(r3.getBleCache());
        return r3;
    L14:
        r5 = r4;
        goto L15
    L17:
        BleConnector.INSTANCE.activateMultiDeviceConnector(r2);
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(r2.getBleCache());
        return r2;
    L8:
        r1 = null;
        goto L9
    }

    public final void setMultiDevice(boolean r1) {
        isMultiDevice = r1;
    }
}
