.class public final Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/RecordingManager;->realTimeASRing([BII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AITranslation;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$getTAG$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " realTimeSendASRData handleError -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$cancelTimer(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$getRecordingCallback$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public handleResponse(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$cancelTimer(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    .line 3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$getTAG$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " realTimeSendASRData handleResponse -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$getRecordingCallback$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/model/AITranslation;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$realTimeASRing$1;->handleResponse(Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method
