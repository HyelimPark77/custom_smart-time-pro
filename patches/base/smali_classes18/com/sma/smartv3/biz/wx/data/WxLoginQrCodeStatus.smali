.class public final Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final effective_time:I

.field private final msg:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final othersInServerLogin:Z

.field private final push_login_url_expired_time:I

.field private final ret:I

.field private final state:I

.field private final tarGetServerIp:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final unknow:I

.field private final uuId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final uuid:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;-><init>(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tarGetServerIp"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuId"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    .line 4
    iput p2, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    .line 9
    iput-boolean p7, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    .line 10
    iput-object p8, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x1

    .line 13
    const-string v0, ""

    if-eqz p12, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const/4 v1, 0x0

    if-eqz p12, :cond_1

    move p2, v1

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move p3, v1

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p4, v1

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move p5, v1

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move p6, v1

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p7, v1

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move-object p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move-object p11, v0

    :goto_0
    move-object p10, p9

    move-object p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move-object p11, p10

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;-><init>(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->copy(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;
    .locals 12
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tarGetServerIp"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuId"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "msg"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;-><init>(Ljava/lang/String;IIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    iget v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    iget v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    iget v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    iget v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    iget v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getEffective_time()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    return v0
.end method

.method public final getMsg()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public final getOthersInServerLogin()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    return v0
.end method

.method public final getPush_login_url_expired_time()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    return v0
.end method

.method public final getRet()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    return v0
.end method

.method public final getState()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    return v0
.end method

.method public final getTarGetServerIp()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnknow()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    return v0
.end method

.method public final getUuId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUuid()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuid:Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->state:I

    iget v2, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->push_login_url_expired_time:I

    iget v3, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->effective_time:I

    iget v4, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->unknow:I

    iget v5, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->ret:I

    iget-boolean v6, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->othersInServerLogin:Z

    iget-object v7, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->tarGetServerIp:Ljava/lang/String;

    iget-object v8, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->uuId:Ljava/lang/String;

    iget-object v9, p0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeStatus;->msg:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "WxLoginQrCodeStatus(uuid="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", push_login_url_expired_time="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", effective_time="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", unknow="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ret="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", othersInServerLogin="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", tarGetServerIp="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", uuId="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", msg="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
