.class public final Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final I0IIOi:Lkotlinx/coroutines/channels/O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/O00<",
            "[B>;"
        }
    .end annotation
.end field

.field public final IO:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public IiI10X:Landroid/media/AudioRecord;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public O00:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public OIX0iXi:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OIi0:Lcom/android/mltcode/paycertificationapi/ty0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/ty0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final OXO1:I

.field public final XIi00iiXO:I

.field public final XO0O10:I

.field public final XOO0ii0:I

.field public final iO:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OXO1:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XIi00iiXO:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->iO:I

    .line 6
    invoke-static {p1, p2, p3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result p1

    mul-int/2addr p1, p4

    iput p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XO0O10:I

    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XOO0ii0:I

    const/4 p1, 0x0

    const/4 p2, 0x7

    const/4 p3, 0x0

    .line 8
    invoke-static {p3, p1, p1, p2, p1}, Lkotlinx/coroutines/channels/IiI10X;->XO0O10(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/O00;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->I0IIOi:Lkotlinx/coroutines/channels/O00;

    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/l85;->OXO1(Ljava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ty0;

    .line 10
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->XXI(Lcom/android/mltcode/paycertificationapi/ty0;)Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IO:Lcom/android/mltcode/paycertificationapi/k85;

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/16 p1, 0x3e80

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/16 p2, 0x10

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x2

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 11
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;-><init>(IIII)V

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Lkotlinx/coroutines/channels/O00;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->I0IIOi:Lkotlinx/coroutines/channels/O00;

    return-object p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Landroid/media/AudioRecord;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    return-object p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)Lcom/android/mltcode/paycertificationapi/ty0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ty0;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XO0O10:I

    return p0
.end method


# virtual methods
.method public final I0IIOi(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OXO1:I

    iget v2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XIi00iiXO:I

    iget v3, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->iO:I

    invoke-static {v0, v2, v3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    if-gtz v0, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AudioRecord \u53c2\u6570\u4e0d\u652f\u6301"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v2, Landroid/media/AudioRecord;

    iget v3, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XOO0ii0:I

    iget v4, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OXO1:I

    iget v5, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XIi00iiXO:I

    iget v6, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->iO:I

    iget v7, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->XO0O10:I

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-direct/range {v2 .. v7}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v2, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    invoke-virtual {v2}, Landroid/media/AudioRecord;->getState()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    goto :goto_2

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getState()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AudioRecord \u521d\u59cb\u5316\u5931\u8d25 state="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/media/AudioRecord;->release()V

    :cond_4
    iput-object v1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    return-void

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ty0;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v2}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v4

    new-instance v6, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;

    invoke-direct {v6, p0, v1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$startRecord$2;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->O00:Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final IiI10X()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IO:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public final O00()Lcom/android/mltcode/paycertificationapi/ii0iIIX0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/ii0iIIX0<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->I0IIOi:Lkotlinx/coroutines/channels/O00;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/iX0XiO;->iIIIiIO0(Lkotlinx/coroutines/channels/ReceiveChannel;)Lcom/android/mltcode/paycertificationapi/ii0iIIX0;

    move-result-object v0

    return-object v0
.end method

.method public final OIi0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    instance-of v0, p1, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;

    iget v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;-><init>(Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;->label:I

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

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->O00:Lkotlinx/coroutines/XiOIO;

    if-eqz p1, :cond_3

    iput v3, v0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager$stop$1;->label:I

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/td;->I0iXXO(Lkotlinx/coroutines/XiOIO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->O00:Lkotlinx/coroutines/XiOIO;

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ty0;

    const/4 v1, 0x0

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    if-eqz v0, :cond_5

    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_4

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    goto :goto_5

    :goto_3
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_4
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    throw p1

    :cond_5
    :goto_5
    iput-object p1, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->IiI10X:Landroid/media/AudioRecord;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final XOO0ii0(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->OIi0:Lcom/android/mltcode/paycertificationapi/ty0;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/ty0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/audio_recorder/AudioRecordManager;->I0IIOi(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-void
.end method
