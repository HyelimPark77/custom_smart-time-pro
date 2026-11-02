.class public final Lcom/sma/smartv3/biz/dcs/DcsData;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final dcs:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/dcs/DcsStruct;",
            ">;"
        }
    .end annotation
.end field

.field private final tts:Lcom/sma/smartv3/biz/dcs/DcsTts;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/biz/dcs/DcsTts;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/dcs/DcsTts;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/dcs/DcsStruct;",
            ">;",
            "Lcom/sma/smartv3/biz/dcs/DcsTts;",
            ")V"
        }
    .end annotation

    const-string v0, "dcs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/dcs/DcsData;Ljava/util/List;Lcom/sma/smartv3/biz/dcs/DcsTts;ILjava/lang/Object;)Lcom/sma/smartv3/biz/dcs/DcsData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/dcs/DcsData;->copy(Ljava/util/List;Lcom/sma/smartv3/biz/dcs/DcsTts;)Lcom/sma/smartv3/biz/dcs/DcsData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/dcs/DcsStruct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/sma/smartv3/biz/dcs/DcsTts;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/sma/smartv3/biz/dcs/DcsTts;)Lcom/sma/smartv3/biz/dcs/DcsData;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/dcs/DcsTts;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/dcs/DcsStruct;",
            ">;",
            "Lcom/sma/smartv3/biz/dcs/DcsTts;",
            ")",
            "Lcom/sma/smartv3/biz/dcs/DcsData;"
        }
    .end annotation

    const-string v0, "dcs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/dcs/DcsData;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/biz/dcs/DcsData;-><init>(Ljava/util/List;Lcom/sma/smartv3/biz/dcs/DcsTts;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/dcs/DcsData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/dcs/DcsData;

    iget-object v1, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    iget-object v3, p1, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    iget-object p1, p1, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDcs()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/biz/dcs/DcsStruct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    return-object v0
.end method

.method public final getTts()Lcom/sma/smartv3/biz/dcs/DcsTts;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/dcs/DcsTts;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->dcs:Ljava/util/List;

    iget-object v1, p0, Lcom/sma/smartv3/biz/dcs/DcsData;->tts:Lcom/sma/smartv3/biz/dcs/DcsTts;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DcsData(dcs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tts="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
