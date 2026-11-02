.class public final Lcom/sma/smartv3/model/SelectByKeyType;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final configValue:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/sma/smartv3/model/SelectByKeyType;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/model/SelectByKeyType;-><init>(I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/SelectByKeyType;IILjava/lang/Object;)Lcom/sma/smartv3/model/SelectByKeyType;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/model/SelectByKeyType;->copy(I)Lcom/sma/smartv3/model/SelectByKeyType;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    return v0
.end method

.method public final copy(I)Lcom/sma/smartv3/model/SelectByKeyType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/SelectByKeyType;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/model/SelectByKeyType;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/model/SelectByKeyType;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/SelectByKeyType;

    iget v1, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    iget p1, p1, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getConfigValue()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/SelectByKeyType;->configValue:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SelectByKeyType(configValue="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
