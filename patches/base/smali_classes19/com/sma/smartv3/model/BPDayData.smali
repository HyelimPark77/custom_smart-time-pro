.class public final Lcom/sma/smartv3/model/BPDayData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dbpMax:I

.field private dbpMin:I

.field private sbpMax:I

.field private sbpMin:I

.field private status:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/model/BPDayData;-><init>(IIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIILjava/lang/String;)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "status"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/BPDayData;->dbpMax:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/BPDayData;->dbpMin:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/BPDayData;->sbpMax:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/model/BPDayData;->sbpMin:I

    .line 7
    iput-object p5, p0, Lcom/sma/smartv3/model/BPDayData;->status:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 8
    const-string p5, "--"

    :cond_4
    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p6}, Lcom/sma/smartv3/model/BPDayData;-><init>(IIIILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getDbpMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPDayData;->dbpMax:I

    return v0
.end method

.method public final getDbpMin()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPDayData;->dbpMin:I

    return v0
.end method

.method public final getSbpMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPDayData;->sbpMax:I

    return v0
.end method

.method public final getSbpMin()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPDayData;->sbpMin:I

    return v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/BPDayData;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final setDbpMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPDayData;->dbpMax:I

    return-void
.end method

.method public final setDbpMin(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPDayData;->dbpMin:I

    return-void
.end method

.method public final setSbpMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPDayData;->sbpMax:I

    return-void
.end method

.method public final setSbpMin(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPDayData;->sbpMin:I

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

    iput-object p1, p0, Lcom/sma/smartv3/model/BPDayData;->status:Ljava/lang/String;

    return-void
.end method
