package com.sma.smartv3.ui.ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0iiIOX;
import com.android.mltcode.paycertificationapi.IIO10O1I;
import com.android.mltcode.paycertificationapi.IXOXOOi;
import com.android.mltcode.paycertificationapi.O00XXO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XiXOiIOXX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.dj4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iIi0i0IX;
import com.android.mltcode.paycertificationapi.iOiIXOI1;
import com.android.mltcode.paycertificationapi.iiOIII0I;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.AIRecordsDao;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIAnswer;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.model.AIQuestion;
import com.sma.smartv3.model.DeductionConfig;
import com.sma.smartv3.model.EvaluationKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n87#2,7:243\n94#2,3:251\n70#2,7:254\n97#2:261\n1#3:250\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n*L\n219#1:243,7\n219#1:251,3\n219#1:254,7\n219#1:261\n219#1:250\n*E\n"})
public abstract class BaseAIActivity extends BaseActivity {
    private boolean isPlayResult;

    @tb1
    private OXO1<AIAnswer> mAIAnswerCallback;

    @tb1
    private AIFunction mAIFunction;

    @tb1
    private I0iiIOX mEvaluationPopup;

    @tb1
    private uq mLoadingPopup;

    @tb1
    private dj4 mModleSetPopup;

    @tb1
    private go0 mPayTipPopup;

    @tb1
    private AIRecords mReceivedRecords;

    @aa1
    private final AIRecordsDao mRecordsDao;
    private int openAIDeductionPoints;

    public interface OXO1<T> {
        void OXO1(@aa1 String r1);

        void XIi00iiXO(T r1);
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai.BaseAIActivity$send$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n69#2,3:243\n72#2,5:247\n1#3:246\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n*L\n181#1:243,3\n181#1:247,5\n181#1:246\n*E\n"})
    public static final class AnonymousClass1 implements O1XIiIO<AIAnswer> {
        public final /* synthetic */ boolean OXO1;
        public final /* synthetic */ BaseAIActivity XIi00iiXO;

        public AnonymousClass1(boolean r1, BaseAIActivity r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        public static final void O00(BaseAIActivity r0, AIAnswer r1) {
            OXO1 r2 = BaseAIActivity.access$getMAIAnswerCallback$p(r0);
            if (r2 == null) goto L6;
            r2.XIi00iiXO(r1);
            return;
        }

        public static /* synthetic */ void OXO1(BaseAIActivity r0, AIAnswer r1) {
            O00(r0, r1);
        }

        public static /* synthetic */ void XIi00iiXO(String r0, BaseAIActivity r1) {
            iO(r0, r1);
        }

        public static final void iO(String r2, BaseAIActivity r3) {
            int r0 = r2.hashCode();
            if (r0 == 1537218) goto L25;
            if (r0 == 1596802) goto L21;
            switch(r0) {
                case 1626588: goto L17;
                case 1626589: goto L13;
                case 1626590: goto L9;
                default: goto L28;
            };
        L28:
            OXO1 r4 = BaseAIActivity.access$getMAIAnswerCallback$p(r3);
            if (r4 == null) goto L32;
            r4.OXO1(r2);
            return;
        L32:
            return;
        L9:
            if (r2.equals("5003") == false) goto L28;
            r3.startActivity(new Intent(r3, AIBenefitExpiredTipActivity.class));
            goto L28
        L13:
            if (r2.equals("5002") == false) goto L28;
            r3.showPayTipPopup(R.string.ai_benefit_expired_tip);
            goto L28
        L17:
            if (r2.equals("5001") == false) goto L28;
            r3.showPayTipPopup(R.string.ai_benefit_buy_tip);
            goto L28
        L21:
            if (r2.equals("4006") == false) goto L28;
            r3.showPayTipPopup(R.string.points_insufficient_tip);
            goto L28
        L25:
            if (r2.equals("2004") == false) goto L28;
            ToastUtils.showLong(R.string.login_user_info_error);
            goto L28
        }

        public void XO0O10(final AIAnswer r5) {
            if (r5 == null) goto L10;
            boolean r0 = this.OXO1;
            final BaseAIActivity r1 = this.XIi00iiXO;
            LogUtils.d(new Object[]{"handleResponse AIAnswer = " + r5});
            if (r0 == false) goto L8;
            AIRecords r2 = r1.getMReceivedRecords();
            if (r2 == null) goto L8;
            r2.setMStatus(0);
            r2.setMContent(r5.getText());
            r1.getMRecordsDao().update(r2);
        L8:
            r1.runOnUiThread(new iOiIXOI1(r1, r5));
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public void handleError(final String r5) {
            Intrinsics.X0O(r5, "error");
            LogUtils.d(new Object[]{"handleResponse error = " + r5});
            AIRecords r0 = this.XIi00iiXO.getMReceivedRecords();
            if (r0 == null) goto L5;
            BaseAIActivity r1 = this.XIi00iiXO;
            r0.setMStatus(2);
            String r2 = r1.getString(R.string.generate_failed);
            Intrinsics.O10IXXX0X(r2, "getString(...)");
            r0.setMContent(r2);
            r1.getMRecordsDao().update(r0);
        L5:
            final BaseAIActivity r3 = this.XIi00iiXO;
            r3.runOnUiThread(new IXOXOOi(r5, r3));
        }

        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
        public /* bridge */ /* synthetic */ void handleResponse(AIAnswer r1) {
            XO0O10(r1);
        }
    }

    public BaseAIActivity() {
        this.isPlayResult = true;
        this.mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();
    }

    public static /* synthetic */ boolean I0iXXO(BaseAIActivity r0) {
        return showPayTipPopup$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean O10IXXX0X(BaseAIActivity r0, int r1) {
        return onSetModel$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(BaseAIActivity r0) {
        dismissLoading$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(BaseAIActivity r0, DeductionConfig r1) {
        return getDeductionConfig$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XXI(BaseAIActivity r0, boolean r1) {
        showLoading$lambda$0(r0, r1);
    }

    public static final /* synthetic */ OXO1 access$getMAIAnswerCallback$p(BaseAIActivity r0) {
        return r0.mAIAnswerCallback;
    }

    private static final void dismissLoading$lambda$0(BaseAIActivity r0) {
        uq r1 = r0.mLoadingPopup;
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private final void getDeductionConfig() {
        OrderManager.OXO1.OIX0iXi(new O00XXO(this));
    }

    private static final Unit getDeductionConfig$lambda$0(BaseAIActivity r0, DeductionConfig r1) {
        if (r1 == null) goto L5;
        r0.openAIDeductionPoints = r1.getOpenAI_ImgPoints();
        r0.showAIDeductionPoints();
    L5:
        return Unit.OXO1;
    }

    private static final boolean onSetModel$lambda$0$0(BaseAIActivity r2, int r3) {
        a01.OXO1.IiI10X().put(b01.iXi, r3);
        I01XX0.XIi00iiXO(I01XX0.X00Xi1X, null, 2, null);
        r2.changeAiModel();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void send$default(BaseAIActivity r6, AIQuestion r7, OXO1 r8, boolean r9, boolean r10, boolean r11, int r12, Object r13) {
        if (r13 != null) goto L21;
        if ((r12 & 2) == 0) goto L6;
        r8 = null;
    L6:
        OXO1 r2 = r8;
        if ((r12 & 4) == 0) goto L9;
        r9 = r6.isPlayResult;
    L9:
        boolean r3 = r9;
        if ((r12 & 8) == 0) goto L12;
        boolean r4 = true;
    L14:
        if ((r12 & 16) == 0) goto L17;
        boolean r5 = true;
    L18:
        r6.send(r7, r2, r3, r4, r5);
        return;
    L17:
        r5 = r11;
        goto L18
    L12:
        r4 = r10;
        goto L14
    L21:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
    }

    public static /* synthetic */ void showLoading$default(BaseAIActivity r0, boolean r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = false;
    L6:
        r0.showLoading(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoading");
    }

    private static final void showLoading$lambda$0(BaseAIActivity r2, boolean r3) {
        if (r2.mLoadingPopup != null) goto L8;
        uq r0 = new uq(r2.getMContext());
        if (r3 == false) goto L7;
        r0.I1(Integer.valueOf(R.string.generating));
    L7:
        r2.mLoadingPopup = r0;
    L8:
        uq r4 = r2.mLoadingPopup;
        if (r4 == null) goto L12;
        r4.IIX1OXO();
        return;
    }

    public static /* synthetic */ void showPayTipPopup$default(BaseAIActivity r0, int r1, int r2, Object r3) {
        if (r3 != null) goto L9;
        if ((r2 & 1) == 0) goto L6;
        r1 = R.string.points_insufficient_tip;
    L6:
        r0.showPayTipPopup(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPayTipPopup");
    }

    private static final boolean showPayTipPopup$lambda$0$0(BaseAIActivity r4) {
        String r0 = OrderManager.X11iII1O1(OrderManager.OXO1, null, null, 3, null);
        Bundle r1 = new Bundle();
        r1.putString("mArg0", r0);
        r1.putInt("mArg1", 2);
        r1.putParcelable("mArg2", null);
        r1.putSerializable("mArg3", null);
        Intent r2 = new Intent(r4, GoogleWebViewActivity.class);
        r2.putExtras(r1);
        r4.startActivity(r2);
        return true;
    }

    @aa1
    public final AIRecords addReceivedRecord() {
        AIFunction r2 = this.mAIFunction;
        Intrinsics.XXI(r2);
        return addReceivedRecord(new AIRecords(0, 0, null, r2.getType().getType(), 2, null, null, 1, 0, 0, null, null, null, null, null, 0, null, 130919, null));
    }

    public final void addSendRecord(@aa1 String r24) {
        Intrinsics.X0O(r24, "text");
        AIFunction r1 = this.mAIFunction;
        Intrinsics.XXI(r1);
        addSendRecord(new AIRecords(0, 0, null, r1.getType().getType(), 1, r24, null, 0, 0, 0, null, null, null, null, null, 0, null, 131015, null));
    }

    public void changeAiModel() {
    }

    public final void dismissLoading() {
        runOnUiThread(new iiOIII0I(this));
    }

    @tb1
    public final AIFunction getMAIFunction() {
        return this.mAIFunction;
    }

    @tb1
    public final uq getMLoadingPopup() {
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

    public void init(@tb1 Bundle r3) {
        LogUtils.d(new Object[]{"intent -> " + getMArg3()});
        Serializable r4 = getMArg3();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        this.mAIFunction = (AIFunction) r4;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    public void initView() {
        getDeductionConfig();
        AIFunction r0 = this.mAIFunction;
        if (r0 == null) goto L8;
        TextView r1 = (TextView) findViewById(R.id.abh_title_center);
        if (r1 == null) goto L9;
        r1.setText(r0.getTitle());
        return;
    L9:
        return;
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
        if (this.mModleSetPopup != null) goto L5;
        int r3 = R.array.ai_models;
        int r4 = 0;
        BaseAIActivity r2 = this;
        dj4 r1 = new dj4(r2, r3, r4, 4, null);
        r1.iX(R.string.pay_dail_aigc_modle);
        r1.i010I(new IIO10O1I(this));
        r2.mModleSetPopup = r1;
    L6:
        dj4 r0 = r2.mModleSetPopup;
        if (r0 == null) goto L10;
        r0.II1Xi0(AIManager.XXI(AIManager.OXO1, false, 1, null));
        r0.IIX1OXO();
        return;
    L10:
        return;
    L5:
        r2 = this;
        goto L6
    }

    @sf5(tag = I01XX0.XXOXi)
    public final void onShowEvaluationStatus(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        if (EvaluationKt.isShowEvaluationDialog() == true) goto L5;
        return;
    L5:
        if (i72.OXO1.iOIi00Ii() == true) goto L7;
        return;
    L7:
        if (this.mEvaluationPopup != null) goto L9;
        int r2 = 0;
        this.mEvaluationPopup = new I0iiIOX(this, r2, 2, null);
    L9:
        I0iiIOX r5 = this.mEvaluationPopup;
        if (r5 != null) goto L12;
    L14:
        I0iiIOX r6 = this.mEvaluationPopup;
        if (r6 == null) goto L20;
        r6.IIX1OXO();
        return;
    L20:
        return;
    L12:
        if (r5.isShowing() != true) goto L14;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void send(@aa1 AIQuestion r10, @tb1 OXO1<AIAnswer> r11, boolean r12, boolean r13, boolean r14) {
        Intrinsics.X0O(r10, "question");
        this.mAIAnswerCallback = r11;
        LogUtils.d(new Object[]{"send question = " + r10});
        AIManager.iXiX011(AIManager.OXO1, r10, new AnonymousClass1(r13, this), r12, r14, 0, 0, 48, null);
    }

    public final void setMAIFunction(@tb1 AIFunction r1) {
        this.mAIFunction = r1;
    }

    public final void setMLoadingPopup(@tb1 uq r1) {
        this.mLoadingPopup = r1;
    }

    public final void setMReceivedRecords(@tb1 AIRecords r1) {
        this.mReceivedRecords = r1;
    }

    public final void setOpenAIDeductionPoints(int r1) {
        this.openAIDeductionPoints = r1;
    }

    public final void setPlayResult(boolean r1) {
        this.isPlayResult = r1;
    }

    public void showAIDeductionPoints() {
    }

    public final void showLoading(final boolean r2) {
        runOnUiThread(new iIi0i0IX(this, r2));
    }

    public final void showPayTipPopup(int r6) {
        if (this.mPayTipPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.tip);
        r0.iX(Integer.valueOf(r6));
        r0.IXXOO(1);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.game_member_open_btn, new XiXOiIOXX(this));
        this.mPayTipPopup = r0;
    L5:
        go0 r7 = this.mPayTipPopup;
        if (r7 != null) goto L8;
    L10:
        go0 r8 = this.mPayTipPopup;
        if (r8 == null) goto L14;
        r8.IIX1OXO();
        return;
    L14:
        return;
    L8:
        if (r7.isShowing() != true) goto L10;
    }

    @sf5(tag = I01XX0.XOX0O0)
    public final void stopPlayer(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        AIManager.OXO1.Ii0X0X();
    }

    @aa1
    public final AIRecords addReceivedRecord(@aa1 AIRecords r3) {
        Intrinsics.X0O(r3, "mAIRecords");
        long r0 = this.mRecordsDao.insert(r3);
        AIRecords r4 = this.mRecordsDao.getAIRecord(r0);
        this.mReceivedRecords = r4;
        Intrinsics.XXI(r4);
        return r4;
    }

    public final void addSendRecord(@aa1 AIRecords r2) {
        Intrinsics.X0O(r2, "mAIRecords");
        this.mRecordsDao.insert(r2);
    }
}
