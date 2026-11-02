.class public final Lcom/sma/smartv3/biz/voice/VoiceManager$pollCheckStop$timerTask$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/VoiceManager;->pollCheckStop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $timer:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Ljava/util/Timer;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$pollCheckStop$timerTask$1;->$timer:Ljava/util/Timer;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$getMFullRunner$p()Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$getMFullRunner$p()Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$setRealTimeRunning$p(Z)V

    :cond_0
    invoke-static {}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$isRealTimeRunning$p()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/VoiceManager$pollCheckStop$timerTask$1;->$timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->access$stopRealTime(Lcom/sma/smartv3/biz/voice/VoiceManager;)V

    :cond_1
    return-void
.end method
