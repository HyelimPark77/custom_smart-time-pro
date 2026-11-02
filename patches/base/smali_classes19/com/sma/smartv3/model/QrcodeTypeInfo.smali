.class public final Lcom/sma/smartv3/model/QrcodeTypeInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private QrcodeType:I

.field private data:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dateTime:J

.field private iconResId:I

.field private name:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private qrcodeStreamType:I

.field private width:I


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/sma/smartv3/model/QrcodeTypeInfo;-><init>(IIILjava/lang/String;JI[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;JI[B)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    .line 6
    iput-object p4, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    .line 7
    iput-wide p5, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    .line 8
    iput p7, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    .line 9
    iput-object p8, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;JI[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 10
    const-string p4, ""

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    const-wide/16 p5, 0x0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p7, v0

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    .line 11
    new-array p8, v0, [B

    :cond_6
    move-object p9, p8

    move p8, p7

    move-wide p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p9}, Lcom/sma/smartv3/model/QrcodeTypeInfo;-><init>(IIILjava/lang/String;JI[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/QrcodeTypeInfo;IIILjava/lang/String;JI[BILjava/lang/Object;)Lcom/sma/smartv3/model/QrcodeTypeInfo;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-wide p5, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p7, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-object p8, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    :cond_6
    move p9, p7

    move-object p10, p8

    move-wide p7, p5

    move p5, p3

    move-object p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/sma/smartv3/model/QrcodeTypeInfo;->copy(IIILjava/lang/String;JI[B)Lcom/sma/smartv3/model/QrcodeTypeInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    return v0
.end method

.method public final component7()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    return-object v0
.end method

.method public final copy(IIILjava/lang/String;JI[B)Lcom/sma/smartv3/model/QrcodeTypeInfo;
    .locals 10
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-wide v6, p5

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/QrcodeTypeInfo;-><init>(IIILjava/lang/String;JI[B)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;

    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    iget v3, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    iget v3, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    iget v3, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    iget v3, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    iget-object p1, p1, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getData()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    return-object v0
.end method

.method public final getDateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    return-wide v0
.end method

.method public final getIconResId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getQrcodeStreamType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    return v0
.end method

.method public final getQrcodeType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setData([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    return-void
.end method

.method public final setDateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    return-void
.end method

.method public final setIconResId(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public final setQrcodeStreamType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    return-void
.end method

.method public final setQrcodeType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    return-void
.end method

.method public final setWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->qrcodeStreamType:I

    iget v1, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->QrcodeType:I

    iget v2, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->iconResId:I

    iget-object v3, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->name:Ljava/lang/String;

    iget-wide v4, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->dateTime:J

    iget v6, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->width:I

    iget-object v7, p0, Lcom/sma/smartv3/model/QrcodeTypeInfo;->data:[B

    invoke-static {v7}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "QrcodeTypeInfo(qrcodeStreamType="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", QrcodeType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", iconResId="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dateTime="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", width="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", data="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
