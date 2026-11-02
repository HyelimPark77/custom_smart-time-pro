.class public final Lcom/sma/smartv3/model/BPHourData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dbpMax:I

.field private dbpMin:I

.field private dbpNum:I

.field private dbpTotal:I

.field private sbpMax:I

.field private sbpMin:I

.field private sbpNum:I

.field private sbpTotal:I


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/sma/smartv3/model/BPHourData;-><init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->dbpMax:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/BPHourData;->dbpMin:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/BPHourData;->dbpTotal:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/model/BPHourData;->dbpNum:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/model/BPHourData;->sbpMax:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/model/BPHourData;->sbpMin:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/model/BPHourData;->sbpTotal:I

    .line 10
    iput p8, p0, Lcom/sma/smartv3/model/BPHourData;->sbpNum:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move p9, v0

    :goto_0
    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move p9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/sma/smartv3/model/BPHourData;-><init>(IIIIIIII)V

    return-void
.end method


# virtual methods
.method public final getDbpMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->dbpMax:I

    return v0
.end method

.method public final getDbpMin()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->dbpMin:I

    return v0
.end method

.method public final getDbpNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->dbpNum:I

    return v0
.end method

.method public final getDbpTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->dbpTotal:I

    return v0
.end method

.method public final getSbpMax()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->sbpMax:I

    return v0
.end method

.method public final getSbpMin()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->sbpMin:I

    return v0
.end method

.method public final getSbpNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->sbpNum:I

    return v0
.end method

.method public final getSbpTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/BPHourData;->sbpTotal:I

    return v0
.end method

.method public final setDbpMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->dbpMax:I

    return-void
.end method

.method public final setDbpMin(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->dbpMin:I

    return-void
.end method

.method public final setDbpNum(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->dbpNum:I

    return-void
.end method

.method public final setDbpTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->dbpTotal:I

    return-void
.end method

.method public final setSbpMax(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->sbpMax:I

    return-void
.end method

.method public final setSbpMin(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->sbpMin:I

    return-void
.end method

.method public final setSbpNum(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->sbpNum:I

    return-void
.end method

.method public final setSbpTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/BPHourData;->sbpTotal:I

    return-void
.end method
