package com.szabh.smable3;

import com.android.mltcode.paycertificationapi.aa1;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public enum BleKeyFlag {
    UPDATE(0),
    READ(16),
    READ_CONTINUE(17),
    CREATE(32),
    DELETE(48),
    RESET(64),
    NONE(255);

    private final int mBleKeyFlag;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @SourceDebugExtension({"SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleKeyFlag$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        public final BleKeyFlag OXO1(int i) {
            for (BleKeyFlag bleKeyFlag : BleKeyFlag.values()) {
                if (bleKeyFlag.getMBleKeyFlag() == i) {
                    if (bleKeyFlag == null) {
                        return BleKeyFlag.NONE;
                    }
                    return bleKeyFlag;
                }
            }
            bleKeyFlag = null;
            if (bleKeyFlag == null) {
                return BleKeyFlag.NONE;
            }
            return bleKeyFlag;
        }

        public OXO1() {
        }
    }

    BleKeyFlag(int i) {
        this.mBleKeyFlag = i;
    }

    @aa1
    public static EnumEntries<BleKeyFlag> getEntries() {
        return $ENTRIES;
    }

    public final int getMBleKeyFlag() {
        return this.mBleKeyFlag;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.mBleKeyFlag)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(name());
        return sb.toString();
    }
}
