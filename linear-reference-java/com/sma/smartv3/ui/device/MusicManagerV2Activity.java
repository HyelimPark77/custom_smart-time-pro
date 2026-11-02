package com.sma.smartv3.ui.device;

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
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ay0;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.by0;
import com.android.mltcode.paycertificationapi.bz5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cy0;
import com.android.mltcode.paycertificationapi.dy0;
import com.android.mltcode.paycertificationapi.ey0;
import com.android.mltcode.paycertificationapi.fy0;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.gy0;
import com.android.mltcode.paycertificationapi.hy0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iy0;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qx0;
import com.android.mltcode.paycertificationapi.rx0;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sx0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tx0;
import com.android.mltcode.paycertificationapi.ux0;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.vx0;
import com.android.mltcode.paycertificationapi.wx0;
import com.android.mltcode.paycertificationapi.yx0;
import com.android.mltcode.paycertificationapi.zx0;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nMusicManagerV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,537:1\n69#2,3:538\n72#2,5:542\n69#2,3:568\n72#2,5:572\n69#2,3:587\n72#2,5:591\n69#2,3:596\n72#2,5:600\n1#3:541\n1#3:571\n1#3:590\n1#3:599\n50#4,3:547\n53#4:553\n55#4,2:555\n50#4,3:577\n53#4:583\n55#4,2:585\n1563#5:550\n1634#5,2:551\n1636#5:554\n1563#5:557\n1634#5,3:558\n230#5,2:561\n1563#5:564\n1634#5,3:565\n1563#5:580\n1634#5,2:581\n1636#5:584\n1563#5:605\n1634#5,3:606\n1563#5:609\n1634#5,3:610\n36#6:563\n*S KotlinDebug\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity\n*L\n117#1:538,3\n117#1:542,5\n409#1:568,3\n409#1:572,5\n111#1:587,3\n111#1:591,5\n106#1:596,3\n106#1:600,5\n117#1:541\n409#1:571\n111#1:590\n106#1:599\n131#1:547,3\n131#1:553\n131#1:555,2\n417#1:577,3\n417#1:583\n417#1:585,2\n131#1:550\n131#1:551,2\n131#1:554\n144#1:557\n144#1:558,3\n171#1:561,2\n269#1:564\n269#1:565,3\n417#1:580\n417#1:581,2\n417#1:584\n321#1:605\n321#1:606,3\n377#1:609\n377#1:610,3\n216#1:563\n*E\n"})
public final class MusicManagerV2Activity extends MusicManagerActivity {

    @aa1
    private String access_tokens;

    @aa1
    private List<TeraBoxListItem> checkList;
    private int downLoadIndex;
    private boolean isDownLoading;
    private boolean isStopDownLoading;

    @aa1
    private final Lazy mAddPhoneBottom$delegate;

    @aa1
    private final Lazy mAddServerBottom$delegate;

    @aa1
    private final Lazy mAddTeraBottom$delegate;

    @aa1
    private List<TeraBoxItemDLink> mDLinkList;

    @tb1
    private go0 mDownTipPopup;

    @aa1
    private String mOSSBucket;

    @tb1
    private OSSClient mOSSClient;

    @tb1
    private List<ServerOSSMusicItem> mSeverMusicCheckList;

    @aa1
    private List<TransmissionMusicItem> mTransmissionMusicList;

    @aa1
    private final Lazy musicInformation$delegate;

    @aa1
    private final Lazy musicRecyclerView$delegate;

    @aa1
    private String refresh_tokens;

    @aa1
    private final Lazy tvDownloadingProgress$delegate;

    @SourceDebugExtension({"SMAP\nMusicManagerV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,537:1\n36#2:538\n*S KotlinDebug\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n*L\n482#1:538\n*E\n"})
    public static final class OXO1 implements OSSCompletedCallback<GetObjectRequest, GetObjectResult> {
        public final /* synthetic */ MusicManagerV2Activity OXO1;
        public final /* synthetic */ ServerOSSMusicItem XIi00iiXO;

        public OXO1(MusicManagerV2Activity r1, ServerOSSMusicItem r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public void OXO1(GetObjectRequest r3, ClientException r4, ServiceException r5) {
            Intrinsics.X0O(r4, "clientException");
            Intrinsics.X0O(r5, "serviceException");
            if (this.OXO1.isStopDownLoading() == true) goto L5;
            ToastUtils.showLong("Music DownLoad Error", new Object[0]);
            MusicManagerV2Activity.access$severMusicNextMusic(this.OXO1);
        L6:
            i1O0OXO1O r6 = i1O0OXO1O.OXO1;
            r6.XIi00iiXO(this.OXO1.getTAG() + " ErrorCode " + r5.getErrorCode());
            r6.XIi00iiXO(this.OXO1.getTAG() + " RequestId  " + r5.getRequestId());
            r6.XIi00iiXO(this.OXO1.getTAG() + " HostId   " + r5.getHostId());
            r6.XIi00iiXO(this.OXO1.getTAG() + " RawMessag   " + r5.getRawMessage());
            return;
        L5:
            this.OXO1.onMusicFileTransferStop();
            goto L6
        }

        public void XIi00iiXO(GetObjectRequest r9, GetObjectResult r10) {
            Intrinsics.X0O(r10, "result");
            long r0 = r10.getContentLength();
            if (r0 <= 0) goto L32;
            int r2 = (int) r0;
            byte[] r3 = new byte[r2];
            int r5 = 0;
        L6:
            if (r5 < r0) goto L25;
            sz0 r1 = sz0.OXO1;     // Catch: Exception -> L17
            FileOutputStream r11 = new FileOutputStream(new File(uz0.O001I(r1), this.XIi00iiXO.getTitle()));     // Catch: Exception -> L17
            r11.write(r3);     // Catch: Exception -> L17
            r11.close();     // Catch: Exception -> L17
            if (this.OXO1.isStopDownLoading() == true) goto L33;
            this.OXO1.setMDownSuccessSize(this.OXO1.getMDownSuccessSize() + 1);     // Catch: Exception -> L17
            List r12 = MusicManagerV2Activity.access$getMTransmissionMusicList$p(this.OXO1);     // Catch: Exception -> L17
            String r4 = new File(uz0.O001I(r1), this.XIi00iiXO.getTitle()).getAbsolutePath();     // Catch: Exception -> L17
            Intrinsics.O10IXXX0X(r4, "getAbsolutePath(...)");     // Catch: Exception -> L17
            String r6 = new File(uz0.O001I(r1), this.XIi00iiXO.getTitle()).toURI().toString();     // Catch: Exception -> L17
            Intrinsics.O10IXXX0X(r6, "toString(...)");     // Catch: Exception -> L17
            String r7 = Uri.fromFile(new File(uz0.O001I(r1), this.XIi00iiXO.getTitle())).toString();     // Catch: Exception -> L17
            Intrinsics.O10IXXX0X(r7, "toString(...)");     // Catch: Exception -> L17
            r12.add(new TransmissionMusicItem(r4, r6, r7, this.XIi00iiXO.getTitle()));     // Catch: Exception -> L17
            MusicManagerV2Activity.access$severMusicNextMusic(this.OXO1);     // Catch: Exception -> L17
            return;
        L33:
            return;
        L17:
            e = move-exception;
            OSSLog.logInfo(e.toString());
            i1O0OXO1O.OXO1.XIi00iiXO(this.OXO1.getTAG() + " FileOutputStream " + e);
            if (this.OXO1.isStopDownLoading() == true) goto L21;
            ToastUtils.showLong("Music DownLoad Error", new Object[0]);
            MusicManagerV2Activity.access$severMusicNextMusic(this.OXO1);
            return;
        L21:
            this.OXO1.onMusicFileTransferStop();
            return;
        L25:
            r5 = r5 + r10.getObjectContent().read(r3, r5, r2 - r5);     // Catch: Exception -> L11
            if (this.OXO1.isStopDownLoading() == true) goto L6;
            MusicManagerV2Activity.access$refreshTaskPanelDownLoad(this.OXO1, (r5 * 100) / r2);     // Catch: Exception -> L11
        L11:
            e = move-exception;
            OSSLog.logInfo(e.toString());
            goto L6
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onFailure(OSSRequest r1, ClientException r2, ServiceException r3) {
            OXO1((GetObjectRequest) r1, r2, r3);
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onSuccess(OSSRequest r1, OSSResult r2) {
            XIi00iiXO((GetObjectRequest) r1, (GetObjectResult) r2);
        }
    }

    public MusicManagerV2Activity() {
        this.mAddPhoneBottom$delegate = LazyKt__LazyJVMKt.iO(new qx0(this));
        this.mAddTeraBottom$delegate = LazyKt__LazyJVMKt.iO(new ay0(this));
        this.mAddServerBottom$delegate = LazyKt__LazyJVMKt.iO(new by0(this));
        this.musicInformation$delegate = LazyKt__LazyJVMKt.iO(new cy0(this));
        this.tvDownloadingProgress$delegate = LazyKt__LazyJVMKt.iO(new dy0(this));
        this.musicRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new ey0(this));
        this.checkList = new ArrayList();
        this.mDLinkList = new ArrayList();
        this.mTransmissionMusicList = new ArrayList();
        this.access_tokens = "";
        this.refresh_tokens = "";
        this.mOSSBucket = "";
        setMMusicItemLayout(R.layout.item_music_v2);
        setTransferTip(R.string.music_down_transmit_tip);
    }

    public static /* synthetic */ boolean Ii1iii0() {
        return onCancel$lambda$1$0();
    }

    public static /* synthetic */ void O001I(MusicManagerV2Activity r0) {
        transmissionMusic$lambda$0(r0);
    }

    public static /* synthetic */ Unit OO(MusicManagerV2Activity r0, Pair r1) {
        return severMusicCheckList$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OX110i(MusicManagerV2Activity r0) {
        return tvDownloadingProgress_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X00XIX1(MusicManagerV2Activity r0, List r1) {
        return teraBoxCheckList$lambda$1(r0, r1);
    }

    public static /* synthetic */ Button X100O(MusicManagerV2Activity r0) {
        return mAddServerBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X11I(MusicManagerV2Activity r0) {
        onMusicFileTransferStop$lambda$0(r0);
    }

    public static /* synthetic */ Unit XO0X10iO(MusicManagerV2Activity r0, boolean r1) {
        return onBottomTeraBoxClick$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XOX0O0(MusicManagerV2Activity r0, TeraBoxListItem r1, Integer r2) {
        return downLoadLink$lambda$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit XX1Oi(MusicManagerV2Activity r0, boolean r1) {
        return onBottomTeraBoxClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ View XXO(MusicManagerV2Activity r0) {
        return musicInformation_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ List access$getMTransmissionMusicList$p(MusicManagerV2Activity r0) {
        return r0.mTransmissionMusicList;
    }

    public static final /* synthetic */ void access$refreshTaskPanelDownLoad(MusicManagerV2Activity r0, int r1) {
        r0.refreshTaskPanelDownLoad(r1);
    }

    public static final /* synthetic */ void access$severMusicNextMusic(MusicManagerV2Activity r0) {
        r0.severMusicNextMusic();
    }

    private final void downLastSeverMusic() {
        String r0 = this.mOSSBucket;
        List<ServerOSSMusicItem> r1 = this.mSeverMusicCheckList;
        Intrinsics.XXI(r1);
        ServerOSSMusicItem r2 = r1.get(this.downLoadIndex);
        OSSClient r3 = this.mOSSClient;
        Intrinsics.XXI(r3);
        downOSSMusicLink(r0, r2, r3);
    }

    private static final Unit downLoadLink$lambda$1(MusicManagerV2Activity r3, TeraBoxListItem r4, Integer r5) {
        if (r5 != null) goto L6;
    L10:
        IntRange r1 = new IntRange(0, 100);
        if (r5 != null) goto L13;
    L17:
        if (r5 != null) goto L20;
    L24:
        r3.onMusicFileTransferStop();
        ToastUtils.showLong("Music Error " + r5, new Object[0]);
    L26:
        return Unit.OXO1;
    L20:
        if (r5.intValue() != 200) goto L24;
        if (r3.isStopDownLoading == true) goto L26;
        r3.setMDownSuccessSize(r3.getMDownSuccessSize() + 1);
        r3.downSuccess(r4);
        goto L26
    L13:
        if (r1.OIX0iXi(r5.intValue()) == false) goto L17;
        if (r3.isStopDownLoading == true) goto L26;
        Intrinsics.XXI(r5);
        r3.refreshTaskPanelDownLoad(r5.intValue());
        goto L26
    L6:
        if (r5.intValue() != (-1)) goto L10;
        if (r3.isStopDownLoading == true) goto L26;
        ToastUtils.showLong("Music DownLoad Error", new Object[0]);
        r3.nextMusic();
        goto L26
    }

    private final void downOSSMusicLink(String r3, ServerOSSMusicItem r4, OSSClient r5) {
        r5.asyncGetObject(new GetObjectRequest(r3, r4.getPath()), new OXO1(this, r4));
    }

    private final void downSuccess(TeraBoxListItem r9) {
        List<TransmissionMusicItem> r0 = this.mTransmissionMusicList;
        sz0 r3 = sz0.OXO1;
        String r2 = new File(uz0.O001I(r3), r9.getServer_filename()).getAbsolutePath();
        Intrinsics.O10IXXX0X(r2, "getAbsolutePath(...)");
        String r4 = new File(uz0.O001I(r3), r9.getServer_filename()).toURI().toString();
        Intrinsics.O10IXXX0X(r4, "toString(...)");
        String r5 = Uri.fromFile(new File(uz0.O001I(r3), r9.getServer_filename())).toString();
        Intrinsics.O10IXXX0X(r5, "toString(...)");
        r0.add(new TransmissionMusicItem(r2, r4, r5, r9.getServer_filename()));
        nextMusic();
    }

    private final Button getMAddPhoneBottom() {
        return (Button) getValue();
    }

    private final Button getMAddServerBottom() {
        return (Button) getValue();
    }

    private final Button getMAddTeraBottom() {
        return (Button) getValue();
    }

    private final View getMusicInformation() {
        return (View) getValue();
    }

    private final View getMusicRecyclerView() {
        return (View) getValue();
    }

    private final TextView getTvDownloadingProgress() {
        return (TextView) getValue();
    }

    public static /* synthetic */ boolean i0X000X0O(MusicManagerV2Activity r0) {
        return onCancel$lambda$1$1(r0);
    }

    public static /* synthetic */ View i11I(MusicManagerV2Activity r0) {
        return musicRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iIXi1iiXI() {
        return onCancel$lambda$0$0();
    }

    public static /* synthetic */ void iOiXi11II(MusicManagerV2Activity r0, int r1) {
        refreshTaskPanelDownLoad$lambda$0(r0, r1);
    }

    public static /* synthetic */ Button iXiX011(MusicManagerV2Activity r0) {
        return mAddTeraBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button iXiiiO(MusicManagerV2Activity r0) {
        return mAddPhoneBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iiiO(MusicManagerV2Activity r0) {
        return onCancel$lambda$0$1(r0);
    }

    private static final Button mAddPhoneBottom_delegate$lambda$0(MusicManagerV2Activity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final Button mAddServerBottom_delegate$lambda$0(MusicManagerV2Activity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom_server);
    }

    private static final Button mAddTeraBottom_delegate$lambda$0(MusicManagerV2Activity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom_tera_box);
    }

    private static final View musicInformation_delegate$lambda$0(MusicManagerV2Activity r1) {
        return r1.findViewById(R.id.task_panel_music_layout);
    }

    private static final View musicRecyclerView_delegate$lambda$0(MusicManagerV2Activity r1) {
        return r1.findViewById(R.id.music_v2_recycler_layout);
    }

    private final void nextMusic() {
        if (this.isStopDownLoading == false) goto L5;
        return;
    L5:
        int r0 = this.downLoadIndex + 1;
        this.downLoadIndex = r0;
        if (r0 < this.mDLinkList.size()) goto L9;
        transmissionMusic();
        return;
    L9:
        downLoadLink();
    }

    private static final Unit onBottomTeraBoxClick$lambda$0(final MusicManagerV2Activity r2, boolean r3) {
        if (r3 == true) goto L8;
        String r4 = r2.refresh_tokens;
        if (r4 == null) goto L8;
        if (r4.length() <= 0) goto L8;
        MusicServerManager.OXO1.I1XOi1(r2.refresh_tokens, new rx0(r2));
    L10:
        return Unit.OXO1;
    L8:
        r2.dismissLoadPopup();
        r2.startActivity(new Intent(r2, TeraBoxFileManagerActivity.class));
        goto L10
    }

    private static final Unit onBottomTeraBoxClick$lambda$0$0(MusicManagerV2Activity r1, boolean r2) {
        r1.dismissLoadPopup();
        r1.startActivity(new Intent(r1, TeraBoxFileManagerActivity.class));
        return Unit.OXO1;
    }

    private static final boolean onCancel$lambda$0$0() {
        return true;
    }

    private static final boolean onCancel$lambda$0$1(MusicManagerV2Activity r4) {
        r4.isDownLoading = false;
        r4.isStopDownLoading = true;
        r4.stopDownLoadRefreshProgress();
        MusicServerManager.OXO1.OXO1();
        r4.mDLinkList.clear();
        List<ServerOSSMusicItem> r2 = r4.mSeverMusicCheckList;
        if (r2 == null) goto L5;
        r2.clear();
    L5:
        r4.getMusicRecyclerView().setVisibility(0);
        r4.getTaskPanel().setVisibility(8);
        r4.getMAddPhoneBottom().setEnabled(true);
        r4.getMAddTeraBottom().setEnabled(true);
        r4.getMAddServerBottom().setEnabled(true);
        if (r4.mTransmissionMusicList.size() <= 0) goto L12;
        List<TransmissionMusicItem> r0 = r4.mTransmissionMusicList;
        ArrayList r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r1 = r0.iterator();
    L9:
        if (r1.hasNext() == false) goto L11;
        r3.add(Boolean.valueOf(FileUtils.delete(((TransmissionMusicItem) r1.next()).getPath())));
        goto L9
    L11:
        r4.mTransmissionMusicList.clear();
    L12:
        return true;
    }

    private static final boolean onCancel$lambda$1$0() {
        return true;
    }

    private static final boolean onCancel$lambda$1$1(MusicManagerV2Activity r2) {
        XIi00iiXO.OXO1.O001I();
        r2.getTaskPanel().setVisibility(8);
        r2.getMAddPhoneBottom().setEnabled(true);
        r2.getMAddTeraBottom().setEnabled(true);
        r2.getMAddServerBottom().setEnabled(true);
        return true;
    }

    private static final void onMusicFileTransferStop$lambda$0(MusicManagerV2Activity r3) {
        r3.getMusicRecyclerView().setVisibility(0);
        r3.getTaskPanel().setVisibility(8);
        r3.getMAddPhoneBottom().setEnabled(true);
        r3.getMAddTeraBottom().setEnabled(true);
        r3.getMAddServerBottom().setEnabled(true);
        r3.showLoadPopup(false);
        r3.browToDirDeviceFile();
        if (r3.mTransmissionMusicList.size() <= 0) goto L11;
        List<TransmissionMusicItem> r0 = r3.mTransmissionMusicList;
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L6:
        if (r2.hasNext() == false) goto L8;
        r1.add(Boolean.valueOf(FileUtils.delete(((TransmissionMusicItem) r2.next()).getPath())));
        goto L6
    L8:
        r3.mTransmissionMusicList.clear();
        return;
    }

    private final void refreshTaskPanelDownLoad(final int r2) {
        runOnUiThread(new wx0(this, r2));
    }

    private static final void refreshTaskPanelDownLoad$lambda$0(MusicManagerV2Activity r4, int r5) {
        r4.getTvProgressTip().setText(R.string.tera_box_music_downloading);
        TextView r0 = r4.getTvTotalProgress();
        int r1 = r4.downLoadIndex + 1;
        if (r4.mSeverMusicCheckList != null) goto L5;
    L10:
        List r2 = r4.mDLinkList;
    L8:
        Integer r3 = Integer.valueOf(r2.size());
    L11:
        r0.setText(r1 + "/ " + r3);
        r4.getPbProgress().setProgress(r5);
        r4.getTvDownloadingProgress().setText(r5 + "%");
        return;
    L5:
        if (r4.mDLinkList.size() != 0) goto L10;
        r2 = r4.mSeverMusicCheckList;
        if (r2 != null) goto L8;
        r3 = null;
        goto L11
    }

    private static final Unit severMusicCheckList$lambda$0(MusicManagerV2Activity r2, Pair r3) {
        Intrinsics.X0O(r3, uz0.iXiiiO);
        int r0 = ((Number) r3.getSecond()).intValue();
        if (r0 == 0) goto L6;
        if (r0 == 1) goto L6;
    L11:
        return Unit.OXO1;
    L6:
        UploadOSSWorker.StsRamData r4 = (UploadOSSWorker.StsRamData) r3.getFirst();
        OSSClient r1 = MusicServerManager.OXO1.XIi00iiXO(r4);
        r2.mOSSClient = r1;
        if (r4 == null) goto L11;
        if (r1 == null) goto L11;
        r2.downLoadingShowView();
        r2.refreshTaskPanelDownLoad(0);
        r2.downLoadIndex = 0;
        r2.isDownLoading = true;
        r2.mOSSBucket = r4.getBucket();
        r2.downLastSeverMusic();
        goto L11
    }

    private final void severMusicNextMusic() {
        if (this.isStopDownLoading == false) goto L5;
        return;
    L5:
        int r0 = this.downLoadIndex + 1;
        this.downLoadIndex = r0;
        List<ServerOSSMusicItem> r1 = this.mSeverMusicCheckList;
        Intrinsics.XXI(r1);
        if (r0 < r1.size()) goto L9;
        transmissionMusic();
        return;
    L9:
        downLastSeverMusic();
    }

    private final void stopDownLoadRefreshProgress() {
        getTvProgressTip().setText(R.string.tera_box_music_downloading);
        getTvTotalProgress().setText("");
        getPbProgress().setProgress(0);
        getTvDownloadingProgress().setText("");
    }

    private static final Unit teraBoxCheckList$lambda$1(MusicManagerV2Activity r1, List r2) {
        if (r2 == null) goto L4;
        r1.mDLinkList = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        r1.downLoadIndex = 0;
        r1.setMDownSuccessSize(0);
        ToastUtils.showLong(r1.getString(R.string.music_down_transmit_tip), new Object[0]);
        r1.downLoadLink();
    L6:
        return Unit.OXO1;
    L4:
        r1.onMusicFileTransferStop();
        ToastUtils.showLong(R.string.get_music_down_link_error);
        goto L6
    }

    private final void transmissionMusic() {
        runOnUiThread(new yx0(this));
        if (this.mDLinkList.size() != 0) goto L10;
        List<ServerOSSMusicItem> r0 = this.mSeverMusicCheckList;
        if (r0 == null) goto L10;
        Intrinsics.XXI(r0);
        if ((r0.size() - getMDownSuccessSize()) < 0) goto L13;
        List<ServerOSSMusicItem> r1 = this.mSeverMusicCheckList;
        Intrinsics.XXI(r1);
        ToastUtils.showLong(getString(R.string.download_error_tip, new Object[]{Integer.valueOf(r1.size() - getMDownSuccessSize()), Integer.valueOf(getMDownSuccessSize())}), new Object[0]);
    L13:
        if (this.mTransmissionMusicList.size() <= 0) goto L24;
        XIi00iiXO r2 = XIi00iiXO.OXO1;
        List<TransmissionMusicItem> r3 = this.mTransmissionMusicList;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator<T> r5 = r3.iterator();
    L16:
        if (r5.hasNext() == false) goto L22;
        TransmissionMusicItem r6 = (TransmissionMusicItem) r5.next();
        if (r6.getTitle().length() <= 50) goto L20;
        String r7 = r6.getTitle().substring(0, 50);
        Intrinsics.O10IXXX0X(r7, "substring(...)");
        String r8 = r7 + ".mp3";
    L21:
        r4.add(new bz5(r6.getUrl(), r6.getUri(), r8));
        goto L16
    L20:
        r8 = r6.getTitle();
        goto L21
    L22:
        r2.X0i1O(r4);
        XIi00iiXO.OXO1.iXiX011(getMSDCardBean());
        return;
    L24:
        getTaskPanel().setVisibility(8);
        onMusicFileTransferStop();
        return;
    L10:
        if ((this.mDLinkList.size() - getMDownSuccessSize()) < 0) goto L13;
        ToastUtils.showLong(getString(R.string.download_error_tip, new Object[]{Integer.valueOf(this.mDLinkList.size() - getMDownSuccessSize()), Integer.valueOf(getMDownSuccessSize())}), new Object[0]);
        goto L13
    }

    private static final void transmissionMusic$lambda$0(MusicManagerV2Activity r3) {
        r3.getMusicInformation().setVisibility(0);
        r3.getTvDownloadingProgress().setText("");
        r3.isDownLoading = false;
        go0 r4 = r3.mDownTipPopup;
        if (r4 == null) goto L6;
        r4.dismiss();
        return;
    }

    private static final TextView tvDownloadingProgress_delegate$lambda$0(MusicManagerV2Activity r1) {
        return (TextView) r1.findViewById(R.id.task_panel_music_downloading_tv);
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
    public boolean doTransfer(@aa1 Function0<Unit> r3) {
        Intrinsics.X0O(r3, "action");
        if (this.isDownLoading == false) goto L7;
        ToastUtils.showLong(getString(isTransferTip()), new Object[0]);
        return false;
    L7:
        return super.doTransfer(r3);
    }

    public final void downLoadLink() {
        if (this.mDLinkList.size() > 0) goto L5;
    L15:
        onMusicFileTransferStop();
        return;
    L5:
        if (this.isStopDownLoading == true) goto L15;
        downLoadingShowView();
        refreshTaskPanelDownLoad(0);
        TeraBoxItemDLink r0 = this.mDLinkList.get(this.downLoadIndex);
        Iterator<T> r1 = this.checkList.iterator();
    L8:
        if (r1.hasNext() == false) goto L14;
        final TeraBoxListItem r2 = (TeraBoxListItem) r1.next();
        if (r2.getFs_id() != r0.getFs_id()) goto L8;
        this.isDownLoading = true;
        MusicServerManager.OXO1.XO0O10(r0.getDlink(), this.access_tokens, r2.getServer_filename(), new zx0(this, r2));
        return;
    L14:
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

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
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

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity, com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        Button r0 = getMAddServerBottom();
        i72 r1 = i72.OXO1;
        if (r1.i0iIXiI() == false) goto L5;
        int r2 = 0;
    L6:
        r0.setVisibility(r2);
        Button r3 = getMAddTeraBottom();
        r1.iX00X1X();
        r3.setVisibility(8);
        return;
    L5:
        r2 = 8;
        goto L6
    }

    public final boolean isDownLoading() {
        return this.isDownLoading;
    }

    public final boolean isStopDownLoading() {
        return this.isStopDownLoading;
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_music_manager_v2;
    }

    public final void onBottomServerClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, ServerMusicActivity.class));
    }

    public final void onBottomTeraBoxClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        a01 r4 = a01.OXO1;
        String r0 = r4.IiI10X().getString(b01.O1);
        Intrinsics.O10IXXX0X(r0, "getString(...)");
        this.access_tokens = r0;
        String r5 = r4.IiI10X().getString(b01.O1iXiI);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        this.refresh_tokens = r5;
        showLoadPopup(false);
        String r6 = this.access_tokens;
        if (r6 != null) goto L5;
    L8:
        dismissLoadPopup();
        startActivity(new Intent(this, TeraBoxFileManagerActivity.class));
        return;
    L5:
        if (r6.length() <= 0) goto L8;
        MusicServerManager.OXO1.XiOIO(this.access_tokens, new sx0(this));
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
    public void onCancel(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        boolean r10 = this.isDownLoading;
        Integer r1 = Integer.valueOf(R.string.cancel);
        DefaultConstructorMarker r2 = null;
        int r3 = 2;
        int r4 = 0;
        if (r10 == true) goto L5;
        go0 r11 = new go0(getMContext(), r4, r3, r2);
        r11.O1O(R.string.cancel_transfer);
        r11.iX(Integer.valueOf(R.string.cancel_transfer_music_tip));
        r11.IXXOO(1);
        r11.iX1O1(r1, new hy0());
        r11.X1IX(R.string.confirm, new iy0(this));
        r11.IIX1OXO();
        return;
    L5:
        if (this.mDownTipPopup != null) goto L7;
        go0 r12 = new go0(getMContext(), r4, r3, r2);
        r12.O1O(R.string.cancle_download);
        r12.iX(Integer.valueOf(R.string.cancle_download_tip));
        r12.IXXOO(1);
        r12.iX1O1(r1, new fy0());
        r12.X1IX(R.string.confirm, new gy0(this));
        this.mDownTipPopup = r12;
    L7:
        go0 r13 = this.mDownTipPopup;
        if (r13 != null) goto L10;
    L12:
        go0 r14 = this.mDownTipPopup;
        if (r14 == null) goto L18;
        r14.IIX1OXO();
        return;
    L18:
        return;
    L10:
        if (r13.isShowing() != true) goto L12;
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
    public void onMusicFileTransferStart() {
        super.onMusicFileTransferStart();
        getTaskPanel().setVisibility(0);
        getMAddPhoneBottom().setEnabled(false);
        getMAddTeraBottom().setEnabled(false);
        getMAddServerBottom().setEnabled(false);
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
    public void onMusicFileTransferStop() {
        runOnUiThread(new vx0(this));
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
    public void preventUse(boolean r3) {
        super.preventUse(r3);
        getMAddPhoneBottom().setEnabled(!r3);
        getMAddTeraBottom().setEnabled(!r3);
        getMAddServerBottom().setEnabled(!r3);
    }

    public final void setAccess_tokens(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.access_tokens = r2;
    }

    public final void setDownLoading(boolean r1) {
        this.isDownLoading = r1;
    }

    public final void setMDownTipPopup(@tb1 go0 r1) {
        this.mDownTipPopup = r1;
    }

    public final void setMOSSBucket(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mOSSBucket = r2;
    }

    public final void setMOSSClient(@tb1 OSSClient r1) {
        this.mOSSClient = r1;
    }

    public final void setMSeverMusicCheckList(@tb1 List<ServerOSSMusicItem> r1) {
        this.mSeverMusicCheckList = r1;
    }

    public final void setRefresh_tokens(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.refresh_tokens = r2;
    }

    public final void setStopDownLoading(boolean r1) {
        this.isStopDownLoading = r1;
    }

    @sf5(tag = b01.OI1i1i)
    public final void severMusicCheckList(@aa1 Object r5) {
        Intrinsics.X0O(r5, "data");
        this.mDLinkList.clear();
        List<ServerOSSMusicItem> r6 = this.mSeverMusicCheckList;
        if (r6 == null) goto L19;
        r6.clear();
    L19:
        JsonArray r7 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.OI1i1i)).getAsJsonArray();     // Catch: Exception -> L11
        Intrinsics.XXI(r7);     // Catch: Exception -> L11
        Collection r0 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r7, 10));     // Catch: Exception -> L11
        Iterator<JsonElement> r8 = r7.iterator();     // Catch: Exception -> L11
    L8:
        if (r8.hasNext() == false) goto L12;
        JsonElement r1 = r8.next();     // Catch: Exception -> L11
        r0.add(new Gson().fromJson(r1, ServerOSSMusicItem.class));     // Catch: Exception -> L11
    L12:
        List<ServerOSSMusicItem> r9 = CollectionsKt___CollectionsKt.OO0Oi10(r0);
        this.mSeverMusicCheckList = r9;
        if (r9 != null) goto L15;
    L17:
        preventUse(false);
        MusicServerManager.OXO1.XX0(new ux0(this));
        return;
    L15:
        if (r9.isEmpty() != true) goto L17;
        return;
    L11:
        r0 = CollectionsKt__CollectionsKt.iI();
        goto L12
    }

    @Override // com.sma.smartv3.ui.device.MusicManagerActivity
    public void showFreeSpace() {
        TextView r0 = getTvFreeSpace();
        if (q62.OXO1.XI1O1111i() == false) goto L5;
        int r1 = 0;
    L6:
        r0.setVisibility(r1);
        BleSDCardInfo r2 = (BleSDCardInfo) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.SDCARD_INFO, BleSDCardInfo.class, null, 4, null);
        getTvFreeSpace().setText(getString(R.string.storage_item) + " " + cp5.iiIOiX(r2, false, 2, null));
        return;
    L5:
        r1 = 8;
        goto L6
    }

    @sf5(tag = b01.IOi1O0)
    public final void teraBoxCheckList(@aa1 Object r7) {
        Intrinsics.X0O(r7, "data");
        JsonArray r8 = JsonParser.parseString(a01.OXO1.IiI10X().getString(b01.IOi1O0)).getAsJsonArray();     // Catch: Exception -> L8
        Intrinsics.XXI(r8);     // Catch: Exception -> L8
        Collection r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r8, 10));     // Catch: Exception -> L8
        Iterator<JsonElement> r9 = r8.iterator();     // Catch: Exception -> L8
    L5:
        if (r9.hasNext() == false) goto L9;
        JsonElement r3 = r9.next();     // Catch: Exception -> L8
        r2.add(new Gson().fromJson(r3, TeraBoxListItem.class));     // Catch: Exception -> L8
    L9:
        this.checkList = CollectionsKt___CollectionsKt.OO0Oi10(r2);
        a01 r10 = a01.OXO1;
        r10.IiI10X().remove(b01.IOi1O0);
        if (this.access_tokens.length() != 0) goto L13;
        String r11 = r10.IiI10X().getString(b01.O1);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        this.access_tokens = r11;
    L13:
        if (this.checkList.size() != 0) goto L15;
        return;
    L15:
        getMAddPhoneBottom().setEnabled(false);
        getMAddTeraBottom().setEnabled(false);
        getMAddServerBottom().setEnabled(false);
        ArrayList r12 = new ArrayList();
        List<TeraBoxListItem> r4 = this.checkList;
        ArrayList r5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r4, 10));
        Iterator<T> r1 = r4.iterator();
    L17:
        if (r1.hasNext() == false) goto L19;
        r5.add(Boolean.valueOf(r12.add(Long.valueOf(((TeraBoxListItem) r1.next()).getFs_id()))));
        goto L17
    L19:
        this.mDLinkList.clear();
        List<ServerOSSMusicItem> r6 = this.mSeverMusicCheckList;
        if (r6 == null) goto L22;
        r6.clear();
    L22:
        this.isStopDownLoading = false;
        MusicServerManager.OXO1.OIi0(this.access_tokens, r12, new tx0(this));
        return;
    L8:
        r2 = CollectionsKt__CollectionsKt.iI();
        goto L9
    }
}
