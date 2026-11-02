package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAICommand extends BleWritable {
    public static final int COMMAND_ADJUST_VOLUME = 20;
    public static final int COMMAND_ANSWER_CALL = 1;
    public static final int COMMAND_CALL_NUMBER = 19;
    public static final int COMMAND_DECREASE_VOLUME = 12;
    public static final int COMMAND_DISABLE_DO_NOT_DISTURB = 16;
    public static final int COMMAND_ENABLE_DO_NOT_DISTURB = 15;
    public static final int COMMAND_HANG_UP_CALL = 2;
    public static final int COMMAND_INCREASE_VOLUME = 13;
    public static final int COMMAND_NEXT_TRACK = 11;
    public static final int COMMAND_OFFLINE_PAY = 21;
    public static final int COMMAND_PAUSE_PLAYBACK = 9;
    public static final int COMMAND_PLAY_MUSIC = 7;
    public static final int COMMAND_PREVIOUS_TRACK = 10;
    public static final int COMMAND_QUERY_BATTERY = 3;
    public static final int COMMAND_REBOOT_SYSTEM = 14;
    public static final int COMMAND_RESUME_PLAYBACK = 8;
    public static final int COMMAND_START_RECORD_AUDIO = 18;
    public static final int COMMAND_START_RECORD_VIDEO = 5;
    public static final int COMMAND_STOP_RECORD_VIDEO = 6;
    public static final int COMMAND_TAKE_PHOTO = 4;
    public static final int COMMAND_VISUAL_RECOGNITION = 17;

    @aa1
    public static final Companion Companion = null;
    private int mCommand;

    @aa1
    private String mKeyword;

    @aa1
    private Object mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleAICommand() {
        int r1 = 0;
        String r2 = null;
        Object r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleAICommand copy$default(BleAICommand r0, int r1, String r2, Object r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mCommand;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mKeyword;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mValue;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mCommand;
    }

    @aa1
    public final String component2() {
        return this.mKeyword;
    }

    @aa1
    public final Object component3() {
        return this.mValue;
    }

    @aa1
    public final BleAICommand copy(int r2, @aa1 String r3, @aa1 Object r4) {
        Intrinsics.X0O(r3, "mKeyword");
        Intrinsics.X0O(r4, "mValue");
        return new BleAICommand(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCommand = readInt8();
        this.mKeyword = BleReadable.readString$default(this, readInt8(), null, 2, null);
        this.mValue = readBytes(readInt8());
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCommand);
        String r0 = this.mKeyword;
        Charset r1 = Charsets.XIi00iiXO;
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        int r3 = r2.length;
        writeInt8(r3);
        if (r3 <= 0) goto L5;
        byte[] r4 = this.mKeyword.getBytes(r1);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
    L6:
        BleWritable.writeBytes$default(this, r4, null, 2, null);
        byte[] r5 = new byte[0];
        Object r6 = this.mValue;
        if ((r6 instanceof String) == false) goto L10;
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type kotlin.String");
        r5 = ((String) r6).getBytes(r1);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        int r7 = r5.length;
    L13:
        writeInt8(r7);
        BleWritable.writeBytes$default(this, r5, null, 2, null);
        writeInt8(0);
        return;
    L10:
        if ((r6 instanceof byte[]) == false) goto L12;
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type kotlin.ByteArray");
        r5 = (byte[]) r6;
        r7 = r5.length;
        goto L13
    L12:
        r7 = 0;
        goto L13
    L5:
        r4 = new byte[1];
        goto L6
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAICommand) == true) goto L8;
        return false;
    L8:
        BleAICommand r6 = (BleAICommand) r5;
        if (this.mCommand == r6.mCommand) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mKeyword, r6.mKeyword) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mValue, r6.mValue) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMCommand() {
        return this.mCommand;
    }

    @aa1
    public final String getMKeyword() {
        return this.mKeyword;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        String r0 = this.mKeyword;
        Charset r1 = Charsets.XIi00iiXO;
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        int r3 = 1;
        int r4 = Math.max(r2.length, 1) + 4;
        Object r5 = this.mValue;     // Catch: Exception -> L5
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type kotlin.String");     // Catch: Exception -> L5
        byte[] r6 = ((String) r5).getBytes(r1);     // Catch: Exception -> L5
        Intrinsics.O10IXXX0X(r6, "getBytes(...)");     // Catch: Exception -> L5
        r3 = r6.length;     // Catch: Exception -> L5
    L8:
        return r4 + r3;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    @aa1
    public final Object getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mCommand) * 31) + this.mKeyword.hashCode()) * 31) + this.mValue.hashCode();
    }

    public final void setMCommand(int r1) {
        this.mCommand = r1;
    }

    public final void setMKeyword(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mKeyword = r2;
    }

    public final void setMValue(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mValue = r2;
    }

    @aa1
    public String toString() {
        return "BleAICommand(mCommand=" + this.mCommand + ", mKeyword=" + this.mKeyword + ", mValue=" + this.mValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICommand(int r2, @aa1 String r3, @aa1 Object r4) {
        Intrinsics.X0O(r3, "mKeyword");
        Intrinsics.X0O(r4, "mValue");
        this.mCommand = r2;
        this.mKeyword = r3;
        this.mValue = r4;
    }

    public /* synthetic */ BleAICommand(int r1, String r2, Object r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = "";
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = new Object();
    L11:
        this(r1, r2, r3);
    }
}
