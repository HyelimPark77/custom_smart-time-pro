package com.sma.smartv3.p610ui.device.fragment;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.ironsource.C12181V2;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_filebrowse.interfaces.SimpleFileObserver;
import com.sma.smartv3.initializer.BleInitializer;
import com.sma.smartv3.p610ui.device.fragment.BaseJLFileManageFragment;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
public class BaseJLFileManageFragment extends BaseDSLRecyclerFragment {
    private boolean isNeedToDownloadFile;
    private boolean isSync;

    @tb1
    private go0 mDeleteTipPopup;

    @tb1
    private go0 mErrorPopup;

    @tb1
    private Handler mHandler111;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private c72 mProgressPop;

    @tb1
    private SDCardBean mSDCardBean;
    private int onFileReceiverSize;
    private int progress1111;
    private int retryFrequency;

    @aa1
    private final List<FileStruct> mFiles = new ArrayList();

    @aa1
    private final String TAG = "BaseJLFileManageActivity";
    private final int loadTimeOut = 255;

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.android.mltcode.paycertificationapi.OOX1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return BaseJLFileManageFragment.mHandler$lambda$0(this.f3317IO, message);
        }
    });

    @aa1
    private final Lazy mDeviceFileCallback$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1iiOOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseJLFileManageFragment.mDeviceFileCallback_delegate$lambda$0(this.f4400IO);
        }
    });

    @aa1
    private final XO0O10 mFileObserver = new XO0O10();

    @aa1
    private Runnable myTask = new O00();

    public static final class O00 implements Runnable {
        public O00() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler;
            BaseJLFileManageFragment.this.setProgress1111(BaseJLFileManageFragment.this.getProgress1111() + 1);
            BaseJLFileManageFragment.this.taskProgress();
            if (BaseJLFileManageFragment.this.getProgress1111() > 100 || (handler = BaseJLFileManageFragment.this.mHandler111) == null) {
                return;
            }
            handler.postDelayed(this, 40L);
        }
    }

    public static final class OXO1 extends SimpleFileObserver {
        public final /* synthetic */ SDCardBean XIi00iiXO;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ String f54566iO;

        public OXO1(SDCardBean sDCardBean, String str) {
            this.XIi00iiXO = sDCardBean;
            this.f54566iO = str;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int i) {
            super.onFileReadFailed(i);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean z) {
            super.onFileReadStop(z);
            FileBrowseManager.getInstance().removeFileObserver(this);
            BaseJLFileManageFragment.this.browToDir(this.XIi00iiXO, this.f54566iO);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<? extends SDCardBean> onLineCards) {
            Intrinsics.X0O(onLineCards, "onLineCards");
            super.onSdCardStatusChange(onLineCards);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }
    }

    public static final class XIi00iiXO implements DeleteCallback {
        public final /* synthetic */ int XIi00iiXO;

        public XIi00iiXO(int i) {
            this.XIi00iiXO = i;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onError(int i, FileStruct file) {
            Intrinsics.X0O(file, "file");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onDeviceFileDeleteError " + i + ", " + file);
            BaseJLFileManageFragment.this.dismissLoadPopup();
            ToastUtils.showLong(i + HelpFormatter.DEFAULT_OPT_PREFIX + file.getName() + BaseJLFileManageFragment.this.getString(R.string.failed_to_delete), new Object[0]);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onFinish() {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onDeviceFileDeleteFinish");
            BaseJLFileManageFragment.this.getMFiles().remove(this.XIi00iiXO);
            BaseJLFileManageFragment.this.showList();
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onSuccess(FileStruct p0) {
            Intrinsics.X0O(p0, "p0");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onDeviceFileDelete " + p0);
        }
    }

    @SourceDebugExtension({"SMAP\nBaseJLFileManageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseJLFileManageFragment.kt\ncom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$mFileObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,548:1\n1#2:549\n*E\n"})
    public static final class XO0O10 implements FileObserver {
        public XO0O10() {
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean z) {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> OnFlayCallback " + z);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int i) {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onFileReadFailed " + i);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onFileReadStart");
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean z) {
            Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(BaseJLFileManageFragment.this.getMSDCardBean());
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onFileReadStop " + z + " " + currentReadFile.getName());
            if (!z) {
                BaseJLFileManageFragment baseJLFileManageFragment = BaseJLFileManageFragment.this;
                baseJLFileManageFragment.loadMore(baseJLFileManageFragment.getMSDCardBean());
            } else if (oe5.OX0X1O10X(currentReadFile.getName(), "music", true)) {
                BaseJLFileManageFragment.this.showList();
            }
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> fileStructs) {
            Intrinsics.X0O(fileStructs, "fileStructs");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onFileReceiver size:" + fileStructs.size() + ", " + fileStructs);
            BaseJLFileManageFragment.this.getMFiles().addAll(fileStructs);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> list) {
            Intrinsics.X0O(list, "list");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.this.TAG + " -> onSdCardStatusChange " + list);
            BaseJLFileManageFragment baseJLFileManageFragment = BaseJLFileManageFragment.this;
            for (Object obj : list) {
                if (((SDCardBean) obj).isOnline()) {
                    baseJLFileManageFragment.setMSDCardBean((SDCardBean) obj);
                    BaseJLFileManageFragment baseJLFileManageFragment2 = BaseJLFileManageFragment.this;
                    baseJLFileManageFragment2.getCurrentInfo(baseJLFileManageFragment2.getMSDCardBean());
                }
            }
            obj = null;
            baseJLFileManageFragment.setMSDCardBean((SDCardBean) obj);
            BaseJLFileManageFragment baseJLFileManageFragment3 = BaseJLFileManageFragment.this;
            baseJLFileManageFragment3.getCurrentInfo(baseJLFileManageFragment3.getMSDCardBean());
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.fragment.BaseJLFileManageFragment$iO */
    public static final class C18813iO implements com.sma.smartv3.ui.device.XIi00iiXO.OXO1 {
        public C18813iO() {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0IIOi(int i, int i2) {
            BaseJLFileManageFragment.this.refreshTaskPanel(i, i2);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0iXXO(int i) {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void IiI10X(int i) {
            BaseJLFileManageFragment.this.refreshTaskPanel(i, 0);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void OIi0(int i, boolean z) {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XIi00iiXO(int i) {
            super.XIi00iiXO(i);
            if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
                BaseJLFileManageFragment.this.dismissLoadPopup();
            }
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XO0O10(int i, int i2, String msg) {
            Intrinsics.X0O(msg, "msg");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit add$lambda$0(BaseJLFileManageFragment baseJLFileManageFragment) {
        baseJLFileManageFragment.getFile();
        return Unit.OXO1;
    }

    private final void append(SDCardBean sDCardBean, FileStruct fileStruct) {
        int iAppenBrowse = FileBrowseManager.getInstance().appenBrowse(fileStruct, sDCardBean);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> appendToDir " + iAppenBrowse);
        if (iAppenBrowse != 0) {
            return;
        }
        this.mFiles.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void browToDir(SDCardBean sDCardBean, String str) {
        Object next;
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
        if (currentReadFile == null) {
            return;
        }
        while (currentReadFile.getParent() != null) {
            FileBrowseManager.getInstance().backBrowse(sDCardBean, false);
            currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
            Intrinsics.O10IXXX0X(currentReadFile, "getCurrentReadFile(...)");
        }
        List<FileStruct> childFileStructs = currentReadFile.getChildFileStructs();
        Intrinsics.O10IXXX0X(childFileStructs, "getChildFileStructs(...)");
        Iterator<T> it = childFileStructs.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FileStruct fileStruct = (FileStruct) next;
            if (!fileStruct.isFile() && oe5.OX0X1O10X(fileStruct.getName(), str, true)) {
                break;
            }
        }
        FileStruct fileStruct2 = (FileStruct) next;
        if (fileStruct2 != null) {
            append(sDCardBean, fileStruct2);
            return;
        }
        if (currentReadFile.isLoadFinished(false)) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> browseToDir add simpleFileObserver");
        OXO1 oxo1 = new OXO1(sDCardBean, str);
        FileBrowseManager.getInstance().addFileObserver(oxo1);
        FileBrowseManager.getInstance().setPageSize(30);
        if (FileBrowseManager.getInstance().loadMore(sDCardBean) != 0) {
            FileBrowseManager.getInstance().removeFileObserver(oxo1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissLoadPopup() {
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getCurrentInfo(SDCardBean sDCardBean) {
        Folder currentReadFile = FileBrowseManager.getInstance().getCurrentReadFile(sDCardBean);
        if (currentReadFile == null) {
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> getCurrentInfo folder " + currentReadFile.getName());
        if (!oe5.OX0X1O10X(currentReadFile.getName(), "music", true) || currentReadFile.getLevel() != 1) {
            browToDir(sDCardBean, "music");
        } else if (currentReadFile.isLoadFinished(false) || currentReadFile.getChildFileStructs().size() >= 1) {
            currentReadFile.isLoadFinished(false);
        } else {
            loadMore(sDCardBean);
        }
    }

    private final C18813iO getMDeviceFileCallback() {
        return (C18813iO) this.mDeviceFileCallback$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMore(SDCardBean sDCardBean) {
        int iLoadMore = FileBrowseManager.getInstance().loadMore(sDCardBean);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> loadMoreFile " + iLoadMore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18813iO mDeviceFileCallback_delegate$lambda$0(BaseJLFileManageFragment baseJLFileManageFragment) {
        return baseJLFileManageFragment.new C18813iO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mHandler$lambda$0(BaseJLFileManageFragment baseJLFileManageFragment, Message it) {
        Intrinsics.X0O(it, "it");
        if (it.what != baseJLFileManageFragment.loadTimeOut) {
            return false;
        }
        baseJLFileManageFragment.dismissLoadPopup();
        if (!com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
            baseJLFileManageFragment.showErrorPop();
        }
        i1O0OXO1O.OXO1.OXO1(baseJLFileManageFragment.TAG + " loadTimeOut retryFrequency=" + baseJLFileManageFragment.retryFrequency);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshTaskPanel(int i, int i2) {
    }

    public static /* synthetic */ void showDeleteTipPopup$default(BaseJLFileManageFragment baseJLFileManageFragment, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDeleteTipPopup");
        }
        if ((i4 & 1) != 0) {
            i = R.string.tip;
        }
        if ((i4 & 2) != 0) {
            i2 = R.string.clear_ai_chat_list;
        }
        if ((i4 & 4) != 0) {
            i3 = R.string.confirm;
        }
        baseJLFileManageFragment.showDeleteTipPopup(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$1(BaseJLFileManageFragment baseJLFileManageFragment) {
        baseJLFileManageFragment.confirmDeleteFile();
        return true;
    }

    private final void showErrorPop() {
        go0 go0Var;
        if (this.mErrorPopup == null) {
            final go0 go0Var2 = new go0(getMActivity(), 0, 2, null);
            go0Var2.O1O(R.string.bt3_connect_error);
            go0Var2.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.IOII1i0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseJLFileManageFragment.showErrorPop$lambda$0$0());
                }
            });
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.O0I11X
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseJLFileManageFragment.showErrorPop$lambda$0$1(this.f2440IO, go0Var2));
                }
            });
            this.mErrorPopup = go0Var2;
        }
        go0 go0Var3 = this.mErrorPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mErrorPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showErrorPop$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showErrorPop$lambda$0$1(BaseJLFileManageFragment baseJLFileManageFragment, go0 go0Var) {
        showLoadPopup$default(baseJLFileManageFragment, false, 1, null);
        int i = baseJLFileManageFragment.retryFrequency + 1;
        baseJLFileManageFragment.retryFrequency = i;
        if (i > 2) {
            baseJLFileManageFragment.retryFrequency = 0;
            FileBrowseManager.getInstance().removeFileObserver(baseJLFileManageFragment.mFileObserver);
            com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
            xIi00iiXO.XiOIO();
            Application application = go0Var.XO0O10().getApplication();
            Intrinsics.O10IXXX0X(application, "getApplication(...)");
            xIi00iiXO.m38420OX(application);
            FileBrowseManager.getInstance().addFileObserver(baseJLFileManageFragment.mFileObserver);
        }
        com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.X0O();
        return true;
    }

    public static /* synthetic */ void showLoadPopup$default(BaseJLFileManageFragment baseJLFileManageFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadPopup");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        baseJLFileManageFragment.showLoadPopup(z);
    }

    public static /* synthetic */ void syncFailed$default(BaseJLFileManageFragment baseJLFileManageFragment, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncFailed");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        baseJLFileManageFragment.syncFailed(i);
    }

    public static /* synthetic */ void syncProgress$default(BaseJLFileManageFragment baseJLFileManageFragment, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncProgress");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 100.0f;
        }
        baseJLFileManageFragment.syncProgress(f, f2);
    }

    public final void add() {
        if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.m38419I1()) {
            doTransfer(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIi1i1XI1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return BaseJLFileManageFragment.add$lambda$0(this.f4612IO);
                }
            });
        } else {
            showErrorPop();
        }
    }

    public void confirmDeleteFile() {
    }

    public final void deleteFile(int i) {
        FileBrowseManager fileBrowseManager = FileBrowseManager.getInstance();
        SDCardBean sDCardBean = this.mSDCardBean;
        List<FileStruct> listIi1iii0 = CollectionsKt__CollectionsKt.Ii1iii0(this.mFiles.get(i));
        SDCardBean sDCardBean2 = this.mSDCardBean;
        Integer numValueOf = sDCardBean2 != null ? Integer.valueOf(sDCardBean2.getType()) : null;
        Intrinsics.XXI(numValueOf);
        fileBrowseManager.deleteFile(sDCardBean, listIi1iii0, numValueOf.intValue() > 1, new XIi00iiXO(i));
    }

    public final boolean doTransfer(@aa1 Function0<Unit> action) {
        Intrinsics.X0O(action, "action");
        if (com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1.X01IiOiIi()) {
            ToastUtils.showLong(getString(R.string.transfering), new Object[0]);
            return false;
        }
        action.invoke2();
        return true;
    }

    public void getFile() {
    }

    @aa1
    public final List<FileStruct> getMFiles() {
        return this.mFiles;
    }

    @tb1
    public final c72 getMProgressPop() {
        return this.mProgressPop;
    }

    @tb1
    public final SDCardBean getMSDCardBean() {
        return this.mSDCardBean;
    }

    @aa1
    public final Runnable getMyTask() {
        return this.myTask;
    }

    public final int getOnFileReceiverSize() {
        return this.onFileReceiverSize;
    }

    public final int getProgress1111() {
        return this.progress1111;
    }

    public final int getRetryFrequency() {
        return this.retryFrequency;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public final boolean isNeedToDownloadFile() {
        return this.isNeedToDownloadFile;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public int layoutId() {
        return R.layout.activity_app_store;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mHandler.removeCallbacksAndMessages(null);
        FileBrowseManager.getInstance().removeFileObserver(this.mFileObserver);
        com.sma.smartv3.p610ui.device.XIi00iiXO xIi00iiXO = com.sma.smartv3.p610ui.device.XIi00iiXO.OXO1;
        xIi00iiXO.iOO1ii1(getMDeviceFileCallback());
        xIi00iiXO.XiOIO();
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMProgressPop(@tb1 c72 c72Var) {
        this.mProgressPop = c72Var;
    }

    public final void setMSDCardBean(@tb1 SDCardBean sDCardBean) {
        this.mSDCardBean = sDCardBean;
    }

    public final void setMyTask(@aa1 Runnable runnable) {
        Intrinsics.X0O(runnable, "<set-?>");
        this.myTask = runnable;
    }

    public final void setNeedToDownloadFile(boolean z) {
        this.isNeedToDownloadFile = z;
    }

    public final void setOnFileReceiverSize(int i) {
        this.onFileReceiverSize = i;
    }

    public final void setProgress1111(int i) {
        this.progress1111 = i;
    }

    public final void setRetryFrequency(int i) {
        this.retryFrequency = i;
    }

    public final void setSync(boolean z) {
        this.isSync = z;
    }

    public final void showDeleteTipPopup(int i, int i2, int i3) {
        if (this.mDeleteTipPopup == null) {
            go0 go0Var = new go0(getMActivity(), 0, 2, null);
            go0Var.O1O(i);
            go0Var.m1865iX(Integer.valueOf(i2));
            go0Var.IXXOO(1);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.OX00XI
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseJLFileManageFragment.showDeleteTipPopup$lambda$0$0());
                }
            });
            go0Var.X1IX(i3, new Function0() { // from class: com.android.mltcode.paycertificationapi.XXiIO0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseJLFileManageFragment.showDeleteTipPopup$lambda$0$1(this.f5157IO));
                }
            });
            this.mDeleteTipPopup = go0Var;
        }
        go0 go0Var2 = this.mDeleteTipPopup;
        if (go0Var2 != null) {
            go0Var2.IIX1OXO();
        }
    }

    public final void showInstallingPopup() {
        syncData();
        if (this.mHandler111 == null) {
            this.mHandler111 = new Handler(Looper.getMainLooper());
        }
        this.progress1111 = 0;
        Handler handler = this.mHandler111;
        if (handler != null) {
            handler.postDelayed(this.myTask, 50L);
        }
    }

    public void showList() {
        i1O0OXO1O.OXO1.OXO1("showList -> size:" + this.mFiles.size() + ", " + this.mFiles);
        this.mHandler.removeMessages(this.loadTimeOut);
        dismissLoadPopup();
        go0 go0Var = this.mErrorPopup;
        if (go0Var != null) {
            go0Var.dismiss();
        }
    }

    public final void showLoadPopup(boolean z) {
        if (this.mLoadingPopup == null) {
            this.mLoadingPopup = new C3006uq(getMActivity());
        }
        C3006uq c3006uq = this.mLoadingPopup;
        if (c3006uq != null) {
            if (z) {
                c3006uq.X01IiOiIi(R.string.music_transfer_load_title);
                c3006uq.m3183I1(Integer.valueOf(R.string.music_transfer_load_tip));
                this.mHandler.sendEmptyMessageDelayed(this.loadTimeOut, C12181V2.f30291h);
            } else {
                c3006uq.X01IiOiIi(0);
                c3006uq.m3183I1(null);
            }
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
    }

    public final void syncData() {
        if (this.mProgressPop == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            c72 c72Var = new c72(fragmentActivityRequireActivity, 0, 2, null);
            c72Var.m1591I1(R.string.app_store_install_title);
            c72Var.m1592OX(0);
            this.mProgressPop = c72Var;
            c72Var.I0iXXO(false);
            c72 c72Var2 = this.mProgressPop;
            if (c72Var2 != null) {
                c72Var2.IIX1OXO();
            }
            syncProgress$default(this, 0.0f, 0.0f, 3, null);
        }
    }

    public final void syncFailed(int i) {
        c72 c72Var = this.mProgressPop;
        if (c72Var != null) {
            c72Var.dismiss();
        }
        this.mProgressPop = null;
        ToastUtils.showLong(OOX00.OXO1.m920iO(i), new Object[0]);
    }

    public final void syncProgress(float f, float f2) {
        c72 c72Var = this.mProgressPop;
        if (c72Var != null) {
            c72Var.m1592OX((int) ((f / f2) * 100));
        }
        if (f2 == f) {
            c72 c72Var2 = this.mProgressPop;
            if (c72Var2 != null) {
                c72Var2.dismiss();
            }
            this.mProgressPop = null;
            BleInitializer.f51208IO.I1Ii(false);
            this.isSync = false;
            if (f == 0.0f && f2 == 0.0f) {
                I01XX0.XIi00iiXO("add_app_store_error", null, 2, null);
            } else {
                I01XX0.XIi00iiXO("add_app_store_success", null, 2, null);
            }
        }
    }

    public void taskProgress() {
        syncProgress(this.progress1111, 100.0f);
        if (this.progress1111 > 100) {
            c72 c72Var = this.mProgressPop;
            if (c72Var != null) {
                c72Var.dismiss();
            }
            Handler handler = this.mHandler111;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.mHandler111 = null;
        }
    }
}
