.class public final Lcom/sma/smartv3/biz/AIManager$oldAIChat$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AIManager;->X11iII1O1(Lcom/sma/smartv3/model/AIQuestion;IILjava/lang/String;)V
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
.field public final synthetic OXO1:Ljava/lang/StringBuilder;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;Lcom/sma/smartv3/model/AIQuestion;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AIManager$oldAIChat$1;->OXO1:Ljava/lang/StringBuilder;

    iput-object p2, p0, Lcom/sma/smartv3/biz/AIManager$oldAIChat$1;->XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "toString(...)"

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AIManager oldAIChat line -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/androidnetworklib/model/Response;

    new-array v5, v1, [Ljava/lang/reflect/Type;

    const-class v6, Lcom/sma/smartv3/model/AIAnswer;

    aput-object v6, v5, v0

    invoke-static {v4, v5}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<com.sma.smartv3.model.AIAnswer>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getData()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getCode()I

    move-result v1

    const/16 v2, 0xfa6

    if-eq v1, v2, :cond_1

    const/16 v2, 0xfa9

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getMesg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception v0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getMesg()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getMesg()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void

    :cond_1
    :pswitch_0
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {v3}, Lcom/sma/androidnetworklib/model/Response;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/AIAnswer;

    if-eqz v0, :cond_5

    iget-object v3, p0, Lcom/sma/smartv3/biz/AIManager$oldAIChat$1;->OXO1:Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/sma/smartv3/biz/AIManager$oldAIChat$1;->XIi00iiXO:Lcom/sma/smartv3/model/AIQuestion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AIQuestion;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/model/AIAnswer;->setType(Lcom/sma/smartv3/model/AIFunctionType;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/model/AIAnswer;->setText(Ljava/lang/String;)V

    sget-object v4, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-interface {v5, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result v0

    if-ne v0, v1, :cond_5

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v4, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "oldAIChat"

    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    if-nez p1, :cond_4

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "AIManager oldAIChat -> error: empty"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string v0, "null"

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1389
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iX1O1()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AIManager oldAIChat -> error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/AIManager$oldAIChat$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
