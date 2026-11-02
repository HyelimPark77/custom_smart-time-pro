.class public final Lcom/sma/smartv3/model/BloodGlucose2DayData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private max:I

.field private min:I

.field private status:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/model/BloodGlucose2DayData;-><init>(IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "status"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->max:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->min:I

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->status:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 6
    const-string p3, "--"

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;-><init>(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->max:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->min:I

    return v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final setMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->max:I

    return-void
.end method

.method public final setMin(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->min:I

    return-void
.end method

.method public final setStatus(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/BloodGlucose2DayData;->status:Ljava/lang/String;

    return-void
.end method
