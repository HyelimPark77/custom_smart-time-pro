.class public final Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXOOiIIII;


# instance fields
.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Ljava/lang/String;

.field public iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "fileExtension"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->OXO1:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->XIi00iiXO:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    const-string p1, "pcm"

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public IiI10X([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XIi00iiXO([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public O00(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XXI(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public OXO1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;

    iget v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XOO0ii0()Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz p1, :cond_4

    iput v3, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$clear$1;->label:I

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XXI(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->close()V

    :cond_5
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public XIi00iiXO(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->XOO0ii0()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;-><init>(Ljava/io/File;)V

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OXO1(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    return-void
.end method

.method public XO0O10(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;

    iget v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz p1, :cond_3

    iput v3, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager$closeAudioWrite$1;->label:I

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XXI(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->close()V

    :cond_4
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final XOO0ii0()Ljava/lang/String;
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lkotlin/text/StringsKt___StringsKt;->iX1iii(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->XIi00iiXO:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->OXO1:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/file/audio/"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public iO()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileOutputManager;->iO:Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OIi0()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
