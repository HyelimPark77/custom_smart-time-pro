package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.blankj.utilcode.util.EncodeUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.szabh.smable3.entity.BleDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nUpgradeFailedDeviceData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeFailedDeviceData.kt\ncom/sma/smartv3/model/UpgradeFailedDeviceData\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n74#2,4:33\n78#2:40\n80#2,2:42\n67#2,2:46\n67#2,2:48\n1563#3:37\n1634#3,2:38\n1636#3:41\n1869#3,2:44\n*S KotlinDebug\n*F\n+ 1 UpgradeFailedDeviceData.kt\ncom/sma/smartv3/model/UpgradeFailedDeviceData\n*L\n11#1:33,4\n11#1:40\n11#1:42,2\n21#1:46,2\n28#1:48,2\n11#1:37\n11#1:38,2\n11#1:41\n16#1:44,2\n*E\n"})
public final class UpgradeFailedDeviceData {

    @aa1
    public static final UpgradeFailedDeviceData INSTANCE = null;

    static {
        INSTANCE = new UpgradeFailedDeviceData();
    }

    private UpgradeFailedDeviceData() {
    }

    public final void add(@aa1 BleDeviceInfo r3) {
        Intrinsics.X0O(r3, "deviceInfo");
        ArrayList r0 = new ArrayList();
        r0.addAll(getList());
        r0.add(r3);
        SPUtils r4 = a01.OXO1.IiI10X();
        String r1 = new Gson().toJson(r0);
        Intrinsics.O10IXXX0X(r1, "toJson(...)");
        byte[] r2 = r1.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        r4.put(b01.XOO0ii0, EncodeUtils.base64Encode2String(r2));
    }

    public final void delete(@aa1 BleDeviceInfo r6) {
        Intrinsics.X0O(r6, "deviceInfo");
        ArrayList r0 = new ArrayList();
        Iterator<T> r1 = getList().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        BleDeviceInfo r2 = (BleDeviceInfo) r1.next();
        if (Intrinsics.XOO0ii0(r2.getMBleAddress(), r6.getMBleAddress()) == true) goto L4;
        r0.add(r2);
        goto L4
    L8:
        SPUtils r7 = a01.OXO1.IiI10X();
        String r3 = new Gson().toJson(r0);
        Intrinsics.O10IXXX0X(r3, "toJson(...)");
        byte[] r4 = r3.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        r7.put(b01.XOO0ii0, EncodeUtils.base64Encode2String(r4));
    }

    @aa1
    public final List<BleDeviceInfo> getList() {
        byte[] r0 = EncodeUtils.base64Decode(a01.OXO1.IiI10X().getString(b01.XOO0ii0));     // Catch: Exception -> L9
        Intrinsics.O10IXXX0X(r0, "base64Decode(...)");     // Catch: Exception -> L9
        JsonArray r1 = JsonParser.parseString(new String(r0, Charsets.XIi00iiXO)).getAsJsonArray();     // Catch: Exception -> L9
        Intrinsics.XXI(r1);     // Catch: Exception -> L9
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));     // Catch: Exception -> L9
        Iterator<JsonElement> r3 = r1.iterator();     // Catch: Exception -> L9
    L5:
        if (r3.hasNext() == false) goto L8;
        JsonElement r4 = r3.next();     // Catch: Exception -> L9
        r2.add(new Gson().fromJson(r4, BleDeviceInfo.class));     // Catch: Exception -> L9
    L8:
        return r2;
    L10:
        return CollectionsKt__CollectionsKt.iI();
    }
}
