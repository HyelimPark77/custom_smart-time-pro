.class public final Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/model/BloodGlucoseLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/BloodGlucoseLevel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBloodGlucoseLevel(F)Lcom/sma/smartv3/model/BloodGlucoseLevel;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->NORMAL:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v1

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->PREDIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v1

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->DIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_2

    return-object v0

    :cond_2
    sget-object p1, Lcom/sma/smartv3/model/BloodGlucoseLevel;->UNKNOWN:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    return-object p1
.end method
