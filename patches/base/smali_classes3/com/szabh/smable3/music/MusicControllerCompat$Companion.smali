.class public final Lcom/szabh/smable3/music/MusicControllerCompat$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/music/MusicControllerCompat;
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
    invoke-direct {p0}, Lcom/szabh/smable3/music/MusicControllerCompat$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newInstance()Lcom/szabh/smable3/music/MusicControllerCompat;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/music/MusicController;

    invoke-direct {v0}, Lcom/szabh/smable3/music/MusicController;-><init>()V

    return-object v0
.end method
