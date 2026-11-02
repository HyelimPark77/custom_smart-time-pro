.class public final Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/ChatWithQWManager;->OIi0(Ljava/lang/String;)V
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
.field public final synthetic OXO1:Lcom/google/gson/Gson;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

.field public final synthetic XO0O10:Lcom/sma/smartv3/model/AiChatQuestionData;

.field public final synthetic iO:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;Lcom/sma/smartv3/util/ChatWithQWManager;Ljava/lang/StringBuilder;Lcom/sma/smartv3/model/AiChatQuestionData;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->OXO1:Lcom/google/gson/Gson;

    iput-object p2, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    iput-object p3, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->iO:Ljava/lang/StringBuilder;

    iput-object p4, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XO0O10:Lcom/sma/smartv3/model/AiChatQuestionData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->OXO1:Lcom/google/gson/Gson;

    const-class v3, Lcom/sma/androidnetworklib/model/Response;

    new-array v4, v1, [Ljava/lang/reflect/Type;

    const-class v5, Lcom/sma/smartv3/model/AiChatAnswerData;

    aput-object v5, v4, v0

    invoke-static {v3, v4}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.sma.androidnetworklib.model.Response<com.sma.smartv3.model.AiChatAnswerData>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getData()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getCode()I

    move-result v1

    const/16 v3, 0xfa6

    if-eq v1, v3, :cond_1

    const/16 v3, 0xfa9

    if-eq v1, v3, :cond_0

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getMesg()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getMesg()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getMesg()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    :pswitch_0
    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v2}, Lcom/sma/smartv3/util/ChatWithQWManager;->XIi00iiXO(Lcom/sma/smartv3/util/ChatWithQWManager;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Response Message:"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v1}, Lcom/sma/smartv3/util/ChatWithQWManager;->XO0O10(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$OXO1;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$OXO1;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v2}, Lcom/sma/androidnetworklib/model/Response;->getData()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/sma/smartv3/model/AiChatAnswerData;

    if-eqz v2, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->iO:Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    iget-object v4, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XO0O10:Lcom/sma/smartv3/model/AiChatQuestionData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AiChatAnswerData;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AiChatAnswerData;->getEnded()I

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v10, "toString(...)"

    if-ne v5, v1, :cond_3

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/sma/smartv3/model/AiChatQuestionData;->copy$default(Lcom/sma/smartv3/model/AiChatQuestionData;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/AiChatQuestionData;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/util/ChatWithQWManager;->OIX0iXi(Lcom/sma/smartv3/model/AiChatQuestionData;)V

    :cond_3
    invoke-static {v3}, Lcom/sma/smartv3/util/ChatWithQWManager;->iO(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/model/AiChatAnswerData;->copy$default(Lcom/sma/smartv3/model/AiChatAnswerData;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/model/AiChatAnswerData;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v0}, Lcom/sma/smartv3/util/ChatWithQWManager;->XO0O10(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$XIi00iiXO;->OXO1:Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$XIi00iiXO;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    if-nez p1, :cond_5

    const-string p1, "null"

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v0}, Lcom/sma/smartv3/util/ChatWithQWManager;->XO0O10(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$OXO1;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$OXO1;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1389
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v1}, Lcom/sma/smartv3/util/ChatWithQWManager;->XIi00iiXO(Lcom/sma/smartv3/util/ChatWithQWManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  handleError-> error:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->XIi00iiXO:Lcom/sma/smartv3/util/ChatWithQWManager;

    invoke-static {v0}, Lcom/sma/smartv3/util/ChatWithQWManager;->XO0O10(Lcom/sma/smartv3/util/ChatWithQWManager;)Lcom/android/mltcode/paycertificationapi/ty0;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$OXO1;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/Iii1I$OXO1$OXO1;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/ty0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/util/ChatWithQWManager$sendText$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
