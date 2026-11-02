.class public final enum Lcom/sma/smartv3/util/TimePeriod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/util/TimePeriod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum ALL:Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum DAY:Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum HALF_HOUR:Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum HOUR:Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum MONTH:Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum WEEK:Lcom/sma/smartv3/util/TimePeriod;

.field public static final enum YEAR:Lcom/sma/smartv3/util/TimePeriod;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/util/TimePeriod;
    .locals 7

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->HALF_HOUR:Lcom/sma/smartv3/util/TimePeriod;

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->HOUR:Lcom/sma/smartv3/util/TimePeriod;

    sget-object v2, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    sget-object v3, Lcom/sma/smartv3/util/TimePeriod;->WEEK:Lcom/sma/smartv3/util/TimePeriod;

    sget-object v4, Lcom/sma/smartv3/util/TimePeriod;->MONTH:Lcom/sma/smartv3/util/TimePeriod;

    sget-object v5, Lcom/sma/smartv3/util/TimePeriod;->YEAR:Lcom/sma/smartv3/util/TimePeriod;

    sget-object v6, Lcom/sma/smartv3/util/TimePeriod;->ALL:Lcom/sma/smartv3/util/TimePeriod;

    filled-new-array/range {v0 .. v6}, [Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "HALF_HOUR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->HALF_HOUR:Lcom/sma/smartv3/util/TimePeriod;

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "HOUR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->HOUR:Lcom/sma/smartv3/util/TimePeriod;

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "DAY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "WEEK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->WEEK:Lcom/sma/smartv3/util/TimePeriod;

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "MONTH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->MONTH:Lcom/sma/smartv3/util/TimePeriod;

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "YEAR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->YEAR:Lcom/sma/smartv3/util/TimePeriod;

    new-instance v0, Lcom/sma/smartv3/util/TimePeriod;

    const-string v1, "ALL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/util/TimePeriod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->ALL:Lcom/sma/smartv3/util/TimePeriod;

    invoke-static {}, Lcom/sma/smartv3/util/TimePeriod;->$values()[Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->$VALUES:[Lcom/sma/smartv3/util/TimePeriod;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/util/TimePeriod;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/util/TimePeriod;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/util/TimePeriod;
    .locals 1

    const-class v0, Lcom/sma/smartv3/util/TimePeriod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/util/TimePeriod;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/util/TimePeriod;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->$VALUES:[Lcom/sma/smartv3/util/TimePeriod;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/util/TimePeriod;

    return-object v0
.end method
