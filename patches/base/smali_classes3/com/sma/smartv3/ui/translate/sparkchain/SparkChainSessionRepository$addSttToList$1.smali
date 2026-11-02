.class final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainSessionRepository"
    f = "SparkChainSessionRepository.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xc0
    }
    m = "addSttToList"
    n = {
        "data",
        "sessionId",
        "requestId",
        "translate",
        "originText",
        "entity",
        "$this$withLock_u24default$iv",
        "createTime",
        "duration",
        "$i$f$withLock"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "J$0",
        "F$0",
        "I$0"
    }
    v = 0x1
.end annotation


# instance fields
.field F$0:F

.field I$0:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->label:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
