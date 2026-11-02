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
public final enum BleCommand extends Enum<BleCommand> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleCommand[] $VALUES = null;
    public static final BleCommand CONNECT = null;
    public static final BleCommand CONTROL = null;
    public static final BleCommand DATA = null;
    public static final BleCommand IO = null;
    public static final BleCommand NONE = null;
    public static final BleCommand PUSH = null;
    public static final BleCommand SET = null;
    public static final BleCommand UPDATE = null;
    private final int mBleCommand;

    private static final /* synthetic */ BleCommand[] $values() {
        return new BleCommand[]{UPDATE, SET, CONNECT, PUSH, DATA, CONTROL, IO, NONE};
    }

    static {
        UPDATE = new BleCommand("UPDATE", 0, 1);
        SET = new BleCommand("SET", 1, 2);
        CONNECT = new BleCommand("CONNECT", 2, 3);
        PUSH = new BleCommand("PUSH", 3, 4);
        DATA = new BleCommand("DATA", 4, 5);
        CONTROL = new BleCommand("CONTROL", 5, 6);
        IO = new BleCommand("IO", 6, 7);
        NONE = new BleCommand("NONE", 7, 255);
        BleCommand[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private BleCommand(String r1, int r2, int r3) {
        super(r1, r2);
        this.mBleCommand = r3;
    }

    @aa1
    public static EnumEntries<BleCommand> getEntries() {
        return $ENTRIES;
    }

    public static BleCommand valueOf(String r1) {
        return (BleCommand) Enum.valueOf(BleCommand.class, r1);
    }

    public static BleCommand[] values() {
        return (BleCommand[]) $VALUES.clone();
    }

    @aa1
    public final List<BleKey> getBleKeys() {
        BleKey[] r0 = BleKey.values();
        ArrayList r1 = new ArrayList();
        int r2 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        BleKey r4 = r0[r3];
        if ((r4.getMKey() >>> 8) != this.mBleCommand) goto L7;
        r1.add(r4);
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        return r1;
    }

    public final int getMBleCommand() {
        return this.mBleCommand;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.mBleCommand)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(name());
        return r0.toString();
    }
}
