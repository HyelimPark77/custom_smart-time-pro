package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleAppInfo;
import com.szabh.smable3.entity.BleAppInfoList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n774#2:244\n865#2,2:245\n1869#2,2:247\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n*L\n44#1:244\n44#1:245,2\n61#1:247,2\n*E\n"})
public final class FileTransmissionKt {
    public static final boolean appStoreIsShowCurrentCategory(@aa1 String appPackName) {
        Intrinsics.X0O(appPackName, "appPackName");
        if (q62.OXO1.m2890i0()) {
            try {
                BleAppInfoList bleAppInfoList = (BleAppInfoList) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.APP_OP, BleAppInfoList.class, null, 4, null);
                if (bleAppInfoList != null && !bleAppInfoList.getMList().isEmpty()) {
                    List<BleAppInfo> mList = bleAppInfoList.getMList();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : mList) {
                        if (Intrinsics.XOO0ii0(((BleAppInfo) obj).getMPackage(), appPackName)) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty() && ((BleAppInfo) CollectionsKt___CollectionsKt.IIII0iI(arrayList)).getMHide() == 0) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static /* synthetic */ boolean appStoreIsShowCurrentCategory$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = BleAppInfo.PACKAGE_WORLD_CLOCK;
        }
        return appStoreIsShowCurrentCategory(str);
    }

    public static final void changAppStoreCurrentCategory(@aa1 String appPackName) {
        Intrinsics.X0O(appPackName, "appPackName");
        if (q62.OXO1.m2890i0()) {
            try {
                BleAppInfoList bleAppInfoList = (BleAppInfoList) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.APP_OP, BleAppInfoList.class, null, 4, null);
                if (bleAppInfoList != null && !bleAppInfoList.getMList().isEmpty()) {
                    for (BleAppInfo bleAppInfo : bleAppInfoList.getMList()) {
                        if (Intrinsics.XOO0ii0(bleAppInfo.getMPackage(), appPackName)) {
                            if (bleAppInfo.getMHide() == 0) {
                                bleAppInfo.setMHide(1);
                            } else {
                                bleAppInfo.setMHide(0);
                            }
                        }
                    }
                }
                BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.APP_OP, bleAppInfoList, null, 4, null);
                I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }

    public static final int getAppStoreIcon(@aa1 String mPackage) {
        Intrinsics.X0O(mPackage, "mPackage");
        switch (mPackage.hashCode()) {
            case -1900747410:
                return !mPackage.equals(BleAppInfo.PACKAGE_NAVIGATION) ? R.drawable.app_store_game02 : R.drawable.app_store_tool02;
            case -1150287196:
                return !mPackage.equals(BleAppInfo.PACKAGE_ALIPAY) ? R.drawable.app_store_game02 : R.drawable.app_store_tool01;
            case -820781567:
                return !mPackage.equals(BleAppInfo.PACKAGE_GAME_TTT) ? R.drawable.app_store_game02 : R.drawable.app_store_game04;
            case -574428292:
                return !mPackage.equals(BleAppInfo.PACKAGE_STOCK) ? R.drawable.app_store_game02 : R.drawable.app_store_game01;
            case 323541717:
                return !mPackage.equals(BleAppInfo.PACKAGE_GAME_2048) ? R.drawable.app_store_game02 : R.drawable.app_store_game03;
            case 325447868:
                return !mPackage.equals(BleAppInfo.PACKAGE_GAME_PLAN) ? R.drawable.app_store_game02 : R.drawable.app_store_game05;
            case 595424519:
                mPackage.equals(BleAppInfo.PACKAGE_WORLD_CLOCK);
                return R.drawable.app_store_game02;
            case 867788782:
                return !mPackage.equals(BleAppInfo.PACKAGE_CARD_WALLET) ? R.drawable.app_store_game02 : R.drawable.app_store_tool04;
            case 1386488444:
                return !mPackage.equals(BleAppInfo.PACKAGE_CALCULATOR) ? R.drawable.app_store_game02 : R.drawable.app_store_tool03;
            default:
                return R.drawable.app_store_game02;
        }
    }
}
