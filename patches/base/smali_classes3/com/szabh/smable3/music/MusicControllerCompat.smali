.class public Lcom/szabh/smable3/music/MusicControllerCompat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/music/MusicControllerCompat$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/music/MusicControllerCompat$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final EXTRA_VOLUME_STREAM_TYPE:Ljava/lang/String; = "android.media.EXTRA_VOLUME_STREAM_TYPE"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final VOLUME_CHANGED_ACTION:Ljava/lang/String; = "android.media.VOLUME_CHANGED_ACTION"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mAudioManager:Landroid/media/AudioManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mReceiver$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/music/MusicControllerCompat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/music/MusicControllerCompat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/music/MusicControllerCompat;->Companion:Lcom/szabh/smable3/music/MusicControllerCompat$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hw0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hw0;-><init>(Lcom/szabh/smable3/music/MusicControllerCompat;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mReceiver$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OXO1(Lcom/szabh/smable3/music/MusicControllerCompat;)Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->mReceiver_delegate$lambda$0(Lcom/szabh/smable3/music/MusicControllerCompat;)Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;

    move-result-object p0

    return-object p0
.end method

.method private final getMReceiver()Landroid/content/BroadcastReceiver;
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mReceiver$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method private static final mReceiver_delegate$lambda$0(Lcom/szabh/smable3/music/MusicControllerCompat;)Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;
    .locals 1

    new-instance v0, Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;

    invoke-direct {v0, p0}, Lcom/szabh/smable3/music/MusicControllerCompat$mReceiver$2$1;-><init>(Lcom/szabh/smable3/music/MusicControllerCompat;)V

    return-object v0
.end method


# virtual methods
.method public exit()V
    .locals 2
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMReceiver()Landroid/content/BroadcastReceiver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final getMAudioManager()Landroid/media/AudioManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mAudioManager:Landroid/media/AudioManager;

    return-object v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getStreamMaxVolume(I)I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mAudioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0xf

    return p1
.end method

.method public final getStreamVolume(I)I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mAudioManager:Landroid/media/AudioManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public launch(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mContext:Landroid/content/Context;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const-string v2, "android.media.VOLUME_CHANGED_ACTION"

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMReceiver()Landroid/content/BroadcastReceiver;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2}, Landroidx/core/content/ContextCompat;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicControllerCompat;->getMReceiver()Landroid/content/BroadcastReceiver;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_0
    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mAudioManager:Landroid/media/AudioManager;

    return-void
.end method

.method public final setMAudioManager(Landroid/media/AudioManager;)V
    .locals 0
    .param p1    # Landroid/media/AudioManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mAudioManager:Landroid/media/AudioManager;

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/music/MusicControllerCompat;->mContext:Landroid/content/Context;

    return-void
.end method

.method public updateVolume()V
    .locals 0

    return-void
.end method
