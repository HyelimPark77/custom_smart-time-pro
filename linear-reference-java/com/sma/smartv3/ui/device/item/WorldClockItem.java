package com.sma.smartv3.ui.device.item;

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
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nWorldClockItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorldClockItem.kt\ncom/sma/smartv3/ui/device/item/WorldClockItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n774#2:39\n865#2,2:40\n*S KotlinDebug\n*F\n+ 1 WorldClockItem.kt\ncom/sma/smartv3/ui/device/item/WorldClockItem\n*L\n26#1:39\n26#1:40,2\n*E\n"})
public final class WorldClockItem extends BaseDslItem {
    public WorldClockItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        boolean r1 = true;
        if (q62.OXO1.i0() == false) goto L22;
        BleAppInfoList r0 = (BleAppInfoList) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.APP_OP, BleAppInfoList.class, null, 4, null);
        if (r0 == null) goto L22;
        if (r0.getMList().isEmpty() == true) goto L22;
        List<BleAppInfo> r2 = r0.getMList();
        ArrayList r3 = new ArrayList();
        Iterator<T> r4 = r2.iterator();
    L10:
        if (r4.hasNext() == false) goto L15;
        Object r5 = r4.next();
        if (Intrinsics.XOO0ii0(((BleAppInfo) r5).getMPackage(), BleAppInfo.PACKAGE_WORLD_CLOCK) == false) goto L10;
        r3.add(r5);
        goto L10
    L15:
        if (r3.isEmpty() == true) goto L22;
        if (((BleAppInfo) CollectionsKt___CollectionsKt.IIII0iI(r3)).getMHide() == 1) goto L20;
        r1 = false;
    L20:
        setItemHidden(r1);
        return;
    L22:
        setItemHidden(!q62.OXO1.OI10());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_world_clock;
    }
}
