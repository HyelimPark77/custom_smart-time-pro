package com.sma.smartv3.p610ui.device.item;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
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

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWorldClockItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorldClockItem.kt\ncom/sma/smartv3/ui/device/item/WorldClockItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n774#2:39\n865#2,2:40\n*S KotlinDebug\n*F\n+ 1 WorldClockItem.kt\ncom/sma/smartv3/ui/device/item/WorldClockItem\n*L\n26#1:39\n26#1:40,2\n*E\n"})
public final class WorldClockItem extends BaseDslItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        BleAppInfoList bleAppInfoList;
        if (q62.OXO1.m2890i0() && (bleAppInfoList = (BleAppInfoList) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.APP_OP, BleAppInfoList.class, null, 4, null)) != null && !bleAppInfoList.getMList().isEmpty()) {
            List<BleAppInfo> mList = bleAppInfoList.getMList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : mList) {
                if (Intrinsics.XOO0ii0(((BleAppInfo) obj).getMPackage(), BleAppInfo.PACKAGE_WORLD_CLOCK)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                setItemHidden(((BleAppInfo) CollectionsKt___CollectionsKt.IIII0iI(arrayList)).getMHide() == 1);
                return;
            }
        }
        setItemHidden(!q62.OXO1.OI10());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_world_clock;
    }
}
