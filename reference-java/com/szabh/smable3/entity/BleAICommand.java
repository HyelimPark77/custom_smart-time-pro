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
    public static final Companion Companion = new Companion(null);
    private int mCommand;

    @aa1
    private String mKeyword;

    @aa1
    private Object mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleAICommand() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ BleAICommand copy$default(BleAICommand bleAICommand, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = bleAICommand.mCommand;
        }
        if ((i2 & 2) != 0) {
            str = bleAICommand.mKeyword;
        }
        if ((i2 & 4) != 0) {
            obj = bleAICommand.mValue;
        }
        return bleAICommand.copy(i, str, obj);
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
    public final BleAICommand copy(int i, @aa1 String mKeyword, @aa1 Object mValue) {
        Intrinsics.X0O(mKeyword, "mKeyword");
        Intrinsics.X0O(mValue, "mValue");
        return new BleAICommand(i, mKeyword, mValue);
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
        byte[] bytes;
        int length;
        super.encode();
        writeInt8(this.mCommand);
        String str = this.mKeyword;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes2 = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        int length2 = bytes2.length;
        writeInt8(length2);
        if (length2 > 0) {
            bytes = this.mKeyword.getBytes(charset);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        } else {
            bytes = new byte[1];
        }
        BleWritable.writeBytes$default(this, bytes, null, 2, null);
        byte[] bytes3 = new byte[0];
        Object obj = this.mValue;
        if (obj instanceof String) {
            Intrinsics.X1ii(obj, "null cannot be cast to non-null type kotlin.String");
            bytes3 = ((String) obj).getBytes(charset);
            Intrinsics.O10IXXX0X(bytes3, "getBytes(...)");
            length = bytes3.length;
        } else if (obj instanceof byte[]) {
            Intrinsics.X1ii(obj, "null cannot be cast to non-null type kotlin.ByteArray");
            bytes3 = (byte[]) obj;
            length = bytes3.length;
        } else {
            length = 0;
        }
        writeInt8(length);
        BleWritable.writeBytes$default(this, bytes3, null, 2, null);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAICommand)) {
            return false;
        }
        BleAICommand bleAICommand = (BleAICommand) obj;
        return this.mCommand == bleAICommand.mCommand && Intrinsics.XOO0ii0(this.mKeyword, bleAICommand.mKeyword) && Intrinsics.XOO0ii0(this.mValue, bleAICommand.mValue);
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
        String str = this.mKeyword;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int length = 1;
        int iMax = Math.max(bytes.length, 1) + 4;
        try {
            Object obj = this.mValue;
            Intrinsics.X1ii(obj, "null cannot be cast to non-null type kotlin.String");
            byte[] bytes2 = ((String) obj).getBytes(charset);
            Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
            length = bytes2.length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iMax + length;
    }

    @aa1
    public final Object getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mCommand) * 31) + this.mKeyword.hashCode()) * 31) + this.mValue.hashCode();
    }

    public final void setMCommand(int i) {
        this.mCommand = i;
    }

    public final void setMKeyword(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mKeyword = str;
    }

    public final void setMValue(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.mValue = obj;
    }

    @aa1
    public String toString() {
        return "BleAICommand(mCommand=" + this.mCommand + ", mKeyword=" + this.mKeyword + ", mValue=" + this.mValue + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAICommand(int i, @aa1 String mKeyword, @aa1 Object mValue) {
        Intrinsics.X0O(mKeyword, "mKeyword");
        Intrinsics.X0O(mValue, "mValue");
        this.mCommand = i;
        this.mKeyword = mKeyword;
        this.mValue = mValue;
    }

    public /* synthetic */ BleAICommand(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new Object() : obj);
    }
}
