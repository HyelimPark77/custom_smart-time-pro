package com.jieli.jl_filebrowse.tool;

import android.os.Handler;
import com.android.mltcode.paycertificationapi.I0X0XO00;
import com.android.mltcode.paycertificationapi.I1i1O1OXI;
import com.android.mltcode.paycertificationapi.IiOiXOOi1;
import com.android.mltcode.paycertificationapi.OIIiXI;
import com.android.mltcode.paycertificationapi.OX11100iI;
import com.android.mltcode.paycertificationapi.XOi0i1;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_rcsp.tool.callback.BaseCallbackManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class FileObserverHelper extends BaseCallbackManager<FileObserver> implements FileObserver {
    public FileObserverHelper(Handler r1) {
        super(r1);
    }

    public static /* synthetic */ void a(List r0, FileObserver r1) {
        r1.onFileReceiver(r0);
    }

    public static /* synthetic */ void b(boolean r0, FileObserver r1) {
        r1.onFileReadStop(r0);
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void OnFlayCallback(final boolean r2) {
        callbackEvent(new I0X0XO00(r2));
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReadFailed(final int r2) {
        callbackEvent(new I1i1O1OXI(r2));
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReadStart() {
        callbackEvent(new IiOiXOOi1());
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReadStop(final boolean r2) {
        callbackEvent(new OIIiXI(r2));
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReceiver(final List<FileStruct> r2) {
        callbackEvent(new OX11100iI(r2));
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onSdCardStatusChange(final List<SDCardBean> r2) {
        callbackEvent(new XOi0i1(r2));
    }

    public static /* synthetic */ void a(int r0, FileObserver r1) {
        r1.onFileReadFailed(r0);
    }

    public static /* synthetic */ void b(List r0, FileObserver r1) {
        r1.onSdCardStatusChange(r0);
    }

    public static /* synthetic */ void a(boolean r0, FileObserver r1) {
        r1.OnFlayCallback(r0);
    }
}
