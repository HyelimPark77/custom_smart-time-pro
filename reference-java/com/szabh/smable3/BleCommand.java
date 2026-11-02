package com.szabh.smable3;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleCommand\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,519:1\n3919#2:520\n4434#2,2:521\n*S KotlinDebug\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleCommand\n*L\n17#1:520\n17#1:521,2\n*E\n"})
public enum BleCommand {
    UPDATE(1),
    SET(2),
    CONNECT(3),
    PUSH(4),
    DATA(5),
    CONTROL(6),
    IO(7),
    NONE(255);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private final int mBleCommand;

    BleCommand(int i) {
        this.mBleCommand = i;
    }

    @aa1
    public static EnumEntries<BleCommand> getEntries() {
        return $ENTRIES;
    }

    @aa1
    public final List<BleKey> getBleKeys() {
        BleKey[] bleKeyArrValues = BleKey.values();
        ArrayList arrayList = new ArrayList();
        for (BleKey bleKey : bleKeyArrValues) {
            if ((bleKey.getMKey() >>> 8) == this.mBleCommand) {
                arrayList.add(bleKey);
            }
        }
        return arrayList;
    }

    public final int getMBleCommand() {
        return this.mBleCommand;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.mBleCommand)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(name());
        return sb.toString();
    }
}
