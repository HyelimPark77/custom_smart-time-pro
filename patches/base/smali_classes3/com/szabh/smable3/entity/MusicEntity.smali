.class public final enum Lcom/szabh/smable3/entity/MusicEntity;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/MusicEntity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/MusicEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/MusicEntity;

.field public static final Companion:Lcom/szabh/smable3/entity/MusicEntity$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

.field public static final enum QUEUE:Lcom/szabh/smable3/entity/MusicEntity;

.field public static final enum TRACK:Lcom/szabh/smable3/entity/MusicEntity;

.field public static final enum UNKNOWN:Lcom/szabh/smable3/entity/MusicEntity;


# instance fields
.field private final mEntity:B


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/MusicEntity;
    .locals 4

    sget-object v0, Lcom/szabh/smable3/entity/MusicEntity;->PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v1, Lcom/szabh/smable3/entity/MusicEntity;->QUEUE:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v2, Lcom/szabh/smable3/entity/MusicEntity;->TRACK:Lcom/szabh/smable3/entity/MusicEntity;

    sget-object v3, Lcom/szabh/smable3/entity/MusicEntity;->UNKNOWN:Lcom/szabh/smable3/entity/MusicEntity;

    filled-new-array {v0, v1, v2, v3}, [Lcom/szabh/smable3/entity/MusicEntity;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/MusicEntity;

    const-string v1, "PLAYER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicEntity;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->PLAYER:Lcom/szabh/smable3/entity/MusicEntity;

    new-instance v0, Lcom/szabh/smable3/entity/MusicEntity;

    const-string v1, "QUEUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicEntity;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->QUEUE:Lcom/szabh/smable3/entity/MusicEntity;

    new-instance v0, Lcom/szabh/smable3/entity/MusicEntity;

    const-string v1, "TRACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicEntity;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->TRACK:Lcom/szabh/smable3/entity/MusicEntity;

    new-instance v0, Lcom/szabh/smable3/entity/MusicEntity;

    const/4 v1, 0x3

    const/4 v2, -0x1

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/MusicEntity;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->UNKNOWN:Lcom/szabh/smable3/entity/MusicEntity;

    invoke-static {}, Lcom/szabh/smable3/entity/MusicEntity;->$values()[Lcom/szabh/smable3/entity/MusicEntity;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->$VALUES:[Lcom/szabh/smable3/entity/MusicEntity;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/MusicEntity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/MusicEntity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicEntity;->Companion:Lcom/szabh/smable3/entity/MusicEntity$Companion;

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

    iput-byte p3, p0, Lcom/szabh/smable3/entity/MusicEntity;->mEntity:B

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
            "Lcom/szabh/smable3/entity/MusicEntity;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/MusicEntity;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/MusicEntity;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/MusicEntity;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/MusicEntity;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/MusicEntity;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/MusicEntity;->$VALUES:[Lcom/szabh/smable3/entity/MusicEntity;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/MusicEntity;

    return-object v0
.end method


# virtual methods
.method public final getMEntity()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/entity/MusicEntity;->mEntity:B

    return v0
.end method
