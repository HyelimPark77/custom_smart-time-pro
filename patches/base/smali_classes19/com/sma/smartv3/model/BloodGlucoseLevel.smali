.class public final enum Lcom/sma/smartv3/model/BloodGlucoseLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/model/BloodGlucoseLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/model/BloodGlucoseLevel;

.field public static final Companion:Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum DIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

.field public static final enum NORMAL:Lcom/sma/smartv3/model/BloodGlucoseLevel;

.field public static final enum PREDIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

.field public static final enum START:Lcom/sma/smartv3/model/BloodGlucoseLevel;

.field public static final enum UNKNOWN:Lcom/sma/smartv3/model/BloodGlucoseLevel;


# instance fields
.field private final mValue:F


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/model/BloodGlucoseLevel;
    .locals 5

    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->UNKNOWN:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    sget-object v1, Lcom/sma/smartv3/model/BloodGlucoseLevel;->START:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    sget-object v2, Lcom/sma/smartv3/model/BloodGlucoseLevel;->NORMAL:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    sget-object v3, Lcom/sma/smartv3/model/BloodGlucoseLevel;->PREDIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    sget-object v4, Lcom/sma/smartv3/model/BloodGlucoseLevel;->DIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/sma/smartv3/model/BloodGlucoseLevel;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/BloodGlucoseLevel;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->UNKNOWN:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    const/4 v1, 0x1

    const v2, 0x4059999a    # 3.4f

    const-string v3, "START"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/BloodGlucoseLevel;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->START:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    const/4 v1, 0x2

    const v2, 0x40c33333    # 6.1f

    const-string v3, "NORMAL"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/BloodGlucoseLevel;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->NORMAL:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    const/4 v1, 0x3

    const v2, 0x40dccccd    # 6.9f

    const-string v3, "PREDIABETES"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/BloodGlucoseLevel;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->PREDIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    const/4 v1, 0x4

    const v2, 0x4101999a    # 8.1f

    const-string v3, "DIABETES"

    invoke-direct {v0, v3, v1, v2}, Lcom/sma/smartv3/model/BloodGlucoseLevel;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->DIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-static {}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->$values()[Lcom/sma/smartv3/model/BloodGlucoseLevel;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->$VALUES:[Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->Companion:Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->mValue:F

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
            "Lcom/sma/smartv3/model/BloodGlucoseLevel;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/model/BloodGlucoseLevel;
    .locals 1

    const-class v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/model/BloodGlucoseLevel;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/model/BloodGlucoseLevel;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->$VALUES:[Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/model/BloodGlucoseLevel;

    return-object v0
.end method


# virtual methods
.method public final getMValue()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->mValue:F

    return v0
.end method
