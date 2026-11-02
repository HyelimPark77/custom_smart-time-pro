package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.sma.smartv3.biz.MusicServerManager;
import com.sma.smartv3.model.TeraBoxListItem;
import com.sma.smartv3.p610ui.device.TeraBoxFileManagerActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nTeraBoxFileManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,448:1\n87#2,7:449\n94#2,3:457\n70#2,7:460\n97#2:467\n1#3:456\n35#4,2:468\n*S KotlinDebug\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n*L\n123#1:449,7\n123#1:457,3\n123#1:460,7\n123#1:467\n123#1:456\n324#1:468,2\n*E\n"})
public final class TeraBoxFileManagerActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int FILE_DIR = 1;
    public static final int FILE_MUSIC = 0;
    private boolean hasLogin;
    private boolean hasNewIntent;
    private MultiItemTypeAdapter<TeraBoxListItem> mAdapter;
    private boolean mTouches;
    private int onResumeSum;

    @tb1
    private C3006uq progressPopup;

    @tb1
    private go0 unLoginPopup;

    @aa1
    private String access_tokens = "";

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.rootView_delegate$lambda$0(this.f12203IO);
        }
    });

    @aa1
    private final Lazy mTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mTitle_delegate$lambda$0(this.f12650IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ao5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.abhTitleRight_delegate$lambda$0(this.f5528IO);
        }
    });

    @aa1
    private final Lazy mEditText$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bo5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mEditText_delegate$lambda$0(this.f5777IO);
        }
    });

    @aa1
    private final Lazy mClearImageView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.co5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mClearImageView_delegate$lambda$0(this.f6022IO);
        }
    });

    @aa1
    private final Lazy mSearchImageView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.do5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mSearchImageView_delegate$lambda$0(this.f6234IO);
        }
    });

    @aa1
    private final Lazy mSwipeRefreshLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eo5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mSwipeRefreshLayout_delegate$lambda$0(this.f6458IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fo5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mRecyclerView_delegate$lambda$0(this.f6692IO);
        }
    });

    @aa1
    private final Lazy mEmptyView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.go5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mEmptyView_delegate$lambda$0(this.f6930IO);
        }
    });

    @aa1
    private final Lazy mShareView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.io5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mShareView_delegate$lambda$0(this.f8727IO);
        }
    });

    @aa1
    private final Lazy mButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TeraBoxFileManagerActivity.mButton_delegate$lambda$0(this.f12409IO);
        }
    });

    @aa1
    private final HashMap<String, List<TeraBoxListItem>> mMapData = new HashMap<>();

    @aa1
    private final HashMap<String, String> mMapTitle = new HashMap<>();

    @aa1
    private final ArrayList<String> mKeyIndex = new ArrayList<>();

    @aa1
    private final ArrayList<TeraBoxListItem> mCheckedListID = new ArrayList<>();

    @aa1
    private String mCurDir = "/";
    private int page = 1;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (ImageView) teraBoxFileManagerActivity.findViewById(R.id.abh_title_right);
    }

    private final void analyzeURL(Uri uri) {
        LogUtils.m11128d("handleIntent  -->  uri = " + uri);
        String queryParameter = uri != null ? uri.getQueryParameter("code") : null;
        if (queryParameter == null || queryParameter.length() <= 0) {
            ToastUtils.showLong("handleIntent login error", new Object[0]);
            return;
        }
        this.hasNewIntent = true;
        showLoadPopup();
        MusicServerManager.OXO1.IIX1OXO(queryParameter, new Function1() { // from class: com.android.mltcode.paycertificationapi.ho5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TeraBoxFileManagerActivity.analyzeURL$lambda$0(this.f7168IO, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit analyzeURL$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity, String str) {
        if (str == null || str.length() <= 0) {
            LogUtils.m11128d("handleIntent login error it = " + str);
            ToastUtils.showLong("handleIntent login error it = " + str, new Object[0]);
        } else {
            teraBoxFileManagerActivity.access_tokens = str;
            teraBoxFileManagerActivity.mCurDir = "/";
            teraBoxFileManagerActivity.getTeraBoxList();
            teraBoxFileManagerActivity.getTeraShareUrl();
            teraBoxFileManagerActivity.getAbhTitleRight().setVisibility(0);
        }
        teraBoxFileManagerActivity.dismissLoadPopup();
        return Unit.OXO1;
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
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

    private final View getMShareView() {
        return (View) this.mShareView$delegate.getValue();
    }

    private final SwipeRefreshLayout getMSwipeRefreshLayout() {
        return (SwipeRefreshLayout) this.mSwipeRefreshLayout$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getMTitle() {
        return (TextView) this.mTitle$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTeraBoxList$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity, List list) {
        teraBoxFileManagerActivity.mTouches = false;
        if (list != null) {
            if (teraBoxFileManagerActivity.page == 1) {
                teraBoxFileManagerActivity.mMapData.put(teraBoxFileManagerActivity.mCurDir, list);
                if (!teraBoxFileManagerActivity.mKeyIndex.contains(teraBoxFileManagerActivity.mCurDir)) {
                    teraBoxFileManagerActivity.mKeyIndex.add(teraBoxFileManagerActivity.mCurDir);
                }
            }
            teraBoxFileManagerActivity.initData(list);
        } else {
            teraBoxFileManagerActivity.getMRecyclerView().setVisibility(8);
            teraBoxFileManagerActivity.getMEmptyView().setVisibility(0);
        }
        teraBoxFileManagerActivity.getMSwipeRefreshLayout().setRefreshing(false);
        teraBoxFileManagerActivity.dismissLoadPopup();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTeraBoxSearchFile$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity, String str, List list) {
        teraBoxFileManagerActivity.mTouches = false;
        if (list != null) {
            teraBoxFileManagerActivity.mMapData.put(teraBoxFileManagerActivity.mCurDir, list);
            teraBoxFileManagerActivity.mMapTitle.put(teraBoxFileManagerActivity.mCurDir, teraBoxFileManagerActivity.getString(R.string.search) + CertificateUtil.DELIMITER + str);
            teraBoxFileManagerActivity.mKeyIndex.add(teraBoxFileManagerActivity.mCurDir);
            teraBoxFileManagerActivity.initData(list);
        }
        teraBoxFileManagerActivity.dismissLoadPopup();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTeraShareUrl$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity, String it) {
        Intrinsics.X0O(it, "it");
        if (it.length() > 0) {
            teraBoxFileManagerActivity.showShareView(it);
        }
        return Unit.OXO1;
    }

    private final void handleIntent(Intent intent) {
        analyzeURL(intent.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity, View view) {
        teraBoxFileManagerActivity.getMEditText().getText().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(TeraBoxFileManagerActivity teraBoxFileManagerActivity, View view) {
        if (teraBoxFileManagerActivity.mTouches) {
            return;
        }
        teraBoxFileManagerActivity.mTouches = true;
        teraBoxFileManagerActivity.showLoadPopup();
        String string = teraBoxFileManagerActivity.getMEditText().getText().toString();
        teraBoxFileManagerActivity.mCurDir = teraBoxFileManagerActivity.getString(R.string.search) + CertificateUtil.DELIMITER + string;
        teraBoxFileManagerActivity.getMTitle().setText(teraBoxFileManagerActivity.getString(R.string.search) + CertificateUtil.DELIMITER + string);
        teraBoxFileManagerActivity.getTeraBoxSearchFile(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mButton_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (Button) teraBoxFileManagerActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mClearImageView_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (ImageView) teraBoxFileManagerActivity.findViewById(R.id.tera_box_file_et_clear);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mEditText_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (EditText) teraBoxFileManagerActivity.findViewById(R.id.tera_box_file_et);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mEmptyView_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return teraBoxFileManagerActivity.findViewById(R.id.empty_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (RecyclerView) teraBoxFileManagerActivity.findViewById(R.id.tera_box_file_recycler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mSearchImageView_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (ImageView) teraBoxFileManagerActivity.findViewById(R.id.tera_box_file_search);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View mShareView_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return teraBoxFileManagerActivity.findViewById(R.id.tera_box_share_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeRefreshLayout mSwipeRefreshLayout_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (SwipeRefreshLayout) teraBoxFileManagerActivity.findViewById(R.id.tera_box_file_srf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTitle_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return (TextView) teraBoxFileManagerActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleRightClick$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onTitleRightClick$lambda$0$1(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().remove(b01.f5628O1);
        a01Var.IiI10X().remove(b01.O1iXiI);
        teraBoxFileManagerActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshData() {
        getMSwipeRefreshLayout().setRefreshing(true);
        getTeraBoxList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
        return teraBoxFileManagerActivity.findViewById(R.id.rootView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showShareView$lambda$0(String str, TeraBoxFileManagerActivity teraBoxFileManagerActivity, View view) {
        if (!oe5.m2764O0(str, "http", false, 2, null)) {
            str = i72.OXO1.I0i1OXiI() ? "https://terabox.com/s/1aDs3IL6xbpMQvsbHZ6l0vg" : "https://pan.baidu.com/s/1GatP9OXF9mmy2MTwtohHOw?pwd=k7y4";
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(str));
        intent.setAction("android.intent.action.VIEW");
        teraBoxFileManagerActivity.startActivity(intent);
    }

    public final void dismissLoadPopup() {
        C3006uq c3006uq = this.progressPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    @aa1
    public final String getAccess_tokens() {
        return this.access_tokens;
    }

    @tb1
    public final C3006uq getProgressPopup() {
        return this.progressPopup;
    }

    public final void getTeraBoxCode() {
        if (i72.OXO1.I0i1OXiI()) {
            Intent intent = new Intent();
            intent.setData(Uri.parse(MusicServerManager.OXO1.IiI10X(this)));
            intent.setAction("android.intent.action.VIEW");
            startActivity(intent);
            return;
        }
        String strIiI10X = MusicServerManager.OXO1.IiI10X(this);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strIiI10X);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent2 = new Intent(this, (Class<?>) WebViewActivity.class);
        intent2.putExtras(bundle);
        startActivity(intent2);
    }

    public final void getTeraBoxList() {
        if (this.mTouches) {
            return;
        }
        this.mTouches = true;
        showLoadPopup();
        MusicServerManager.X0O(MusicServerManager.OXO1, this.access_tokens, this.mCurDir, this.page, 0, new Function1() { // from class: com.android.mltcode.paycertificationapi.wn5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TeraBoxFileManagerActivity.getTeraBoxList$lambda$0(this.f12000IO, (List) obj);
            }
        }, 8, null);
    }

    public final void getTeraBoxSearchFile(@aa1 final String text) {
        Intrinsics.X0O(text, "text");
        MusicServerManager.OXO1.XXI(this.access_tokens, text, new Function1() { // from class: com.android.mltcode.paycertificationapi.jo5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TeraBoxFileManagerActivity.getTeraBoxSearchFile$lambda$0(this.f9018IO, text, (List) obj);
            }
        });
    }

    public final void getTeraShareUrl() {
        MusicServerManager.OXO1.OIX0iXi(new Function1() { // from class: com.android.mltcode.paycertificationapi.ko5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TeraBoxFileManagerActivity.getTeraShareUrl$lambda$0(this.f9247IO, (String) obj);
            }
        });
    }

    @tb1
    public final go0 getUnLoginPopup() {
        return this.unLoginPopup;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        String string = a01.OXO1.IiI10X().getString(b01.f5628O1);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        this.access_tokens = string;
        if (string.length() == 0) {
            this.onResumeSum = 0;
            this.hasLogin = true;
            getTeraBoxCode();
        } else {
            this.mCurDir = "/";
            getTeraBoxList();
            getTeraShareUrl();
        }
    }

    public final void initData(@tb1 List<TeraBoxListItem> list) {
        if (list == null || list.size() <= 0) {
            getMRecyclerView().setVisibility(8);
            getMEmptyView().setVisibility(0);
            return;
        }
        dismissLoadPopup();
        this.mAdapter = new MultiItemTypeAdapter<TeraBoxListItem>(this, list) { // from class: com.sma.smartv3.ui.device.TeraBoxFileManagerActivity.initData.1

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.TeraBoxFileManagerActivity$initData$1$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<TeraBoxListItem> {
                public final /* synthetic */ TeraBoxFileManagerActivity OXO1;

                public OXO1(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
                    this.OXO1 = teraBoxFileManagerActivity;
                }

                public static final void IiI10X(TeraBoxFileManagerActivity teraBoxFileManagerActivity, TeraBoxListItem teraBoxListItem, View view) {
                    teraBoxFileManagerActivity.mCurDir = teraBoxListItem.getPath();
                    teraBoxFileManagerActivity.mMapTitle.put(teraBoxFileManagerActivity.mCurDir, teraBoxListItem.getServer_filename());
                    teraBoxFileManagerActivity.getMTitle().setText(teraBoxListItem.getServer_filename());
                    if (!teraBoxFileManagerActivity.mMapData.containsKey(teraBoxFileManagerActivity.mCurDir)) {
                        teraBoxFileManagerActivity.page = 1;
                        teraBoxFileManagerActivity.getTeraBoxList();
                    } else {
                        if (!teraBoxFileManagerActivity.mKeyIndex.contains(teraBoxFileManagerActivity.mCurDir)) {
                            teraBoxFileManagerActivity.mKeyIndex.add(teraBoxFileManagerActivity.mCurDir);
                        }
                        teraBoxFileManagerActivity.initData((List) teraBoxFileManagerActivity.mMapData.get(teraBoxFileManagerActivity.mCurDir));
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final TeraBoxListItem mTeraBoxListItem, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mTeraBoxListItem, "mTeraBoxListItem");
                    TextView textView = (TextView) holder.getView(R.id.item_tera_box_title);
                    TextView textView2 = (TextView) holder.getView(R.id.item_tera_box_tip);
                    textView.setText(mTeraBoxListItem.getServer_filename());
                    textView2.setText(O0X11OiO.m791Oi().format(Long.valueOf(mTeraBoxListItem.getLocal_mtime())));
                    View view = holder.itemView;
                    final TeraBoxFileManagerActivity teraBoxFileManagerActivity = this.OXO1;
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ro5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            TeraBoxFileManagerActivity.C187761.OXO1.IiI10X(teraBoxFileManagerActivity, mTeraBoxListItem, view2);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_tera_box_dir;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(TeraBoxListItem teraBoxListItem, int i) {
                    return teraBoxListItem != null && teraBoxListItem.getIsdir() == 1;
                }
            }

            /* JADX INFO: renamed from: com.sma.smartv3.ui.device.TeraBoxFileManagerActivity$initData$1$XIi00iiXO */
            public static final class XIi00iiXO implements InterfaceC2572jc<TeraBoxListItem> {
                public final /* synthetic */ TeraBoxFileManagerActivity OXO1;

                public XIi00iiXO(TeraBoxFileManagerActivity teraBoxFileManagerActivity) {
                    this.OXO1 = teraBoxFileManagerActivity;
                }

                public static final void IiI10X(TeraBoxFileManagerActivity teraBoxFileManagerActivity, TeraBoxListItem teraBoxListItem, ImageView imageView, View view) {
                    if (teraBoxFileManagerActivity.mCheckedListID.contains(teraBoxListItem)) {
                        teraBoxFileManagerActivity.mCheckedListID.remove(teraBoxListItem);
                        imageView.setImageResource(R.drawable.file_uncheck_icon);
                    } else if (teraBoxFileManagerActivity.mCheckedListID.size() >= 20) {
                        imageView.setImageResource(R.drawable.file_uncheck_icon);
                        ToastUtils.showLong(R.string.too_manyfile_tip);
                    } else {
                        teraBoxFileManagerActivity.mCheckedListID.add(teraBoxListItem);
                        imageView.setImageResource(R.drawable.file_check_icon);
                    }
                    teraBoxFileManagerActivity.setButtonText();
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, final TeraBoxListItem mTeraBoxListItem, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mTeraBoxListItem, "mTeraBoxListItem");
                    TextView textView = (TextView) holder.getView(R.id.item_tera_box_title);
                    TextView textView2 = (TextView) holder.getView(R.id.item_tera_box_tip);
                    final ImageView imageView = (ImageView) holder.getView(R.id.item_check_music);
                    textView.setText(mTeraBoxListItem.getServer_filename());
                    textView2.setText(O0X11OiO.m791Oi().format(Long.valueOf(mTeraBoxListItem.getLocal_mtime())) + " " + cp5.X1IX((mTeraBoxListItem.getSize() / 1024.0f) / 1024.0f, false, 2, null) + "MB");
                    imageView.setImageResource(this.OXO1.mCheckedListID.contains(mTeraBoxListItem) ? R.drawable.file_check_icon : R.drawable.file_uncheck_icon);
                    View view = holder.itemView;
                    final TeraBoxFileManagerActivity teraBoxFileManagerActivity = this.OXO1;
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.so5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            TeraBoxFileManagerActivity.C187761.XIi00iiXO.IiI10X(teraBoxFileManagerActivity, mTeraBoxListItem, imageView, view2);
                        }
                    });
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_tera_box_music_file;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XOO0ii0, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(TeraBoxListItem teraBoxListItem, int i) {
                    return teraBoxListItem != null && teraBoxListItem.getIsdir() == 0;
                }
            }

            {
                addItemViewDelegate(1, new OXO1(this));
                addItemViewDelegate(0, new XIi00iiXO(this));
            }
        };
        getMRecyclerView().setVisibility(0);
        getMEmptyView().setVisibility(8);
        RecyclerView mRecyclerView = getMRecyclerView();
        MultiItemTypeAdapter<TeraBoxListItem> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        mRecyclerView.setAdapter(multiItemTypeAdapter);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMTitle().setText(R.string.tera_box_file_title);
        this.progressPopup = new C3006uq(this);
        getMButton().setEnabled(false);
        this.mMapTitle.put(this.mCurDir, getString(R.string.tera_box_file_title));
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        if (this.access_tokens.length() > 0) {
            getAbhTitleRight().setVisibility(0);
        }
        getAbhTitleRight().setImageResource(R.drawable.tera_box_clean_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getMClearImageView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.lo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeraBoxFileManagerActivity.initView$lambda$0(this.f9486IO, view);
            }
        });
        getMSearchImageView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.mo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeraBoxFileManagerActivity.initView$lambda$1(this.f9755IO, view);
            }
        });
        String string = a01.OXO1.IiI10X().getString(b01.OXi001);
        Intrinsics.XXI(string);
        if (string.length() > 0) {
            showShareView(string);
        }
        getMSwipeRefreshLayout().setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.android.mltcode.paycertificationapi.no5
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                this.OXO1.refreshData();
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_tera_box_file_manager;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        a01.OXO1.IiI10X().put(b01.IOi1O0, new Gson().toJson(this.mCheckedListID));
        I01XX0.XIi00iiXO(b01.IOi1O0, null, 2, null);
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        String str = "/";
        if (Intrinsics.XOO0ii0(this.mCurDir, "/")) {
            super.onHandleBackPressed();
            return;
        }
        int iIndexOf = this.mKeyIndex.indexOf(this.mCurDir);
        if (iIndexOf > 0) {
            this.mKeyIndex.remove(iIndexOf);
            String str2 = this.mKeyIndex.get(iIndexOf - 1);
            Intrinsics.XXI(str2);
            str = str2;
        }
        this.mCurDir = str;
        getMTitle().setText(this.mMapTitle.get(this.mCurDir));
        LogUtils.m11128d("back mCurDir = " + this.mCurDir);
        initData(this.mMapData.get(this.mCurDir));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@aa1 Intent intent) {
        Intrinsics.X0O(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int i = this.onResumeSum + 1;
        this.onResumeSum = i;
        if (!this.hasLogin || this.hasNewIntent || i <= 1) {
            return;
        }
        ToastUtils.showLong(getString(R.string.login_failed), new Object[0]);
        finish();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    public final void onTitleRightClick(@aa1 View view) {
        go0 go0Var;
        Intrinsics.X0O(view, "view");
        go0 go0Var2 = new go0(getMContext(), 0, 2, null);
        go0Var2.O1O(R.string.logout_tip);
        go0Var2.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.po5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(TeraBoxFileManagerActivity.onTitleRightClick$lambda$0$0());
            }
        });
        go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.qo5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(TeraBoxFileManagerActivity.onTitleRightClick$lambda$0$1(this.f10646IO));
            }
        });
        this.unLoginPopup = go0Var2;
        if (go0Var2.isShowing() || (go0Var = this.unLoginPopup) == null) {
            return;
        }
        go0Var.IIX1OXO();
    }

    public final void setAccess_tokens(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.access_tokens = str;
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

    public final void setProgressPopup(@tb1 C3006uq c3006uq) {
        this.progressPopup = c3006uq;
    }

    public final void setUnLoginPopup(@tb1 go0 go0Var) {
        this.unLoginPopup = go0Var;
    }

    public final void showLoadPopup() {
        dismissLoadPopup();
        C3006uq c3006uq = this.progressPopup;
        if (c3006uq != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            c3006uq.I1XOi1(rootView);
        }
    }

    public final void showShareView(@aa1 final String url) {
        Intrinsics.X0O(url, "url");
        getMShareView().setVisibility(0);
        getMShareView().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.oo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeraBoxFileManagerActivity.showShareView$lambda$0(url, this, view);
            }
        });
    }
}
