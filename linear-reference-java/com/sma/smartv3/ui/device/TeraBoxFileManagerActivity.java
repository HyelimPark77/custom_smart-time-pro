package com.sma.smartv3.ui.device;

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
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ao5;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bo5;
import com.android.mltcode.paycertificationapi.co5;
import com.android.mltcode.paycertificationapi.do5;
import com.android.mltcode.paycertificationapi.eo5;
import com.android.mltcode.paycertificationapi.fo5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.go5;
import com.android.mltcode.paycertificationapi.ho5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.io5;
import com.android.mltcode.paycertificationapi.jo5;
import com.android.mltcode.paycertificationapi.ko5;
import com.android.mltcode.paycertificationapi.lo5;
import com.android.mltcode.paycertificationapi.mo5;
import com.android.mltcode.paycertificationapi.no5;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.oo5;
import com.android.mltcode.paycertificationapi.po5;
import com.android.mltcode.paycertificationapi.qo5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.wn5;
import com.android.mltcode.paycertificationapi.xn5;
import com.android.mltcode.paycertificationapi.yn5;
import com.android.mltcode.paycertificationapi.zn5;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.sma.smartv3.biz.MusicServerManager;
import com.sma.smartv3.model.TeraBoxListItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.WebViewActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nTeraBoxFileManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,448:1\n87#2,7:449\n94#2,3:457\n70#2,7:460\n97#2:467\n1#3:456\n35#4,2:468\n*S KotlinDebug\n*F\n+ 1 TeraBoxFileManagerActivity.kt\ncom/sma/smartv3/ui/device/TeraBoxFileManagerActivity\n*L\n123#1:449,7\n123#1:457,3\n123#1:460,7\n123#1:467\n123#1:456\n324#1:468,2\n*E\n"})
public final class TeraBoxFileManagerActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    public static final int FILE_DIR = 1;
    public static final int FILE_MUSIC = 0;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private String access_tokens;
    private boolean hasLogin;
    private boolean hasNewIntent;
    private MultiItemTypeAdapter<TeraBoxListItem> mAdapter;

    @aa1
    private final Lazy mButton$delegate;

    @aa1
    private final ArrayList<TeraBoxListItem> mCheckedListID;

    @aa1
    private final Lazy mClearImageView$delegate;

    @aa1
    private String mCurDir;

    @aa1
    private final Lazy mEditText$delegate;

    @aa1
    private final Lazy mEmptyView$delegate;

    @aa1
    private final ArrayList<String> mKeyIndex;

    @aa1
    private final HashMap<String, List<TeraBoxListItem>> mMapData;

    @aa1
    private final HashMap<String, String> mMapTitle;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @aa1
    private final Lazy mSearchImageView$delegate;

    @aa1
    private final Lazy mShareView$delegate;

    @aa1
    private final Lazy mSwipeRefreshLayout$delegate;

    @aa1
    private final Lazy mTitle$delegate;
    private boolean mTouches;
    private int onResumeSum;
    private int page;

    @tb1
    private uq progressPopup;

    @aa1
    private final Lazy rootView$delegate;

    @tb1
    private go0 unLoginPopup;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public TeraBoxFileManagerActivity() {
        this.access_tokens = "";
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new xn5(this));
        this.mTitle$delegate = LazyKt__LazyJVMKt.iO(new zn5(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new ao5(this));
        this.mEditText$delegate = LazyKt__LazyJVMKt.iO(new bo5(this));
        this.mClearImageView$delegate = LazyKt__LazyJVMKt.iO(new co5(this));
        this.mSearchImageView$delegate = LazyKt__LazyJVMKt.iO(new do5(this));
        this.mSwipeRefreshLayout$delegate = LazyKt__LazyJVMKt.iO(new eo5(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new fo5(this));
        this.mEmptyView$delegate = LazyKt__LazyJVMKt.iO(new go5(this));
        this.mShareView$delegate = LazyKt__LazyJVMKt.iO(new io5(this));
        this.mButton$delegate = LazyKt__LazyJVMKt.iO(new yn5(this));
        this.mMapData = new HashMap();
        this.mMapTitle = new HashMap();
        this.mKeyIndex = new ArrayList();
        this.mCheckedListID = new ArrayList();
        this.mCurDir = "/";
        this.page = 1;
    }

    public static /* synthetic */ Button I0iXXO(TeraBoxFileManagerActivity r0) {
        return mButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText I1(TeraBoxFileManagerActivity r0) {
        return mEditText_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I1XOi1(TeraBoxFileManagerActivity r0) {
        initView$lambda$2(r0);
    }

    public static /* synthetic */ RecyclerView II1Xi0(TeraBoxFileManagerActivity r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(TeraBoxFileManagerActivity r0) {
        return mTitle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(TeraBoxFileManagerActivity r0) {
        return mEmptyView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(String r0, TeraBoxFileManagerActivity r1, View r2) {
        showShareView$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ ImageView OIX0iXi(TeraBoxFileManagerActivity r0) {
        return mClearImageView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OX(TeraBoxFileManagerActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ Unit OiIIX101O(TeraBoxFileManagerActivity r0, List r1) {
        return getTeraBoxList$lambda$0(r0, r1);
    }

    public static /* synthetic */ View X01IiOiIi(TeraBoxFileManagerActivity r0) {
        return mShareView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0O(TeraBoxFileManagerActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X1ii(TeraBoxFileManagerActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(TeraBoxFileManagerActivity r0, String r1) {
        return getTeraShareUrl$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean XXI() {
        return onTitleRightClick$lambda$0$0();
    }

    public static /* synthetic */ Unit XiOIO(TeraBoxFileManagerActivity r0, String r1, List r2) {
        return getTeraBoxSearchFile$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ void XiOIii1(TeraBoxFileManagerActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ ArrayList access$getMCheckedListID$p(TeraBoxFileManagerActivity r0) {
        return r0.mCheckedListID;
    }

    public static final /* synthetic */ String access$getMCurDir$p(TeraBoxFileManagerActivity r0) {
        return r0.mCurDir;
    }

    public static final /* synthetic */ ArrayList access$getMKeyIndex$p(TeraBoxFileManagerActivity r0) {
        return r0.mKeyIndex;
    }

    public static final /* synthetic */ HashMap access$getMMapData$p(TeraBoxFileManagerActivity r0) {
        return r0.mMapData;
    }

    public static final /* synthetic */ HashMap access$getMMapTitle$p(TeraBoxFileManagerActivity r0) {
        return r0.mMapTitle;
    }

    public static final /* synthetic */ TextView access$getMTitle(TeraBoxFileManagerActivity r0) {
        return r0.getMTitle();
    }

    public static final /* synthetic */ void access$setMCurDir$p(TeraBoxFileManagerActivity r0, String r1) {
        r0.mCurDir = r1;
    }

    public static final /* synthetic */ void access$setPage$p(TeraBoxFileManagerActivity r0, int r1) {
        r0.page = r1;
    }

    private final void analyzeURL(Uri r3) {
        LogUtils.d(new Object[]{"handleIntent  -->  uri = " + r3});
        if (r3 == null) goto L5;
        String r4 = r3.getQueryParameter("code");
    L6:
        if (r4 != null) goto L8;
    L11:
        ToastUtils.showLong("handleIntent login error", new Object[0]);
        return;
    L8:
        if (r4.length() <= 0) goto L11;
        this.hasNewIntent = true;
        showLoadPopup();
        MusicServerManager.OXO1.IIX1OXO(r4, new ho5(this));
        return;
    L5:
        r4 = null;
        goto L6
    }

    private static final Unit analyzeURL$lambda$0(TeraBoxFileManagerActivity r3, String r4) {
        if (r4 != null) goto L5;
    L7:
        LogUtils.d(new Object[]{"handleIntent login error it = " + r4});
        ToastUtils.showLong("handleIntent login error it = " + r4, new Object[0]);
    L8:
        r3.dismissLoadPopup();
        return Unit.OXO1;
    L5:
        if (r4.length() <= 0) goto L7;
        r3.access_tokens = r4;
        r3.mCurDir = "/";
        r3.getTeraBoxList();
        r3.getTeraShareUrl();
        r3.getAbhTitleRight().setVisibility(0);
        goto L8
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
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

    private final View getMShareView() {
        return (View) getValue();
    }

    private final SwipeRefreshLayout getMSwipeRefreshLayout() {
        return (SwipeRefreshLayout) getValue();
    }

    private final TextView getMTitle() {
        return (TextView) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private static final Unit getTeraBoxList$lambda$0(TeraBoxFileManagerActivity r3, List r4) {
        r3.mTouches = false;
        if (r4 != null) goto L5;
        r3.getMRecyclerView().setVisibility(8);
        r3.getMEmptyView().setVisibility(0);
    L11:
        r3.getMSwipeRefreshLayout().setRefreshing(false);
        r3.dismissLoadPopup();
        return Unit.OXO1;
    L5:
        if (r3.page != 1) goto L9;
        r3.mMapData.put(r3.mCurDir, r4);
        if (r3.mKeyIndex.contains(r3.mCurDir) == true) goto L9;
        r3.mKeyIndex.add(r3.mCurDir);
    L9:
        r3.initData(r4);
        goto L11
    }

    private static final Unit getTeraBoxSearchFile$lambda$0(TeraBoxFileManagerActivity r4, String r5, List r6) {
        r4.mTouches = false;
        if (r6 == null) goto L5;
        r4.mMapData.put(r4.mCurDir, r6);
        r4.mMapTitle.put(r4.mCurDir, r4.getString(R.string.search) + CertificateUtil.DELIMITER + r5);
        r4.mKeyIndex.add(r4.mCurDir);
        r4.initData(r6);
    L5:
        r4.dismissLoadPopup();
        return Unit.OXO1;
    }

    private static final Unit getTeraShareUrl$lambda$0(TeraBoxFileManagerActivity r1, String r2) {
        Intrinsics.X0O(r2, "it");
        if (r2.length() <= 0) goto L6;
        r1.showShareView(r2);
    L6:
        return Unit.OXO1;
    }

    private final void handleIntent(Intent r1) {
        analyzeURL(r1.getData());
    }

    public static /* synthetic */ ImageView i010I(TeraBoxFileManagerActivity r0) {
        return mSearchImageView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit iIiiO(TeraBoxFileManagerActivity r0, String r1) {
        return analyzeURL$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean iOOX010X(TeraBoxFileManagerActivity r0) {
        return onTitleRightClick$lambda$0$1(r0);
    }

    public static /* synthetic */ SwipeRefreshLayout iX(TeraBoxFileManagerActivity r0) {
        return mSwipeRefreshLayout_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(TeraBoxFileManagerActivity r0, View r1) {
        r0.getMEditText().getText().clear();
    }

    private static final void initView$lambda$1(TeraBoxFileManagerActivity r4, View r5) {
        if (r4.mTouches == false) goto L5;
        return;
    L5:
        r4.mTouches = true;
        r4.showLoadPopup();
        String r6 = r4.getMEditText().getText().toString();
        r4.mCurDir = r4.getString(R.string.search) + CertificateUtil.DELIMITER + r6;
        r4.getMTitle().setText(r4.getString(R.string.search) + CertificateUtil.DELIMITER + r6);
        r4.getTeraBoxSearchFile(r6);
    }

    private static final void initView$lambda$2(TeraBoxFileManagerActivity r0) {
        r0.refreshData();
    }

    private static final Button mButton_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final ImageView mClearImageView_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (ImageView) r1.findViewById(R.id.tera_box_file_et_clear);
    }

    private static final EditText mEditText_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (EditText) r1.findViewById(R.id.tera_box_file_et);
    }

    private static final View mEmptyView_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return r1.findViewById(R.id.empty_view);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.tera_box_file_recycler);
    }

    private static final ImageView mSearchImageView_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (ImageView) r1.findViewById(R.id.tera_box_file_search);
    }

    private static final View mShareView_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return r1.findViewById(R.id.tera_box_share_layout);
    }

    private static final SwipeRefreshLayout mSwipeRefreshLayout_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (SwipeRefreshLayout) r1.findViewById(R.id.tera_box_file_srf);
    }

    private static final TextView mTitle_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final boolean onTitleRightClick$lambda$0$0() {
        return true;
    }

    private static final boolean onTitleRightClick$lambda$0$1(TeraBoxFileManagerActivity r3) {
        a01 r0 = a01.OXO1;
        r0.IiI10X().remove(b01.O1);
        r0.IiI10X().remove(b01.O1iXiI);
        r3.finish();
        return true;
    }

    private final void refreshData() {
        getMSwipeRefreshLayout().setRefreshing(true);
        getTeraBoxList();
    }

    private static final View rootView_delegate$lambda$0(TeraBoxFileManagerActivity r1) {
        return r1.findViewById(R.id.rootView);
    }

    private static final void showShareView$lambda$0(String r3, TeraBoxFileManagerActivity r4, View r5) {
        if (oe5.O0(r3, "http", false, 2, null) == false) goto L5;
    L8:
        Intent r6 = new Intent();
        r6.setData(Uri.parse(r3));
        r6.setAction("android.intent.action.VIEW");
        r4.startActivity(r6);
        return;
    L5:
        if (i72.OXO1.I0i1OXiI() == false) goto L7;
        r3 = "https://terabox.com/s/1aDs3IL6xbpMQvsbHZ6l0vg";
        goto L8
    L7:
        r3 = "https://pan.baidu.com/s/1GatP9OXF9mmy2MTwtohHOw?pwd=k7y4";
        goto L8
    }

    public final void dismissLoadPopup() {
        uq r0 = this.progressPopup;
        if (r0 == null) goto L6;
        r0.dismiss();
        return;
    }

    @aa1
    public final String getAccess_tokens() {
        return this.access_tokens;
    }

    @tb1
    public final uq getProgressPopup() {
        return this.progressPopup;
    }

    public final void getTeraBoxCode() {
        if (i72.OXO1.I0i1OXiI() == false) goto L6;
        Intent r0 = new Intent();
        r0.setData(Uri.parse(MusicServerManager.OXO1.IiI10X(this)));
        r0.setAction("android.intent.action.VIEW");
        startActivity(r0);
        return;
    L6:
        String r1 = MusicServerManager.OXO1.IiI10X(this);
        Bundle r2 = new Bundle();
        r2.putString("mArg0", r1);
        r2.putInt("mArg1", 2);
        r2.putParcelable("mArg2", null);
        r2.putSerializable("mArg3", null);
        Intent r3 = new Intent(this, WebViewActivity.class);
        r3.putExtras(r2);
        startActivity(r3);
    }

    public final void getTeraBoxList() {
        if (this.mTouches == false) goto L5;
        return;
    L5:
        this.mTouches = true;
        showLoadPopup();
        MusicServerManager.X0O(MusicServerManager.OXO1, this.access_tokens, this.mCurDir, this.page, 0, new wn5(this), 8, null);
    }

    public final void getTeraBoxSearchFile(@aa1 final String r4) {
        Intrinsics.X0O(r4, "text");
        MusicServerManager.OXO1.XXI(this.access_tokens, r4, new jo5(this, r4));
    }

    public final void getTeraShareUrl() {
        MusicServerManager.OXO1.OIX0iXi(new ko5(this));
    }

    @tb1
    public final go0 getUnLoginPopup() {
        return this.unLoginPopup;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        String r3 = a01.OXO1.IiI10X().getString(b01.O1);
        Intrinsics.O10IXXX0X(r3, "getString(...)");
        this.access_tokens = r3;
        if (r3.length() != 0) goto L6;
        this.onResumeSum = 0;
        this.hasLogin = true;
        getTeraBoxCode();
        return;
    L6:
        this.mCurDir = "/";
        getTeraBoxList();
        getTeraShareUrl();
    }

    public final void initData(@tb1 final List<TeraBoxListItem> r4) {
        if (r4 != null) goto L5;
    L11:
        getMRecyclerView().setVisibility(8);
        getMEmptyView().setVisibility(0);
        return;
    L5:
        if (r4.size() <= 0) goto L11;
        dismissLoadPopup();
        this.mAdapter = new AnonymousClass1(this, r4);
        getMRecyclerView().setVisibility(0);
        getMEmptyView().setVisibility(8);
        RecyclerView r5 = getMRecyclerView();
        MultiItemTypeAdapter<TeraBoxListItem> r0 = this.mAdapter;
        if (r0 != null) goto L9;
        Intrinsics.XXO("mAdapter");
        r0 = null;
    L9:
        r5.setAdapter(r0);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getMTitle().setText(R.string.tera_box_file_title);
        this.progressPopup = new uq(this);
        getMButton().setEnabled(false);
        this.mMapTitle.put(this.mCurDir, getString(R.string.tera_box_file_title));
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        if (this.access_tokens.length() <= 0) goto L5;
        getAbhTitleRight().setVisibility(0);
    L5:
        getAbhTitleRight().setImageResource(R.drawable.tera_box_clean_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        getMClearImageView().setOnClickListener(new lo5(this));
        getMSearchImageView().setOnClickListener(new mo5(this));
        String r0 = a01.OXO1.IiI10X().getString(b01.OXi001);
        Intrinsics.XXI(r0);
        if (r0.length() <= 0) goto L8;
        showShareView(r0);
    L8:
        getMSwipeRefreshLayout().setOnRefreshListener(new no5(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_tera_box_file_manager;
    }

    public final void onBottomClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        SPUtils r4 = a01.OXO1.IiI10X();
        ArrayList<TeraBoxListItem> r0 = this.mCheckedListID;
        r4.put(b01.IOi1O0, new Gson().toJson(r0));
        I01XX0.XIi00iiXO(b01.IOi1O0, null, 2, null);
        finish();
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        String r1 = "/";
        if (Intrinsics.XOO0ii0(this.mCurDir, "/") == false) goto L6;
        super.onHandleBackPressed();
        return;
    L6:
        int r0 = this.mKeyIndex.indexOf(this.mCurDir);
        if (r0 <= 0) goto L9;
        this.mKeyIndex.remove(r0);
        String r2 = this.mKeyIndex.get(r0 - 1);
        Intrinsics.XXI(r2);
        r1 = r2;
    L9:
        this.mCurDir = r1;
        getMTitle().setText(this.mMapTitle.get(this.mCurDir));
        LogUtils.d(new Object[]{"back mCurDir = " + this.mCurDir});
        initData(this.mMapData.get(this.mCurDir));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@aa1 Intent r2) {
        Intrinsics.X0O(r2, SDKConstants.PARAM_INTENT);
        super.onNewIntent(r2);
        setIntent(r2);
        handleIntent(r2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int r0 = this.onResumeSum + 1;
        this.onResumeSum = r0;
        if (this.hasLogin == true) goto L5;
        return;
    L5:
        if (this.hasNewIntent == true) goto L10;
        if (r0 <= 1) goto L11;
        ToastUtils.showLong(getString(R.string.login_failed), new Object[0]);
        finish();
        return;
    L11:
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    public final void onTitleRightClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        int r3 = 0;
        go0 r6 = new go0(getMContext(), r3, 2, null);
        r6.O1O(R.string.logout_tip);
        r6.iX1O1(Integer.valueOf(R.string.cancel), new po5());
        r6.X1IX(R.string.confirm, new qo5(this));
        this.unLoginPopup = r6;
        if (r6.isShowing() != true) goto L5;
        return;
    L5:
        go0 r7 = this.unLoginPopup;
        if (r7 == null) goto L9;
        r7.IIX1OXO();
        return;
    }

    public final void setAccess_tokens(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.access_tokens = r2;
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

    public final void setProgressPopup(@tb1 uq r1) {
        this.progressPopup = r1;
    }

    public final void setUnLoginPopup(@tb1 go0 r1) {
        this.unLoginPopup = r1;
    }

    public final void showLoadPopup() {
        dismissLoadPopup();
        uq r0 = this.progressPopup;
        if (r0 == null) goto L6;
        View r1 = getRootView();
        Intrinsics.O10IXXX0X(r1, "<get-rootView>(...)");
        r0.I1XOi1(r1);
        return;
    }

    public final void showShareView(@aa1 final String r3) {
        Intrinsics.X0O(r3, "url");
        getMShareView().setVisibility(0);
        getMShareView().setOnClickListener(new oo5(r3, this));
    }
}
