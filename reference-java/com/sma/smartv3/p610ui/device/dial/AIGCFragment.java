package com.sma.smartv3.p610ui.device.dial;

import android.annotation.SuppressLint;
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
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I0i1OXiI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.pv1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseFragment;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.biz.StatManager;
import com.sma.smartv3.model.AIAnswer;
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
import com.sma.smartv3.p610ui.device.dial.AIGCFragment;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.AbhSettingsItem;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.Languages;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,718:1\n176#2,11:719\n196#2:738\n325#2,11:739\n336#2:751\n347#2:770\n176#2,11:771\n196#2:790\n252#3,7:730\n270#3:737\n383#3,18:752\n252#3,7:782\n270#3:789\n1#4:750\n1#4:818\n11561#5:791\n11896#5,3:792\n35#6,2:795\n35#6,2:801\n19#6:803\n15#6:804\n19#6:805\n15#6:806\n19#6:807\n15#6:808\n11#6,2:809\n1563#7:797\n1634#7,3:798\n99#8,7:811\n106#8,3:819\n79#8,7:822\n109#8:829\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment\n*L\n218#1:719,11\n218#1:738\n281#1:739,11\n281#1:751\n281#1:770\n349#1:771,11\n349#1:790\n218#1:730,7\n218#1:737\n281#1:752,18\n349#1:782,7\n349#1:789\n281#1:750\n334#1:818\n533#1:791\n533#1:792,3\n532#1:795,2\n545#1:801,2\n647#1:803\n647#1:804\n660#1:805\n660#1:806\n330#1:807\n330#1:808\n331#1:809,2\n546#1:797\n546#1:798,3\n334#1:811,7\n334#1:819,3\n334#1:822,7\n334#1:829\n*E\n"})
public class AIGCFragment extends BaseFragment {

    @aa1
    private String bgFile;
    private int findJobNumber;
    private int mCurStyle;
    private String mJobId;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private go0 mPayTipPopup;

    @tb1
    private pv1 mStyleSetPopup;

    @tb1
    private String[] picUrls;

    @tb1
    private List<Bitmap> picUrlsBitmap;

    @aa1
    private final String TAG = "AIGC";

    @aa1
    private final Lazy genPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i100IXOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.genPanel_delegate$lambda$0(this.f7502IO);
        }
    });

    @aa1
    private final Lazy etContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXI0XOIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.etContent_delegate$lambda$0(this.f5017IO);
        }
    });

    @aa1
    private final Lazy previewPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIIO11I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.previewPanel_delegate$lambda$0(this.f4517IO);
        }
    });

    @aa1
    private final Lazy itemStyle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXOXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.itemStyle_delegate$lambda$0(this.f5076IO);
        }
    });

    @aa1
    private final Lazy btnSearch$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XXi0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.btnSearch_delegate$lambda$0(this.f1239IO);
        }
    });

    @aa1
    private final Lazy btnGen$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOi1O0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.btnGen_delegate$lambda$0(this.f1899IO);
        }
    });

    @aa1
    private final Lazy btnNextStep$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.btnNextStep_delegate$lambda$0(this.f2611IO);
        }
    });

    @aa1
    private final Lazy btnAgain$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1iXiI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.btnAgain_delegate$lambda$0(this.f2856IO);
        }
    });

    @aa1
    private final Lazy mRecyclerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IX0iIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AIGCFragment.mRecyclerView_delegate$lambda$0(this.f1950IO);
        }
    });

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.AIGCFragment$findJob$1, reason: case insensitive filesystem */
    public static final class C289891 implements O1XIiIO<JobDetail> {
        public C289891() {
        }

        /* JADX INFO: renamed from: iO */
        public static final void m38430iO(AIGCFragment aIGCFragment) {
            aIGCFragment.setFindJobNumber(aIGCFragment.getFindJobNumber() + 1);
            if (aIGCFragment.getFindJobNumber() >= 20) {
                aIGCFragment.dismissLoadPopup();
                ToastUtils.showLong(R.string.request_error);
            } else {
                String mJobId = aIGCFragment.getMJobId();
                Intrinsics.O10IXXX0X(mJobId, "<get-mJobId>(...)");
                aIGCFragment.findJob(mJobId);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void handleResponse(JobDetail jobDetail) {
            LogUtils.m11128d("findJobNumber = " + AIGCFragment.this.getFindJobNumber() + " findJob -> " + jobDetail);
            if (jobDetail != null) {
                int jobStatus = jobDetail.getJobStatus();
                if (jobStatus != 2) {
                    if (jobStatus == 3) {
                        AIGCFragment.this.showPics(jobDetail.getImages(), jobDetail.getImageSign());
                        return;
                    }
                    Handler handler = new Handler();
                    final AIGCFragment aIGCFragment = AIGCFragment.this;
                    handler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IOIi00
                        @Override // java.lang.Runnable
                        public final void run() {
                            AIGCFragment.C289891.m38430iO(aIGCFragment);
                        }
                    }, 3000L);
                    return;
                }
                AIGCFragment.this.dismissLoadPopup();
                ToastUtils.showLong(jobDetail.getJobErrCode() + " = " + jobDetail.getJobErrMsg(), new Object[0]);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
            LogUtils.m11128d("findJob -> error = " + error);
            AIGCFragment.this.dismissLoadPopup();
            ToastUtils.showLong(error, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.AIGCFragment$generateAIGC$1, reason: case insensitive filesystem */
    public static final class C289901 implements O1XIiIO<Bitmap> {
        public C289901() {
        }

        /* JADX INFO: renamed from: iO */
        public static final void m38431iO(Bitmap bitmap, AIGCFragment aIGCFragment) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bitmap);
            aIGCFragment.showPicsSparkChain(arrayList);
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public void handleResponse(final Bitmap bitmap) {
            if (bitmap != null) {
                final AIGCFragment aIGCFragment = AIGCFragment.this;
                ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.XIO11I
                    @Override // java.lang.Runnable
                    public final void run() {
                        AIGCFragment.C289901.m38431iO(bitmap, aIGCFragment);
                    }
                });
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(String error) {
            Intrinsics.X0O(error, "error");
        }
    }

    public AIGCFragment() {
        a01 a01Var = a01.OXO1;
        this.mJobId = a01Var.IiI10X().getString(b01.XXiO0i);
        this.mCurStyle = a01Var.IiI10X().getInt(b01.IX0IXOi, 0);
        this.bgFile = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnAgain_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return aIGCFragment.getMView().findViewById(R.id.btn_again);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnGen_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return aIGCFragment.getMView().findViewById(R.id.btn_gen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnNextStep_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return aIGCFragment.getMView().findViewById(R.id.btn_gen_next_step);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnSearch_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return aIGCFragment.getMView().findViewById(R.id.btn_search);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissLoadPopup() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OXi001
            @Override // java.lang.Runnable
            public final void run() {
                AIGCFragment.dismissLoadPopup$lambda$0(this.f3564IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissLoadPopup$lambda$0(AIGCFragment aIGCFragment) {
        C3006uq c3006uq = aIGCFragment.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText etContent_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return (EditText) aIGCFragment.getMView().findViewById(R.id.edt_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View genPanel_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return aIGCFragment.getMView().findViewById(R.id.gen_panel);
    }

    private final View getBtnGen() {
        return (View) this.btnGen$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(AIGCFragment aIGCFragment, View view) {
        Intrinsics.XXI(view);
        aIGCFragment.onSetStyle(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(AIGCFragment aIGCFragment, View view) {
        if (q62.OXO1.XOX()) {
            ToastUtils.showLong(R.string.parameter_check_failed);
        } else {
            Intrinsics.XXI(view);
            aIGCFragment.onSearch(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(AIGCFragment aIGCFragment, View view) {
        Intrinsics.XXI(view);
        aIGCFragment.onGen(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$3(AIGCFragment aIGCFragment, View view, int i, KeyEvent keyEvent) {
        C3006uq c3006uq;
        return keyEvent.getAction() == 1 && i == 4 && (c3006uq = aIGCFragment.mLoadingPopup) != null && c3006uq.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(AIGCFragment aIGCFragment, View view) {
        Intrinsics.XXI(view);
        aIGCFragment.onAgain(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbhSettingsItem itemStyle_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return (AbhSettingsItem) aIGCFragment.getMView().findViewById(R.id.item_style);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView mRecyclerView_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return (RecyclerView) aIGCFragment.getMView().findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetStyle$lambda$0$0(AIGCFragment aIGCFragment, int i) {
        aIGCFragment.mCurStyle = i;
        AbhSettingsItem itemStyle = aIGCFragment.getItemStyle();
        String str = aIGCFragment.getResources().getStringArray(R.array.aigc_styles)[aIGCFragment.mCurStyle];
        Intrinsics.O10IXXX0X(str, "get(...)");
        itemStyle.setMRightText(str);
        a01.OXO1.IiI10X().put(b01.IX0IXOi, aIGCFragment.mCurStyle);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View previewPanel_delegate$lambda$0(AIGCFragment aIGCFragment) {
        return aIGCFragment.getMView().findViewById(R.id.preview_panel);
    }

    private final void showLoadPopup() {
        if (this.mLoadingPopup == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            C3006uq c3006uq = new C3006uq(fragmentActivityRequireActivity);
            String string = getString(R.string.working_generate_tip);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            c3006uq.II1Xi0(string);
            this.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = this.mLoadingPopup;
        if (c3006uq2 == null || !c3006uq2.isShowing()) {
            if (q62.OXO1.XOX()) {
                i72 i72Var = i72.OXO1;
                if (!i72Var.m2044Ii() && i72Var.IIII0iI()) {
                    return;
                }
            }
            C3006uq c3006uq3 = this.mLoadingPopup;
            if (c3006uq3 != null) {
                c3006uq3.IIX1OXO();
            }
        }
    }

    public static /* synthetic */ void showPayTipPopup$default(AIGCFragment aIGCFragment, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPayTipPopup");
        }
        if ((i2 & 1) != 0) {
            i = R.string.points_insufficient_tip;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        aIGCFragment.showPayTipPopup(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayTipPopup$lambda$0$0(boolean z, go0 go0Var, AIGCFragment aIGCFragment) {
        if (!z) {
            String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strX11iII1O1);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(aIGCFragment.getActivity(), (Class<?>) GoogleWebViewActivity.class);
            intent.putExtras(bundle);
            aIGCFragment.startActivity(intent);
            return true;
        }
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        a01Var.XO0O10().put(AppUser.class.getName(), new Gson().toJson((AppUser) appUser));
        i72.OXO1.OiXXXi10(go0Var.XO0O10());
        return true;
    }

    public final void AIGC_AIChat(@aa1 final AIQuestion question, @aa1 final String style) {
        Intrinsics.X0O(question, "question");
        Intrinsics.X0O(style, "style");
        question.setStream(true);
        question.setModel("baiduAIService");
        question.setText(AIManager.OXO1.iOO1ii1(question.getText()));
        final StringBuilder sb = new StringBuilder();
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String json = new Gson().toJson(question);
        Intrinsics.O10IXXX0X(json, "toJson(...)");
        netWorkUtils.postStreamRequest(GetAIChat.URL, getHeadersMap(), json, new O1XIiIO<String>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment.AIGC_AIChat.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(String str) {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1(AIGCFragment.this.TAG + " AIChat line -> " + str);
                try {
                    Object objFromJson = new Gson().fromJson(str, TypeToken.getParameterized(Response.class, AIAnswer.class));
                    Intrinsics.X1ii(objFromJson, "null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<com.sma.smartv3.model.AIAnswer>");
                    Response response = (Response) objFromJson;
                    if (response.getData() == null) {
                        AIGCFragment.this.createJobV2(question.getText(), style);
                        return;
                    }
                    AIAnswer aIAnswer = (AIAnswer) response.getData();
                    if (aIAnswer != null) {
                        StringBuilder sb2 = sb;
                        AIGCFragment aIGCFragment = AIGCFragment.this;
                        String str2 = style;
                        sb2.append(aIAnswer.getText());
                        if (aIAnswer.getEnded() == 1) {
                            i1o0oxo1o.OXO1(aIGCFragment.TAG + " AIGC_AIChat -> answer.toString() = " + ((Object) sb2));
                            String string = sb2.toString();
                            Intrinsics.O10IXXX0X(string, "toString(...)");
                            aIGCFragment.createJobV2(string, str2);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    i1O0OXO1O.OXO1.OXO1(AIGCFragment.this.TAG + " AIChat -> error: empty  e = " + e);
                    AIGCFragment.this.createJobV2(question.getText(), style);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(AIGCFragment.this.TAG + " AIChat -> error:" + error);
                AIGCFragment.this.createJobV2(question.getText(), style);
            }
        });
    }

    public final boolean containsChineseCharacter(@aa1 String str) {
        Intrinsics.X0O(str, "str");
        Pattern patternCompile = Pattern.compile("[\\u4E00-\\u9FA5]+");
        Intrinsics.O10IXXX0X(patternCompile, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        Intrinsics.O10IXXX0X(matcher, "matcher(...)");
        return matcher.find();
    }

    public final void createJob(@aa1 String query, @aa1 String style) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(style, "style");
        q62 q62Var = q62.OXO1;
        if (q62Var.OIXOOi()) {
            generateAIGC(query);
            return;
        }
        int iOiIIX101O = q62Var.OiIIX101O();
        i1O0OXO1O.OXO1.OXO1(this.TAG + " createJob -> " + query + ", " + style + ", " + iOiIIX101O);
        final Activity activity = null;
        StatManager.m38112iO(StatManager.OXO1, 1, null, 2, null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> mapAigcCreateJobBody = RequestBodyKt.aigcCreateJobBody(query, style, iOiIIX101O);
        final O1XIiIO<JobInfo> o1XIiIO = new O1XIiIO<JobInfo>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment.createJob.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(JobInfo jobInfo) {
                LogUtils.m11128d("createJob -> " + jobInfo);
                if (jobInfo != null) {
                    AIGCFragment.this.setMJobId(jobInfo.getJobId());
                    if (TextUtils.isEmpty(AIGCFragment.this.getMJobId())) {
                        LogUtils.m11128d("createJob -> error: jobId = null ");
                        AIGCFragment.this.dismissLoadPopup();
                        ToastUtils.showLong("error: jobId = null", new Object[0]);
                    } else {
                        a01.OXO1.IiI10X().put(b01.XXiO0i, AIGCFragment.this.getMJobId());
                        AIGCFragment.this.setFindJobNumber(0);
                        AIGCFragment aIGCFragment = AIGCFragment.this;
                        String mJobId = aIGCFragment.getMJobId();
                        Intrinsics.O10IXXX0X(mJobId, "<get-mJobId>(...)");
                        aIGCFragment.findJob(mJobId);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d("createJob -> error = " + error);
                AIGCFragment.this.dismissLoadPopup();
                ToastUtils.showLong(error, new Object[0]);
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AigcCreateJob.URL);
        netWorkUtils.printParam(strConvertBaseUrl + AigcCreateJob.URL, mapAigcCreateJobBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + AigcCreateJob.URL;
        final O1XIiIO<Response<JobInfo>> o1XIiIO2 = new O1XIiIO<Response<JobInfo>>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$createJob$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<JobInfo> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) mapAigcCreateJobBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, JobInfo.class), new ParsedRequestListener<Response<JobInfo>>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$createJob$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<JobInfo> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void createJobV2(@aa1 String query, @aa1 String style) {
        Intrinsics.X0O(query, "query");
        Intrinsics.X0O(style, "style");
        if (q62.OXO1.OIXOOi()) {
            generateAIGC(query);
            return;
        }
        i1O0OXO1O.OXO1.OXO1(this.TAG + " createJobV2 -> " + query + ", " + style);
        final Activity activity = null;
        String strOIX0iXi = AIManager.OIX0iXi(AIManager.OXO1, 0, 1, null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, Object> mapAigcCreateJobBodyV2 = RequestBodyKt.aigcCreateJobBodyV2(query, strOIX0iXi, new JobV2Extra(style, "1"));
        final O1XIiIO<JobDetailV2> o1XIiIO = new O1XIiIO<JobDetailV2>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment.createJobV2.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(JobDetailV2 jobDetailV2) {
                i1O0OXO1O.OXO1.OXO1("createJobV2 -> " + jobDetailV2);
                if (jobDetailV2 != null) {
                    if (!(jobDetailV2.getImages().length == 0)) {
                        AIGCFragment.this.showPics(jobDetailV2.getImages(), jobDetailV2.getImageSign());
                        return;
                    }
                    LogUtils.m11128d("createJobV2 -> error: jobId = null ");
                    AIGCFragment.this.dismissLoadPopup();
                    ToastUtils.showLong("createJobV2 error: jobId = null", new Object[0]);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("createJobV2 -> error = " + error);
                AIGCFragment.this.dismissLoadPopup();
                AIGCFragment.this.errorEvent(error);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AICreateJobV2.URL);
        String str = strConvertBaseUrl + AICreateJobV2.URL;
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(mapAigcCreateJobBodyV2);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + AICreateJobV2.URL;
        final O1XIiIO<Response<JobDetailV2>> o1XIiIO2 = new O1XIiIO<Response<JobDetailV2>>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$createJobV2$$inlined$postJsonV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<JobDetailV2> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str2).addHeaders(headersMap).addApplicationJsonBody(mapAigcCreateJobBodyV2).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, JobDetailV2.class), new ParsedRequestListener<Response<JobDetailV2>>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$createJobV2$$inlined$postJsonV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<JobDetailV2> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    public final void errorEvent(@aa1 String error) {
        Intrinsics.X0O(error, "error");
        if (StringsKt__StringsKt.iIi011O(error, "4006", false, 2, null)) {
            showPayTipPopup$default(this, R.string.points_insufficient_tip, false, 2, null);
            return;
        }
        if (StringsKt__StringsKt.iIi011O(error, "5001", false, 2, null)) {
            showPayTipPopup$default(this, R.string.ai_benefit_buy_tip, false, 2, null);
            return;
        }
        if (StringsKt__StringsKt.iIi011O(error, "5002", false, 2, null)) {
            showPayTipPopup$default(this, R.string.ai_benefit_expired_tip, false, 2, null);
        } else if (StringsKt__StringsKt.iIi011O(error, "2004", false, 2, null)) {
            showPayTipPopup(R.string.login_user_tip_error, true);
        } else {
            ToastUtils.showLong(error, new Object[0]);
        }
    }

    public final void findJob(@aa1 String jobId) {
        Intrinsics.X0O(jobId, "jobId");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " findJob -> " + jobId);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> mapAigcFindJobBody = RequestBodyKt.aigcFindJobBody(jobId);
        final C289891 c289891 = new C289891();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), AigcFindJob.URL);
        netWorkUtils.printParam(strConvertBaseUrl + AigcFindJob.URL, mapAigcFindJobBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + AigcFindJob.URL;
        final O1XIiIO<Response<JobDetail>> o1XIiIO = new O1XIiIO<Response<JobDetail>>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$findJob$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<JobDetail> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO2 = c289891;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO2);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, c289891, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) mapAigcFindJobBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, JobDetail.class), new ParsedRequestListener<Response<JobDetail>>() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$findJob$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<JobDetail> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                sb.append(", ");
                sb.append(aNError != null ? aNError.getErrorDetail() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void generateAIGC(@aa1 String query) {
        Intrinsics.X0O(query, "query");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " SparkChain generateAIGC -> " + query);
        AISparkChainManager aISparkChainManager = AISparkChainManager.OXO1;
        if (aISparkChainManager.I0iXXO()) {
            aISparkChainManager.XO0O10(query, new C289901());
        } else {
            ToastUtils.showLong(R.string.spark_exist_fail);
            dismissLoadPopup();
        }
    }

    @aa1
    public final String getBgFile() {
        return this.bgFile;
    }

    public final View getBtnAgain() {
        return (View) this.btnAgain$delegate.getValue();
    }

    public final View getBtnNextStep() {
        return (View) this.btnNextStep$delegate.getValue();
    }

    public final View getBtnSearch() {
        return (View) this.btnSearch$delegate.getValue();
    }

    public final EditText getEtContent() {
        return (EditText) this.etContent$delegate.getValue();
    }

    public final int getFindJobNumber() {
        return this.findJobNumber;
    }

    public final View getGenPanel() {
        return (View) this.genPanel$delegate.getValue();
    }

    @aa1
    public final Map<String, String> getHeadersMap() {
        Gson gson = new Gson();
        BleCache bleCache = BleCache.INSTANCE;
        String mBleName = bleCache.getMBleName();
        String mFirmwareFlag = bleCache.getMFirmwareFlag();
        String string$default = BaseBleCache.getString$default(bleCache, BleKey.FIRMWARE_VERSION, null, null, 6, null);
        String appVersionName = AppUtils.getAppVersionName();
        Intrinsics.O10IXXX0X(appVersionName, "getAppVersionName(...)");
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        String json = gson.toJson(new BleInfo(((AppUser) appUser).getIdentity(), mBleName, mFirmwareFlag, RequestBodyKt.PROJECT_ID, string$default, appVersionName, oe5.IXO0OOi(bleCache.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), 0));
        HashMap map = new HashMap();
        map.put("accept-language", Languages.DEFAULT_LANGUAGE_ZH);
        SPUtils sPUtilsIiI10X2 = a01Var.IiI10X();
        Object appUser2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X2.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson2 != null) {
            appUser2 = objFromJson2;
        }
        map.put("APP-UID", ((AppUser) appUser2).getIdentity());
        map.put("BleInfo", json);
        return map;
    }

    public final AbhSettingsItem getItemStyle() {
        return (AbhSettingsItem) this.itemStyle$delegate.getValue();
    }

    public final int getMCurStyle() {
        return this.mCurStyle;
    }

    public final String getMJobId() {
        return this.mJobId;
    }

    @tb1
    public final C3006uq getMLoadingPopup() {
        return this.mLoadingPopup;
    }

    public final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.mRecyclerView$delegate.getValue();
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
        return (View) this.previewPanel$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        AbhSettingsItem itemStyle = getItemStyle();
        String str = getResources().getStringArray(R.array.aigc_styles)[this.mCurStyle];
        Intrinsics.O10IXXX0X(str, "get(...)");
        itemStyle.setMRightText(str);
        getItemStyle().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iIX0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIGCFragment.initView$lambda$0(this.f7896IO, view);
            }
        });
        getItemStyle().setVisibility(q62.OXO1.m2880O0() ? 0 : 8);
        getBtnSearch().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X1OI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIGCFragment.initView$lambda$1(this.f4298IO, view);
            }
        });
        getBtnGen().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Xii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIGCFragment.initView$lambda$2(this.f5357IO, view);
            }
        });
        getBtnGen().setOnKeyListener(new View.OnKeyListener() { // from class: com.android.mltcode.paycertificationapi.iiII
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return AIGCFragment.initView$lambda$3(this.f8576IO, view, i, keyEvent);
            }
        });
        getBtnAgain().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIGCFragment.initView$lambda$4(this.f1003IO, view);
            }
        });
        getBtnNextStep().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O101
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2616IO.onNextStep();
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_aigc;
    }

    public final void onAgain(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getGenPanel().setVisibility(0);
        getPreviewPanel().setVisibility(8);
        getBtnGen().setFocusableInTouchMode(true);
        getBtnGen().requestFocus();
    }

    public final void onGen(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Editable text = getEtContent().getText();
        String string = text != null ? text.toString() : null;
        q62 q62Var = q62.OXO1;
        if (q62Var.XOX()) {
            showLoadPopup();
            Intrinsics.XXI(string);
            if (containsChineseCharacter(string)) {
                createJobV2(string, I0i1OXiI.OXO1().get(this.mCurStyle));
                return;
            } else {
                AIGC_AIChat(new AIQuestion(AIFunctionType.AI, string, null, null, false, false, 60, null), I0i1OXiI.OXO1().get(this.mCurStyle));
                return;
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (q62Var.m2880O0()) {
            showLoadPopup();
            Intrinsics.XXI(string);
            createJob(string, I0i1OXiI.OXO1().get(this.mCurStyle));
        } else if (TextUtils.isEmpty(q62Var.iIiiO())) {
            KeyboardUtils.hideSoftInput(getMActivity());
            UtilsKt.XXiO0i(getMActivity());
            return;
        } else {
            showLoadPopup();
            Intrinsics.XXI(string);
            openAiImagesGen(string);
        }
        getBtnGen().setFocusableInTouchMode(true);
        getBtnGen().requestFocus();
    }

    public final void onNextStep() {
        if (this.picUrls != null) {
            SPUtils sPUtilsXO0O10 = a01.OXO1.XO0O10();
            String[] strArr = this.picUrls;
            Intrinsics.XXI(strArr);
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(new File(uz0.XOO0ii0(sz0.OXO1), UtilsKt.iX1O1(str)).getPath());
            }
            String path = uz0.XOO0ii0(sz0.OXO1).getPath();
            Intrinsics.O10IXXX0X(path, "getPath(...)");
            sPUtilsXO0O10.put(path, new Gson().toJson(arrayList));
            q62 q62Var = q62.OXO1;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            Bundle bundle = new Bundle();
            bundle.putString("bgFile", this.bgFile);
            Unit unit = Unit.OXO1;
            q62Var.OO010(fragmentActivityRequireActivity, bundle);
        }
        if (this.picUrlsBitmap != null) {
            SPUtils sPUtilsXO0O11 = a01.OXO1.XO0O10();
            List<Bitmap> list = this.picUrlsBitmap;
            Intrinsics.XXI(list);
            List<Bitmap> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
            for (Bitmap bitmap : list2) {
                arrayList2.add(new File(uz0.XOO0ii0(sz0.OXO1), "aigc_kdxf.png").getPath());
            }
            String path2 = uz0.XOO0ii0(sz0.OXO1).getPath();
            Intrinsics.O10IXXX0X(path2, "getPath(...)");
            sPUtilsXO0O11.put(path2, new Gson().toJson(arrayList2));
            q62 q62Var2 = q62.OXO1;
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity2, "requireActivity(...)");
            Bundle bundle2 = new Bundle();
            bundle2.putString("bgFile", this.bgFile);
            Unit unit2 = Unit.OXO1;
            q62Var2.OO010(fragmentActivityRequireActivity2, bundle2);
        }
    }

    public final void onSearch(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showLoadPopup();
        this.findJobNumber = 0;
        String mJobId = this.mJobId;
        Intrinsics.O10IXXX0X(mJobId, "mJobId");
        findJob(mJobId);
    }

    public final void onSetStyle(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        if (this.mStyleSetPopup == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            pv1 pv1Var = new pv1(fragmentActivityRequireActivity, R.array.aigc_styles);
            pv1Var.m2858iX(R.string.style);
            pv1Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.IXiOXO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(AIGCFragment.onSetStyle$lambda$0$0(this.f2147IO, ((Integer) obj).intValue()));
                }
            });
            this.mStyleSetPopup = pv1Var;
        }
        pv1 pv1Var2 = this.mStyleSetPopup;
        if (pv1Var2 != null) {
            pv1Var2.iOO1ii1(this.mCurStyle);
            pv1Var2.IIX1OXO();
        }
    }

    public final void openAiImagesGen(@aa1 String query) {
        Intrinsics.X0O(query, "query");
        LogUtils.m11128d(this.TAG + " openAiImagesGen -> " + query);
        ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post("https://api.openai.com/v1/images/generations").setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + q62.OXO1.iIiiO());
        byte[] bytes = ("{    \"prompt\": \"" + query + "\",    \"n\": 4,    \"size\": \"512x512\"\n  }").getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        postRequestBuilderAddHeaders.addByteBody(bytes).setPriority(Priority.LOW).build().getAsJSONObject(new JSONObjectRequestListener() { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment.openAiImagesGen.1
            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onError(ANError aNError) {
                LogUtils.m11128d("onError -> error = " + (aNError != null ? aNError.getErrorBody() : null));
                AIGCFragment.this.dismissLoadPopup();
                ToastUtils.showLong(aNError != null ? aNError.getErrorBody() : null, new Object[0]);
            }

            @Override // com.androidnetworking.interfaces.JSONObjectRequestListener
            public void onResponse(JSONObject jSONObject) {
                LogUtils.m11128d("onResponse -> " + jSONObject);
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("data");
                        if (jSONArray != null) {
                            AIGCFragment aIGCFragment = AIGCFragment.this;
                            ArrayList arrayList = new ArrayList();
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                String string = jSONArray.getJSONObject(i).getString("url");
                                Intrinsics.O10IXXX0X(string, "getString(...)");
                                arrayList.add(string);
                            }
                            aIGCFragment.showPics((String[]) arrayList.toArray(new String[0]), "");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public final void setBgFile(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.bgFile = str;
    }

    public final void setFindJobNumber(int i) {
        this.findJobNumber = i;
    }

    public final void setMCurStyle(int i) {
        this.mCurStyle = i;
    }

    public final void setMJobId(String str) {
        this.mJobId = str;
    }

    public final void setMLoadingPopup(@tb1 C3006uq c3006uq) {
        this.mLoadingPopup = c3006uq;
    }

    public final void setMStyleSetPopup(@tb1 pv1 pv1Var) {
        this.mStyleSetPopup = pv1Var;
    }

    public final void setPicUrls(@tb1 String[] strArr) {
        this.picUrls = strArr;
    }

    public final void setPicUrlsBitmap(@tb1 List<Bitmap> list) {
        this.picUrlsBitmap = list;
    }

    public final void showPayTipPopup(int i, final boolean z) {
        go0 go0Var;
        if (this.mPayTipPopup == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
            final go0 go0Var2 = new go0(fragmentActivityRequireActivity, 0, 2, null);
            go0Var2.O1O(R.string.tip);
            go0Var2.m1865iX(Integer.valueOf(i));
            go0Var2.IXXOO(1);
            go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var2.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.iOX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(AIGCFragment.showPayTipPopup$lambda$0$0(z, go0Var2, this));
                }
            });
            this.mPayTipPopup = go0Var2;
        }
        go0 go0Var3 = this.mPayTipPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mPayTipPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    public final void showPics(@aa1 final String[] urls, @aa1 final String imageSign) {
        Intrinsics.X0O(urls, "urls");
        Intrinsics.X0O(imageSign, "imageSign");
        int i = urls.length > 1 ? 2 : 1;
        if (urls.length == 0) {
            dismissLoadPopup();
            ToastUtils.showLong(R.string.request_error);
            return;
        }
        final Activity mActivity = getMActivity();
        final List listOXI0X0 = ArraysKt___ArraysKt.OXI0X0(urls);
        CommonAdapter<String> commonAdapter = new CommonAdapter<String>(mActivity, listOXI0X0) { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$showPics$adapter$1

            @SourceDebugExtension({"SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$convert$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,718:1\n11561#2:719\n11896#2,3:720\n35#3,2:723\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$convert$1$2\n*L\n442#1:719\n442#1:720,3\n441#1:723,2\n*E\n"})
            public static final class OXO1 extends SimpleTarget<Bitmap> {

                /* JADX INFO: renamed from: I1 */
                public final /* synthetic */ String f54534I1;

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ ImageView f54535IO;
                public final /* synthetic */ String[] X11iII1O1;
                public final /* synthetic */ AIGCFragment XXX11i;
                public final /* synthetic */ int iX1O1;

                public OXO1(ImageView imageView, String str, int i, String[] strArr, AIGCFragment aIGCFragment) {
                    this.f54535IO = imageView;
                    this.f54534I1 = str;
                    this.iX1O1 = i;
                    this.X11iII1O1 = strArr;
                    this.XXX11i = aIGCFragment;
                }

                /* JADX INFO: renamed from: iO */
                public static final void m38432iO(String[] strArr, File file, AIGCFragment aIGCFragment, View view) {
                    SPUtils sPUtilsXO0O10 = a01.OXO1.XO0O10();
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        arrayList.add(new File(uz0.XOO0ii0(sz0.OXO1), UtilsKt.iX1O1(str)).getPath());
                    }
                    String path = uz0.XOO0ii0(sz0.OXO1).getPath();
                    Intrinsics.O10IXXX0X(path, "getPath(...)");
                    sPUtilsXO0O10.put(path, new Gson().toJson(arrayList));
                    LogUtils.m11128d("confirm -> " + file);
                    q62 q62Var = q62.OXO1;
                    FragmentActivity fragmentActivityRequireActivity = aIGCFragment.requireActivity();
                    Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
                    Bundle bundle = new Bundle();
                    bundle.putString("bgFile", file.getPath());
                    Unit unit = Unit.OXO1;
                    q62Var.OO010(fragmentActivityRequireActivity, bundle);
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                    String[] strArr;
                    Intrinsics.X0O(resource, "resource");
                    this.f54535IO.setImageBitmap(resource);
                    final File file = new File(uz0.XOO0ii0(sz0.OXO1), UtilsKt.iX1O1(this.f54534I1));
                    ImageUtils.save(resource, file, Bitmap.CompressFormat.JPEG);
                    if (this.iX1O1 == 0 && (strArr = this.X11iII1O1) != null && strArr.length > 0) {
                        this.XXX11i.setPicUrls(strArr);
                        AIGCFragment aIGCFragment = this.XXX11i;
                        String path = file.getPath();
                        Intrinsics.O10IXXX0X(path, "getPath(...)");
                        aIGCFragment.setBgFile(path);
                    }
                    ImageView imageView = this.f54535IO;
                    final String[] strArr2 = this.X11iII1O1;
                    final AIGCFragment aIGCFragment2 = this.XXX11i;
                    imageView.setOnClickListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0049: INVOKE 
                          (r4v2 'imageView' android.widget.ImageView)
                          (wrap android.view.View$OnClickListener:0x0046: CONSTRUCTOR 
                          (r5v6 'strArr2' java.lang.String[] A[DONT_INLINE])
                          (r0v0 'file' java.io.File A[DONT_INLINE])
                          (r1v2 'aIGCFragment2' com.sma.smartv3.ui.device.dial.AIGCFragment A[DONT_INLINE])
                         A[MD:(java.lang.String[], java.io.File, com.sma.smartv3.ui.device.dial.AIGCFragment):void (m), WRAPPED] call: com.android.mltcode.paycertificationapi.XOIO11O.<init>(java.lang.String[], java.io.File, com.sma.smartv3.ui.device.dial.AIGCFragment):void type: CONSTRUCTOR)
                         VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void A[MD:(android.view.View$OnClickListener):void (c)] in method: com.sma.smartv3.ui.device.dial.AIGCFragment$showPics$adapter$1.OXO1.XIi00iiXO(android.graphics.Bitmap, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>):void, file: classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.android.mltcode.paycertificationapi.XOIO11O, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r5 = "resource"
                        kotlin.jvm.internal.Intrinsics.X0O(r4, r5)
                        android.widget.ImageView r5 = r3.f54535IO
                        r5.setImageBitmap(r4)
                        java.lang.String r5 = r3.f54534I1
                        java.lang.String r5 = com.sma.smartv3.util.UtilsKt.iX1O1(r5)
                        java.io.File r0 = new java.io.File
                        com.android.mltcode.paycertificationapi.sz0 r1 = com.android.mltcode.paycertificationapi.sz0.OXO1
                        java.io.File r1 = com.android.mltcode.paycertificationapi.uz0.XOO0ii0(r1)
                        r0.<init>(r1, r5)
                        android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
                        com.blankj.utilcode.util.ImageUtils.save(r4, r0, r5)
                        int r4 = r3.iX1O1
                        if (r4 != 0) goto L3e
                        java.lang.String[] r4 = r3.X11iII1O1
                        if (r4 == 0) goto L3e
                        int r5 = r4.length
                        if (r5 <= 0) goto L3e
                        com.sma.smartv3.ui.device.dial.AIGCFragment r5 = r3.XXX11i
                        r5.setPicUrls(r4)
                        com.sma.smartv3.ui.device.dial.AIGCFragment r4 = r3.XXX11i
                        java.lang.String r5 = r0.getPath()
                        java.lang.String r1 = "getPath(...)"
                        kotlin.jvm.internal.Intrinsics.O10IXXX0X(r5, r1)
                        r4.setBgFile(r5)
                    L3e:
                        android.widget.ImageView r4 = r3.f54535IO
                        java.lang.String[] r5 = r3.X11iII1O1
                        com.sma.smartv3.ui.device.dial.AIGCFragment r1 = r3.XXX11i
                        com.android.mltcode.paycertificationapi.XOIO11O r2 = new com.android.mltcode.paycertificationapi.XOIO11O
                        r2.<init>(r5, r0, r1)
                        r4.setOnClickListener(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.ui.device.dial.AIGCFragment$showPics$adapter$1.OXO1.onResourceReady(android.graphics.Bitmap, com.bumptech.glide.request.transition.Transition):void");
                }
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            @SuppressLint({"CheckResult"})
            public void convert(ViewHolder holder, String url, int i2) {
                Intrinsics.X0O(holder, "holder");
                Intrinsics.X0O(url, "url");
                View view = holder.getView(R.id.f51417iv);
                String str = imageSign;
                String[] strArr = urls;
                AIGCFragment aIGCFragment = this;
                ImageView imageView = (ImageView) view;
                RequestBuilder<Bitmap> requestBuilderAsBitmap = Glide.with(imageView).asBitmap();
                if (TextUtils.isEmpty(str)) {
                    requestBuilderAsBitmap.load(url);
                } else {
                    if (!q62.OXO1.XOX()) {
                        str = "Bearer " + str;
                    }
                    requestBuilderAsBitmap.load((Object) new GlideUrl(url, new LazyHeaders.Builder().addHeader("Authorization", str).build()));
                }
                requestBuilderAsBitmap.into(new OXO1(imageView, url, i2, strArr, aIGCFragment));
            }
        };
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), i));
        getMRecyclerView().setAdapter(commonAdapter);
        getGenPanel().setVisibility(8);
        getPreviewPanel().setVisibility(0);
        dismissLoadPopup();
    }

    public final void showPicsSparkChain(@aa1 final List<Bitmap> urls) {
        Intrinsics.X0O(urls, "urls");
        if (urls.isEmpty()) {
            dismissLoadPopup();
            ToastUtils.showLong(R.string.request_error);
            return;
        }
        final Activity mActivity = getMActivity();
        CommonAdapter<Bitmap> commonAdapter = new CommonAdapter<Bitmap>(urls, this, mActivity) { // from class: com.sma.smartv3.ui.device.dial.AIGCFragment$showPicsSparkChain$adapter$1
            final /* synthetic */ List<Bitmap> $urls;
            final /* synthetic */ AIGCFragment this$0;

            @SourceDebugExtension({"SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$convert$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,718:1\n1563#2:719\n1634#2,3:720\n35#3,2:723\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$convert$1$2\n*L\n505#1:719\n505#1:720,3\n504#1:723,2\n*E\n"})
            public static final class OXO1 extends SimpleTarget<Bitmap> {

                /* JADX INFO: renamed from: I1 */
                public final /* synthetic */ int f54536I1;

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ ImageView f54537IO;
                public final /* synthetic */ AIGCFragment X11iII1O1;
                public final /* synthetic */ List<Bitmap> iX1O1;

                public OXO1(ImageView imageView, int i, List<Bitmap> list, AIGCFragment aIGCFragment) {
                    this.f54537IO = imageView;
                    this.f54536I1 = i;
                    this.iX1O1 = list;
                    this.X11iII1O1 = aIGCFragment;
                }

                /* JADX INFO: renamed from: iO */
                public static final void m38433iO(List list, File file, AIGCFragment aIGCFragment, String str, View view) {
                    SPUtils sPUtilsXO0O10 = a01.OXO1.XO0O10();
                    List<Bitmap> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list2, 10));
                    for (Bitmap bitmap : list2) {
                        arrayList.add(new File(uz0.XOO0ii0(sz0.OXO1), str).getPath());
                    }
                    String path = uz0.XOO0ii0(sz0.OXO1).getPath();
                    Intrinsics.O10IXXX0X(path, "getPath(...)");
                    sPUtilsXO0O10.put(path, new Gson().toJson(arrayList));
                    LogUtils.m11128d("confirm -> " + file);
                    q62 q62Var = q62.OXO1;
                    FragmentActivity fragmentActivityRequireActivity = aIGCFragment.requireActivity();
                    Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
                    Bundle bundle = new Bundle();
                    bundle.putString("bgFile", file.getPath());
                    Unit unit = Unit.OXO1;
                    q62Var.OO010(fragmentActivityRequireActivity, bundle);
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                    List<Bitmap> list;
                    Intrinsics.X0O(resource, "resource");
                    this.f54537IO.setImageBitmap(resource);
                    final String str = "aigc_kdxf.png";
                    final File file = new File(uz0.XOO0ii0(sz0.OXO1), "aigc_kdxf.png");
                    ImageUtils.save(resource, file, Bitmap.CompressFormat.JPEG);
                    if (this.f54536I1 == 0 && (list = this.iX1O1) != null && list.size() > 0) {
                        this.X11iII1O1.setPicUrlsBitmap(this.iX1O1);
                        AIGCFragment aIGCFragment = this.X11iII1O1;
                        String path = file.getPath();
                        Intrinsics.O10IXXX0X(path, "getPath(...)");
                        aIGCFragment.setBgFile(path);
                    }
                    ImageView imageView = this.f54537IO;
                    final List<Bitmap> list2 = this.iX1O1;
                    final AIGCFragment aIGCFragment2 = this.X11iII1O1;
                    imageView.setOnClickListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: INVOKE 
                          (r5v2 'imageView' android.widget.ImageView)
                          (wrap android.view.View$OnClickListener:0x0047: CONSTRUCTOR 
                          (r0v3 'list2' java.util.List<android.graphics.Bitmap> A[DONT_INLINE])
                          (r6v3 'file' java.io.File A[DONT_INLINE])
                          (r2v0 'aIGCFragment2' com.sma.smartv3.ui.device.dial.AIGCFragment A[DONT_INLINE])
                          (r1v0 'str' java.lang.String A[DONT_INLINE])
                         A[MD:(java.util.List, java.io.File, com.sma.smartv3.ui.device.dial.AIGCFragment, java.lang.String):void (m), WRAPPED] call: com.android.mltcode.paycertificationapi.Xi.<init>(java.util.List, java.io.File, com.sma.smartv3.ui.device.dial.AIGCFragment, java.lang.String):void type: CONSTRUCTOR)
                         VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void A[MD:(android.view.View$OnClickListener):void (c)] in method: com.sma.smartv3.ui.device.dial.AIGCFragment$showPicsSparkChain$adapter$1.OXO1.XIi00iiXO(android.graphics.Bitmap, com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap>):void, file: classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.android.mltcode.paycertificationapi.Xi, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r6 = "resource"
                        kotlin.jvm.internal.Intrinsics.X0O(r5, r6)
                        android.widget.ImageView r6 = r4.f54537IO
                        r6.setImageBitmap(r5)
                        java.io.File r6 = new java.io.File
                        com.android.mltcode.paycertificationapi.sz0 r0 = com.android.mltcode.paycertificationapi.sz0.OXO1
                        java.io.File r0 = com.android.mltcode.paycertificationapi.uz0.XOO0ii0(r0)
                        java.lang.String r1 = "aigc_kdxf.png"
                        r6.<init>(r0, r1)
                        android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
                        com.blankj.utilcode.util.ImageUtils.save(r5, r6, r0)
                        int r5 = r4.f54536I1
                        if (r5 != 0) goto L3f
                        java.util.List<android.graphics.Bitmap> r5 = r4.iX1O1
                        if (r5 == 0) goto L3f
                        int r5 = r5.size()
                        if (r5 <= 0) goto L3f
                        com.sma.smartv3.ui.device.dial.AIGCFragment r5 = r4.X11iII1O1
                        java.util.List<android.graphics.Bitmap> r0 = r4.iX1O1
                        r5.setPicUrlsBitmap(r0)
                        com.sma.smartv3.ui.device.dial.AIGCFragment r5 = r4.X11iII1O1
                        java.lang.String r0 = r6.getPath()
                        java.lang.String r2 = "getPath(...)"
                        kotlin.jvm.internal.Intrinsics.O10IXXX0X(r0, r2)
                        r5.setBgFile(r0)
                    L3f:
                        android.widget.ImageView r5 = r4.f54537IO
                        java.util.List<android.graphics.Bitmap> r0 = r4.iX1O1
                        com.sma.smartv3.ui.device.dial.AIGCFragment r2 = r4.X11iII1O1
                        com.android.mltcode.paycertificationapi.Xi r3 = new com.android.mltcode.paycertificationapi.Xi
                        r3.<init>(r0, r6, r2, r1)
                        r5.setOnClickListener(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.ui.device.dial.AIGCFragment$showPicsSparkChain$adapter$1.OXO1.onResourceReady(android.graphics.Bitmap, com.bumptech.glide.request.transition.Transition):void");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(mActivity, R.layout.item_aigc_img, urls);
                this.$urls = urls;
                this.this$0 = this;
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            @SuppressLint({"CheckResult"})
            public void convert(ViewHolder holder, Bitmap url, int i) {
                Intrinsics.X0O(holder, "holder");
                Intrinsics.X0O(url, "url");
                View view = holder.getView(R.id.f51417iv);
                List<Bitmap> list = this.$urls;
                AIGCFragment aIGCFragment = this.this$0;
                ImageView imageView = (ImageView) view;
                RequestBuilder<Bitmap> requestBuilderAsBitmap = Glide.with(imageView).asBitmap();
                requestBuilderAsBitmap.load(url);
                requestBuilderAsBitmap.into(new OXO1(imageView, i, list, aIGCFragment));
            }
        };
        getMRecyclerView().setLayoutManager(new GridLayoutManager(getMActivity(), 1));
        getMRecyclerView().setAdapter(commonAdapter);
        getGenPanel().setVisibility(8);
        getPreviewPanel().setVisibility(0);
        dismissLoadPopup();
    }
}
