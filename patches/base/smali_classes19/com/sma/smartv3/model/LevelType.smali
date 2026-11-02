.class public final enum Lcom/sma/smartv3/model/LevelType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/LevelType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/LevelType;

.field public static final enum ALL:Lcom/sma/smartv3/model/LevelType;

.field public static final enum HIGH:Lcom/sma/smartv3/model/LevelType;

.field public static final enum LOW:Lcom/sma/smartv3/model/LevelType;

.field public static final enum STANDARD:Lcom/sma/smartv3/model/LevelType;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/LevelType;
    .locals 4

    sget-object v0, Lcom/sma/smartv3/model/LevelType;->ALL:Lcom/sma/smartv3/model/LevelType;

    sget-object v1, Lcom/sma/smartv3/model/LevelType;->STANDARD:Lcom/sma/smartv3/model/LevelType;

    sget-object v2, Lcom/sma/smartv3/model/LevelType;->LOW:Lcom/sma/smartv3/model/LevelType;

    sget-object v3, Lcom/sma/smartv3/model/LevelType;->HIGH:Lcom/sma/smartv3/model/LevelType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/sma/smartv3/model/LevelType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/model/LevelType;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/LevelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/LevelType;->ALL:Lcom/sma/smartv3/model/LevelType;

    new-instance v0, Lcom/sma/smartv3/model/LevelType;

    const-string v1, "STANDARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/LevelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/LevelType;->STANDARD:Lcom/sma/smartv3/model/LevelType;

    new-instance v0, Lcom/sma/smartv3/model/LevelType;

    const-string v1, "LOW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/LevelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/LevelType;->LOW:Lcom/sma/smartv3/model/LevelType;

    new-instance v0, Lcom/sma/smartv3/model/LevelType;

    const-string v1, "HIGH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/LevelType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/LevelType;->HIGH:Lcom/sma/smartv3/model/LevelType;

    invoke-static {}, Lcom/sma/smartv3/model/LevelType;->$values()[Lcom/sma/smartv3/model/LevelType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/LevelType;->$VALUES:[Lcom/sma/smartv3/model/LevelType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/LevelType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
            "Lcom/sma/smartv3/model/LevelType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/LevelType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/LevelType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/LevelType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/LevelType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/LevelType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/LevelType;->$VALUES:[Lcom/sma/smartv3/model/LevelType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/LevelType;

    return-object v0
.end method
