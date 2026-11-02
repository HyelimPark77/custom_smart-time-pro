.class public final Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->AISparkChainPlay(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mTtsFile:Ljava/io/File;

.field final synthetic $pronounist:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$mTtsFile:Ljava/io/File;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$callback:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$pronounist:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/iflytek/sparkchain/core/tts/TTS$TTSError;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usrTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSError;->getCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSError;->getErrMsg()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " AISparkChainPlay   onError  code = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "   errMsg = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$callback:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_0

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Unit;

    :cond_0
    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usrTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getStatus()I

    move-result v1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getSid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$mTtsFile:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  result.status = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " , result.sid =  "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , path = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$mTtsFile:Ljava/io/File;

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getData()[B

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getStatus()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "file2Uri(...)"

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne v0, v4, :cond_0

    :try_start_1
    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getMSegmentationIndex$p()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getSegmentationFileList$p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getMSegmentationIndex$p()I

    move-result v0

    sget-object v5, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    add-int/2addr v0, v2

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$setMSegmentationIndex$p(I)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getSegmentationFileList$p()Ljava/util/List;

    move-result-object v0

    const/4 v6, 0x0

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v0, v3, v4, v3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$callback:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getStatus()I

    move-result v0

    if-ne v0, v4, :cond_1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$isPlayEnd$p()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getSegmentationFileList$p()Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getSegmentationFileList$p()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/File;

    invoke-static {v5}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v5, v3, v4, v3}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->playUri$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getStatus()I

    move-result p1

    if-ne p1, v4, :cond_2

    sget-object p1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-static {v2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$setTTSEnd$p(Z)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTextListIndex$p()I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$setTextListIndex$p(I)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTextListIndex$p()I

    move-result v0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getMSegmentationTextList$p()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTextListIndex$p()I

    move-result v1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getMSegmentationTextList$p()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "  textListIndex = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  mSegmentationTextList = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getMSegmentationTextList$p()Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTextListIndex$p()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "get(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$callback:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$AISparkChainPlay$1$1;->$pronounist:Ljava/lang/String;

    invoke-virtual {p1, p2, v0, v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->AISparkChainPlay(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " AISparkChainPlay  onResult -> error  e = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "   "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
