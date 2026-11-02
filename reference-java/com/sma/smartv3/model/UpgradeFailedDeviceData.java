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
    public static final UpgradeFailedDeviceData INSTANCE = new UpgradeFailedDeviceData();

    private UpgradeFailedDeviceData() {
    }

    public final void add(@aa1 BleDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getList());
        arrayList.add(deviceInfo);
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String json = new Gson().toJson(arrayList);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        byte[] bytes = json.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        sPUtilsIiI10X.put(b01.XOO0ii0, EncodeUtils.base64Encode2String(bytes));
    }

    public final void delete(@aa1 BleDeviceInfo deviceInfo) {
        Intrinsics.X0O(deviceInfo, "deviceInfo");
        ArrayList arrayList = new ArrayList();
        for (BleDeviceInfo bleDeviceInfo : getList()) {
            if (!Intrinsics.XOO0ii0(bleDeviceInfo.getMBleAddress(), deviceInfo.getMBleAddress())) {
                arrayList.add(bleDeviceInfo);
            }
        }
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        String json = new Gson().toJson(arrayList);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        byte[] bytes = json.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        sPUtilsIiI10X.put(b01.XOO0ii0, EncodeUtils.base64Encode2String(bytes));
    }

    @aa1
    public final List<BleDeviceInfo> getList() {
        try {
            byte[] bArrBase64Decode = EncodeUtils.base64Decode(a01.OXO1.IiI10X().getString(b01.XOO0ii0));
            Intrinsics.O10IXXX0X(bArrBase64Decode, "base64Decode(...)");
            JsonArray asJsonArray = JsonParser.parseString(new String(bArrBase64Decode, Charsets.XIi00iiXO)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(new Gson().fromJson(it.next(), BleDeviceInfo.class));
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt__CollectionsKt.m39402iI();
        }
    }
}
