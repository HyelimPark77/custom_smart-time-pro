.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;-><init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/iflytek/sparkchain/core/tts/TTS$TTSError;Ljava/lang/Object;)V
    .locals 3

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSError;->getCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSError;->getErrMsg()Ljava/lang/String;

    move-result-object v1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onError:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;Ljava/lang/Object;)V
    .locals 5

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getStatus()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getData()[B

    move-result-object v3

    if-eqz v3, :cond_1

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onResult:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " audioSize:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getData()[B

    move-result-object v1

    :cond_2
    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getData()[B

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/iflytek/sparkchain/core/tts/TTS$TTSResult;->getStatus()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " \u5408\u6210\u5b8c\u6210\uff0c\u6587\u4ef6\u5927\u5c0f="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XO0O10(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;->OXO1:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    const-string v0, "getAbsolutePath(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method
