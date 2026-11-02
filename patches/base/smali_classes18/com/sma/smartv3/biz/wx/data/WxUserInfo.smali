.class public final Lcom/sma/smartv3/biz/wx/data/WxUserInfo;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final nickName:Lcom/sma/smartv3/biz/wx/data/WxString;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userName:Lcom/sma/smartv3/biz/wx/data/WxString;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;-><init>(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "userName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nickName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p4, :cond_0

    .line 5
    new-instance p1, Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-direct {p1, v0, v1, v0}, Lcom/sma/smartv3/biz/wx/data/WxString;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    new-instance p2, Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-direct {p2, v0, v1, v0}, Lcom/sma/smartv3/biz/wx/data/WxString;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;-><init>(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/wx/data/WxUserInfo;Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILjava/lang/Object;)Lcom/sma/smartv3/biz/wx/data/WxUserInfo;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->copy(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;)Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final component2()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final copy(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;)Lcom/sma/smartv3/biz/wx/data/WxUserInfo;
    .locals 1
    .param p1    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "userName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nickName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;-><init>(Lcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object p1, p1, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getNickName()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final getUserName()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/wx/data/WxString;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->userName:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxUserInfo;->nickName:Lcom/sma/smartv3/biz/wx/data/WxString;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WxUserInfo(userName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", nickName="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
