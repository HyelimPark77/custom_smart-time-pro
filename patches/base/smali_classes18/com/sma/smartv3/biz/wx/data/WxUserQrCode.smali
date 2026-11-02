.class public final Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;-><init>(Lcom/sma/smartv3/biz/wx/data/WxQrCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/biz/wx/data/WxQrCode;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/wx/data/WxQrCode;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "qrcode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/biz/wx/data/WxQrCode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    const/4 p2, 0x0

    const/4 p3, 0x3

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0, p3, v0}, Lcom/sma/smartv3/biz/wx/data/WxQrCode;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;-><init>(Lcom/sma/smartv3/biz/wx/data/WxQrCode;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;Lcom/sma/smartv3/biz/wx/data/WxQrCode;ILjava/lang/Object;)Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->copy(Lcom/sma/smartv3/biz/wx/data/WxQrCode;)Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/biz/wx/data/WxQrCode;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/biz/wx/data/WxQrCode;)Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/wx/data/WxQrCode;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "qrcode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;-><init>(Lcom/sma/smartv3/biz/wx/data/WxQrCode;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    iget-object p1, p1, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getQrcode()Lcom/sma/smartv3/biz/wx/data/WxQrCode;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxQrCode;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserQrCode;->qrcode:Lcom/sma/smartv3/biz/wx/data/WxQrCode;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WxUserQrCode(qrcode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
