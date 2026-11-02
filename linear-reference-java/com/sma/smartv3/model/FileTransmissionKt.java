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
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nFileTransmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n774#2:244\n865#2,2:245\n1869#2,2:247\n*S KotlinDebug\n*F\n+ 1 FileTransmission.kt\ncom/sma/smartv3/model/FileTransmissionKt\n*L\n44#1:244\n44#1:245,2\n61#1:247,2\n*E\n"})
public final class FileTransmissionKt {
    public static final boolean appStoreIsShowCurrentCategory(@aa1 String r8) {
        Intrinsics.X0O(r8, "appPackName");
        if (q62.OXO1.i0() == true) goto L22;
    L20:
        return false;
    L22:
        BleAppInfoList r0 = (BleAppInfoList) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.APP_OP, BleAppInfoList.class, null, 4, null);     // Catch: Exception -> L21
        if (r0 == null) goto L20;
        if (r0.getMList().isEmpty() == true) goto L20;
        List<BleAppInfo> r1 = r0.getMList();     // Catch: Exception -> L21
        ArrayList r2 = new ArrayList();     // Catch: Exception -> L21
        Iterator<T> r3 = r1.iterator();     // Catch: Exception -> L21
    L10:
        if (r3.hasNext() == false) goto L15;
        Object r4 = r3.next();     // Catch: Exception -> L21
        if (Intrinsics.XOO0ii0(((BleAppInfo) r4).getMPackage(), r8) == false) goto L10;
        r2.add(r4);     // Catch: Exception -> L21
        goto L10
    L15:
        if (r2.isEmpty() == true) goto L20;
        if (((BleAppInfo) CollectionsKt___CollectionsKt.IIII0iI(r2)).getMHide() != 0) goto L20;
        return true;
    }

    public static /* synthetic */ boolean appStoreIsShowCurrentCategory$default(String r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = BleAppInfo.PACKAGE_WORLD_CLOCK;
    L6:
        return appStoreIsShowCurrentCategory(r0);
    }

    public static final void changAppStoreCurrentCategory(@aa1 String r7) {
        Intrinsics.X0O(r7, "appPackName");
        if (q62.OXO1.i0() == false) goto L30;
        BleAppInfoList r3 = (BleAppInfoList) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.APP_OP, BleAppInfoList.class, null, 4, null);     // Catch: Exception -> L19
        if (r3 != null) goto L7;
    L17:
        BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.APP_OP, r3, null, 4, null);     // Catch: Exception -> L19
        I01XX0.OXO1(I01XX0.iXiX011, Boolean.FALSE);     // Catch: Exception -> L19
        return;
    L7:
        if (r3.getMList().isEmpty() == true) goto L17;
        Iterator<T> r0 = r3.getMList().iterator();     // Catch: Exception -> L19
    L10:
        if (r0.hasNext() == false) goto L17;
        BleAppInfo r1 = (BleAppInfo) r0.next();     // Catch: Exception -> L19
        if (Intrinsics.XOO0ii0(r1.getMPackage(), r7) == false) goto L10;
        if (r1.getMHide() == 0) goto L15;
        r1.setMHide(0);     // Catch: Exception -> L19
        goto L10
    L15:
        r1.setMHide(1);     // Catch: Exception -> L19
    L31:
        return;
    }

    public static final int getAppStoreIcon(@aa1 String r1) {
        Intrinsics.X0O(r1, "mPackage");
        switch(r1.hashCode()) {
            case -1900747410: goto L42;
            case -1150287196: goto L37;
            case -820781567: goto L32;
            case -574428292: goto L27;
            case 323541717: goto L22;
            case 325447868: goto L17;
            case 595424519: goto L15;
            case 867788782: goto L11;
            case 1386488444: goto L6;
            default: goto L48;
        };
    L15:
        r1.equals(BleAppInfo.PACKAGE_WORLD_CLOCK);
        return R.drawable.app_store_game02;
    L48:
        return R.drawable.app_store_game02;
    L6:
        if (r1.equals(BleAppInfo.PACKAGE_CALCULATOR) == false) goto L49;
        return R.drawable.app_store_tool03;
    L49:
        return R.drawable.app_store_game02;
    L11:
        if (r1.equals(BleAppInfo.PACKAGE_CARD_WALLET) == false) goto L50;
        return R.drawable.app_store_tool04;
    L50:
        return R.drawable.app_store_game02;
    L17:
        if (r1.equals(BleAppInfo.PACKAGE_GAME_PLAN) == false) goto L51;
        return R.drawable.app_store_game05;
    L51:
        return R.drawable.app_store_game02;
    L22:
        if (r1.equals(BleAppInfo.PACKAGE_GAME_2048) == false) goto L52;
        return R.drawable.app_store_game03;
    L52:
        return R.drawable.app_store_game02;
    L27:
        if (r1.equals(BleAppInfo.PACKAGE_STOCK) == false) goto L53;
        return R.drawable.app_store_game01;
    L53:
        return R.drawable.app_store_game02;
    L32:
        if (r1.equals(BleAppInfo.PACKAGE_GAME_TTT) == false) goto L54;
        return R.drawable.app_store_game04;
    L54:
        return R.drawable.app_store_game02;
    L37:
        if (r1.equals(BleAppInfo.PACKAGE_ALIPAY) == false) goto L55;
        return R.drawable.app_store_tool01;
    L55:
        return R.drawable.app_store_game02;
    L42:
        if (r1.equals(BleAppInfo.PACKAGE_NAVIGATION) == false) goto L47;
        return R.drawable.app_store_tool02;
    L47:
        return R.drawable.app_store_game02;
    }
}
