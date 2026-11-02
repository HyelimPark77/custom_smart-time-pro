.class public final Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i0i0X0;


# instance fields
.field public O00:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OXO1:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lkotlinx/coroutines/channels/O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/O00<",
            "[B>;"
        }
    .end annotation
.end field

.field public final XO0O10:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iO:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 3
    .param p1    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OXO1:Ljava/io/File;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/16 v2, 0x64

    invoke-static {v2, v0, v0, v1, v0}, Lkotlinx/coroutines/channels/IiI10X;->XO0O10(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/O00;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XIi00iiXO:Lkotlinx/coroutines/channels/O00;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIXiXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIXiXO;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->iO:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii1iXiIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii1iXiIX;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XO0O10:Lkotlin/Lazy;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    :cond_1
    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/FileOutputStream;
    .locals 1

    new-instance v0, Ljava/io/FileOutputStream;

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OXO1:Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method

.method public static final I0iXXO(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/BufferedOutputStream;
    .locals 1

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->IO()Ljava/io/FileOutputStream;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/BufferedOutputStream;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OIX0iXi()Ljava/io/BufferedOutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Lkotlinx/coroutines/channels/O00;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XIi00iiXO:Lkotlinx/coroutines/channels/O00;

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/FileOutputStream;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->I0IIOi(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/FileOutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/BufferedOutputStream;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->I0iXXO(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;)Ljava/io/BufferedOutputStream;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final IO()Ljava/io/FileOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->iO:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/FileOutputStream;

    return-object v0
.end method

.method public final OIX0iXi()Ljava/io/BufferedOutputStream;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XO0O10:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/BufferedOutputStream;

    return-object v0
.end method

.method public final OIi0()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OXO1:Ljava/io/File;

    return-object v0
.end method

.method public OXO1(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 7
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$start$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$start$1;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->O00:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public XIi00iiXO([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XIi00iiXO:Lkotlinx/coroutines/channels/O00;

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/channels/I0iXXO;->iIXi1iiXI(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final XOO0ii0()Z
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->XIi00iiXO:Lkotlinx/coroutines/channels/O00;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/channels/I0iXXO$OXO1;->OXO1(Lkotlinx/coroutines/channels/I0iXXO;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final XXI(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    instance-of v0, p1, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;

    iget v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;->label:I

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

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->O00:Lkotlinx/coroutines/XiOIO;

    if-eqz p1, :cond_3

    iput v3, v0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter$waitWriteAudioAndCancel$1;->label:I

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/td;->I0iXXO(Lkotlinx/coroutines/XiOIO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->O00:Lkotlinx/coroutines/XiOIO;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public close()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OIX0iXi()Ljava/io/BufferedOutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {p0}, Lcom/sma/smartv3/util/audio_recorder/AudioFileStreamWriter;->OIX0iXi()Ljava/io/BufferedOutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
