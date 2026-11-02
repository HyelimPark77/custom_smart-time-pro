package com.sma.smartv3.ui.device.dial;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.IIXOiXI;
import com.android.mltcode.paycertificationapi.a01;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialOnlineV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialOnlineV2Fragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,59:1\n90#2:60\n85#2,3:65\n13805#3,2:61\n37#4,2:63\n*S KotlinDebug\n*F\n+ 1 DialOnlineV2Fragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineV2Fragment\n*L\n43#1:60\n33#1:65,3\n27#1:61,2\n32#1:63,2\n*E\n"})
public final class DialOnlineV2Fragment extends DialOnlineFragment {
    public DialOnlineV2Fragment() {
    }

    public static /* synthetic */ Unit IiI10X(DialOnlineV2Fragment r0, WatchFaceCategoryV2[] r1) {
        return initAdapterList$lambda$0(r0, r1);
    }

    private static final Unit initAdapterList$lambda$0(DialOnlineV2Fragment r8, WatchFaceCategoryV2[] r9) {
        if (r9 == null) goto L11;
        ArrayList r0 = new ArrayList();
        int r1 = r9.length;
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L9;
        WatchFaceCategoryV2 r4 = r9[r3];
        if (Intrinsics.XOO0ii0(r4.getMemberAttr(), "1") == true) goto L8;
        r0.add(new WatchFaceInfo(r4.getId(), r4.getPreviewUrl(), r4.getBinUrl()));
    L8:
        r3 = r3 + 1;
        goto L4
    L9:
        WatchFaceInfo[] r10 = (WatchFaceInfo[]) CollectionsKt___CollectionsKt.IOOIXiI1(r0).toArray(new WatchFaceInfo[0]);
        a01.OXO1.iO().put(("WATCHFACE_LIST_" + r8.getMArg1()) + '_' + WatchFaceInfo[].class.getName(), new Gson().toJson(r10), false);
        r8.showList();
    L11:
        return Unit.OXO1;
    }

    private final void showList() {
        SPUtils r0 = a01.OXO1.iO();
        String r1 = "WATCHFACE_LIST_" + getMArg1();
        WatchFaceInfo[] r2 = (WatchFaceInfo[]) new Gson().fromJson(r0.getString(r1 + '_' + WatchFaceInfo[].class.getName()), WatchFaceInfo[].class);
        if (r2 == null) goto L5;
        Integer r3 = Integer.valueOf(r2.length);
    L6:
        LogUtils.d(new Object[]{"list -> " + r3});
        if (r2 != null) goto L9;
    L13:
        getRecyclerView().setVisibility(8);
        getTvView().setVisibility(0);
        DeviceInfoChecker.OXO1.I1();
        return;
    L9:
        if (r2.length == 0) goto L13;
        getRecyclerView().setVisibility(0);
        getTvView().setVisibility(8);
        getMList().addAll(ArraysKt___ArraysKt.XOO0XX(r2));
        getMRecyclerAdapter().notifyDataSetChanged();
        return;
    L5:
        r3 = null;
        goto L6
    }

    @Override // com.sma.smartv3.ui.device.dial.DialOnlineFragment
    public void initAdapterList() {
        showList();
        WatchFaceManager r0 = WatchFaceManager.OXO1;
        String r1 = String.valueOf(getMArg1());
        Activity r2 = getMActivity();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        WatchFaceManager.O00(r0, r1, (AppCompatActivity) r2, null, new IIXOiXI(this), 4, null);
    }
}
