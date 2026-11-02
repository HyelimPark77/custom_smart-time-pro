package com.szabh.smable3.component;

import android.app.Application;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.ConnectorManage;
import com.szabh.smable3.component.MultiDeviceBleConnector;
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
    private static boolean isMultiDevice;
    private static Application mApp;

    @aa1
    public static final ConnectorManage INSTANCE = new ConnectorManage();

    @aa1
    private static final List<MultiDeviceBleConnector> mBleConnectors = new ArrayList();

    private ConnectorManage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit forConnector$lambda$0(Function1 function1, MultiDeviceBleConnector it) {
        Intrinsics.X0O(it, "it");
        function1.invoke2(it);
        return Unit.OXO1;
    }

    private final void forEachConnector(List<MultiDeviceBleConnector> list, Function1<? super MultiDeviceBleConnector, Unit> function1) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            function1.invoke2((MultiDeviceBleConnector) it.next());
        }
    }

    @aa1
    public final MultiDeviceBleConnector buildBleConnector(@aa1 String mac) {
        Object next;
        Application application;
        Intrinsics.X0O(mac, "mac");
        Iterator<T> it = mBleConnectors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((MultiDeviceBleConnector) next).getAddress(), mac));
        MultiDeviceBleConnector multiDeviceBleConnector = (MultiDeviceBleConnector) next;
        if (multiDeviceBleConnector != null) {
            BleConnector.INSTANCE.activateMultiDeviceConnector(multiDeviceBleConnector);
            BleCache.INSTANCE.activateMultiDeviceActiveBleCache(multiDeviceBleConnector.getBleCache());
            return multiDeviceBleConnector;
        }
        MultiDeviceBleConnector multiDeviceBleConnector2 = new MultiDeviceBleConnector();
        Application application2 = mApp;
        if (application2 == null) {
            Intrinsics.XXO("mApp");
            application = null;
        } else {
            application = application2;
        }
        BaseBleConnector.init$default(multiDeviceBleConnector2, application, false, false, false, false, false, 0, BaseBleCache.Companion.create(mac), 126, null);
        mBleConnectors.add(multiDeviceBleConnector2);
        multiDeviceBleConnector2.setRefreshDeviceInfo(false);
        BleConnector.INSTANCE.activateMultiDeviceConnector(multiDeviceBleConnector2);
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(multiDeviceBleConnector2.getBleCache());
        return multiDeviceBleConnector2;
    }

    public final boolean deleteMultiDeviceBleConnector(@aa1 String mac) {
        Object next;
        Intrinsics.X0O(mac, "mac");
        Iterator<T> it = mBleConnectors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((MultiDeviceBleConnector) next).getAddress(), mac));
        MultiDeviceBleConnector multiDeviceBleConnector = (MultiDeviceBleConnector) next;
        if (multiDeviceBleConnector == null) {
            return false;
        }
        multiDeviceBleConnector.getBleCache().clear();
        multiDeviceBleConnector.removeCallbacksAndMessages();
        List<MultiDeviceBleConnector> list = mBleConnectors;
        boolean zRemove = list.remove(multiDeviceBleConnector);
        if (list.isEmpty()) {
            BleCache.INSTANCE.clear();
        }
        return zRemove;
    }

    public final void forConnector(@aa1 final Function1<? super MultiDeviceBleConnector, Unit> action) {
        Intrinsics.X0O(action, "action");
        forEachConnector(mBleConnectors, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0i1I1IX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConnectorManage.forConnector$lambda$0(action, (MultiDeviceBleConnector) obj);
            }
        });
    }

    @tb1
    public final MultiDeviceBleConnector getCurDeviceBleConnector(@aa1 String mac) {
        Object next;
        Intrinsics.X0O(mac, "mac");
        Iterator<T> it = mBleConnectors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((MultiDeviceBleConnector) next).getAddress(), mac));
        MultiDeviceBleConnector multiDeviceBleConnector = (MultiDeviceBleConnector) next;
        if (multiDeviceBleConnector != null) {
            return multiDeviceBleConnector;
        }
        return null;
    }

    @tb1
    public final MultiDeviceBleConnector getMultiDeviceBleConnector(@aa1 String mac) {
        Intrinsics.X0O(mac, "mac");
        MultiDeviceBleConnector curDeviceBleConnector = getCurDeviceBleConnector(mac);
        if (curDeviceBleConnector != null) {
            BleCache.INSTANCE.activateMultiDeviceActiveBleCache(curDeviceBleConnector.getBleCache());
            BleConnector.INSTANCE.activateMultiDeviceConnector(curDeviceBleConnector);
        }
        return curDeviceBleConnector;
    }

    @aa1
    public final List<MultiDeviceBleConnector> getMultiDeviceList() {
        return mBleConnectors;
    }

    public final void init(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        if (mApp != null) {
            return;
        }
        mApp = app;
    }

    public final boolean isMultiDevice() {
        return isMultiDevice;
    }

    @aa1
    public final MultiDeviceBleConnector newBleConnector(@aa1 String mac) {
        Object next;
        Application application;
        Intrinsics.X0O(mac, "mac");
        Iterator<T> it = mBleConnectors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.XOO0ii0(((MultiDeviceBleConnector) next).getAddress(), mac));
        MultiDeviceBleConnector multiDeviceBleConnector = (MultiDeviceBleConnector) next;
        if (multiDeviceBleConnector != null) {
            BleConnector.INSTANCE.activateMultiDeviceConnector(multiDeviceBleConnector);
            BleCache.INSTANCE.activateMultiDeviceActiveBleCache(multiDeviceBleConnector.getBleCache());
            return multiDeviceBleConnector;
        }
        MultiDeviceBleConnector multiDeviceBleConnector2 = new MultiDeviceBleConnector();
        Application application2 = mApp;
        if (application2 == null) {
            Intrinsics.XXO("mApp");
            application = null;
        } else {
            application = application2;
        }
        BaseBleConnector.init$default(multiDeviceBleConnector2, application, false, false, false, false, false, 0, BaseBleCache.Companion.create(mac), 126, null);
        mBleConnectors.add(multiDeviceBleConnector2);
        multiDeviceBleConnector2.setRefreshDeviceInfo(false);
        BleConnector.INSTANCE.activateMultiDeviceConnector(multiDeviceBleConnector2);
        BleCache.INSTANCE.activateMultiDeviceActiveBleCache(multiDeviceBleConnector2.getBleCache());
        return multiDeviceBleConnector2;
    }

    public final void setMultiDevice(boolean z) {
        isMultiDevice = z;
    }
}
