.class public final enum Lcom/szabh/smable3/entity/MusicCommand;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/MusicCommand$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/MusicCommand;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/MusicCommand;

.field public static final Companion:Lcom/szabh/smable3/entity/MusicCommand$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum NEXT:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum PAUSE:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum PLAY:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum PRE:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum TOGGLE:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum UNKNOWN:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum VOLUME_DOWN:Lcom/szabh/smable3/entity/MusicCommand;

.field public static final enum VOLUME_UP:Lcom/szabh/smable3/entity/MusicCommand;


# instance fields
.field private final mCommand:B


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/MusicCommand;
    .locals 8

    sget-object v0, Lcom/szabh/smable3/entity/MusicCommand;->PLAY:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v1, Lcom/szabh/smable3/entity/MusicCommand;->PAUSE:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v2, Lcom/szabh/smable3/entity/MusicCommand;->TOGGLE:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v3, Lcom/szabh/smable3/entity/MusicCommand;->NEXT:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v4, Lcom/szabh/smable3/entity/MusicCommand;->PRE:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v5, Lcom/szabh/smable3/entity/MusicCommand;->VOLUME_UP:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v6, Lcom/szabh/smable3/entity/MusicCommand;->VOLUME_DOWN:Lcom/szabh/smable3/entity/MusicCommand;

    sget-object v7, Lcom/szabh/smable3/entity/MusicCommand;->UNKNOWN:Lcom/szabh/smable3/entity/MusicCommand;

    filled-new-array/range {v0 .. v7}, [Lcom/szabh/smable3/entity/MusicCommand;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "PLAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->PLAY:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "PAUSE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->PAUSE:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "TOGGLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->TOGGLE:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "NEXT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->NEXT:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "PRE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->PRE:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "VOLUME_UP"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->VOLUME_UP:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const-string v1, "VOLUME_DOWN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->VOLUME_DOWN:Lcom/szabh/smable3/entity/MusicCommand;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand;

    const/4 v1, 0x7

    const/4 v2, -0x1

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/MusicCommand;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->UNKNOWN:Lcom/szabh/smable3/entity/MusicCommand;

    invoke-static {}, Lcom/szabh/smable3/entity/MusicCommand;->$values()[Lcom/szabh/smable3/entity/MusicCommand;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->$VALUES:[Lcom/szabh/smable3/entity/MusicCommand;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/MusicCommand$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/MusicCommand$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/MusicCommand;->Companion:Lcom/szabh/smable3/entity/MusicCommand$Companion;

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

    iput-byte p3, p0, Lcom/szabh/smable3/entity/MusicCommand;->mCommand:B

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
            "Lcom/szabh/smable3/entity/MusicCommand;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/MusicCommand;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/MusicCommand;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/MusicCommand;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/MusicCommand;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/MusicCommand;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/MusicCommand;->$VALUES:[Lcom/szabh/smable3/entity/MusicCommand;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/MusicCommand;

    return-object v0
.end method


# virtual methods
.method public final getMCommand()B
    .locals 1

    iget-byte v0, p0, Lcom/szabh/smable3/entity/MusicCommand;->mCommand:B

    return v0
.end method
