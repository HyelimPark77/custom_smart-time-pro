.class public final enum Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HealthIndex"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

.field public static final enum BLOOD_OXYGEN:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "6"
    .end annotation
.end field

.field public static final enum BLOOD_PRESSURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "1"
    .end annotation
.end field

.field public static final enum HEART_RATE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "3"
    .end annotation
.end field

.field public static final enum LOCATION:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "11"
    .end annotation
.end field

.field public static final enum STEP_COUNT:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "8"
    .end annotation
.end field

.field public static final enum TEMPERATURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "4"
    .end annotation
.end field

.field public static final enum WEIGHT:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "5"
    .end annotation
.end field


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .locals 7

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->BLOOD_PRESSURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    sget-object v1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->HEART_RATE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    sget-object v2, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->TEMPERATURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    sget-object v3, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->WEIGHT:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    sget-object v4, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->BLOOD_OXYGEN:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    sget-object v5, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->STEP_COUNT:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    sget-object v6, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->LOCATION:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    filled-new-array/range {v0 .. v6}, [Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x0

    const-string v2, "1"

    const-string v3, "BLOOD_PRESSURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->BLOOD_PRESSURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x1

    const-string v2, "3"

    const-string v3, "HEART_RATE"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->HEART_RATE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x2

    const-string v2, "4"

    const-string v3, "TEMPERATURE"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->TEMPERATURE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x3

    const-string v2, "5"

    const-string v3, "WEIGHT"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->WEIGHT:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x4

    const-string v2, "6"

    const-string v3, "BLOOD_OXYGEN"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->BLOOD_OXYGEN:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x5

    const-string v2, "8"

    const-string v3, "STEP_COUNT"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->STEP_COUNT:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    const/4 v1, 0x6

    const-string v2, "11"

    const-string v3, "LOCATION"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->LOCATION:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->$values()[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->$VALUES:[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->value:Ljava/lang/String;

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
            "Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .locals 1

    const-class v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->$VALUES:[Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadHealthDataHYKY$HealthIndex;->value:Ljava/lang/String;

    return-object v0
.end method
