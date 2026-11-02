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
import com.android.mltcode.paycertificationapi.I01OII;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0O1i0i;
import com.android.mltcode.paycertificationapi.I0i1Xi;
import com.android.mltcode.paycertificationapi.I1iX011;
import com.android.mltcode.paycertificationapi.IXIO;
import com.android.mltcode.paycertificationapi.IiII1O;
import com.android.mltcode.paycertificationapi.IiO11IOO;
import com.android.mltcode.paycertificationapi.IiiO1Xii;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iO1X00;
import com.android.mltcode.paycertificationapi.OI1XOX;
import com.android.mltcode.paycertificationapi.X00XI00;
import com.android.mltcode.paycertificationapi.XIO1100;
import com.android.mltcode.paycertificationapi.XXIi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.hn1;
import com.android.mltcode.paycertificationapi.i110OIi;
import com.android.mltcode.paycertificationapi.i11OO;
import com.android.mltcode.paycertificationapi.r16;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tk1;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.io.Location;
import com.blankj.utilcode.util.ClipboardUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.biz.voice.VoiceManager;
import com.sma.smartv3.model.AISpeech;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nBinauralTranslationRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1563#2:282\n1634#2,3:283\n*S KotlinDebug\n*F\n+ 1 BinauralTranslationRecordActivity.kt\ncom/sma/smartv3/otherdevice/charge/BinauralTranslationRecordActivity\n*L\n199#1:282\n199#1:283,3\n*E\n"})
public final class BinauralTranslationRecordActivity extends BaseActivity {

    @aa1
    private final String TAG;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private ArrayList<AISpeech> aiSpeechList;

    @aa1
    private String audioTotalTime;

    @aa1
    private final Lazy img_record_play$delegate;
    private boolean isPlaying;
    private MultiItemTypeAdapter<AISpeech> mAdapter;

    @aa1
    private Handler mHandler;

    @tb1
    private r16 mTranslationDetailPopup;

    @aa1
    private final Lazy pcmAudioPlayer$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy seekbar$delegate;

    @aa1
    private final Lazy tv_currentTime$delegate;

    @aa1
    private final Lazy tv_totalTime$delegate;

    public static final class OXO1 implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ BinauralTranslationRecordActivity OXO1;

        public OXO1(BinauralTranslationRecordActivity r1) {
            this.OXO1 = r1;
        }

        public static /* synthetic */ Unit OXO1(BinauralTranslationRecordActivity r0, int r1) {
            return XIi00iiXO(r0, r1);
        }

        public static final Unit XIi00iiXO(BinauralTranslationRecordActivity r2, int r3) {
            r2.getTv_currentTime().setText(BinauralTranslationRecordActivity.access$updatePlayTime(r2, r3));
            r2.getSeekbar().setProgress(r3);
            if (BinauralTranslationRecordActivity.access$getPcmAudioPlayer(r2).XO0O10() != r3) goto L6;
            BinauralTranslationRecordActivity.access$setPlaying$p(r2, false);
            r2.getImg_record_play().setImageResource(R.drawable.ic_record_play);
            r2.getTv_currentTime().setText(BinauralTranslationRecordActivity.access$updatePlayTime(r2, 0));
            r2.getSeekbar().setProgress(0);
        L6:
            return Unit.OXO1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar r1, int r2, boolean r3) {
            if (r3 == false) goto L5;
            this.OXO1.getTv_currentTime().setText(BinauralTranslationRecordActivity.access$updatePlayTime(this.OXO1, r2));
            return;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar r2) {
            BinauralTranslationRecordActivity.access$setPlaying$p(this.OXO1, false);
            this.OXO1.getImg_record_play().setImageResource(R.drawable.ic_record_play);
            BinauralTranslationRecordActivity.access$getPcmAudioPlayer(this.OXO1).O00();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar r3) {
            BinauralTranslationRecordActivity.access$setPlaying$p(this.OXO1, true);
            this.OXO1.getImg_record_play().setImageResource(R.drawable.ic_record_stop);
            BinauralTranslationRecordActivity.access$getPcmAudioPlayer(this.OXO1).I0IIOi(this.OXO1.getSeekbar().getProgress());
            BinauralTranslationRecordActivity.access$getPcmAudioPlayer(this.OXO1).IO();
            tk1 r4 = BinauralTranslationRecordActivity.access$getPcmAudioPlayer(this.OXO1);
            final BinauralTranslationRecordActivity r0 = this.OXO1;
            r4.OIi0(new IiiO1Xii(r0));
        }
    }

    public BinauralTranslationRecordActivity() {
        this.TAG = "BinauralTranslationRecordActivity";
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new I1iX011(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new XIO1100(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new I01OII(this));
        this.img_record_play$delegate = LazyKt__LazyJVMKt.iO(new i110OIi(this));
        this.tv_currentTime$delegate = LazyKt__LazyJVMKt.iO(new I0i1Xi(this));
        this.seekbar$delegate = LazyKt__LazyJVMKt.iO(new i11OO(this));
        this.tv_totalTime$delegate = LazyKt__LazyJVMKt.iO(new IiO11IOO(this));
        this.aiSpeechList = new ArrayList();
        this.mHandler = new Handler(Looper.getMainLooper());
        this.pcmAudioPlayer$delegate = LazyKt__LazyJVMKt.iO(new XXIi());
        this.audioTotalTime = "";
    }

    public static /* synthetic */ void I0iXXO(BinauralTranslationRecordActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ SeekBar I1XOi1(BinauralTranslationRecordActivity r0) {
        return seekbar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean IIX1OXO(Ref.ObjectRef r0, BinauralTranslationRecordActivity r1, File r2, int r3) {
        return showDeleteTipPopup$lambda$1$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextView O10IXXX0X(BinauralTranslationRecordActivity r0) {
        return tv_totalTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ tk1 OII() {
        return pcmAudioPlayer_delegate$lambda$0();
    }

    public static /* synthetic */ boolean OIX0iXi(File r0, BinauralTranslationRecordActivity r1) {
        return showDeleteTipPopup$lambda$1$0$1$1(r0, r1);
    }

    public static /* synthetic */ ImageView OiIIX101O(BinauralTranslationRecordActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X0O(BinauralTranslationRecordActivity r0, Ref.ObjectRef r1) {
        return showDeleteTipPopup$lambda$1$0$0(r0, r1);
    }

    public static /* synthetic */ ImageView X1ii(BinauralTranslationRecordActivity r0) {
        return img_record_play_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XX0(BinauralTranslationRecordActivity r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(BinauralTranslationRecordActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(BinauralTranslationRecordActivity r0) {
        return tv_currentTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIii1(BinauralTranslationRecordActivity r0, int r1) {
        return initView$lambda$0$0(r0, r1);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ tk1 access$getPcmAudioPlayer(BinauralTranslationRecordActivity r0) {
        return r0.getPcmAudioPlayer();
    }

    public static final /* synthetic */ void access$setPlaying$p(BinauralTranslationRecordActivity r0, boolean r1) {
        r0.isPlaying = r1;
    }

    public static final /* synthetic */ String access$updatePlayTime(BinauralTranslationRecordActivity r0, int r1) {
        return r0.updatePlayTime(r1);
    }

    public static final /* synthetic */ String access$updateTimerText(BinauralTranslationRecordActivity r0, long r1) {
        return r0.updateTimerText(r1);
    }

    private final tk1 getPcmAudioPlayer() {
        return (tk1) getValue();
    }

    public static /* synthetic */ boolean iIiiO() {
        return showDeleteTipPopup$lambda$1$0$1$0();
    }

    private static final ImageView img_record_play_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (ImageView) r1.findViewById(R.id.img_record_play);
    }

    private static final void initView$lambda$0(final BinauralTranslationRecordActivity r1, View r2) {
        if (r1.isPlaying == true) goto L6;
        r1.isPlaying = true;
        r1.getImg_record_play().setImageResource(R.drawable.ic_record_stop);
        r1.getPcmAudioPlayer().I0IIOi(r1.getSeekbar().getProgress());
        r1.getPcmAudioPlayer().IO();
        r1.getPcmAudioPlayer().OIi0(new IXIO(r1));
        return;
    L6:
        r1.isPlaying = false;
        r1.getImg_record_play().setImageResource(R.drawable.ic_record_play);
        r1.getPcmAudioPlayer().O00();
    }

    private static final Unit initView$lambda$0$0(BinauralTranslationRecordActivity r2, int r3) {
        r2.getTv_currentTime().setText(r2.updatePlayTime(r3));
        r2.getSeekbar().setProgress(r3);
        if (r2.getPcmAudioPlayer().XO0O10() != r3) goto L6;
        r2.isPlaying = false;
        r2.getImg_record_play().setImageResource(R.drawable.ic_record_play);
        r2.getTv_currentTime().setText(r2.updatePlayTime(0));
        r2.getSeekbar().setProgress(0);
    L6:
        return Unit.OXO1;
    }

    private static final tk1 pcmAudioPlayer_delegate$lambda$0() {
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        return new tk1(VoiceManager.INSTANCE.getMPcmFile(), r2, r3, r4, 14, null);
    }

    private static final RecyclerView rv_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private static final SeekBar seekbar_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (SeekBar) r1.findViewById(R.id.seekbar);
    }

    private static final boolean showDeleteTipPopup$lambda$1$0(final Ref.ObjectRef r9, final BinauralTranslationRecordActivity r10, final File r11, int r12) {
        if (r12 == 1) goto L11;
        int r1 = 2;
        if (r12 != 2) goto L7;
        ThreadsKt.iO(true, false, null, null, 0, new O0iO1X00(r10, r9), 30, null);
    L12:
        return true;
    L7:
        if (r12 != 3) goto L12;
        go0 r13 = new go0(r10.getMContext(), 0, r1, null);
        r13.O1O(R.string.weather_del_file);
        r13.iX1O1(Integer.valueOf(R.string.cancel), new I0O1i0i());
        r13.X1IX(R.string.delete, new IiII1O(r11, r10));
        r13.IIX1OXO();
        goto L12
    L11:
        ClipboardUtils.copyText((CharSequence) r9.element);
        ToastUtils.showLong(R.string.copied);
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit showDeleteTipPopup$lambda$1$0$0(BinauralTranslationRecordActivity r0, Ref.ObjectRef r1) {
        r0.exportTextToFile((String) r1.element);
        return Unit.OXO1;
    }

    private static final boolean showDeleteTipPopup$lambda$1$0$1$0() {
        return true;
    }

    private static final boolean showDeleteTipPopup$lambda$1$0$1$1(File r2, BinauralTranslationRecordActivity r3) {
        r2.delete();
        I01XX0.XIi00iiXO(I01XX0.OXi001, null, 2, null);
        ToastUtils.showLong(R.string.delete_success);
        r3.finish();
        return true;
    }

    private static final TextView tv_currentTime_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_currentTime);
    }

    private static final TextView tv_totalTime_delegate$lambda$0(BinauralTranslationRecordActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_totalTime);
    }

    private final String updatePlayTime(int r3) {
        int r0 = (r3 % 3600) / 60;
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r4 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(r0), Integer.valueOf(r3 % 60)}, 2));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        return r4;
    }

    private final String updateTimerText(long r2) {
        String r3 = O0X11OiO.iX1O1().format(Long.valueOf(r2));
        Intrinsics.XXI(r3);
        return r3;
    }

    public final void exportTextToFile(@aa1 String r6) {
        Intrinsics.X0O(r6, "textToExport");
        sz0 r1 = sz0.OXO1;
        File r2 = r1.OXO1(Location.EXTERNAL, hn1.XIi00iiXO.O00().XIi00iiXO("share"), "record_text.txt");
    L6:
        e = move-exception;
        e.printStackTrace();
        return;
    L4:
        if (r2.exists() == false) goto L8;
        r2.delete();     // Catch: Exception -> L6
    L8:
        FileUtils.createOrExistsFile(r2);     // Catch: Exception -> L6
        FileWriter r3 = new FileWriter(r2);     // Catch: Exception -> L6
        r3.write(r6);     // Catch: Exception -> L6
        r3.close();     // Catch: Exception -> L6
        Uri r7 = r1.XO0O10(r2);     // Catch: Exception -> L6
        Intent r4 = new Intent("android.intent.action.SEND");     // Catch: Exception -> L6
        r4.putExtra("android.intent.extra.TEXT", "Share txt");     // Catch: Exception -> L6
        r4.putExtra("android.intent.extra.STREAM", r7);     // Catch: Exception -> L6
        r4.setType("*/*");     // Catch: Exception -> L6
        r4.addFlags(268435456);     // Catch: Exception -> L6
        startActivity(Intent.createChooser(r4, "Share txt"));     // Catch: Exception -> L6
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final String getAudioTotalTime() {
        return this.audioTotalTime;
    }

    public final ImageView getImg_record_play() {
        return (ImageView) getValue();
    }

    public final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    public final SeekBar getSeekbar() {
        return (SeekBar) getValue();
    }

    public final TextView getTv_currentTime() {
        return (TextView) getValue();
    }

    public final TextView getTv_totalTime() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Serializable r3 = getMArg3();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.AISpeech>");
        this.aiSpeechList = (ArrayList) r3;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
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
        final ArrayList<AISpeech> r0 = this.aiSpeechList;
        this.mAdapter = new AnonymousClass1(this, r0);
        getRv().setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView r1 = getRv();
        MultiItemTypeAdapter<AISpeech> r2 = this.mAdapter;
        if (r2 != null) goto L5;
        Intrinsics.XXO("mAdapter");
        r2 = null;
    L5:
        r1.setAdapter(r2);
        getImg_record_play().setOnClickListener(new OI1XOX(this));
        getSeekbar().setOnSeekBarChangeListener(new OXO1(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_binaural_translation_record;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getPcmAudioPlayer().OIX0iXi();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.String] */
    public final void showDeleteTipPopup() {
        final Ref.ObjectRef r0 = new Ref.ObjectRef();
        r0.element = "";
        String r1 = O0X11OiO.XO0O10().format(Long.valueOf(this.aiSpeechList.get(0).getStartTime()));
        ArrayList<AISpeech> r2 = this.aiSpeechList;
        ArrayList r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r2, 10));
        Iterator<T> r4 = r2.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        AISpeech r5 = (AISpeech) r4.next();
        r0.element = r0.element + r5.getText() + "\n" + r5.getDst() + "\n";
        r3.add(Unit.OXO1);
        goto L4
    L7:
        if (this.mTranslationDetailPopup != null) goto L9;
        final File r6 = VoiceManager.INSTANCE.getMPcmFile();
        r16 r7 = new r16(getMContext());
        r7.iXiX011(getString(R.string.action_details) + ": " + this.audioTotalTime);
        r7.XXO(getString(R.string.file_size_title_tip) + ": " + FileUtils.getSize(r6));
        r7.Ii1iii0(getString(R.string.number_of_words) + ": " + ((String) r0.element).length());
        r7.O001I(getString(R.string.create_time_tip) + ": " + r1);
        r7.iXiiiO(new X00XI00(r0, this, r6));
        this.mTranslationDetailPopup = r7;
    L9:
        r16 r8 = this.mTranslationDetailPopup;
        if (r8 == null) goto L14;
        r8.IIX1OXO();
        return;
    }
}
