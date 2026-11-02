package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sma.smartv3.biz.MusicServerManager;
import com.sma.smartv3.model.ServerOSSMusicItem;
import com.sma.smartv3.p610ui.device.ServerMusicActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n1563#2:359\n1634#2,3:360\n774#2:365\n865#2,2:366\n1869#2,2:368\n1563#2:373\n1634#2,2:374\n1636#2:377\n35#3,2:363\n50#3,3:370\n53#3:376\n55#3,2:378\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity\n*L\n148#1:359\n148#1:360,3\n81#1:365\n81#1:366,2\n84#1:368,2\n104#1:373\n104#1:374,2\n104#1:377\n352#1:363,2\n104#1:370,3\n104#1:376\n104#1:378,2\n*E\n"})
public final class ServerMusicActivity extends BaseActivity {
    private int getMusicNumber;

    @tb1
    private MultiItemTypeAdapter<ServerOSSMusicItem> mAdapter;

    @aa1
    private final String TAG = "ServerMusicActivity";

    @aa1
    private final Lazy mTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mTitle_delegate$lambda$0(this.f10064IO);
        }
    });

    @aa1
    private final Lazy mEditText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mEditText_delegate$lambda$0(this.f10287IO);
        }
    });

    @aa1
    private final Lazy mClearImageView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mClearImageView_delegate$lambda$0(this.f10505IO);
        }
    });

    @aa1
    private final Lazy mSearchImageView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mSearchImageView_delegate$lambda$0(this.f10743IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.s34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mRecyclerView_delegate$lambda$0(this.f10960IO);
        }
    });

    @aa1
    private final Lazy mEmptyView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.t34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mEmptyView_delegate$lambda$0(this.f11183IO);
        }
    });

    @aa1
    private final Lazy mButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u34
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return ServerMusicActivity.mButton_delegate$lambda$0(this.f11418IO);
        }
    });

    @aa1
    private final ArrayList<ServerOSSMusicItem> mCheckedListID = new ArrayList<>();

    @aa1
    private final List<String> mCacheList = new ArrayList();

    @aa1
    private final HashMap<String, List<ServerOSSMusicItem>> mMapData = new HashMap<>();

    @aa1
    private String mCurDir = "/";

    @aa1
    private final String musicPath = "var-www/cloud-music/";

    @aa1
    private String nextMarker = "";

    @aa1
    private final List<ServerOSSMusicItem> rootList = new ArrayList();

    @SourceDebugExtension({"SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n35#2,2:359\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n*L\n197#1:359,2\n*E\n"})
    public static final class OXO1 implements OSSCompletedCallback<ListObjectsRequest, ListObjectsResult> {
        public final /* synthetic */ String XIi00iiXO;

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ OSSClient f54510iO;

        public OXO1(String str, OSSClient oSSClient) {
            this.XIi00iiXO = str;
            this.f54510iO = oSSClient;
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onFailure(ListObjectsRequest listObjectsRequest, ClientException clientException, ServiceException serviceException) {
            Intrinsics.X0O(clientException, "clientException");
            Intrinsics.X0O(serviceException, "serviceException");
            ToastUtils.showLong(R.string.request_error);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.XIi00iiXO(ServerMusicActivity.this.TAG + " ErrorCode " + serviceException.getErrorCode());
            clientException.printStackTrace();
            i1o0oxo1o.XIi00iiXO(ServerMusicActivity.this.TAG + " ErrorCode " + serviceException.getErrorCode());
            i1o0oxo1o.XIi00iiXO(ServerMusicActivity.this.TAG + " RequestId  " + serviceException.getRequestId());
            i1o0oxo1o.XIi00iiXO(ServerMusicActivity.this.TAG + " HostId   " + serviceException.getHostId());
            i1o0oxo1o.XIi00iiXO(ServerMusicActivity.this.TAG + " RawMessag   " + serviceException.getRawMessage());
        }

        @Override // com.alibaba.sdk.android.oss.callback.OSSCompletedCallback
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ListObjectsRequest listObjectsRequest, ListObjectsResult result) {
            Intrinsics.X0O(result, "result");
            for (OSSObjectSummary oSSObjectSummary : result.getObjectSummaries()) {
                MusicServerManager musicServerManager = MusicServerManager.OXO1;
                String key = oSSObjectSummary.getKey();
                Intrinsics.O10IXXX0X(key, "getKey(...)");
                if (musicServerManager.iIiiO(key)) {
                    List list = ServerMusicActivity.this.mCacheList;
                    String key2 = oSSObjectSummary.getKey();
                    Intrinsics.O10IXXX0X(key2, "getKey(...)");
                    list.add(key2);
                }
            }
            i1O0OXO1O.OXO1.XIi00iiXO(ServerMusicActivity.this.TAG + " onSuccess    " + result.getNextMarker() + " , size = " + ServerMusicActivity.this.mCacheList.size());
            if (!result.isTruncated() || result.getNextMarker() == null || ServerMusicActivity.this.getMusicNumber >= 10) {
                a01.OXO1.OXO1().put(b01.iiX0i1IX, new Gson().toJson(ServerMusicActivity.this.mCacheList));
                ServerMusicActivity.this.formatMusicData();
                return;
            }
            ServerMusicActivity serverMusicActivity = ServerMusicActivity.this;
            String nextMarker = result.getNextMarker();
            Intrinsics.O10IXXX0X(nextMarker, "getNextMarker(...)");
            serverMusicActivity.setNextMarker(nextMarker);
            ServerMusicActivity.this.getOssMusicList(this.XIi00iiXO, this.f54510iO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void formatMusicData() {
        Object objValueOf;
        List<ServerOSSMusicItem> arrayList;
        this.rootList.clear();
        this.mMapData.clear();
        this.mMapData.put("/", this.rootList);
        List<String> list = this.mCacheList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        for (String str : list) {
            List listI1I = StringsKt__StringsKt.i1I(str, new String[]{"/"}, false, 0, 6, null);
            if (listI1I.isEmpty() || listI1I.size() <= 2) {
                objValueOf = Boolean.valueOf(this.rootList.add(new ServerOSSMusicItem(str, (String) listI1I.get(listI1I.size() - 1), 0)));
            } else if (this.mMapData.containsKey(listI1I.get(2))) {
                List<ServerOSSMusicItem> list2 = this.mMapData.get(listI1I.get(2));
                if (list2 == null || (arrayList = CollectionsKt___CollectionsKt.OO0Oi10(list2)) == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(new ServerOSSMusicItem(str, (String) listI1I.get(listI1I.size() - 1), 0));
                this.mMapData.put((String) listI1I.get(2), arrayList);
                objValueOf = Unit.OXO1;
            } else {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new ServerOSSMusicItem(str, (String) listI1I.get(listI1I.size() - 1), 0));
                this.mMapData.put((String) listI1I.get(2), arrayList3);
                objValueOf = Boolean.valueOf(this.rootList.add(new ServerOSSMusicItem(null, (String) listI1I.get(2), 1, 1, null)));
            }
            arrayList2.add(objValueOf);
        }
        this.mMapData.put("/", this.rootList);
        showRootList();
    }

    private final Button getMButton() {
        return (Button) this.mButton$delegate.getValue();
    }

    private final ImageView getMClearImageView() {
        return (ImageView) this.mClearImageView$delegate.getValue();
    }

    private final EditText getMEditText() {
        return (EditText) this.mEditText$delegate.getValue();
    }

    private final View getMEmptyView() {
        return (View) this.mEmptyView$delegate.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
    }

    private final ImageView getMSearchImageView() {
        return (ImageView) this.mSearchImageView$delegate.getValue();
    }

    private final TextView getMTitle() {
        return (TextView) this.mTitle$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getOssMusicList(String str, OSSClient oSSClient) {
        ListObjectsRequest listObjectsRequest = new ListObjectsRequest(str);
        listObjectsRequest.setPrefix(this.musicPath);
        listObjectsRequest.setMaxKeys(1000);
        this.getMusicNumber++;
        if (this.nextMarker.length() > 0) {
            listObjectsRequest.setMarker(this.nextMarker);
        }
        oSSClient.asyncListObjects(listObjectsRequest, new OXO1(str, oSSClient));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(ServerMusicActivity serverMusicActivity, View view) {
        serverMusicActivity.getMEditText().getText().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(ServerMusicActivity serverMusicActivity, View view) {
        if (serverMusicActivity.getMEditText().getText().toString().length() > 0) {
            List<String> list = serverMusicActivity.mCacheList;
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : list) {
                if (StringsKt__StringsKt.iIi011O((String) obj, serverMusicActivity.getMEditText().getText().toString(), false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                ToastUtils.showLong(R.string.no_data);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                List listI1I = StringsKt__StringsKt.i1I(str, new String[]{"/"}, false, 0, 6, null);
                if (!listI1I.isEmpty()) {
                    arrayList2.add(new ServerOSSMusicItem(str, (String) listI1I.get(listI1I.size() - 1), 1));
                }
            }
            serverMusicActivity.initData(arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$2(ServerMusicActivity serverMusicActivity, Pair pair) {
        List listM39402iI;
        Intrinsics.X0O(pair, "pair");
        int iIntValue = ((Number) pair.getSecond()).intValue();
        if (iIntValue == 0) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(a01.OXO1.OXO1().getString(b01.iiX0i1IX)).getAsJsonArray();
                Intrinsics.XXI(asJsonArray);
                listM39402iI = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(asJsonArray, 10));
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    listM39402iI.add(new Gson().fromJson(it.next(), String.class));
                }
            } catch (Exception unused) {
                listM39402iI = CollectionsKt__CollectionsKt.m39402iI();
            }
            if (listM39402iI.isEmpty()) {
                UploadOSSWorker.StsRamData stsRamData = (UploadOSSWorker.StsRamData) pair.getFirst();
                OSSClient oSSClientXIi00iiXO = MusicServerManager.OXO1.XIi00iiXO(stsRamData);
                if (stsRamData == null || oSSClientXIi00iiXO == null) {
                    ToastUtils.showLong(R.string.request_error);
                } else {
                    serverMusicActivity.getOssMusicList(stsRamData.getBucket(), oSSClientXIi00iiXO);
                }
            } else {
                i1O0OXO1O.OXO1.OXO1(serverMusicActivity.TAG + " mCacheList = " + listM39402iI.size() + " ");
                serverMusicActivity.mCacheList.addAll(listM39402iI);
                serverMusicActivity.formatMusicData();
            }
        } else if (iIntValue == 1) {
            UploadOSSWorker.StsRamData stsRamData2 = (UploadOSSWorker.StsRamData) pair.getFirst();
            OSSClient oSSClientXIi00iiXO2 = MusicServerManager.OXO1.XIi00iiXO(stsRamData2);
            if (stsRamData2 == null || oSSClientXIi00iiXO2 == null) {
                ToastUtils.showLong(R.string.request_error);
            } else {
                serverMusicActivity.getOssMusicList(stsRamData2.getBucket(), oSSClientXIi00iiXO2);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mButton_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return (Button) serverMusicActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mClearImageView_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return (ImageView) serverMusicActivity.findViewById(R.id.server_music_file_et_clear);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mEditText_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return (EditText) serverMusicActivity.findViewById(R.id.server_music_file_et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mEmptyView_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return serverMusicActivity.findViewById(R.id.empty_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return (RecyclerView) serverMusicActivity.findViewById(R.id.server_music_file_recycler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mSearchImageView_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return (ImageView) serverMusicActivity.findViewById(R.id.server_music_file_search);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTitle_delegate$lambda$0(ServerMusicActivity serverMusicActivity) {
        return (TextView) serverMusicActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRootList$lambda$0(ServerMusicActivity serverMusicActivity) {
        serverMusicActivity.mCurDir = "/";
        serverMusicActivity.getMTitle().setText(serverMusicActivity.getString(R.string.server_music_title));
        serverMusicActivity.initData(serverMusicActivity.rootList);
        MultiItemTypeAdapter<ServerOSSMusicItem> multiItemTypeAdapter = serverMusicActivity.mAdapter;
        if (multiItemTypeAdapter != null) {
            multiItemTypeAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upMusicData$lambda$0(ServerMusicActivity serverMusicActivity) {
        serverMusicActivity.getMTitle().setText(serverMusicActivity.mCurDir);
        serverMusicActivity.initData(serverMusicActivity.mMapData.get(serverMusicActivity.mCurDir));
        MultiItemTypeAdapter<ServerOSSMusicItem> multiItemTypeAdapter = serverMusicActivity.mAdapter;
        if (multiItemTypeAdapter != null) {
            multiItemTypeAdapter.notifyDataSetChanged();
        }
    }

    @aa1
    public final String getNextMarker() {
        return this.nextMarker;
    }

    @aa1
    public final List<ServerOSSMusicItem> getRootList() {
        return this.rootList;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    public final void initData(@tb1 List<ServerOSSMusicItem> list) {
        List<ServerOSSMusicItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            getMRecyclerView().setVisibility(8);
            getMEmptyView().setVisibility(0);
        } else {
            this.mAdapter = new MultiItemTypeAdapter<ServerOSSMusicItem>(this, list) { // from class: com.sma.smartv3.ui.device.ServerMusicActivity.initData.1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ServerMusicActivity$initData$1$OXO1 */
                public static final class OXO1 implements InterfaceC2572jc<ServerOSSMusicItem> {
                    public final /* synthetic */ ServerMusicActivity OXO1;

                    public OXO1(ServerMusicActivity serverMusicActivity) {
                        this.OXO1 = serverMusicActivity;
                    }

                    public static final void IiI10X(ServerMusicActivity serverMusicActivity, ServerOSSMusicItem serverOSSMusicItem, View view) {
                        serverMusicActivity.mCurDir = serverOSSMusicItem.getTitle();
                        serverMusicActivity.upMusicData();
                    }

                    @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                    /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                    public void mo2372iO(ViewHolder holder, final ServerOSSMusicItem mServerOSSMusicItem, int i) {
                        Intrinsics.X0O(holder, "holder");
                        Intrinsics.X0O(mServerOSSMusicItem, "mServerOSSMusicItem");
                        TextView textView = (TextView) holder.getView(R.id.item_tera_box_title);
                        TextView textView2 = (TextView) holder.getView(R.id.item_tera_box_tip);
                        textView.setText(mServerOSSMusicItem.getTitle());
                        textView2.setVisibility(8);
                        View view = holder.itemView;
                        final ServerMusicActivity serverMusicActivity = this.OXO1;
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.v34
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ServerMusicActivity.C187711.OXO1.IiI10X(serverMusicActivity, mServerOSSMusicItem, view2);
                            }
                        });
                    }

                    @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                    public int XIi00iiXO() {
                        return R.layout.item_tera_box_dir;
                    }

                    @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                    /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                    public boolean OXO1(ServerOSSMusicItem serverOSSMusicItem, int i) {
                        return serverOSSMusicItem != null && serverOSSMusicItem.getIsdir() == 1;
                    }
                }

                /* JADX INFO: renamed from: com.sma.smartv3.ui.device.ServerMusicActivity$initData$1$XIi00iiXO */
                public static final class XIi00iiXO implements InterfaceC2572jc<ServerOSSMusicItem> {
                    public final /* synthetic */ ServerMusicActivity OXO1;

                    public XIi00iiXO(ServerMusicActivity serverMusicActivity) {
                        this.OXO1 = serverMusicActivity;
                    }

                    public static final void IiI10X(ServerMusicActivity serverMusicActivity, ServerOSSMusicItem serverOSSMusicItem, ImageView imageView, View view) {
                        if (serverMusicActivity.mCheckedListID.contains(serverOSSMusicItem)) {
                            serverMusicActivity.mCheckedListID.remove(serverOSSMusicItem);
                            imageView.setImageResource(R.drawable.file_uncheck_icon);
                        } else if (serverMusicActivity.mCheckedListID.size() >= 20) {
                            imageView.setImageResource(R.drawable.file_uncheck_icon);
                            ToastUtils.showLong(R.string.too_manyfile_tip);
                        } else {
                            serverMusicActivity.mCheckedListID.add(serverOSSMusicItem);
                            imageView.setImageResource(R.drawable.file_check_icon);
                        }
                        serverMusicActivity.setButtonText();
                    }

                    @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                    /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                    public void mo2372iO(ViewHolder holder, final ServerOSSMusicItem mServerOSSMusicItem, int i) {
                        Intrinsics.X0O(holder, "holder");
                        Intrinsics.X0O(mServerOSSMusicItem, "mServerOSSMusicItem");
                        TextView textView = (TextView) holder.getView(R.id.item_tera_box_title);
                        ((TextView) holder.getView(R.id.item_tera_box_tip)).setVisibility(8);
                        final ImageView imageView = (ImageView) holder.getView(R.id.item_check_music);
                        textView.setText(mServerOSSMusicItem.getTitle());
                        imageView.setImageResource(this.OXO1.mCheckedListID.contains(mServerOSSMusicItem) ? R.drawable.file_check_icon : R.drawable.file_uncheck_icon);
                        View view = holder.itemView;
                        final ServerMusicActivity serverMusicActivity = this.OXO1;
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.w34
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ServerMusicActivity.C187711.XIi00iiXO.IiI10X(serverMusicActivity, mServerOSSMusicItem, imageView, view2);
                            }
                        });
                    }

                    @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                    public int XIi00iiXO() {
                        return R.layout.item_tera_box_music_file;
                    }

                    @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                    /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                    public boolean OXO1(ServerOSSMusicItem serverOSSMusicItem, int i) {
                        return serverOSSMusicItem != null && serverOSSMusicItem.getIsdir() == 0;
                    }
                }

                {
                    addItemViewDelegate(1, new OXO1(this));
                    addItemViewDelegate(0, new XIi00iiXO(this));
                }
            };
            getMRecyclerView().setVisibility(0);
            getMEmptyView().setVisibility(8);
            getMRecyclerView().setAdapter(this.mAdapter);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        getMTitle().setText(getString(R.string.server_music_title));
        getMButton().setEnabled(false);
        getMClearImageView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.j34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ServerMusicActivity.initView$lambda$0(this.f8870IO, view);
            }
        });
        getMSearchImageView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.m34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ServerMusicActivity.initView$lambda$1(this.f9606IO, view);
            }
        });
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        MusicServerManager.OXO1.XX0(new Function1() { // from class: com.android.mltcode.paycertificationapi.n34
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ServerMusicActivity.initView$lambda$2(this.f9838IO, (Pair) obj);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_server_music_file_manager;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.IiI10X().put(b01.OI1i1i, new Gson().toJson(this.mCheckedListID));
        I01XX0.XIi00iiXO(b01.OI1i1i, null, 2, null);
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (Intrinsics.XOO0ii0(this.mCurDir, "/")) {
            super.onHandleBackPressed();
        } else {
            showRootList();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    public final void setButtonText() {
        boolean z;
        Button mButton = getMButton();
        if (this.mCheckedListID.size() == 0) {
            getMButton().setText(getString(R.string.tera_box_download_btn));
            z = false;
        } else {
            getMButton().setText(getString(R.string.tera_box_download_btn) + I000IiI1O.C2156iO.XIi00iiXO + this.mCheckedListID.size() + I000IiI1O.C2156iO.f1007iO);
            z = true;
        }
        mButton.setEnabled(z);
    }

    public final void setNextMarker(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.nextMarker = str;
    }

    public final void showRootList() {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.l34
            @Override // java.lang.Runnable
            public final void run() {
                ServerMusicActivity.showRootList$lambda$0(this.f9344IO);
            }
        });
    }

    public final void upMusicData() {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.k34
            @Override // java.lang.Runnable
            public final void run() {
                ServerMusicActivity.upMusicData$lambda$0(this.f9097IO);
            }
        });
    }
}
