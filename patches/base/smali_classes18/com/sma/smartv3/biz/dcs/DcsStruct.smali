.class public final Lcom/sma/smartv3/biz/dcs/DcsStruct;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final directive:Lcom/sma/smartv3/biz/dcs/Directive;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/dcs/Directive;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/dcs/Directive;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "directive"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/dcs/DcsStruct;Lcom/sma/smartv3/biz/dcs/Directive;ILjava/lang/Object;)Lcom/sma/smartv3/biz/dcs/DcsStruct;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/dcs/DcsStruct;->copy(Lcom/sma/smartv3/biz/dcs/Directive;)Lcom/sma/smartv3/biz/dcs/DcsStruct;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/biz/dcs/Directive;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/biz/dcs/Directive;)Lcom/sma/smartv3/biz/dcs/DcsStruct;
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/dcs/Directive;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "directive"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/dcs/DcsStruct;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/biz/dcs/DcsStruct;-><init>(Lcom/sma/smartv3/biz/dcs/Directive;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/dcs/DcsStruct;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/dcs/DcsStruct;

    iget-object v1, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    iget-object p1, p1, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getDirective()Lcom/sma/smartv3/biz/dcs/Directive;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/dcs/Directive;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/dcs/DcsStruct;->directive:Lcom/sma/smartv3/biz/dcs/Directive;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DcsStruct(directive="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
