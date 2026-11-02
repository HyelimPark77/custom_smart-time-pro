package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.model.ListObjectsRequest;
import com.alibaba.sdk.android.oss.model.ListObjectsResult;
import com.alibaba.sdk.android.oss.model.OSSObjectSummary;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.j34;
import com.android.mltcode.paycertificationapi.k34;
import com.android.mltcode.paycertificationapi.l34;
import com.android.mltcode.paycertificationapi.m34;
import com.android.mltcode.paycertificationapi.n34;
import com.android.mltcode.paycertificationapi.o34;
import com.android.mltcode.paycertificationapi.p34;
import com.android.mltcode.paycertificationapi.q34;
import com.android.mltcode.paycertificationapi.r34;
import com.android.mltcode.paycertificationapi.s34;
import com.android.mltcode.paycertificationapi.t34;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.u34;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.MusicServerManager;
import com.sma.smartv3.model.ServerOSSMusicItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.work.UploadOSSWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n1563#2:359\n1634#2,3:360\n774#2:365\n865#2,2:366\n1869#2,2:368\n1563#2:373\n1634#2,2:374\n1636#2:377\n35#3,2:363\n50#3,3:370\n53#3:376\n55#3,2:378\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n*L\n148#1:359\n148#1:360,3\n81#1:365\n81#1:366,2\n84#1:368,2\n104#1:373\n104#1:374,2\n104#1:377\n352#1:363,2\n104#1:370,3\n104#1:376\n104#1:378,2\n*E\n"})
public final class ServerMusicActivity extends BaseActivity {

    @aa1
    private final String TAG;
    private int getMusicNumber;

    @tb1
    private MultiItemTypeAdapter<ServerOSSMusicItem> mAdapter;

    @aa1
    private final Lazy mButton$delegate;

    @aa1
    private final List<String> mCacheList;

    @aa1
    private final ArrayList<ServerOSSMusicItem> mCheckedListID;

    @aa1
    private final Lazy mClearImageView$delegate;

    @aa1
    private String mCurDir;

    @aa1
    private final Lazy mEditText$delegate;

    @aa1
    private final Lazy mEmptyView$delegate;

    @aa1
    private final HashMap<String, List<ServerOSSMusicItem>> mMapData;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mSearchImageView$delegate;

    @aa1
    private final Lazy mTitle$delegate;

    @aa1
    private final String musicPath;

    @aa1
    private String nextMarker;

    @aa1
    private final List<ServerOSSMusicItem> rootList;

    @SourceDebugExtension({"SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n35#2,2:359\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n*L\n197#1:359,2\n*E\n"})
    public static final class OXO1 implements OSSCompletedCallback<ListObjectsRequest, ListObjectsResult> {
        public final /* synthetic */ ServerMusicActivity OXO1;
        public final /* synthetic */ String XIi00iiXO;
        public final /* synthetic */ OSSClient iO;

        public OXO1(ServerMusicActivity r1, String r2, OSSClient r3) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
        }

        public void OXO1(ListObjectsRequest r4, ClientException r5, ServiceException r6) {
            Intrinsics.X0O(r5, "clientException");
            Intrinsics.X0O(r6, "serviceException");
            ToastUtils.showLong(R.string.request_error);
            i1O0OXO1O r7 = i1O0OXO1O.OXO1;
            r7.XIi00iiXO(ServerMusicActivity.access$getTAG$p(this.OXO1) + " ErrorCode " + r6.getErrorCode());
            r5.printStackTrace();
            r7.XIi00iiXO(ServerMusicActivity.access$getTAG$p(this.OXO1) + " ErrorCode " + r6.getErrorCode());
            r7.XIi00iiXO(ServerMusicActivity.access$getTAG$p(this.OXO1) + " RequestId  " + r6.getRequestId());
            r7.XIi00iiXO(ServerMusicActivity.access$getTAG$p(this.OXO1) + " HostId   " + r6.getHostId());
            r7.XIi00iiXO(ServerMusicActivity.access$getTAG$p(this.OXO1) + " RawMessag   " + r6.getRawMessage());
        }

        public void XIi00iiXO(ListObjectsRequest r5, ListObjectsResult r6) {
            Intrinsics.X0O(r6, "result");
            Iterator<OSSObjectSummary> r7 = r6.getObjectSummaries().iterator();
        L4:
            if (r7.hasNext() == false) goto L8;
            OSSObjectSummary r0 = r7.next();
            MusicServerManager r1 = MusicServerManager.OXO1;
            String r2 = r0.getKey();
            Intrinsics.O10IXXX0X(r2, "getKey(...)");
            if (r1.iIiiO(r2) == false) goto L4;
            List r3 = ServerMusicActivity.access$getMCacheList$p(this.OXO1);
            String r4 = r0.getKey();
            Intrinsics.O10IXXX0X(r4, "getKey(...)");
            r3.add(r4);
            goto L4
        L8:
            i1O0OXO1O.OXO1.XIi00iiXO(ServerMusicActivity.access$getTAG$p(this.OXO1) + " onSuccess    " + r6.getNextMarker() + " , size = " + ServerMusicActivity.access$getMCacheList$p(this.OXO1).size());
            if (r6.isTruncated() == true) goto L11;
        L16:
            a01.OXO1.OXO1().put(b01.iiX0i1IX, new Gson().toJson(ServerMusicActivity.access$getMCacheList$p(this.OXO1)));
            ServerMusicActivity.access$formatMusicData(this.OXO1);
            return;
        L11:
            if (r6.getNextMarker() == null) goto L16;
            if (ServerMusicActivity.access$getGetMusicNumber$p(this.OXO1) >= 10) goto L16;
            ServerMusicActivity r8 = this.OXO1;
            String r9 = r6.getNextMarker();
            Intrinsics.O10IXXX0X(r9, "getNextMarker(...)");
            r8.setNextMarker(r9);
            ServerMusicActivity.access$getOssMusicList(this.OXO1, this.XIi00iiXO, this.iO);
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onFailure(OSSRequest r1, ClientException r2, ServiceException r3) {
            OXO1((ListObjectsRequest) r1, r2, r3);
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        public /* bridge */ /* synthetic */ void onSuccess(OSSRequest r1, OSSResult r2) {
            XIi00iiXO((ListObjectsRequest) r1, (ListObjectsResult) r2);
        }
    }

    public ServerMusicActivity() {
        this.TAG = "ServerMusicActivity";
        this.mTitle$delegate = LazyKt__LazyJVMKt.iO(new o34(this));
        this.mEditText$delegate = LazyKt__LazyJVMKt.iO(new p34(this));
        this.mClearImageView$delegate = LazyKt__LazyJVMKt.iO(new q34(this));
        this.mSearchImageView$delegate = LazyKt__LazyJVMKt.iO(new r34(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new s34(this));
        this.mEmptyView$delegate = LazyKt__LazyJVMKt.iO(new t34(this));
        this.mButton$delegate = LazyKt__LazyJVMKt.iO(new u34(this));
        this.mCheckedListID = new ArrayList();
        this.mCacheList = new ArrayList();
        this.mMapData = new HashMap();
        this.mCurDir = "/";
        this.musicPath = "var-www/cloud-music/";
        this.nextMarker = "";
        this.rootList = new ArrayList();
    }

    public static /* synthetic */ void I0iXXO(ServerMusicActivity r0) {
        upMusicData$lambda$0(r0);
    }

    public static /* synthetic */ void I1XOi1(ServerMusicActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ ImageView IIX1OXO(ServerMusicActivity r0) {
        return mClearImageView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(ServerMusicActivity r0) {
        return mTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView OIX0iXi(ServerMusicActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit OiIIX101O(ServerMusicActivity r0, Pair r1) {
        return initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ Button X0O(ServerMusicActivity r0) {
        return mButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(ServerMusicActivity r0) {
        return mEditText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(ServerMusicActivity r0) {
        showRootList$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(ServerMusicActivity r0) {
        return mSearchImageView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(ServerMusicActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static final /* synthetic */ void access$formatMusicData(ServerMusicActivity r0) {
        r0.formatMusicData();
    }

    public static final /* synthetic */ int access$getGetMusicNumber$p(ServerMusicActivity r0) {
        return r0.getMusicNumber;
    }

    public static final /* synthetic */ List access$getMCacheList$p(ServerMusicActivity r0) {
        return r0.mCacheList;
    }

    public static final /* synthetic */ ArrayList access$getMCheckedListID$p(ServerMusicActivity r0) {
        return r0.mCheckedListID;
    }

    public static final /* synthetic */ void access$getOssMusicList(ServerMusicActivity r0, String r1, OSSClient r2) {
        r0.getOssMusicList(r1, r2);
    }

    public static final /* synthetic */ String access$getTAG$p(ServerMusicActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setMCurDir$p(ServerMusicActivity r0, String r1) {
        r0.mCurDir = r1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void formatMusicData() {
        this.rootList.clear();
        this.mMapData.clear();
        this.mMapData.put("/", this.rootList);
        List<String> r0 = this.mCacheList;
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L4:
        if (r2.hasNext() == false) goto L20;
        String r4 = (String) r2.next();
        List r3 = StringsKt__StringsKt.i1I(r4, new String[]{"/"}, false, 0, 6, null);
        if (r3.isEmpty() == false) goto L8;
    L18:
        Object r5 = Boolean.valueOf(this.rootList.add(new ServerOSSMusicItem(r4, (String) r3.get(r3.size() - 1), 0)));
    L19:
        r1.add(r5);
        goto L4
    L8:
        if (r3.size() <= 2) goto L18;
        if (this.mMapData.containsKey(r3.get(2)) == false) goto L17;
        List<ServerOSSMusicItem> r6 = this.mMapData.get(r3.get(2));
        if (r6 == null) goto L15;
        List<ServerOSSMusicItem> r7 = CollectionsKt___CollectionsKt.OO0Oi10(r6);
        if (r7 == null) goto L15;
    L16:
        r7.add(new ServerOSSMusicItem(r4, (String) r3.get(r3.size() - 1), 0));
        this.mMapData.put((String) r3.get(2), r7);
        r5 = Unit.OXO1;
    L15:
        r7 = new ArrayList();
        goto L16
    L17:
        ArrayList r8 = new ArrayList();
        r8.add(new ServerOSSMusicItem(r4, (String) r3.get(r3.size() - 1), 0));
        this.mMapData.put((String) r3.get(2), r8);
        r5 = Boolean.valueOf(this.rootList.add(new ServerOSSMusicItem(null, (String) r3.get(2), 1, 1, null)));
        goto L19
    L20:
        this.mMapData.put("/", this.rootList);
        showRootList();
    }

    private final Button getMButton() {
        return (Button) getValue();
    }

    private final ImageView getMClearImageView() {
        return (ImageView) getValue();
    }

    private final EditText getMEditText() {
        return (EditText) getValue();
    }

    private final View getMEmptyView() {
        return (View) getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    private final ImageView getMSearchImageView() {
        return (ImageView) getValue();
    }

    private final TextView getMTitle() {
        return (TextView) getValue();
    }

    private final void getOssMusicList(String r3, OSSClient r4) {
        ListObjectsRequest r0 = new ListObjectsRequest(r3);
        r0.setPrefix(this.musicPath);
        r0.setMaxKeys(1000);
        this.getMusicNumber++;
        if (this.nextMarker.length() <= 0) goto L5;
        r0.setMarker(this.nextMarker);
    L5:
        r4.asyncListObjects(r0, new OXO1(this, r3, r4));
    }

    public static /* synthetic */ View iIiiO(ServerMusicActivity r0) {
        return mEmptyView_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(ServerMusicActivity r0, View r1) {
        r0.getMEditText().getText().clear();
    }

    private static final void initView$lambda$1(ServerMusicActivity r8, View r9) {
        if (r8.getMEditText().getText().toString().length() <= 0) goto L32;
        List<String> r10 = r8.mCacheList;
        ArrayList r0 = new ArrayList();
        Iterator<T> r11 = r10.iterator();
    L6:
        if (r11.hasNext() == false) goto L11;
        Object r1 = r11.next();
        if (StringsKt__StringsKt.iIi011O((String) r1, r8.getMEditText().getText().toString(), false, 2, null) == false) goto L6;
        r0.add(r1);
        goto L6
    L11:
        if (r0.isEmpty() == true) goto L20;
        ArrayList r12 = new ArrayList();
        Iterator r2 = r0.iterator();
    L14:
        if (r2.hasNext() == false) goto L18;
        String r3 = (String) r2.next();
        List r4 = StringsKt__StringsKt.i1I(r3, new String[]{"/"}, false, 0, 6, null);
        if (r4.isEmpty() == true) goto L14;
        r12.add(new ServerOSSMusicItem(r3, (String) r4.get(r4.size() - 1), 1));
        goto L14
    L18:
        r8.initData(r12);
        return;
    L20:
        ToastUtils.showLong(R.string.no_data);
        return;
    }

    private static final Unit initView$lambda$2(ServerMusicActivity r6, Pair r7) {
        Intrinsics.X0O(r7, uz0.iXiiiO);
        int r0 = ((Number) r7.getSecond()).intValue();
        if (r0 == 0) goto L29;
        if (r0 != 1) goto L28;
        UploadOSSWorker.StsRamData r8 = (UploadOSSWorker.StsRamData) r7.getFirst();
        OSSClient r1 = MusicServerManager.OXO1.XIi00iiXO(r8);
        if (r8 == null) goto L11;
        if (r1 == null) goto L11;
        r6.getOssMusicList(r8.getBucket(), r1);
    L11:
        ToastUtils.showLong(R.string.request_error);
    L28:
        return Unit.OXO1;
    L29:
        JsonArray r2 = JsonParser.parseString(a01.OXO1.OXO1().getString(b01.iiX0i1IX)).getAsJsonArray();     // Catch: Exception -> L18
        Intrinsics.XXI(r2);     // Catch: Exception -> L18
        List r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));     // Catch: Exception -> L18
        Iterator<JsonElement> r4 = r2.iterator();     // Catch: Exception -> L18
    L15:
        if (r4.hasNext() == false) goto L20;
        r3.add(new Gson().fromJson(r4.next(), String.class));     // Catch: Exception -> L18
    L20:
        if (r3.isEmpty() == true) goto L22;
        i1O0OXO1O.OXO1.OXO1(r6.TAG + " mCacheList = " + r3.size() + " ");
        r6.mCacheList.addAll(r3);
        r6.formatMusicData();
        goto L28
    L22:
        UploadOSSWorker.StsRamData r9 = (UploadOSSWorker.StsRamData) r7.getFirst();
        OSSClient r5 = MusicServerManager.OXO1.XIi00iiXO(r9);
        if (r9 == null) goto L26;
        if (r5 == null) goto L26;
        r6.getOssMusicList(r9.getBucket(), r5);
    L26:
        ToastUtils.showLong(R.string.request_error);
    L18:
        r3 = CollectionsKt__CollectionsKt.iI();
        goto L20
    }

    private static final Button mButton_delegate$lambda$0(ServerMusicActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final ImageView mClearImageView_delegate$lambda$0(ServerMusicActivity r1) {
        return (ImageView) r1.findViewById(R.id.server_music_file_et_clear);
    }

    private static final EditText mEditText_delegate$lambda$0(ServerMusicActivity r1) {
        return (EditText) r1.findViewById(R.id.server_music_file_et);
    }

    private static final View mEmptyView_delegate$lambda$0(ServerMusicActivity r1) {
        return r1.findViewById(R.id.empty_view);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(ServerMusicActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.server_music_file_recycler);
    }

    private static final ImageView mSearchImageView_delegate$lambda$0(ServerMusicActivity r1) {
        return (ImageView) r1.findViewById(R.id.server_music_file_search);
    }

    private static final TextView mTitle_delegate$lambda$0(ServerMusicActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final void showRootList$lambda$0(ServerMusicActivity r2) {
        r2.mCurDir = "/";
        r2.getMTitle().setText(r2.getString(R.string.server_music_title));
        r2.initData(r2.rootList);
        MultiItemTypeAdapter<ServerOSSMusicItem> r3 = r2.mAdapter;
        if (r3 == null) goto L6;
        r3.notifyDataSetChanged();
        return;
    }

    private static final void upMusicData$lambda$0(ServerMusicActivity r2) {
        r2.getMTitle().setText(r2.mCurDir);
        r2.initData(r2.mMapData.get(r2.mCurDir));
        MultiItemTypeAdapter<ServerOSSMusicItem> r3 = r2.mAdapter;
        if (r3 == null) goto L6;
        r3.notifyDataSetChanged();
        return;
    }

    @aa1
    public final String getNextMarker() {
        return this.nextMarker;
    }

    @aa1
    public final List<ServerOSSMusicItem> getRootList() {
        return this.rootList;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    public final void initData(@tb1 final List<ServerOSSMusicItem> r4) {
        List<ServerOSSMusicItem> r0 = r4;
        if (r0 != null) goto L5;
    L9:
        getMRecyclerView().setVisibility(8);
        getMEmptyView().setVisibility(0);
        return;
    L5:
        if (r0.isEmpty() == true) goto L9;
        this.mAdapter = new AnonymousClass1(this, r4);
        getMRecyclerView().setVisibility(0);
        getMEmptyView().setVisibility(8);
        getMRecyclerView().setAdapter(this.mAdapter);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMTitle().setText(getString(R.string.server_music_title));
        getMButton().setEnabled(false);
        getMClearImageView().setOnClickListener(new j34(this));
        getMSearchImageView().setOnClickListener(new m34(this));
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        MusicServerManager.OXO1.XX0(new n34(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_server_music_file_manager;
    }

    public final void onBottomClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        SPUtils r4 = a01.OXO1.IiI10X();
        ArrayList<ServerOSSMusicItem> r0 = this.mCheckedListID;
        r4.put(b01.OI1i1i, new Gson().toJson(r0));
        I01XX0.XIi00iiXO(b01.OI1i1i, null, 2, null);
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (Intrinsics.XOO0ii0(this.mCurDir, "/") == false) goto L6;
        super.onHandleBackPressed();
        return;
    L6:
        showRootList();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    public final void setButtonText() {
        Button r0 = getMButton();
        if (this.mCheckedListID.size() != 0) goto L5;
        getMButton().setText(getString(R.string.tera_box_download_btn));
        boolean r1 = false;
    L6:
        r0.setEnabled(r1);
        return;
    L5:
        getMButton().setText(getString(R.string.tera_box_download_btn) + I000IiI1O.iO.XIi00iiXO + this.mCheckedListID.size() + I000IiI1O.iO.iO);
        r1 = true;
        goto L6
    }

    public final void setNextMarker(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.nextMarker = r2;
    }

    public final void showRootList() {
        runOnUiThread(new l34(this));
    }

    public final void upMusicData() {
        runOnUiThread(new k34(this));
    }
}
