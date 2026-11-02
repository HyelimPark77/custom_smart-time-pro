package com.sma.smartv3.p610ui.device.dial;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.android.mltcode.paycertificationapi.a01;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.DeviceInfoChecker;
import com.sma.smartv3.biz.WatchFaceManager;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.model.WatchFaceInfo;
import com.sma.smartv3.p610ui.device.dial.DialOnlineV2Fragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialOnlineV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialOnlineV2Fragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,59:1\n90#2:60\n85#2,3:65\n13805#3,2:61\n37#4,2:63\n*S KotlinDebug\n*F\n+ 1 DialOnlineV2Fragment.kt\ncom/sma/smartv3/ui/device/dial/DialOnlineV2Fragment\n*L\n43#1:60\n33#1:65,3\n27#1:61,2\n32#1:63,2\n*E\n"})
public final class DialOnlineV2Fragment extends DialOnlineFragment {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initAdapterList$lambda$0(DialOnlineV2Fragment dialOnlineV2Fragment, WatchFaceCategoryV2[] watchFaceCategoryV2Arr) {
        if (watchFaceCategoryV2Arr != null) {
            ArrayList arrayList = new ArrayList();
            for (WatchFaceCategoryV2 watchFaceCategoryV2 : watchFaceCategoryV2Arr) {
                if (!Intrinsics.XOO0ii0(watchFaceCategoryV2.getMemberAttr(), "1")) {
                    arrayList.add(new WatchFaceInfo(watchFaceCategoryV2.getId(), watchFaceCategoryV2.getPreviewUrl(), watchFaceCategoryV2.getBinUrl()));
                }
            }
            a01.OXO1.m1440iO().put(("WATCHFACE_LIST_" + dialOnlineV2Fragment.getMArg1()) + '_' + WatchFaceInfo[].class.getName(), new Gson().toJson((WatchFaceInfo[]) CollectionsKt___CollectionsKt.IOOIXiI1(arrayList).toArray(new WatchFaceInfo[0])), false);
            dialOnlineV2Fragment.showList();
        }
        return Unit.OXO1;
    }

    private final void showList() {
        SPUtils sPUtilsM1440iO = a01.OXO1.m1440iO();
        String str = "WATCHFACE_LIST_" + getMArg1();
        WatchFaceInfo[] watchFaceInfoArr = (WatchFaceInfo[]) new Gson().fromJson(sPUtilsM1440iO.getString(str + '_' + WatchFaceInfo[].class.getName()), WatchFaceInfo[].class);
        LogUtils.m11128d("list -> " + (watchFaceInfoArr != null ? Integer.valueOf(watchFaceInfoArr.length) : null));
        if (watchFaceInfoArr == null || watchFaceInfoArr.length == 0) {
            getRecyclerView().setVisibility(8);
            getTvView().setVisibility(0);
            DeviceInfoChecker.OXO1.m38093I1();
        } else {
            getRecyclerView().setVisibility(0);
            getTvView().setVisibility(8);
            getMList().addAll(ArraysKt___ArraysKt.XOO0XX(watchFaceInfoArr));
            getMRecyclerAdapter().notifyDataSetChanged();
        }
    }

    @Override // com.sma.smartv3.p610ui.device.dial.DialOnlineFragment
    public void initAdapterList() {
        showList();
        WatchFaceManager watchFaceManager = WatchFaceManager.OXO1;
        String strValueOf = String.valueOf(getMArg1());
        Activity mActivity = getMActivity();
        Intrinsics.X1ii(mActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        WatchFaceManager.O00(watchFaceManager, strValueOf, (AppCompatActivity) mActivity, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.IIXOiXI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DialOnlineV2Fragment.initAdapterList$lambda$0(this.f1656IO, (WatchFaceCategoryV2[]) obj);
            }
        }, 4, null);
    }
}
