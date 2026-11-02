.class public final enum Lcom/sma/smartv3/ui/sport/SportDataType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/sport/SportDataType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum ALTITUDE:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum CALORIES:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum HEARTRATE:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum SPEED:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum SPM:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum STEP:Lcom/sma/smartv3/ui/sport/SportDataType;

.field public static final enum TIME:Lcom/sma/smartv3/ui/sport/SportDataType;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/ui/sport/SportDataType;
    .locals 9

    sget-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->TIME:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v1, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v2, Lcom/sma/smartv3/ui/sport/SportDataType;->CALORIES:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v3, Lcom/sma/smartv3/ui/sport/SportDataType;->STEP:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v4, Lcom/sma/smartv3/ui/sport/SportDataType;->SPM:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v5, Lcom/sma/smartv3/ui/sport/SportDataType;->PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v6, Lcom/sma/smartv3/ui/sport/SportDataType;->SPEED:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v7, Lcom/sma/smartv3/ui/sport/SportDataType;->ALTITUDE:Lcom/sma/smartv3/ui/sport/SportDataType;

    sget-object v8, Lcom/sma/smartv3/ui/sport/SportDataType;->HEARTRATE:Lcom/sma/smartv3/ui/sport/SportDataType;

    filled-new-array/range {v0 .. v8}, [Lcom/sma/smartv3/ui/sport/SportDataType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "TIME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->TIME:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "DISTANCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->DISTANCE:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "CALORIES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->CALORIES:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "STEP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->STEP:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "SPM"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->SPM:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "PACE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->PACE:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "SPEED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->SPEED:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "ALTITUDE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->ALTITUDE:Lcom/sma/smartv3/ui/sport/SportDataType;

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    const-string v1, "HEARTRATE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->HEARTRATE:Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDataType;->$values()[Lcom/sma/smartv3/ui/sport/SportDataType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->$VALUES:[Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/ui/sport/SportDataType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/sport/SportDataType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/sport/SportDataType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/sport/SportDataType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/sport/SportDataType;->$VALUES:[Lcom/sma/smartv3/ui/sport/SportDataType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/sport/SportDataType;

    return-object v0
.end method
