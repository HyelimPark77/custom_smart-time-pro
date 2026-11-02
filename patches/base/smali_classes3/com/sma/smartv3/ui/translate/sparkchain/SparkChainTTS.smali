.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final IiI10X:Lcom/android/mltcode/paycertificationapi/l94;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final O00:Lcom/android/mltcode/paycertificationapi/ry0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ry0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public XO0O10:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XOO0ii0:Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 6
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    const-string p1, "SparkChainTTS"

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XIi00iiXO:Ljava/lang/String;

    new-instance p1, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ai_tts_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".mp3"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XO0O10:Ljava/io/File;

    const/4 p1, 0x0

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-static {v1, v2, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/m94;->XIi00iiXO(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->O00:Lcom/android/mltcode/paycertificationapi/ry0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->I0iXXO(Lcom/android/mltcode/paycertificationapi/ry0;)Lcom/android/mltcode/paycertificationapi/l94;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->IiI10X:Lcom/android/mltcode/paycertificationapi/l94;

    new-instance p1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$OXO1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XOO0ii0:Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "x4_lingxiaolu_en"

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->I0IIOi(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XO0O10:Ljava/io/File;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Lcom/iflytek/sparkchain/core/tts/OnlineTTS;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    return-object p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Lcom/android/mltcode/paycertificationapi/ry0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->O00:Lcom/android/mltcode/paycertificationapi/ry0;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XIi00iiXO:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final I0IIOi(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "pronunciationer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-nez v0, :cond_1

    new-instance v0, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    invoke-direct {v0, p2}, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2}, Lcom/iflytek/sparkchain/core/tts/TTS;->vcn(Ljava/lang/String;)V

    const-string v1, "lame"

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/tts/OnlineTTS;->aue(Ljava/lang/String;)V

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/tts/TTS;->pitch(I)V

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/tts/TTS;->speed(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/tts/TTS;->bgs(I)V

    :cond_2
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ai_tts_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".mp3"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XO0O10:Ljava/io/File;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XOO0ii0:Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;

    invoke-virtual {v0, v1}, Lcom/iflytek/sparkchain/core/tts/TTS;->registerCallbacks(Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;)V

    :cond_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XIi00iiXO:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XO0O10:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " \u5408\u6210\u4eba:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;

    const/4 p2, 0x0

    invoke-direct {v4, p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_4
    :goto_0
    return-void
.end method

.method public final IiI10X()Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XOO0ii0:Lcom/iflytek/sparkchain/core/tts/TTSCallbacks;

    return-object v0
.end method

.method public final O00()Lcom/android/mltcode/paycertificationapi/l94;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/l94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->IiI10X:Lcom/android/mltcode/paycertificationapi/l94;

    return-object v0
.end method

.method public final XOO0ii0()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/iflytek/sparkchain/core/tts/TTS;->stop()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->iO:Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    return-void
.end method
