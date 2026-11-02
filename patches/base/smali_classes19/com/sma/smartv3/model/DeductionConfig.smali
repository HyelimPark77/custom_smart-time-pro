.class public final Lcom/sma/smartv3/model/DeductionConfig;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final openAI_ChatPoints:I

.field private final openAI_ImgPoints:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Lcom/sma/smartv3/model/DeductionConfig;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/model/DeductionConfig;-><init>(II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/DeductionConfig;IIILjava/lang/Object;)Lcom/sma/smartv3/model/DeductionConfig;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/DeductionConfig;->copy(II)Lcom/sma/smartv3/model/DeductionConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    return v0
.end method

.method public final copy(II)Lcom/sma/smartv3/model/DeductionConfig;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/DeductionConfig;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/model/DeductionConfig;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/model/DeductionConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/DeductionConfig;

    iget v1, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    iget v3, p1, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    iget p1, p1, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getOpenAI_ChatPoints()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    return v0
.end method

.method public final getOpenAI_ImgPoints()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ImgPoints:I

    iget v1, p0, Lcom/sma/smartv3/model/DeductionConfig;->openAI_ChatPoints:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeductionConfig(openAI_ImgPoints="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", openAI_ChatPoints="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
