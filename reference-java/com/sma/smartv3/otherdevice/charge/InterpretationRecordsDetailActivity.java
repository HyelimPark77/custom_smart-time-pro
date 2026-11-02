package com.sma.smartv3.otherdevice.charge;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iii1ii;
import com.android.mltcode.paycertificationapi.r16;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.p057io.Location;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.otherdevice.charge.InterpretationRecordsDetailActivity;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.AIRecordsDao;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nInterpretationRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpretationRecordsDetailActivity.kt\ncom/sma/smartv3/otherdevice/charge/InterpretationRecordsDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1#2:293\n*E\n"})
public final class InterpretationRecordsDetailActivity extends BaseActivity {

    @tb1
    private AudioManager audioManager;
    private boolean isPlayAudio;

    @tb1
    private AIRecords mAIRecords;

    @tb1
    private iii1ii mEditPop;

    @tb1
    private r16 mTranslationDetailPopup;
    private int recordingTime;

    @tb1
    private Timer timer;

    @aa1
    private final AIRecordsDao mRecordsDao = MyDb.INSTANCE.getMDatabase().aiRecordsDao();

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cb
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.abhTitleCenter_delegate$lambda$0(this.f5939IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ma
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.abhTitleRight_delegate$lambda$0(this.f9656IO);
        }
    });

    @aa1
    private final String TAG = "InterpretationRecordsDetailActivity";

    @aa1
    private final Lazy mRecordsTitle$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.na
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsTitle_delegate$lambda$0(this.f9894IO);
        }
    });

    @aa1
    private final Lazy mRecordsTitleEditImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oa
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsTitleEditImg_delegate$lambda$0(this.f10095IO);
        }
    });

    @aa1
    private final Lazy mRecordsLanguage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pa
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsLanguage_delegate$lambda$0(this.f10317IO);
        }
    });

    @aa1
    private final Lazy mRecordsToLanguage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qa
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsToLanguage_delegate$lambda$0(this.f10562IO);
        }
    });

    @aa1
    private final Lazy mRecordsLocation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ra
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsLocation_delegate$lambda$0(this.f10774IO);
        }
    });

    @aa1
    private final Lazy mRecordsTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sa
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsTime_delegate$lambda$0(this.f10991IO);
        }
    });

    @aa1
    private final Lazy mRecordsContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ta
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsContent_delegate$lambda$0(this.f11219IO);
        }
    });

    @aa1
    private final Lazy mRecordsExtraInfo$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ua
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsExtraInfo_delegate$lambda$0(this.f11449IO);
        }
    });

    @aa1
    private final Lazy mRecordsAudioSeekBar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.db
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsAudioSeekBar_delegate$lambda$0(this.f6158IO);
        }
    });

    @aa1
    private final Lazy mRecordsAudioDuration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eb
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsAudioDuration_delegate$lambda$0(this.f6374IO);
        }
    });

    @aa1
    private final Lazy mRecordsPlayAudioBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fb
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsPlayAudioBtn_delegate$lambda$0(this.f6603IO);
        }
    });

    @aa1
    private final Lazy mRecordsPlayVolumeBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gb
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return InterpretationRecordsDetailActivity.mRecordsPlayVolumeBtn_delegate$lambda$0(this.f6841IO);
        }
    });
    private boolean isOpenVolume = true;

    public static final class OXO1 extends TimerTask {
        public OXO1() {
        }

        public static final void XIi00iiXO(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
            interpretationRecordsDetailActivity.setRecordingTime(interpretationRecordsDetailActivity.getRecordingTime() + 1);
            interpretationRecordsDetailActivity.getMRecordsAudioSeekBar().setProgress(interpretationRecordsDetailActivity.getRecordingTime());
            if (interpretationRecordsDetailActivity.getRecordingTime() >= 13) {
                Timer timer = interpretationRecordsDetailActivity.timer;
                if (timer != null) {
                    timer.cancel();
                }
                interpretationRecordsDetailActivity.setPlayAudio(false);
                interpretationRecordsDetailActivity.getMRecordsPlayAudioBtn().setImageResource(R.drawable.icon_run_start);
                fq1.OXO1.OIi0();
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final InterpretationRecordsDetailActivity interpretationRecordsDetailActivity = InterpretationRecordsDetailActivity.this;
            interpretationRecordsDetailActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.hb
                @Override // java.lang.Runnable
                public final void run() {
                    InterpretationRecordsDetailActivity.OXO1.XIi00iiXO(interpretationRecordsDetailActivity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (TextView) interpretationRecordsDetailActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (ImageView) interpretationRecordsDetailActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity, View view) {
        boolean z = interpretationRecordsDetailActivity.isPlayAudio;
        interpretationRecordsDetailActivity.isPlayAudio = !z;
        if (z) {
            interpretationRecordsDetailActivity.getMRecordsPlayAudioBtn().setImageResource(R.drawable.icon_run_start);
            fq1.OXO1.OIi0();
            return;
        }
        interpretationRecordsDetailActivity.getMRecordsPlayAudioBtn().setImageResource(R.drawable.icon_run_pause);
        try {
            AIRecords aIRecords = interpretationRecordsDetailActivity.mAIRecords;
            if (aIRecords != null) {
                Intrinsics.XXI(aIRecords);
                if (aIRecords.getMAudioPath().length() > 0) {
                    fq1 fq1Var = fq1.OXO1;
                    AIRecords aIRecords2 = interpretationRecordsDetailActivity.mAIRecords;
                    Intrinsics.XXI(aIRecords2);
                    fq1.O00(fq1Var, aIRecords2.getMAudioPath(), 0, 2, null);
                    interpretationRecordsDetailActivity.recordingTime = 0;
                    Timer timer = interpretationRecordsDetailActivity.timer;
                    if (timer != null) {
                        timer.cancel();
                    }
                    Timer timer2 = new Timer();
                    interpretationRecordsDetailActivity.timer = timer2;
                    timer2.scheduleAtFixedRate(interpretationRecordsDetailActivity.new OXO1(), 0L, 1000L);
                }
            }
        } catch (Exception e) {
            i1O0OXO1O.OXO1.OXO1(interpretationRecordsDetailActivity.TAG + " play e = " + e);
            ToastUtils.showLong("音频文件已损坏", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity, View view) {
        boolean z = interpretationRecordsDetailActivity.isOpenVolume;
        interpretationRecordsDetailActivity.isOpenVolume = !z;
        if (!z) {
            fq1.OXO1.XOO0ii0();
            interpretationRecordsDetailActivity.getMRecordsPlayVolumeBtn().setImageResource(R.drawable.simultaneous_play_volume_icon);
            return;
        }
        Object systemService = interpretationRecordsDetailActivity.getSystemService("audio");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        fq1 fq1Var = fq1.OXO1;
        fq1Var.OXO1(streamVolume / streamMaxVolume);
        fq1Var.m1820IO();
        interpretationRecordsDetailActivity.getMRecordsPlayVolumeBtn().setImageResource(R.drawable.simultaneous_closure_volume_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsAudioDuration_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_audio_duration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressBar mRecordsAudioSeekBar_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (ProgressBar) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_audio_seekbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsContent_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsExtraInfo_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_extraInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsLanguage_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsLocation_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRecordsPlayAudioBtn_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (ImageView) interpretationRecordsDetailActivity.findViewById(R.id.simultaneous_play_audio_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRecordsPlayVolumeBtn_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (ImageView) interpretationRecordsDetailActivity.findViewById(R.id.simultaneous_play_audio_volume_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsTime_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mRecordsTitleEditImg_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (ImageView) interpretationRecordsDetailActivity.findViewById(R.id.transform_title_edit_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsTitle_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium mRecordsToLanguage_delegate$lambda$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        return (PFMedium) interpretationRecordsDetailActivity.findViewById(R.id.interpretation_records_to_language);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0(final InterpretationRecordsDetailActivity interpretationRecordsDetailActivity, int i) {
        String mContent;
        if (i == 1) {
            AIRecords aIRecords = interpretationRecordsDetailActivity.mAIRecords;
            ClipboardUtils.copyText(aIRecords != null ? aIRecords.getMContent() : null);
            ToastUtils.showLong(R.string.copied);
        } else if (i == 2) {
            AIRecords aIRecords2 = interpretationRecordsDetailActivity.mAIRecords;
            if (aIRecords2 != null && (mContent = aIRecords2.getMContent()) != null && mContent.length() > 0) {
                ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.va
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2() {
                        return InterpretationRecordsDetailActivity.showDeleteTipPopup$lambda$0$0$0(this.f11683IO);
                    }
                }, 30, null);
            }
        } else if (i == 3) {
            go0 go0Var = new go0(interpretationRecordsDetailActivity.getMContext(), 0, 2, null);
            go0Var.O1O(R.string.weather_del_file);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.xa
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(InterpretationRecordsDetailActivity.showDeleteTipPopup$lambda$0$0$1$0());
                }
            });
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.ya
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(InterpretationRecordsDetailActivity.showDeleteTipPopup$lambda$0$0$1$1(this.f12337IO));
                }
            });
            go0Var.IIX1OXO();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDeleteTipPopup$lambda$0$0$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        AIRecords aIRecords = interpretationRecordsDetailActivity.mAIRecords;
        String mContent = aIRecords != null ? aIRecords.getMContent() : null;
        Intrinsics.XXI(mContent);
        interpretationRecordsDetailActivity.exportTextToFile(mContent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0$1$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$0$0$1$1(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity) {
        AIRecords aIRecords = interpretationRecordsDetailActivity.mAIRecords;
        if (aIRecords != null) {
            aIRecords.setMIsSync(0);
        }
        AIRecords aIRecords2 = interpretationRecordsDetailActivity.mAIRecords;
        if (aIRecords2 != null) {
            aIRecords2.setMIsDelete(1);
        }
        AIRecordsDao aIRecordsDao = interpretationRecordsDetailActivity.mRecordsDao;
        AIRecords aIRecords3 = interpretationRecordsDetailActivity.mAIRecords;
        Intrinsics.XXI(aIRecords3);
        aIRecordsDao.update(aIRecords3);
        I01XX0.XIi00iiXO(I01XX0.OXi001, null, 2, null);
        interpretationRecordsDetailActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEditPopup() {
        String mAITitle;
        if (this.mEditPop == null) {
            iii1ii iii1iiVar = new iii1ii(getMContext(), 0, 2, null);
            iii1iiVar.X01IiOiIi().setTextColor(gk4.m1859iO(getMContext(), R.color.line_color));
            iii1iiVar.XXX11i(R.string.title);
            AIRecords aIRecords = this.mAIRecords;
            if (aIRecords == null || (mAITitle = aIRecords.getMAITitle()) == null) {
                mAITitle = "";
            }
            iii1iiVar.m2279iI(mAITitle);
            iii1iiVar.X11iII1O1(new Function1() { // from class: com.android.mltcode.paycertificationapi.bb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(InterpretationRecordsDetailActivity.showEditPopup$lambda$0$0(this.f5697IO, (String) obj));
                }
            });
            this.mEditPop = iii1iiVar;
        }
        iii1ii iii1iiVar2 = this.mEditPop;
        if (iii1iiVar2 != null) {
            iii1iiVar2.IIX1OXO();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showEditPopup$lambda$0$0(InterpretationRecordsDetailActivity interpretationRecordsDetailActivity, String text) {
        Intrinsics.X0O(text, "text");
        if (TextUtils.isEmpty(text)) {
            return true;
        }
        interpretationRecordsDetailActivity.getMRecordsTitle().setText(text);
        AIRecords aIRecords = interpretationRecordsDetailActivity.mAIRecords;
        if (aIRecords != null) {
            aIRecords.setMAITitle(text);
        }
        AIRecords aIRecords2 = interpretationRecordsDetailActivity.mAIRecords;
        if (aIRecords2 == null) {
            return true;
        }
        AIRecordsDao aIRecordsDao = interpretationRecordsDetailActivity.mRecordsDao;
        Intrinsics.XXI(aIRecords2);
        if (aIRecordsDao.update(aIRecords2) <= 0) {
            return true;
        }
        I01XX0.XIi00iiXO(I01XX0.OXi001, null, 2, null);
        return true;
    }

    public final void exportTextToFile(@aa1 String textToExport) {
        Intrinsics.X0O(textToExport, "textToExport");
        sz0 sz0Var = sz0.OXO1;
        File fileOXO1 = sz0Var.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), "record_text.txt");
        try {
            if (fileOXO1.exists()) {
                fileOXO1.delete();
            }
            FileUtils.createOrExistsFile(fileOXO1);
            FileWriter fileWriter = new FileWriter(fileOXO1);
            fileWriter.write(textToExport);
            fileWriter.close();
            Uri uriXO0O10 = sz0Var.XO0O10(fileOXO1);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", "Share txt");
            intent.putExtra("android.intent.extra.STREAM", uriXO0O10);
            intent.setType("*/*");
            intent.addFlags(268435456);
            startActivity(Intent.createChooser(intent, "Share txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    public final PFMedium getMRecordsAudioDuration() {
        return (PFMedium) this.mRecordsAudioDuration$delegate.getValue();
    }

    public final ProgressBar getMRecordsAudioSeekBar() {
        return (ProgressBar) this.mRecordsAudioSeekBar$delegate.getValue();
    }

    public final PFMedium getMRecordsContent() {
        return (PFMedium) this.mRecordsContent$delegate.getValue();
    }

    public final PFMedium getMRecordsExtraInfo() {
        return (PFMedium) this.mRecordsExtraInfo$delegate.getValue();
    }

    public final PFMedium getMRecordsLanguage() {
        return (PFMedium) this.mRecordsLanguage$delegate.getValue();
    }

    public final PFMedium getMRecordsLocation() {
        return (PFMedium) this.mRecordsLocation$delegate.getValue();
    }

    public final ImageView getMRecordsPlayAudioBtn() {
        return (ImageView) this.mRecordsPlayAudioBtn$delegate.getValue();
    }

    public final ImageView getMRecordsPlayVolumeBtn() {
        return (ImageView) this.mRecordsPlayVolumeBtn$delegate.getValue();
    }

    public final PFMedium getMRecordsTime() {
        return (PFMedium) this.mRecordsTime$delegate.getValue();
    }

    public final PFMedium getMRecordsTitle() {
        return (PFMedium) this.mRecordsTitle$delegate.getValue();
    }

    public final ImageView getMRecordsTitleEditImg() {
        return (ImageView) this.mRecordsTitleEditImg$delegate.getValue();
    }

    public final PFMedium getMRecordsToLanguage() {
        return (PFMedium) this.mRecordsToLanguage$delegate.getValue();
    }

    public final int getRecordingTime() {
        return this.recordingTime;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.AIRecords");
        this.mAIRecords = (AIRecords) mArg3;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @SuppressLint({"DiscouragedApi"})
    public void initView() {
        String mLocation;
        getAbhTitleCenter().setText(getString(R.string.interpretation_record));
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_more_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        PFMedium mRecordsTitle = getMRecordsTitle();
        AIRecords aIRecords = this.mAIRecords;
        mRecordsTitle.setText(aIRecords != null ? aIRecords.getMAITitle() : null);
        getMRecordsTitleEditImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.la
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9393IO.showEditPopup();
            }
        });
        PFMedium mRecordsLanguage = getMRecordsLanguage();
        AIRecords aIRecords2 = this.mAIRecords;
        mRecordsLanguage.setText(aIRecords2 != null ? aIRecords2.getMTranslateLanguage() : null);
        PFMedium mRecordsToLanguage = getMRecordsToLanguage();
        AIRecords aIRecords3 = this.mAIRecords;
        mRecordsToLanguage.setText(aIRecords3 != null ? aIRecords3.getMTranslateToLanguage() : null);
        PFMedium mRecordsLocation = getMRecordsLocation();
        AIRecords aIRecords4 = this.mAIRecords;
        if (aIRecords4 == null || (mLocation = aIRecords4.getMLocation()) == null) {
            mLocation = null;
        } else if (mLocation.length() == 0) {
            mLocation = HelpFormatter.DEFAULT_OPT_PREFIX;
        }
        mRecordsLocation.setText(mLocation);
        PFMedium mRecordsTime = getMRecordsTime();
        AIRecords aIRecords5 = this.mAIRecords;
        mRecordsTime.setText(aIRecords5 != null ? aIRecords5.getMLocalTime() : null);
        PFMedium mRecordsContent = getMRecordsContent();
        AIRecords aIRecords6 = this.mAIRecords;
        mRecordsContent.setText(aIRecords6 != null ? aIRecords6.getMContent() : null);
        PFMedium mRecordsExtraInfo = getMRecordsExtraInfo();
        AIRecords aIRecords7 = this.mAIRecords;
        mRecordsExtraInfo.setText(aIRecords7 != null ? aIRecords7.getMExtraInfo() : null);
        ProgressBar mRecordsAudioSeekBar = getMRecordsAudioSeekBar();
        AIRecords aIRecords8 = this.mAIRecords;
        mRecordsAudioSeekBar.setMax(aIRecords8 != null ? aIRecords8.getMAudioDuration() : 0);
        PFMedium mRecordsAudioDuration = getMRecordsAudioDuration();
        AIRecords aIRecords9 = this.mAIRecords;
        mRecordsAudioDuration.setText(aIRecords9 != null ? O0X11OiO.OX110i(aIRecords9.getMAudioDuration()) : null);
        getMRecordsPlayAudioBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.wa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterpretationRecordsDetailActivity.initView$lambda$2(this.f11910IO, view);
            }
        });
        getMRecordsPlayVolumeBtn().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.za
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterpretationRecordsDetailActivity.initView$lambda$3(this.f12571IO, view);
            }
        });
    }

    public final boolean isOpenVolume() {
        return this.isOpenVolume;
    }

    public final boolean isPlayAudio() {
        return this.isPlayAudio;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_interpretation_records_detail;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        showDeleteTipPopup();
    }

    public final void setOpenVolume(boolean z) {
        this.isOpenVolume = z;
    }

    public final void setPlayAudio(boolean z) {
        this.isPlayAudio = z;
    }

    public final void setRecordingTime(int i) {
        this.recordingTime = i;
    }

    public final void showDeleteTipPopup() {
        String mContent;
        if (this.mTranslationDetailPopup == null) {
            AIRecords aIRecords = this.mAIRecords;
            File file = new File(aIRecords != null ? aIRecords.getMAudioPath() : null);
            r16 r16Var = new r16(getMContext());
            String string = getString(R.string.action_details);
            AIRecords aIRecords2 = this.mAIRecords;
            int length = 0;
            r16Var.iXiX011(string + ": " + O0X11OiO.OX110i(aIRecords2 != null ? aIRecords2.getMAudioDuration() : 0));
            r16Var.XXO(getString(R.string.file_size_title_tip) + ": " + FileUtils.getSize(file));
            String string2 = getString(R.string.number_of_words);
            AIRecords aIRecords3 = this.mAIRecords;
            if (aIRecords3 != null && (mContent = aIRecords3.getMContent()) != null) {
                length = mContent.length();
            }
            r16Var.Ii1iii0(string2 + ": " + length);
            String string3 = getString(R.string.create_time_tip);
            AIRecords aIRecords4 = this.mAIRecords;
            r16Var.O001I(string3 + ": " + (aIRecords4 != null ? aIRecords4.getMLocalTime() : null));
            r16Var.iXiiiO(new Function1() { // from class: com.android.mltcode.paycertificationapi.ab
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(InterpretationRecordsDetailActivity.showDeleteTipPopup$lambda$0$0(this.f5454IO, ((Integer) obj).intValue()));
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
