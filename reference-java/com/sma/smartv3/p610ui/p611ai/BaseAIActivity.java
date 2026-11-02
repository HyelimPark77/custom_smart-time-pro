package com.sma.smartv3.p610ui.p611ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.DeductionConfig;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.p611ai.BaseAIActivity;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n87#2,7:243\n94#2,3:251\n70#2,7:254\n97#2:261\n1#3:250\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n*L\n219#1:243,7\n219#1:251,3\n219#1:254,7\n219#1:261\n219#1:250\n*E\n"})
public abstract class BaseAIActivity extends BaseActivity {

    @tb1
    private OXO1<AIAnswer> mAIAnswerCallback;

    @tb1
    private AIFunction mAIFunction;

    @tb1
    private I0iiIOX mEvaluationPopup;

    @tb1
    private C3006uq mLoadingPopup;

    @tb1
    private dj4 mModleSetPopup;

    @tb1
    private go0 mPayTipPopup;

    @tb1
    private AIRecords mReceivedRecords;
    private int openAIDeductionPoints;
    private boolean isPlayResult = true;

    @aa1
    private final AIRecordsDao mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();

    public interface OXO1<T> {
        void OXO1(@aa1 String str);

        void XIi00iiXO(T t);
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.BaseAIActivity$send$1 */
    @SourceDebugExtension({"SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n69#2,3:243\n72#2,5:247\n1#3:246\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n*L\n181#1:243,3\n181#1:247,5\n181#1:246\n*E\n"})
    public static final class C186481 implements O1XIiIO<AIAnswer> {
        public final /* synthetic */ boolean OXO1;
        public final /* synthetic */ BaseAIActivity XIi00iiXO;

        public C186481(boolean z, BaseAIActivity baseAIActivity) {
            this.OXO1 = z;
            this.XIi00iiXO = baseAIActivity;
        }

        public static final void O00(BaseAIActivity baseAIActivity, AIAnswer aIAnswer) {
            OXO1 oxo1 = baseAIActivity.mAIAnswerCallback;
            if (oxo1 != null) {
                oxo1.XIi00iiXO(aIAnswer);
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: iO */
        public static final void m38311iO(String str, BaseAIActivity baseAIActivity) {
            int iHashCode = str.hashCode();
            if (iHashCode != 1537218) {
                if (iHashCode != 1596802) {
                    switch (iHashCode) {
                        case 1626588:
                            if (str.equals("5001")) {
                                baseAIActivity.showPayTipPopup(R.string.ai_benefit_buy_tip);
                            }
                            break;
                        case 1626589:
                            if (str.equals("5002")) {
                                baseAIActivity.showPayTipPopup(R.string.ai_benefit_expired_tip);
                            }
                            break;
                        case 1626590:
                            if (str.equals("5003")) {
                                baseAIActivity.startActivity(new Intent(baseAIActivity, (Class<?>) AIBenefitExpiredTipActivity.class));
                            }
                            break;
                    }
                } else if (str.equals("4006")) {
                    baseAIActivity.showPayTipPopup(R.string.points_insufficient_tip);
                }
            } else if (str.equals("2004")) {
                ToastUtils.showLong(R.string.login_user_info_error);
            }
            OXO1 oxo1 = baseAIActivity.mAIAnswerCallback;
            if (oxo1 != null) {
                oxo1.OXO1(str);
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
        public void handleResponse(final AIAnswer aIAnswer) {
            AIRecords mReceivedRecords;
            if (aIAnswer != null) {
                boolean z = this.OXO1;
                final BaseAIActivity baseAIActivity = this.XIi00iiXO;
                LogUtils.m11128d("handleResponse AIAnswer = " + aIAnswer);
                if (z && (mReceivedRecords = baseAIActivity.getMReceivedRecords()) != null) {
                    mReceivedRecords.setMStatus(0);
                    mReceivedRecords.setMContent(aIAnswer.getText());
                    baseAIActivity.getMRecordsDao().update(mReceivedRecords);
                }
                baseAIActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iOiIXOI1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAIActivity.C186481.O00(baseAIActivity, aIAnswer);
                    }
                });
            }
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(final String error) {
            Intrinsics.X0O(error, "error");
            LogUtils.m11128d("handleResponse error = " + error);
            AIRecords mReceivedRecords = this.XIi00iiXO.getMReceivedRecords();
            if (mReceivedRecords != null) {
                BaseAIActivity baseAIActivity = this.XIi00iiXO;
                mReceivedRecords.setMStatus(2);
                String string = baseAIActivity.getString(R.string.generate_failed);
                Intrinsics.O10IXXX0X(string, "getString(...)");
                mReceivedRecords.setMContent(string);
                baseAIActivity.getMRecordsDao().update(mReceivedRecords);
            }
            final BaseAIActivity baseAIActivity2 = this.XIi00iiXO;
            baseAIActivity2.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.IXOXOOi
                @Override // java.lang.Runnable
                public final void run() {
                    BaseAIActivity.C186481.m38311iO(error, baseAIActivity2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissLoading$lambda$0(BaseAIActivity baseAIActivity) {
        C3006uq c3006uq = baseAIActivity.mLoadingPopup;
        if (c3006uq != null) {
            c3006uq.dismiss();
        }
    }

    private final void getDeductionConfig() {
        OrderManager.OXO1.OIX0iXi(new Function1() { // from class: com.android.mltcode.paycertificationapi.O00XXO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseAIActivity.getDeductionConfig$lambda$0(this.f2384IO, (DeductionConfig) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDeductionConfig$lambda$0(BaseAIActivity baseAIActivity, DeductionConfig deductionConfig) {
        if (deductionConfig != null) {
            baseAIActivity.openAIDeductionPoints = deductionConfig.getOpenAI_ImgPoints();
            baseAIActivity.showAIDeductionPoints();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onSetModel$lambda$0$0(BaseAIActivity baseAIActivity, int i) {
        a01.OXO1.IiI10X().put(b01.iXi, i);
        I01XX0.XIi00iiXO(I01XX0.X00Xi1X, null, 2, null);
        baseAIActivity.changeAiModel();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void send$default(BaseAIActivity baseAIActivity, AIQuestion aIQuestion, OXO1 oxo1, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i & 2) != 0) {
            oxo1 = null;
        }
        OXO1 oxo2 = oxo1;
        if ((i & 4) != 0) {
            z = baseAIActivity.isPlayResult;
        }
        baseAIActivity.send(aIQuestion, oxo2, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
    }

    public static /* synthetic */ void showLoading$default(BaseAIActivity baseAIActivity, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseAIActivity.showLoading(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLoading$lambda$0(BaseAIActivity baseAIActivity, boolean z) {
        if (baseAIActivity.mLoadingPopup == null) {
            C3006uq c3006uq = new C3006uq(baseAIActivity.getMContext());
            if (z) {
                c3006uq.m3183I1(Integer.valueOf(R.string.generating));
            }
            baseAIActivity.mLoadingPopup = c3006uq;
        }
        C3006uq c3006uq2 = baseAIActivity.mLoadingPopup;
        if (c3006uq2 != null) {
            c3006uq2.IIX1OXO();
        }
    }

    public static /* synthetic */ void showPayTipPopup$default(BaseAIActivity baseAIActivity, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPayTipPopup");
        }
        if ((i2 & 1) != 0) {
            i = R.string.points_insufficient_tip;
        }
        baseAIActivity.showPayTipPopup(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPayTipPopup$lambda$0$0(BaseAIActivity baseAIActivity) {
        String strX11iII1O1 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", strX11iII1O1);
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(baseAIActivity, (Class<?>) GoogleWebViewActivity.class);
        intent.putExtras(bundle);
        baseAIActivity.startActivity(intent);
        return true;
    }

    @aa1
    public final AIRecords addReceivedRecord() {
        AIFunction aIFunction = this.mAIFunction;
        Intrinsics.XXI(aIFunction);
        return addReceivedRecord(new AIRecords(0, 0L, null, aIFunction.getType().getType(), 2, null, null, 1, 0, 0, null, null, null, null, null, 0, null, 130919, null));
    }

    public final void addSendRecord(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        AIFunction aIFunction = this.mAIFunction;
        Intrinsics.XXI(aIFunction);
        addSendRecord(new AIRecords(0, 0L, null, aIFunction.getType().getType(), 1, text, null, 0, 0, 0, null, null, null, null, null, 0, null, 131015, null));
    }

    public void changeAiModel() {
    }

    public final void dismissLoading() {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iiOIII0I
            @Override // java.lang.Runnable
            public final void run() {
                BaseAIActivity.dismissLoading$lambda$0(this.f8603IO);
            }
        });
    }

    @tb1
    public final AIFunction getMAIFunction() {
        return this.mAIFunction;
    }

    @tb1
    public final C3006uq getMLoadingPopup() {
        return this.mLoadingPopup;
    }

    @tb1
    public final AIRecords getMReceivedRecords() {
        return this.mReceivedRecords;
    }

    @aa1
    public final AIRecordsDao getMRecordsDao() {
        return this.mRecordsDao;
    }

    public final int getOpenAIDeductionPoints() {
        return this.openAIDeductionPoints;
    }

    public void init(@tb1 Bundle bundle) {
        LogUtils.m11128d("intent -> " + getMArg3());
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        this.mAIFunction = (AIFunction) mArg3;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    public void initView() {
        TextView textView;
        getDeductionConfig();
        AIFunction aIFunction = this.mAIFunction;
        if (aIFunction == null || (textView = (TextView) findViewById(R.id.abh_title_center)) == null) {
            return;
        }
        textView.setText(aIFunction.getTitle());
    }

    public final boolean isPlayResult() {
        return this.isPlayResult;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AIManager.OXO1.XO0X10iO();
    }

    public final void onSetModel() {
        BaseAIActivity baseAIActivity;
        if (this.mModleSetPopup == null) {
            baseAIActivity = this;
            dj4 dj4Var = new dj4(baseAIActivity, R.array.ai_models, 0, 4, (DefaultConstructorMarker) null);
            dj4Var.m1671iX(R.string.pay_dail_aigc_modle);
            dj4Var.i010I(new Function1() { // from class: com.android.mltcode.paycertificationapi.IIO10O1I
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(BaseAIActivity.onSetModel$lambda$0$0(this.f1613IO, ((Integer) obj).intValue()));
                }
            });
            baseAIActivity.mModleSetPopup = dj4Var;
        } else {
            baseAIActivity = this;
        }
        dj4 dj4Var2 = baseAIActivity.mModleSetPopup;
        if (dj4Var2 != null) {
            dj4Var2.II1Xi0(AIManager.XXI(AIManager.OXO1, false, 1, null));
            dj4Var2.IIX1OXO();
        }
    }

    @sf5(tag = I01XX0.XXOXi)
    public final void onShowEvaluationStatus(@aa1 Object data) {
        I0iiIOX i0iiIOX;
        Intrinsics.X0O(data, "data");
        if (EvaluationKt.isShowEvaluationDialog() && i72.OXO1.iOIi00Ii()) {
            if (this.mEvaluationPopup == null) {
                this.mEvaluationPopup = new I0iiIOX(this, 0, 2, null);
            }
            I0iiIOX i0iiIOX2 = this.mEvaluationPopup;
            if ((i0iiIOX2 == null || !i0iiIOX2.isShowing()) && (i0iiIOX = this.mEvaluationPopup) != null) {
                i0iiIOX.IIX1OXO();
            }
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void send(@aa1 AIQuestion question, @tb1 OXO1<AIAnswer> oxo1, boolean z, boolean z2, boolean z3) {
        Intrinsics.X0O(question, "question");
        this.mAIAnswerCallback = oxo1;
        LogUtils.m11128d("send question = " + question);
        AIManager.iXiX011(AIManager.OXO1, question, new C186481(z2, this), z, z3, 0, 0, 48, null);
    }

    public final void setMAIFunction(@tb1 AIFunction aIFunction) {
        this.mAIFunction = aIFunction;
    }

    public final void setMLoadingPopup(@tb1 C3006uq c3006uq) {
        this.mLoadingPopup = c3006uq;
    }

    public final void setMReceivedRecords(@tb1 AIRecords aIRecords) {
        this.mReceivedRecords = aIRecords;
    }

    public final void setOpenAIDeductionPoints(int i) {
        this.openAIDeductionPoints = i;
    }

    public final void setPlayResult(boolean z) {
        this.isPlayResult = z;
    }

    public void showAIDeductionPoints() {
    }

    public final void showLoading(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.iIi0i0IX
            @Override // java.lang.Runnable
            public final void run() {
                BaseAIActivity.showLoading$lambda$0(this.f7940IO, z);
            }
        });
    }

    public final void showPayTipPopup(int i) {
        go0 go0Var;
        if (this.mPayTipPopup == null) {
            go0 go0Var2 = new go0(this, 0, 2, null);
            go0Var2.O1O(R.string.tip);
            go0Var2.m1865iX(Integer.valueOf(i));
            go0Var2.IXXOO(1);
            go0.X11iII1O1(go0Var2, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var2.X1IX(R.string.game_member_open_btn, new Function0() { // from class: com.android.mltcode.paycertificationapi.XiXOiIOXX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseAIActivity.showPayTipPopup$lambda$0$0(this.f5341IO));
                }
            });
            this.mPayTipPopup = go0Var2;
        }
        go0 go0Var3 = this.mPayTipPopup;
        if ((go0Var3 == null || !go0Var3.isShowing()) && (go0Var = this.mPayTipPopup) != null) {
            go0Var.IIX1OXO();
        }
    }

    @sf5(tag = I01XX0.XOX0O0)
    public final void stopPlayer(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        AIManager.OXO1.Ii0X0X();
    }

    @aa1
    public final AIRecords addReceivedRecord(@aa1 AIRecords mAIRecords) {
        Intrinsics.X0O(mAIRecords, "mAIRecords");
        AIRecords aIRecord = this.mRecordsDao.getAIRecord(this.mRecordsDao.insert(mAIRecords));
        this.mReceivedRecords = aIRecord;
        Intrinsics.XXI(aIRecord);
        return aIRecord;
    }

    public final void addSendRecord(@aa1 AIRecords mAIRecords) {
        Intrinsics.X0O(mAIRecords, "mAIRecords");
        this.mRecordsDao.insert(mAIRecords);
    }
}
