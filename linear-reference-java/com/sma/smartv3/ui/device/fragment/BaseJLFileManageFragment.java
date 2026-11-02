package com.sma.smartv3.ui.device.fragment;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IOII1i0;
import com.android.mltcode.paycertificationapi.O0I11X;
import com.android.mltcode.paycertificationapi.OOX00;
import com.android.mltcode.paycertificationapi.OOX1;
import com.android.mltcode.paycertificationapi.OX00XI;
import com.android.mltcode.paycertificationapi.X1iiOOi;
import com.android.mltcode.paycertificationapi.XIi1i1XI1;
import com.android.mltcode.paycertificationapi.XXiIO0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c72;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.ironsource.V2;
import com.jieli.jl_filebrowse.FileBrowseManager;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.Folder;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import com.jieli.jl_filebrowse.interfaces.DeleteCallback;
import com.jieli.jl_filebrowse.interfaces.FileObserver;
import com.jieli.jl_filebrowse.interfaces.SimpleFileObserver;
import com.sma.smartv3.initializer.BleInitializer;
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

    @aa1
    private final String TAG;
    private boolean isNeedToDownloadFile;
    private boolean isSync;
    private final int loadTimeOut;

    @tb1
    private go0 mDeleteTipPopup;

    @aa1
    private final Lazy mDeviceFileCallback$delegate;

    @tb1
    private go0 mErrorPopup;

    @aa1
    private final XO0O10 mFileObserver;

    @aa1
    private final List<FileStruct> mFiles;

    @aa1
    private Handler mHandler;

    @tb1
    private Handler mHandler111;

    @tb1
    private uq mLoadingPopup;

    @tb1
    private c72 mProgressPop;

    @tb1
    private SDCardBean mSDCardBean;

    @aa1
    private Runnable myTask;
    private int onFileReceiverSize;
    private int progress1111;
    private int retryFrequency;

    public static final class O00 implements Runnable {
        public final /* synthetic */ BaseJLFileManageFragment IO;

        public O00(BaseJLFileManageFragment r1) {
            this.IO = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            int r0 = this.IO.getProgress1111();
            this.IO.setProgress1111(r0 + 1);
            this.IO.taskProgress();
            if (this.IO.getProgress1111() > 100) goto L8;
            Handler r1 = BaseJLFileManageFragment.access$getMHandler111$p(this.IO);
            if (r1 == null) goto L9;
            r1.postDelayed(this, 40);
            return;
        L9:
            return;
        }
    }

    public static final class OXO1 extends SimpleFileObserver {
        public final /* synthetic */ BaseJLFileManageFragment OXO1;
        public final /* synthetic */ SDCardBean XIi00iiXO;
        public final /* synthetic */ String iO;

        public OXO1(BaseJLFileManageFragment r1, SDCardBean r2, String r3) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int r1) {
            super.onFileReadFailed(r1);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean r3) {
            super.onFileReadStop(r3);
            FileBrowseManager.getInstance().removeFileObserver(this);
            BaseJLFileManageFragment.access$browToDir(this.OXO1, this.XIi00iiXO, this.iO);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.SimpleFileObserver, com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<? extends SDCardBean> r2) {
            Intrinsics.X0O(r2, "onLineCards");
            super.onSdCardStatusChange(r2);
            FileBrowseManager.getInstance().removeFileObserver(this);
        }
    }

    public static final class XIi00iiXO implements DeleteCallback {
        public final /* synthetic */ BaseJLFileManageFragment OXO1;
        public final /* synthetic */ int XIi00iiXO;

        public XIi00iiXO(BaseJLFileManageFragment r1, int r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onError(int r4, FileStruct r5) {
            Intrinsics.X0O(r5, "file");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onDeviceFileDeleteError " + r4 + ", " + r5);
            BaseJLFileManageFragment.access$dismissLoadPopup(this.OXO1);
            ToastUtils.showLong(r4 + HelpFormatter.DEFAULT_OPT_PREFIX + r5.getName() + this.OXO1.getString(R.string.failed_to_delete), new Object[0]);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onFinish() {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onDeviceFileDeleteFinish");
            this.OXO1.getMFiles().remove(this.XIi00iiXO);
            this.OXO1.showList();
        }

        @Override // com.jieli.jl_filebrowse.interfaces.DeleteCallback
        public void onSuccess(FileStruct r4) {
            Intrinsics.X0O(r4, "p0");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onDeviceFileDelete " + r4);
        }
    }

    @SourceDebugExtension({"SMAP\nBaseJLFileManageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseJLFileManageFragment.kt\ncom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$mFileObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,548:1\n1#2:549\n*E\n"})
    public static final class XO0O10 implements FileObserver {
        public final /* synthetic */ BaseJLFileManageFragment OXO1;

        public XO0O10(BaseJLFileManageFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void OnFlayCallback(boolean r4) {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> OnFlayCallback " + r4);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadFailed(int r4) {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onFileReadFailed " + r4);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStart() {
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onFileReadStart");
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReadStop(boolean r6) {
            Folder r0 = FileBrowseManager.getInstance().getCurrentReadFile(this.OXO1.getMSDCardBean());
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onFileReadStop " + r6 + " " + r0.getName());
            if (r6 == true) goto L7;
            BaseJLFileManageFragment r7 = this.OXO1;
            BaseJLFileManageFragment.access$loadMore(r7, r7.getMSDCardBean());
            return;
        L7:
            if (oe5.OX0X1O10X(r0.getName(), "music", true) == false) goto L10;
            this.OXO1.showList();
            return;
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onFileReceiver(List<FileStruct> r5) {
            Intrinsics.X0O(r5, "fileStructs");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onFileReceiver size:" + r5.size() + ", " + r5);
            this.OXO1.getMFiles().addAll(r5);
        }

        @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
        public void onSdCardStatusChange(List<SDCardBean> r4) {
            Intrinsics.X0O(r4, "list");
            i1O0OXO1O.OXO1.OXO1(BaseJLFileManageFragment.access$getTAG$p(this.OXO1) + " -> onSdCardStatusChange " + r4);
            BaseJLFileManageFragment r0 = this.OXO1;
            Iterator<T> r5 = r4.iterator();
        L4:
            if (r5.hasNext() == false) goto L8;
            Object r1 = r5.next();
            if (((SDCardBean) r1).isOnline() == false) goto L4;
        L9:
            r0.setMSDCardBean((SDCardBean) r1);
            BaseJLFileManageFragment r6 = this.OXO1;
            BaseJLFileManageFragment.access$getCurrentInfo(r6, r6.getMSDCardBean());
            return;
        L8:
            r1 = null;
            goto L9
        }
    }

    public static final class iO implements com.sma.smartv3.ui.device.XIi00iiXO.OXO1 {
        public final /* synthetic */ BaseJLFileManageFragment OXO1;

        public iO(BaseJLFileManageFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0IIOi(int r2, int r3) {
            BaseJLFileManageFragment.access$refreshTaskPanel(this.OXO1, r2, r3);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void I0iXXO(int r1) {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void IiI10X(int r3) {
            BaseJLFileManageFragment.access$refreshTaskPanel(this.OXO1, r3, 0);
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void OIi0(int r1, boolean r2) {
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XIi00iiXO(int r1) {
            super.XIi00iiXO(r1);
            if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.I1() == false) goto L6;
            BaseJLFileManageFragment.access$dismissLoadPopup(this.OXO1);
            return;
        }

        @Override // com.sma.smartv3.ui.device.XIi00iiXO.OXO1
        public void XO0O10(int r1, int r2, String r3) {
            Intrinsics.X0O(r3, "msg");
        }
    }

    public BaseJLFileManageFragment() {
        this.mFiles = new ArrayList();
        this.TAG = "BaseJLFileManageActivity";
        this.loadTimeOut = 255;
        this.mHandler = new Handler(Looper.getMainLooper(), new OOX1(this));
        this.mDeviceFileCallback$delegate = LazyKt__LazyJVMKt.iO(new X1iiOOi(this));
        this.mFileObserver = new XO0O10(this);
        this.myTask = new O00(this);
    }

    public static /* synthetic */ boolean I0IIOi(BaseJLFileManageFragment r0, Message r1) {
        return mHandler$lambda$0(r0, r1);
    }

    public static /* synthetic */ iO IiI10X(BaseJLFileManageFragment r0) {
        return mDeviceFileCallback_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean O00() {
        return showErrorPop$lambda$0$0();
    }

    public static /* synthetic */ boolean OIi0(BaseJLFileManageFragment r0, go0 r1) {
        return showErrorPop$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ boolean XO0O10(BaseJLFileManageFragment r0) {
        return showDeleteTipPopup$lambda$0$1(r0);
    }

    public static /* synthetic */ boolean XOO0ii0() {
        return showDeleteTipPopup$lambda$0$0();
    }

    public static final /* synthetic */ void access$browToDir(BaseJLFileManageFragment r0, SDCardBean r1, String r2) {
        r0.browToDir(r1, r2);
    }

    public static final /* synthetic */ void access$dismissLoadPopup(BaseJLFileManageFragment r0) {
        r0.dismissLoadPopup();
    }

    public static final /* synthetic */ void access$getCurrentInfo(BaseJLFileManageFragment r0, SDCardBean r1) {
        r0.getCurrentInfo(r1);
    }

    public static final /* synthetic */ Handler access$getMHandler111$p(BaseJLFileManageFragment r0) {
        return r0.mHandler111;
    }

    public static final /* synthetic */ String access$getTAG$p(BaseJLFileManageFragment r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$loadMore(BaseJLFileManageFragment r0, SDCardBean r1) {
        r0.loadMore(r1);
    }

    public static final /* synthetic */ void access$refreshTaskPanel(BaseJLFileManageFragment r0, int r1, int r2) {
        r0.refreshTaskPanel(r1, r2);
    }

    private static final Unit add$lambda$0(BaseJLFileManageFragment r0) {
        r0.getFile();
        return Unit.OXO1;
    }

    private final void append(SDCardBean r3, FileStruct r4) {
        int r5 = FileBrowseManager.getInstance().appenBrowse(r4, r3);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> appendToDir " + r5);
        if (r5 == 0) goto L5;
        return;
    L5:
        this.mFiles.clear();
    }

    private final void browToDir(SDCardBean r7, String r8) {
        Folder r0 = FileBrowseManager.getInstance().getCurrentReadFile(r7);
        if (r0 != null) goto L6;
        return;
    L6:
        if (r0.getParent() == null) goto L8;
        FileBrowseManager.getInstance().backBrowse(r7, false);
        r0 = FileBrowseManager.getInstance().getCurrentReadFile(r7);
        Intrinsics.O10IXXX0X(r0, "getCurrentReadFile(...)");
        goto L6
    L8:
        List<FileStruct> r1 = r0.getChildFileStructs();
        Intrinsics.O10IXXX0X(r1, "getChildFileStructs(...)");
        Iterator<T> r2 = r1.iterator();
    L10:
        if (r2.hasNext() == false) goto L16;
        Object r3 = r2.next();
        FileStruct r4 = (FileStruct) r3;
        if (r4.isFile() == true) goto L10;
        if (oe5.OX0X1O10X(r4.getName(), r8, true) == false) goto L10;
    L17:
        FileStruct r5 = (FileStruct) r3;
        if (r5 == null) goto L22;
        append(r7, r5);
        return;
    L22:
        if (r0.isLoadFinished(false) == true) goto L34;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> browseToDir add simpleFileObserver");
        OXO1 r6 = new OXO1(this, r7, r8);
        FileBrowseManager.getInstance().addFileObserver(r6);
        FileBrowseManager.getInstance().setPageSize(30);
        if (FileBrowseManager.getInstance().loadMore(r7) == 0) goto L35;
        FileBrowseManager.getInstance().removeFileObserver(r6);
        return;
    L35:
        return;
    L34:
        return;
    L16:
        r3 = null;
        goto L17
    }

    private final void dismissLoadPopup() {
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    private final void getCurrentInfo(SDCardBean r6) {
        Folder r0 = FileBrowseManager.getInstance().getCurrentReadFile(r6);
        if (r0 != null) goto L5;
        return;
    L5:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> getCurrentInfo folder " + r0.getName());
        if (oe5.OX0X1O10X(r0.getName(), "music", true) == true) goto L8;
    L17:
        browToDir(r6, "music");
        return;
    L8:
        if (r0.getLevel() != 1) goto L17;
        if (r0.isLoadFinished(false) == false) goto L12;
    L15:
        r0.isLoadFinished(false);
        return;
    L12:
        if (r0.getChildFileStructs().size() >= 1) goto L15;
        loadMore(r6);
    }

    private final iO getMDeviceFileCallback() {
        return (iO) getValue();
    }

    public static /* synthetic */ Unit iO(BaseJLFileManageFragment r0) {
        return add$lambda$0(r0);
    }

    private final void loadMore(SDCardBean r4) {
        int r5 = FileBrowseManager.getInstance().loadMore(r4);
        i1O0OXO1O.OXO1.OXO1(this.TAG + " -> loadMoreFile " + r5);
    }

    private static final iO mDeviceFileCallback_delegate$lambda$0(BaseJLFileManageFragment r1) {
        return new iO(r1);
    }

    private static final boolean mHandler$lambda$0(BaseJLFileManageFragment r2, Message r3) {
        Intrinsics.X0O(r3, "it");
        if (r3.what != r2.loadTimeOut) goto L10;
        r2.dismissLoadPopup();
        if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.I1() == true) goto L7;
        r2.showErrorPop();
    L7:
        i1O0OXO1O.OXO1.OXO1(r2.TAG + " loadTimeOut retryFrequency=" + r2.retryFrequency);
        return false;
    L10:
        return false;
    }

    private final void refreshTaskPanel(int r1, int r2) {
    }

    public static /* synthetic */ void showDeleteTipPopup$default(BaseJLFileManageFragment r0, int r1, int r2, int r3, int r4, Object r5) {
        if (r5 != null) goto L15;
        if ((r4 & 1) == 0) goto L7;
        r1 = R.string.tip;
    L7:
        if ((r4 & 2) == 0) goto L10;
        r2 = R.string.clear_ai_chat_list;
    L10:
        if ((r4 & 4) == 0) goto L12;
        r3 = R.string.confirm;
    L12:
        r0.showDeleteTipPopup(r1, r2, r3);
        return;
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDeleteTipPopup");
    }

    private static final boolean showDeleteTipPopup$lambda$0$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$0$1(BaseJLFileManageFragment r0) {
        r0.confirmDeleteFile();
        return true;
    }

    private final void showErrorPop() {
        if (this.mErrorPopup != null) goto L5;
        int r4 = 0;
        final go0 r0 = new go0(getMActivity(), r4, 2, null);
        r0.O1O(R.string.bt3_connect_error);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new IOII1i0());
        r0.X1IX(R.string.confirm, new O0I11X(this, r0));
        this.mErrorPopup = r0;
    L5:
        go0 r1 = this.mErrorPopup;
        if (r1 != null) goto L8;
    L10:
        go0 r2 = this.mErrorPopup;
        if (r2 == null) goto L14;
        r2.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r1.isShowing() != true) goto L10;
    }

    private static final boolean showErrorPop$lambda$0$0() {
        return true;
    }

    private static final boolean showErrorPop$lambda$0$1(BaseJLFileManageFragment r4, go0 r5) {
        showLoadPopup$default(r4, false, 1, null);
        int r0 = r4.retryFrequency + 1;
        r4.retryFrequency = r0;
        if (r0 <= 2) goto L5;
        r4.retryFrequency = 0;
        FileBrowseManager.getInstance().removeFileObserver(r4.mFileObserver);
        com.sma.smartv3.ui.device.XIi00iiXO r1 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        r1.XiOIO();
        Application r6 = r5.XO0O10().getApplication();
        Intrinsics.O10IXXX0X(r6, "getApplication(...)");
        r1.OX(r6);
        FileBrowseManager.getInstance().addFileObserver(r4.mFileObserver);
    L5:
        com.sma.smartv3.ui.device.XIi00iiXO.OXO1.X0O();
        return true;
    }

    public static /* synthetic */ void showLoadPopup$default(BaseJLFileManageFragment r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = true;
    L6:
        r0.showLoadPopup(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadPopup");
    }

    public static /* synthetic */ void syncFailed$default(BaseJLFileManageFragment r0, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        r0.syncFailed(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncFailed");
    }

    public static /* synthetic */ void syncProgress$default(BaseJLFileManageFragment r0, float r1, float r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = 0.0f;
    L7:
        if ((r3 & 2) == 0) goto L9;
        r2 = 100.0f;
    L9:
        r0.syncProgress(r1, r2);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncProgress");
    }

    public final void add() {
        if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.I1() == true) goto L6;
        showErrorPop();
        return;
    L6:
        doTransfer(new XIi1i1XI1(this));
    }

    public void confirmDeleteFile() {
    }

    public final void deleteFile(int r7) {
        FileBrowseManager r0 = FileBrowseManager.getInstance();
        SDCardBean r1 = this.mSDCardBean;
        boolean r2 = true;
        List<FileStruct> r3 = CollectionsKt__CollectionsKt.Ii1iii0(new FileStruct[]{this.mFiles.get(r7)});
        SDCardBean r4 = this.mSDCardBean;
        if (r4 == null) goto L5;
        Integer r5 = Integer.valueOf(r4.getType());
    L6:
        Intrinsics.XXI(r5);
        if (r5.intValue() > 1) goto L10;
        r2 = false;
    L10:
        r0.deleteFile(r1, r3, r2, new XIi00iiXO(this, r7));
        return;
    L5:
        r5 = null;
        goto L6
    }

    public final boolean doTransfer(@aa1 Function0<Unit> r3) {
        Intrinsics.X0O(r3, "action");
        if (com.sma.smartv3.ui.device.XIi00iiXO.OXO1.X01IiOiIi() == false) goto L6;
        ToastUtils.showLong(getString(R.string.transfering), new Object[0]);
        return false;
    L6:
        r3.invoke();
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

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
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
        com.sma.smartv3.ui.device.XIi00iiXO r0 = com.sma.smartv3.ui.device.XIi00iiXO.OXO1;
        r0.iOO1ii1(getMDeviceFileCallback());
        r0.XiOIO();
        super.onDestroy();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerFragment
    public int refreshLayoutId() {
        return 0;
    }

    public final void setMProgressPop(@tb1 c72 r1) {
        this.mProgressPop = r1;
    }

    public final void setMSDCardBean(@tb1 SDCardBean r1) {
        this.mSDCardBean = r1;
    }

    public final void setMyTask(@aa1 Runnable r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.myTask = r2;
    }

    public final void setNeedToDownloadFile(boolean r1) {
        this.isNeedToDownloadFile = r1;
    }

    public final void setOnFileReceiverSize(int r1) {
        this.onFileReceiverSize = r1;
    }

    public final void setProgress1111(int r1) {
        this.progress1111 = r1;
    }

    public final void setRetryFrequency(int r1) {
        this.retryFrequency = r1;
    }

    public final void setSync(boolean r1) {
        this.isSync = r1;
    }

    public final void showDeleteTipPopup(int r6, int r7, int r8) {
        if (this.mDeleteTipPopup != null) goto L5;
        int r4 = 0;
        go0 r0 = new go0(getMActivity(), r4, 2, null);
        r0.O1O(r6);
        r0.iX(Integer.valueOf(r7));
        r0.IXXOO(1);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new OX00XI());
        r0.X1IX(r8, new XXiIO0(this));
        this.mDeleteTipPopup = r0;
    L5:
        go0 r9 = this.mDeleteTipPopup;
        if (r9 == null) goto L9;
        r9.IIX1OXO();
        return;
    }

    public final void showInstallingPopup() {
        syncData();
        if (this.mHandler111 != null) goto L5;
        this.mHandler111 = new Handler(Looper.getMainLooper());
    L5:
        this.progress1111 = 0;
        Handler r0 = this.mHandler111;
        if (r0 == null) goto L9;
        r0.postDelayed(this.myTask, 50);
        return;
    }

    public void showList() {
        i1O0OXO1O.OXO1.OXO1("showList -> size:" + this.mFiles.size() + ", " + this.mFiles);
        this.mHandler.removeMessages(this.loadTimeOut);
        dismissLoadPopup();
        go0 r0 = this.mErrorPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    public final void showLoadPopup(boolean r4) {
        if (this.mLoadingPopup != null) goto L5;
        this.mLoadingPopup = new uq(getMActivity());
    L5:
        uq r0 = this.mLoadingPopup;
        if (r0 == null) goto L10;
        if (r4 == false) goto L9;
        r0.X01IiOiIi(R.string.music_transfer_load_title);
        r0.I1(Integer.valueOf(R.string.music_transfer_load_tip));
        this.mHandler.sendEmptyMessageDelayed(this.loadTimeOut, V2.h);
        goto L10
    L9:
        r0.X01IiOiIi(0);
        r0.I1(null);
    L10:
        uq r5 = this.mLoadingPopup;
        if (r5 == null) goto L14;
        r5.IIX1OXO();
        return;
    }

    public final void syncData() {
        if (this.mProgressPop != null) goto L9;
        FragmentActivity r1 = requireActivity();
        Intrinsics.O10IXXX0X(r1, "requireActivity(...)");
        int r3 = 0;
        c72 r0 = new c72(r1, r3, 2, null);
        r0.I1(R.string.app_store_install_title);
        r0.OX(0);
        this.mProgressPop = r0;
        r0.I0iXXO(false);
        c72 r2 = this.mProgressPop;
        if (r2 == null) goto L7;
        r2.IIX1OXO();
    L7:
        syncProgress$default(this, 0.0f, 0.0f, 3, null);
        return;
    }

    public final void syncFailed(int r2) {
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L5;
        r0.dismiss();
    L5:
        this.mProgressPop = null;
        ToastUtils.showLong(OOX00.OXO1.iO(r2), new Object[0]);
    }

    public final void syncProgress(float r4, float r5) {
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L6;
        r0.OX((int) ((r4 / r5) * 100));
    L6:
        if (r5 != r4) goto L18;
        c72 r1 = this.mProgressPop;
        if (r1 == null) goto L10;
        r1.dismiss();
    L10:
        this.mProgressPop = null;
        BleInitializer.IO.I1Ii(false);
        this.isSync = false;
        if (r4 == 0.0f) goto L13;
    L16:
        I01XX0.XIi00iiXO("add_app_store_success", null, 2, null);
        return;
    L13:
        if (r5 != 0.0f) goto L16;
        I01XX0.XIi00iiXO("add_app_store_error", null, 2, null);
        return;
    }

    public void taskProgress() {
        syncProgress(this.progress1111, 100.0f);
        if (this.progress1111 <= 100) goto L12;
        c72 r0 = this.mProgressPop;
        if (r0 == null) goto L7;
        r0.dismiss();
    L7:
        Handler r1 = this.mHandler111;
        if (r1 == null) goto L10;
        r1.removeCallbacksAndMessages(null);
    L10:
        this.mHandler111 = null;
        return;
    }
}
