package com.sma.smartv3.p610ui.device.dialpay.fragment;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.a01;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.p610ui.device.dialpay.fragment.PayOnlineMoveV2Fragment;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nPayOnlineMoveV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,48:1\n90#2:49\n85#2,3:50\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveV2Fragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment\n*L\n32#1:49\n25#1:50,3\n*E\n"})
public final class PayOnlineMoveV2Fragment extends PayOnlineMoveFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAdapterList$lambda$0(PayOnlineMoveV2Fragment payOnlineMoveV2Fragment, WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
        if (watchFaceCategoryV2Arr != null) {
            a01.OXO1.m1440iO().put(("WATCHFACE_LIST_V2_" + payOnlineMoveV2Fragment.getMArg1()) + '_' + WatchFaceCategoryV2[].class.getName(), new Gson().toJson(watchFaceCategoryV2Arr), false);
            payOnlineMoveV2Fragment.showList();
        }
        return Unit.OXO1;
    }

    private final void showList() {
        SPUtils sPUtilsM1440iO = a01.OXO1.m1440iO();
        String str = "WATCHFACE_LIST_V2_" + getMArg1();
        WatchFaceCategoryV2[] watchFaceCategoryV2Arr = (WatchFaceCategoryV2[]) new Gson().fromJson(sPUtilsM1440iO.getString(str + '_' + WatchFaceCategoryV2[].class.getName()), WatchFaceCategoryV2[].class);
        LogUtils.m11128d("list -> " + (watchFaceCategoryV2Arr != null ? Integer.valueOf(watchFaceCategoryV2Arr.length) : null));
        if (watchFaceCategoryV2Arr == null || watchFaceCategoryV2Arr.length == 0) {
            getRecyclerView().setVisibility(8);
            getTvView().setVisibility(0);
            DeviceInfoChecker.OXO1.m38093I1();
        } else {
            getRecyclerView().setVisibility(0);
            getTvView().setVisibility(8);
            getMList().addAll(ArraysKt___ArraysKt.XOO0XX(watchFaceCategoryV2Arr));
            getMRecyclerAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.sma.smartv3.p610ui.device.dialpay.fragment.PayOnlineMoveFragment
    public void initAdapterList() {
        showList();
        WatchFaceManager watchFaceManager = WatchFaceManager.OXO1;
        String strValueOf = String.valueOf(getMArg1());
        Activity mActivity = getMActivity();
        Intrinsics.X1ii(mActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        WatchFaceManager.O00(watchFaceManager, strValueOf, (AppCompatActivity) mActivity, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.np1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PayOnlineMoveV2Fragment.initAdapterList$lambda$0(this.f9983IO, (WatchFaceCategoryV2[]) obj);
            }
        }, 4, null);
    }
}
