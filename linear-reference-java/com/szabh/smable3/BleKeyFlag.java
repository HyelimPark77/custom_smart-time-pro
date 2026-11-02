package com.szabh.smable3;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.client.methods.HttpDelete;
import java.util.Arrays;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final enum BleKeyFlag extends Enum<BleKeyFlag> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleKeyFlag[] $VALUES = null;
    public static final BleKeyFlag CREATE = null;

    @aa1
    public static final OXO1 Companion = null;
    public static final BleKeyFlag DELETE = null;
    public static final BleKeyFlag NONE = null;
    public static final BleKeyFlag READ = null;
    public static final BleKeyFlag READ_CONTINUE = null;
    public static final BleKeyFlag RESET = null;
    public static final BleKeyFlag UPDATE = null;
    private final int mBleKeyFlag;

    @SourceDebugExtension({"SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleKeyFlag$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleKeyFlag OXO1(int r6) {
            BleKeyFlag[] r0 = BleKeyFlag.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleKeyFlag r3 = r0[r2];
            if (r3.getMBleKeyFlag() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleKeyFlag.NONE;
        L8:
            r3 = null;
            goto L9
        }

        public OXO1() {
        }
    }

    private static final /* synthetic */ BleKeyFlag[] $values() {
        return new BleKeyFlag[]{UPDATE, READ, READ_CONTINUE, CREATE, DELETE, RESET, NONE};
    }

    static {
        UPDATE = new BleKeyFlag("UPDATE", 0, 0);
        READ = new BleKeyFlag("READ", 1, 16);
        READ_CONTINUE = new BleKeyFlag("READ_CONTINUE", 2, 17);
        CREATE = new BleKeyFlag("CREATE", 3, 32);
        DELETE = new BleKeyFlag(HttpDelete.METHOD_NAME, 4, 48);
        RESET = new BleKeyFlag("RESET", 5, 64);
        NONE = new BleKeyFlag("NONE", 6, 255);
        BleKeyFlag[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new OXO1(null);
    }

    private BleKeyFlag(String r1, int r2, int r3) {
        super(r1, r2);
        this.mBleKeyFlag = r3;
    }

    @aa1
    public static EnumEntries<BleKeyFlag> getEntries() {
        return $ENTRIES;
    }

    public static BleKeyFlag valueOf(String r1) {
        return (BleKeyFlag) Enum.valueOf(BleKeyFlag.class, r1);
    }

    public static BleKeyFlag[] values() {
        return (BleKeyFlag[]) $VALUES.clone();
    }

    public final int getMBleKeyFlag() {
        return this.mBleKeyFlag;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.mBleKeyFlag)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(name());
        return r0.toString();
    }
}
