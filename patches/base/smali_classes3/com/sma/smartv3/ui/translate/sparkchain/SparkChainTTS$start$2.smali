.class final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->I0IIOi(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainTTS$start$2"
    f = "SparkChainTTS.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $contentText:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->$contentText:Ljava/lang/String;

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

    new-instance p1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->$contentText:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Lcom/iflytek/sparkchain/core/tts/OnlineTTS;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->$contentText:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS$start$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;

    invoke-static {v1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainTTS;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/iflytek/sparkchain/core/tts/TTS;->aRun(Ljava/lang/String;Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->IiI10X(I)Ljava/lang/Integer;

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
