.class public final Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDcsTtsPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,623:1\n1#2:624\n11561#3:625\n11896#3,3:626\n1869#4,2:629\n1563#4:631\n1634#4,3:632\n*S KotlinDebug\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n*L\n424#1:625\n424#1:626,3\n503#1:629,2\n483#1:631\n483#1:632,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDcsTtsPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,623:1\n1#2:624\n11561#3:625\n11896#3,3:626\n1869#4,2:629\n1563#4:631\n1634#4,3:632\n*S KotlinDebug\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer\n*L\n424#1:625\n424#1:626,3\n503#1:629,2\n483#1:631\n483#1:632,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final OPENAI_TTS_URL:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final directoryFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static isInitSegmentation:Z

.field private static isPlayEnd:Z

.field private static isReplayMusic:Z

.field private static isSegmentation:Z

.field private static isTTSEnd:Z

.field private static mLastLength:I

.field private static mMediaPlayer:Landroid/media/MediaPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mSegmentationIndex:I

.field private static final mSegmentationTextList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final mTtsFile:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mTtsFilePcm:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final segmentationFileList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private static sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static textListIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    const-string v0, "DcsTtsPlayer"

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    const-string v0, "https://api.openai.com/v1/audio/speech"

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->OPENAI_TTS_URL:Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    const-string v3, "ai_tts.mp3"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFile:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    const-string v2, "ai_tts.pcm"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFilePcm:Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/files/save_video"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->directoryFile:Ljava/io/File;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isTTSEnd:Z

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isPlayEnd:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic AISparkChainPlay$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const-string p3, "x4_lingxiaolu_en"

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->AISparkChainPlay(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    return-void
.end method

.method private static final AISparkChainPlay$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 9

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isTTSEnd:Z

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-nez v1, :cond_0

    new-instance v1, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    invoke-direct {v1, p0}, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    :cond_0
    const-string v1, "x4_lingxiaoying_assist"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "x4_lingxiaolu_en"

    if-nez v1, :cond_2

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p0

    :cond_2
    :goto_0
    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v2}, Lcom/iflytek/sparkchain/core/tts/TTS;->vcn(Ljava/lang/String;)V

    :cond_3
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    sget v4, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    sget-object v5, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " AISparkChainPlay  pronounist = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " , mSegmentationIndex = "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " tmpText = "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  list.size = "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz v2, :cond_4

    new-instance v4, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;

    invoke-direct {v4, p2, p3, p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/iflytek/sparkchain/core/tts/TTS;->registerCallbacks(Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;)V

    :cond_4
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz p0, :cond_5

    const-string p3, "lame"

    invoke-virtual {p0, p3}, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;->aue(Ljava/lang/String;)V

    :cond_5
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    const/4 p3, 0x1

    if-eqz p0, :cond_6

    invoke-virtual {p0, p3}, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;->sfl(I)V

    :cond_6
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    const/16 v2, 0x32

    if-eqz p0, :cond_7

    invoke-virtual {p0, v2}, Lcom/iflytek/sparkchain/core/tts/TTS;->pitch(I)V

    :cond_7
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz p0, :cond_8

    invoke-virtual {p0, v2}, Lcom/iflytek/sparkchain/core/tts/TTS;->speed(I)V

    :cond_8
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz p0, :cond_9

    invoke-virtual {p0, v0}, Lcom/iflytek/sparkchain/core/tts/TTS;->bgs(I)V

    :cond_9
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz p0, :cond_a

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/iflytek/sparkchain/core/tts/TTS;->aRun(Ljava/lang/String;Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_a
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0x4787

    if-ne p2, p1, :cond_c

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, p3

    invoke-interface {v5, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_c
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " AISparkChainPlay  ret = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "  -->"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic I0IIOi(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$lambda$1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic IO(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$lambda$0(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic IiI10X(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->AISparkChainPlay$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$lambda$2(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic OIi0(ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playAssetsFile$lambda$0(ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playAssetsFile$lambda$1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic XIi00iiXO(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playOld$lambda$0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playAssetsFile$lambda$2(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playNew$lambda$0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMSegmentationIndex$p()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    return v0
.end method

.method public static final synthetic access$getMSegmentationTextList$p()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static final synthetic access$getOPENAI_TTS_URL$p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->OPENAI_TTS_URL:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getSegmentationFileList$p()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getTAG$p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getTextListIndex$p()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->textListIndex:I

    return v0
.end method

.method public static final synthetic access$isPlayEnd$p()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isPlayEnd:Z

    return v0
.end method

.method public static final synthetic access$setMSegmentationIndex$p(I)V
    .locals 0

    sput p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    return-void
.end method

.method public static final synthetic access$setTTSEnd$p(Z)V
    .locals 0

    sput-boolean p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isTTSEnd:Z

    return-void
.end method

.method public static final synthetic access$setTextListIndex$p(I)V
    .locals 0

    sput p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->textListIndex:I

    return-void
.end method

.method private final downloadAiTtsV2(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/AIManager;->OIX0iXi(Lcom/sma/smartv3/biz/AIManager;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " downloadOpenAiTtsV2 ->  "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const-string v2, "/ai/text2Audio"

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->getBaseUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?model="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&text="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public static synthetic downloadAiTtsV2$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->downloadAiTtsV2(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final downloadOpenAiTts(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " downloadOpenAiTts -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadOpenAiTts$1;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadOpenAiTts$1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public static synthetic downloadOpenAiTts$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->downloadOpenAiTts(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static synthetic getMSegmentationTextList$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = ""
    .end annotation

    return-void
.end method

.method public static synthetic iO()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->saveSegmentationFileMusic$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    sget-object p2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/q62;->iO10O1()Z

    move-result p2

    :cond_0
    move v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move v3, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    const-string p5, "x4_lingxiaolu_en"

    :cond_3
    move-object v5, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    const-string p6, "tag"

    :cond_4
    move-object v0, p0

    move-object v1, p1

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic playAssetsFile$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playAssetsFile(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final playAssetsFile$lambda$0(ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V
    .locals 1

    const-string v0, "mp"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p3}, Landroid/media/MediaPlayer;->reset()V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p0

    invoke-virtual {p3, p0, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {p3}, Landroid/media/MediaPlayer;->prepare()V

    invoke-virtual {p3}, Landroid/media/MediaPlayer;->start()V

    return-void

    :cond_0
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    if-eqz p2, :cond_1

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_1
    return-void
.end method

.method private static final playAssetsFile$lambda$1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z
    .locals 1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object p3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " playAssetsFile error "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_0
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final playAssetsFile$lambda$2(Landroid/media/MediaPlayer;)V
    .locals 0

    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    return-void
.end method

.method public static synthetic playNew$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playNew(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final playNew$lambda$0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFile:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "file2Uri(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static synthetic playOld$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/q62;->iO10O1()Z

    move-result p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playOld(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final playOld$lambda$0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFile:Ljava/io/File;

    invoke-static {p1}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "file2Uri(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static synthetic playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final playUri$lambda$0(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;)V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    sget-object v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " play complete   mSegmentationIndex = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "   segmentationFileList = "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v2

    const/4 v4, 0x1

    const-string v5, "show"

    const-string v6, "AI_SUPPORT_COMMENT"

    if-eqz v2, :cond_5

    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-lt v2, v7, :cond_2

    sput-boolean v4, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isPlayEnd:Z

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isReplayMusic:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isReplayMusic:Z

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-direct {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->saveSegmentationFileMusic()V

    :goto_0
    if-eqz p0, :cond_1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_1
    invoke-static {v6, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    :try_start_0
    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v2, v7, :cond_3

    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-static {v2}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    sget p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AISparkChainPlay    mSegmentationIndex = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "   segmentationFileList.size = "

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p0

    sget v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    sget p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    add-int/2addr p0, v4

    sput p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    return-void

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    if-eqz p0, :cond_4

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_4
    invoke-static {v6, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1

    :cond_5
    sget-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    if-eqz v0, :cond_8

    sget v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    add-int/2addr v0, v4

    sput v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    if-gt v1, v2, :cond_7

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    if-eqz p0, :cond_6

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_6
    invoke-static {v6, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_7
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object p0

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    sget v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "get(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getDirectConnectionUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepare()V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    return-void

    :cond_8
    invoke-static {v6, v5}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p0, :cond_9

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_9
    :goto_1
    return-void
.end method

.method private static final playUri$lambda$1(Lkotlin/jvm/functions/Function1;Landroid/media/MediaPlayer;II)Z
    .locals 1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object p3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " play error "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p0, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    :cond_0
    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final playUri$lambda$2(Landroid/media/MediaPlayer;)V
    .locals 0

    sget-object p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    return-void
.end method

.method private final saveSegmentationFileMusic()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " saveSegmentationFileMusic"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v6, Lcom/android/mltcode/paycertificationapi/OXi0X0O;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/OXi0X0O;-><init>()V

    const/16 v7, 0x1f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    :cond_0
    return-void
.end method

.method private static final saveSegmentationFileMusic$lambda$0()Lkotlin/Unit;
    .locals 8

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->directoryFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/io/File;)Z

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/files/save_video/record_"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ".mp3"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/io/File;Ljava/io/File;)Z

    move-result v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v4, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " saveSegmentationFileMusic b = "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic segmentationText$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/16 p3, 0x190

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationText(Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method

.method public static synthetic setVolume$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;FFILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->setVolume(FF)V

    return-void
.end method


# virtual methods
.method public final AISparkChainPlay(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "tmpText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pronounist"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->IO0iXO0O()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ai_tts_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ".mp3"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-boolean v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isInitSegmentation:Z

    if-nez v1, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v7, Lcom/android/mltcode/paycertificationapi/IO1100;

    invoke-direct {v7, p3, p1, v0, p2}, Lcom/android/mltcode/paycertificationapi/IO1100;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    return-void
.end method

.method public final clearSegmentation()V
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    :cond_0
    return-void
.end method

.method public final deleteReplayMusic()V
    .locals 5

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFilePcm:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->directoryFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    array-length v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v0

    :goto_1
    if-ge v2, v3, :cond_3

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final getAssetFileUri(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    const-string p2, "open(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v0, 0x400

    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {p2, v0, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "fromFile(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getDirectConnectionUri(Ljava/lang/String;)Landroid/net/Uri;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v0, 0x1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "https://tts.baidu.com/text2audio?tex=%s&ctp=1&cuid=7c828b054cdfeb09cee156233da30b2b.wav&lan=zh&per=100&spd=4&pit=6&vol=15&pdt=139&rate=4&xml=0"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " contentLen -> "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v0, "parse(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getMTtsFile()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFile:Ljava/io/File;

    return-object v0
.end method

.method public final getMTtsFilePcm()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFilePcm:Ljava/io/File;

    return-object v0
.end method

.method public final getSparkChainTts()Lcom/iflytek/sparkchain/core/tts/OnlineTTS;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    return-object v0
.end method

.method public final initSegmentation()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  initSegmentation"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isInitSegmentation:Z

    const/4 v0, 0x0

    sput v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    sput v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mLastLength:I

    sput v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->textListIndex:I

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    const-string v2, "segmentationFileList"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v1

    :try_start_0
    const-string v2, "segmentationFileList"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isInitSegmentation:Z

    return-void

    :goto_1
    monitor-exit v1

    throw v0
.end method

.method public final isInitSegmentation()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isInitSegmentation:Z

    return v0
.end method

.method public final isPlay()Z
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final isReplayMusic()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isReplayMusic:Z

    return v0
.end method

.method public final play(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 25
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v2, p6

    const-string v3, "text"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "rtasrLanguage"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "tag"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v12, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " play tag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " text = "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ,isUseOpenAiTts = "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " ,isSegmentation = "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/AIManager;->iI()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "\n"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0x4

    const/16 v18, 0x0

    const-string v14, "#"

    const-string v15, ""

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    const/16 v23, 0x4

    const/16 v24, 0x0

    const-string v20, "*"

    const-string v21, ""

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v3, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iI(Lcom/sma/smartv3/util/MicrosoftSDKManage;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v1

    if-eqz v1, :cond_5

    sput-boolean v8, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    if-nez v8, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->initSegmentation()V

    :cond_2
    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0, v2, v9, v10}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->AISparkChainPlay(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-boolean v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isTTSEnd:Z

    if-eqz v3, :cond_4

    invoke-virtual {v0, v2, v9, v10}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->AISparkChainPlay(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    sget v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->textListIndex:I

    add-int/lit8 v3, v3, 0x1

    sput v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->textListIndex:I

    :cond_4
    :goto_0
    sget-boolean v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "   tmpText = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ,this.isSegmentation = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    const/4 v1, 0x0

    sput-boolean v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " isUseAIService -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->XOX()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v2, v9}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playNew(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_6
    sput-boolean v8, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    invoke-virtual {v0, v2, v7, v9}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playOld(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final playAssetsFile(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "assetPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getAssetFileUri(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " playAssetsFile  "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->reset()V

    :cond_2
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_4

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIIOXOi;

    invoke-direct {v1, p2, v0, p3}, Lcom/android/mltcode/paycertificationapi/OIIOXOi;-><init>(ZLandroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    :cond_4
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_5

    new-instance p2, Lcom/android/mltcode/paycertificationapi/IOI11I11O;

    invoke-direct {p2, p3}, Lcom/android/mltcode/paycertificationapi/IOI11I11O;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    :cond_5
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_6

    new-instance p2, Lcom/android/mltcode/paycertificationapi/XO01;

    invoke-direct {p2}, Lcom/android/mltcode/paycertificationapi/XO01;-><init>()V

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    :cond_6
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " playAssetsFile error "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XOO0ii0(Ljava/lang/String;)V

    if-eqz p3, :cond_7

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Unit;

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    :cond_8
    :goto_2
    return-void
.end method

.method public final playNew(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiI1XOOI;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/iiI1XOOI;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->downloadAiTtsV2(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final playOld(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 16
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v7, p3

    const-string v3, "text"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    sget-object v8, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v9, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " play -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz v2, :cond_0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X0OiOO00i;

    invoke-direct {v2, v7}, Lcom/android/mltcode/paycertificationapi/X0OiOO00i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->downloadOpenAiTts(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "#"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "*"

    const-string v12, ""

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-boolean v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const-string v5, "substring(...)"

    if-nez v4, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v6, 0x50

    if-ge v4, v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sput v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mLastLength:I

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getDirectConnectionUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    sget v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mLastLength:I

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    sput v3, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mLastLength:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v4, 0x1f4

    if-le v2, v4, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v4, :cond_4

    const/4 v3, 0x1

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " content.length  ->  "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v7, v4}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationText(Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-void

    :cond_5
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getDirectConnectionUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final playUri(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Landroid/net/Uri;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isPlayEnd:Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " playUri -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    :cond_2
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOIXI1;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/iOIXI1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    :cond_3
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O100II00I;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/O100II00I;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    :cond_4
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0Oi0IOI;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/I0Oi0IOI;-><init>()V

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    :cond_5
    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " play error "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XOO0ii0(Ljava/lang/String;)V

    if-eqz p2, :cond_6

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Unit;

    :cond_6
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->clearSegmentation()V

    :cond_7
    return-void
.end method

.method public final release()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    :cond_1
    return-void
.end method

.method public final replayMusic()V
    .locals 11

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X11I()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "\u97f3\u9891\u6587\u4ef6\u4e0d\u5b58\u5728"

    if-eqz v1, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFilePcm:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/fq1;->OXO1:Lcom/android/mltcode/paycertificationapi/fq1;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getAbsolutePath(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x5dc0

    invoke-virtual {v1, v0, v2}, Lcom/android/mltcode/paycertificationapi/fq1;->iO(Ljava/lang/String;I)V

    return-void

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OIXOOi()Z

    move-result v0

    const/4 v1, 0x2

    const-string v4, "file2Uri(...)"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->directoryFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v8, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    array-length v9, v0

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " saveSegmentationFileMusic files.size = "

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v7, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$replayMusic$1;

    invoke-direct {v7}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$replayMusic$1;-><init>()V

    invoke-static {v0, v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    sget-boolean v7, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isInitSegmentation:Z

    const-string v8, "segmentationFileList"

    if-nez v7, :cond_2

    sget-object v7, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v7, v0}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->Oi(Ljava/util/Collection;[Ljava/lang/Object;)Z

    :cond_2
    sget v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    add-int/2addr v0, v5

    sput v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationIndex:I

    sput-boolean v5, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isReplayMusic:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->segmentationFileList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0, v6, v1, v6}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_4
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mTtsFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_6

    sput-boolean v5, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isReplayMusic:Z

    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0, v6, v1, v6}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_6
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {v3, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final segmentationText(Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isSegmentation:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mSegmentationTextList:Ljava/util/ArrayList;

    invoke-static {p1, p3}, Lkotlin/text/StringsKt___StringsKt;->iX1iii(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, p3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string p3, "substring(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getDirectConnectionUri(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final setInitSegmentation(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isInitSegmentation:Z

    return-void
.end method

.method public final setReplayMusic(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->isReplayMusic:Z

    return-void
.end method

.method public final setSparkChainTts(Lcom/iflytek/sparkchain/core/tts/OnlineTTS;)V
    .locals 0
    .param p1    # Lcom/iflytek/sparkchain/core/tts/OnlineTTS;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    return-void
.end method

.method public final setVolume(FF)V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 3

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  stop"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->sparkChainTts:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/iflytek/sparkchain/core/tts/TTS;->stop()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    :cond_2
    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iX01()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->OPENAI_TTS_URL:Ljava/lang/String;

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->cancel(Ljava/lang/Object;)V

    return-void
.end method
