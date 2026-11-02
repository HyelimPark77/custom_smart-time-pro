package com.sma.smartv3.ui.device.dialpay.fragment;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.np1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayOnlineMoveV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,48:1\n90#2:49\n85#2,3:50\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n*L\n32#1:49\n25#1:50,3\n*E\n"})
public final class PayOnlineMoveV2Fragment extends PayOnlineMoveFragment {
    public PayOnlineMoveV2Fragment() {
    }

    public static /* synthetic */ Unit OIi0(PayOnlineMoveV2Fragment r0, WatchFaceCategoryV2[] r1) {
        return initAdapterList$lambda$0(r0, r1);
    }

    private static final Unit initAdapterList$lambda$0(PayOnlineMoveV2Fragment r4, WatchFaceCategoryV2[] r5) {
        if (r5 == null) goto L5;
        a01.OXO1.iO().put(("WATCHFACE_LIST_V2_" + r4.getMArg1()) + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(r5), false);
        r4.showList();
    L5:
        return Unit.OXO1;
    }

    private final void showList() {
        SPUtils r0 = a01.OXO1.iO();
        String r1 = "WATCHFACE_LIST_V2_" + getMArg1();
        WatchFaceCategoryV2[] r2 = (WatchFaceCategoryV2[]) new Gson().fromJson(r0.getString(r1 + '_' + WatchFaceCategoryV2[].class.getName()), WatchFaceCategoryV2[].class);
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

    @Override // com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveFragment
    public void initAdapterList() {
        showList();
        WatchFaceManager r0 = WatchFaceManager.OXO1;
        String r1 = String.valueOf(getMArg1());
        Activity r2 = getMActivity();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        WatchFaceManager.O00(r0, r1, (AppCompatActivity) r2, null, new np1(this), 4, null);
    }
}
