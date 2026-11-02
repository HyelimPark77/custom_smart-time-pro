.class public final enum Lcom/szabh/smable3/entity/PlaybackState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/PlaybackState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/PlaybackState;

.field public static final enum FAST_FORWARDING:Lcom/szabh/smable3/entity/PlaybackState;

.field public static final enum PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

.field public static final enum PLAYING:Lcom/szabh/smable3/entity/PlaybackState;

.field public static final enum REWINDING:Lcom/szabh/smable3/entity/PlaybackState;

.field public static final enum UNKNOWN:Lcom/szabh/smable3/entity/PlaybackState;


# instance fields
.field private final mState:B


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/PlaybackState;
    .locals 5

    sget-object v0, Lcom/szabh/smable3/entity/PlaybackState;->PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

    sget-object v1, Lcom/szabh/smable3/entity/PlaybackState;->PLAYING:Lcom/szabh/smable3/entity/PlaybackState;

    sget-object v2, Lcom/szabh/smable3/entity/PlaybackState;->REWINDING:Lcom/szabh/smable3/entity/PlaybackState;

    sget-object v3, Lcom/szabh/smable3/entity/PlaybackState;->FAST_FORWARDING:Lcom/szabh/smable3/entity/PlaybackState;

    sget-object v4, Lcom/szabh/smable3/entity/PlaybackState;->UNKNOWN:Lcom/szabh/smable3/entity/PlaybackState;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/szabh/smable3/entity/PlaybackState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/PlaybackState;

    const-string v1, "PAUSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/PlaybackState;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->PAUSED:Lcom/szabh/smable3/entity/PlaybackState;

    new-instance v0, Lcom/szabh/smable3/entity/PlaybackState;

    const-string v1, "PLAYING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/PlaybackState;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->PLAYING:Lcom/szabh/smable3/entity/PlaybackState;

    new-instance v0, Lcom/szabh/smable3/entity/PlaybackState;

    const-string v1, "REWINDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/PlaybackState;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->REWINDING:Lcom/szabh/smable3/entity/PlaybackState;

    new-instance v0, Lcom/szabh/smable3/entity/PlaybackState;

    const-string v1, "FAST_FORWARDING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/PlaybackState;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->FAST_FORWARDING:Lcom/szabh/smable3/entity/PlaybackState;

    new-instance v0, Lcom/szabh/smable3/entity/PlaybackState;

    const/4 v1, 0x4

    const/4 v2, -0x1

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/PlaybackState;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->UNKNOWN:Lcom/szabh/smable3/entity/PlaybackState;

    invoke-static {}, Lcom/szabh/smable3/entity/PlaybackState;->$values()[Lcom/szabh/smable3/entity/PlaybackState;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->$VALUES:[Lcom/szabh/smable3/entity/PlaybackState;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/PlaybackState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/szabh/smable3/entity/PlaybackState;->mState:B

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/szabh/smable3/entity/PlaybackState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/PlaybackState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/PlaybackState;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/PlaybackState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/PlaybackState;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/PlaybackState;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/PlaybackState;->$VALUES:[Lcom/szabh/smable3/entity/PlaybackState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/PlaybackState;

    return-object v0
.end method


# virtual methods
.method public final getMState()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/entity/PlaybackState;->mState:B

    return v0
.end method
