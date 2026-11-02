package com.sma.smartv3.biz.voice;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0Oi0IOI;
import com.android.mltcode.paycertificationapi.IO1100;
import com.android.mltcode.paycertificationapi.IOI11I11O;
import com.android.mltcode.paycertificationapi.O100II00I;
import com.android.mltcode.paycertificationapi.OIIOXOi;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.OXi0X0O;
import com.android.mltcode.paycertificationapi.X0OiOO00i;
import com.android.mltcode.paycertificationapi.XO01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iOIXI1;
import com.android.mltcode.paycertificationapi.iiI1XOOI;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import com.facebook.share.internal.ShareConstants;
import com.iflytek.sparkchain.core.tts.OnlineTTS;
import com.iflytek.sparkchain.utils.constants.ErrorCode;
import com.ironsource.C3164n2;
import com.ironsource.Y5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.network.GetAITextToAudio;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.MicrosoftSDKManage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDcsTtsPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,623:1\n1#2:624\n11561#3:625\n11896#3,3:626\n1869#4,2:629\n1563#4:631\n1634#4,3:632\n*S KotlinDebug\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n*L\n424#1:625\n424#1:626,3\n503#1:629,2\n483#1:631\n483#1:632,3\n*E\n"})
public final class DcsTtsPlayer {

    @aa1
    public static final DcsTtsPlayer INSTANCE = null;

    @aa1
    private static final String OPENAI_TTS_URL = null;

    @aa1
    private static final String TAG = null;

    @aa1
    private static final File directoryFile = null;
    private static boolean isInitSegmentation;
    private static boolean isPlayEnd;
    private static boolean isReplayMusic;
    private static boolean isSegmentation;
    private static boolean isTTSEnd;
    private static int mLastLength;

    @tb1
    private static MediaPlayer mMediaPlayer;
    private static int mSegmentationIndex;

    @aa1
    private static final ArrayList<String> mSegmentationTextList = null;

    @aa1
    private static final File mTtsFile = null;

    @aa1
    private static final File mTtsFilePcm = null;
    private static final List<File> segmentationFileList = null;

    @tb1
    private static OnlineTTS sparkChainTts;
    private static int textListIndex;

    static {
        INSTANCE = new DcsTtsPlayer();
        TAG = "DcsTtsPlayer";
        OPENAI_TTS_URL = "https://api.openai.com/v1/audio/speech";
        sz0 r1 = sz0.OXO1;
        mTtsFile = new File(uz0.I0iXXO(r1), "ai_tts.mp3");
        mTtsFilePcm = new File(uz0.I0iXXO(r1), "ai_tts.pcm");
        directoryFile = new File(PathUtils.getExternalAppDataPath() + "/files/save_video");
        mSegmentationTextList = new ArrayList();
        segmentationFileList = Collections.synchronizedList(new ArrayList());
        isTTSEnd = true;
        isPlayEnd = true;
    }

    private DcsTtsPlayer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void AISparkChainPlay$default(DcsTtsPlayer r0, String r1, Function1 r2, String r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = "x4_lingxiaolu_en";
    L8:
        r0.AISparkChainPlay(r1, r2, r3);
    }

    private static final Unit AISparkChainPlay$lambda$0(final String r9, String r10, final File r11, final Function1 r12) {
        isTTSEnd = false;
        if (sparkChainTts != null) goto L5;
        sparkChainTts = new OnlineTTS(r9);
    L5:
        String r2 = "x4_lingxiaolu_en";
        if (Intrinsics.XOO0ii0(r9, "x4_lingxiaoying_assist") == false) goto L8;
    L11:
        OnlineTTS r1 = sparkChainTts;
        if (r1 == null) goto L14;
        r1.vcn(r2);
    L14:
        i1O0OXO1O r3 = i1O0OXO1O.OXO1;
        String r4 = TAG;
        int r5 = mSegmentationIndex;
        List<File> r6 = segmentationFileList;
        r3.OXO1(r4 + " AISparkChainPlay  pronounist = " + r2 + " , mSegmentationIndex = " + r5 + " tmpText = " + r10 + "  list.size = " + r6.size());
        OnlineTTS r7 = sparkChainTts;
        if (r7 == null) goto L17;
        r7.registerCallbacks(new DcsTtsPlayer$AISparkChainPlay$1$1(r11, r12, r9));
    L17:
        OnlineTTS r13 = sparkChainTts;
        if (r13 == null) goto L20;
        r13.aue("lame");
    L20:
        OnlineTTS r14 = sparkChainTts;
        if (r14 == null) goto L23;
        r14.sfl(1);
    L23:
        OnlineTTS r15 = sparkChainTts;
        if (r15 == null) goto L26;
        r15.pitch(50);
    L26:
        OnlineTTS r16 = sparkChainTts;
        if (r16 == null) goto L29;
        r16.speed(50);
    L29:
        OnlineTTS r17 = sparkChainTts;
        if (r17 == null) goto L32;
        r17.bgs(0);
    L32:
        OnlineTTS r18 = sparkChainTts;
        if (r18 == null) goto L35;
        Integer r19 = Integer.valueOf(r18.aRun(r10, r11.getName()));
    L36:
        if (r19 != null) goto L39;
    L41:
        r3.OXO1(r4 + " AISparkChainPlay  ret = " + r19 + "  -->");
        return Unit.OXO1;
    L39:
        if (18311 != r19.intValue()) goto L41;
        r6.remove(r6.size() - 1);
        goto L41
    L35:
        r19 = null;
        goto L36
    L8:
        if (Intrinsics.XOO0ii0(r9, "x4_lingxiaolu_en") == true) goto L11;
        r2 = r9;
        goto L11
    }

    public static /* synthetic */ boolean I0IIOi(Function1 r0, MediaPlayer r1, int r2, int r3) {
        return playUri$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ void IO(Function1 r0, MediaPlayer r1) {
        playUri$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit IiI10X(String r0, String r1, File r2, Function1 r3) {
        return AISparkChainPlay$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ void O00(MediaPlayer r0) {
        playUri$lambda$2(r0);
    }

    public static /* synthetic */ void OIi0(boolean r0, Uri r1, Function1 r2, MediaPlayer r3) {
        playAssetsFile$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ boolean OXO1(Function1 r0, MediaPlayer r1, int r2, int r3) {
        return playAssetsFile$lambda$1(r0, r1, r2, r3);
    }

    public static /* synthetic */ Unit XIi00iiXO(Function1 r0, boolean r1) {
        return playOld$lambda$0(r0, r1);
    }

    public static /* synthetic */ void XO0O10(MediaPlayer r0) {
        playAssetsFile$lambda$2(r0);
    }

    public static /* synthetic */ Unit XOO0ii0(Function1 r0, boolean r1) {
        return playNew$lambda$0(r0, r1);
    }

    public static final /* synthetic */ int access$getMSegmentationIndex$p() {
        return mSegmentationIndex;
    }

    public static final /* synthetic */ ArrayList access$getMSegmentationTextList$p() {
        return mSegmentationTextList;
    }

    public static final /* synthetic */ String access$getOPENAI_TTS_URL$p() {
        return OPENAI_TTS_URL;
    }

    public static final /* synthetic */ List access$getSegmentationFileList$p() {
        return segmentationFileList;
    }

    public static final /* synthetic */ String access$getTAG$p() {
        return TAG;
    }

    public static final /* synthetic */ int access$getTextListIndex$p() {
        return textListIndex;
    }

    public static final /* synthetic */ boolean access$isPlayEnd$p() {
        return isPlayEnd;
    }

    public static final /* synthetic */ void access$setMSegmentationIndex$p(int r0) {
        mSegmentationIndex = r0;
    }

    public static final /* synthetic */ void access$setTTSEnd$p(boolean r0) {
        isTTSEnd = r0;
    }

    public static final /* synthetic */ void access$setTextListIndex$p(int r0) {
        textListIndex = r0;
    }

    private final void downloadAiTtsV2(String r5, final Function1<? super Boolean, Unit> r6) {
        String r0 = AIManager.OIX0iXi(AIManager.OXO1, 0, 1, null);
        i1O0OXO1O.OXO1.OXO1(TAG + " downloadOpenAiTtsV2 ->  " + r0 + "  " + r5);
        final String r7 = NetWorkUtils.INSTANCE.getBaseUrl(GetAITextToAudio.URL) + "?model=" + r0 + "&text=" + r5;
        ThreadUtils.executeByIo(new AnonymousClass1(r7, r6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadAiTtsV2$default(DcsTtsPlayer r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.downloadAiTtsV2(r1, r2);
    }

    private final void downloadOpenAiTts(final String r4, final Function1<? super Boolean, Unit> r5) {
        i1O0OXO1O.OXO1.OXO1(TAG + " downloadOpenAiTts -> " + r4);
        ThreadUtils.executeByIo(new C33941(r4, r5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadOpenAiTts$default(DcsTtsPlayer r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.downloadOpenAiTts(r1, r2);
    }

    @Deprecated(message = "")
    private static /* synthetic */ void getMSegmentationTextList$annotations() {
    }

    public static /* synthetic */ Unit iO() {
        return saveSegmentationFileMusic$lambda$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(DcsTtsPlayer r7, String r8, boolean r9, boolean r10, Function1 r11, String r12, String r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        r9 = q62.OXO1.iO10O1();
    L5:
        boolean r2 = r9;
        if ((r14 & 4) == 0) goto L8;
        r10 = false;
    L8:
        boolean r3 = r10;
        if ((r14 & 8) == 0) goto L11;
        r11 = null;
    L11:
        Function1 r4 = r11;
        if ((r14 & 16) == 0) goto L14;
        r12 = "x4_lingxiaolu_en";
    L14:
        String r5 = r12;
        if ((r14 & 32) == 0) goto L17;
        r13 = "tag";
    L17:
        r7.play(r8, r2, r3, r4, r5, r13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playAssetsFile$default(DcsTtsPlayer r0, String r1, boolean r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        r0.playAssetsFile(r1, r2, r3);
    }

    private static final void playAssetsFile$lambda$0(boolean r1, Uri r2, Function1 r3, MediaPlayer r4) {
        Intrinsics.X0O(r4, CampaignEx.JSON_KEY_AD_MP);
        if (r1 == false) goto L6;
        r4.reset();
        r4.setDataSource(Utils.getApp(), r2);
        r4.prepare();
        r4.start();
        return;
    L6:
        INSTANCE.clearSegmentation();
        if (r3 == null) goto L10;
        Unit r5 = (Unit) r3.invoke(Boolean.TRUE);
        return;
    }

    private static final boolean playAssetsFile$lambda$1(Function1 r1, MediaPlayer r2, int r3, int r4) {
        i1O0OXO1O.OXO1.OXO1(TAG + " playAssetsFile error " + r3);
        if (r1 == null) goto L5;
        Unit r5 = (Unit) r1.invoke(Boolean.FALSE);
    L5:
        INSTANCE.clearSegmentation();
        return true;
    }

    private static final void playAssetsFile$lambda$2(MediaPlayer r0) {
        MediaPlayer r1 = mMediaPlayer;
        if (r1 == null) goto L6;
        r1.start();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playNew$default(DcsTtsPlayer r0, String r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.playNew(r1, r2);
    }

    private static final Unit playNew$lambda$0(Function1 r2, boolean r3) {
        if (r3 == false) goto L6;
        DcsTtsPlayer r4 = INSTANCE;
        Uri r5 = UriUtils.file2Uri(mTtsFile);
        Intrinsics.O10IXXX0X(r5, "file2Uri(...)");
        playUri$default(r4, r5, null, 2, null);
        return Unit.OXO1;
    L6:
        if (r2 != null) goto L8;
        return null;
    L8:
        return (Unit) r2.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playOld$default(DcsTtsPlayer r0, String r1, boolean r2, Function1 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = q62.OXO1.iO10O1();
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        r0.playOld(r1, r2, r3);
    }

    private static final Unit playOld$lambda$0(Function1 r2, boolean r3) {
        if (r3 == false) goto L6;
        DcsTtsPlayer r4 = INSTANCE;
        Uri r5 = UriUtils.file2Uri(mTtsFile);
        Intrinsics.O10IXXX0X(r5, "file2Uri(...)");
        playUri$default(r4, r5, null, 2, null);
        return Unit.OXO1;
    L6:
        if (r2 != null) goto L8;
        return null;
    L8:
        return (Unit) r2.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playUri$default(DcsTtsPlayer r0, Uri r1, Function1 r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.playUri(r1, r2);
    }

    private static final void playUri$lambda$0(Function1 r8, MediaPlayer r9) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        String r1 = TAG;
        int r2 = mSegmentationIndex;
        List<File> r3 = segmentationFileList;
        r0.OXO1(r1 + " play complete   mSegmentationIndex = " + r2 + "   segmentationFileList = " + r3.size());
        if (q62.OXO1.OIXOOi() == false) goto L29;
        if (mSegmentationIndex < r3.size()) goto L43;
        isPlayEnd = true;
        if (isReplayMusic == false) goto L9;
        isReplayMusic = false;
    L10:
        if (r8 == null) goto L12;
        Unit r10 = (Unit) r8.invoke(Boolean.TRUE);
    L12:
        I01XX0.OXO1(I01XX0.XXOXi, C3164n2.v);
        return;
    L9:
        INSTANCE.saveSegmentationFileMusic();
        goto L10
    L43:
    L27:
        DcsTtsPlayer r11 = INSTANCE;
        r11.stop();
        r11.initSegmentation();
        Unit r12 = Unit.OXO1;
        return;
    L15:
        if (mSegmentationIndex < r3.size()) goto L17;
    L22:
        INSTANCE.clearSegmentation();     // Catch: Exception -> L27
        if (r8 == null) goto L25;
        Unit r13 = (Unit) r8.invoke(Boolean.TRUE);     // Catch: Exception -> L27
    L25:
        I01XX0.OXO1(I01XX0.XXOXi, C3164n2.v);     // Catch: Exception -> L27
        Unit r14 = Unit.OXO1;     // Catch: Exception -> L27
        return;
    L17:
        if (r3.get(mSegmentationIndex) == null) goto L22;
        if (UriUtils.file2Uri(r3.get(mSegmentationIndex)) == null) goto L22;
        r9.reset();     // Catch: Exception -> L27
        r0.OXO1(r1 + " AISparkChainPlay    mSegmentationIndex = " + mSegmentationIndex + "   segmentationFileList.size = " + r3.size() + " ");     // Catch: Exception -> L27
        r9.setDataSource(Utils.getApp(), UriUtils.file2Uri(r3.get(mSegmentationIndex)));     // Catch: Exception -> L27
        r9.prepare();     // Catch: Exception -> L27
        r9.start();     // Catch: Exception -> L27
        mSegmentationIndex = mSegmentationIndex + 1;     // Catch: Exception -> L27
        return;
    L29:
        if (isSegmentation == false) goto L39;
        mSegmentationIndex++;
        ArrayList<String> r4 = mSegmentationTextList;
        if (r4.size() > mSegmentationIndex) goto L37;
        INSTANCE.clearSegmentation();
        if (r8 == null) goto L35;
        Unit r15 = (Unit) r8.invoke(Boolean.TRUE);
    L35:
        I01XX0.OXO1(I01XX0.XXOXi, C3164n2.v);
        return;
    L37:
        r9.reset();
        Application r16 = Utils.getApp();
        DcsTtsPlayer r5 = INSTANCE;
        String r6 = r4.get(mSegmentationIndex);
        Intrinsics.O10IXXX0X(r6, "get(...)");
        r9.setDataSource(r16, r5.getDirectConnectionUri(r6));
        r9.prepare();
        r9.start();
        return;
    L39:
        I01XX0.OXO1(I01XX0.XXOXi, C3164n2.v);
        if (r8 == null) goto L45;
        Unit r17 = (Unit) r8.invoke(Boolean.TRUE);
        return;
    }

    private static final boolean playUri$lambda$1(Function1 r1, MediaPlayer r2, int r3, int r4) {
        i1O0OXO1O.OXO1.OXO1(TAG + " play error " + r3);
        if (r1 == null) goto L5;
        Unit r5 = (Unit) r1.invoke(Boolean.FALSE);
    L5:
        INSTANCE.clearSegmentation();
        return true;
    }

    private static final void playUri$lambda$2(MediaPlayer r0) {
        MediaPlayer r1 = mMediaPlayer;
        if (r1 == null) goto L6;
        r1.start();
        return;
    }

    private final void saveSegmentationFileMusic() {
        i1O0OXO1O.OXO1.OXO1(TAG + " saveSegmentationFileMusic");
        List<File> r0 = segmentationFileList;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.size() <= 0) goto L9;
        ThreadsKt.iO(false, false, null, null, 0, new OXi0X0O(), 31, null);
        return;
    }

    private static final Unit saveSegmentationFileMusic$lambda$0() {
        File r0 = directoryFile;
        if (r0.exists() == true) goto L5;
        FileUtils.createOrExistsDir(r0);
    L5:
        List<File> r1 = segmentationFileList;
        ArrayList r2 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r1, 10));
        Iterator<T> r3 = r1.iterator();
    L7:
        if (r3.hasNext() == false) goto L10;
        boolean r4 = FileUtils.copy((File) r3.next(), new File(PathUtils.getExternalAppDataPath() + "/files/save_video/record_" + System.currentTimeMillis() + ".mp3"));
        i1O0OXO1O.OXO1.OXO1(TAG + " saveSegmentationFileMusic b = " + r4);
        r2.add(Unit.OXO1);
        goto L7
    L10:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void segmentationText$default(DcsTtsPlayer r0, String r1, Function1 r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 400;
    L8:
        r0.segmentationText(r1, r2, r3);
    }

    public static /* synthetic */ void setVolume$default(DcsTtsPlayer r1, float r2, float r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 1.0f;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 1.0f;
    L8:
        r1.setVolume(r2, r3);
    }

    public final void AISparkChainPlay(@aa1 final String r11, @tb1 final Function1<? super Boolean, Unit> r12, @aa1 final String r13) {
        Intrinsics.X0O(r11, "tmpText");
        Intrinsics.X0O(r13, "pronounist");
        if (AISparkChainManager.OXO1.IO0iXO0O() == 0) goto L5;
        return;
    L5:
        final File r0 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + ".mp3");
        if (isInitSegmentation == true) goto L8;
        segmentationFileList.add(r0);
    L8:
        ThreadsKt.iO(true, false, null, null, 0, new IO1100(r13, r11, r0, r12), 30, null);
    }

    public final void clearSegmentation() {
        if (isSegmentation == false) goto L6;
        isSegmentation = false;
        initSegmentation();
        return;
    }

    public final void deleteReplayMusic() {
        File r0 = mTtsFile;
        if (r0.exists() == false) goto L5;
        r0.delete();
    L5:
        File r1 = mTtsFilePcm;
        if (r1.exists() == false) goto L9;
        r1.delete();
    L9:
        if (q62.OXO1.OIXOOi() == false) goto L20;
        File[] r2 = directoryFile.listFiles();
        if (r2 == null) goto L22;
        int r3 = 0;
        if (r2.length != 0) goto L15;
        boolean r4 = true;
    L16:
        if (r4 == true) goto L23;
        ArrayList r5 = new ArrayList(r2.length);
        int r6 = r2.length;
    L18:
        if (r3 >= r6) goto L24;
        r5.add(Boolean.valueOf(r2[r3].delete()));
        r3 = r3 + 1;
        goto L18
    L24:
        return;
    L23:
        return;
    L15:
        r4 = false;
        goto L16
    L22:
        return;
    }

    @aa1
    public final Uri getAssetFileUri(@aa1 Context r5, @aa1 String r6) {
        Intrinsics.X0O(r5, "context");
        Intrinsics.X0O(r6, Y5.c.b);
        AssetManager r0 = r5.getAssets();
        File r1 = new File(r5.getCacheDir(), r6);
        InputStream r7 = r0.open(r6);     // Catch: Exception -> L9
        Intrinsics.O10IXXX0X(r7, "open(...)");     // Catch: Exception -> L9
        if (r1.exists() == true) goto L14;
        FileOutputStream r8 = new FileOutputStream(r1);     // Catch: Exception -> L9
        byte[] r2 = new byte[1024];     // Catch: Exception -> L9
    L6:
        int r3 = r7.read(r2);     // Catch: Exception -> L9
        if (r3 == (-1)) goto L11;
        r8.write(r2, 0, r3);     // Catch: Exception -> L9
        goto L6
    L11:
        r7.close();     // Catch: Exception -> L9
        r8.close();     // Catch: Exception -> L9
    L14:
        Uri r9 = Uri.fromFile(r1);
        Intrinsics.O10IXXX0X(r9, "fromFile(...)");
        return r9;
    L9:
        e = move-exception;
        e.printStackTrace();
        goto L14
    }

    @aa1
    public final Uri getDirectConnectionUri(@aa1 String r5) {
        Intrinsics.X0O(r5, "content");
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r1 = String.format("https://tts.baidu.com/text2audio?tex=%s&ctp=1&cuid=7c828b054cdfeb09cee156233da30b2b.wav&lan=zh&per=100&spd=4&pit=6&vol=15&pdt=139&rate=4&xml=0", Arrays.copyOf(new Object[]{r5}, 1));
        Intrinsics.O10IXXX0X(r1, "format(...)");
        i1O0OXO1O.OXO1.OXO1(TAG + " contentLen -> " + r5.length());
        Uri r6 = Uri.parse(r1);
        Intrinsics.O10IXXX0X(r6, "parse(...)");
        return r6;
    }

    @aa1
    public final File getMTtsFile() {
        return mTtsFile;
    }

    @aa1
    public final File getMTtsFilePcm() {
        return mTtsFilePcm;
    }

    @tb1
    public final OnlineTTS getSparkChainTts() {
        return sparkChainTts;
    }

    public final void initSegmentation() {
        i1O0OXO1O.OXO1.OXO1(TAG + "  initSegmentation");
        stop();
        isInitSegmentation = true;
        mSegmentationIndex = 0;
        mLastLength = 0;
        textListIndex = 0;
        mSegmentationTextList.clear();
        List<File> r1 = segmentationFileList;
        Intrinsics.O10IXXX0X(r1, "segmentationFileList");
        monitor-enter(r1);
        Intrinsics.O10IXXX0X(r1, "segmentationFileList");     // Catch: Throwable -> L8
        Iterator<T> r2 = r1.iterator();     // Catch: Throwable -> L8
    L6:
        if (r2.hasNext() == false) goto L10;
        ((File) r2.next()).delete();     // Catch: Throwable -> L8
        goto L6
    L10:
        Unit r3 = Unit.OXO1;     // Catch: Throwable -> L8
        monitor-exit(r1);
        segmentationFileList.clear();
        isInitSegmentation = false;
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final boolean isInitSegmentation() {
        return isInitSegmentation;
    }

    public final boolean isPlay() {
        MediaPlayer r0 = mMediaPlayer;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.isPlaying() != true) goto L7;
        return true;
    }

    public final boolean isReplayMusic() {
        return isReplayMusic;
    }

    public final void play(@aa1 String r26, boolean r27, boolean r28, @tb1 Function1<? super Boolean, Unit> r29, @aa1 String r30, @aa1 String r31) {
        Intrinsics.X0O(r26, "text");
        Intrinsics.X0O(r30, "rtasrLanguage");
        Intrinsics.X0O(r31, "tag");
        i1O0OXO1O r11 = i1O0OXO1O.OXO1;
        String r12 = TAG;
        r11.OXO1(r12 + " play tag = " + r31 + " text = " + r26 + " ,isUseOpenAiTts = " + r27 + " ,isSegmentation = " + r28);
        if (AIManager.OXO1.iI() == true) goto L5;
        return;
    L5:
        String r2 = oe5.IXO0OOi(oe5.IXO0OOi(oe5.IXO0OOi(r26, "\n", "", false, 4, null), qu0.XO0O10, "", false, 4, null), ProxyConfig.MATCH_ALL_SCHEMES, "", false, 4, null);
        q62 r3 = q62.OXO1;
        if (r3.X11I() == false) goto L10;
        MicrosoftSDKManage.iI(MicrosoftSDKManage.O1O.OXO1(), r26, null, 2, null);
        return;
    L10:
        if (r3.OIXOOi() == false) goto L22;
        isSegmentation = r28;
        if (r28 == true) goto L14;
        initSegmentation();
    L14:
        ArrayList<String> r1 = mSegmentationTextList;
        if (r1.size() != 0) goto L18;
        AISparkChainPlay(r2, r29, r30);
    L20:
        r11.OXO1(r12 + "   tmpText = " + r2 + " ,this.isSegmentation = " + isSegmentation);
        r1.add(r2);
        return;
    L18:
        if (isTTSEnd == false) goto L20;
        AISparkChainPlay(r2, r29, r30);
        textListIndex++;
        goto L20
    L22:
        isSegmentation = false;
        r11.OXO1(r12 + " isUseAIService -> " + r3.XOX());
        if (r3.XOX() == false) goto L26;
        playNew(r2, r29);
        return;
    L26:
        isSegmentation = r28;
        playOld(r2, r27, r29);
    }

    public final void playAssetsFile(@aa1 String r5, final boolean r6, @tb1 final Function1<? super Boolean, Unit> r7) {
        Intrinsics.X0O(r5, "assetPath");
    L6:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.XOO0ii0(TAG + " playAssetsFile error " + e.getLocalizedMessage());
        if (r7 == null) goto L33;
        Unit r8 = r7.invoke(Boolean.FALSE);
    L33:
        clearSegmentation();
        return;
    L4:
        if (mMediaPlayer != null) goto L8;
        mMediaPlayer = new MediaPlayer();     // Catch: Exception -> L6
    L8:
        Application r0 = Utils.getApp();     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r0, "getApp(...)");     // Catch: Exception -> L6
        final Uri r1 = getAssetFileUri(r0, r5);     // Catch: Exception -> L6
        if (r1 == null) goto L37;
        stop();     // Catch: Exception -> L6
        i1O0OXO1O.OXO1.OXO1(TAG + " playAssetsFile  " + r5);     // Catch: Exception -> L6
        MediaPlayer r9 = mMediaPlayer;     // Catch: Exception -> L6
        if (r9 == null) goto L14;
        r9.reset();     // Catch: Exception -> L6
    L14:
        MediaPlayer r10 = mMediaPlayer;     // Catch: Exception -> L6
        if (r10 == null) goto L17;
        r10.setDataSource(Utils.getApp(), r1);     // Catch: Exception -> L6
    L17:
        MediaPlayer r11 = mMediaPlayer;     // Catch: Exception -> L6
        if (r11 == null) goto L20;
        r11.setOnCompletionListener(new OIIOXOi(r6, r1, r7));     // Catch: Exception -> L6
    L20:
        MediaPlayer r12 = mMediaPlayer;     // Catch: Exception -> L6
        if (r12 == null) goto L23;
        r12.setOnErrorListener(new IOI11I11O(r7));     // Catch: Exception -> L6
    L23:
        MediaPlayer r13 = mMediaPlayer;     // Catch: Exception -> L6
        if (r13 == null) goto L26;
        r13.setOnPreparedListener(new XO01());     // Catch: Exception -> L6
    L26:
        MediaPlayer r14 = mMediaPlayer;     // Catch: Exception -> L6
        if (r14 == null) goto L38;
        r14.prepareAsync();     // Catch: Exception -> L6
        return;
    L38:
        return;
    }

    public final void playNew(@aa1 String r2, @tb1 final Function1<? super Boolean, Unit> r3) {
        Intrinsics.X0O(r2, "text");
        downloadAiTtsV2(r2, new iiI1XOOI(r3));
    }

    public final void playOld(@aa1 String r17, boolean r18, @tb1 final Function1<? super Boolean, Unit> r19) {
        Intrinsics.X0O(r17, "text");
        String r3 = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        i1O0OXO1O r8 = i1O0OXO1O.OXO1;
        String r9 = TAG;
        r8.OXO1(r9 + " play -> " + r3 + ", " + r18);
        if (r18 == false) goto L6;
        downloadOpenAiTts(r17, new X0OiOO00i(r19));
        return;
    L6:
        String r1 = oe5.IXO0OOi(oe5.IXO0OOi(r17, qu0.XO0O10, "", false, 4, null), ProxyConfig.MATCH_ALL_SCHEMES, "", false, 4, null);
        boolean r4 = false;
        if (isSegmentation == false) goto L19;
        ArrayList<String> r2 = mSegmentationTextList;
        if (r2.size() == 0) goto L11;
        int r5 = mLastLength + ((String) CollectionsKt___CollectionsKt.Xi1XO00(r2)).length();
        mLastLength = r5;
        String r6 = r1.substring(r5, r1.length());
        Intrinsics.O10IXXX0X(r6, "substring(...)");
        r2.add(r6);
        return;
    L11:
        if (r1.length() < 80) goto L14;
        r1 = r1.substring(0, 80);
        Intrinsics.O10IXXX0X(r1, "substring(...)");
    L14:
        mLastLength = 0;
        r2.add(r1);
        playUri(getDirectConnectionUri(r1), r19);
        return;
    L19:
        if (r1.length() > 500) goto L21;
        playUri(getDirectConnectionUri(r1), r19);
        return;
    L21:
        if (r1.length() <= 500) goto L23;
        r4 = true;
    L23:
        r8.OXO1(r9 + " content.length  ->  " + r4);
        segmentationText(r1, r19, 500);
    }

    public final void playUri(@aa1 Uri r4, @tb1 final Function1<? super Boolean, Unit> r5) {
        Intrinsics.X0O(r4, ShareConstants.MEDIA_URI);
        isPlayEnd = false;     // Catch: Exception -> L6
        i1O0OXO1O.OXO1.OXO1(TAG + " playUri -> " + r4);     // Catch: Exception -> L6
        if (mMediaPlayer != null) goto L8;
        mMediaPlayer = new MediaPlayer();     // Catch: Exception -> L6
    L8:
        stop();     // Catch: Exception -> L6
        MediaPlayer r0 = mMediaPlayer;     // Catch: Exception -> L6
        if (r0 == null) goto L11;
        r0.reset();     // Catch: Exception -> L6
    L11:
        MediaPlayer r1 = mMediaPlayer;     // Catch: Exception -> L6
        if (r1 == null) goto L14;
        r1.setDataSource(Utils.getApp(), r4);     // Catch: Exception -> L6
    L14:
        MediaPlayer r6 = mMediaPlayer;     // Catch: Exception -> L6
        if (r6 == null) goto L17;
        r6.setOnCompletionListener(new iOIXI1(r5));     // Catch: Exception -> L6
    L17:
        MediaPlayer r7 = mMediaPlayer;     // Catch: Exception -> L6
        if (r7 == null) goto L20;
        r7.setOnErrorListener(new O100II00I(r5));     // Catch: Exception -> L6
    L20:
        MediaPlayer r8 = mMediaPlayer;     // Catch: Exception -> L6
        if (r8 == null) goto L23;
        r8.setOnPreparedListener(new I0Oi0IOI());     // Catch: Exception -> L6
    L23:
        MediaPlayer r9 = mMediaPlayer;     // Catch: Exception -> L6
        if (r9 == null) goto L34;
        r9.prepareAsync();     // Catch: Exception -> L6
        return;
    L34:
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.XOO0ii0(TAG + " play error " + e.getLocalizedMessage());
        if (r5 == null) goto L30;
        Unit r10 = r5.invoke(Boolean.FALSE);
    L30:
        clearSegmentation();
    }

    public final void release() {
        if (mMediaPlayer == null) goto L9;
        stop();
        MediaPlayer r0 = mMediaPlayer;
        if (r0 == null) goto L7;
        r0.release();
    L7:
        mMediaPlayer = null;
        return;
    }

    public final void replayMusic() {
        q62 r0 = q62.OXO1;
        if (r0.X11I() == false) goto L11;
        File r1 = mTtsFilePcm;
        if (r1.exists() == false) goto L8;
        fq1 r2 = fq1.OXO1;
        String r3 = r1.getAbsolutePath();
        Intrinsics.O10IXXX0X(r3, "getAbsolutePath(...)");
        r2.iO(r3, ErrorCode.ERROR_TTS_INVALID_PARA);
        return;
    L8:
        ToastUtils.showLong("音频文件不存在", new Object[0]);
        return;
    L11:
        if (r0.OIXOOi() == false) goto L25;
        File r4 = directoryFile;
        if (r4.exists() == false) goto L23;
        File[] r5 = r4.listFiles();
        i1O0OXO1O.OXO1.OXO1(TAG + " saveSegmentationFileMusic files.size = " + r5.length);
        Arrays.sort(r5, new C33951());
        if (isInitSegmentation == true) goto L17;
        List<File> r7 = segmentationFileList;
        Intrinsics.O10IXXX0X(r7, "segmentationFileList");
        Intrinsics.XXI(r5);
        OIXO1IIOO.Oi(r7, r5);
    L17:
        mSegmentationIndex++;
        isReplayMusic = true;
        List<File> r6 = segmentationFileList;
        if (r6.isEmpty() == false) goto L21;
        ToastUtils.showLong("音频文件不存在", new Object[0]);
        return;
    L21:
        Intrinsics.O10IXXX0X(r6, "segmentationFileList");
        Uri r8 = UriUtils.file2Uri((File) CollectionsKt___CollectionsKt.IIII0iI(r6));
        Intrinsics.O10IXXX0X(r8, "file2Uri(...)");
        playUri$default(this, r8, null, 2, null);
        return;
    L23:
        ToastUtils.showLong("音频文件不存在", new Object[0]);
        return;
    L25:
        File r9 = mTtsFile;
        if (r9.exists() == false) goto L29;
        isReplayMusic = true;
        Uri r10 = UriUtils.file2Uri(r9);
        Intrinsics.O10IXXX0X(r10, "file2Uri(...)");
        playUri$default(this, r10, null, 2, null);
        return;
    L29:
        ToastUtils.showLong("音频文件不存在", new Object[0]);
    }

    public final void segmentationText(@aa1 String r3, @tb1 Function1<? super Boolean, Unit> r4, int r5) {
        Intrinsics.X0O(r3, "text");
        isSegmentation = true;
        ArrayList<String> r0 = mSegmentationTextList;
        r0.add(StringsKt___StringsKt.iX1iii(r3, r5));
        String r6 = r3.substring(((String) CollectionsKt___CollectionsKt.IIII0iI(r0)).length(), r3.length());
        Intrinsics.O10IXXX0X(r6, "substring(...)");
        r0.add(r6);
        playUri(getDirectConnectionUri((String) CollectionsKt___CollectionsKt.IIII0iI(r0)), r4);
    }

    public final void setInitSegmentation(boolean r1) {
        isInitSegmentation = r1;
    }

    public final void setReplayMusic(boolean r1) {
        isReplayMusic = r1;
    }

    public final void setSparkChainTts(@tb1 OnlineTTS r1) {
        sparkChainTts = r1;
    }

    public final void setVolume(float r2, float r3) {
        MediaPlayer r0 = mMediaPlayer;
        if (r0 == null) goto L6;
        r0.setVolume(r2, r3);
        return;
    }

    public final void stop() {
        i1O0OXO1O.OXO1.OXO1(TAG + "  stop");     // Catch: Exception -> L5
        OnlineTTS r0 = sparkChainTts;     // Catch: Exception -> L5
        if (r0 == null) goto L7;
        r0.stop();     // Catch: Exception -> L5
    L7:
        MediaPlayer r1 = mMediaPlayer;     // Catch: Exception -> L5
        if (r1 == null) goto L10;
        r1.stop();     // Catch: Exception -> L5
    L10:
        MediaPlayer r2 = mMediaPlayer;     // Catch: Exception -> L5
        if (r2 == null) goto L13;
        r2.reset();     // Catch: Exception -> L5
    L13:
        MicrosoftSDKManage.O1O.OXO1().iX01();     // Catch: Exception -> L5
    L16:
        AndroidNetworking.cancel(OPENAI_TTS_URL);
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L16
    }
}
