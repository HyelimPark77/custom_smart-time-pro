.class public final Lcom/szabh/smable3/music/MusicController$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/music/MusicController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicController$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getState(Lcom/szabh/smable3/music/MusicController$Companion;Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/szabh/smable3/music/MusicController$Companion;->getState(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getState(Landroid/support/v4/media/session/PlaybackStateCompat;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/support/v4/media/session/PlaybackStateCompat;->getState()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const-string p1, "OTHER"

    return-object p1

    :cond_1
    const-string p1, "STATE_REWINDING"

    return-object p1

    :cond_2
    const-string p1, "STATE_FAST_FORWARDING"

    return-object p1

    :cond_3
    const-string p1, "STATE_PLAYING"

    return-object p1

    :cond_4
    const-string p1, "STATE_PAUSED"

    return-object p1

    :cond_5
    const-string p1, "STATE_STOPPED"

    return-object p1
.end method
