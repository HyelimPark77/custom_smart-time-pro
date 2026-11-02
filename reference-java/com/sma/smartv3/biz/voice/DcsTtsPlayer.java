package com.sma.smartv3.biz.voice;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OIXO1IIOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.fq1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qu0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import com.iflytek.sparkchain.core.tts.OnlineTTS;
import com.iflytek.sparkchain.core.tts.TTS;
import com.iflytek.sparkchain.core.tts.TTSCallbacks;
import com.iflytek.sparkchain.utils.constants.ErrorCode;
import com.ironsource.C11921G5;
import com.ironsource.C12861n2;
import com.sma.smartv3.biz.AIManager;
import com.sma.smartv3.biz.AISparkChainManager;
import com.sma.smartv3.biz.voice.DcsTtsPlayer;
import com.sma.smartv3.network.GetAITextToAudio;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.util.MicrosoftSDKManage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p617io.ByteStreamsKt;
import kotlin.p617io.CloseableKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDcsTtsPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,623:1\n1#2:624\n11561#3:625\n11896#3,3:626\n1869#4,2:629\n1563#4:631\n1634#4,3:632\n*S KotlinDebug\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n*L\n424#1:625\n424#1:626,3\n503#1:629,2\n483#1:631\n483#1:632,3\n*E\n"})
public final class DcsTtsPlayer {

    @aa1
    private static final File directoryFile;
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
    private static final ArrayList<String> mSegmentationTextList;

    @aa1
    private static final File mTtsFile;

    @aa1
    private static final File mTtsFilePcm;
    private static final List<File> segmentationFileList;

    @tb1
    private static OnlineTTS sparkChainTts;
    private static int textListIndex;

    @aa1
    public static final DcsTtsPlayer INSTANCE = new DcsTtsPlayer();

    @aa1
    private static final String TAG = "DcsTtsPlayer";

    @aa1
    private static final String OPENAI_TTS_URL = "https://api.openai.com/v1/audio/speech";

    static {
        sz0 sz0Var = sz0.OXO1;
        mTtsFile = new File(uz0.I0iXXO(sz0Var), "ai_tts.mp3");
        mTtsFilePcm = new File(uz0.I0iXXO(sz0Var), "ai_tts.pcm");
        directoryFile = new File(PathUtils.getExternalAppDataPath() + "/files/save_video");
        mSegmentationTextList = new ArrayList<>();
        segmentationFileList = Collections.synchronizedList(new ArrayList());
        isTTSEnd = true;
        isPlayEnd = true;
    }

    private DcsTtsPlayer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void AISparkChainPlay$default(DcsTtsPlayer dcsTtsPlayer, String str, Function1 function1, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            str2 = "x4_lingxiaolu_en";
        }
        dcsTtsPlayer.AISparkChainPlay(str, function1, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AISparkChainPlay$lambda$0(final String str, String str2, final File file, final Function1 function1) {
        isTTSEnd = false;
        if (sparkChainTts == null) {
            sparkChainTts = new OnlineTTS(str);
        }
        String str3 = "x4_lingxiaolu_en";
        if (!Intrinsics.XOO0ii0(str, "x4_lingxiaoying_assist") && !Intrinsics.XOO0ii0(str, "x4_lingxiaolu_en")) {
            str3 = str;
        }
        OnlineTTS onlineTTS = sparkChainTts;
        if (onlineTTS != null) {
            onlineTTS.vcn(str3);
        }
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str4 = TAG;
        int i = mSegmentationIndex;
        List<File> list = segmentationFileList;
        i1o0oxo1o.OXO1(str4 + " AISparkChainPlay  pronounist = " + str3 + " , mSegmentationIndex = " + i + " tmpText = " + str2 + "  list.size = " + list.size());
        OnlineTTS onlineTTS2 = sparkChainTts;
        if (onlineTTS2 != null) {
            onlineTTS2.registerCallbacks(new TTSCallbacks() { // from class: com.sma.smartv3.biz.voice.DcsTtsPlayer$AISparkChainPlay$1$1
                @Override // com.iflytek.sparkchain.core.tts.TTSCallbacks
                public void onError(TTS.TTSError error, Object usrTag) {
                    Intrinsics.X0O(error, "error");
                    Intrinsics.X0O(usrTag, "usrTag");
                    i1O0OXO1O.OXO1.XIi00iiXO(DcsTtsPlayer.TAG + " AISparkChainPlay   onError  code = " + error.getCode() + "   errMsg = " + error.getErrMsg());
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                    }
                }

                @Override // com.iflytek.sparkchain.core.tts.TTSCallbacks
                public void onResult(TTS.TTSResult result, Object usrTag) {
                    Intrinsics.X0O(result, "result");
                    Intrinsics.X0O(usrTag, "usrTag");
                    i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
                    i1o0oxo1o2.OXO1(DcsTtsPlayer.TAG + "  result.status = " + result.getStatus() + " , result.sid =  " + result.getSid() + " , path = " + file.getAbsolutePath());
                    try {
                        FileIOUtils.writeFileFromBytesByStream(file, result.getData(), true);
                        if (result.getStatus() == 2 && DcsTtsPlayer.mSegmentationIndex == 0 && DcsTtsPlayer.segmentationFileList.size() > 0) {
                            int i2 = DcsTtsPlayer.mSegmentationIndex;
                            DcsTtsPlayer dcsTtsPlayer = DcsTtsPlayer.INSTANCE;
                            DcsTtsPlayer.mSegmentationIndex = i2 + 1;
                            Uri uriFile2Uri = UriUtils.file2Uri((File) DcsTtsPlayer.segmentationFileList.get(0));
                            Intrinsics.O10IXXX0X(uriFile2Uri, "file2Uri(...)");
                            DcsTtsPlayer.playUri$default(dcsTtsPlayer, uriFile2Uri, null, 2, null);
                            Function1<Boolean, Unit> function2 = function1;
                            if (function2 != null) {
                                function2.invoke2(Boolean.TRUE);
                            }
                        }
                        if (result.getStatus() == 2 && DcsTtsPlayer.isPlayEnd) {
                            DcsTtsPlayer dcsTtsPlayer2 = DcsTtsPlayer.INSTANCE;
                            Uri uriFile2Uri2 = UriUtils.file2Uri((File) DcsTtsPlayer.segmentationFileList.get(DcsTtsPlayer.segmentationFileList.size() - 1));
                            Intrinsics.O10IXXX0X(uriFile2Uri2, "file2Uri(...)");
                            DcsTtsPlayer.playUri$default(dcsTtsPlayer2, uriFile2Uri2, null, 2, null);
                        }
                        if (result.getStatus() == 2) {
                            DcsTtsPlayer dcsTtsPlayer3 = DcsTtsPlayer.INSTANCE;
                            DcsTtsPlayer.isTTSEnd = true;
                            DcsTtsPlayer.textListIndex++;
                            if (DcsTtsPlayer.textListIndex < DcsTtsPlayer.mSegmentationTextList.size()) {
                                i1o0oxo1o2.OXO1(DcsTtsPlayer.TAG + "  textListIndex = " + DcsTtsPlayer.textListIndex + "  mSegmentationTextList = " + DcsTtsPlayer.mSegmentationTextList.size() + " ");
                                Object obj = DcsTtsPlayer.mSegmentationTextList.get(DcsTtsPlayer.textListIndex);
                                Intrinsics.O10IXXX0X(obj, "get(...)");
                                dcsTtsPlayer3.AISparkChainPlay((String) obj, function1, str);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        i1O0OXO1O.OXO1.XIi00iiXO(DcsTtsPlayer.TAG + " AISparkChainPlay  onResult -> error  e = " + e + "   ");
                    }
                }
            });
        }
        OnlineTTS onlineTTS3 = sparkChainTts;
        if (onlineTTS3 != null) {
            onlineTTS3.aue("lame");
        }
        OnlineTTS onlineTTS4 = sparkChainTts;
        if (onlineTTS4 != null) {
            onlineTTS4.sfl(1);
        }
        OnlineTTS onlineTTS5 = sparkChainTts;
        if (onlineTTS5 != null) {
            onlineTTS5.pitch(50);
        }
        OnlineTTS onlineTTS6 = sparkChainTts;
        if (onlineTTS6 != null) {
            onlineTTS6.speed(50);
        }
        OnlineTTS onlineTTS7 = sparkChainTts;
        if (onlineTTS7 != null) {
            onlineTTS7.bgs(0);
        }
        OnlineTTS onlineTTS8 = sparkChainTts;
        Integer numValueOf = onlineTTS8 != null ? Integer.valueOf(onlineTTS8.aRun(str2, file.getName())) : null;
        if (numValueOf != null && 18311 == numValueOf.intValue()) {
            list.remove(list.size() - 1);
        }
        i1o0oxo1o.OXO1(str4 + " AISparkChainPlay  ret = " + numValueOf + "  -->");
        return Unit.OXO1;
    }

    private final void downloadAiTtsV2(String str, final Function1<? super Boolean, Unit> function1) {
        String strOIX0iXi = AIManager.OIX0iXi(AIManager.OXO1, 0, 1, null);
        i1O0OXO1O.OXO1.OXO1(TAG + " downloadOpenAiTtsV2 ->  " + strOIX0iXi + "  " + str);
        final String str2 = NetWorkUtils.INSTANCE.getBaseUrl(GetAITextToAudio.URL) + "?model=" + strOIX0iXi + "&text=" + str;
        ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.DcsTtsPlayer.downloadAiTtsV2.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public void onSuccess(Void r1) {
            }

            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public Void doInBackground() {
                ANResponse aNResponseExecuteForOkHttpResponse = AndroidNetworking.get(str2).setPriority(Priority.LOW).setTag((Object) DcsTtsPlayer.OPENAI_TTS_URL).build().executeForOkHttpResponse();
                Function1<Boolean, Unit> function2 = function1;
                try {
                    Response okHttpResponse = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    if (okHttpResponse != null) {
                        okHttpResponse.headers();
                    }
                    Response okHttpResponse2 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    Integer numValueOf = okHttpResponse2 != null ? Integer.valueOf(okHttpResponse2.code()) : null;
                    Response okHttpResponse3 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    ResponseBody responseBodyBody = okHttpResponse3 != null ? okHttpResponse3.body() : null;
                    if (numValueOf != null && numValueOf.intValue() == 200) {
                        InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
                        if (inputStreamByteStream != null) {
                            try {
                                byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamByteStream);
                                CloseableKt.OXO1(inputStreamByteStream, null);
                                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                                String str3 = DcsTtsPlayer.TAG;
                                Response okHttpResponse4 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                                Headers headers = okHttpResponse4 != null ? okHttpResponse4.headers() : null;
                                i1o0oxo1o.OXO1(str3 + " downloadOpenAiTtsV2 -> " + headers + ", " + bArrX0O.length);
                                FileIOUtils.writeFileFromBytesByStream(DcsTtsPlayer.INSTANCE.getMTtsFile(), bArrX0O);
                                if (function2 != null) {
                                    function2.invoke2(Boolean.TRUE);
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.OXO1(inputStreamByteStream, th);
                                    throw th2;
                                }
                            }
                        } else if (function2 != null) {
                            function2.invoke2(Boolean.FALSE);
                        }
                    } else if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                    }
                }
                return null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadAiTtsV2$default(DcsTtsPlayer dcsTtsPlayer, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        dcsTtsPlayer.downloadAiTtsV2(str, function1);
    }

    private final void downloadOpenAiTts(final String str, final Function1<? super Boolean, Unit> function1) {
        i1O0OXO1O.OXO1.OXO1(TAG + " downloadOpenAiTts -> " + str);
        ThreadUtils.executeByIo(new ThreadUtils.SimpleTask<Void>() { // from class: com.sma.smartv3.biz.voice.DcsTtsPlayer.downloadOpenAiTts.1
            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public void onSuccess(Void r1) {
            }

            @Override // com.blankj.utilcode.util.ThreadUtils.Task
            public Void doInBackground() {
                String str2 = "{  \"model\": \"tts-1\",  \"input\": \"" + str + "\",  \"voice\": \"alloy\"}";
                ANRequest.PostRequestBuilder postRequestBuilderAddHeaders = AndroidNetworking.post("https://api.openai.com/v1/audio/speech").setContentType(C11921G5.f28906L).addHeaders("Authorization", "Bearer " + q62.OXO1.iIiiO());
                byte[] bytes = str2.getBytes(Charsets.XIi00iiXO);
                Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
                ANResponse aNResponseExecuteForOkHttpResponse = postRequestBuilderAddHeaders.addByteBody(bytes).setPriority(Priority.LOW).setTag((Object) DcsTtsPlayer.OPENAI_TTS_URL).build().executeForOkHttpResponse();
                Function1<Boolean, Unit> function2 = function1;
                try {
                    Response okHttpResponse = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    if (okHttpResponse != null) {
                        okHttpResponse.headers();
                    }
                    Response okHttpResponse2 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    Integer numValueOf = okHttpResponse2 != null ? Integer.valueOf(okHttpResponse2.code()) : null;
                    Response okHttpResponse3 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                    ResponseBody responseBodyBody = okHttpResponse3 != null ? okHttpResponse3.body() : null;
                    if (numValueOf != null && numValueOf.intValue() == 200) {
                        InputStream inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
                        if (inputStreamByteStream != null) {
                            try {
                                byte[] bArrX0O = ByteStreamsKt.X0O(inputStreamByteStream);
                                CloseableKt.OXO1(inputStreamByteStream, null);
                                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                                String str3 = DcsTtsPlayer.TAG;
                                Response okHttpResponse4 = aNResponseExecuteForOkHttpResponse.getOkHttpResponse();
                                Headers headers = okHttpResponse4 != null ? okHttpResponse4.headers() : null;
                                i1o0oxo1o.OXO1(str3 + " downloadOpenAiTts -> " + headers + ", " + bArrX0O.length);
                                FileIOUtils.writeFileFromBytesByStream(DcsTtsPlayer.INSTANCE.getMTtsFile(), bArrX0O);
                                if (function2 != null) {
                                    function2.invoke2(Boolean.TRUE);
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.OXO1(inputStreamByteStream, th);
                                    throw th2;
                                }
                            }
                        } else if (function2 != null) {
                            function2.invoke2(Boolean.FALSE);
                        }
                    } else if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (function2 != null) {
                        function2.invoke2(Boolean.FALSE);
                    }
                }
                return null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadOpenAiTts$default(DcsTtsPlayer dcsTtsPlayer, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        dcsTtsPlayer.downloadOpenAiTts(str, function1);
    }

    @Deprecated(message = "")
    private static /* synthetic */ void getMSegmentationTextList$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(DcsTtsPlayer dcsTtsPlayer, String str, boolean z, boolean z2, Function1 function1, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = q62.OXO1.iO10O1();
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if ((i & 16) != 0) {
            str2 = "x4_lingxiaolu_en";
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = "tag";
        }
        dcsTtsPlayer.play(str, z3, z4, function2, str4, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playAssetsFile$default(DcsTtsPlayer dcsTtsPlayer, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        dcsTtsPlayer.playAssetsFile(str, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playAssetsFile$lambda$0(boolean z, Uri uri, Function1 function1, MediaPlayer mp) throws IOException {
        Intrinsics.X0O(mp, "mp");
        if (z) {
            mp.reset();
            mp.setDataSource(Utils.getApp(), uri);
            mp.prepare();
            mp.start();
            return;
        }
        INSTANCE.clearSegmentation();
        if (function1 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean playAssetsFile$lambda$1(Function1 function1, MediaPlayer mediaPlayer, int i, int i2) {
        i1O0OXO1O.OXO1.OXO1(TAG + " playAssetsFile error " + i);
        if (function1 != null) {
        }
        INSTANCE.clearSegmentation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playAssetsFile$lambda$2(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = mMediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playNew$default(DcsTtsPlayer dcsTtsPlayer, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        dcsTtsPlayer.playNew(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playNew$lambda$0(Function1 function1, boolean z) {
        if (!z) {
            if (function1 != null) {
                return (Unit) function1.invoke2(Boolean.FALSE);
            }
            return null;
        }
        DcsTtsPlayer dcsTtsPlayer = INSTANCE;
        Uri uriFile2Uri = UriUtils.file2Uri(mTtsFile);
        Intrinsics.O10IXXX0X(uriFile2Uri, "file2Uri(...)");
        playUri$default(dcsTtsPlayer, uriFile2Uri, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playOld$default(DcsTtsPlayer dcsTtsPlayer, String str, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = q62.OXO1.iO10O1();
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        dcsTtsPlayer.playOld(str, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playOld$lambda$0(Function1 function1, boolean z) {
        if (!z) {
            if (function1 != null) {
                return (Unit) function1.invoke2(Boolean.FALSE);
            }
            return null;
        }
        DcsTtsPlayer dcsTtsPlayer = INSTANCE;
        Uri uriFile2Uri = UriUtils.file2Uri(mTtsFile);
        Intrinsics.O10IXXX0X(uriFile2Uri, "file2Uri(...)");
        playUri$default(dcsTtsPlayer, uriFile2Uri, null, 2, null);
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playUri$default(DcsTtsPlayer dcsTtsPlayer, Uri uri, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        dcsTtsPlayer.playUri(uri, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playUri$lambda$0(Function1 function1, MediaPlayer mediaPlayer) throws IOException {
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = TAG;
        int i = mSegmentationIndex;
        List<File> list = segmentationFileList;
        i1o0oxo1o.OXO1(str + " play complete   mSegmentationIndex = " + i + "   segmentationFileList = " + list.size());
        if (!q62.OXO1.OIXOOi()) {
            if (!isSegmentation) {
                I01XX0.OXO1(I01XX0.XXOXi, C12861n2.f35993v);
                if (function1 != null) {
                    return;
                }
                return;
            }
            mSegmentationIndex++;
            ArrayList<String> arrayList = mSegmentationTextList;
            if (arrayList.size() <= mSegmentationIndex) {
                INSTANCE.clearSegmentation();
                if (function1 != null) {
                }
                I01XX0.OXO1(I01XX0.XXOXi, C12861n2.f35993v);
                return;
            }
            mediaPlayer.reset();
            Application app = Utils.getApp();
            DcsTtsPlayer dcsTtsPlayer = INSTANCE;
            String str2 = arrayList.get(mSegmentationIndex);
            Intrinsics.O10IXXX0X(str2, "get(...)");
            mediaPlayer.setDataSource(app, dcsTtsPlayer.getDirectConnectionUri(str2));
            mediaPlayer.prepare();
            mediaPlayer.start();
            return;
        }
        if (mSegmentationIndex >= list.size()) {
            isPlayEnd = true;
            if (isReplayMusic) {
                isReplayMusic = false;
            } else {
                INSTANCE.saveSegmentationFileMusic();
            }
            if (function1 != null) {
            }
            I01XX0.OXO1(I01XX0.XXOXi, C12861n2.f35993v);
            return;
        }
        try {
            if (mSegmentationIndex >= list.size() || list.get(mSegmentationIndex) == null || UriUtils.file2Uri(list.get(mSegmentationIndex)) == null) {
                INSTANCE.clearSegmentation();
                if (function1 != null) {
                }
                I01XX0.OXO1(I01XX0.XXOXi, C12861n2.f35993v);
                Unit unit = Unit.OXO1;
                return;
            }
            mediaPlayer.reset();
            i1o0oxo1o.OXO1(str + " AISparkChainPlay    mSegmentationIndex = " + mSegmentationIndex + "   segmentationFileList.size = " + list.size() + " ");
            mediaPlayer.setDataSource(Utils.getApp(), UriUtils.file2Uri(list.get(mSegmentationIndex)));
            mediaPlayer.prepare();
            mediaPlayer.start();
            mSegmentationIndex = mSegmentationIndex + 1;
        } catch (Exception unused) {
            DcsTtsPlayer dcsTtsPlayer2 = INSTANCE;
            dcsTtsPlayer2.stop();
            dcsTtsPlayer2.initSegmentation();
            Unit unit2 = Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean playUri$lambda$1(Function1 function1, MediaPlayer mediaPlayer, int i, int i2) {
        i1O0OXO1O.OXO1.OXO1(TAG + " play error " + i);
        if (function1 != null) {
        }
        INSTANCE.clearSegmentation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playUri$lambda$2(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = mMediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.start();
        }
    }

    private final void saveSegmentationFileMusic() {
        i1O0OXO1O.OXO1.OXO1(TAG + " saveSegmentationFileMusic");
        List<File> list = segmentationFileList;
        if (list == null || list.size() <= 0) {
            return;
        }
        ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.OXi0X0O
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DcsTtsPlayer.saveSegmentationFileMusic$lambda$0();
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveSegmentationFileMusic$lambda$0() {
        File file = directoryFile;
        if (!file.exists()) {
            FileUtils.createOrExistsDir(file);
        }
        List<File> list = segmentationFileList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            boolean zCopy = FileUtils.copy((File) it.next(), new File(PathUtils.getExternalAppDataPath() + "/files/save_video/record_" + System.currentTimeMillis() + ".mp3"));
            i1O0OXO1O.OXO1.OXO1(TAG + " saveSegmentationFileMusic b = " + zCopy);
            arrayList.add(Unit.OXO1);
        }
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void segmentationText$default(DcsTtsPlayer dcsTtsPlayer, String str, Function1 function1, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            i = 400;
        }
        dcsTtsPlayer.segmentationText(str, function1, i);
    }

    public static /* synthetic */ void setVolume$default(DcsTtsPlayer dcsTtsPlayer, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        dcsTtsPlayer.setVolume(f, f2);
    }

    public final void AISparkChainPlay(@aa1 final String tmpText, @tb1 final Function1<? super Boolean, Unit> function1, @aa1 final String pronounist) {
        Intrinsics.X0O(tmpText, "tmpText");
        Intrinsics.X0O(pronounist, "pronounist");
        if (AISparkChainManager.OXO1.IO0iXO0O() != 0) {
            return;
        }
        final File file = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + ".mp3");
        if (!isInitSegmentation) {
            segmentationFileList.add(file);
        }
        ThreadsKt.m39451iO(true, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.IO1100
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return DcsTtsPlayer.AISparkChainPlay$lambda$0(pronounist, tmpText, file, function1);
            }
        }, 30, null);
    }

    public final void clearSegmentation() {
        if (isSegmentation) {
            isSegmentation = false;
            initSegmentation();
        }
    }

    public final void deleteReplayMusic() {
        File[] fileArrListFiles;
        File file = mTtsFile;
        if (file.exists()) {
            file.delete();
        }
        File file2 = mTtsFilePcm;
        if (file2.exists()) {
            file2.delete();
        }
        if (!q62.OXO1.OIXOOi() || (fileArrListFiles = directoryFile.listFiles()) == null) {
            return;
        }
        if (fileArrListFiles.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file3 : fileArrListFiles) {
            arrayList.add(Boolean.valueOf(file3.delete()));
        }
    }

    @aa1
    public final Uri getAssetFileUri(@aa1 Context context, @aa1 String fileName) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(fileName, "fileName");
        AssetManager assets = context.getAssets();
        File file = new File(context.getCacheDir(), fileName);
        try {
            InputStream inputStreamOpen = assets.open(fileName);
            Intrinsics.O10IXXX0X(inputStreamOpen, "open(...)");
            if (!file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                inputStreamOpen.close();
                fileOutputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.O10IXXX0X(uriFromFile, "fromFile(...)");
        return uriFromFile;
    }

    @aa1
    public final Uri getDirectConnectionUri(@aa1 String content) {
        Intrinsics.X0O(content, "content");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("https://tts.baidu.com/text2audio?tex=%s&ctp=1&cuid=7c828b054cdfeb09cee156233da30b2b.wav&lan=zh&per=100&spd=4&pit=6&vol=15&pdt=139&rate=4&xml=0", Arrays.copyOf(new Object[]{content}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        i1O0OXO1O.OXO1.OXO1(TAG + " contentLen -> " + content.length());
        Uri uri = Uri.parse(str);
        Intrinsics.O10IXXX0X(uri, "parse(...)");
        return uri;
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
        List<File> segmentationFileList2 = segmentationFileList;
        Intrinsics.O10IXXX0X(segmentationFileList2, "segmentationFileList");
        synchronized (segmentationFileList2) {
            try {
                Intrinsics.O10IXXX0X(segmentationFileList2, "segmentationFileList");
                Iterator<T> it = segmentationFileList2.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                Unit unit = Unit.OXO1;
            } catch (Throwable th) {
                throw th;
            }
        }
        segmentationFileList.clear();
        isInitSegmentation = false;
    }

    public final boolean isInitSegmentation() {
        return isInitSegmentation;
    }

    public final boolean isPlay() {
        MediaPlayer mediaPlayer = mMediaPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public final boolean isReplayMusic() {
        return isReplayMusic;
    }

    public final void play(@aa1 String text, boolean z, boolean z2, @tb1 Function1<? super Boolean, Unit> function1, @aa1 String rtasrLanguage, @aa1 String tag) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(rtasrLanguage, "rtasrLanguage");
        Intrinsics.X0O(tag, "tag");
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = TAG;
        i1o0oxo1o.OXO1(str + " play tag = " + tag + " text = " + text + " ,isUseOpenAiTts = " + z + " ,isSegmentation = " + z2);
        if (AIManager.OXO1.m38071iI()) {
            String strIXO0OOi = oe5.IXO0OOi(oe5.IXO0OOi(oe5.IXO0OOi(text, "\n", "", false, 4, null), qu0.XO0O10, "", false, 4, null), ProxyConfig.MATCH_ALL_SCHEMES, "", false, 4, null);
            q62 q62Var = q62.OXO1;
            if (q62Var.X11I()) {
                MicrosoftSDKManage.m38822iI(MicrosoftSDKManage.O1O.OXO1(), text, null, 2, null);
                return;
            }
            if (!q62Var.OIXOOi()) {
                isSegmentation = false;
                i1o0oxo1o.OXO1(str + " isUseAIService -> " + q62Var.XOX());
                if (q62Var.XOX()) {
                    playNew(strIXO0OOi, function1);
                    return;
                } else {
                    isSegmentation = z2;
                    playOld(strIXO0OOi, z, function1);
                    return;
                }
            }
            isSegmentation = z2;
            if (!z2) {
                initSegmentation();
            }
            ArrayList<String> arrayList = mSegmentationTextList;
            if (arrayList.size() == 0) {
                AISparkChainPlay(strIXO0OOi, function1, rtasrLanguage);
            } else if (isTTSEnd) {
                AISparkChainPlay(strIXO0OOi, function1, rtasrLanguage);
                textListIndex++;
            }
            i1o0oxo1o.OXO1(str + "   tmpText = " + strIXO0OOi + " ,this.isSegmentation = " + isSegmentation);
            arrayList.add(strIXO0OOi);
        }
    }

    public final void playAssetsFile(@aa1 String assetPath, final boolean z, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(assetPath, "assetPath");
        try {
            if (mMediaPlayer == null) {
                mMediaPlayer = new MediaPlayer();
            }
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            final Uri assetFileUri = getAssetFileUri(app, assetPath);
            if (assetFileUri == null) {
                return;
            }
            stop();
            i1O0OXO1O.OXO1.OXO1(TAG + " playAssetsFile  " + assetPath);
            MediaPlayer mediaPlayer = mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = mMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setDataSource(Utils.getApp(), assetFileUri);
            }
            MediaPlayer mediaPlayer3 = mMediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.android.mltcode.paycertificationapi.OIIOXOi
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer4) throws IOException {
                        DcsTtsPlayer.playAssetsFile$lambda$0(z, assetFileUri, function1, mediaPlayer4);
                    }
                });
            }
            MediaPlayer mediaPlayer4 = mMediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.android.mltcode.paycertificationapi.IOI11I11O
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer5, int i, int i2) {
                        return DcsTtsPlayer.playAssetsFile$lambda$1(function1, mediaPlayer5, i, i2);
                    }
                });
            }
            MediaPlayer mediaPlayer5 = mMediaPlayer;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.android.mltcode.paycertificationapi.XO01
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer6) {
                        DcsTtsPlayer.playAssetsFile$lambda$2(mediaPlayer6);
                    }
                });
            }
            MediaPlayer mediaPlayer6 = mMediaPlayer;
            if (mediaPlayer6 != null) {
                mediaPlayer6.prepareAsync();
            }
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.XOO0ii0(TAG + " playAssetsFile error " + e.getLocalizedMessage());
            if (function1 != null) {
                function1.invoke2(Boolean.FALSE);
            }
            clearSegmentation();
        }
    }

    public final void playNew(@aa1 String text, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(text, "text");
        downloadAiTtsV2(text, new Function1() { // from class: com.android.mltcode.paycertificationapi.iiI1XOOI
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DcsTtsPlayer.playNew$lambda$0(function1, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void playOld(@aa1 String text, boolean z, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(text, "text");
        String language = Utils.getApp().getResources().getConfiguration().locale.getLanguage();
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        String str = TAG;
        i1o0oxo1o.OXO1(str + " play -> " + language + ", " + z);
        if (z) {
            downloadOpenAiTts(text, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0OiOO00i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DcsTtsPlayer.playOld$lambda$0(function1, ((Boolean) obj).booleanValue());
                }
            });
            return;
        }
        String strIXO0OOi = oe5.IXO0OOi(oe5.IXO0OOi(text, qu0.XO0O10, "", false, 4, null), ProxyConfig.MATCH_ALL_SCHEMES, "", false, 4, null);
        if (!isSegmentation) {
            if (strIXO0OOi.length() <= 500) {
                playUri(getDirectConnectionUri(strIXO0OOi), function1);
                return;
            }
            i1o0oxo1o.OXO1(str + " content.length  ->  " + (strIXO0OOi.length() > 500));
            segmentationText(strIXO0OOi, function1, 500);
            return;
        }
        ArrayList<String> arrayList = mSegmentationTextList;
        if (arrayList.size() != 0) {
            int length = mLastLength + ((String) CollectionsKt___CollectionsKt.Xi1XO00(arrayList)).length();
            mLastLength = length;
            String strSubstring = strIXO0OOi.substring(length, strIXO0OOi.length());
            Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            return;
        }
        if (strIXO0OOi.length() >= 80) {
            strIXO0OOi = strIXO0OOi.substring(0, 80);
            Intrinsics.O10IXXX0X(strIXO0OOi, "substring(...)");
        }
        mLastLength = 0;
        arrayList.add(strIXO0OOi);
        playUri(getDirectConnectionUri(strIXO0OOi), function1);
    }

    public final void playUri(@aa1 Uri uri, @tb1 final Function1<? super Boolean, Unit> function1) {
        Intrinsics.X0O(uri, "uri");
        try {
            isPlayEnd = false;
            i1O0OXO1O.OXO1.OXO1(TAG + " playUri -> " + uri);
            if (mMediaPlayer == null) {
                mMediaPlayer = new MediaPlayer();
            }
            stop();
            MediaPlayer mediaPlayer = mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = mMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setDataSource(Utils.getApp(), uri);
            }
            MediaPlayer mediaPlayer3 = mMediaPlayer;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.android.mltcode.paycertificationapi.iOIXI1
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer4) throws IOException {
                        DcsTtsPlayer.playUri$lambda$0(function1, mediaPlayer4);
                    }
                });
            }
            MediaPlayer mediaPlayer4 = mMediaPlayer;
            if (mediaPlayer4 != null) {
                mediaPlayer4.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.android.mltcode.paycertificationapi.O100II00I
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer5, int i, int i2) {
                        return DcsTtsPlayer.playUri$lambda$1(function1, mediaPlayer5, i, i2);
                    }
                });
            }
            MediaPlayer mediaPlayer5 = mMediaPlayer;
            if (mediaPlayer5 != null) {
                mediaPlayer5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.android.mltcode.paycertificationapi.I0Oi0IOI
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer6) {
                        DcsTtsPlayer.playUri$lambda$2(mediaPlayer6);
                    }
                });
            }
            MediaPlayer mediaPlayer6 = mMediaPlayer;
            if (mediaPlayer6 != null) {
                mediaPlayer6.prepareAsync();
            }
        } catch (Exception e) {
            e.printStackTrace();
            i1O0OXO1O.OXO1.XOO0ii0(TAG + " play error " + e.getLocalizedMessage());
            if (function1 != null) {
                function1.invoke2(Boolean.FALSE);
            }
            clearSegmentation();
        }
    }

    public final void release() {
        if (mMediaPlayer != null) {
            stop();
            MediaPlayer mediaPlayer = mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            mMediaPlayer = null;
        }
    }

    public final void replayMusic() {
        q62 q62Var = q62.OXO1;
        if (q62Var.X11I()) {
            File file = mTtsFilePcm;
            if (!file.exists()) {
                ToastUtils.showLong("音频文件不存在", new Object[0]);
                return;
            }
            fq1 fq1Var = fq1.OXO1;
            String absolutePath = file.getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            fq1Var.m1821iO(absolutePath, ErrorCode.ERROR_TTS_INVALID_PARA);
            return;
        }
        if (!q62Var.OIXOOi()) {
            File file2 = mTtsFile;
            if (!file2.exists()) {
                ToastUtils.showLong("音频文件不存在", new Object[0]);
                return;
            }
            isReplayMusic = true;
            Uri uriFile2Uri = UriUtils.file2Uri(file2);
            Intrinsics.O10IXXX0X(uriFile2Uri, "file2Uri(...)");
            playUri$default(this, uriFile2Uri, null, 2, null);
            return;
        }
        File file3 = directoryFile;
        if (!file3.exists()) {
            ToastUtils.showLong("音频文件不存在", new Object[0]);
            return;
        }
        File[] fileArrListFiles = file3.listFiles();
        i1O0OXO1O.OXO1.OXO1(TAG + " saveSegmentationFileMusic files.size = " + fileArrListFiles.length);
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.sma.smartv3.biz.voice.DcsTtsPlayer.replayMusic.1
            @Override // java.util.Comparator
            public int compare(File file1, File file4) {
                Intrinsics.X0O(file1, "file1");
                Intrinsics.X0O(file4, "file2");
                return Intrinsics.XX0(file1.lastModified(), file4.lastModified());
            }
        });
        if (!isInitSegmentation) {
            List<File> segmentationFileList2 = segmentationFileList;
            Intrinsics.O10IXXX0X(segmentationFileList2, "segmentationFileList");
            Intrinsics.XXI(fileArrListFiles);
            OIXO1IIOO.m878Oi(segmentationFileList2, fileArrListFiles);
        }
        mSegmentationIndex++;
        isReplayMusic = true;
        List<File> segmentationFileList3 = segmentationFileList;
        if (segmentationFileList3.isEmpty()) {
            ToastUtils.showLong("音频文件不存在", new Object[0]);
            return;
        }
        Intrinsics.O10IXXX0X(segmentationFileList3, "segmentationFileList");
        Uri uriFile2Uri2 = UriUtils.file2Uri((File) CollectionsKt___CollectionsKt.IIII0iI(segmentationFileList3));
        Intrinsics.O10IXXX0X(uriFile2Uri2, "file2Uri(...)");
        playUri$default(this, uriFile2Uri2, null, 2, null);
    }

    public final void segmentationText(@aa1 String text, @tb1 Function1<? super Boolean, Unit> function1, int i) {
        Intrinsics.X0O(text, "text");
        isSegmentation = true;
        ArrayList<String> arrayList = mSegmentationTextList;
        arrayList.add(StringsKt___StringsKt.iX1iii(text, i));
        String strSubstring = text.substring(((String) CollectionsKt___CollectionsKt.IIII0iI(arrayList)).length(), text.length());
        Intrinsics.O10IXXX0X(strSubstring, "substring(...)");
        arrayList.add(strSubstring);
        playUri(getDirectConnectionUri((String) CollectionsKt___CollectionsKt.IIII0iI(arrayList)), function1);
    }

    public final void setInitSegmentation(boolean z) {
        isInitSegmentation = z;
    }

    public final void setReplayMusic(boolean z) {
        isReplayMusic = z;
    }

    public final void setSparkChainTts(@tb1 OnlineTTS onlineTTS) {
        sparkChainTts = onlineTTS;
    }

    public final void setVolume(float f, float f2) {
        MediaPlayer mediaPlayer = mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f2);
        }
    }

    public final void stop() {
        try {
            i1O0OXO1O.OXO1.OXO1(TAG + "  stop");
            OnlineTTS onlineTTS = sparkChainTts;
            if (onlineTTS != null) {
                onlineTTS.stop();
            }
            MediaPlayer mediaPlayer = mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = mMediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.reset();
            }
            MicrosoftSDKManage.O1O.OXO1().iX01();
        } catch (Exception e) {
            e.printStackTrace();
        }
        AndroidNetworking.cancel(OPENAI_TTS_URL);
    }
}
