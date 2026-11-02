package com.jieli.jl_filebrowse.tool;

import android.os.Handler;
import com.android.mltcode.paycertificationapi.b00;
import com.android.mltcode.paycertificationapi.c00;
import com.android.mltcode.paycertificationapi.d00;
import com.jieli.jl_filebrowse.interfaces.lrc.LrcReadObserver;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;

/* JADX INFO: loaded from: classes17.dex */
public class LrcReadObserverHelper extends BaseCallbackManager<LrcReadObserver> implements LrcReadObserver {
    public LrcReadObserverHelper(Handler r1) {
        super(r1);
    }

    public static /* synthetic */ void a(String r0, LrcReadObserver r1) {
        r1.onLrcReadStop(r0);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.LrcReadObserver
    public void onLrcReadFailed(final int r2) {
        callbackEvent(new d00(r2));
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.LrcReadObserver
    public void onLrcReadStart() {
        callbackEvent(new b00());
    }

    @Override // com.jieli.jl_filebrowse.interfaces.lrc.LrcReadObserver
    public void onLrcReadStop(final String r2) {
        callbackEvent(new c00(r2));
    }

    public static /* synthetic */ void a(int r0, LrcReadObserver r1) {
        r1.onLrcReadFailed(r0);
    }
}
