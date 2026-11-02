package com.jieli.jl_rcsp.model.command.file_op;

import android.text.TextUtils;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandWithParamAndResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes17.dex */
public class LargeFileTransferGetNameCmd extends CommandWithParamAndResponse<Param, CommonResponse> {
    private static final String TAG = "LargeFileTransferGetNameCmd";

    public static class Param extends BaseParameter {
        private String encodeType;
        private boolean isOtherEncode;
        public final String name;
        public final int renameTime;

        public Param(String r2, int r3) {
            this.encodeType = StandardCharsets.UTF_16LE.name();
            this.name = r2;
            this.renameTime = r3;
        }

        private byte[] getNameData(String r2, int r3) {
            if (this.isOtherEncode == false) goto L7;
            return getNameDataByOther(r2, r3);
        L7:
            return getNameDataByDefault(r2, r3);
        }

        private byte[] getNameDataByDefault(String r13, int r14) {
            String r2 = "";
            String r15 = r13.replaceAll("[\\x00-\\x1f\\x2f\\x3a\\x3c\\x3e\\x5c\\x22]", "");
            int r1 = r15.lastIndexOf(46);
            if (r1 == (-1)) goto L5;
            String r5 = r15.substring(0, r1);
        L6:
            if (r1 == (-1)) goto L8;
            String r3 = r15.substring(r1);
        L9:
            if (r14 <= 0) goto L11;
            String r4 = "000" + r14;
            r2 = r4.substring(r4.length() - 3);
        L11:
            String r6 = r5 + r2;
            byte[] r7 = r6.getBytes("gbk");     // Catch: UnsupportedEncodingException -> L14
        L17:
            if (r7.length < 9) goto L19;
        L27:
            String r0 = r5 + r2 + r3;
            JL_Log.i(LargeFileTransferGetNameCmd.TAG, "getNameDataByDefault", "获取文件名称 \tretryName = " + r14 + "\tname = " + r15 + "\tlenName = " + r0);
            byte[] r16 = "\\U".getBytes();
            byte[] r17 = r0.getBytes(StandardCharsets.UTF_16LE);
            byte[] r8 = new byte[(r16.length + r17.length) + 2];
            System.arraycopy(r16, 0, r8, 0, r16.length);
            System.arraycopy(r17, 0, r8, r16.length, r17.length);
            JL_Log.i(LargeFileTransferGetNameCmd.TAG, "getNameDataByDefault", "data : " + CHexConver.byte2HexStr(r8));
            return r8;
        L19:
            if (r3.length() >= 5) goto L27;
            String r9 = r6 + r3;
            byte[] r10 = r9.getBytes("gbk");     // Catch: UnsupportedEncodingException -> L23
        L25:
            JL_Log.i(LargeFileTransferGetNameCmd.TAG, "getNameDataByDefault", "获取文件名称 \tretryName = " + r14 + "\tname = " + r15 + "\tshortName = " + r9);
            byte[] r18 = new byte[r10.length + 2];
            System.arraycopy(r10, 0, r18, 0, r10.length);
            return r18;
        L23:
            e = move-exception;
            e.printStackTrace();
            r10 = r9.getBytes();
        L14:
            e = move-exception;
            e.printStackTrace();
            r7 = r6.getBytes();
            goto L17
        L8:
            r3 = "";
            goto L9
        L5:
            r5 = r15;
            goto L6
        }

        private byte[] getNameDataByOther(String r9, int r10) {
            if (TextUtils.isEmpty(this.encodeType) == false) goto L5;
            String r2 = StandardCharsets.UTF_16LE.name();
        L6:
            String r4 = "";
            String r11 = r9.replaceAll("[\\x00-\\x1f\\x2f\\x3a\\x3c\\x3e\\x5c\\x22]", "");
            int r3 = r11.lastIndexOf(46);
            if (r3 == (-1)) goto L9;
            String r7 = r11.substring(0, r3);
        L10:
            if (r3 == (-1)) goto L12;
            String r5 = r11.substring(r3);
        L13:
            if (r10 <= 0) goto L20;
            String r6 = "000" + r10;
            r4 = r6.substring(r6.length() - 3);
        L20:
            String r8 = r7 + r4 + r5;     // Catch: UnsupportedEncodingException -> L17
            JL_Log.i(LargeFileTransferGetNameCmd.TAG, "getNameDataByOther", "获取文件名称 \tretryName = " + r10 + "\tname = " + r11 + "\tlenName = " + r8);     // Catch: UnsupportedEncodingException -> L17
            byte[] r12 = "\\U".getBytes();     // Catch: UnsupportedEncodingException -> L17
            byte[] r13 = r8.getBytes(r2);     // Catch: UnsupportedEncodingException -> L17
            byte[] r14 = new byte[(r12.length + r13.length) + 2];     // Catch: UnsupportedEncodingException -> L17
            System.arraycopy(r12, 0, r14, 0, r12.length);     // Catch: UnsupportedEncodingException -> L17
            System.arraycopy(r13, 0, r14, r12.length, r13.length);     // Catch: UnsupportedEncodingException -> L17
            JL_Log.i(LargeFileTransferGetNameCmd.TAG, "getNameDataByOther", "data : " + CHexConver.byte2HexStr(r14));     // Catch: UnsupportedEncodingException -> L17
            return r14;
        L17:
            e = move-exception;
            e.printStackTrace();
            return new byte[0];
        L12:
            r5 = "";
            goto L13
        L9:
            r7 = r11;
            goto L10
        L5:
            r2 = this.encodeType;
            goto L6
        }

        public String getEncodeType() {
            return this.encodeType;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            String r0 = this.name;
            if (r0 == null) goto L10;
            if (r0.isEmpty() == true) goto L10;
            return getNameData(this.name, this.renameTime);
        L10:
            return super.getParamData();
        }

        public boolean isOtherEncode() {
            return this.isOtherEncode;
        }

        public Param setEncodeType(String r1) {
            this.encodeType = r1;
            return this;
        }

        public Param setOtherEncode(boolean r1) {
            this.isOtherEncode = r1;
            return this;
        }
    }

    public LargeFileTransferGetNameCmd(Param r3) {
        super(32, LargeFileTransferGetNameCmd.class.getSimpleName(), r3);
    }
}
