.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->AIGC_AIChat(Lcom/sma/smartv3/model/AIQuestion;Ljava/lang/String;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

.field public final synthetic XO0O10:Ljava/lang/StringBuilder;

.field public final synthetic iO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Lcom/sma/smartv3/model/AIQuestion;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->iO:Ljava/lang/String;

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->XO0O10:Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$getTAG$p(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " AIChat line -> "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/androidnetworklib/model/Response;

    new-array v4, v0, [Ljava/lang/reflect/Type;

    const-class v5, Lcom/sma/smartv3/model/AIAnswer;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<com.sma.smartv3.model.AIAnswer>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {p1}, Lcom/sma/androidnetworklib/model/Response;->getData()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIQuestion;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->iO:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->createJobV2(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/androidnetworklib/model/Response;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/AIAnswer;

    if-eqz p1, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->XO0O10:Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->iO:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result p1

    if-ne p1, v0, :cond_1

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$getTAG$p(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " AIGC_AIChat -> answer.toString() = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1, v4}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->createJobV2(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$getTAG$p(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AIChat -> error: empty  e = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIQuestion;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->iO:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->createJobV2(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->access$getTAG$p(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AIChat -> error:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIQuestion;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->iO:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->createJobV2(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$AIGC_AIChat$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
