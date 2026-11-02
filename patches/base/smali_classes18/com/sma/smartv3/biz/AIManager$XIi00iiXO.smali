.class public final Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/AIManager;->XXiIiX10(Lcom/sma/smartv3/model/AIQuestion;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/lang/StringBuilder;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/model/AIAnswer;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->OXO1:Ljava/lang/StringBuilder;

    iput-object p2, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/AIAnswer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEmotion(Ljava/lang/String;)V
    .locals 3

    const-string v0, "emotion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->Xi1XO00()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/AIAnswer;

    sget-object v2, Lcom/sma/smartv3/model/AIFunctionType;->DEVICE_EMOTION:Lcom/sma/smartv3/model/AIFunctionType;

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/AIAnswer;->setType(Lcom/sma/smartv3/model/AIFunctionType;)V

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/model/AIAnswer;->setText(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onSttText(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AIManager onSttText  text = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " , isFinal = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "  "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onTtsStart()V
    .locals 0

    return-void
.end method

.method public onTtsStop()V
    .locals 0

    return-void
.end method

.method public onTtsText(Ljava/lang/String;Z)V
    .locals 2

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AIManager onTtsText  text = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , isFinal = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->OXO1:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/AIAnswer;

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/model/AIAnswer;->setEnded(I)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/AIAnswer;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->OXO1:Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->OXO1:Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "..."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Lcom/sma/smartv3/model/AIAnswer;->setText(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AIManager;->iIiiO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/AIManager$XIi00iiXO;->XIi00iiXO:Lcom/sma/smartv3/model/AIAnswer;

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
