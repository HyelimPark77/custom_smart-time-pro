package com.sma.smartv3.ui.ai_note;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.I0IOIXX0;
import com.android.mltcode.paycertificationapi.I11IO;
import com.android.mltcode.paycertificationapi.OIi11;
import com.android.mltcode.paycertificationapi.Oi1XOOI;
import com.android.mltcode.paycertificationapi.X0iXiiX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOX10O;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.r16;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tk1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.ActivityUtilKt;
import com.sma.smartv3.util.ShareUtil;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteDetailActivity extends BaseActivity {

    @tb1
    private File audioFile;

    @aa1
    private String audioTotalTime;

    @aa1
    private String contentStr;

    @tb1
    private TextView contentTv;

    @tb1
    private ImageView imgRecordPlay;
    private boolean isPlaying;

    @tb1
    private r16 mTranslationDetailPopup;

    @tb1
    private tk1 pcmAudioPlayer;

    @tb1
    private SeekBar seekbar;

    @tb1
    private TextView tvCurrentTime;

    @tb1
    private TextView tvTotalTime;

    @aa1
    private final Lazy viewModel$delegate;

    public static final class OXO1 implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ AiNoteDetailActivity OXO1;

        public OXO1(AiNoteDetailActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ Unit OXO1(AiNoteDetailActivity r0, int r1) {
            return XIi00iiXO(r0, r1);
        }

        public static final Unit XIi00iiXO(AiNoteDetailActivity r2, int r3) {
            TextView r0 = AiNoteDetailActivity.access$getTvCurrentTime$p(r2);
            if (r0 == null) goto L5;
            r0.setText(ShareUtil.OXO1.OIi0(r3));
        L5:
            SeekBar r1 = AiNoteDetailActivity.access$getSeekbar$p(r2);
            if (r1 == null) goto L8;
            r1.setProgress(r3);
        L8:
            tk1 r4 = AiNoteDetailActivity.access$getPcmAudioPlayer$p(r2);
            if (r4 == null) goto L22;
            if (r4.XO0O10() != r3) goto L22;
            AiNoteDetailActivity.access$setPlaying$p(r2, false);
            ImageView r5 = AiNoteDetailActivity.access$getImgRecordPlay$p(r2);
            if (r5 == null) goto L15;
            r5.setImageResource(R.drawable.ic_record_play);
        L15:
            TextView r6 = AiNoteDetailActivity.access$getTvCurrentTime$p(r2);
            if (r6 == null) goto L18;
            r6.setText(ShareUtil.OXO1.OIi0(0));
        L18:
            SeekBar r7 = AiNoteDetailActivity.access$getSeekbar$p(r2);
            if (r7 == null) goto L22;
            r7.setProgress(0);
        L22:
            return Unit.OXO1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar r1, int r2, boolean r3) {
            if (r3 == false) goto L7;
            TextView r4 = AiNoteDetailActivity.access$getTvCurrentTime$p(this.OXO1);
            if (r4 == null) goto L8;
            r4.setText(ShareUtil.OXO1.OIi0(r2));
            return;
        L8:
            return;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar r1) {
            AiNoteDetailActivity.access$playerPause(this.OXO1);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar r3) {
            AiNoteDetailActivity.access$setPlaying$p(this.OXO1, true);
            ImageView r4 = AiNoteDetailActivity.access$getImgRecordPlay$p(this.OXO1);
            if (r4 == null) goto L5;
            r4.setImageResource(R.drawable.ic_record_stop);
        L5:
            tk1 r5 = AiNoteDetailActivity.access$getPcmAudioPlayer$p(this.OXO1);
            if (r5 == null) goto L9;
            final AiNoteDetailActivity r0 = this.OXO1;
            r5.OIi0(new OIi11(r0));
        L9:
            if (AiNoteDetailActivity.access$getSeekbar$p(this.OXO1) == null) goto L13;
            tk1 r6 = AiNoteDetailActivity.access$getPcmAudioPlayer$p(this.OXO1);
            if (r6 == null) goto L13;
            SeekBar r1 = AiNoteDetailActivity.access$getSeekbar$p(this.OXO1);
            Intrinsics.XXI(r1);
            r6.I0IIOi(r1.getProgress());
        L13:
            tk1 r7 = AiNoteDetailActivity.access$getPcmAudioPlayer$p(this.OXO1);
            if (r7 == null) goto L17;
            r7.IO();
            return;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteDetailActivity$collectData$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteDetailActivity$collectData$1", f = "AiNoteDetailActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AIRecords, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AiNoteDetailActivity this$0;

        public AnonymousClass1(AiNoteDetailActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AIRecords r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            AIRecords r0 = (AIRecords) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L37;
            ResultKt.X1ii(r10);
            AiNoteDetailActivity r11 = this.this$0;
            String r1 = null;
            if (r0 == null) goto L7;
            String r2 = r0.getMContent();
        L8:
            AiNoteDetailActivity.access$setContentStr$p(r11, String.valueOf(r2));
            TextView r12 = AiNoteDetailActivity.access$getContentTv$p(this.this$0);
            if (r12 == null) goto L14;
            if (r0 == null) goto L12;
            String r3 = r0.getMContent();
        L13:
            r12.setText(r3);
            goto L14
        L12:
            r3 = null;
        L14:
            if (r0 == null) goto L16;
            r1 = r0.getMAudioPath();
        L16:
            if (r1 != null) goto L18;
        L34:
            ToastUtils.showLong("当前文件已损坏", new Object[0]);
            return Unit.OXO1;
        L18:
            if (r1.length() == 0) goto L34;
            File r4 = new File(r1);
            if (r4.exists() == true) goto L26;
            i1O0OXO1O.OXO1.OXO1("PcmFile Does Not Exists :" + r1);
            File r13 = r4.getParentFile();
            if (r13 == null) goto L25;
            Boxing.OXO1(r13.mkdirs());
        L25:
            r4.createNewFile();
        L26:
            AiNoteDetailActivity.access$setAudioFile$p(this.this$0, r4);
            AiNoteDetailActivity r14 = this.this$0;
            tk1 r5 = new tk1(r4, 0, 0, 0, 14, null);
            AiNoteDetailActivity r6 = this.this$0;
            r6.setAudioTotalTime(ShareUtil.OXO1.OIi0(r5.XO0O10()));
            TextView r7 = AiNoteDetailActivity.access$getTvTotalTime$p(r6);
            if (r7 == null) goto L29;
            r7.setText(r6.getAudioTotalTime());
        L29:
            SeekBar r8 = AiNoteDetailActivity.access$getSeekbar$p(r6);
            if (r8 == null) goto L32;
            r8.setMax(r5.XO0O10());
        L32:
            AiNoteDetailActivity.access$setPcmAudioPlayer$p(r14, r5);
            return Unit.OXO1;
        L7:
            r2 = null;
            goto L8
        L37:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AIRecords r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public AiNoteDetailActivity() {
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new Oi1XOOI(this));
        this.audioTotalTime = "";
        this.contentStr = "";
    }

    public static /* synthetic */ void I0iXXO(AiNoteDetailActivity r0, View r1) {
        initListener$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit O10IXXX0X(AiNoteDetailActivity r0) {
        return showDeleteTipPopup$lambda$0$0$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(String r0, AiNoteDetailActivity r1, int r2) {
        return showDeleteTipPopup$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ AiNoteDetailViewModel X1ii(AiNoteDetailActivity r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(AiNoteDetailActivity r0, int r1) {
        return initListener$lambda$0$0(r0, r1);
    }

    public static final /* synthetic */ TextView access$getContentTv$p(AiNoteDetailActivity r0) {
        return r0.contentTv;
    }

    public static final /* synthetic */ ImageView access$getImgRecordPlay$p(AiNoteDetailActivity r0) {
        return r0.imgRecordPlay;
    }

    public static final /* synthetic */ tk1 access$getPcmAudioPlayer$p(AiNoteDetailActivity r0) {
        return r0.pcmAudioPlayer;
    }

    public static final /* synthetic */ SeekBar access$getSeekbar$p(AiNoteDetailActivity r0) {
        return r0.seekbar;
    }

    public static final /* synthetic */ TextView access$getTvCurrentTime$p(AiNoteDetailActivity r0) {
        return r0.tvCurrentTime;
    }

    public static final /* synthetic */ TextView access$getTvTotalTime$p(AiNoteDetailActivity r0) {
        return r0.tvTotalTime;
    }

    public static final /* synthetic */ void access$playerPause(AiNoteDetailActivity r0) {
        r0.playerPause();
    }

    public static final /* synthetic */ void access$setAudioFile$p(AiNoteDetailActivity r0, File r1) {
        r0.audioFile = r1;
    }

    public static final /* synthetic */ void access$setContentStr$p(AiNoteDetailActivity r0, String r1) {
        r0.contentStr = r1;
    }

    public static final /* synthetic */ void access$setPcmAudioPlayer$p(AiNoteDetailActivity r0, tk1 r1) {
        r0.pcmAudioPlayer = r1;
    }

    public static final /* synthetic */ void access$setPlaying$p(AiNoteDetailActivity r0, boolean r1) {
        r0.isPlaying = r1;
    }

    private final void collectData() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAiNoteFlow(), null, new AnonymousClass1(this, null), 2, null);
    }

    private final AiNoteDetailViewModel getViewModel() {
        return (AiNoteDetailViewModel) getValue();
    }

    private final void initListener() {
        TextView r0 = this.tvCurrentTime;
        if (r0 == null) goto L5;
        r0.setText(ShareUtil.OXO1.OIi0(0));
    L5:
        ImageView r1 = this.imgRecordPlay;
        if (r1 == null) goto L8;
        r1.setOnClickListener(new X0iXiiX(this));
    L8:
        SeekBar r2 = this.seekbar;
        if (r2 == null) goto L12;
        r2.setOnSeekBarChangeListener(new OXO1(this));
        return;
    }

    private static final void initListener$lambda$0(final AiNoteDetailActivity r1, View r2) {
        if (r1.isPlaying == true) goto L19;
        r1.isPlaying = true;
        ImageView r3 = r1.imgRecordPlay;
        if (r3 == null) goto L7;
        r3.setImageResource(R.drawable.ic_record_stop);
    L7:
        SeekBar r4 = r1.seekbar;
        if (r4 == null) goto L12;
        tk1 r0 = r1.pcmAudioPlayer;
        if (r0 == null) goto L12;
        Intrinsics.XXI(r4);
        r0.I0IIOi(r4.getProgress());
    L12:
        tk1 r5 = r1.pcmAudioPlayer;
        if (r5 == null) goto L15;
        r5.IO();
    L15:
        tk1 r6 = r1.pcmAudioPlayer;
        if (r6 == null) goto L26;
        r6.OIi0(new iOX10O(r1));
        return;
    L26:
        return;
    L19:
        r1.isPlaying = false;
        ImageView r7 = r1.imgRecordPlay;
        if (r7 == null) goto L22;
        r7.setImageResource(R.drawable.ic_record_play);
    L22:
        tk1 r8 = r1.pcmAudioPlayer;
        if (r8 == null) goto L27;
        r8.O00();
        return;
    }

    private static final Unit initListener$lambda$0$0(AiNoteDetailActivity r2, int r3) {
        TextView r0 = r2.tvCurrentTime;
        if (r0 == null) goto L5;
        r0.setText(ShareUtil.OXO1.OIi0(r3));
    L5:
        SeekBar r1 = r2.seekbar;
        if (r1 == null) goto L8;
        r1.setProgress(r3);
    L8:
        tk1 r4 = r2.pcmAudioPlayer;
        if (r4 == null) goto L22;
        if (r4.XO0O10() != r3) goto L22;
        r2.isPlaying = false;
        ImageView r5 = r2.imgRecordPlay;
        if (r5 == null) goto L15;
        r5.setImageResource(R.drawable.ic_record_play);
    L15:
        TextView r6 = r2.tvCurrentTime;
        if (r6 == null) goto L18;
        r6.setText(ShareUtil.OXO1.OIi0(0));
    L18:
        SeekBar r7 = r2.seekbar;
        if (r7 == null) goto L22;
        r7.setProgress(0);
    L22:
        return Unit.OXO1;
    }

    private final void playerPause() {
        this.isPlaying = false;
        ImageView r0 = this.imgRecordPlay;
        if (r0 == null) goto L5;
        r0.setImageResource(R.drawable.ic_record_play);
    L5:
        tk1 r1 = this.pcmAudioPlayer;
        if (r1 == null) goto L9;
        r1.O00();
        return;
    }

    private static final boolean showDeleteTipPopup$lambda$0$0(String r8, final AiNoteDetailActivity r9, int r10) {
        if (r10 != 1) goto L5;
        ShareUtil.OXO1.iO(r8);
    L12:
        return true;
    L5:
        if (r10 != 2) goto L7;
        r9.playerPause();
        ShareUtil.I0IIOi(ShareUtil.OXO1, r8, null, r9, LifecycleOwnerKt.getLifecycleScope(r9), 2, null);
        goto L12
    L7:
        if (r10 != 3) goto L12;
        ShareUtil.OXO1.XO0O10(r9, new I11IO(r9));
        goto L12
    }

    private static final Unit showDeleteTipPopup$lambda$0$0$0(AiNoteDetailActivity r1) {
        r1.getViewModel().softDeleteAiNote();
        ToastUtils.showLong(R.string.delete_success);
        r1.finish();
        return Unit.OXO1;
    }

    private static final AiNoteDetailViewModel viewModel_delegate$lambda$0(AiNoteDetailActivity r1) {
        return (AiNoteDetailViewModel) new ViewModelProvider(r1).get(AiNoteDetailViewModel.class);
    }

    @aa1
    public final String getAudioTotalTime() {
        return this.audioTotalTime;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        int r5 = getMArg1();
        if (r5 < 0) goto L6;
        getViewModel().getAiRecordById(r5);
        return;
    L6:
        ToastUtils.showLong("当前参数错误", new Object[0]);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText("笔记详情");
        this.contentTv = (TextView) findViewById(R.id.aiNoteDetailContentTv);
        this.seekbar = (SeekBar) findViewById(R.id.seekbar);
        this.tvTotalTime = (TextView) findViewById(R.id.tv_totalTime);
        this.tvCurrentTime = (TextView) findViewById(R.id.tv_currentTime);
        this.imgRecordPlay = (ImageView) findViewById(R.id.img_record_play);
        initListener();
        collectData();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_ai_note_detail;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        tk1 r0 = this.pcmAudioPlayer;
        if (r0 == null) goto L5;
        r0.OIX0iXi();
    L5:
        this.pcmAudioPlayer = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        playerPause();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "v");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        showDeleteTipPopup();
    }

    public final void setAudioTotalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.audioTotalTime = r2;
    }

    public final void showDeleteTipPopup() {
        final String r0 = this.contentStr;
        if (this.audioFile != null) goto L6;
        return;
    L6:
        if (r0.length() != 0) goto L9;
        return;
    L9:
        if (this.mTranslationDetailPopup != null) goto L11;
        r16 r1 = new r16(this);
        r1.iXiX011(getString(R.string.action_details) + ": " + this.audioTotalTime);
        r1.XXO(getString(R.string.file_size_title_tip) + ": " + FileUtils.getSize(this.audioFile));
        r1.Ii1iii0(getString(R.string.number_of_words) + ": " + r0.length());
        r1.O001I(getString(R.string.create_time_tip) + ": ");
        r1.iXiiiO(new I0IOIXX0(r0, this));
        this.mTranslationDetailPopup = r1;
    L11:
        r16 r2 = this.mTranslationDetailPopup;
        if (r2 == null) goto L15;
        r2.IIX1OXO();
        return;
    }
}
