package com.sma.smartv3.ui.device.dial;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0;
import com.android.mltcode.paycertificationapi.I0XXi0X;
import com.android.mltcode.paycertificationapi.I0i1OXiI;
import com.android.mltcode.paycertificationapi.IOIi00;
import com.android.mltcode.paycertificationapi.IOi1O0;
import com.android.mltcode.paycertificationapi.IX0iIX;
import com.android.mltcode.paycertificationapi.IXiOXO;
import com.android.mltcode.paycertificationapi.O1;
import com.android.mltcode.paycertificationapi.O101;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.O1iXiI;
import com.android.mltcode.paycertificationapi.OXi001;
import com.android.mltcode.paycertificationapi.X1OI;
import com.android.mltcode.paycertificationapi.XIIO11I;
import com.android.mltcode.paycertificationapi.XIO11I;
import com.android.mltcode.paycertificationapi.XXI0XOIX;
import com.android.mltcode.paycertificationapi.XXOXi;
import com.android.mltcode.paycertificationapi.Xii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i100IXOX;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIX0i;
import com.android.mltcode.paycertificationapi.iOX;
import com.android.mltcode.paycertificationapi.iiII;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.JobDetail;
import com.sma.smartv3.model.JobDetailV2;
import com.sma.smartv3.model.JobInfo;
import com.sma.smartv3.model.JobV2Extra;
import com.sma.smartv3.network.AICreateJobV2;
import com.sma.smartv3.network.AigcCreateJob;
import com.sma.smartv3.network.AigcFindJob;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BleInfo;
import com.sma.smartv3.network.GetAIChat;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.ui.trim.VideoTrimmerActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.Languages;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.OXO1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,718:1\n176#2,11:719\n196#2:738\n325#2,11:739\n336#2:751\n347#2:770\n176#2,11:771\n196#2:790\n252#3,7:730\n270#3:737\n383#3,18:752\n252#3,7:782\n270#3:789\n1#4:750\n1#4:818\n11561#5:791\n11896#5,3:792\n35#6,2:795\n35#6,2:801\n19#6:803\n15#6:804\n19#6:805\n15#6:806\n19#6:807\n15#6:808\n11#6,2:809\n1563#7:797\n1634#7,3:798\n99#8,7:811\n106#8,3:819\n79#8,7:822\n109#8:829\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment\n*L\n218#1:719,11\n218#1:738\n281#1:739,11\n281#1:751\n281#1:770\n349#1:771,11\n349#1:790\n218#1:730,7\n218#1:737\n281#1:752,18\n349#1:782,7\n349#1:789\n281#1:750\n334#1:818\n533#1:791\n533#1:792,3\n532#1:795,2\n545#1:801,2\n647#1:803\n647#1:804\n660#1:805\n660#1:806\n330#1:807\n330#1:808\n331#1:809,2\n546#1:797\n546#1:798,3\n334#1:811,7\n334#1:819,3\n334#1:822,7\n334#1:829\n*E\n"})
public class AIGCFragment extends BaseFragment {

    @aa1
    private final String TAG;

    @aa1
    private String bgFile;

    @aa1
    private final Lazy btnAgain$delegate;

    @aa1
    private final Lazy btnGen$delegate;

    @aa1
    private final Lazy btnNextStep$delegate;

    @aa1
    private final Lazy btnSearch$delegate;

    @aa1
    private final Lazy etContent$delegate;
    private int findJobNumber;

    @aa1
    private final Lazy genPanel$delegate;

    @aa1
    private final Lazy itemStyle$delegate;
    private int mCurStyle;
    private String mJobId;

    @tb1
    private uq mLoadingPopup;

    @tb1
    private go0 mPayTipPopup;

    @aa1
    private final Lazy mRecyclerView$delegate;

    @tb1
    private pv1 mStyleSetPopup;

    @tb1
    private String[] picUrls;

    @tb1
    private List<Bitmap> picUrlsBitmap;

    @aa1
    private final Lazy previewPanel$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.AIGCFragment$findJob$1, reason: invalid class name and case insensitive filesystem */
    public static final class C34561 implements O1XIiIO<JobDetail> {
        public final /* synthetic */ AIGCFragment OXO1;

        public C34561(AIGCFragment r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(AIGCFragment r0) {
            iO(r0);
        }

        public static final void iO(AIGCFragment r2) {
            r2.setFindJobNumber(r2.getFindJobNumber() + 1);
            if (r2.getFindJobNumber() >= 20) goto L6;
            String r0 = r2.getMJobId();
            Intrinsics.O10IXXX0X(r0, "<get-mJobId>(...)");
            r2.findJob(r0);
            return;
        L6:
            AIGCFragment.access$dismissLoadPopup(r2);
            ToastUtils.showLong(R.string.request_error);
        }

        public void XIi00iiXO(JobDetail r5) {
            LogUtils.d(new Object[]{"findJobNumber = " + this.OXO1.getFindJobNumber() + " findJob -> " + r5});
            if (r5 == null) goto L14;
            int r0 = r5.getJobStatus();
            if (r0 != 2) goto L7;
            AIGCFragment.access$dismissLoadPopup(this.OXO1);
            ToastUtils.showLong(r5.getJobErrCode() + " = " + r5.getJobErrMsg(), new Object[0]);
            return;
        L7:
            if (r0 == 3) goto L10;
            Handler r6 = new Handler();
            final AIGCFragment r1 = this.OXO1;
            r6.postDelayed(new IOIi00(r1), 3000);
            return;
        L10:
            this.OXO1.showPics(r5.getImages(), r5.getImageSign());
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r3) {
            Intrinsics.X0O(r3, "error");
            LogUtils.d(new Object[]{"findJob -> error = " + r3});
            AIGCFragment.access$dismissLoadPopup(this.OXO1);
            ToastUtils.showLong(r3, new Object[0]);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(JobDetail r1) {
            XIi00iiXO(r1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.AIGCFragment$generateAIGC$1, reason: invalid class name and case insensitive filesystem */
    public static final class C34571 implements O1XIiIO<Bitmap> {
        public final /* synthetic */ AIGCFragment OXO1;

        public C34571(AIGCFragment r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ void OXO1(Bitmap r0, AIGCFragment r1) {
            iO(r0, r1);
        }

        public static final void iO(Bitmap r1, AIGCFragment r2) {
            ArrayList r0 = new ArrayList();
            r0.add(r1);
            r2.showPicsSparkChain(r0);
        }

        public void XIi00iiXO(final Bitmap r3) {
            if (r3 == null) goto L5;
            final AIGCFragment r0 = this.OXO1;
            ThreadUtils.runOnUiThread(new XIO11I(r3, r0));
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String r2) {
            Intrinsics.X0O(r2, "error");
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(Bitmap r1) {
            XIi00iiXO(r1);
        }
    }

    public AIGCFragment() {
        this.TAG = "AIGC";
        this.genPanel$delegate = LazyKt__LazyJVMKt.iO(new i100IXOX(this));
        this.etContent$delegate = LazyKt__LazyJVMKt.iO(new XXI0XOIX(this));
        this.previewPanel$delegate = LazyKt__LazyJVMKt.iO(new XIIO11I(this));
        this.itemStyle$delegate = LazyKt__LazyJVMKt.iO(new XXOXi(this));
        this.btnSearch$delegate = LazyKt__LazyJVMKt.iO(new I0XXi0X(this));
        this.btnGen$delegate = LazyKt__LazyJVMKt.iO(new IOi1O0(this));
        this.btnNextStep$delegate = LazyKt__LazyJVMKt.iO(new O1(this));
        this.btnAgain$delegate = LazyKt__LazyJVMKt.iO(new O1iXiI(this));
        this.mRecyclerView$delegate = LazyKt__LazyJVMKt.iO(new IX0iIX(this));
        a01 r0 = a01.OXO1;
        this.mJobId = r0.IiI10X().getString(b01.XXiO0i);
        this.mCurStyle = r0.IiI10X().getInt(b01.IX0IXOi, 0);
        this.bgFile = "";
    }

    public static /* synthetic */ boolean I0IIOi(AIGCFragment r0, int r1) {
        return onSetStyle$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ RecyclerView I0iXXO(AIGCFragment r0) {
        return mRecyclerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(AIGCFragment r0, View r1, int r2, KeyEvent r3) {
        return initView$lambda$3(r0, r1, r2, r3);
    }

    public static /* synthetic */ AbhSettingsItem IIX1OXO(AIGCFragment r0) {
        return itemStyle_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IO(AIGCFragment r0) {
        return btnAgain_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View IiI10X(AIGCFragment r0) {
        return btnGen_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O00(AIGCFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ View O10IXXX0X(AIGCFragment r0) {
        return previewPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(boolean r0, go0 r1, AIGCFragment r2) {
        return showPayTipPopup$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void OIi0(AIGCFragment r0, View r1) {
        initView$lambda$5(r0, r1);
    }

    public static /* synthetic */ void X0O(AIGCFragment r0) {
        dismissLoadPopup$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(AIGCFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void XIi00iiXO(AIGCFragment r0, View r1) {
        initView$lambda$4(r0, r1);
    }

    public static /* synthetic */ View XO0O10(AIGCFragment r0) {
        return btnSearch_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText XOO0ii0(AIGCFragment r0) {
        return etContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(AIGCFragment r0) {
        return btnNextStep_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIO(AIGCFragment r0) {
        return genPanel_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ void access$dismissLoadPopup(AIGCFragment r0) {
        r0.dismissLoadPopup();
    }

    public static final /* synthetic */ String access$getTAG$p(AIGCFragment r0) {
        return r0.TAG;
    }

    private static final View btnAgain_delegate$lambda$0(AIGCFragment r1) {
        return r1.getMView().findViewById(R.id.btn_again);
    }

    private static final View btnGen_delegate$lambda$0(AIGCFragment r1) {
        return r1.getMView().findViewById(R.id.btn_gen);
    }

    private static final View btnNextStep_delegate$lambda$0(AIGCFragment r1) {
        return r1.getMView().findViewById(R.id.btn_gen_next_step);
    }

    private static final View btnSearch_delegate$lambda$0(AIGCFragment r1) {
        return r1.getMView().findViewById(R.id.btn_search);
    }

    private final void dismissLoadPopup() {
        ThreadUtils.runOnUiThread(new OXi001(this));
    }

    private static final void dismissLoadPopup$lambda$0(AIGCFragment r0) {
        uq r1 = r0.mLoadingPopup;
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private static final EditText etContent_delegate$lambda$0(AIGCFragment r1) {
        return (EditText) r1.getMView().findViewById(R.id.edt_content);
    }

    private static final View genPanel_delegate$lambda$0(AIGCFragment r1) {
        return r1.getMView().findViewById(R.id.gen_panel);
    }

    private final View getBtnGen() {
        return (View) getValue();
    }

    public static /* synthetic */ void iO(AIGCFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private static final void initView$lambda$0(AIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onSetStyle(r1);
    }

    private static final void initView$lambda$1(AIGCFragment r1, View r2) {
        if (q62.OXO1.XOX() == true) goto L6;
        Intrinsics.XXI(r2);
        r1.onSearch(r2);
        return;
    L6:
        ToastUtils.showLong(R.string.parameter_check_failed);
    }

    private static final void initView$lambda$2(AIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onGen(r1);
    }

    private static final boolean initView$lambda$3(AIGCFragment r1, View r2, int r3, KeyEvent r4) {
        if (r4.getAction() == 1) goto L5;
    L11:
        return false;
    L5:
        if (r3 != 4) goto L11;
        uq r5 = r1.mLoadingPopup;
        if (r5 == null) goto L11;
        if (r5.isShowing() != true) goto L11;
        return true;
    }

    private static final void initView$lambda$4(AIGCFragment r0, View r1) {
        Intrinsics.XXI(r1);
        r0.onAgain(r1);
    }

    private static final void initView$lambda$5(AIGCFragment r0, View r1) {
        r0.onNextStep();
    }

    private static final AbhSettingsItem itemStyle_delegate$lambda$0(AIGCFragment r1) {
        return (AbhSettingsItem) r1.getMView().findViewById(R.id.item_style);
    }

    private static final RecyclerView mRecyclerView_delegate$lambda$0(AIGCFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.rv);
    }

    private static final boolean onSetStyle$lambda$0$0(AIGCFragment r2, int r3) {
        r2.mCurStyle = r3;
        AbhSettingsItem r4 = r2.getItemStyle();
        String r0 = r2.getResources().getStringArray(R.array.aigc_styles)[r2.mCurStyle];
        Intrinsics.O10IXXX0X(r0, "get(...)");
        r4.setMRightText(r0);
        a01.OXO1.IiI10X().put(b01.IX0IXOi, r2.mCurStyle);
        return true;
    }

    private static final View previewPanel_delegate$lambda$0(AIGCFragment r1) {
        return r1.getMView().findViewById(R.id.preview_panel);
    }

    private final void showLoadPopup() {
        if (this.mLoadingPopup != null) goto L5;
        FragmentActivity r1 = requireActivity();
        Intrinsics.O10IXXX0X(r1, "requireActivity(...)");
        uq r0 = new uq(r1);
        String r2 = getString(R.string.working_generate_tip);
        Intrinsics.O10IXXX0X(r2, "getString(...)");
        r0.II1Xi0(r2);
        this.mLoadingPopup = r0;
    L5:
        uq r3 = this.mLoadingPopup;
        if (r3 == null) goto L11;
        if (r3.isShowing() != true) goto L11;
        return;
    L11:
        if (q62.OXO1.XOX() == false) goto L17;
        i72 r4 = i72.OXO1;
        if (r4.Ii() == true) goto L17;
        if (r4.IIII0iI() == false) goto L17;
        return;
    L17:
        uq r5 = this.mLoadingPopup;
        if (r5 == null) goto L21;
        r5.IIX1OXO();
        return;
    }

    public static /* synthetic */ void showPayTipPopup$default(AIGCFragment r0, int r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = R.string.points_insufficient_tip;
    L7:
        if ((r3 & 2) == 0) goto L9;
        r2 = false;
    L9:
        r0.showPayTipPopup(r1, r2);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPayTipPopup");
    }

    private static final boolean showPayTipPopup$lambda$0$0(boolean r32, go0 r33, AIGCFragment r34) {
        if (r32 == false) goto L8;
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L7;
        r2 = r3;
    L7:
        SPUtils r4 = r0.XO0O10();
        String r5 = AppUser.class.getName();
        Gson r6 = new Gson();
        r4.put(r5, r6.toJson((AppUser) r2));
        i72.OXO1.OiXXXi10(r33.XO0O10());
        return true;
    L8:
        String r7 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r8 = new Bundle();
        r8.putString("mArg0", r7);
        r8.putInt("mArg1", 2);
        r8.putParcelable("mArg2", null);
        r8.putSerializable("mArg3", null);
        Intent r9 = new Intent(r34.getActivity(), GoogleWebViewActivity.class);
        r9.putExtras(r8);
        r34.startActivity(r9);
        return true;
    }

    public final void AIGC_AIChat(@aa1 final AIQuestion r6, @aa1 final String r7) {
        Intrinsics.X0O(r6, "question");
        Intrinsics.X0O(r7, "style");
        r6.setStream(true);
        r6.setModel("baiduAIService");
        r6.setText(AIManager.OXO1.iOO1ii1(r6.getText()));
        final StringBuilder r0 = new StringBuilder();
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        String r2 = new Gson().toJson(r6);
        Intrinsics.O10IXXX0X(r2, "toJson(...)");
        r1.postStreamRequest(GetAIChat.URL, getHeadersMap(), r2, new AnonymousClass1(this, r6, r7, r0));
    }

    public final boolean containsChineseCharacter(@aa1 String r3) {
        Intrinsics.X0O(r3, "str");
        Pattern r0 = Pattern.compile("[\\u4E00-\\u9FA5]+");
        Intrinsics.O10IXXX0X(r0, "compile(...)");
        Matcher r4 = r0.matcher(r3);
        Intrinsics.O10IXXX0X(r4, "matcher(...)");
        return r4.find();
    }

    public final void createJob(@aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r8, "query");
        Intrinsics.X0O(r9, "style");
        q62 r1 = q62.OXO1;
        if (r1.OIXOOi() == false) goto L6;
        generateAIGC(r8);
        return;
    L6:
        int r2 = r1.OiIIX101O();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " createJob -> " + r8 + ", " + r9 + ", " + r2);
        final Activity r4 = null;
        StatManager.iO(StatManager.OXO1, 1, null, 2, null);
        NetWorkUtils r3 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r10 = RequestBodyKt.aigcCreateJobBody(r8, r9, r2);
        final O1XIiIO<JobInfo> r11 = new C34541(this);
        final uq r5 = r3.loadPopup(null, null);
        String r6 = r3.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AigcCreateJob.URL);
        r3.printParam(r6 + AigcCreateJob.URL, r10);
        NetWork r7 = NetWork.OXO1;
        String r12 = r6 + AigcCreateJob.URL;
        final O1XIiIO<Response<JobInfo>> r13 = new AIGCFragment$createJob$$inlined$post$default$1(r4, r11, r5);
        AndroidNetworking.post(r12).addBodyParameter(r10).setTag(r12).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{JobInfo.class}), new AIGCFragment$createJob$$inlined$post$default$2(r13));
    }

    public final void createJobV2(@aa1 String r12, @aa1 String r13) {
        Intrinsics.X0O(r12, "query");
        Intrinsics.X0O(r13, "style");
        if (q62.OXO1.OIXOOi() == false) goto L6;
        generateAIGC(r12);
        return;
    L6:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " createJobV2 -> " + r12 + ", " + r13);
        final Activity r3 = null;
        String r2 = AIManager.OIX0iXi(AIManager.OXO1, 0, 1, null);
        NetWorkUtils r4 = NetWorkUtils.INSTANCE;
        HashMap<String, Object> r14 = RequestBodyKt.aigcCreateJobBodyV2(r12, r2, new JobV2Extra(r13, "1"));
        final O1XIiIO<JobDetailV2> r15 = new C34551(this);
        Map<String, String> r5 = r4.getHeadersMap();
        final uq r6 = r4.loadPopup(null, null);
        String r7 = r4.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AICreateJobV2.URL);
        String r8 = r7 + AICreateJobV2.URL;
        Map<String, ? extends Object> r9 = OXO1.X111IO(r14);
        r9.putAll(r5);
        Unit r10 = Unit.OXO1;
        r4.printParam(r8, r9);
        NetWork r11 = NetWork.OXO1;
        String r16 = r7 + AICreateJobV2.URL;
        final O1XIiIO<Response<JobDetailV2>> r17 = new AIGCFragment$createJobV2$$inlined$postJsonV2$default$1(r3, r15, r6);
        AndroidNetworking.post(r16).addHeaders(r5).addApplicationJsonBody(r14).setTag(r16).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{JobDetailV2.class}), new AIGCFragment$createJobV2$$inlined$postJsonV2$default$2(r17));
    }

    public final void errorEvent(@aa1 String r5) {
        Intrinsics.X0O(r5, "error");
        if (StringsKt__StringsKt.iIi011O(r5, "4006", false, 2, null) == false) goto L7;
        showPayTipPopup$default(this, R.string.points_insufficient_tip, false, 2, null);
        return;
    L7:
        if (StringsKt__StringsKt.iIi011O(r5, "5001", false, 2, null) == false) goto L11;
        showPayTipPopup$default(this, R.string.ai_benefit_buy_tip, false, 2, null);
        return;
    L11:
        if (StringsKt__StringsKt.iIi011O(r5, "5002", false, 2, null) == false) goto L15;
        showPayTipPopup$default(this, R.string.ai_benefit_expired_tip, false, 2, null);
        return;
    L15:
        if (StringsKt__StringsKt.iIi011O(r5, "2004", false, 2, null) == false) goto L18;
        showPayTipPopup(R.string.login_user_tip_error, true);
        return;
    L18:
        ToastUtils.showLong(r5, new Object[0]);
    }

    public final void findJob(@aa1 String r8) {
        Intrinsics.X0O(r8, "jobId");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " findJob -> " + r8);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r9 = RequestBodyKt.aigcFindJobBody(r8);
        final C34561 r1 = new C34561(this);
        final Activity r2 = null;
        final uq r3 = r0.loadPopup(null, null);
        String r4 = r0.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AigcFindJob.URL);
        r0.printParam(r4 + AigcFindJob.URL, r9);
        NetWork r5 = NetWork.OXO1;
        String r6 = r4 + AigcFindJob.URL;
        final O1XIiIO<Response<JobDetail>> r7 = new AIGCFragment$findJob$$inlined$post$default$1(r2, r1, r3);
        AndroidNetworking.post(r6).addBodyParameter(r9).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{JobDetail.class}), new AIGCFragment$findJob$$inlined$post$default$2(r7));
    }

    public final void generateAIGC(@aa1 String r4) {
        Intrinsics.X0O(r4, "query");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " SparkChain generateAIGC -> " + r4);
        AISparkChainManager r0 = AISparkChainManager.OXO1;
        if (r0.I0iXXO() == true) goto L6;
        ToastUtils.showLong(R.string.spark_exist_fail);
        dismissLoadPopup();
        return;
    L6:
        r0.XO0O10(r4, new C34571(this));
    }

    @aa1
    public final String getBgFile() {
        return this.bgFile;
    }

    public final View getBtnAgain() {
        return (View) getValue();
    }

    public final View getBtnNextStep() {
        return (View) getValue();
    }

    public final View getBtnSearch() {
        return (View) getValue();
    }

    public final EditText getEtContent() {
        return (EditText) getValue();
    }

    public final int getFindJobNumber() {
        return this.findJobNumber;
    }

    public final View getGenPanel() {
        return (View) getValue();
    }

    @aa1
    public final Map<String, String> getHeadersMap() {
        Gson r0 = new Gson();
        BleCache r1 = BleCache.INSTANCE;
        String r7 = r1.getMBleName();
        String r8 = r1.getMFirmwareFlag();
        String r2 = BaseBleCache.getString$default(r1, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        String r9 = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(r9, "getAppVersionName(...)");
        a01 r11 = a01.OXO1;
        SPUtils r3 = r11.IiI10X();
        Object r12 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r3.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r12 = r4;
    L6:
        String r5 = r0.toJson(new BleInfo(((AppUser) r12).getIdentity(), r7, r8, RequestBodyKt.PROJECT_ID, r2, r9, oe5.IXO0OOi(r1.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), 0));
        HashMap r6 = new HashMap();
        r6.put("accept-language", Languages.DEFAULT_LANGUAGE_ZH);
        SPUtils r10 = r11.IiI10X();
        Object r14 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r13 = new Gson().fromJson(r10.getString(AppUser.class.getName()), AppUser.class);
        if (r13 == null) goto L10;
        r14 = r13;
    L10:
        r6.put("APP-UID", ((AppUser) r14).getIdentity());
        r6.put("BleInfo", r5);
        return r6;
    }

    public final AbhSettingsItem getItemStyle() {
        return (AbhSettingsItem) getValue();
    }

    public final int getMCurStyle() {
        return this.mCurStyle;
    }

    public final String getMJobId() {
        return this.mJobId;
    }

    @tb1
    public final uq getMLoadingPopup() {
        return this.mLoadingPopup;
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) getValue();
    }

    @tb1
    public final pv1 getMStyleSetPopup() {
        return this.mStyleSetPopup;
    }

    @tb1
    public final String[] getPicUrls() {
        return this.picUrls;
    }

    @tb1
    public final List<Bitmap> getPicUrlsBitmap() {
        return this.picUrlsBitmap;
    }

    public final View getPreviewPanel() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        AbhSettingsItem r0 = getItemStyle();
        String r1 = getResources().getStringArray(R.array.aigc_styles)[this.mCurStyle];
        Intrinsics.O10IXXX0X(r1, "get(...)");
        r0.setMRightText(r1);
        getItemStyle().setOnClickListener(new iIX0i(this));
        AbhSettingsItem r2 = getItemStyle();
        if (q62.OXO1.O0() == false) goto L5;
        int r3 = 0;
    L6:
        r2.setVisibility(r3);
        getBtnSearch().setOnClickListener(new X1OI(this));
        getBtnGen().setOnClickListener(new Xii(this));
        getBtnGen().setOnKeyListener(new iiII(this));
        getBtnAgain().setOnClickListener(new I0(this));
        getBtnNextStep().setOnClickListener(new O101(this));
        return;
    L5:
        r3 = 8;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_aigc;
    }

    public final void onAgain(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getGenPanel().setVisibility(0);
        getPreviewPanel().setVisibility(8);
        getBtnGen().setFocusableInTouchMode(true);
        getBtnGen().requestFocus();
    }

    public final void onGen(@aa1 View r10) {
        Intrinsics.X0O(r10, "view");
        Editable r11 = getEtContent().getText();
        if (r11 == null) goto L6;
        String r12 = r11.toString();
    L5:
        String r2 = r12;
        q62 r13 = q62.OXO1;
        if (r13.XOX() == false) goto L16;
        showLoadPopup();
        Intrinsics.XXI(r2);
        if (containsChineseCharacter(r2) == false) goto L13;
        createJobV2(r2, I0i1OXiI.OXO1().get(this.mCurStyle));
        return;
    L13:
        AIGC_AIChat(new AIQuestion(AIFunctionType.AI, r2, null, null, false, false, 60, null), I0i1OXiI.OXO1().get(this.mCurStyle));
        return;
    L16:
        if (TextUtils.isEmpty(r2) == false) goto L18;
        return;
    L18:
        if (r13.O0() == false) goto L21;
        showLoadPopup();
        Intrinsics.XXI(r2);
        createJob(r2, I0i1OXiI.OXO1().get(this.mCurStyle));
    L25:
        getBtnGen().setFocusableInTouchMode(true);
        getBtnGen().requestFocus();
        return;
    L21:
        if (TextUtils.isEmpty(r13.iIiiO()) == false) goto L24;
        KeyboardUtils.hideSoftInput(getMActivity());
        UtilsKt.XXiO0i(getMActivity());
        return;
    L24:
        showLoadPopup();
        Intrinsics.XXI(r2);
        openAiImagesGen(r2);
        goto L25
    L6:
        r12 = null;
        goto L5
    }

    public final void onNextStep() {
        if (this.picUrls == null) goto L9;
        SPUtils r0 = a01.OXO1.XO0O10();
        String[] r4 = this.picUrls;
        Intrinsics.XXI(r4);
        ArrayList r5 = new ArrayList(r4.length);
        int r6 = r4.length;
        int r7 = 0;
    L5:
        if (r7 >= r6) goto L7;
        String r8 = r4[r7];
        r5.add(new File(uz0.XOO0ii0(sz0.OXO1), UtilsKt.iX1O1(r8)).getPath());
        r7 = r7 + 1;
        goto L5
    L7:
        String r9 = uz0.XOO0ii0(sz0.OXO1).getPath();
        Intrinsics.O10IXXX0X(r9, "getPath(...)");
        r0.put(r9, new Gson().toJson(r5));
        q62 r1 = q62.OXO1;
        FragmentActivity r10 = requireActivity();
        Intrinsics.O10IXXX0X(r10, "requireActivity(...)");
        Bundle r11 = new Bundle();
        r11.putString("bgFile", this.bgFile);
        Unit r12 = Unit.OXO1;
        r1.OO010(r10, r11);
    L9:
        if (this.picUrlsBitmap == null) goto L18;
        SPUtils r2 = a01.OXO1.XO0O10();
        List<Bitmap> r13 = this.picUrlsBitmap;
        Intrinsics.XXI(r13);
        List<Bitmap> r14 = r13;
        ArrayList r15 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r14, 10));
        Iterator<T> r16 = r14.iterator();
    L12:
        if (r16.hasNext() == false) goto L14;
        Bitmap r17 = (Bitmap) r16.next();
        r15.add(new File(uz0.XOO0ii0(sz0.OXO1), "aigc_kdxf.png").getPath());
        goto L12
    L14:
        String r18 = uz0.XOO0ii0(sz0.OXO1).getPath();
        Intrinsics.O10IXXX0X(r18, "getPath(...)");
        r2.put(r18, new Gson().toJson(r15));
        q62 r3 = q62.OXO1;
        FragmentActivity r19 = requireActivity();
        Intrinsics.O10IXXX0X(r19, "requireActivity(...)");
        Bundle r20 = new Bundle();
        r20.putString("bgFile", this.bgFile);
        Unit r21 = Unit.OXO1;
        r3.OO010(r19, r20);
        return;
    }

    public final void onSearch(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showLoadPopup();
        this.findJobNumber = 0;
        String r3 = this.mJobId;
        Intrinsics.O10IXXX0X(r3, "mJobId");
        findJob(r3);
    }

    public final void onSetStyle(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        if (this.mStyleSetPopup != null) goto L5;
        FragmentActivity r0 = requireActivity();
        Intrinsics.O10IXXX0X(r0, "requireActivity(...)");
        pv1 r4 = new pv1(r0, R.array.aigc_styles);
        r4.iX(R.string.style);
        r4.i010I(new IXiOXO(this));
        this.mStyleSetPopup = r4;
    L5:
        pv1 r5 = this.mStyleSetPopup;
        if (r5 == null) goto L9;
        r5.iOO1ii1(this.mCurStyle);
        r5.IIX1OXO();
        return;
    }

    public final void openAiImagesGen(@aa1 String r5) {
        Intrinsics.X0O(r5, "query");
        LogUtils.d(new Object[]{this.TAG + " openAiImagesGen -> " + r5});
        ANRequest.PostRequestBuilder r0 = AndroidNetworking.post("https://api.openai.com/v1/images/generations").setContentType(G5.L).addHeaders("Authorization", "Bearer " + q62.OXO1.iIiiO());
        byte[] r6 = ("{    \"prompt\": \"" + r5 + "\",    \"n\": 4,    \"size\": \"512x512\"\n  }").getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r6, "getBytes(...)");
        r0.addByteBody(r6).setPriority(Priority.LOW).build().getAsJSONObject(new C34581(this));
    }

    public final void setBgFile(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.bgFile = r2;
    }

    public final void setFindJobNumber(int r1) {
        this.findJobNumber = r1;
    }

    public final void setMCurStyle(int r1) {
        this.mCurStyle = r1;
    }

    public final void setMJobId(String r1) {
        this.mJobId = r1;
    }

    public final void setMLoadingPopup(@tb1 uq r1) {
        this.mLoadingPopup = r1;
    }

    public final void setMStyleSetPopup(@tb1 pv1 r1) {
        this.mStyleSetPopup = r1;
    }

    public final void setPicUrls(@tb1 String[] r1) {
        this.picUrls = r1;
    }

    public final void setPicUrlsBitmap(@tb1 List<Bitmap> r1) {
        this.picUrlsBitmap = r1;
    }

    public final void showPayTipPopup(int r7, final boolean r8) {
        if (this.mPayTipPopup != null) goto L5;
        FragmentActivity r2 = requireActivity();
        Intrinsics.O10IXXX0X(r2, "requireActivity(...)");
        final go0 r0 = new go0(r2, 0, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(r7));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.confirm, new iOX(r8, r0, this));
        this.mPayTipPopup = r0;
    L5:
        go0 r9 = this.mPayTipPopup;
        if (r9 != null) goto L8;
    L10:
        go0 r10 = this.mPayTipPopup;
        if (r10 == null) goto L14;
        r10.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r9.isShowing() != true) goto L10;
    }

    public final void showPics(@aa1 final String[] r9, @aa1 final String r10) {
        Intrinsics.X0O(r9, VideoTrimmerActivity.URLS_KEY);
        Intrinsics.X0O(r10, "imageSign");
        int r1 = 1;
        if (r9.length <= 1) goto L6;
        r1 = 2;
    L6:
        if (r9.length != 0) goto L9;
        dismissLoadPopup();
        ToastUtils.showLong(R.string.request_error);
        return;
    L9:
        final Activity r6 = getMActivity();
        final List r7 = ArraysKt___ArraysKt.OXI0X0(r9);
        CommonAdapter<String> r2 = new AIGCFragment$showPics$adapter$1(r10, r9, this, r6, r7);
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), r1));
        getMRecyclerView().setAdapter(r2);
        getGenPanel().setVisibility(8);
        getPreviewPanel().setVisibility(0);
        dismissLoadPopup();
    }

    public final void showPicsSparkChain(@aa1 final List<Bitmap> r5) {
        Intrinsics.X0O(r5, VideoTrimmerActivity.URLS_KEY);
        if (r5.isEmpty() == false) goto L6;
        dismissLoadPopup();
        ToastUtils.showLong(R.string.request_error);
        return;
    L6:
        final Activity r0 = getMActivity();
        CommonAdapter<Bitmap> r1 = new AIGCFragment$showPicsSparkChain$adapter$1(r5, this, r0);
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), 1));
        getMRecyclerView().setAdapter(r1);
        getGenPanel().setVisibility(8);
        getPreviewPanel().setVisibility(0);
        dismissLoadPopup();
    }
}
