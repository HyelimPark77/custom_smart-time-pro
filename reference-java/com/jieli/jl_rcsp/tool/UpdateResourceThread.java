package com.jieli.jl_rcsp.tool;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.jieli.jl_fatfs.FatFileSystem;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_fatfs.utils.ZipUtil;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.fatfs.FatFsWatch;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateResourceThread extends Thread {

    /* JADX INFO: renamed from: n */
    public static final String f38250n = "UpdateResourceThread";

    /* JADX INFO: renamed from: b */
    public boolean f38252b;

    /* JADX INFO: renamed from: c */
    public int f38253c;

    /* JADX INFO: renamed from: d */
    public final FatFsWatch f38254d;

    /* JADX INFO: renamed from: e */
    public final FatFileSystem f38255e;

    /* JADX INFO: renamed from: f */
    public final String f38256f;

    /* JADX INFO: renamed from: g */
    public String f38257g;

    /* JADX INFO: renamed from: h */
    public String f38258h;

    /* JADX INFO: renamed from: i */
    public final OnUpdateResourceCallback f38259i;

    /* JADX INFO: renamed from: j */
    public final ThreadStateListener f38260j;

    /* JADX INFO: renamed from: l */
    public boolean f38262l;

    /* JADX INFO: renamed from: m */
    public BaseError f38263m;

    /* JADX INFO: renamed from: a */
    public final Object f38251a = new Object();

    /* JADX INFO: renamed from: k */
    public final Handler f38261k = new Handler(Looper.getMainLooper());

    public static class UpdateTask {
        public static final int OP_CREATE_FILE = 1;
        public static final int OP_REPLACE_FILE = 2;
        public String filePath;
        public long fileSize;

        /* JADX INFO: renamed from: op */
        public int f38277op;

        public UpdateTask() {
        }
    }

    public UpdateResourceThread(FatFsWatch fatFsWatch, String str, OnUpdateResourceCallback onUpdateResourceCallback, ThreadStateListener threadStateListener) {
        if (fatFsWatch == null) {
            throw new NullPointerException("FatFsWatch can not be null.");
        }
        this.f38254d = fatFsWatch;
        this.f38255e = fatFsWatch.getWatchSystem();
        this.f38256f = str;
        this.f38259i = onUpdateResourceCallback;
        this.f38260j = threadStateListener;
    }

    /* JADX INFO: renamed from: d */
    public final long m27716d() {
        FatFileSystem fatFileSystem = this.f38255e;
        if (fatFileSystem == null) {
            return 0L;
        }
        return ((long) fatFileSystem.getFreeSize()) * 4096;
    }

    /* JADX INFO: renamed from: e */
    public final void m27717e() {
        synchronized (this.f38251a) {
            try {
                if (!this.f38252b) {
                    this.f38252b = true;
                    this.f38251a.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f38252b = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m27718f() {
        String strObtainUpdateFilePath = WatchFileUtil.obtainUpdateFilePath(this.f38257g, OTAManager.OTA_FILE_SUFFIX);
        if (strObtainUpdateFilePath == null) {
            if (this.f38254d.isOTAResource()) {
                this.f38254d.writeResourceOTAFlag(true, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.5
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        UpdateResourceThread.this.m27705a(baseError.getSubCode(), baseError.getMessage(), false);
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(Boolean bool) {
                        UpdateResourceThread.this.m27718f();
                    }
                });
                return;
            } else {
                if (this.f38262l) {
                    this.f38254d.jumpToUpdateResource(true, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.6
                        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                        public void onFailed(BaseError baseError) {
                            UpdateResourceThread.this.m27705a(baseError.getSubCode(), baseError.getMessage(), false);
                        }

                        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                        public void onSuccess(Boolean bool) {
                            UpdateResourceThread.this.m27718f();
                        }
                    });
                    return;
                }
                WatchFileUtil.deleteFile(this.f38256f);
            }
        }
        WatchFileUtil.deleteFile(this.f38257g + "/" + WatchConstant.RES_DIR_NAME);
        m27713b(strObtainUpdateFilePath);
    }

    /* JADX INFO: renamed from: g */
    public final void m27719g() {
        synchronized (this.f38251a) {
            try {
                if (this.f38252b) {
                    this.f38251a.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m27720h() throws Throwable {
        File file = new File(this.f38258h);
        ArrayList<UpdateTask> arrayList = new ArrayList<>();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    UpdateTask updateTaskM27700a = m27700a(file2);
                    if (updateTaskM27700a != null) {
                        arrayList.add(updateTaskM27700a);
                    }
                } catch (RuntimeException e) {
                    m27706a(m27699a(e), true);
                    return;
                }
            }
        }
        ArrayList<UpdateTask> arrayListM27701a = m27701a(arrayList);
        if (!m27709a((List<UpdateTask>) arrayListM27701a)) {
            m27706a(16897, true);
            return;
        }
        synchronized (this.f38251a) {
            try {
                String str = f38250n;
                JL_Log.m27883i(str, "updateResource", "isOTAResource = " + this.f38254d.isOTAResource());
                if (!this.f38254d.isOTAResource()) {
                    this.f38254d.writeResourceOTAFlag(false, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.1
                        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                        public void onFailed(BaseError baseError) {
                            UpdateResourceThread.this.f38263m = baseError;
                            UpdateResourceThread.this.m27719g();
                        }

                        @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                        public void onSuccess(Boolean bool) {
                            UpdateResourceThread.this.m27719g();
                        }
                    });
                    m27717e();
                    if (!this.f38254d.isOTAResource()) {
                        m27705a(m27710b(), m27715c(), false);
                        return;
                    }
                }
                this.f38254d.jumpToUpdateResource(false, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.2
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        UpdateResourceThread.this.f38262l = false;
                        UpdateResourceThread.this.f38263m = baseError;
                        UpdateResourceThread.this.m27719g();
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(Boolean bool) {
                        UpdateResourceThread.this.f38262l = bool.booleanValue();
                        UpdateResourceThread.this.m27719g();
                    }
                });
                m27717e();
                if (!this.f38262l) {
                    m27705a(m27710b(), m27715c(), false);
                    return;
                }
                JL_Log.m27883i(str, "updateResource", "task size : " + arrayListM27701a.size());
                if (arrayListM27701a.isEmpty()) {
                    m27718f();
                    return;
                }
                m27714b(this.f38258h, arrayListM27701a.size());
                for (final int i = 0; i < arrayListM27701a.size(); i++) {
                    final UpdateTask updateTask = arrayListM27701a.get(i);
                    if (this.f38253c != 0) {
                        break;
                    }
                    int i2 = updateTask.f38277op;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            continue;
                        } else {
                            FatFileSystem fatFileSystem = this.f38255e;
                            if (fatFileSystem == null) {
                                this.f38253c = 22;
                                JL_Log.m27883i(f38250n, "updateResource", "replaceFatFile ---> updateResult : 2");
                                break;
                            }
                            fatFileSystem.replaceFatFile(updateTask.filePath, new OnFatFileProgressListener() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.4
                                @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
                                public void onProgress(float f) {
                                    JL_Log.m27883i(UpdateResourceThread.f38250n, "updateResource", "replaceFatFile ---> onProgress : " + f);
                                    UpdateResourceThread.this.m27712b(i, updateTask.filePath, f);
                                }

                                @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
                                public void onStart(String str2) {
                                    JL_Log.m27883i(UpdateResourceThread.f38250n, "updateResource", "replaceFatFile ---> onStart : " + str2);
                                    UpdateResourceThread.this.m27712b(i, updateTask.filePath, 0.0f);
                                }

                                @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
                                public void onStop(int i3) {
                                    JL_Log.m27880e(UpdateResourceThread.f38250n, "updateResource", "replaceFatFile ---> onStop : " + i3);
                                    UpdateResourceThread.this.f38253c = i3;
                                    if (UpdateResourceThread.this.f38253c == 0) {
                                        UpdateResourceThread.this.m27712b(i, updateTask.filePath, 100.0f);
                                    }
                                    UpdateResourceThread.this.m27719g();
                                }
                            });
                            if (this.f38253c != 0) {
                                break;
                            }
                            String str2 = f38250n;
                            JL_Log.m27880e(str2, "updateResource", "replaceFatFile ---> lock >> ");
                            m27717e();
                            JL_Log.m27880e(str2, "updateResource", "replaceFatFile ---> unlock >> ");
                        }
                    } else {
                        if (this.f38255e == null) {
                            this.f38253c = 22;
                            JL_Log.m27883i(f38250n, "updateResource", "createFatFile ---> updateResult : 2");
                            break;
                        }
                        String str3 = f38250n;
                        JL_Log.m27883i(str3, "updateResource", "createFatFile ---> filePath : " + updateTask.filePath);
                        this.f38255e.createFatFile(updateTask.filePath, true, new OnFatFileProgressListener() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.3
                            @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
                            public void onProgress(float f) {
                                JL_Log.m27883i(UpdateResourceThread.f38250n, "updateResource", "createFatFile ---> onProgress : " + f);
                                UpdateResourceThread.this.m27712b(i, updateTask.filePath, f);
                            }

                            @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
                            public void onStart(String str4) {
                                JL_Log.m27883i(UpdateResourceThread.f38250n, "updateResource", "createFatFile ---> onStart : " + str4);
                                UpdateResourceThread.this.m27712b(i, str4, 0.0f);
                            }

                            @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
                            public void onStop(int i3) {
                                JL_Log.m27880e(UpdateResourceThread.f38250n, "updateResource", "createFatFile ---> onStop : " + i3);
                                UpdateResourceThread.this.f38253c = i3;
                                if (i3 == 0) {
                                    UpdateResourceThread.this.m27712b(i, updateTask.filePath, 100.0f);
                                }
                                UpdateResourceThread.this.m27719g();
                            }
                        });
                        if (this.f38253c != 0) {
                            break;
                        }
                        JL_Log.m27887w(str3, "updateResource", "createFatFile ---> lock... >> ");
                        m27717e();
                        JL_Log.m27887w(str3, "updateResource", "createFatFile ---> unlock... >> ");
                    }
                }
                JL_Log.m27880e(f38250n, "updateResource", "end >> " + this.f38253c);
                int i3 = this.f38253c;
                if (i3 == 0) {
                    m27718f();
                } else {
                    m27706a(i3, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        ThreadStateListener threadStateListener = this.f38260j;
        if (threadStateListener != null) {
            threadStateListener.onStart(getId());
        }
        if (this.f38256f == null) {
            m27702a(5);
            return;
        }
        File file = new File(this.f38256f);
        if (!file.exists()) {
            m27702a(5);
            return;
        }
        this.f38257g = WatchFileUtil.getDirPath(this.f38256f);
        String fileName = WatchFileUtil.getFileName(this.f38256f);
        String str = f38250n;
        JL_Log.m27883i(str, str, "dirPath = " + this.f38257g + ", fileName = " + fileName);
        if (fileName.endsWith(OTAManager.OTA_ZIP_SUFFIX)) {
            try {
                ZipUtil.unZipFolder(this.f38256f, this.f38257g);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f38258h = UpdateResourceTask.findFolder(this.f38257g, WatchConstant.RES_DIR_NAME);
        } else if (file.isDirectory() && WatchConstant.RES_DIR_NAME.equalsIgnoreCase(fileName)) {
            this.f38258h = this.f38256f;
        }
        String str2 = f38250n;
        JL_Log.m27883i(str2, str2, "targetPath = " + this.f38258h);
        if (this.f38258h != null) {
            m27720h();
            return;
        }
        String strObtainUpdateFilePath = WatchFileUtil.obtainUpdateFilePath(this.f38257g, OTAManager.OTA_FILE_SUFFIX);
        JL_Log.m27883i(str2, str2, "otaFilePath = " + strObtainUpdateFilePath);
        if (strObtainUpdateFilePath == null) {
            m27702a(4);
        } else {
            m27713b(strObtainUpdateFilePath);
        }
    }

    public void stopThread() {
        this.f38253c = 28;
        m27719g();
    }

    /* JADX INFO: renamed from: b */
    public final void m27714b(final String str, final int i) {
        if (this.f38259i != null) {
            this.f38261k.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.l96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9392IO.m27708a(str, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m27715c() {
        BaseError baseError = this.f38263m;
        return baseError == null ? "" : baseError.getMessage();
    }

    /* JADX INFO: renamed from: b */
    public final void m27713b(final String str) {
        if (this.f38259i != null) {
            this.f38261k.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.n96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9893IO.m27707a(str);
                }
            });
        }
        ThreadStateListener threadStateListener = this.f38260j;
        if (threadStateListener != null) {
            threadStateListener.onFinish(getId());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27711b(final int i, final String str) {
        JL_Log.m27887w(f38250n, "notifyError", RcspUtil.formatString("code : %d(0x%X), %s.", Integer.valueOf(i), Integer.valueOf(i), str));
        WatchFileUtil.deleteFile(WatchFileUtil.obtainUpdateFilePath(this.f38257g, OTAManager.OTA_FILE_SUFFIX));
        WatchFileUtil.deleteFile(this.f38257g + File.separator + WatchConstant.RES_DIR_NAME);
        if (this.f38259i != null) {
            this.f38261k.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.m96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9655IO.m27703a(i, str);
                }
            });
        }
        ThreadStateListener threadStateListener = this.f38260j;
        if (threadStateListener != null) {
            threadStateListener.onFinish(getId());
        }
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27708a(String str, int i) {
        this.f38259i.onStart(str, i);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27707a(String str) {
        this.f38259i.onStop(str);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27703a(int i, String str) {
        this.f38259i.onError(i, str);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27704a(int i, String str, float f) {
        this.f38259i.onProgress(i, str, f);
    }

    /* JADX INFO: renamed from: a */
    public final void m27702a(int i) {
        m27706a(i, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m27706a(int i, boolean z) {
        m27705a(i, FatUtil.getFatFsErrorCodeMsg(i), z);
    }

    /* JADX INFO: renamed from: a */
    public final void m27705a(final int i, final String str, boolean z) {
        if (z && this.f38262l) {
            this.f38254d.jumpToUpdateResource(true, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceThread.7
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    UpdateResourceThread.this.m27711b(baseError.getSubCode(), baseError.getMessage());
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(Boolean bool) {
                    onFailed(new BaseError(i, str));
                }
            });
        } else {
            m27711b(i, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27712b(final int i, final String str, final float f) {
        if (this.f38259i != null) {
            this.f38261k.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.o96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10092IO.m27704a(i, str, f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m27710b() {
        BaseError baseError = this.f38263m;
        if (baseError == null) {
            return 12288;
        }
        return baseError.getSubCode();
    }

    /* JADX INFO: renamed from: a */
    public final UpdateTask m27700a(File file) throws Throwable {
        byte[] fileData = WatchFileUtil.readFileData(file.getPath());
        if (fileData == null || fileData.length < 512) {
            return null;
        }
        String fatFilePath = FatUtil.getFatFilePath(this.f38255e.getCurBrowsePath(), file.getPath());
        FatFile fatFileMsg = this.f38255e.getFatFileMsg(fatFilePath);
        if (fatFileMsg != null) {
            byte[] fileHead = this.f38255e.getFileHead(fatFilePath);
            if (fileHead != null) {
                byte[] bArr = new byte[512];
                System.arraycopy(fileData, 0, bArr, 0, 512);
                if (Arrays.equals(bArr, fileHead) && file.length() == fatFileMsg.getSize()) {
                    JL_Log.m27887w(f38250n, "convertUpdateTask", "head same, file size : " + file.length() + ", fat File size = " + fatFileMsg.getSize());
                    return null;
                }
                UpdateTask updateTask = new UpdateTask();
                updateTask.filePath = file.getPath();
                updateTask.fileSize = fileData.length;
                updateTask.f38277op = 2;
                return updateTask;
            }
            throw new RuntimeException(String.valueOf(24));
        }
        UpdateTask updateTask2 = new UpdateTask();
        updateTask2.filePath = file.getPath();
        updateTask2.fileSize = fileData.length;
        updateTask2.f38277op = 1;
        return updateTask2;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<UpdateTask> m27701a(ArrayList<UpdateTask> arrayList) {
        if (arrayList == null || arrayList.size() <= 1) {
            return arrayList;
        }
        ArrayList<UpdateTask> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        for (UpdateTask updateTask : arrayList) {
            if (updateTask.f38277op == 2) {
                arrayList2.add(updateTask);
            } else {
                arrayList3.add(updateTask);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27709a(List<UpdateTask> list) {
        if (this.f38255e == null) {
            return false;
        }
        if (list == null || list.isEmpty()) {
            return true;
        }
        long jM27716d = m27716d();
        JL_Log.m27877d(f38250n, "hasEnoughSpace", "leftSize = " + jM27716d);
        for (UpdateTask updateTask : list) {
            JL_Log.m27877d(f38250n, "hasEnoughSpace", "task = " + updateTask.filePath + ", size = " + updateTask.fileSize + ", op = " + updateTask.f38277op);
            int i = updateTask.f38277op;
            if (i == 1) {
                jM27716d -= updateTask.fileSize;
            } else if (i == 2) {
                FatFileSystem fatFileSystem = this.f38255e;
                jM27716d -= updateTask.fileSize - fatFileSystem.getFatFileMsg(FatUtil.getFatFilePath(fatFileSystem.getCurBrowsePath(), updateTask.filePath)).getSize();
            }
            if (jM27716d < 0) {
                break;
            }
        }
        boolean z = jM27716d >= 0;
        JL_Log.m27880e(f38250n, "hasEnoughSpace", z + ", leftSize = " + jM27716d);
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final int m27699a(RuntimeException runtimeException) {
        if (runtimeException == null) {
            return 12288;
        }
        try {
            if (!TextUtils.isEmpty(runtimeException.getMessage()) && TextUtils.isDigitsOnly(runtimeException.getMessage())) {
                return Integer.parseInt(runtimeException.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 12288;
    }
}
