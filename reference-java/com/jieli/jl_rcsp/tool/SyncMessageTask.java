package com.jieli.jl_rcsp.tool;

import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.interfaces.listener.ThreadStateListener;
import com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback;
import com.jieli.jl_rcsp.model.NotificationMsg;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.device.MessageInfo;
import com.jieli.jl_rcsp.task.SimpleTaskListener;
import com.jieli.jl_rcsp.task.smallfile.AddFileTask;
import com.jieli.jl_rcsp.task.smallfile.DeleteFileTask;
import com.jieli.jl_rcsp.util.CommandBuilder;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes17.dex */
public class SyncMessageTask extends Thread {

    /* JADX INFO: renamed from: i */
    public static final String f38201i = "SyncMessageTask";

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f38202a;

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<SyncTask> f38203b;

    /* JADX INFO: renamed from: c */
    public final ThreadStateListener f38204c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f38205d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f38206e;

    /* JADX INFO: renamed from: f */
    public boolean f38207f;

    /* JADX INFO: renamed from: g */
    public boolean f38208g;

    /* JADX INFO: renamed from: h */
    public final Map<String, Short> f38209h;

    public static class SyncTask {

        /* JADX INFO: renamed from: a */
        public final int f38224a;

        /* JADX INFO: renamed from: b */
        public final NotificationMsg f38225b;

        /* JADX INFO: renamed from: c */
        public final OnWatchOpCallback<Boolean> f38226c;

        public SyncTask(int i, NotificationMsg notificationMsg, OnWatchOpCallback<Boolean> onWatchOpCallback) {
            this.f38224a = i;
            this.f38225b = notificationMsg;
            this.f38226c = onWatchOpCallback;
        }

        public OnWatchOpCallback<Boolean> getCallback() {
            return this.f38226c;
        }

        public NotificationMsg getMessage() {
            return this.f38225b;
        }

        public int getTaskOp() {
            return this.f38224a;
        }

        public String toString() {
            return "SyncTask{taskOp=" + this.f38224a + ", message=" + this.f38225b + ", callback=" + this.f38226c + i0XO1.f7442IO;
        }
    }

    public SyncMessageTask(RcspOpImpl rcspOpImpl, ThreadStateListener threadStateListener) {
        super(f38201i);
        this.f38203b = new LinkedBlockingQueue<>();
        this.f38209h = new HashMap();
        if (rcspOpImpl == null) {
            throw new NullPointerException("RcspOpImpl can not be null.");
        }
        this.f38202a = rcspOpImpl;
        this.f38204c = threadStateListener;
    }

    /* JADX INFO: renamed from: b */
    public final void m27652b(final NotificationMsg notificationMsg, final OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (notificationMsg == null) {
            return;
        }
        if (this.f38202a.getDeviceInfo() == null) {
            this.f38203b.clear();
            return;
        }
        this.f38208g = true;
        final AddFileTask addFileTask = new AddFileTask(this.f38202a, new AddFileTask.Param((byte) 6, new MessageInfo(notificationMsg.getAppName(), notificationMsg.getFlag(), notificationMsg.getTitle(), notificationMsg.getContent(), notificationMsg.getTime()).beanToData()));
        addFileTask.setListener(new SimpleTaskListener() { // from class: com.jieli.jl_rcsp.tool.SyncMessageTask.4
            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onCancel(int i) {
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onFailed(new BaseError(4098, "User cancel. reason : " + i));
                }
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onError(int i, String str) {
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onFailed(new BaseError(i, str));
                }
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onFinish() {
                SyncMessageTask syncMessageTask = SyncMessageTask.this;
                syncMessageTask.m27650a(syncMessageTask.m27647a(notificationMsg.getAppName(), notificationMsg.getTime()), addFileTask.getFile().f38168id);
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onSuccess(Boolean.TRUE);
                }
            }
        });
        addFileTask.start();
        if (this.f38208g) {
            m27651b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27655c(NotificationMsg notificationMsg, final OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (this.f38202a.getDeviceInfo() == null) {
            this.f38203b.clear();
            return;
        }
        this.f38208g = true;
        RcspOpImpl rcspOpImpl = this.f38202a;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildRemoveMessageCmd(new PushInfoDataToDeviceCmd.RemoveMsg(notificationMsg.getAppName(), notificationMsg.getTime())), new BooleanRcspActionCallback("removeMessage", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.SyncMessageTask.3
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                JL_Log.m27880e(SyncMessageTask.f38201i, "removeMessage", "onFailed ---> " + baseError);
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onSuccess(Boolean.TRUE);
                }
            }
        }));
        if (this.f38208g) {
            m27651b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m27656d(NotificationMsg notificationMsg, final OnWatchOpCallback<Boolean> onWatchOpCallback) {
        if (notificationMsg == null) {
            return;
        }
        if (this.f38202a.getDeviceInfo() == null) {
            this.f38203b.clear();
            return;
        }
        final String strM27647a = m27647a(notificationMsg.getAppName(), notificationMsg.getTime());
        Short shM27646a = m27646a(strM27647a);
        JL_Log.m27877d(f38201i, "removeMessageBySFT", "key = " + strM27647a + ", id = " + shM27646a);
        if (shM27646a == null) {
            return;
        }
        this.f38208g = true;
        DeleteFileTask deleteFileTask = new DeleteFileTask(this.f38202a, new DeleteFileTask.Param((byte) 6, shM27646a.shortValue()));
        deleteFileTask.setListener(new SimpleTaskListener() { // from class: com.jieli.jl_rcsp.tool.SyncMessageTask.5
            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onCancel(int i) {
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onFailed(new BaseError(4098, "Cancel operation. reason : " + i));
                }
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onError(int i, String str) {
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onFailed(new BaseError(i, str));
                }
            }

            @Override // com.jieli.jl_rcsp.task.SimpleTaskListener, com.jieli.jl_rcsp.task.TaskListener
            public void onFinish() {
                SyncMessageTask.this.m27653b(strM27647a);
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onSuccess(Boolean.TRUE);
                }
            }
        });
        deleteFileTask.start();
        if (this.f38208g) {
            m27651b();
        }
    }

    public void exit() {
        this.f38205d = false;
        m27654c();
    }

    public boolean isRunning() {
        return this.f38205d;
    }

    public void putNotification(SyncTask syncTask) {
        if (this.f38202a.isRcspInit()) {
            try {
                this.f38203b.put(syncTask);
                if (this.f38206e) {
                    this.f38206e = false;
                    m27654c();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f38205d = true;
        ThreadStateListener threadStateListener = this.f38204c;
        if (threadStateListener != null) {
            threadStateListener.onStart(getId());
        }
        synchronized (this.f38203b) {
            while (this.f38205d) {
                try {
                    this.f38206e = this.f38203b.isEmpty();
                    if (this.f38206e) {
                        m27651b();
                    } else {
                        SyncTask syncTaskPoll = this.f38203b.poll();
                        if (!this.f38202a.isRcspInit()) {
                            this.f38203b.clear();
                            this.f38205d = false;
                            return;
                        } else if (syncTaskPoll != null) {
                            if (syncTaskPoll.getTaskOp() == 0) {
                                if (this.f38202a.getDeviceInfo().isContactsTransferBySmallFile()) {
                                    m27652b(syncTaskPoll.getMessage(), syncTaskPoll.getCallback());
                                } else {
                                    m27649a(syncTaskPoll.getMessage(), syncTaskPoll.getCallback());
                                }
                            } else if (this.f38202a.getDeviceInfo().isContactsTransferBySmallFile()) {
                                m27656d(syncTaskPoll.getMessage(), syncTaskPoll.getCallback());
                            } else {
                                m27655c(syncTaskPoll.getMessage(), syncTaskPoll.getCallback());
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f38203b.clear();
            this.f38209h.clear();
            this.f38205d = false;
            this.f38206e = false;
            this.f38208g = false;
            ThreadStateListener threadStateListener2 = this.f38204c;
            if (threadStateListener2 != null) {
                threadStateListener2.onFinish(getId());
            }
            String str = f38201i;
            JL_Log.m27887w(str, str, "thread end");
        }
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
    }

    /* JADX INFO: renamed from: a */
    public final void m27649a(NotificationMsg notificationMsg, final OnWatchOpCallback<Boolean> onWatchOpCallback) {
        byte[] bArr;
        if (notificationMsg == null) {
            return;
        }
        if (this.f38202a.getDeviceInfo() == null) {
            this.f38203b.clear();
            return;
        }
        JL_Log.m27883i(f38201i, "pushMessageInfo", "" + notificationMsg);
        byte[] bArrBeanToData = new MessageInfo(notificationMsg.getAppName(), notificationMsg.getFlag(), notificationMsg.getTitle(), notificationMsg.getContent(), notificationMsg.getTime()).beanToData();
        if (bArrBeanToData.length > 240) {
            int length = bArrBeanToData.length / 240;
            if (bArrBeanToData.length % 240 != 0) {
                length++;
            }
            int length2 = 0;
            for (final int i = length - 1; i >= 0; i--) {
                int length3 = bArrBeanToData.length - length2;
                if (length3 <= 0) {
                    return;
                }
                if (length3 > 240) {
                    bArr = new byte[240];
                } else {
                    bArr = new byte[length3];
                }
                System.arraycopy(bArrBeanToData, length2, bArr, 0, bArr.length);
                length2 += bArr.length;
                m27648a(i, bArr, new OnWatchOpCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.SyncMessageTask.1
                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onFailed(BaseError baseError) {
                        OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                        if (onWatchOpCallback2 != null) {
                            onWatchOpCallback2.onFailed(baseError);
                        }
                    }

                    @Override // com.jieli.jl_rcsp.interfaces.watch.OnWatchOpCallback
                    public void onSuccess(Boolean bool) {
                        OnWatchOpCallback onWatchOpCallback2;
                        if (i != 0 || (onWatchOpCallback2 = onWatchOpCallback) == null) {
                            return;
                        }
                        onWatchOpCallback2.onSuccess(Boolean.TRUE);
                    }
                });
            }
            return;
        }
        m27648a(0, bArrBeanToData, onWatchOpCallback);
    }

    /* JADX INFO: renamed from: c */
    public final void m27654c() {
        synchronized (this.f38203b) {
            try {
                if (this.f38207f) {
                    this.f38203b.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27651b() {
        synchronized (this.f38203b) {
            try {
                if (!this.f38207f) {
                    this.f38207f = true;
                    this.f38203b.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f38207f = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27653b(String str) {
        if (str != null) {
            this.f38209h.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27648a(int i, byte[] bArr, final OnWatchOpCallback<Boolean> onWatchOpCallback) {
        PushInfoDataToDeviceCmd.MessageData messageData = new PushInfoDataToDeviceCmd.MessageData(i, bArr);
        this.f38208g = true;
        RcspOpImpl rcspOpImpl = this.f38202a;
        rcspOpImpl.sendRcspCommand(rcspOpImpl.getTargetDevice(), CommandBuilder.buildPushMessageInfoCmd(messageData), new BooleanRcspActionCallback("pushMessageInfo", new OnOperationCallback<Boolean>() { // from class: com.jieli.jl_rcsp.tool.SyncMessageTask.2
            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onFailed(BaseError baseError) {
                JL_Log.m27880e(SyncMessageTask.f38201i, "pushMessageInfo", "onFailed ---> " + baseError);
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onFailed(baseError);
                }
            }

            @Override // com.jieli.jl_rcsp.interfaces.OnOperationCallback
            public void onSuccess(Boolean bool) {
                JL_Log.m27877d(SyncMessageTask.f38201i, "pushMessageInfo", "" + bool);
                SyncMessageTask.this.f38208g = false;
                SyncMessageTask.this.m27654c();
                OnWatchOpCallback onWatchOpCallback2 = onWatchOpCallback;
                if (onWatchOpCallback2 != null) {
                    onWatchOpCallback2.onSuccess(Boolean.TRUE);
                }
            }
        }));
        if (this.f38208g) {
            m27651b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m27647a(String str, long j) {
        return str + IiXI1X1OO.O00 + j;
    }

    /* JADX INFO: renamed from: a */
    public final void m27650a(String str, short s) {
        if (str != null) {
            this.f38209h.put(str, Short.valueOf(s));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Short m27646a(String str) {
        if (str == null) {
            return null;
        }
        return this.f38209h.get(str);
    }
}
