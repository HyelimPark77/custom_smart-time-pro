package com.jieli.jl_rcsp.model.command;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommandWithResponse;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.device.DeviceConfiguration;

/* JADX INFO: loaded from: classes17.dex */
public class GetDevConfigureCmd extends CommandWithResponse<Response> {

    public static class Response extends CommonResponse {
        private final DeviceConfiguration deviceConfiguration;

        public Response() {
            this.deviceConfiguration = new DeviceConfiguration();
        }

        public byte[] getData() {
            return this.deviceConfiguration.getData();
        }

        public DeviceConfiguration getDeviceConfiguration() {
            return this.deviceConfiguration;
        }

        public int getProductFlag() {
            return this.deviceConfiguration.getType();
        }

        public int getVersion() {
            return this.deviceConfiguration.getVersion();
        }

        public void parseData(byte[] r2) {
            this.deviceConfiguration.parse(r2);
        }

        @Override // com.jieli.jl_rcsp.model.base.CommonResponse
        public String toString() {
            return "Response{deviceConfiguration=" + this.deviceConfiguration + i0XO1.IO;
        }
    }

    public GetDevConfigureCmd() {
        super(217, GetDevConfigureCmd.class.getSimpleName());
    }
}
