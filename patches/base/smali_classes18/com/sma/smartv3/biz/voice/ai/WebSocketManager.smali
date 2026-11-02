.class public final Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWebSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n774#2:655\n865#2,2:656\n1869#2,2:658\n1#3:660\n*S KotlinDebug\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n*L\n379#1:655\n379#1:656,2\n382#1:658,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWebSocketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,654:1\n774#2:655\n865#2,2:656\n1869#2,2:658\n1#3:660\n*S KotlinDebug\n*F\n+ 1 WebSocketManager.kt\ncom/sma/smartv3/biz/voice/ai/WebSocketManager\n*L\n379#1:655\n379#1:656,2\n382#1:658,2\n*E\n"
    }
.end annotation


# static fields
.field private static final AUDIO_BUFFER_TIMEOUT:J = 0xbb8L

.field private static final IDLE_TIMEOUT:J

.field public static final INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "WebSocketManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final audioBuffer:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;",
            ">;"
        }
    .end annotation
.end field

.field private static idleTimer:Ljava/util/Timer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static isInit:Z

.field private static isMuted:Z

.field private static isWsConnected:Z

.field private static isWsConnecting:Z

.field private static lastAudioTime:J

.field private static mApp:Landroid/app/Application;

.field private static final mFrameBytes:I

.field private static final mFrameDuration:I

.field private static final mFrameSize:I

.field private static mOnCallback:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mOpus:Lcom/smart/opus/SmartOpus;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mPcmPlayer:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mSessionId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static mToken:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mWsManager:Lcom/android/mltcode/paycertificationapi/n77;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static mWsStatusListener:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$mWsStatusListener$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static pendingMessage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    const-string v0, ""

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    const/16 v0, 0x14

    sput v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mFrameDuration:I

    mul-int/lit16 v0, v0, 0x3e80

    div-int/lit16 v0, v0, 0x3e8

    sput v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mFrameSize:I

    mul-int/lit8 v0, v0, 0x2

    sput v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mFrameBytes:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    const-wide/32 v0, 0x927c0

    sput-wide v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->IDLE_TIMEOUT:J

    new-instance v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$mWsStatusListener$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$mWsStatusListener$1;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsStatusListener:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$mWsStatusListener$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->initPlayer$lambda$0(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(ZZ)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->init$lambda$0(ZZ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkIdleTimeout(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->checkIdleTimeout()V

    return-void
.end method

.method public static final synthetic access$getMOpus$p()Lcom/smart/opus/SmartOpus;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOpus:Lcom/smart/opus/SmartOpus;

    return-object v0
.end method

.method public static final synthetic access$getMWsManager$p()Lcom/android/mltcode/paycertificationapi/n77;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    return-object v0
.end method

.method public static final synthetic access$isWsConnecting$p()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    return v0
.end method

.method public static final synthetic access$resetIdleTimer(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->resetIdleTimer()V

    return-void
.end method

.method public static final synthetic access$setMSessionId$p(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$updateConnectionState(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->updateConnectionState(Z)V

    return-void
.end method

.method private final checkIdleTimeout()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->lastAudioTime:J

    sub-long/2addr v0, v2

    sget-wide v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->IDLE_TIMEOUT:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WebSocketManager Idle timeout, unInitWsManager"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->unInitWsManager()V

    :cond_0
    return-void
.end method

.method public static synthetic iO(JLcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendAudioStreamWithBuffer$lambda$0$0(JLcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;)Z

    move-result p0

    return p0
.end method

.method public static synthetic init$default(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;Landroid/app/Application;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->init(Landroid/app/Application;Z)V

    return-void
.end method

.method private static final init$lambda$0(ZZ)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "sma-ai-pro-key"

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XiOIii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mToken:Ljava/lang/String;

    if-eqz p0, :cond_1

    sget-object p0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->initWsManager()V

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string p1, "WebSocketManager ak error"

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initPlayer$lambda$0(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WebSocketManager onPlayStateChanged "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->playing:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOnCallback:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;->onTtsStart()V

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    if-ne p0, v0, :cond_1

    sget-object p0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOnCallback:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;->onTtsStop()V

    :cond_1
    return-void
.end method

.method private final resetIdleTimer()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->lastAudioTime:J

    return-void
.end method

.method private static final sendAudioStreamWithBuffer$lambda$0$0(JLcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;->getTimestamp()J

    move-result-wide v0

    sub-long/2addr p0, v0

    const-wide/16 v0, 0xbb8

    cmp-long p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final sendBufferedAudio()V
    .locals 10

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;->getTimestamp()J

    move-result-wide v6

    sub-long v6, v1, v6

    const-wide/16 v8, 0xbb8

    cmp-long v6, v6, v8

    if-gtz v6, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WebSocketManager sendBufferedAudio -> total:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", valid:"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;

    sget-boolean v3, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnected:Z

    if-eqz v3, :cond_2

    sget-object v3, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;->getData()[B

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendAudioStream([B)V

    goto :goto_1

    :cond_3
    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method private final sendPendingMessage()V
    .locals 6

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->pendingMessage:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WebSocketManager sendPendingMessage "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sput-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->pendingMessage:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static synthetic sendStartListenMessage$default(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendStartListenMessage(Z)V

    return-void
.end method

.method private final startIdleTimer()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->stopIdleTimer()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WebSocketManager startIdleTimer"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    sput-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->idleTimer:Ljava/util/Timer;

    new-instance v3, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$startIdleTimer$1;

    invoke-direct {v3}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$startIdleTimer$1;-><init>()V

    const-wide/16 v4, 0x3e8

    const-wide/16 v6, 0x3e8

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method private final stopIdleTimer()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WebSocketManager stopIdleTimer"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->idleTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->idleTimer:Ljava/util/Timer;

    return-void
.end method

.method private final updateConnectionState(Z)V
    .locals 1

    sput-boolean p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnected:Z

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->startIdleTimer()V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendBufferedAudio()V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendPendingMessage()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->stopIdleTimer()V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WebSocketManager destroy"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->unInitWsManager()V

    return-void
.end method

.method public final encodeAudioStream([BI)[B
    .locals 2
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "pcmData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOpus:Lcom/smart/opus/SmartOpus;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/smart/opus/OpusConstants$FrameSize;->Companion:Lcom/smart/opus/OpusConstants$FrameSize$Companion;

    invoke-virtual {v1, p2}, Lcom/smart/opus/OpusConstants$FrameSize$Companion;->fromValue(I)Lcom/smart/opus/OpusConstants$FrameSize;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/smart/opus/SmartOpus;->encode([BLcom/smart/opus/OpusConstants$FrameSize;)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getAI_SERVER_URL()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://dev.iot-solution.net/kotlinweb"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "wss://ai-dev.iot-solution.net/xiaozhi/v1/"

    return-object v0

    :cond_0
    const-string v0, "wss://ai-c.iot-solution.net/xiaozhi/v1/"

    return-object v0
.end method

.method public final getMFrameBytes()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mFrameBytes:I

    return v0
.end method

.method public final getMFrameDuration()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mFrameDuration:I

    return v0
.end method

.method public final getMFrameSize()I
    .locals 1

    sget v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mFrameSize:I

    return v0
.end method

.method public final getMOnCallback()Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOnCallback:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;

    return-object v0
.end method

.method public final getMPcmPlayer()Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mPcmPlayer:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    return-object v0
.end method

.method public final init(Landroid/app/Application;Z)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isInit:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isInit:Z

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mApp:Landroid/app/Application;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WebSocketManager init"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Lcom/smart/opus/SmartOpus;

    invoke-direct {p1}, Lcom/smart/opus/SmartOpus;-><init>()V

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOpus:Lcom/smart/opus/SmartOpus;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WebSocketManager Opus -> init error\uff01\uff01\uff01"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->initPlayer()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mToken:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const-string v0, "sma-ai-pro-key"

    if-eqz p1, :cond_1

    sget-object p1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hw6;

    invoke-direct {v1, p2}, Lcom/android/mltcode/paycertificationapi/hw6;-><init>(Z)V

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->iIiiO(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->XiOIii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mToken:Ljava/lang/String;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->initWsManager()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final initPlayer()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOpus:Lcom/smart/opus/SmartOpus;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/smart/opus/OpusConstants$SampleRate;->Companion:Lcom/smart/opus/OpusConstants$SampleRate$Companion;

    invoke-virtual {v1}, Lcom/smart/opus/OpusConstants$SampleRate$Companion;->_16000()Lcom/smart/opus/OpusConstants$SampleRate;

    move-result-object v1

    sget-object v2, Lcom/smart/opus/OpusConstants$Channels;->Companion:Lcom/smart/opus/OpusConstants$Channels$Companion;

    invoke-virtual {v2}, Lcom/smart/opus/OpusConstants$Channels$Companion;->mono()Lcom/smart/opus/OpusConstants$Channels;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/smart/opus/SmartOpus;->decoderInit(Lcom/smart/opus/OpusConstants$SampleRate;Lcom/smart/opus/OpusConstants$Channels;)I

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOpus:Lcom/smart/opus/SmartOpus;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/smart/opus/OpusConstants$SampleRate;->Companion:Lcom/smart/opus/OpusConstants$SampleRate$Companion;

    invoke-virtual {v1}, Lcom/smart/opus/OpusConstants$SampleRate$Companion;->_16000()Lcom/smart/opus/OpusConstants$SampleRate;

    move-result-object v1

    sget-object v2, Lcom/smart/opus/OpusConstants$Channels;->Companion:Lcom/smart/opus/OpusConstants$Channels$Companion;

    invoke-virtual {v2}, Lcom/smart/opus/OpusConstants$Channels$Companion;->mono()Lcom/smart/opus/OpusConstants$Channels;

    move-result-object v2

    sget-object v3, Lcom/smart/opus/OpusConstants$Application;->Companion:Lcom/smart/opus/OpusConstants$Application$Companion;

    invoke-virtual {v3}, Lcom/smart/opus/OpusConstants$Application$Companion;->voip()Lcom/smart/opus/OpusConstants$Application;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/smart/opus/SmartOpus;->encoderInit(Lcom/smart/opus/OpusConstants$SampleRate;Lcom/smart/opus/OpusConstants$Channels;Lcom/smart/opus/OpusConstants$Application;)I

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mPcmPlayer:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    if-eqz v0, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->release()V

    :cond_2
    new-instance v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fw6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/fw6;-><init>()V

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;-><init>(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$OnListener;)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mPcmPlayer:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    const/16 v1, 0x3e80

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-virtual {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->init(III)V

    return-void
.end method

.method public final initWsManager()V
    .locals 11

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isInit:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v3, "getApp(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-static {p0, v0, v2, v3, v1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->init$default(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;Landroid/app/Application;ZILjava/lang/Object;)V

    return-void

    :cond_0
    sget-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    if-eqz v0, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_2

    const-string v3, "b7:ca:6b:ef:77:e2"

    :cond_2
    move-object v4, v3

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "WebSocketManager initWsManager -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mToken:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Bearer "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "Authorization"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const-string v5, "Protocol-Version"

    const-string v6, "1"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, ":"

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Device-Id"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const-string v5, "Client-Id"

    const-string v6, "web_test_client"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->OXO1(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    filled-new-array {v3, v10, v4, v5}, [Lkotlin/Pair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/OXO1;->XXX11i([Lkotlin/Pair;)Ljava/util/HashMap;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v4}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/n77;->OXO1()Z

    move-result v4

    if-ne v4, v0, :cond_4

    sget-object v4, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/n77;->XOO0ii0()V

    :cond_3
    sput-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    :cond_4
    new-instance v4, Lcom/android/mltcode/paycertificationapi/n77$O00;

    sget-object v5, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mApp:Landroid/app/Application;

    if-nez v5, :cond_5

    const-string v5, "mApp"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v5

    :goto_0
    invoke-direct {v4, v1}, Lcom/android/mltcode/paycertificationapi/n77$O00;-><init>(Landroid/content/Context;)V

    new-instance v1, Lokhttp3/OkHttpClient;

    invoke-direct {v1}, Lokhttp3/OkHttpClient;-><init>()V

    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    new-instance v5, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;

    sget-object v6, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;->OXO1:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;

    invoke-direct {v5, v6}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;-><init>(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$OXO1;)V

    sget-object v6, Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;->BODY:Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;

    invoke-virtual {v5, v6}, Lcom/sma/androidnetworklib/HttpLoggingInterceptor;->O00(Lcom/sma/androidnetworklib/HttpLoggingInterceptor$Level;)Lcom/sma/androidnetworklib/HttpLoggingInterceptor;

    sget-object v6, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v1, v5}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/n77$O00;->OIi0(Lokhttp3/OkHttpClient;)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77$O00;->XXI(Z)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->getAI_SERVER_URL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/n77$O00;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/n77$O00;->I0iXXO(Ljava/util/Map;)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/n77$O00;->IO(Z)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/n77$O00;->OIX0iXi(Z)Lcom/android/mltcode/paycertificationapi/n77$O00;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/n77$O00;->I0IIOi()Lcom/android/mltcode/paycertificationapi/n77;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_6

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsStatusListener:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$mWsStatusListener$1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/n77;->II1Xi0(Lcom/android/mltcode/paycertificationapi/q77;)V

    :cond_6
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/n77;->iO()V

    :cond_7
    :goto_1
    return-void
.end method

.method public final sendAbortListenMessage()V
    .locals 5

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "state"

    const-string v2, "abort"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "session_id"

    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WebSocketManager sendAbortListenMessage "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final sendAbortMessage()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "session_id"

    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v2, "abort"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "reason"

    const-string v2, "wake_word_detected"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebSocketManager sendAbortMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mPcmPlayer:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->stop()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final sendAudioStream([B)V
    .locals 3
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_0

    sget-object v1, Lokio/ByteString;->Companion:Lokio/ByteString$Companion;

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Lokio/ByteString$Companion;->of([B)Lokio/ByteString;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/n77;->XO0O10(Lokio/ByteString;)Z

    :cond_0
    return-void
.end method

.method public final sendAudioStreamWithBuffer([B)V
    .locals 5
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-boolean v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnected:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->sendAudioStream([B)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->resetIdleTimer()V

    return-void

    :cond_0
    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    monitor-enter v2

    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0xc8

    if-ge v3, v4, :cond_1

    new-instance v3, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;

    invoke-direct {v3, p1, v0, v1}, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;-><init>([BJ)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    new-instance v3, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;

    invoke-direct {v3, p1, v0, v1}, Lcom/sma/smartv3/biz/voice/ai/TimestampedAudioData;-><init>([BJ)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    new-instance p1, Lcom/android/mltcode/paycertificationapi/gw6;

    invoke-direct {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/gw6;-><init>(J)V

    invoke-static {v2, p1}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->iIX0i(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->initWsManager()V

    :cond_2
    return-void

    :goto_1
    monitor-exit v2

    throw p1
.end method

.method public final sendImageMessage(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "imgUrl"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "type"

    const-string v3, "listen"

    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "state"

    const-string v3, "detect"

    invoke-virtual {v2, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "source"

    invoke-virtual {v2, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v2, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "session_id"

    sget-object p2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "WebSocketManager sendImageMessage "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p1, :cond_0

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public final sendListenMessage()V
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "type"

    const-string v2, "listen"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "state"

    const-string v2, "start"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mode"

    const-string v2, "auto"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "session_id"

    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebSocketManager sendListenMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public final sendStartListenMessage(Z)V
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "type"

    const-string v2, "listen"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "state"

    const-string v2, "start"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    const-string p1, "auto"

    goto :goto_0

    :cond_0
    const-string p1, "manual"

    :goto_0
    const-string v1, "mode"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "session_id"

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebSocketManager sendStartListenMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final sendStopListenMessage()V
    .locals 5

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "type"

    const-string v2, "listen"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "state"

    const-string v2, "stop"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "session_id"

    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WebSocketManager sendStopListenMessage "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final sendTextMessage(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v1, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "type"

    const-string v2, "listen"

    invoke-virtual {v1, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "state"

    const-string v2, "detect"

    invoke-virtual {v1, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "source"

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnected:Z

    if-eqz p1, :cond_1

    sget-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebSocketManager sendTextMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->pendingMessage:Ljava/lang/String;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WebSocketManager sendTextMessage: Connection not ready, cached latest message"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-boolean p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->initWsManager()V

    :cond_2
    return-void
.end method

.method public final setMOnCallback(Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mOnCallback:Lcom/sma/smartv3/biz/voice/ai/WebSocketManager$OnCallback;

    return-void
.end method

.method public final setMPcmPlayer(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mPcmPlayer:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    return-void
.end method

.method public final stopSpeaking()V
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "type"

    const-string v2, "speak"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "state"

    const-string v2, "stop"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mode"

    const-string v2, "auto"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebSocketManager stopSpeaking "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method public final toggleMute()V
    .locals 4

    sget-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isMuted:Z

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isMuted:Z

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sget-boolean v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isMuted:Z

    if-eqz v1, :cond_0

    const-string v1, "voice_mute"

    goto :goto_0

    :cond_0
    const-string v1, "voice_unmute"

    :goto_0
    const-string v2, "type"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebSocketManager toggleMute "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/n77;->I0IIOi(Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method public final unInitWsManager()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "WebSocketManager unInitWsManager"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/n77;->XOO0ii0()V

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->mWsManager:Lcom/android/mltcode/paycertificationapi/n77;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnected:Z

    sput-boolean v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->isWsConnecting:Z

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->audioBuffer:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/ai/WebSocketManager;->stopIdleTimer()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
