.class public final Lcom/sma/smartv3/biz/wx/data/Message;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final content:Lcom/sma/smartv3/biz/wx/data/WxString;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final create_time:J

.field private final from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final msg_id:J

.field private final msg_type:I

.field private final new_msg_id:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final push_content:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0xff

    const/4 v12, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/sma/smartv3/biz/wx/data/Message;-><init>(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1
    .param p3    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "from_user_name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to_user_name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "push_content"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new_msg_id"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    .line 5
    iput-object p4, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    .line 6
    iput p5, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    .line 7
    iput-object p6, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    .line 8
    iput-object p7, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    .line 9
    iput-wide p8, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    .line 10
    iput-object p10, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 p1, -0x1

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    const/4 p2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_1

    .line 11
    new-instance p3, Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-direct {p3, p2, v3, p2}, Lcom/sma/smartv3/biz/wx/data/WxString;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    .line 12
    new-instance p4, Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-direct {p4, p2, v3, p2}, Lcom/sma/smartv3/biz/wx/data/WxString;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    move v5, p1

    goto :goto_0

    :cond_3
    move/from16 v5, p5

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    .line 13
    new-instance p1, Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-direct {p1, p2, v3, p2}, Lcom/sma/smartv3/biz/wx/data/WxString;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, p1

    goto :goto_1

    :cond_4
    move-object/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x20

    .line 14
    const-string p2, ""

    if-eqz p1, :cond_5

    move-object v7, p2

    goto :goto_2

    :cond_5
    move-object/from16 v7, p7

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    const-wide/16 v8, 0x0

    goto :goto_3

    :cond_6
    move-wide/from16 v8, p8

    :goto_3
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    move-object v10, p2

    :goto_4
    move-object v0, p0

    move-object v3, p3

    goto :goto_5

    :cond_7
    move-object/from16 v10, p10

    goto :goto_4

    :goto_5
    invoke-direct/range {v0 .. v10}, Lcom/sma/smartv3/biz/wx/data/Message;-><init>(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/biz/wx/data/Message;JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/biz/wx/data/Message;
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p4, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    :cond_2
    move-object v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    move v5, p1

    goto :goto_0

    :cond_3
    move/from16 v5, p5

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    move-object v6, p1

    goto :goto_1

    :cond_4
    move-object/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    move-object v7, p1

    goto :goto_2

    :cond_5
    move-object/from16 v7, p7

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-wide p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    move-wide v8, p1

    goto :goto_3

    :cond_6
    move-wide/from16 v8, p8

    :goto_3
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    move-object v10, p1

    :goto_4
    move-object v0, p0

    goto :goto_5

    :cond_7
    move-object/from16 v10, p10

    goto :goto_4

    :goto_5
    invoke-virtual/range {v0 .. v10}, Lcom/sma/smartv3/biz/wx/data/Message;->copy(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;)Lcom/sma/smartv3/biz/wx/data/Message;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    return-wide v0
.end method

.method public final component2()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final component3()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    return v0
.end method

.method public final component5()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;)Lcom/sma/smartv3/biz/wx/data/Message;
    .locals 12
    .param p3    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Lcom/sma/smartv3/biz/wx/data/WxString;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "from_user_name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to_user_name"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "push_content"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new_msg_id"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/biz/wx/data/Message;

    move-wide v2, p1

    move-object v4, p3

    move/from16 v6, p5

    move-wide/from16 v9, p8

    invoke-direct/range {v1 .. v11}, Lcom/sma/smartv3/biz/wx/data/Message;-><init>(JLcom/sma/smartv3/biz/wx/data/WxString;Lcom/sma/smartv3/biz/wx/data/WxString;ILcom/sma/smartv3/biz/wx/data/WxString;Ljava/lang/String;JLjava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/biz/wx/data/Message;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/biz/wx/data/Message;

    iget-wide v3, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    iget-wide v5, p1, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    iget v3, p1, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    iget-wide v5, p1, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getContent()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final getCreate_time()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    return-wide v0
.end method

.method public final getFrom_user_name()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public final getMsg_id()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    return-wide v0
.end method

.method public final getMsg_type()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    return v0
.end method

.method public final getNew_msg_id()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPush_content()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    return-object v0
.end method

.method public final getTo_user_name()Lcom/sma/smartv3/biz/wx/data/WxString;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/wx/data/WxString;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_id:J

    iget-object v2, p0, Lcom/sma/smartv3/biz/wx/data/Message;->from_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v3, p0, Lcom/sma/smartv3/biz/wx/data/Message;->to_user_name:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget v4, p0, Lcom/sma/smartv3/biz/wx/data/Message;->msg_type:I

    iget-object v5, p0, Lcom/sma/smartv3/biz/wx/data/Message;->content:Lcom/sma/smartv3/biz/wx/data/WxString;

    iget-object v6, p0, Lcom/sma/smartv3/biz/wx/data/Message;->push_content:Ljava/lang/String;

    iget-wide v7, p0, Lcom/sma/smartv3/biz/wx/data/Message;->create_time:J

    iget-object v9, p0, Lcom/sma/smartv3/biz/wx/data/Message;->new_msg_id:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Message(msg_id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", from_user_name="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", to_user_name="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", msg_type="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", content="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", push_content="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", create_time="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", new_msg_id="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
