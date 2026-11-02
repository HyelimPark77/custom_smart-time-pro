.class public final enum Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PlayState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

.field public static final enum paused:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

.field public static final enum playing:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

.field public static final enum stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;


# direct methods
.method private static synthetic $values()[Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;
    .locals 3

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    sget-object v1, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->playing:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    sget-object v2, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->paused:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    filled-new-array {v0, v1, v2}, [Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    const-string v1, "stopped"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->stopped:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    new-instance v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    const-string v1, "playing"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->playing:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    new-instance v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    const-string v1, "paused"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->paused:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->$values()[Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->$VALUES:[Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "$enum$name",
            "$enum$ordinal"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8000
        }
        names = {
            "name"
        }
    .end annotation

    const-class v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->$VALUES:[Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    invoke-virtual {v0}, [Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$PlayState;

    return-object v0
.end method
