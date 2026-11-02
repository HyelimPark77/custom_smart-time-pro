.class public final Lcom/sma/smartv3/model/HRVDayData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private avg:I

.field private max:I

.field private min:I

.field private status:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/model/HRVDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "status"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/HRVDayData;->max:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/HRVDayData;->min:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/HRVDayData;->avg:I

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/HRVDayData;->status:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 7
    const-string p4, "--"

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/HRVDayData;-><init>(IIILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getAvg()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/HRVDayData;->avg:I

    return v0
.end method

.method public final getMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/HRVDayData;->max:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/HRVDayData;->min:I

    return v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/HRVDayData;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final setAvg(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/HRVDayData;->avg:I

    return-void
.end method

.method public final setMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/HRVDayData;->max:I

    return-void
.end method

.method public final setMin(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/HRVDayData;->min:I

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

    iput-object p1, p0, Lcom/sma/smartv3/model/HRVDayData;->status:Ljava/lang/String;

    return-void
.end method
