package com.sma.smartv3.p610ui.ai_note;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.r16;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tk1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.ai_note.AiNoteDetailActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.ActivityUtilKt;
import com.sma.smartv3.util.ShareUtil;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteDetailActivity extends BaseActivity {

    @tb1
    private File audioFile;

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
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi1XOOI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AiNoteDetailActivity.viewModel_delegate$lambda$0(this.f3689IO);
        }
    });

    @aa1
    private String audioTotalTime = "";

    @aa1
    private String contentStr = "";

    public static final class OXO1 implements SeekBar.OnSeekBarChangeListener {
        public OXO1() {
        }

        public static final Unit XIi00iiXO(AiNoteDetailActivity aiNoteDetailActivity, int i) {
            TextView textView = aiNoteDetailActivity.tvCurrentTime;
            if (textView != null) {
                textView.setText(ShareUtil.OXO1.OIi0(i));
            }
            SeekBar seekBar = aiNoteDetailActivity.seekbar;
            if (seekBar != null) {
                seekBar.setProgress(i);
            }
            tk1 tk1Var = aiNoteDetailActivity.pcmAudioPlayer;
            if (tk1Var != null && tk1Var.XO0O10() == i) {
                aiNoteDetailActivity.isPlaying = false;
                ImageView imageView = aiNoteDetailActivity.imgRecordPlay;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ic_record_play);
                }
                TextView textView2 = aiNoteDetailActivity.tvCurrentTime;
                if (textView2 != null) {
                    textView2.setText(ShareUtil.OXO1.OIi0(0));
                }
                SeekBar seekBar2 = aiNoteDetailActivity.seekbar;
                if (seekBar2 != null) {
                    seekBar2.setProgress(0);
                }
            }
            return Unit.OXO1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            TextView textView;
            if (!z || (textView = AiNoteDetailActivity.this.tvCurrentTime) == null) {
                return;
            }
            textView.setText(ShareUtil.OXO1.OIi0(i));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            AiNoteDetailActivity.this.playerPause();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            tk1 tk1Var;
            AiNoteDetailActivity.this.isPlaying = true;
            ImageView imageView = AiNoteDetailActivity.this.imgRecordPlay;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_record_stop);
            }
            tk1 tk1Var2 = AiNoteDetailActivity.this.pcmAudioPlayer;
            if (tk1Var2 != null) {
                final AiNoteDetailActivity aiNoteDetailActivity = AiNoteDetailActivity.this;
                tk1Var2.OIi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIi11
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return AiNoteDetailActivity.OXO1.XIi00iiXO(aiNoteDetailActivity, ((Integer) obj).intValue());
                    }
                });
            }
            if (AiNoteDetailActivity.this.seekbar != null && (tk1Var = AiNoteDetailActivity.this.pcmAudioPlayer) != null) {
                SeekBar seekBar2 = AiNoteDetailActivity.this.seekbar;
                Intrinsics.XXI(seekBar2);
                tk1Var.I0IIOi(seekBar2.getProgress());
            }
            tk1 tk1Var3 = AiNoteDetailActivity.this.pcmAudioPlayer;
            if (tk1Var3 != null) {
                tk1Var3.m3121IO();
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteDetailActivity$collectData$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteDetailActivity$collectData$1", m39466f = "AiNoteDetailActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186521 extends SuspendLambda implements Function2<AIRecords, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186521(Continuation<? super C186521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186521 c186521 = AiNoteDetailActivity.this.new C186521(continuation);
            c186521.L$0 = obj;
            return c186521;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AIRecords aIRecords, Continuation<? super Unit> continuation) {
            return ((C186521) create(aIRecords, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            AIRecords aIRecords = (AIRecords) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            AiNoteDetailActivity.this.contentStr = String.valueOf(aIRecords != null ? aIRecords.getMContent() : null);
            TextView textView = AiNoteDetailActivity.this.contentTv;
            if (textView != null) {
                textView.setText(aIRecords != null ? aIRecords.getMContent() : null);
            }
            String mAudioPath = aIRecords != null ? aIRecords.getMAudioPath() : null;
            if (mAudioPath == null || mAudioPath.length() == 0) {
                ToastUtils.showLong("当前文件已损坏", new Object[0]);
                return Unit.OXO1;
            }
            File file = new File(mAudioPath);
            if (!file.exists()) {
                i1O0OXO1O.OXO1.OXO1("PcmFile Does Not Exists :" + mAudioPath);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    Boxing.OXO1(parentFile.mkdirs());
                }
                file.createNewFile();
            }
            AiNoteDetailActivity.this.audioFile = file;
            AiNoteDetailActivity aiNoteDetailActivity = AiNoteDetailActivity.this;
            tk1 tk1Var = new tk1(file, 0, 0, 0, 14, null);
            AiNoteDetailActivity aiNoteDetailActivity2 = AiNoteDetailActivity.this;
            aiNoteDetailActivity2.setAudioTotalTime(ShareUtil.OXO1.OIi0(tk1Var.XO0O10()));
            TextView textView2 = aiNoteDetailActivity2.tvTotalTime;
            if (textView2 != null) {
                textView2.setText(aiNoteDetailActivity2.getAudioTotalTime());
            }
            SeekBar seekBar = aiNoteDetailActivity2.seekbar;
            if (seekBar != null) {
                seekBar.setMax(tk1Var.XO0O10());
            }
            aiNoteDetailActivity.pcmAudioPlayer = tk1Var;
            return Unit.OXO1;
        }
    }

    private final void collectData() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAiNoteFlow(), null, new C186521(null), 2, null);
    }

    private final AiNoteDetailViewModel getViewModel() {
        return (AiNoteDetailViewModel) this.viewModel$delegate.getValue();
    }

    private final void initListener() {
        TextView textView = this.tvCurrentTime;
        if (textView != null) {
            textView.setText(ShareUtil.OXO1.OIi0(0));
        }
        ImageView imageView = this.imgRecordPlay;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X0iXiiX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiNoteDetailActivity.initListener$lambda$0(this.f4111IO, view);
                }
            });
        }
        SeekBar seekBar = this.seekbar;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new OXO1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(final AiNoteDetailActivity aiNoteDetailActivity, View view) {
        tk1 tk1Var;
        if (aiNoteDetailActivity.isPlaying) {
            aiNoteDetailActivity.isPlaying = false;
            ImageView imageView = aiNoteDetailActivity.imgRecordPlay;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_record_play);
            }
            tk1 tk1Var2 = aiNoteDetailActivity.pcmAudioPlayer;
            if (tk1Var2 != null) {
                tk1Var2.O00();
                return;
            }
            return;
        }
        aiNoteDetailActivity.isPlaying = true;
        ImageView imageView2 = aiNoteDetailActivity.imgRecordPlay;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.ic_record_stop);
        }
        SeekBar seekBar = aiNoteDetailActivity.seekbar;
        if (seekBar != null && (tk1Var = aiNoteDetailActivity.pcmAudioPlayer) != null) {
            Intrinsics.XXI(seekBar);
            tk1Var.I0IIOi(seekBar.getProgress());
        }
        tk1 tk1Var3 = aiNoteDetailActivity.pcmAudioPlayer;
        if (tk1Var3 != null) {
            tk1Var3.m3121IO();
        }
        tk1 tk1Var4 = aiNoteDetailActivity.pcmAudioPlayer;
        if (tk1Var4 != null) {
            tk1Var4.OIi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.iOX10O
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AiNoteDetailActivity.initListener$lambda$0$0(this.f8137IO, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$0$0(AiNoteDetailActivity aiNoteDetailActivity, int i) {
        TextView textView = aiNoteDetailActivity.tvCurrentTime;
        if (textView != null) {
            textView.setText(ShareUtil.OXO1.OIi0(i));
        }
        SeekBar seekBar = aiNoteDetailActivity.seekbar;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
        tk1 tk1Var = aiNoteDetailActivity.pcmAudioPlayer;
        if (tk1Var != null && tk1Var.XO0O10() == i) {
            aiNoteDetailActivity.isPlaying = false;
            ImageView imageView = aiNoteDetailActivity.imgRecordPlay;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_record_play);
            }
            TextView textView2 = aiNoteDetailActivity.tvCurrentTime;
            if (textView2 != null) {
                textView2.setText(ShareUtil.OXO1.OIi0(0));
            }
            SeekBar seekBar2 = aiNoteDetailActivity.seekbar;
            if (seekBar2 != null) {
                seekBar2.setProgress(0);
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playerPause() {
        this.isPlaying = false;
        ImageView imageView = this.imgRecordPlay;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_record_play);
        }
        tk1 tk1Var = this.pcmAudioPlayer;
        if (tk1Var != null) {
            tk1Var.O00();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0(String str, final AiNoteDetailActivity aiNoteDetailActivity, int i) {
        if (i == 1) {
            ShareUtil.OXO1.m38839iO(str);
        } else if (i == 2) {
            aiNoteDetailActivity.playerPause();
            ShareUtil.I0IIOi(ShareUtil.OXO1, str, null, aiNoteDetailActivity, LifecycleOwnerKt.getLifecycleScope(aiNoteDetailActivity), 2, null);
        } else if (i == 3) {
            ShareUtil.OXO1.XO0O10(aiNoteDetailActivity, new Function0() { // from class: com.android.mltcode.paycertificationapi.I11IO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return AiNoteDetailActivity.showDeleteTipPopup$lambda$0$0$0(this.f1350IO);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDeleteTipPopup$lambda$0$0$0(AiNoteDetailActivity aiNoteDetailActivity) {
        aiNoteDetailActivity.getViewModel().softDeleteAiNote();
        ToastUtils.showLong(R.string.delete_success);
        aiNoteDetailActivity.finish();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiNoteDetailViewModel viewModel_delegate$lambda$0(AiNoteDetailActivity aiNoteDetailActivity) {
        return (AiNoteDetailViewModel) new ViewModelProvider(aiNoteDetailActivity).get(AiNoteDetailViewModel.class);
    }

    @aa1
    public final String getAudioTotalTime() {
        return this.audioTotalTime;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        int mArg1 = getMArg1();
        if (mArg1 >= 0) {
            getViewModel().getAiRecordById(mArg1);
        } else {
            ToastUtils.showLong("当前参数错误", new Object[0]);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
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

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_ai_note_detail;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        tk1 tk1Var = this.pcmAudioPlayer;
        if (tk1Var != null) {
            tk1Var.OIX0iXi();
        }
        this.pcmAudioPlayer = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        playerPause();
    }

    public final void onTitleLeftClick(@aa1 View v) {
        Intrinsics.X0O(v, "v");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showDeleteTipPopup();
    }

    public final void setAudioTotalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.audioTotalTime = str;
    }

    public final void showDeleteTipPopup() {
        final String str = this.contentStr;
        if (this.audioFile == null || str.length() == 0) {
            return;
        }
        if (this.mTranslationDetailPopup == null) {
            r16 r16Var = new r16(this);
            r16Var.iXiX011(getString(R.string.action_details) + ": " + this.audioTotalTime);
            r16Var.XXO(getString(R.string.file_size_title_tip) + ": " + FileUtils.getSize(this.audioFile));
            r16Var.Ii1iii0(getString(R.string.number_of_words) + ": " + str.length());
            r16Var.O001I(getString(R.string.create_time_tip) + ": ");
            r16Var.iXiiiO(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0IOIXX0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(AiNoteDetailActivity.showDeleteTipPopup$lambda$0$0(str, this, ((Integer) obj).intValue()));
                }
            });
            this.mTranslationDetailPopup = r16Var;
        }
        r16 r16Var2 = this.mTranslationDetailPopup;
        if (r16Var2 != null) {
            r16Var2.IIX1OXO();
        }
    }
}
