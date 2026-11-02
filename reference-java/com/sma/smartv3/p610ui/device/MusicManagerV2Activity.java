package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bz5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.MusicServerManager;
import com.sma.smartv3.model.ServerOSSMusicItem;
import com.sma.smartv3.model.TeraBoxItemDLink;
import com.sma.smartv3.model.TeraBoxListItem;
import com.sma.smartv3.model.TransmissionMusicItem;
import com.sma.smartv3.p610ui.device.MusicManagerV2Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.work.UploadOSSWorker;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleSDCardInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMusicManagerV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,537:1\n69#2,3:538\n72#2,5:542\n69#2,3:568\n72#2,5:572\n69#2,3:587\n72#2,5:591\n69#2,3:596\n72#2,5:600\n1#3:541\n1#3:571\n1#3:590\n1#3:599\n50#4,3:547\n53#4:553\n55#4,2:555\n50#4,3:577\n53#4:583\n55#4,2:585\n1563#5:550\n1634#5,2:551\n1636#5:554\n1563#5:557\n1634#5,3:558\n230#5,2:561\n1563#5:564\n1634#5,3:565\n1563#5:580\n1634#5,2:581\n1636#5:584\n1563#5:605\n1634#5,3:606\n1563#5:609\n1634#5,3:610\n36#6:563\n*S KotlinDebug\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity\n*L\n117#1:538,3\n117#1:542,5\n409#1:568,3\n409#1:572,5\n111#1:587,3\n111#1:591,5\n106#1:596,3\n106#1:600,5\n117#1:541\n409#1:571\n111#1:590\n106#1:599\n131#1:547,3\n131#1:553\n131#1:555,2\n417#1:577,3\n417#1:583\n417#1:585,2\n131#1:550\n131#1:551,2\n131#1:554\n144#1:557\n144#1:558,3\n171#1:561,2\n269#1:564\n269#1:565,3\n417#1:580\n417#1:581,2\n417#1:584\n321#1:605\n321#1:606,3\n377#1:609\n377#1:610,3\n216#1:563\n*E\n"})
public final class MusicManagerV2Activity extends MusicManagerActivity {
    private int downLoadIndex;
    private boolean isDownLoading;
    private boolean isStopDownLoading;

    @tb1
    private go0 mDownTipPopup;

    @tb1
    private OSSClient mOSSClient;

    @tb1
    private List<ServerOSSMusicItem> mSeverMusicCheckList;

    @aa1
    private final Lazy mAddPhoneBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qx0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerV2Activity.mAddPhoneBottom_delegate$lambda$0(this.f10700IO);
        }
    });

    @aa1
    private final Lazy mAddTeraBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ay0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerV2Activity.mAddTeraBottom_delegate$lambda$0(this.f5610IO);
        }
    });

    @aa1
    private final Lazy mAddServerBottom$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.by0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerV2Activity.mAddServerBottom_delegate$lambda$0(this.f5848IO);
        }
    });

    @aa1
    private final Lazy musicInformation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cy0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerV2Activity.musicInformation_delegate$lambda$0(this.f6082IO);
        }
    });

    @aa1
    private final Lazy tvDownloadingProgress$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dy0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerV2Activity.tvDownloadingProgress_delegate$lambda$0(this.f6297IO);
        }
    });

    @aa1
    private final Lazy musicRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ey0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MusicManagerV2Activity.musicRecyclerView_delegate$lambda$0(this.f6519IO);
        }
    });

    @aa1
    private List<TeraBoxListItem> checkList = new ArrayList();

    @aa1
    private List<TeraBoxItemDLink> mDLinkList = new ArrayList();

    @aa1
    private List<TransmissionMusicItem> mTransmissionMusicList = new ArrayList();

    @aa1
    private String access_tokens = "";

    @aa1
    private String refresh_tokens = "";

    @aa1
    private String mOSSBucket = "";

    @SourceDebugExtension({"SMAP\nMusicManagerV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,537:1\n36#2:538\n*S KotlinDebug\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n*L\n482#1:538\n*E\n"})
    public static final class OXO1 implements OSSCompletedCallback<GetObjectRequest, GetObjectResult> {
        public final /* synthetic */ ServerOSSMusicItem XIi00iiXO;

        public OXO1(ServerOSSMusicItem serverOSSMusicItem) {
            this.XIi00iiXO = serverOSSMusicItem;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onFailure(GetObjectRequest getObjectRequest, ClientException clientException, ServiceException serviceException) {
            Intrinsics.X0O(clientException, "clientException");
            Intrinsics.X0O(serviceException, "serviceException");
            if (MusicManagerV2Activity.this.isStopDownLoading()) {
                MusicManagerV2Activity.this.onMusicFileTransferStop();
            } else {
                ToastUtils.showLong("Music DownLoad Error", new Object[0]);
                MusicManagerV2Activity.this.severMusicNextMusic();
            }
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.XIi00iiXO(MusicManagerV2Activity.this.getTAG() + " ErrorCode " + serviceException.getErrorCode());
            i1o0oxo1o.XIi00iiXO(MusicManagerV2Activity.this.getTAG() + " RequestId  " + serviceException.getRequestId());
            i1o0oxo1o.XIi00iiXO(MusicManagerV2Activity.this.getTAG() + " HostId   " + serviceException.getHostId());
            i1o0oxo1o.XIi00iiXO(MusicManagerV2Activity.this.getTAG() + " RawMessag   " + serviceException.getRawMessage());
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void onSuccess(GetObjectRequest getObjectRequest, GetObjectResult result) {
            Intrinsics.X0O(result, "result");
            long contentLength = result.getContentLength();
            if (contentLength > 0) {
                int i = (int) contentLength;
                byte[] bArr = new byte[i];
                int i2 = 0;
                while (i2 < contentLength) {
                    try {
                        i2 += result.getObjectContent().read(bArr, i2, i - i2);
                        if (!MusicManagerV2Activity.this.isStopDownLoading()) {
                            MusicManagerV2Activity.this.refreshTaskPanelDownLoad((i2 * 100) / i);
                        }
                    } catch (Exception e) {
                        OSSLog.logInfo(e.toString());
                    }
                }
                try {
                    sz0 sz0Var = sz0.OXO1;
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(uz0.O001I(sz0Var), this.XIi00iiXO.getTitle()));
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    if (MusicManagerV2Activity.this.isStopDownLoading()) {
                        return;
                    }
                    MusicManagerV2Activity.this.setMDownSuccessSize(MusicManagerV2Activity.this.getMDownSuccessSize() + 1);
                    List list = MusicManagerV2Activity.this.mTransmissionMusicList;
                    String absolutePath = new File(uz0.O001I(sz0Var), this.XIi00iiXO.getTitle()).getAbsolutePath();
                    Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
                    String string = new File(uz0.O001I(sz0Var), this.XIi00iiXO.getTitle()).toURI().toString();
                    Intrinsics.O10IXXX0X(string, "toString(...)");
                    String string2 = Uri.fromFile(new File(uz0.O001I(sz0Var), this.XIi00iiXO.getTitle())).toString();
                    Intrinsics.O10IXXX0X(string2, "toString(...)");
                    list.add(new TransmissionMusicItem(absolutePath, string, string2, this.XIi00iiXO.getTitle()));
                    MusicManagerV2Activity.this.severMusicNextMusic();
                } catch (Exception e2) {
                    OSSLog.logInfo(e2.toString());
                    i1O0OXO1O.OXO1.XIi00iiXO(MusicManagerV2Activity.this.getTAG() + " FileOutputStream " + e2);
                    if (MusicManagerV2Activity.this.isStopDownLoading()) {
                        MusicManagerV2Activity.this.onMusicFileTransferStop();
                    } else {
                        ToastUtils.showLong("Music DownLoad Error", new Object[0]);
                        MusicManagerV2Activity.this.severMusicNextMusic();
                    }
                }
            }
        }
    }

    public MusicManagerV2Activity() {
        setMMusicItemLayout(R.layout.item_music_v2);
        setTransferTip(R.string.music_down_transmit_tip);
    }

    private final void downLastSeverMusic() {
        String str = this.mOSSBucket;
        List<ServerOSSMusicItem> list = this.mSeverMusicCheckList;
        Intrinsics.XXI(list);
        ServerOSSMusicItem serverOSSMusicItem = list.get(this.downLoadIndex);
        OSSClient oSSClient = this.mOSSClient;
        Intrinsics.XXI(oSSClient);
        downOSSMusicLink(str, serverOSSMusicItem, oSSClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downLoadLink$lambda$1(MusicManagerV2Activity musicManagerV2Activity, TeraBoxListItem teraBoxListItem, Integer num) {
        if (num == null || num.intValue() != -1) {
            IntRange intRange = new IntRange(0, 100);
            if (num == null || !intRange.OIX0iXi(num.intValue())) {
                if (num == null || num.intValue() != 200) {
                    musicManagerV2Activity.onMusicFileTransferStop();
                    ToastUtils.showLong("Music Error " + num, new Object[0]);
                } else if (!musicManagerV2Activity.isStopDownLoading) {
                    musicManagerV2Activity.setMDownSuccessSize(musicManagerV2Activity.getMDownSuccessSize() + 1);
                    musicManagerV2Activity.downSuccess(teraBoxListItem);
                }
            } else if (!musicManagerV2Activity.isStopDownLoading) {
                Intrinsics.XXI(num);
                musicManagerV2Activity.refreshTaskPanelDownLoad(num.intValue());
            }
        } else if (!musicManagerV2Activity.isStopDownLoading) {
            ToastUtils.showLong("Music DownLoad Error", new Object[0]);
            musicManagerV2Activity.nextMusic();
        }
        return Unit.OXO1;
    }

    private final void downOSSMusicLink(String str, ServerOSSMusicItem serverOSSMusicItem, OSSClient oSSClient) {
        oSSClient.asyncGetObject(new GetObjectRequest(str, serverOSSMusicItem.getPath()), new OXO1(serverOSSMusicItem));
    }

    private final void downSuccess(TeraBoxListItem teraBoxListItem) {
        List<TransmissionMusicItem> list = this.mTransmissionMusicList;
        sz0 sz0Var = sz0.OXO1;
        String absolutePath = new File(uz0.O001I(sz0Var), teraBoxListItem.getServer_filename()).getAbsolutePath();
        Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
        String string = new File(uz0.O001I(sz0Var), teraBoxListItem.getServer_filename()).toURI().toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        String string2 = Uri.fromFile(new File(uz0.O001I(sz0Var), teraBoxListItem.getServer_filename())).toString();
        Intrinsics.O10IXXX0X(string2, "toString(...)");
        list.add(new TransmissionMusicItem(absolutePath, string, string2, teraBoxListItem.getServer_filename()));
        nextMusic();
    }

    private final Button getMAddPhoneBottom() {
        return (Button) this.mAddPhoneBottom$delegate.getValue();
    }

    private final Button getMAddServerBottom() {
        return (Button) this.mAddServerBottom$delegate.getValue();
    }

    private final Button getMAddTeraBottom() {
        return (Button) this.mAddTeraBottom$delegate.getValue();
    }

    private final View getMusicInformation() {
        return (View) this.musicInformation$delegate.getValue();
    }

    private final View getMusicRecyclerView() {
        return (View) this.musicRecyclerView$delegate.getValue();
    }

    private final TextView getTvDownloadingProgress() {
        return (TextView) this.tvDownloadingProgress$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mAddPhoneBottom_delegate$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        return (Button) musicManagerV2Activity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mAddServerBottom_delegate$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        return (Button) musicManagerV2Activity.findViewById(R.id.btn_bottom_server);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mAddTeraBottom_delegate$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        return (Button) musicManagerV2Activity.findViewById(R.id.btn_bottom_tera_box);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View musicInformation_delegate$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        return musicManagerV2Activity.findViewById(R.id.task_panel_music_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View musicRecyclerView_delegate$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        return musicManagerV2Activity.findViewById(R.id.music_v2_recycler_layout);
    }

    private final void nextMusic() {
        if (this.isStopDownLoading) {
            return;
        }
        int i = this.downLoadIndex + 1;
        this.downLoadIndex = i;
        if (i >= this.mDLinkList.size()) {
            transmissionMusic();
        } else {
            downLoadLink();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomTeraBoxClick$lambda$0(final MusicManagerV2Activity musicManagerV2Activity, boolean z) {
        String str;
        if (z || (str = musicManagerV2Activity.refresh_tokens) == null || str.length() <= 0) {
            musicManagerV2Activity.dismissLoadPopup();
            musicManagerV2Activity.startActivity(new Intent(musicManagerV2Activity, (Class<?>) TeraBoxFileManagerActivity.class));
        } else {
            MusicServerManager.OXO1.I1XOi1(musicManagerV2Activity.refresh_tokens, new Function1() { // from class: com.android.mltcode.paycertificationapi.rx0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerV2Activity.onBottomTeraBoxClick$lambda$0$0(this.f10923IO, ((Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomTeraBoxClick$lambda$0$0(MusicManagerV2Activity musicManagerV2Activity, boolean z) {
        musicManagerV2Activity.dismissLoadPopup();
        musicManagerV2Activity.startActivity(new Intent(musicManagerV2Activity, (Class<?>) TeraBoxFileManagerActivity.class));
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$0$1(MusicManagerV2Activity musicManagerV2Activity) {
        musicManagerV2Activity.isDownLoading = false;
        musicManagerV2Activity.isStopDownLoading = true;
        musicManagerV2Activity.stopDownLoadRefreshProgress();
        MusicServerManager.OXO1.OXO1();
        musicManagerV2Activity.mDLinkList.clear();
        List<ServerOSSMusicItem> list = musicManagerV2Activity.mSeverMusicCheckList;
        if (list != null) {
            list.clear();
        }
        musicManagerV2Activity.getMusicRecyclerView().setVisibility(0);
        musicManagerV2Activity.getTaskPanel().setVisibility(8);
        musicManagerV2Activity.getMAddPhoneBottom().setEnabled(true);
        musicManagerV2Activity.getMAddTeraBottom().setEnabled(true);
        musicManagerV2Activity.getMAddServerBottom().setEnabled(true);
        if (musicManagerV2Activity.mTransmissionMusicList.size() > 0) {
            List<TransmissionMusicItem> list2 = musicManagerV2Activity.mTransmissionMusicList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(FileUtils.delete(((TransmissionMusicItem) it.next()).getPath())));
            }
            musicManagerV2Activity.mTransmissionMusicList.clear();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$1$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCancel$lambda$1$1(MusicManagerV2Activity musicManagerV2Activity) {
        XIi00iiXO.OXO1.O001I();
        musicManagerV2Activity.getTaskPanel().setVisibility(8);
        musicManagerV2Activity.getMAddPhoneBottom().setEnabled(true);
        musicManagerV2Activity.getMAddTeraBottom().setEnabled(true);
        musicManagerV2Activity.getMAddServerBottom().setEnabled(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMusicFileTransferStop$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        musicManagerV2Activity.getMusicRecyclerView().setVisibility(0);
        musicManagerV2Activity.getTaskPanel().setVisibility(8);
        musicManagerV2Activity.getMAddPhoneBottom().setEnabled(true);
        musicManagerV2Activity.getMAddTeraBottom().setEnabled(true);
        musicManagerV2Activity.getMAddServerBottom().setEnabled(true);
        musicManagerV2Activity.showLoadPopup(false);
        musicManagerV2Activity.browToDirDeviceFile();
        if (musicManagerV2Activity.mTransmissionMusicList.size() > 0) {
            List<TransmissionMusicItem> list = musicManagerV2Activity.mTransmissionMusicList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(FileUtils.delete(((TransmissionMusicItem) it.next()).getPath())));
            }
            musicManagerV2Activity.mTransmissionMusicList.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshTaskPanelDownLoad(final int i) {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.wx0
            @Override // java.lang.Runnable
            public final void run() {
                MusicManagerV2Activity.refreshTaskPanelDownLoad$lambda$0(this.f12058IO, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshTaskPanelDownLoad$lambda$0(MusicManagerV2Activity musicManagerV2Activity, int i) {
        List list;
        Integer numValueOf;
        musicManagerV2Activity.getTvProgressTip().setText(R.string.tera_box_music_downloading);
        TextView tvTotalProgress = musicManagerV2Activity.getTvTotalProgress();
        int i2 = musicManagerV2Activity.downLoadIndex + 1;
        if (musicManagerV2Activity.mSeverMusicCheckList != null && musicManagerV2Activity.mDLinkList.size() == 0) {
            list = musicManagerV2Activity.mSeverMusicCheckList;
            if (list == null) {
                numValueOf = null;
            }
            tvTotalProgress.setText(i2 + "/ " + numValueOf);
            musicManagerV2Activity.getPbProgress().setProgress(i);
            musicManagerV2Activity.getTvDownloadingProgress().setText(i + "%");
        }
        list = musicManagerV2Activity.mDLinkList;
        numValueOf = Integer.valueOf(list.size());
        tvTotalProgress.setText(i2 + "/ " + numValueOf);
        musicManagerV2Activity.getPbProgress().setProgress(i);
        musicManagerV2Activity.getTvDownloadingProgress().setText(i + "%");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit severMusicCheckList$lambda$0(MusicManagerV2Activity musicManagerV2Activity, Pair pair) {
        Intrinsics.X0O(pair, "pair");
        int iIntValue = ((Number) pair.getSecond()).intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            UploadOSSWorker.StsRamData stsRamData = (UploadOSSWorker.StsRamData) pair.getFirst();
            OSSClient oSSClientXIi00iiXO = MusicServerManager.OXO1.XIi00iiXO(stsRamData);
            musicManagerV2Activity.mOSSClient = oSSClientXIi00iiXO;
            if (stsRamData != null && oSSClientXIi00iiXO != null) {
                musicManagerV2Activity.downLoadingShowView();
                musicManagerV2Activity.refreshTaskPanelDownLoad(0);
                musicManagerV2Activity.downLoadIndex = 0;
                musicManagerV2Activity.isDownLoading = true;
                musicManagerV2Activity.mOSSBucket = stsRamData.getBucket();
                musicManagerV2Activity.downLastSeverMusic();
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void severMusicNextMusic() {
        if (this.isStopDownLoading) {
            return;
        }
        int i = this.downLoadIndex + 1;
        this.downLoadIndex = i;
        List<ServerOSSMusicItem> list = this.mSeverMusicCheckList;
        Intrinsics.XXI(list);
        if (i >= list.size()) {
            transmissionMusic();
        } else {
            downLastSeverMusic();
        }
    }

    private final void stopDownLoadRefreshProgress() {
        getTvProgressTip().setText(R.string.tera_box_music_downloading);
        getTvTotalProgress().setText("");
        getPbProgress().setProgress(0);
        getTvDownloadingProgress().setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit teraBoxCheckList$lambda$1(MusicManagerV2Activity musicManagerV2Activity, List list) {
        if (list != null) {
            musicManagerV2Activity.mDLinkList = CollectionsKt___CollectionsKt.OO0Oi10(list);
            musicManagerV2Activity.downLoadIndex = 0;
            musicManagerV2Activity.setMDownSuccessSize(0);
            ToastUtils.showLong(musicManagerV2Activity.getString(R.string.music_down_transmit_tip), new Object[0]);
            musicManagerV2Activity.downLoadLink();
        } else {
            musicManagerV2Activity.onMusicFileTransferStop();
            ToastUtils.showLong(R.string.get_music_down_link_error);
        }
        return Unit.OXO1;
    }

    private final void transmissionMusic() {
        String title;
        List<ServerOSSMusicItem> list;
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.yx0
            @Override // java.lang.Runnable
            public final void run() {
                MusicManagerV2Activity.transmissionMusic$lambda$0(this.f12475IO);
            }
        });
        if (this.mDLinkList.size() == 0 && (list = this.mSeverMusicCheckList) != null) {
            Intrinsics.XXI(list);
            if (list.size() - getMDownSuccessSize() >= 0) {
                List<ServerOSSMusicItem> list2 = this.mSeverMusicCheckList;
                Intrinsics.XXI(list2);
                ToastUtils.showLong(getString(R.string.download_error_tip, Integer.valueOf(list2.size() - getMDownSuccessSize()), Integer.valueOf(getMDownSuccessSize())), new Object[0]);
            }
        } else if (this.mDLinkList.size() - getMDownSuccessSize() >= 0) {
            ToastUtils.showLong(getString(R.string.download_error_tip, Integer.valueOf(this.mDLinkList.size() - getMDownSuccessSize()), Integer.valueOf(getMDownSuccessSize())), new Object[0]);
        }
        if (this.mTransmissionMusicList.size() <= 0) {
            getTaskPanel().setVisibility(8);
            onMusicFileTransferStop();
            return;
        }
        XIi00iiXO xIi00iiXO = XIi00iiXO.OXO1;
        List<TransmissionMusicItem> list3 = this.mTransmissionMusicList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
        for (TransmissionMusicItem transmissionMusicItem : list3) {
            if (transmissionMusicItem.getTitle().length() > 50) {
                String strSubstring = transmissionMusicItem.getTitle().substring(0, 50);
                Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
                title = strSubstring + ".mp3";
            } else {
                title = transmissionMusicItem.getTitle();
            }
            arrayList.add(new bz5(transmissionMusicItem.getUrl(), transmissionMusicItem.getUri(), title));
        }
        xIi00iiXO.X0i1O(arrayList);
        XIi00iiXO.OXO1.iXiX011(getMSDCardBean());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transmissionMusic$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        musicManagerV2Activity.getMusicInformation().setVisibility(0);
        musicManagerV2Activity.getTvDownloadingProgress().setText("");
        musicManagerV2Activity.isDownLoading = false;
        go0 go0Var = musicManagerV2Activity.mDownTipPopup;
        if (go0Var != null) {
            go0Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDownloadingProgress_delegate$lambda$0(MusicManagerV2Activity musicManagerV2Activity) {
        return (TextView) musicManagerV2Activity.findViewById(R.id.task_panel_music_downloading_tv);
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public boolean doTransfer(@aa1 Function0<Unit> action) {
        Intrinsics.X0O(action, "action");
        if (!this.isDownLoading) {
            return super.doTransfer(action);
        }
        ToastUtils.showLong(getString(isTransferTip()), new Object[0]);
        return false;
    }

    public final void downLoadLink() {
        if (this.mDLinkList.size() <= 0 || this.isStopDownLoading) {
            onMusicFileTransferStop();
            return;
        }
        downLoadingShowView();
        refreshTaskPanelDownLoad(0);
        TeraBoxItemDLink teraBoxItemDLink = this.mDLinkList.get(this.downLoadIndex);
        for (final TeraBoxListItem teraBoxListItem : this.checkList) {
            if (teraBoxListItem.getFs_id() == teraBoxItemDLink.getFs_id()) {
                this.isDownLoading = true;
                MusicServerManager.OXO1.XO0O10(teraBoxItemDLink.getDlink(), this.access_tokens, teraBoxListItem.getServer_filename(), new Function1() { // from class: com.android.mltcode.paycertificationapi.zx0
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MusicManagerV2Activity.downLoadLink$lambda$1(this.f12714IO, teraBoxListItem, (Integer) obj);
                    }
                });
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void downLoadingShowView() {
        getTvCancel().setVisibility(0);
        getTvRetry().setVisibility(8);
        getTaskPanel().setVisibility(0);
        getMusicInformation().setVisibility(8);
        getTvDownloadingProgress().setVisibility(0);
    }

    @aa1
    public final String getAccess_tokens() {
        return this.access_tokens;
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public void getDeviceFileList() {
    }

    @tb1
    public final go0 getMDownTipPopup() {
        return this.mDownTipPopup;
    }

    @aa1
    public final String getMOSSBucket() {
        return this.mOSSBucket;
    }

    @tb1
    public final OSSClient getMOSSClient() {
        return this.mOSSClient;
    }

    @tb1
    public final List<ServerOSSMusicItem> getMSeverMusicCheckList() {
        return this.mSeverMusicCheckList;
    }

    @aa1
    public final String getRefresh_tokens() {
        return this.refresh_tokens;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        Button mAddServerBottom = getMAddServerBottom();
        i72 i72Var = i72.OXO1;
        mAddServerBottom.setVisibility(i72Var.i0iIXiI() ? 0 : 8);
        Button mAddTeraBottom = getMAddTeraBottom();
        i72Var.iX00X1X();
        mAddTeraBottom.setVisibility(8);
    }

    public final boolean isDownLoading() {
        return this.isDownLoading;
    }

    public final boolean isStopDownLoading() {
        return this.isStopDownLoading;
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_music_manager_v2;
    }

    public final void onBottomServerClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) ServerMusicActivity.class));
    }

    public final void onBottomTeraBoxClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01 a01Var = a01.OXO1;
        String string = a01Var.IiI10X().getString(b01.f5628O1);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        this.access_tokens = string;
        String string2 = a01Var.IiI10X().getString(b01.O1iXiI);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        this.refresh_tokens = string2;
        showLoadPopup(false);
        String str = this.access_tokens;
        if (str != null && str.length() > 0) {
            MusicServerManager.OXO1.XiOIO(this.access_tokens, new Function1() { // from class: com.android.mltcode.paycertificationapi.sx0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerV2Activity.onBottomTeraBoxClick$lambda$0(this.f11151IO, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            dismissLoadPopup();
            startActivity(new Intent(this, (Class<?>) TeraBoxFileManagerActivity.class));
        }
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public void onCancel(@aa1 View view) {
        go0 go0Var;
        Intrinsics.X0O(view, "view");
        boolean z = this.isDownLoading;
        Integer numValueOf = Integer.valueOf(R.string.cancel);
        if (!z) {
            go0 go0Var2 = new go0(getMContext(), 0, 2, null);
            go0Var2.O1O(R.string.cancel_transfer);
            go0Var2.m1865iX(Integer.valueOf(R.string.cancel_transfer_music_tip));
            go0Var2.IXXOO(1);
            go0Var2.iX1O1(numValueOf, new Function0() { // from class: com.android.mltcode.paycertificationapi.hy0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MusicManagerV2Activity.onCancel$lambda$1$0());
                }
            });
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iy0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MusicManagerV2Activity.onCancel$lambda$1$1(this.f8793IO));
                }
            });
            go0Var2.IIX1OXO();
            return;
        }
        if (this.mDownTipPopup == null) {
            go0 go0Var3 = new go0(getMContext(), 0, 2, null);
            go0Var3.O1O(R.string.cancle_download);
            go0Var3.m1865iX(Integer.valueOf(R.string.cancle_download_tip));
            go0Var3.IXXOO(1);
            go0Var3.iX1O1(numValueOf, new Function0() { // from class: com.android.mltcode.paycertificationapi.fy0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MusicManagerV2Activity.onCancel$lambda$0$0());
                }
            });
            go0Var3.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.gy0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(MusicManagerV2Activity.onCancel$lambda$0$1(this.f6991IO));
                }
            });
            this.mDownTipPopup = go0Var3;
        }
        go0 go0Var4 = this.mDownTipPopup;
        if ((go0Var4 == null || !go0Var4.isShowing()) && (go0Var = this.mDownTipPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public void onMusicFileTransferStart() {
        super.onMusicFileTransferStart();
        getTaskPanel().setVisibility(0);
        getMAddPhoneBottom().setEnabled(false);
        getMAddTeraBottom().setEnabled(false);
        getMAddServerBottom().setEnabled(false);
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public void onMusicFileTransferStop() {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.vx0
            @Override // java.lang.Runnable
            public final void run() {
                MusicManagerV2Activity.onMusicFileTransferStop$lambda$0(this.f11834IO);
            }
        });
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public void preventUse(boolean z) {
        super.preventUse(z);
        getMAddPhoneBottom().setEnabled(!z);
        getMAddTeraBottom().setEnabled(!z);
        getMAddServerBottom().setEnabled(!z);
    }

    public final void setAccess_tokens(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.access_tokens = str;
    }

    public final void setDownLoading(boolean z) {
        this.isDownLoading = z;
    }

    public final void setMDownTipPopup(@tb1 go0 go0Var) {
        this.mDownTipPopup = go0Var;
    }

    public final void setMOSSBucket(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mOSSBucket = str;
    }

    public final void setMOSSClient(@tb1 OSSClient oSSClient) {
        this.mOSSClient = oSSClient;
    }

    public final void setMSeverMusicCheckList(@tb1 List<ServerOSSMusicItem> list) {
        this.mSeverMusicCheckList = list;
    }

    public final void setRefresh_tokens(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.refresh_tokens = str;
    }

    public final void setStopDownLoading(boolean z) {
        this.isStopDownLoading = z;
    }

    @sf5(tag = b01.OI1i1i)
    public final void severMusicCheckList(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Collection collectionM39402iI;
        Intrinsics.X0O(data, "data");
        this.mDLinkList.clear();
        List<ServerOSSMusicItem> list = this.mSeverMusicCheckList;
        if (list != null) {
            list.clear();
        }
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.OI1i1i)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), ServerOSSMusicItem.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        List<ServerOSSMusicItem> listOO0Oi10 = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        this.mSeverMusicCheckList = listOO0Oi10;
        if (listOO0Oi10 == null || !listOO0Oi10.isEmpty()) {
            preventUse(false);
            MusicServerManager.OXO1.XX0(new Function1() { // from class: com.android.mltcode.paycertificationapi.ux0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MusicManagerV2Activity.severMusicCheckList$lambda$0(this.f11591IO, (Pair) obj);
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.device.MusicManagerActivity
    public void showFreeSpace() {
        getTvFreeSpace().setVisibility(q62.OXO1.XI1O1111i() ? 0 : 8);
        BleSDCardInfo bleSDCardInfo = (BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null);
        getTvFreeSpace().setText(getString(R.string.storage_item) + " " + cp5.iiIOiX(bleSDCardInfo, false, 2, null));
    }

    @sf5(tag = b01.IOi1O0)
    public final void teraBoxCheckList(@aa1 Object data) {
        Collection collectionM39402iI;
        Intrinsics.X0O(data, "data");
        try {
            JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.IOi1O0)).getAsJsonArray();
            Intrinsics.XXI(asJsonArray);
            collectionM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                collectionM39402iI.add(new Gson().fromJson(it.next(), TeraBoxListItem.class));
            }
        } catch (Exception unused) {
            collectionM39402iI = CollectionsKt__CollectionsKt.m39402iI();
        }
        this.checkList = CollectionsKt___CollectionsKt.OO0Oi10(collectionM39402iI);
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().remove(b01.IOi1O0);
        if (this.access_tokens.length() == 0) {
            String string = a01Var.IiI10X().getString(b01.f5628O1);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            this.access_tokens = string;
        }
        if (this.checkList.size() == 0) {
            return;
        }
        getMAddPhoneBottom().setEnabled(false);
        getMAddTeraBottom().setEnabled(false);
        getMAddServerBottom().setEnabled(false);
        ArrayList arrayList = new ArrayList();
        List<TeraBoxListItem> list = this.checkList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(arrayList.add(Long.valueOf(((TeraBoxListItem) it2.next()).getFs_id()))));
        }
        this.mDLinkList.clear();
        List<ServerOSSMusicItem> list2 = this.mSeverMusicCheckList;
        if (list2 != null) {
            list2.clear();
        }
        this.isStopDownLoading = false;
        MusicServerManager.OXO1.OIi0(this.access_tokens, arrayList, new Function1() { // from class: com.android.mltcode.paycertificationapi.tx0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicManagerV2Activity.teraBoxCheckList$lambda$1(this.f11381IO, (List) obj);
            }
        });
    }
}
