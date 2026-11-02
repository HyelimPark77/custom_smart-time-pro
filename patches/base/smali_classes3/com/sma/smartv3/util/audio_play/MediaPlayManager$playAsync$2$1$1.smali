.class final Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.util.audio_play.MediaPlayManager$playAsync$2$1$1"
    f = "MediaPlayManager.kt"
    i = {}
    l = {
        0x63
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $cont:Lcom/android/mltcode/paycertificationapi/IO0i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $path:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/IO0i;Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/sma/smartv3/util/audio_play/MediaPlayManager;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    iput-object p2, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    iput-object p3, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$path:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    iget-object v2, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$path:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;-><init>(Lcom/android/mltcode/paycertificationapi/IO0i;Lcom/sma/smartv3/util/audio_play/MediaPlayManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iput v2, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->label:I

    const-wide/16 v1, 0xbb8

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/IO0i;->isActive()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->this$0:Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    invoke-static {v0}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->OIi0(Lcom/sma/smartv3/util/audio_play/MediaPlayManager;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$path:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " \u64ad\u653e\u8d85\u65f6\uff0c\u81ea\u52a8\u7ed3\u675f: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/util/audio_play/MediaPlayManager$playAsync$2$1$1;->$cont:Lcom/android/mltcode/paycertificationapi/IO0i;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
