.class public final Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final isSendSuccess:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;-><init>(Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;ZILjava/lang/Object;)Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->copy(Z)Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    return v0
.end method

.method public final copy(Z)Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;-><init>(Z)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;

    iget-boolean v1, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    iget-boolean p1, p1, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public final isSendSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/wx/data/WxSendTextResult;->isSendSuccess:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxSendTextResult(isSendSuccess="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
