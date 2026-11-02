.class public final Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/RecordingManager;
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
    invoke-direct {p0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$getInstance$cp()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    return-object v0
.end method

.method public final setInstance(Lcom/sma/smartv3/biz/voice/RecordingManager;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/voice/RecordingManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/biz/voice/RecordingManager;->access$setInstance$cp(Lcom/sma/smartv3/biz/voice/RecordingManager;)V

    return-void
.end method
