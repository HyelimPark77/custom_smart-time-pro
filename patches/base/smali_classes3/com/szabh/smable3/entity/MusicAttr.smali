.class public final enum Lcom/szabh/smable3/entity/MusicAttr;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/MusicAttr$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/MusicAttr;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/MusicAttr;

.field public static final Companion:Lcom/szabh/smable3/entity/MusicAttr$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum PLAYER_NAME:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum PLAYER_VOLUME:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum QUEUE_COUNT:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum QUEUE_INDEX:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum QUEUE_REPEAT_MODE:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum QUEUE_SHUFFLE_MODE:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

.field public static final enum UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;


# instance fields
.field private final mAttr:B


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/MusicAttr;
    .locals 12

    sget-object v0, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_NAME:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v1, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v2, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_VOLUME:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v3, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_INDEX:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v4, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_COUNT:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v5, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_SHUFFLE_MODE:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v6, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_REPEAT_MODE:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v7, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v8, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v9, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v10, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

    sget-object v11, Lcom/szabh/smable3/entity/MusicAttr;->UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;

    filled-new-array/range {v0 .. v11}, [Lcom/szabh/smable3/entity/MusicAttr;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "PLAYER_NAME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_NAME:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "PLAYER_PLAYBACK_INFO"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_PLAYBACK_INFO:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "PLAYER_VOLUME"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->PLAYER_VOLUME:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "QUEUE_INDEX"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5, v2}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_INDEX:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "QUEUE_COUNT"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6, v3}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_COUNT:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "QUEUE_SHUFFLE_MODE"

    const/4 v6, 0x5

    invoke-direct {v0, v1, v6, v4}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_SHUFFLE_MODE:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "QUEUE_REPEAT_MODE"

    const/4 v6, 0x6

    invoke-direct {v0, v1, v6, v5}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->QUEUE_REPEAT_MODE:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "TRACK_ARTIST"

    const/4 v6, 0x7

    invoke-direct {v0, v1, v6, v2}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ARTIST:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "TRACK_ALBUM"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_ALBUM:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "TRACK_TITLE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v4}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_TITLE:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const-string v1, "TRACK_DURATION"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v5}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->TRACK_DURATION:Lcom/szabh/smable3/entity/MusicAttr;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr;

    const/16 v1, 0xb

    const/4 v2, -0x1

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/MusicAttr;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->UNKNOWN:Lcom/szabh/smable3/entity/MusicAttr;

    invoke-static {}, Lcom/szabh/smable3/entity/MusicAttr;->$values()[Lcom/szabh/smable3/entity/MusicAttr;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->$VALUES:[Lcom/szabh/smable3/entity/MusicAttr;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/MusicAttr$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/MusicAttr$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicAttr;->Companion:Lcom/szabh/smable3/entity/MusicAttr$Companion;

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

    iput-byte p3, p0, Lcom/szabh/smable3/entity/MusicAttr;->mAttr:B

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
            "Lcom/szabh/smable3/entity/MusicAttr;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/MusicAttr;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/MusicAttr;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/MusicAttr;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/MusicAttr;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/MusicAttr;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/MusicAttr;->$VALUES:[Lcom/szabh/smable3/entity/MusicAttr;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/MusicAttr;

    return-object v0
.end method


# virtual methods
.method public final getMAttr()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/entity/MusicAttr;->mAttr:B

    return v0
.end method
