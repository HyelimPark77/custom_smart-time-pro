.class public final enum Lcom/sma/smartv3/model/PrayTimeType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/PrayTimeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/PrayTimeType;

.field public static final enum ASR:Lcom/sma/smartv3/model/PrayTimeType;

.field public static final enum DHUHR:Lcom/sma/smartv3/model/PrayTimeType;

.field public static final enum FAJR:Lcom/sma/smartv3/model/PrayTimeType;

.field public static final enum ISHA:Lcom/sma/smartv3/model/PrayTimeType;

.field public static final enum MAGHRIB:Lcom/sma/smartv3/model/PrayTimeType;

.field public static final enum SUNRISE:Lcom/sma/smartv3/model/PrayTimeType;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/PrayTimeType;
    .locals 6

    sget-object v0, Lcom/sma/smartv3/model/PrayTimeType;->FAJR:Lcom/sma/smartv3/model/PrayTimeType;

    sget-object v1, Lcom/sma/smartv3/model/PrayTimeType;->SUNRISE:Lcom/sma/smartv3/model/PrayTimeType;

    sget-object v2, Lcom/sma/smartv3/model/PrayTimeType;->DHUHR:Lcom/sma/smartv3/model/PrayTimeType;

    sget-object v3, Lcom/sma/smartv3/model/PrayTimeType;->ASR:Lcom/sma/smartv3/model/PrayTimeType;

    sget-object v4, Lcom/sma/smartv3/model/PrayTimeType;->MAGHRIB:Lcom/sma/smartv3/model/PrayTimeType;

    sget-object v5, Lcom/sma/smartv3/model/PrayTimeType;->ISHA:Lcom/sma/smartv3/model/PrayTimeType;

    filled-new-array/range {v0 .. v5}, [Lcom/sma/smartv3/model/PrayTimeType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/model/PrayTimeType;

    const-string v1, "FAJR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/PrayTimeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->FAJR:Lcom/sma/smartv3/model/PrayTimeType;

    new-instance v0, Lcom/sma/smartv3/model/PrayTimeType;

    const-string v1, "SUNRISE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/PrayTimeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->SUNRISE:Lcom/sma/smartv3/model/PrayTimeType;

    new-instance v0, Lcom/sma/smartv3/model/PrayTimeType;

    const-string v1, "DHUHR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/PrayTimeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->DHUHR:Lcom/sma/smartv3/model/PrayTimeType;

    new-instance v0, Lcom/sma/smartv3/model/PrayTimeType;

    const-string v1, "ASR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/PrayTimeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->ASR:Lcom/sma/smartv3/model/PrayTimeType;

    new-instance v0, Lcom/sma/smartv3/model/PrayTimeType;

    const-string v1, "MAGHRIB"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/PrayTimeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->MAGHRIB:Lcom/sma/smartv3/model/PrayTimeType;

    new-instance v0, Lcom/sma/smartv3/model/PrayTimeType;

    const-string v1, "ISHA"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/PrayTimeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->ISHA:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-static {}, Lcom/sma/smartv3/model/PrayTimeType;->$values()[Lcom/sma/smartv3/model/PrayTimeType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->$VALUES:[Lcom/sma/smartv3/model/PrayTimeType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/PrayTimeType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/model/PrayTimeType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/PrayTimeType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/PrayTimeType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/PrayTimeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/PrayTimeType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/PrayTimeType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/PrayTimeType;->$VALUES:[Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/PrayTimeType;

    return-object v0
.end method
