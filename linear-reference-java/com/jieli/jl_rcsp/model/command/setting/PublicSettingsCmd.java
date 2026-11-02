package com.jieli.jl_rcsp.model.command.setting;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IDataOp;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.device.settings.SettingData;
import com.jieli.jl_rcsp.model.device.settings.v0.BoundDeviceState;
import com.jieli.jl_rcsp.model.device.settings.v0.BrightnessSetting;
import com.jieli.jl_rcsp.model.device.settings.v0.DialExpandInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.FlashlightSetting;
import com.jieli.jl_rcsp.model.device.settings.v0.FunctionResource;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkFunction;
import com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class PublicSettingsCmd extends CommandBase<Param, Response> {

    public static class Param extends BaseParameter implements IDataOp {
        private SettingData settingData;

        public Param() {
            this.settingData = new SettingData(new byte[0]);
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return toData();
        }

        public SettingData getSettingData() {
            return this.settingData;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r2) {
            return this.settingData.parse(r2);
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            return this.settingData.toData();
        }

        public Param(SettingData r3) {
            new SettingData(new byte[0]);
            this.settingData = r3;
        }
    }

    public static class Response extends CommonResponse implements IDataOp {
        private int result;
        private SettingData settingData;

        public Response(byte[] r2) {
            this.result = -1;
            setRawData(r2);
            parse(r2);
        }

        public int getResult() {
            return this.result;
        }

        public SettingData getSettingData() {
            return this.settingData;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r6) {
            if (r6 != null) goto L5;
        L37:
            return 0;
        L5:
            if (r6.length == 0) goto L37;
            this.result = CHexConver.byteToInt(r6[0]);
            if (r6.length <= 1) goto L38;
            int r1 = r6.length - 1;
            byte[] r3 = new byte[r1];
            System.arraycopy(r6, 1, r3, 0, r1);
            if (this.settingData != null) goto L12;
            this.settingData = new SettingData(new byte[0]);
        L12:
            int r7 = this.settingData.parse(r3);
            if (r7 <= 0) goto L36;
            if (this.settingData.getVersion() != 0) goto L36;
            SettingFunction r0 = new SettingFunction(r3);
            int r2 = r0.getFunction();
            if (r2 != 1) goto L19;
            this.settingData = new BrightnessSetting(r3);
            goto L36
        L19:
            if (r2 != 2) goto L21;
            this.settingData = new FlashlightSetting(r3);
            goto L36
        L21:
            if (r2 != 3) goto L23;
            this.settingData = new BoundDeviceState(r3);
            goto L36
        L23:
            if (r2 != 4) goto L25;
            this.settingData = new FunctionResource(r3);
            goto L36
        L25:
            if (r2 != 5) goto L27;
            this.settingData = new NetworkFunction(r3);
            goto L36
        L27:
            if (r2 == 7) goto L29;
            this.settingData = r0;
            goto L36
        L29:
            this.settingData = new DialExpandInfo(r3);
        L36:
            return 1 + r7;
        L38:
            return 1;
        }

        @Override // com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            ByteArrayOutputStream r0 = new ByteArrayOutputStream();
            r0.write(this.result);     // Catch: IOException -> L7
            SettingData r1 = this.settingData;     // Catch: IOException -> L7
            if (r1 == null) goto L10;
            r0.write(r1.toData());     // Catch: IOException -> L7
        L10:
            return r0.toByteArray();
        L7:
            e = move-exception;
            throw new RuntimeException(e);
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "Response{result=" + this.result + ", settingData=" + this.settingData + i0XO1.IO;
        }

        public Response(int r1, SettingData r2) {
            this.result = r1;
            this.settingData = r2;
        }
    }

    public static class ResultParam extends Param {
        private int result;

        public ResultParam() {
            this.result = -1;
        }

        public int getResult() {
            return this.result;
        }

        @Override // com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public int parse(byte[] r3) {
            if (r3 != null) goto L5;
        L9:
            return 0;
        L5:
            if (r3.length == 0) goto L9;
            this.result = CHexConver.byteToInt(r3[0]);
            return super.parse(r3);
        }

        @Override // com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd.Param, com.jieli.jl_rcsp.interfaces.cmd.IDataOp
        public byte[] toData() {
            return new byte[]{(byte) this.result};
        }

        public ResultParam(int r3) {
            super(new SettingData(new byte[0]));
            this.result = r3;
        }
    }

    public PublicSettingsCmd(Param r2) {
        this(2, r2);
    }

    public PublicSettingsCmd(int r3, Param r4) {
        super(51, PublicSettingsCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
