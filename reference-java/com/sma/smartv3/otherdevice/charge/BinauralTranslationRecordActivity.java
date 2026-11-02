package com.sma.smartv3.otherdevice.charge;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.InterfaceC2572jc;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.r16;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tk1;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.p057io.Location;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.otherdevice.charge.BinauralTranslationRecordActivity;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBinauralTranslationRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1563#2:282\n1634#2,3:283\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n*L\n199#1:282\n199#1:283,3\n*E\n"})
public final class BinauralTranslationRecordActivity extends BaseActivity {
    private boolean isPlaying;
    private MultiItemTypeAdapter<AISpeech> mAdapter;

    @tb1
    private r16 mTranslationDetailPopup;

    @aa1
    private final String TAG = "BinauralTranslationRecordActivity";

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1iX011
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.abhTitleCenter_delegate$lambda$0(this.f1500IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIO1100
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.abhTitleRight_delegate$lambda$0(this.f4535IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I01OII
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.rv_delegate$lambda$0(this.f1074IO);
        }
    });

    @aa1
    private final Lazy img_record_play$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i110OIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.img_record_play_delegate$lambda$0(this.f7530IO);
        }
    });

    @aa1
    private final Lazy tv_currentTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0i1Xi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.tv_currentTime_delegate$lambda$0(this.f1267IO);
        }
    });

    @aa1
    private final Lazy seekbar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i11OO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.seekbar_delegate$lambda$0(this.f7545IO);
        }
    });

    @aa1
    private final Lazy tv_totalTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiO11IOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.tv_totalTime_delegate$lambda$0(this.f2258IO);
        }
    });

    @aa1
    private ArrayList<AISpeech> aiSpeechList = new ArrayList<>();

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @aa1
    private final Lazy pcmAudioPlayer$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XXIi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BinauralTranslationRecordActivity.pcmAudioPlayer_delegate$lambda$0();
        }
    });

    @aa1
    private String audioTotalTime = "";

    public static final class OXO1 implements SeekBar.OnSeekBarChangeListener {
        public OXO1() {
        }

        public static final Unit XIi00iiXO(BinauralTranslationRecordActivity binauralTranslationRecordActivity, int i) {
            binauralTranslationRecordActivity.getTv_currentTime().setText(binauralTranslationRecordActivity.updatePlayTime(i));
            binauralTranslationRecordActivity.getSeekbar().setProgress(i);
            if (binauralTranslationRecordActivity.getPcmAudioPlayer().XO0O10() == i) {
                binauralTranslationRecordActivity.isPlaying = false;
                binauralTranslationRecordActivity.getImg_record_play().setImageResource(R.drawable.ic_record_play);
                binauralTranslationRecordActivity.getTv_currentTime().setText(binauralTranslationRecordActivity.updatePlayTime(0));
                binauralTranslationRecordActivity.getSeekbar().setProgress(0);
            }
            return Unit.OXO1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                BinauralTranslationRecordActivity.this.getTv_currentTime().setText(BinauralTranslationRecordActivity.this.updatePlayTime(i));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            BinauralTranslationRecordActivity.this.isPlaying = false;
            BinauralTranslationRecordActivity.this.getImg_record_play().setImageResource(R.drawable.ic_record_play);
            BinauralTranslationRecordActivity.this.getPcmAudioPlayer().O00();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            BinauralTranslationRecordActivity.this.isPlaying = true;
            BinauralTranslationRecordActivity.this.getImg_record_play().setImageResource(R.drawable.ic_record_stop);
            BinauralTranslationRecordActivity.this.getPcmAudioPlayer().I0IIOi(BinauralTranslationRecordActivity.this.getSeekbar().getProgress());
            BinauralTranslationRecordActivity.this.getPcmAudioPlayer().m3121IO();
            tk1 pcmAudioPlayer = BinauralTranslationRecordActivity.this.getPcmAudioPlayer();
            final BinauralTranslationRecordActivity binauralTranslationRecordActivity = BinauralTranslationRecordActivity.this;
            pcmAudioPlayer.OIi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.IiiO1Xii
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BinauralTranslationRecordActivity.OXO1.XIi00iiXO(binauralTranslationRecordActivity, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (TextView) binauralTranslationRecordActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (ImageView) binauralTranslationRecordActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tk1 getPcmAudioPlayer() {
        return (tk1) this.pcmAudioPlayer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView img_record_play_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (ImageView) binauralTranslationRecordActivity.findViewById(R.id.img_record_play);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final BinauralTranslationRecordActivity binauralTranslationRecordActivity, View view) {
        if (binauralTranslationRecordActivity.isPlaying) {
            binauralTranslationRecordActivity.isPlaying = false;
            binauralTranslationRecordActivity.getImg_record_play().setImageResource(R.drawable.ic_record_play);
            binauralTranslationRecordActivity.getPcmAudioPlayer().O00();
        } else {
            binauralTranslationRecordActivity.isPlaying = true;
            binauralTranslationRecordActivity.getImg_record_play().setImageResource(R.drawable.ic_record_stop);
            binauralTranslationRecordActivity.getPcmAudioPlayer().I0IIOi(binauralTranslationRecordActivity.getSeekbar().getProgress());
            binauralTranslationRecordActivity.getPcmAudioPlayer().m3121IO();
            binauralTranslationRecordActivity.getPcmAudioPlayer().OIi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.IXIO
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return BinauralTranslationRecordActivity.initView$lambda$0$0(this.f2011IO, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity, int i) {
        binauralTranslationRecordActivity.getTv_currentTime().setText(binauralTranslationRecordActivity.updatePlayTime(i));
        binauralTranslationRecordActivity.getSeekbar().setProgress(i);
        if (binauralTranslationRecordActivity.getPcmAudioPlayer().XO0O10() == i) {
            binauralTranslationRecordActivity.isPlaying = false;
            binauralTranslationRecordActivity.getImg_record_play().setImageResource(R.drawable.ic_record_play);
            binauralTranslationRecordActivity.getTv_currentTime().setText(binauralTranslationRecordActivity.updatePlayTime(0));
            binauralTranslationRecordActivity.getSeekbar().setProgress(0);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tk1 pcmAudioPlayer_delegate$lambda$0() {
        return new tk1(VoiceManager.INSTANCE.getMPcmFile(), 0, 0, 0, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (RecyclerView) binauralTranslationRecordActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SeekBar seekbar_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (SeekBar) binauralTranslationRecordActivity.findViewById(R.id.seekbar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$1$0(final Ref.ObjectRef objectRef, final BinauralTranslationRecordActivity binauralTranslationRecordActivity, final File file, int i) {
        if (i == 1) {
            ClipboardUtils.copyText((CharSequence) objectRef.element);
            ToastUtils.showLong(R.string.copied);
        } else if (i == 2) {
            ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iO1X00
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return BinauralTranslationRecordActivity.showDeleteTipPopup$lambda$1$0$0(this.f2591IO, objectRef);
                }
            }, 30, null);
        } else if (i == 3) {
            go0 go0Var = new go0(binauralTranslationRecordActivity.getMContext(), 0, 2, null);
            go0Var.O1O(R.string.weather_del_file);
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.I0O1i0i
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BinauralTranslationRecordActivity.showDeleteTipPopup$lambda$1$0$1$0());
                }
            });
            go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.IiII1O
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BinauralTranslationRecordActivity.showDeleteTipPopup$lambda$1$0$1$1(file, binauralTranslationRecordActivity));
                }
            });
            go0Var.IIX1OXO();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showDeleteTipPopup$lambda$1$0$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity, Ref.ObjectRef objectRef) {
        binauralTranslationRecordActivity.exportTextToFile((String) objectRef.element);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$1$0$1$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeleteTipPopup$lambda$1$0$1$1(File file, BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        file.delete();
        I01XX0.XIi00iiXO(I01XX0.OXi001, null, 2, null);
        ToastUtils.showLong(R.string.delete_success);
        binauralTranslationRecordActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_currentTime_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (TextView) binauralTranslationRecordActivity.findViewById(R.id.tv_currentTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_totalTime_delegate$lambda$0(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
        return (TextView) binauralTranslationRecordActivity.findViewById(R.id.tv_totalTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String updatePlayTime(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 2));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String updateTimerText(long j) {
        String str = O0X11OiO.iX1O1().format(Long.valueOf(j));
        Intrinsics.XXI(str);
        return str;
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

    @aa1
    public final String getAudioTotalTime() {
        return this.audioTotalTime;
    }

    public final ImageView getImg_record_play() {
        return (ImageView) this.img_record_play$delegate.getValue();
    }

    public final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    public final SeekBar getSeekbar() {
        return (SeekBar) this.seekbar$delegate.getValue();
    }

    public final TextView getTv_currentTime() {
        return (TextView) this.tv_currentTime$delegate.getValue();
    }

    public final TextView getTv_totalTime() {
        return (TextView) this.tv_totalTime$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.AISpeech>");
        this.aiSpeechList = (ArrayList) mArg3;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setVisibility(0);
        getAbhTitleCenter().setText(getString(R.string.recording_details));
        getTv_currentTime().setText(updatePlayTime(0));
        this.audioTotalTime = updatePlayTime(getPcmAudioPlayer().XO0O10());
        getTv_totalTime().setText(this.audioTotalTime);
        getSeekbar().setMax(getPcmAudioPlayer().XO0O10());
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ai_answer_more_icon);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        this.mAdapter = new MultiItemTypeAdapter<AISpeech>(this, this.aiSpeechList) { // from class: com.sma.smartv3.otherdevice.charge.BinauralTranslationRecordActivity.initView.1

            /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.charge.BinauralTranslationRecordActivity$initView$1$OXO1 */
            public static final class OXO1 implements InterfaceC2572jc<AISpeech> {
                public final /* synthetic */ BinauralTranslationRecordActivity OXO1;

                public OXO1(BinauralTranslationRecordActivity binauralTranslationRecordActivity) {
                    this.OXO1 = binauralTranslationRecordActivity;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public boolean OXO1(AISpeech aISpeech, int i) {
                    return true;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                public int XIi00iiXO() {
                    return R.layout.item_binaural_record;
                }

                @Override // com.android.mltcode.paycertificationapi.InterfaceC2572jc
                /* JADX INFO: renamed from: XO0O10, reason: merged with bridge method [inline-methods] */
                public void mo2372iO(ViewHolder holder, AISpeech mAISpeech, int i) {
                    Intrinsics.X0O(holder, "holder");
                    Intrinsics.X0O(mAISpeech, "mAISpeech");
                    holder.setText(R.id.tv_original, mAISpeech.getText());
                    holder.setText(R.id.tv_time, this.OXO1.updateTimerText(mAISpeech.getStartTime()) + " - " + this.OXO1.updateTimerText(mAISpeech.getEndTime()));
                    TextView textView = (TextView) holder.getView(R.id.tv_translated);
                    textView.setText(mAISpeech.getDst());
                    textView.setVisibility(mAISpeech.getDst().length() > 0 ? 0 : 8);
                }
            }

            {
                addItemViewDelegate(0, new OXO1(this));
            }
        };
        getRv().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView rv = getRv();
        MultiItemTypeAdapter<AISpeech> multiItemTypeAdapter = this.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
            multiItemTypeAdapter = null;
        }
        rv.setAdapter(multiItemTypeAdapter);
        getImg_record_play().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OI1XOX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BinauralTranslationRecordActivity.initView$lambda$0(this.f2931IO, view);
            }
        });
        getSeekbar().setOnSeekBarChangeListener(new OXO1());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_binaural_translation_record;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getPcmAudioPlayer().OIX0iXi();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.String] */
    public final void showDeleteTipPopup() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        String str = O0X11OiO.XO0O10().format(Long.valueOf(this.aiSpeechList.get(0).getStartTime()));
        ArrayList<AISpeech> arrayList = this.aiSpeechList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(arrayList, 10));
        for (AISpeech aISpeech : arrayList) {
            objectRef.element = objectRef.element + aISpeech.getText() + "\n" + aISpeech.getDst() + "\n";
            arrayList2.add(Unit.OXO1);
        }
        if (this.mTranslationDetailPopup == null) {
            final File mPcmFile = VoiceManager.INSTANCE.getMPcmFile();
            r16 r16Var = new r16(getMContext());
            r16Var.iXiX011(getString(R.string.action_details) + ": " + this.audioTotalTime);
            r16Var.XXO(getString(R.string.file_size_title_tip) + ": " + FileUtils.getSize(mPcmFile));
            r16Var.Ii1iii0(getString(R.string.number_of_words) + ": " + ((String) objectRef.element).length());
            r16Var.O001I(getString(R.string.create_time_tip) + ": " + ((Object) str));
            r16Var.iXiiiO(new Function1() { // from class: com.android.mltcode.paycertificationapi.X00XI00
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(BinauralTranslationRecordActivity.showDeleteTipPopup$lambda$1$0(objectRef, this, mPcmFile, ((Integer) obj).intValue()));
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
