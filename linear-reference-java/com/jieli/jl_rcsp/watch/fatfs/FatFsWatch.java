package com.jieli.jl_rcsp.watch.fatfs;

import android.bluetooth.BluetoothDevice;
import com.android.mltcode.paycertificationapi.I00OXO0ii;
import com.android.mltcode.paycertificationapi.XXIXXXXI;
import com.android.mltcode.paycertificationapi.i1O0IX;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.interfaces.OnFatFsInitListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.tool.DeviceStatusManager;
import com.jieli.jl_rcsp.tool.UpdateResourceThread;
import com.jieli.jl_rcsp.tool.WatchCallbackManager;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.WatchBase;
import com.jieli.jl_rcsp.watch.WatchProgressHandler;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class FatFsWatch extends WatchBase implements IWatchManager {
    public FatFileSystem e;
    public UpdateResourceThread f;

    public FatFsWatch(RcspOpImpl r1, WatchCallbackManager r2) {
        super(r1, r2);
    }

    public static /* synthetic */ String a(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String b(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ DeviceStatusManager c(FatFsWatch r0) {
        return r0.mStatusManager;
    }

    public static /* synthetic */ String d(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String e(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ WatchCallbackManager f(FatFsWatch r0) {
        return r0.mWatchCallbackManager;
    }

    public static /* synthetic */ RcspOpImpl g(FatFsWatch r0) {
        return r0.mRcspOp;
    }

    public static /* synthetic */ DeviceStatusManager h(FatFsWatch r0) {
        return r0.mStatusManager;
    }

    public static /* synthetic */ DeviceStatusManager i(FatFsWatch r0) {
        return r0.mStatusManager;
    }

    public static /* synthetic */ String j(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String k(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ boolean l(FatFsWatch r0) {
        return r0.isOTAResource;
    }

    public static /* synthetic */ boolean m(FatFsWatch r0) {
        return r0.isOTAResource;
    }

    public static /* synthetic */ WatchCallbackManager n(FatFsWatch r0) {
        return r0.mWatchCallbackManager;
    }

    public static /* synthetic */ String o(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ WatchCallbackManager p(FatFsWatch r0) {
        return r0.mWatchCallbackManager;
    }

    public static /* synthetic */ UpdateResourceThread q(FatFsWatch r0) {
        return r0.f;
    }

    public static /* synthetic */ String r(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ String s(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ FatFileSystem t(FatFsWatch r0) {
        return r0.e;
    }

    public static /* synthetic */ String u(FatFsWatch r0) {
        return r0.TAG;
    }

    public static /* synthetic */ DeviceStatusManager v(FatFsWatch r0) {
        return r0.mStatusManager;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean cancelTransfer() {
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void createWatchFile(final String r4, final boolean r5, final OnFatFileProgressListener r6) {
        if (this.e != null) goto L8;
        if (r6 == null) goto L21;
        r6.onStop(22);
        return;
    L21:
        return;
    L8:
        if (r4 != null) goto L12;
        if (r6 == null) goto L22;
        r6.onStop(5);
        return;
    L22:
        return;
    L12:
        File r1 = new File(r4);
        if (r1.exists() == true) goto L15;
    L18:
        if (r6 == null) goto L23;
        r6.onStop(5);
        return;
    L23:
        return;
    L15:
        if (r1.isFile() == false) goto L18;
        jumpToUpdateResource(false, new AnonymousClass4(this, r4, r5, r6));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void deleteWatchFile(final String r2, final OnFatFileProgressListener r3) {
        if (this.e != null) goto L7;
        if (r3 == null) goto L13;
        r3.onStop(22);
        return;
    L13:
        return;
    L7:
        if (r2 != null) goto L11;
        if (r3 == null) goto L14;
        r3.onStop(5);
        return;
    L14:
        return;
    L11:
        jumpToUpdateResource(false, new AnonymousClass5(this, r3, r2));
    }

    @Override // com.jieli.jl_rcsp.watch.WatchBase, com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void destroy() {
        super.destroy();
        UpdateResourceThread r0 = this.f;
        if (r0 == null) goto L5;
        r0.stopThread();
    L5:
        destroyFatFileSystem();
    }

    public void destroyFatFileSystem() {
        FatFileSystem r0 = this.e;
        if (r0 == null) goto L6;
        r0.destroy();
        setSysException(false);
        this.e = null;
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public String getCurrentBrowsePath() {
        FatFileSystem r0 = this.e;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getCurBrowsePath();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public FatFile getWatchFileByPath(String r2) {
        FatFileSystem r0 = this.e;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getFatFileMsg(r2);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchFileSize(String r4, OnWatchOpCallback<WatchFileContent> r5) {
        if (this.e != null) goto L7;
        if (r5 == null) goto L15;
        r5.onFailed(new BaseError(22, FatUtil.getFatFsErrorCodeMsg(22)));
        return;
    L15:
        return;
    L7:
        FatFile r6 = getWatchFileByPath(r4);
        if (r6 != null) goto L12;
        if (r5 == null) goto L16;
        r5.onFailed(new BaseError(4, FatUtil.getFatFsErrorCodeMsg(4)));
        return;
    L16:
        return;
    L12:
        if (r5 == null) goto L17;
        r5.onSuccess(new WatchFileContent(r6.getSize(), 0));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchSysLeftSize(OnWatchOpCallback<Long> r5) {
        FatFileSystem r0 = this.e;
        if (r0 != null) goto L7;
        if (r5 == null) goto L11;
        r5.onFailed(new BaseError(22, FatUtil.getFatFsErrorCodeMsg(22)));
        return;
    L11:
        return;
    L7:
        long r1 = ((long) r0.getFreeSize()) * 4096;
        if (r5 == null) goto L12;
        r5.onSuccess(Long.valueOf(r1));
        return;
    }

    public FatFileSystem getWatchSystem() {
        return this.e;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void init() {
        a(new AnonymousClass1(this), null);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public boolean isInit() {
        if (this.e == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void listWatchList(final OnWatchOpCallback<ArrayList<FatFile>> r3) {
        FatFileSystem r0 = this.e;
        if (r0 != null) goto L6;
        onCallbackError(r3, 22);
        return;
    L6:
        r0.listFatDir("/", new XXIXXXXI(this, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void openWatchFile(String r3, final OnWatchOpCallback<byte[]> r4) {
        FatFileSystem r0 = this.e;
        if (r0 == null) goto L8;
        if (r3 == null) goto L8;
        r0.openFatFile(r3, new I00OXO0ii(r4));
        return;
    L8:
        if (r4 == null) goto L11;
        r4.onFailed(new BaseError(4097, "param is error."));
        return;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void replaceWatchFile(final String r2, final OnFatFileProgressListener r3) {
        if (this.e != null) goto L8;
        if (r3 == null) goto L14;
        r3.onStop(22);
        return;
    L14:
        return;
    L8:
        if (WatchFileUtil.isFileExist(r2) == true) goto L12;
        if (r3 == null) goto L15;
        r3.onStop(5);
        return;
    L15:
        return;
    L12:
        jumpToUpdateResource(false, new AnonymousClass6(this, r2, r3));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void restoreWatchSystem(OnFatFileProgressListener r4) {
        if (r4 == null) goto L6;
        JL_Log.w(this.TAG, "restoreWatchSystem", "start. progressListener = " + r4);
        a(new AnonymousClass2(this), new WatchProgressHandler(this, 4, r4));
        return;
    L6:
        throw new RuntimeException("OnFatFileProgressListener can not be empty.");
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void updateWatchResource(final String r3, final OnUpdateResourceCallback r4) {
        FatFileSystem r0 = this.e;
        if (r0 != null) goto L7;
        if (r4 == null) goto L9;
        r4.onError(22, FatUtil.getFatFsErrorCodeMsg(22));
        return;
    L9:
        return;
    L7:
        r0.listFatDir("/", new i1O0IX(this, r4, r3));
    }

    public static /* synthetic */ void a(FatFsWatch r0, OnFatFsInitListener r1, OnFatFileProgressListener r2) {
        r0.a(r1, r2);
    }

    public static /* synthetic */ void b(FatFsWatch r0, boolean r1) {
        r0.setOTAResource(r1);
    }

    public static /* synthetic */ void a(FatFsWatch r0, boolean r1) {
        r0.setSysException(r1);
    }

    public static /* synthetic */ UpdateResourceThread a(FatFsWatch r0, UpdateResourceThread r1) {
        r0.f = r1;
        return r1;
    }

    public static /* synthetic */ void a(FatFsWatch r0, String r1, boolean r2, OnFatFileProgressListener r3) {
        r0.a(r1, r2, r3);
    }

    public static /* synthetic */ void a(FatFsWatch r0, String r1, OnWatchOpCallback r2) {
        r0.deleteFileStart(r1, r2);
    }

    public final /* synthetic */ void a(OnUpdateResourceCallback r4, String r5, ArrayList r6) {
        if (r6 != null) goto L6;
        if (r4 == null) goto L10;
        r4.onError(24, FatUtil.getFatFsErrorCodeMsg(24));
        return;
    L10:
        return;
    L6:
        JL_Log.i(this.TAG, "updateWatchResource", "listFatDir >> " + r6.size());
        if (this.f != null) goto L11;
        UpdateResourceThread r7 = new UpdateResourceThread(this, r5, r4, new AnonymousClass3(this));
        this.f = r7;
        r7.start();
        return;
    }

    public final /* synthetic */ void a(OnWatchOpCallback r1, ArrayList r2) {
        if (r2 != null) goto L5;
        onCallbackError(r1, 24);
        return;
    L5:
        if (r1 == null) goto L8;
        r1.onSuccess(r2);
        return;
    }

    public static /* synthetic */ void a(OnWatchOpCallback r2, byte[] r3) {
        if (r3 != null) goto L6;
        if (r2 == null) goto L9;
        r2.onFailed(new BaseError(12289, "fatfs op error."));
        return;
    L9:
        return;
    L6:
        if (r2 == null) goto L10;
        r2.onSuccess(r3);
        return;
    }

    public final void a(final OnFatFsInitListener r11, final OnFatFileProgressListener r12) {
        if (this.e != null) goto L22;
        final BluetoothDevice r0 = this.mRcspOp.getTargetDevice();
        if (r0 != null) goto L9;
        if (r11 == null) goto L23;
        r11.onInitFailed(8192);
        return;
    L23:
        return;
    L9:
        ExternalFlashMsgResponse r1 = this.mStatusManager.getExtFlashMsg(r0);
        JL_Log.d(this.TAG, "createFatFileSystem", "device : " + RcspUtil.printBtDeviceInfo(r0) + ", " + r1);
        if (r1 != null) goto L13;
        queryExtFlashMsg(new AnonymousClass7(this, r0, r11, r12));
        return;
    L13:
        JL_Log.i(this.TAG, "createFatFileSystem", "" + r1);
        if (r1.getSysStatus() == 0) goto L20;
        if (r12 != null) goto L19;
        if (r11 == null) goto L24;
        r11.onInitFailed(2);
        return;
    L24:
        return;
    L19:
        setSysException(true);
    L20:
        this.e = new FatFileSystem(r1.getFlashSize(), r1.getFatSize(), r1.getSysStatus(), r1.getMatchVersions(), new FatFsBluetoothImp(this), new AnonymousClass8(this, r11), r12);
        return;
    }

    public final void a(final String r4, final boolean r5, final OnFatFileProgressListener r6) {
        int r0 = (int) new File(r4).length();
        createFileStart(FatUtil.getFatFilePath(this.e.getCurBrowsePath(), r4), r0, new AnonymousClass9(this, r4, r5, r6));
    }
}
