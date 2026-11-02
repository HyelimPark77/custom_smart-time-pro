.class public final Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/service/SuspendWindowService;->sendChainAiTranslationResultInput(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/service/SuspendWindowService;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    const-string v1, "cn"

    invoke-virtual {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTargetLang()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Lcom/sma/smartv3/service/SuspendWindowService;->access$translateITS(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " handleError error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService$sendChainAiTranslationResultInput$2;->OXO1(Ljava/lang/String;)V

    return-void
.end method
