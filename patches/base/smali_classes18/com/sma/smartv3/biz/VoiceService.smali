.class public final Lcom/sma/smartv3/biz/VoiceService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/VoiceService$OXO1;
    }
.end annotation


# static fields
.field public static final I1:Lcom/sma/smartv3/biz/VoiceService$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final X11iII1O1:Ljava/lang/String; = "ACTION_START"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final X1IX:Ljava/lang/String; = "ACTION_STOP_RECORDING"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXX11i:Ljava/lang/String; = "ACTION_START_RECORDING"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final iX1O1:I = 0x1


# instance fields
.field public final IO:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/VoiceService$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/VoiceService$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/VoiceService;->I1:Lcom/sma/smartv3/biz/VoiceService$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yj6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yj6;-><init>(Lcom/sma/smartv3/biz/VoiceService;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/biz/VoiceService;->IO:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/VoiceService;)Landroid/app/NotificationManager;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/VoiceService;->XO0O10(Lcom/sma/smartv3/biz/VoiceService;)Landroid/app/NotificationManager;

    move-result-object p0

    return-object p0
.end method

.method public static final XO0O10(Lcom/sma/smartv3/biz/VoiceService;)Landroid/app/NotificationManager;
    .locals 1

    const-string v0, "notification"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/NotificationManager;

    return-object p0
.end method


# virtual methods
.method public final O00()V
    .locals 6

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/VoiceService;->iO()Landroid/app/NotificationManager;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "voice_channel"

    const-string v4, "Voice Channel"

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v1, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const/16 v1, 0x1e

    const/4 v2, 0x1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/VoiceService;->XIi00iiXO()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x80

    invoke-static {p0, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/xj6;->OXO1(Lcom/sma/smartv3/biz/VoiceService;ILandroid/app/Notification;I)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/VoiceService;->XIi00iiXO()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startNotification  intent?.action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final XIi00iiXO()Landroid/app/Notification;
    .locals 2

    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "voice_channel"

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setChannelId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final iO()Landroid/app/NotificationManager;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/VoiceService;->IO:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 0

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onStartCommand  intent?.action  = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, p3

    :goto_1
    const-string v0, "ACTION_START"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/VoiceService;->O00()V

    goto :goto_3

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_3
    move-object p2, p3

    :goto_2
    const-string v0, "ACTION_START_RECORDING"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/VoiceService;->O00()V

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->startRecord()V

    goto :goto_3

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    :cond_5
    const-string p1, "ACTION_STOP_RECORDING"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->stopRecording()V

    :cond_6
    :goto_3
    const/4 p1, 0x1

    return p1
.end method
