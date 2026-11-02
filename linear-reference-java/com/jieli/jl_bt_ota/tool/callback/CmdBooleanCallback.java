package com.jieli.jl_bt_ota.tool.callback;

import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public class CmdBooleanCallback extends CmdResultCallback<Boolean, CommandBase<?, ?>> {
    public CmdBooleanCallback(String r2, IActionCallback<Boolean> r3) {
        super(r2, r3, new AnonymousClass1());
    }
}
