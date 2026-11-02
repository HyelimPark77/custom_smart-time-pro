package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleWritable;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTimeZone extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 1;
    private int mOffset;

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

    public BleTimeZone() {
        this.mOffset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mOffset = readInt8() * OtaCommandGenerator.CMD_OTA_INFO;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(((this.mOffset / 1000) / 60) / 15);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 1;
    }

    @aa1
    public String toString() {
        return "BleTimeZone(mOffset=" + this.mOffset + HexStringBuilder.COMMENT_END_CHAR;
    }
}
