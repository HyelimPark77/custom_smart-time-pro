package com.jieli.jl_bt_ota.model.command;

import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.parameter.DataParam;

/* JADX INFO: loaded from: classes17.dex */
public class DataCmd extends CommandBase<DataParam, CommonResponse> {
    public DataCmd(DataParam r2) {
        this(1, r2);
    }

    public DataCmd(int r3, DataParam r4) {
        super(1, DataCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
