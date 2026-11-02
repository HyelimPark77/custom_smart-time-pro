.class public final Lcom/szabh/smable3/entity/BleVoice$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleVoice;
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
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleVoice$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCONTENT_MAX_LENGTH()I
    .locals 3

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMSupportVoiceMaxLength()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleCache;->getMDeviceInfo()Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMIOBufferSize()J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x400

    :goto_0
    add-int/lit8 v0, v0, -0x19

    return v0

    :cond_1
    const/16 v0, 0x200

    return v0
.end method
