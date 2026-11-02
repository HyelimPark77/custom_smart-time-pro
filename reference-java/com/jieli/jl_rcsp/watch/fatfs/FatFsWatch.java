package com.jieli.jl_rcsp.watch.fatfs;

import android.bluetooth.BluetoothDevice;
import com.ironsource.C12616d4;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.interfaces.OnFatFsInitListener;
import com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.IWatchManager;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;
import com.jieli.jl_rcsp.tool.UpdateResourceThread;
import com.jieli.jl_rcsp.tool.WatchCallbackManager;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.WatchBase;
import com.jieli.jl_rcsp.watch.WatchProgressHandler;
import com.jieli.jl_rcsp.watch.fatfs.FatFsWatch;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class FatFsWatch extends WatchBase implements IWatchManager {

    /* JADX INFO: renamed from: e */
    public FatFileSystem f38427e;

    /* JADX INFO: renamed from: f */
    public UpdateResourceThread f38428f;

    public FatFsWatch(RcspOpImpl rcspOpImpl, WatchCallbackManager watchCallbackManager) {
        super(rcspOpImpl, watchCallbackManager);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public boolean cancelTransfer() {
        return false;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void createWatchFile(final String str, final boolean z, final OnFatFileProgressListener onFatFileProgressListener) {
        if (this.f38427e == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(22);
            }
        } else {
            if (str == null) {
                if (onFatFileProgressListener != null) {
                    onFatFileProgressListener.onStop(5);
                    return;
                }
                return;
            }
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                jumpToUpdateResource(false, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.4
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        JL_Log.m27887w(((WatchBase) FatFsWatch.this).TAG, "createWatchFile", "onFailed ---> " + baseError);
                        OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                        if (onFatFileProgressListener2 != null) {
                            onFatFileProgressListener2.onStop(baseError.getSubCode());
                        }
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(Boolean bool) {
                        FatFsWatch.this.m27979a(str, z, onFatFileProgressListener);
                    }
                });
            } else if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(5);
            }
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void deleteWatchFile(final String str, final OnFatFileProgressListener onFatFileProgressListener) {
        if (this.f38427e == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(22);
            }
        } else if (str != null) {
            jumpToUpdateResource(false, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.5
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                    if (onFatFileProgressListener2 != null) {
                        onFatFileProgressListener2.onStop(baseError.getSubCode());
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(Boolean bool) {
                    final WatchProgressHandler watchProgressHandler = new WatchProgressHandler(FatFsWatch.this, 2, onFatFileProgressListener);
                    FatFsWatch.this.deleteFileStart(str, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.5.1
                        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                        public void onFailed(BaseError baseError) {
                            watchProgressHandler.onStop(baseError.getSubCode());
                        }

                        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                        public void onSuccess(Boolean bool2) {
                            FatFsWatch.this.f38427e.deleteFatFile(str, watchProgressHandler);
                        }
                    });
                }
            });
        } else if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStop(5);
        }
    }

    @Override // com.jieli.jl_rcsp.watch.WatchBase, com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void destroy() {
        super.destroy();
        UpdateResourceThread updateResourceThread = this.f38428f;
        if (updateResourceThread != null) {
            updateResourceThread.stopThread();
        }
        destroyFatFileSystem();
    }

    public void destroyFatFileSystem() {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem != null) {
            fatFileSystem.destroy();
            setSysException(false);
            this.f38427e = null;
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public String getCurrentBrowsePath() {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem == null) {
            return null;
        }
        return fatFileSystem.getCurBrowsePath();
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public FatFile getWatchFileByPath(String str) {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem == null) {
            return null;
        }
        return fatFileSystem.getFatFileMsg(str);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchFileSize(String str, OnWatchOpCallback<WatchFileContent> onWatchOpCallback) {
        if (this.f38427e == null) {
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onFailed(new BaseError(22, FatUtil.getFatFsErrorCodeMsg(22)));
                return;
            }
            return;
        }
        FatFile watchFileByPath = getWatchFileByPath(str);
        if (watchFileByPath == null) {
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onFailed(new BaseError(4, FatUtil.getFatFsErrorCodeMsg(4)));
            }
        } else if (onWatchOpCallback != null) {
            onWatchOpCallback.onSuccess(new WatchFileContent(watchFileByPath.getSize(), (short) 0));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void getWatchSysLeftSize(OnWatchOpCallback<Long> onWatchOpCallback) {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem == null) {
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onFailed(new BaseError(22, FatUtil.getFatFsErrorCodeMsg(22)));
            }
        } else {
            long freeSize = ((long) fatFileSystem.getFreeSize()) * 4096;
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onSuccess(Long.valueOf(freeSize));
            }
        }
    }

    public FatFileSystem getWatchSystem() {
        return this.f38427e;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public void init() {
        m27976a(new OnFatFsInitListener() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.1
            @Override // com.jieli.jl_fatfs.interfaces.OnFatFsInitListener
            public void onInitFailed(int i) {
                JL_Log.m27887w(((WatchBase) FatFsWatch.this).TAG, C12616d4.a.f34169f, "onInitFailed ---> code = " + i);
            }

            @Override // com.jieli.jl_fatfs.interfaces.OnFatFsInitListener
            public void onInitOk() {
                JL_Log.m27883i(((WatchBase) FatFsWatch.this).TAG, C12616d4.a.f34169f, "onInitOk");
            }
        }, (OnFatFileProgressListener) null);
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchManager
    public boolean isInit() {
        return this.f38427e != null;
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void listWatchList(final OnWatchOpCallback<ArrayList<FatFile>> onWatchOpCallback) {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem == null) {
            onCallbackError(onWatchOpCallback, 22);
        } else {
            fatFileSystem.listFatDir("/", new OnFatFsOpResultListener() { // from class: com.android.mltcode.paycertificationapi.XXIXXXXI
                @Override // com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener
                public final void onResult(Object obj) {
                    this.OXO1.m27978a(onWatchOpCallback, (ArrayList) obj);
                }
            });
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void openWatchFile(String str, final OnWatchOpCallback<byte[]> onWatchOpCallback) {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem != null && str != null) {
            fatFileSystem.openFatFile(str, new OnFatFsOpResultListener() { // from class: com.android.mltcode.paycertificationapi.I00OXO0ii
                @Override // com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener
                public final void onResult(Object obj) {
                    FatFsWatch.m27949a(onWatchOpCallback, (byte[]) obj);
                }
            });
        } else if (onWatchOpCallback != null) {
            onWatchOpCallback.onFailed(new BaseError(4097, "param is error."));
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void replaceWatchFile(final String str, final OnFatFileProgressListener onFatFileProgressListener) {
        if (this.f38427e == null) {
            if (onFatFileProgressListener != null) {
                onFatFileProgressListener.onStop(22);
            }
        } else if (WatchFileUtil.isFileExist(str)) {
            jumpToUpdateResource(false, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.6
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    JL_Log.m27887w(((WatchBase) FatFsWatch.this).TAG, "replaceWatchFile", "onFailed ---> " + baseError);
                    OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                    if (onFatFileProgressListener2 != null) {
                        onFatFileProgressListener2.onStop(baseError.getSubCode());
                    }
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(Boolean bool) {
                    FatFsWatch.this.f38427e.replaceFatFile(str, new WatchProgressHandler(FatFsWatch.this, 3, onFatFileProgressListener));
                }
            });
        } else if (onFatFileProgressListener != null) {
            onFatFileProgressListener.onStop(5);
        }
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void restoreWatchSystem(OnFatFileProgressListener onFatFileProgressListener) {
        if (onFatFileProgressListener == null) {
            throw new RuntimeException("OnFatFileProgressListener can not be empty.");
        }
        JL_Log.m27887w(this.TAG, "restoreWatchSystem", "start. progressListener = " + onFatFileProgressListener);
        m27976a(new OnFatFsInitListener() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.2
            @Override // com.jieli.jl_fatfs.interfaces.OnFatFsInitListener
            public void onInitFailed(int i) {
                JL_Log.m27880e(((WatchBase) FatFsWatch.this).TAG, "restoreWatchSystem", "onInitFailed = " + i);
            }

            @Override // com.jieli.jl_fatfs.interfaces.OnFatFsInitListener
            public void onInitOk() {
                JL_Log.m27883i(((WatchBase) FatFsWatch.this).TAG, "restoreWatchSystem", "onInitOk ---> ");
            }
        }, new WatchProgressHandler(this, 4, onFatFileProgressListener));
    }

    @Override // com.jieli.jl_rcsp.interfaces.watch.IWatchOp
    public void updateWatchResource(final String str, final OnUpdateResourceCallback onUpdateResourceCallback) {
        FatFileSystem fatFileSystem = this.f38427e;
        if (fatFileSystem != null) {
            fatFileSystem.listFatDir("/", new OnFatFsOpResultListener() { // from class: com.android.mltcode.paycertificationapi.i1O0IX
                @Override // com.jieli.jl_fatfs.interfaces.OnFatFsOpResultListener
                public final void onResult(Object obj) {
                    this.OXO1.m27977a(onUpdateResourceCallback, str, (ArrayList) obj);
                }
            });
        } else if (onUpdateResourceCallback != null) {
            onUpdateResourceCallback.onError(22, FatUtil.getFatFsErrorCodeMsg(22));
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27977a(OnUpdateResourceCallback onUpdateResourceCallback, String str, ArrayList arrayList) {
        if (arrayList == null) {
            if (onUpdateResourceCallback != null) {
                onUpdateResourceCallback.onError(24, FatUtil.getFatFsErrorCodeMsg(24));
                return;
            }
            return;
        }
        JL_Log.m27883i(this.TAG, "updateWatchResource", "listFatDir >> " + arrayList.size());
        if (this.f38428f == null) {
            UpdateResourceThread updateResourceThread = new UpdateResourceThread(this, str, onUpdateResourceCallback, new ThreadStateListener() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.3
                @Override // com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener
                public void onFinish(long j) {
                    if (FatFsWatch.this.f38428f == null || FatFsWatch.this.f38428f.getId() != j) {
                        return;
                    }
                    FatFsWatch.this.f38428f = null;
                }

                @Override // com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener
                public void onStart(long j) {
                }
            });
            this.f38428f = updateResourceThread;
            updateResourceThread.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27978a(OnWatchOpCallback onWatchOpCallback, ArrayList arrayList) {
        if (arrayList == null) {
            onCallbackError(onWatchOpCallback, 24);
        } else if (onWatchOpCallback != null) {
            onWatchOpCallback.onSuccess(arrayList);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27949a(OnWatchOpCallback onWatchOpCallback, byte[] bArr) {
        if (bArr == null) {
            if (onWatchOpCallback != null) {
                onWatchOpCallback.onFailed(new BaseError(12289, "fatfs op error."));
            }
        } else if (onWatchOpCallback != null) {
            onWatchOpCallback.onSuccess(bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27976a(final OnFatFsInitListener onFatFsInitListener, final OnFatFileProgressListener onFatFileProgressListener) {
        if (this.f38427e == null) {
            final BluetoothDevice targetDevice = this.mRcspOp.getTargetDevice();
            if (targetDevice == null) {
                if (onFatFsInitListener != null) {
                    onFatFsInitListener.onInitFailed(8192);
                    return;
                }
                return;
            }
            ExternalFlashMsgResponse extFlashMsg = this.mStatusManager.getExtFlashMsg(targetDevice);
            JL_Log.m27877d(this.TAG, "createFatFileSystem", "device : " + RcspUtil.printBtDeviceInfo(targetDevice) + ", " + extFlashMsg);
            if (extFlashMsg == null) {
                queryExtFlashMsg(new OnOperationCallback<ExternalFlashMsgResponse>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.7
                    @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                    public void onFailed(BaseError baseError) {
                        OnFatFsInitListener onFatFsInitListener2 = onFatFsInitListener;
                        if (onFatFsInitListener2 != null) {
                            onFatFsInitListener2.onInitFailed(baseError.getSubCode());
                        }
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
                    public void onSuccess(ExternalFlashMsgResponse externalFlashMsgResponse) {
                        if (((WatchBase) FatFsWatch.this).mStatusManager.getExtFlashMsg(targetDevice) == null) {
                            ((WatchBase) FatFsWatch.this).mStatusManager.updateExtFlashMsg(targetDevice, externalFlashMsgResponse);
                        }
                        JL_Log.m27877d(((WatchBase) FatFsWatch.this).TAG, "createFatFileSystem", "GetExternalFlashMsg : " + externalFlashMsgResponse);
                        FatFsWatch.this.m27976a(onFatFsInitListener, onFatFileProgressListener);
                    }
                });
                return;
            }
            JL_Log.m27883i(this.TAG, "createFatFileSystem", "" + extFlashMsg);
            if (extFlashMsg.getSysStatus() != 0) {
                if (onFatFileProgressListener == null) {
                    if (onFatFsInitListener != null) {
                        onFatFsInitListener.onInitFailed(2);
                        return;
                    }
                    return;
                }
                setSysException(true);
            }
            this.f38427e = new FatFileSystem(extFlashMsg.getFlashSize(), extFlashMsg.getFatSize(), extFlashMsg.getSysStatus(), extFlashMsg.getMatchVersions(), new FatFsBluetoothImp(this), new OnFatFsInitListener() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.8
                @Override // com.jieli.jl_fatfs.interfaces.OnFatFsInitListener
                public void onInitFailed(int i) {
                    JL_Log.m27880e(((WatchBase) FatFsWatch.this).TAG, "createFatFileSystem", "onInitFailed = " + i);
                    FatFsWatch.this.destroyFatFileSystem();
                    OnFatFsInitListener onFatFsInitListener2 = onFatFsInitListener;
                    if (onFatFsInitListener2 != null) {
                        onFatFsInitListener2.onInitFailed(i);
                    }
                    ((WatchBase) FatFsWatch.this).mWatchCallbackManager.onWatchSystemInit(i);
                }

                @Override // com.jieli.jl_fatfs.interfaces.OnFatFsInitListener
                public void onInitOk() {
                    JL_Log.m27883i(((WatchBase) FatFsWatch.this).TAG, "createFatFileSystem", "onInitOk ====> ");
                    FatFsWatch.this.setSysException(false);
                    OnFatFsInitListener onFatFsInitListener2 = onFatFsInitListener;
                    if (onFatFsInitListener2 != null) {
                        onFatFsInitListener2.onInitOk();
                    }
                    ((WatchBase) FatFsWatch.this).mWatchCallbackManager.onWatchSystemInit(0);
                    BluetoothDevice targetDevice2 = ((WatchBase) FatFsWatch.this).mRcspOp.getTargetDevice();
                    if (((WatchBase) FatFsWatch.this).mStatusManager.getDeviceInfo(targetDevice2) != null) {
                        FatFsWatch fatFsWatch = FatFsWatch.this;
                        fatFsWatch.setOTAResource(((WatchBase) fatFsWatch).mStatusManager.getDeviceInfo(targetDevice2).getExpandMode() == 1);
                        JL_Log.m27887w(((WatchBase) FatFsWatch.this).TAG, "createFatFileSystem", "isOTAResource = " + ((WatchBase) FatFsWatch.this).isOTAResource);
                        if (((WatchBase) FatFsWatch.this).isOTAResource) {
                            ((WatchBase) FatFsWatch.this).mWatchCallbackManager.onResourceUpdateUnfinished(targetDevice2);
                        }
                    }
                }
            }, onFatFileProgressListener);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27979a(final String str, final boolean z, final OnFatFileProgressListener onFatFileProgressListener) {
        createFileStart(FatUtil.getFatFilePath(this.f38427e.getCurBrowsePath(), str), (int) new File(str).length(), new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.watch.fatfs.FatFsWatch.9
            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onFailed(BaseError baseError) {
                OnFatFileProgressListener onFatFileProgressListener2 = onFatFileProgressListener;
                if (onFatFileProgressListener2 != null) {
                    onFatFileProgressListener2.onStop(baseError.getSubCode());
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onSuccess(Boolean bool) {
                FatFsWatch.this.f38427e.createFatFile(str, z, new WatchProgressHandler(FatFsWatch.this, 1, onFatFileProgressListener));
            }
        });
    }
}
