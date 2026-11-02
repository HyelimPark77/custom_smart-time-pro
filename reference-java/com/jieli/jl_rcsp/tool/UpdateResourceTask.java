package com.jieli.jl_rcsp.tool;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener;
import com.jieli.jl_fatfs.model.FatFile;
import com.jieli.jl_fatfs.utils.FatUtil;
import com.jieli.jl_fatfs.utils.ZipUtil;
import com.jieli.jl_rcsp.constant.WatchConstant;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.OnUpdateResourceCallback;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.WatchFileContent;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.util.CryptoUtil;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.jieli.jl_rcsp.watch.rcsp.RcspWatch;
import com.jieli.watchtesttool.tool.upgrade.OTAManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateResourceTask extends Thread {

    /* JADX INFO: renamed from: n */
    public static final String f38227n = "UpdateResourceTask";

    /* JADX INFO: renamed from: a */
    public final RcspWatch f38228a;

    /* JADX INFO: renamed from: b */
    public final String f38229b;

    /* JADX INFO: renamed from: c */
    public final OnUpdateResourceCallback f38230c;

    /* JADX INFO: renamed from: d */
    public final ThreadStateListener f38231d;

    /* JADX INFO: renamed from: f */
    public boolean f38233f;

    /* JADX INFO: renamed from: h */
    public String f38235h;

    /* JADX INFO: renamed from: i */
    public String f38236i;

    /* JADX INFO: renamed from: j */
    public int f38237j;

    /* JADX INFO: renamed from: k */
    public WatchFileContent f38238k;

    /* JADX INFO: renamed from: m */
    public BaseError f38240m;

    /* JADX INFO: renamed from: e */
    public final Object f38232e = new Object();

    /* JADX INFO: renamed from: g */
    public final Handler f38234g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public long f38239l = 0;

    public class MyProgressListener implements OnFatFileProgressListener {

        /* JADX INFO: renamed from: a */
        public final String f38247a;
        public String funcName;
        public int index;
        public String taskPath;

        public MyProgressListener() {
            this.f38247a = MyProgressListener.class.getSimpleName();
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onProgress(float f) {
            JL_Log.m27877d(UpdateResourceTask.f38227n, this.f38247a, RcspUtil.formatString("(%s) onProgress ---> %.1f.", this.funcName, Float.valueOf(f)));
            UpdateResourceTask.this.m27680b(this.index, this.taskPath, f);
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStart(String str) {
            JL_Log.m27877d(UpdateResourceTask.f38227n, this.f38247a, RcspUtil.formatString("(%s) onStart ---> %s.", this.funcName, str));
            UpdateResourceTask.this.m27680b(this.index, this.taskPath, 0.0f);
        }

        @Override // com.jieli.jl_fatfs.interfaces.OnFatFileProgressListener
        public void onStop(int i) {
            JL_Log.m27880e(UpdateResourceTask.f38227n, this.f38247a, RcspUtil.formatString("(%s) onStop ---> %d.", this.funcName, Integer.valueOf(i)));
            UpdateResourceTask.this.f38237j = i;
            if (UpdateResourceTask.this.f38237j == 0) {
                UpdateResourceTask.this.m27680b(this.index, this.taskPath, 100.0f);
            }
            UpdateResourceTask.this.m27687f();
        }
    }

    public static class Task {
        public static final int OP_CREATE_FILE = 1;
        public static final int OP_REPLACE_FILE = 2;
        public String filePath;
        public long needSize;

        /* JADX INFO: renamed from: op */
        public int f38249op;

        public Task() {
        }
    }

    public UpdateResourceTask(RcspWatch rcspWatch, String str, OnUpdateResourceCallback onUpdateResourceCallback, ThreadStateListener threadStateListener) {
        if (rcspWatch == null) {
            throw new NullPointerException("RcspWatch can not be null.");
        }
        this.f38228a = rcspWatch;
        this.f38229b = str;
        this.f38230c = onUpdateResourceCallback;
        this.f38231d = threadStateListener;
    }

    public static String findFolder(String str, String str2) {
        File[] fileArrListFiles;
        if (str != null && str2 != null) {
            File file = new File(str);
            if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
                return null;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory() && str2.equalsIgnoreCase(file2.getName())) {
                    return file2.getPath();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m27686e() {
        final String strObtainUpdateFilePath = WatchFileUtil.obtainUpdateFilePath(this.f38235h, OTAManager.OTA_FILE_SUFFIX);
        if (strObtainUpdateFilePath == null) {
            if (this.f38228a.isOTAResource()) {
                this.f38228a.writeResourceOTAFlag(true, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceTask.4
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        UpdateResourceTask.this.m27671a(baseError.getSubCode());
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(Boolean bool) {
                        UpdateResourceTask.this.m27686e();
                    }
                });
                return;
            }
            WatchFileUtil.deleteFile(this.f38229b);
        }
        WatchFileUtil.deleteFile(this.f38235h + File.separator + WatchConstant.RES_DIR_NAME);
        this.f38228a.reLoadFolder(new OnWatchOpCallback<ArrayList<FatFile>>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceTask.5
            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onFailed(BaseError baseError) {
                UpdateResourceTask.this.m27671a(baseError.getSubCode());
            }

            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onSuccess(ArrayList<FatFile> arrayList) {
                UpdateResourceTask.this.m27681b(strObtainUpdateFilePath);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m27687f() {
        synchronized (this.f38232e) {
            try {
                if (this.f38233f) {
                    this.f38232e.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m27688g() throws Throwable {
        File file = new File(this.f38236i);
        ArrayList<Task> arrayList = new ArrayList<>();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    Task taskM27670a = m27670a(file2);
                    if (taskM27670a != null) {
                        arrayList.add(taskM27670a);
                    }
                } catch (RuntimeException e) {
                    m27671a(m27669a(e));
                    return;
                }
            }
        }
        String str = f38227n;
        JL_Log.m27883i(str, "updateResource", "taskList = " + arrayList.size());
        ArrayList<Task> arrayListM27678b = m27678b(arrayList);
        try {
            if (!m27676a(arrayListM27678b)) {
                m27671a(16897);
                return;
            }
            if (!this.f38228a.isOTAResource()) {
                this.f38228a.writeResourceOTAFlag(false, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceTask.1
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        UpdateResourceTask.this.f38240m = baseError;
                        UpdateResourceTask.this.m27687f();
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(Boolean bool) {
                        UpdateResourceTask.this.m27687f();
                    }
                });
                m27685d();
                if (!this.f38228a.isOTAResource()) {
                    m27684c(m27677b(), m27683c());
                    return;
                }
            }
            JL_Log.m27883i(str, "updateResource", "size : " + arrayListM27678b.size());
            if (arrayListM27678b.isEmpty()) {
                m27686e();
                return;
            }
            m27682b(this.f38236i, arrayListM27678b.size());
            for (int i = 0; i < arrayListM27678b.size(); i++) {
                Task task = arrayListM27678b.get(i);
                if (this.f38237j != 0) {
                    break;
                }
                JL_Log.m27883i(f38227n, "updateResource", "task >> op = " + task.f38249op + ", filePath = " + task.filePath);
                if (task.f38249op == 2) {
                    MyProgressListener myProgressListener = new MyProgressListener();
                    myProgressListener.index = i;
                    String str2 = task.filePath;
                    myProgressListener.taskPath = str2;
                    myProgressListener.funcName = "replaceWatchFile";
                    this.f38228a.replaceWatchFile(str2, myProgressListener);
                    if (this.f38237j != 0) {
                        break;
                    }
                    m27685d();
                } else {
                    MyProgressListener myProgressListener2 = new MyProgressListener();
                    myProgressListener2.index = i;
                    String str3 = task.filePath;
                    myProgressListener2.taskPath = str3;
                    myProgressListener2.funcName = "createWatchFile";
                    this.f38228a.createWatchFile(str3, true, myProgressListener2);
                    if (this.f38237j != 0) {
                        break;
                    }
                    m27685d();
                }
            }
            JL_Log.m27880e(f38227n, "updateResource", "end ---> " + this.f38237j);
            int i2 = this.f38237j;
            if (i2 == 0) {
                m27686e();
            } else {
                m27671a(i2);
            }
        } catch (RuntimeException e2) {
            m27671a(m27669a(e2));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        ThreadStateListener threadStateListener = this.f38231d;
        if (threadStateListener != null) {
            threadStateListener.onStart(getId());
        }
        if (this.f38229b == null) {
            m27671a(5);
            return;
        }
        File file = new File(this.f38229b);
        if (!file.exists()) {
            m27671a(5);
            return;
        }
        this.f38235h = WatchFileUtil.getDirPath(this.f38229b);
        String fileName = WatchFileUtil.getFileName(this.f38229b);
        String str = f38227n;
        JL_Log.m27883i(str, str, "dirPath = " + this.f38235h + ", fileName = " + fileName);
        if (fileName.endsWith(OTAManager.OTA_ZIP_SUFFIX)) {
            try {
                ZipUtil.unZipFolder(this.f38229b, this.f38235h);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f38236i = findFolder(this.f38235h, WatchConstant.RES_DIR_NAME);
        } else if (file.isDirectory() && WatchConstant.RES_DIR_NAME.equalsIgnoreCase(fileName)) {
            this.f38236i = this.f38229b;
        }
        String str2 = f38227n;
        JL_Log.m27883i(str2, str2, "targetPath = " + this.f38236i);
        if (this.f38236i != null) {
            m27688g();
            return;
        }
        String strObtainUpdateFilePath = WatchFileUtil.obtainUpdateFilePath(this.f38235h, OTAManager.OTA_FILE_SUFFIX);
        JL_Log.m27883i(str2, str2, "otaFilePath = " + strObtainUpdateFilePath);
        if (strObtainUpdateFilePath == null) {
            m27671a(4);
        } else {
            m27681b(strObtainUpdateFilePath);
        }
    }

    public void stopThread() {
        this.f38237j = 4098;
        m27687f();
    }

    /* JADX INFO: renamed from: c */
    public final String m27683c() {
        BaseError baseError = this.f38240m;
        return baseError == null ? "" : baseError.getMessage();
    }

    /* JADX INFO: renamed from: d */
    public final void m27685d() {
        synchronized (this.f38232e) {
            try {
                if (!this.f38233f) {
                    this.f38233f = true;
                    this.f38232e.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f38233f = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<Task> m27678b(ArrayList<Task> arrayList) {
        if (arrayList == null || arrayList.size() <= 1) {
            return arrayList;
        }
        ArrayList<Task> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        for (Task task : arrayList) {
            if (task.f38249op == 2) {
                arrayList2.add(task);
            } else {
                arrayList3.add(task);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public final void m27684c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = FatUtil.getFatFsErrorCodeMsg(i);
        }
        m27679b(i, str);
    }

    /* JADX INFO: renamed from: a */
    public final Task m27670a(File file) throws Throwable {
        byte[] fileData = WatchFileUtil.readFileData(file.getPath());
        if (fileData != null && fileData.length >= 512) {
            FatFile watchFileByPath = this.f38228a.getWatchFileByPath(file.getPath());
            if (watchFileByPath == null) {
                Task task = new Task();
                task.filePath = file.getPath();
                task.needSize = file.length();
                task.f38249op = 1;
                return task;
            }
            this.f38238k = null;
            String str = f38227n;
            JL_Log.m27877d(str, "convertTask", "file path : " + watchFileByPath.getPath());
            this.f38228a.getWatchFileSize(watchFileByPath.getPath(), new OnWatchOpCallback<WatchFileContent>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceTask.2
                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onFailed(BaseError baseError) {
                    JL_Log.m27880e(UpdateResourceTask.f38227n, "convertTask", "onFailed ---> " + baseError);
                    UpdateResourceTask.this.f38240m = baseError;
                    UpdateResourceTask.this.m27687f();
                }

                @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                public void onSuccess(WatchFileContent watchFileContent) {
                    UpdateResourceTask.this.f38238k = watchFileContent;
                    JL_Log.m27877d(UpdateResourceTask.f38227n, "convertTask", "onSuccess ---> " + watchFileContent);
                    UpdateResourceTask.this.m27687f();
                }
            });
            m27685d();
            WatchFileContent watchFileContent = this.f38238k;
            if (watchFileContent != null) {
                short crc = watchFileContent.getCrc();
                long fileSize = this.f38238k.getFileSize();
                short sCRC16 = CryptoUtil.CRC16(fileData, (short) 0);
                JL_Log.m27883i(str, "convertTask", RcspUtil.formatString("SDK calc file crc : %d(0x%X), Device returned file crc : %d(0x%X).", Short.valueOf(sCRC16), Short.valueOf(sCRC16), Short.valueOf(crc), Short.valueOf(crc)));
                if (sCRC16 == crc) {
                    return null;
                }
                Task task2 = new Task();
                task2.filePath = file.getPath();
                task2.needSize = file.length() - fileSize;
                task2.f38249op = 2;
                return task2;
            }
            throw new RuntimeException(String.valueOf(m27677b()));
        }
        JL_Log.m27880e(f38227n, "convertTask", "Invalid File.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m27677b() {
        BaseError baseError = this.f38240m;
        if (baseError == null) {
            return 12288;
        }
        return baseError.getSubCode();
    }

    /* JADX INFO: renamed from: b */
    public final void m27682b(final String str, final int i) {
        if (this.f38230c != null) {
            this.f38234g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.j96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8921IO.m27675a(str, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27681b(final String str) {
        if (this.f38230c != null) {
            this.f38234g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.i96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7777IO.m27674a(str);
                }
            });
        }
        ThreadStateListener threadStateListener = this.f38231d;
        if (threadStateListener != null) {
            threadStateListener.onFinish(getId());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27679b(final int i, final String str) {
        JL_Log.m27887w(f38227n, "notifyError", RcspUtil.formatString("code : %d(0x%X), %s.", Integer.valueOf(i), Integer.valueOf(i), str));
        WatchFileUtil.deleteFile(WatchFileUtil.obtainUpdateFilePath(this.f38235h, OTAManager.OTA_FILE_SUFFIX));
        WatchFileUtil.deleteFile(this.f38235h + File.separator + WatchConstant.RES_DIR_NAME);
        if (this.f38230c != null) {
            this.f38234g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.h96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7068IO.m27672a(i, str);
                }
            });
        }
        ThreadStateListener threadStateListener = this.f38231d;
        if (threadStateListener != null) {
            threadStateListener.onFinish(getId());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27680b(final int i, final String str, final float f) {
        if (this.f38230c != null) {
            this.f38234g.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.k96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9129IO.m27673a(i, str, f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27676a(ArrayList<Task> arrayList) throws RuntimeException {
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        this.f38239l = -1L;
        JL_Log.m27877d(f38227n, "hasEnoughSpace", "task size : " + arrayList.size());
        this.f38228a.getWatchSysLeftSize(new OnWatchOpCallback<Long>() { // from class: com.jieli.jl_rcsp.tool.UpdateResourceTask.3
            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onFailed(BaseError baseError) {
                JL_Log.m27880e(UpdateResourceTask.f38227n, "hasEnoughSpace", "onFailed ---> " + baseError);
                UpdateResourceTask.this.f38240m = baseError;
                UpdateResourceTask.this.m27687f();
            }

            @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
            public void onSuccess(Long l) {
                UpdateResourceTask.this.f38239l = l.longValue();
                JL_Log.m27877d(UpdateResourceTask.f38227n, "hasEnoughSpace", "onSuccess ---> " + UpdateResourceTask.this.f38239l);
                UpdateResourceTask.this.m27687f();
            }
        });
        m27685d();
        long j = this.f38239l;
        if (j != -1) {
            Iterator<Task> it = arrayList.iterator();
            while (it.hasNext()) {
                j -= it.next().needSize;
            }
            boolean z = j >= 0;
            JL_Log.m27880e(f38227n, "hasEnoughSpace", "enough space : " + z + ", leftSize = " + j);
            return z;
        }
        throw new RuntimeException(String.valueOf(m27677b()));
    }

    /* JADX INFO: renamed from: a */
    public final int m27669a(RuntimeException runtimeException) {
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

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27675a(String str, int i) {
        this.f38230c.onStart(str, i);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27674a(String str) {
        this.f38230c.onStop(str);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27672a(int i, String str) {
        this.f38230c.onError(i, str);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m27673a(int i, String str, float f) {
        this.f38230c.onProgress(i, str, f);
    }

    /* JADX INFO: renamed from: a */
    public final void m27671a(int i) {
        m27684c(i, FatUtil.getFatFsErrorCodeMsg(i));
    }
}
