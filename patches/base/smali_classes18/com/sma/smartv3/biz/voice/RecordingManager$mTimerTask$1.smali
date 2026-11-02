.class public final Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/RecordingManager;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-static {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$getTAG$p(Lcom/sma/smartv3/biz/voice/RecordingManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " timeout to stop timer"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    sget-object v0, Lcom/sma/smartv3/biz/AISparkChainManager;->OXO1:Lcom/sma/smartv3/biz/AISparkChainManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AISparkChainManager;->O0O0X0iOi()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/RecordingManager$mTimerTask$1;->this$0:Lcom/sma/smartv3/biz/voice/RecordingManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    sget-object v0, Lcom/sma/smartv3/biz/VoiceService;->I1:Lcom/sma/smartv3/biz/VoiceService$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/VoiceService$OXO1;->XO0O10()V

    return-void
.end method
