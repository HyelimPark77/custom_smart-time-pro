.class final Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XIi00iiXO(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMediaPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,146:1\n310#2,11:147\n*S KotlinDebug\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n*L\n71#1:147,11\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2"
    f = "MediaPlayManager.kt"
    i = {
        0x0
    }
    l = {
        0x93
    }
    m = "invokeSuspend"
    n = {
        "$i$f$suspendCancellableCoroutine"
    }
    s = {
        "I$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMediaPlayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,146:1\n310#2,11:147\n*S KotlinDebug\n*F\n+ 1 MediaPlayManager.kt\ncom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2\n*L\n71#1:147,11\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $path:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/audio_play/MediaPlayManager;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    iput-object p2, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->$path:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->$path:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;-><init>(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->$path:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->IO(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->XOO0ii0(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Landroid/media/MediaPlayer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-static {p1, v2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OIX0iXi(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Landroid/media/MediaPlayer;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->$path:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->L$1:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->I$0:I

    iput v3, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->label:I

    new-instance v4, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {p0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v5

    invoke-direct {v4, v5, v3}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {v4}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v5, Landroid/media/MediaPlayer;

    invoke-direct {v5}, Landroid/media/MediaPlayer;-><init>()V

    new-instance v6, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v6}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v6, v3}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/media/MediaPlayer;->setAudioAttributes(Landroid/media/AudioAttributes;)V

    invoke-virtual {v5, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$XIi00iiXO;

    invoke-direct {v3, v5}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$XIi00iiXO;-><init>(Landroid/media/MediaPlayer;)V

    invoke-virtual {v5, v3}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    new-instance v3, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$iO;

    invoke-direct {v3, v4}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$iO;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;)V

    invoke-virtual {v5, v3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    new-instance v3, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$XO0O10;

    invoke-direct {v3, v4}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$XO0O10;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;)V

    invoke-virtual {v5, v3}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->prepareAsync()V

    invoke-static {p1, v5}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OIX0iXi(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Landroid/media/MediaPlayer;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->I0IIOi(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v6

    new-instance v9, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;

    invoke-direct {v9, v4, p1, v1, v2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    new-instance p1, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$OXO1;

    invoke-direct {p1, v5}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$OXO1;-><init>(Landroid/media/MediaPlayer;)V

    invoke-interface {v4, p1}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_3

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-static {p1, v2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->IO(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
